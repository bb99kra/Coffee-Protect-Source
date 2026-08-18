/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodecs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_XA
extends Enum<CP_XA>
implements CP_Xt {
    public static final /* enum */ CP_XA NONE;
    public static final /* enum */ CP_XA OVERWORLD;
    public static final /* enum */ CP_XA END;
    public static final NbtCodec<CP_XA> CODEC;
    private final String CP_V;
    private static final CP_XA[] CP_b;

    public static CP_XA[] values() {
        return (CP_XA[])CP_b.clone();
    }

    public static CP_XA valueOf(String string) {
        return Enum.valueOf(CP_XA.class, string);
    }

    private CP_XA(String string2) {
        this.CP_V = string2;
    }

    @Override
    public String CP_y() {
        return this.CP_V;
    }

    private static CP_XA[] CP_d() {
        return new CP_XA[]{NONE, OVERWORLD, END};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = CP_s.a(-1638695771672628712L, -2943781315486050291L, MethodHandles.lookup().lookupClass()).a(257096674306150L) ^ 120516610101378L;
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
                var0_3 = new String[6];
                var6_4 = 0;
                var5_5 = "\u00f6\n\u00f2\u0001\u00be\u0087\u0006\u00c9\b\u0081s\u00a5\u0019\u00adP\u00b8\u00c3\u0010\u00ac\u0005\u001d\u00fc\u00ca\u009a%\u000f\u00af\u00b1\u001c\u0001\u0000sf\u00fc\b\u00c3\u00a6J\u00fb\u00a8\u008d\u00b6G";
                var7_6 = "\u00f6\n\u00f2\u0001\u00be\u0087\u0006\u00c9\b\u0081s\u00a5\u0019\u00adP\u00b8\u00c3\u0010\u00ac\u0005\u001d\u00fc\u00ca\u009a%\u000f\u00af\u00b1\u001c\u0001\u0000sf\u00fc\b\u00c3\u00a6J\u00fb\u00a8\u008d\u00b6G".length();
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
                    var0_3[var6_4++] = CP_XA.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00161\u00b5\u00bd\u0019\u00fc\u00bc\u00f5<0QY\u0004\u00b2\u00aa\u00bb\b$\u00e9@v\u0012\u00ef\u00d9h";
                    var7_6 = "\u00161\u00b5\u00bd\u0019\u00fc\u00bc\u00f5<0QY\u0004\u00b2\u00aa\u00bb\b$\u00e9@v\u0012\u00ef\u00d9h".length();
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
                    var0_3[var6_4++] = CP_XA.a(var8_9).intern();
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
        CP_XA.NONE = new CP_XA(var0_3[5]);
        CP_XA.OVERWORLD = new CP_XA(var0_3[4]);
        CP_XA.END = new CP_XA(var0_3[1]);
        CP_XA.CP_b = CP_XA.CP_d();
        CP_XA.CODEC = NbtCodecs.CP_j((Enum[])CP_XA.values());
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

