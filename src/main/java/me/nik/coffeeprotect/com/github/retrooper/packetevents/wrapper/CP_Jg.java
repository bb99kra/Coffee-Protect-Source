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
import java.util.Objects;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_qw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_yF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Js;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Jg
extends PacketWrapper<CP_Jg> {
    private String CP_c;
    @Nullable
    private CP_yF CP_I;
    @Nullable
    private UUID CP_G;
    private static final long b = CP_s.a(429501882928695198L, 529758744126527692L, MethodHandles.lookup().lookupClass()).a(237160483686807L);
    private static final String c;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map l;
    private static transient /* synthetic */ String kIZfWqAatq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jg(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Jg(ClientVersion clientVersion, String string) {
        this(clientVersion, string, null, null);
    }

    public CP_Jg(ClientVersion clientVersion, String string, @Nullable CP_yF ilIlyF) {
        this(clientVersion, string, ilIlyF, null);
    }

    public CP_Jg(ClientVersion clientVersion, String string, @Nullable CP_yF ilIlyF, @Nullable UUID uUID) {
        super(CP_qw.LOGIN_START.CP_Y(), clientVersion);
        this.CP_c = string;
        this.CP_I = ilIlyF;
        this.CP_G = uUID;
    }

    @Override
    public void CP_e() {
        block6: {
            block9: {
                CP_Jg ilIlJg;
                boolean bl;
                block7: {
                    String[] stringArray;
                    block8: {
                        block5: {
                            long l = b ^ 0x10956A50BBBDL;
                            this.CP_c = this.CP_p((int)CP_Jg.b("z", (int)23622, (long)(0x25DAC3D084EAE62DL ^ l)));
                            stringArray = CP_Js.CP_y();
                            bl = this.CP_g.CP_z(ServerVersion.V_1_19);
                            if (stringArray == null) break block5;
                            if (!bl) break block6;
                            bl = this.CP_g.CP_S(ServerVersion.V_1_19_3);
                        }
                        if (stringArray != null) {
                            if (bl) {
                                this.CP_I = (CP_yF)this.CP_N(PacketWrapper::CP_p);
                            }
                            bl = this.CP_g.CP_z(ServerVersion.V_1_20_2);
                        }
                        if (stringArray == null) break block7;
                        if (!bl) break block8;
                        this.CP_G = this.CP_v();
                        if (stringArray != null) break block6;
                    }
                    ilIlJg = this;
                    if (stringArray == null) break block9;
                    bl = ilIlJg.CP_g.CP_z(ServerVersion.V_1_19_1);
                }
                if (!bl) break block6;
                ilIlJg = this;
            }
            ilIlJg.CP_G = (UUID)this.CP_N(PacketWrapper::CP_v);
        }
    }

    @Override
    public void CP_J() {
        block6: {
            CP_Jg ilIlJg;
            block9: {
                boolean bl;
                block7: {
                    String[] stringArray;
                    block8: {
                        block5: {
                            long l = b ^ 0x9E817B98515L;
                            String[] stringArray2 = CP_Js.CP_y();
                            this.CP_m(this.CP_c, (int)CP_Jg.b("z", (int)29188, (long)(0x7C3D3471469BF6C6L ^ l)));
                            stringArray = stringArray2;
                            bl = this.CP_g.CP_z(ServerVersion.V_1_19);
                            if (stringArray == null) break block5;
                            if (!bl) break block6;
                            bl = this.CP_g.CP_S(ServerVersion.V_1_19_3);
                        }
                        if (stringArray != null) {
                            if (bl) {
                                this.CP_I(this.CP_I, PacketWrapper::CP_Q);
                            }
                            bl = this.CP_g.CP_z(ServerVersion.V_1_20_2);
                        }
                        if (stringArray == null) break block7;
                        if (!bl) break block8;
                        this.CP_c(Objects.requireNonNull(this.CP_G, c));
                        if (stringArray != null) break block6;
                    }
                    ilIlJg = this;
                    if (stringArray == null) break block9;
                    bl = ilIlJg.CP_g.CP_z(ServerVersion.V_1_19_1);
                }
                if (!bl) break block6;
                ilIlJg = this;
            }
            ilIlJg.CP_I(this.CP_G, PacketWrapper::CP_c);
        }
    }

    public void CP_j(CP_Jg ilIlJg) {
        this.CP_c = ilIlJg.CP_c;
        this.CP_I = ilIlJg.CP_I;
        this.CP_G = ilIlJg.CP_G;
    }

    public String CP_f() {
        return this.CP_c;
    }

    public void CP_H(String string) {
        this.CP_c = string;
    }

    public Optional<CP_yF> CP_o() {
        return Optional.ofNullable(this.CP_I);
    }

    public void CP_K(@Nullable CP_yF ilIlyF) {
        this.CP_I = ilIlyF;
    }

    public Optional<UUID> CP_c() {
        return Optional.ofNullable(this.CP_G);
    }

    public void CP_z(@Nullable UUID uUID) {
        this.CP_G = uUID;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x1404B40CCD83L;
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
        byte[] byArray3 = cipher.doFinal("\u00cfJi\u009d1Z\u00f2aA\u00041\u00deD;\u00b0\u0011\u00ab\u00193\u0006#U\u00b0\u008a\u00b2nk\u0099\u008b`\u00f3\u00d9\u0091D\u00ae\u009a\u001d\u000eUj".getBytes("ISO-8859-1"));
        c = CP_Jg.b(byArray3).intern();
        CP_Jg.l = new HashMap(13);
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
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u000eT\u0095;\u0015\u00a6\u0005\u00d1t\u009e\u00ef\u001b\u00b2\u00e7\u00d4>";
        int n2 = "\u000eT\u0095;\u0015\u00a6\u0005\u00d1t\u009e\u00ef\u001b\u00b2\u00e7\u00d4>".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        g = lArray;
        h = new Integer[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x371B;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])CP_Jg.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    CP_Jg.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Jg.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Jg.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Jg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

