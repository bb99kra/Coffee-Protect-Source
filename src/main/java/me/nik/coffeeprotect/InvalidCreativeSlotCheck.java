/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.GameMode
 *  org.bukkit.entity.Player
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
import me.nik.coffeeprotect.CP_TE;
import me.nik.coffeeprotect.UserData;
import me.nik.coffeeprotect.CheckResult;
import me.nik.coffeeprotect.CheckInfo;
import me.nik.coffeeprotect.InvalidPositionCheck;
import me.nik.coffeeprotect.Check;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

@CheckInfo(CP_J="Invalid Creative Slot", CP_M="Checks for invalid creative slot packets")
public class InvalidCreativeSlotCheck
extends Check {
    private static final long b = CP_s.a(2642267270536832029L, -5395196143836573459L, MethodHandles.lookup().lookupClass()).a(189415754874378L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static transient /* synthetic */ String uDwwKLfCBM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public InvalidCreativeSlotCheck(UserData ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_CREATIVE_SLOT_ENABLED.CP_t());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public CheckResult CP_h(PacketReceiveEvent packetReceiveEvent) {
        int n;
        long l;
        block9: {
            Object object;
            int n2;
            String string;
            block7: {
                block8: {
                    l = b ^ 0x6170F223DE25L;
                    string = InvalidPositionCheck.CP_q();
                    CP_oL ilIloL = packetReceiveEvent.getPacketType();
                    if (string == null) {
                        if (ilIloL != CP_nN.CREATIVE_INVENTORY_ACTION) {
                            return null;
                        }
                        ilIloL = packetReceiveEvent.getPlayer();
                    }
                    if (((Player)ilIloL).getGameMode() != GameMode.CREATIVE) {
                        return new CP_TE(this, (String)((Object)InvalidCreativeSlotCheck.a("o", (int)1102, (long)(0x32B3E2D630F59703L ^ l))));
                    }
                    CP_JZ ilIlJZ = new CP_JZ(packetReceiveEvent);
                    n2 = n = ilIlJZ.CP_q();
                    object = InvalidCreativeSlotCheck.b("c", (int)24987, (long)(0x2939BE70828A8E16L ^ l));
                    if (string != null) break block7;
                    if (n2 < object) break block8;
                    n2 = n;
                    object = InvalidCreativeSlotCheck.b("c", (int)21405, (long)(0x6E9E701E0E7FBC13L ^ l));
                    if (string != null) break block7;
                    if (n2 != object) break block9;
                }
                n2 = n;
                object = -1;
            }
            if (string == null) {
                if (n2 >= object) return null;
                n2 = n;
                object = InvalidCreativeSlotCheck.b("c", (int)24709, (long)(0xBA84EE6EE4F0F0AL ^ l));
            }
            if (n2 == object) return null;
        }
        CheckResult ilIlTV = new CheckResult(this, (String)((Object)InvalidCreativeSlotCheck.a("o", (int)7443, (long)(0x70861122BF970E5FL ^ l))) + n);
        return ilIlTV;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = b ^ 0xFA6AAB7630CL;
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
        String string = "\u0019l\u0005u\u0010'I\u00daX\u00f4\u00b8G\u00bdwY\u00af\u00c2?\u00e9b\u0080\u00e8jJ\u00c5\u0018>y\u001f\u00d6d\u0018'\u00beSB3p\u00d3\u00c4\u0010\u00aa;\f\u00d8\u0098\u0000\u007f\u0014\u0095v\u00d9\u00ae\u0017\u00c7\u0004*";
        int n2 = "\u0019l\u0005u\u0010'I\u00daX\u00f4\u00b8G\u00bdwY\u00af\u00c2?\u00e9b\u0080\u00e8jJ\u00c5\u0018>y\u001f\u00d6d\u0018'\u00beSB3p\u00d3\u00c4\u0010\u00aa;\f\u00d8\u0098\u0000\u007f\u0014\u0095v\u00d9\u00ae\u0017\u00c7\u0004*".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = InvalidCreativeSlotCheck.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        d = stringArray;
        e = new String[2];
        i = new HashMap(13);
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
        int n6 = 0;
        String string2 = "M\u00e8:+\u0013 \u001bP>k\u00d8\u0012\u00f1R\u00e3\u00ad\u00f0\u00a2|\u00fb\u00dd\u00cb\u00ed,";
        int n7 = "M\u00e8:+\u0013 \u001bP>k\u00d8\u0012\u00f1R\u00e3\u00ad\u00f0\u00a2|\u00fb\u00dd\u00cb\u00ed,".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        g = lArray;
        h = new Integer[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2562;
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
                throw new RuntimeException("me/nik/coffeeprotect/InvalidCreativeSlotCheck", exception);
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
            InvalidCreativeSlotCheck.e[n2] = InvalidCreativeSlotCheck.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = InvalidCreativeSlotCheck.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/InvalidCreativeSlotCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x59A0;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/InvalidCreativeSlotCheck", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            InvalidCreativeSlotCheck.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = InvalidCreativeSlotCheck.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/InvalidCreativeSlotCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InvalidCreativeSlotCheck.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(InvalidCreativeSlotCheck.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
