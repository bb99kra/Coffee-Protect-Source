/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.CP_nH;

class CP_de {
    static final int[] CP_N = new int[CP_nH.values().length];
    private static transient /* synthetic */ String BNSnnJttMo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_de.CP_N[CP_nH.ALREADY_RUNNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_de.CP_N[CP_nH.START_SUCCESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_de.CP_N[CP_nH.NOT_RUNNING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_de.CP_N[CP_nH.STOP_SUCCESS.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
