/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_Wx
extends Enum<CP_Wx> {
    public static final /* enum */ CP_Wx CRASH;
    public static final /* enum */ CP_Wx LAG;
    public static final /* enum */ CP_Wx DAMAGE;
    public static final /* enum */ CP_Wx FAKECRASHER;
    public static final /* enum */ CP_Wx MINECRAFT;
    public static final /* enum */ CP_Wx ROTATE;
    private static final /* synthetic */ CP_Wx[] CP_N;
    private static final long a;
    private static final long b;

    public static CP_Wx[] values() {
        return (CP_Wx[])CP_N.clone();
    }

    public static CP_Wx valueOf(String string) {
        return Enum.valueOf(CP_Wx.class, string);
    }

    private static /* synthetic */ CP_Wx[] CP_J() {
        long l = a ^ 0x7212C37E3609L;
        CP_Wx[] ilIlWxArray = new CP_Wx[(int)b];
        ilIlWxArray[0] = CRASH;
        ilIlWxArray[1] = LAG;
        ilIlWxArray[2] = DAMAGE;
        ilIlWxArray[3] = FAKECRASHER;
        ilIlWxArray[4] = MINECRAFT;
        ilIlWxArray[5] = ROTATE;
        return ilIlWxArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_Wx.a = CP_s.a(-3593701472421390476L, 7800887396769718404L, MethodHandles.lookup().lookupClass()).a(275406963981720L);
                    var14 = CP_Wx.a ^ 90831910238790L;
                    var6_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var7_2 = 1; var7_2 < 8; ++var7_2) {
                        v2 = v2;
                        v2[var7_2] = (byte)(var14 << var7_2 * 8 >>> 56);
                    }
                    var6_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var5_3 = new String[6];
                    var11_4 = 0;
                    var10_5 = "Q\u00ddmP2c\u0082h\bm;\u00bfaL%d\u00a2\u0010\u00fdU\u00ca\u00bfj2\u00d1\u00bf\u00cd4\u001d\u0082\u00d90:\u0087\u0010v\u0095\u00e0\u0005\u00e4\\C\u00b4\u0086\u00cd\u00a5\u00cd0P7\u0019";
                    var12_6 = "Q\u00ddmP2c\u0082h\bm;\u00bfaL%d\u00a2\u0010\u00fdU\u00ca\u00bfj2\u00d1\u00bf\u00cd4\u001d\u0082\u00d90:\u0087\u0010v\u0095\u00e0\u0005\u00e4\\C\u00b4\u0086\u00cd\u00a5\u00cd0P7\u0019".length();
                    var9_7 = 8;
                    var8_8 = -1;
lbl19:
                    // 2 sources

                    while (true) {
                        v3 = ++var8_8;
                        v4 = var10_5.substring(v3, v3 + var9_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = CP_Wx.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = "\t\u0080\u00f9\u0015\u007f\u008bb*\be\u00bc\u00cd!\u0015\u000f\u0081\u00bc";
                        var12_6 = "\t\u0080\u00f9\u0015\u007f\u008bb*\be\u00bc\u00cd!\u0015\u000f\u0081\u00bc".length();
                        var9_7 = 8;
                        var8_8 = -1;
lbl33:
                        // 2 sources

                        while (true) {
                            v6 = ++var8_8;
                            v4 = var10_5.substring(v6, v6 + var9_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = CP_Wx.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var13_9 = var6_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl50:
                    // 1 sources

                    ** continue;
                }
            }
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var14 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl62:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 7932070295257835313L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_Wx.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        CP_Wx.CRASH = new CP_Wx();
        CP_Wx.LAG = new CP_Wx();
        CP_Wx.DAMAGE = new CP_Wx();
        CP_Wx.FAKECRASHER = new CP_Wx();
        CP_Wx.MINECRAFT = new CP_Wx();
        CP_Wx.ROTATE = new CP_Wx();
        CP_Wx.CP_N = CP_Wx.CP_J();
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }
}
