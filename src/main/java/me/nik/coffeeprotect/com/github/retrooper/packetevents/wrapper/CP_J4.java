/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.HashSet;
import java.util.Set;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_J4
extends PacketWrapper<CP_J4> {
    private Set<ResourceLocation> CP_a;
    private static transient /* synthetic */ String BmjTuYoBts = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J4(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_J4(Set<ResourceLocation> set) {
        super(CP_Wz.UPDATE_ENABLED_FEATURES);
        this.CP_a = set;
    }

    @Override
    public void CP_e() {
        this.CP_a = this.CP_q(HashSet::new, PacketWrapper::readIdentifier);
    }

    @Override
    public void CP_J() {
        this.CP_l(this.CP_a, PacketWrapper::writeIdentifier);
    }

    public void CP_J(CP_J4 ilIlJ4) {
        this.CP_a = ilIlJ4.CP_a;
    }

    public Set<ResourceLocation> CP_C() {
        return this.CP_a;
    }

    public void CP_n(Set<ResourceLocation> set) {
        this.CP_a = set;
    }
}

