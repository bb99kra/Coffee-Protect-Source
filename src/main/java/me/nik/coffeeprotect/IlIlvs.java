/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.player.PlayerTeleportEvent$TeleportCause
 */
package me.nik.coffeeprotect;

import org.bukkit.event.player.PlayerTeleportEvent;

class IlIlvs {
    static final int[] IlIlm = new int[PlayerTeleportEvent.TeleportCause.values().length];
    private static transient /* synthetic */ String EeZgeeyEmY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            IlIlvs.IlIlm[PlayerTeleportEvent.TeleportCause.NETHER_PORTAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IlIlvs.IlIlm[PlayerTeleportEvent.TeleportCause.END_PORTAL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IlIlvs.IlIlm[PlayerTeleportEvent.TeleportCause.END_GATEWAY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

