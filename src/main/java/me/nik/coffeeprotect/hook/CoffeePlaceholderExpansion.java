/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.clip.placeholderapi.expansion.PlaceholderExpansion
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.nik.coffeeprotect.hook;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CoffeePlaceholderExpansion
extends PlaceholderExpansion {
    private final CoffeeProtect plugin;

    public CoffeePlaceholderExpansion(@NotNull CoffeeProtect coffeeProtect) {
        this.plugin = coffeeProtect;
    }

    @NotNull
    public String getIdentifier() {
        return "coffeeprotect";
    }

    @NotNull
    public String getAuthor() {
        return "Nik, Nguyendzvn";
    }

    @NotNull
    public String getVersion() {
        return this.plugin.getDescription().getVersion();
    }

    public boolean persist() {
        return true;
    }

    @Nullable
    public String onRequest(OfflinePlayer offlinePlayer, @NotNull String string) {
        if (string.equalsIgnoreCase("status")) {
            return "&aProtected";
        }
        if (string.equalsIgnoreCase("total_blocked") || string.equalsIgnoreCase("blocked")) {
            return String.valueOf(this.plugin.getTotalBlockedPackets());
        }
        if (offlinePlayer == null || !offlinePlayer.isOnline()) {
            return "";
        }
        Player player = offlinePlayer.getPlayer();
        if (player == null) {
            return "";
        }
        PlayerData playerData = this.plugin.getPlayerDataManager().getPlayerData(player);
        switch (string.toLowerCase()) {
            case "ping": {
                return String.valueOf(player.getPing());
            }
            case "brand": 
            case "client_brand": {
                return playerData.getClientBrand();
            }
            case "violations": 
            case "vl": {
                return String.valueOf(playerData.getTotalViolations());
            }
            case "blocked_packets": 
            case "player_blocked": {
                return String.valueOf(playerData.getBlockedPackets());
            }
            case "alerts_enabled": {
                return playerData.hasAlertsEnabled() ? "Yes" : "No";
            }
        }
        return null;
    }
}

