/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_O0
extends Enum<CP_O0> {
    public static final /* enum */ CP_O0 SET_SIZE;
    public static final /* enum */ CP_O0 LERP_SIZE;
    public static final /* enum */ CP_O0 SET_CENTER;
    public static final /* enum */ CP_O0 INITIALIZE;
    public static final /* enum */ CP_O0 SET_WARNING_TIME;
    public static final /* enum */ CP_O0 SET_WARNING_BLOCKS;
    private static final CP_O0[] CP_P;
    private static final long a;
    private static final long b;

    public static CP_O0[] values() {
        return (CP_O0[])CP_P.clone();
    }

    public static CP_O0 valueOf(String string) {
        return Enum.valueOf(CP_O0.class, string);
    }

    public int CP_d() {
        return this.ordinal();
    }

    public static CP_O0 CP_m(int n) {
        return CP_O0.values()[n];
    }

    private static CP_O0[] CP_UnderScore() {
        long l = a ^ 0x6DA3BF845B4EL;
        CP_O0[] ilIlO0Array = new CP_O0[(int)b];
        ilIlO0Array[0] = SET_SIZE;
        ilIlO0Array[1] = LERP_SIZE;
        ilIlO0Array[2] = SET_CENTER;
        ilIlO0Array[3] = INITIALIZE;
        ilIlO0Array[4] = SET_WARNING_TIME;
        ilIlO0Array[5] = SET_WARNING_BLOCKS;
        return ilIlO0Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_O0.a = CP_s.a(901359574342960312L, -5072694968346888427L, MethodHandles.lookup().lookupClass()).a(33310262884678L);
                    var14 = CP_O0.a ^ 70412487261728L;
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
                    var10_5 = "%j\u00cb\u00ac\u0006\u0015\u00c4*H\u00db\u00ca\u00f4\u0081\u00d5\u00e60\u0010,\u00b8\u00fa\u00e8\u0083\u0003\"\u00db\u0081],|\u001e\u00de\u00fc!\u0010\"\u00d7\u0013V\u007f\u00e4\u001cP7\u00f9UB\u0001\u008d1\u008f\u0018?=ml\u0014j\u00c6\u0002\u00f6\u00aa\u0001;\u0081;\u0003`\u007f\u009f\u0095H\u00e5\u0087\u00be\u00fe";
                    var12_6 = "%j\u00cb\u00ac\u0006\u0015\u00c4*H\u00db\u00ca\u00f4\u0081\u00d5\u00e60\u0010,\u00b8\u00fa\u00e8\u0083\u0003\"\u00db\u0081],|\u001e\u00de\u00fc!\u0010\"\u00d7\u0013V\u007f\u00e4\u001cP7\u00f9UB\u0001\u008d1\u008f\u0018?=ml\u0014j\u00c6\u0002\u00f6\u00aa\u0001;\u0081;\u0003`\u007f\u009f\u0095H\u00e5\u0087\u00be\u00fe".length();
                    var9_7 = 16;
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
                        var5_3[var11_4++] = CP_O0.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = "k\u00d0]K\u00c7\u00b9\u00f8\u00b4\u00158\u00b0\u0016\u00ac\u00d7\u001c,\u0018?=ml\u0014j\u00c6\u0002x\u0013\u00f9\u00b7\u001f\\\u00be!\u00a4\u009a\u0092\u00ab\u0014\u0014\u0093\u00dd";
                        var12_6 = "k\u00d0]K\u00c7\u00b9\u00f8\u00b4\u00158\u00b0\u0016\u00ac\u00d7\u001c,\u0018?=ml\u0014j\u00c6\u0002x\u0013\u00f9\u00b7\u001f\\\u00be!\u00a4\u009a\u0092\u00ab\u0014\u0014\u0093\u00dd".length();
                        var9_7 = 16;
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
                        var5_3[var11_4++] = CP_O0.a(var13_9).intern();
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
        var2_12 = 4649939652271043242L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_O0.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        CP_O0.SET_SIZE = new CP_O0();
        CP_O0.LERP_SIZE = new CP_O0();
        CP_O0.SET_CENTER = new CP_O0();
        CP_O0.INITIALIZE = new CP_O0();
        CP_O0.SET_WARNING_TIME = new CP_O0();
        CP_O0.SET_WARNING_BLOCKS = new CP_O0();
        CP_O0.CP_P = CP_O0.CP_UnderScore();
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

