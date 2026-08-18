/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.util;

import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

public interface Codec<D, E, DX extends Throwable, EX extends Throwable> {
    @NotNull
    public static <D, E, DX extends Throwable, EX extends Throwable> Codec<D, E, DX, EX> codec(final @NotNull Decoder<D, E, DX> decoder, final @NotNull Encoder<D, E, EX> encoder) {
        return new Codec<D, E, DX, EX>(){
            private static transient /* synthetic */ String jTZatgDVdQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public D decode(@NotNull E e) throws Throwable {
                return decoder.decode(e);
            }

            @Override
            @NotNull
            public E encode(@NotNull D d) throws Throwable {
                return encoder.encode(d);
            }
        };
    }

    @Deprecated
    @ApiStatus.ScheduledForRemoval(inVersion="5.0.0")
    @NotNull
    public static <D, E, DX extends Throwable, EX extends Throwable> Codec<D, E, DX, EX> of(final @NotNull Decoder<D, E, DX> decoder, final @NotNull Encoder<D, E, EX> encoder) {
        return new Codec<D, E, DX, EX>(){
            private static transient /* synthetic */ String xPREsOktEV = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

            @Override
            @NotNull
            public D decode(@NotNull E e) throws Throwable {
                return decoder.decode(e);
            }

            @Override
            @NotNull
            public E encode(@NotNull D d) throws Throwable {
                return encoder.encode(d);
            }
        };
    }

    @NotNull
    public D decode(@NotNull E var1) throws DX;

    @NotNull
    public E encode(@NotNull D var1) throws EX;

    public static interface Decoder<D, E, X extends Throwable> {
        @NotNull
        public D decode(@NotNull E var1) throws X;
    }

    public static interface Encoder<D, E, X extends Throwable> {
        @NotNull
        public E encode(@NotNull D var1) throws X;
    }
}

