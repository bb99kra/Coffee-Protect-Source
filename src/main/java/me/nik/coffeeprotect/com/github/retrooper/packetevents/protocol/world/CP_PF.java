/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_LG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_fC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Ca;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_QH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_QI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Qv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_S;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_TI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_WW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_qn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_xZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_PF {
    public final CP_WW CP_p;
    public CP_xZ CP_C;
    public CP_Qv CP_e;
    private static int[] CP_d;
    private static final long a;
    private static final long b;
    private static transient /* synthetic */ String ccXdNxRNyy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_PF(CP_xZ ilIlxZ, CP_Qv ilIlQv, CP_WW ilIlWW) {
        this.CP_C = ilIlxZ;
        this.CP_e = ilIlQv;
        this.CP_p = ilIlWW;
    }

    @Deprecated
    public static CP_PF CP_y() {
        return CP_WW.CHUNK.CP_F();
    }

    @Deprecated
    public static CP_PF CP_f() {
        return CP_WW.BIOME.CP_F();
    }

    @Deprecated
    public static CP_PF CP_j(CP_WW ilIlWW) {
        return ilIlWW.CP_F();
    }

    @Deprecated
    public static CP_PF CP_c(CP_fC ilIlfC, CP_WW ilIlWW) {
        return CP_PF.CP_j(ilIlfC, ilIlWW, true);
    }

    @Deprecated
    public static CP_PF CP_j(CP_fC ilIlfC, CP_WW ilIlWW, boolean bl) {
        return CP_PF.CP_z(ilIlfC, ilIlWW, bl, true);
    }

    @Deprecated
    public static CP_PF CP_z(CP_fC ilIlfC, CP_WW ilIlWW, boolean bl, boolean n) {
        CP_QH ilIlQH;
        CP_xZ ilIlxZ;
        block7: {
            int n2;
            block5: {
                block6: {
                    long l = a ^ 0x5D4934D3F800L;
                    byte by = ilIlfC.CP_UnderScore();
                    ilIlxZ = CP_PF.CP_W(ilIlWW, by, ilIlfC, bl);
                    int[] nArray = CP_PF.CP_H();
                    n2 = ilIlxZ instanceof CP_Ca;
                    if (nArray == null) break block5;
                    if (n2 != 0) break block6;
                    long[] lArray = n != 0 ? ilIlfC.CP_g(ilIlfC.CP_O()) : null;
                    ilIlQH = new CP_QH(by, ilIlWW.CP_q(), lArray);
                    int n3 = n;
                    if (nArray != null && n3 == 0) {
                        n3 = ilIlfC.CP_O(ilIlQH.CP_UnderScore());
                    }
                    if (nArray != null) break block7;
                }
                n2 = n;
            }
            if (n2 != 0) {
                ilIlfC.CP_g(ilIlfC.CP_O());
            }
            ilIlQH = null;
        }
        return new CP_PF(ilIlxZ, ilIlQH, ilIlWW);
    }

    @Deprecated
    public static void CP_A(CP_LG ilIlLG, CP_PF ilIlPF) {
        CP_PF.CP_b(ilIlLG, ilIlPF, true);
    }

    @Deprecated
    public static void CP_b(CP_LG ilIlLG, CP_PF ilIlPF, boolean bl) {
        CP_PF ilIlPF2;
        int[] nArray;
        block14: {
            boolean bl2;
            block10: {
                block11: {
                    block13: {
                        int n;
                        CP_LG ilIlLG2;
                        block12: {
                            long l = a ^ 0x25C2B86133E3L;
                            nArray = CP_PF.CP_H();
                            bl2 = ilIlPF.CP_C instanceof CP_Ca;
                            if (nArray == null) break block10;
                            if (!bl2) break block11;
                            ilIlLG.CP_O(0);
                            ilIlLG2 = ilIlLG;
                            n = ilIlPF.CP_C.CP_T(0);
                            if (nArray == null) break block12;
                            ilIlLG2.CP_N(n);
                            if (!bl) break block13;
                            ilIlLG2 = ilIlLG;
                            n = 0;
                        }
                        ilIlLG2.CP_N(n);
                    }
                    return;
                }
                ilIlLG.CP_O(ilIlPF.CP_e.CP_U());
                ilIlPF2 = ilIlPF;
                if (nArray == null) break block14;
                bl2 = ilIlPF2.CP_C instanceof CP_TI;
            }
            if (!bl2) {
                int n = ilIlPF.CP_C.CP_p();
                ilIlLG.CP_N(n);
                for (int i = 0; i < n; ++i) {
                    ilIlLG.CP_N(ilIlPF.CP_C.CP_T(i));
                    if (nArray != null) continue;
                }
            }
            ilIlPF2 = ilIlPF;
        }
        long[] lArray = ilIlPF2.CP_e.CP_UnderScore();
        if (nArray != null) {
            if (bl) {
                ilIlLG.CP_N(lArray.length);
            }
            ilIlLG.CP_M(lArray);
        }
    }

    @Deprecated
    public static CP_PF CP_B(CP_fC ilIlfC) {
        long l = a ^ 0x280986D8E1FCL;
        int n = Math.max(4, ilIlfC.CP_UnderScore() & (int)b);
        CP_xZ ilIlxZ = CP_PF.CP_W(CP_WW.CHUNK, n, ilIlfC, false);
        CP_QI ilIlQI = new CP_QI(n, ilIlfC.CP_g(ilIlfC.CP_O()));
        return new CP_PF(ilIlxZ, ilIlQI, CP_WW.CHUNK);
    }

    public int CP_V(int n, int n2, int n3) {
        long l = a ^ 0xB9148F1256AL;
        int[] nArray = CP_PF.CP_H();
        CP_PF ilIlPF = this;
        if (nArray != null) {
            if (ilIlPF.CP_e != null) {
                int n4 = this.CP_e.CP_o(CP_PF.CP_S(this.CP_p, n, n2, n3));
                return this.CP_C.CP_T(n4);
            }
            ilIlPF = this;
        }
        return ilIlPF.CP_C.CP_T(0);
    }

    public int CP_C(int n, int n2, int n3, int n4) {
        block7: {
            CP_PF ilIlPF;
            int n5;
            block6: {
                int[] nArray;
                block5: {
                    int n6;
                    block4: {
                        long l = a ^ 0x2811F8EE8067L;
                        n5 = this.CP_C.CP_Q(n4);
                        nArray = CP_PF.CP_H();
                        n6 = n5;
                        if (nArray == null) break block4;
                        if (n6 != -1) break block5;
                        this.CP_d();
                        n6 = this.CP_C.CP_Q(n4);
                    }
                    n5 = n6;
                }
                ilIlPF = this;
                if (nArray == null) break block6;
                if (ilIlPF.CP_e == null) break block7;
                ilIlPF = this;
            }
            int n7 = CP_PF.CP_S(ilIlPF.CP_p, n, n2, n3);
            int n8 = this.CP_e.CP_o(n7);
            this.CP_e.CP_r(n7, n5);
            return n8;
        }
        return n4;
    }

    /*
     * Unable to fully structure code
     */
    @Deprecated
    private static CP_xZ CP_W(CP_WW var0, int var1_1, CP_fC var2_2, boolean var3_3) {
        var4_4 = CP_PF.a ^ 18291508321012L;
        var6_5 = CP_PF.CP_H();
        v0 = var1_1;
        if (var6_5 != null) {
            if (v0 == 0) {
                v0 = (int)var3_3;
                if (var6_5 != null) {
                    if (v0 != 0) {
                        return new CP_Ca(var2_2);
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v0 = var1_1;
            }
        }
        v1 = var0.CP_c();
        if (var6_5 != null) {
            if (v0 <= v1) {
                v2 = var0.CP_v();
                if (var6_5 != null) {
                    v2 = v2 != 0 ? var0.CP_c() : var1_1;
                }
                var7_6 = v2;
                return new CP_qn(var7_6, var2_2);
            }
            v0 = var1_1;
            v1 = var0.CP_V();
        }
        if (v0 <= v1) {
            return new CP_S(var1_1, var2_2);
        }
        return CP_TI.CP_z;
    }

    /*
     * Unable to fully structure code
     */
    private void CP_d() {
        block8: {
            block9: {
                block10: {
                    var1_1 = CP_PF.a ^ 128707452800153L;
                    var4_2 = this.CP_C;
                    var3_3 = CP_PF.CP_H();
                    v0 = var5_4 = this.CP_e;
                    if (var3_3 == null) ** GOTO lbl8
                    if (v0 != null) {
                        v0 = var5_4;
lbl8:
                        // 2 sources

                        v1 = v0.CP_U();
                    } else {
                        v1 = 0;
                    }
                    var6_5 = v1;
                    this.CP_C = CP_PF.CP_f(var6_5 + 1, this.CP_p);
                    v2 = this;
                    if (var3_3 == null) break block9;
                    v2.CP_e = new CP_QH(this.CP_C.CP_o(), this.CP_p.CP_q());
                    if (var5_4 == null) break block10;
                    var8_7 = this.CP_p.CP_q();
                    for (var7_6 = 0; var7_6 < var8_7; ++var7_6) {
                        this.CP_e.CP_r(var7_6, this.CP_C.CP_Q(var4_2.CP_T(var5_4.CP_o(var7_6))));
                        if (var3_3 != null) {
                            if (var3_3 != null) continue;
                        }
                        break block8;
                    }
                    if (var3_3 != null) break block8;
                }
                v2 = this;
            }
            v2.CP_C.CP_Q(var4_2.CP_T(0));
        }
    }

    private static CP_xZ CP_f(int n, CP_WW ilIlWW) {
        long l = a ^ 0xA16F3751E99L;
        int[] nArray = CP_PF.CP_H();
        int n2 = n;
        int n3 = ilIlWW.CP_c();
        if (nArray != null) {
            if (n2 <= n3) {
                int n4 = ilIlWW.CP_v();
                if (nArray != null) {
                    n4 = n4 != 0 ? ilIlWW.CP_c() : n;
                }
                int n5 = n4;
                return new CP_qn(n5);
            }
            n2 = n;
            n3 = ilIlWW.CP_V();
        }
        if (n2 <= n3) {
            return new CP_S(n);
        }
        return CP_TI.CP_z;
    }

    private static int CP_S(CP_WW ilIlWW, int n, int n2, int n3) {
        return (n2 << ilIlWW.CP_P() | n3) << ilIlWW.CP_P() | n;
    }

    public static void CP_I(int[] nArray) {
        CP_d = nArray;
    }

    public static int[] CP_H() {
        return CP_d;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(1071572161106111136L, 501054701106524472L, MethodHandles.lookup().lookupClass()).a(53847044640662L);
        long l = a ^ 0x37B348AF547EL;
        CP_PF.CP_I(new int[4]);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -7445217947850657222L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

