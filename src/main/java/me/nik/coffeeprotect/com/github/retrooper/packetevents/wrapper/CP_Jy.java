/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Jy
extends PacketWrapper<CP_Jy> {
    private ResourceLocation CP_w;
    private static transient /* synthetic */ String JhpNuhqzzs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jy(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jy(ResourceLocation resourceLocation) {
        super(CP_Wz.COOKIE_REQUEST);
        this.CP_w = resourceLocation;
    }

    @Override
    public void CP_e() {
        this.CP_w = this.readIdentifier();
    }

    @Override
    public void CP_J() {
        this.writeIdentifier(this.CP_w);
    }

    public void CP_N(CP_Jy ilIlJy) {
        this.CP_w = ilIlJy.CP_w;
    }

    public ResourceLocation CP_J() {
        return this.CP_w;
    }

    public void CP_Z(ResourceLocation resourceLocation) {
        this.CP_w = resourceLocation;
    }
}

