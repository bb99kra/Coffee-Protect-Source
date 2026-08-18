/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_ZA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

@Deprecated
public class CP_QK
implements CP_ZA {
    private final int CP_UnderScore;
    private static transient /* synthetic */ String zqNtiRxJQU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_QK(ClientVersion clientVersion, int n) {
        this(n);
    }

    public CP_QK(int n) {
        this.CP_UnderScore = n;
    }

    public static CP_QK CP_C(ClientVersion clientVersion, int n) {
        return new CP_QK(clientVersion, n);
    }

    public static CP_QK CP_D(PacketWrapper<?> packetWrapper) {
        return packetWrapper.CP_A(CP_QK::new);
    }

    public static void CP_j(PacketWrapper<?> packetWrapper, CP_QK ilIlQK) {
        packetWrapper.CP_e(ilIlQK);
    }

    @Override
    public int getId() {
        return this.CP_UnderScore;
    }

    @Override
    public ResourceLocation getName() {
        throw new UnsupportedOperationException();
    }
}

