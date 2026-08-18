/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_qr
extends Enum<CP_qr> {
    public static final /* enum */ CP_qr BASE;
    public static final /* enum */ CP_qr FRUSTUM;
    public static final /* enum */ CP_qr MIDDLE;
    public static final /* enum */ CP_qr TIP;
    public static final /* enum */ CP_qr TIP_MERGE;
    private static final /* synthetic */ CP_qr[] CP_h;

    public static CP_qr[] values() {
        return (CP_qr[])CP_h.clone();
    }

    public static CP_qr valueOf(String string) {
        return Enum.valueOf(CP_qr.class, string);
    }

    private static /* synthetic */ CP_qr[] CP_D() {
        return new CP_qr[]{BASE, FRUSTUM, MIDDLE, TIP, TIP_MERGE};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = CP_s.a(738974675250926493L, 6764059709532129944L, MethodHandles.lookup().lookupClass()).a(146678903075021L) ^ 50453886399609L;
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
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = "\u00bc,C\u00a5\u00d8\u0092~\u0004\b\u00ba\u00b9M\u0014\u00d0\u00ca\u0092\u000f\b\u00b6\u00b5R\u00ac\u0004\u00d0`\n";
                var7_6 = "\u00bc,C\u00a5\u00d8\u0092~\u0004\b\u00ba\u00b9M\u0014\u00d0\u00ca\u0092\u000f\b\u00b6\u00b5R\u00ac\u0004\u00d0`\n".length();
                var4_7 = 8;
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
                    var0_3[var6_4++] = CP_qr.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "'\u00f3Z\u0098\u00ac\u00a2\u008e\u00acU\u00c4\u0099\u00fd\u00d7\u00ba\r\u00a6\b\u00f21*\u00eb\u00fa#S\u0004";
                    var7_6 = "'\u00f3Z\u0098\u00ac\u00a2\u008e\u00acU\u00c4\u0099\u00fd\u00d7\u00ba\r\u00a6\b\u00f21*\u00eb\u00fa#S\u0004".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = CP_qr.a(var8_9).intern();
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
        CP_qr.BASE = new CP_qr();
        CP_qr.FRUSTUM = new CP_qr();
        CP_qr.MIDDLE = new CP_qr();
        CP_qr.TIP = new CP_qr();
        CP_qr.TIP_MERGE = new CP_qr();
        CP_qr.CP_h = CP_qr.CP_D();
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

