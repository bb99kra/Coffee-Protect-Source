/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j;

import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j.CP_A9;

class CP_AN
extends CP_A9<Double> {
    private static transient /* synthetic */ String TZUVZaxkdR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_AN(Class clazz) {
        super(clazz);
    }

    public Double CP_p(String string) throws IllegalArgumentException {
        try {
            return Double.parseDouble(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw CP_AN.CP_k(string, Double.class, numberFormatException.getMessage());
        }
    }
}

