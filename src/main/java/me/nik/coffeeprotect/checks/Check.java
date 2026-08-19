/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Event
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.checks;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.api.events.PlayerExploitEvent;
import me.nik.coffeeprotect.checks.CheckType;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.jetbrains.annotations.NotNull;

public abstract class Check {
    protected final CoffeeProtect plugin;
    protected final CheckType checkType;

    public Check(@NotNull CoffeeProtect coffeeProtect, @NotNull CheckType checkType) {
        this.plugin = coffeeProtect;
        this.checkType = checkType;
    }

    @NotNull
    public CheckType getCheckType() {
        return this.checkType;
    }

    public boolean isEnabled() {
        String string = "checks." + this.checkType.name().toLowerCase() + ".enabled";
        return this.plugin.getConfig().getBoolean(string, true);
    }

    public boolean flag(@NotNull Player player, @NotNull String string) {
        PlayerData playerData = this.plugin.getPlayerDataManager().getPlayerData(player);
        int n = playerData.incrementViolation(this.checkType);
        PlayerExploitEvent playerExploitEvent = new PlayerExploitEvent(player, this.checkType, string, n);
        Bukkit.getPluginManager().callEvent((Event)playerExploitEvent);
        if (playerExploitEvent.isCancelled()) {
            return false;
        }
        this.plugin.incrementBlockedPackets();
        playerData.incrementBlockedPackets();
        this.plugin.getAlertManager().sendAlert(player, this.checkType.getName(), n, string);
        this.plugin.getDiscordWebhookManager().sendAlert(player, this.checkType.getName(), n, string);
        this.plugin.getPunishManager().handlePunishment(player, this.checkType, n);
        return true;
    }
}

