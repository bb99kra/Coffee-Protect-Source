/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlDq
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJK
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJp
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbF
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlZl;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlAG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlWz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlDq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.entity.Player;

public class IlIlPW
extends IlIlPw {
    private final CoffeeProtect IlIle;
    private static final long a = IlIls.a((long)-7727497895276768812L, (long)-3528345259117305771L, MethodHandles.lookup().lookupClass()).a(268858867662618L);
    private static final String b;
    private static final long[] c;
    private static final Long[] d;
    private static final Map e;
    private static transient /* synthetic */ String CeMttCIMOK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlPW(CoffeeProtect coffeeProtect) {
        super(IlIldF.MONITOR);
        this.IlIle = coffeeProtect;
    }

    public void IlIlP(PacketReceiveEvent packetReceiveEvent) {
        block15: {
            IlIlZl ilIlZl;
            long l;
            block16: {
                long l2;
                block20: {
                    String[] stringArray;
                    block19: {
                        Object object;
                        long l3;
                        block18: {
                            block17: {
                                block13: {
                                    block14: {
                                        IlIloL ilIloL;
                                        block11: {
                                            block12: {
                                                PacketReceiveEvent packetReceiveEvent2;
                                                block9: {
                                                    block10: {
                                                        block7: {
                                                            block8: {
                                                                Object object2;
                                                                block6: {
                                                                    l3 = a ^ 0x4CF924A312F5L;
                                                                    stringArray = IlIlZl.IlIlv();
                                                                    object2 = packetReceiveEvent.getUser();
                                                                    if (stringArray == null) break block6;
                                                                    if (object2 == null) break block7;
                                                                    packetReceiveEvent2 = packetReceiveEvent;
                                                                    if (stringArray == null) break block8;
                                                                    object2 = packetReceiveEvent2.getPlayer();
                                                                }
                                                                if (object2 == null) break block7;
                                                                packetReceiveEvent2 = packetReceiveEvent;
                                                            }
                                                            if (stringArray == null) break block9;
                                                            if (!packetReceiveEvent2.isCancelled()) break block10;
                                                        }
                                                        return;
                                                    }
                                                    packetReceiveEvent2 = packetReceiveEvent;
                                                }
                                                ilIloL = packetReceiveEvent2.getPacketType();
                                                if (stringArray == null) break block11;
                                                if (ilIloL != IlIlnN.KEEP_ALIVE) break block12;
                                                object = new IlIlbF(packetReceiveEvent);
                                                l = object.IlIls();
                                                if (stringArray != null) break block13;
                                            }
                                            ilIloL = packetReceiveEvent.getPacketType();
                                        }
                                        if (ilIloL != IlIlqy.KEEP_ALIVE) break block14;
                                        object = new IlIlJp(packetReceiveEvent);
                                        l = object.IlIla();
                                        if (stringArray != null) break block13;
                                    }
                                    return;
                                }
                                object = this.IlIle.IlIlF().IlIlR((Player)packetReceiveEvent.getPlayer());
                                ilIlZl = ((IlIlTM)object).IlIlp();
                                long l4 = ilIlZl.IlIlR();
                                if (stringArray == null) break block15;
                                if (l != l4) break block16;
                                ilIlZl.IlIld(Math.min(packetReceiveEvent.IlIlO() - ilIlZl.IlIlJ(), (long)IlIlPW.a("l", (int)25639, (long)(0x644EBB7047862442L ^ l3))));
                                long l5 = ilIlZl.IlIlK();
                                if (stringArray == null) break block15;
                                if (!IlIlOq.DISABLE_INVALID_KEEPALIVES.IlIlt()) break block16;
                                l2 = l == l5 ? 0 : (l < l5 ? -1 : 1);
                                if (stringArray == null) break block17;
                                if (l2 != false) break block16;
                                long l6 = l5 - 1L;
                                l2 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                            }
                            if (stringArray == null) break block18;
                            if (l2 == false) break block16;
                            l2 = (long)((IlIlTM)object).IlIlR();
                        }
                        if (stringArray == null) break block19;
                        if (l2 != false) break block16;
                        long l7 = ((IlIlTM)object).IlIl_() - IlIlPW.a("l", (int)5556, (long)(0x5582234EDDAFD5D0L ^ l3));
                        l2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
                    }
                    if (stringArray == null) break block20;
                    if (l2 <= 0) break block16;
                    l2 = 1;
                }
                String[] stringArray = new String[l2];
                stringArray[0] = b + ((Player)packetReceiveEvent.getPlayer()).getName();
                IlIlrW.IlIlU(stringArray);
                packetReceiveEvent.setCancelled(true);
                return;
            }
            ilIlZl.IlIlB(l);
        }
    }

    public void IlIlb(PacketSendEvent packetSendEvent) {
        long l;
        block11: {
            block12: {
                IlIlDq ilIlDq;
                IlIloL ilIloL;
                String[] stringArray;
                block9: {
                    block10: {
                        PacketSendEvent packetSendEvent2;
                        block7: {
                            block8: {
                                block5: {
                                    block6: {
                                        Object object;
                                        block4: {
                                            long l2 = a ^ 0x78EE353C534FL;
                                            stringArray = IlIlZl.IlIlv();
                                            object = packetSendEvent.getUser();
                                            if (stringArray == null) break block4;
                                            if (object == null) break block5;
                                            packetSendEvent2 = packetSendEvent;
                                            if (stringArray == null) break block6;
                                            object = packetSendEvent2.getPlayer();
                                        }
                                        if (object == null) break block5;
                                        packetSendEvent2 = packetSendEvent;
                                    }
                                    if (stringArray == null) break block7;
                                    if (!packetSendEvent2.isCancelled()) break block8;
                                }
                                return;
                            }
                            packetSendEvent2 = packetSendEvent;
                        }
                        ilIloL = packetSendEvent2.getPacketType();
                        if (stringArray == null) break block9;
                        if (ilIloL != IlIlAG.KEEP_ALIVE) break block10;
                        ilIlDq = new IlIlDq(packetSendEvent);
                        l = ilIlDq.IlIlT();
                        if (stringArray != null) break block11;
                    }
                    ilIloL = packetSendEvent.getPacketType();
                }
                if (ilIloL != IlIlWz.KEEP_ALIVE) break block12;
                ilIlDq = new IlIlJK(packetSendEvent);
                l = ilIlDq.IlIlF();
                if (stringArray != null) break block11;
            }
            return;
        }
        this.IlIle.IlIlF().IlIlR((Player)packetSendEvent.getPlayer()).IlIlp().IlIlY(l);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x60A49CC21162L;
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
        byte[] byArray3 = cipher.doFinal("Z/\u0086\u0005\t\u00fcl\u00f4Q\u009f\u00fa/\u008c\u00af\u00a8^d\u00f6U\u00fbfG5\u00c8\u00b0L\u0099DH\u0080v\u00997\u00fe\u00e9\u00d9\u00b3\u008dIA\u00aev\u0005}\u00ecU\u00b8j".getBytes("ISO-8859-1"));
        b = IlIlPW.a(byArray3).intern();
        e = new HashMap(13);
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
        String string = "\u00bc\u00c97\u00038\u00ac\u0003S\u001f)\u008b\u00c3I\u00ab\u00ca\u00a9";
        int n2 = "\u00bc\u00c97\u00038\u00ac\u0003S\u001f)\u008b\u00c3I\u00ab\u00ca\u00a9".length();
        int n3 = 0;
        do {
            byte[] byArray6 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n3 < n2);
        c = lArray;
        d = new Long[2];
    }

    private static String a(byte[] byArray) {
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

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1688;
        if (d[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])e.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlPW", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlPW.d[n2] = l4;
        }
        return d[n2];
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlPW.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlPW" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlPW.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

