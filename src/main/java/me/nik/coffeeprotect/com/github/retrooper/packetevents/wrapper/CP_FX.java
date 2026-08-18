/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_FX
extends PacketWrapper<CP_FX> {
    private CP_Cg CP_UnderScore;
    private static transient /* synthetic */ String VDKFVjsXMy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_FX(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_FX(CP_Cg ilIlCg) {
        super(CP_AG.SET_CURSOR_ITEM);
        this.CP_UnderScore = ilIlCg;
    }

    @Override
    public void CP_e() {
        this.CP_UnderScore = this.CP_k();
    }

    @Override
    public void CP_J() {
        this.CP_j(this.CP_UnderScore);
    }

    public void CP_s(CP_FX ilIlFX) {
        this.CP_UnderScore = ilIlFX.CP_UnderScore;
    }

    public CP_Cg CP_B() {
        return this.CP_UnderScore;
    }

    public void CP_u(CP_Cg ilIlCg) {
        this.CP_UnderScore = ilIlCg;
    }
}

