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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_CV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_id;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_o3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_ig
implements CP_CV {
    private final CP_id CP_l;
    private CP_o3 CP_I;
    private CP_o3 CP_k;
    private CP_o3 CP_N;
    private CP_o3 CP_E;
    private static int[] CP_h;
    private static final long b;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String ItoMfgOHGy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_ig(boolean bl, boolean bl2) {
        long l = b ^ 0x15EBF145F9BAL;
        this(new CP_id((int)CP_ig.b("r", (int)7214, (long)(0xB10AEDAF646E5A5L ^ l))), new CP_o3((int)CP_ig.b("r", (int)15254, (long)(0x7D1C989F6952C218L ^ l))), new CP_o3((int)CP_ig.b("r", (int)15254, (long)(0x7D1C989F6952C218L ^ l))), bl ? new CP_o3((int)CP_ig.b("r", (int)15254, (long)(0x7D1C989F6952C218L ^ l))) : null, bl2 ? new CP_o3((int)CP_ig.b("r", (int)15254, (long)(0x7D1C989F6952C218L ^ l))) : null);
    }

    public CP_ig(CP_id ilIlid, CP_o3 ilIlo3, CP_o3 ilIlo32, CP_o3 ilIlo33, CP_o3 ilIlo34) {
        this.CP_l = ilIlid;
        this.CP_I = ilIlo3;
        this.CP_k = ilIlo32;
        this.CP_N = ilIlo33;
        this.CP_E = ilIlo34;
    }

    @Override
    public int CP_y(int n, int n2, int n3) {
        long l = b ^ 0x178FC64D0346L;
        int n4 = (this.CP_l.CP_V(n, n2, n3) & CP_ig.b("r", (int)19617, (long)(0x762243A4E3B2CFD2L ^ l))) << 4;
        int[] nArray = CP_ig.CP_x();
        int n5 = n4 | this.CP_I.CP_U(n, n2, n3) & CP_ig.b("r", (int)22082, (long)(0x579E82032E27D534L ^ l));
        if (nArray == null) {
            n4 = n5;
            if (this.CP_E != null) {
                n4 |= (this.CP_E.CP_U(n, n2, n3) & CP_ig.b("r", (int)22082, (long)(0x579E82032E27D534L ^ l))) << CP_ig.b("r", (int)30509, (long)(0x24FC91CA14F745DL ^ l));
            }
            n5 = n4;
        }
        if (nArray != null) {
            PacketWrapper.CP_e(new int[4]);
        }
        return n5;
    }

    @Override
    public void CP_A(int n, int n2, int n3, int n4) {
        block5: {
            CP_o3 ilIlo3;
            long l;
            block4: {
                l = b ^ 0x1A56E1A2F368L;
                int[] nArray = CP_ig.CP_x();
                this.CP_l.CP_x(n, n2, n3, n4 >> 4 & CP_ig.b("r", (int)3970, (long)(0x44FFEB02DA327CD9L ^ l)));
                int[] nArray2 = nArray;
                this.CP_I.CP_o(n, n2, n3, n4 & CP_ig.b("r", (int)16369, (long)(0x561EF1D62585CCAEL ^ l)));
                ilIlo3 = this.CP_E;
                if (nArray2 != null) break block4;
                if (ilIlo3 == null) break block5;
                ilIlo3 = this.CP_E;
            }
            ilIlo3.CP_o(n, n2, n3, n4 >> CP_ig.b("r", (int)9707, (long)(0x1D0FC7495CC9D6B1L ^ l)) & CP_ig.b("r", (int)22082, (long)(0x579E8FDA09C8251AL ^ l)));
        }
        if (PacketWrapper.CP_z() == null) {
            CP_ig.CP_u(new int[4]);
        }
    }

    @Override
    public boolean CP_q() {
        byte by;
        block4: {
            long l = b ^ 0xD7B37A9254BL;
            byte[] byArray = this.CP_l.CP_O();
            int n = byArray.length;
            int n2 = 0;
            int[] nArray = CP_ig.CP_x();
            while (n2 < n) {
                byte by2 = byArray[n2];
                if (nArray == null) {
                    by = by2;
                    if (nArray != null) break block4;
                    if (by != 0) {
                        return false;
                    }
                    ++n2;
                }
                if (nArray == null) continue;
            }
            by = 1;
        }
        return by != 0;
    }

    public CP_id CP_S() {
        return this.CP_l;
    }

    public CP_o3 CP_s() {
        return this.CP_I;
    }

    public CP_o3 CP_x() {
        return this.CP_k;
    }

    public CP_o3 CP_C() {
        return this.CP_N;
    }

    public CP_o3 CP_f() {
        return this.CP_E;
    }

    public static void CP_u(int[] nArray) {
        CP_h = nArray;
    }

    public static int[] CP_x() {
        return CP_h;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CP_ig.b = CP_s.a(1713135130353641537L, 4064490520026587633L, MethodHandles.lookup().lookupClass()).a(201844140967703L);
                CP_ig.h = new HashMap<K, V>(13);
                CP_ig.CP_u(null);
                var0 = CP_ig.b ^ 129437008923575L;
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
                var6_5 = "\u00e6\u0094_.\u00cba\u009c\u00d4t\u0097\u00e4\u001d\u00c9\u0081\u00c6v\u00ee\u000fE\u0014\u00bf \u0092\u00ae\u00a3]\u00f8Cg\u0090\u00d4%i\u0013S\u00de\u00f5(\u00f1q\u00bc\u0096\u00e0*\u0005~\u001c\u00ea";
                var7_6 = "\u00e6\u0094_.\u00cba\u009c\u00d4t\u0097\u00e4\u001d\u00c9\u0081\u00c6v\u00ee\u000fE\u0014\u00bf \u0092\u00ae\u00a3]\u00f8Cg\u0090\u00d4%i\u0013S\u00de\u00f5(\u00f1q\u00bc\u0096\u00e0*\u0005~\u001c\u00ea".length();
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
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0003\u008a\u00f4\u009fL\u0010]\u00e3RM~{\u00e3\u00deR\u009a";
                    var7_6 = "\u0003\u008a\u00f4\u009fL\u0010]\u00e3RM~{\u00e3\u00deR\u009a".length();
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
lbl40:
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
lbl53:
                // 1 sources

                ** continue;
            }
        }
        CP_ig.f = var8_3;
        CP_ig.g = new Integer[8];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C7E;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_ig", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_ig.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_ig.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_ig" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_ig.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

