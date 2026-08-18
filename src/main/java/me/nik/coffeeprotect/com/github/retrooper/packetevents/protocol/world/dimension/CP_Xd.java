/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_nq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_x;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_Ou;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class CP_Xd
implements CP_x {
    private final int CP_a;
    private static transient /* synthetic */ String FjsNDYmutJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Xd(int n) {
        this.CP_a = n;
    }

    @Override
    public CP_nq CP_T(CP_Ou<CP_nq> ilIlOu, PacketWrapper<?> packetWrapper) {
        ClientVersion clientVersion = packetWrapper.CP_w().CP_E();
        return ilIlOu.CP_A(clientVersion, this.CP_a);
    }

    @Override
    public int CP_D() {
        return this.CP_a;
    }
}

