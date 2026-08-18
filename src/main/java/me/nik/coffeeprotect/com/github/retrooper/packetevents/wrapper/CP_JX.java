/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_r9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JX
extends PacketWrapper<CP_JX> {
    private List<CP_r9> CP_q;
    private static transient /* synthetic */ String flZdSTjtmp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JX(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_JX(List<CP_r9> list) {
        super(CP_Wz.SELECT_KNOWN_PACKS);
        this.CP_q = list;
    }

    @Override
    public void CP_e() {
        this.CP_q = this.CP_l(PacketWrapper::CP_M);
    }

    @Override
    public void CP_J() {
        this.CP_Q(this.CP_q, PacketWrapper::CP_y);
    }

    public void CP_d(CP_JX ilIlJX) {
        this.CP_q = ilIlJX.CP_q;
    }

    public List<CP_r9> CP_R() {
        return this.CP_q;
    }

    public void CP_i(List<CP_r9> list) {
        this.CP_q = list;
    }
}

