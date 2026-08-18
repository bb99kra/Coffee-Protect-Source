/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_A1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_if;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

final class BooleanModifier$2
extends CP_if {
    private static final long b = CP_s.a(7505350585041321100L, -1180039936845639027L, MethodHandles.lookup().lookupClass()).a(160962158057471L);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        long l = b ^ 0x70F0213E7A90L;
        int[] nArray = CP_A1.CP_N();
        boolean bl3 = bl2;
        if (nArray != null) return bl3;
        if (bl3) {
            bl3 = bl;
            if (nArray != null) return bl3;
            if (bl3) {
                bl3 = false;
                return bl3;
            }
        }
        bl3 = true;
        return bl3;
    }
}

