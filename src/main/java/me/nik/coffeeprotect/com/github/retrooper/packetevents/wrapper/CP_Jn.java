/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_jY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Jn
extends PacketWrapper<CP_Jn> {
    private CP_jY CP_w;
    private static transient /* synthetic */ String MEATicYOrY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jn(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Jn(CP_jY ilIljY) {
        super(CP_nN.CHANGE_GAME_MODE);
        this.CP_w = ilIljY;
    }

    @Override
    public void CP_e() {
        this.CP_w = CP_jY.CP_E(this.CP_f());
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_w.CP_i());
    }

    public void CP_W(CP_Jn ilIlJn) {
        this.CP_w = ilIlJn.CP_w;
    }

    public CP_jY CP_H() {
        return this.CP_w;
    }

    public void CP_E(CP_jY ilIljY) {
        this.CP_w = ilIljY;
    }
}

