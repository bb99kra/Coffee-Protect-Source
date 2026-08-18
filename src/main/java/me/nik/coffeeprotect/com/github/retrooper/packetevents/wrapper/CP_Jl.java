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
import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_n0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_G4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Jl
extends PacketWrapper<CP_Jl> {
    private String CP_B;
    private byte[] CP_L;
    private byte[] CP_V;
    private boolean CP_Z;
    private static final long b = CP_s.a(-2516590779917891989L, -7600215800252217996L, MethodHandles.lookup().lookupClass()).a(265864073495796L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String PTnaBzrmob = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jl(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jl(String string, PublicKey publicKey, byte[] byArray) {
        this(string, publicKey.getEncoded(), byArray);
    }

    public CP_Jl(String string, PublicKey publicKey, byte[] byArray, boolean bl) {
        this(string, publicKey.getEncoded(), byArray, bl);
    }

    public CP_Jl(String string, byte[] byArray, byte[] byArray2) {
        this(string, byArray, byArray2, true);
    }

    public CP_Jl(String string, byte[] byArray, byte[] byArray2, boolean bl) {
        super(CP_n0.ENCRYPTION_REQUEST);
        this.CP_B = string;
        this.CP_L = byArray;
        this.CP_V = byArray2;
        this.CP_Z = bl;
    }

    @Override
    public void CP_e() {
        block3: {
            block2: {
                long l = b ^ 0x296D0E1FE891L;
                this.CP_B = this.CP_p((int)CP_Jl.b("d", (int)29113, (long)(0x74D8C9E10831969AL ^ l)));
                int[] nArray = CP_JT.CP_T();
                this.CP_L = this.CP_N((int)CP_Jl.b("d", (int)24974, (long)(0x2E3B8BC5F7506AEL ^ l)));
                this.CP_V = this.CP_N(ByteBufHelper.CP_H(this.CP_S));
                CP_Jl ilIlJl = this;
                if (nArray == null) break block2;
                if (!ilIlJl.CP_g.CP_z(ServerVersion.V_1_20_5)) break block3;
                ilIlJl = this;
            }
            ilIlJl.CP_Z = this.CP_K();
        }
    }

    @Override
    public void CP_J() {
        block3: {
            CP_Jl ilIlJl;
            block2: {
                long l = b ^ 0x301073F6D639L;
                int[] nArray = CP_JT.CP_T();
                this.CP_m(this.CP_B, (int)CP_Jl.b("d", (int)13794, (long)(0x18B267D0379EEC6BL ^ l)));
                int[] nArray2 = nArray;
                this.CP_U(this.CP_L);
                this.CP_U(this.CP_V);
                ilIlJl = this;
                if (nArray2 == null) break block2;
                if (!ilIlJl.CP_g.CP_z(ServerVersion.V_1_20_5)) break block3;
                ilIlJl = this;
            }
            ilIlJl.CP_a(this.CP_Z);
        }
    }

    public void CP_b(CP_Jl ilIlJl) {
        this.CP_B = ilIlJl.CP_B;
        this.CP_L = ilIlJl.CP_L;
        this.CP_V = ilIlJl.CP_V;
        this.CP_Z = ilIlJl.CP_Z;
    }

    public String CP_q() {
        return this.CP_B;
    }

    public void CP_h(String string) {
        this.CP_B = string;
    }

    public byte[] CP_h() {
        return this.CP_L;
    }

    public void CP_m(byte[] byArray) {
        this.CP_L = byArray;
    }

    public PublicKey CP_m() {
        return CP_G4.CP_m(this.CP_L);
    }

    public void CP_q(PublicKey publicKey) {
        this.CP_L = publicKey.getEncoded();
    }

    public byte[] CP_e() {
        return this.CP_V;
    }

    public void CP_K(byte[] byArray) {
        this.CP_V = byArray;
    }

    public boolean CP_w() {
        return this.CP_Z;
    }

    public void CP_r(boolean bl) {
        this.CP_Z = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x7EEEF36111E4L;
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
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00e0SB~&\u00c5\u0007\u00eb&\u00b9\u00b7\u00b7\u0011t\\\u0000\u00ba\u00f5\u00a76\u00bcb\u00d2\u008b";
        int n2 = "\u00e0SB~&\u00c5\u0007\u00eb&\u00b9\u00b7\u00b7\u0011t\\\u0000\u00ba\u00f5\u00a76\u00bcb\u00d2\u008b".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        g = new Integer[3];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A51;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jl", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Jl.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Jl.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jl" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Jl.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

