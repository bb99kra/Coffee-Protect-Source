/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 */
package me.nik.coffeeprotect;

import org.bukkit.event.player.PlayerTeleportEvent;

class CP_vs {
    static final int[] CP_m = new int[PlayerTeleportEvent.TeleportCause.values().length];
    private static transient /* synthetic */ String EeZgeeyEmY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_vs.CP_m[PlayerTeleportEvent.TeleportCause.NETHER_PORTAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_vs.CP_m[PlayerTeleportEvent.TeleportCause.END_PORTAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_vs.CP_m[PlayerTeleportEvent.TeleportCause.END_GATEWAY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
