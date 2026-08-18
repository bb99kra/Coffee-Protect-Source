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

public final class CP_nH
extends Enum<CP_nH> {
    public static final /* enum */ CP_nH ALREADY_RUNNING;
    public static final /* enum */ CP_nH NOT_RUNNING;
    public static final /* enum */ CP_nH START_SUCCESS;
    public static final /* enum */ CP_nH STOP_SUCCESS;
    private static final /* synthetic */ CP_nH[] CP_t;
    private static String CP_V;

    public static CP_nH[] values() {
        return (CP_nH[])CP_t.clone();
    }

    public static CP_nH valueOf(String string) {
        return Enum.valueOf(CP_nH.class, string);
    }

    private static /* synthetic */ CP_nH[] CP_UnderScore() {
        return new CP_nH[]{ALREADY_RUNNING, NOT_RUNNING, START_SUCCESS, STOP_SUCCESS};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                var9 = CP_s.a(2065618915703431484L, 4775980645902561372L, MethodHandles.lookup().lookupClass()).a(188399767197180L) ^ 18803578378669L;
                if (CP_nH.CP_H() == null) {
                    CP_nH.CP_X("mj1xdb");
                }
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[4];
                var6_4 = 0;
                var5_5 = "\u00c0\u00f5\u00a5\u009dhk\u00822\u00d7\u00d4\u000f\u00e2P\u00b0\u0094\u0083\u0010\u00ba\u00a0\u00cc\u00e9\u0089\u00a1\u0094\u00b8Ry\u00e6\u0087\u0003\u00e3h\u00ca";
                var7_6 = "\u00c0\u00f5\u00a5\u009dhk\u00822\u00d7\u00d4\u000f\u00e2P\u00b0\u0094\u0083\u0010\u00ba\u00a0\u00cc\u00e9\u0089\u00a1\u0094\u00b8Ry\u00e6\u0087\u0003\u00e3h\u00ca".length();
                var4_7 = 16;
                var3_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_nH.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0086\u00caN\u0093\u00f8\u00f3\u00b9J\u00f7\u00d0\u0096\u000e\u0016\u00c3v,\u0010\u00ad \u008a\f\u0012\u00be\u0091\u00fb\u00df'{\u00f7F\u008d6s";
                    var7_6 = "\u0086\u00caN\u0093\u00f8\u00f3\u00b9J\u00f7\u00d0\u0096\u000e\u0016\u00c3v,\u0010\u00ad \u008a\f\u0012\u00be\u0091\u00fb\u00df'{\u00f7F\u008d6s".length();
                    var4_7 = 16;
                    var3_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block11;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_nH.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block12;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        CP_nH.ALREADY_RUNNING = new CP_nH();
        CP_nH.NOT_RUNNING = new CP_nH();
        CP_nH.START_SUCCESS = new CP_nH();
        CP_nH.STOP_SUCCESS = new CP_nH();
        CP_nH.CP_t = CP_nH.CP_UnderScore();
    }

    public static void CP_X(String string) {
        CP_V = string;
    }

    public static String CP_H() {
        return CP_V;
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
