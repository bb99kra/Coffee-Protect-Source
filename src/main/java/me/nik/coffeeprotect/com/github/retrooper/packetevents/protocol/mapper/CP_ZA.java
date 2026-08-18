/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;

public interface CP_ZA
extends MappedEntity {
    public int getId();

    @Override
    default public int CP_H(ClientVersion clientVersion) {
        return this.getId();
    }
}

