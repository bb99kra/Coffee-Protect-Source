/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.CompoundBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.CompoundBinaryTagImpl;

final class CompoundTagBuilder
implements CompoundBinaryTag.Builder {
    private static final int DEFAULT_CAPACITY = -1;
    @Nullable
    private Map<String, BinaryTag> tags;
    private final int initialCapacity;
    private static transient /* synthetic */ String qkEgRXhltb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CompoundTagBuilder() {
        this(-1);
    }

    CompoundTagBuilder(int n) {
        this.initialCapacity = n;
    }

    private Map<String, BinaryTag> tags() {
        if (this.tags == null) {
            if (this.initialCapacity != -1) {
                if (this.initialCapacity < 0) {
                    throw new IllegalArgumentException("initialCapacity cannot be less than 0, was " + this.initialCapacity);
                }
                this.tags = new HashMap<String, BinaryTag>(this.initialCapacity);
            } else {
                this.tags = new HashMap<String, BinaryTag>();
            }
        }
        return this.tags;
    }

    @Override
    public @NotNull CompoundBinaryTag.Builder put(@NotNull String string, @NotNull BinaryTag binaryTag) {
        this.tags().put(string, binaryTag);
        return this;
    }

    @Override
    public @NotNull CompoundBinaryTag.Builder put(@NotNull CompoundBinaryTag compoundBinaryTag) {
        Map<String, BinaryTag> map = this.tags();
        for (String string : compoundBinaryTag.keySet()) {
            map.put(string, compoundBinaryTag.get(string));
        }
        return this;
    }

    @Override
    public @NotNull CompoundBinaryTag.Builder put(@NotNull Map<String, ? extends BinaryTag> map) {
        this.tags().putAll(map);
        return this;
    }

    @Override
    public @NotNull CompoundBinaryTag.Builder remove(@NotNull String string, @Nullable Consumer<? super BinaryTag> consumer) {
        if (this.tags != null) {
            BinaryTag binaryTag = this.tags.remove(string);
            if (consumer != null) {
                consumer.accept(binaryTag);
            }
        }
        return this;
    }

    @Override
    @NotNull
    public CompoundBinaryTag build() {
        if (this.tags == null) {
            return CompoundBinaryTag.empty();
        }
        return new CompoundBinaryTagImpl(new HashMap<String, BinaryTag>(this.tags));
    }
}

