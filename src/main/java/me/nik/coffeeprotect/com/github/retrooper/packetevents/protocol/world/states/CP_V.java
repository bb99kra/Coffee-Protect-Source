/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_V
extends Enum<CP_V> {
    public static final /* enum */ CP_V ASCENDING_EAST;
    public static final /* enum */ CP_V ASCENDING_NORTH;
    public static final /* enum */ CP_V ASCENDING_SOUTH;
    public static final /* enum */ CP_V ASCENDING_WEST;
    public static final /* enum */ CP_V EAST_WEST;
    public static final /* enum */ CP_V INNER_LEFT;
    public static final /* enum */ CP_V INNER_RIGHT;
    public static final /* enum */ CP_V NORTH_EAST;
    public static final /* enum */ CP_V NORTH_SOUTH;
    public static final /* enum */ CP_V NORTH_WEST;
    public static final /* enum */ CP_V OUTER_LEFT;
    public static final /* enum */ CP_V OUTER_RIGHT;
    public static final /* enum */ CP_V SOUTH_EAST;
    public static final /* enum */ CP_V SOUTH_WEST;
    public static final /* enum */ CP_V STRAIGHT;
    private static final /* synthetic */ CP_V[] CP_O;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_V[] values() {
        return (CP_V[])CP_O.clone();
    }

    public static CP_V valueOf(String string) {
        return Enum.valueOf(CP_V.class, string);
    }

    private static /* synthetic */ CP_V[] CP_Y() {
        long l = a ^ 0xC7A34788FC2L;
        CP_V[] ilIlVArray = new CP_V[CP_V.a("f", (int)3091, (long)(0x529708A13E46ACEAL ^ l))];
        ilIlVArray[0] = ASCENDING_EAST;
        ilIlVArray[1] = ASCENDING_NORTH;
        ilIlVArray[2] = ASCENDING_SOUTH;
        ilIlVArray[3] = ASCENDING_WEST;
        ilIlVArray[4] = EAST_WEST;
        ilIlVArray[5] = INNER_LEFT;
        ilIlVArray[CP_V.a("f", (int)7959, (long)(0x207D1573ECF7BFE5L ^ l))] = INNER_RIGHT;
        ilIlVArray[CP_V.a("f", (int)6000, (long)(0x168047F814A2B781L ^ l))] = NORTH_EAST;
        ilIlVArray[CP_V.a("f", (int)970, (long)(0x1FC7ADEE7BC9A32BL ^ l))] = NORTH_SOUTH;
        ilIlVArray[CP_V.a("f", (int)22146, (long)(0x30BA7D2ECCD47671L ^ l))] = NORTH_WEST;
        ilIlVArray[CP_V.a("f", (int)16886, (long)(0x6486E53AC2286116L ^ l))] = OUTER_LEFT;
        ilIlVArray[CP_V.a("f", (int)5395, (long)(0x6C87ED3831A9B5E7L ^ l))] = OUTER_RIGHT;
        ilIlVArray[CP_V.a("f", (int)3317, (long)(0x35C8C47FC3682C17L ^ l))] = SOUTH_EAST;
        ilIlVArray[CP_V.a("f", (int)14513, (long)(0x6A531B90622D9841L ^ l))] = SOUTH_WEST;
        ilIlVArray[CP_V.a("f", (int)3653, (long)(0x70362DBB51582EBFL ^ l))] = STRAIGHT;
        return ilIlVArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_V.a = CP_s.a(-6543249740156396855L, -1597772957055437964L, MethodHandles.lookup().lookupClass()).a(145855691615545L);
                        var20 = CP_V.a ^ 92281188466492L;
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[15];
                        var17_4 = 0;
                        var16_5 = "\u000bnV\u00d1 \u0003\u00ec\u00c7\u00e40\u00fe}o\u00f5~w\u0010\u0094\u00b1\u00a5\u00b2\u0091\u0089\u00e5o\u00e7\u0002\u00f9\u00da\u00cf.\u00a2p\u0010\u008f\u00ce\u00b5h\u008e\u009c\u00b6\u0016\u00c9\u001e\r'\u009e,\u00af\u00e0\u0010\u000bnV\u00d1 \u0003\u00ec\u00c7m\u009b2U\u00f8\u00b3_:\u0010\u00a6\u0012S\u00d1\u00ec$B\u0084\u00abG\u00b2XR\u0098\u00f5\u0007\u0010\u00a0\u00c5\u00ad\u00dd\u00e5J\f\u00dd\u0086\t\u00c2\u00a5e\u00c9\u0003\u008d\u0010\f^@\u00af\u0014\u0000P0`\u0006\u0013\u00b4\u00dbk2:\u0010\u0004xo)\u00e7W\u00b4\u00d6\u00130)tY\u00f1\u0085\u0092\u0010\u000bnV\u00d1 \u0003\u00ec\u00c7\u00a5\u0015R\u001dHC)\u00f5\u0010\b\u00f7\u00f3\u0001\u00c2\u0084\u00fa\u00a2\u00cb=*.\u00baG\u00e4\u00f5\u0010\u00e3|x\u00d1\u00c5\u0088\t!\u00d2\u00f9\u00c9,!\b\u00eag\u0010\u000bnV\u00d1 \u0003\u00ec\u00c7w;\u000frzv\u0004S\u0010\u00ees\n8_\u00a3\u0090\u0088\u00de\u0007\u00cb)\u00a3\u00b0)y";
                        var18_6 = "\u000bnV\u00d1 \u0003\u00ec\u00c7\u00e40\u00fe}o\u00f5~w\u0010\u0094\u00b1\u00a5\u00b2\u0091\u0089\u00e5o\u00e7\u0002\u00f9\u00da\u00cf.\u00a2p\u0010\u008f\u00ce\u00b5h\u008e\u009c\u00b6\u0016\u00c9\u001e\r'\u009e,\u00af\u00e0\u0010\u000bnV\u00d1 \u0003\u00ec\u00c7m\u009b2U\u00f8\u00b3_:\u0010\u00a6\u0012S\u00d1\u00ec$B\u0084\u00abG\u00b2XR\u0098\u00f5\u0007\u0010\u00a0\u00c5\u00ad\u00dd\u00e5J\f\u00dd\u0086\t\u00c2\u00a5e\u00c9\u0003\u008d\u0010\f^@\u00af\u0014\u0000P0`\u0006\u0013\u00b4\u00dbk2:\u0010\u0004xo)\u00e7W\u00b4\u00d6\u00130)tY\u00f1\u0085\u0092\u0010\u000bnV\u00d1 \u0003\u00ec\u00c7\u00a5\u0015R\u001dHC)\u00f5\u0010\b\u00f7\u00f3\u0001\u00c2\u0084\u00fa\u00a2\u00cb=*.\u00baG\u00e4\u00f5\u0010\u00e3|x\u00d1\u00c5\u0088\t!\u00d2\u00f9\u00c9,!\b\u00eag\u0010\u000bnV\u00d1 \u0003\u00ec\u00c7w;\u000frzv\u0004S\u0010\u00ees\n8_\u00a3\u0090\u0088\u00de\u0007\u00cb)\u00a3\u00b0)y".length();
                        var15_7 = 16;
                        var14_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = CP_V.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00ff(\u0004\u00d8\u0012W\u00feLl\u00d5\u0092=\u00ef\u0002u\u00a3\u0010\u0083\u00fafN\u00b6\u0083w\u00b2`>t5\u0093\u0080~\u00d6";
                            var18_6 = "\u00ff(\u0004\u00d8\u0012W\u00feLl\u00d5\u0092=\u00ef\u0002u\u00a3\u0010\u0083\u00fafN\u00b6\u0083w\u00b2`>t5\u0093\u0080~\u00d6".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = CP_V.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                CP_V.d = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[19];
                var3_13 = 0;
                var4_14 = "X\u00cd\u00b77\u00a7\u00b0\u00d4\u0015R p\u00af\u00da\u001ern\u0010V7\u00e2\n\"UP\u00f6?d\u00cc\u00a7\u008bb\u00cdh\u000b\u00db\u0083Kt\u00c1\u00ff\u0010\u00bd{\u009bx\u00fai\u00f0p1\u00cb\u00dcU\u00b7\u00d7\u001e\u00ac\u00bb\u00a1V\u00f4\u00a6)\u00b8\u00b2\u00c5\u001f\u00b5\u00cc\u00a6\u008e&\u001a&u)\u0010\u0015y(\u001eM\u00c0\f\u00f2\u0090%\"1\u00a2\u00f7S\u009a\u000f\u00ba\u00db\u00d0 \u00d4Q\u000b\u00c5\u00bf\u00e9\u00bd\u00cc\u00a7\u008b\u009d\u0013k\u00a2\u00d0\u00ef=\u00b88\u00db\u00a0\u00d4\u00b8\u000f\u00b9$\t\u00fb9\u00a2\u00c9VW&4D)\u00be";
                var5_15 = "X\u00cd\u00b77\u00a7\u00b0\u00d4\u0015R p\u00af\u00da\u001ern\u0010V7\u00e2\n\"UP\u00f6?d\u00cc\u00a7\u008bb\u00cdh\u000b\u00db\u0083Kt\u00c1\u00ff\u0010\u00bd{\u009bx\u00fai\u00f0p1\u00cb\u00dcU\u00b7\u00d7\u001e\u00ac\u00bb\u00a1V\u00f4\u00a6)\u00b8\u00b2\u00c5\u001f\u00b5\u00cc\u00a6\u008e&\u001a&u)\u0010\u0015y(\u001eM\u00c0\f\u00f2\u0090%\"1\u00a2\u00f7S\u009a\u000f\u00ba\u00db\u00d0 \u00d4Q\u000b\u00c5\u00bf\u00e9\u00bd\u00cc\u00a7\u008b\u009d\u0013k\u00a2\u00d0\u00ef=\u00b88\u00db\u00a0\u00d4\u00b8\u000f\u00b9$\t\u00fb9\u00a2\u00c9VW&4D)\u00be".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00c2k\tl\n\u0088\u0001g\u00eb\u00af{\u00834\u00ac\u00c7\u0082";
                    var5_15 = "\u00c2k\tl\n\u0088\u0001g\u00eb\u00af{\u00834\u00ac\u00c7\u0082".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl101:
                // 1 sources

                ** continue;
            }
        }
        CP_V.b = var6_12;
        CP_V.c = new Integer[19];
        CP_V.ASCENDING_EAST = new CP_V();
        CP_V.ASCENDING_NORTH = new CP_V();
        CP_V.ASCENDING_SOUTH = new CP_V();
        CP_V.ASCENDING_WEST = new CP_V();
        CP_V.EAST_WEST = new CP_V();
        CP_V.INNER_LEFT = new CP_V();
        CP_V.INNER_RIGHT = new CP_V();
        CP_V.NORTH_EAST = new CP_V();
        CP_V.NORTH_SOUTH = new CP_V();
        CP_V.NORTH_WEST = new CP_V();
        CP_V.OUTER_LEFT = new CP_V();
        CP_V.OUTER_RIGHT = new CP_V();
        CP_V.SOUTH_EAST = new CP_V();
        CP_V.SOUTH_WEST = new CP_V();
        CP_V.STRAIGHT = new CP_V();
        CP_V.CP_O = CP_V.CP_Y();
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1FC7;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/states/CP_V", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_V.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_V.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/states/CP_V" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_V.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

