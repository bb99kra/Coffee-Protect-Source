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
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public final class CP_Qw
extends Enum<CP_Qw> {
    public static final /* enum */ CP_Qw ROLLABLE;
    public static final /* enum */ CP_Qw ALIGNED;
    private static final CP_Qw[] CP_i;
    private final String CP_G;
    private static final /* synthetic */ CP_Qw[] CP_F;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;

    public static CP_Qw[] values() {
        return (CP_Qw[])CP_F.clone();
    }

    public static CP_Qw valueOf(String string) {
        return Enum.valueOf(CP_Qw.class, string);
    }

    private CP_Qw(String string2) {
        this.CP_G = string2;
    }

    public String CP_G() {
        return this.CP_G;
    }

    public Component CP_v() {
        long l = a ^ 0x2FB00A1CFD2EL;
        return Component.translatable((String)((Object)CP_Qw.a("j", (int)11774, (long)(0x4F24334281CC8410L ^ l))) + this.CP_G);
    }

    public static Optional<CP_Qw> CP_Y(String string) {
        return Arrays.stream(CP_i).filter(ilIlQw -> ilIlQw.CP_G().equals(string)).findFirst();
    }

    private static /* synthetic */ CP_Qw[] CP_b() {
        return new CP_Qw[]{ROLLABLE, ALIGNED};
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_Qw.a = CP_s.a(-3643419006075753615L, 3590222580620524096L, MethodHandles.lookup().lookupClass()).a(148242388146771L);
                var9 = CP_Qw.a ^ 51481382318778L;
                CP_Qw.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[5];
                var5_4 = 0;
                var4_5 = "X\u0007]\u0088\u001a\u0017\u007f\u00d8\u0088\u00c33\u00e7\u00ef\u009fch(\u0093\u0089\\&\u00f4\u00b0eT\u00d3\u00c4\u00e5I\u00c5\u00d8C\u0019\u00c3;\u00a7\u0014\u00e0\u00cd\u00f3\u001a\u00fd\u00b0Y'\u0091\u00fb\u00cc0\u00fbIQ=\u00c0,q\u00f1\u0018\u00d7\rkiW\u00e4:\u0011\u00f1\u0082\u00d6\u00b1cA]\u00f90\u0001J\u0000\u001c\u0088q\u0006";
                var6_6 = "X\u0007]\u0088\u001a\u0017\u007f\u00d8\u0088\u00c33\u00e7\u00ef\u009fch(\u0093\u0089\\&\u00f4\u00b0eT\u00d3\u00c4\u00e5I\u00c5\u00d8C\u0019\u00c3;\u00a7\u0014\u00e0\u00cd\u00f3\u001a\u00fd\u00b0Y'\u0091\u00fb\u00cc0\u00fbIQ=\u00c0,q\u00f1\u0018\u00d7\rkiW\u00e4:\u0011\u00f1\u0082\u00d6\u00b1cA]\u00f90\u0001J\u0000\u001c\u0088q\u0006".length();
                var3_7 = 16;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = CP_Qw.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u008b5\u008c2-0~,\u00fc]\u00b1\u0010\u00e9O\u009a\u008b\u00ba-\u00af\u000fc\u00e1R\u00ad'\u00f5LB\u0085\u0091\u0094\u00ad\u0010n\u00e9G\u00a4+\u00cc\u00a8\u00e5\u0082P\u0087\u00fa\u00cc\u00b0\u0094\u001d";
                    var6_6 = "\u008b5\u008c2-0~,\u00fc]\u00b1\u0010\u00e9O\u009a\u008b\u00ba-\u00af\u000fc\u00e1R\u00ad'\u00f5LB\u0085\u0091\u0094\u00ad\u0010n\u00e9G\u00a4+\u00cc\u00a8\u00e5\u0082P\u0087\u00fa\u00cc\u00b0\u0094\u001d".length();
                    var3_7 = 32;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = CP_Qw.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        CP_Qw.b = var7_3;
        CP_Qw.c = new String[5];
        CP_Qw.ROLLABLE = new CP_Qw((String)CP_Qw.a("j", (int)30306, (long)(8088084418302234650L ^ var9)));
        CP_Qw.ALIGNED = new CP_Qw((String)CP_Qw.a("j", (int)26789, (long)(7640541014019100382L ^ var9)));
        CP_Qw.CP_F = CP_Qw.CP_b();
        CP_Qw.CP_i = CP_Qw.values();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x62C8;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_Qw", exception);
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
            CP_Qw.c[n2] = CP_Qw.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Qw.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_Qw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Qw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

