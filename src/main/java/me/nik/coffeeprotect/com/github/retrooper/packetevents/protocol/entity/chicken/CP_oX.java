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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_fM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.StaticChickenSoundVariant;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_OU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_oX
implements CP_OU<CP_fM> {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String BDaLpWTdzT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_oX() {
    }

    public CP_fM CP_O(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws CP_Xv {
        long l = a ^ 0x764D91A95702L;
        CP_Qy ilIlQy = nBTCompound.getOrThrow((String)((Object)CP_oX.a("f", (int)30925, (long)(0x4B02740EBF0E019FL ^ l))), CP_Qy.CP_b, packetWrapper);
        CP_Qy ilIlQy2 = nBTCompound.getOrThrow((String)((Object)CP_oX.a("f", (int)14495, (long)(0x16BDD607BC1DC1CFL ^ l))), CP_Qy.CP_b, packetWrapper);
        return new StaticChickenSoundVariant(ilIlQy, ilIlQy2);
    }

    public void CP_L(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, CP_fM ilIlfM) throws CP_Xv {
        long l = a ^ 0x1B17CCE9C734L;
        nBTCompound.set((String)((Object)CP_oX.a("f", (int)25920, (long)(0x6FF5B3D176000C27L ^ l))), ilIlfM.getAdultSounds(), CP_Qy.CP_b, packetWrapper);
        nBTCompound.set((String)((Object)CP_oX.a("f", (int)6764, (long)(0x2665CA0BE3257309L ^ l))), ilIlfM.getBabySounds(), CP_Qy.CP_b, packetWrapper);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_oX.a = CP_s.a(-4789296535962300775L, 7113817928752496221L, MethodHandles.lookup().lookupClass()).a(108106111384452L);
                CP_oX.d = new HashMap<K, V>(13);
                var0 = CP_oX.a ^ 83678387201692L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u001f\u00e2\u009a\u00d3\u00c9:\u0093\u00c6\u0010G\u008fQ\u00f5\u008cT\u0086\u00a5\u00b7\u0011\u00b4\u00b4F>\u0098 \r\u008c\u009a\u00db\u00ba\u00f6e\u00db1{\n\u00a6>\u00df\u009e\u00e6\u0090K;\u00ec!\u008bj\u0018\u00c1\u00e6\u0096\u0004\b\u00d4\u00ae\u0080";
                var8_6 = "\u001f\u00e2\u009a\u00d3\u00c9:\u0093\u00c6\u0010G\u008fQ\u00f5\u008cT\u0086\u00a5\u00b7\u0011\u00b4\u00b4F>\u0098 \r\u008c\u009a\u00db\u00ba\u00f6e\u00db1{\n\u00a6>\u00df\u009e\u00e6\u0090K;\u00ec!\u008bj\u0018\u00c1\u00e6\u0096\u0004\b\u00d4\u00ae\u0080".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = CP_oX.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u0098\u00d2\u0096\u00e0`\u00aev\u00a6|V\u001c3d\u0084\u009b\u00ec\u00f4z\u00d0\u00d4mzR\u0083 o\u00acP?e\u00cc\u00d4(\u00a5\u00c2\u00b9%j=>B\u00ba\u00f1\u00f2\u00ff\u00a2\u00b5\u0019\u00a3\u0085\u00ac\u0001b\u009d\u00c7\u00be\u008e";
                    var8_6 = "\u0098\u00d2\u0096\u00e0`\u00aev\u00a6|V\u001c3d\u0084\u009b\u00ec\u00f4z\u00d0\u00d4mzR\u0083 o\u00acP?e\u00cc\u00d4(\u00a5\u00c2\u00b9%j=>B\u00ba\u00f1\u00f2\u00ff\u00a2\u00b5\u0019\u00a3\u0085\u00ac\u0001b\u009d\u00c7\u00be\u008e".length();
                    var5_7 = 24;
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
                    var9_3[var7_4++] = CP_oX.a(var10_9).intern();
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
        CP_oX.b = var9_3;
        CP_oX.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6F14;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/CP_oX", exception);
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
            CP_oX.c[n2] = CP_oX.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_oX.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/CP_oX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_oX.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

