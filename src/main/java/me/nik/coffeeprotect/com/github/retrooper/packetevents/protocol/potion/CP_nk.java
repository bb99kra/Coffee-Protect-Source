/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_QL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_Xx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_y5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_nk {
    private final CP_QL CP_Z;
    private final CP_y5 CP_E;
    private static String CP_l;
    private static transient /* synthetic */ String gCGMQzqULc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_nk(CP_QL ilIlQL, int n, int n2, boolean bl, boolean bl2, boolean bl3, @Nullable CP_y5 ilIly5) {
        this(ilIlQL, new CP_y5(n, n2, bl, bl2, bl3, ilIly5));
    }

    public CP_nk(CP_QL ilIlQL, CP_y5 ilIly5) {
        this.CP_Z = ilIlQL;
        this.CP_E = ilIly5;
    }

    public static CP_nk CP_H(PacketWrapper<?> packetWrapper) {
        CP_QL ilIlQL = packetWrapper.CP_A(CP_Xx::CP_S);
        CP_y5 ilIly5 = CP_y5.CP_D(packetWrapper);
        return new CP_nk(ilIlQL, ilIly5);
    }

    public static void CP_R(PacketWrapper<?> packetWrapper, CP_nk ilIlnk) {
        packetWrapper.CP_e(ilIlnk.CP_Z);
        CP_y5.CP_r(packetWrapper, ilIlnk.CP_E);
    }

    public static void CP_Z(String string) {
        CP_l = string;
    }

    public static String CP_Y() {
        return CP_l;
    }

    static {
        if (CP_nk.CP_Y() == null) {
            CP_nk.CP_Z("jzTGlb");
        }
    }
}

