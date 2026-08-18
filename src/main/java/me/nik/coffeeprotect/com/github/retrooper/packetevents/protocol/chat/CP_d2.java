/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_O8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_d2 {
    public static final CP_d2 CP_c;
    public static final CP_d2 CP_t;
    private final BitSet CP_V;
    private final CP_O8 CP_O;
    private static final long a;
    private static transient /* synthetic */ String SPhfaiThKP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_d2(BitSet bitSet, CP_O8 ilIlO8) {
        this.CP_O = ilIlO8;
        this.CP_V = bitSet;
    }

    public CP_d2(BitSet bitSet) {
        long l = a ^ 0x752560025E94L;
        boolean bl = CP_O8.CP_T();
        boolean bl2 = bl;
        this.CP_O = CP_O8.PARTIALLY_FILTERED;
        this.CP_V = bitSet;
        if (bl2) {
            PacketWrapper.CP_e(new int[1]);
        }
    }

    public BitSet CP_B() {
        return this.CP_V;
    }

    public CP_O8 CP_G() {
        return this.CP_O;
    }

    static {
        a = CP_s.a(-7941790534498726964L, 1999305549351198440L, MethodHandles.lookup().lookupClass()).a(96204285528688L);
        CP_c = new CP_d2(new BitSet(0), CP_O8.FULLY_FILTERED);
        CP_t = new CP_d2(new BitSet(0), CP_O8.PASS_THROUGH);
    }
}

