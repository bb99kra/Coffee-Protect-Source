/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;

public interface CP_C3 {
    default public boolean CP_P() {
        return true;
    }

    public void CP_d();

    public void CP_X();

    public void CP_C(Object var1, CP_G2 var2);

    public void CP_l(Object var1, Object var2);

    public boolean CP_X(Object var1);

    public boolean CP_K();

    default public CP_hC CP_T() {
        return CP_hC.SERVER;
    }
}

