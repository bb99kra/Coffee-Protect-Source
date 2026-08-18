/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j;

import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j.CP_A9;

class CP_AU
extends CP_A9<Integer> {
    private static transient /* synthetic */ String PATzUzSwEW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_AU(Class clazz) {
        super(clazz);
    }

    public Integer CP_C(String string) throws IllegalArgumentException {
        try {
            return Integer.decode(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw CP_AU.CP_k(string, Integer.class, numberFormatException.getMessage());
        }
    }
}

