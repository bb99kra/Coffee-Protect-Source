/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_qy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_r9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Ja
extends PacketWrapper<CP_Ja> {
    private List<CP_r9> CP_n;
    private static transient /* synthetic */ String lZIFlsAuhS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Ja(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Ja(List<CP_r9> list) {
        super(CP_qy.SELECT_KNOWN_PACKS);
        this.CP_n = list;
    }

    @Override
    public void CP_e() {
        this.CP_n = this.CP_l(PacketWrapper::CP_M);
    }

    @Override
    public void CP_J() {
        this.CP_Q(this.CP_n, PacketWrapper::CP_y);
    }

    public void CP_c(CP_Ja ilIlJa) {
        this.CP_n = ilIlJa.CP_n;
    }

    public List<CP_r9> CP_r() {
        return this.CP_n;
    }

    public void CP_l(List<CP_r9> list) {
        this.CP_n = list;
    }
}

