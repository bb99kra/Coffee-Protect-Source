/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;

public interface MappedEntity {
    public ResourceLocation getName();

    public int CP_H(ClientVersion var1);

    default public boolean CP_T() {
        return true;
    }
}

