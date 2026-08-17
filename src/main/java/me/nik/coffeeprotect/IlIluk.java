/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJh
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlLi;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTE;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIlik;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.IlIlyR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

@IlIljl(IlIlJ="Invalid Chat", IlIlM="Checks for invalid chat messages")
public class IlIluk
extends IlIluV {
    private static final String[] IlIlF;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static transient /* synthetic */ String MPHkOJopGI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIluk(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_CHAT_ENABLED.IlIlt());
    }

    private static void IlIli(PacketReceiveEvent packetReceiveEvent) {
        block2: {
            block3: {
                long l = b ^ 0x2C47AAFEE1C4L;
                String string = IlIlu7.IlIlq();
                if (!IlIlOq.CHECKS_INVALID_CHAT_FIX_MESSAGES.IlIlt() || packetReceiveEvent.getPacketType() != IlIlnN.CHAT_MESSAGE) break block2;
                IlIlJh ilIlJh = new IlIlJh(packetReceiveEvent);
                String string2 = ilIlJh.IlIlL();
                String string3 = IlIlLi.IlIlQ(ilIlJh.IlIlL());
                if (string != null) break block3;
                if (string2.equals(string3)) break block2;
                ilIlJh.IlIlD(string3);
            }
            packetReceiveEvent.markForReEncode(true);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public IlIlTV IlIlh(PacketReceiveEvent var1_1) {
        block14: {
            var2_2 = IlIluk.b ^ 43379544535863L;
            var4_3 = IlIlu7.IlIlq();
            v0 = var1_1.getPacketType() instanceof IlIlnN;
            if (var4_3 != null) break block14;
            if (v0 == 0) {
                return null;
            }
            v1 /* !! */  = IlIlik.IlIlK;
            if (var4_3 != null) ** GOTO lbl14
            v0 = v1 /* !! */ [((IlIlnN)var1_1.getPacketType()).ordinal()];
        }
        block0 : switch (v0 ? 1 : 0) {
            case 1: 
            case 2: 
            case 3: {
                v1 /* !! */  = (int[])var1_1.getFullBufferClone();
lbl14:
                // 2 sources

                var5_4 /* !! */  = v1 /* !! */ ;
                v2 = var6_5 = ByteBufHelper.IlIlb((Object)var5_4 /* !! */ );
                if (var4_3 != null) ** GOTO lbl19
                if (v2 < 0) ** GOTO lbl20
                v2 = var6_5;
lbl19:
                // 2 sources

                if (v2 <= IlIlOq.CHECKS_INVALID_CHAT_MAX_INPUT_LENGTH.IlIlj() * 4) ** GOTO lbl21
lbl20:
                // 2 sources

                return new IlIlTV(this, (String)IlIluk.a("q", (int)16548, (long)(3270387403059452439L ^ var2_2)));
lbl21:
                // 1 sources

                v3 = var7_6 = ByteBufHelper.IlIlt((Object)var5_4 /* !! */ , (int)ByteBufHelper.readerIndex((Object)var5_4 /* !! */ ), (int)var6_5, (Charset)StandardCharsets.UTF_8);
                if (var4_3 != null) ** GOTO lbl25
                if (v3 == null) ** GOTO lbl28
                v3 = var7_6;
lbl25:
                // 2 sources

                v4 = v3.isEmpty();
                if (var4_3 != null) ** GOTO lbl30
                if (!v4) ** GOTO lbl29
lbl28:
                // 2 sources

                return new IlIlTE(this, (String)IlIluk.a("q", (int)12453, (long)(8798337534403291676L ^ var2_2)));
lbl29:
                // 1 sources

                v4 = IlIlyR.IlIlr(var7_6, IlIlOq.CHECKS_INVALID_CHAT_MAX_INPUT_LENGTH.IlIlj());
lbl30:
                // 2 sources

                if (v4) {
                    return new IlIlTV(this, (String)IlIluk.a("q", (int)13135, (long)(9072897529286797811L ^ var2_2)));
                }
                var8_7 = IlIluk.IlIlF;
                var9_8 = var8_7.length;
                var10_9 = 0;
                while (var10_9 < var9_8) {
                    var11_10 = var8_7[var10_9];
                    if (var4_3 != null) break block0;
                    if (var4_3 == null) {
                        if (IlIlLi.IlIle(var7_6, var11_10)) {
                            return new IlIlTE(this, (String)IlIluk.a("q", (int)19621, (long)(7888020855907767838L ^ var2_2)));
                        }
                        ++var10_9;
                    }
                    if (var4_3 == null) continue;
                }
                IlIluk.IlIli(var1_1);
            }
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
                    IlIluk.b = IlIls.a((long)1113241123413954243L, (long)8114955485592052489L, MethodHandles.lookup().lookupClass()).a(35326539531034L);
                    var16 = IlIluk.b ^ 137644411651157L;
                    IlIluk.f = new HashMap<K, V>(13);
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var16 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var16 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[9];
                    var12_4 = 0;
                    var11_5 = "K\u0000g\u007f`\u0001\u0085\u00f2\u00d4\u00ec\u0014\u00dfl,Ow\u00f9s\u00f1\u00a2Q\u0084\u00f3\"\u0010\u00ab\u009f\u00d8h\u00d5]\u00c5\u00e9\u0082v)Te\u0091\u00c6\u0099 J@\u001e\u001eq\u009e\u000f\u00b7V`\u00d4k\u0088\u00e7]V\u0007X\u001a\u000b\"\u0080\u00c9\u00a6\u0010\u00b7\u00fc\u0082\u00ae\u00ed1\u0011 \\\u00cb\u00eb\u00d8VE\u0007bY\u00b9z\u00cd\u00b9\n\u00e5\u00dfV\u0083\u00e6\u00c6\u0082\u00f6\u00b3\u0099\u0095\u0017\u00d0\u0082\u00c3\u00cbg\u009b\u0010\u00e8e?\u0013\u00fb&V\u00d3b\u009c\u00e7HL\u00f9\u00d6p kDc\u00f4\u00e4Q\u00c4[,\u000b\u00c8smp\u00eb\u00a9.>\u00f83\u0082sc\u00ad\u00db\u009c\u00c2)\u00be\u00cc\u0092i\u0010\u00d9\u00ce\u00e6\u00fc\u0010\u0018dr\u0011\u0091B\u009cW &\u0013";
                    var13_6 = "K\u0000g\u007f`\u0001\u0085\u00f2\u00d4\u00ec\u0014\u00dfl,Ow\u00f9s\u00f1\u00a2Q\u0084\u00f3\"\u0010\u00ab\u009f\u00d8h\u00d5]\u00c5\u00e9\u0082v)Te\u0091\u00c6\u0099 J@\u001e\u001eq\u009e\u000f\u00b7V`\u00d4k\u0088\u00e7]V\u0007X\u001a\u000b\"\u0080\u00c9\u00a6\u0010\u00b7\u00fc\u0082\u00ae\u00ed1\u0011 \\\u00cb\u00eb\u00d8VE\u0007bY\u00b9z\u00cd\u00b9\n\u00e5\u00dfV\u0083\u00e6\u00c6\u0082\u00f6\u00b3\u0099\u0095\u0017\u00d0\u0082\u00c3\u00cbg\u009b\u0010\u00e8e?\u0013\u00fb&V\u00d3b\u009c\u00e7HL\u00f9\u00d6p kDc\u00f4\u00e4Q\u00c4[,\u000b\u00c8smp\u00eb\u00a9.>\u00f83\u0082sc\u00ad\u00db\u009c\u00c2)\u00be\u00cc\u0092i\u0010\u00d9\u00ce\u00e6\u00fc\u0010\u0018dr\u0011\u0091B\u009cW &\u0013".length();
                    var10_7 = 24;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = IlIluk.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00d4\u00b4E\b\u0093;]\u00f3\u008b\u00adf\u0084\u009aWf@\u001d3U\u0096\u00c7\u0019O\u00aa\u00e3\u00c6(\u0016\u00a5\u00ccW\u00a8(\u0084\u00e3H4\u00a0\u00b5^p\u00a4^\u00ea;\u00f8\u00acB\u0094a\u00df\u00d4\u00b2\u00d9B\u00b4\u00e3\u00b4\u00ab\u00bc{\u00b9\u00bb\u00ae>z#\u009a\u00835\u00d2\u00ab\u0080";
                        var13_6 = "\u00d4\u00b4E\b\u0093;]\u00f3\u008b\u00adf\u0084\u009aWf@\u001d3U\u0096\u00c7\u0019O\u00aa\u00e3\u00c6(\u0016\u00a5\u00ccW\u00a8(\u0084\u00e3H4\u00a0\u00b5^p\u00a4^\u00ea;\u00f8\u00acB\u0094a\u00df\u00d4\u00b2\u00d9B\u00b4\u00e3\u00b4\u00ab\u00bc{\u00b9\u00bb\u00ae>z#\u009a\u00835\u00d2\u00ab\u0080".length();
                        var10_7 = 32;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = IlIluk.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            IlIluk.d = var14_3;
            IlIluk.e = new String[9];
            var2_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var16 >>> 56);
            for (var3_11 = 1; var3_11 < 8; ++var3_11) {
                v9 = v9;
                v9[var3_11] = (byte)(var16 << var3_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var2_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var4_13 = 154532913421908261L;
        var6_14 = var2_10.doFinal(new byte[]{(byte)(var4_13 >>> 56), (byte)(var4_13 >>> 48), (byte)(var4_13 >>> 40), (byte)(var4_13 >>> 32), (byte)(var4_13 >>> 24), (byte)(var4_13 >>> 16), (byte)(var4_13 >>> 8), (byte)var4_13});
        ** while (true)
        var0_12 = ((long)var6_14[0] & 255L) << 56 | ((long)var6_14[1] & 255L) << 48 | ((long)var6_14[2] & 255L) << 40 | ((long)var6_14[3] & 255L) << 32 | ((long)var6_14[4] & 255L) << 24 | ((long)var6_14[5] & 255L) << 16 | ((long)var6_14[6] & 255L) << 8 | (long)var6_14[7] & 255L;
        v10 = new String[(int)var0_12];
        v10[0] = IlIluk.a("q", (int)22113, (long)(8713023470242462651L ^ var16));
        v10[1] = IlIluk.a("q", (int)32296, (long)(1413368308120638452L ^ var16));
        v10[2] = IlIluk.a("q", (int)28681, (long)(5107434098415492561L ^ var16));
        v10[3] = IlIluk.a("q", (int)24555, (long)(476146302875103798L ^ var16));
        v10[4] = IlIluk.a("q", (int)21810, (long)(5137102479431596269L ^ var16));
        v10[5] = "\u00bf";
        IlIluk.IlIlF = v10;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2C94;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIluk", exception);
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
            IlIluk.e[n2] = IlIluk.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIluk.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIluk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIluk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

