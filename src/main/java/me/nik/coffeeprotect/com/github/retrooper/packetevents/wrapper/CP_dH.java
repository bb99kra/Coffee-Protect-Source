/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.CP_um;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class CP_dH {
    private final CP_um<?> CP_G;
    private final float CP_x;
    private final float CP_o;
    private static transient /* synthetic */ String NLGeflgjzW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_dH(CP_um<?> ilIlum, float f, float f2) {
        this.CP_G = ilIlum;
        this.CP_x = f;
        this.CP_o = f2;
    }

    public static CP_dH CP_O(PacketWrapper<?> packetWrapper) {
        CP_um<?> ilIlum = CP_um.CP_g(packetWrapper);
        float f = packetWrapper.CP_X();
        float f2 = packetWrapper.CP_X();
        return new CP_dH(ilIlum, f, f2);
    }

    public static void CP_r(PacketWrapper<?> packetWrapper, CP_dH ilIldH) {
        CP_um.CP_u(packetWrapper, ilIldH.CP_G);
        packetWrapper.CP_R(ilIldH.CP_x);
        packetWrapper.CP_R(ilIldH.CP_o);
    }

    public CP_um<?> CP_I() {
        return this.CP_G;
    }

    public float CP_s() {
        return this.CP_x;
    }

    public float CP_F() {
        return this.CP_o;
    }
}

