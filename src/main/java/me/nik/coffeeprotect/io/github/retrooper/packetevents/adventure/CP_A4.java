/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonParseException
 *  com.google.gson.TypeAdapter
 *  com.google.gson.stream.JsonReader
 *  com.google.gson.stream.JsonWriter
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
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
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_hj;

final class CP_A4
extends TypeAdapter<CP_hj> {
    static final TypeAdapter<CP_hj> CP_R;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String KYqmKdTbpB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_A4() {
    }

    public CP_hj CP_i(JsonReader jsonReader) throws IOException {
        long l = a ^ 0x7544D540BF99L;
        String string = jsonReader.nextString();
        try {
            return CP_hj.CP_G(string);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new JsonParseException((String)((Object)CP_A4.a("j", (int)15481, (long)(0x35392600C18F45D5L ^ l))) + string + (String)((Object)CP_A4.a("j", (int)6836, (long)(0x2948E1E604F1E319L ^ l))));
        }
    }

    public void CP_C(JsonWriter jsonWriter, CP_hj ilIlhj) throws IOException {
        jsonWriter.value(ilIlhj.CP_m());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(8450837698736125125L, 1972734775934280897L, MethodHandles.lookup().lookupClass()).a(126968056781346L);
        d = new HashMap(13);
        long l = a ^ 0x5E7C749C39E9L;
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
        String string = "\u0007\u00c4\u00e9\u00d2\u00a6\u00a4Q\u00f0mo\u00fdnC\u00cd,6\u00c2L%\u00afx\u00c8\u0082\u0017\u00c6<\u00c4\u001f\u0087i\u00a6\u0016\u00dc!\u0097\u000b\u0097jV\u00dd(AH\u0090\u00d6\u00a3\u0083\u009f\u001f\u00c6\u0085\u0097g\u0091\u00cb\u009d=G:@a<\u0084\u001f\u00b4E\u00a1\u00aez@\u00d7\u0011\u00df\u0085N>\u00f7U\u00f9J\u00cc";
        int n2 = "\u0007\u00c4\u00e9\u00d2\u00a6\u00a4Q\u00f0mo\u00fdnC\u00cd,6\u00c2L%\u00afx\u00c8\u0082\u0017\u00c6<\u00c4\u001f\u0087i\u00a6\u0016\u00dc!\u0097\u000b\u0097jV\u00dd(AH\u0090\u00d6\u00a3\u0083\u009f\u001f\u00c6\u0085\u0097g\u0091\u00cb\u009d=G:@a<\u0084\u001f\u00b4E\u00a1\u00aez@\u00d7\u0011\u00df\u0085N>\u00f7U\u00f9J\u00cc".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_A4.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                CP_R = new CP_A4().nullSafe();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x579D;
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
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/CP_A4", exception);
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
            CP_A4.c[n2] = CP_A4.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_A4.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/CP_A4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_A4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

