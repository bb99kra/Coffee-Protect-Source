/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_O_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bP
extends PacketWrapper<CP_bP> {
    private CP_O_ CP_c;
    private boolean CP_Z;
    private CP_An CP_w;
    private int CP_F;
    private static transient /* synthetic */ String yoYTOCeXfw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bP(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bP(CP_O_ ilIlO_, boolean bl, CP_An ilIlAn, int n) {
        super(CP_AG.ACKNOWLEDGE_PLAYER_DIGGING);
        this.CP_c = ilIlO_;
        this.CP_Z = bl;
        this.CP_w = ilIlAn;
        this.CP_F = n;
    }

    @Override
    public void CP_e() {
        this.CP_w = this.CP_E();
        this.CP_F = this.CP_f();
        this.CP_c = CP_O_.CP_Z(this.CP_f());
        this.CP_Z = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_h(this.CP_w);
        this.CP_J(this.CP_F);
        this.CP_J(this.CP_c.CP_r());
        this.CP_a(this.CP_Z);
    }

    public void CP_b(CP_bP ilIlbP) {
        this.CP_c = ilIlbP.CP_c;
        this.CP_Z = ilIlbP.CP_Z;
        this.CP_w = ilIlbP.CP_w;
        this.CP_F = ilIlbP.CP_F;
    }

    public CP_O_ CP_O() {
        return this.CP_c;
    }

    public void CP_x(CP_O_ ilIlO_) {
        this.CP_c = ilIlO_;
    }

    public boolean CP_R() {
        return this.CP_Z;
    }

    public void CP_z(boolean bl) {
        this.CP_Z = bl;
    }

    public CP_An CP_U() {
        return this.CP_w;
    }

    public void CP_x(CP_An ilIlAn) {
        this.CP_w = ilIlAn;
    }

    public int CP_I() {
        return this.CP_F;
    }

    public void CP_x(int n) {
        this.CP_F = n;
    }
}

