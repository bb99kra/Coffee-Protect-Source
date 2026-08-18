/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_n0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Jw
extends PacketWrapper<CP_Jw> {
    private ResourceLocation CP_v;
    private static transient /* synthetic */ String EfNhBhXUze = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jw(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jw(ResourceLocation resourceLocation) {
        super(CP_n0.COOKIE_REQUEST);
        this.CP_v = resourceLocation;
    }

    @Override
    public void CP_e() {
        this.CP_v = this.readIdentifier();
    }

    @Override
    public void CP_J() {
        this.writeIdentifier(this.CP_v);
    }

    public void CP_p(CP_Jw ilIlJw) {
        this.CP_v = ilIlJw.CP_v;
    }

    public ResourceLocation CP_y() {
        return this.CP_v;
    }

    public void CP_m(ResourceLocation resourceLocation) {
        this.CP_v = resourceLocation;
    }
}

