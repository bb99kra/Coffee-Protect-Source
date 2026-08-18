/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.rabbit;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.rabbit.CP_jQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_T2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticRabbitVariant
extends CP_T2
implements CP_jQ {
    private static PacketWrapper[] CP_Y;
    private static transient /* synthetic */ String EJwkrPKeFA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticRabbitVariant(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    public static void CP_p(PacketWrapper[] packetWrapperArray) {
        CP_Y = packetWrapperArray;
    }

    public static PacketWrapper[] CP_X() {
        return CP_Y;
    }

    static {
        if (StaticRabbitVariant.CP_X() != null) {
            StaticRabbitVariant.CP_p(new PacketWrapper[3]);
        }
    }
}

