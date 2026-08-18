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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_f9
extends Enum<CP_f9> {
    public static final /* enum */ CP_f9 NONE;
    public static final /* enum */ CP_f9 CLOCKWISE_90;
    public static final /* enum */ CP_f9 CLOCKWISE_180;
    public static final /* enum */ CP_f9 COUNTERCLOCKWISE_90;
    private static final /* synthetic */ CP_f9[] CP_O;

    public static CP_f9[] values() {
        return (CP_f9[])CP_O.clone();
    }

    public static CP_f9 valueOf(String string) {
        return Enum.valueOf(CP_f9.class, string);
    }

    private static /* synthetic */ CP_f9[] CP_r() {
        return new CP_f9[]{NONE, CLOCKWISE_90, CLOCKWISE_180, COUNTERCLOCKWISE_90};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = CP_s.a(7478831481032650836L, -5889624976693064527L, MethodHandles.lookup().lookupClass()).a(271319057252645L) ^ 38675920983699L;
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
                var5_5 = "\u00d4|\u00a2\u00aaA!\u008e\u00b1^3z\u009b\u00c5\u00d8\u00a5`\u0010\u00d4|\u00a2\u00aaA!\u008e\u00b1M\u00d4\u00cd\u00b7\u00f9\u001f\u00ac\u009d";
                var7_6 = "\u00d4|\u00a2\u00aaA!\u008e\u00b1^3z\u009b\u00c5\u00d8\u00a5`\u0010\u00d4|\u00a2\u00aaA!\u008e\u00b1M\u00d4\u00cd\u00b7\u00f9\u001f\u00ac\u009d".length();
                var4_7 = 16;
                var3_8 = -1;
lbl18:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_f9.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "~\r\u0093A\u00cd\u007f\u00d9r\u00b4\u0018\u0091\u00c3\u0011\u00f3s.\u001a\u008b\u00ccC\u0081\u00ff\u009cT\b\u00e3\u00fe\u0014\u00b9\u0082\u00c2\u00e8\u00b5";
                    var7_6 = "~\r\u0093A\u00cd\u007f\u00d9r\u00b4\u0018\u0091\u00c3\u0011\u00f3s.\u001a\u008b\u00ccC\u0081\u00ff\u009cT\b\u00e3\u00fe\u0014\u00b9\u0082\u00c2\u00e8\u00b5".length();
                    var4_7 = 24;
                    var3_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_f9.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl49:
                // 1 sources

                ** continue;
            }
        }
        CP_f9.NONE = new CP_f9();
        CP_f9.CLOCKWISE_90 = new CP_f9();
        CP_f9.CLOCKWISE_180 = new CP_f9();
        CP_f9.COUNTERCLOCKWISE_90 = new CP_f9();
        CP_f9.CP_O = CP_f9.CP_r();
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

