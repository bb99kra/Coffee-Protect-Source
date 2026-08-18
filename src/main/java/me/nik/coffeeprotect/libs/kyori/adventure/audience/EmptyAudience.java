/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.libs.kyori.adventure.audience;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.ComponentLike;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Contract;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import me.nik.coffeeprotect.libs.kyori.adventure.audience.Audience;
import me.nik.coffeeprotect.libs.kyori.adventure.audience.MessageType;
import me.nik.coffeeprotect.libs.kyori.adventure.chat.SignedMessage;
import me.nik.coffeeprotect.libs.kyori.adventure.identity.Identified;
import me.nik.coffeeprotect.libs.kyori.adventure.identity.Identity;
import me.nik.coffeeprotect.libs.kyori.adventure.pointer.Pointer;
import me.nik.coffeeprotect.libs.kyori.adventure.resource.ResourcePackInfoLike;
import me.nik.coffeeprotect.libs.kyori.adventure.resource.ResourcePackRequest;

final class EmptyAudience
implements Audience {
    static final EmptyAudience INSTANCE = new EmptyAudience();
    private static transient /* synthetic */ String XWoptbnARZ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    EmptyAudience() {
    }

    @Override
    @NotNull
    public <T> Optional<T> get(@NotNull Pointer<T> pointer) {
        return Optional.empty();
    }

    @Override
    @Contract(value="_, null -> null; _, !null -> !null")
    @Nullable
    public <T> T getOrDefault(@NotNull Pointer<T> pointer, @Nullable T t) {
        return t;
    }

    @Override
    public <T> @UnknownNullability T getOrDefaultFrom(@NotNull Pointer<T> pointer, @NotNull Supplier<? extends T> supplier) {
        return supplier.get();
    }

    @Override
    @NotNull
    public Audience filterAudience(@NotNull Predicate<? super Audience> predicate) {
        return this;
    }

    @Override
    public void forEachAudience(@NotNull Consumer<? super Audience> consumer) {
    }

    @Override
    public void sendMessage(@NotNull ComponentLike componentLike) {
    }

    @Override
    public void sendMessage(@NotNull Component component) {
    }

    @Override
    @Deprecated
    public void sendMessage(@NotNull Identified identified, @NotNull Component component, @NotNull MessageType messageType) {
    }

    @Override
    @Deprecated
    public void sendMessage(@NotNull Identity identity, @NotNull Component component, @NotNull MessageType messageType) {
    }

    @Override
    public void sendMessage(@NotNull Component component,  @NotNull ChatType.Bound bound) {
    }

    @Override
    public void sendMessage(@NotNull SignedMessage signedMessage,  @NotNull ChatType.Bound bound) {
    }

    @Override
    public void deleteMessage(@NotNull SignedMessage.Signature signature) {
    }

    @Override
    public void sendActionBar(@NotNull ComponentLike componentLike) {
    }

    @Override
    public void sendPlayerListHeader(@NotNull ComponentLike componentLike) {
    }

    @Override
    public void sendPlayerListFooter(@NotNull ComponentLike componentLike) {
    }

    @Override
    public void sendPlayerListHeaderAndFooter(@NotNull ComponentLike componentLike, @NotNull ComponentLike componentLike2) {
    }

    @Override
    public void openBook( @NotNull Book.Builder builder) {
    }

    @Override
    public void sendResourcePacks(@NotNull ResourcePackInfoLike resourcePackInfoLike, ResourcePackInfoLike ... resourcePackInfoLikeArray) {
    }

    @Override
    public void removeResourcePacks(@NotNull ResourcePackRequest resourcePackRequest) {
    }

    @Override
    public void removeResourcePacks(@NotNull ResourcePackInfoLike resourcePackInfoLike, ResourcePackInfoLike ... resourcePackInfoLikeArray) {
    }

    public boolean equals(Object object) {
        return this == object;
    }

    public int hashCode() {
        return 0;
    }

    public String toString() {
        return "EmptyAudience";
    }
}

