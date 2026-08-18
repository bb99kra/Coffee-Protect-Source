/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bX
extends PacketWrapper<CP_bX> {
    private int CP_n;
    private static transient /* synthetic */ String lTLdmbiimp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bX(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bX(int n) {
        super(CP_nN.SELECT_TRADE);
        this.CP_n = n;
    }

    @Override
    public void CP_e() {
        this.CP_n = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_n);
    }

    public void CP_K(CP_bX ilIlbX) {
        this.CP_n = ilIlbX.CP_n;
    }

    public int CP_v() {
        return this.CP_n;
    }

    public void CP_Y(int n) {
        this.CP_n = n;
    }
}

