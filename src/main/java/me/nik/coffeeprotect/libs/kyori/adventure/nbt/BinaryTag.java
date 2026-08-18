/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagLike;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagType;
import me.nik.coffeeprotect.libs.kyori.examination.Examinable;

@ApiStatus.NonExtendable
public interface BinaryTag
extends BinaryTagLike,
Examinable {
    @NotNull
    public BinaryTagType<? extends BinaryTag> type();

    @Override
    @NotNull
    default public BinaryTag asBinaryTag() {
        return this;
    }
}

