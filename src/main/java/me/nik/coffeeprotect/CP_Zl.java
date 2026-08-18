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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Zl {
    private int CP_r;
    private long CP_M;
    private long CP_UnderScore;
    private long CP_a;
    private long CP_A;
    private long CP_Y;
    private static String[] CP_q;
    private static final long a;
    private static final long[] b;
    private static final Long[] c;
    private static final Map d;
    private static transient /* synthetic */ String UJceOTAIMM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Zl() {
        long l = a ^ 0xEE199C43AF7L;
        this.CP_r = 0;
        this.CP_M = (long)CP_Zl.a("g", (int)25919, (long)(0x425DE4C464023E4L ^ l));
        this.CP_UnderScore = (long)CP_Zl.a("g", (int)29011, (long)(0x77D4C5158D2A3789L ^ l));
        this.CP_a = (long)CP_Zl.a("g", (int)29011, (long)(0x77D4C5158D2A3789L ^ l));
        String[] stringArray = CP_Zl.CP_v();
        this.CP_A = (long)CP_Zl.a("g", (int)29011, (long)(0x77D4C5158D2A3789L ^ l));
        this.CP_Y = (long)CP_Zl.a("g", (int)29011, (long)(0x77D4C5158D2A3789L ^ l));
        if (stringArray == null) {
            PacketWrapper.CP_e(new int[5]);
        }
    }

    public int CP_v() {
        return this.CP_r++;
    }

    public long CP_J() {
        return this.CP_a;
    }

    public long CP_V() {
        return this.CP_A;
    }

    public long CP_R() {
        return this.CP_M;
    }

    public long CP_K() {
        return this.CP_UnderScore;
    }

    public boolean CP_j() {
        long l = a ^ 0xFA5204B772FL;
        String[] stringArray = CP_Zl.CP_v();
        long l2 = this.CP_UnderScore - CP_Zl.a("g", (int)29011, (long)(0x77D4C45134A57A51L ^ l));
        long l3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
        if (stringArray != null) {
            l3 = l3 != false ? (long)1 : (long)0;
        }
        return (boolean)l3;
    }

    public long CP_w() {
        return this.CP_Y;
    }

    public void CP_d(long l) {
        this.CP_Y = l;
    }

    public void CP_B(long l) {
        this.CP_A = System.currentTimeMillis();
        this.CP_UnderScore = l;
    }

    public void CP_Y(long l) {
        long l2 = a ^ 0x34D46C85D81BL;
        this.CP_a = System.currentTimeMillis();
        String[] stringArray = CP_Zl.CP_v();
        this.CP_M = l;
        if (PacketWrapper.CP_z() == null) {
            CP_Zl.CP_K(new String[3]);
        }
    }

    public static void CP_K(String[] stringArray) {
        CP_q = stringArray;
    }

    public static String[] CP_v() {
        return CP_q;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-1876425906154428256L, -4268730513852280560L, MethodHandles.lookup().lookupClass()).a(153564847444620L);
        d = new HashMap(13);
        long l = a ^ 0x325F6C02BA38L;
        CP_Zl.CP_K(new String[1]);
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
        String string = "\u00e2\u0081\u008a\u001d3\u001byHu\u00e9\u0088\u0092\u00ffG\u00ff\u00fb";
        int n2 = "\u00e2\u0081\u008a\u001d3\u001byHu\u00e9\u0088\u0092\u00ffG\u00ff\u00fb".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Long[2];
    }

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1BC5;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Zl", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_Zl.c[n2] = l4;
        }
        return c[n2];
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_Zl.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_Zl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Zl.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
