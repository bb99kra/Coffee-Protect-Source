/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlPA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class IlIlhL {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String XSRahlVBLs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public static boolean IlIlT() {
        return Arrays.stream(Bukkit.getPluginManager().getPlugins()).map(Plugin::getName).anyMatch(string -> {
            long l = a ^ 0x43481DD7C2D8L;
            boolean bl = IlIlPA.IlIly();
            boolean bl2 = string.contains((CharSequence)((Object)IlIlhL.a("c", (int)840, (long)(0x2B70A3F0FBBB4A18L ^ l))));
            if (bl) return bl2;
            if (bl2) return true;
            bl2 = string.contains((CharSequence)((Object)IlIlhL.a("c", (int)7527, (long)(0x17777BA3F5925430L ^ l))));
            if (bl) return bl2;
            if (!bl2) return false;
            return true;
        });
    }

    public static boolean IlIlv() {
        return Arrays.stream(Bukkit.getPluginManager().getPlugins()).map(Plugin::getName).anyMatch(string -> {
            long l = a ^ 0x557A87B78D2BL;
            boolean bl = IlIlPA.IlIlf();
            boolean bl2 = string.contains((CharSequence)((Object)IlIlhL.a("c", (int)25465, (long)(0x726073CDFE0FE5DBL ^ l))));
            if (!bl) return bl2;
            if (bl2) return true;
            bl2 = string.contains((CharSequence)((Object)IlIlhL.a("c", (int)30860, (long)(0x6E65928371A57E2CL ^ l))));
            if (!bl) return bl2;
            if (bl2) return true;
            bl2 = string.contains((CharSequence)((Object)IlIlhL.a("c", (int)2472, (long)(0x18FCE3E3589A8F0FL ^ l))));
            if (!bl) return bl2;
            if (!bl2) return false;
            return true;
        });
    }

    public static boolean IlIlr() {
        return Arrays.stream(Bukkit.getPluginManager().getPlugins()).map(Plugin::getName).anyMatch(string -> {
            long l = a ^ 0x49E9DDDC5030L;
            return string.equals(IlIlhL.a("c", (int)31246, (long)(0x134FBAC9A18421B3L ^ l)));
        });
    }

    public static boolean IlIlS() {
        return Arrays.stream(Bukkit.getPluginManager().getPlugins()).map(Plugin::getName).anyMatch(string -> {
            long l = a ^ 0x2B9282C6383DL;
            return string.equals(IlIlhL.a("c", (int)9283, (long)(0x42B0CB9EE5CD97F4L ^ l)));
        });
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIlhL.a = IlIls.a((long)-6640332056778707251L, (long)-5948278892925305480L, MethodHandles.lookup().lookupClass()).a(102335199258304L);
                IlIlhL.d = new HashMap<K, V>(13);
                var0 = IlIlhL.a ^ 35826589223184L;
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\u0094`\u00e7\u00ceqIK\u0099\u0094\u00a0\u009cd\u00d2x\u00b0\u00ef\u0010\u00cb\u0084O\u0018\u00cf\u00e2B\u0081^\u00d9\u00c5\u00da\u0092\u001c\u00aa\u00e9\u0010\\\u00c8\u00a3\u00d6\u0083\u0018\u00fa\u00c4\u00e3\u0098\u00b6\u00d6\u009e}D\u00d1 \u00ccS\\\u009b\u00f9\u00e6\u008a\u0095o\u00c08\u00ad\u00b3\u00c1\u009f\u00baf:M\u00c7\u0085X\u00d2\u007f\u008b\u001e\u000bY\u00e4\u00c6\u00d3\u0018\u0010\u0083\u00d6\u00d6\u00f14\u00d7B\u00bb\u00ef\u00bb\u009f?l7\u0085w";
                var8_6 = "\u0094`\u00e7\u00ceqIK\u0099\u0094\u00a0\u009cd\u00d2x\u00b0\u00ef\u0010\u00cb\u0084O\u0018\u00cf\u00e2B\u0081^\u00d9\u00c5\u00da\u0092\u001c\u00aa\u00e9\u0010\\\u00c8\u00a3\u00d6\u0083\u0018\u00fa\u00c4\u00e3\u0098\u00b6\u00d6\u009e}D\u00d1 \u00ccS\\\u009b\u00f9\u00e6\u008a\u0095o\u00c08\u00ad\u00b3\u00c1\u009f\u00baf:M\u00c7\u0085X\u00d2\u007f\u008b\u001e\u000bY\u00e4\u00c6\u00d3\u0018\u0010\u0083\u00d6\u00d6\u00f14\u00d7B\u00bb\u00ef\u00bb\u009f?l7\u0085w".length();
                var5_7 = 16;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIlhL.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "Di;ay\u00c0\u00ee\u00e7\u00c1\u00e3\u0086\u00c0k\u00ff\u00d2\u00ba\u0010\u0086`\u00cf\u00aa\u001as\u008a\u00c8S\u0094\u00bcH\u001d\u00ec\u00bc\u00d0";
                    var8_6 = "Di;ay\u00c0\u00ee\u00e7\u00c1\u00e3\u0086\u00c0k\u00ff\u00d2\u00ba\u0010\u0086`\u00cf\u00aa\u001as\u008a\u00c8S\u0094\u00bcH\u001d\u00ec\u00bc\u00d0".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl34:
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
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIlhL.a(var10_9).intern();
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
lbl51:
                // 1 sources

                ** continue;
            }
        }
        IlIlhL.b = var9_3;
        IlIlhL.c = new String[7];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1E0A;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlhL", exception);
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
            IlIlhL.c[n2] = IlIlhL.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlhL.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlhL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlhL.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

