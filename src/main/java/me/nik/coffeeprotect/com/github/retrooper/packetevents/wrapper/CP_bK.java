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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bK
extends PacketWrapper<CP_bK> {
    private String CP_Z;
    private byte[] CP_y;
    private static final long b = CP_s.a(-7549052850858637528L, -6694890315569380599L, MethodHandles.lookup().lookupClass()).a(40428493019151L);
    private static final String c;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map l;
    private static transient /* synthetic */ String VBxwpbsAoR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bK(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bK(String string, byte[] byArray) {
        super(CP_nN.PLUGIN_MESSAGE);
        this.CP_Z = string;
        this.CP_y = byArray;
    }

    public CP_bK(ResourceLocation resourceLocation, byte[] byArray) {
        super(CP_nN.PLUGIN_MESSAGE);
        this.CP_Z = resourceLocation.toString();
        this.CP_y = byArray;
    }

    @Override
    public void CP_e() {
        block18: {
            CP_bK ilIlbK;
            int n;
            long l;
            block16: {
                String string;
                block17: {
                    block15: {
                        block13: {
                            l = b ^ 0x775212323CBCL;
                            string = CP_JH.CP_w();
                            try {
                                CP_bK ilIlbK2;
                                block14: {
                                    try {
                                        try {
                                            ilIlbK2 = this;
                                            if (string != null) break block13;
                                            if (!ilIlbK2.CP_g.CP_z(ServerVersion.V_1_13)) break block14;
                                        }
                                        catch (RuntimeException runtimeException) {
                                            throw CP_bK.a(runtimeException);
                                        }
                                        this.CP_Z = this.CP_i();
                                        if (string == null) break block15;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw CP_bK.a(runtimeException);
                                    }
                                }
                                ilIlbK2 = this;
                            }
                            catch (RuntimeException runtimeException) {
                                throw CP_bK.a(runtimeException);
                            }
                        }
                        ilIlbK2.CP_Z = this.CP_p((int)CP_bK.b("w", (int)30882, (long)(0x35BA96FC4A508FA7L ^ l)));
                    }
                    try {
                        n = this.CP_g.CP_S(ServerVersion.V_1_7_10);
                        if (string != null) break block16;
                        if (n == 0) break block17;
                    }
                    catch (RuntimeException runtimeException) {
                        throw CP_bK.a(runtimeException);
                    }
                    short s = this.CP_G();
                }
                try {
                    ilIlbK = this;
                    if (string != null) break block18;
                    n = ByteBufHelper.CP_H(ilIlbK.CP_S);
                }
                catch (RuntimeException runtimeException) {
                    throw CP_bK.a(runtimeException);
                }
            }
            try {
                if (n > CP_bK.b("w", (int)1487, (long)(0x3270C49A7B8C72C9L ^ l))) {
                    throw new RuntimeException(c);
                }
            }
            catch (RuntimeException runtimeException) {
                throw CP_bK.a(runtimeException);
            }
            ilIlbK = this;
        }
        ilIlbK.CP_y = this.CP_q();
    }

    @Override
    public void CP_J() {
        CP_bK ilIlbK;
        block13: {
            block14: {
                String string;
                block12: {
                    CP_bK ilIlbK2;
                    long l;
                    block10: {
                        l = b ^ 0x6E2F6FDB0214L;
                        string = CP_JH.CP_w();
                        try {
                            block11: {
                                try {
                                    try {
                                        ilIlbK2 = this;
                                        if (string != null) break block10;
                                        if (!ilIlbK2.CP_g.CP_z(ServerVersion.V_1_13)) break block11;
                                    }
                                    catch (RuntimeException runtimeException) {
                                        throw CP_bK.a(runtimeException);
                                    }
                                    this.CP_M(this.CP_Z);
                                    if (string == null) break block12;
                                }
                                catch (RuntimeException runtimeException) {
                                    throw CP_bK.a(runtimeException);
                                }
                            }
                            ilIlbK2 = this;
                        }
                        catch (RuntimeException runtimeException) {
                            throw CP_bK.a(runtimeException);
                        }
                    }
                    ilIlbK2.CP_m(this.CP_Z, (int)CP_bK.b("w", (int)10409, (long)(0x3F31C8F9D443E106L ^ l)));
                }
                try {
                    try {
                        ilIlbK = this;
                        if (string != null) break block13;
                        if (!ilIlbK.CP_g.CP_S(ServerVersion.V_1_7_10)) break block14;
                    }
                    catch (RuntimeException runtimeException) {
                        throw CP_bK.a(runtimeException);
                    }
                    this.CP_G(this.CP_y.length);
                }
                catch (RuntimeException runtimeException) {
                    throw CP_bK.a(runtimeException);
                }
            }
            ilIlbK = this;
        }
        ilIlbK.CP_e(this.CP_y);
    }

    public void CP_O(CP_bK ilIlbK) {
        this.CP_Z = ilIlbK.CP_Z;
        this.CP_y = ilIlbK.CP_y;
    }

    public String CP_R() {
        return this.CP_Z;
    }

    public void CP_o(String string) {
        this.CP_Z = string;
    }

    public byte[] CP_b() {
        return this.CP_y;
    }

    public void CP_R(byte[] byArray) {
        this.CP_y = byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x2A65C553CEFBL;
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
        byte[] byArray3 = cipher.doFinal("\u00ef8\\\u00c0\u00ed\u00cb\u0081\u0093F\u00ac\u00b5~\u00adH\n\u00f4\u00979\u00fb\u0096\u0003\u00ee\u00df\u00eb\u0093\u00c3z\u00eev\u00a0\u0013^\u00c2a\u00b9\u0007\n^\u00ab\u00b7\u00a0S\u00b96\u0004ZAw".getBytes("ISO-8859-1"));
        c = CP_bK.b(byArray3).intern();
        CP_bK.l = new HashMap(13);
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
        String string = "s#\u00efz\u00fb\u001e\u008f\u0085\u0083\u00c2#\u00ee\u00b0(e\b9s\u00c6e2>\u00ec\u0013";
        int n2 = "s#\u00efz\u00fb\u001e\u008f\u0085\u0083\u00c2#\u00ee\u00b0(e\b9s\u00c6e2>\u00ec\u0013".length();
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
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7A77;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])CP_bK.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    CP_bK.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_bK.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_bK.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_bK.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

