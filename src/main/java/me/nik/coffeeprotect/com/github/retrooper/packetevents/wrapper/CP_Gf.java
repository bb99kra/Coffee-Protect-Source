/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Gf {
    @Nullable
    private CP_oL CP_Q;
    private int CP_T;
    private static int[] CP_UnderScore;
    private static transient /* synthetic */ String dIKoaGnypX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Gf(@Nullable CP_oL ilIloL, int n) {
        this.CP_Q = ilIloL;
        this.CP_T = n;
    }

    @Nullable
    public CP_oL CP_n() {
        return this.CP_Q;
    }

    public int CP_Q() {
        return this.CP_T;
    }

    public void CP_c(@Nullable CP_oL ilIloL) {
        this.CP_Q = ilIloL;
    }

    public void CP_B(int n) {
        this.CP_T = n;
    }

    public static void CP_M(int[] nArray) {
        CP_UnderScore = nArray;
    }

    public static int[] CP_y() {
        return CP_UnderScore;
    }

    static {
        if (CP_Gf.CP_y() == null) {
            CP_Gf.CP_M(new int[5]);
        }
    }
}

