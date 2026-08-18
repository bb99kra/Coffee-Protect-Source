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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_OO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_rl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Js;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_vJ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CP_qw
extends Enum<CP_qw>
implements CP_OO,
CP_rl {
    public static final /* enum */ CP_qw LOGIN_START;
    public static final /* enum */ CP_qw ENCRYPTION_RESPONSE;
    public static final /* enum */ CP_qw LOGIN_PLUGIN_RESPONSE;
    public static final /* enum */ CP_qw LOGIN_SUCCESS_ACK;
    public static final /* enum */ CP_qw COOKIE_RESPONSE;
    private final int CP_t;
    private final Class<? extends PacketWrapper<?>> CP_n;
    private static final CP_qw[] CP_M;
    private static final long a;

    public static CP_qw[] values() {
        return (CP_qw[])CP_M.clone();
    }

    public static CP_qw valueOf(String string) {
        return Enum.valueOf(CP_qw.class, string);
    }

    private CP_qw(int n2, Class<? extends PacketWrapper<?>> clazz) {
        this.CP_t = n2;
        this.CP_n = clazz;
    }

    @Override
    public Class<? extends PacketWrapper<?>> CP_B() {
        return this.CP_n;
    }

    @Nullable
    public static CP_oL CP_L(int n) {
        long l = a ^ 0x188B8D5DA428L;
        switch (n) {
            case 0: {
                return LOGIN_START;
            }
            case 1: {
                return ENCRYPTION_RESPONSE;
            }
            case 2: {
                return LOGIN_PLUGIN_RESPONSE;
            }
            case 3: {
                return LOGIN_SUCCESS_ACK;
            }
            case 4: {
                return COOKIE_RESPONSE;
            }
        }
        return null;
    }

    @Override
    public int CP_Y() {
        return this.CP_t;
    }

    @Override
    public CP_hC CP_Y() {
        return CP_hC.CLIENT;
    }

    private static CP_qw[] CP_G() {
        return new CP_qw[]{LOGIN_START, ENCRYPTION_RESPONSE, LOGIN_PLUGIN_RESPONSE, LOGIN_SUCCESS_ACK, COOKIE_RESPONSE};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_qw.a = CP_s.a(5642060626165805033L, 3973430114964317596L, MethodHandles.lookup().lookupClass()).a(76342431357628L);
                var9 = CP_qw.a ^ 61153164375567L;
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
                var5_5 = "\\\u009c\u0013\u008c\u00f2Q\u009b`\u0094'\u00ec\u009cj8\u0082q\u0018\u00f1S\\U\u00d9\u00b1\u00ea\u0016\u0004KBH \u00cc\u0098\u0017\u0098\u00ee\u0097\u00b8\"\u00c2/}\u00181\u009b8\u00a0A8\u0005\u009b,\u008f$\u0087\u00a8\u00a7(\u00cf\u001cR2\u00ca\u00faP\u00d8\u0080";
                var7_6 = "\\\u009c\u0013\u008c\u00f2Q\u009b`\u0094'\u00ec\u009cj8\u0082q\u0018\u00f1S\\U\u00d9\u00b1\u00ea\u0016\u0004KBH \u00cc\u0098\u0017\u0098\u00ee\u0097\u00b8\"\u00c2/}\u00181\u009b8\u00a0A8\u0005\u009b,\u008f$\u0087\u00a8\u00a7(\u00cf\u001cR2\u00ca\u00faP\u00d8\u0080".length();
                var4_7 = 16;
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
                    var0_3[var6_4++] = CP_qw.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u001a\u00c7\u00e6=\u00c0(g\u0014\u00eb\u0095\u00b1\u00e2\u001e\u00d2\u00beu\u00f1\u0007\u00cf|\u008d7\u00fb(\u0010T\u00edg\u00ba;\fC\u00e2\r\u00f5[\u00b8\u00f6,w/";
                    var7_6 = "\u001a\u00c7\u00e6=\u00c0(g\u0014\u00eb\u0095\u00b1\u00e2\u001e\u00d2\u00beu\u00f1\u0007\u00cf|\u008d7\u00fb(\u0010T\u00edg\u00ba;\fC\u00e2\r\u00f5[\u00b8\u00f6,w/".length();
                    var4_7 = 24;
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
                    var0_3[var6_4++] = CP_qw.a(var8_9).intern();
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
        CP_qw.LOGIN_START = new CP_qw(0, CP_Jg.class);
        CP_qw.ENCRYPTION_RESPONSE = new CP_qw(1, CP_Jx.class);
        CP_qw.LOGIN_PLUGIN_RESPONSE = new CP_qw(2, CP_Js.class);
        CP_qw.LOGIN_SUCCESS_ACK = new CP_qw(3, CP_JM.class);
        CP_qw.COOKIE_RESPONSE = new CP_qw(4, CP_vJ.class);
        CP_qw.CP_M = CP_qw.CP_G();
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

