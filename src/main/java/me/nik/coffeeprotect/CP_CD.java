/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 */
package me.nik.coffeeprotect;

import org.bukkit.Material;

class CP_CD {
    static final int[] CP_Y = new int[Material.values().length];
    private static transient /* synthetic */ String IzGwTHedRP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_CD.CP_Y[Material.BARRIER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_CD.CP_Y[Material.BOOK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
