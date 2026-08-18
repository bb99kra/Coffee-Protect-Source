/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bw
extends PacketWrapper<CP_bw> {
    private UUID CP_A;
    private static transient /* synthetic */ String FgNntTblxp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bw(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bw(UUID uUID) {
        super(CP_nN.SPECTATE);
        this.CP_A = uUID;
    }

    @Override
    public void CP_e() {
        this.CP_A = this.CP_v();
    }

    @Override
    public void CP_J() {
        this.CP_c(this.CP_A);
    }

    public void CP_u(CP_bw ilIlbw) {
        this.CP_A = ilIlbw.CP_A;
    }

    public UUID CP_q() {
        return this.CP_A;
    }

    public void CP_D(UUID uUID) {
        this.CP_A = uUID;
    }
}

