/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 */
package me.nik.coffeeprotect;

import com.google.common.cache.CacheLoader;
import me.nik.coffeeprotect.CP_Gg;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

class CP_A6
extends CacheLoader<String, Boolean> {
    final CP_Gg CP_f;
    private static transient /* synthetic */ String FEMEZiQFMo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_A6(CP_Gg ilIlGg) {
        this.CP_f = ilIlGg;
    }

    @NotNull
    public Boolean CP_y(@NotNull String string) {
        return CP_Gg.CP_l(this.CP_f, string);
    }
}
