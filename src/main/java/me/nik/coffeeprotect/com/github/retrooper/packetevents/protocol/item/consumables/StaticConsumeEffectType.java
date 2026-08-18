/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.consumables;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.consumables.CP_Lr;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.consumables.CP_n8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_T2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticConsumeEffectType<T extends CP_Lr<?>>
extends CP_T2
implements CP_n8<T> {
    private final CP_Q9<T> reader;
    private final CP_Ow<T> writer;
    private static final long a = CP_s.a(3426103506160255431L, -1405348908786178063L, MethodHandles.lookup().lookupClass()).a(179164267160259L);
    private static transient /* synthetic */ String bOyIUPxKFx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticConsumeEffectType(@Nullable TypesBuilderData typesBuilderData, CP_Q9<T> ilIlQ9, CP_Ow<T> ilIlOw) {
        long l = a ^ 0x3A5E08E14BA8L;
        super(typesBuilderData);
        this.reader = ilIlQ9;
        this.writer = ilIlOw;
        int[] nArray = CP_Lr.CP_a();
        if (nArray != null) {
            PacketWrapper.CP_e(new int[2]);
        }
    }

    @Override
    public T read(PacketWrapper<?> packetWrapper) {
        return (T)((CP_Lr)this.reader.apply(packetWrapper));
    }

    @Override
    public void write(PacketWrapper<?> packetWrapper, T t) {
        this.writer.accept(packetWrapper, t);
    }
}

