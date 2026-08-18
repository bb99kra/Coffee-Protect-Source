/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URL;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ThreadLocalRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_ru;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_Zv {
    private boolean CP_K;
    private boolean CP_J;
    private boolean CP_H = false;
    private static String CP_a;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String BlvOZzQTRH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public void CP_F() {
        this.CP_H = true;
        CompletableFuture.runAsync(() -> {
            ArrayList<String> arrayList;
            long l;
            block13: {
                l = a ^ 0x28D306FFC4FBL;
                arrayList = new ArrayList<String>();
                String string = CP_Zv.CP_X();
                try {
                    String string2;
                    CP_ru ilIlru = new CP_ru(this.getClass());
                    URL uRL = new URL(ilIlru.decrypt((String)((Object)CP_Zv.a("e", (int)10154, (long)(0xF0DBFD7AB256C52L ^ l))), ThreadLocalRandom.current().nextInt(1, (int)CP_Zv.b("n", (int)29512, (long)(0x2F47980E36306E6AL ^ l)))));
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRL.openStream()));
                    while ((string2 = bufferedReader.readLine()) != null) {
                        try {
                            arrayList.add(ilIlru.decrypt(string2, ThreadLocalRandom.current().nextInt(1, (int)CP_Zv.b("n", (int)1830, (long)(0x686292A0240D1A05L ^ l)))));
                            if (string == null) {
                                if (string == null) continue;
                                break;
                            }
                            break block13;
                        }
                        catch (IOException iOException) {
                            throw CP_Zv.a(iOException);
                        }
                    }
                    bufferedReader.close();
                }
                catch (IOException iOException) {
                    CP_Zv ilIlZv;
                    block14: {
                        block15: {
                            try {
                                try {
                                    ilIlZv = this;
                                    if (string != null) break block14;
                                    if (!ilIlZv.CP_J) break block15;
                                }
                                catch (IOException iOException2) {
                                    throw CP_Zv.a(iOException2);
                                }
                                this.CP_K = false;
                                return;
                            }
                            catch (IOException iOException3) {
                                throw CP_Zv.a(iOException3);
                            }
                        }
                        this.CP_J = true;
                        ilIlZv = this;
                    }
                    ilIlZv.CP_F();
                    return;
                }
            }
            try {
                if (arrayList.contains(CP_Zv.a("e", (int)148, (long)(0x3A6D81053421CB6EL ^ l)))) {
                    this.CP_K = true;
                    return;
                }
            }
            catch (IOException iOException) {
                throw CP_Zv.a(iOException);
            }
            this.CP_K = ((String)((Object)CP_Zv.a("e", (int)14097, (long)(0x34BBC52081887CE8L ^ l)))).isEmpty();
        });
    }

    public boolean CP_b() {
        return this.CP_K;
    }

    public boolean CP_v() {
        return this.CP_H;
    }

    public static void CP_O(String string) {
        CP_a = string;
    }

    public static String CP_X() {
        return CP_a;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-7294807184619144824L, -8775720078034998612L, MethodHandles.lookup().lookupClass()).a(211464993002904L);
        d = new HashMap(13);
        CP_Zv.CP_O(null);
        long l = a ^ 0x8F31BDECA48L;
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
        String string = "\u00bc%J2\u00b4\u00bf|\u001f\u00b6\u00a4\u0013\u00ba$\u000f-\u0018\u00ed)\u008a\u0010g\u00e2\u0019a\u0095_\u0094o\u00d6\u0004\u0000\u00eb\u00e7w\u009e\u00cf\u00depa\u0084\u00d1\u00a9\u00e2*\u00917\u00ca\u0010\u00e6\u00fe{k\u00c3\u009aH\u00a1\u00ed\u0089\u0006\u00a2\u00df\u00e4\u00a3\u00f6\u0017n\u00e2\u008b\u0091\u0080\u00fe9\u00eaD\u00a8\u00f1Y\u00ce\u0014\u00ad\u0016\u00b1\u008d\u0001(\u0092V\u0000?3\u00c7\u00aeN-9\u00d4\u00f0G\u00a1\u00d7\u00e0fz\u00aaYJ\u00be5yxfig0\u00ac\u00c8\u00e7\u00d1\u00a1\u00c99\u00b8\u00f1I2\u008b\u00e0S\u0000\u001eI\u00135j\tN\u00ce|V\u00c0\u00bb\u00df\u0092\u001a`\u0010\u00a6\u00f8\u009f\u008fr\u0016]\u00b9:\u00bf\u00b6\u0087G<\u0018\u0084)d\u0015\u00af\u0094\u0092\u00aa\u00cf\u00c4\u001a\u0081\u00af\u007f\u00e9\u0002\u00a75\u00af\u00d4F\u0086\u008f\u001f\u0018\u00cd\u00ba3\u009f\u00e6Y\u00f6X\u0019Ch\u00b9\u009b\u00f3\u0082\u00fd\u00a8.\u00b1!\u001c$\u0006\u00cc";
        int n2 = "\u00bc%J2\u00b4\u00bf|\u001f\u00b6\u00a4\u0013\u00ba$\u000f-\u0018\u00ed)\u008a\u0010g\u00e2\u0019a\u0095_\u0094o\u00d6\u0004\u0000\u00eb\u00e7w\u009e\u00cf\u00depa\u0084\u00d1\u00a9\u00e2*\u00917\u00ca\u0010\u00e6\u00fe{k\u00c3\u009aH\u00a1\u00ed\u0089\u0006\u00a2\u00df\u00e4\u00a3\u00f6\u0017n\u00e2\u008b\u0091\u0080\u00fe9\u00eaD\u00a8\u00f1Y\u00ce\u0014\u00ad\u0016\u00b1\u008d\u0001(\u0092V\u0000?3\u00c7\u00aeN-9\u00d4\u00f0G\u00a1\u00d7\u00e0fz\u00aaYJ\u00be5yxfig0\u00ac\u00c8\u00e7\u00d1\u00a1\u00c99\u00b8\u00f1I2\u008b\u00e0S\u0000\u001eI\u00135j\tN\u00ce|V\u00c0\u00bb\u00df\u0092\u001a`\u0010\u00a6\u00f8\u009f\u008fr\u0016]\u00b9:\u00bf\u00b6\u0087G<\u0018\u0084)d\u0015\u00af\u0094\u0092\u00aa\u00cf\u00c4\u001a\u0081\u00af\u007f\u00e9\u0002\u00a75\u00af\u00d4F\u0086\u008f\u001f\u0018\u00cd\u00ba3\u009f\u00e6Y\u00f6X\u0019Ch\u00b9\u009b\u00f3\u0082\u00fd\u00a8.\u00b1!\u001c$\u0006\u00cc".length();
        int n3 = 160;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Zv.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[3];
        g = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "\u0084\u00d9\u008b\u00cf=\u00c5\u0006\u00c3\u00bdN\u00a3/\u009dZ\u00b2\u0099";
        int n7 = "\u0084\u00d9\u008b\u00cf=\u00c5\u0006\u00c3\u00bdN\u00a3/\u009dZ\u00b2\u0099".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        e = lArray;
        f = new Integer[2];
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Zv", exception);
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
            CP_Zv.c[n2] = CP_Zv.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Zv.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Zv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5697;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Zv", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Zv.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Zv.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_Zv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Zv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Zv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
