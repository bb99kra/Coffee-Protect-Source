/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_OU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.CP_G0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.StaticPaintingVariant;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

class CP_d6
implements CP_OU<CP_G0> {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String aotBJFpzQx = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_d6() {
    }

    public CP_G0 CP_L(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws CP_Xv {
        StaticPaintingVariant staticPaintingVariant;
        long l = a ^ 0x44DEADF72489L;
        int n = nBTCompound.getNumberTagOrThrow((String)((Object)CP_d6.a("o", (int)27051, (long)(0x54E718F5F999C8A7L ^ l)))).getAsInt();
        int n2 = nBTCompound.getNumberTagOrThrow((String)((Object)CP_d6.a("o", (int)9148, (long)(0x4D9DBEB0EFA602B1L ^ l)))).getAsInt();
        ResourceLocation resourceLocation = new ResourceLocation(nBTCompound.getStringTagValueOrThrow((String)((Object)CP_d6.a("o", (int)10461, (long)(0x1EDC51FAD8B209D5L ^ l)))));
        Component component = nBTCompound.getOrNull((String)((Object)CP_d6.a("o", (int)9474, (long)(0xB87281C636D8407L ^ l))), packetWrapper.CP_q(), packetWrapper);
        String[] stringArray = StaticPaintingVariant.CP_R();
        Component component2 = nBTCompound.getOrNull((String)((Object)CP_d6.a("o", (int)18009, (long)(0x651771724C78E757L ^ l))), packetWrapper.CP_q(), packetWrapper);
        try {
            staticPaintingVariant = new StaticPaintingVariant(n, n2, resourceLocation, component, component2);
            if (stringArray == null) {
                PacketWrapper.CP_e(new int[5]);
            }
        }
        catch (CP_Xv ilIlXv) {
            throw CP_d6.a(ilIlXv);
        }
        return staticPaintingVariant;
    }

    public void CP_H(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, CP_G0 ilIlG0) throws CP_Xv {
        long l = a ^ 0x368C1DCC03B7L;
        String[] stringArray = StaticPaintingVariant.CP_R();
        nBTCompound.setTag((String)((Object)CP_d6.a("o", (int)12522, (long)(0xEDF2661732336DEL ^ l))), new NBTInt(ilIlG0.getWidth()));
        nBTCompound.setTag((String)((Object)CP_d6.a("o", (int)15761, (long)(0x4DD50AF5850CBBA0L ^ l))), new NBTInt(ilIlG0.getHeight()));
        String[] stringArray2 = stringArray;
        nBTCompound.setTag((String)((Object)CP_d6.a("o", (int)4467, (long)(0x4C7C2BDD4B809749L ^ l))), new NBTString(ilIlG0.getAssetId().toString()));
        if (packetWrapper.CP_w().CP_z(ServerVersion.V_1_21_2)) {
            Component component;
            block11: {
                block12: {
                    Component component2 = ilIlG0.getTitle();
                    try {
                        try {
                            component = component2;
                            if (stringArray2 == null) break block11;
                            if (component == null) break block12;
                        }
                        catch (CP_Xv ilIlXv) {
                            throw CP_d6.a(ilIlXv);
                        }
                        nBTCompound.set((String)((Object)CP_d6.a("o", (int)23640, (long)(0x1538C284DB395A6FL ^ l))), component2, packetWrapper.CP_q(), packetWrapper);
                    }
                    catch (CP_Xv ilIlXv) {
                        throw CP_d6.a(ilIlXv);
                    }
                }
                component = ilIlG0.getAuthor();
            }
            Component component3 = component;
            try {
                if (component3 != null) {
                    nBTCompound.set((String)((Object)CP_d6.a("o", (int)19200, (long)(0x565F1558F0B14D35L ^ l))), component3, packetWrapper.CP_q(), packetWrapper);
                }
            }
            catch (CP_Xv ilIlXv) {
                throw CP_d6.a(ilIlXv);
            }
        }
        try {
            if (PacketWrapper.CP_z() == null) {
                StaticPaintingVariant.CP_Y(new String[4]);
            }
        }
        catch (CP_Xv ilIlXv) {
            throw CP_d6.a(ilIlXv);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_d6.a = CP_s.a(7780156045869288765L, 1637852161715977864L, MethodHandles.lookup().lookupClass()).a(122202890900956L);
                CP_d6.d = new HashMap<K, V>(13);
                var0 = CP_d6.a ^ 24751123508685L;
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
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "P\u00b0.\u00c2L\u00f2f>\u008c\u00d2g\u009c;\u008d\u00d9\u000e\u0010^\u00cf\u0094y\u0093\u00ad\u00b8\u0014W#\u00e5\u008be\u0000F#\u0010p$\u001e\u00bdP&9\u00bc\u00e9\u00fd4\u00c9\u000f,\u00cd\t\u0010\u00c9\u00ado\u00c5\u00b0\u00d8\u00f7-\u0084\u0095H@]\u00b4l\u00d0\u0018A\u00b0\u00b4G\u00dc]>\u00d2\u00fc\u00efg4,\u00b3\b\u0006\u009e\u00d0\u0007 \u00b01\u0088\u00c8\u0010A\u008e]\u00f9\u0006\u00a7H\u001a\u00db\r\u00a2\u0093c\r\u0016D\u0010)\u00a7J\u00cc5\u0095\u009a\u001a\u00b5\u00a2\b\u009f\u00f8\u001e8\u00c6\u0010g\u00a6\u00e2\u00da%\u00ce9\u00a3\u0003\u00b7\u0085-\u00cd\u0087*\u00a2";
                var8_6 = "P\u00b0.\u00c2L\u00f2f>\u008c\u00d2g\u009c;\u008d\u00d9\u000e\u0010^\u00cf\u0094y\u0093\u00ad\u00b8\u0014W#\u00e5\u008be\u0000F#\u0010p$\u001e\u00bdP&9\u00bc\u00e9\u00fd4\u00c9\u000f,\u00cd\t\u0010\u00c9\u00ado\u00c5\u00b0\u00d8\u00f7-\u0084\u0095H@]\u00b4l\u00d0\u0018A\u00b0\u00b4G\u00dc]>\u00d2\u00fc\u00efg4,\u00b3\b\u0006\u009e\u00d0\u0007 \u00b01\u0088\u00c8\u0010A\u008e]\u00f9\u0006\u00a7H\u001a\u00db\r\u00a2\u0093c\r\u0016D\u0010)\u00a7J\u00cc5\u0095\u009a\u001a\u00b5\u00a2\b\u009f\u00f8\u001e8\u00c6\u0010g\u00a6\u00e2\u00da%\u00ce9\u00a3\u0003\u00b7\u0085-\u00cd\u0087*\u00a2".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = CP_d6.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u009d\u00e5lK\u00cb&<\u0099\u0080Y\u0089\u008e\u00c6\u0002\u00df\u0014\u009c\u00cc,*\u00cb,\u0092\u00a8k\u0096*_\u00a0. \u0011\u0010c\u00b0\u00be\u00101\u0087SKV\u0012\u00ed\u00ce\u00e7fV\u00a2";
                    var8_6 = "\u009d\u00e5lK\u00cb&<\u0099\u0080Y\u0089\u008e\u00c6\u0002\u00df\u0014\u009c\u00cc,*\u00cb,\u0092\u00a8k\u0096*_\u00a0. \u0011\u0010c\u00b0\u00be\u00101\u0087SKV\u0012\u00ed\u00ce\u00e7fV\u00a2".length();
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
                    var9_3[var7_4++] = CP_d6.a(var10_9).intern();
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
        CP_d6.b = var9_3;
        CP_d6.c = new String[10];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x221C;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/CP_d6", exception);
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
            CP_d6.c[n2] = CP_d6.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_d6.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/CP_d6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_d6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

