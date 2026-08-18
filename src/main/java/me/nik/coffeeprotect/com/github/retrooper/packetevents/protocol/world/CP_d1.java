/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_PF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
@ApiStatus.Internal
final class CP_d1 {
    private static final float CP_y = 0.75f;
    public static final int CP_e = -1;
    private long[] CP_d;
    private int CP_q;
    private int CP_M;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static transient /* synthetic */ String EVkONjEPpR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_d1(int n) {
        long l = a ^ 0x8B0EA4CA87CL;
        int n2 = CP_d1.CP_j(n);
        this.CP_M = (int)((float)n2 * 0.75f);
        this.CP_d = new long[n2];
        Arrays.fill(this.CP_d, (long)CP_d1.b("w", (int)32415, (long)(0x4455E699A41D8C56L ^ l)));
    }

    private static int CP_j(int n) {
        long l = a ^ 0x432580B61098L;
        int[] nArray = CP_PF.CP_H();
        int n2 = n;
        Object object = 1;
        if (nArray != null) {
            if (n2 <= object) {
                return 1;
            }
            n2 = 1;
            object = CP_d1.a("t", (int)25911, (long)(0x3E6EBB7D67EF35D5L ^ l)) - Integer.numberOfLeadingZeros(n - 1);
        }
        return n2 << object;
    }

    public int CP_k(int n) {
        int n2;
        block4: {
            long l;
            long l2 = a ^ 0x54C1C5AA4B03L;
            int n3 = this.CP_d.length - 1;
            int[] nArray = CP_PF.CP_H();
            int n4 = this.CP_T(n) & n3;
            while ((l = this.CP_d[n4]) != CP_d1.b("w", (int)32415, (long)(0x4455BAE88BFB6F29L ^ l2))) {
                n2 = (int)(l & CP_d1.b("w", (int)27148, (long)(0x3323E487FC0F7BB9L ^ l2)));
                if (nArray != null) {
                    int n5;
                    int n6 = n;
                    if (nArray != null) {
                        if (n2 == n6) {
                            return (int)(l >>> CP_d1.a("t", (int)25911, (long)(0x3E6EAC9922F36E4EL ^ l2)));
                        }
                        n5 = n4 + 1;
                        n6 = n3;
                    }
                    n4 = n5 & n6;
                    if (nArray != null) continue;
                }
                break block4;
            }
            n2 = -1;
        }
        return n2;
    }

    public void CP_z(int n, int n2) {
        block6: {
            long l;
            long l2 = a ^ 0x4109ECDB0146L;
            int[] nArray = CP_PF.CP_H();
            CP_d1 ilIld1 = this;
            if (nArray != null) {
                if (ilIld1.CP_q >= this.CP_M) {
                    this.CP_C(this.CP_d.length << 1);
                }
                ilIld1 = this;
            }
            long[] lArray = ilIld1.CP_d;
            int n3 = lArray.length - 1;
            int n4 = this.CP_T(n) & n3;
            while ((l = lArray[n4]) != CP_d1.b("w", (int)29519, (long)(0x2D8AF2A7F9D028BEL ^ l2))) {
                if (nArray != null) {
                    int n5 = (int)(l & CP_d1.b("w", (int)14888, (long)(0x71D2FB9D795861DAL ^ l2)));
                    int n6 = n;
                    if (nArray != null) {
                        if (n5 == n6) {
                            lArray[n4] = l & CP_d1.b("w", (int)27148, (long)(0x3323F14FD57E31FCL ^ l2)) | ((long)n2 & CP_d1.b("w", (int)27148, (long)(0x3323F14FD57E31FCL ^ l2))) << CP_d1.a("t", (int)13365, (long)(0x1AEA7EE6553A750AL ^ l2));
                            return;
                        }
                        n5 = n4 + 1;
                        n6 = n3;
                    }
                    n4 = n5 & n6;
                    if (nArray != null) continue;
                    PacketWrapper.CP_e(new int[3]);
                    break;
                }
                break block6;
            }
            lArray[n4] = (long)n & CP_d1.b("w", (int)27148, (long)(0x3323F14FD57E31FCL ^ l2)) | ((long)n2 & CP_d1.b("w", (int)27148, (long)(0x3323F14FD57E31FCL ^ l2))) << CP_d1.a("t", (int)25911, (long)(0x3E6EB9510B82240BL ^ l2));
            ++this.CP_q;
        }
    }

    public void CP_D(int n, int n2) {
        block7: {
            long l;
            long l2 = a ^ 0x6481F5AEED3DL;
            int[] nArray = CP_PF.CP_H();
            CP_d1 ilIld1 = this;
            if (nArray != null) {
                if (ilIld1.CP_q >= this.CP_M) {
                    this.CP_C(this.CP_d.length << 1);
                }
                ilIld1 = this;
            }
            long[] lArray = ilIld1.CP_d;
            int n3 = lArray.length - 1;
            int n4 = this.CP_T(n) & n3;
            while ((l = lArray[n4]) != CP_d1.b("w", (int)32415, (long)(0x44558AA8BBFFC917L ^ l2))) {
                if (nArray != null) {
                    int n5 = (int)(l & CP_d1.b("w", (int)27148, (long)(0x3323D4C7CC0BDD87L ^ l2)));
                    int n6 = n;
                    if (nArray != null) {
                        if (n5 == n6) {
                            return;
                        }
                        n5 = n4 + 1;
                        n6 = n3;
                    }
                    n4 = n5 & n6;
                    if (nArray != null) continue;
                }
                break block7;
            }
            lArray[n4] = (long)n & CP_d1.b("w", (int)27148, (long)(0x3323D4C7CC0BDD87L ^ l2)) | ((long)n2 & CP_d1.b("w", (int)27148, (long)(0x3323D4C7CC0BDD87L ^ l2))) << CP_d1.a("t", (int)25911, (long)(0x3E6E9CD912F7C870L ^ l2));
            ++this.CP_q;
        }
        if (PacketWrapper.CP_z() == null) {
            CP_PF.CP_I(new int[4]);
        }
    }

    private void CP_C(int n) {
        long l = a ^ 0x2FC66D2D4A64L;
        long[] lArray = this.CP_d;
        this.CP_M = (int)((float)n * 0.75f);
        long[] lArray2 = new long[n];
        Arrays.fill(lArray2, (long)CP_d1.b("w", (int)32415, (long)(0x4455C1EF237C6E4EL ^ l)));
        this.CP_d = lArray2;
        int n2 = n - 1;
        int[] nArray = CP_PF.CP_H();
        int n3 = 0;
        int n4 = lArray.length;
        while (n3 < n4) {
            block4: {
                block6: {
                    int n5;
                    long l2;
                    block5: {
                        l2 = lArray[n3];
                        long l3 = l2 - CP_d1.b("w", (int)32415, (long)(0x4455C1EF237C6E4EL ^ l));
                        n5 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                        if (nArray == null) break block5;
                        if (n5 == 0 && nArray != null) break block6;
                        n5 = (int)(l2 & CP_d1.b("w", (int)27148, (long)(0x33239F8054887ADEL ^ l)));
                    }
                    long l4 = n5;
                    int n6 = this.CP_T((int)l4) & n2;
                    while (lArray2[n6] != CP_d1.b("w", (int)32415, (long)(0x4455C1EF237C6E4EL ^ l))) {
                        n6 = n6 + 1 & n2;
                        if (nArray != null) {
                            if (nArray != null) continue;
                        }
                        break block4;
                    }
                    lArray2[n6] = l2;
                }
                ++n3;
            }
            if (nArray != null) continue;
        }
    }

    private int CP_T(int n) {
        long l = a ^ 0x6EC5982E39A5L;
        n ^= n >>> CP_d1.a("t", (int)11319, (long)(0x7C0C8B135AF8D5EEL ^ l));
        n *= CP_d1.a("t", (int)1836, (long)(0x66D74EE66407EF7L ^ l));
        n ^= n >>> CP_d1.a("t", (int)18237, (long)(0x288783F36673BEE5L ^ l));
        n *= CP_d1.a("t", (int)21448, (long)(0x6065190CF105AA12L ^ l));
        n ^= n >>> CP_d1.a("t", (int)30791, (long)(0x3EBE2F95DCC40199L ^ l));
        return n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block19: {
            block18: {
                block17: {
                    block16: {
                        CP_d1.a = CP_s.a(7814851857379719377L, 8152980332773421737L, MethodHandles.lookup().lookupClass()).a(253724717941049L);
                        CP_d1.d = new HashMap<K, V>(13);
                        var11 = CP_d1.a ^ 80895257140875L;
                        var13_1 = Cipher.getInstance("DES/CBC/NoPadding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var19_3 = new long[7];
                        var16_4 = 0;
                        var17_5 = "\u0084\"\u0089\u009a&\u00a6pD\u0004\u00da\u00d5b\u0007\u00d66D\u00a3\u00dc\u00f4\u00975\u00d6\u0093\u0083\u009fq)\u0080<\t\u00db\u00ad\u00b1EE*W\u0007(\u0011";
                        var18_6 = "\u0084\"\u0089\u009a&\u00a6pD\u0004\u00da\u00d5b\u0007\u00d66D\u00a3\u00dc\u00f4\u00975\u00d6\u0093\u0083\u009fq)\u0080<\t\u00db\u00ad\u00b1EE*W\u0007(\u0011".length();
                        var15_7 = 0;
                        while (true) {
                            var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                            v3 = var19_3;
                            v4 = var16_4++;
                            v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                            v6 = -1;
                            break block16;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            var17_5 = "\u0082K\u00afq\b,\u0099\u00ad\u009a\u0089\u0082\u00c6\u00a5,\u00e0\u008f";
                            var18_6 = "\u0082K\u00afq\b,\u0099\u00ad\u009a\u0089\u0082\u00c6\u00a5,\u00e0\u008f".length();
                            var15_7 = 0;
                            while (true) {
                                var20_8 = var17_5.substring(var15_7, var15_7 += 8).getBytes("ISO-8859-1");
                                v3 = var19_3;
                                v4 = var16_4++;
                                v5 = ((long)var20_8[0] & 255L) << 56 | ((long)var20_8[1] & 255L) << 48 | ((long)var20_8[2] & 255L) << 40 | ((long)var20_8[3] & 255L) << 32 | ((long)var20_8[4] & 255L) << 24 | ((long)var20_8[5] & 255L) << 16 | ((long)var20_8[6] & 255L) << 8 | (long)var20_8[7] & 255L;
                                v6 = 0;
                                break block16;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            v3[v4] = v7;
                            if (var15_7 < var18_6) ** continue;
                            break block17;
                            break;
                        }
                    }
                    var21_9 = v5;
                    var23_10 = var13_1.doFinal(new byte[]{(byte)(var21_9 >>> 56), (byte)(var21_9 >>> 48), (byte)(var21_9 >>> 40), (byte)(var21_9 >>> 32), (byte)(var21_9 >>> 24), (byte)(var21_9 >>> 16), (byte)(var21_9 >>> 8), (byte)var21_9});
                    v7 = ((long)var23_10[0] & 255L) << 56 | ((long)var23_10[1] & 255L) << 48 | ((long)var23_10[2] & 255L) << 40 | ((long)var23_10[3] & 255L) << 32 | ((long)var23_10[4] & 255L) << 24 | ((long)var23_10[5] & 255L) << 16 | ((long)var23_10[6] & 255L) << 8 | (long)var23_10[7] & 255L;
                    switch (v6) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_d1.b = var19_3;
                CP_d1.c = new Integer[7];
                CP_d1.g = new HashMap<K, V>(13);
                var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
                v8 = SecretKeyFactory.getInstance("DES");
                v9 = new byte[8];
                v10 = v9;
                v9[0] = (byte)(var11 >>> 56);
                for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                    v10 = v10;
                    v10[var1_12] = (byte)(var11 << var1_12 * 8 >>> 56);
                }
                var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
                var6_13 = new long[4];
                var3_14 = 0;
                var4_15 = "\u0095O\u00c9\u00e3n\u00d4|n\u00e9\u00ee>\u0096q\u00a4\u009f;";
                var5_16 = "\u0095O\u00c9\u00e3n\u00d4|n\u00e9\u00ee>\u0096q\u00a4\u009f;".length();
                var2_17 = 0;
                while (true) {
                    var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                    v11 = var6_13;
                    v12 = var3_14++;
                    v13 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                    v14 = -1;
                    break block18;
                    break;
                }
lbl79:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_17 < var5_16) ** continue;
                    var4_15 = "r\u0087\u00fc)\f\u00a0\u00ef\u001f\u0093S\u007f)7\u00c8<`";
                    var5_16 = "r\u0087\u00fc)\f\u00a0\u00ef\u001f\u0093S\u007f)7\u00c8<`".length();
                    var2_17 = 0;
                    while (true) {
                        var7_18 = var4_15.substring(var2_17, var2_17 += 8).getBytes("ISO-8859-1");
                        v11 = var6_13;
                        v12 = var3_14++;
                        v13 = ((long)var7_18[0] & 255L) << 56 | ((long)var7_18[1] & 255L) << 48 | ((long)var7_18[2] & 255L) << 40 | ((long)var7_18[3] & 255L) << 32 | ((long)var7_18[4] & 255L) << 24 | ((long)var7_18[5] & 255L) << 16 | ((long)var7_18[6] & 255L) << 8 | (long)var7_18[7] & 255L;
                        v14 = 0;
                        break block18;
                        break;
                    }
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    v11[v12] = v15;
                    if (var2_17 < var5_16) ** continue;
                    break block19;
                    break;
                }
            }
            var8_19 = v13;
            var10_20 = var0_11.doFinal(new byte[]{(byte)(var8_19 >>> 56), (byte)(var8_19 >>> 48), (byte)(var8_19 >>> 40), (byte)(var8_19 >>> 32), (byte)(var8_19 >>> 24), (byte)(var8_19 >>> 16), (byte)(var8_19 >>> 8), (byte)var8_19});
            v15 = ((long)var10_20[0] & 255L) << 56 | ((long)var10_20[1] & 255L) << 48 | ((long)var10_20[2] & 255L) << 40 | ((long)var10_20[3] & 255L) << 32 | ((long)var10_20[4] & 255L) << 24 | ((long)var10_20[5] & 255L) << 16 | ((long)var10_20[6] & 255L) << 8 | (long)var10_20[7] & 255L;
            switch (v14) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl105:
                // 1 sources

                ** continue;
            }
        }
        CP_d1.e = var6_13;
        CP_d1.f = new Long[4];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7906;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_d1", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_d1.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_d1.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_d1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x63CE;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_d1", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_d1.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_d1.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_d1" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_d1.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(CP_d1.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

