/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
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
import me.nik.coffeeprotect.CP_Li;
import me.nik.coffeeprotect.CP_Pt;
import me.nik.coffeeprotect.CP_Qb;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class CP_vS
extends BukkitRunnable {
    int CP_j;
    int CP_t;
    final Player CP_J;
    final CP_G2 CP_e;
    final CP_Pt CP_q;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String RSmOBcuMaH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_vS(CP_Pt ilIlPt, Player player, CP_G2 ilIlG2) {
        this.CP_J = player;
        this.CP_e = ilIlG2;
        this.CP_q = ilIlPt;
        this.CP_j = 0;
        this.CP_t = 0;
    }

    /*
     * Unable to fully structure code
     */
    public void run() {
        block23: {
            block24: {
                block22: {
                    block21: {
                        block19: {
                            block20: {
                                var1_1 = CP_vS.a ^ 67063651224837L;
                                var3_2 = CP_Pt.CP_D();
                                v0 = this;
                                if (var3_2 == 0) break block19;
                                if (!v0.CP_J.isOnline()) break block20;
                                v1 = this.CP_j;
                                if (var3_2 == 0) ** GOTO lbl16
                                switch (v1) {
                                    case 0: {
                                        v2 = this;
                                        v3 = v2;
                                        v4 = v2.CP_t;
                                        if (var3_2 == 0) ** GOTO lbl21
                                        v1 = v4;
                                        v3.CP_t = v4 + 1;
lbl16:
                                        // 2 sources

                                        if (v1 < CP_vS.b("l", (int)1653, (long)(6663493206051676514L ^ var1_1))) {
                                            this.CP_e.CP_F(Component.text((String)CP_Li.CP_N(CP_Pt.CP_m(this.CP_q))));
                                            if (var3_2 != 0) break;
                                        }
                                        v3 = this;
                                        v4 = 1;
lbl21:
                                        // 2 sources

                                        v3.CP_j = v4;
                                        this.CP_e.CP_f(CP_rW.CP_W((String)CP_vS.a("b", (int)24212, (long)(7690732558507726756L ^ var1_1))), "", (int)CP_vS.b("l", (int)32275, (long)(6431284432402061570L ^ var1_1)), (int)CP_vS.b("l", (int)2502, (long)(4520466133612883664L ^ var1_1)), (int)CP_vS.b("l", (int)24163, (long)(6537771767768332656L ^ var1_1)));
                                        if (var3_2 != 0) break;
                                    }
                                    case 1: {
                                        v5 = this;
                                        v6 = v5;
                                        v7 = v5.CP_t;
                                        if (var3_2 != 0) {
                                            v6.CP_t = v7 + 1;
                                            if (v7 < CP_vS.b("l", (int)27797, (long)(6934513091972631431L ^ var1_1))) {
                                                this.CP_e.CP_F(Component.text(CP_rW.CP_W((String)CP_vS.a("b", (int)16364, (long)(8488270493000513245L ^ var1_1)))));
                                                if (var3_2 != 0) break;
                                            }
                                            v6 = this;
                                            v7 = v6.CP_j = 2;
                                        }
                                        if (var3_2 != 0) break;
                                    }
                                    case 2: {
                                        v8 = this;
                                        v9 = v8;
                                        v10 = v8.CP_t;
                                        if (var3_2 == 0) break;
                                        v9.CP_t = v10 + 1;
                                        if (v10 < CP_vS.b("l", (int)20403, (long)(7167430658242488483L ^ var1_1))) {
                                            this.CP_e.CP_F(Component.text(CP_rW.CP_W((String)CP_Li.CP_N(CP_Pt.CP_H(this.CP_q)))));
                                            if (var3_2 != 0) break;
                                        }
                                        v9 = this;
                                        v10 = v9.CP_j = 3;
                                    }
                                }
                                if (var3_2 != 0) break block21;
                            }
                            v0 = this;
                        }
                        v0.cancel();
                        return;
                    }
                    v11 = this.CP_j;
                    if (var3_2 == 0) break block22;
                    if (v11 != 3) break block23;
                    v12 = this;
                    if (var3_2 == 0) break block24;
                    v11 = (int)v12.CP_J.isOnline();
                }
                if (v11 != 0) {
                    CP_Qb.CP_L((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$run$0(org.bukkit.entity.Player ), ()V)((Player)this.CP_J));
                }
                v12 = this;
            }
            v12.cancel();
        }
    }

    private static void lambda$run$0(Player player) {
        long l = a ^ 0x65D0DE7740DFL;
        player.kickPlayer((String)((Object)CP_vS.a("b", (int)21649, (long)(0x3217D4BB0B445078L ^ l))));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_vS.a = CP_s.a(62269274444798921L, 2551559232362337216L, MethodHandles.lookup().lookupClass()).a(36296176985724L);
                    CP_vS.d = new HashMap<K, V>(13);
                    var11 = CP_vS.a ^ 75245616157993L;
                    var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var11 >>> 56);
                    for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                        v2 = v2;
                        v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                    }
                    var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var20_3 = new String[3];
                    var18_4 = 0;
                    var17_5 = "Vyt\u00ed1\u00dc\u00fa\u000e_\u00a1\u00e9\u00a8\u0019rSP\u00ef\u00dd\u008e|\u00b2N\u000b\u0088;\u00f6_\u0013\u0005h\u00f3\u00c4I\u00dc\u001cO\u00eb\u00d3\u0016P\u00c5\u00dc\u00ea\u00caL\u00af\u00f5$H\u00c0\u0081e\u0095\u0099/\u0087N\u00ad\u0085@\u00ad\u00f2\u00b9m\u00fdW\u0089 \u00e3q%\u00c0Vs\u0090\u00b3\u00eb\u009b\u008e\u00efr\u00da\u001b_\u00e3\u00f6O\u00a2J\u00ca\u00d2\u00f6\u000f\u00f9\u00c8\u0096(B\u00f4IZ\u00bf\u00a8\u007f2\u000e&\u00cf-\u009b,\u0014)Gh\u00aeB\u001b\u00f4\u008cT\u0010'\u00a8\u00c2S\u0002x\u008d\u001a\u00e3(\u009d\u00b3\u00f3p\u001f O\u00f6\u00e3\u008e\u00a7$\u0081\u00d5\u0005\r\u00ed\u00a3\u008e\u008e\u00f9X\u00f8\u0091;\u00d1.\u0016\u00b1\u0012\u00f9\u0096\b\u00f5\u00c3\u0018V\u0012";
                    var19_6 = "Vyt\u00ed1\u00dc\u00fa\u000e_\u00a1\u00e9\u00a8\u0019rSP\u00ef\u00dd\u008e|\u00b2N\u000b\u0088;\u00f6_\u0013\u0005h\u00f3\u00c4I\u00dc\u001cO\u00eb\u00d3\u0016P\u00c5\u00dc\u00ea\u00caL\u00af\u00f5$H\u00c0\u0081e\u0095\u0099/\u0087N\u00ad\u0085@\u00ad\u00f2\u00b9m\u00fdW\u0089 \u00e3q%\u00c0Vs\u0090\u00b3\u00eb\u009b\u008e\u00efr\u00da\u001b_\u00e3\u00f6O\u00a2J\u00ca\u00d2\u00f6\u000f\u00f9\u00c8\u0096(B\u00f4IZ\u00bf\u00a8\u007f2\u000e&\u00cf-\u009b,\u0014)Gh\u00aeB\u001b\u00f4\u008cT\u0010'\u00a8\u00c2S\u0002x\u008d\u001a\u00e3(\u009d\u00b3\u00f3p\u001f O\u00f6\u00e3\u008e\u00a7$\u0081\u00d5\u0005\r\u00ed\u00a3\u008e\u008e\u00f9X\u00f8\u0091;\u00d1.\u0016\u00b1\u0012\u00f9\u0096\b\u00f5\u00c3\u0018V\u0012".length();
                    var16_7 = 96;
                    var15_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = CP_vS.a(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                CP_vS.b = var20_3;
                CP_vS.c = new String[3];
                CP_vS.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[6];
                var3_13 = 0;
                var4_14 = "g2D\u0015\u00eb\u008dM\u00fb-\u00a1\u00bbT\u00aa\u00e0\u00a55\u0088z~Q8\u0082@\u00af^Zzr#A])";
                var5_15 = "g2D\u0015\u00eb\u008dM\u00fb-\u00a1\u00bbT\u00aa\u00e0\u00a55\u0088z~Q8\u0082@\u00af^Zzr#A])".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u008d\u0092\u00e3ko6\u00cc\u0005\u00aa(^4\u0005V\u008f\u00ac";
                    var5_15 = "\u008d\u0092\u00e3ko6\u00cc\u0005\u00aa(^4\u0005V\u008f\u00ac".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl84:
                // 1 sources

                ** continue;
            }
        }
        CP_vS.e = var6_12;
        CP_vS.f = new Integer[6];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1148;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_vS", exception);
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
            CP_vS.c[n2] = CP_vS.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_vS.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_vS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7F6A;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_vS", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_vS.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_vS.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_vS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_vS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_vS.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
