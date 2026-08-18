/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.internal;

import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.examination.Examinable;
import me.nik.coffeeprotect.libs.kyori.examination.string.StringExaminer;

@ApiStatus.Internal
public final class Internals {
    private static transient /* synthetic */ String mrvANnNxQj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private Internals() {
    }

    @NotNull
    public static String toString(@NotNull Examinable examinable) {
        return examinable.examine(StringExaminer.simpleEscaping());
    }
}

