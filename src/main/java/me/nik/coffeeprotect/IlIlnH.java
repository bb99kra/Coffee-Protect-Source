/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public final class IlIlnH
extends Enum<IlIlnH> {
    public static final /* enum */ IlIlnH ALREADY_RUNNING;
    public static final /* enum */ IlIlnH NOT_RUNNING;
    public static final /* enum */ IlIlnH START_SUCCESS;
    public static final /* enum */ IlIlnH STOP_SUCCESS;
    private static final /* synthetic */ IlIlnH[] IlIlt;
    private static String IlIlV;

    public static IlIlnH[] values() {
        return (IlIlnH[])IlIlt.clone();
    }

    public static IlIlnH valueOf(String string) {
        return Enum.valueOf(IlIlnH.class, string);
    }

    private static /* synthetic */ IlIlnH[] IlIl_() {
        return new IlIlnH[]{ALREADY_RUNNING, NOT_RUNNING, START_SUCCESS, STOP_SUCCESS};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                var9 = IlIls.a((long)2065618915703431484L, (long)4775980645902561372L, MethodHandles.lookup().lookupClass()).a(188399767197180L) ^ 18803578378669L;
                if (IlIlnH.IlIlH() == null) {
                    IlIlnH.IlIlX("mj1xdb");
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
                    var0_3[var6_4++] = IlIlnH.a(var8_9).intern();
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
                    var0_3[var6_4++] = IlIlnH.a(var8_9).intern();
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
        IlIlnH.ALREADY_RUNNING = new IlIlnH();
        IlIlnH.NOT_RUNNING = new IlIlnH();
        IlIlnH.START_SUCCESS = new IlIlnH();
        IlIlnH.STOP_SUCCESS = new IlIlnH();
        IlIlnH.IlIlt = IlIlnH.IlIl_();
    }

    public static void IlIlX(String string) {
        IlIlV = string;
    }

    public static String IlIlH() {
        return IlIlV;
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

