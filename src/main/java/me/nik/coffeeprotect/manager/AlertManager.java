package me.nik.coffeeprotect.manager;

import me.nik.coffeeprotect.CoffeeProtect;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AlertManager {

    private final CoffeeProtect plugin;

    public AlertManager(@NotNull CoffeeProtect plugin) {
        this.plugin = plugin;
    }

    public void sendAlert(@NotNull Player player, @NotNull String checkName, int vl, @NotNull String details) {
        if (!plugin.getConfig().getBoolean("alerts.enabled", true)) {
            return;
        }

        PlayerData data = plugin.getPlayerDataManager().getPlayerData(player);
        int cooldown = plugin.getConfig().getInt("alerts.cooldown_seconds", 3);
        if (!data.canSendAlert(cooldown)) {
            return;
        }

        String format = plugin.getConfig().getString(
            "alerts.format",
            "&8[&6☕ CoffeeProtect&8] &c{player} &7failed &e{check} &7(&cVL: {vl}&7, &fPing: {ping}ms&7)"
        );

        String message = format
            .replace("{player}", player.getName())
            .replace("{check}", checkName)
            .replace("{vl}", String.valueOf(vl))
            .replace("{ping}", String.valueOf(player.getPing()))
            .replace("{details}", details);

        String colored = ChatColor.translateAlternateColorCodes('&', message);

        for (Player staff : Bukkit.getOnlinePlayers()) {
            if (staff.hasPermission("coffeeprotect.alerts")) {
                PlayerData staffData = plugin.getPlayerDataManager().getPlayerData(staff);
                if (staffData.hasAlertsEnabled()) {
                    staff.sendMessage(colored);
                }
            }
        }

        if (plugin.getConfig().getBoolean("settings.debug", false)) {
            plugin.getLogger().info("[ALERT] " + player.getName() + " failed " + checkName + " (VL: " + vl + "): " + details);
        }
    }

    public void broadcastStaff(@NotNull String message) {
        String colored = ChatColor.translateAlternateColorCodes('&', message);
        for (Player staff : Bukkit.getOnlinePlayers()) {
            if (staff.hasPermission("coffeeprotect.alerts")) {
                staff.sendMessage(colored);
            }
        }
    }
}
