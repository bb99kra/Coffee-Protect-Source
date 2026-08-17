/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.api;

import me.nik.coffeeprotect.api.CoffeeProtectAPI;

public class CoffeeProtectAPIProvider {
    private static CoffeeProtectAPI API = null;
    private static String[] IlIlx;
    private static transient /* synthetic */ String YmfQrBmaDp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public static CoffeeProtectAPI getAPI() {
        return API;
    }

    @Deprecated
    public static void register(CoffeeProtectAPI coffeeProtectAPI) {
        API = coffeeProtectAPI;
    }

    static {
        CoffeeProtectAPIProvider.IlIlV(null);
    }

    public static void IlIlV(String[] stringArray) {
        IlIlx = stringArray;
    }

    public static String[] IlIl_() {
        return IlIlx;
    }
}

