/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.ComponentLike;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_Az;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_Cr;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_GB;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_GI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_R;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_X5;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_dz;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_yB;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_yv;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.event.CP_nh;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.event.CP_rV;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.kyori.adventure.key.Key;
import me.nik.coffeeprotect.libs.kyori.adventure.util.ARGBLike;

public interface CP_Ax<C extends Component>
extends Component {
    @NotNull
    default public C asComponent() {
        return (C)Component.super.asComponent();
    }

    @NotNull
    public C CP_w(@NotNull List<? extends ComponentLike> var1);

    @NotNull
    public C CP_B(@NotNull CP_dz var1);

    @NotNull
    default public C CP_F(@NotNull Consumer<CP_GI> consumer) {
        return (C)Component.super.CP_F(consumer);
    }

    @NotNull
    default public C CP_Z(@NotNull CP_GI ilIlGI) {
        return (C)Component.super.CP_Z(ilIlGI);
    }

    @NotNull
    default public C CP_v(@NotNull Consumer<CP_GI> consumer, @NotNull CP_yB ilIlyB) {
        return (C)Component.super.CP_v(consumer, ilIlyB);
    }

    @NotNull
    default public C CP_l(@NotNull Component component) {
        return (C)Component.super.CP_l(component);
    }

    @NotNull
    default public C CP_e(@NotNull Component component, CP_Az ... ilIlAzArray) {
        return (C)Component.super.CP_e(component, ilIlAzArray);
    }

    @NotNull
    default public C CP_v(@NotNull Component component) {
        return (C)Component.super.CP_v(component);
    }

    @NotNull
    default public C CP_I(@NotNull ComponentLike componentLike) {
        return (C)Component.super.CP_I(componentLike);
    }

    @NotNull
    default public C CP_Z(@NotNull CP_R<?, ?> ilIlR) {
        return (C)Component.super.CP_Z(ilIlR);
    }

    @NotNull
    default public C append(@NotNull List<? extends ComponentLike> list) {
        return (C)Component.super.append(list);
    }

    @NotNull
    default public C CP_e(ComponentLike ... componentLikeArray) {
        return (C)Component.super.CP_e(componentLikeArray);
    }

    @NotNull
    default public C CP_U() {
        return (C)Component.super.CP_U();
    }

    @NotNull
    default public C CP_W() {
        return (C)Component.super.CP_W();
    }

    @NotNull
    default public C CP_l(CP_Cr ... ilIlCrArray) {
        return (C)Component.super.CP_l(ilIlCrArray);
    }

    @NotNull
    default public C CP_m(@NotNull CP_dz ilIldz) {
        return (C)Component.super.CP_m(ilIldz);
    }

    @NotNull
    default public C CP_w(@NotNull Component component, @NotNull Set<CP_Az> set) {
        return (C)Component.super.CP_w(component, set);
    }

    @NotNull
    default public C CP_Y(@Nullable CP_X5 ilIlX5) {
        return (C)Component.super.CP_Y(ilIlX5);
    }

    @NotNull
    default public C CP_t(@Nullable CP_X5 ilIlX5) {
        return (C)Component.super.CP_t(ilIlX5);
    }

    @NotNull
    default public C CP_y(@Nullable ARGBLike aRGBLike) {
        return (C)Component.super.CP_y(aRGBLike);
    }

    @NotNull
    default public C CP_b(@Nullable ARGBLike aRGBLike) {
        return (C)Component.super.CP_b(aRGBLike);
    }

    @NotNull
    default public C CP_o(@NotNull CP_yv ilIlyv) {
        return (C)Component.super.CP_o(ilIlyv);
    }

    @NotNull
    default public C CP_T(@NotNull CP_yv ilIlyv, boolean bl) {
        return (C)Component.super.CP_T(ilIlyv, bl);
    }

    @NotNull
    default public C CP_C(@NotNull CP_yv ilIlyv, @NotNull CP_GB ilIlGB) {
        return (C)Component.super.CP_C(ilIlyv, ilIlGB);
    }

    @NotNull
    default public C CP_y(@NotNull CP_yv ilIlyv, @NotNull CP_GB ilIlGB) {
        return (C)Component.super.CP_y(ilIlyv, ilIlGB);
    }

    @NotNull
    default public C CP_e(@NotNull Map<CP_yv, CP_GB> map) {
        return (C)Component.super.CP_e(map);
    }

    @NotNull
    default public C CP_l(@Nullable CP_nh ilIlnh) {
        return (C)Component.super.CP_l(ilIlnh);
    }

    @NotNull
    default public C CP_j(@Nullable CP_rV<?> ilIlrV) {
        return (C)Component.super.CP_j(ilIlrV);
    }

    @NotNull
    default public C CP_N(@Nullable String string) {
        return (C)Component.super.CP_N(string);
    }

    @NotNull
    default public C CP_D(@Nullable Key key) {
        return (C)Component.super.CP_D(key);
    }
}

