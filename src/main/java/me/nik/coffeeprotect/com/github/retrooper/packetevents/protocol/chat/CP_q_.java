/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.Parsers$Parser;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_q_ {
    public static final byte CP_k;
    public static final byte CP_v = 0;
    public static final byte CP_m = 1;
    public static final byte CP_X;
    public static final byte CP_UnderScore;
    public static final byte CP_W;
    public static final byte CP_o;
    public static final byte CP_r;
    public static final byte CP_b;
    private byte CP_J;
    private List<Integer> CP_A;
    private int CP_K;
    private Optional<String> CP_O;
    private Optional<Parsers$Parser> CP_E;
    private Optional<List<Object>> CP_t;
    private Optional<ResourceLocation> CP_V;
    private static final long a;
    private static transient /* synthetic */ String VgJWueCjfA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_q_(byte by, List<Integer> list, int n, @Nullable String string, @Nullable Integer n2, @Nullable List<Object> list2, @Nullable ResourceLocation resourceLocation) {
        long l = a ^ 0x5FCC4E3140C3L;
        this(by, list, n, string, n2 == null ? null : CP_xt.CP_o(CP_r7.CP_b().CP_q().CP_F().CP_E(), n2), list2, resourceLocation);
    }

    public CP_q_(byte by, List<Integer> list, int n, @Nullable String string, @Nullable Parsers$Parser parsers$Parser, @Nullable List<Object> list2, @Nullable ResourceLocation resourceLocation) {
        this.CP_J = by;
        this.CP_A = list;
        this.CP_K = n;
        this.CP_O = Optional.ofNullable(string);
        this.CP_E = Optional.ofNullable(parsers$Parser);
        this.CP_t = Optional.ofNullable(list2);
        this.CP_V = Optional.ofNullable(resourceLocation);
    }

    public byte CP_s() {
        return this.CP_J;
    }

    public void CP_k(byte by) {
        this.CP_J = by;
    }

    public List<Integer> CP_R() {
        return this.CP_A;
    }

    public void CP_r(List<Integer> list) {
        this.CP_A = list;
    }

    public int CP_X() {
        return this.CP_K;
    }

    public void CP_O(int n) {
        this.CP_K = n;
    }

    public Optional<String> CP_A() {
        return this.CP_O;
    }

    public void CP_p(Optional<String> optional) {
        this.CP_O = optional;
    }

    public Optional<Parsers$Parser> CP_T() {
        return this.CP_E;
    }

    public void CP_M(Optional<Parsers$Parser> optional) {
        this.CP_E = optional;
    }

    public Optional<Integer> CP_x() {
        return this.CP_E.map(parsers$Parser -> parsers$Parser.CP_H(CP_r7.CP_b().CP_q().CP_F().CP_E()));
    }

    public void CP_I(Optional<Integer> optional) {
        this.CP_E = optional.map(n -> CP_xt.CP_o(CP_r7.CP_b().CP_q().CP_F().CP_E(), n));
    }

    public Optional<List<Object>> CP_a() {
        return this.CP_t;
    }

    public void CP_f(Optional<List<Object>> optional) {
        this.CP_t = optional;
    }

    public Optional<ResourceLocation> CP_m() {
        return this.CP_V;
    }

    public void CP_s(Optional<ResourceLocation> optional) {
        this.CP_V = optional;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CP_q_.a = CP_s.a(-5452173219675741551L, -2543082033506372488L, MethodHandles.lookup().lookupClass()).a(36341780226670L);
                var1 = CP_q_.a ^ 114850733411200L;
                var3_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var1 >>> 56);
                for (var4_2 = 1; var4_2 < 8; ++var4_2) {
                    v2 = v2;
                    v2[var4_2] = (byte)(var1 << var4_2 * 8 >>> 56);
                }
                var3_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[7];
                var6_4 = 0;
                var7_5 = "|\u00deo\u00cc\u0007\u00c4\n\u00e5\u0005\u00ecib\u00d4b\u00f2\u00e9\u009ao\u0015\u00f7\u0005<\u00a69\u00c4\u0083\u008f\u00b3\u009c3\u007fD\u0010h\u008a\u00a1\u0018\u0014%L";
                var8_6 = "|\u00deo\u00cc\u0007\u00c4\n\u00e5\u0005\u00ecib\u00d4b\u00f2\u00e9\u009ao\u0015\u00f7\u0005<\u00a69\u00c4\u0083\u008f\u00b3\u009c3\u007fD\u0010h\u008a\u00a1\u0018\u0014%L".length();
                var5_7 = 0;
                while (true) {
                    var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var6_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var5_7 < var8_6) ** continue;
                    var7_5 = "$\u00f4f\u00c5~\u00ca~Dpv\u0083\u00ee\u00e4\u00d3\u009d\u0083";
                    var8_6 = "$\u00f4f\u00c5~\u00ca~Dpv\u0083\u00ee\u00e4\u00d3\u009d\u0083".length();
                    var5_7 = 0;
                    while (true) {
                        var9_8 = var7_5.substring(var5_7, var5_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var6_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl38:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var5_7 < var8_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var3_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        CP_q_.CP_W = (byte)var0_3[6];
        CP_q_.CP_b = (byte)var0_3[4];
        CP_q_.CP_UnderScore = (byte)var0_3[3];
        CP_q_.CP_X = (byte)var0_3[5];
        CP_q_.CP_r = (byte)var0_3[1];
        CP_q_.CP_k = (byte)var0_3[0];
        CP_q_.CP_o = (byte)var0_3[2];
    }
}

