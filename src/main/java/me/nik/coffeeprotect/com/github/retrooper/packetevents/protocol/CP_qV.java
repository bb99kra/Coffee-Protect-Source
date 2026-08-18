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

public final class CP_qV
extends Enum<CP_qV> {
    public static final /* enum */ CP_qV COOKIE_REQUEST;
    public static final /* enum */ CP_qV PLUGIN_MESSAGE;
    public static final /* enum */ CP_qV DISCONNECT;
    public static final /* enum */ CP_qV CONFIGURATION_END;
    public static final /* enum */ CP_qV KEEP_ALIVE;
    public static final /* enum */ CP_qV PING;
    public static final /* enum */ CP_qV RESET_CHAT;
    public static final /* enum */ CP_qV REGISTRY_DATA;
    public static final /* enum */ CP_qV RESOURCE_PACK_REMOVE;
    public static final /* enum */ CP_qV RESOURCE_PACK_SEND;
    public static final /* enum */ CP_qV STORE_COOKIE;
    public static final /* enum */ CP_qV TRANSFER;
    public static final /* enum */ CP_qV UPDATE_ENABLED_FEATURES;
    public static final /* enum */ CP_qV UPDATE_TAGS;
    public static final /* enum */ CP_qV SELECT_KNOWN_PACKS;
    private static final /* synthetic */ CP_qV[] CP_n;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_qV[] values() {
        return (CP_qV[])CP_n.clone();
    }

    public static CP_qV valueOf(String string) {
        return Enum.valueOf(CP_qV.class, string);
    }

    private static /* synthetic */ CP_qV[] CP_F() {
        long l = a ^ 0x7920B61CAF41L;
        CP_qV[] ilIlqVArray = new CP_qV[CP_qV.a("n", (int)20303, (long)(0x423A9E2C2D55A8E1L ^ l))];
        ilIlqVArray[0] = COOKIE_REQUEST;
        ilIlqVArray[1] = PLUGIN_MESSAGE;
        ilIlqVArray[2] = DISCONNECT;
        ilIlqVArray[3] = CONFIGURATION_END;
        ilIlqVArray[4] = KEEP_ALIVE;
        ilIlqVArray[5] = PING;
        ilIlqVArray[CP_qV.a("n", (int)14593, (long)(0x7ACCFDC1AD4ADEB9L ^ l))] = RESET_CHAT;
        ilIlqVArray[CP_qV.a("n", (int)6039, (long)(0x77E5B1836480702DL ^ l))] = REGISTRY_DATA;
        ilIlqVArray[CP_qV.a("n", (int)6695, (long)(0x2DF372332F387D99L ^ l))] = RESOURCE_PACK_REMOVE;
        ilIlqVArray[CP_qV.a("n", (int)5613, (long)(0x236145DB346CF251L ^ l))] = RESOURCE_PACK_SEND;
        ilIlqVArray[CP_qV.a("n", (int)32536, (long)(0xAE04D29F90998ADL ^ l))] = STORE_COOKIE;
        ilIlqVArray[CP_qV.a("n", (int)1425, (long)(0x121895A89FC46222L ^ l))] = TRANSFER;
        ilIlqVArray[CP_qV.a("n", (int)3947, (long)(0x731A60F0ED4C68D6L ^ l))] = UPDATE_ENABLED_FEATURES;
        ilIlqVArray[CP_qV.a("n", (int)18756, (long)(0x5A86929A87802EE8L ^ l))] = UPDATE_TAGS;
        ilIlqVArray[CP_qV.a("n", (int)1616, (long)(0x25D00810C934E1E0L ^ l))] = SELECT_KNOWN_PACKS;
        return ilIlqVArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_qV.a = CP_s.a(9120106804840119033L, 5331529541027703101L, MethodHandles.lookup().lookupClass()).a(32747349805433L);
                        var20 = CP_qV.a ^ 60846124566123L;
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
                        var16_5 = "\u001d\u00c7\t7\u00fbR\u0092\u00b3\u00a6\tfd\u0080\u00ea\u000e+\u00f9\u0001\u000f\u008a\u00a2\u00dd\u0014X\u0010\u008e\nq#\u00fa\u00fed\u00b7r\u00af\u0084y\u00f4D\u0006\u0006\u0010MhzW3\u0088\u008b\u00bb\u0094\f>dZ)%\u00ce\u0010\u0015\u009d\u001a-\u0014\u001c\u00c0\u00d6a1\u00d0;t@\u00b6|\u0010\u00cf\u00de\u00c5\u00cd\u00dd\u00b0\u00a3G\u00f4d\"\u00a9\u00dd\u00cdw\u00a0\u0018t\u00d4\u00f7hZ\u00f9\u00bc\u0006Fu9M\u00e3\u00e3wB\u00c2\u0095\u00b1\u00af\u00dd9\u0094C\u0018\u00db\u0006mc\u0093=\u00a6N\u008c\u008a\u00d1G\u0010,\u00db$\u00d2\u00f8?;\u00b6\u00d5\u0087\u00be\u0010\u0081R\u00a6\u00d9\u00a4\bo\u00e0\u00a9\u00ecN\u00fb\u00d4\u0002\u0004q\u0010\u00fe\u00e1\u00b3\u00b6X\n\u0086Q\u00a2\u00c30\u00ab\u0018n\n\u00fb\u00100\u00b9T\u0006?Q\u00b0\u00ccQ\u00f4q\u00f3\u00b4\u00888g\u0018T\u0010\u00c5\u00d9\u00e9\u00ce+1\u00ff\u00be\u00f4*\u001f\u0098%\u001dP\u00d9C$C\u00c7i\u00c2\u0010K\u00f8x\u008eQ\bo\u00b0I]\\\u0001\u00da&\u00d8\u0017\u0010\u00a8S\u008cd\u00dag+\u0005\u0007\u00ba\u00e5\u00f5%I\u007f\u00cf";
                        var18_6 = "\u001d\u00c7\t7\u00fbR\u0092\u00b3\u00a6\tfd\u0080\u00ea\u000e+\u00f9\u0001\u000f\u008a\u00a2\u00dd\u0014X\u0010\u008e\nq#\u00fa\u00fed\u00b7r\u00af\u0084y\u00f4D\u0006\u0006\u0010MhzW3\u0088\u008b\u00bb\u0094\f>dZ)%\u00ce\u0010\u0015\u009d\u001a-\u0014\u001c\u00c0\u00d6a1\u00d0;t@\u00b6|\u0010\u00cf\u00de\u00c5\u00cd\u00dd\u00b0\u00a3G\u00f4d\"\u00a9\u00dd\u00cdw\u00a0\u0018t\u00d4\u00f7hZ\u00f9\u00bc\u0006Fu9M\u00e3\u00e3wB\u00c2\u0095\u00b1\u00af\u00dd9\u0094C\u0018\u00db\u0006mc\u0093=\u00a6N\u008c\u008a\u00d1G\u0010,\u00db$\u00d2\u00f8?;\u00b6\u00d5\u0087\u00be\u0010\u0081R\u00a6\u00d9\u00a4\bo\u00e0\u00a9\u00ecN\u00fb\u00d4\u0002\u0004q\u0010\u00fe\u00e1\u00b3\u00b6X\n\u0086Q\u00a2\u00c30\u00ab\u0018n\n\u00fb\u00100\u00b9T\u0006?Q\u00b0\u00ccQ\u00f4q\u00f3\u00b4\u00888g\u0018T\u0010\u00c5\u00d9\u00e9\u00ce+1\u00ff\u00be\u00f4*\u001f\u0098%\u001dP\u00d9C$C\u00c7i\u00c2\u0010K\u00f8x\u008eQ\bo\u00b0I]\\\u0001\u00da&\u00d8\u0017\u0010\u00a8S\u008cd\u00dag+\u0005\u0007\u00ba\u00e5\u00f5%I\u007f\u00cf".length();
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
                            var11_3[var17_4++] = CP_qV.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u001d\u00c7\t7\u00fbR\u0092\u00b3~8\u00e4B\u0015\u0010\u00e1\u00d0\u008b)\u0094|k\u00ad\u001c%\bk\u008b\u00f9\u00aa\u009e\u00c6|6";
                            var18_6 = "\u001d\u00c7\t7\u00fbR\u0092\u00b3~8\u00e4B\u0015\u0010\u00e1\u00d0\u008b)\u0094|k\u00ad\u001c%\bk\u008b\u00f9\u00aa\u009e\u00c6|6".length();
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
                            var11_3[var17_4++] = CP_qV.a(var19_9).intern();
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
                CP_qV.d = new HashMap<K, V>(13);
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
                var4_14 = "[\u00cf\u00b5\u0099\u00acxP\u00db\u009c,*\u0094\u00fd~\u00c4o\u0086\u0014\u00d4\u00fdVC\u009d@TW\u00df\u0086\tIw\u0092\u00b4\u00da\u00e0L\u00e5\u00cdx\u00f9\u001b\u0001ln\u00bf\u00b7'sz[R\u0004\u00edGz\u001aR\u00fc9\u00c8TE\u00c7l\u007f\u00a9\u009d\u0011+\u00a2;\u00ef\u001b?z9i\u00b3\u0013\u00b2\u0007\u00f7\u0099i\u00c7?;\u00af\u00f5\u00cbI\u008bc\u00bbz\u00b8LFsr\u00c7\u00d2\u00e48\u00b4\u0004\u00a8\u0097\u00ff\u0011\u00cd\u00bb\u0088G\u00fe\u008d7\u00d3\u0088\u0017\b6,Q\u00e9=\u00f6\u0019\u00e7J\u0080\u00911l\u0007\u00b9";
                var5_15 = "[\u00cf\u00b5\u0099\u00acxP\u00db\u009c,*\u0094\u00fd~\u00c4o\u0086\u0014\u00d4\u00fdVC\u009d@TW\u00df\u0086\tIw\u0092\u00b4\u00da\u00e0L\u00e5\u00cdx\u00f9\u001b\u0001ln\u00bf\u00b7'sz[R\u0004\u00edGz\u001aR\u00fc9\u00c8TE\u00c7l\u007f\u00a9\u009d\u0011+\u00a2;\u00ef\u001b?z9i\u00b3\u0013\u00b2\u0007\u00f7\u0099i\u00c7?;\u00af\u00f5\u00cbI\u008bc\u00bbz\u00b8LFsr\u00c7\u00d2\u00e48\u00b4\u0004\u00a8\u0097\u00ff\u0011\u00cd\u00bb\u0088G\u00fe\u008d7\u00d3\u0088\u0017\b6,Q\u00e9=\u00f6\u0019\u00e7J\u0080\u00911l\u0007\u00b9".length();
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
                    var4_14 = "\u00ebT\u0096\u001eIk\u0013\u00c7\u00dc\u00eb\u00cb#\u00a2\u00f6\u00a1Y";
                    var5_15 = "\u00ebT\u0096\u001eIk\u0013\u00c7\u00dc\u00eb\u00cb#\u00a2\u00f6\u00a1Y".length();
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
        CP_qV.b = var6_12;
        CP_qV.c = new Integer[19];
        CP_qV.COOKIE_REQUEST = new CP_qV();
        CP_qV.PLUGIN_MESSAGE = new CP_qV();
        CP_qV.DISCONNECT = new CP_qV();
        CP_qV.CONFIGURATION_END = new CP_qV();
        CP_qV.KEEP_ALIVE = new CP_qV();
        CP_qV.PING = new CP_qV();
        CP_qV.RESET_CHAT = new CP_qV();
        CP_qV.REGISTRY_DATA = new CP_qV();
        CP_qV.RESOURCE_PACK_REMOVE = new CP_qV();
        CP_qV.RESOURCE_PACK_SEND = new CP_qV();
        CP_qV.STORE_COOKIE = new CP_qV();
        CP_qV.TRANSFER = new CP_qV();
        CP_qV.UPDATE_ENABLED_FEATURES = new CP_qV();
        CP_qV.UPDATE_TAGS = new CP_qV();
        CP_qV.SELECT_KNOWN_PACKS = new CP_qV();
        CP_qV.CP_n = CP_qV.CP_F();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16D8;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_qV", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_qV.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_qV.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_qV" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_qV.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

