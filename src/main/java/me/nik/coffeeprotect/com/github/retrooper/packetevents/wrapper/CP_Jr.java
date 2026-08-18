/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class CP_Jr
extends PacketWrapper<CP_Jr> {
    private Component CP_p;
    private static transient /* synthetic */ String OZyskCcRWd = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jr(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jr(Component component) {
        super(CP_Wz.DISCONNECT);
        this.CP_p = component;
    }

    @Override
    public void CP_e() {
        this.CP_p = this.CP_J();
    }

    @Override
    public void CP_J() {
        this.CP_z(this.CP_p);
    }

    public void CP_C(CP_Jr ilIlJr) {
        this.CP_p = ilIlJr.CP_p;
    }

    public Component CP_Q() {
        return this.CP_p;
    }

    public void CP_o(Component component) {
        this.CP_p = component;
    }
}

