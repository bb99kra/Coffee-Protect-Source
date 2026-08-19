/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.api;

import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public interface CoffeeProtectAPI {
    public long getTotalBlockedPackets();

    public int getViolationLevel(@NotNull Player var1);

    @NotNull
    public String getClientBrand(@NotNull Player var1);

    public boolean hasAlertsEnabled(@NotNull Player var1);

    public void toggleAlerts(@NotNull Player var1);
}

