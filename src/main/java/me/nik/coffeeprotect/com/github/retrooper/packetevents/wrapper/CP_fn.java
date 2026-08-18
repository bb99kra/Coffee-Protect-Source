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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public final class CP_fn
extends Enum<CP_fn> {
    public static final /* enum */ CP_fn NONE;
    public static final /* enum */ CP_fn FRIENDLY_FIRE;
    public static final /* enum */ CP_fn FRIENDLY_CAN_SEE_INVISIBLE;
    public static final /* enum */ CP_fn ALL;
    private static final CP_fn[] CP_F;
    private final byte CP_B;
    private static final CP_fn[] CP_X;
    private static final long a;

    public static CP_fn[] values() {
        return (CP_fn[])CP_X.clone();
    }

    public static CP_fn valueOf(String string) {
        return Enum.valueOf(CP_fn.class, string);
    }

    private CP_fn(byte by) {
        this.CP_B = by;
    }

    public byte CP_H() {
        return this.CP_B;
    }

    @Nullable
    public static CP_fn CP_Y(byte by) {
        long l = a ^ 0x1EB603A1626BL;
        CP_fn[] ilIlfnArray = CP_F;
        int n = ilIlfnArray.length;
        int n2 = 0;
        PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
        while (n2 < n) {
            CP_fn ilIlfn = ilIlfnArray[n2];
            if (packetWrapperArray != null) {
                if (ilIlfn.CP_H() == by) {
                    return ilIlfn;
                }
                ++n2;
            }
            if (packetWrapperArray != null) continue;
        }
        return null;
    }

    private static CP_fn[] CP_w() {
        return new CP_fn[]{NONE, FRIENDLY_FIRE, FRIENDLY_CAN_SEE_INVISIBLE, ALL};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_fn.a = CP_s.a(-8510460727192377355L, -3667727268035060075L, MethodHandles.lookup().lookupClass()).a(78610529331320L);
                var9 = CP_fn.a ^ 107224333317340L;
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
                var5_5 = "\u00dew\u0097\u0010\u0091\u0002zF\b\u0082\u008f\u0017\u00c1\u00b7\u00ba\u00bb[";
                var7_6 = "\u00dew\u0097\u0010\u0091\u0002zF\b\u0082\u008f\u0017\u00c1\u00b7\u00ba\u00bb[".length();
                var4_7 = 8;
                var3_8 = -1;
lbl19:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_fn.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u00c5\u001c\u00df\u00acH\u00a4\u00f7\u0004wN>OU\u007f\u00c9F \u00c5\u001c\u00df\u00acH\u00a4\u00f7\u00043\u00ac\u0004\u00da6o+\u00d6\u001eJ\u00a7\u009e\u000e\u00cb|\u00da\u00b2\u0014\u00fd\u0001)\u0000\u00dd\u0092";
                    var7_6 = "\u00c5\u001c\u00df\u00acH\u00a4\u00f7\u0004wN>OU\u007f\u00c9F \u00c5\u001c\u00df\u00acH\u00a4\u00f7\u00043\u00ac\u0004\u00da6o+\u00d6\u001eJ\u00a7\u009e\u000e\u00cb|\u00da\u00b2\u0014\u00fd\u0001)\u0000\u00dd\u0092".length();
                    var4_7 = 16;
                    var3_8 = -1;
lbl33:
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
lbl38:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_fn.a(var8_9).intern();
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
lbl50:
                // 1 sources

                ** continue;
            }
        }
        CP_fn.NONE = new CP_fn(0);
        CP_fn.FRIENDLY_FIRE = new CP_fn(1);
        CP_fn.FRIENDLY_CAN_SEE_INVISIBLE = new CP_fn(2);
        CP_fn.ALL = new CP_fn(3);
        CP_fn.CP_X = CP_fn.CP_w();
        CP_fn.CP_F = CP_fn.values();
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

