/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagType;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagTypes;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.EndBinaryTagImpl;

@ApiStatus.NonExtendable
public interface EndBinaryTag
extends BinaryTag {
    @NotNull
    public static EndBinaryTag endBinaryTag() {
        return EndBinaryTagImpl.INSTANCE;
    }

    @Deprecated
    @ApiStatus.ScheduledForRemoval(inVersion="5.0.0")
    @NotNull
    public static EndBinaryTag get() {
        return EndBinaryTagImpl.INSTANCE;
    }

    @NotNull
    default public BinaryTagType<EndBinaryTag> type() {
        return BinaryTagTypes.END;
    }
}

