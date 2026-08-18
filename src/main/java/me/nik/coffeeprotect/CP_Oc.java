/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
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
import me.nik.coffeeprotect.CP_u7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Material;

class CP_Oc {
    private final String CP_U;
    private final Material CP_t;
    private static final long a = CP_s.a(-2218670480667929971L, -2104414691239005352L, MethodHandles.lookup().lookupClass()).a(263663197419754L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String zDdFFNtZzo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Oc(String string, Material material) {
        this.CP_U = string;
        this.CP_t = material;
    }

    public CP_Oc(String string) {
        this.CP_U = string;
        this.CP_t = null;
    }

    private static CP_Oc CP_k() {
        return new CP_Oc(null);
    }

    private static CP_Oc CP_e(Material material) {
        long l = a ^ 0x59C2C59CCEEEL;
        return new CP_Oc((String)((Object)CP_Oc.a("y", (int)6747, (long)(0x1753824765E10610L ^ l))), material);
    }

    public boolean CP_J() {
        long l = a ^ 0x4B2A63C8C307L;
        return this.CP_U == null;
    }

    public boolean CP_I() {
        long l = a ^ 0x1182207B146FL;
        return this.CP_U.equals(CP_Oc.a("y", (int)11546, (long)(0x568BD462ED2C6BD2L ^ l)));
    }

    public Material CP_l() {
        return this.CP_t;
    }

    public String CP_q() {
        long l = a ^ 0x38545B20C1EBL;
        String string = CP_u7.CP_q();
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.CP_U;
        if (string == null) {
            stringBuilder = stringBuilder.append(string2);
            string2 = this.CP_t == null ? "" : (String)((Object)CP_Oc.a("y", (int)17810, (long)(0x13FDE148777656DDL ^ l))) + this.CP_t.name() + "]";
        }
        return stringBuilder.append(string2).toString();
    }

    static CP_Oc CP_O() {
        return CP_Oc.CP_k();
    }

    static CP_Oc CP_P(Material material) {
        return CP_Oc.CP_e(material);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x3B60F854B35L;
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
        String string = "\u0018\u00d9 \u00e7\u007f\u00e7\u0093Y\u0092\u0002\u0001\u0016\u0084\u00f8\u00b4\u00e7\u0010@'\u00d1\u0084\u00f1\u00a9\u00d6\u00b3[\u00ef1ra^\u00c0\u0003\u0010\u001e3\u0091\u00ef\u00d8;\u0083GD\u0088\u00cbd\u0007\f`\u00b7";
        int n2 = "\u0018\u00d9 \u00e7\u007f\u00e7\u0093Y\u0092\u0002\u0001\u0016\u0084\u00f8\u00b4\u00e7\u0010@'\u00d1\u0084\u00f1\u00a9\u00d6\u00b3[\u00ef1ra^\u00c0\u0003\u0010\u001e3\u0091\u00ef\u00d8;\u0083GD\u0088\u00cbd\u0007\f`\u00b7".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Oc.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4F2A;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Oc", exception);
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
            CP_Oc.c[n2] = CP_Oc.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Oc.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Oc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Oc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
