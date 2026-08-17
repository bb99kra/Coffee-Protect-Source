package me.nik.coffeeprotect.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface CoffeeProtectAPI {

    /**
     * Get the total number of blocked packets since server start.
     */
    long getTotalBlockedPackets();

    /**
     * Get the violation level of a player.
     */
    int getViolationLevel(@NotNull Player player);

    /**
     * Get the client brand detected for a player (e.g. Vanilla, Lunar, Forge).
     */
    @NotNull
    String getClientBrand(@NotNull Player player);

    /**
     * Check if a player has alerts enabled.
     */
    boolean hasAlertsEnabled(@NotNull Player player);

    /**
     * Toggle alerts for a player.
     */
    void toggleAlerts(@NotNull Player player);
}
