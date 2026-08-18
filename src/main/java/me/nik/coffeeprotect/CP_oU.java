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
import me.nik.coffeeprotect.CP_fq;
import me.nik.coffeeprotect.CP_j9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_oU
implements CP_j9 {
    private static final long a = CP_s.a(873091587093649556L, 8202746922558979881L, MethodHandles.lookup().lookupClass()).a(167202919321294L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String BGrnUQwRwW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public String CP_O(String string) {
        long l = a ^ 0x4190D5592D5AL;
        String[] stringArray = CP_fq.CP_B();
        String string2 = (String)((Object)CP_oU.a("n", (int)1486, (long)(0x56C66D2654E92A02L ^ l))) + string + (String)((Object)CP_oU.a("n", (int)7076, (long)(0xF44A39EB615346AL ^ l)));
        if (PacketWrapper.CP_z() == null) {
            CP_fq.CP_C(new String[4]);
        }
        return string2;
    }

    @Override
    public boolean CP_s(String string) {
        long l = a ^ 0x715C3D4F5B2CL;
        return string.contains((CharSequence)((Object)CP_oU.a("n", (int)31138, (long)(0x5A1ADCA8549201BL ^ l))));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x5B80D92C79A3L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00c9\u001f\u00ee\u00e4\u00b3\u00d0\u00d1\u009aN\u00f6\u00c4C\u00eeT\u009b\u001c\u00101\u00c3\u00ae/\u00e8];\u0003j.K\u00fa\u00db\u0094d\u00c00\u00ac|<rk@\u008bv\u00f9c\u0090\u00f8At$V\u008c\u0006@\u00eb\u0002\u00d8}T\u001b\u00c7f\u00bb\u00a7\u0012g6\u00a0E\u0007\u009b\u00dd\u0010#/\u00fa\u00e2\u00f2\u00b1\u00b0s\u000f\u00f6";
        int n2 = "\u00c9\u001f\u00ee\u00e4\u00b3\u00d0\u00d1\u009aN\u00f6\u00c4C\u00eeT\u009b\u001c\u00101\u00c3\u00ae/\u00e8];\u0003j.K\u00fa\u00db\u0094d\u00c00\u00ac|<rk@\u008bv\u00f9c\u0090\u00f8At$V\u008c\u0006@\u00eb\u0002\u00d8}T\u001b\u00c7f\u00bb\u00a7\u0012g6\u00a0E\u0007\u009b\u00dd\u0010#/\u00fa\u00e2\u00f2\u00b1\u00b0s\u000f\u00f6".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_oU.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x70DE;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_oU", exception);
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
            CP_oU.c[n2] = CP_oU.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_oU.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_oU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_oU.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
