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

public final class CP_L9
extends Enum<CP_L9> {
    public static final /* enum */ CP_L9 ADD;
    public static final /* enum */ CP_L9 REMOVE;
    public static final /* enum */ CP_L9 UPDATE_HEALTH;
    public static final /* enum */ CP_L9 UPDATE_TITLE;
    public static final /* enum */ CP_L9 UPDATE_STYLE;
    public static final /* enum */ CP_L9 UPDATE_FLAGS;
    private static final CP_L9[] CP_e;
    private static final long a;
    private static final long b;

    public static CP_L9[] values() {
        return (CP_L9[])CP_e.clone();
    }

    public static CP_L9 valueOf(String string) {
        return Enum.valueOf(CP_L9.class, string);
    }

    private static CP_L9[] CP_L() {
        long l = a ^ 0xBDEF8B776A0L;
        CP_L9[] ilIlL9Array = new CP_L9[(int)b];
        ilIlL9Array[0] = ADD;
        ilIlL9Array[1] = REMOVE;
        ilIlL9Array[2] = UPDATE_HEALTH;
        ilIlL9Array[3] = UPDATE_TITLE;
        ilIlL9Array[4] = UPDATE_STYLE;
        ilIlL9Array[5] = UPDATE_FLAGS;
        return ilIlL9Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_L9.a = CP_s.a(-3579720733760057152L, 2617060414089886001L, MethodHandles.lookup().lookupClass()).a(42429185416818L);
                    var14 = CP_L9.a ^ 130396311165783L;
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
                    var10_5 = "e\u007f\u00dd\u00a6;e\u00ff\u009c\b1!\u00fa*\u009e\u00bd\u00a6\b'\u000b+ \u00e86\u00c0\u009b\u0010\u0096i\u00e2\u00deP\u0098bTg2\u00c5\u0097S,{\u008f\u0010*\u009a\\\u00f7\u00df\u001eq\u00a8(#@TMk\u00c7\u00a2";
                    var12_6 = "e\u007f\u00dd\u00a6;e\u00ff\u009c\b1!\u00fa*\u009e\u00bd\u00a6\b'\u000b+ \u00e86\u00c0\u009b\u0010\u0096i\u00e2\u00deP\u0098bTg2\u00c5\u0097S,{\u008f\u0010*\u009a\\\u00f7\u00df\u001eq\u00a8(#@TMk\u00c7\u00a2".length();
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
                        var5_3[var11_4++] = CP_L9.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = "\u00dc\u0001\u00b70-d\u00f9)\u0010R\u00ac\u00fa\u00edtEMS\u00ef?\n\u00ba\u00acw2\u001e";
                        var12_6 = "\u00dc\u0001\u00b70-d\u00f9)\u0010R\u00ac\u00fa\u00edtEMS\u00ef?\n\u00ba\u00acw2\u001e".length();
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
                        var5_3[var11_4++] = CP_L9.a(var13_9).intern();
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
        var2_12 = 5564929227616359416L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_L9.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        CP_L9.ADD = new CP_L9();
        CP_L9.REMOVE = new CP_L9();
        CP_L9.UPDATE_HEALTH = new CP_L9();
        CP_L9.UPDATE_TITLE = new CP_L9();
        CP_L9.UPDATE_STYLE = new CP_L9();
        CP_L9.UPDATE_FLAGS = new CP_L9();
        CP_L9.CP_e = CP_L9.CP_L();
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

