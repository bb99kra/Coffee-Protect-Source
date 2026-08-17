/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.IlIlnH;

class IlIlde {
    static final int[] IlIlN = new int[IlIlnH.values().length];
    private static transient /* synthetic */ String BNSnnJttMo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            IlIlde.IlIlN[IlIlnH.ALREADY_RUNNING.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IlIlde.IlIlN[IlIlnH.START_SUCCESS.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IlIlde.IlIlN[IlIlnH.NOT_RUNNING.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            IlIlde.IlIlN[IlIlnH.STOP_SUCCESS.ordinal()] = 4;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}

