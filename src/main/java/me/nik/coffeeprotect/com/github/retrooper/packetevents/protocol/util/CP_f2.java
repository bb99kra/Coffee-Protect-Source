/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.util.ArrayList;
import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_yZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_f2<T> {
    private final List<CP_yZ<T>> CP_L;
    private static transient /* synthetic */ String vliEUXQGkg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_f2() {
        this(new ArrayList<CP_yZ<T>>());
    }

    public CP_f2(List<CP_yZ<T>> list) {
        this.CP_L = list;
    }

    public static <T> CP_f2<T> CP_I(PacketWrapper<?> packetWrapper, CP_Q9<T> ilIlQ9) {
        List<CP_yZ<T>> list = packetWrapper.CP_l(packetWrapper2 -> CP_yZ.CP_Z(packetWrapper, ilIlQ9));
        return new CP_f2<T>(list);
    }

    public static <T> void CP_w(PacketWrapper<?> packetWrapper2, CP_f2<T> ilIlf2, CP_Ow<T> ilIlOw) {
        packetWrapper2.CP_Q(ilIlf2.CP_L, (packetWrapper, ilIlyZ) -> CP_yZ.CP_t(packetWrapper, ilIlyZ, ilIlOw));
    }

    public List<CP_yZ<T>> CP_N() {
        return this.CP_L;
    }
}

