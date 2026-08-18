/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_nk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_y5 {
    private final int CP_U;
    private final int CP_Q;
    private final boolean CP_G;
    private final boolean CP_m;
    private final boolean CP_H;
    @Nullable
    private final CP_y5 CP_UnderScore;
    private static final long a = CP_s.a(-7755896335743010920L, -3941081215459734231L, MethodHandles.lookup().lookupClass()).a(262459850586981L);
    private static transient /* synthetic */ String laWAAHGwOE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_y5(int n, int n2, boolean bl, boolean bl2, boolean bl3, @Nullable CP_y5 ilIly5) {
        this.CP_U = n;
        this.CP_Q = n2;
        this.CP_G = bl;
        this.CP_m = bl2;
        this.CP_H = bl3;
        this.CP_UnderScore = ilIly5;
    }

    public static CP_y5 CP_D(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x3BE67B49C46EL;
        int n = packetWrapper.CP_f();
        String string = CP_nk.CP_Y();
        int n2 = packetWrapper.CP_f();
        boolean bl = packetWrapper.CP_K();
        boolean bl2 = packetWrapper.CP_K();
        boolean bl3 = packetWrapper.CP_K();
        CP_y5 ilIly5 = (CP_y5)packetWrapper.CP_N(CP_y5::CP_D);
        CP_y5 ilIly52 = new CP_y5(n, n2, bl, bl2, bl3, ilIly5);
        if (string == null) {
            PacketWrapper.CP_e(new int[2]);
        }
        return ilIly52;
    }

    public static void CP_r(PacketWrapper<?> packetWrapper, CP_y5 ilIly5) {
        long l = a ^ 0x5D0099C90294L;
        packetWrapper.CP_J(ilIly5.CP_U);
        String string = CP_nk.CP_Y();
        packetWrapper.CP_J(ilIly5.CP_Q);
        packetWrapper.CP_a(ilIly5.CP_G);
        String string2 = string;
        packetWrapper.CP_a(ilIly5.CP_m);
        packetWrapper.CP_a(ilIly5.CP_H);
        packetWrapper.CP_I(ilIly5.CP_UnderScore, CP_y5::CP_r);
        if (PacketWrapper.CP_z() == null) {
            CP_nk.CP_Z("At4prc");
        }
    }
}

