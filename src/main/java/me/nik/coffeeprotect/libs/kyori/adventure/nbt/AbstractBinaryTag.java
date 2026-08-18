/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTag;
import me.nik.coffeeprotect.libs.kyori.examination.string.StringExaminer;

abstract class AbstractBinaryTag
implements BinaryTag {
    AbstractBinaryTag() {
    }

    @Override
    @NotNull
    public final String examinableName() {
        return this.type().toString();
    }

    public final String toString() {
        return this.examine(StringExaminer.simpleEscaping());
    }
}

