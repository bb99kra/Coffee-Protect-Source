/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.color.CP_rI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_Zs
implements NbtCodec<CP_rI> {
    private static final long a = CP_s.a(3882199609411324649L, -2518443350845580775L, MethodHandles.lookup().lookupClass()).a(279048465583882L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String ClHqeuvbgi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_Zs() {
    }

    /*
     * Unable to fully structure code
     */
    public CP_rI CP_J(NBT var1_1, PacketWrapper<?> var2_2) {
        block21: {
            block22: {
                block24: {
                    block25: {
                        block23: {
                            var3_3 = CP_Zs.a ^ 44589439144188L;
                            var5_4 = CP_Xv.CP_k();
                            try {
                                v0 = var1_1 instanceof NBTString;
                                if (!var5_4) break block21;
                                if (!v0) break block22;
                            }
                            catch (NumberFormatException v1) {
                                throw CP_Zs.a(v1);
                            }
                            var6_5 = ((NBTString)var1_1).getValue();
                            v2 = var6_5.isEmpty();
                            if (!var5_4) break block23;
                            try {
                                block26: {
                                    if (v2 != '\u0000') ** GOTO lbl33
                                    break block26;
                                    catch (NumberFormatException v3) {
                                        throw CP_Zs.a(v3);
                                    }
                                }
                                v2 = var6_5.charAt(0);
                            }
                            catch (NumberFormatException v4) {
                                throw CP_Zs.a(v4);
                            }
                        }
                        v5 = CP_Zs.b("z", (int)11083, (long)(1337647592161791074L ^ var3_3));
                        if (!var5_4) break block24;
                        try {
                            block27: {
                                if (v2 == v5) break block25;
                                break block27;
                                catch (NumberFormatException v6) {
                                    throw CP_Zs.a(v6);
                                }
                            }
                            throw new CP_Xv((String)CP_Zs.a("y", (int)18856, (long)(7359881364588406436L ^ var3_3)));
                        }
                        catch (NumberFormatException v7) {
                            throw CP_Zs.a(v7);
                        }
                    }
                    try {
                        v8 = var6_5;
                        if (var5_4) {
                            v2 = (char)(v8.length() - 1);
                            v5 = CP_Zs.b("z", (int)1263, (long)(5437920304014058437L ^ var3_3));
                        }
                        ** GOTO lbl56
                    }
                    catch (NumberFormatException v9) {
                        throw CP_Zs.a(v9);
                    }
                }
                try {
                    if (v2 != v5) {
                        throw new CP_Xv((String)CP_Zs.a("y", (int)32201, (long)(1119589557779600068L ^ var3_3)) + var6_5);
                    }
                }
                catch (NumberFormatException v10) {
                    throw CP_Zs.a(v10);
                }
                try {
                    v8 = var6_5.substring(1);
lbl56:
                    // 2 sources

                    var7_6 = v8;
                    var8_8 = Integer.parseInt(var7_6, (int)CP_Zs.b("z", (int)10117, (long)(1996512060957900973L ^ var3_3)));
                    return new CP_rI(var8_8);
                }
                catch (NumberFormatException var7_7) {
                    throw new CP_Xv(var7_7);
                }
            }
            v0 = var1_1 instanceof NBTNumber;
        }
        try {
            if (v0) {
                return new CP_rI(((NBTNumber)var1_1).getAsInt());
            }
        }
        catch (NumberFormatException v11) {
            throw CP_Zs.a(v11);
        }
        return CP_rI.CP_S;
    }

    public NBT CP_e(PacketWrapper<?> packetWrapper, CP_rI ilIlrI) {
        return new NBTInt(ilIlrI.asRGB());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x275417FBCAC0L;
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
        String string = "\u00bf\u00e4\u0002\u001b\u00fe\"\u0088\u00afg\u00c2\u00d9\u008c\u00c5\u000b\u0012\u0007+\u009a\u0012\u0015/\u0017t\u00a6\u00cc\u00d4)\u0086M\u00ff\u0007Z4\u00d0\u00b4\u00f7\u00838\u00f90\u00b9F\u0001g\u0083\u0091H+\u00dd\u009d\r\u0003\u00fd\u00eb\u00e13\u00efmc\u00c6\u0004x\u008b\u00b0\u00b0\u00d8Dl\u008e^\u001b\u00b08\u0080\u009c4\t\u00dd\u00c1\u0090\u000f\u009a\u0095\u00ee)GM\u00d9x>_\u00b4V\u00fd\u00be\u00bd'F\u00d3t\u0091T\u00e9\u00f7\u00c9\u00ad\u00a9\u00d6\u00e5~J\b^9\u00f4.\u00ef2L~?4\u0016\u00d8\u00e9,uKE";
        int n2 = "\u00bf\u00e4\u0002\u001b\u00fe\"\u0088\u00afg\u00c2\u00d9\u008c\u00c5\u000b\u0012\u0007+\u009a\u0012\u0015/\u0017t\u00a6\u00cc\u00d4)\u0086M\u00ff\u0007Z4\u00d0\u00b4\u00f7\u00838\u00f90\u00b9F\u0001g\u0083\u0091H+\u00dd\u009d\r\u0003\u00fd\u00eb\u00e13\u00efmc\u00c6\u0004x\u008b\u00b0\u00b0\u00d8Dl\u008e^\u001b\u00b08\u0080\u009c4\t\u00dd\u00c1\u0090\u000f\u009a\u0095\u00ee)GM\u00d9x>_\u00b4V\u00fd\u00be\u00bd'F\u00d3t\u0091T\u00e9\u00f7\u00c9\u00ad\u00a9\u00d6\u00e5~J\b^9\u00f4.\u00ef2L~?4\u0016\u00d8\u00e9,uKE".length();
        int n3 = 72;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Zs.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        c = stringArray;
        d = new String[2];
        h = new HashMap(13);
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
        String string2 = "be8\u00d1\u00e8X\u00e6\u00b6Z-\u00c4O<\u000b\u00fc\u0013\u007f\u00db\u008f\u00d7\u0092\u00a9\u00e9\u0003";
        int n7 = "be8\u00d1\u00e8X\u00e6\u00b6Z-\u00c4O<\u000b\u00fc\u0013\u007f\u00db\u008f\u00d7\u0092\u00a9\u00e9\u0003".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        f = lArray;
        g = new Integer[3];
    }

    private static NumberFormatException a(NumberFormatException numberFormatException) {
        return numberFormatException;
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x57A;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_Zs", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            CP_Zs.d[n2] = CP_Zs.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Zs.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_Zs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xD5F;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_Zs", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Zs.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Zs.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_Zs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Zs.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Zs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

