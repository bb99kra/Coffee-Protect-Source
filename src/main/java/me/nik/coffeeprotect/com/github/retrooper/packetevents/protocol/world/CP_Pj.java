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
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTLongArray;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_CV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Ty;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_o3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_rw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Pj {
    private final int CP_D;
    private final int CP_M;
    private final boolean CP_L;
    private final CP_CV[] CP_k;
    private final CP_Ty[] CP_N;
    private final boolean CP_T;
    @Nullable
    private NBTCompound CP_S;
    @Nullable
    private Map<CP_rw, long[]> CP_P;
    private final boolean CP_t;
    private int[] CP_n;
    private byte[] CP_K;
    private static final long a = CP_s.a(-2028576094097797784L, -8039951915187237204L, MethodHandles.lookup().lookupClass()).a(114753876514535L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static transient /* synthetic */ String BBYbcJJOrB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_Pj(int var1_1, int var2_2, boolean var3_3, CP_CV[] var4_4, CP_Ty[] var5_5, int[] var6_6) {
        var7_7 = CP_Pj.a ^ 61574198912421L;
        v0 = CP_o3.CP_F();
        super();
        var9_8 = v0;
        this.CP_D = var1_1;
        this.CP_M = var2_2;
        v1 = this;
        v2 = var3_3;
        if (var9_8 == null) ** GOTO lbl17
        v1.CP_L = v2;
        this.CP_k = Arrays.copyOf(var4_4, var4_4.length);
        v1 = this;
        if (var5_5 != null) {
            v3 = var5_5;
        } else {
            v2 = 0;
lbl17:
            // 2 sources

            v3 = new CP_Ty[v2];
        }
        v1.CP_N = v3;
        this.CP_T = false;
        this.CP_S = new NBTCompound();
        this.CP_t = true;
        v4 /* !! */  = var6_6;
        if (var9_8 != null) {
            v4 /* !! */  = (int[])(v4 /* !! */  != null ? Arrays.copyOf(var6_6, var6_6.length) : null);
        }
        this.CP_n = v4 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_Pj(int var1_1, int var2_2, boolean var3_3, CP_CV[] var4_4, CP_Ty[] var5_5) {
        var6_6 = CP_Pj.a ^ 53595719653714L;
        super();
        this.CP_D = var1_1;
        this.CP_M = var2_2;
        var8_7 = CP_o3.CP_F();
        v0 = this;
        v1 = var3_3;
        if (var8_7 == null) ** GOTO lbl16
        v0.CP_L = v1;
        this.CP_k = Arrays.copyOf(var4_4, var4_4.length);
        v0 = this;
        if (var5_5 != null) {
            v2 = var5_5;
        } else {
            v1 = 0;
lbl16:
            // 2 sources

            v2 = new CP_Ty[v1];
        }
        v0.CP_N = v2;
        this.CP_T = false;
        this.CP_S = new NBTCompound();
        this.CP_t = false;
        this.CP_n = new int[CP_Pj.a("s", (int)27568, (long)(3855590452242949776L ^ var6_6))];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_Pj(int var1_1, int var2_2, boolean var3_3, CP_CV[] var4_4, CP_Ty[] var5_5, NBTCompound var6_6) {
        var7_7 = CP_Pj.a ^ 59066545028971L;
        v0 = CP_o3.CP_F();
        super();
        var9_8 = v0;
        this.CP_D = var1_1;
        this.CP_M = var2_2;
        v1 = this;
        v2 = var3_3;
        if (var9_8 == null) ** GOTO lbl17
        v1.CP_L = v2;
        this.CP_k = Arrays.copyOf(var4_4, var4_4.length);
        v1 = this;
        if (var5_5 != null) {
            v3 = var5_5;
        } else {
            v2 = 0;
lbl17:
            // 2 sources

            v3 = new CP_Ty[v2];
        }
        v1.CP_N = v3;
        this.CP_T = true;
        this.CP_S = var6_6;
        this.CP_t = false;
        this.CP_n = new int[CP_Pj.a("s", (int)11692, (long)(7228513684620510900L ^ var7_7))];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_Pj(int var1_1, int var2_2, boolean var3_3, CP_CV[] var4_4, CP_Ty[] var5_5, Map<CP_rw, long[]> var6_6) {
        var7_7 = CP_Pj.a ^ 49737582252546L;
        v0 = CP_o3.CP_F();
        super();
        var9_8 = v0;
        this.CP_D = var1_1;
        this.CP_M = var2_2;
        v1 = this;
        v2 = var3_3;
        if (var9_8 == null) ** GOTO lbl17
        v1.CP_L = v2;
        this.CP_k = Arrays.copyOf(var4_4, var4_4.length);
        v1 = this;
        if (var5_5 != null) {
            v3 = var5_5;
        } else {
            v2 = 0;
lbl17:
            // 2 sources

            v3 = new CP_Ty[v2];
        }
        v1.CP_N = v3;
        this.CP_T = true;
        this.CP_S = null;
        this.CP_P = var6_6;
        this.CP_t = false;
        this.CP_n = new int[CP_Pj.a("s", (int)11692, (long)(7228504318865320925L ^ var7_7))];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_Pj(int var1_1, int var2_2, boolean var3_3, CP_CV[] var4_4, CP_Ty[] var5_5, NBTCompound var6_6, int[] var7_7) {
        var8_8 = CP_Pj.a ^ 70286741180507L;
        super();
        this.CP_D = var1_1;
        this.CP_M = var2_2;
        var10_9 = CP_o3.CP_F();
        v0 = this;
        v1 = var3_3;
        if (var10_9 == null) ** GOTO lbl16
        v0.CP_L = v1;
        this.CP_k = Arrays.copyOf(var4_4, var4_4.length);
        v0 = this;
        if (var5_5 != null) {
            v2 = var5_5;
        } else {
            v1 = 0;
lbl16:
            // 2 sources

            v2 = new CP_Ty[v1];
        }
        v0.CP_N = v2;
        this.CP_T = true;
        this.CP_S = var6_6;
        this.CP_t = true;
        v3 /* !! */  = var7_7;
        if (var10_9 != null) {
            v3 /* !! */  = (int[])(v3 /* !! */  != null ? Arrays.copyOf(var7_7, var7_7.length) : null);
        }
        this.CP_n = v3 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_Pj(int var1_1, int var2_2, boolean var3_3, CP_CV[] var4_4, CP_Ty[] var5_5, NBTCompound var6_6, byte[] var7_7) {
        var8_8 = CP_Pj.a ^ 84566463749409L;
        super();
        this.CP_D = var1_1;
        var10_9 = CP_o3.CP_F();
        this.CP_M = var2_2;
        v0 = this;
        v1 = var3_3;
        if (var10_9 == null) ** GOTO lbl16
        v0.CP_L = v1;
        this.CP_k = Arrays.copyOf(var4_4, var4_4.length);
        v0 = this;
        if (var5_5 != null) {
            v2 = var5_5;
        } else {
            v1 = 0;
lbl16:
            // 2 sources

            v2 = new CP_Ty[v1];
        }
        v0.CP_N = v2;
        this.CP_T = true;
        this.CP_S = var6_6;
        this.CP_t = true;
        v3 /* !! */  = var7_7;
        if (var10_9 != null) {
            v3 /* !! */  = (byte[])(v3 /* !! */  != null ? Arrays.copyOf(var7_7, var7_7.length) : null);
        }
        this.CP_K = v3 /* !! */ ;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_Pj(int var1_1, int var2_2, boolean var3_3, CP_CV[] var4_4, CP_Ty[] var5_5, byte[] var6_6) {
        var7_7 = CP_Pj.a ^ 67548553648383L;
        v0 = CP_o3.CP_F();
        super();
        this.CP_D = var1_1;
        var9_8 = v0;
        this.CP_M = var2_2;
        v1 = this;
        v2 = var3_3;
        if (var9_8 == null) ** GOTO lbl17
        v1.CP_L = v2;
        this.CP_k = Arrays.copyOf(var4_4, var4_4.length);
        v1 = this;
        if (var5_5 != null) {
            v3 = var5_5;
        } else {
            v2 = 0;
lbl17:
            // 2 sources

            v3 = new CP_Ty[v2];
        }
        v1.CP_N = v3;
        this.CP_T = false;
        this.CP_S = new NBTCompound();
        this.CP_t = true;
        v4 /* !! */  = var6_6;
        if (var9_8 != null) {
            v4 /* !! */  = (byte[])(v4 /* !! */  != null ? Arrays.copyOf(var6_6, var6_6.length) : null);
        }
        this.CP_K = v4 /* !! */ ;
    }

    public int CP_G() {
        return this.CP_D;
    }

    public int CP_x() {
        return this.CP_M;
    }

    public boolean CP_P() {
        return this.CP_L;
    }

    public CP_CV[] CP_Z() {
        return this.CP_k;
    }

    public CP_Ty[] CP_d() {
        return this.CP_N;
    }

    public boolean CP_E() {
        return this.CP_T;
    }

    @Deprecated
    public NBTCompound CP_K() {
        long l = a ^ 0x78C71FD68D5AL;
        String string = CP_o3.CP_F();
        NBTCompound nBTCompound = this.CP_S;
        if (string != null) {
            if (nBTCompound == null) {
                this.CP_S = new NBTCompound();
                for (Map.Entry<CP_rw, long[]> entry : this.CP_A().entrySet()) {
                    nBTCompound = this.CP_S;
                    if (string != null) {
                        nBTCompound.setTag(entry.getKey().CP_d(), new NBTLongArray(entry.getValue()));
                        if (string != null) continue;
                    }
                    break;
                }
            } else {
                nBTCompound = this.CP_S;
            }
        }
        return nBTCompound;
    }

    public Map<CP_rw, long[]> CP_A() {
        Map<CP_rw, long[]> map;
        block3: {
            block4: {
                NBTCompound nBTCompound;
                String string;
                block7: {
                    block8: {
                        block5: {
                            CP_Pj ilIlPj;
                            block6: {
                                long l = a ^ 0x547CA522AF77L;
                                string = CP_o3.CP_F();
                                map = this.CP_P;
                                if (string == null) break block3;
                                if (map != null) break block4;
                                ilIlPj = this;
                                if (string == null) break block5;
                                if (!ilIlPj.CP_T) break block6;
                                nBTCompound = this.CP_S;
                                if (string == null) break block7;
                                if (!nBTCompound.isEmpty()) break block8;
                            }
                            ilIlPj = this;
                        }
                        ilIlPj.CP_P = Collections.emptyMap();
                        if (string != null) break block4;
                    }
                    this.CP_P = new EnumMap<CP_rw, long[]>(CP_rw.class);
                    nBTCompound = this.CP_S;
                }
                for (Map.Entry<String, NBT> entry : nBTCompound.getTags().entrySet()) {
                    block10: {
                        Object object;
                        CP_rw ilIlrw;
                        block11: {
                            block9: {
                                object = ilIlrw = CP_rw.CP_H(entry.getKey());
                                if (string == null) break block9;
                                if (object == null) break block10;
                                object = entry.getValue();
                            }
                            if (string == null) break block11;
                            if (!(object instanceof NBTLongArray)) break block10;
                            object = entry.getValue();
                        }
                        long[] lArray = ((NBTLongArray)object).getValue();
                        this.CP_P.put(ilIlrw, lArray);
                    }
                    if (string != null) continue;
                }
            }
            map = this.CP_P;
        }
        return map;
    }

    public boolean CP_g() {
        return this.CP_t;
    }

    public int[] CP_P() {
        return this.CP_n;
    }

    public byte[] CP_L() {
        return this.CP_K;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x73FBE6BE105AL;
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
        String string = "5q=\u00f2\u00b9K\u00833\u009bYr\u00df\u00dd\u0096*\u00b6";
        int n2 = "5q=\u00f2\u00b9K\u00833\u009bYr\u00df\u00dd\u0096*\u00b6".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5AB6;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_Pj", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Pj.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Pj.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_Pj" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Pj.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

