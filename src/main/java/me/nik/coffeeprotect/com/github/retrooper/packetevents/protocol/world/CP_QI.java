/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Qv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_QI
extends CP_Qv {
    private final long[] CP_r;
    private final int CP_K;
    private final int CP_p;
    private final long CP_w;
    private static final long a = CP_s.a(-5857367021150442643L, -6601207523638762516L, MethodHandles.lookup().lookupClass()).a(245766038159119L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String KnIfjUsekC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_QI(int n, int n2) {
        long l = a ^ 0x5F226FC9839FL;
        this(n, new long[CP_QI.CP_K(n2 * n, (int)CP_QI.a("f", (int)20526, (long)(0x6CB2E5765F7DC446L ^ l))) / CP_QI.a("f", (int)20526, (long)(0x6CB2E5765F7DC446L ^ l))]);
    }

    public CP_QI(int n, long[] lArray) {
        long l = a ^ 0x3A59A3C1A84EL;
        int n2 = CP_Qv.CP_V();
        int n3 = n2;
        if (n3 != 0) {
            if (n < 4) {
                n = 4;
            }
            this.CP_K = n;
            this.CP_r = lArray;
            this.CP_p = this.CP_r.length * CP_QI.a("f", (int)20526, (long)(0x6CB2800D9375EF97L ^ l)) / this.CP_K;
            this.CP_w = (1L << this.CP_K) - 1L;
        }
    }

    private static int CP_K(int n, int n2) {
        int n3;
        long l = a ^ 0x1913A4942305L;
        int n4 = CP_Qv.CP_V();
        int n5 = n2;
        if (n4 != 0) {
            if (n5 == 0) {
                return 0;
            }
            n5 = n;
        }
        if (n4 != 0) {
            if (n5 == 0) {
                return n2;
            }
            n5 = n;
        }
        if (n4 != 0) {
            if (n5 < 0) {
                n2 *= -1;
            }
            n5 = n % n2;
        }
        int n6 = n3 = n5;
        if (n4 != 0) {
            n6 = n6 != 0 ? n + n2 - n3 : n;
        }
        return n6;
    }

    @Override
    public int CP_o(int n) {
        long l = a ^ 0x408420090509L;
        int n2 = n * this.CP_K;
        int n3 = n2 / CP_QI.a("f", (int)30035, (long)(0x5EB185D1016767ACL ^ l));
        int n4 = CP_Qv.CP_x();
        int n5 = ((n + 1) * this.CP_K - 1) / CP_QI.a("f", (int)20526, (long)(0x6CB2FAD010BD42D0L ^ l));
        int n6 = n2 % CP_QI.a("f", (int)20526, (long)(0x6CB2FAD010BD42D0L ^ l));
        Object object = n3;
        int n7 = n5;
        if (n4 == 0) {
            if (object == n7) {
                return (int)(this.CP_r[n3] >>> n6 & this.CP_w);
            }
            object = CP_QI.a("f", (int)20526, (long)(0x6CB2FAD010BD42D0L ^ l));
            n7 = n6;
        }
        int n8 = object - n7;
        return (int)((this.CP_r[n3] >>> n6 | this.CP_r[n5] << n8) & this.CP_w);
    }

    @Override
    public void CP_r(int n, int n2) {
        int n3;
        block5: {
            int n4;
            Object object;
            int n5;
            block4: {
                long l = a ^ 0x3CAA6026A7D4L;
                int n6 = n * this.CP_K;
                int n7 = n6 / CP_QI.a("f", (int)20526, (long)(0x6CB286FE5092E00DL ^ l));
                n5 = ((n + 1) * this.CP_K - 1) / CP_QI.a("f", (int)20526, (long)(0x6CB286FE5092E00DL ^ l));
                int n8 = n6 % CP_QI.a("f", (int)20526, (long)(0x6CB286FE5092E00DL ^ l));
                n3 = CP_Qv.CP_V();
                this.CP_r[n7] = this.CP_r[n7] & (this.CP_w << n8 ^ e) | ((long)n2 & this.CP_w) << n8;
                object = n7;
                n4 = n5;
                if (n3 == 0) break block4;
                if (object == n4) break block5;
                object = CP_QI.a("f", (int)20526, (long)(0x6CB286FE5092E00DL ^ l));
                n4 = n8;
            }
            int n9 = object - n4;
            int n10 = this.CP_K - n9;
            this.CP_r[n5] = this.CP_r[n5] >>> n10 << n10 | ((long)n2 & this.CP_w) >> n9;
        }
        if (PacketWrapper.CP_z() == null) {
            CP_Qv.CP_E(++n3);
        }
    }

    @Override
    public long[] CP_UnderScore() {
        return this.CP_r;
    }

    @Override
    public int CP_U() {
        return this.CP_K;
    }

    @Override
    public int CP_r() {
        return this.CP_p;
    }

    public long CP_G() {
        return this.CP_w;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x483DABA28BB5L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "D\u00c28\u0085\u00ce\u00c6\u00dd\u009bC\u008a\u00a3\u0098\u00ddJ\u00ba\u0085";
        int n2 = "D\u00c28\u0085\u00ce\u00c6\u00dd\u009bC\u008a\u00a3\u0098\u00ddJ\u00ba\u0085".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray5 = new byte[8];
        byte[] byArray6 = byArray5;
        byArray5[0] = (byte)(l >>> 56);
        int n5 = 1;
        while (true) {
            if (n5 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray6)), new IvParameterSpec(new byte[8]));
                long l3 = 1515511808421073264L;
                byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                e = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
                return;
            }
            byArray6 = byArray6;
            byArray6[n5] = (byte)(l << n5 * 8 >>> 56);
            ++n5;
        }
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2DDA;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_QI", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_QI.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_QI.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_QI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_QI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

