/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bH
extends PacketWrapper<CP_bH> {
    private int CP_J;
    private static transient /* synthetic */ String dbZPspJPgc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bH(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bH(int n) {
        super(CP_AG.CHUNK_BATCH_END);
        this.CP_J = n;
    }

    @Override
    public void CP_e() {
        this.CP_J = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_J);
    }

    public void CP_A(CP_bH ilIlbH) {
        this.CP_J = ilIlbH.CP_J;
    }

    public int CP_x() {
        return this.CP_J;
    }

    public void CP_s(int n) {
        this.CP_J = n;
    }
}

