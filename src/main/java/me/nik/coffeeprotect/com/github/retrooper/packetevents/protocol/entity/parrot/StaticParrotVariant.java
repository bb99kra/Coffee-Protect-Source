/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.parrot;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.parrot.CP_Le;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_T2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticParrotVariant
extends CP_T2
implements CP_Le {
    private static boolean CP_b;
    private static transient /* synthetic */ String AAmNrjIWBl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticParrotVariant(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    public static void CP_r(boolean bl) {
        CP_b = bl;
    }

    public static boolean CP_Y() {
        return CP_b;
    }

    public static boolean CP_U() {
        boolean bl = StaticParrotVariant.CP_Y();
        return !bl;
    }

    static {
        if (!StaticParrotVariant.CP_U()) {
            StaticParrotVariant.CP_r(true);
        }
    }
}

