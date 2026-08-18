/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bv
extends PacketWrapper<CP_bv> {
    private static transient /* synthetic */ String ShntNyEiRa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bv(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bv() {
        super(CP_AG.CHUNK_BATCH_BEGIN);
    }
}

