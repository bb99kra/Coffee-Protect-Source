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
import me.nik.coffeeprotect.CP_yR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Xk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

@CP_jl(CP_J="Invalid Entity Action", CP_M="Checks for invalid entity action packets")
public class CP_uS
extends CP_uV {
    private static final long b = CP_s.a(-569966877609784198L, -6323825790106249863L, MethodHandles.lookup().lookupClass()).a(211685651959787L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long g;
    private static transient /* synthetic */ String yWHsXUethA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_uS(CP_TM ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_ENTITY_ACTION_ENABLED.CP_t());
    }

    @Override
    public CP_TV CP_h(PacketReceiveEvent packetReceiveEvent) {
        long l = b ^ 0x2F5C60800EA8L;
        String string = CP_u7.CP_q();
        if (packetReceiveEvent.getPacketType() != CP_nN.ENTITY_ACTION) {
            return null;
        }
        CP_JH ilIlJH = new CP_JH(packetReceiveEvent);
        CP_Xk ilIlXk = ilIlJH.CP_l();
        int n = ilIlJH.CP_U();
        int n2 = ilIlJH.CP_d();
        int n3 = Math.abs(n);
        if (string == null) {
            if (n3 > (int)g) {
                return new CP_TV(this, (String)((Object)CP_uS.a("k", (int)16196, (long)(0xAA80A8653719A15L ^ l))) + n);
            }
            n3 = CP_yR.CP_j(n2) ? 1 : 0;
        }
        if (n3 != 0) {
            return new CP_TV(this, (String)((Object)CP_uS.a("k", (int)30138, (long)(0x28F5DA68115650E8L ^ l))));
        }
        if (ilIlXk != CP_Xk.START_JUMPING_WITH_HORSE && n != 0) {
            return new CP_TV(this, (String)((Object)CP_uS.a("k", (int)26603, (long)(0x62B56F5E7E44C2B8L ^ l))));
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = b ^ 0x43DC291C5896L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u0019Nu'7\u0083\u00ab\u00a8)\u0012k#\u00ad!\u0095\u00c4\u00d0\u000eL\u00b2\u00dd\u00ec\u001c\u00b1\u0088G\u001f\u0001x\u0096O\u00b7(1\u008a\u0006\u00c5fg\u00f4\u00b8\u0096\u00ae\u00ac;\u00a5\f\u00c7\u00c3\u0085\u001f_\u007f\u0016P\u00aa\u0089_m\u0098-\u0016\u0016\u008aIV@R\u00e6\u00ba.\u009c\u008f(\u0090\u00f2E\u00da\u0094\u00a4\u00f3\u00acY\u008a1:\u00e8_\u00b4\u00b3z\u00ab\u001a\u00e2\u00abe\u0000\u00f6J\u0096\u00e6qHj\u0099q\u000eP\u00ba\u0011n5\u00fb.";
        int n2 = "\u0019Nu'7\u0083\u00ab\u00a8)\u0012k#\u00ad!\u0095\u00c4\u00d0\u000eL\u00b2\u00dd\u00ec\u001c\u00b1\u0088G\u001f\u0001x\u0096O\u00b7(1\u008a\u0006\u00c5fg\u00f4\u00b8\u0096\u00ae\u00ac;\u00a5\f\u00c7\u00c3\u0085\u001f_\u007f\u0016P\u00aa\u0089_m\u0098-\u0016\u0016\u008aIV@R\u00e6\u00ba.\u009c\u008f(\u0090\u00f2E\u00da\u0094\u00a4\u00f3\u00acY\u008a1:\u00e8_\u00b4\u00b3z\u00ab\u001a\u00e2\u00abe\u0000\u00f6J\u0096\u00e6qHj\u0099q\u000eP\u00ba\u0011n5\u00fb.".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_uS.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        d = stringArray;
        e = new String[3];
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 3529985044909799406L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                g = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n6] = (byte)(l << n6 * 8 >>> 56);
            ++n6;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x137C;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_uS", exception);
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
            CP_uS.e[n2] = CP_uS.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_uS.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_uS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_uS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
