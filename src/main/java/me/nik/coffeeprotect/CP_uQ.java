/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

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
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_TV;
import me.nik.coffeeprotect.CP_jl;
import me.nik.coffeeprotect.CP_u7;
import me.nik.coffeeprotect.CP_uV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_bT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

@CP_jl(CP_J="Invalid Steer Vehicle", CP_M="Checks for invalid steer vehicle packets")
public class CP_uQ
extends CP_uV {
    private static final long b = CP_s.a(642836888181383817L, -7942079257254254479L, MethodHandles.lookup().lookupClass()).a(191046616693386L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static transient /* synthetic */ String cluxmeHYJY = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_uQ(CP_TM ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_STEER_VEHICLE_ENABLED.CP_t());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public CP_TV CP_h(PacketReceiveEvent packetReceiveEvent) {
        float f;
        float f2;
        long l;
        block5: {
            float f3;
            block4: {
                l = b ^ 0x79B7F65AB63DL;
                String string = CP_u7.CP_q();
                if (packetReceiveEvent.getPacketType() != CP_nN.STEER_VEHICLE) return null;
                if (this.CP_w.CP_R()) {
                    return null;
                }
                CP_bT ilIlbT = new CP_bT(packetReceiveEvent);
                f2 = Math.abs(ilIlbT.CP_y());
                f = Math.abs(ilIlbT.CP_n());
                float f4 = f2 - 0.98f;
                f3 = f4 == 0.0f ? 0 : (f4 > 0.0f ? 1 : -1);
                if (string != null) break block4;
                if (f3 > 0) break block5;
                float f5 = f - 0.98f;
                f3 = f5 == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1);
            }
            if (f3 <= 0) return null;
        }
        CP_TV ilIlTV = new CP_TV(this, (String)((Object)CP_uQ.a("m", (int)5780, (long)(0x7BE8064EA67AB8F6L ^ l))) + f2 + (String)((Object)CP_uQ.a("m", (int)4211, (long)(0x448D7FE2D9113E10L ^ l))) + f);
        return ilIlTV;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = b ^ 0x7B48EE3A8F34L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "N\u009c\u001c7=O\u00a4cX\u0014P\u0010\u00c9\u009bF\u00ecv-\u00e7\u009b\n\u00ff\u0094\u00e0 ]\n\u00fa\u001d\u009b\n`\t \u00aekB[gH\u000eFA~\u0012;\u00ab\u00ee\u001e\u0011-@x\u00d9\u00cf7\"";
        int n2 = "N\u009c\u001c7=O\u00a4cX\u0014P\u0010\u00c9\u009bF\u00ecv-\u00e7\u009b\n\u00ff\u0094\u00e0 ]\n\u00fa\u001d\u009b\n`\t \u00aekB[gH\u000eFA~\u0012;\u00ab\u00ee\u001e\u0011-@x\u00d9\u00cf7\"".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_uQ.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x184D;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CP_uQ", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            CP_uQ.e[n2] = CP_uQ.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_uQ.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_uQ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_uQ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
