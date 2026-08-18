/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension;

import java.lang.invoke.MethodHandles;
import java.util.OptionalLong;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_OK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_Tq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_jH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_yH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.CP_Gp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.timelines.CP_iy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.clock.CP_jT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Qs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_XA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_fK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_ro;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_x;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.CP_Gw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface CP_nq
extends MappedEntity,
CP_Tq<CP_nq>,
CP_jH {
    public static final NbtCodec<CP_nq> CP_Y;
    public static final long a;

    public boolean hasFixedTime();

    @ApiStatus.Obsolete
    public OptionalLong getFixedTime();

    public boolean hasSkyLight();

    public boolean hasCeiling();

    @ApiStatus.Obsolete
    public boolean isUltraWarm();

    @ApiStatus.Obsolete
    public boolean isNatural();

    public double getCoordinateScale();

    default public boolean CP_Q() {
        long l = a ^ 0x7D1ED76A8BC5L;
        String string = CP_Qs.CP_Y();
        double d = this.getCoordinateScale() - 1.0;
        double d2 = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
        if (string != null) {
            d2 = d2 > 0 ? 1.0 : 0.0;
        }
        return (boolean)d2;
    }

    @ApiStatus.Obsolete
    public boolean isBedWorking();

    @ApiStatus.Obsolete
    public boolean isRespawnAnchorWorking();

    public int getMinY();

    @Deprecated
    default public int CP_W(ClientVersion clientVersion) {
        return this.getMinY();
    }

    public int getHeight();

    default public int CP_R(ClientVersion clientVersion) {
        return this.getHeight();
    }

    public int getLogicalHeight();

    @Deprecated
    default public int CP_j(ClientVersion clientVersion) {
        return this.getLogicalHeight();
    }

    public CP_Gw getInfiniburn();

    @Deprecated
    default public String CP_k() {
        return this.getInfiniburn().toString();
    }

    @ApiStatus.Obsolete
    public ResourceLocation getEffectsLocation();

    public float getAmbientLight();

    @ApiStatus.Obsolete
    public @Nullable Integer getCloudHeight();

    public @Nullable CP_jT getDefaultClock();

    public boolean isHasEnderDragonFight();

    @ApiStatus.Obsolete
    public boolean isPiglinSafe();

    @ApiStatus.Obsolete
    public boolean hasRaids();

    @ApiStatus.Experimental
    public NBT getMonsterSpawnLightLevel();

    public int getMonsterSpawnBlockLightLimit();

    public CP_XA getSkybox();

    public CP_fK getCardinalLight();

    public CP_Gp getAttributes();

    public CP_OK<CP_iy> getTimelines();

    public CP_yH<CP_iy> getTimelinesRef();

    default public CP_x CP_q(PacketWrapper<?> packetWrapper) {
        return new CP_Qs(this, packetWrapper);
    }

    @Deprecated
    default public CP_x CP_J(ClientVersion clientVersion) {
        return this.CP_q(PacketWrapper.CP_E(clientVersion));
    }

    @Deprecated
    public static CP_nq CP_V(NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return (CP_nq)((CP_nq)CP_Y.CP_A(nBT, PacketWrapper.CP_E(clientVersion))).copy(typesBuilderData);
    }

    @Deprecated
    public static NBT CP_e(CP_nq ilIlnq, ClientVersion clientVersion) {
        return CP_Y.CP_UnderScore(PacketWrapper.CP_E(clientVersion), ilIlnq);
    }

    static {
        a = CP_s.a(8964668576111670553L, -6642792755507014527L, MethodHandles.lookup().lookupClass()).a(60755530484858L);
        CP_Y = new CP_ro().CP_q();
    }
}

