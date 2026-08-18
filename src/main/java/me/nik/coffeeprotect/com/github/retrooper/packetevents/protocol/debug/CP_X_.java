/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_X_ {
    private final List<CP_An> CP_I;
    private static transient /* synthetic */ String UjyRUXjNLW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_X_(List<CP_An> list) {
        this.CP_I = list;
    }

    public static CP_X_ CP_h(PacketWrapper<?> packetWrapper) {
        List<CP_An> list = packetWrapper.CP_l(PacketWrapper::CP_E);
        return new CP_X_(list);
    }

    public static void CP_N(PacketWrapper<?> packetWrapper, CP_X_ ilIlX_) {
        packetWrapper.CP_Q(ilIlX_.CP_I, PacketWrapper::CP_h);
    }

    public List<CP_An> CP_N() {
        return this.CP_I;
    }
}

