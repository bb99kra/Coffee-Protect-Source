/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_C2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_Zt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.Nullable;

public final class CP_Cw<T> {
    private final CP_C2<T> CP_p;
    private final @Nullable T CP_J;
    private static int CP_E;
    private static final long a;
    private static transient /* synthetic */ String GuZbCHQeNx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Cw(CP_C2<T> ilIlC2, @Nullable T t) {
        this.CP_p = ilIlC2;
        this.CP_J = t;
    }

    public static CP_Cw<?> CP_Z(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x25EFC4280DB5L;
        CP_C2<?> ilIlC2 = packetWrapper.CP_t(CP_Zt.CP_p());
        Object r = packetWrapper.CP_N(ilIlC2::read);
        int n = CP_Cw.CP_O();
        CP_Cw ilIlCw = new CP_Cw(ilIlC2, r);
        if (n != 0) {
            PacketWrapper.CP_e(new int[4]);
        }
        return ilIlCw;
    }

    public static <T> void CP_s(PacketWrapper<?> packetWrapper, CP_Cw<T> ilIlCw) {
        packetWrapper.CP_e(ilIlCw.CP_p);
        packetWrapper.CP_I(ilIlCw.CP_J, ilIlCw.CP_p::write);
    }

    public CP_C2<T> CP_S() {
        return this.CP_p;
    }

    public @Nullable T CP_h() {
        return this.CP_J;
    }

    public static void CP_x(int n) {
        CP_E = n;
    }

    public static int CP_c() {
        return CP_E;
    }

    public static int CP_O() {
        int n = CP_Cw.CP_c();
        if (n == 0) {
            return 72;
        }
        return 0;
    }

    static {
        a = CP_s.a(-8004458934478281660L, -7003518083679740427L, MethodHandles.lookup().lookupClass()).a(85994929643845L);
        if (CP_Cw.CP_c() == 0) {
            CP_Cw.CP_x(7);
        }
    }
}

