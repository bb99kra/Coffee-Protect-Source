/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_C2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_Cw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_Zt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class CP_GX<T> {
    private final CP_C2<T> CP_U;
    private final T CP_d;
    private static final long a = CP_s.a(7489971849158798752L, -2871423446667178808L, MethodHandles.lookup().lookupClass()).a(12537703043571L);
    private static transient /* synthetic */ String tPRMGnMGGW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_GX(CP_C2<T> ilIlC2, T t) {
        this.CP_U = ilIlC2;
        this.CP_d = t;
    }

    public static CP_GX<?> CP_t(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x403D5777D68FL;
        CP_C2<?> ilIlC2 = packetWrapper.CP_t(CP_Zt.CP_p());
        int n = CP_Cw.CP_O();
        Object obj = ilIlC2.read(packetWrapper);
        CP_GX ilIlGX = new CP_GX(ilIlC2, obj);
        if (PacketWrapper.CP_z() == null) {
            CP_Cw.CP_x(++n);
        }
        return ilIlGX;
    }

    public static <T> void CP_o(PacketWrapper<?> packetWrapper, CP_GX<T> ilIlGX) {
        packetWrapper.CP_e(ilIlGX.CP_U);
        ilIlGX.CP_U.write(packetWrapper, ilIlGX.CP_d);
    }

    public CP_C2<T> CP_c() {
        return this.CP_U;
    }

    public T CP_c() {
        return this.CP_d;
    }
}

