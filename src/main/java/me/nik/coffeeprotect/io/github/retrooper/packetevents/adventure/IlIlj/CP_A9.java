/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j.CP_nv;
import org.jspecify.annotations.Nullable;

abstract class CP_A9<T>
implements CP_nv<T> {
    private final Class<T> CP_M;
    private static final long b = CP_s.a(6544944361614781988L, -5347228834152047660L, MethodHandles.lookup().lookupClass()).a(212003844416648L);
    private static final String[] e;
    private static final String[] f;
    private static final Map g;

    CP_A9(Class<T> clazz) {
        this.CP_M = clazz;
    }

    @Override
    public Class<T> CP_I() {
        return this.CP_M;
    }

    static IllegalArgumentException CP_k(String string, Class<?> clazz, @Nullable String string2) {
        String string3;
        StringBuilder stringBuilder;
        IllegalArgumentException illegalArgumentException;
        IllegalArgumentException illegalArgumentException2;
        long l = b ^ 0x7EC0960A5983L;
        try {
            IllegalArgumentException illegalArgumentException3;
            illegalArgumentException2 = illegalArgumentException3;
            illegalArgumentException = illegalArgumentException3;
            stringBuilder = new StringBuilder().append((String)((Object)CP_A9.a("j", (int)16042, (long)(0x680A4BA5F3C1A9EFL ^ l)))).append(string).append((String)((Object)CP_A9.a("j", (int)18548, (long)(0x629D55B0E9A25F30L ^ l)))).append(clazz.getName());
            string3 = string2 == null ? "" : (String)((Object)CP_A9.a("j", (int)14508, (long)(0x6E68282ED2C0AFEBL ^ l))) + string2;
        }
        catch (IllegalArgumentException illegalArgumentException4) {
            throw CP_A9.a(illegalArgumentException4);
        }
        illegalArgumentException2(stringBuilder.append(string3).toString());
        throw illegalArgumentException;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        g = new HashMap(13);
        long l = b ^ 0x33411EAB064AL;
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
        String string = "\u0003\u00e7\u0090I0\u00b9}\u00b0\u00fc\u0091\u0013=\u00fa-jdq4\u00b76\u00dbg\u00adaT|V\u0089q\u00ad\u00b7\u00f1\u00cfC\u00ce\u00faR_$\u00f1%7\u00f0x\u00fb^\u0003\u00ff[\n\u00e9O\u00d0\u00b1\u00da\u00cc\u0018\u00f0\u00f1.R\u0085\u00df\u00bf\u009c\u008e\u00d5L1Q\u00bd\u0011iJ\u008d\u00afHa\u00e0M\u009f\u0010\"YU\u00e6\u00e1\u00c4\u00ca\"\u00d4\u00c9\u00ab\u007f\u0019\u00b2\te";
        int n2 = "\u0003\u00e7\u0090I0\u00b9}\u00b0\u00fc\u0091\u0013=\u00fa-jdq4\u00b76\u00dbg\u00adaT|V\u0089q\u00ad\u00b7\u00f1\u00cfC\u00ce\u00faR_$\u00f1%7\u00f0x\u00fb^\u0003\u00ff[\n\u00e9O\u00d0\u00b1\u00da\u00cc\u0018\u00f0\u00f1.R\u0085\u00df\u00bf\u009c\u008e\u00d5L1Q\u00bd\u0011iJ\u008d\u00afHa\u00e0M\u009f\u0010\"YU\u00e6\u00e1\u00c4\u00ca\"\u00d4\u00c9\u00ab\u007f\u0019\u00b2\te".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_A9.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                e = stringArray;
                f = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String b(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x67E2;
        if (f[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])g.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/CP_j/CP_A9", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = e[n2].getBytes("ISO-8859-1");
            CP_A9.f[n2] = CP_A9.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return f[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_A9.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/CP_j/CP_A9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_A9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

