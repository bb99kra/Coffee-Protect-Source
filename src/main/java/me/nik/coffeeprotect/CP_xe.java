/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;

class CP_xe {
    static final int[] CP_s = new int[CP_nN.values().length];
    private static transient /* synthetic */ String jtcWlKOohj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_xe.CP_s[CP_nN.PLAYER_BLOCK_PLACEMENT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_xe.CP_s[CP_nN.PLAYER_DIGGING.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_xe.CP_s[CP_nN.USE_ITEM.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
