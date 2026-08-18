/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.entity.Player
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.nik.coffeeprotect.metrics;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.logging.Level;
import java.util.stream.Collectors;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class Metrics {
    private final Plugin plugin;
    private final MetricsBase metricsBase;
    private static transient /* synthetic */ String HjHtbMqxtT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public Metrics(JavaPlugin javaPlugin, int n) {
        this.plugin = javaPlugin;
        File file = new File(javaPlugin.getDataFolder().getParentFile(), "bStats");
        File file2 = new File(file, "config.yml");
        YamlConfiguration yamlConfiguration = YamlConfiguration.loadConfiguration((File)file2);
        if (!yamlConfiguration.isSet("serverUuid")) {
            yamlConfiguration.addDefault("enabled", (Object)true);
            yamlConfiguration.addDefault("serverUuid", (Object)UUID.randomUUID().toString());
            yamlConfiguration.addDefault("logFailedRequests", (Object)false);
            yamlConfiguration.addDefault("logSentData", (Object)false);
            yamlConfiguration.addDefault("logResponseStatusText", (Object)false);
            yamlConfiguration.options().header("bStats (https://bStats.org) collects some basic information for plugin authors, like how\nmany people use their plugin and their total player count. It's recommended to keep bStats\nenabled, but if you're not comfortable with this, you can turn this setting off. There is no\nperformance penalty associated with having metrics enabled, and data sent to bStats is fully\nanonymous.").copyDefaults(true);
            try {
                yamlConfiguration.save(file2);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        boolean bl = yamlConfiguration.getBoolean("enabled", true);
        String string2 = yamlConfiguration.getString("serverUuid");
        boolean bl2 = yamlConfiguration.getBoolean("logFailedRequests", false);
        boolean bl3 = yamlConfiguration.getBoolean("logSentData", false);
        boolean bl4 = yamlConfiguration.getBoolean("logResponseStatusText", false);
        this.metricsBase = new MetricsBase("bukkit", string2, n, bl, this::appendPlatformData, this::appendServiceData, runnable -> Bukkit.getScheduler().runTask((Plugin)javaPlugin, runnable), () -> ((JavaPlugin)javaPlugin).isEnabled(), (string, throwable) -> this.plugin.getLogger().log(Level.WARNING, (String)string, (Throwable)throwable), string -> this.plugin.getLogger().log(Level.INFO, (String)string), bl2, bl3, bl4);
    }

    public void shutdown() {
        this.metricsBase.shutdown();
    }

    public void addCustomChart(CustomChart customChart) {
        this.metricsBase.addCustomChart(customChart);
    }

    private void appendPlatformData(JsonObjectBuilder jsonObjectBuilder) {
        jsonObjectBuilder.appendField("playerAmount", this.getPlayerAmount());
        jsonObjectBuilder.appendField("onlineMode", Bukkit.getOnlineMode() ? 1 : 0);
        jsonObjectBuilder.appendField("bukkitVersion", Bukkit.getVersion());
        jsonObjectBuilder.appendField("bukkitName", Bukkit.getName());
        jsonObjectBuilder.appendField("javaVersion", System.getProperty("java.version"));
        jsonObjectBuilder.appendField("osName", System.getProperty("os.name"));
        jsonObjectBuilder.appendField("osArch", System.getProperty("os.arch"));
        jsonObjectBuilder.appendField("osVersion", System.getProperty("os.version"));
        jsonObjectBuilder.appendField("coreCount", Runtime.getRuntime().availableProcessors());
    }

    private void appendServiceData(JsonObjectBuilder jsonObjectBuilder) {
        jsonObjectBuilder.appendField("pluginVersion", this.plugin.getDescription().getVersion());
    }

    private int getPlayerAmount() {
        try {
            Method method = Class.forName("org.bukkit.Server").getMethod("getOnlinePlayers", new Class[0]);
            return method.getReturnType().equals(Collection.class) ? ((Collection)method.invoke((Object)Bukkit.getServer(), new Object[0])).size() : ((Player[])method.invoke((Object)Bukkit.getServer(), new Object[0])).length;
        }
        catch (Exception exception) {
            return Bukkit.getOnlinePlayers().size();
        }
    }

    public static class MetricsBase {
        public static final String METRICS_VERSION = "3.0.2";
        private static final String REPORT_URL = "https://bStats.org/api/v2/data/%s";
        private final ScheduledExecutorService scheduler;
        private final String platform;
        private final String serverUuid;
        private final int serviceId;
        private final Consumer<JsonObjectBuilder> appendPlatformDataConsumer;
        private final Consumer<JsonObjectBuilder> appendServiceDataConsumer;
        private final Consumer<Runnable> submitTaskConsumer;
        private final Supplier<Boolean> checkServiceEnabledSupplier;
        private final BiConsumer<String, Throwable> errorLogger;
        private final Consumer<String> infoLogger;
        private final boolean logErrors;
        private final boolean logSentData;
        private final boolean logResponseStatusText;
        private final Set<CustomChart> customCharts = new HashSet<CustomChart>();
        private final boolean enabled;
        private static transient /* synthetic */ String heoBqSreDG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public MetricsBase(String string, String string2, int n, boolean bl, Consumer<JsonObjectBuilder> consumer, Consumer<JsonObjectBuilder> consumer2, Consumer<Runnable> consumer3, Supplier<Boolean> supplier, BiConsumer<String, Throwable> biConsumer, Consumer<String> consumer4, boolean bl2, boolean bl3, boolean bl4) {
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, runnable -> new Thread(runnable, "bStats-Metrics"));
            scheduledThreadPoolExecutor.setExecuteExistingDelayedTasksAfterShutdownPolicy(false);
            this.scheduler = scheduledThreadPoolExecutor;
            this.platform = string;
            this.serverUuid = string2;
            this.serviceId = n;
            this.enabled = bl;
            this.appendPlatformDataConsumer = consumer;
            this.appendServiceDataConsumer = consumer2;
            this.submitTaskConsumer = consumer3;
            this.checkServiceEnabledSupplier = supplier;
            this.errorLogger = biConsumer;
            this.infoLogger = consumer4;
            this.logErrors = bl2;
            this.logSentData = bl3;
            this.logResponseStatusText = bl4;
            this.checkRelocation();
            if (bl) {
                this.startSubmitting();
            }
        }

        private static byte[] compress(String string) throws IOException {
            if (string == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try (GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);){
                gZIPOutputStream.write(string.getBytes(StandardCharsets.UTF_8));
            }
            return byteArrayOutputStream.toByteArray();
        }

        public void addCustomChart(CustomChart customChart) {
            this.customCharts.add(customChart);
        }

        public void shutdown() {
            this.scheduler.shutdown();
        }

        private void startSubmitting() {
            Runnable runnable = () -> {
                if (!this.enabled || !this.checkServiceEnabledSupplier.get().booleanValue()) {
                    this.scheduler.shutdown();
                    return;
                }
                if (this.submitTaskConsumer != null) {
                    this.submitTaskConsumer.accept(this::submitData);
                } else {
                    this.submitData();
                }
            };
            long l = (long)(60000.0 * (3.0 + Math.random() * 3.0));
            long l2 = (long)(60000.0 * (Math.random() * 30.0));
            this.scheduler.schedule(runnable, l, TimeUnit.MILLISECONDS);
            this.scheduler.scheduleAtFixedRate(runnable, l + l2, 1800000L, TimeUnit.MILLISECONDS);
        }

        private void submitData() {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            this.appendPlatformDataConsumer.accept(jsonObjectBuilder);
            JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
            this.appendServiceDataConsumer.accept(jsonObjectBuilder2);
            JsonObjectBuilder.JsonObject[] jsonObjectArray = (JsonObjectBuilder.JsonObject[])this.customCharts.stream().map(customChart -> customChart.getRequestJsonObject(this.errorLogger, this.logErrors)).filter(Objects::nonNull).toArray(JsonObjectBuilder.JsonObject[]::new);
            jsonObjectBuilder2.appendField("id", this.serviceId);
            jsonObjectBuilder2.appendField("customCharts", jsonObjectArray);
            jsonObjectBuilder.appendField("service", jsonObjectBuilder2.build());
            jsonObjectBuilder.appendField("serverUUID", this.serverUuid);
            jsonObjectBuilder.appendField("metricsVersion", METRICS_VERSION);
            JsonObjectBuilder.JsonObject jsonObject = jsonObjectBuilder.build();
            this.scheduler.execute(() -> {
                block2: {
                    try {
                        this.sendData(jsonObject);
                    }
                    catch (Exception exception) {
                        if (!this.logErrors) break block2;
                        this.errorLogger.accept("Could not submit bStats metrics data", exception);
                    }
                }
            });
        }

        private void sendData(JsonObjectBuilder.JsonObject jsonObject) throws Exception {
            if (this.logSentData) {
                this.infoLogger.accept("Sent bStats metrics data: " + jsonObject.toString());
            }
            String string = String.format(REPORT_URL, this.platform);
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection)new URL(string).openConnection();
            byte[] byArray = MetricsBase.compress(jsonObject.toString());
            httpsURLConnection.setRequestMethod("POST");
            httpsURLConnection.addRequestProperty("Accept", "application/json");
            httpsURLConnection.addRequestProperty("Connection", "close");
            httpsURLConnection.addRequestProperty("Content-Encoding", "gzip");
            httpsURLConnection.addRequestProperty("Content-Length", String.valueOf(byArray.length));
            httpsURLConnection.setRequestProperty("Content-Type", "application/json");
            httpsURLConnection.setRequestProperty("User-Agent", "Metrics-Service/1");
            httpsURLConnection.setDoOutput(true);
            try (Object object = new DataOutputStream(httpsURLConnection.getOutputStream());){
                ((FilterOutputStream)object).write(byArray);
            }
            object = new StringBuilder();
            try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream()));){
                String string2;
                while ((string2 = bufferedReader.readLine()) != null) {
                    ((StringBuilder)object).append(string2);
                }
            }
            if (this.logResponseStatusText) {
                this.infoLogger.accept("Sent data to bStats and received response: " + object);
            }
        }

        private void checkRelocation() {
            if (System.getProperty("bstats.relocatecheck") == null || !System.getProperty("bstats.relocatecheck").equals("false")) {
                String string = new String(new byte[]{111, 114, 103, 46, 98, 115, 116, 97, 116, 115});
                String string2 = new String(new byte[]{121, 111, 117, 114, 46, 112, 97, 99, 107, 97, 103, 101});
                if (MetricsBase.class.getPackage().getName().startsWith(string) || MetricsBase.class.getPackage().getName().startsWith(string2)) {
                    throw new IllegalStateException("bStats Metrics class has not been relocated correctly!");
                }
            }
        }
    }

    public static abstract class CustomChart {
        private final String chartId;

        protected CustomChart(String string) {
            if (string == null) {
                throw new IllegalArgumentException("chartId must not be null");
            }
            this.chartId = string;
        }

        public JsonObjectBuilder.JsonObject getRequestJsonObject(BiConsumer<String, Throwable> biConsumer, boolean bl) {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            jsonObjectBuilder.appendField("chartId", this.chartId);
            try {
                JsonObjectBuilder.JsonObject jsonObject = this.getChartData();
                if (jsonObject == null) {
                    return null;
                }
                jsonObjectBuilder.appendField("data", jsonObject);
            }
            catch (Throwable throwable) {
                if (bl) {
                    biConsumer.accept("Failed to get data for custom chart with id " + this.chartId, throwable);
                }
                return null;
            }
            return jsonObjectBuilder.build();
        }

        protected abstract JsonObjectBuilder.JsonObject getChartData() throws Exception;
    }

    public static class JsonObjectBuilder {
        private StringBuilder builder = new StringBuilder();
        private boolean hasAtLeastOneField = false;
        private static transient /* synthetic */ String UhNHgjFktc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public JsonObjectBuilder() {
            this.builder.append("{");
        }

        private static String escape(String string) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < string.length(); ++i) {
                char c = string.charAt(i);
                if (c == '\"') {
                    stringBuilder.append("\\\"");
                    continue;
                }
                if (c == '\\') {
                    stringBuilder.append("\\\\");
                    continue;
                }
                if (c <= '\u000f') {
                    stringBuilder.append("\\u000").append(Integer.toHexString(c));
                    continue;
                }
                if (c <= '\u001f') {
                    stringBuilder.append("\\u00").append(Integer.toHexString(c));
                    continue;
                }
                stringBuilder.append(c);
            }
            return stringBuilder.toString();
        }

        public JsonObjectBuilder appendNull(String string) {
            this.appendFieldUnescaped(string, "null");
            return this;
        }

        public JsonObjectBuilder appendField(String string, String string2) {
            if (string2 == null) {
                throw new IllegalArgumentException("JSON value must not be null");
            }
            this.appendFieldUnescaped(string, "\"" + JsonObjectBuilder.escape(string2) + "\"");
            return this;
        }

        public JsonObjectBuilder appendField(String string, int n) {
            this.appendFieldUnescaped(string, String.valueOf(n));
            return this;
        }

        public JsonObjectBuilder appendField(String string, JsonObject jsonObject) {
            if (jsonObject == null) {
                throw new IllegalArgumentException("JSON object must not be null");
            }
            this.appendFieldUnescaped(string, jsonObject.toString());
            return this;
        }

        public JsonObjectBuilder appendField(String string2, String[] stringArray) {
            if (stringArray == null) {
                throw new IllegalArgumentException("JSON values must not be null");
            }
            String string3 = Arrays.stream(stringArray).map(string -> "\"" + JsonObjectBuilder.escape(string) + "\"").collect(Collectors.joining(","));
            this.appendFieldUnescaped(string2, "[" + string3 + "]");
            return this;
        }

        public JsonObjectBuilder appendField(String string, int[] nArray) {
            if (nArray == null) {
                throw new IllegalArgumentException("JSON values must not be null");
            }
            String string2 = Arrays.stream(nArray).mapToObj(String::valueOf).collect(Collectors.joining(","));
            this.appendFieldUnescaped(string, "[" + string2 + "]");
            return this;
        }

        public JsonObjectBuilder appendField(String string, JsonObject[] jsonObjectArray) {
            if (jsonObjectArray == null) {
                throw new IllegalArgumentException("JSON values must not be null");
            }
            String string2 = Arrays.stream(jsonObjectArray).map(JsonObject::toString).collect(Collectors.joining(","));
            this.appendFieldUnescaped(string, "[" + string2 + "]");
            return this;
        }

        private void appendFieldUnescaped(String string, String string2) {
            if (this.builder == null) {
                throw new IllegalStateException("JSON has already been built");
            }
            if (string == null) {
                throw new IllegalArgumentException("JSON key must not be null");
            }
            if (this.hasAtLeastOneField) {
                this.builder.append(",");
            }
            this.builder.append("\"").append(JsonObjectBuilder.escape(string)).append("\":").append(string2);
            this.hasAtLeastOneField = true;
        }

        public JsonObject build() {
            if (this.builder == null) {
                throw new IllegalStateException("JSON has already been built");
            }
            JsonObject jsonObject = new JsonObject(this.builder.append("}").toString());
            this.builder = null;
            return jsonObject;
        }

        public static class JsonObject {
            private final String value;
            private static transient /* synthetic */ String IpjuflhFqs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            private JsonObject(String string) {
                this.value = string;
            }

            public String toString() {
                return this.value;
            }
        }
    }

    public static class SingleLineChart
    extends CustomChart {
        private final Callable<Integer> callable;
        private static transient /* synthetic */ String TISJJDlWLu = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public SingleLineChart(String string, Callable<Integer> callable) {
            super(string);
            this.callable = callable;
        }

        @Override
        protected JsonObjectBuilder.JsonObject getChartData() throws Exception {
            int n = this.callable.call();
            if (n == 0) {
                return null;
            }
            return new JsonObjectBuilder().appendField("value", n).build();
        }
    }

    public static class DrilldownPie
    extends CustomChart {
        private final Callable<Map<String, Map<String, Integer>>> callable;
        private static transient /* synthetic */ String YEaGNBbDfg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public DrilldownPie(String string, Callable<Map<String, Map<String, Integer>>> callable) {
            super(string);
            this.callable = callable;
        }

        @Override
        public JsonObjectBuilder.JsonObject getChartData() throws Exception {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            Map<String, Map<String, Integer>> map = this.callable.call();
            if (map == null || map.isEmpty()) {
                return null;
            }
            boolean bl = true;
            for (Map.Entry<String, Map<String, Integer>> entry : map.entrySet()) {
                JsonObjectBuilder jsonObjectBuilder2 = new JsonObjectBuilder();
                boolean bl2 = true;
                for (Map.Entry<String, Integer> entry2 : map.get(entry.getKey()).entrySet()) {
                    jsonObjectBuilder2.appendField(entry2.getKey(), entry2.getValue());
                    bl2 = false;
                }
                if (bl2) continue;
                bl = false;
                jsonObjectBuilder.appendField(entry.getKey(), jsonObjectBuilder2.build());
            }
            if (bl) {
                return null;
            }
            return new JsonObjectBuilder().appendField("values", jsonObjectBuilder.build()).build();
        }
    }

    public static class AdvancedBarChart
    extends CustomChart {
        private final Callable<Map<String, int[]>> callable;
        private static transient /* synthetic */ String ECwoinryqT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public AdvancedBarChart(String string, Callable<Map<String, int[]>> callable) {
            super(string);
            this.callable = callable;
        }

        @Override
        protected JsonObjectBuilder.JsonObject getChartData() throws Exception {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            Map<String, int[]> map = this.callable.call();
            if (map == null || map.isEmpty()) {
                return null;
            }
            boolean bl = true;
            for (Map.Entry<String, int[]> entry : map.entrySet()) {
                if (entry.getValue().length == 0) continue;
                bl = false;
                jsonObjectBuilder.appendField(entry.getKey(), entry.getValue());
            }
            if (bl) {
                return null;
            }
            return new JsonObjectBuilder().appendField("values", jsonObjectBuilder.build()).build();
        }
    }

    public static class SimpleBarChart
    extends CustomChart {
        private final Callable<Map<String, Integer>> callable;
        private static transient /* synthetic */ String mjYnHjXZPQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public SimpleBarChart(String string, Callable<Map<String, Integer>> callable) {
            super(string);
            this.callable = callable;
        }

        @Override
        protected JsonObjectBuilder.JsonObject getChartData() throws Exception {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            Map<String, Integer> map = this.callable.call();
            if (map == null || map.isEmpty()) {
                return null;
            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                jsonObjectBuilder.appendField(entry.getKey(), new int[]{entry.getValue()});
            }
            return new JsonObjectBuilder().appendField("values", jsonObjectBuilder.build()).build();
        }
    }

    public static class AdvancedPie
    extends CustomChart {
        private final Callable<Map<String, Integer>> callable;
        private static transient /* synthetic */ String YaiCbWAbXi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public AdvancedPie(String string, Callable<Map<String, Integer>> callable) {
            super(string);
            this.callable = callable;
        }

        @Override
        protected JsonObjectBuilder.JsonObject getChartData() throws Exception {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            Map<String, Integer> map = this.callable.call();
            if (map == null || map.isEmpty()) {
                return null;
            }
            boolean bl = true;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 0) continue;
                bl = false;
                jsonObjectBuilder.appendField(entry.getKey(), entry.getValue());
            }
            if (bl) {
                return null;
            }
            return new JsonObjectBuilder().appendField("values", jsonObjectBuilder.build()).build();
        }
    }

    public static class MultiLineChart
    extends CustomChart {
        private final Callable<Map<String, Integer>> callable;
        private static transient /* synthetic */ String XpSULmGSzR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public MultiLineChart(String string, Callable<Map<String, Integer>> callable) {
            super(string);
            this.callable = callable;
        }

        @Override
        protected JsonObjectBuilder.JsonObject getChartData() throws Exception {
            JsonObjectBuilder jsonObjectBuilder = new JsonObjectBuilder();
            Map<String, Integer> map = this.callable.call();
            if (map == null || map.isEmpty()) {
                return null;
            }
            boolean bl = true;
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == 0) continue;
                bl = false;
                jsonObjectBuilder.appendField(entry.getKey(), entry.getValue());
            }
            if (bl) {
                return null;
            }
            return new JsonObjectBuilder().appendField("values", jsonObjectBuilder.build()).build();
        }
    }

    public static class SimplePie
    extends CustomChart {
        private final Callable<String> callable;
        private static transient /* synthetic */ String gFyLFerwgz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

        public SimplePie(String string, Callable<String> callable) {
            super(string);
            this.callable = callable;
        }

        @Override
        protected JsonObjectBuilder.JsonObject getChartData() throws Exception {
            String string = this.callable.call();
            if (string == null || string.isEmpty()) {
                return null;
            }
            return new JsonObjectBuilder().appendField("value", string).build();
        }
    }
}

