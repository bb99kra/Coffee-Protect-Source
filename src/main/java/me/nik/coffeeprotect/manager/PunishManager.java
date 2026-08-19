/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.manager;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PunishManager {
    private final CoffeeProtect plugin;

    public PunishManager(@NotNull CoffeeProtect coffeeProtect) {
        this.plugin = coffeeProtect;
    }

    public void handlePunishment(@NotNull Player player, @NotNull CheckType checkType, int n) {
        String string = "checks." + checkType.name().toLowerCase() + ".action";
        String string2 = this.plugin.getConfig().getString(string, "");
        if (string2.isEmpty()) {
            return;
        }
        String string3 = string2.replace("{player}", player.getName()).replace("{check}", checkType.getName()).replace("{vl}", String.valueOf(n));
        this.plugin.runTaskOnMain(() -> {
            if (player.isOnline()) {
                Bukkit.dispatchCommand((CommandSender)Bukkit.getConsoleSender(), (String)string3);
            }
        });
    }
}

