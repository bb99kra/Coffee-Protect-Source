/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.util.function.Supplier;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_OU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_ns
implements CP_OU<T> {
    final Supplier CP_D;
    private static transient /* synthetic */ String HqUEeTQNIP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    CP_ns(Supplier supplier) {
        this.CP_D = supplier;
    }

    @Override
    public T CP_j(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws CP_Xv {
        return this.CP_D.get();
    }

    @Override
    public void CP_r(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, T t) throws CP_Xv {
    }
}

