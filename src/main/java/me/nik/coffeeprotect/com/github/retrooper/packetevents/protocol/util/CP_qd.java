/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_AT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_rm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_qd
implements NbtCodec<T> {
    final CP_AT CP_C;
    final CP_rm CP_E;
    private static transient /* synthetic */ String cobtUcZCzM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    CP_qd(CP_AT ilIlAT, CP_rm ilIlrm) {
        this.CP_C = ilIlAT;
        this.CP_E = ilIlrm;
    }

    @Override
    public T CP_A(NBT nBT, PacketWrapper<?> packetWrapper) {
        return this.CP_C.CP_A(nBT, packetWrapper);
    }

    @Override
    public NBT CP_UnderScore(PacketWrapper<?> packetWrapper, T t) {
        return this.CP_E.CP_UnderScore(packetWrapper, t);
    }
}

