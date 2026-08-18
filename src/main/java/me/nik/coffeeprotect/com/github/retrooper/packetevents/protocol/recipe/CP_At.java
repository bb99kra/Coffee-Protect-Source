/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_GM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_ym;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_At
implements CP_GM {
    private CP_Cg CP_p;
    @Nullable
    private CP_Cg CP_K;
    private CP_Cg CP_A;
    private int CP_V;
    private int CP_j;
    private int CP_o;
    private int CP_d;
    private float CP_L;
    private int CP_E;
    private static int CP_c;
    private static final long a;
    private static transient /* synthetic */ String VnnZRObgZj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_At(CP_ym ilIlym, @Nullable CP_ym ilIlym2, CP_Cg ilIlCg, int n, int n2, int n3, int n4, float f, int n5) {
        long l = a ^ 0x13940EB75B12L;
        this(ilIlym.CP_r(), ilIlym2 == null ? null : ilIlym2.CP_r(), ilIlCg, n, n2, n3, n4, f, n5);
    }

    private CP_At(CP_Cg ilIlCg, @Nullable CP_Cg ilIlCg2, CP_Cg ilIlCg3, int n, int n2, int n3, int n4, float f, int n5) {
        this.CP_p = ilIlCg;
        this.CP_K = ilIlCg2;
        this.CP_A = ilIlCg3;
        this.CP_V = n;
        this.CP_j = n2;
        this.CP_o = n3;
        this.CP_L = f;
        this.CP_E = n5;
        this.CP_d = n4;
    }

    public static CP_At CP_Y(CP_Cg ilIlCg, @Nullable CP_Cg ilIlCg2, CP_Cg ilIlCg3, int n, int n2, int n3, int n4, float f, int n5) {
        return new CP_At(ilIlCg, ilIlCg2, ilIlCg3, n, n2, n3, n4, f, n5);
    }

    public static CP_At CP_U(CP_Cg ilIlCg, CP_Cg ilIlCg2, int n, int n2, int n3, int n4, float f, int n5) {
        return new CP_At(ilIlCg, null, ilIlCg2, n, n2, n3, n4, f, n5);
    }

    public static CP_At CP_Z(CP_Cg ilIlCg, CP_Cg ilIlCg2, int n, int n2, int n3, float f, int n4) {
        return new CP_At(ilIlCg, null, ilIlCg2, n, n2, n3, 0, f, n4);
    }

    public static CP_At CP_H(CP_ym ilIlym, @Nullable CP_ym ilIlym2, CP_Cg ilIlCg, int n, int n2, int n3, int n4, float f, int n5) {
        return new CP_At(ilIlym, ilIlym2, ilIlCg, n, n2, n3, n4, f, n5);
    }

    public static CP_At CP_f(CP_ym ilIlym, CP_Cg ilIlCg, int n, int n2, int n3, int n4, float f, int n5) {
        return new CP_At(ilIlym, null, ilIlCg, n, n2, n3, n4, f, n5);
    }

    public static CP_At CP_y(CP_ym ilIlym, CP_Cg ilIlCg, int n, int n2, int n3, float f, int n4) {
        return new CP_At(ilIlym, null, ilIlCg, n, n2, n3, 0, f, n4);
    }

    public CP_ym CP_d() {
        return CP_ym.CP_UnderScore(this.CP_p);
    }

    public void CP_P(CP_ym ilIlym) {
        this.CP_p = ilIlym.CP_r();
    }

    @ApiStatus.Obsolete
    public CP_Cg CP_y() {
        return this.CP_p;
    }

    @ApiStatus.Obsolete
    public void CP_m(CP_Cg ilIlCg) {
        this.CP_p = ilIlCg;
    }

    @Nullable
    public CP_ym CP_UnderScore() {
        return CP_ym.CP_UnderScore(this.CP_p);
    }

    /*
     * Unable to fully structure code
     */
    public void CP_a(@Nullable CP_ym var1_1) {
        var2_2 = CP_At.a ^ 64100208732029L;
        var4_3 = CP_At.CP_o();
        v0 = var1_1;
        if (var4_3 == 0) ** GOTO lbl9
        if (v0 == null) {
            v1 = null;
        } else {
            v0 = var1_1;
lbl9:
            // 2 sources

            v1 = v0.CP_r();
        }
        this.CP_K = v1;
    }

    @ApiStatus.Obsolete
    @Nullable
    public CP_Cg CP_Q() {
        return this.CP_K;
    }

    @ApiStatus.Obsolete
    public void CP_S(@Nullable CP_Cg ilIlCg) {
        this.CP_K = ilIlCg;
    }

    public CP_Cg CP_n() {
        return this.CP_A;
    }

    public void CP_M(CP_Cg ilIlCg) {
        this.CP_A = ilIlCg;
    }

    public int CP_V() {
        return this.CP_V;
    }

    public void CP_K(int n) {
        this.CP_V = n;
    }

    public int CP_y() {
        return this.CP_j;
    }

    public void CP_i(int n) {
        this.CP_j = n;
    }

    public int CP_c() {
        return this.CP_o;
    }

    public void CP_G(int n) {
        this.CP_o = n;
    }

    public float CP_R() {
        return this.CP_L;
    }

    public void CP_I(float f) {
        this.CP_L = f;
    }

    public int CP_g() {
        return this.CP_E;
    }

    public void CP_A(int n) {
        this.CP_E = n;
    }

    public int CP_W() {
        return this.CP_d;
    }

    public void CP_s(int n) {
        this.CP_d = n;
    }

    public boolean CP_e() {
        long l = a ^ 0xBC49DB23466L;
        int n = CP_At.CP_o();
        int n2 = this.CP_V;
        if (n != 0) {
            n2 = n2 >= this.CP_j ? 1 : 0;
        }
        return n2 != 0;
    }

    public static void CP_P(int n) {
        CP_c = n;
    }

    public static int CP_D() {
        return CP_c;
    }

    public static int CP_o() {
        int n = CP_At.CP_D();
        if (n == 0) {
            return 61;
        }
        return 0;
    }

    static {
        a = CP_s.a(-924827583952646800L, 5028971903913229508L, MethodHandles.lookup().lookupClass()).a(50498297413127L);
        if (CP_At.CP_D() != 0) {
            CP_At.CP_P(32);
        }
    }
}

