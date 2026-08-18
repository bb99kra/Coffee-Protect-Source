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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.CP_d_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_Ts {
    private int CP_T;
    private int CP_y;
    private int CP_g;
    private int CP_UnderScore;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String ewrUqRBTUk = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Ts(int n, int n2, int n3, int n4) {
        this.CP_T = n;
        this.CP_y = n2;
        this.CP_g = n3;
        this.CP_UnderScore = n4;
    }

    public CP_Ts(CP_d_ ilIld_, int n, int n2, int n3) {
        this(ilIld_.CP_s(), n, n2, n3);
    }

    public CP_Ts(CP_An ilIlAn, long l) {
        long l2 = a ^ 0x338B2C1F91C4L;
        short s = (short)(l & e);
        this.CP_y = (ilIlAn.CP_w() << 4) + (s >>> CP_Ts.a("s", (int)11361, (long)(0x5F334F3B3DA3C771L ^ l2)) & CP_Ts.a("s", (int)66, (long)(0x304A4D497456B51L ^ l2)));
        this.CP_g = (ilIlAn.CP_c() << 4) + (s & CP_Ts.a("s", (int)66, (long)(0x304A4D497456B51L ^ l2)));
        this.CP_UnderScore = (ilIlAn.CP_k() << 4) + (s >>> 4 & CP_Ts.a("s", (int)66, (long)(0x304A4D497456B51L ^ l2)));
        this.CP_T = (int)(l >>> CP_Ts.a("s", (int)8467, (long)(0x6F9C96027CBB4A01L ^ l2)));
    }

    public long CP_o() {
        long l = a ^ 0x60613F45AE6EL;
        return (long)this.CP_T << CP_Ts.a("s", (int)29714, (long)(0x12C8BACD5610A0AFL ^ l)) | (long)((this.CP_y & CP_Ts.a("s", (int)18670, (long)(0x3F4914865D069C52L ^ l))) << CP_Ts.a("s", (int)31908, (long)(0x3820215E3A03A81FL ^ l))) | (long)((this.CP_UnderScore & CP_Ts.a("s", (int)66, (long)(0x304F73E841F54FBL ^ l))) << 4) | (long)(this.CP_g & CP_Ts.a("s", (int)66, (long)(0x304F73E841F54FBL ^ l)));
    }

    public int CP_y() {
        return this.CP_T;
    }

    public void CP_Q(int n) {
        this.CP_T = n;
    }

    public CP_d_ CP_d(ClientVersion clientVersion) {
        return CP_d_.CP_W(clientVersion, this.CP_T);
    }

    public void CP_w(CP_d_ ilIld_) {
        this.CP_T = ilIld_.CP_s();
    }

    public int CP_I() {
        return this.CP_y;
    }

    public int CP_K() {
        return this.CP_g;
    }

    public int CP_k() {
        return this.CP_UnderScore;
    }

    public void CP_q(int n) {
        this.CP_y = n;
    }

    public void CP_h(int n) {
        this.CP_g = n;
    }

    public void CP_L(int n) {
        this.CP_UnderScore = n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block12: {
            block11: {
                block10: {
                    CP_Ts.a = CP_s.a(9096675362372218993L, 995303167081456573L, MethodHandles.lookup().lookupClass()).a(91694744901148L);
                    CP_Ts.d = new HashMap<K, V>(13);
                    var5 = CP_Ts.a ^ 33349134117557L;
                    var7_1 = Cipher.getInstance("DES/CBC/NoPadding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var13_3 = new long[6];
                    var10_4 = 0;
                    var11_5 = "r\u001e(Xt&{='\u0001\u00bb\u00e2\u00f3\u009d\u00ab*XY\u00f0l\u00fe\u00e9a*\u00de\u008b\u00acGS\u00a3\r\u0004";
                    var12_6 = "r\u001e(Xt&{='\u0001\u00bb\u00e2\u00f3\u009d\u00ab*XY\u00f0l\u00fe\u00e9a*\u00de\u008b\u00acGS\u00a3\r\u0004".length();
                    var9_7 = 0;
                    while (true) {
                        var14_9 = var11_5.substring(var9_7, var9_7 += 8).getBytes("ISO-8859-1");
                        v3 = var13_3;
                        v4 = var10_4++;
                        v5 = ((long)var14_9[0] & 255L) << 56 | ((long)var14_9[1] & 255L) << 48 | ((long)var14_9[2] & 255L) << 40 | ((long)var14_9[3] & 255L) << 32 | ((long)var14_9[4] & 255L) << 24 | ((long)var14_9[5] & 255L) << 16 | ((long)var14_9[6] & 255L) << 8 | (long)var14_9[7] & 255L;
                        v6 = -1;
                        break block10;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        v3[v4] = v7;
                        if (var9_7 < var12_6) ** continue;
                        var11_5 = "\u009f\u00d2\u00aa\u00dfC\u00d8\u00d3\u00b5\u00ed\u000f(\u000f\u0011|g\u00bd";
                        var12_6 = "\u009f\u00d2\u00aa\u00dfC\u00d8\u00d3\u00b5\u00ed\u000f(\u000f\u0011|g\u00bd".length();
                        var9_7 = 0;
                        while (true) {
                            var14_9 = var11_5.substring(var9_7, var9_7 += 8).getBytes("ISO-8859-1");
                            v3 = var13_3;
                            v4 = var10_4++;
                            v5 = ((long)var14_9[0] & 255L) << 56 | ((long)var14_9[1] & 255L) << 48 | ((long)var14_9[2] & 255L) << 40 | ((long)var14_9[3] & 255L) << 32 | ((long)var14_9[4] & 255L) << 24 | ((long)var14_9[5] & 255L) << 16 | ((long)var14_9[6] & 255L) << 8 | (long)var14_9[7] & 255L;
                            v6 = 0;
                            break block10;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        v3[v4] = v7;
                        if (var9_7 < var12_6) ** continue;
                        break block11;
                        break;
                    }
                }
                var15_10 = v5;
                var17_8 = var7_1.doFinal(new byte[]{(byte)(var15_10 >>> 56), (byte)(var15_10 >>> 48), (byte)(var15_10 >>> 40), (byte)(var15_10 >>> 32), (byte)(var15_10 >>> 24), (byte)(var15_10 >>> 16), (byte)(var15_10 >>> 8), (byte)var15_10});
                v7 = ((long)var17_8[0] & 255L) << 56 | ((long)var17_8[1] & 255L) << 48 | ((long)var17_8[2] & 255L) << 40 | ((long)var17_8[3] & 255L) << 32 | ((long)var17_8[4] & 255L) << 24 | ((long)var17_8[5] & 255L) << 16 | ((long)var17_8[6] & 255L) << 8 | (long)var17_8[7] & 255L;
                switch (v6) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl52:
                    // 1 sources

                    ** continue;
                }
            }
            CP_Ts.b = var13_3;
            CP_Ts.c = new Integer[6];
            var0_11 = Cipher.getInstance("DES/CBC/NoPadding");
            v8 = SecretKeyFactory.getInstance("DES");
            v9 = new byte[8];
            v10 = v9;
            v9[0] = (byte)(var5 >>> 56);
            for (var1_12 = 1; var1_12 < 8; ++var1_12) {
                v10 = v10;
                v10[var1_12] = (byte)(var5 << var1_12 * 8 >>> 56);
            }
            break block12;
lbl66:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_11.init(2, (Key)v8.generateSecret(new DESKeySpec(v10)), new IvParameterSpec(new byte[8]));
        var2_13 = 3658612766072318932L;
        var4_14 = var0_11.doFinal(new byte[]{(byte)(var2_13 >>> 56), (byte)(var2_13 >>> 48), (byte)(var2_13 >>> 40), (byte)(var2_13 >>> 32), (byte)(var2_13 >>> 24), (byte)(var2_13 >>> 16), (byte)(var2_13 >>> 8), (byte)var2_13});
        ** while (true)
        CP_Ts.e = ((long)var4_14[0] & 255L) << 56 | ((long)var4_14[1] & 255L) << 48 | ((long)var4_14[2] & 255L) << 40 | ((long)var4_14[3] & 255L) << 32 | ((long)var4_14[4] & 255L) << 24 | ((long)var4_14[5] & 255L) << 16 | ((long)var4_14[6] & 255L) << 8 | (long)var4_14[7] & 255L;
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3C04;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Ts", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Ts.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Ts.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Ts" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Ts.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

