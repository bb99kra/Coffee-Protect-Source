/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagType;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagTypes;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.ByteBinaryTagImpl;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.NumberBinaryTag;

@ApiStatus.NonExtendable
public interface ByteBinaryTag
extends NumberBinaryTag {
    public static final ByteBinaryTag ZERO = new ByteBinaryTagImpl(0);
    public static final ByteBinaryTag ONE = new ByteBinaryTagImpl(1);

    @NotNull
    public static ByteBinaryTag byteBinaryTag(byte by) {
        if (by == 0) {
            return ZERO;
        }
        if (by == 1) {
            return ONE;
        }
        return new ByteBinaryTagImpl(by);
    }

    @Deprecated
    @ApiStatus.ScheduledForRemoval(inVersion="5.0.0")
    @NotNull
    public static ByteBinaryTag of(byte by) {
        return ByteBinaryTag.byteBinaryTag(by);
    }

    @NotNull
    default public BinaryTagType<ByteBinaryTag> type() {
        return BinaryTagTypes.BYTE;
    }

    public byte value();
}

