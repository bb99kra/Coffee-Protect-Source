/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect;

import com.google.common.cache.CacheLoader;
import me.nik.coffeeprotect.IlIlGg;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

class IlIlA6
extends CacheLoader<String, Boolean> {
    final IlIlGg IlIlf;
    private static transient /* synthetic */ String FEMEZiQFMo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlA6(IlIlGg ilIlGg) {
        this.IlIlf = ilIlGg;
    }

    @NotNull
    public Boolean IlIly(@NotNull String string) {
        return IlIlGg.IlIll(this.IlIlf, string);
    }
}

