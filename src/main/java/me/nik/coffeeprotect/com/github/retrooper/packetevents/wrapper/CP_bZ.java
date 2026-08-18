/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bZ
extends PacketWrapper<CP_bZ> {
    private int CP_u;
    private static transient /* synthetic */ String PIRfClEyBY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bZ(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bZ(int n) {
        super(CP_AG.CAMERA);
        this.CP_u = n;
    }

    @Override
    public void CP_e() {
        this.CP_u = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_u);
    }

    public void CP_y(CP_bZ ilIlbZ) {
        this.CP_u = ilIlbZ.CP_u;
    }

    public int CP_i() {
        return this.CP_u;
    }

    public void CP_C(int n) {
        this.CP_u = n;
    }
}

