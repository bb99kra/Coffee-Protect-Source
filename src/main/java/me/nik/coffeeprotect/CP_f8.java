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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class CP_f8
extends Enum<CP_f8> {
    public static final /* enum */ CP_f8 ALREADY_RUNNING;
    public static final /* enum */ CP_f8 NOT_RUNNING;
    public static final /* enum */ CP_f8 START_SUCCESS;
    public static final /* enum */ CP_f8 STOP_SUCCESS;
    private static final /* synthetic */ CP_f8[] CP_R;
    private static PacketWrapper[] CP_q;

    public static CP_f8[] values() {
        return (CP_f8[])CP_R.clone();
    }

    public static CP_f8 valueOf(String string) {
        return Enum.valueOf(CP_f8.class, string);
    }

    private static /* synthetic */ CP_f8[] CP_Q() {
        return new CP_f8[]{ALREADY_RUNNING, NOT_RUNNING, START_SUCCESS, STOP_SUCCESS};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                var9 = CP_s.a(-4969847925305332900L, -5020908437956997783L, MethodHandles.lookup().lookupClass()).a(95499711124675L) ^ 21093723602611L;
                if (CP_f8.CP_n() != null) {
                    CP_f8.CP_z(new PacketWrapper[3]);
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
                var5_5 = "E\u0000!M\u008f\u00ab\u0006\u00f6T\u00e4M\u00fa0B\u00af>\u0010\u00dc\u009d\u00c3j\u009b\u009dX\u00a4\u0006(q\u00b5\u00f6R\u00ac\u00a7";
                var7_6 = "E\u0000!M\u008f\u00ab\u0006\u00f6T\u00e4M\u00fa0B\u00af>\u0010\u00dc\u009d\u00c3j\u009b\u009dX\u00a4\u0006(q\u00b5\u00f6R\u00ac\u00a7".length();
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
                    var0_3[var6_4++] = CP_f8.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "_d\u009b\u0001Yl\u00e4\u007f\u0099mM\u00b33\u009fD\u00cd\u00102\u000f%@\u0087\u0011\u00adq\u00ed\u00f1\u00db\u001aB\u00e0\u009b\u00b5";
                    var7_6 = "_d\u009b\u0001Yl\u00e4\u007f\u0099mM\u00b33\u009fD\u00cd\u00102\u000f%@\u0087\u0011\u00adq\u00ed\u00f1\u00db\u001aB\u00e0\u009b\u00b5".length();
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
                    var0_3[var6_4++] = CP_f8.a(var8_9).intern();
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
        CP_f8.ALREADY_RUNNING = new CP_f8();
        CP_f8.NOT_RUNNING = new CP_f8();
        CP_f8.START_SUCCESS = new CP_f8();
        CP_f8.STOP_SUCCESS = new CP_f8();
        CP_f8.CP_R = CP_f8.CP_Q();
    }

    public static void CP_z(PacketWrapper[] packetWrapperArray) {
        CP_q = packetWrapperArray;
    }

    public static PacketWrapper[] CP_n() {
        return CP_q;
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
