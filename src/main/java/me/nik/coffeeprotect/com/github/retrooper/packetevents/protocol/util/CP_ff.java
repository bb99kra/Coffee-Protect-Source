/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.util.function.Function;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_ff
implements NbtCodec<Z> {
    final Function CP_B;
    final Function CP_J;
    final NbtCodec CP_X;
    private static transient /* synthetic */ String ainrwvOxMQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    CP_ff(NbtCodec nbtCodec, Function function, Function function2) {
        this.CP_X = nbtCodec;
        this.CP_B = function;
        this.CP_J = function2;
    }

    @Override
    public Z CP_A(NBT nBT, PacketWrapper<?> packetWrapper) {
        return this.CP_B.apply(this.CP_X.CP_A(nBT, packetWrapper));
    }

    @Override
    public NBT CP_UnderScore(PacketWrapper<?> packetWrapper, Z z) {
        return this.CP_X.CP_UnderScore(packetWrapper, this.CP_J.apply(z));
    }
}

