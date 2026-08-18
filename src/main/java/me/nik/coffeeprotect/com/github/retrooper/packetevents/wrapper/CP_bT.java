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
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class CP_bT
extends PacketWrapper<CP_bT> {
    private float CP_m;
    private float CP_e;
    private byte CP_Q;
    private static final long b = CP_s.a(-3967226284982177980L, 5285093668893855485L, MethodHandles.lookup().lookupClass()).a(272430212096761L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String kSBnHbDERz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bT(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bT(float f, float f2, byte by) {
        super(CP_nN.STEER_VEHICLE);
        this.CP_m = f;
        this.CP_e = f2;
        this.CP_Q = by;
    }

    @Override
    public void CP_e() {
        this.CP_m = this.CP_X();
        this.CP_e = this.CP_X();
        this.CP_Q = this.CP_E();
    }

    @Override
    public void CP_J() {
        this.CP_R(this.CP_m);
        this.CP_R(this.CP_e);
        this.CP_u(this.CP_Q);
    }

    public void CP_n(CP_bT ilIlbT) {
        this.CP_m = ilIlbT.CP_m;
        this.CP_e = ilIlbT.CP_e;
        this.CP_Q = ilIlbT.CP_Q;
    }

    public float CP_n() {
        return this.CP_m;
    }

    public void CP_k(float f) {
        this.CP_m = f;
    }

    public float CP_y() {
        return this.CP_e;
    }

    public void CP_E(float f) {
        this.CP_e = f;
    }

    public byte CP_g() {
        return this.CP_Q;
    }

    public void CP_K(byte by) {
        this.CP_Q = by;
    }

    public boolean CP_o() {
        long l = b ^ 0x172A0D2A69E5L;
        String string = CP_JH.CP_w();
        boolean bl = this.CP_Q & 1;
        if (string == null) {
            bl = bl;
        }
        return bl;
    }

    public void CP_j(boolean bl) {
        block4: {
            long l;
            block3: {
                String string;
                block2: {
                    l = b ^ 0x191EFC7D4826L;
                    string = CP_JH.CP_w();
                    if (string != null) break block2;
                    if (!bl) break block3;
                    this.CP_Q = (byte)(this.CP_Q | 1);
                }
                if (string == null) break block4;
            }
            this.CP_Q = (byte)(this.CP_Q & CP_bT.b("o", (int)13886, (long)(0x4D7C0840A75775DFL ^ l)));
        }
    }

    public boolean CP_w() {
        long l = b ^ 0x5C101585F7DCL;
        String string = CP_JH.CP_w();
        boolean bl = this.CP_Q & 2;
        if (string == null) {
            bl = bl;
        }
        return bl;
    }

    public void CP_c(boolean bl) {
        block4: {
            long l;
            block3: {
                String string;
                block2: {
                    l = b ^ 0x4F304106060BL;
                    string = CP_JH.CP_w();
                    if (string != null) break block2;
                    if (!bl) break block3;
                    this.CP_Q = (byte)(this.CP_Q | 2);
                }
                if (string == null) break block4;
            }
            this.CP_Q = (byte)(this.CP_Q & CP_bT.b("o", (int)262, (long)(0x506D24BA7D138CCBL ^ l)));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x317F90386E8BL;
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
        String string = "\u00bb\u00af]\u0093\u00ef\u0012\u00ad##\u00c8\u0015\u00b2\u00d2\u00ef\u00ce\u008f";
        int n2 = "\u00bb\u00af]\u0093\u00ef\u0012\u00ad##\u00c8\u0015\u00b2\u00d2\u00ef\u00ce\u008f".length();
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
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4895;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_bT.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_bT.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_bT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

