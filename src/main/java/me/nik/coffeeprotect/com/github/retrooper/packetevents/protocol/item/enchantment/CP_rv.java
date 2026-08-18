/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.CP_ZC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.CP_QY;

public class CP_rv {
    private CP_QY CP_p;
    private int CP_S;
    private static transient /* synthetic */ String LciAQmEtkq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_rv CP_l(CP_QY ilIlQY) {
        this.CP_p = ilIlQY;
        return this;
    }

    public CP_rv CP_M(int n) {
        this.CP_S = n;
        return this;
    }

    public CP_ZC CP_X() {
        return new CP_ZC(this.CP_p, this.CP_S);
    }
}

