/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_n0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class CP_JQ
extends PacketWrapper<CP_JQ> {
    private Component CP_r;
    private static transient /* synthetic */ String ZQOOlksrTW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JQ(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_JQ(Component component) {
        super(CP_n0.DISCONNECT);
        this.CP_r = component;
    }

    @Override
    public void CP_e() {
        this.CP_r = this.CP_I();
    }

    @Override
    public void CP_J() {
        this.CP_v(this.CP_r);
    }

    public void CP_O(CP_JQ ilIlJQ) {
        this.CP_r = ilIlJQ.CP_r;
    }

    public Component CP_F() {
        return this.CP_r;
    }

    public void CP_n(Component component) {
        this.CP_r = component;
    }
}

