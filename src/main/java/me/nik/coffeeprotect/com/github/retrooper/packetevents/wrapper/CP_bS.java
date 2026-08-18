/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bS
extends PacketWrapper<CP_bS> {
    private int CP_I;
    private CP_An CP_M;
    private static transient /* synthetic */ String PqNaTUGUKt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bS(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bS(int n, CP_An ilIlAn) {
        super(CP_nN.QUERY_BLOCK_NBT);
        this.CP_I = n;
        this.CP_M = ilIlAn;
    }

    @Override
    public void CP_e() {
        this.CP_I = this.CP_f();
        this.CP_M = this.CP_E();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_I);
        this.CP_h(this.CP_M);
    }

    public void CP_C(CP_bS ilIlbS) {
        this.CP_I = ilIlbS.CP_I;
        this.CP_M = ilIlbS.CP_M;
    }

    public int CP_X() {
        return this.CP_I;
    }

    public void CP_W(int n) {
        this.CP_I = n;
    }

    public CP_An CP_c() {
        return this.CP_M;
    }

    public void CP_y(CP_An ilIlAn) {
        this.CP_M = ilIlAn;
    }
}

