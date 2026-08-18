/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JK
extends PacketWrapper<CP_JK> {
    private long CP_E;
    private static transient /* synthetic */ String GbmhBkfDGt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JK(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_JK(long l) {
        super(CP_Wz.KEEP_ALIVE);
        this.CP_E = l;
    }

    @Override
    public void CP_e() {
        this.CP_E = this.CP_i();
    }

    @Override
    public void CP_J() {
        this.CP_P(this.CP_E);
    }

    public void CP_R(CP_JK ilIlJK) {
        this.CP_E = ilIlJK.CP_E;
    }

    public long CP_F() {
        return this.CP_E;
    }

    public void CP_j(long l) {
        this.CP_E = l;
    }
}

