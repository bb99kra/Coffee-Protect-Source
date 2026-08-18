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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_QG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_iP {
    private CP_v_ CP_f;
    private float CP_O;
    private float CP_D;
    private static int CP_x;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String bshikXofKj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_iP(CP_v_ ilIlv_, float f, float f2) {
        this.CP_f = ilIlv_;
        this.CP_O = f;
        this.CP_D = f2;
    }

    public CP_iP(double d, double d2, double d3, float f, float f2) {
        this(new CP_v_(d, d2, d3), f, f2);
    }

    public CP_v_ CP_n() {
        return this.CP_f;
    }

    public double CP_m() {
        return this.CP_f.CP_l();
    }

    public double CP_h() {
        return this.CP_f.CP_k();
    }

    public double CP_R() {
        return this.CP_f.CP_Y();
    }

    public void CP_f(CP_v_ ilIlv_) {
        this.CP_f = ilIlv_;
    }

    public float CP_H() {
        return this.CP_O;
    }

    public void CP_I(float f) {
        this.CP_O = f;
    }

    public float CP_P() {
        return this.CP_D;
    }

    public void CP_m(float f) {
        this.CP_D = f;
    }

    public CP_QG CP_UnderScore() {
        double d = this.CP_H();
        double d2 = this.CP_P();
        float f = (float)(-Math.sin(Math.toRadians(d2)));
        double d3 = Math.cos(Math.toRadians(d2));
        float f2 = (float)(-d3 * Math.sin(Math.toRadians(d)));
        float f3 = (float)(d3 * Math.cos(Math.toRadians(d)));
        return new CP_QG(f2, f, f3);
    }

    public void CP_Z(CP_QG ilIlQG) {
        block6: {
            double d;
            double d2;
            double d3;
            double d4;
            block4: {
                block5: {
                    long l = a ^ 0x22610C201100L;
                    double d5 = Math.PI * 2;
                    int n = CP_iP.CP_W();
                    d4 = ilIlQG.CP_Y();
                    d3 = ilIlQG.CP_u();
                    d2 = d4;
                    d = 0.0;
                    if (n != 0) break block4;
                    if (d2 != d) break block5;
                    d2 = d3;
                    d = 0.0;
                    if (n != 0) break block4;
                    if (d2 != d) break block5;
                    float f = ilIlQG.CP_g();
                    if (n == 0) {
                        f = this.CP_D = (double)f > 0.0 ? -90.0f : 90.0f;
                    }
                    if (n == 0) break block6;
                }
                d2 = -d4;
                d = d3;
            }
            double d6 = Math.atan2(d2, d);
            this.CP_O = (float)Math.toDegrees((d6 + Math.PI * 2) % (Math.PI * 2));
            double d7 = d4 * d4;
            double d8 = d3 * d3;
            double d9 = Math.sqrt(d7 + d8);
            this.CP_D = (float)Math.toDegrees(Math.atan((double)(-ilIlQG.CP_g()) / d9));
        }
    }

    public CP_iP CP_p() {
        return new CP_iP(this.CP_f, this.CP_O, this.CP_D);
    }

    public String toString() {
        long l = a ^ 0x32117188E3BBL;
        return (String)((Object)CP_iP.a("i", (int)17253, (long)(0x6DE2D4240E8A89B1L ^ l))) + this.CP_f.toString() + (String)((Object)CP_iP.a("i", (int)31361, (long)(0x64AD09A279D4B054L ^ l))) + this.CP_O + (String)((Object)CP_iP.a("i", (int)27563, (long)(0x685AC9BAB579217CL ^ l))) + this.CP_D + "}";
    }

    public static void CP_e(int n) {
        CP_x = n;
    }

    public static int CP_I() {
        return CP_x;
    }

    public static int CP_W() {
        int n = CP_iP.CP_I();
        if (n == 0) {
            return 64;
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-512895736736368075L, 1420258592025462117L, MethodHandles.lookup().lookupClass()).a(15272036436088L);
        d = new HashMap(13);
        long l = a ^ 0x7D0A4017BB2EL;
        CP_iP.CP_e(36);
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
        String string = "\u001d$\u00eb\u00ceE\u00c5\u00b2\u00fc\u00a7\u0012\u00de5\u00e2C\u00e7\u00c1'\u009es\u00db\u00d1\u0091\u00c8\u0014 `\u00b3Z\u009b>\u008a\u009dt\u00ff' \u00bct\u0081\u0014\u00d2\u001a\u00ad\u00d40\u00ceQ\u009d\u00ad=z\u0012K\u00883\u008c\u00bb  P\u00b8`\u00d6I\u00c6\u0000g\u0014\u001a\u0091\u00dbF\u0017\u00df\u00f8\u00fd\u00b0k\nd\u00ec\u00e1\u009d\u00c4\u0086\u0013\u00af)\\\u00c8";
        int n2 = "\u001d$\u00eb\u00ceE\u00c5\u00b2\u00fc\u00a7\u0012\u00de5\u00e2C\u00e7\u00c1'\u009es\u00db\u00d1\u0091\u00c8\u0014 `\u00b3Z\u009b>\u008a\u009dt\u00ff' \u00bct\u0081\u0014\u00d2\u001a\u00ad\u00d40\u00ceQ\u009d\u00ad=z\u0012K\u00883\u008c\u00bb  P\u00b8`\u00d6I\u00c6\u0000g\u0014\u001a\u0091\u00dbF\u0017\u00df\u00f8\u00fd\u00b0k\nd\u00ec\u00e1\u009d\u00c4\u0086\u0013\u00af)\\\u00c8".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_iP.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1C8;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_iP", exception);
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
            CP_iP.c[n2] = CP_iP.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_iP.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_iP" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_iP.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

