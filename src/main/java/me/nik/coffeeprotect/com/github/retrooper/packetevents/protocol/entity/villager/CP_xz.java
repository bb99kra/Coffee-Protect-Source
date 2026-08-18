/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public final class CP_xz
extends Enum<CP_xz> {
    public static final /* enum */ CP_xz NOVICE;
    public static final /* enum */ CP_xz APPRENTICE;
    public static final /* enum */ CP_xz JOURNEYMAN;
    public static final /* enum */ CP_xz EXPERT;
    public static final /* enum */ CP_xz MASTER;
    private static final CP_xz[] CP_O;
    private static final /* synthetic */ CP_xz[] CP_v;
    private static PacketWrapper[] CP_W;
    private static final long a;

    public static CP_xz[] values() {
        return (CP_xz[])CP_v.clone();
    }

    public static CP_xz valueOf(String string) {
        return Enum.valueOf(CP_xz.class, string);
    }

    @Nullable
    public static CP_xz CP_f(int n) {
        block5: {
            int n2;
            int n3;
            block4: {
                long l = a ^ 0x429140AEAC9L;
                PacketWrapper[] packetWrapperArray = CP_xz.CP_F();
                n3 = n;
                n2 = 1;
                if (packetWrapperArray == null) break block4;
                if (n3 < n2) break block5;
                n3 = n;
                n2 = CP_O.length;
            }
            if (n3 <= n2) {
                return CP_O[n - 1];
            }
        }
        return null;
    }

    public int CP_a() {
        return this.ordinal() + 1;
    }

    private static /* synthetic */ CP_xz[] CP_v() {
        return new CP_xz[]{NOVICE, APPRENTICE, JOURNEYMAN, EXPERT, MASTER};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                CP_xz.a = CP_s.a(3633780522939610021L, 7361552020647629117L, MethodHandles.lookup().lookupClass()).a(249505504719443L);
                var9 = CP_xz.a ^ 92186024991041L;
                if (CP_xz.CP_F() == null) {
                    CP_xz.CP_A(new PacketWrapper[1]);
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
                var5_5 = "\u00cd[\u00a9\u0018\u00f3`\u00e9M\b\u00a2T#fq\u00d4\u0092\u0003\u0010\u0086=*\u00b4nZCC\u00b1Y\u001b\u00b3r\"\u00c8\u00ab";
                var7_6 = "\u00cd[\u00a9\u0018\u00f3`\u00e9M\b\u00a2T#fq\u00d4\u0092\u0003\u0010\u0086=*\u00b4nZCC\u00b1Y\u001b\u00b3r\"\u00c8\u00ab".length();
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
                    var0_3[var6_4++] = CP_xz.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u008eR\u00fa\u00acP*\u00f3mV\u0000\u00b5O\u00cc\u0098\u0003F\b\u00fe\b\u0006\u0096\u008az\u00b9-";
                    var7_6 = "\u008eR\u00fa\u00acP*\u00f3mV\u0000\u00b5O\u00cc\u0098\u0003F\b\u00fe\b\u0006\u0096\u008az\u00b9-".length();
                    var4_7 = 16;
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
                    var0_3[var6_4++] = CP_xz.a(var8_9).intern();
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
        CP_xz.NOVICE = new CP_xz();
        CP_xz.APPRENTICE = new CP_xz();
        CP_xz.JOURNEYMAN = new CP_xz();
        CP_xz.EXPERT = new CP_xz();
        CP_xz.MASTER = new CP_xz();
        CP_xz.CP_v = CP_xz.CP_v();
        CP_xz.CP_O = CP_xz.values();
    }

    public static void CP_A(PacketWrapper[] packetWrapperArray) {
        CP_W = packetWrapperArray;
    }

    public static PacketWrapper[] CP_F() {
        return CP_W;
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

