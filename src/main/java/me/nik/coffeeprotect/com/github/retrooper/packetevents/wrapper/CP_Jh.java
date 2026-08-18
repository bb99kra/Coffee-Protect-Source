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
import java.time.Instant;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_Zz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_vE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_iH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Jh
extends PacketWrapper<CP_Jh> {
    private String CP_N;
    private CP_iH CP_Z;
    @Nullable
    private CP_Zz CP_b;
    @Nullable
    private CP_vE CP_Q;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String bQYaHMbFAB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jh(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Jh(String string, CP_iH ilIliH, @Nullable CP_vE ilIlvE) {
        super(CP_nN.CHAT_MESSAGE);
        this.CP_N = string;
        this.CP_Z = ilIliH;
        this.CP_Q = ilIlvE;
    }

    public CP_Jh(String string, CP_iH ilIliH, @Nullable CP_Zz ilIlZz) {
        super(CP_nN.CHAT_MESSAGE);
        this.CP_N = string;
        this.CP_Z = ilIliH;
        this.CP_b = ilIlZz;
    }

    @Override
    public void CP_e() {
        block5: {
            block8: {
                boolean bl;
                String string;
                block6: {
                    block7: {
                        CP_Jh ilIlJh;
                        block4: {
                            long l = b ^ 0x38545A4023FL;
                            string = CP_JH.CP_w();
                            Object object = this.CP_g.CP_z(ServerVersion.V_1_11);
                            if (string == null) {
                                object = object != 0 ? CP_Jh.b("k", (int)30400, (long)(0x44CE4FEC5ADE8C4L ^ l)) : CP_Jh.b("k", (int)8016, (long)(0x4939114E06A70155L ^ l));
                            }
                            int n = object;
                            this.CP_N = this.CP_p(n);
                            ilIlJh = this;
                            if (string != null) break block4;
                            if (!ilIlJh.CP_g.CP_z(ServerVersion.V_1_19)) break block5;
                            ilIlJh = this;
                        }
                        Instant instant = ilIlJh.CP_e();
                        this.CP_Z = new CP_iH(this.CP_x(), instant);
                        bl = this.CP_g.CP_z(ServerVersion.V_1_19_3);
                        if (string != null) break block6;
                        if (!bl) break block7;
                        this.CP_b = this.CP_B();
                        if (string == null) break block5;
                    }
                    bl = this.CP_K();
                }
                boolean bl2 = bl;
                this.CP_Z.CP_U(bl2);
                CP_Jh ilIlJh = this;
                if (string != null) break block8;
                if (!ilIlJh.CP_g.CP_z(ServerVersion.V_1_19_1)) break block5;
                ilIlJh = this;
            }
            ilIlJh.CP_Q = this.CP_e();
        }
    }

    @Override
    public void CP_J() {
        block5: {
            CP_Jh ilIlJh;
            block10: {
                String string;
                block9: {
                    boolean bl;
                    block6: {
                        block7: {
                            CP_Jh ilIlJh2;
                            block8: {
                                block4: {
                                    long l = b ^ 0x1AF8384D3C97L;
                                    string = CP_JH.CP_w();
                                    Object object = this.CP_g.CP_z(ServerVersion.V_1_11);
                                    if (string == null) {
                                        object = object != 0 ? CP_Jh.b("k", (int)14560, (long)(0x4E501DACE01C984EL ^ l)) : CP_Jh.b("k", (int)11834, (long)(0x21386E85BC760E95L ^ l));
                                    }
                                    int n = object;
                                    this.CP_m(this.CP_N, n);
                                    bl = this.CP_g.CP_z(ServerVersion.V_1_19);
                                    if (string != null) break block4;
                                    if (!bl) break block5;
                                    this.CP_w(this.CP_Z.CP_n());
                                    this.CP_l(this.CP_Z.CP_p());
                                    bl = this.CP_g.CP_z(ServerVersion.V_1_19_3);
                                }
                                if (string != null) break block6;
                                if (!bl) break block7;
                                ilIlJh2 = this;
                                if (string != null) break block8;
                                if (ilIlJh2.CP_b == null) break block5;
                                ilIlJh2 = this;
                            }
                            ilIlJh2.CP_D(this.CP_b);
                            if (string == null) break block5;
                        }
                        this.CP_a(this.CP_Z.CP_K());
                        ilIlJh = this;
                        if (string != null) break block9;
                        bl = ilIlJh.CP_g.CP_z(ServerVersion.V_1_19_1);
                    }
                    if (!bl) break block5;
                    ilIlJh = this;
                }
                if (string != null) break block10;
                if (ilIlJh.CP_Q == null) break block5;
                ilIlJh = this;
            }
            ilIlJh.CP_h(this.CP_Q);
        }
    }

    public void CP_b(CP_Jh ilIlJh) {
        this.CP_N = ilIlJh.CP_N;
        this.CP_Z = ilIlJh.CP_Z;
        this.CP_b = ilIlJh.CP_b;
        this.CP_Q = ilIlJh.CP_Q;
    }

    public String CP_L() {
        return this.CP_N;
    }

    public void CP_D(String string) {
        this.CP_N = string;
    }

    public Optional<CP_iH> CP_z() {
        return Optional.ofNullable(this.CP_Z);
    }

    public void CP_S(@Nullable CP_iH ilIliH) {
        this.CP_Z = ilIliH;
    }

    @Nullable
    public CP_Zz CP_i() {
        return this.CP_b;
    }

    public void CP_o(@Nullable CP_Zz ilIlZz) {
        this.CP_b = ilIlZz;
    }

    @Nullable
    public CP_vE CP_D() {
        return this.CP_Q;
    }

    public void CP_x(@Nullable CP_vE ilIlvE) {
        this.CP_Q = ilIlvE;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CP_Jh.b = CP_s.a(-6055976560155036400L, 1030628950857987788L, MethodHandles.lookup().lookupClass()).a(181617850488892L);
                CP_Jh.h = new HashMap<K, V>(13);
                var0 = CP_Jh.b ^ 92236953443730L;
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
                var8_3 = new long[4];
                var5_4 = 0;
                var6_5 = "'F6ZFW\u00a3\u00c2\u00d2\u00acx\u0013Jo\u00db\u00d1";
                var7_6 = "'F6ZFW\u00a3\u00c2\u00d2\u00acx\u0013Jo\u00db\u00d1".length();
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
                    var6_5 = "h\u0003Q=f\u00e1\u0087\u0090\u00cd\u00a1lo\u00ff\u00d1\u00f67";
                    var7_6 = "h\u0003Q=f\u00e1\u0087\u0090\u00cd\u00a1lo\u00ff\u00d1\u00f67".length();
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
        CP_Jh.c = var8_3;
        CP_Jh.g = new Integer[4];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1377;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Jh.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Jh.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Jh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

