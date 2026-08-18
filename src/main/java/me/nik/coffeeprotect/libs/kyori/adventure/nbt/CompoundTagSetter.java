/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.nbt;

import java.util.Map;
import java.util.function.Consumer;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.BinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.ByteArrayBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.ByteBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.CompoundBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.DoubleBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.FloatBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.IntArrayBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.IntBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.LongArrayBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.LongBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.ShortBinaryTag;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.StringBinaryTag;

@ApiStatus.NonExtendable
public interface CompoundTagSetter<R> {
    @NotNull
    public R put(@NotNull String var1, @NotNull BinaryTag var2);

    @NotNull
    public R put(@NotNull CompoundBinaryTag var1);

    @NotNull
    public R put(@NotNull Map<String, ? extends BinaryTag> var1);

    @NotNull
    default public R remove(@NotNull String string) {
        return this.remove(string, null);
    }

    @NotNull
    public R remove(@NotNull String var1, @Nullable Consumer<? super BinaryTag> var2);

    @NotNull
    default public R putBoolean(@NotNull String string, boolean bl) {
        return this.put(string, bl ? ByteBinaryTag.ONE : ByteBinaryTag.ZERO);
    }

    @NotNull
    default public R putByte(@NotNull String string, byte by) {
        return this.put(string, ByteBinaryTag.byteBinaryTag(by));
    }

    @NotNull
    default public R putShort(@NotNull String string, short s) {
        return this.put(string, ShortBinaryTag.shortBinaryTag(s));
    }

    @NotNull
    default public R putInt(@NotNull String string, int n) {
        return this.put(string, IntBinaryTag.intBinaryTag(n));
    }

    @NotNull
    default public R putLong(@NotNull String string, long l) {
        return this.put(string, LongBinaryTag.longBinaryTag(l));
    }

    @NotNull
    default public R putFloat(@NotNull String string, float f) {
        return this.put(string, FloatBinaryTag.floatBinaryTag(f));
    }

    @NotNull
    default public R putDouble(@NotNull String string, double d) {
        return this.put(string, DoubleBinaryTag.doubleBinaryTag(d));
    }

    @NotNull
    default public R putByteArray(@NotNull String string, byte @NotNull [] byArray) {
        return this.put(string, ByteArrayBinaryTag.byteArrayBinaryTag(byArray));
    }

    @NotNull
    default public R putString(@NotNull String string, @NotNull String string2) {
        return this.put(string, StringBinaryTag.stringBinaryTag(string2));
    }

    @NotNull
    default public R putIntArray(@NotNull String string, int @NotNull [] nArray) {
        return this.put(string, IntArrayBinaryTag.intArrayBinaryTag(nArray));
    }

    @NotNull
    default public R putLongArray(@NotNull String string, long @NotNull [] lArray) {
        return this.put(string, LongArrayBinaryTag.longArrayBinaryTag(lArray));
    }
}

