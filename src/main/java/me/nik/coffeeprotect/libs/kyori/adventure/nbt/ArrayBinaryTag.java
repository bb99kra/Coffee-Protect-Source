/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagType;

@ApiStatus.NonExtendable
public interface ArrayBinaryTag
extends BinaryTag {
    @NotNull
    public BinaryTagType<? extends ArrayBinaryTag> type();
}

