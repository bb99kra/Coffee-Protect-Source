/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.CP_qc;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

public abstract class CP_y3
implements CP_qc {
    private static String[] CP_w;
    private static final long a;

    @Override
    public abstract int CP_m(@NotNull Object var1);

    @Override
    public abstract Object CP_F(@NotNull Object var1);

    @Override
    @NotNull
    public ClientVersion CP_Y(@NotNull Object object) {
        return this.CP_V(object).CP_h();
    }

    @Override
    public CP_G2 CP_V(@NotNull Object object) {
        long l = a ^ 0x3158FC2BEBD1L;
        Object object2 = this.CP_F(object);
        String[] stringArray = CP_y3.CP_D();
        CP_G2 ilIlG2 = CP_r7.CP_b().CP_M().CP_g(object2);
        if (stringArray != null) {
            PacketWrapper.CP_e(new int[2]);
        }
        return ilIlG2;
    }

    public static void CP_Z(String[] stringArray) {
        CP_w = stringArray;
    }

    public static String[] CP_D() {
        return CP_w;
    }

    static {
        a = CP_s.a(959514199781171128L, -4194615835615661995L, MethodHandles.lookup().lookupClass()).a(43890032338394L);
        if (CP_y3.CP_D() != null) {
            CP_y3.CP_Z(new String[3]);
        }
    }
}

