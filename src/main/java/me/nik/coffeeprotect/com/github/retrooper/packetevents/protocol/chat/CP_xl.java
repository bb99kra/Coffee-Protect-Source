/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_jA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xw;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class CP_xl
extends CP_xw {
    private UUID CP_q;
    private static transient /* synthetic */ String YtcTWSwwMt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_xl(Component component, CP_jA ilIljA, UUID uUID) {
        super(component, ilIljA);
        this.CP_q = uUID;
    }

    public UUID CP_l() {
        return this.CP_q;
    }

    public void CP_l(UUID uUID) {
        this.CP_q = uUID;
    }
}

