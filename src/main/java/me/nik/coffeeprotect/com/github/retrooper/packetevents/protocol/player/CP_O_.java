/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player;

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

public final class CP_O_
extends Enum<CP_O_> {
    public static final /* enum */ CP_O_ START_DIGGING;
    public static final /* enum */ CP_O_ CANCELLED_DIGGING;
    public static final /* enum */ CP_O_ FINISHED_DIGGING;
    public static final /* enum */ CP_O_ DROP_ITEM_STACK;
    public static final /* enum */ CP_O_ DROP_ITEM;
    public static final /* enum */ CP_O_ RELEASE_USE_ITEM;
    public static final /* enum */ CP_O_ SWAP_ITEM_WITH_OFFHAND;
    public static final /* enum */ CP_O_ STAB;
    private static final CP_O_[] CP_I;
    private static final /* synthetic */ CP_O_[] CP_X;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_O_[] values() {
        return (CP_O_[])CP_X.clone();
    }

    public static CP_O_ valueOf(String string) {
        return Enum.valueOf(CP_O_.class, string);
    }

    public int CP_r() {
        return this.ordinal();
    }

    public static CP_O_ CP_Z(int n) {
        return CP_I[n];
    }

    private static /* synthetic */ CP_O_[] CP_x() {
        long l = a ^ 0x411487156229L;
        CP_O_[] ilIlO_Array = new CP_O_[CP_O_.a("j", (int)8731, (long)(0x65078887E718B5B8L ^ l))];
        ilIlO_Array[0] = START_DIGGING;
        ilIlO_Array[1] = CANCELLED_DIGGING;
        ilIlO_Array[2] = FINISHED_DIGGING;
        ilIlO_Array[3] = DROP_ITEM_STACK;
        ilIlO_Array[4] = DROP_ITEM;
        ilIlO_Array[5] = RELEASE_USE_ITEM;
        ilIlO_Array[CP_O_.a("j", (int)21661, (long)(0x75D5443AD5DC433FL ^ l))] = SWAP_ITEM_WITH_OFFHAND;
        ilIlO_Array[CP_O_.a("j", (int)765, (long)(0x565323CB0181558L ^ l))] = STAB;
        return ilIlO_Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_O_.a = CP_s.a(5501998488694718061L, -5692321811695680912L, MethodHandles.lookup().lookupClass()).a(216243318525261L);
                        var20 = CP_O_.a ^ 34788209244918L;
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
                        var16_5 = "\u00b3!.ds\u00ec\u00ae\u0006r\u0019\u00d90\u008cd\u00c0b\u0018l(\u0089*X\u00a3\u00b9\u00a6\u0084\u00e1\u00c0\u000e\u00c0\u00ed\u00fd~\u009f\u00f3\u00d9\u00b1\u00c6\u00f2\u0011\u00d9\u0018;\u0000\u0096:\u001c\u00b9[B\u0080\u00d6\u0006`U\u00dd\u000e\u00a0\u00d4\u00db\u00d5Q\u0091\u00f7\u00da\u00bd\u0018\u00aa\u00b8\u00ee`\u00db\u009b\u007fs&\u00f1\u0094\u00d2k\u00ea~hB\u00ff1\u00e9;\u008f\u00a3\u00b0\u0010p\u00f7q\u00a9\u009b\u008byhPj`\u00c9]G(c\u0010\u00b3!.ds\u00ec\u00ae\u0006\b{\u00a1\u001a\u00e3A\u0000)";
                        var18_6 = "\u00b3!.ds\u00ec\u00ae\u0006r\u0019\u00d90\u008cd\u00c0b\u0018l(\u0089*X\u00a3\u00b9\u00a6\u0084\u00e1\u00c0\u000e\u00c0\u00ed\u00fd~\u009f\u00f3\u00d9\u00b1\u00c6\u00f2\u0011\u00d9\u0018;\u0000\u0096:\u001c\u00b9[B\u0080\u00d6\u0006`U\u00dd\u000e\u00a0\u00d4\u00db\u00d5Q\u0091\u00f7\u00da\u00bd\u0018\u00aa\u00b8\u00ee`\u00db\u009b\u007fs&\u00f1\u0094\u00d2k\u00ea~hB\u00ff1\u00e9;\u008f\u00a3\u00b0\u0010p\u00f7q\u00a9\u009b\u008byhPj`\u00c9]G(c\u0010\u00b3!.ds\u00ec\u00ae\u0006\b{\u00a1\u001a\u00e3A\u0000)".length();
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
                            var11_3[var17_4++] = CP_O_.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "Gj\u00c1\u00ff\u008f\u0083~3\u0018\u0080\u0087H\u00eaqHB:\u000f\u0016MaV(2yJ\u0016\u00c14\u0091\u00c2\u0084\u008c";
                            var18_6 = "Gj\u00c1\u00ff\u008f\u0083~3\u0018\u0080\u0087H\u00eaqHB:\u000f\u0016MaV(2yJ\u0016\u00c14\u0091\u00c2\u0084\u008c".length();
                            var15_7 = 8;
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
                            var11_3[var17_4++] = CP_O_.a(var19_9).intern();
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
                CP_O_.d = new HashMap<K, V>(13);
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
                var4_14 = "K\u000b6/\u00cfZ\u00e1x\u00c61\u001b\u0094\b\u008eg1\u008a\u00efL\u0094\u00e6\u0014\u0092\u0083";
                var5_15 = "K\u000b6/\u00cfZ\u00e1x\u00c61\u001b\u0094\b\u008eg1\u008a\u00efL\u0094\u00e6\u0014\u0092\u0083".length();
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
                    var4_14 = "\u00a1Sd\u0087F\u00bf\u0084\u001d\u00b1@\u0097\u00d1<\u00ca#\u00e6";
                    var5_15 = "\u00a1Sd\u0087F\u00bf\u0084\u001d\u00b1@\u0097\u00d1<\u00ca#\u00e6".length();
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
        CP_O_.b = var6_12;
        CP_O_.c = new Integer[5];
        CP_O_.START_DIGGING = new CP_O_();
        CP_O_.CANCELLED_DIGGING = new CP_O_();
        CP_O_.FINISHED_DIGGING = new CP_O_();
        CP_O_.DROP_ITEM_STACK = new CP_O_();
        CP_O_.DROP_ITEM = new CP_O_();
        CP_O_.RELEASE_USE_ITEM = new CP_O_();
        CP_O_.SWAP_ITEM_WITH_OFFHAND = new CP_O_();
        CP_O_.STAB = new CP_O_();
        CP_O_.CP_X = CP_O_.CP_x();
        CP_O_.CP_I = CP_O_.values();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x747D;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/CP_O_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_O_.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_O_.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/CP_O_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_O_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

