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
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bp
extends PacketWrapper<CP_bp> {
    private boolean CP_d;
    private Optional<Boolean> CP_e;
    private Optional<Boolean> CP_D;
    private Optional<Boolean> CP_c;
    private Optional<Float> CP_m;
    private Optional<Float> CP_Z;
    private static final long b = CP_s.a(-5130097112372619427L, -4575568620696097228L, MethodHandles.lookup().lookupClass()).a(155783116918112L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String updfqZrjbs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bp(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bp(boolean bl, Optional<Boolean> optional, Optional<Boolean> optional2, Optional<Boolean> optional3, Optional<Float> optional4, Optional<Float> optional5) {
        super(CP_nN.PLAYER_ABILITIES);
        this.CP_d = bl;
        this.CP_e = optional;
        this.CP_D = optional2;
        this.CP_c = optional3;
        this.CP_m = optional4;
        this.CP_Z = optional5;
    }

    public CP_bp(boolean bl) {
        this(bl, Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty(), Optional.empty());
    }

    @Override
    public void CP_e() {
        block10: {
            String string;
            byte by;
            long l;
            block8: {
                CP_bp ilIlbp;
                block9: {
                    l = b ^ 0x3F2D9F1F9E7DL;
                    by = this.CP_E();
                    string = CP_JH.CP_w();
                    ilIlbp = this;
                    if (string != null) break block8;
                    if (!ilIlbp.CP_g.CP_z(ServerVersion.V_1_16)) break block9;
                    int n = by & 2;
                    if (string == null) {
                        n = n != 0 ? 1 : 0;
                    }
                    this.CP_d = n;
                    this.CP_e = Optional.empty();
                    this.CP_D = Optional.empty();
                    this.CP_c = Optional.empty();
                    this.CP_m = Optional.empty();
                    this.CP_Z = Optional.empty();
                    if (string == null) break block10;
                }
                ilIlbp = this;
            }
            boolean bl = by & 1;
            if (string == null) {
                bl = bl;
            }
            ilIlbp.CP_e = Optional.of(bl);
            int n = by & 2;
            if (string == null) {
                n = n != 0 ? 1 : 0;
            }
            this.CP_d = n;
            boolean bl2 = by & 4;
            if (string == null) {
                bl2 = bl2;
            }
            this.CP_D = Optional.of(bl2);
            boolean bl3 = by & CP_bp.b("o", (int)7501, (long)(0x1622074AF013E307L ^ l));
            if (string == null) {
                bl3 = bl3;
            }
            this.CP_c = Optional.of(bl3);
            this.CP_m = Optional.of(Float.valueOf(this.CP_X()));
            this.CP_Z = Optional.of(Float.valueOf(this.CP_X()));
        }
    }

    @Override
    public void CP_J() {
        block12: {
            CP_bp ilIlbp;
            block14: {
                boolean bl;
                byte by;
                long l;
                block13: {
                    byte by2;
                    String string;
                    block10: {
                        block11: {
                            l = b ^ 0x2650E2F6A0D5L;
                            string = CP_JH.CP_w();
                            by2 = this.CP_g.CP_z(ServerVersion.V_1_16);
                            if (string != null) break block10;
                            if (by2 == 0) break block11;
                            int n = this.CP_d;
                            if (string == null) {
                                n = n != 0 ? 2 : 0;
                            }
                            by = (byte)n;
                            this.CP_u(by);
                            if (string == null) break block12;
                        }
                        by2 = 0;
                    }
                    by = by2;
                    bl = this.CP_e.orElse(false);
                    if (string == null) {
                        if (bl) {
                            by = (byte)(by | 1);
                        }
                        bl = this.CP_d;
                    }
                    if (string == null) {
                        if (bl) {
                            by = (byte)(by | 2);
                        }
                        bl = this.CP_D.orElse(false);
                    }
                    if (string != null) break block13;
                    if (bl) {
                        by = (byte)(by | 4);
                    }
                    ilIlbp = this;
                    if (string != null) break block14;
                    bl = ilIlbp.CP_c.orElse(false);
                }
                if (bl) {
                    by = (byte)(by | CP_bp.b("o", (int)5817, (long)(0x447A534C784D65AL ^ l)));
                }
                this.CP_u(by);
                this.CP_R(this.CP_m.orElse(Float.valueOf(0.1f)).floatValue());
                ilIlbp = this;
            }
            ilIlbp.CP_R(this.CP_Z.orElse(Float.valueOf(0.2f)).floatValue());
        }
    }

    public void CP_W(CP_bp ilIlbp) {
        this.CP_e = ilIlbp.CP_e;
        this.CP_d = ilIlbp.CP_d;
        this.CP_D = ilIlbp.CP_D;
        this.CP_c = ilIlbp.CP_c;
        this.CP_m = ilIlbp.CP_m;
        this.CP_Z = ilIlbp.CP_Z;
    }

    public boolean CP_f() {
        return this.CP_d;
    }

    public void CP_Y(boolean bl) {
        this.CP_d = bl;
    }

    public Optional<Boolean> CP_U() {
        return this.CP_e;
    }

    public void CP_E(Optional<Boolean> optional) {
        this.CP_e = optional;
    }

    public Optional<Boolean> CP_o() {
        return this.CP_D;
    }

    public void CP_s(Optional<Boolean> optional) {
        this.CP_D = optional;
    }

    public Optional<Boolean> CP_t() {
        return this.CP_c;
    }

    public void CP_q(Optional<Boolean> optional) {
        this.CP_c = optional;
    }

    public Optional<Float> CP_H() {
        return this.CP_m;
    }

    public void CP_Y(Optional<Float> optional) {
        this.CP_m = optional;
    }

    public Optional<Float> CP_n() {
        return this.CP_Z;
    }

    public void CP_M(Optional<Float> optional) {
        this.CP_Z = optional;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x5867741E814AL;
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
        String string = "\u00bb\u0089\u009c\u00df\u00e2\u00f7\u00e2\u007fy<\u0003\u00c5]\u00e3\u001aY";
        int n2 = "\u00bb\u0089\u009c\u00df\u00e2\u00f7\u00e2\u007fy<\u0003\u00c5]\u00e3\u001aY".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x733B;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bp", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_bp.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_bp.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bp" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_bp.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

