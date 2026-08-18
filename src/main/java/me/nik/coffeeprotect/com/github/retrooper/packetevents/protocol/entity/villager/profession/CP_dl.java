/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession.CP_Xj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession.StaticVillagerProfession;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public final class CP_dl {
    private static final VersionedRegistry<CP_Xj> CP_S;
    public static final CP_Xj CP_q;
    public static final CP_Xj CP_c;
    public static final CP_Xj CP_f;
    public static final CP_Xj CP_UnderScore;
    public static final CP_Xj CP_O;
    public static final CP_Xj CP_u;
    public static final CP_Xj CP_p;
    public static final CP_Xj CP_W;
    public static final CP_Xj CP_T;
    public static final CP_Xj CP_Y;
    public static final CP_Xj CP_A;
    public static final CP_Xj CP_K;
    public static final CP_Xj CP_w;
    public static final CP_Xj CP_j;
    public static final CP_Xj CP_k;
    private static final long a;
    private static transient /* synthetic */ String rTeFuTpHBt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_dl() {
    }

    public static VersionedRegistry<CP_Xj> CP_o() {
        return CP_S;
    }

    @Deprecated
    @ApiStatus.Internal
    public static CP_Xj CP_i(int n, String string) {
        return CP_dl.CP_b(string);
    }

    @ApiStatus.Internal
    public static CP_Xj CP_b(String string) {
        return CP_S.define(string, StaticVillagerProfession::new);
    }

    @Deprecated
    public static CP_Xj CP_v(int n) {
        long l = a ^ 0x28BFE9920F99L;
        ServerVersion serverVersion = CP_r7.CP_b().CP_q().CP_F();
        boolean bl = StaticVillagerProfession.CP_f();
        CP_Xj ilIlXj = CP_dl.CP_Q(serverVersion.CP_E(), n);
        if (PacketWrapper.CP_z() == null) {
            StaticVillagerProfession.CP_o(!bl);
        }
        return ilIlXj;
    }

    public static CP_Xj CP_Q(ClientVersion clientVersion, int n) {
        return CP_S.getById(clientVersion, n);
    }

    public static CP_Xj CP_f(String string) {
        return CP_S.getByName(string);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_dl.a = CP_s.a(6664720753331629929L, -8035305334926856628L, MethodHandles.lookup().lookupClass()).a(20213678452411L);
                var9 = CP_dl.a ^ 9859124936371L;
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
                var0_3 = new String[16];
                var6_4 = 0;
                var5_5 = "\u00bd\u008c\u00b5\u0094\u00d6\u0019\u00a3e\b\u00ef`\u00ea\u00d5\u0019\u0011\u0014n\u0010l\u00e5\u00c3U\u008a\u00ba\u00f1\n\u0002\u00d4\u0081m\u0089D\u00bc\u00eb\b\u001d\u00b0|\u0096lt\u00abF\u0010\u00e1z\u00b7\u00d6\u0099\u00c0\u001b\u0081\u00cd\u00ac]v\u0099h\u00a7~\u0010\u00f7\u00d0\u00d6Q\u00a6n\u008f\u00e6\u00be3\u008e\u0013\u00e0.\u00a3\u00b0\bq8Z\u0018\u00049I\u00c6\u0010L\u00a0m\u00f2\u00f0G\u00ad\u00b2\u0087\u00fc/^\u00d5\u009apl\b\u00e8\u009dD@\u0089h\u00a5H\u0010iSf\u000b\u00fc\u00bd\u0093\u0005\n6g%\u001e\r\u00bbd\u0010\u0091\u0011>-2\u00a8s?\u008b7\u0006\u00ed5\u00a4Q\u00fd\u0018D\u0086.\u0006\u0010\u00f1f\u00f4\u00f0\u001e\u00ed\u00a4\u001c3\u00ae 3R\u00d2\u009c@'Yj\u0010\u00af\u009c7<\u00ba\u00fd\u00d04\u00a5~\u00017\u00a4\u00d4oj\u0010\u0086\u00ccV\u0013\u00ac\u00de\u00bd\u00ed\u00b1\u00f5\u00ca;\u00b9\u007f\u00ab\u0097";
                var7_6 = "\u00bd\u008c\u00b5\u0094\u00d6\u0019\u00a3e\b\u00ef`\u00ea\u00d5\u0019\u0011\u0014n\u0010l\u00e5\u00c3U\u008a\u00ba\u00f1\n\u0002\u00d4\u0081m\u0089D\u00bc\u00eb\b\u001d\u00b0|\u0096lt\u00abF\u0010\u00e1z\u00b7\u00d6\u0099\u00c0\u001b\u0081\u00cd\u00ac]v\u0099h\u00a7~\u0010\u00f7\u00d0\u00d6Q\u00a6n\u008f\u00e6\u00be3\u008e\u0013\u00e0.\u00a3\u00b0\bq8Z\u0018\u00049I\u00c6\u0010L\u00a0m\u00f2\u00f0G\u00ad\u00b2\u0087\u00fc/^\u00d5\u009apl\b\u00e8\u009dD@\u0089h\u00a5H\u0010iSf\u000b\u00fc\u00bd\u0093\u0005\n6g%\u001e\r\u00bbd\u0010\u0091\u0011>-2\u00a8s?\u008b7\u0006\u00ed5\u00a4Q\u00fd\u0018D\u0086.\u0006\u0010\u00f1f\u00f4\u00f0\u001e\u00ed\u00a4\u001c3\u00ae 3R\u00d2\u009c@'Yj\u0010\u00af\u009c7<\u00ba\u00fd\u00d04\u00a5~\u00017\u00a4\u00d4oj\u0010\u0086\u00ccV\u0013\u00ac\u00de\u00bd\u00ed\u00b1\u00f5\u00ca;\u00b9\u007f\u00ab\u0097".length();
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
                    var0_3[var6_4++] = CP_dl.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u0003\u00b6K\u0013\u00ebW\u00b4,\b\fc[0\u00adRp\u00cb";
                    var7_6 = "\u0003\u00b6K\u0013\u00ebW\u00b4,\b\fc[0\u00adRp\u00cb".length();
                    var4_7 = 8;
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
                    var0_3[var6_4++] = CP_dl.a(var8_9).intern();
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
        CP_dl.CP_S = new VersionedRegistry<T>(var0_3[11]);
        CP_dl.CP_q = CP_dl.CP_b(var0_3[8]);
        CP_dl.CP_c = CP_dl.CP_b(var0_3[15]);
        CP_dl.CP_f = CP_dl.CP_b(var0_3[3]);
        CP_dl.CP_UnderScore = CP_dl.CP_b(var0_3[10]);
        CP_dl.CP_O = CP_dl.CP_b(var0_3[0]);
        CP_dl.CP_u = CP_dl.CP_b(var0_3[6]);
        CP_dl.CP_p = CP_dl.CP_b(var0_3[7]);
        CP_dl.CP_W = CP_dl.CP_b(var0_3[13]);
        CP_dl.CP_T = CP_dl.CP_b(var0_3[2]);
        CP_dl.CP_Y = CP_dl.CP_b(var0_3[5]);
        CP_dl.CP_A = CP_dl.CP_b(var0_3[1]);
        CP_dl.CP_K = CP_dl.CP_b(var0_3[14]);
        CP_dl.CP_w = CP_dl.CP_b(var0_3[9]);
        CP_dl.CP_j = CP_dl.CP_b(var0_3[12]);
        CP_dl.CP_k = CP_dl.CP_b(var0_3[4]);
        CP_dl.CP_S.unloadMappings();
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

