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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Fr
extends PacketWrapper<CP_Fr> {
    public static final int CP_F;
    private UUID CP_o;
    private String CP_V;
    private String CP_n;
    private boolean CP_m;
    private Component CP_I;
    private static final long b;
    private static final String c;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map l;
    private static transient /* synthetic */ String fbZmRXJxSq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fr(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fr(String string, String string2, boolean bl, @Nullable Component component) {
        this(UUID.randomUUID(), string, string2, bl, component);
    }

    public CP_Fr(UUID uUID, String string, String string2, boolean bl, @Nullable Component component) {
        block4: {
            block5: {
                long l = b ^ 0x43532C35B29FL;
                PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                super(CP_AG.RESOURCE_PACK_SEND);
                PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                try {
                    try {
                        if (packetWrapperArray2 == null) break block4;
                        if (string2.length() <= CP_Fr.b("o", (int)8808, (long)(0x4C5DB5B34B11C481L ^ l))) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Fr.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(c + string2.length() + ")");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Fr.a(illegalArgumentException);
                }
            }
            this.CP_o = uUID;
            this.CP_V = string;
            this.CP_n = string2;
            this.CP_m = bl;
            this.CP_I = component;
        }
    }

    @Override
    public void CP_e() {
        block14: {
            boolean bl;
            block13: {
                PacketWrapper[] packetWrapperArray;
                block11: {
                    long l;
                    block12: {
                        l = b ^ 0x5A6DBC4271E3L;
                        packetWrapperArray = CP_Fh.CP_a();
                        try {
                            try {
                                bl = this.CP_g.CP_z(ServerVersion.V_1_20_3);
                                if (packetWrapperArray == null) break block11;
                                if (!bl) break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Fr.a(illegalArgumentException);
                            }
                            this.CP_o = this.CP_v();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Fr.a(illegalArgumentException);
                        }
                    }
                    this.CP_V = this.CP_i();
                    this.CP_n = this.CP_p((int)CP_Fr.b("o", (int)2282, (long)(0x1A80589DBE982D7EL ^ l)));
                    bl = this.CP_g.CP_z(ServerVersion.V_1_17);
                }
                try {
                    try {
                        if (packetWrapperArray == null) break block13;
                        if (!bl) break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Fr.a(illegalArgumentException);
                    }
                    this.CP_m = this.CP_K();
                    bl = this.CP_K();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Fr.a(illegalArgumentException);
                }
            }
            boolean bl2 = bl;
            try {
                if (bl2) {
                    this.CP_I = this.CP_J();
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CP_Fr.a(illegalArgumentException);
            }
        }
    }

    @Override
    public void CP_J() {
        block19: {
            CP_Fr ilIlFr;
            block21: {
                boolean bl;
                CP_Fr ilIlFr2;
                PacketWrapper[] packetWrapperArray;
                block20: {
                    block18: {
                        boolean bl2;
                        block16: {
                            long l;
                            block17: {
                                l = b ^ 0x4310C1AB4F4BL;
                                packetWrapperArray = CP_Fh.CP_a();
                                try {
                                    try {
                                        bl2 = this.CP_g.CP_z(ServerVersion.V_1_20_3);
                                        if (packetWrapperArray == null) break block16;
                                        if (!bl2) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Fr.a(illegalArgumentException);
                                    }
                                    this.CP_c(this.CP_o);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Fr.a(illegalArgumentException);
                                }
                            }
                            try {
                                this.CP_M(this.CP_V);
                                this.CP_m(this.CP_n, (int)CP_Fr.b("o", (int)8808, (long)(0x4C5DB5F0A68F3955L ^ l)));
                                ilIlFr2 = this;
                                if (packetWrapperArray == null) break block18;
                                bl2 = ilIlFr2.CP_g.CP_z(ServerVersion.V_1_17);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Fr.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (!bl2) break block19;
                                ilIlFr2 = this;
                                bl = this.CP_m;
                                if (packetWrapperArray == null) break block20;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Fr.a(illegalArgumentException);
                            }
                            ilIlFr2.CP_a(bl);
                            ilIlFr2 = this;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Fr.a(illegalArgumentException);
                        }
                    }
                    try {
                        bl = this.CP_I != null;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Fr.a(illegalArgumentException);
                    }
                }
                try {
                    try {
                        ilIlFr2.CP_a(bl);
                        ilIlFr = this;
                        if (packetWrapperArray == null) break block21;
                        if (ilIlFr.CP_I == null) break block19;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Fr.a(illegalArgumentException);
                    }
                    ilIlFr = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Fr.a(illegalArgumentException);
                }
            }
            ilIlFr.CP_z(this.CP_I);
        }
    }

    public void CP_L(CP_Fr ilIlFr) {
        this.CP_o = ilIlFr.CP_o;
        this.CP_V = ilIlFr.CP_V;
        this.CP_n = ilIlFr.CP_n;
        this.CP_m = ilIlFr.CP_m;
        this.CP_I = ilIlFr.CP_I;
    }

    public UUID CP_H() {
        return this.CP_o;
    }

    public void CP_E(UUID uUID) {
        this.CP_o = uUID;
    }

    public String CP_D() {
        return this.CP_V;
    }

    public void CP_F(String string) {
        this.CP_V = string;
    }

    public String CP_n() {
        return this.CP_n;
    }

    public void CP_W(String string) {
        this.CP_n = string;
    }

    public boolean CP_f() {
        return this.CP_m;
    }

    public void CP_k(boolean bl) {
        this.CP_m = bl;
    }

    public Component CP_O() {
        return this.CP_I;
    }

    public void CP_X(Component component) {
        this.CP_I = component;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = CP_s.a(-4228148571825949903L, -4363083157989283007L, MethodHandles.lookup().lookupClass()).a(229528673556001L);
        long l = b ^ 0x727F6CF45586L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        byte[] byArray3 = cipher.doFinal("\u008e?\u00d5\u00d2\u001a\u00bf_V\u00db\u0006\u00e5\u00f4\u00a4Q\u00c3\b`x\u0016\u0011\u00d3\\n\u009al\u0094\u000bv\u0092\u00ce\u001cv".getBytes("ISO-8859-1"));
        c = CP_Fr.b(byArray3).intern();
        CP_Fr.l = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[3];
        int n = 0;
        String string = "\u00fa\u0012-K\u00cc\u0097\b\u00bc\u0094:\u00c2v\u0095/n\u00b3@g\u0004\u00ff\u00e09J\u008d";
        int n2 = "\u00fa\u0012-K\u00cc\u0097\b\u00bc\u0094:\u00c2v\u0095/n\u00b3@g\u0004\u00ff\u00e09J\u008d".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        g = lArray;
        h = new Integer[3];
        CP_F = (int)CP_Fr.b("o", (int)3276, (long)(l ^ 0x59CB16EDA84C0D3EL));
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }

    private static String b(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x28E5;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])CP_Fr.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    CP_Fr.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fr", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Fr.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Fr.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Fr.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

