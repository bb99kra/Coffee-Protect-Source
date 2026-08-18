/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bc
extends PacketWrapper<CP_bc> {
    private CP_An CP_A;
    private boolean CP_x;
    private static transient /* synthetic */ String nZjYfbibAD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bc(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bc(CP_An ilIlAn, boolean bl) {
        super(CP_nN.PICK_ITEM_FROM_BLOCK);
        this.CP_A = ilIlAn;
        this.CP_x = bl;
    }

    @Override
    public void CP_e() {
        this.CP_A = this.CP_E();
        this.CP_x = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_h(this.CP_A);
        this.CP_a(this.CP_x);
    }

    public void CP_j(CP_bc ilIlbc) {
        this.CP_A = ilIlbc.CP_A;
        this.CP_x = ilIlbc.CP_x;
    }

    public CP_An CP_R() {
        return this.CP_A;
    }

    public void CP_H(CP_An ilIlAn) {
        this.CP_A = ilIlAn;
    }

    public boolean CP_G() {
        return this.CP_x;
    }

    public void CP_U(boolean bl) {
        this.CP_x = bl;
    }
}

