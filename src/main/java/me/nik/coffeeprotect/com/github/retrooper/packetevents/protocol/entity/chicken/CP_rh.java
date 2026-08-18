/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_Qy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_QO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_OU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_rh
implements CP_OU<CP_Qy> {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String aHDdDbOykS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_rh() {
    }

    public CP_Qy CP_E(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws CP_Xv {
        CP_Qy ilIlQy;
        long l = a ^ 0x448C79A23E9L;
        CP_QO ilIlQO = nBTCompound.getOrThrow((String)((Object)CP_rh.a("p", (int)28335, (long)(0x602C462361FA9AF0L ^ l))), CP_QO.CP_a, packetWrapper);
        CP_QO ilIlQO2 = nBTCompound.getOrThrow((String)((Object)CP_rh.a("p", (int)18009, (long)(0x3BFB1274C6C73200L ^ l))), CP_QO.CP_a, packetWrapper);
        CP_QO ilIlQO3 = nBTCompound.getOrThrow((String)((Object)CP_rh.a("p", (int)8674, (long)(0x308D512F5A9755BEL ^ l))), CP_QO.CP_a, packetWrapper);
        CP_QO ilIlQO4 = nBTCompound.getOrThrow((String)((Object)CP_rh.a("p", (int)15923, (long)(0x61B55764EACCA6BL ^ l))), CP_QO.CP_a, packetWrapper);
        String[] stringArray = CP_Qy.CP_o();
        try {
            ilIlQy = new CP_Qy(ilIlQO, ilIlQO2, ilIlQO3, ilIlQO4);
            if (stringArray != null) {
                PacketWrapper.CP_e(new int[4]);
            }
        }
        catch (CP_Xv ilIlXv) {
            throw CP_rh.a(ilIlXv);
        }
        return ilIlQy;
    }

    public void CP_h(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, CP_Qy ilIlQy) throws CP_Xv {
        long l = a ^ 0x3D6D106E60D7L;
        nBTCompound.set((String)((Object)CP_rh.a("p", (int)11376, (long)(0x5D9BD21291781B15L ^ l))), CP_Qy.CP_M(ilIlQy), CP_QO.CP_a, packetWrapper);
        nBTCompound.set((String)((Object)CP_rh.a("p", (int)2110, (long)(0x7AAAC5A50D92BF5AL ^ l))), CP_Qy.CP_l(ilIlQy), CP_QO.CP_a, packetWrapper);
        nBTCompound.set((String)((Object)CP_rh.a("p", (int)29770, (long)(0x7C6B5B8F903432AL ^ l))), CP_Qy.CP_y(ilIlQy), CP_QO.CP_a, packetWrapper);
        nBTCompound.set((String)((Object)CP_rh.a("p", (int)19635, (long)(0x66AF0029216BFBD0L ^ l))), CP_Qy.CP_F(ilIlQy), CP_QO.CP_a, packetWrapper);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_rh.a = CP_s.a(-2931425434270493992L, -9000607773543377911L, MethodHandles.lookup().lookupClass()).a(148563321336913L);
                CP_rh.d = new HashMap<K, V>(13);
                var0 = CP_rh.a ^ 90634804274068L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "\u0013=\u0011H\u00fa\u0099h\\\u00b4\u0099\u00c3\u00b0\u00b4(\\\u0089\u0097V\u001a4\u00d69 \u00a2\u00fa\u00eb\u0014\u009e\u0012{=\u0007\u0018\u00ecM\u00b0\u00dd\u0018\u00f0\u00e6\u00d8\u00d0\u00f7\u0096\u00bawu\u0011Q\u00a3,!\u00a7V$\u00ef\u00aa u9<5VR\u00bex\u00ef\u0014\u00be]\u00ba\u0002|{\u00b1)\u00ea2\u00fd\u00a0'P\u00d1\u00f2\u00fe\u0095\u00dd\u00c9La \u00ceZ\u00c1\u0087\u0012K\u00b3K\u0099\u00ff\u00fa\n\u00f2\u00d9\u00db\u001fq\u00fc\u008d(\u0081\u0082\u0004?\u0087hp\u00f2>\u00f1ia \u001eQ\u00a3\u00d7\u00bf\u00adK\u00cb\u0082\u0013\u0085P9\u0094\u00dd$\u00ef\u0093'hLz\u00d8#\u00e4\u00c6\u00fc\u009e\u0010U\u00d7o f\u0013\n\u00e5m\u00a9\u00badUnr\u00f9\u00b0\u00af\u00a7O$e\f\u001c\r\u00ddu\u00d6\u00a8\u00195\u00d1\u0013NB\u0089";
                var8_6 = "\u0013=\u0011H\u00fa\u0099h\\\u00b4\u0099\u00c3\u00b0\u00b4(\\\u0089\u0097V\u001a4\u00d69 \u00a2\u00fa\u00eb\u0014\u009e\u0012{=\u0007\u0018\u00ecM\u00b0\u00dd\u0018\u00f0\u00e6\u00d8\u00d0\u00f7\u0096\u00bawu\u0011Q\u00a3,!\u00a7V$\u00ef\u00aa u9<5VR\u00bex\u00ef\u0014\u00be]\u00ba\u0002|{\u00b1)\u00ea2\u00fd\u00a0'P\u00d1\u00f2\u00fe\u0095\u00dd\u00c9La \u00ceZ\u00c1\u0087\u0012K\u00b3K\u0099\u00ff\u00fa\n\u00f2\u00d9\u00db\u001fq\u00fc\u008d(\u0081\u0082\u0004?\u0087hp\u00f2>\u00f1ia \u001eQ\u00a3\u00d7\u00bf\u00adK\u00cb\u0082\u0013\u0085P9\u0094\u00dd$\u00ef\u0093'hLz\u00d8#\u00e4\u00c6\u00fc\u009e\u0010U\u00d7o f\u0013\n\u00e5m\u00a9\u00badUnr\u00f9\u00b0\u00af\u00a7O$e\f\u001c\r\u00ddu\u00d6\u00a8\u00195\u00d1\u0013NB\u0089".length();
                var5_7 = 32;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_rh.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "HJ{\u00c1\u00c6\u0098+9\u00f7\u0003\u0003\u00fd\u0001\u0095\u00d7<\u00bc\u00f0\u0000\u00a9Y\u0098\u0089\u00c2\u0096\u0014\u0002}}-#3\u0018\u0018\u0002\u00f9M\"\u0083\u001a\u00d6\u007f\u00be1&\u0096\u0019u:{c\u001c%\u00b2gO\u00f2";
                    var8_6 = "HJ{\u00c1\u00c6\u0098+9\u00f7\u0003\u0003\u00fd\u0001\u0095\u00d7<\u00bc\u00f0\u0000\u00a9Y\u0098\u0089\u00c2\u0096\u0014\u0002}}-#3\u0018\u0018\u0002\u00f9M\"\u0083\u001a\u00d6\u007f\u00be1&\u0096\u0019u:{c\u001c%\u00b2gO\u00f2".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_rh.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        CP_rh.b = var9_3;
        CP_rh.c = new String[8];
    }

    private static CP_Xv a(CP_Xv ilIlXv) {
        return ilIlXv;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6604;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/CP_rh", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            CP_rh.c[n2] = CP_rh.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_rh.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/CP_rh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_rh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

