/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_Gq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_QO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.StaticSound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodecs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_GH
implements NbtCodec<CP_QO> {
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static transient /* synthetic */ String duioWdvebS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_GH() {
    }

    public CP_QO CP_x(NBT nBT, PacketWrapper<?> packetWrapper) {
        NBT nBT2;
        long l;
        block4: {
            block5: {
                l = a ^ 0x47F7DE0241DCL;
                boolean bl = StaticSound.CP_j();
                try {
                    try {
                        nBT2 = nBT;
                        if (!bl) break block4;
                        if (!(nBT2 instanceof NBTString)) break block5;
                    }
                    catch (CP_Xv ilIlXv) {
                        throw CP_GH.a(ilIlXv);
                    }
                    return CP_Gq.CP_T(((NBTString)nBT).getValue());
                }
                catch (CP_Xv ilIlXv) {
                    throw CP_GH.a(ilIlXv);
                }
            }
            nBT2 = nBT.CP_S(NBTCompound.class);
        }
        NBTCompound nBTCompound = (NBTCompound)nBT2;
        ResourceLocation resourceLocation = nBTCompound.getOrThrow((String)((Object)CP_GH.a("v", (int)10697, (long)(0x56EFF75CC8917AEBL ^ l))), ResourceLocation.CODEC, packetWrapper);
        Float f = nBTCompound.getOrNull((String)((Object)CP_GH.a("v", (int)23889, (long)(0x1C3885411D1B0E72L ^ l))), NbtCodecs.CP_l, packetWrapper);
        return new StaticSound(resourceLocation, f);
    }

    public NBT CP_y(PacketWrapper<?> packetWrapper, CP_QO ilIlQO) {
        NBTCompound nBTCompound;
        block7: {
            NBTCompound nBTCompound2;
            block8: {
                long l = a ^ 0x50D65EBFBF57L;
                boolean bl = StaticSound.CP_j();
                try {
                    if (ilIlQO.CP_T()) {
                        return new NBTString(ilIlQO.getName().toString());
                    }
                }
                catch (CP_Xv ilIlXv) {
                    throw CP_GH.a(ilIlXv);
                }
                nBTCompound2 = new NBTCompound();
                try {
                    try {
                        nBTCompound = nBTCompound2;
                        if (!bl) break block7;
                        nBTCompound.set((String)((Object)CP_GH.a("v", (int)11383, (long)(0x253ABF4E3C3981DCL ^ l))), ilIlQO.getSoundId(), ResourceLocation.CODEC, packetWrapper);
                        if (ilIlQO.getRange() == null) break block8;
                    }
                    catch (CP_Xv ilIlXv) {
                        throw CP_GH.a(ilIlXv);
                    }
                    nBTCompound2.set((String)((Object)CP_GH.a("v", (int)28103, (long)(0x7508B571DFC6406DL ^ l))), ilIlQO.getRange(), NbtCodecs.CP_l, packetWrapper);
                }
                catch (CP_Xv ilIlXv) {
                    throw CP_GH.a(ilIlXv);
                }
            }
            nBTCompound = nBTCompound2;
        }
        return nBTCompound;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_GH.a = CP_s.a(7632607199016141717L, 4627260683665356504L, MethodHandles.lookup().lookupClass()).a(99239114767470L);
                CP_GH.e = new HashMap<K, V>(13);
                var0 = CP_GH.a ^ 124771397421377L;
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
                var6_5 = "{j8X\u00aa\u0097J+\u00c16D>\u00c0\u0082\u00b3\u0002\u00e3\u0087\u008b\u00df?\u0001\u00ff\u00ee\u00b2\u00d6O\u00c4\bg\u0005F\u0010j\u00e8\u00fcl\u00e8\u0086?\u00b6\u00cfCc\u0089a\u00f2\u00f3\u00bf";
                var8_6 = "{j8X\u00aa\u0097J+\u00c16D>\u00c0\u0082\u00b3\u0002\u00e3\u0087\u008b\u00df?\u0001\u00ff\u00ee\u00b2\u00d6O\u00c4\bg\u0005F\u0010j\u00e8\u00fcl\u00e8\u0086?\u00b6\u00cfCc\u0089a\u00f2\u00f3\u00bf".length();
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
                    var9_3[var7_4++] = CP_GH.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b8\u0096[a\u00bcT\u009fxxg(\u00ff(\u0002,m;D3zr<\u00ee\u000ex\u001b\u00c2\u00b3\u00f7\u009c\u0096\u00e7\u0010o\u00d6\u00e0`\u00daeX`tdbp1\u00bf\u0088\u00b2";
                    var8_6 = "\u00b8\u0096[a\u00bcT\u009fxxg(\u00ff(\u0002,m;D3zr<\u00ee\u000ex\u001b\u00c2\u00b3\u00f7\u009c\u0096\u00e7\u0010o\u00d6\u00e0`\u00daeX`tdbp1\u00bf\u0088\u00b2".length();
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
                    var9_3[var7_4++] = CP_GH.a(var10_9).intern();
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
        CP_GH.c = var9_3;
        CP_GH.d = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3661;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/sound/CP_GH", exception);
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
            CP_GH.d[n2] = CP_GH.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_GH.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/sound/CP_GH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_GH.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

