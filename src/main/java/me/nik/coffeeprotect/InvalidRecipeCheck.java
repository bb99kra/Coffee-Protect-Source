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
import me.nik.coffeeprotect.CP_TE;
import me.nik.coffeeprotect.UserData;
import me.nik.coffeeprotect.CheckResult;
import me.nik.coffeeprotect.CheckInfo;
import me.nik.coffeeprotect.InvalidPositionCheck;
import me.nik.coffeeprotect.Check;
import me.nik.coffeeprotect.CP_yR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_jZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_b4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

@CheckInfo(CP_J="Invalid Recipe", CP_M="Checks for invalid recipe packets")
public class InvalidRecipeCheck
extends Check {
    private long CP_V;
    private long CP_z;
    private static final long b = CP_s.a(-4324004807210928911L, 540211067550933592L, MethodHandles.lookup().lookupClass()).a(22151571401926L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long g;
    private static transient /* synthetic */ String JyZGZBNAvG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public InvalidRecipeCheck(UserData ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_RECIPE_ENABLED.CP_t());
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public CheckResult CP_h(PacketReceiveEvent packetReceiveEvent) {
        long l;
        block18: {
            InvalidRecipeCheck ilIlu4;
            long l2;
            block19: {
                block17: {
                    long l3;
                    long l4;
                    block16: {
                        PacketReceiveEvent packetReceiveEvent2;
                        String string;
                        block15: {
                            CP_nN ilIlnN;
                            CP_oL ilIloL;
                            block11: {
                                block12: {
                                    int n;
                                    block14: {
                                        int n2;
                                        block13: {
                                            CP_jZ ilIljZ;
                                            l4 = b ^ 0x32863A99C4BL;
                                            string = InvalidPositionCheck.CP_q();
                                            ilIloL = packetReceiveEvent.getPacketType();
                                            ilIlnN = CP_nN.SET_DISPLAYED_RECIPE;
                                            if (string != null) break block11;
                                            if (ilIloL != ilIlnN) break block12;
                                            CP_b4 ilIlb4 = new CP_b4(packetReceiveEvent);
                                            CP_jZ ilIljZ2 = ilIljZ = ilIlb4.CP_K();
                                            if (string == null) {
                                                if (ilIljZ2 == null) {
                                                    return null;
                                                }
                                                ilIljZ2 = ilIljZ;
                                            }
                                            n2 = n = ilIljZ2.CP_h();
                                            if (string != null) break block13;
                                            if (n2 < 0) break block14;
                                            n2 = CP_yR.CP_j(n) ? 1 : 0;
                                        }
                                        if (n2 == 0) return null;
                                    }
                                    CheckResult ilIlTV = new CheckResult(this, (String)((Object)InvalidRecipeCheck.a("c", (int)9680, (long)(0x1EAF48972E5E1049L ^ l4))) + n);
                                    return ilIlTV;
                                }
                                packetReceiveEvent2 = packetReceiveEvent;
                                if (string != null) break block15;
                                ilIloL = packetReceiveEvent2.getPacketType();
                                ilIlnN = CP_nN.CRAFT_RECIPE_REQUEST;
                            }
                            if (ilIloL != ilIlnN) return null;
                            packetReceiveEvent2 = packetReceiveEvent;
                        }
                        l2 = packetReceiveEvent2.CP_O();
                        long l5 = l2 - this.CP_V - 0L;
                        l3 = l5 == 0L ? 0 : (l5 < 0L ? -1 : 1);
                        if (string != null) break block16;
                        if (l3 != false) break block17;
                        InvalidRecipeCheck ilIlu42 = this;
                        ilIlu4 = ilIlu42;
                        l = ilIlu42.CP_z;
                        if (string != null) break block18;
                        ilIlu4.CP_z = l + 1L;
                        long l6 = l - g;
                        l3 = l6 == 0L ? 0 : (l6 < 0L ? -1 : 1);
                    }
                    if (l3 > 0) {
                        return new CP_TE(this, (String)((Object)InvalidRecipeCheck.a("c", (int)8704, (long)(0x4251ABFC4C3D9798L ^ l4))));
                    }
                    break block19;
                }
                this.CP_z = Math.max(0L, this.CP_z - 1L);
            }
            ilIlu4 = this;
            l = l2;
        }
        ilIlu4.CP_V = l;
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = b ^ 0x246229A87635L;
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
        String string = "\u00ab)\u00a7f\u0093\u001d\u0097\u00f9\u00a5S\u00f8A\u00b0\u00e7\b(\u0080\u00a9\u0007A5\u00a3\u00c7\u00ba;\u008dRB\u00f1\u000f\u00f3J\u0010G\u00d8\u000ek\u008bQ4\u00b4\u00ee\u00a1\u00dc\u008e\u00aa\u0082U\u00c2";
        int n2 = "\u00ab)\u00a7f\u0093\u001d\u0097\u00f9\u00a5S\u00f8A\u00b0\u00e7\b(\u0080\u00a9\u0007A5\u00a3\u00c7\u00ba;\u008dRB\u00f1\u000f\u00f3J\u0010G\u00d8\u000ek\u008bQ4\u00b4\u00ee\u00a1\u00dc\u008e\u00aa\u0082U\u00c2".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = InvalidRecipeCheck.b(byArray3).intern();
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
        int n6 = 1;
        while (true) {
            if (n6 >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 7829517012485339910L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3B7;
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
                throw new RuntimeException("me/nik/coffeeprotect/InvalidRecipeCheck", exception);
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
            InvalidRecipeCheck.e[n2] = InvalidRecipeCheck.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = InvalidRecipeCheck.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/InvalidRecipeCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InvalidRecipeCheck.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
