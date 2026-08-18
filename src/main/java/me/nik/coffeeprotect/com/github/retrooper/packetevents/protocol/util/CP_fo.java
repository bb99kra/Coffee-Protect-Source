/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTFloat;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_fo
implements NbtCodec<Float> {
    private static transient /* synthetic */ String UlUkmnFqaq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_fo() {
    }

    public Float CP_y(NBT nBT, PacketWrapper<?> packetWrapper) {
        return Float.valueOf(nBT.CP_S(NBTNumber.class).getAsFloat());
    }

    public NBT CP_I(PacketWrapper<?> packetWrapper, Float f) {
        return new NBTFloat(f.floatValue());
    }
}

