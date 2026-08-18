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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Jb
extends PacketWrapper<CP_Jb> {
    public static final int CP_a;
    private UUID CP_t;
    private String CP_p;
    private String CP_r;
    private boolean CP_e;
    private Component CP_T;
    private static final long b;
    private static final String c;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map l;
    private static transient /* synthetic */ String CATzUhWUMK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jb(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jb(String string, String string2, boolean bl, @Nullable Component component) {
        this(UUID.randomUUID(), string, string2, bl, component);
    }

    public CP_Jb(UUID uUID, String string, String string2, boolean bl, @Nullable Component component) {
        block7: {
            block8: {
                long l = b ^ 0x40E60796BF8AL;
                int[] nArray = CP_JS.CP_v();
                super(CP_Wz.RESOURCE_PACK_SEND);
                int[] nArray2 = nArray;
                try {
                    try {
                        if (nArray2 == null) break block7;
                        if (string2.length() <= CP_Jb.b("p", (int)8951, (long)(0x34CA40B820CAE18AL ^ l))) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Jb.a(illegalArgumentException);
                    }
                    throw new IllegalArgumentException(c + string2.length() + ")");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Jb.a(illegalArgumentException);
                }
            }
            this.CP_t = uUID;
            this.CP_p = string;
            this.CP_r = string2;
            this.CP_e = bl;
            this.CP_T = component;
        }
        try {
            if (PacketWrapper.CP_z() == null) {
                CP_JS.CP_s(new int[5]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_Jb.a(illegalArgumentException);
        }
    }

    @Override
    public void CP_e() {
        block11: {
            block10: {
                CP_Jb ilIlJb;
                boolean bl;
                block8: {
                    int[] nArray;
                    long l;
                    block9: {
                        l = b ^ 0x3775364A3698L;
                        nArray = CP_JS.CP_v();
                        try {
                            try {
                                bl = this.CP_g.CP_z(ServerVersion.V_1_20_3);
                                if (nArray == null) break block8;
                                if (!bl) break block9;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Jb.a(illegalArgumentException);
                            }
                            this.CP_t = this.CP_v();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Jb.a(illegalArgumentException);
                        }
                    }
                    try {
                        this.CP_p = this.CP_i();
                        this.CP_r = this.CP_p((int)CP_Jb.b("p", (int)29440, (long)(0x7FA0079BDABFB96CL ^ l)));
                        this.CP_e = this.CP_K();
                        ilIlJb = this;
                        if (nArray == null) break block10;
                        bl = ilIlJb.CP_K();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Jb.a(illegalArgumentException);
                    }
                }
                if (!bl) break block11;
                ilIlJb = this;
            }
            ilIlJb.CP_T = this.CP_J();
        }
    }

    @Override
    public void CP_J() {
        block14: {
            CP_Jb ilIlJb;
            block12: {
                block13: {
                    int[] nArray;
                    block10: {
                        long l;
                        block11: {
                            l = b ^ 0x2E084BA30830L;
                            nArray = CP_JS.CP_v();
                            try {
                                try {
                                    ilIlJb = this;
                                    if (nArray == null) break block10;
                                    if (!ilIlJb.CP_g.CP_z(ServerVersion.V_1_20_3)) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Jb.a(illegalArgumentException);
                                }
                                this.CP_c(this.CP_t);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Jb.a(illegalArgumentException);
                            }
                        }
                        this.CP_M(this.CP_p);
                        this.CP_m(this.CP_r, (int)CP_Jb.b("p", (int)29440, (long)(0x7FA01EE6A75687C4L ^ l)));
                        this.CP_a(this.CP_e);
                        ilIlJb = this;
                    }
                    try {
                        try {
                            try {
                                if (nArray == null) break block12;
                                if (ilIlJb.CP_T == null) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Jb.a(illegalArgumentException);
                            }
                            this.CP_a(true);
                            this.CP_z(this.CP_T);
                            if (nArray != null) break block14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Jb.a(illegalArgumentException);
                        }
                        PacketWrapper.CP_e(new int[5]);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Jb.a(illegalArgumentException);
                    }
                }
                ilIlJb = this;
            }
            ilIlJb.CP_a(false);
        }
    }

    public void CP_m(CP_Jb ilIlJb) {
        this.CP_t = ilIlJb.CP_t;
        this.CP_p = ilIlJb.CP_p;
        this.CP_r = ilIlJb.CP_r;
        this.CP_e = ilIlJb.CP_e;
        this.CP_T = ilIlJb.CP_T;
    }

    public UUID CP_A() {
        return this.CP_t;
    }

    public void CP_v(UUID uUID) {
        this.CP_t = uUID;
    }

    public String CP_v() {
        return this.CP_p;
    }

    public void CP_a(String string) {
        this.CP_p = string;
    }

    public String CP_g() {
        return this.CP_r;
    }

    public void CP_o(String string) {
        this.CP_r = string;
    }

    public boolean CP_x() {
        return this.CP_e;
    }

    public void CP_x(boolean bl) {
        this.CP_e = bl;
    }

    public Component CP_B() {
        return this.CP_T;
    }

    public void CP_c(Component component) {
        this.CP_T = component;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = CP_s.a(-4965564136741593720L, 8672551074731589984L, MethodHandles.lookup().lookupClass()).a(177211842815351L);
        long l = b ^ 0x59560ABBC503L;
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
        byte[] byArray3 = cipher.doFinal("\u0012\u00eeDr^\u0092\u00b3\u0001\u00ce\u00df\u009e\u00d3h\u00ea\\\u008d\u0096\u00ab\u00f0\u00d8Qt\u0018u\u00cc\u00b5V\u00ef)Q\u0086\u00b6".getBytes("ISO-8859-1"));
        c = CP_Jb.b(byArray3).intern();
        CP_Jb.l = new HashMap(13);
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
        String string = "]2\u00a9\u00bf\u00a8\u00acM\u0098-V\u00de\u001b\u00c5\u0018\u0093\u0081\u00bf\u0002\u00cb\u0013\u00fb\u008f\u00da\u00ab";
        int n2 = "]2\u00a9\u00bf\u00a8\u00acM\u0098-V\u00de\u001b\u00c5\u0018\u0093\u0081\u00bf\u0002\u00cb\u0013\u00fb\u008f\u00da\u00ab".length();
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
        CP_a = (int)CP_Jb.b("p", (int)19387, (long)(l ^ 0x5E50CB6C455A724EL));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x471E;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])CP_Jb.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    CP_Jb.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Jb.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Jb.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Jb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

