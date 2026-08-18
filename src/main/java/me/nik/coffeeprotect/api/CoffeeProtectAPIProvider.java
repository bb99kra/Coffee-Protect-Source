/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.nik.coffeeprotect.api;

import me.nik.coffeeprotect.api.CoffeeProtectAPI;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CoffeeProtectAPIProvider {
    private static CoffeeProtectAPI apiInstance;

    private CoffeeProtectAPIProvider() {
    }

    public static void setApiInstance(@NotNull CoffeeProtectAPI coffeeProtectAPI) {
        apiInstance = coffeeProtectAPI;
    }

    @Nullable
    public static CoffeeProtectAPI getAPI() {
        return apiInstance;
    }
}

