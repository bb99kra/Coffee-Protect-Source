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

public final class CP_yl
extends Enum<CP_yl> {
    public static final /* enum */ CP_yl PLUGIN_MESSAGE;
    public static final /* enum */ CP_yl DISCONNECT;
    public static final /* enum */ CP_yl CONFIGURATION_END;
    public static final /* enum */ CP_yl KEEP_ALIVE;
    public static final /* enum */ CP_yl PING;
    public static final /* enum */ CP_yl REGISTRY_DATA;
    public static final /* enum */ CP_yl RESOURCE_PACK_REMOVE;
    public static final /* enum */ CP_yl RESOURCE_PACK_SEND;
    public static final /* enum */ CP_yl UPDATE_ENABLED_FEATURES;
    public static final /* enum */ CP_yl UPDATE_TAGS;
    private static final /* synthetic */ CP_yl[] CP_l;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_yl[] values() {
        return (CP_yl[])CP_l.clone();
    }

    public static CP_yl valueOf(String string) {
        return Enum.valueOf(CP_yl.class, string);
    }

    private static /* synthetic */ CP_yl[] CP_v() {
        long l = a ^ 0x29FF3FBBF130L;
        CP_yl[] ilIlylArray = new CP_yl[CP_yl.a("x", (int)18348, (long)(0x403922369F2FDDF8L ^ l))];
        ilIlylArray[0] = PLUGIN_MESSAGE;
        ilIlylArray[1] = DISCONNECT;
        ilIlylArray[2] = CONFIGURATION_END;
        ilIlylArray[3] = KEEP_ALIVE;
        ilIlylArray[4] = PING;
        ilIlylArray[5] = REGISTRY_DATA;
        ilIlylArray[CP_yl.a("x", (int)22191, (long)(0x1F849026A1A34CFDL ^ l))] = RESOURCE_PACK_REMOVE;
        ilIlylArray[CP_yl.a("x", (int)17112, (long)(0x1E2124A3F53CD887L ^ l))] = RESOURCE_PACK_SEND;
        ilIlylArray[CP_yl.a("x", (int)25209, (long)(0x6F60AAD1675A782CL ^ l))] = UPDATE_ENABLED_FEATURES;
        ilIlylArray[CP_yl.a("x", (int)6489, (long)(0x28DE6826792D030AL ^ l))] = UPDATE_TAGS;
        return ilIlylArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_yl.a = CP_s.a(1118121006029383013L, 9028034427056739541L, MethodHandles.lookup().lookupClass()).a(117581247972199L);
                        var20 = CP_yl.a ^ 131181867260828L;
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
                        var11_3 = new String[10];
                        var17_4 = 0;
                        var16_5 = "c\u00a9':6\u009f\u00ec*\u00d6y\u00a7}\u00d6\u0090\u00b5\u001b\bc~\u00bb\u0013\u001c\u009b,\n\u0010\u00ff\u0097\tT\u0085\u00ad\u008e\u0011Hx\u00dd\u00a9\u0081\u00ca\u00cd\u00e0\u0010\u00b2\u0013\u00ff\u00d5\u0014\u00bc\u00ab!\u0001\u00ce\u009b\u00c8\u0086\u0015\u0097Q\u00181&\u00ca\u00dd\r\u00b4\u001dg\u00f1\u00f1\u0001\u00eaZ \u009fW'\u00dc\u00c1|\u00fb\u0010\u00f4=\u0010H\u00e9}} N#\u00e8\u0001\u00b1\u0087\u00aflC\u00bd\u00c4\u0018\u00a6\u00af\u00dcQ\u00ce\u00de\u00e2$&\u00bb\u00f7\b~\u00deu)<\u00f4W\u00d7\u000e(\u00b4\u0085\u0018\u00fb\u0083\u00e2\u00c0\u00fe\u00e4\u00a5\u00ac\u00cd\u0013\u008c\u00c7\u00bdc,\u0089\u00be\u00ec\u00be\u00a7\u009e>x\u000e";
                        var18_6 = "c\u00a9':6\u009f\u00ec*\u00d6y\u00a7}\u00d6\u0090\u00b5\u001b\bc~\u00bb\u0013\u001c\u009b,\n\u0010\u00ff\u0097\tT\u0085\u00ad\u008e\u0011Hx\u00dd\u00a9\u0081\u00ca\u00cd\u00e0\u0010\u00b2\u0013\u00ff\u00d5\u0014\u00bc\u00ab!\u0001\u00ce\u009b\u00c8\u0086\u0015\u0097Q\u00181&\u00ca\u00dd\r\u00b4\u001dg\u00f1\u00f1\u0001\u00eaZ \u009fW'\u00dc\u00c1|\u00fb\u0010\u00f4=\u0010H\u00e9}} N#\u00e8\u0001\u00b1\u0087\u00aflC\u00bd\u00c4\u0018\u00a6\u00af\u00dcQ\u00ce\u00de\u00e2$&\u00bb\u00f7\b~\u00deu)<\u00f4W\u00d7\u000e(\u00b4\u0085\u0018\u00fb\u0083\u00e2\u00c0\u00fe\u00e4\u00a5\u00ac\u00cd\u0013\u008c\u00c7\u00bdc,\u0089\u00be\u00ec\u00be\u00a7\u009e>x\u000e".length();
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
                            var11_3[var17_4++] = CP_yl.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "A\u0011f,\u0007\u00f6h\u00f2\u00b6v$+\u00ef\u0014\u00bc\u00d6\u0018\u00a6\u00af\u00dcQ\u00ce\u00de\u00e2$\u0001\u00a5\u0095\u0019\u00cc\u00ff*`Z\u00bd\u00d1\u00c3\u000bv\u00e3/";
                            var18_6 = "A\u0011f,\u0007\u00f6h\u00f2\u00b6v$+\u00ef\u0014\u00bc\u00d6\u0018\u00a6\u00af\u00dcQ\u00ce\u00de\u00e2$\u0001\u00a5\u0095\u0019\u00cc\u00ff*`Z\u00bd\u00d1\u00c3\u000bv\u00e3/".length();
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
                            var11_3[var17_4++] = CP_yl.a(var19_9).intern();
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
                CP_yl.d = new HashMap<K, V>(13);
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
                var6_12 = new long[9];
                var3_13 = 0;
                var4_14 = "B\u00f2\u00ab\u00d2\u00fcs7~-\u00f5vns\u0081#\u0005#\u00f7\u0086\u009c\u00a8\u00d4\u0018\u0082K\u0099\u00ddD\u00ba\u00f1!Hl,\u00a9\u001f\u0007\u00ce#l\u00c5H\u00dc\u00adv\u00b5\u0012L\u0085\u00b2\u00b3\r8\b\u00e5t";
                var5_15 = "B\u00f2\u00ab\u00d2\u00fcs7~-\u00f5vns\u0081#\u0005#\u00f7\u0086\u009c\u00a8\u00d4\u0018\u0082K\u0099\u00ddD\u00ba\u00f1!Hl,\u00a9\u001f\u0007\u00ce#l\u00c5H\u00dc\u00adv\u00b5\u0012L\u0085\u00b2\u00b3\r8\b\u00e5t".length();
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
                    var4_14 = "1\u0085\u001ck\u00d9V\u00deS\u00e0)\u00ca \u00b8\u00ec\u00d4\u00f1";
                    var5_15 = "1\u0085\u001ck\u00d9V\u00deS\u00e0)\u00ca \u00b8\u00ec\u00d4\u00f1".length();
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
        CP_yl.b = var6_12;
        CP_yl.c = new Integer[9];
        CP_yl.PLUGIN_MESSAGE = new CP_yl();
        CP_yl.DISCONNECT = new CP_yl();
        CP_yl.CONFIGURATION_END = new CP_yl();
        CP_yl.KEEP_ALIVE = new CP_yl();
        CP_yl.PING = new CP_yl();
        CP_yl.REGISTRY_DATA = new CP_yl();
        CP_yl.RESOURCE_PACK_REMOVE = new CP_yl();
        CP_yl.RESOURCE_PACK_SEND = new CP_yl();
        CP_yl.UPDATE_ENABLED_FEATURES = new CP_yl();
        CP_yl.UPDATE_TAGS = new CP_yl();
        CP_yl.CP_l = CP_yl.CP_v();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D14;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_yl", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_yl.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_yl.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_yl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_yl.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

