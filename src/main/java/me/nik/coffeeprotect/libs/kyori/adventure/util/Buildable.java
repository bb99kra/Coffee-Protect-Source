/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.util;

import java.util.function.Consumer;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Contract;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.builder.AbstractBuilder;

public interface Buildable<R, B extends Builder<R>> {
    @Deprecated
    @Contract(mutates="param1")
    @NotNull
    public static <R extends Buildable<R, B>, B extends Builder<R>> R configureAndBuild(@NotNull B b, @Nullable Consumer<? super B> consumer) {
        return (R)((Buildable)AbstractBuilder.configureAndBuild(b, consumer));
    }

    @Contract(value="-> new", pure=true)
    @NotNull
    public B toBuilder();

    @Deprecated
    public static interface Builder<R>
    extends AbstractBuilder<R> {
        @Override
        @Contract(value="-> new", pure=true)
        @NotNull
        public R build();
    }
}

