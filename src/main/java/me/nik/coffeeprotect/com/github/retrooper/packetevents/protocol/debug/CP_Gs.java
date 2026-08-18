/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_na;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_Gs {
    private final CP_na CP_Y;
    private static transient /* synthetic */ String QcQwhAmKVf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Gs(CP_na ilIlna) {
        this.CP_Y = ilIlna;
    }

    public static CP_Gs CP_Q(PacketWrapper<?> packetWrapper) {
        CP_na ilIlna = (CP_na)packetWrapper.CP_H(CP_na.values());
        return new CP_Gs(ilIlna);
    }

    public static void CP_u(PacketWrapper<?> packetWrapper, CP_Gs ilIlGs) {
        packetWrapper.CP_w(ilIlGs.CP_Y);
    }

    public CP_na CP_A() {
        return this.CP_Y;
    }
}

