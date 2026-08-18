/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_R;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Contract;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface CP_Ck {
    @Contract(mutates="param")
    public void CP_UnderScore(@NotNull CP_R<?, ?> var1);
}

