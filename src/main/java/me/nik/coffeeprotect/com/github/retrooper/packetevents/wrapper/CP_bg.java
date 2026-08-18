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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Cn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_f9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_h9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_LV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_bg
extends PacketWrapper<CP_bg> {
    private static final int CP_f;
    private static final int CP_s;
    private CP_An CP_I;
    private CP_xv CP_v;
    private CP_LV CP_X;
    private String CP_F;
    private CP_An CP_y;
    private CP_An CP_L;
    private CP_Cn CP_e;
    private CP_f9 CP_x;
    private String CP_r;
    private boolean CP_m;
    private boolean CP_T;
    private boolean CP_D;
    private boolean CP_Q;
    private float CP_w;
    private long CP_o;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String vxcrbOFIeL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bg(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bg(CP_An ilIlAn, CP_xv ilIlxv, CP_LV ilIlLV, String string, CP_An ilIlAn2, CP_An ilIlAn3, CP_Cn ilIlCn, CP_f9 ilIlf9, String string2, boolean bl, boolean bl2, boolean bl3, float f, long l) {
        this(ilIlAn, ilIlxv, ilIlLV, string, ilIlAn2, ilIlAn3, ilIlCn, ilIlf9, string2, bl, false, bl2, bl3, f, l);
    }

    public CP_bg(CP_An ilIlAn, CP_xv ilIlxv, CP_LV ilIlLV, String string, CP_An ilIlAn2, CP_An ilIlAn3, CP_Cn ilIlCn, CP_f9 ilIlf9, String string2, boolean bl, boolean bl2, boolean bl3, boolean bl4, float f, long l) {
        super(CP_nN.UPDATE_STRUCTURE_BLOCK);
        this.CP_I = ilIlAn;
        this.CP_v = ilIlxv;
        this.CP_X = ilIlLV;
        this.CP_F = string;
        this.CP_y = ilIlAn2;
        this.CP_L = ilIlAn3;
        this.CP_e = ilIlCn;
        this.CP_x = ilIlf9;
        this.CP_r = string2;
        this.CP_m = bl;
        this.CP_T = bl2;
        this.CP_D = bl3;
        this.CP_Q = bl4;
        this.CP_w = f;
        this.CP_o = l;
    }

    @Override
    public void CP_e() {
        long l = b ^ 0x2A99BB5C9FF1L;
        this.CP_I = this.CP_E();
        this.CP_v = this.CP_y(CP_xv.class);
        String string = CP_JH.CP_w();
        this.CP_X = this.CP_y(CP_LV.class);
        this.CP_F = this.CP_i();
        Object object = this.CP_g.CP_z(ServerVersion.V_1_16_2);
        if (string == null) {
            object = object != 0 ? CP_bg.b("s", (int)8654, (long)(0x1262EE88C3C3C966L ^ l)) : CP_bg.b("s", (int)22698, (long)(0x5426CA0B09713005L ^ l));
        }
        int n = object;
        this.CP_y = new CP_An(CP_h9.CP_n(this.CP_E(), -n, n), CP_h9.CP_n(this.CP_E(), -n, n), CP_h9.CP_n(this.CP_E(), -n, n));
        this.CP_L = new CP_An(CP_h9.CP_n(this.CP_E(), 0, n), CP_h9.CP_n(this.CP_E(), 0, n), CP_h9.CP_n(this.CP_E(), 0, n));
        this.CP_e = this.CP_y(CP_Cn.class);
        this.CP_x = this.CP_y(CP_f9.class);
        Object object2 = this.CP_g.CP_z(ServerVersion.V_1_17);
        if (string == null) {
            object2 = object2 != 0 ? (Object)CP_bg.b("s", (int)27360, (long)(0x36EBC01AA0D0024AL ^ l)) : (Object)CP_bg.b("s", (int)17572, (long)(0x310DDD4923CF2C0AL ^ l));
        }
        this.CP_r = this.CP_p((int)object2);
        this.CP_w = CP_h9.CP_J(this.CP_X(), 0.0f, 1.0f);
        this.CP_o = this.CP_o();
        byte by = this.CP_E();
        int n2 = by & 1;
        if (string == null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        this.CP_m = n2;
        int n3 = by & CP_bg.b("s", (int)29960, (long)(0x19626D02AACA9DA3L ^ l));
        if (string == null) {
            n3 = n3 != 0 ? 1 : 0;
        }
        this.CP_T = n3;
        int n4 = by & 2;
        if (string == null) {
            n4 = n4 != 0 ? 1 : 0;
        }
        this.CP_D = n4;
        int n5 = by & 4;
        if (string == null) {
            this.CP_Q = n5 != 0 ? 1 : 0;
            n5 = this.CP_Q ? 1 : 0;
        }
        if (string != null) {
            PacketWrapper.CP_e(new int[2]);
        }
    }

    @Override
    public void CP_J() {
        long l = b ^ 0x33E4C6B5A159L;
        String string = CP_JH.CP_w();
        this.CP_h(this.CP_I);
        String string2 = string;
        this.CP_w(this.CP_v);
        this.CP_w(this.CP_X);
        this.CP_M(this.CP_F);
        this.CP_u(this.CP_y.CP_j);
        this.CP_u(this.CP_y.CP_w);
        this.CP_u(this.CP_y.CP_k);
        this.CP_u(this.CP_L.CP_j);
        this.CP_u(this.CP_L.CP_w);
        this.CP_u(this.CP_L.CP_k);
        this.CP_w(this.CP_e);
        this.CP_w(this.CP_x);
        this.CP_M(this.CP_r);
        this.CP_R(this.CP_w);
        this.CP_s(this.CP_o);
        int n = this.CP_m;
        if (string2 == null) {
            n = n != 0 ? 1 : 0;
        }
        int n3 = 0 | n;
        n3 = this.CP_D;
        if (string2 == null) {
            n3 = n3 != 0 ? 2 : 0;
        }
        int n5 = n2 | n3;
        n5 = this.CP_Q;
        if (string2 == null) {
            n5 = n5 != 0 ? 4 : 0;
        }
        int n6 = n4 | n5;
        Object object = this.CP_T;
        if (string2 == null) {
            object = object != 0 ? (Object)CP_bg.b("s", (int)11387, (long)(0x2C5A4A5C1B637A7EL ^ l)) : 0;
        }
        this.CP_u(n6 | object);
        if (PacketWrapper.CP_z() == null) {
            CP_JH.CP_q("v22D");
        }
    }

    public void CP_C(CP_bg ilIlbg) {
        this.CP_I = ilIlbg.CP_I;
        this.CP_v = ilIlbg.CP_v;
        this.CP_X = ilIlbg.CP_X;
        this.CP_F = ilIlbg.CP_F;
        this.CP_y = ilIlbg.CP_y;
        this.CP_L = ilIlbg.CP_L;
        this.CP_e = ilIlbg.CP_e;
        this.CP_x = ilIlbg.CP_x;
        this.CP_r = ilIlbg.CP_r;
        this.CP_m = ilIlbg.CP_m;
        this.CP_T = ilIlbg.CP_T;
        this.CP_D = ilIlbg.CP_D;
        this.CP_Q = ilIlbg.CP_Q;
        this.CP_w = ilIlbg.CP_w;
        this.CP_o = ilIlbg.CP_o;
    }

    public CP_An CP_f() {
        return this.CP_I;
    }

    public void CP_k(CP_An ilIlAn) {
        this.CP_I = ilIlAn;
    }

    public CP_xv CP_u() {
        return this.CP_v;
    }

    public void CP_I(CP_xv ilIlxv) {
        this.CP_v = ilIlxv;
    }

    public CP_LV CP_c() {
        return this.CP_X;
    }

    public void CP_a(CP_LV ilIlLV) {
        this.CP_X = ilIlLV;
    }

    public String CP_z() {
        return this.CP_F;
    }

    public void CP_Q(String string) {
        this.CP_F = string;
    }

    public CP_An CP_a() {
        return this.CP_y;
    }

    public void CP_Z(CP_An ilIlAn) {
        this.CP_y = ilIlAn;
    }

    public CP_An CP_UnderScore() {
        return this.CP_L;
    }

    public void CP_r(CP_An ilIlAn) {
        this.CP_L = ilIlAn;
    }

    public CP_Cn CP_B() {
        return this.CP_e;
    }

    public void CP_c(CP_Cn ilIlCn) {
        this.CP_e = ilIlCn;
    }

    public CP_f9 CP_P() {
        return this.CP_x;
    }

    public void CP_F(CP_f9 ilIlf9) {
        this.CP_x = ilIlf9;
    }

    public String CP_P() {
        return this.CP_r;
    }

    public void CP_z(String string) {
        this.CP_r = string;
    }

    public boolean CP_A() {
        return this.CP_m;
    }

    public void CP_J(boolean bl) {
        this.CP_m = bl;
    }

    public boolean CP_k() {
        return this.CP_T;
    }

    public void CP_X(boolean bl) {
        this.CP_T = bl;
    }

    public boolean CP_x() {
        return this.CP_D;
    }

    public void CP_D(boolean bl) {
        this.CP_D = bl;
    }

    public boolean CP_a() {
        return this.CP_Q;
    }

    public void CP_t(boolean bl) {
        this.CP_Q = bl;
    }

    public float CP_r() {
        return this.CP_w;
    }

    public void CP_J(float f) {
        this.CP_w = f;
    }

    public long CP_X() {
        return this.CP_o;
    }

    public void CP_Z(long l) {
        this.CP_o = l;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CP_bg.b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(5167062602454314925L, -8913309043420722188L, MethodHandles.lookup().lookupClass()).a(201135158182961L);
                CP_bg.h = new HashMap<K, V>(13);
                var0 = CP_bg.b ^ 2544592741450L;
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
                var6_5 = "w\u009dt\u00d5\u00c6B\u00bb\u00ae\u00e2.\u00eb\u0014\u00f1\u00a4f\u0082\u008d;\u00c5\u00d4\u00fe\u00eb\u0004\u00cb\u00e6v\u00e6AU\u009fR\u0011\u009c4\u0095\u00b2\u009f\u000f{\u00e3)\u00b0\u00d0t\u00b0B\u0005\u00b6";
                var7_6 = "w\u009dt\u00d5\u00c6B\u00bb\u00ae\u00e2.\u00eb\u0014\u00f1\u00a4f\u0082\u008d;\u00c5\u00d4\u00fe\u00eb\u0004\u00cb\u00e6v\u00e6AU\u009fR\u0011\u009c4\u0095\u00b2\u009f\u000f{\u00e3)\u00b0\u00d0t\u00b0B\u0005\u00b6".length();
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
                    var6_5 = "\u0089\u00b5T\u00f2\u00c6\u00db\u00da\u00b1|47=R\u00fae\u00eb";
                    var7_6 = "\u0089\u00b5T\u00f2\u00c6\u00db\u00da\u00b1|47=R\u00fae\u00eb".length();
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
        CP_bg.c = var8_3;
        CP_bg.g = new Integer[8];
        CP_bg.CP_f = (int)CP_bg.b("s", (int)13724, (long)(var0 ^ 1607914203223369358L));
        CP_bg.CP_s = (int)CP_bg.b("s", (int)24830, (long)(var0 ^ 2104381559119279081L));
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x65DF;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_bg.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_bg.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_bg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

