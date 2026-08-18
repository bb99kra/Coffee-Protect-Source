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
import java.util.Locale;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score.CP_W;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_vM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_hp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_rp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Fz
extends PacketWrapper<CP_Fz> {
    private String CP_q;
    private CP_rp CP_d;
    private Component CP_N;
    @Nullable
    private CP_hp CP_t;
    @Nullable
    private CP_W CP_Q;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String dSQsrOKwXi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fz(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fz(String string, CP_rp ilIlrp, Component component, @Nullable CP_hp ilIlhp) {
        this(string, ilIlrp, component, ilIlhp, null);
    }

    public CP_Fz(String string, CP_rp ilIlrp, Component component, @Nullable CP_hp ilIlhp, @Nullable CP_W ilIlW) {
        super(CP_AG.SCOREBOARD_OBJECTIVE);
        this.CP_q = string;
        this.CP_d = ilIlrp;
        this.CP_N = component;
        this.CP_t = ilIlhp;
        this.CP_Q = ilIlW;
    }

    @Override
    public void CP_e() {
        block10: {
            block13: {
                CP_Fz ilIlFz;
                boolean bl;
                block11: {
                    PacketWrapper[] packetWrapperArray;
                    block12: {
                        CP_Fz ilIlFz2;
                        long l;
                        block7: {
                            block8: {
                                block9: {
                                    block6: {
                                        block4: {
                                            CP_Fz ilIlFz3;
                                            block5: {
                                                l = b ^ 0x49122C0DA95AL;
                                                packetWrapperArray = CP_Fh.CP_a();
                                                ilIlFz3 = this;
                                                if (packetWrapperArray == null) break block4;
                                                if (!ilIlFz3.CP_g.CP_z(ServerVersion.V_1_18)) break block5;
                                                this.CP_q = this.CP_i();
                                                if (packetWrapperArray != null) break block6;
                                            }
                                            ilIlFz3 = this;
                                        }
                                        ilIlFz3.CP_q = this.CP_p((int)CP_Fz.b("h", (int)16225, (long)(0x2B0EB99D151B9C1L ^ l)));
                                    }
                                    this.CP_d = CP_rp.CP_H(this.CP_E());
                                    ilIlFz2 = this;
                                    if (packetWrapperArray == null) break block7;
                                    if (ilIlFz2.CP_d == CP_rp.CREATE) break block8;
                                    ilIlFz2 = this;
                                    if (packetWrapperArray == null) break block7;
                                    if (ilIlFz2.CP_d == CP_rp.UPDATE) break block8;
                                    this.CP_N = Component.empty();
                                    this.CP_t = CP_hp.INTEGER;
                                    CP_Fz ilIlFz4 = this;
                                    if (packetWrapperArray == null) break block9;
                                    if (!ilIlFz4.CP_g.CP_z(ServerVersion.V_1_20_3)) break block10;
                                    ilIlFz4 = this;
                                }
                                ilIlFz4.CP_Q = null;
                                if (packetWrapperArray != null) break block10;
                            }
                            ilIlFz2 = this;
                        }
                        bl = ilIlFz2.CP_g.CP_C(ServerVersion.V_1_13);
                        if (packetWrapperArray == null) break block11;
                        if (!bl) break block12;
                        this.CP_N = this.CP_q().CP_E(this.CP_p((int)CP_Fz.b("h", (int)9567, (long)(0x6FBF83F40C8A3FDL ^ l))));
                        this.CP_t = CP_hp.CP_Y(this.CP_i());
                        if (packetWrapperArray != null) break block10;
                    }
                    this.CP_N = this.CP_J();
                    this.CP_t = CP_hp.CP_p(this.CP_f());
                    ilIlFz = this;
                    if (packetWrapperArray == null) break block13;
                    bl = ilIlFz.CP_g.CP_z(ServerVersion.V_1_20_3);
                }
                if (!bl) break block10;
                ilIlFz = this;
            }
            ilIlFz.CP_Q = (CP_W)this.CP_N(CP_W::CP_D);
        }
    }

    @Override
    public void CP_J() {
        block13: {
            CP_Fz ilIlFz;
            block22: {
                PacketWrapper[] packetWrapperArray;
                block21: {
                    CP_Fz ilIlFz2;
                    block19: {
                        block20: {
                            block14: {
                                block15: {
                                    block18: {
                                        CP_Fz ilIlFz3;
                                        block16: {
                                            block17: {
                                                long l;
                                                block11: {
                                                    block12: {
                                                        block10: {
                                                            CP_Fz ilIlFz4;
                                                            block8: {
                                                                block9: {
                                                                    l = b ^ 0x506F51E497F2L;
                                                                    packetWrapperArray = CP_Fh.CP_a();
                                                                    ilIlFz4 = this;
                                                                    if (packetWrapperArray == null) break block8;
                                                                    if (!ilIlFz4.CP_g.CP_z(ServerVersion.V_1_18)) break block9;
                                                                    this.CP_M(this.CP_q);
                                                                    if (packetWrapperArray != null) break block10;
                                                                }
                                                                ilIlFz4 = this;
                                                            }
                                                            ilIlFz4.CP_m(this.CP_q, (int)CP_Fz.b("h", (int)4927, (long)(0x111436F280F9AB34L ^ l)));
                                                        }
                                                        this.CP_u((byte)this.CP_d.ordinal());
                                                        ilIlFz2 = this;
                                                        if (packetWrapperArray == null) break block11;
                                                        if (ilIlFz2.CP_d == CP_rp.CREATE) break block12;
                                                        ilIlFz2 = this;
                                                        if (packetWrapperArray == null) break block11;
                                                        if (ilIlFz2.CP_d != CP_rp.UPDATE) break block13;
                                                    }
                                                    ilIlFz2 = this;
                                                }
                                                if (packetWrapperArray == null) break block14;
                                                if (!ilIlFz2.CP_g.CP_C(ServerVersion.V_1_13)) break block15;
                                                String string = this.CP_q().CP_e(this.CP_N);
                                                this.CP_M(CP_vM.CP_Q(string, (int)CP_Fz.b("h", (int)19267, (long)(0x557B7F528D83734AL ^ l))));
                                                ilIlFz3 = this;
                                                if (packetWrapperArray == null) break block16;
                                                if (ilIlFz3.CP_t == null) break block17;
                                                this.CP_M(this.CP_t.name().toLowerCase(Locale.ROOT));
                                                if (packetWrapperArray != null) break block18;
                                            }
                                            ilIlFz3 = this;
                                        }
                                        ilIlFz3.CP_M(CP_hp.INTEGER.name().toLowerCase(Locale.ROOT));
                                    }
                                    if (packetWrapperArray != null) break block13;
                                }
                                this.CP_z(this.CP_N);
                                ilIlFz2 = this;
                            }
                            if (packetWrapperArray == null) break block19;
                            if (ilIlFz2.CP_t == null) break block20;
                            this.CP_J(this.CP_t.ordinal());
                            if (packetWrapperArray != null) break block21;
                        }
                        ilIlFz2 = this;
                    }
                    ilIlFz2.CP_J(CP_hp.INTEGER.ordinal());
                }
                ilIlFz = this;
                if (packetWrapperArray == null) break block22;
                if (!ilIlFz.CP_g.CP_z(ServerVersion.V_1_20_3)) break block13;
                ilIlFz = this;
            }
            ilIlFz.CP_I(this.CP_Q, CP_W::CP_L);
        }
    }

    public void CP_s(CP_Fz ilIlFz) {
        this.CP_q = ilIlFz.CP_q;
        this.CP_d = ilIlFz.CP_d;
        this.CP_N = ilIlFz.CP_N;
        this.CP_t = ilIlFz.CP_t;
        this.CP_Q = ilIlFz.CP_Q;
    }

    public String CP_H() {
        return this.CP_q;
    }

    public void CP_W(String string) {
        this.CP_q = string;
    }

    public CP_rp CP_Y() {
        return this.CP_d;
    }

    public void CP_o(CP_rp ilIlrp) {
        this.CP_d = ilIlrp;
    }

    public Component CP_B() {
        return this.CP_N;
    }

    public void CP_R(@Nullable Component component) {
        this.CP_N = component;
    }

    @Nullable
    public CP_hp CP_B() {
        return this.CP_t;
    }

    public void CP_q(@Nullable CP_hp ilIlhp) {
        this.CP_t = ilIlhp;
    }

    @Nullable
    public CP_W CP_s() {
        return this.CP_Q;
    }

    public void CP_a(@Nullable CP_W ilIlW) {
        this.CP_Q = ilIlW;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CP_Fz.b = CP_s.a(-4647457482178484615L, -3518126357642610744L, MethodHandles.lookup().lookupClass()).a(188295554952331L);
                CP_Fz.h = new HashMap<K, V>(13);
                var0 = CP_Fz.b ^ 75893574119142L;
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
                var6_5 = "4\u00b0\u00d2\u009b\u00f4\u0003\u00c7\u0091\u00f9m\u00b8a\f\u00c2\u00dc\u00de";
                var7_6 = "4\u00b0\u00d2\u009b\u00f4\u0003\u00c7\u0091\u00f9m\u00b8a\f\u00c2\u00dc\u00de".length();
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
                    var6_5 = "m\u00ed!\u00fa\u00f9\u00e4\u00f6\u0086\u009b\u00ba\u00b6\u0012\u00bfx\u0092\r";
                    var7_6 = "m\u00ed!\u00fa\u00f9\u00e4\u00f6\u0086\u009b\u00ba\u00b6\u0012\u00bfx\u0092\r".length();
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
        CP_Fz.c = var8_3;
        CP_Fz.g = new Integer[4];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xBD0;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fz", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Fz.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Fz.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Fz.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

