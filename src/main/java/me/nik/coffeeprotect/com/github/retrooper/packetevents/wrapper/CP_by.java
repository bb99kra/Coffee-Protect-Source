/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_by
extends PacketWrapper<CP_by> {
    private boolean CP_d;
    private boolean CP_v;
    private boolean CP_x;
    private boolean CP_w;
    private boolean CP_UnderScore;
    private boolean CP_L;
    private boolean CP_e;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String uQlqDbGIFR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_by(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_by(boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        super(CP_nN.PLAYER_INPUT);
        this.CP_d = bl;
        this.CP_v = bl2;
        this.CP_x = bl3;
        this.CP_w = bl4;
        this.CP_UnderScore = bl5;
        this.CP_L = bl6;
        this.CP_e = bl7;
    }

    @Override
    public void CP_e() {
        long l = b ^ 0x166518F500ABL;
        byte by = this.CP_E();
        String string = CP_JH.CP_w();
        int n = by & 1;
        if (string == null) {
            n = n != 0 ? 1 : 0;
        }
        this.CP_d = n;
        int n2 = by & 2;
        if (string == null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        this.CP_v = n2;
        int n3 = by & 4;
        if (string == null) {
            n3 = n3 != 0 ? 1 : 0;
        }
        this.CP_x = n3;
        int n4 = by & CP_by.b("l", (int)10538, (long)(0x5250146510450F3DL ^ l));
        if (string == null) {
            n4 = n4 != 0 ? 1 : 0;
        }
        this.CP_w = n4;
        int n5 = by & CP_by.b("l", (int)17870, (long)(0x13839079C89CE3DAL ^ l));
        if (string == null) {
            n5 = n5 != 0 ? 1 : 0;
        }
        this.CP_UnderScore = n5;
        int n6 = by & CP_by.b("l", (int)24169, (long)(0x51951D073B99F87BL ^ l));
        if (string == null) {
            n6 = n6 != 0 ? 1 : 0;
        }
        this.CP_L = n6;
        int n7 = by & CP_by.b("l", (int)75, (long)(0x70CDD08119EA65BL ^ l));
        if (string == null) {
            n7 = n7 != 0 ? 1 : 0;
        }
        this.CP_e = n7;
    }

    @Override
    public void CP_J() {
        long l = b ^ 0xF18651C3E03L;
        byte by = 0;
        String string = CP_JH.CP_w();
        boolean bl = this.CP_d;
        if (string == null) {
            bl = bl;
        }
        by = (byte)(by | (bl ? 1 : 0));
        int n = this.CP_v;
        if (string == null) {
            n = n != 0 ? 2 : 0;
        }
        by = (byte)(by | n);
        int n2 = this.CP_x;
        if (string == null) {
            n2 = n2 != 0 ? 4 : 0;
        }
        by = (byte)(by | n2);
        Object object = this.CP_w;
        if (string == null) {
            object = object != 0 ? (Object)CP_by.b("l", (int)1711, (long)(0x2D20DBC107A39E11L ^ l)) : 0;
        }
        by = (byte)(by | object);
        Object object2 = this.CP_UnderScore;
        if (string == null) {
            object2 = object2 != 0 ? (Object)CP_by.b("l", (int)32422, (long)(0x5499A9B00486661DL ^ l)) : 0;
        }
        by = (byte)(by | object2);
        Object object3 = this.CP_L;
        if (string == null) {
            object3 = object3 != 0 ? (Object)CP_by.b("l", (int)18378, (long)(0x503B385C4CC05F73L ^ l)) : 0;
        }
        by = (byte)(by | object3);
        Object object4 = this.CP_e;
        if (string == null) {
            object4 = object4 != 0 ? (Object)CP_by.b("l", (int)8347, (long)(0x64DC91BF12223826L ^ l)) : 0;
        }
        by = (byte)(by | object4);
        this.CP_u(by);
    }

    public void CP_g(CP_by ilIlby) {
        this.CP_d = ilIlby.CP_d;
        this.CP_v = ilIlby.CP_v;
        this.CP_x = ilIlby.CP_x;
        this.CP_w = ilIlby.CP_w;
        this.CP_UnderScore = ilIlby.CP_UnderScore;
        this.CP_L = ilIlby.CP_L;
        this.CP_e = ilIlby.CP_e;
    }

    public boolean CP_t() {
        return this.CP_d;
    }

    public void CP_P(boolean bl) {
        this.CP_d = bl;
    }

    public boolean CP_y() {
        return this.CP_v;
    }

    public void CP_X(boolean bl) {
        this.CP_v = bl;
    }

    public boolean CP_i() {
        return this.CP_x;
    }

    public void CP_H(boolean bl) {
        this.CP_x = bl;
    }

    public boolean CP_j() {
        return this.CP_w;
    }

    public void CP_A(boolean bl) {
        this.CP_w = bl;
    }

    public boolean CP_P() {
        return this.CP_UnderScore;
    }

    public void CP_e(boolean bl) {
        this.CP_UnderScore = bl;
    }

    public boolean CP_q() {
        return this.CP_L;
    }

    public void CP_p(boolean bl) {
        this.CP_L = bl;
    }

    public boolean CP_l() {
        return this.CP_e;
    }

    public void CP_u(boolean bl) {
        this.CP_e = bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CP_by.b = CP_s.a(3787026032266492672L, 7803582908432806897L, MethodHandles.lookup().lookupClass()).a(54545360938782L);
                CP_by.h = new HashMap<K, V>(13);
                var0 = CP_by.b ^ 26202526826948L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[8];
                var5_4 = 0;
                var6_5 = "\u00a0\u00ee=f\u00d3\u0010b\u00c7w#\u008a;f\\Y\u0089\u001619\u0010G\u00b6\u00fd\u00b9\u00a2\u00da\u007f\u0088i\u00af\u00cdl\u0013\u00bdZ\u00fd#\u0012+\f\u00fe\u009d\u00b9?;M\u00f0\u00da";
                var7_6 = "\u00a0\u00ee=f\u00d3\u0010b\u00c7w#\u008a;f\\Y\u0089\u001619\u0010G\u00b6\u00fd\u00b9\u00a2\u00da\u007f\u0088i\u00af\u00cdl\u0013\u00bdZ\u00fd#\u0012+\f\u00fe\u009d\u00b9?;M\u00f0\u00da".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "x\u00d8\u00e0\u00ae\u00ab\u00a5\u00cb\u00b4\u00d0L\u0093\u00b1\u00eeq\u0015\u00bc";
                    var7_6 = "x\u00d8\u00e0\u00ae\u00ab\u00a5\u00cb\u00b4\u00d0L\u0093\u00b1\u00eeq\u0015\u00bc".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        CP_by.c = var8_3;
        CP_by.g = new Integer[8];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2B62;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_by", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_by.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_by.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_by" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_by.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

