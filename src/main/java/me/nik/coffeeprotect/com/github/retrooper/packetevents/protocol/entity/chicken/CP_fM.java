/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_AC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_Qy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_oX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_Tq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_jH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public interface CP_fM
extends MappedEntity,
CP_Tq<CP_fM>,
CP_jH {
    public static final NbtCodec<CP_fM> CP_o = new CP_oX().CP_q();

    public static CP_fM CP_v(PacketWrapper<?> packetWrapper) {
        return packetWrapper.CP_t(CP_AC.CP_R());
    }

    public static void CP_b(PacketWrapper<?> packetWrapper, CP_fM ilIlfM) {
        packetWrapper.CP_e(ilIlfM);
    }

    public CP_Qy getAdultSounds();

    public CP_Qy getBabySounds();
}

