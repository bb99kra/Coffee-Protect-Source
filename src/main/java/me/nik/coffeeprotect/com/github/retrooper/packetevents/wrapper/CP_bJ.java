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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.CP_d_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_bJ
extends PacketWrapper<CP_bJ> {
    private CP_An CP_t;
    private int CP_Q;
    private static final long b = CP_s.a(1704111825889651691L, -9215494415792148763L, MethodHandles.lookup().lookupClass()).a(172086522392232L);
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String gaiGQSJzol = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bJ(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bJ(CP_An ilIlAn, CP_d_ ilIld_) {
        this(ilIlAn, ilIld_.CP_s());
    }

    public CP_bJ(CP_An ilIlAn, int n) {
        super(CP_AG.BLOCK_CHANGE);
        this.CP_t = ilIlAn;
        this.CP_Q = n;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_bJ ilIlbJ;
                block3: {
                    long l = b ^ 0x44BD78F94C46L;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlbJ = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlbJ.CP_g.CP_S(ServerVersion.V_1_7_10)) break block3;
                    this.CP_t = new CP_An(this.CP_W(), this.CP_P(), this.CP_W());
                    int n = this.CP_f();
                    short s = this.CP_P();
                    this.CP_Q = n | s << CP_bJ.b("p", (int)561, (long)(0x1F849E2FF69199CL ^ l));
                    if (packetWrapperArray != null) break block4;
                }
                this.CP_t = this.CP_E();
                ilIlbJ = this;
            }
            ilIlbJ.CP_Q = this.CP_f();
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_bJ ilIlbJ;
            block2: {
                block3: {
                    long l = b ^ 0x5DC0051072EEL;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlbJ = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlbJ.CP_g.CP_S(ServerVersion.V_1_7_10)) break block3;
                    this.CP_a(this.CP_t.CP_w());
                    this.CP_u(this.CP_t.CP_c());
                    this.CP_a(this.CP_t.CP_k());
                    this.CP_J(this.CP_Q & CP_bJ.b("p", (int)5572, (long)(0x5C130C1910C730C3L ^ l)));
                    this.CP_u(this.CP_Q >> CP_bJ.b("p", (int)14891, (long)(0x1EA6A3A831451F2DL ^ l)));
                    if (packetWrapperArray != null) break block4;
                }
                this.CP_h(this.CP_t);
                ilIlbJ = this;
            }
            ilIlbJ.CP_J(this.CP_Q);
        }
    }

    public void CP_N(CP_bJ ilIlbJ) {
        this.CP_t = ilIlbJ.CP_t;
        this.CP_Q = ilIlbJ.CP_Q;
    }

    public CP_An CP_f() {
        return this.CP_t;
    }

    public void CP_q(CP_An ilIlAn) {
        this.CP_t = ilIlAn;
    }

    public int CP_E() {
        return this.CP_Q;
    }

    public void CP_c(int n) {
        this.CP_Q = n;
    }

    public CP_d_ CP_E() {
        return CP_d_.CP_W(this.CP_g.CP_E(), this.CP_Q);
    }

    public void CP_X(CP_d_ ilIld_) {
        this.CP_Q = ilIld_.CP_s();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        h = new HashMap(13);
        long l = b ^ 0x4B2F2891417EL;
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
        String string = "\u001b\u0000\u0006\u00e3\u00eb\u00f0\u0081\u00a8\u0016.\u00b9Z\u0082\u00ca\n\u0096\u0084T$\u0099\u00e0\u00be\u00bc\u00df";
        int n2 = "\u001b\u0000\u0006\u00e3\u00eb\u00f0\u0081\u00a8\u0016.\u00b9Z\u0082\u00ca\n\u0096\u0084T$\u0099\u00e0\u00be\u00bc\u00df".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x16DF;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bJ", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_bJ.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_bJ.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_bJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_bJ.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

