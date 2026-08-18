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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Fp
extends PacketWrapper<CP_Fp> {
    private String CP_Q;
    private byte[] CP_c;
    private static final long b = CP_s.a(2058860086595485102L, 8849456700954724269L, MethodHandles.lookup().lookupClass()).a(54139473699862L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String XiuHGpGKmy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fp(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fp(String string, byte[] byArray) {
        super(CP_AG.PLUGIN_MESSAGE);
        this.CP_Q = string;
        this.CP_c = byArray;
    }

    public CP_Fp(ResourceLocation resourceLocation, byte[] byArray) {
        super(CP_AG.PLUGIN_MESSAGE);
        this.CP_Q = resourceLocation.toString();
        this.CP_c = byArray;
    }

    @Override
    public void CP_e() {
        PacketWrapper[] packetWrapperArray;
        block7: {
            long l;
            block5: {
                CP_Fp ilIlFp;
                block6: {
                    l = b ^ 0x5738B0EED168L;
                    packetWrapperArray = CP_Fh.CP_a();
                    ilIlFp = this;
                    if (packetWrapperArray == null) break block5;
                    if (!ilIlFp.CP_g.CP_z(ServerVersion.V_1_13)) break block6;
                    this.CP_Q = this.CP_i();
                    if (packetWrapperArray != null) break block7;
                }
                ilIlFp = this;
            }
            ilIlFp.CP_Q = this.CP_p((int)CP_Fp.b("t", (int)23711, (long)(0x4B8A4784FE839326L ^ l)));
        }
        CP_Fp ilIlFp = this;
        if (packetWrapperArray != null) {
            if (ilIlFp.CP_g.CP_S(ServerVersion.V_1_7_10)) {
                short s = this.CP_G();
            }
            ilIlFp = this;
        }
        ilIlFp.CP_c = this.CP_q();
    }

    @Override
    public void CP_J() {
        PacketWrapper[] packetWrapperArray;
        block7: {
            CP_Fp ilIlFp;
            long l;
            block5: {
                block6: {
                    l = b ^ 0x4E45CD07EFC0L;
                    packetWrapperArray = CP_Fh.CP_a();
                    ilIlFp = this;
                    if (packetWrapperArray == null) break block5;
                    if (!ilIlFp.CP_g.CP_z(ServerVersion.V_1_13)) break block6;
                    this.CP_M(this.CP_Q);
                    if (packetWrapperArray != null) break block7;
                }
                ilIlFp = this;
            }
            ilIlFp.CP_m(this.CP_Q, (int)CP_Fp.b("t", (int)11798, (long)(0x27CF680EF82DF06L ^ l)));
        }
        CP_Fp ilIlFp = this;
        if (packetWrapperArray != null) {
            if (ilIlFp.CP_g.CP_S(ServerVersion.V_1_7_10)) {
                this.CP_G(this.CP_c.length);
            }
            ilIlFp = this;
        }
        ilIlFp.CP_e(this.CP_c);
    }

    public void CP_u(CP_Fp ilIlFp) {
        this.CP_Q = ilIlFp.CP_Q;
        this.CP_c = ilIlFp.CP_c;
    }

    public String CP_j() {
        return this.CP_Q;
    }

    public void CP_a(String string) {
        this.CP_Q = string;
    }

    public byte[] CP_R() {
        return this.CP_c;
    }

    public void CP_E(byte[] byArray) {
        this.CP_c = byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x315616EAA60FL;
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
        String string = "\u00ce\u008d\u00b0G\t\u0015\u00a6\u0094W?\u0099v\u001d\u00e65\u00d7";
        int n2 = "\u00ce\u008d\u00b0G\t\u0015\u00a6\u0094W?\u0099v\u001d\u00e65\u00d7".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x42C9;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Fp.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Fp.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Fp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

