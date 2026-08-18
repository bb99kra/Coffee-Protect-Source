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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class CP_rk
extends Enum<CP_rk> {
    public static final /* enum */ CP_rk HANDSHAKING;
    public static final /* enum */ CP_rk STATUS;
    public static final /* enum */ CP_rk LOGIN;
    public static final /* enum */ CP_rk PLAY;
    public static final /* enum */ CP_rk CONFIGURATION;
    private static final /* synthetic */ CP_rk[] CP_y;
    private static PacketWrapper[] CP_b;
    private static final long a;

    public static CP_rk[] values() {
        return (CP_rk[])CP_y.clone();
    }

    public static CP_rk valueOf(String string) {
        return Enum.valueOf(CP_rk.class, string);
    }

    public static CP_rk CP_D(int n) {
        block4: {
            block3: {
                int n2;
                block2: {
                    long l = a ^ 0x1BB809C75C46L;
                    String string = CP_hC.CP_q();
                    n2 = n;
                    if (string != null) break block2;
                    if (n2 >= CP_rk.values().length) break block3;
                    n2 = n;
                }
                if (n2 >= 0) break block4;
            }
            return null;
        }
        return CP_rk.values()[n];
    }

    private static /* synthetic */ CP_rk[] CP_y() {
        return new CP_rk[]{HANDSHAKING, STATUS, LOGIN, PLAY, CONFIGURATION};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                CP_rk.a = CP_s.a(3448777516448371033L, -3096360546712184239L, MethodHandles.lookup().lookupClass()).a(93378886097347L);
                var9 = CP_rk.a ^ 53214876368918L;
                if (CP_rk.CP_L() == null) {
                    CP_rk.CP_o(new PacketWrapper[2]);
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
                var0_3 = new String[5];
                var6_4 = 0;
                var5_5 = ">\u00a2\u00a5O]%\u00daD\b\u009f\u008exic!\u009f\u0017\u0010\u00c3\u0094mwJ\u00daM\u00d0\u00c8Hg\u00b1\u00ae\u00c7\u00c5u";
                var7_6 = ">\u00a2\u00a5O]%\u00daD\b\u009f\u008exic!\u009f\u0017\u0010\u00c3\u0094mwJ\u00daM\u00d0\u00c8Hg\u00b1\u00ae\u00c7\u00c5u".length();
                var4_7 = 8;
                var3_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block11;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_rk.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "H\u008e\u00a8\u00d9\u0014N|\u0006\u0010\u00e3\u00f4l\u007f\u0095\u00beG\u0006\u0005[\u00f6\t\u00d2HgE";
                    var7_6 = "H\u008e\u00a8\u00d9\u0014N|\u0006\u0010\u00e3\u00f4l\u007f\u0095\u00beG\u0006\u0005[\u00f6\t\u00d2HgE".length();
                    var4_7 = 8;
                    var3_8 = -1;
lbl35:
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
lbl40:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_rk.a(var8_9).intern();
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        CP_rk.HANDSHAKING = new CP_rk();
        CP_rk.STATUS = new CP_rk();
        CP_rk.LOGIN = new CP_rk();
        CP_rk.PLAY = new CP_rk();
        CP_rk.CONFIGURATION = new CP_rk();
        CP_rk.CP_y = CP_rk.CP_y();
    }

    public static void CP_o(PacketWrapper[] packetWrapperArray) {
        CP_b = packetWrapperArray;
    }

    public static PacketWrapper[] CP_L() {
        return CP_b;
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

