/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import java.util.ArrayList;
import java.util.List;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagType;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTagTypes;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.ListBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.ListBinaryTagImpl;

final class ListTagBuilder<T extends BinaryTag>
implements ListBinaryTag.Builder<T> {
    private static final int DEFAULT_CAPACITY = -1;
    @Nullable
    private List<BinaryTag> tags;
    private final boolean permitsHeterogeneity;
    private BinaryTagType<? extends BinaryTag> elementType;
    private final int initialCapacity;
    private static transient /* synthetic */ String WTrgEIMjCz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    ListTagBuilder(boolean bl) {
        this(bl, BinaryTagTypes.END);
    }

    ListTagBuilder(boolean bl, int n) {
        this(bl, BinaryTagTypes.END, n);
    }

    ListTagBuilder(boolean bl, BinaryTagType<? extends BinaryTag> binaryTagType) {
        this(bl, binaryTagType, -1);
    }

    ListTagBuilder(boolean bl, BinaryTagType<? extends BinaryTag> binaryTagType, int n) {
        this.permitsHeterogeneity = bl;
        this.elementType = binaryTagType;
        this.initialCapacity = n;
    }

    @Override
    public @NotNull ListBinaryTag.Builder<T> add(BinaryTag binaryTag) {
        this.elementType = ListBinaryTagImpl.validateTagType(binaryTag, this.elementType, this.permitsHeterogeneity);
        if (this.tags == null) {
            if (this.initialCapacity != -1) {
                if (this.initialCapacity < 0) {
                    throw new IllegalArgumentException("initialCapacity cannot be less than 0, was " + this.initialCapacity);
                }
                this.tags = new ArrayList<BinaryTag>(this.initialCapacity);
            } else {
                this.tags = new ArrayList<BinaryTag>();
            }
        }
        this.tags.add(binaryTag);
        return this;
    }

    @Override
    public @NotNull ListBinaryTag.Builder<T> add(Iterable<? extends T> iterable) {
        for (BinaryTag binaryTag : iterable) {
            this.add(binaryTag);
        }
        return this;
    }

    @Override
    @NotNull
    public ListBinaryTag build() {
        if (this.tags == null) {
            return ListBinaryTag.empty();
        }
        return new ListBinaryTagImpl(this.elementType, this.permitsHeterogeneity, new ArrayList<BinaryTag>(this.tags));
    }
}

