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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.color.AlphaColor;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_ry
implements NbtCodec<AlphaColor> {
    private static final long a = CP_s.a(-6493228469736637316L, -3521809827968292100L, MethodHandles.lookup().lookupClass()).a(116007550411889L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static final long[] f;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String mHzTuviCOM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_ry() {
    }

    /*
     * Unable to fully structure code
     */
    public AlphaColor CP_U(NBT var1_1, PacketWrapper<?> var2_2) {
        block21: {
            block22: {
                block24: {
                    block25: {
                        block23: {
                            var3_3 = CP_ry.a ^ 41466743394030L;
                            var5_4 = CP_Xv.CP_k();
                            try {
                                v0 = var1_1 instanceof NBTString;
                                if (!var5_4) break block21;
                                if (!v0) break block22;
                            }
                            catch (NumberFormatException v1) {
                                throw CP_ry.a(v1);
                            }
                            var6_5 = ((NBTString)var1_1).getValue();
                            v2 = var6_5.isEmpty();
                            if (!var5_4) break block23;
                            try {
                                block26: {
                                    if (v2 != '\u0000') ** GOTO lbl33
                                    break block26;
                                    catch (NumberFormatException v3) {
                                        throw CP_ry.a(v3);
                                    }
                                }
                                v2 = var6_5.charAt(0);
                            }
                            catch (NumberFormatException v4) {
                                throw CP_ry.a(v4);
                            }
                        }
                        v5 = CP_ry.b("r", (int)18248, (long)(6845914117474932764L ^ var3_3));
                        if (!var5_4) break block24;
                        try {
                            block27: {
                                if (v2 == v5) break block25;
                                break block27;
                                catch (NumberFormatException v6) {
                                    throw CP_ry.a(v6);
                                }
                            }
                            throw new CP_Xv((String)CP_ry.a("g", (int)7556, (long)(8397553706087971154L ^ var3_3)));
                        }
                        catch (NumberFormatException v7) {
                            throw CP_ry.a(v7);
                        }
                    }
                    try {
                        v8 = var6_5;
                        if (var5_4) {
                            v2 = (char)(v8.length() - 1);
                            v5 = CP_ry.b("r", (int)6552, (long)(2349121340298036943L ^ var3_3));
                        }
                        ** GOTO lbl56
                    }
                    catch (NumberFormatException v9) {
                        throw CP_ry.a(v9);
                    }
                }
                try {
                    if (v2 != v5) {
                        throw new CP_Xv((String)CP_ry.a("g", (int)21554, (long)(6043594686603473125L ^ var3_3)) + var6_5);
                    }
                }
                catch (NumberFormatException v10) {
                    throw CP_ry.a(v10);
                }
                try {
                    v8 = var6_5.substring(1);
lbl56:
                    // 2 sources

                    var7_6 = v8;
                    var8_8 = Integer.parseUnsignedInt(var7_6, (int)CP_ry.b("r", (int)13352, (long)(6379457273722579838L ^ var3_3)));
                    return new AlphaColor(var8_8);
                }
                catch (NumberFormatException var7_7) {
                    throw new CP_Xv(var7_7);
                }
            }
            v0 = var1_1 instanceof NBTNumber;
        }
        try {
            if (v0) {
                return new AlphaColor(((NBTNumber)var1_1).getAsInt());
            }
        }
        catch (NumberFormatException v11) {
            throw CP_ry.a(v11);
        }
        return AlphaColor.WHITE;
    }

    public NBT CP_C(PacketWrapper<?> packetWrapper, AlphaColor alphaColor) {
        return new NBTInt(alphaColor.asRGB());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x1D95779A87B2L;
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
        String string = "\u00c5oQ\u00d7\\8\u00fe\u000e\u00fez\u00f1\u00b5\f\u00a6fq\u0092k.\u009b\u0090B\u00ae-P\u001d`QMgT\u00ac\u00faY\u0089\u009fm\u00ef'\u00d4\u00ae\u00c7\u00bf\u000f?\u00d6\u008b\u001a\u0096\u00f0K\u00c6/8\u0002\u00bb\u00dd\u00cd\u00d7\u00fcW\u00ec\u00eam\u00f9\u0001\u0004B\u00c5\u00d0d}8i}\u007f\u001aI\u009c1\\\u00bc\u00ae\u0085X\u00c4\u0018\u008fI\u00f92]\u0010.\u00a4\u0097\u0015\u0099\u00ecw^\u0001?R\u000f\u00e7\u008d\u008bI\u008cb\u00cdR\u00aa-=qQU\u00d5)\u00cdg/p\u0086\u00ef\u00c8\u0015";
        int n2 = "\u00c5oQ\u00d7\\8\u00fe\u000e\u00fez\u00f1\u00b5\f\u00a6fq\u0092k.\u009b\u0090B\u00ae-P\u001d`QMgT\u00ac\u00faY\u0089\u009fm\u00ef'\u00d4\u00ae\u00c7\u00bf\u000f?\u00d6\u008b\u001a\u0096\u00f0K\u00c6/8\u0002\u00bb\u00dd\u00cd\u00d7\u00fcW\u00ec\u00eam\u00f9\u0001\u0004B\u00c5\u00d0d}8i}\u007f\u001aI\u009c1\\\u00bc\u00ae\u0085X\u00c4\u0018\u008fI\u00f92]\u0010.\u00a4\u0097\u0015\u0099\u00ecw^\u0001?R\u000f\u00e7\u008d\u008bI\u008cb\u00cdR\u00aa-=qQU\u00d5)\u00cdg/p\u0086\u00ef\u00c8\u0015".length();
        int n3 = 72;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_ry.a(byArray3).intern();
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
        String string2 = "K&F\u00f8\u00c6Z\u00a0P\u00e5Q?\u00f34kO\u00ce\u0090[\u00e2\u00ff\u00c4%\u009b\u00bf";
        int n7 = "K&F\u00f8\u00c6Z\u00a0P\u00e5Q?\u00f34kO\u00ce\u0090[\u00e2\u00ff\u00c4%\u009b\u00bf".length();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x36E9;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_ry", exception);
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
            CP_ry.d[n2] = CP_ry.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_ry.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_ry" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D68;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_ry", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_ry.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_ry.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_ry" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_ry.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_ry.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

