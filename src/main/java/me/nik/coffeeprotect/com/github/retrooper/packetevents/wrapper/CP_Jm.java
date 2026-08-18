/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_n0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Jm
extends PacketWrapper<CP_Jm> {
    private int CP_G;
    private static transient /* synthetic */ String lJqomredFP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jm(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jm(int n) {
        super(CP_n0.SET_COMPRESSION);
        this.CP_G = n;
    }

    @Override
    public void CP_e() {
        this.CP_G = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_G);
    }

    public void CP_R(CP_Jm ilIlJm) {
        this.CP_G = ilIlJm.CP_G;
    }

    public int CP_O() {
        return this.CP_G;
    }

    public void CP_w(int n) {
        this.CP_G = n;
    }
}

