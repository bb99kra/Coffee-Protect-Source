/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;

class CP_vr {
    static final int[] CP_x = new int[CP_nN.values().length];
    private static transient /* synthetic */ String tpULHSdPfv = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_vr.CP_x[CP_nN.PLAYER_POSITION.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_vr.CP_x[CP_nN.PLAYER_POSITION_AND_ROTATION.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_vr.CP_x[CP_nN.PLAYER_ROTATION.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_vr.CP_x[CP_nN.VEHICLE_MOVE.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
