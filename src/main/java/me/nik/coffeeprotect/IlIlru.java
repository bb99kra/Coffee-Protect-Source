/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Base64;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import me.nik.coffeeprotect.IlIlZv;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlru {
    private final byte[] IlIly;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String WeiuzzBilu = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlru(Class<?> clazz) {
        long l = a ^ 0x7C78594F5E9BL;
        String string = IlIlrW.IlIlx();
        String string2 = string;
        try {
            byte[] byArray = new byte[IlIlru.b("f", (int)27382, (long)(0xF328C96D11CDE3L ^ l))];
            byArray[0] = (byte)IlIlru.b("f", (int)11762, (long)(0x52C27FDEB06D0AE8L ^ l));
            byArray[1] = (byte)IlIlru.b("f", (int)28756, (long)(0x5D1925CB33CED75DL ^ l));
            byArray[2] = (byte)IlIlru.b("f", (int)9051, (long)(0x4C0B1C0600068449L ^ l));
            byArray[3] = (byte)IlIlru.b("f", (int)8791, (long)(0x2A2264825EE5855CL ^ l));
            byArray[4] = (byte)IlIlru.b("f", (int)28883, (long)(0x7AC84D0467D2D7C0L ^ l));
            byArray[5] = (byte)IlIlru.b("f", (int)11252, (long)(0x15E4D5F4AF018CECL ^ l));
            byArray[IlIlru.b("f", (int)8517, (long)(0x79C0A6CD3E988655L ^ l))] = (byte)IlIlru.b("f", (int)28740, (long)(0x50A7566067595755L ^ l));
            byArray[IlIlru.b("f", (int)19124, (long)(0x3326AD59CB46EDAFL ^ l))] = (byte)IlIlru.b("f", (int)7764, (long)(0x374C4DCAFFA13950L ^ l));
            byArray[IlIlru.b("f", (int)10423, (long)(0x5A3DDF480A5A0FB0L ^ l))] = (byte)IlIlru.b("f", (int)32361, (long)(0x5DF4106357CFD965L ^ l));
            byArray[IlIlru.b("f", (int)7990, (long)(0x7E4CA5C23DBEB820L ^ l))] = (byte)IlIlru.b("f", (int)11252, (long)(0x15E4D5F4AF018CECL ^ l));
            byArray[IlIlru.b("f", (int)29908, (long)(0x50FF7A68A0D753DEL ^ l))] = (byte)IlIlru.b("f", (int)14326, (long)(0x28A7AE86513990E1L ^ l));
            byArray[IlIlru.b("f", (int)2768, (long)(0x2C464AE0E5672DD6L ^ l))] = (byte)IlIlru.b("f", (int)13421, (long)(0x22DEF6C1BB679379L ^ l));
            byArray[IlIlru.b("f", (int)2802, (long)(0x733C9259CD012DECL ^ l))] = (byte)IlIlru.b("f", (int)9392, (long)(0x18A2090F2B7B83BDL ^ l));
            byArray[IlIlru.b("f", (int)396, (long)(0x5CB84AB6CD3F2693L ^ l))] = (byte)IlIlru.b("f", (int)8326, (long)(0x3B491560C892079AL ^ l));
            byArray[IlIlru.b("f", (int)775, (long)(0x3DD143BC2BD5A41AL ^ l))] = (byte)IlIlru.b("f", (int)13632, (long)(0x562CFA40C3079259L ^ l));
            byArray[IlIlru.b("f", (int)222, (long)(0x7D93563602FC27D1L ^ l))] = (byte)IlIlru.b("f", (int)6711, (long)(0x766066E16090BD39L ^ l));
            this.IlIly = byArray;
            if (clazz != IlIlZv.class) {
                throw new RuntimeException();
            }
        }
        catch (RuntimeException runtimeException) {
            throw IlIlru.a(runtimeException);
        }
        try {
            if (string2 == null) {
                PacketWrapper.IlIle((int[])new int[4]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw IlIlru.a(runtimeException);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public String decrypt(String var1_1, int var2_2) {
        block20: {
            block22: {
                block21: {
                    block19: {
                        block23: {
                            var3_3 = IlIlru.a ^ 11517554968894L;
                            var6_4 = new byte[]{};
                            var5_5 = IlIlrW.IlIlx();
                            v0 = var2_2;
                            v1 /* !! */  = 1;
                            if (var5_5 == null) break block19;
                            if (v0 < v1 /* !! */ ) ** GOTO lbl30
                            break block23;
                            catch (Exception v2) {
                                throw IlIlru.a(v2);
                            }
                        }
                        try {
                            block24: {
                                v0 = var2_2;
                                v1 /* !! */  = 5;
                                if (var5_5 == null) break block19;
                                break block24;
                                catch (Exception v3) {
                                    throw IlIlru.a(v3);
                                }
                            }
                            if (v0 <= v1 /* !! */ ) {
                            }
                            ** GOTO lbl30
                        }
                        catch (Exception v4) {
                            throw IlIlru.a(v4);
                        }
                        var7_6 = new SecretKeySpec(this.IlIly, (String)IlIlru.a("x", (int)8579, (long)(2430063327029762001L ^ var3_3)));
                        try {
                            if (var5_5 != null) break block20;
lbl30:
                            // 3 sources

                            v0 = var2_2;
                            v1 /* !! */  = 5;
                        }
                        catch (Exception v5) {
                            throw IlIlru.a(v5);
                        }
                    }
                    if (var5_5 == null) break block21;
                    try {
                        block25: {
                            if (v0 <= v1 /* !! */ ) break block22;
                            break block25;
                            catch (Exception v6) {
                                throw IlIlru.a(v6);
                            }
                        }
                        v0 = var2_2;
                        v1 /* !! */  = (int)IlIlru.b("f", (int)25281, (long)(2955428659016618604L ^ var3_3));
                    }
                    catch (Exception v7) {
                        throw IlIlru.a(v7);
                    }
                }
                if (v0 > v1 /* !! */ ) break block22;
                var7_6 = new SecretKeySpec(Stream.of(new String(this.IlIly)).map((Function<String, StringBuilder>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$decrypt$0(java.lang.String ), (Ljava/lang/String;)Ljava/lang/StringBuilder;)()).collect(Collectors.joining()).getBytes(), (String)IlIlru.a("x", (int)20331, (long)(452351146715806008L ^ var3_3)));
                if (var5_5 != null) break block20;
            }
            var7_6 = new SecretKeySpec(Stream.of(new String(this.IlIly)).map((Function<String, StringBuilder>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, <init>(java.lang.String ), (Ljava/lang/String;)Ljava/lang/StringBuilder;)()).collect(Collectors.joining()).getBytes(), (String)IlIlru.a("x", (int)20331, (long)(452351146715806008L ^ var3_3)));
        }
        try {
            var8_7 = Cipher.getInstance((String)IlIlru.a("x", (int)20331, (long)(452351146715806008L ^ var3_3)));
            var8_7.init(2, var7_6);
            var9_9 = Base64.getDecoder().decode(var1_1);
            var6_4 = var8_7.doFinal(var9_9);
        }
        catch (Exception var8_8) {
            var8_8.printStackTrace();
        }
        return new String(var6_4);
    }

    private static /* synthetic */ StringBuilder lambda$decrypt$0(String string) {
        return new StringBuilder(string).reverse();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    IlIlru.a = IlIls.a((long)-2939559850579852216L, (long)-6854092877113266828L, MethodHandles.lookup().lookupClass()).a(160324160507480L);
                    IlIlru.d = new HashMap<K, V>(13);
                    var11 = IlIlru.a ^ 100543043534824L;
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
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "\u008a|\u00a4.~(\u0091\u00c7\u009b`\u0016\u00b8\u00b4\u0003\u00c1\u008d\u0010\u00ea\u00d7\u00e8\u00c0I\u00c4\u00d5\u009e\u001c\u00ea\t\u00d7\u00a3B\u00cdd";
                    var19_6 = "\u008a|\u00a4.~(\u0091\u00c7\u009b`\u0016\u00b8\u00b4\u0003\u00c1\u008d\u0010\u00ea\u00d7\u00e8\u00c0I\u00c4\u00d5\u009e\u001c\u00ea\t\u00d7\u00a3B\u00cdd".length();
                    var16_7 = 16;
                    var15_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = IlIlru.a(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                IlIlru.b = var20_3;
                IlIlru.c = new String[2];
                IlIlru.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[27];
                var3_13 = 0;
                var4_14 = "\u00942\u009b3m\u0010Z\u00caB\u00ae\\*\u00fc\u00c2E\u0098\u0000\u0092\u00e3\u00d9\u00edR\u0017\fh>J\u00c8\u0014\u00ad\u00b7\u00dc\u00edg\u00fe?3C\u00e1l!\u001e\u00aa\u00f1l\u00ef\u00a7\u00bf\u0087\u00fc\u00a4\u00ff\u00e4\u0015\u0086#\u00b1<t^\u00c5\u00e32ay\u009f\u00e72 \u0005>\u00f9eU\n\u008c\u0089Ok\u0081<6\u00a8\u00cf\u00d0O\u000bCM\u009b]\u00f7$\u00ba\u008cm\u00ff\u0099h\t[V\u00ef\u00e9\u00e7_\u00d5\u00b2Q#k\u0017\u00dc\u0082\u00b8\u00b0B\u00e4\u00eb\u00ee\u0006F\u00c8Mf\u00d5\u00f8D\u0081vQ37L[\u00f9nYy\u009e\u00cfqw\u00bd.\rk;\u00bf\u00d4Mr\u00a4\u00b0\u00dc\u008dH\u0003\u00e7\u00dc\u001e\u008b\u008f\u00d9zCU\u00f3\u00af\u00de\u0088\u0096\u008e\u00ca\u0006\u0012<\u001eY\u00ca`\u00c6\u0096\u009a\u0003\u00b5\u00a0E\u009d\u00db\u0097\u00d1\u0013\u00a5\u00a6\f\u00a1\u00b7\u0084\u00ee";
                var5_15 = "\u00942\u009b3m\u0010Z\u00caB\u00ae\\*\u00fc\u00c2E\u0098\u0000\u0092\u00e3\u00d9\u00edR\u0017\fh>J\u00c8\u0014\u00ad\u00b7\u00dc\u00edg\u00fe?3C\u00e1l!\u001e\u00aa\u00f1l\u00ef\u00a7\u00bf\u0087\u00fc\u00a4\u00ff\u00e4\u0015\u0086#\u00b1<t^\u00c5\u00e32ay\u009f\u00e72 \u0005>\u00f9eU\n\u008c\u0089Ok\u0081<6\u00a8\u00cf\u00d0O\u000bCM\u009b]\u00f7$\u00ba\u008cm\u00ff\u0099h\t[V\u00ef\u00e9\u00e7_\u00d5\u00b2Q#k\u0017\u00dc\u0082\u00b8\u00b0B\u00e4\u00eb\u00ee\u0006F\u00c8Mf\u00d5\u00f8D\u0081vQ37L[\u00f9nYy\u009e\u00cfqw\u00bd.\rk;\u00bf\u00d4Mr\u00a4\u00b0\u00dc\u008dH\u0003\u00e7\u00dc\u001e\u008b\u008f\u00d9zCU\u00f3\u00af\u00de\u0088\u0096\u008e\u00ca\u0006\u0012<\u001eY\u00ca`\u00c6\u0096\u009a\u0003\u00b5\u00a0E\u009d\u00db\u0097\u00d1\u0013\u00a5\u00a6\f\u00a1\u00b7\u0084\u00ee".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "k>\u0088\u0017pa\u00d8S\u0083\u00cc\u00e6\u00c2\u000e\u00b2Lr";
                    var5_15 = "k>\u0088\u0017pa\u00d8S\u0083\u00cc\u00e6\u00c2\u000e\u00b2Lr".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl84:
                // 1 sources

                ** continue;
            }
        }
        IlIlru.e = var6_12;
        IlIlru.f = new Integer[27];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2A2D;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlru", exception);
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
            IlIlru.c[n2] = IlIlru.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlru.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlru" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2CC4;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlru", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlru.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlru.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlru" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlru.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlru.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

