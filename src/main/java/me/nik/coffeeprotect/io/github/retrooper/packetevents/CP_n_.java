/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_C3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_C8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_rO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.CP_AR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_CG;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_CY;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_fr;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_y3;

public class CP_n_ {
    private static CP_C8<CP_CY> CP_X;
    private static String CP_s;
    private static final long a;
    private static transient /* synthetic */ String voeHiYOgHw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public static void CP_S() {
        CP_X = null;
    }

    public static CP_C8<CP_CY> CP_r(CP_CY ilIlCY, CP_C3 ilIlC3, CP_AR ilIlAR, CP_fr ilIlfr, CP_y3 ilIly3) {
        long l = a ^ 0x59BE35CA5EEFL;
        String string = CP_n_.CP_k();
        CP_C8<CP_CY> ilIlC8 = CP_X;
        if (string == null) {
            if (ilIlC8 == null) {
                CP_X = CP_n_.CP_l(ilIlCY, ilIlC3, ilIlAR, ilIlfr, ilIly3);
            }
            ilIlC8 = CP_X;
        }
        return ilIlC8;
    }

    public static CP_C8<CP_CY> CP_w(CP_CY ilIlCY, CP_C3 ilIlC3, CP_AR ilIlAR, CP_fr ilIlfr, CP_y3 ilIly3, CP_rO ilIlrO) {
        long l = a ^ 0x39DE1C0F4C17L;
        String string = CP_n_.CP_k();
        CP_C8<CP_CY> ilIlC8 = CP_X;
        if (string == null) {
            if (ilIlC8 == null) {
                CP_X = CP_n_.CP_X(ilIlCY, ilIlC3, ilIlAR, ilIlfr, ilIly3, ilIlrO);
            }
            ilIlC8 = CP_X;
        }
        return ilIlC8;
    }

    public static CP_C8<CP_CY> CP_l(CP_CY ilIlCY, CP_C3 ilIlC3, CP_AR ilIlAR, CP_fr ilIlfr, CP_y3 ilIly3) {
        return CP_n_.CP_X(ilIlCY, ilIlC3, ilIlAR, ilIlfr, ilIly3, new CP_rO());
    }

    public static CP_C8<CP_CY> CP_X(CP_CY ilIlCY, CP_C3 ilIlC3, CP_AR ilIlAR, CP_fr ilIlfr, CP_y3 ilIly3, CP_rO ilIlrO) {
        long l = a ^ 0x1A3048FC0199L;
        String string = CP_n_.CP_k();
        CP_CG ilIlCG = new CP_CG(ilIlrO, ilIlCY, ilIlC3, ilIlAR, ilIlfr, ilIly3);
        if (PacketWrapper.CP_z() == null) {
            CP_n_.CP_N("juHLrc");
        }
        return ilIlCG;
    }

    public static void CP_N(String string) {
        CP_s = string;
    }

    public static String CP_k() {
        return CP_s;
    }

    static {
        a = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(4770495036981164488L, 6397531853439609816L, MethodHandles.lookup().lookupClass()).a(141848321757315L);
        if (CP_n_.CP_k() != null) {
            CP_n_.CP_N("x3avnb");
        }
    }
}

