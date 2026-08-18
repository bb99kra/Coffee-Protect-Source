/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bD
extends PacketWrapper<CP_bD> {
    private int CP_UnderScore;
    private boolean CP_w;
    private static transient /* synthetic */ String ujEpGuOVcb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bD(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bD(int n, boolean bl) {
        super(CP_nN.PICK_ITEM_FROM_ENTITY);
        this.CP_UnderScore = n;
        this.CP_w = bl;
    }

    @Override
    public void CP_e() {
        this.CP_UnderScore = this.CP_f();
        this.CP_w = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_UnderScore);
        this.CP_a(this.CP_w);
    }

    public void CP_UnderScore(CP_bD ilIlbD) {
        this.CP_UnderScore = ilIlbD.CP_UnderScore;
        this.CP_w = ilIlbD.CP_w;
    }

    public int CP_N() {
        return this.CP_UnderScore;
    }

    public void CP_UnderScore(int n) {
        this.CP_UnderScore = n;
    }

    public boolean CP_o() {
        return this.CP_w;
    }

    public void CP_z(boolean bl) {
        this.CP_w = bl;
    }
}

