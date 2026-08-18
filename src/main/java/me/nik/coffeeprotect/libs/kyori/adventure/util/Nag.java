/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.util;

import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

public abstract class Nag
extends RuntimeException {
    private static final long serialVersionUID = -695562541413409498L;

    public static void print(@NotNull Nag nag) {
        nag.printStackTrace();
    }

    protected Nag(String string) {
        super(string);
    }
}

