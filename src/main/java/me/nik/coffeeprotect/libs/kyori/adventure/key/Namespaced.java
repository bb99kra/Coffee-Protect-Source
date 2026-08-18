/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.key;

import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.key.KeyPattern;

public interface Namespaced {
    @KeyPattern.Namespace
    @NotNull
    public String namespace();
}

