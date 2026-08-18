/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_OU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CubicBezierEasingType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_f3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_ja
implements CP_OU<CubicBezierEasingType> {
    private static final long a = CP_s.a(5973451552768865301L, 3457354604831858736L, MethodHandles.lookup().lookupClass()).a(274099321632746L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String dwqsTMOhFG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_ja() {
    }

    public CubicBezierEasingType CP_e(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws CP_Xv {
        long l = a ^ 0x47EBF274E0C1L;
        CP_f3 ilIlf3 = nBTCompound.getOrThrow((String)((Object)CP_ja.a("s", (int)17799, (long)(0x4D8CE3B11C68DA9CL ^ l))), CP_f3.CP_u, packetWrapper);
        return new CubicBezierEasingType(ilIlf3);
    }

    public void CP_b(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, CubicBezierEasingType cubicBezierEasingType) throws CP_Xv {
        long l = a ^ 0x2553C18F6E5CL;
        nBTCompound.set((String)((Object)CP_ja.a("s", (int)29616, (long)(0x1A9CAEEAE7996237L ^ l))), CubicBezierEasingType.CP_n(cubicBezierEasingType), CP_f3.CP_u, packetWrapper);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x2E985EAC095BL;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\bmtQ\u00e4\u00aa\u00c5(GS\u00c9\u00d2\u00fc\u00ca9\u00d5\u00e9\u00fa \u00b33HO?\u00e1\u00d2\u00e4\u00d0\u00197>\u00e1 \u00c71\u00a4\u0083D\u00c6\u009a7\u001d\u00da\\\u009a\u00aa[\u00e7>\u0096l\u0084\u00b9\u0003e\u0013]\u00f2SH(\u00ce_r\u00eb";
        int n2 = "\bmtQ\u00e4\u00aa\u00c5(GS\u00c9\u00d2\u00fc\u00ca9\u00d5\u00e9\u00fa \u00b33HO?\u00e1\u00d2\u00e4\u00d0\u00197>\u00e1 \u00c71\u00a4\u0083D\u00c6\u009a7\u001d\u00da\\\u009a\u00aa[\u00e7>\u0096l\u0084\u00b9\u0003e\u0013]\u00f2SH(\u00ce_r\u00eb".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_ja.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5110;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/attributes/easing/CP_ja", exception);
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
            CP_ja.c[n2] = CP_ja.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_ja.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/attributes/easing/CP_ja" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_ja.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

