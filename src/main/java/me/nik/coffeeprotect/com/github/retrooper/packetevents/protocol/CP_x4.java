/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

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

public final class CP_x4
extends Enum<CP_x4> {
    public static final /* enum */ CP_x4 CLIENT_SETTINGS;
    public static final /* enum */ CP_x4 COOKIE_RESPONSE;
    public static final /* enum */ CP_x4 PLUGIN_MESSAGE;
    public static final /* enum */ CP_x4 CONFIGURATION_END_ACK;
    public static final /* enum */ CP_x4 KEEP_ALIVE;
    public static final /* enum */ CP_x4 PONG;
    public static final /* enum */ CP_x4 RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_x4 SELECT_KNOWN_PACKS;
    private static final /* synthetic */ CP_x4[] CP_M;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_x4[] values() {
        return (CP_x4[])CP_M.clone();
    }

    public static CP_x4 valueOf(String string) {
        return Enum.valueOf(CP_x4.class, string);
    }

    private static /* synthetic */ CP_x4[] CP_i() {
        long l = a ^ 0x67A1867B8089L;
        CP_x4[] ilIlx4Array = new CP_x4[CP_x4.a("p", (int)16760, (long)(0x12E32335DAFCAAFDL ^ l))];
        ilIlx4Array[0] = CLIENT_SETTINGS;
        ilIlx4Array[1] = COOKIE_RESPONSE;
        ilIlx4Array[2] = PLUGIN_MESSAGE;
        ilIlx4Array[3] = CONFIGURATION_END_ACK;
        ilIlx4Array[4] = KEEP_ALIVE;
        ilIlx4Array[5] = PONG;
        ilIlx4Array[CP_x4.a("p", (int)13299, (long)(0x353C40DCC8AED874L ^ l))] = RESOURCE_PACK_STATUS;
        ilIlx4Array[CP_x4.a("p", (int)17587, (long)(0x77876F0A07382F31L ^ l))] = SELECT_KNOWN_PACKS;
        return ilIlx4Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_x4.a = CP_s.a(-1285022482879675004L, 2432940079503971921L, MethodHandles.lookup().lookupClass()).a(167392378795652L);
                        var20 = CP_x4.a ^ 138544330732488L;
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
                        var16_5 = "\u00d7\u0014\u0097\u00a3\u00f4\u00e2\t\u00b6$\u0003\u0011\u0091T\u00bd\u00cb%&P\u001c\f\u0000\u00154B\u0018\u00a8s~,\u0010lk\u009d\u008a\u00dal\u0093\u00aeOTT\u0090\u00c0\u00f6yC|\u00da>\u0010yxs\u00a3\u000b\u008f\u001b\u00b9\u00d3\u008bn\u008c\u009c\u00f8\u00b6=\bLn7\u00e7'I\u00b2\u00e4\u0010W\u001ct\u00c4\u000e\u00f8LM]\u00c0\u00d4\u00d3\u00ef\u00ab\u001f\u0013\u0018\u00d1\u008b\u00847\u0015\u0098\u00f1X\u0086\u00ef\u00a1.\u0082\u00c8|\u009d\u0012ms=\u00a7\u007f)\u0013";
                        var18_6 = "\u00d7\u0014\u0097\u00a3\u00f4\u00e2\t\u00b6$\u0003\u0011\u0091T\u00bd\u00cb%&P\u001c\f\u0000\u00154B\u0018\u00a8s~,\u0010lk\u009d\u008a\u00dal\u0093\u00aeOTT\u0090\u00c0\u00f6yC|\u00da>\u0010yxs\u00a3\u000b\u008f\u001b\u00b9\u00d3\u008bn\u008c\u009c\u00f8\u00b6=\bLn7\u00e7'I\u00b2\u00e4\u0010W\u001ct\u00c4\u000e\u00f8LM]\u00c0\u00d4\u00d3\u00ef\u00ab\u001f\u0013\u0018\u00d1\u008b\u00847\u0015\u0098\u00f1X\u0086\u00ef\u00a1.\u0082\u00c8|\u009d\u0012ms=\u00a7\u007f)\u0013".length();
                        var15_7 = 24;
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
                            var11_3[var17_4++] = CP_x4.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00a42*_\u008e\"\u00b6I'\u00a6\u00ff\u00c2\u00c62J\u0019\u0010QW\u00f0\u00ee\u00a7gH\u00c7)Vp\f\u0096\u00c7\"M";
                            var18_6 = "\u00a42*_\u008e\"\u00b6I'\u00a6\u00ff\u00c2\u00c62J\u0019\u0010QW\u00f0\u00ee\u00a7gH\u00c7)Vp\f\u0096\u00c7\"M".length();
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
                            var11_3[var17_4++] = CP_x4.a(var19_9).intern();
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
                CP_x4.d = new HashMap<K, V>(13);
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
                var4_14 = "\u00cf\u00eb\u0099H\u00d1\u00c7Jk\u0087\u001f\u001d-\u00179\u00ec\u00b7'\u00c9\u00b6\u00e1B\u00a5\u0010y";
                var5_15 = "\u00cf\u00eb\u0099H\u00d1\u00c7Jk\u0087\u001f\u001d-\u00179\u00ec\u00b7'\u00c9\u00b6\u00e1B\u00a5\u0010y".length();
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
                    var4_14 = "^\u00f0\u00a7!-\u00e0t\u00e0\u00adf:j\u00a4n\u00a7\u00f4";
                    var5_15 = "^\u00f0\u00a7!-\u00e0t\u00e0\u00adf:j\u00a4n\u00a7\u00f4".length();
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
        CP_x4.b = var6_12;
        CP_x4.c = new Integer[5];
        CP_x4.CLIENT_SETTINGS = new CP_x4();
        CP_x4.COOKIE_RESPONSE = new CP_x4();
        CP_x4.PLUGIN_MESSAGE = new CP_x4();
        CP_x4.CONFIGURATION_END_ACK = new CP_x4();
        CP_x4.KEEP_ALIVE = new CP_x4();
        CP_x4.PONG = new CP_x4();
        CP_x4.RESOURCE_PACK_STATUS = new CP_x4();
        CP_x4.SELECT_KNOWN_PACKS = new CP_x4();
        CP_x4.CP_M = CP_x4.CP_i();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3349;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_x4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_x4.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_x4.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_x4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_x4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

