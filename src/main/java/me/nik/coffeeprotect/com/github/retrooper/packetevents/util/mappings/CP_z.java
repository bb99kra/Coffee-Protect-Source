/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_Ou;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

@ApiStatus.Internal
public interface CP_z {
    public static final long b = CP_s.a(-6133476703895788055L, -366564501909387452L, MethodHandles.lookup().lookupClass()).a(77420489786952L);

    default public <T extends MappedEntity> CP_Ou<T> CP_w(CP_Ou<T> ilIlOu) {
        return this.CP_F(ilIlOu, CP_r7.CP_b().CP_q().CP_F().CP_E());
    }

    default public <T extends MappedEntity> CP_Ou<T> CP_F(CP_Ou<T> ilIlOu, ClientVersion clientVersion) {
        long l = b ^ 0x63FFAB64DDE1L;
        CP_Ou<?> ilIlOu2 = this.CP_z(ilIlOu.CP_X(), clientVersion);
        int[] nArray = VersionedRegistry.CP_B();
        CP_Ou<Object> ilIlOu3 = ilIlOu2;
        if (nArray == null) {
            ilIlOu3 = ilIlOu3 != null ? ilIlOu2 : ilIlOu;
        }
        return ilIlOu3;
    }

    @Nullable
    default public CP_Ou<?> CP_y(ResourceLocation resourceLocation) {
        return this.CP_z(resourceLocation, CP_r7.CP_b().CP_q().CP_F().CP_E());
    }

    @Nullable
    public CP_Ou<?> CP_z(ResourceLocation var1, ClientVersion var2);
}

