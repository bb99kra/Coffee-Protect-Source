/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJi
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTE;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

@IlIljl(IlIlJ="Invalid Held Item Change", IlIlM="Checks for invalid held item change packets")
public class IlIluL
extends IlIluV {
    private int IlIlp = -1;
    private int IlIlq = 0;
    private static final long b = IlIls.a((long)-7368137945134703934L, (long)-8945430566045226999L, MethodHandles.lookup().lookupClass()).a(201164618208783L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long g;
    private static final long h;
    private static transient /* synthetic */ String qVZGwyXkfh = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIluL(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_HELD_ITEM_CHANGE_ENABLED.IlIlt());
    }

    @Override
    public IlIlTV IlIlh(PacketReceiveEvent packetReceiveEvent) {
        int n;
        block13: {
            IlIluL ilIluL;
            int n2;
            block14: {
                block12: {
                    IlIluL ilIluL2;
                    block11: {
                        int n3;
                        String string;
                        long l;
                        block10: {
                            block8: {
                                block9: {
                                    block7: {
                                        block6: {
                                            l = b ^ 0x85C3532BB08L;
                                            string = IlIlu7.IlIlq();
                                            if (packetReceiveEvent.getPacketType() != IlIlnN.HELD_ITEM_CHANGE) {
                                                return null;
                                            }
                                            n3 = n2 = new IlIlJi(packetReceiveEvent).IlIlz();
                                            if (string != null) break block6;
                                            if (n3 > (int)g) break block7;
                                            n3 = n2;
                                        }
                                        if (string != null) break block8;
                                        if (n3 >= 0) break block9;
                                    }
                                    return new IlIlTV(this, (String)((Object)IlIluL.a("c", (int)25924, (long)(0x59B4B7063DE021E4L ^ l))) + n2);
                                }
                                n3 = n2;
                            }
                            if (string != null) break block10;
                            if (n3 != this.IlIlp) break block11;
                            ilIluL2 = this;
                            if (string != null) break block12;
                            long l2 = ilIluL2.IlIlw.IlIl_() - h;
                            n3 = l2 == 0L ? 0 : (l2 < 0L ? -1 : 1);
                        }
                        if (n3 <= 0) break block11;
                        IlIluL ilIluL3 = this;
                        ilIluL = ilIluL3;
                        n = ilIluL3.IlIlq;
                        if (string != null) break block13;
                        ilIluL.IlIlq = n + 1;
                        if (n > 1) {
                            return new IlIlTE(this, (String)((Object)IlIluL.a("c", (int)21403, (long)(0x113EDF557624173AL ^ l))) + n2);
                        }
                        break block14;
                    }
                    ilIluL2 = this;
                }
                ilIluL2.IlIlq = 0;
            }
            ilIluL = this;
            n = n2;
        }
        ilIluL.IlIlp = n;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = b ^ 0x2EADF7207BF9L;
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
        String string = "*Q\u0010\u00ac8\u00f6\u0091)\u00a7bV\u001d\u00f9\u00c3\u0003\u001b<l\u00d8\u00d9K\u00b9\u00f3\u001c,\u00dfJcB\u0012\f\u00c1,\u00cdp\u000e1\u00e2<J\u0010pF\u0095\u00dc<u4\u0093\n-\u00b3\u00f5\\\u009b\u0013\u00fd";
        int n2 = "*Q\u0010\u00ac8\u00f6\u0091)\u00a7bV\u001d\u00f9\u00c3\u0003\u001b<l\u00d8\u00d9K\u00b9\u00f3\u001c,\u00dfJcB\u0012\f\u00c1,\u00cdp\u000e1\u00e2<J\u0010pF\u0095\u00dc<u4\u0093\n-\u00b3\u00f5\\\u009b\u0013\u00fd".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIluL.b(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        d = stringArray;
        e = new String[2];
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
        long l2 = 6775202927226467530L;
        byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
        g = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
        Cipher cipher3 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory3 = SecretKeyFactory.getInstance("DES");
        byte[] byArray7 = new byte[8];
        byte[] byArray8 = byArray7;
        byArray7[0] = (byte)(l >>> 56);
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher3.init(2, (Key)secretKeyFactory3.generateSecret(new DESKeySpec(byArray8)), new IvParameterSpec(new byte[8]));
                long l3 = 5631427211665299488L;
                byte[] byArray9 = cipher3.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
                h = ((long)byArray9[0] & 0xFFL) << 56 | ((long)byArray9[1] & 0xFFL) << 48 | ((long)byArray9[2] & 0xFFL) << 40 | ((long)byArray9[3] & 0xFFL) << 32 | ((long)byArray9[4] & 0xFFL) << 24 | ((long)byArray9[5] & 0xFFL) << 16 | ((long)byArray9[6] & 0xFFL) << 8 | (long)byArray9[7] & 0xFFL;
                return;
            }
            byArray8 = byArray8;
            byArray8[n6] = (byte)(l << n6 * 8 >>> 56);
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x728E;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIluL", exception);
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
            IlIluL.e[n2] = IlIluL.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIluL.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIluL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIluL.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

