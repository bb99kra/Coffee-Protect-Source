/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_A1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_if;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

final class BooleanModifier$4
extends CP_if {
    private static final long b = CP_s.a(2119011842943418085L, 3332739563200406664L, MethodHandles.lookup().lookupClass()).a(68953075950883L);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        boolean bl3;
        block5: {
            int[] nArray;
            block4: {
                long l = b ^ 0x17EEDE5108AEL;
                nArray = CP_A1.CP_N();
                bl3 = bl2;
                if (nArray != null) break block4;
                if (bl3) break block5;
                bl3 = bl;
            }
            if (nArray != null) return bl3;
            if (!bl3) {
                bl3 = true;
                return bl3;
            }
        }
        bl3 = false;
        return bl3;
    }
}

