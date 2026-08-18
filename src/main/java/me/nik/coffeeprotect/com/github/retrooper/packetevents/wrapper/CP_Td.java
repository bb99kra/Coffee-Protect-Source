/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

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

public final class CP_Td
extends Enum<CP_Td> {
    public static final /* enum */ CP_Td ADD_PLAYER;
    public static final /* enum */ CP_Td INITIALIZE_CHAT;
    public static final /* enum */ CP_Td UPDATE_GAME_MODE;
    public static final /* enum */ CP_Td UPDATE_LISTED;
    public static final /* enum */ CP_Td UPDATE_LATENCY;
    public static final /* enum */ CP_Td UPDATE_DISPLAY_NAME;
    public static final /* enum */ CP_Td UPDATE_LIST_ORDER;
    public static final /* enum */ CP_Td UPDATE_HAT;
    public static final CP_Td[] VALUES;
    private static final CP_Td[] CP_d;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_Td[] values() {
        return (CP_Td[])CP_d.clone();
    }

    public static CP_Td valueOf(String string) {
        return Enum.valueOf(CP_Td.class, string);
    }

    private static CP_Td[] CP_v() {
        long l = a ^ 0x1152617E06AAL;
        CP_Td[] ilIlTdArray = new CP_Td[CP_Td.a("n", (int)18657, (long)(0x6C33BCD6A23C1F14L ^ l))];
        ilIlTdArray[0] = ADD_PLAYER;
        ilIlTdArray[1] = INITIALIZE_CHAT;
        ilIlTdArray[2] = UPDATE_GAME_MODE;
        ilIlTdArray[3] = UPDATE_LISTED;
        ilIlTdArray[4] = UPDATE_LATENCY;
        ilIlTdArray[5] = UPDATE_DISPLAY_NAME;
        ilIlTdArray[CP_Td.a("n", (int)14691, (long)(0xEB389899D996E95L ^ l))] = UPDATE_LIST_ORDER;
        ilIlTdArray[CP_Td.a("n", (int)5649, (long)(0x55B811AFF941E5L ^ l))] = UPDATE_HAT;
        return ilIlTdArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_Td.a = CP_s.a(-918316731851645615L, -7862179673896315112L, MethodHandles.lookup().lookupClass()).a(202320292359329L);
                        var20 = CP_Td.a ^ 117428159725625L;
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
                        var11_3 = new String[8];
                        var17_4 = 0;
                        var16_5 = "v\u0086\u0095\u00b2\u0002\u008aY\u0080A\u0095;\u00ae^\u0016\u00b5\u00f8\u0010v\u0086\u0095\u00b2\u0002\u008aY\u0080\u00da\u0082\u00c5\u008db\u0092\u00b2\u00e5\u0018\u00a9\u0096&\u00b9\u0096\u001ehXl\u001fOU*=\u009d\u00ce\u008b\u00bd+\u001d\u00a7Xl\u00cc\u0010\u0090\u009c;\u00ae'60\u00df\u00b8\u0019\u0001\u007f\u0083\u001eX\u00c0\u0018v\u0086\u0095\u00b2\u0002\u008aY\u0080\u00e7\u0015\u00b4R\"\u0095eQ\u0013T\u001f\u00b8hRg\u00ee\u0010\u00b0\u00e3\u00a1K\u00abL\u00c1\u00b5w\u000b\u0092\u00a8A=o\u0003";
                        var18_6 = "v\u0086\u0095\u00b2\u0002\u008aY\u0080A\u0095;\u00ae^\u0016\u00b5\u00f8\u0010v\u0086\u0095\u00b2\u0002\u008aY\u0080\u00da\u0082\u00c5\u008db\u0092\u00b2\u00e5\u0018\u00a9\u0096&\u00b9\u0096\u001ehXl\u001fOU*=\u009d\u00ce\u008b\u00bd+\u001d\u00a7Xl\u00cc\u0010\u0090\u009c;\u00ae'60\u00df\u00b8\u0019\u0001\u007f\u0083\u001eX\u00c0\u0018v\u0086\u0095\u00b2\u0002\u008aY\u0080\u00e7\u0015\u00b4R\"\u0095eQ\u0013T\u001f\u00b8hRg\u00ee\u0010\u00b0\u00e3\u00a1K\u00abL\u00c1\u00b5w\u000b\u0092\u00a8A=o\u0003".length();
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
                            var11_3[var17_4++] = CP_Td.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00af\u009a\u00fc|\u00e2)!\u00f8\u00c7\u00e3\u0080C\u00d3h\u00f4L\u0018n3\u000e\t\u00df./%\u00be\u00d6'\u00e55H\u008a\u00eb\u00af6'i\u00e4\u0091\u0087\u0019";
                            var18_6 = "\u00af\u009a\u00fc|\u00e2)!\u00f8\u00c7\u00e3\u0080C\u00d3h\u00f4L\u0018n3\u000e\t\u00df./%\u00be\u00d6'\u00e55H\u008a\u00eb\u00af6'i\u00e4\u0091\u0087\u0019".length();
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
                            var11_3[var17_4++] = CP_Td.a(var19_9).intern();
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
                CP_Td.d = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u00b6t\u0017\u000ed\u00f7{\u00e8\u0094\u00d6\u00c6p\u00fb~|\u0080\u000e!\u00d0\u0000>!\u00ef\u00bb";
                var5_15 = "\u00b6t\u0017\u000ed\u00f7{\u00e8\u0094\u00d6\u00c6p\u00fb~|\u0080\u000e!\u00d0\u0000>!\u00ef\u00bb".length();
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
                    var4_14 = "\u009b\u0098I$i\u00ce\u00ef\u00d2\u00c0\u00e3G`i\u00b3\u0097\u00fe";
                    var5_15 = "\u009b\u0098I$i\u00ce\u00ef\u00d2\u00c0\u00e3G`i\u00b3\u0097\u00fe".length();
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
        CP_Td.b = var6_12;
        CP_Td.c = new Integer[5];
        CP_Td.ADD_PLAYER = new CP_Td();
        CP_Td.INITIALIZE_CHAT = new CP_Td();
        CP_Td.UPDATE_GAME_MODE = new CP_Td();
        CP_Td.UPDATE_LISTED = new CP_Td();
        CP_Td.UPDATE_LATENCY = new CP_Td();
        CP_Td.UPDATE_DISPLAY_NAME = new CP_Td();
        CP_Td.UPDATE_LIST_ORDER = new CP_Td();
        CP_Td.UPDATE_HAT = new CP_Td();
        CP_Td.CP_d = CP_Td.CP_v();
        CP_Td.VALUES = CP_Td.values();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6325;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Td", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Td.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Td.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Td" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Td.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

