/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_rX;

class CP_GS {
    static final int[] CP_M = new int[CP_rX.values().length];
    private static transient /* synthetic */ String egInEKGAud = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_GS.CP_M[CP_rX.MILLIS.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_GS.CP_M[CP_rX.NANO.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

