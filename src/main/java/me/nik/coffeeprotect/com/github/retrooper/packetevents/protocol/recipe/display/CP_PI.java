/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.display;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.display.CP_h5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public interface CP_PI<T extends CP_h5<?>>
extends MappedEntity {
    public T read(PacketWrapper<?> var1);

    public void write(PacketWrapper<?> var1, T var2);
}

