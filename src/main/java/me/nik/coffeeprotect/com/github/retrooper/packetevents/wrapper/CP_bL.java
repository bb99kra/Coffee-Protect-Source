/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bL
extends PacketWrapper<CP_bL> {
    private int CP_X;
    private int CP_F;
    private static transient /* synthetic */ String oiaoyCgMai = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bL(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bL(int n, int n2) {
        super(CP_nN.QUERY_ENTITY_NBT);
        this.CP_X = n;
        this.CP_F = n2;
    }

    @Override
    public void CP_e() {
        this.CP_X = this.CP_f();
        this.CP_F = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_X);
        this.CP_J(this.CP_F);
    }

    public void CP_V(CP_bL ilIlbL) {
        this.CP_X = ilIlbL.CP_X;
        this.CP_F = ilIlbL.CP_F;
    }

    public int CP_R() {
        return this.CP_X;
    }

    public void CP_C(int n) {
        this.CP_X = n;
    }

    public int CP_B() {
        return this.CP_F;
    }

    public void CP_L(int n) {
        this.CP_F = n;
    }
}

