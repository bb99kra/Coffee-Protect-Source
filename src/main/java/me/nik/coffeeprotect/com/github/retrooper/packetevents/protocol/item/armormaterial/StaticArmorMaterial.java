/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.armormaterial;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.armormaterial.CP_A2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_T2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticArmorMaterial
extends CP_T2
implements CP_A2 {
    private static String[] CP_q;
    private static transient /* synthetic */ String bBmbygqRjS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticArmorMaterial(@Nullable TypesBuilderData typesBuilderData) {
        super(typesBuilderData);
    }

    public static void CP_U(String[] stringArray) {
        CP_q = stringArray;
    }

    public static String[] CP_o() {
        return CP_q;
    }

    static {
        if (StaticArmorMaterial.CP_o() != null) {
            StaticArmorMaterial.CP_U(new String[5]);
        }
    }
}

