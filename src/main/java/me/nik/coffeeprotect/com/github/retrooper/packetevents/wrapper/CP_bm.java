/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bm
extends PacketWrapper<CP_bm> {
    private int CP_B;
    private static transient /* synthetic */ String gYCePnzPiq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bm(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bm(int n) {
        super(CP_nN.TELEPORT_CONFIRM);
        this.CP_B = n;
    }

    @Override
    public void CP_e() {
        this.CP_B = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_B);
    }

    public void CP_n(CP_bm ilIlbm) {
        this.CP_B = ilIlbm.CP_B;
    }

    public int CP_C() {
        return this.CP_B;
    }

    public void CP_Z(int n) {
        this.CP_B = n;
    }
}

