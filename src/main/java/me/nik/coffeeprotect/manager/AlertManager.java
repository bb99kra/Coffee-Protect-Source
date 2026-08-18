/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.manager;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AlertManager {
    private final CoffeeProtect plugin;

    public AlertManager(@NotNull CoffeeProtect coffeeProtect) {
        this.plugin = coffeeProtect;
    }

    public void sendAlert(@NotNull Player player, @NotNull String string, int n, @NotNull String string2) {
        int n2;
        if (!this.plugin.getConfig().getBoolean("alerts.enabled", true)) {
            return;
        }
        PlayerData playerData = this.plugin.getPlayerDataManager().getPlayerData(player);
        if (!playerData.canSendAlert(n2 = this.plugin.getConfig().getInt("alerts.cooldown_seconds", 3))) {
            return;
        }
        String string3 = this.plugin.getConfig().getString("alerts.format", "&8[&6\u2615 CoffeeProtect&8] &c{player} &7failed &e{check} &7(&cVL: {vl}&7, &fPing: {ping}ms&7)");
        String string4 = string3.replace("{player}", player.getName()).replace("{check}", string).replace("{vl}", String.valueOf(n)).replace("{ping}", String.valueOf(player.getPing())).replace("{details}", string2);
        String string5 = ChatColor.translateAlternateColorCodes((char)'&', (String)string4);
        for (Player player2 : Bukkit.getOnlinePlayers()) {
            PlayerData playerData2;
            if (!player2.hasPermission("coffeeprotect.alerts") || !(playerData2 = this.plugin.getPlayerDataManager().getPlayerData(player2)).hasAlertsEnabled()) continue;
            player2.sendMessage(string5);
        }
        if (this.plugin.getConfig().getBoolean("settings.debug", false)) {
            this.plugin.getLogger().info("[ALERT] " + player.getName() + " failed " + string + " (VL: " + n + "): " + string2);
        }
    }

    public void broadcastStaff(@NotNull String string) {
        String string2 = ChatColor.translateAlternateColorCodes((char)'&', (String)string);
        for (Player player : Bukkit.getOnlinePlayers()) {
            if (!player.hasPermission("coffeeprotect.alerts")) continue;
            player.sendMessage(string2);
        }
    }
}

