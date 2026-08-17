package me.nik.coffeeprotect.hook;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CoffeePlaceholderExpansion extends PlaceholderExpansion {

    private final CoffeeProtect plugin;

    public CoffeePlaceholderExpansion(@NotNull CoffeeProtect plugin) {
        this.plugin = plugin;
    }

    @Override
    public @NotNull String getIdentifier() {
        return "coffeeprotect";
    }

    @Override
    public @NotNull String getAuthor() {
        return "Nik, Nguyendzvn";
    }

    @Override
    public @NotNull String getVersion() {
        return plugin.getDescription().getVersion();
    }

    @Override
    public boolean persist() {
        return true;
    }

    @Override
    public @Nullable String onRequest(OfflinePlayer offlinePlayer, @NotNull String params) {
        if (params.equalsIgnoreCase("status")) {
            return "&aProtected";
        }

        if (params.equalsIgnoreCase("total_blocked") || params.equalsIgnoreCase("blocked")) {
            return String.valueOf(plugin.getTotalBlockedPackets());
        }

        if (offlinePlayer == null || !offlinePlayer.isOnline()) {
            return "";
        }

        Player player = offlinePlayer.getPlayer();
        if (player == null) return "";

        PlayerData data = plugin.getPlayerDataManager().getPlayerData(player);

        switch (params.toLowerCase()) {
            case "ping":
                return String.valueOf(player.getPing());
            case "brand":
            case "client_brand":
                return data.getClientBrand();
            case "violations":
            case "vl":
                return String.valueOf(data.getTotalViolations());
            case "blocked_packets":
            case "player_blocked":
                return String.valueOf(data.getBlockedPackets());
            case "alerts_enabled":
                return data.hasAlertsEnabled() ? "Yes" : "No";
            default:
                return null;
        }
    }
}
