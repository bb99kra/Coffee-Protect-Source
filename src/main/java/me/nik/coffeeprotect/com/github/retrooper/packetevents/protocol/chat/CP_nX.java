/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.util.List;
import java.util.function.Function;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

@FunctionalInterface
public interface CP_nX
extends Function<PacketWrapper<?>, List<Object>> {
}

