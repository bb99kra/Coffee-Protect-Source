/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 */
package me.nik.coffeeprotect;

import org.bukkit.Material;

class CP_OA {
    static final int[] CP_V = new int[Material.values().length];
    private static transient /* synthetic */ String yymTpxSvPP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_OA.CP_V[Material.PAPER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_OA.CP_V[Material.BARRIER.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_OA.CP_V[Material.BOOK.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
