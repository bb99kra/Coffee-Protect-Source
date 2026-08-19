/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.manager;

import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import me.nik.coffeeprotect.CoffeeProtect;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class DiscordWebhookManager {
    private final CoffeeProtect plugin;

    public DiscordWebhookManager(@NotNull CoffeeProtect coffeeProtect) {
        this.plugin = coffeeProtect;
    }

    public void sendAlert(@NotNull Player player, @NotNull String string, int n, @NotNull String string2) {
        if (!this.plugin.getConfig().getBoolean("discord.enabled", false)) {
            return;
        }
        String string3 = this.plugin.getConfig().getString("discord.webhook_url", "");
        if (string3.isEmpty() || string3.contains("YOUR_WEBHOOK_URL_HERE")) {
            return;
        }
        CompletableFuture.runAsync(() -> {
            try {
                Object object;
                Object object2;
                String string4 = this.plugin.getConfig().getString("discord.embed.title", "\u2615 CoffeeProtect - Exploit Alert");
                String string5 = this.plugin.getConfig().getString("discord.embed.color", "#E67E22").replace("#", "");
                int n2 = Integer.parseInt(string5, 16);
                double d = 20.0;
                try {
                    object2 = Bukkit.getServer().getClass().getMethod("spigot", new Class[0]).invoke((Object)Bukkit.getServer(), new Object[0]);
                    object = (double[])object2.getClass().getMethod("getTPS", new Class[0]).invoke(object2, new Object[0]);
                    d = Math.min(20.0, (double)Math.round(((double[])object)[0] * 100.0) / 100.0);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                object2 = "{\n  \"embeds\": [{\n    \"title\": \"" + this.escapeJson(string4) + "\",\n    \"color\": " + n2 + ",\n    \"fields\": [\n      {\"name\": \"Player\", \"value\": \"`" + this.escapeJson(player.getName()) + "`\", \"inline\": true},\n      {\"name\": \"Check\", \"value\": \"`" + this.escapeJson(string) + "`\", \"inline\": true},\n      {\"name\": \"Ping\", \"value\": \"`" + player.getPing() + " ms`\", \"inline\": true},\n      {\"name\": \"Violation Level\", \"value\": \"`" + n + "`\", \"inline\": true},\n      {\"name\": \"Server TPS\", \"value\": \"`" + d + "`\", \"inline\": true},\n      {\"name\": \"Details\", \"value\": \"```" + this.escapeJson(string2) + "```\", \"inline\": false}\n    ],\n    \"footer\": {\"text\": \"CoffeeProtect v2.5.6 \u2022 Server Security\"}\n  }]\n}";
                object = new URL(string3);
                HttpURLConnection httpURLConnection = (HttpURLConnection)((URL)object).openConnection();
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty("Content-Type", "application/json");
                httpURLConnection.setRequestProperty("User-Agent", "CoffeeProtect-Webhook");
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setConnectTimeout(5000);
                httpURLConnection.setReadTimeout(5000);
                try (OutputStream outputStream = httpURLConnection.getOutputStream();){
                    outputStream.write(((String)object2).getBytes(StandardCharsets.UTF_8));
                }
                httpURLConnection.getResponseCode();
                httpURLConnection.disconnect();
            }
            catch (Exception exception) {
                // empty catch block
            }
        });
    }

    private String escapeJson(String string) {
        if (string == null) {
            return "";
        }
        return string.replace("\\", "\\\\").replace("\"", "\\\"").replace("\n", "\\n").replace("\r", "");
    }
}

