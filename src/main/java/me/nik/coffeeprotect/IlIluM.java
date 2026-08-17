/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlTN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlvP
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
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.IlIlyR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIloL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlTN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlvP;

@IlIljl(IlIlJ="Invalid Settings", IlIlM="Checks for invalid settings packets")
public class IlIluM
extends IlIluV {
    private static final Pattern IlIlu;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long g;
    private static transient /* synthetic */ String TWYnruADCo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIluM(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_SETTINGS_ENABLED.IlIlt());
    }

    @Override
    public IlIlTV IlIlh(PacketReceiveEvent packetReceiveEvent) {
        block12: {
            int n;
            IlIlvP ilIlvP;
            long l;
            block18: {
                int n2;
                block16: {
                    block17: {
                        String string;
                        String string2;
                        block15: {
                            block14: {
                                String string3;
                                IlIlTN ilIlTN;
                                block13: {
                                    block11: {
                                        IlIloL ilIloL;
                                        block10: {
                                            l = b ^ 0x54410C2C368L;
                                            string2 = IlIlu7.IlIlq();
                                            ilIloL = packetReceiveEvent.getPacketType();
                                            if (string2 != null) break block10;
                                            if (ilIloL == IlIlqy.CLIENT_SETTINGS) break block11;
                                            ilIloL = packetReceiveEvent.getPacketType();
                                        }
                                        if (ilIloL != IlIlnN.CLIENT_SETTINGS) break block12;
                                    }
                                    ilIlvP = new IlIlvP(packetReceiveEvent);
                                    string = ilIlvP.IlIlO();
                                    ilIlTN = ilIlvP.IlIlS();
                                    string3 = string;
                                    if (string2 != null) break block13;
                                    if (string3 == null) break block14;
                                    string3 = string;
                                }
                                if (!string3.isEmpty() && ilIlTN != null) break block15;
                            }
                            return new IlIlTV(this, (String)((Object)IlIluM.a("e", (int)3397, (long)(0x1D6EA5FF3E506C8FL ^ l))));
                        }
                        int n3 = IlIlyR.IlIlr(string, (int)g);
                        if (string2 == null) {
                            if (n3 != 0) {
                                return new IlIlTV(this, (String)((Object)IlIluM.a("e", (int)23038, (long)(0x1FFD8E8360613835L ^ l))));
                            }
                            n3 = IlIlu.matcher(string).matches();
                        }
                        if (string2 == null) {
                            if (n3 != 0) {
                                return new IlIlTV(this, (String)((Object)IlIluM.a("e", (int)21855, (long)(0x7C53F9065D933493L ^ l))));
                            }
                            n3 = ilIlvP.IlIlH();
                        }
                        n2 = n = n3;
                        if (string2 != null) break block16;
                        if (n2 >= 2) break block17;
                        n2 = this.IlIlw.IlIlR() ? 1 : 0;
                        if (string2 != null) break block16;
                        if (n2 == 0) break block18;
                    }
                    n2 = IlIlyR.IlIlj(n) ? 1 : 0;
                }
                if (n2 == 0) break block12;
            }
            ilIlvP.IlIlD(2);
            packetReceiveEvent.markForReEncode(true);
            return new IlIlTV(this, (String)((Object)IlIluM.a("e", (int)8650, (long)(0x4B8C1F826BFE4003L ^ l))) + n);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    IlIluM.b = IlIls.a((long)3100142948036532319L, (long)-3666744445023281680L, MethodHandles.lookup().lookupClass()).a(137510928854740L);
                    var14 = IlIluM.b ^ 92243842528050L;
                    IlIluM.f = new HashMap<K, V>(13);
                    var5_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var6_2 = 1; var6_2 < 8; ++var6_2) {
                        v2 = v2;
                        v2[var6_2] = (byte)(var14 << var6_2 * 8 >>> 56);
                    }
                    var5_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var12_3 = new String[5];
                    var10_4 = 0;
                    var9_5 = "\u00b2O\u000e\u00fc\u00cb\u008d6\u00e4\n\u00de,\u000f\u001e\u0004\u00f1Q \u009b}\u00a3c\u009dR\u0098\u00b7\u0091\u001c.\u000f\u00b5|K6F\u00ad:U\u0083\u0003\u0013\u00e7ViEi\u00f4\u00b5\u00ae\u00f80\u0085\u00e0\u00d1\u00de\u0090\u00c4\u0017b\u00c9\u00a0\u00a4!\u00b3.z\u0082\u00a48\u00e3\u00a8\u00dfK0\u00b2\u00f8\u00f1G\u00954\u00f1\u00fby\u0087\u009f\u0092\u00de\u00a7\u00b8\u0016\u00cb\u00c91M\u0011vD0\u00cc";
                    var11_6 = "\u00b2O\u000e\u00fc\u00cb\u008d6\u00e4\n\u00de,\u000f\u001e\u0004\u00f1Q \u009b}\u00a3c\u009dR\u0098\u00b7\u0091\u001c.\u000f\u00b5|K6F\u00ad:U\u0083\u0003\u0013\u00e7ViEi\u00f4\u00b5\u00ae\u00f80\u0085\u00e0\u00d1\u00de\u0090\u00c4\u0017b\u00c9\u00a0\u00a4!\u00b3.z\u0082\u00a48\u00e3\u00a8\u00dfK0\u00b2\u00f8\u00f1G\u00954\u00f1\u00fby\u0087\u009f\u0092\u00de\u00a7\u00b8\u0016\u00cb\u00c91M\u0011vD0\u00cc".length();
                    var8_7 = 16;
                    var7_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var7_8;
                        v4 = var9_5.substring(v3, v3 + var8_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var12_3[var10_4++] = IlIluM.b(var13_9).intern();
                        if ((var7_8 += var8_7) < var11_6) {
                            var8_7 = var9_5.charAt(var7_8);
                            ** continue;
                        }
                        var9_5 = "M\u0007W\u00bd\u00bb\u00ce\n\u00b3\u00e8\u009f\u00baH\u0018(\u008a\u0096\u0087\u00d4Qp\u00f0k\u00b1s4\u00a9E\u00a3C\u0007J@(=\u00a2\u00fe\u0090\u00f3\u00b6\u00f9\u00dc\n\u001d\u00da5\u0091\u00d9ES\u009c\u00e3\u00ae\u0096\u00c9\r\u0095:k\u00b5s\u00ae\u00a7%\u00de\n\b\u00f7Nm\u00c6\u00e1v\u00d6";
                        var11_6 = "M\u0007W\u00bd\u00bb\u00ce\n\u00b3\u00e8\u009f\u00baH\u0018(\u008a\u0096\u0087\u00d4Qp\u00f0k\u00b1s4\u00a9E\u00a3C\u0007J@(=\u00a2\u00fe\u0090\u00f3\u00b6\u00f9\u00dc\n\u001d\u00da5\u0091\u00d9ES\u009c\u00e3\u00ae\u0096\u00c9\r\u0095:k\u00b5s\u00ae\u00a7%\u00de\n\b\u00f7Nm\u00c6\u00e1v\u00d6".length();
                        var8_7 = 32;
                        var7_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var7_8;
                            v4 = var9_5.substring(v6, v6 + var8_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var12_3[var10_4++] = IlIluM.b(var13_9).intern();
                        if ((var7_8 += var8_7) < var11_6) {
                            var8_7 = var9_5.charAt(var7_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var13_9 = var5_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl51:
                    // 1 sources

                    ** continue;
                }
            }
            IlIluM.d = var12_3;
            IlIluM.e = new String[5];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var14 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 1106753763633835778L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        IlIluM.g = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        IlIluM.IlIlu = Pattern.compile((String)IlIluM.a("e", (int)11444, (long)(1143483078162644262L ^ var14)));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x57E7;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIluM", exception);
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
            IlIluM.e[n2] = IlIluM.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIluM.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIluM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIluM.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

