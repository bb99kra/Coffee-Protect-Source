/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_if;

final class BooleanModifier$5
extends CP_if {
    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        return bl2 ^ bl;
    }
}

