/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_CR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_CV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_XH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_h7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_nq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_QF
implements CP_XH {
    private static final long a = CP_s.a(4504168402860348053L, -9150263788789232279L, MethodHandles.lookup().lookupClass()).a(160616214581364L);
    private static transient /* synthetic */ String iYYWhLlXzz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public CP_CV[] CP_Z(CP_nq ilIlnq, BitSet bitSet, BitSet bitSet2, boolean bl, boolean bl2, boolean bl3, int n, int n2, PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x496140DD4094L;
        CP_CV[] ilIlCVArray = new CP_CV[n];
        boolean bl4 = CP_CR.CP_f();
        for (int i = 0; i < ilIlCVArray.length; ++i) {
            if (!bitSet.get(i)) continue;
            ilIlCVArray[i] = CP_h7.CP_H(packetWrapper, bl2, bl3);
            if (!bl4) continue;
        }
        return ilIlCVArray;
    }
}

