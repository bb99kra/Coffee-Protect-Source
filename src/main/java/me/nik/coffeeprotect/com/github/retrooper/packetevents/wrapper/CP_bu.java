/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_iP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_bE;

public class CP_bu
extends CP_bE {
    private static transient /* synthetic */ String EkXVIktckP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bu(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bu(CP_v_ ilIlv_, float f, float f2, boolean bl) {
        super(true, true, bl, new CP_iP(ilIlv_, f, f2));
    }

    public CP_bu(CP_iP ilIliP, boolean bl) {
        super(true, true, bl, ilIliP);
    }

    public CP_v_ CP_g() {
        return this.CP_P().CP_n();
    }

    public void CP_L(CP_v_ ilIlv_) {
        this.CP_P().CP_f(ilIlv_);
    }

    public float CP_K() {
        return this.CP_P().CP_H();
    }

    public void CP_t(float f) {
        this.CP_P().CP_I(f);
    }

    public float CP_J() {
        return this.CP_P().CP_P();
    }

    public void CP_s(float f) {
        this.CP_P().CP_m(f);
    }
}

