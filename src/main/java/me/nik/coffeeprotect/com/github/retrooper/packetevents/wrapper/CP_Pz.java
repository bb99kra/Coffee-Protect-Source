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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTList;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Pz {
    private final ResourceLocation CP_X;
    @Nullable
    private final NBT CP_b;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String gqXqskYuNL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Pz(NBTCompound nBTCompound) {
        long l = a ^ 0x581159DC8DD7L;
        this(new ResourceLocation(nBTCompound.getStringTagValueOrThrow((String)((Object)CP_Pz.a("x", (int)11037, (long)(0x39A36AE82E9E8FD2L ^ l))))), nBTCompound.getTagOrNull((String)((Object)CP_Pz.a("x", (int)20661, (long)(0x648E2F618596F47BL ^ l)))));
    }

    public CP_Pz(ResourceLocation resourceLocation, @Nullable NBT nBT) {
        this.CP_X = resourceLocation;
        this.CP_b = nBT;
    }

    public static List<CP_Pz> CP_s(NBTList<NBTCompound> nBTList) {
        List<CP_Pz> list;
        block2: {
            long l = a ^ 0x4AE39B2E6BF8L;
            ArrayList<CP_Pz> arrayList = new ArrayList<CP_Pz>(nBTList.size());
            Iterator<NBTCompound> iterator = nBTList.getTags().iterator();
            int[] nArray = CP_JS.CP_v();
            while (iterator.hasNext()) {
                NBTCompound nBTCompound = iterator.next();
                list = arrayList;
                if (nArray != null) {
                    list.add(new CP_Pz(nBTCompound));
                    if (nArray != null) continue;
                }
                break block2;
            }
            list = Collections.unmodifiableList(arrayList);
        }
        return list;
    }

    public ResourceLocation CP_j() {
        return this.CP_X;
    }

    @Nullable
    public NBT CP_H() {
        return this.CP_b;
    }

    public boolean equals(Object object) {
        long l = a ^ 0x51CABFEB67BAL;
        int[] nArray = CP_JS.CP_v();
        Object object2 = this;
        if (nArray != null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (nArray != null) {
            if (!(object2 instanceof CP_Pz)) {
                return false;
            }
            object2 = object;
        }
        CP_Pz ilIlPz = (CP_Pz)object2;
        boolean bl = this.CP_X.equals(ilIlPz.CP_X);
        if (nArray != null) {
            if (!bl) {
                return false;
            }
            bl = Objects.equals(this.CP_b, ilIlPz.CP_b);
        }
        return bl;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public int hashCode() {
        var1_1 = CP_Pz.a ^ 41290777131582L;
        var4_2 /* !! */  = this.CP_X.hashCode();
        var3_3 = CP_JS.CP_v();
        v0 = CP_Pz.b("o", (int)12741, (long)(4414172653454190775L ^ var1_1)) * var4_2 /* !! */ ;
        v1 = this.CP_b;
        if (var3_3 == null) ** GOTO lbl9
        if (v1 != null) {
            v1 = this.CP_b;
lbl9:
            // 2 sources

            v2 = v1.hashCode();
        } else {
            v2 = 0;
        }
        var4_2 /* !! */  = (int)(v0 + v2);
        return var4_2 /* !! */ ;
    }

    public String toString() {
        long l = a ^ 0x3A794260C9L;
        return (String)((Object)CP_Pz.a("x", (int)14275, (long)(0x3E32921BDA7AFE11L ^ l))) + this.CP_X + (String)((Object)CP_Pz.a("x", (int)15604, (long)(0x1AE5E10D60857527L ^ l))) + this.CP_b + (char)CP_Pz.b("o", (int)30271, (long)(0x7859E3978F94B5BBL ^ l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        CP_Pz.a = CP_s.a(-4106165062973896408L, 4231063174810294217L, MethodHandles.lookup().lookupClass()).a(140393640250135L);
                        CP_Pz.d = new HashMap<K, V>(13);
                        var11 = CP_Pz.a ^ 117205483141725L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "'1\u00eeq\u00bfm\u0093,\u00b1\u00fc\u00e4\u00de1\u001b\u0003\u00c6\u0085\u00c0\u00f6\u0091\u0083[\u00da\u00b6\u0013\u008e\u00f8\u00cae\u008a\u00ea\u00d2\u00bbb\u00d0|\u00b7<\u00a8E\u0010\n\u00b0\u0007\u00d7Caz@+\"\u007f~\u00a6\u00f7 5";
                        var19_6 = "'1\u00eeq\u00bfm\u0093,\u00b1\u00fc\u00e4\u00de1\u001b\u0003\u00c6\u0085\u00c0\u00f6\u0091\u0083[\u00da\u00b6\u0013\u008e\u00f8\u00cae\u008a\u00ea\u00d2\u00bbb\u00d0|\u00b7<\u00a8E\u0010\n\u00b0\u0007\u00d7Caz@+\"\u007f~\u00a6\u00f7 5".length();
                        var16_7 = 40;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_Pz.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "=\u00dc\u00f7\u00cd\u0017\u00e6\u0010\u0094\u00fb\u00ec\u00c2hf7c\u0096\u0010\u00db\u00c1\u00b5M\u00a3\u00df\u00dd\u0014\u0088\u00b8\u00d4\u00fe\tQ<\u00e9";
                            var19_6 = "=\u00dc\u00f7\u00cd\u0017\u00e6\u0010\u0094\u00fb\u00ec\u00c2hf7c\u0096\u0010\u00db\u00c1\u00b5M\u00a3\u00df\u00dd\u0014\u0088\u00b8\u00d4\u00fe\tQ<\u00e9".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_Pz.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl51:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_Pz.b = var20_3;
                CP_Pz.c = new String[4];
                CP_Pz.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u00dd\u00c3\u00c3?:\u00f7Pf\u0001\u009a\u001aR\u0093\u00a9Dp";
                var5_15 = "\u00dd\u00c3\u00c3?:\u00f7Pf\u0001\u009a\u001aR\u0093\u00a9Dp".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        CP_Pz.e = var6_12;
        CP_Pz.f = new Integer[2];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5E82;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Pz", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            CP_Pz.c[n2] = CP_Pz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Pz.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Pz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x54D4;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Pz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Pz.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Pz.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Pz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Pz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Pz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

