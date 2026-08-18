/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.util;

import java.time.Duration;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

public interface Ticks {
    public static final int TICKS_PER_SECOND = 20;
    public static final long SINGLE_TICK_DURATION_MS = 50L;

    @NotNull
    public static Duration duration(long l) {
        return Duration.ofMillis(l * 50L);
    }
}

