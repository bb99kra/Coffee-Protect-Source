/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.renderer;

import java.util.function.Function;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

public interface CP_G7<C> {
    @NotNull
    public Component render(@NotNull Component var1, @NotNull C var2);

    default public <T> CP_G7<T> CP_E(Function<T, C> function) {
        return (component, object) -> this.render(component, function.apply(object));
    }
}

