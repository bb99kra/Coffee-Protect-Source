/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_qy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JV
extends PacketWrapper<CP_JV> {
    private int CP_M;
    private static transient /* synthetic */ String dAwnSUAJQT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JV(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JV(int n) {
        super(CP_qy.PONG);
        this.CP_M = n;
    }

    @Override
    public void CP_e() {
        this.CP_M = this.CP_W();
    }

    @Override
    public void CP_J() {
        this.CP_a(this.CP_M);
    }

    public void CP_f(CP_JV ilIlJV) {
        this.CP_M = ilIlJV.CP_M;
    }

    public int CP_s() {
        return this.CP_M;
    }

    public void CP_n(int n) {
        this.CP_M = n;
    }
}

