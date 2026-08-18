/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_CH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bU
extends PacketWrapper<CP_bU> {
    private CP_CH CP_a;
    private float CP_s;
    private static transient /* synthetic */ String HdtHOSXjLG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bU(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bU(int n, float f) {
        super(CP_AG.CHANGE_GAME_STATE);
        this.CP_a = CP_CH.CP_J()[n];
        this.CP_s = f;
    }

    public CP_bU(CP_CH ilIlCH, float f) {
        super(CP_AG.CHANGE_GAME_STATE);
        this.CP_a = ilIlCH;
        this.CP_s = f;
    }

    @Override
    public void CP_e() {
        this.CP_a = CP_CH.CP_L(this.CP_P());
        this.CP_s = this.CP_X();
    }

    @Override
    public void CP_J() {
        this.CP_u(this.CP_a.ordinal());
        this.CP_R(this.CP_s);
    }

    public void CP_f(CP_bU ilIlbU) {
        this.CP_a = ilIlbU.CP_a;
        this.CP_s = ilIlbU.CP_s;
    }

    public CP_CH CP_c() {
        return this.CP_a;
    }

    public void CP_F(CP_CH ilIlCH) {
        this.CP_a = ilIlCH;
    }

    public float CP_N() {
        return this.CP_s;
    }

    public void CP_C(float f) {
        this.CP_s = f;
    }
}

