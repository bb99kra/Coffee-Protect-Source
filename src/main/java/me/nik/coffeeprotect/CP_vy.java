/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 */
package me.nik.coffeeprotect;

import org.bukkit.Material;

class CP_vy {
    static final int[] CP_u = new int[Material.values().length];
    private static transient /* synthetic */ String kfSGqJePqj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_vy.CP_u[Material.BARRIER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_vy.CP_u[Material.BOOK.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
