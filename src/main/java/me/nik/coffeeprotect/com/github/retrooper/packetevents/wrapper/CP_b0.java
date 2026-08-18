/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_b0
extends PacketWrapper<CP_b0> {
    private boolean CP_l;
    private static transient /* synthetic */ String GtCInXsyLS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b0(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_b0(boolean bl) {
        super(CP_nN.LOCK_DIFFICULTY);
        this.CP_l = bl;
    }

    @Override
    public void CP_e() {
        this.CP_l = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_a(this.CP_l);
    }

    public void CP_x(CP_b0 ilIlb0) {
        this.CP_l = ilIlb0.CP_l;
    }

    public boolean CP_q() {
        return this.CP_l;
    }

    public void CP_i(boolean bl) {
        this.CP_l = bl;
    }
}

