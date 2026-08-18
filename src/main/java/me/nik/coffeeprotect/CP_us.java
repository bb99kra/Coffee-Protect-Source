/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_Li;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_TE;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_TV;
import me.nik.coffeeprotect.CP_Z6;
import me.nik.coffeeprotect.CP_jl;
import me.nik.coffeeprotect.CP_u7;
import me.nik.coffeeprotect.CP_uV;
import me.nik.coffeeprotect.CP_yR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_b8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

@CP_jl(CP_J="Invalid Sign", CP_M="Checks for invalid sign packets")
public class CP_us
extends CP_uV {
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long g;
    private static transient /* synthetic */ String ipwZoNSWiR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_us(CP_TM ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_SIGN_ENABLED.CP_t());
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public CP_TV CP_h(PacketReceiveEvent var1_1) {
        block13: {
            block12: {
                var2_2 = CP_us.b ^ 60096206822510L;
                var4_3 = CP_u7.CP_q();
                if (var1_1.getPacketType() != CP_nN.UPDATE_SIGN) {
                    return null;
                }
                var5_4 = new CP_b8(var1_1);
                var6_5 = var5_4.CP_E();
                if (!CP_Oq.CHECKS_INVALID_SIGN_FIX_SIGNS.CP_t()) break block12;
                var7_6 = CP_Z6.CP_U((String[])var6_5, (Function<String, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_Q(java.lang.String ), (Ljava/lang/String;)Ljava/lang/String;)());
                v0 = (int)Arrays.equals(var6_5, var7_6);
                if (var4_3 != null) break block13;
                if (v0 == 0) {
                    var5_4.CP_UnderScore(CP_Z6.CP_U((String[])var6_5, (Function<String, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_Q(java.lang.String ), (Ljava/lang/String;)Ljava/lang/String;)()));
                    var1_1.markForReEncode(true);
                }
            }
            var7_6 = var6_5;
            v0 = var7_6.length;
        }
        var8_7 = v0;
        for (var9_8 = 0; var9_8 < var8_7; ++var9_8) {
            block14: {
                block15: {
                    var10_9 = var7_6[var9_8];
                    cfr_temp_0 = this.CP_w.CP_UnderScore() - CP_us.g;
                    v1 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                    if (var4_3 != null) break block14;
                    if (v1 <= 0) break block15;
                    v1 = (long)this.CP_w.CP_p().CP_j();
                    if (var4_3 != null) break block14;
                    if (v1 != false) {
                        v1 = (long)CP_yR.CP_r((String)var10_9, CP_Oq.CHECKS_INVALID_SIGN_MAX_LENGTH.CP_j());
                        if (var4_3 == null) {
                            if (v1 != false) {
                                return new CP_TV(this, (String)CP_us.a("n", (int)31358, (long)(2180340854342631395L ^ var2_2)));
                            } else {
                                ** GOTO lbl34
                            }
                        } else {
                            ** GOTO lbl33
                        }
                    }
                    break block15;
lbl33:
                    // 2 sources

                    break block14;
                }
                v1 = (long)CP_Li.CP_z(var10_9.toLowerCase(), new String[]{CP_us.a("n", (int)13739, (long)(7269851395098308661L ^ var2_2)), CP_us.a("n", (int)16306, (long)(7870431326068767278L ^ var2_2))});
            }
            if (v1 == false) continue;
            return new CP_TE(this, (String)CP_us.a("n", (int)27192, (long)(9072852971854278567L ^ var2_2)));
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
                    CP_us.b = CP_s.a(-3571352175982438078L, -8739882020379759471L, MethodHandles.lookup().lookupClass()).a(130819544933410L);
                    CP_us.f = new HashMap<K, V>(13);
                    var5 = CP_us.b ^ 59273370344723L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[4];
                    var12_4 = 0;
                    var11_5 = "[\u0081\u00a8\u00cf\u0007\u00ef\u00d7Q\u00876\u00fe\u0003\u00a7\u00974\u00bc:\u00bdo\u00f7\u00ec\u0013\u00c4\u00e3\u00846\u00e5Zozt\u00b8 \u00052R\u0093\u00cf\u009aq$0\u00ed\u00bb\u00b4\u00f1d\u00f9\u00f8\u00ce\u0005\u00d0U\u00a1\u009b\u00d9\u0015\u00e2\u00957'\u000ea\u00b7\u00fa";
                    var13_6 = "[\u0081\u00a8\u00cf\u0007\u00ef\u00d7Q\u00876\u00fe\u0003\u00a7\u00974\u00bc:\u00bdo\u00f7\u00ec\u0013\u00c4\u00e3\u00846\u00e5Zozt\u00b8 \u00052R\u0093\u00cf\u009aq$0\u00ed\u00bb\u00b4\u00f1d\u00f9\u00f8\u00ce\u0005\u00d0U\u00a1\u009b\u00d9\u0015\u00e2\u00957'\u000ea\u00b7\u00fa".length();
                    var10_7 = 32;
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
                        var14_3[var12_4++] = CP_us.b(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00eaq\u00ff\u00f9E\u0000O\u00c5}th6^\u0093\\|\u00c2r\u00e3\u00e5\u0097\u00a4\u009a\u00850\u0094`OH6\u0002\u0011\u000b\u00c4\u00f2Y\u00f0M\u0011^\u009e\u00b8fQb-\u0000\u0090\u00a3\u00f1\u00da\u001f\u0083\u00fe\u001b9\u008f\u00a8LT\u00ecC\u00b1/)\u00ee;\u00bb\"K,\u00d97";
                        var13_6 = "\u00eaq\u00ff\u00f9E\u0000O\u00c5}th6^\u0093\\|\u00c2r\u00e3\u00e5\u0097\u00a4\u009a\u00850\u0094`OH6\u0002\u0011\u000b\u00c4\u00f2Y\u00f0M\u0011^\u009e\u00b8fQb-\u0000\u0090\u00a3\u00f1\u00da\u001f\u0083\u00fe\u001b9\u008f\u00a8LT\u00ecC\u00b1/)\u00ee;\u00bb\"K,\u00d97".length();
                        var10_7 = 24;
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
                        var14_3[var12_4++] = CP_us.b(var15_9).intern();
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
            CP_us.d = var14_3;
            CP_us.e = new String[4];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
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
        var2_12 = 5853874217323620170L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_us.g = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x73B3;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_us", exception);
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
            CP_us.e[n2] = CP_us.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_us.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_us" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_us.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
