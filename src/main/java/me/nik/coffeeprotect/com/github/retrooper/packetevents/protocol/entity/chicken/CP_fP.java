/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_xS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_yd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_yw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_Tq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_jH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface CP_fP
extends MappedEntity,
CP_Tq<CP_fP>,
CP_jH {
    public static final NbtCodec<CP_fP> CP_h = new CP_yw().CP_q();

    public CP_xS getModelType();

    public ResourceLocation getAssetId();

    public ResourceLocation getBabyAssetId();

    public static CP_fP CP_l(PacketWrapper<?> packetWrapper) {
        return packetWrapper.CP_t(CP_yd.CP_M());
    }

    public static void CP_s(PacketWrapper<?> packetWrapper, CP_fP ilIlfP) {
        packetWrapper.CP_e(ilIlfP);
    }

    @Deprecated
    public static CP_fP CP_m(NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return (CP_fP)((CP_fP)CP_h.CP_A(nBT, PacketWrapper.CP_E(clientVersion))).copy(typesBuilderData);
    }

    @Deprecated
    public static NBT CP_h(CP_fP ilIlfP, ClientVersion clientVersion) {
        return CP_h.CP_UnderScore(PacketWrapper.CP_E(clientVersion), ilIlfP);
    }
}

