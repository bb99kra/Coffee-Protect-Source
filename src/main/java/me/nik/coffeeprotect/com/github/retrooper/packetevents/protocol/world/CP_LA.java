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
import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Ga;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_o3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_LA
implements Cloneable {
    private boolean CP_f;
    private BitSet CP_e;
    private BitSet CP_F;
    private BitSet CP_T;
    private BitSet CP_t;
    private int CP_n;
    private int CP_l;
    private byte[][] CP_b;
    private byte[][] CP_x;
    private static final long a = CP_s.a(-3377294597906296835L, -7221598149157757475L, MethodHandles.lookup().lookupClass()).a(13828078464145L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static transient /* synthetic */ String MQDYFFQxtx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_LA() {
    }

    public CP_LA(boolean bl, BitSet bitSet, BitSet bitSet2, BitSet bitSet3, BitSet bitSet4, int n, int n2, byte[][] byArray, byte[][] byArray2) {
        this.CP_f = bl;
        this.CP_e = bitSet;
        this.CP_F = bitSet2;
        this.CP_T = bitSet3;
        this.CP_t = bitSet4;
        this.CP_n = n;
        this.CP_l = n2;
        this.CP_b = byArray;
        this.CP_x = byArray2;
    }

    public CP_LA CP_o() {
        try {
            CP_LA ilIlLA = (CP_LA)super.clone();
            ilIlLA.CP_e = (BitSet)this.CP_e.clone();
            ilIlLA.CP_F = (BitSet)this.CP_F.clone();
            ilIlLA.CP_T = (BitSet)this.CP_T.clone();
            ilIlLA.CP_t = (BitSet)this.CP_t.clone();
            ilIlLA.CP_b = (byte[][])this.CP_b.clone();
            ilIlLA.CP_x = (byte[][])this.CP_x.clone();
            return ilIlLA;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new AssertionError();
        }
    }

    public boolean CP_f() {
        return this.CP_f;
    }

    public void CP_B(boolean bl) {
        this.CP_f = bl;
    }

    public BitSet CP_b() {
        return this.CP_e;
    }

    public void CP_Z(BitSet bitSet) {
        this.CP_e = bitSet;
    }

    public BitSet CP_j() {
        return this.CP_F;
    }

    public void CP_t(BitSet bitSet) {
        this.CP_F = bitSet;
    }

    public BitSet CP_d() {
        return this.CP_T;
    }

    public void CP_f(BitSet bitSet) {
        this.CP_T = bitSet;
    }

    public BitSet CP_D() {
        return this.CP_t;
    }

    public void CP_m(BitSet bitSet) {
        this.CP_t = bitSet;
    }

    public int CP_E() {
        return this.CP_n;
    }

    public void CP_I(int n) {
        this.CP_n = n;
    }

    public int CP_m() {
        return this.CP_l;
    }

    public void CP_d(int n) {
        this.CP_l = n;
    }

    public byte[][] CP_F() {
        return this.CP_b;
    }

    public void CP_Z(byte[][] byArray) {
        this.CP_b = byArray;
    }

    public byte[][] CP_UnderScore() {
        return this.CP_x;
    }

    public void CP_u(byte[][] byArray) {
        this.CP_x = byArray;
    }

    public static CP_LA CP_N(PacketWrapper<?> packetWrapper) {
        int n;
        int n2;
        String string;
        CP_LA ilIlLA;
        block12: {
            int n3;
            long l = a ^ 0x14A4D5481573L;
            ilIlLA = new CP_LA();
            ServerVersion serverVersion = packetWrapper.CP_w();
            string = CP_o3.CP_F();
            int n4 = serverVersion.CP_S(ServerVersion.V_1_19_4);
            if (string != null) {
                if (n4 != 0) {
                    ilIlLA.CP_f = packetWrapper.CP_K();
                }
                ilIlLA.CP_F = CP_Ga.CP_O(packetWrapper);
                ilIlLA.CP_e = CP_Ga.CP_O(packetWrapper);
                ilIlLA.CP_t = CP_Ga.CP_O(packetWrapper);
                ilIlLA.CP_T = CP_Ga.CP_O(packetWrapper);
                n4 = serverVersion.CP_z(ServerVersion.V_1_17) ? 1 : 0;
            }
            Object object = n2 = n4;
            if (string != null) {
                object = object != 0 ? packetWrapper.CP_f() : (Object)CP_LA.a("x", (int)3786, (long)(0x75CDC8B1908EFDB8L ^ l));
            }
            ilIlLA.CP_n = object;
            ilIlLA.CP_b = new byte[ilIlLA.CP_n][];
            for (n = 0; n < ilIlLA.CP_n; ++n) {
                block15: {
                    CP_LA ilIlLA2;
                    block14: {
                        boolean bl;
                        block13: {
                            n3 = n2;
                            if (string == null) break block12;
                            if (string == null) break block13;
                            if (n3 != 0) break block14;
                            ilIlLA2 = ilIlLA;
                            if (string == null) break block15;
                            bl = ilIlLA2.CP_F.get(n);
                        }
                        if (!bl) continue;
                    }
                    ilIlLA2 = ilIlLA;
                }
                ilIlLA2.CP_b[n] = packetWrapper.CP_l();
                if (string != null) continue;
                PacketWrapper.CP_e(new int[3]);
                break;
            }
            Object object2 = n2;
            if (string != null) {
                object2 = object2 != 0 ? packetWrapper.CP_f() : (Object)CP_LA.a("x", (int)23882, (long)(0x28F1EB43EDA12E39L ^ l));
            }
            ilIlLA.CP_l = object2;
            ilIlLA.CP_x = new byte[ilIlLA.CP_l][];
            n3 = n = 0;
        }
        while (n < ilIlLA.CP_l) {
            block19: {
                block18: {
                    CP_LA ilIlLA3;
                    block17: {
                        int n5;
                        block16: {
                            n5 = n2;
                            if (string == null) break block16;
                            if (n5 != 0) break block17;
                            ilIlLA3 = ilIlLA;
                            if (string == null) break block18;
                            n5 = ilIlLA3.CP_e.get(n) ? 1 : 0;
                        }
                        if (n5 == 0) break block19;
                    }
                    ilIlLA3 = ilIlLA;
                }
                ilIlLA3.CP_x[n] = packetWrapper.CP_l();
            }
            ++n;
            if (string != null) continue;
        }
        return ilIlLA;
    }

    public static void CP_UnderScore(PacketWrapper<?> packetWrapper, CP_LA ilIlLA) {
        int n;
        int n2;
        int n3;
        String string;
        block15: {
            long l = a ^ 0x103D85E6AD95L;
            ServerVersion serverVersion = packetWrapper.CP_w();
            string = CP_o3.CP_F();
            int n4 = serverVersion.CP_S(ServerVersion.V_1_19_4);
            if (string != null) {
                if (n4 != 0) {
                    packetWrapper.CP_a(ilIlLA.CP_f);
                }
                CP_Ga.CP_Z(packetWrapper, ilIlLA.CP_F);
                CP_Ga.CP_Z(packetWrapper, ilIlLA.CP_e);
                CP_Ga.CP_Z(packetWrapper, ilIlLA.CP_t);
                CP_Ga.CP_Z(packetWrapper, ilIlLA.CP_T);
                n4 = serverVersion.CP_z(ServerVersion.V_1_17) ? 1 : 0;
            }
            int n5 = n3 = n4;
            if (string != null) {
                if (n5 != 0) {
                    packetWrapper.CP_J(ilIlLA.CP_n);
                }
                n5 = n2 = 0;
            }
            while (n2 < ilIlLA.CP_n) {
                block18: {
                    block17: {
                        boolean bl;
                        block16: {
                            n = n3;
                            if (string == null) break block15;
                            if (string == null) break block16;
                            if (n != 0) break block17;
                            bl = ilIlLA.CP_F.get(n2);
                        }
                        if (!bl) break block18;
                    }
                    packetWrapper.CP_U(ilIlLA.CP_b[n2]);
                }
                ++n2;
                if (string != null) continue;
            }
            n = n3;
        }
        if (string != null) {
            if (n != 0) {
                packetWrapper.CP_J(ilIlLA.CP_l);
            }
            n = n2 = 0;
        }
        while (n2 < ilIlLA.CP_l) {
            block21: {
                block20: {
                    int n6;
                    block19: {
                        n6 = n3;
                        if (string == null) break block19;
                        if (n6 != 0) break block20;
                        n6 = ilIlLA.CP_e.get(n2) ? 1 : 0;
                    }
                    if (n6 == 0) break block21;
                }
                packetWrapper.CP_U(ilIlLA.CP_x[n2]);
            }
            ++n2;
            if (string != null) continue;
        }
        if (PacketWrapper.CP_z() == null) {
            CP_o3.CP_a("CSZ4tc");
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x4F15AED9197EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "O\t\u00c8\u00bc<\u00b8\u009a\u00cd\u00b2\u00f0e \u0001\u00b6GF";
        int n2 = "O\t\u00c8\u00bc<\u00b8\u009a\u00cd\u00b2\u00f0e \u0001\u00b6GF".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x17A8;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_LA", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_LA.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_LA.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_LA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_LA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

