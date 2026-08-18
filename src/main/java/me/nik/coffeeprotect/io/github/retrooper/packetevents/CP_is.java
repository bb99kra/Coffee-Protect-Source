/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_OI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Zb;

public abstract class CP_is {
    private final String CP_T;
    private static int CP_s;
    private static final long b;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;

    protected CP_is(String string) {
        block4: {
            block5: {
                long l = b ^ 0x2CCBA6F9A66CL;
                int n = CP_is.CP_m();
                int n2 = n;
                try {
                    try {
                        if (n2 != 0) break block4;
                        if (string != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_is.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException((String)((Object)CP_is.a("l", (int)31036, (long)(0x33FBC4DE239F6AE0L ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_is.a(illegalArgumentException);
                }
            }
            this.CP_T = string;
        }
    }

    public CP_OI CP_J(BiConsumer<String, Throwable> biConsumer, boolean bl) {
        CP_Zb ilIlZb;
        block7: {
            long l = b ^ 0x5872FA8C2BC3L;
            ilIlZb = new CP_Zb();
            int n = CP_is.CP_q();
            ilIlZb.CP_p((String)((Object)CP_is.a("l", (int)7269, (long)(0x31EF50B058E30215L ^ l))), this.CP_T);
            try {
                CP_OI ilIlOI;
                block8: {
                    ilIlOI = this.CP_S();
                    try {
                        if (n == 0) break block7;
                        if (ilIlOI != null) break block8;
                    }
                    catch (Throwable throwable) {
                        throw CP_is.a(throwable);
                    }
                    return null;
                }
                ilIlZb.CP_S((String)((Object)CP_is.a("l", (int)27052, (long)(0x31DEFACF979477DDL ^ l))), ilIlOI);
            }
            catch (Throwable throwable) {
                try {
                    if (bl) {
                        biConsumer.accept((String)((Object)CP_is.a("l", (int)30554, (long)(0x42D4CC7D91696928L ^ l))) + this.CP_T, throwable);
                    }
                }
                catch (Throwable throwable2) {
                    throw CP_is.a(throwable2);
                }
                return null;
            }
        }
        return ilIlZb.CP_d();
    }

    protected abstract CP_OI CP_S() throws Exception;

    public static void CP_n(int n) {
        CP_s = n;
    }

    public static int CP_q() {
        return CP_s;
    }

    public static int CP_m() {
        int n = CP_is.CP_q();
        try {
            if (n == 0) {
                return 25;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_is.a(illegalArgumentException);
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_is.b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(2298050197989209028L, 8121683176336237644L, MethodHandles.lookup().lookupClass()).a(182951048635055L);
                CP_is.e = new HashMap<K, V>(13);
                CP_is.CP_n(92);
                var0 = CP_is.b ^ 77306936995494L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "C\u00cb\u0015\u00d6\u009aX\u0093\u00d68S\u00fb/BnY\u00e4\u0010\u001a\u00b8\u00b1\u00b2\u00a0\u00aej\u00f8\u00cc\u00eb\u0090\u00a1\u00da\u00cb\u00fb\u0088";
                var8_6 = "C\u00cb\u0015\u00d6\u009aX\u0093\u00d68S\u00fb/BnY\u00e4\u0010\u001a\u00b8\u00b1\u00b2\u00a0\u00aej\u00f8\u00cc\u00eb\u0090\u00a1\u00da\u00cb\u00fb\u0088".length();
                var5_7 = 16;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_is.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b9\u00ab\u001c\u0080P\u00dfM\u00b4t)\u0017uq\u00c3\t\u00e4,\u00fe\u00d9\u0006 \u00b2P\t\r?l\u00ce\u00ef\u00bd\u0085\u00dc\u00e9\u008f\u00cb\u00aa\u00dd=\u00b0\u00970\t\u00fe\u00b9\u00d5\u00c5~/\u00e1\u00d3\u00ce\u0019O\u00dcF8\u00f23#\u00b2\u0084#r\u00ab\u009d|E\u00f5Bc\u00bc\u00ab8\u0083\u000fd:\u00a7\u00a2<I\u00161(\u00c5\u00bb\u00af\u007f\u001byu\u00acL\u00bc4\r\u00cf\u0003H\u00ed\u00c3\u0085\u00bc\u00c8\u009a+\u00b4\u0018j\u00d4IZ\u00f1\u001b\u00f98\u00b5\u00d9%\u000f\u00fbx\u0088as\fT8z";
                    var8_6 = "\u00b9\u00ab\u001c\u0080P\u00dfM\u00b4t)\u0017uq\u00c3\t\u00e4,\u00fe\u00d9\u0006 \u00b2P\t\r?l\u00ce\u00ef\u00bd\u0085\u00dc\u00e9\u008f\u00cb\u00aa\u00dd=\u00b0\u00970\t\u00fe\u00b9\u00d5\u00c5~/\u00e1\u00d3\u00ce\u0019O\u00dcF8\u00f23#\u00b2\u0084#r\u00ab\u009d|E\u00f5Bc\u00bc\u00ab8\u0083\u000fd:\u00a7\u00a2<I\u00161(\u00c5\u00bb\u00af\u007f\u001byu\u00acL\u00bc4\r\u00cf\u0003H\u00ed\u00c3\u0085\u00bc\u00c8\u009a+\u00b4\u0018j\u00d4IZ\u00f1\u001b\u00f98\u00b5\u00d9%\u000f\u00fbx\u0088as\fT8z".length();
                    var5_7 = 72;
                    var4_8 = -1;
lbl35:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_is.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        CP_is.c = var9_3;
        CP_is.d = new String[4];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x74A3;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_is", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            CP_is.d[n2] = CP_is.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_is.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_is" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_is.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

