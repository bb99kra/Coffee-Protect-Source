/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_rk;

class CP_rq {
    static final int[] CP_i = new int[CP_rk.values().length];
    private static transient /* synthetic */ String xudshGzEPR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_rq.CP_i[CP_rk.HANDSHAKING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_rq.CP_i[CP_rk.STATUS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_rq.CP_i[CP_rk.LOGIN.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_rq.CP_i[CP_rk.PLAY.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_rq.CP_i[CP_rk.CONFIGURATION.ordinal()] = 5;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

