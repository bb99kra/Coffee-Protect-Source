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

public final class CP_rL
extends Enum<CP_rL> {
    public static final /* enum */ CP_rL CLIENT_SETTINGS;
    public static final /* enum */ CP_rL COOKIE_RESPONSE;
    public static final /* enum */ CP_rL PLUGIN_MESSAGE;
    public static final /* enum */ CP_rL CONFIGURATION_END_ACK;
    public static final /* enum */ CP_rL KEEP_ALIVE;
    public static final /* enum */ CP_rL PONG;
    public static final /* enum */ CP_rL RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_rL SELECT_KNOWN_PACKS;
    public static final /* enum */ CP_rL CUSTOM_CLICK_ACTION;
    private static final /* synthetic */ CP_rL[] CP_t;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_rL[] values() {
        return (CP_rL[])CP_t.clone();
    }

    public static CP_rL valueOf(String string) {
        return Enum.valueOf(CP_rL.class, string);
    }

    private static /* synthetic */ CP_rL[] CP_A() {
        long l = a ^ 0x1A5D0F2F713BL;
        CP_rL[] ilIlrLArray = new CP_rL[CP_rL.a("g", (int)19146, (long)(0x65A194B2E8ADCD4L ^ l))];
        ilIlrLArray[0] = CLIENT_SETTINGS;
        ilIlrLArray[1] = COOKIE_RESPONSE;
        ilIlrLArray[2] = PLUGIN_MESSAGE;
        ilIlrLArray[3] = CONFIGURATION_END_ACK;
        ilIlrLArray[4] = KEEP_ALIVE;
        ilIlrLArray[5] = PONG;
        ilIlrLArray[CP_rL.a("g", (int)29578, (long)(0xF7138E4EEB56595L ^ l))] = RESOURCE_PACK_STATUS;
        ilIlrLArray[CP_rL.a("g", (int)17143, (long)(0x2557F380B67854EFL ^ l))] = SELECT_KNOWN_PACKS;
        ilIlrLArray[CP_rL.a("g", (int)28703, (long)(0x1DCB407662386605L ^ l))] = CUSTOM_CLICK_ACTION;
        return ilIlrLArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_rL.a = CP_s.a(-8362401516165780563L, 6543114259578583864L, MethodHandles.lookup().lookupClass()).a(36565314521032L);
                        var20 = CP_rL.a ^ 100957041901707L;
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
                        var11_3 = new String[9];
                        var17_4 = 0;
                        var16_5 = "$\u0084\u0094\u00fbi\u00da\u00a2\u00e8\u00ae\u00de\u0005\u00d1\u00b2\u0095\u00f3j\u00d3\u0085\u00a7>p\u00e4\u00dbQ\u0010?Df\u009d\u0097\u00ba1\u00bf\u000f\u00d6\u00ae\u00f8\u0010\u0083\u009e\u009c\u0010\u00a9q\u001d~\u009f\u00bf\u0089\u0090\u001e,\u00cd\u00dd\u0088-L\u00eb\u0010\u0085\u00ea_\u00b9\u0088SJ\u00c1!_\u00ce\u00d5:\u008f\u0087\u0095\u0010\u009f\u00ab\u0088\u00f9B\u00f7\u0001%?s\u009e\u00d7ZX\u0013\u00d5\u0018BkT\u00b3* \u00e1%\u00b2\u00d9\u00ca\u00f8\u009b[h\u00f0J\u0085\u0096\u00c1.\fq\u0091\u0018\u00cbZ;\u0094\r\\G\u00ea\u00f1\u00af\u008aV\u0093\u00957H\u008c\u00c4\u009a\u0006\u0088w\u0001F";
                        var18_6 = "$\u0084\u0094\u00fbi\u00da\u00a2\u00e8\u00ae\u00de\u0005\u00d1\u00b2\u0095\u00f3j\u00d3\u0085\u00a7>p\u00e4\u00dbQ\u0010?Df\u009d\u0097\u00ba1\u00bf\u000f\u00d6\u00ae\u00f8\u0010\u0083\u009e\u009c\u0010\u00a9q\u001d~\u009f\u00bf\u0089\u0090\u001e,\u00cd\u00dd\u0088-L\u00eb\u0010\u0085\u00ea_\u00b9\u0088SJ\u00c1!_\u00ce\u00d5:\u008f\u0087\u0095\u0010\u009f\u00ab\u0088\u00f9B\u00f7\u0001%?s\u009e\u00d7ZX\u0013\u00d5\u0018BkT\u00b3* \u00e1%\u00b2\u00d9\u00ca\u00f8\u009b[h\u00f0J\u0085\u0096\u00c1.\fq\u0091\u0018\u00cbZ;\u0094\r\\G\u00ea\u00f1\u00af\u008aV\u0093\u00957H\u008c\u00c4\u009a\u0006\u0088w\u0001F".length();
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
                            var11_3[var17_4++] = CP_rL.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "9.\u0083J\u001b\u00ff\u0013\u00f4\u00faw\u0003\u007f\u0098R\u0000\u00f3\u00f0\u0097\\\u00ac\u0083\u00c6\u00de\u00ab\b\u00e9\u00c0\u00c4bP\u0003\u0005S";
                            var18_6 = "9.\u0083J\u001b\u00ff\u0013\u00f4\u00faw\u0003\u007f\u0098R\u0000\u00f3\u00f0\u0097\\\u00ac\u0083\u00c6\u00de\u00ab\b\u00e9\u00c0\u00c4bP\u0003\u0005S".length();
                            var15_7 = 24;
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
                            var11_3[var17_4++] = CP_rL.a(var19_9).intern();
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
                CP_rL.d = new HashMap<K, V>(13);
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
                var6_12 = new long[7];
                var3_13 = 0;
                var4_14 = "\u00ce\u0080)w\u0016\u007ft\u00f7\u008a\u001c\u0081\u00f0V\u00c1\u00a8\u0096?\u00e5`\u0012x0\u00c7\u00d3'\u00d4\u00d5\u00d9reqQ\u007f\u001fQ\u00a9\u00c0\u00aaD\u001f";
                var5_15 = "\u00ce\u0080)w\u0016\u007ft\u00f7\u008a\u001c\u0081\u00f0V\u00c1\u00a8\u0096?\u00e5`\u0012x0\u00c7\u00d3'\u00d4\u00d5\u00d9reqQ\u007f\u001fQ\u00a9\u00c0\u00aaD\u001f".length();
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
                    var4_14 = "y\u00ac\u00a4[\u0088\u00dc\u00ce\u00e7!&\u00dd?\u0092&\u00df\u00bf";
                    var5_15 = "y\u00ac\u00a4[\u0088\u00dc\u00ce\u00e7!&\u00dd?\u0092&\u00df\u00bf".length();
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
        CP_rL.b = var6_12;
        CP_rL.c = new Integer[7];
        CP_rL.CLIENT_SETTINGS = new CP_rL();
        CP_rL.COOKIE_RESPONSE = new CP_rL();
        CP_rL.PLUGIN_MESSAGE = new CP_rL();
        CP_rL.CONFIGURATION_END_ACK = new CP_rL();
        CP_rL.KEEP_ALIVE = new CP_rL();
        CP_rL.PONG = new CP_rL();
        CP_rL.RESOURCE_PACK_STATUS = new CP_rL();
        CP_rL.SELECT_KNOWN_PACKS = new CP_rL();
        CP_rL.CUSTOM_CLICK_ACTION = new CP_rL();
        CP_rL.CP_t = CP_rL.CP_A();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2BCE;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_rL", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_rL.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_rL.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_rL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_rL.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

