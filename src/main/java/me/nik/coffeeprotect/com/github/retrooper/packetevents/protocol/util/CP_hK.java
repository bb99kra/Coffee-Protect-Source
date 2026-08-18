/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_AT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_hK
implements NbtCodec<T> {
    final CP_AT CP_T;
    final NbtCodec CP_I;
    private static transient /* synthetic */ String lHncZfzAXX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    CP_hK(NbtCodec nbtCodec, CP_AT ilIlAT) {
        this.CP_I = nbtCodec;
        this.CP_T = ilIlAT;
    }

    @Override
    public T CP_A(NBT nBT, PacketWrapper<?> packetWrapper) throws CP_Xv {
        try {
            return this.CP_I.CP_A(nBT, packetWrapper);
        }
        catch (CP_Xv ilIlXv) {
            try {
                return this.CP_T.CP_A(nBT, packetWrapper);
            }
            catch (CP_Xv ilIlXv2) {
                ilIlXv.addSuppressed(ilIlXv2);
                throw ilIlXv;
            }
        }
    }

    @Override
    public NBT CP_UnderScore(PacketWrapper<?> packetWrapper, T t) throws CP_Xv {
        return this.CP_I.CP_UnderScore(packetWrapper, t);
    }
}

