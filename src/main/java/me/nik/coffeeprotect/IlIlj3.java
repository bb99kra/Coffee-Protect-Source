/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
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
import me.nik.coffeeprotect.IlIlfq;
import me.nik.coffeeprotect.IlIlj9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlj3
implements IlIlj9 {
    private static final long a = IlIls.a((long)719787266492857884L, (long)8220808406065499565L, MethodHandles.lookup().lookupClass()).a(11877038767056L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String DUTdKHjnDN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public String IlIlO(String string) {
        long l = a ^ 0x21EB6DB854BAL;
        String[] stringArray = IlIlfq.IlIlB();
        String string2 = (String)((Object)IlIlj3.a("g", (int)31166, (long)(0x3A03A3647B70C093L ^ l))) + string + (String)((Object)IlIlj3.a("g", (int)12520, (long)(0x66BC8D6DB13889C7L ^ l)));
        if (stringArray != null) {
            PacketWrapper.IlIle((int[])new int[3]);
        }
        return string2;
    }

    @Override
    public boolean IlIls(String string) {
        long l = a ^ 0x112785AE22CCL;
        return string.contains((CharSequence)((Object)IlIlj3.a("g", (int)3400, (long)(0x3CA2F291AE2C4210L ^ l))));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x48A6D52B7219L;
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
        String string = "n>\u00be\u00ad-\u00b7\n\u00bf\u00a4\u00b9Z\u00ce\u001d&\u00d4\u00bb2\u00cf\u00f2'F\u0019\u00d9\"\u001d\u00e8\u00a0\u008b\u001c\u00db-C\u00eb<$\u00e0!\u00f1\u00fc\u00b9\u00e9/\u00a2\u00a2\u00b2\u0099\u00bf\u00b6)N8\u00dd\u00eb\u00b7\u0014\u00d4 NW\u0002\u00a3&t\u0004\u00ac\u00e7\u00e9\u0010\u00b0\u00deq{\u0013\u00b3\u00f5#\u00b2~\u00df\u0086\f\u008e\u0087\u00b0\u00d4\u009b#\u00bc\u00e18\nh\u001bbd\u00bf\u00f9^\u0004;\u00fb\u00af\u0084\u0085A\u00be\u00b7/\u00a2\u00c5\u0082\u00e9H\u00a3e8.\u0019a#\u0099'V5\u00e7\u00b2\u00d5\u000eo\u00b0\u00dc\t<G\u008b<\u009e6\u0083\u00f4\u00b9\u00a0\u0094SZ\u00b9";
        int n2 = "n>\u00be\u00ad-\u00b7\n\u00bf\u00a4\u00b9Z\u00ce\u001d&\u00d4\u00bb2\u00cf\u00f2'F\u0019\u00d9\"\u001d\u00e8\u00a0\u008b\u001c\u00db-C\u00eb<$\u00e0!\u00f1\u00fc\u00b9\u00e9/\u00a2\u00a2\u00b2\u0099\u00bf\u00b6)N8\u00dd\u00eb\u00b7\u0014\u00d4 NW\u0002\u00a3&t\u0004\u00ac\u00e7\u00e9\u0010\u00b0\u00deq{\u0013\u00b3\u00f5#\u00b2~\u00df\u0086\f\u008e\u0087\u00b0\u00d4\u009b#\u00bc\u00e18\nh\u001bbd\u00bf\u00f9^\u0004;\u00fb\u00af\u0084\u0085A\u00be\u00b7/\u00a2\u00c5\u0082\u00e9H\u00a3e8.\u0019a#\u0099'V5\u00e7\u00b2\u00d5\u000eo\u00b0\u00dc\t<G\u008b<\u009e6\u0083\u00f4\u00b9\u00a0\u0094SZ\u00b9".length();
        int n3 = 56;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlj3.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x663F;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlj3", exception);
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
            IlIlj3.c[n2] = IlIlj3.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlj3.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlj3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlj3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

