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

public final class CP_dR
extends Enum<CP_dR> {
    public static final /* enum */ CP_dR SUCCESSFULLY_LOADED;
    public static final /* enum */ CP_dR DECLINED;
    public static final /* enum */ CP_dR FAILED_DOWNLOAD;
    public static final /* enum */ CP_dR ACCEPTED;
    public static final /* enum */ CP_dR DOWNLOADED;
    public static final /* enum */ CP_dR INVALID_URL;
    public static final /* enum */ CP_dR FAILED_RELOAD;
    public static final /* enum */ CP_dR DISCARDED;
    public static final CP_dR[] VALUES;
    private static final CP_dR[] CP_H;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_dR[] values() {
        return (CP_dR[])CP_H.clone();
    }

    public static CP_dR valueOf(String string) {
        return Enum.valueOf(CP_dR.class, string);
    }

    private static CP_dR[] CP_Y() {
        long l = a ^ 0x76718F1FA322L;
        CP_dR[] ilIldRArray = new CP_dR[CP_dR.a("v", (int)28759, (long)(0x3F3201B2673F90BBL ^ l))];
        ilIldRArray[0] = SUCCESSFULLY_LOADED;
        ilIldRArray[1] = DECLINED;
        ilIldRArray[2] = FAILED_DOWNLOAD;
        ilIldRArray[3] = ACCEPTED;
        ilIldRArray[4] = DOWNLOADED;
        ilIldRArray[5] = INVALID_URL;
        ilIldRArray[CP_dR.a("v", (int)134, (long)(0x5C9E37BAB335E068L ^ l))] = FAILED_RELOAD;
        ilIldRArray[CP_dR.a("v", (int)10140, (long)(0x20E4DD342A3DC776L ^ l))] = DISCARDED;
        return ilIldRArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_dR.a = CP_s.a(3155871727680933393L, -7614392015508793436L, MethodHandles.lookup().lookupClass()).a(253551542362025L);
                        var20 = CP_dR.a ^ 65037277193025L;
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
                        var16_5 = "PLRng\u00b2}t\u007fp\u00bbq\u00c2y\u009e\u00ac\u0010\u00ab\u0089\u00fc1\u00dfF\u0007L+\u00d0\u0082\u00d0\u00a6\u00c5\u00eb\u00c2\u0010\u00c87<2\u00d8\u00d7\u00fbA\u00d6x\u00f9o2v\t~\u0010O\u0017\u001fTw~\u0088\u00e2up\u0081{j\u000e|\u00ae\u0010(r\b\u00a4\u00c3\u00d8\u0019U\u00e6w\u00c9\u001a(\u008a\u0095&\u00188\u00ff\u00a9\u00cf\u0080\u00a5\u00ec\u0019\u00f1k\u00df\u00d4\u00fa\u00bf \u00b8\u00c9\u00c5[O~\u00a0\u00f9\u00c7";
                        var18_6 = "PLRng\u00b2}t\u007fp\u00bbq\u00c2y\u009e\u00ac\u0010\u00ab\u0089\u00fc1\u00dfF\u0007L+\u00d0\u0082\u00d0\u00a6\u00c5\u00eb\u00c2\u0010\u00c87<2\u00d8\u00d7\u00fbA\u00d6x\u00f9o2v\t~\u0010O\u0017\u001fTw~\u0088\u00e2up\u0081{j\u000e|\u00ae\u0010(r\b\u00a4\u00c3\u00d8\u0019U\u00e6w\u00c9\u001a(\u008a\u0095&\u00188\u00ff\u00a9\u00cf\u0080\u00a5\u00ec\u0019\u00f1k\u00df\u00d4\u00fa\u00bf \u00b8\u00c9\u00c5[O~\u00a0\u00f9\u00c7".length();
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
                            var11_3[var17_4++] = CP_dR.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "_\u00ed\u00b9\u00a1J\u008e\u00e6\u00e4=)\u00f7t\u00c0-y8\u0010\u00fep\u009f\u0012\u00a6\u00ad/0\u00a6\u00a3\u00d3\u00a3\u00cd\u00df\u00ab\u00e3";
                            var18_6 = "_\u00ed\u00b9\u00a1J\u008e\u00e6\u00e4=)\u00f7t\u00c0-y8\u0010\u00fep\u009f\u0012\u00a6\u00ad/0\u00a6\u00a3\u00d3\u00a3\u00cd\u00df\u00ab\u00e3".length();
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
                            var11_3[var17_4++] = CP_dR.a(var19_9).intern();
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
                CP_dR.d = new HashMap<K, V>(13);
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
                var4_14 = "2\u00d1<RlL&\u00dc\u0081fW\u00bf\u008a\u00cd)\u00f6\u008f\u009f\r\u0015\u0005O\\{";
                var5_15 = "2\u00d1<RlL&\u00dc\u0081fW\u00bf\u008a\u00cd)\u00f6\u008f\u009f\r\u0015\u0005O\\{".length();
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
                    var4_14 = "\u00d5#\u00b9\u0090\u00c1\\\u0080\u00f6\u0089\u00fe]\u001d\u00a1U\u00bf\u0098";
                    var5_15 = "\u00d5#\u00b9\u0090\u00c1\\\u0080\u00f6\u0089\u00fe]\u001d\u00a1U\u00bf\u0098".length();
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
        CP_dR.b = var6_12;
        CP_dR.c = new Integer[5];
        CP_dR.SUCCESSFULLY_LOADED = new CP_dR();
        CP_dR.DECLINED = new CP_dR();
        CP_dR.FAILED_DOWNLOAD = new CP_dR();
        CP_dR.ACCEPTED = new CP_dR();
        CP_dR.DOWNLOADED = new CP_dR();
        CP_dR.INVALID_URL = new CP_dR();
        CP_dR.FAILED_RELOAD = new CP_dR();
        CP_dR.DISCARDED = new CP_dR();
        CP_dR.CP_H = CP_dR.CP_Y();
        CP_dR.VALUES = CP_dR.values();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x754;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_dR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_dR.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_dR.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_dR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_dR.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

