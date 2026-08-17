package me.nik.coffeeprotect.manager;

import me.nik.coffeeprotect.CoffeeProtect;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;

public class DiscordWebhookManager {

    private final CoffeeProtect plugin;

    public DiscordWebhookManager(@NotNull CoffeeProtect plugin) {
        this.plugin = plugin;
    }

    public void sendAlert(@NotNull Player player, @NotNull String checkName, int vl, @NotNull String details) {
        if (!plugin.getConfig().getBoolean("discord.enabled", false)) {
            return;
        }

        String webhookUrl = plugin.getConfig().getString("discord.webhook_url", "");
        if (webhookUrl.isEmpty() || webhookUrl.contains("YOUR_WEBHOOK_URL_HERE")) {
            return;
        }

        CompletableFuture.runAsync(() -> {
            try {
                String title = plugin.getConfig().getString("discord.embed.title", "☕ CoffeeProtect - Exploit Alert");
                String colorHex = plugin.getConfig().getString("discord.embed.color", "#E67E22").replace("#", "");
                int color = Integer.parseInt(colorHex, 16);

                double tps = 20.0;
                try {
                    Object spigot = Bukkit.getServer().getClass().getMethod("spigot").invoke(Bukkit.getServer());
                    double[] tpsArr = (double[]) spigot.getClass().getMethod("getTPS").invoke(spigot);
                    tps = Math.min(20.0, Math.round(tpsArr[0] * 100.0) / 100.0);
                } catch (Throwable ignored) {}

                String json = "{\n" +
                    "  \"embeds\": [{\n" +
                    "    \"title\": \"" + escapeJson(title) + "\",\n" +
                    "    \"color\": " + color + ",\n" +
                    "    \"fields\": [\n" +
                    "      {\"name\": \"Player\", \"value\": \"`" + escapeJson(player.getName()) + "`\", \"inline\": true},\n" +
                    "      {\"name\": \"Check\", \"value\": \"`" + escapeJson(checkName) + "`\", \"inline\": true},\n" +
                    "      {\"name\": \"Ping\", \"value\": \"`" + player.getPing() + " ms`\", \"inline\": true},\n" +
                    "      {\"name\": \"Violation Level\", \"value\": \"`" + vl + "`\", \"inline\": true},\n" +
                    "      {\"name\": \"Server TPS\", \"value\": \"`" + tps + "`\", \"inline\": true},\n" +
                    "      {\"name\": \"Details\", \"value\": \"```" + escapeJson(details) + "```\", \"inline\": false}\n" +
                    "    ],\n" +
                    "    \"footer\": {\"text\": \"CoffeeProtect v2.5.6 • Server Security\"}\n" +
                    "  }]\n" +
                    "}";

                URL url = new URL(webhookUrl);
                HttpURLConnection conn = (HttpURLConnection) url.openConnection();
                conn.setRequestMethod("POST");
                conn.setRequestProperty("Content-Type", "application/json");
                conn.setRequestProperty("User-Agent", "CoffeeProtect-Webhook");
                conn.setDoOutput(true);
                conn.setConnectTimeout(5000);
                conn.setReadTimeout(5000);

                try (OutputStream os = conn.getOutputStream()) {
                    os.write(json.getBytes(StandardCharsets.UTF_8));
                }

                conn.getResponseCode();
                conn.disconnect();
            } catch (Exception ignored) {}
        });
    }

    private String escapeJson(String s) {
        if (s == null) return "";
        return s.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "");
    }
}
