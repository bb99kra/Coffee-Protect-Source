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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Gd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_OO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CP_n0
extends Enum<CP_n0>
implements CP_OO,
CP_Gd {
    public static final /* enum */ CP_n0 DISCONNECT;
    public static final /* enum */ CP_n0 ENCRYPTION_REQUEST;
    public static final /* enum */ CP_n0 LOGIN_SUCCESS;
    public static final /* enum */ CP_n0 SET_COMPRESSION;
    public static final /* enum */ CP_n0 LOGIN_PLUGIN_REQUEST;
    public static final /* enum */ CP_n0 COOKIE_REQUEST;
    private final int CP_r;
    private final Class<? extends PacketWrapper<?>> CP_UnderScore;
    private static final CP_n0[] CP_z;
    private static final long a;
    private static final long b;

    public static CP_n0[] values() {
        return (CP_n0[])CP_z.clone();
    }

    public static CP_n0 valueOf(String string) {
        return Enum.valueOf(CP_n0.class, string);
    }

    private CP_n0(int n2, Class<? extends PacketWrapper<?>> clazz) {
        this.CP_r = n2;
        this.CP_UnderScore = clazz;
    }

    @Override
    public Class<? extends PacketWrapper<?>> CP_B() {
        return this.CP_UnderScore;
    }

    @Nullable
    public static CP_oL CP_I(int n) {
        long l = a ^ 0x439FA6A0A026L;
        switch (n) {
            case 0: {
                return DISCONNECT;
            }
            case 1: {
                return ENCRYPTION_REQUEST;
            }
            case 2: {
                return LOGIN_SUCCESS;
            }
            case 3: {
                return SET_COMPRESSION;
            }
            case 4: {
                return LOGIN_PLUGIN_REQUEST;
            }
            case 5: {
                return COOKIE_REQUEST;
            }
        }
        return null;
    }

    @Override
    public int CP_Y() {
        return this.CP_r;
    }

    @Override
    public CP_hC CP_Y() {
        return CP_hC.SERVER;
    }

    private static CP_n0[] CP_r() {
        long l = a ^ 0x20ABE0C15760L;
        CP_n0[] ilIln0Array = new CP_n0[(int)b];
        ilIln0Array[0] = DISCONNECT;
        ilIln0Array[1] = ENCRYPTION_REQUEST;
        ilIln0Array[2] = LOGIN_SUCCESS;
        ilIln0Array[3] = SET_COMPRESSION;
        ilIln0Array[4] = LOGIN_PLUGIN_REQUEST;
        ilIln0Array[5] = COOKIE_REQUEST;
        return ilIln0Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_n0.a = CP_s.a(542781442280052952L, 6601291122311854356L, MethodHandles.lookup().lookupClass()).a(100327148782888L);
                    var14 = CP_n0.a ^ 123958422054861L;
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
                    var10_5 = "\u0010\u00dbn\u009c.\u00b5$\u00e5\u0098\u0090\u00ef\u00d6y\u00e2\u0092\u00cdj`1\u00ab1\u00cf2q\u0010\u00c6\u00cc\u001c\u0018w6x\u001d;}\u001e\u0081^-~\u00d0\u0010\u008c\u00e6F\u0094\u00f5}\u00a2\u00ab\u00da\u0004u\u00d2~}\u00ecu\u0010\u00d1R\u00d7Mu\u000b\u00fa\u00c8\u008a,/\u00c9^\u00aa\u00be\u0002";
                    var12_6 = "\u0010\u00dbn\u009c.\u00b5$\u00e5\u0098\u0090\u00ef\u00d6y\u00e2\u0092\u00cdj`1\u00ab1\u00cf2q\u0010\u00c6\u00cc\u001c\u0018w6x\u001d;}\u001e\u0081^-~\u00d0\u0010\u008c\u00e6F\u0094\u00f5}\u00a2\u00ab\u00da\u0004u\u00d2~}\u00ecu\u0010\u00d1R\u00d7Mu\u000b\u00fa\u00c8\u008a,/\u00c9^\u00aa\u00be\u0002".length();
                    var9_7 = 24;
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
                        var5_3[var11_4++] = CP_n0.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = "\u0099\u0010I$\u0015\u00d77\u00e9\u00ae2|Ge\u00ea\u00d7\"\u0018\u00be=w\u00e3\u00d4w[m\u0082B\u00d0\u00a9\u0099c#\u00cb+\u00b7Wz)\u00b6\u0001W";
                        var12_6 = "\u0099\u0010I$\u0015\u00d77\u00e9\u00ae2|Ge\u00ea\u00d7\"\u0018\u00be=w\u00e3\u00d4w[m\u0082B\u00d0\u00a9\u0099c#\u00cb+\u00b7Wz)\u00b6\u0001W".length();
                        var9_7 = 16;
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
                        var5_3[var11_4++] = CP_n0.a(var13_9).intern();
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
        var2_12 = -675667635460758048L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_n0.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        CP_n0.DISCONNECT = new CP_n0(0, CP_JQ.class);
        CP_n0.ENCRYPTION_REQUEST = new CP_n0(1, CP_Jl.class);
        CP_n0.LOGIN_SUCCESS = new CP_n0(2, CP_JT.class);
        CP_n0.SET_COMPRESSION = new CP_n0(3, CP_Jm.class);
        CP_n0.LOGIN_PLUGIN_REQUEST = new CP_n0(4, CP_JC.class);
        CP_n0.COOKIE_REQUEST = new CP_n0(5, CP_Jw.class);
        CP_n0.CP_z = CP_n0.CP_r();
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

