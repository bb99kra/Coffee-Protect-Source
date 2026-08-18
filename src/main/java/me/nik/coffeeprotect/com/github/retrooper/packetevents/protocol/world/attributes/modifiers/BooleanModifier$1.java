/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_A1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.modifiers.CP_if;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

final class BooleanModifier$1
extends CP_if {
    private static final long b = CP_s.a(-1626605909146532924L, 4738622872902297733L, MethodHandles.lookup().lookupClass()).a(177176830002499L);

    /*
     * Enabled aggressive block sorting
     */
    @Override
    public Boolean apply(Boolean bl, Boolean bl2) {
        boolean bl3;
        block5: {
            int[] nArray;
            block4: {
                long l = b ^ 0x270D2B3A7591L;
                nArray = CP_A1.CP_N();
                bl3 = bl2;
                if (nArray != null) break block4;
                if (!bl3) break block5;
                bl3 = bl;
            }
            if (nArray != null) return bl3;
            if (bl3) {
                bl3 = true;
                return bl3;
            }
        }
        bl3 = false;
        return bl3;
    }
}

