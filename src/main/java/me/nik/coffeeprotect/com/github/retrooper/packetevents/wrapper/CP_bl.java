/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bl
extends PacketWrapper<CP_bl> {
    private boolean CP_t;
    private boolean CP_UnderScore;
    private static transient /* synthetic */ String qUbLgDHnld = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bl(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bl(boolean bl, boolean bl2) {
        super(CP_nN.STEER_BOAT);
        this.CP_t = bl;
        this.CP_UnderScore = bl2;
    }

    @Override
    public void CP_e() {
        this.CP_t = this.CP_K();
        this.CP_UnderScore = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_a(this.CP_t);
        this.CP_a(this.CP_UnderScore);
    }

    public void CP_J(CP_bl ilIlbl) {
        this.CP_t = ilIlbl.CP_t;
        this.CP_UnderScore = ilIlbl.CP_UnderScore;
    }

    public boolean CP_l() {
        return this.CP_t;
    }

    public void CP_n(boolean bl) {
        this.CP_t = bl;
    }

    public boolean CP_x() {
        return this.CP_UnderScore;
    }

    public void CP_r(boolean bl) {
        this.CP_UnderScore = bl;
    }
}

