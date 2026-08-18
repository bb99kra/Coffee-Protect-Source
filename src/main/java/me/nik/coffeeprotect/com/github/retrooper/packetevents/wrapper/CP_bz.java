/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bz
extends PacketWrapper<CP_bz> {
    private int CP_Q;
    private static transient /* synthetic */ String dFEACxyzNJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bz(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bz(int n) {
        super(CP_nN.PONG);
        this.CP_Q = n;
    }

    @Override
    public void CP_e() {
        this.CP_Q = this.CP_W();
    }

    @Override
    public void CP_J() {
        this.CP_a(this.CP_Q);
    }

    public void CP_C(CP_bz ilIlbz) {
        this.CP_Q = ilIlbz.CP_Q;
    }

    public int CP_k() {
        return this.CP_Q;
    }

    public void CP_S(int n) {
        this.CP_Q = n;
    }
}

