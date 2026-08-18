/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagType;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagTypes;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.FloatBinaryTagImpl;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.NumberBinaryTag;

@ApiStatus.NonExtendable
public interface FloatBinaryTag
extends NumberBinaryTag {
    @NotNull
    public static FloatBinaryTag floatBinaryTag(float f) {
        return new FloatBinaryTagImpl(f);
    }

    @Deprecated
    @ApiStatus.ScheduledForRemoval(inVersion="5.0.0")
    @NotNull
    public static FloatBinaryTag of(float f) {
        return new FloatBinaryTagImpl(f);
    }

    @NotNull
    default public BinaryTagType<FloatBinaryTag> type() {
        return BinaryTagTypes.FLOAT;
    }

    public float value();
}

