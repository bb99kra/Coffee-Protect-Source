/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class CP_bO
extends PacketWrapper<CP_bO> {
    private Component CP_L;
    private static transient /* synthetic */ String RlWiIzfAiR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bO(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bO(Component component) {
        super(CP_AG.ACTION_BAR);
        this.CP_L = component;
    }

    @Override
    public void CP_e() {
        this.CP_L = this.CP_J();
    }

    @Override
    public void CP_J() {
        this.CP_z(this.CP_L);
    }

    public void CP_o(CP_bO ilIlbO) {
        this.CP_L = ilIlbO.CP_L;
    }

    public Component CP_H() {
        return this.CP_L;
    }

    public void CP_q(Component component) {
        this.CP_L = component;
    }
}

