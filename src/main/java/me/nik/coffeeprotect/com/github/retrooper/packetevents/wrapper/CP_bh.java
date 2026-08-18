/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bh
extends PacketWrapper<CP_bh> {
    private int CP_n;
    private short CP_X;
    private boolean CP_z;
    private static transient /* synthetic */ String GvRscBDQfe = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bh(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bh(int n, short s, boolean bl) {
        super(CP_nN.WINDOW_CONFIRMATION);
        this.CP_n = n;
        this.CP_X = s;
        this.CP_z = bl;
    }

    @Override
    public void CP_e() {
        this.CP_n = this.CP_P();
        this.CP_X = this.CP_G();
        this.CP_z = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_u(this.CP_n);
        this.CP_G(this.CP_X);
        this.CP_a(this.CP_z);
    }

    public void CP_w(CP_bh ilIlbh) {
        this.CP_n = ilIlbh.CP_n;
        this.CP_X = ilIlbh.CP_X;
        this.CP_z = ilIlbh.CP_z;
    }

    public int CP_h() {
        return this.CP_n;
    }

    public void CP_N(int n) {
        this.CP_n = n;
    }

    public short CP_B() {
        return this.CP_X;
    }

    public void CP_s(short s) {
        this.CP_X = s;
    }

    public boolean CP_C() {
        return this.CP_z;
    }

    public void CP_v(boolean bl) {
        this.CP_z = bl;
    }
}

