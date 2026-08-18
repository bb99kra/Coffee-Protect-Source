/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Map;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Ft
extends PacketWrapper<CP_Ft> {
    private Map<String, Integer> CP_p;
    private static transient /* synthetic */ String bVdQzQZwWh = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Ft(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Ft(Map<String, Integer> map) {
        super(CP_AG.STATISTICS);
        this.CP_p = map;
    }

    @Override
    public void CP_e() {
        this.CP_p = this.CP_c(PacketWrapper::CP_i, PacketWrapper::CP_f);
    }

    @Override
    public void CP_J() {
        this.CP_a(this.CP_p, PacketWrapper::CP_M, PacketWrapper::CP_J);
    }

    public void CP_f(CP_Ft ilIlFt) {
        this.CP_p = ilIlFt.CP_p;
    }

    public Map<String, Integer> CP_J() {
        return this.CP_p;
    }

    public void CP_d(Map<String, Integer> map) {
        this.CP_p = map;
    }
}

