/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_AO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_Y;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_d0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_Tq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_jH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_QO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface CP_Xo
extends MappedEntity,
CP_Tq<CP_Xo>,
CP_jH {
    public static final NbtCodec<CP_Xo> CP_J = new CP_AO();

    public CP_d0 getAdultSounds();

    public CP_d0 getBabySounds();

    @Deprecated
    default public CP_QO CP_V() {
        return this.getAdultSounds().CP_R();
    }

    @Deprecated
    default public CP_QO CP_l() {
        return this.getAdultSounds().CP_X();
    }

    @Deprecated
    default public CP_QO CP_v() {
        return this.getAdultSounds().CP_K();
    }

    @Deprecated
    default public CP_QO CP_p() {
        return this.getAdultSounds().CP_z();
    }

    @Deprecated
    default public CP_QO CP_I() {
        return this.getAdultSounds().CP_N();
    }

    @Deprecated
    default public CP_QO CP_u() {
        return this.getAdultSounds().CP_p();
    }

    public static CP_Xo CP_UnderScore(PacketWrapper<?> packetWrapper) {
        return packetWrapper.CP_t(CP_Y.CP_l());
    }

    public static void CP_s(PacketWrapper<?> packetWrapper, CP_Xo ilIlXo) {
        packetWrapper.CP_e(ilIlXo);
    }

    @Deprecated
    public static CP_Xo CP_l(NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return (CP_Xo)((CP_Xo)CP_J.CP_A(nBT, PacketWrapper.CP_E(clientVersion))).copy(typesBuilderData);
    }

    @Deprecated
    public static NBT CP_O(CP_Xo ilIlXo, ClientVersion clientVersion) {
        return CP_J.CP_UnderScore(PacketWrapper.CP_E(clientVersion), ilIlXo);
    }
}

