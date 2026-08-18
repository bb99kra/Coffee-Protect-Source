/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_rx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bx
extends PacketWrapper<CP_bx> {
    private CP_rx CP_T;
    private boolean CP_q;
    private boolean CP_N;
    private static transient /* synthetic */ String tJsWENBysj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bx(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bx(CP_rx ilIlrx, boolean bl, boolean bl2) {
        super(CP_nN.SET_RECIPE_BOOK_STATE);
        this.CP_T = ilIlrx;
        this.CP_q = bl;
        this.CP_N = bl2;
    }

    @Override
    public void CP_e() {
        this.CP_T = CP_rx.CP_F(this.CP_f());
        this.CP_q = this.CP_K();
        this.CP_N = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_T.CP_T());
        this.CP_a(this.CP_q);
        this.CP_a(this.CP_N);
    }

    public void CP_V(CP_bx ilIlbx) {
        this.CP_T = ilIlbx.CP_T;
        this.CP_q = ilIlbx.CP_q;
        this.CP_N = ilIlbx.CP_N;
    }

    public CP_rx CP_n() {
        return this.CP_T;
    }

    public void CP_k(CP_rx ilIlrx) {
        this.CP_T = ilIlrx;
    }

    public boolean CP_s() {
        return this.CP_q;
    }

    public void CP_G(boolean bl) {
        this.CP_q = bl;
    }

    public boolean CP_i() {
        return this.CP_N;
    }

    public void CP_UnderScore(boolean bl) {
        this.CP_N = bl;
    }
}

