/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface CP_Tq<T extends MappedEntity> {
    public T copy(@Nullable TypesBuilderData var1);
}

