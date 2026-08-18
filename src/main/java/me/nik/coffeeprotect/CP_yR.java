/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_Li;
import me.nik.coffeeprotect.Check;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class CP_yR {
    private static final CharsetDecoder CP_w;
    private static int[] CP_P;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String aYpuoaiwUd = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_yR() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public static boolean CP_r(String var0, int var1_1) {
        block14: {
            block17: {
                block18: {
                    block15: {
                        block16: {
                            var2_2 = CP_yR.a ^ 25891685574192L;
                            var5_3 = var0.length();
                            var4_4 = Check.CP_Q();
                            v0 = Math.abs(var5_3);
                            if (var4_4 == null) {
                                if (v0 > var1_1) {
                                    return true;
                                }
                                v0 = CP_Li.CP_e(var0, (String)CP_yR.a("f", (int)9855, (long)(4256878517085455911L ^ var2_2)));
                            }
                            if (var4_4 != null) break block15;
                            if (v0) break block16;
                            v1 = var0;
                            if (var4_4 != null) break block17;
                            if (!CP_Li.CP_e(v1, (String)CP_yR.a("f", (int)21328, (long)(427751167458456329L ^ var2_2)))) break block18;
                        }
                        v0 = 1;
                    }
                    return v0;
                }
                v1 = var0;
            }
            var6_5 = v1.getBytes(StandardCharsets.UTF_8);
            var7_6 = CharBuffer.allocate(var6_5.length);
            var8_7 = ByteBuffer.wrap(var6_5);
            var9_8 = CP_yR.CP_w.decode(var8_7, var7_6, true);
            v2 = var9_8.isUnderflow();
            if (var4_4 == null) {
                if (v2 == 0) {
                    return true;
                }
                v2 = 0;
            }
            var11_9 = v2;
            var12_10 = 0;
            while (var12_10 < var5_3) {
                block19: {
                    var10_11 = var0.charAt(var12_10);
                    v3 = Character.isHighSurrogate(var10_11);
                    if (var4_4 != null) break block14;
                    if (var4_4 != null) break block19;
                    if (v3) ** GOTO lbl-1000
                    v4 = Character.isLowSurrogate(var10_11);
                    if (var4_4 == null) {
                        ** if (v4 == 0) goto lbl-1000
                    }
                    ** GOTO lbl45
lbl-1000:
                    // 2 sources

                    {
                        v5 = var11_9 + 1;
                        ** GOTO lbl46
                    }
lbl-1000:
                    // 1 sources

                    {
                        v4 = var11_9;
lbl45:
                        // 2 sources

                        v5 = var11_9 = v4 - 1;
                    }
                }
                if (var4_4 == null) {
                    if (var11_9 > 5) {
                        return true;
                    }
                    ++var12_10;
                }
                if (var4_4 == null) continue;
            }
            v3 = false;
        }
        return v3;
    }

    public static boolean CP_x(int n, String ... stringArray) {
        boolean bl;
        block4: {
            long l = a ^ 0x1B0407C47791L;
            String[] stringArray2 = stringArray;
            int n2 = stringArray2.length;
            PacketWrapper[] packetWrapperArray = Check.CP_Q();
            int n3 = 0;
            while (n3 < n2) {
                String string = stringArray2[n3];
                if (packetWrapperArray == null) {
                    bl = CP_yR.CP_r(string, n);
                    if (packetWrapperArray != null) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n3;
                }
                if (packetWrapperArray == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean CP_J(double ... dArray) {
        boolean bl;
        block4: {
            long l = a ^ 0x20BEDC16E151L;
            double[] dArray2 = dArray;
            int n = dArray2.length;
            PacketWrapper[] packetWrapperArray = Check.CP_Q();
            int n2 = 0;
            while (n2 < n) {
                double d = dArray2[n2];
                if (packetWrapperArray == null) {
                    bl = CP_yR.CP_j(d);
                    if (packetWrapperArray != null) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n2;
                }
                if (packetWrapperArray == null) continue;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean CP_j(double d) {
        long l = a ^ 0x314EAE6E9700L;
        PacketWrapper[] packetWrapperArray = Check.CP_Q();
        int n = Double.isFinite(d);
        if (packetWrapperArray != null) return n != 0;
        if (n == 0) return 1 != 0;
        double d2 = Math.abs(d) - Double.MAX_VALUE;
        n = d2 == 0.0 ? 0 : (d2 > 0.0 ? 1 : -1);
        if (packetWrapperArray != null) return n != 0;
        if (n < 0) return 0 != 0;
        return 1 != 0;
    }

    public static boolean CP_M(float ... fArray) {
        boolean bl;
        block5: {
            long l = a ^ 0x271F731C32B4L;
            float[] fArray2 = fArray;
            PacketWrapper[] packetWrapperArray = Check.CP_Q();
            int n = fArray2.length;
            int n2 = 0;
            while (n2 < n) {
                float f = fArray2[n2];
                if (packetWrapperArray == null) {
                    bl = CP_yR.CP_R(f);
                    if (packetWrapperArray != null) break block5;
                    if (bl) {
                        return true;
                    }
                    ++n2;
                }
                if (packetWrapperArray == null) continue;
            }
            bl = false;
        }
        if (PacketWrapper.CP_z() == null) {
            Check.CP_x(new PacketWrapper[2]);
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean CP_R(float f) {
        long l = a ^ 0x172606482484L;
        PacketWrapper[] packetWrapperArray = Check.CP_Q();
        int n = Float.isFinite(f);
        if (packetWrapperArray != null) return n != 0;
        if (n == 0) return 1 != 0;
        float f2 = Math.abs(f) - Float.MAX_VALUE;
        n = f2 == 0.0f ? 0 : (f2 > 0.0f ? 1 : -1);
        if (packetWrapperArray != null) return n != 0;
        if (n < 0) return 0 != 0;
        return 1 != 0;
    }

    public static boolean CP_q(int ... nArray) {
        boolean bl;
        block4: {
            long l = a ^ 0x25CA89A38000L;
            int[] nArray2 = nArray;
            PacketWrapper[] packetWrapperArray = Check.CP_Q();
            int n = nArray2.length;
            int n2 = 0;
            while (n2 < n) {
                int n3 = nArray2[n2];
                if (packetWrapperArray == null) {
                    bl = CP_yR.CP_j(n3);
                    if (packetWrapperArray != null) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n2;
                }
                if (packetWrapperArray == null) continue;
                PacketWrapper.CP_e(new int[4]);
                break;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean CP_j(int n) {
        long l = a ^ 0x3247DEBCC085L;
        PacketWrapper[] packetWrapperArray = Check.CP_Q();
        int n2 = n;
        if (packetWrapperArray != null) return n2 != 0;
        if (n2 == CP_yR.b("w", (int)16753, (long)(0x41314D34C2185F50L ^ l))) return 1 != 0;
        n2 = n;
        if (packetWrapperArray != null) return n2 != 0;
        if (n2 != CP_yR.b("w", (int)14401, (long)(0xF1EA79B65A62661L ^ l))) return 0 != 0;
        return 1 != 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-928813211365702424L, 1500986229593232037L, MethodHandles.lookup().lookupClass()).a(94105275883731L);
        d = new HashMap(13);
        long l = a ^ 0x3EA52684F068L;
        CP_yR.CP_d(null);
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
        String string = "\u0018_\u00b2\b7 X\u009d\u00b4\u00b6\u0097bh\u00d3\u00f5\u007f $\u0089\u00c4&`\u00faE\u0092{\u00b1\u00ac:\u007f|\u00a5\u00a6\u00cac\u0092\u00ee\u000f1\u000f\u00bb\u00ff\u001d\u00b4=U\u00f3\u0090\u00d4";
        int n2 = "\u0018_\u00b2\b7 X\u009d\u00b4\u00b6\u0097bh\u00d3\u00f5\u007f $\u0089\u00c4&`\u00faE\u0092{\u00b1\u00ac:\u007f|\u00a5\u00a6\u00cac\u0092\u00ee\u000f1\u000f\u00bb\u00ff\u001d\u00b4=U\u00f3\u0090\u00d4".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_yR.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[2];
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
        String string2 = "N\u00fbH\u009d9\u00de;Y\u00e8\u001f,5\u00cd\u001bd\u00d7";
        int n7 = "N\u00fbH\u009d9\u00de;Y\u00e8\u001f,5\u00cd\u001bd\u00d7".length();
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
        CP_w = StandardCharsets.UTF_8.newDecoder();
    }

    public static void CP_d(int[] nArray) {
        CP_P = nArray;
    }

    public static int[] CP_p() {
        return CP_P;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x106D;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_yR", exception);
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
            CP_yR.c[n2] = CP_yR.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_yR.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_yR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x8A0;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_yR", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_yR.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_yR.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_yR" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_yR.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_yR.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
