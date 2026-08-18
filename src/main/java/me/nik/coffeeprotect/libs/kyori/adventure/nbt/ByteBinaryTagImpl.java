/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import java.util.stream.Stream;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Debug;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.AbstractBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.ByteBinaryTag;
import me.nik.coffeeprotect.libs.kyori.examination.ExaminableProperty;

@Debug.Renderer(text="\"0x\" + Integer.toString(this.value, 16)", hasChildren="false")
final class ByteBinaryTagImpl
extends AbstractBinaryTag
implements ByteBinaryTag {
    private final byte value;
    private static transient /* synthetic */ String dINAuncMHB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    ByteBinaryTagImpl(byte by) {
        this.value = by;
    }

    @Override
    public byte value() {
        return this.value;
    }

    @Override
    public byte byteValue() {
        return this.value;
    }

    @Override
    public double doubleValue() {
        return this.value;
    }

    @Override
    public float floatValue() {
        return this.value;
    }

    @Override
    public int intValue() {
        return this.value;
    }

    @Override
    public long longValue() {
        return this.value;
    }

    @Override
    public short shortValue() {
        return this.value;
    }

    @Override
    @NotNull
    public Number numberValue() {
        return this.value;
    }

    public boolean equals(@Nullable Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        ByteBinaryTagImpl byteBinaryTagImpl = (ByteBinaryTagImpl)object;
        return this.value == byteBinaryTagImpl.value;
    }

    public int hashCode() {
        return Byte.hashCode(this.value);
    }

    @Override
    @NotNull
    public Stream<? extends ExaminableProperty> examinableProperties() {
        return Stream.of(ExaminableProperty.of("value", this.value));
    }
}

