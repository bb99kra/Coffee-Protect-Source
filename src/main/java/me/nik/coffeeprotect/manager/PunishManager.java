package me.nik.coffeeprotect.manager;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PunishManager {

    private final CoffeeProtect plugin;

    public PunishManager(@NotNull CoffeeProtect plugin) {
        this.plugin = plugin;
    }

    public void handlePunishment(@NotNull Player player, @NotNull CheckType checkType, int currentVl) {
        String actionPath = "checks." + checkType.name().toLowerCase() + ".action";
        String actionCommand = plugin.getConfig().getString(actionPath, "");

        if (actionCommand.isEmpty()) {
            return;
        }

        String formatted = actionCommand
            .replace("{player}", player.getName())
            .replace("{check}", checkType.getName())
            .replace("{vl}", String.valueOf(currentVl));

        // Execute on main server thread / Folia scheduler
        plugin.runTaskOnMain(() -> {
            if (player.isOnline()) {
                Bukkit.dispatchCommand(Bukkit.getConsoleSender(), formatted);
            }
        });
    }
}
