/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JU
extends PacketWrapper<CP_JU> {
    private long CP_UnderScore;
    private static transient /* synthetic */ String FqoUjTjcuJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JU(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JU(long l) {
        super(CP_nN.DEBUG_PING);
        this.CP_UnderScore = l;
    }

    @Override
    public void CP_e() {
        this.CP_UnderScore = this.CP_i();
    }

    @Override
    public void CP_J() {
        this.CP_P(this.CP_UnderScore);
    }

    public void CP_o(CP_JU ilIlJU) {
        this.CP_UnderScore = ilIlJU.CP_UnderScore;
    }

    public long CP_v() {
        return this.CP_UnderScore;
    }

    public void CP_W(long l) {
        this.CP_UnderScore = l;
    }
}

