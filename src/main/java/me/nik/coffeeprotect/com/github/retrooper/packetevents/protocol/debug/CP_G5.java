/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_G5 {
    private final CP_An CP_T;
    private static transient /* synthetic */ String yXJbvwXJso = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_G5(CP_An ilIlAn) {
        this.CP_T = ilIlAn;
    }

    public static CP_G5 CP_G(PacketWrapper<?> packetWrapper) {
        CP_An ilIlAn = packetWrapper.CP_E();
        return new CP_G5(ilIlAn);
    }

    public static void CP_G(PacketWrapper<?> packetWrapper, CP_G5 ilIlG5) {
        packetWrapper.CP_h(ilIlG5.CP_T);
    }

    public CP_An CP_Z() {
        return this.CP_T;
    }
}

