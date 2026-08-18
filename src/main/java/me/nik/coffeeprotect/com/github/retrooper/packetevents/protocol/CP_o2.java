/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_o2
extends Enum<CP_o2> {
    public static final /* enum */ CP_o2 CLIENT_SETTINGS;
    public static final /* enum */ CP_o2 PLUGIN_MESSAGE;
    public static final /* enum */ CP_o2 CONFIGURATION_END_ACK;
    public static final /* enum */ CP_o2 KEEP_ALIVE;
    public static final /* enum */ CP_o2 PONG;
    public static final /* enum */ CP_o2 RESOURCE_PACK_STATUS;
    private static final /* synthetic */ CP_o2[] CP_Q;
    private static final long a;
    private static final long b;

    public static CP_o2[] values() {
        return (CP_o2[])CP_Q.clone();
    }

    public static CP_o2 valueOf(String string) {
        return Enum.valueOf(CP_o2.class, string);
    }

    private static /* synthetic */ CP_o2[] CP_UnderScore() {
        long l = a ^ 0x481BCFA22597L;
        CP_o2[] ilIlo2Array = new CP_o2[(int)b];
        ilIlo2Array[0] = CLIENT_SETTINGS;
        ilIlo2Array[1] = PLUGIN_MESSAGE;
        ilIlo2Array[2] = CONFIGURATION_END_ACK;
        ilIlo2Array[3] = KEEP_ALIVE;
        ilIlo2Array[4] = PONG;
        ilIlo2Array[5] = RESOURCE_PACK_STATUS;
        return ilIlo2Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_o2.a = CP_s.a(4907320646322345625L, 7488222325970217372L, MethodHandles.lookup().lookupClass()).a(96308911503173L);
                    var14 = CP_o2.a ^ 79260534445124L;
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
                    var10_5 = "\u00d4\u00e1\u00c6\u0017\u00d6\u00e0\u009d\u00bf@\u00d3`\u001d\u00c0\u0013e\u00aa\u0018\u0018\u00f06\u00a2\u00c3\n\u00a9\u00ae\u00cf\u0080\u00ceOA%\u0093\u00ec\u00bf\u009fH\u0015(\u00fd\u00de\u00dc\b\u00e2#\u0007\u00a7\u008a\u0018.?\u0010\u00f0\u00c5e\u00b3\u00c5F\u001cc\u0012\u00c9\u00818+G[\u0097";
                    var12_6 = "\u00d4\u00e1\u00c6\u0017\u00d6\u00e0\u009d\u00bf@\u00d3`\u001d\u00c0\u0013e\u00aa\u0018\u0018\u00f06\u00a2\u00c3\n\u00a9\u00ae\u00cf\u0080\u00ceOA%\u0093\u00ec\u00bf\u009fH\u0015(\u00fd\u00de\u00dc\b\u00e2#\u0007\u00a7\u008a\u0018.?\u0010\u00f0\u00c5e\u00b3\u00c5F\u001cc\u0012\u00c9\u00818+G[\u0097".length();
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
                        var5_3[var11_4++] = CP_o2.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = "[7^\f\u008bZO}\u00e7\u001c\u00cf\u00a8\u007f\u00c9\u0086J9\u00fc\u00bbA\u00cb \u0093 \u0010\u007f\u00df\u00e5b8\u008c\u0016\u00ef\u00d3\u00af\u00a8z\u00d7f\u00c9;";
                        var12_6 = "[7^\f\u008bZO}\u00e7\u001c\u00cf\u00a8\u007f\u00c9\u0086J9\u00fc\u00bbA\u00cb \u0093 \u0010\u007f\u00df\u00e5b8\u008c\u0016\u00ef\u00d3\u00af\u00a8z\u00d7f\u00c9;".length();
                        var9_7 = 24;
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
                        var5_3[var11_4++] = CP_o2.a(var13_9).intern();
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
        var2_12 = 8126592318690879718L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_o2.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        CP_o2.CLIENT_SETTINGS = new CP_o2();
        CP_o2.PLUGIN_MESSAGE = new CP_o2();
        CP_o2.CONFIGURATION_END_ACK = new CP_o2();
        CP_o2.KEEP_ALIVE = new CP_o2();
        CP_o2.PONG = new CP_o2();
        CP_o2.RESOURCE_PACK_STATUS = new CP_o2();
        CP_o2.CP_Q = CP_o2.CP_UnderScore();
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

