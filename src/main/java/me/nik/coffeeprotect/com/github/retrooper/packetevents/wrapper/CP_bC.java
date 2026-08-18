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
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_bC
extends PacketWrapper<CP_bC> {
    private Optional<Integer> CP_e;
    private boolean CP_UnderScore;
    private String CP_m;
    @Nullable
    private CP_An CP_v;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String FojwwTYKoI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bC(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bC(int n, String string, @Nullable CP_An ilIlAn) {
        super(CP_nN.TAB_COMPLETE);
        this.CP_e = Optional.of(n);
        this.CP_UnderScore = true;
        this.CP_m = string;
        this.CP_v = ilIlAn;
    }

    @Deprecated
    public CP_bC(String string, boolean bl, @Nullable CP_An ilIlAn) {
        super(CP_nN.TAB_COMPLETE);
        this.CP_e = Optional.empty();
        this.CP_m = string;
        this.CP_UnderScore = bl;
        this.CP_v = ilIlAn;
    }

    @Override
    public void CP_e() {
        block12: {
            block14: {
                CP_bC ilIlbC;
                boolean bl;
                block13: {
                    Object object;
                    Object object2;
                    String string;
                    block7: {
                        long l;
                        block8: {
                            block11: {
                                Object object3;
                                block9: {
                                    block10: {
                                        l = b ^ 0x559D1BD628FL;
                                        int n = this.CP_g.CP_z(ServerVersion.V_1_13);
                                        string = CP_JH.CP_w();
                                        object2 = n;
                                        if (string != null) break block7;
                                        if (object2 == 0) break block8;
                                        object3 = this.CP_g.CP_z(ServerVersion.V_1_13_1);
                                        if (string != null) break block9;
                                        if (!object3) break block10;
                                        object = CP_bC.b("l", (int)30661, (long)(0x2D2D7596FBC66957L ^ l));
                                        if (string == null) break block11;
                                    }
                                    object3 = CP_bC.b("l", (int)6557, (long)(0x3ADEBE50CD768709L ^ l));
                                }
                                object = object3;
                            }
                            this.CP_e = Optional.of(this.CP_f());
                            this.CP_m = this.CP_p((int)object);
                            if (string == null) break block12;
                        }
                        this.CP_e = Optional.empty();
                        object2 = CP_bC.b("l", (int)16808, (long)(0x1B645A07D6105F39L ^ l));
                    }
                    object = object2;
                    this.CP_m = this.CP_p((int)object);
                    bl = this.CP_g.CP_z(ServerVersion.V_1_9);
                    if (string != null) break block13;
                    if (bl) {
                        this.CP_UnderScore = this.CP_K();
                    }
                    ilIlbC = this;
                    if (string != null) break block14;
                    bl = ilIlbC.CP_g.CP_z(ServerVersion.V_1_8);
                }
                if (!bl) break block12;
                ilIlbC = this;
            }
            ilIlbC.CP_v = (CP_An)this.CP_N(PacketWrapper::CP_E);
        }
    }

    @Override
    public void CP_J() {
        block12: {
            CP_bC ilIlbC;
            block14: {
                boolean bl;
                block13: {
                    Object object;
                    Object object2;
                    String string;
                    block7: {
                        long l;
                        block8: {
                            block11: {
                                Object object3;
                                block9: {
                                    block10: {
                                        l = b ^ 0x1C24AC545C27L;
                                        int n = this.CP_g.CP_z(ServerVersion.V_1_13);
                                        string = CP_JH.CP_w();
                                        object2 = n;
                                        if (string != null) break block7;
                                        if (object2 == 0) break block8;
                                        object3 = this.CP_g.CP_z(ServerVersion.V_1_13_1);
                                        if (string != null) break block9;
                                        if (!object3) break block10;
                                        object = CP_bC.b("l", (int)9813, (long)(0x6501B9157A98066DL ^ l));
                                        if (string == null) break block11;
                                    }
                                    object3 = CP_bC.b("l", (int)12775, (long)(0x4BA1773630F911DAL ^ l));
                                }
                                object = object3;
                            }
                            this.CP_J(this.CP_e.orElse(0));
                            this.CP_m(this.CP_m, (int)object);
                            if (string == null) break block12;
                        }
                        object2 = CP_bC.b("l", (int)12533, (long)(0xCBB4FFB8B8B90CEL ^ l));
                    }
                    object = object2;
                    this.CP_m(this.CP_m, (int)object);
                    bl = this.CP_g.CP_z(ServerVersion.V_1_9);
                    if (string != null) break block13;
                    if (bl) {
                        this.CP_a(this.CP_UnderScore);
                    }
                    ilIlbC = this;
                    if (string != null) break block14;
                    bl = ilIlbC.CP_g.CP_z(ServerVersion.V_1_8);
                }
                if (!bl) break block12;
                ilIlbC = this;
            }
            ilIlbC.CP_I(this.CP_v, PacketWrapper::CP_h);
        }
    }

    public void CP_W(CP_bC ilIlbC) {
        this.CP_m = ilIlbC.CP_m;
        this.CP_UnderScore = ilIlbC.CP_UnderScore;
        this.CP_e = ilIlbC.CP_e;
        this.CP_v = ilIlbC.CP_v;
    }

    public String CP_A() {
        return this.CP_m;
    }

    public void CP_n(String string) {
        this.CP_m = string;
    }

    public Optional<Integer> CP_N() {
        return this.CP_e;
    }

    public void CP_C(@Nullable Integer n) {
        this.CP_e = Optional.ofNullable(n);
    }

    @Deprecated
    public boolean CP_z() {
        return this.CP_UnderScore;
    }

    @Deprecated
    public void CP_M(boolean bl) {
        this.CP_UnderScore = bl;
    }

    public Optional<CP_An> CP_V() {
        return Optional.ofNullable(this.CP_v);
    }

    public void CP_v(@Nullable CP_An ilIlAn) {
        this.CP_v = ilIlAn;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CP_bC.b = CP_s.a(-6060852315951467310L, 411164659311694909L, MethodHandles.lookup().lookupClass()).a(15918693390420L);
                CP_bC.h = new HashMap<K, V>(13);
                var0 = CP_bC.b ^ 65707747416958L;
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
                var8_3 = new long[6];
                var5_4 = 0;
                var6_5 = "u\u00dc\u00a7\u00d5\u00ce\u00feY[{\u00fa\u00ee\u00db\u00b3\u00cc\u00bd9P\u00a2j\u00be\u00a9\"\u00b8\u0003\u00ff\u009aJ\u00e6\u00b0\u00b9\u00ad\u00e3";
                var7_6 = "u\u00dc\u00a7\u00d5\u00ce\u00feY[{\u00fa\u00ee\u00db\u00b3\u00cc\u00bd9P\u00a2j\u00be\u00a9\"\u00b8\u0003\u00ff\u009aJ\u00e6\u00b0\u00b9\u00ad\u00e3".length();
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
                    var6_5 = "\u00bf\u008d)\u00fe\u00c6\u00feB\u008e\u000b(.vlu\u0016\u00cd";
                    var7_6 = "\u00bf\u008d)\u00fe\u00c6\u00feB\u008e\u000b(.vlu\u0016\u00cd".length();
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
        CP_bC.c = var8_3;
        CP_bC.g = new Integer[6];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x13E1;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_bC.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_bC.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_bC.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

