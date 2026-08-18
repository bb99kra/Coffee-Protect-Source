/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_Ck;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_GI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_R;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Contract;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

@FunctionalInterface
public interface CP_Cr
extends CP_Ck {
    @Contract(mutates="param")
    public void CP_i(@NotNull CP_GI var1);

    @Override
    default public void CP_UnderScore(@NotNull CP_R<?, ?> ilIlR) {
        ilIlR.CP_V(this::CP_i);
    }
}

