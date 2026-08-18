/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.CP_xz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession.CP_Xj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession.CP_dl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.type.CP_Ww;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.type.CP_y2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_uD {
    private CP_Ww CP_l;
    private CP_Xj CP_n;
    private int CP_p;
    private static String[] CP_u;
    private static final long a;
    private static transient /* synthetic */ String JAPLRGYSgJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_uD(CP_Ww ilIlWw, CP_Xj ilIlXj, CP_xz ilIlxz) {
        this(ilIlWw, ilIlXj, ilIlxz.CP_a());
    }

    public CP_uD(CP_Ww ilIlWw, CP_Xj ilIlXj, int n) {
        long l = a ^ 0x239965961136L;
        String[] stringArray = CP_uD.CP_I();
        this.CP_l = ilIlWw;
        String[] stringArray2 = stringArray;
        this.CP_n = ilIlXj;
        this.CP_p = n;
        if (stringArray2 != null) {
            PacketWrapper.CP_e(new int[3]);
        }
    }

    @Deprecated
    public CP_uD(int n, int n2, int n3) {
        long l = a ^ 0x234A709D172FL;
        this(CP_y2.CP_Y(n), CP_dl.CP_v(n2), n3);
        String[] stringArray = CP_uD.CP_I();
        if (PacketWrapper.CP_z() == null) {
            CP_uD.CP_o(new String[4]);
        }
    }

    public CP_Ww CP_P() {
        return this.CP_l;
    }

    public void CP_i(CP_Ww ilIlWw) {
        this.CP_l = ilIlWw;
    }

    public CP_Xj CP_A() {
        return this.CP_n;
    }

    public void CP_h(CP_Xj ilIlXj) {
        this.CP_n = ilIlXj;
    }

    public int CP_F() {
        return this.CP_p;
    }

    @Nullable
    public CP_xz CP_Y() {
        return CP_xz.CP_f(this.CP_p);
    }

    public void CP_v(int n) {
        this.CP_p = n;
    }

    public void CP_w(CP_xz ilIlxz) {
        this.CP_p = ilIlxz.CP_a();
    }

    public static void CP_o(String[] stringArray) {
        CP_u = stringArray;
    }

    public static String[] CP_I() {
        return CP_u;
    }

    static {
        a = CP_s.a(4838331728384236773L, -5760291850961927687L, MethodHandles.lookup().lookupClass()).a(37963409380411L);
        if (CP_uD.CP_I() != null) {
            CP_uD.CP_o(new String[2]);
        }
    }
}

