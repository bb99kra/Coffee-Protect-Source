/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_be
extends PacketWrapper<CP_be> {
    private int CP_F;
    private static transient /* synthetic */ String PcoUYYsGhC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_be(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_be(int n) {
        super(CP_AG.ACKNOWLEDGE_BLOCK_CHANGES);
        this.CP_F = n;
    }

    @Override
    public void CP_e() {
        this.CP_F = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_F);
    }

    public void CP_C(CP_be ilIlbe) {
        this.CP_F = ilIlbe.CP_F;
    }

    public int CP_v() {
        return this.CP_F;
    }

    public void CP_F(int n) {
        this.CP_F = n;
    }
}

