/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Ji
extends PacketWrapper<CP_Ji> {
    private int CP_L;
    private static transient /* synthetic */ String TTDcezrGGB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Ji(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Ji(int n) {
        super(CP_nN.HELD_ITEM_CHANGE);
        this.CP_L = n;
    }

    @Override
    public void CP_e() {
        this.CP_L = this.CP_G();
    }

    @Override
    public void CP_J() {
        this.CP_G(this.CP_L);
    }

    public void CP_b(CP_Ji ilIlJi) {
        this.CP_L = ilIlJi.CP_L;
    }

    public int CP_z() {
        return this.CP_L;
    }

    public void CP_x(int n) {
        this.CP_L = n;
    }
}

