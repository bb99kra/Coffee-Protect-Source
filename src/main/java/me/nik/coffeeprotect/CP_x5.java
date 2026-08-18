/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

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

public final class CP_x5
extends Enum<CP_x5> {
    public static final /* enum */ CP_x5 ADMIN;
    public static final /* enum */ CP_x5 RELOAD;
    public static final /* enum */ CP_x5 LOGS;
    public static final /* enum */ CP_x5 MENU;
    public static final /* enum */ CP_x5 INFO;
    public static final /* enum */ CP_x5 TROLL;
    public static final /* enum */ CP_x5 PACKETLOGGER;
    public static final /* enum */ CP_x5 PROFILER;
    public static final /* enum */ CP_x5 DISCONNECT;
    public static final /* enum */ CP_x5 DISCORD;
    public static final /* enum */ CP_x5 ALERTS;
    private final String CP_S;
    private static final /* synthetic */ CP_x5[] CP_d;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_x5[] values() {
        return (CP_x5[])CP_d.clone();
    }

    public static CP_x5 valueOf(String string) {
        return Enum.valueOf(CP_x5.class, string);
    }

    private CP_x5(String string2) {
        this.CP_S = string2;
    }

    public String CP_a() {
        return this.CP_S;
    }

    private static /* synthetic */ CP_x5[] CP_w() {
        long l = a ^ 0x4CBA92D78E05L;
        CP_x5[] ilIlx5Array = new CP_x5[CP_x5.a("p", (int)30741, (long)(0xADA7CEC419E643BL ^ l))];
        ilIlx5Array[0] = ADMIN;
        ilIlx5Array[1] = RELOAD;
        ilIlx5Array[2] = LOGS;
        ilIlx5Array[3] = MENU;
        ilIlx5Array[4] = INFO;
        ilIlx5Array[5] = TROLL;
        ilIlx5Array[CP_x5.a("p", (int)17397, (long)(0x449CF9B03F11DFDAL ^ l))] = PACKETLOGGER;
        ilIlx5Array[CP_x5.a("p", (int)32425, (long)(0x4C141C456B816284L ^ l))] = PROFILER;
        ilIlx5Array[CP_x5.a("p", (int)18282, (long)(0x7277E4B141A5DB46L ^ l))] = DISCONNECT;
        ilIlx5Array[CP_x5.a("p", (int)19101, (long)(0x30978F0CC94A56B8L ^ l))] = DISCORD;
        ilIlx5Array[CP_x5.a("p", (int)29058, (long)(0x23BDFAD2930AEDA9L ^ l))] = ALERTS;
        return ilIlx5Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_x5.a = CP_s.a(5054278748617096129L, -3392415942786846672L, MethodHandles.lookup().lookupClass()).a(57238236513006L);
                        var20 = CP_x5.a ^ 11688894637695L;
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
                        var11_3 = new String[22];
                        var17_4 = 0;
                        var16_5 = "\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u00e9j\u001a\u00dc\u00ea\u00c7\u00b58\u00c8\u00cc\u00df1\u00ad\u00c7\u00e1\u00f5\u00df\u009b\u00cc\u0087\u00fc\u00f9Xv\b\u0082+Og\u0085\u0097\u00f7_\b4\u008d\u000bz/\u0091\nm\b\u00ff\u0081x\u00dc\u0016\u00c4\u0080\u00b7\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8A2\u00ebMZ\u00d4\u00898\u00f9\u00e7\u00f7+}\u00e02z\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u0099B\u001963}\u00bb>D8CY4\u00edO\u00fd\b\u00197\u00a3w\u00a6m\u00e9\u007f\b\u00021\u00ba\u00d4\u009a\u0089;`\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8}Q\u0003,K\u0012E@\u0095\u0010J\u00b2'K\u00c1\u00ec\btV\u00b7\u0080\u001fE\r\u00ee\bn\u001a\u0094m\u008cQ\u00bd?\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8[\u00c6\u007fY6\u0084\u009bE\u0089\u0097\u0017\u00b8f\u00ceB\u0016\u0010\u00a6\u00bcG\u0090\u00fd\u00e3\u009b\u00ad\u00c8Rr\u00dd8\u00e2\u00b3\u008d \u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u0006\u00fclEv8OG\u00cd\u00f6\u009a\u00a6\u00ad\u0098x\u00cf\bZ\u00d3\u00f6\u00c2y\u0011=\u0010A\u00c8\u00dc\u00a1J\u00d4\u00d9$^e6\u0014\u00ab2K\u00bd\u0010\u0011!069\u00ad\u00da\u00aa\u00e5Y\u008cE\u00ed_\u000f\u0011\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u001d\u00e4\u0011\u00ef\u00acf\u00a0u\u00cc\u00068\u00f3[Sh\u00ae\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u0006\u00fclEv8OG\u00d5a\u00c4\u0011.D~.\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\"\u00a1\u000e\u00c1\u00ef3\u0086\u00a1\u00a0\u00b0\u00e1^HvG\u00b9\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u00d6\u00b76K\u0083\u0084\u00a0\u0002\u00e4+\u00d9[\u0084`?y";
                        var18_6 = "\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u00e9j\u001a\u00dc\u00ea\u00c7\u00b58\u00c8\u00cc\u00df1\u00ad\u00c7\u00e1\u00f5\u00df\u009b\u00cc\u0087\u00fc\u00f9Xv\b\u0082+Og\u0085\u0097\u00f7_\b4\u008d\u000bz/\u0091\nm\b\u00ff\u0081x\u00dc\u0016\u00c4\u0080\u00b7\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8A2\u00ebMZ\u00d4\u00898\u00f9\u00e7\u00f7+}\u00e02z\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u0099B\u001963}\u00bb>D8CY4\u00edO\u00fd\b\u00197\u00a3w\u00a6m\u00e9\u007f\b\u00021\u00ba\u00d4\u009a\u0089;`\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8}Q\u0003,K\u0012E@\u0095\u0010J\u00b2'K\u00c1\u00ec\btV\u00b7\u0080\u001fE\r\u00ee\bn\u001a\u0094m\u008cQ\u00bd?\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8[\u00c6\u007fY6\u0084\u009bE\u0089\u0097\u0017\u00b8f\u00ceB\u0016\u0010\u00a6\u00bcG\u0090\u00fd\u00e3\u009b\u00ad\u00c8Rr\u00dd8\u00e2\u00b3\u008d \u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u0006\u00fclEv8OG\u00cd\u00f6\u009a\u00a6\u00ad\u0098x\u00cf\bZ\u00d3\u00f6\u00c2y\u0011=\u0010A\u00c8\u00dc\u00a1J\u00d4\u00d9$^e6\u0014\u00ab2K\u00bd\u0010\u0011!069\u00ad\u00da\u00aa\u00e5Y\u008cE\u00ed_\u000f\u0011\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u001d\u00e4\u0011\u00ef\u00acf\u00a0u\u00cc\u00068\u00f3[Sh\u00ae\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u0006\u00fclEv8OG\u00d5a\u00c4\u0011.D~.\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\"\u00a1\u000e\u00c1\u00ef3\u0086\u00a1\u00a0\u00b0\u00e1^HvG\u00b9\u0018\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8\u00d6\u00b76K\u0083\u0084\u00a0\u0002\u00e4+\u00d9[\u0084`?y".length();
                        var15_7 = 32;
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
                            var11_3[var17_4++] = CP_x5.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8]Ub\u00c2\u00b7\u00af\f\u00deF\u000b\u00bf\u00be\u009b\u00e1E\t\b\u008a\u00020\u000f\u00db\u00f2\u00c7\u00a6";
                            var18_6 = "\u00be\u00d4\u00aa*\u00f1\u00e1,\u00b8]Ub\u00c2\u00b7\u00af\f\u00deF\u000b\u00bf\u00be\u009b\u00e1E\t\b\u008a\u00020\u000f\u00db\u00f2\u00c7\u00a6".length();
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
                            var11_3[var17_4++] = CP_x5.a(var19_9).intern();
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
                CP_x5.d = new HashMap<K, V>(13);
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
                var6_12 = new long[11];
                var3_13 = 0;
                var4_14 = "\u00dc\u00da\u0084S\u00cf\u0018_|+.G\u0010\\\u00cf\u00d8Dx\u00ed\u00ec\u00c1\u00c8\nL\u0010\"\u00fc&\u00b9\u00fc\u009e\u00b2\rF\u00d6\u00d4\u0004\u0011_\u0095ce\u00fd!D\"S\u0091F\u00e4\u00a9\u00fc\u0013g6\u009f\u0005\u0086\u00c8\u00ab\u008c\u00ad\"\u00d2;\u00f9b\u00a1\u00da\\\u00e0\u0012\u00a9";
                var5_15 = "\u00dc\u00da\u0084S\u00cf\u0018_|+.G\u0010\\\u00cf\u00d8Dx\u00ed\u00ec\u00c1\u00c8\nL\u0010\"\u00fc&\u00b9\u00fc\u009e\u00b2\rF\u00d6\u00d4\u0004\u0011_\u0095ce\u00fd!D\"S\u0091F\u00e4\u00a9\u00fc\u0013g6\u009f\u0005\u0086\u00c8\u00ab\u008c\u00ad\"\u00d2;\u00f9b\u00a1\u00da\\\u00e0\u0012\u00a9".length();
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
                    var4_14 = "\u008a\u00cfIe*\u00e9F^\u000bH\u00df\u0096\u00faW\u0002\u0091";
                    var5_15 = "\u008a\u00cfIe*\u00e9F^\u000bH\u00df\u0096\u00faW\u0002\u0091".length();
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
        CP_x5.b = var6_12;
        CP_x5.c = new Integer[11];
        CP_x5.ADMIN = new CP_x5(var11_3[18]);
        CP_x5.RELOAD = new CP_x5(var11_3[4]);
        CP_x5.LOGS = new CP_x5(var11_3[5]);
        CP_x5.MENU = new CP_x5(var11_3[8]);
        CP_x5.INFO = new CP_x5(var11_3[11]);
        CP_x5.TROLL = new CP_x5(var11_3[16]);
        CP_x5.PACKETLOGGER = new CP_x5(var11_3[0]);
        CP_x5.PROFILER = new CP_x5(var11_3[20]);
        CP_x5.DISCONNECT = new CP_x5(var11_3[13]);
        CP_x5.DISCORD = new CP_x5(var11_3[17]);
        CP_x5.ALERTS = new CP_x5(var11_3[19]);
        CP_x5.CP_d = CP_x5.CP_w();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5C27;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_x5", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_x5.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_x5.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_x5" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_x5.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
