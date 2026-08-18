/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.translation;

import java.util.Locale;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.renderer.TranslatableComponentRenderer;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.kyori.adventure.translation.GlobalTranslatorImpl;
import me.nik.coffeeprotect.libs.kyori.adventure.translation.Translator;
import me.nik.coffeeprotect.libs.kyori.examination.Examinable;

public interface GlobalTranslator
extends Translator,
Examinable {
    @NotNull
    public static GlobalTranslator translator() {
        return GlobalTranslatorImpl.INSTANCE;
    }

    @Deprecated
    @ApiStatus.ScheduledForRemoval(inVersion="5.0.0")
    @NotNull
    public static GlobalTranslator get() {
        return GlobalTranslatorImpl.INSTANCE;
    }

    @NotNull
    public static TranslatableComponentRenderer<Locale> renderer() {
        return GlobalTranslatorImpl.INSTANCE.renderer;
    }

    @NotNull
    public static Component render(@NotNull Component component, @NotNull Locale locale) {
        return GlobalTranslator.renderer().render(component, locale);
    }

    @NotNull
    public Iterable<? extends Translator> sources();

    public boolean addSource(@NotNull Translator var1);

    public boolean removeSource(@NotNull Translator var1);
}

