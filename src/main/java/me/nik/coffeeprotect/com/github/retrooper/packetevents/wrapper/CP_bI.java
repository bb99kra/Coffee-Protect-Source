/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Map;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_C0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_iA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bI
extends PacketWrapper<CP_bI> {
    private Map<CP_C0, CP_iA> CP_u;
    private static transient /* synthetic */ String vBpMQQjncW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bI(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bI(Map<CP_C0, CP_iA> map) {
        super(CP_AG.CHUNK_BIOMES);
        this.CP_u = map;
    }

    @Override
    public void CP_e() {
        this.CP_u = this.CP_c(CP_C0::CP_v, CP_iA::CP_p);
    }

    @Override
    public void CP_J() {
        this.CP_a(this.CP_u, CP_C0::CP_j, CP_iA::CP_X);
    }

    public void CP_I(CP_bI ilIlbI) {
        this.CP_u = ilIlbI.CP_u;
    }

    public Map<CP_C0, CP_iA> CP_g() {
        return this.CP_u;
    }

    public CP_iA CP_w(CP_C0 ilIlC0) {
        return this.CP_u.get(ilIlC0);
    }
}

