/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_iP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_bE;

public class CP_ba
extends CP_bE {
    private static transient /* synthetic */ String YyYhOPkPpV = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_ba(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_ba(CP_v_ ilIlv_, boolean bl) {
        super(true, false, bl, new CP_iP(ilIlv_, 0.0f, 0.0f));
    }

    public CP_v_ CP_w() {
        return this.CP_P().CP_n();
    }

    public void CP_m(CP_v_ ilIlv_) {
        this.CP_P().CP_f(ilIlv_);
    }
}

