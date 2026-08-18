/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_iP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_bE;

public class CP_bk
extends CP_bE {
    private static transient /* synthetic */ String oQiexhFjjW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bk(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bk(float f, float f2, boolean bl) {
        super(false, true, bl, new CP_iP(new CP_v_(), f, f2));
    }

    public float CP_q() {
        return this.CP_P().CP_H();
    }

    public void CP_V(float f) {
        this.CP_P().CP_I(f);
    }

    public float CP_E() {
        return this.CP_P().CP_P();
    }

    public void CP_L(float f) {
        this.CP_P().CP_m(f);
    }
}

