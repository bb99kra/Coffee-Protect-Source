/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

final class CP_Aa {
    final Component CP_N;
    final int CP_l;
    final int CP_e;
    private static final long a = CP_s.a(-652893656553967439L, -2955602636365285351L, MethodHandles.lookup().lookupClass()).a(102832146286354L);
    private static transient /* synthetic */ String EpPJJGIAkN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_Aa(Component component, int n, int n2) {
        long l = a ^ 0x4C7F0B32A2FBL;
        PacketWrapper[] packetWrapperArray = CP_Cg.CP_v();
        this.CP_N = component;
        this.CP_l = n;
        this.CP_e = n2;
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        if (PacketWrapper.CP_z() == null) {
            CP_Cg.CP_c(new PacketWrapper[5]);
        }
    }
}

