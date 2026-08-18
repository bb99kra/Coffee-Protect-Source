/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_qy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Jp
extends PacketWrapper<CP_Jp> {
    private long CP_m;
    private static transient /* synthetic */ String OstmulqAZI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jp(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Jp(long l) {
        super(CP_qy.KEEP_ALIVE);
        this.CP_m = l;
    }

    @Override
    public void CP_e() {
        this.CP_m = this.CP_i();
    }

    @Override
    public void CP_J() {
        this.CP_P(this.CP_m);
    }

    public void CP_s(CP_Jp ilIlJp) {
        this.CP_m = ilIlJp.CP_m;
    }

    public long CP_a() {
        return this.CP_m;
    }

    public void CP_t(long l) {
        this.CP_m = l;
    }
}

