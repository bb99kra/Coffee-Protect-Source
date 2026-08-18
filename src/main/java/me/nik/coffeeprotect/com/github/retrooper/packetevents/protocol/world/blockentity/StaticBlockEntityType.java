/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_T2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity.CP_CL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticBlockEntityType
extends CP_T2
implements CP_CL {
    private static String CP_K;
    private static transient /* synthetic */ String BlQmZCWUZp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticBlockEntityType(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    public static void CP_Q(String string) {
        CP_K = string;
    }

    public static String CP_v() {
        return CP_K;
    }

    static {
        if (StaticBlockEntityType.CP_v() == null) {
            StaticBlockEntityType.CP_Q("wYoQlb");
        }
    }
}

