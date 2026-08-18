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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_bC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

@CheckInfo(CP_J="Invalid Tab Complete", CP_M="Checks for invalid tab complete packets")
public class InvalidTabCompleteCheck
extends Check {
    private static final String CP_D;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static transient /* synthetic */ String yWnhNXBRcX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public InvalidTabCompleteCheck(UserData ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_TAB_COMPLETE_ENABLED.CP_t());
    }

    @Override
    public CheckResult CP_h(PacketReceiveEvent packetReceiveEvent) {
        block25: {
            int n;
            block24: {
                String string;
                String string2;
                long l;
                block23: {
                    block20: {
                        int n2;
                        block22: {
                            Object object;
                            block21: {
                                int n3;
                                block19: {
                                    int n4;
                                    int n5;
                                    block17: {
                                        block18: {
                                            block16: {
                                                String string3;
                                                block15: {
                                                    l = b ^ 0x2644AF94AF38L;
                                                    string2 = InvalidPositionCheck.CP_q();
                                                    if (packetReceiveEvent.getPacketType() != CP_nN.TAB_COMPLETE) {
                                                        return null;
                                                    }
                                                    string3 = string = new CP_bC(packetReceiveEvent).CP_A();
                                                    if (string2 != null) break block15;
                                                    if (string3 == null) break block16;
                                                    string3 = string;
                                                }
                                                n5 = string3.isEmpty();
                                                if (string2 != null) break block17;
                                                if (n5 == 0) break block18;
                                            }
                                            return new CheckResult(this, (String)((Object)InvalidTabCompleteCheck.a("e", (int)30988, (long)(0x2F6C0942466783B5L ^ l))));
                                        }
                                        n5 = CP_yR.CP_r(string, CP_Oq.CHECKS_INVALID_TAB_COMPLETE_MAX_INPUT_LENGTH.CP_j());
                                    }
                                    if (string2 == null) {
                                        if (n5 != 0) {
                                            return new CheckResult(this, (String)((Object)InvalidTabCompleteCheck.a("e", (int)23104, (long)(0x38032C8E995E20FFL ^ l))));
                                        }
                                        n5 = string.length();
                                    }
                                    n3 = n4 = n5;
                                    if (string2 != null) break block19;
                                    if (n3 <= InvalidTabCompleteCheck.b("f", (int)28340, (long)(0xBE9A5BCB52BCFAAL ^ l))) break block20;
                                    n3 = string.indexOf((int)InvalidTabCompleteCheck.b("f", (int)29994, (long)(0x2967A7D225FE5435L ^ l)));
                                }
                                n = n2 = n3;
                                object = -1;
                                if (string2 != null) break block21;
                                if (n == object) break block22;
                                n = n2;
                                if (string2 != null) break block23;
                                object = InvalidTabCompleteCheck.b("f", (int)1892, (long)(0x23E30056CD702678L ^ l));
                            }
                            if (n < object) break block20;
                        }
                        return new CheckResult(this, (String)((Object)InvalidTabCompleteCheck.a("e", (int)11075, (long)(0x21BAD2C6FEA351FBL ^ l))) + n2);
                    }
                    n = string.contains((CharSequence)((Object)InvalidTabCompleteCheck.a("e", (int)15761, (long)(0x5DCB12266806472BL ^ l)))) ? 1 : 0;
                }
                if (string2 == null) {
                    if (n != 0) {
                        return new CheckResult(this, (String)((Object)InvalidTabCompleteCheck.a("e", (int)17652, (long)(0x40A3E2D5C0F43E4AL ^ l))));
                    }
                    n = CP_Oq.CHECKS_INVALID_TAB_COMPLETE_PREVENT_PLUGINS_EXPLOIT.CP_t() ? 1 : 0;
                }
                if (string2 != null) break block24;
                if (n == 0) break block25;
                n = string.equals("/") ? 1 : 0;
            }
            if (n != 0) {
                return new CP_TE(this);
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        InvalidTabCompleteCheck.b = CP_s.a(4761892485002738623L, -268307710394434212L, MethodHandles.lookup().lookupClass()).a(51067309914684L);
                        InvalidTabCompleteCheck.f = new HashMap<K, V>(13);
                        var11 = InvalidTabCompleteCheck.b ^ 123879360880083L;
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[6];
                        var18_4 = 0;
                        var17_5 = "\u00a0\u000e?\u0086\u00a8\"\u0015\u00b3aM\u00d2%<\u0001\u00d2]\u0010\u00e2Ub\u001fg\u0083/\u00f6W\u00ebW{\u00bc\u0084\u00c7< h\u0019\u00c9\u0006\u0004Oh\u00c7\"\u0011\u00c1z\u00de3\u00e6YIl$\u00e9\u001b<\u001cP\u001a\u00e8\u00ca\u00e6\u00ec\u00e5\u00f6\u00b9 2\u009b^\u0007R\u00a7l\u009e{b\u0093\u00a9\u00cf\u0092\u00eb\u0004\u00f4g\u00d7G7\u00b9)\u0097\u00ca\u00e8\u00c3\u00e7\u00d4\u000f\u00bc\u00d7";
                        var19_6 = "\u00a0\u000e?\u0086\u00a8\"\u0015\u00b3aM\u00d2%<\u0001\u00d2]\u0010\u00e2Ub\u001fg\u0083/\u00f6W\u00ebW{\u00bc\u0084\u00c7< h\u0019\u00c9\u0006\u0004Oh\u00c7\"\u0011\u00c1z\u00de3\u00e6YIl$\u00e9\u001b<\u001cP\u001a\u00e8\u00ca\u00e6\u00ec\u00e5\u00f6\u00b9 2\u009b^\u0007R\u00a7l\u009e{b\u0093\u00a9\u00cf\u0092\u00eb\u0004\u00f4g\u00d7G7\u00b9)\u0097\u00ca\u00e8\u00c3\u00e7\u00d4\u000f\u00bc\u00d7".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = InvalidTabCompleteCheck.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00ad\u008a\trH\u00bc\u0017\u0005\u0018\u00d1\u0018\u00c99\u009c2)\u00e3'\u007f\u0014\u00c1\u0092-,*+\u0081~\fd\u008e\u00b2(M\u00ff\u0088\u00ae\u00aa\u00d9\u001bO)4+\u00ca\rP\u00cd\u001bm\u0018z\u001d\u000e\u001eOm\u001f\u0095\u008d\u00c5\u0001&a\u00f4\u00e4\u00c3\u00b2=\u008e\u0091\u00a7y";
                            var19_6 = "\u00ad\u008a\trH\u00bc\u0017\u0005\u0018\u00d1\u0018\u00c99\u009c2)\u00e3'\u007f\u0014\u00c1\u0092-,*+\u0081~\fd\u008e\u00b2(M\u00ff\u0088\u00ae\u00aa\u00d9\u001bO)4+\u00ca\rP\u00cd\u001bm\u0018z\u001d\u000e\u001eOm\u001f\u0095\u008d\u00c5\u0001&a\u00f4\u00e4\u00c3\u00b2=\u008e\u0091\u00a7y".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = InvalidTabCompleteCheck.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                InvalidTabCompleteCheck.d = var20_3;
                InvalidTabCompleteCheck.e = new String[6];
                InvalidTabCompleteCheck.CP_D = InvalidTabCompleteCheck.a("e", (int)12434, (long)(1069890352156784834L ^ var11));
                InvalidTabCompleteCheck.i = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "m\u00f3\u0007h\u00cah\u00f8\u00e9\u0096\u0093\u0090>\u00e6\u00b9~\u00fcI\u0097>dK\u00cd\u00b8z";
                var5_15 = "m\u00f3\u0007h\u00cah\u00f8\u00e9\u0096\u0093\u0090>\u00e6\u00b9~\u00fcI\u0097>dK\u00cd\u00b8z".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        InvalidTabCompleteCheck.g = var6_12;
        InvalidTabCompleteCheck.h = new Integer[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4C94;
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
                throw new RuntimeException("me/nik/coffeeprotect/InvalidTabCompleteCheck", exception);
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
            InvalidTabCompleteCheck.e[n2] = InvalidTabCompleteCheck.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = InvalidTabCompleteCheck.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/InvalidTabCompleteCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1731;
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
                throw new RuntimeException("me/nik/coffeeprotect/InvalidTabCompleteCheck", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            InvalidTabCompleteCheck.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = InvalidTabCompleteCheck.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/InvalidTabCompleteCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InvalidTabCompleteCheck.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(InvalidTabCompleteCheck.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
