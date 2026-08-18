/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_XE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ct;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_J2
extends PacketWrapper<CP_J2> {
    private static final int CP_y;
    private int CP_x;
    @Nullable
    private Integer CP_l;
    private int CP_Q;
    private int CP_c;
    @Nullable
    private Integer CP_N;
    private CP_Ct CP_V;
    @Nullable
    private Map<Integer, CP_Cg> CP_n;
    @Nullable
    private Map<Integer, Optional<CP_XE>> CP_H;
    @Nullable
    private CP_Cg CP_J;
    @Nullable
    private CP_XE CP_E;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String egCoTuvmqj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J2(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    @ApiStatus.Obsolete
    public CP_J2(int n, Optional<Integer> optional, int n2, int n3, Optional<Integer> optional2, CP_Ct ilIlCt, Optional<Map<Integer, CP_Cg>> optional3, CP_Cg ilIlCg) {
        super(CP_nN.CLICK_WINDOW);
        this.CP_x = n;
        this.CP_l = optional.orElse(null);
        this.CP_Q = n2;
        this.CP_c = n3;
        this.CP_N = optional2.orElse(null);
        this.CP_V = ilIlCt;
        this.CP_n = optional3.orElse(null);
        this.CP_J = ilIlCg;
    }

    /*
     * Unable to fully structure code
     */
    public CP_J2(int var1_1, @Nullable Integer var2_2, int var3_3, int var4_4, CP_Ct var5_5, @Nullable Map<Integer, Optional<CP_XE>> var6_6, @Nullable Optional<CP_XE> var7_7) {
        var8_8 = CP_J2.b ^ 53380921114360L;
        super(CP_nN.CLICK_WINDOW);
        this.CP_x = var1_1;
        var10_9 = CP_JH.CP_w();
        this.CP_l = var2_2;
        this.CP_Q = var3_3;
        this.CP_c = var4_4;
        this.CP_V = var5_5;
        this.CP_H = var6_6;
        v0 = var7_7;
        if (var10_9 != null) ** GOTO lbl14
        if (v0 != null) {
            v0 = var7_7.orElse(null);
lbl14:
            // 2 sources

            v1 = (CP_XE)v0;
        } else {
            v1 = null;
        }
        this.CP_E = v1;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void CP_e() {
        var1_1 = CP_J2.b ^ 138496022695453L;
        this.CP_x = this.CP_e();
        var3_2 = CP_JH.CP_w();
        v0 = this.CP_g.CP_z(ServerVersion.V_1_17_1);
        if (var3_2 != null) ** GOTO lbl8
        if (v0 != 0) {
            v0 = this.CP_f();
lbl8:
            // 2 sources

            v1 = v0;
        } else {
            v1 = null;
        }
        this.CP_l = v1;
        this.CP_Q = this.CP_G();
        this.CP_c = this.CP_E();
        v2 = this.CP_g.CP_z(ServerVersion.V_1_17);
        if (var3_2 != null) ** GOTO lbl20
        if (v2 != 0) {
            v3 = null;
        } else {
            v2 = this.CP_G();
lbl20:
            // 2 sources

            v3 = v2;
        }
        this.CP_N = v3;
        this.CP_V = CP_Ct.CP_O(this.CP_f());
        this.CP_i();
    }

    protected void CP_i() {
        block6: {
            block7: {
                CP_J2 ilIlJ2;
                boolean bl;
                block4: {
                    String string;
                    block5: {
                        long l = b ^ 0x91DF1E0F0C2L;
                        string = CP_JH.CP_w();
                        bl = this.CP_g.CP_z(ServerVersion.V_1_21_5);
                        if (string != null) break block4;
                        if (!bl) break block5;
                        this.CP_H = this.CP_i(packetWrapper -> Math.toIntExact(packetWrapper.CP_G()), CP_XE::CP_B, (int)CP_J2.b("i", (int)18762, (long)(0x156F983D679BD50CL ^ l)));
                        this.CP_E = CP_XE.CP_F(this);
                        if (string == null) break block6;
                    }
                    ilIlJ2 = this;
                    if (string != null) break block7;
                    bl = ilIlJ2.CP_g.CP_z(ServerVersion.V_1_17);
                }
                if (bl) {
                    this.CP_n = this.CP_c(packetWrapper -> Math.toIntExact(packetWrapper.CP_G()), PacketWrapper::CP_k);
                }
                ilIlJ2 = this;
            }
            ilIlJ2.CP_J = this.CP_k();
        }
    }

    public void CP_o(CP_J2 ilIlJ2) {
        this.CP_x = ilIlJ2.CP_x;
        this.CP_l = ilIlJ2.CP_l;
        this.CP_Q = ilIlJ2.CP_Q;
        this.CP_c = ilIlJ2.CP_c;
        this.CP_N = ilIlJ2.CP_N;
        this.CP_V = ilIlJ2.CP_V;
        this.CP_n = ilIlJ2.CP_n;
        this.CP_H = ilIlJ2.CP_H;
        this.CP_J = ilIlJ2.CP_J;
        this.CP_E = ilIlJ2.CP_E;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void CP_J() {
        block16: {
            block14: {
                block15: {
                    block12: {
                        block13: {
                            block10: {
                                block11: {
                                    var1_1 = CP_J2.b ^ 110549838164149L;
                                    v0 = CP_JH.CP_w();
                                    var4_2 = this.CP_g.CP_z(ServerVersion.V_1_17);
                                    this.CP_r(this.CP_x);
                                    var3_3 = v0;
                                    v1 = this.CP_g.CP_z(ServerVersion.V_1_17_1);
                                    if (var3_3 != null) break block10;
                                    if (!v1) break block11;
                                    v2 = this.CP_l;
                                    if (var3_3 != null) ** GOTO lbl13
                                    if (v2 != null) {
                                        v2 = this.CP_l;
lbl13:
                                        // 2 sources

                                        v3 = v2;
                                    } else {
                                        v3 = -1;
                                    }
                                    this.CP_J(v3);
                                }
                                this.CP_G(this.CP_Q);
                                this.CP_u(this.CP_c);
                                v1 = var4_2;
                            }
                            if (var3_3 != null) break block12;
                            if (v1) break block13;
                            v4 = this.CP_N;
                            if (var3_3 != null) ** GOTO lbl28
                            if (v4 != null) {
                                v4 = this.CP_N;
lbl28:
                                // 2 sources

                                v5 = v4;
                            } else {
                                v5 = -1;
                            }
                            this.CP_G(v5);
                        }
                        this.CP_J(this.CP_V.ordinal());
                        v1 = this.CP_g.CP_z(ServerVersion.V_1_21_5);
                    }
                    if (var3_3 != null) break block14;
                    if (!v1) break block15;
                    v6 /* !! */  = this.CP_H;
                    if (var3_3 == null) {
                        v6 /* !! */  = v6 /* !! */  != null ? this.CP_H : Collections.emptyMap();
                    }
                    this.CP_a(v6 /* !! */ , (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_G(int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Integer;)V)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_E(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> java.util.Optional<me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_XE> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
                    CP_XE.CP_R(this, this.CP_E);
                    if (var3_3 == null) break block16;
                }
                v1 = var4_2;
            }
            if (v1) {
                v7 /* !! */  = this.CP_n;
                if (var3_3 == null) {
                    v7 /* !! */  = v7 /* !! */  != null ? this.CP_n : Collections.emptyMap();
                }
                this.CP_a(v7 /* !! */ , (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_G(int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Integer;)V)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_j(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/CP_Cg;)V)());
            }
            this.CP_j(this.CP_J);
        }
    }

    public int CP_F() {
        return this.CP_x;
    }

    public void CP_Q(int n) {
        this.CP_x = n;
    }

    public Optional<Integer> CP_S() {
        return Optional.ofNullable(this.CP_l);
    }

    public void CP_F(Optional<Integer> optional) {
        this.CP_l = optional.orElse(null);
    }

    public int CP_N() {
        return this.CP_Q;
    }

    public void CP_x(int n) {
        this.CP_Q = n;
    }

    public int CP_C() {
        return this.CP_c;
    }

    public void CP_C(int n) {
        this.CP_c = n;
    }

    @ApiStatus.Obsolete
    public Optional<Integer> CP_K() {
        return Optional.ofNullable(this.CP_N);
    }

    @ApiStatus.Obsolete
    public void CP_S(int n) {
        this.CP_N = n;
    }

    public CP_Ct CP_C() {
        return this.CP_V;
    }

    public void CP_r(CP_Ct ilIlCt) {
        this.CP_V = ilIlCt;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @ApiStatus.Obsolete
    public Optional<Map<Integer, CP_Cg>> CP_Y() {
        block6: {
            block5: {
                var1_1 = CP_J2.b ^ 122227755650476L;
                var3_2 = CP_JH.CP_w();
                v0 /* !! */  = this.CP_n;
                if (var3_2 == null) {
                    if (v0 /* !! */  != null) {
                        return Optional.of(this.CP_n);
                    }
                    v0 /* !! */  = this.CP_H;
                }
                if (v0 /* !! */  == null) break block6;
                var4_3 = new HashMap<Integer, CP_Cg>(this.CP_H.size());
                for (Map.Entry<Integer, Optional<CP_XE>> var6_5 : this.CP_H.entrySet()) {
                    var7_6 = var6_5.getValue().orElse(null);
                    v1 = var4_3;
                    if (var3_2 != null) break block5;
                    v2 = var7_6;
                    if (var3_2 != null) ** GOTO lbl18
                    if (v2 != null) {
                        v2 = var7_6;
lbl18:
                        // 2 sources

                        v3 = v2.CP_f();
                    } else {
                        v3 = CP_Cg.CP_P;
                    }
                    v1.put(var6_5.getKey(), v3);
                    if (var3_2 == null) continue;
                }
                v1 = var4_3;
            }
            return Optional.of(v1);
        }
        return Optional.empty();
    }

    @ApiStatus.Obsolete
    public void CP_S(Map<Integer, CP_Cg> map) {
        this.CP_P(Optional.ofNullable(map));
    }

    @ApiStatus.Obsolete
    public void CP_P(Optional<Map<Integer, CP_Cg>> optional) {
        block6: {
            block7: {
                CP_J2 ilIlJ2;
                block8: {
                    long l = b ^ 0x445B60AC230BL;
                    this.CP_n = optional.orElse(null);
                    String string = CP_JH.CP_w();
                    ilIlJ2 = this;
                    if (string != null) break block7;
                    if (ilIlJ2.CP_n == null) break block8;
                    this.CP_H = new HashMap<Integer, Optional<CP_XE>>(this.CP_n.size());
                    for (Map.Entry<Integer, CP_Cg> entry : this.CP_n.entrySet()) {
                        this.CP_H.put(entry.getKey(), CP_XE.CP_e(entry.getValue()));
                        if (string == null) {
                            if (string == null) continue;
                        }
                        break block6;
                    }
                    if (string == null) break block6;
                }
                ilIlJ2 = this;
            }
            ilIlJ2.CP_H = null;
        }
    }

    public @UnknownNullability Map<Integer, Optional<CP_XE>> CP_X() {
        return this.CP_H;
    }

    public void CP_W(Map<Integer, Optional<CP_XE>> map) {
        this.CP_H = map;
    }

    @ApiStatus.Obsolete
    public CP_Cg CP_n() {
        block6: {
            CP_XE ilIlXE;
            block5: {
                long l = b ^ 0x30D52DEDC73AL;
                String string = CP_JH.CP_w();
                CP_J2 ilIlJ2 = this;
                if (string == null) {
                    if (ilIlJ2.CP_J != null) {
                        return this.CP_J;
                    }
                    ilIlJ2 = this;
                }
                ilIlXE = ilIlJ2.CP_E;
                if (string != null) break block5;
                if (ilIlXE == null) break block6;
                ilIlXE = this.CP_E;
            }
            return ilIlXE.CP_f();
        }
        return CP_Cg.CP_P;
    }

    @ApiStatus.Obsolete
    public void CP_U(CP_Cg ilIlCg) {
        this.CP_J = ilIlCg;
        this.CP_E = CP_XE.CP_q(ilIlCg);
    }

    public Optional<CP_XE> CP_W() {
        return Optional.ofNullable(this.CP_E);
    }

    public void CP_z(@Nullable CP_XE ilIlXE) {
        this.CP_E = ilIlXE;
    }

    public void CP_T(Optional<CP_XE> optional) {
        this.CP_E = optional.orElse(null);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = CP_s.a(1453025046950115890L, -846745902182412907L, MethodHandles.lookup().lookupClass()).a(116045210040386L);
        h = new HashMap(13);
        long l = b ^ 0x396284D9F3A5L;
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
        String string = "9D\u00e2\u009a\u00e9&uIU\u0001\u00feV}\u008b<\u0091";
        int n2 = "9D\u00e2\u009a\u00e9&uIU\u0001\u00feV}\u008b<\u0091".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        g = new Integer[2];
        CP_y = (int)CP_J2.b("i", (int)6657, (long)(l ^ 0x245DFD269A9C8521L));
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2FE9;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_J2", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_J2.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_J2.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_J2" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_J2.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

