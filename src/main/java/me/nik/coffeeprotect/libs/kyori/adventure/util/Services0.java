/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.util;

import java.util.ServiceLoader;

final class Services0 {
    private static transient /* synthetic */ String hESBuMAXkS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private Services0() {
    }

    static <S> ServiceLoader<S> loader(Class<S> clazz) {
        return ServiceLoader.load(clazz, clazz.getClassLoader());
    }
}

