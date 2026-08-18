/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_A1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_if;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

final class BooleanModifier$3
extends CP_if {
    private static final long b = CP_s.a(-4301598203261252432L, -5038041742597991920L, MethodHandles.lookup().lookupClass()).a(273873595770243L);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        long l = b ^ 0x56E5516DC0EL;
        int[] nArray = CP_A1.CP_N();
        boolean bl3 = bl2;
        if (nArray != null) return bl3;
        if (!bl3) {
            bl3 = bl;
            if (nArray != null) return bl3;
            if (!bl3) {
                bl3 = false;
                return bl3;
            }
        }
        bl3 = true;
        return bl3;
    }
}

