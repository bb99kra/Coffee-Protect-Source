package me.nik.coffeeprotect.api;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public final class CoffeeProtectAPIProvider {

    private static CoffeeProtectAPI apiInstance;

    private CoffeeProtectAPIProvider() {}

    public static void setApiInstance(@NotNull CoffeeProtectAPI api) {
        apiInstance = api;
    }

    @Nullable
    public static CoffeeProtectAPI getAPI() {
        return apiInstance;
    }
}
