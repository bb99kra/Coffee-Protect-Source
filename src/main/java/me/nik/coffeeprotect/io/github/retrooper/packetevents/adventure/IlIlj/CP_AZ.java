/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.CP_Z1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j.CP_A9;

class CP_AZ
extends CP_A9<Boolean> {
    private static final long c = CP_s.a(-4965860753244222374L, 604907182576172272L, MethodHandles.lookup().lookupClass()).a(228398506297411L);
    private static final String[] h;
    private static final String[] i;
    private static final Map j;
    private static transient /* synthetic */ String JUgOYPgGew = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_AZ(Class clazz) {
        super(clazz);
    }

    public Boolean CP_R(String string) throws IllegalArgumentException {
        String string2;
        block11: {
            boolean bl;
            block9: {
                String string3;
                long l;
                block10: {
                    l = c ^ 0x76DDF4047900L;
                    string3 = CP_Z1.CP_b();
                    try {
                        try {
                            bl = string.equalsIgnoreCase((String)((Object)CP_AZ.b("w", (int)7463, (long)(0xF43DE7C9BA65DD8L ^ l))));
                            if (string3 != null) break block9;
                            if (!bl) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_AZ.b(illegalArgumentException);
                        }
                        return Boolean.TRUE;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_AZ.b(illegalArgumentException);
                    }
                }
                try {
                    string2 = string;
                    if (string3 != null) break block11;
                    bl = string2.equalsIgnoreCase((String)((Object)CP_AZ.b("w", (int)13479, (long)(0x401954FF6B40F459L ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_AZ.b(illegalArgumentException);
                }
            }
            try {
                if (bl) {
                    return Boolean.FALSE;
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CP_AZ.b(illegalArgumentException);
            }
            string2 = string;
        }
        throw CP_AZ.CP_k(string2, Boolean.class, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        j = new HashMap(13);
        long l = c ^ 0x1B03DC8F0F17L;
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
        String string = "k\u0016\u00ebk_\u001c4$*o\u00df\u00f5\u0092lNp\u0010&\u00c4\u0000W\u00cd\u0080{N(\u00f0^Z\u00d2\u00deS\u0012";
        int n2 = "k\u0016\u00ebk_\u001c4$*o\u00df\u00f5\u0092lNp\u0010&\u00c4\u0000W\u00cd\u0080{N(\u00f0^Z\u00d2\u00deS\u0012".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_AZ.c(byArray3).intern();
            if ((n4 += n3) >= n2) {
                h = stringArray;
                i = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String c(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x109E;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/CP_j/CP_AZ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            CP_AZ.i[n2] = CP_AZ.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_AZ.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/CP_j/CP_AZ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_AZ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

