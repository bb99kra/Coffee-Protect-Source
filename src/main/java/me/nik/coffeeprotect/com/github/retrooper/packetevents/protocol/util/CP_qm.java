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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_Ou;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_qm
implements NbtCodec<T> {
    final CP_Ou CP_t;
    private static final long a = CP_s.a(7812138489880462036L, 1268434804690869204L, MethodHandles.lookup().lookupClass()).a(212785527090957L);
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static transient /* synthetic */ String vMXNgKNtKm = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    CP_qm(CP_Ou ilIlOu) {
        this.CP_t = ilIlOu;
    }

    public T CP_n(NBT nBT, PacketWrapper<?> packetWrapper) {
        Object t;
        block15: {
            boolean bl;
            block17: {
                block16: {
                    boolean bl2;
                    block13: {
                        Object t2;
                        block14: {
                            long l;
                            block18: {
                                boolean bl3;
                                CP_Ou ilIlOu;
                                block11: {
                                    block12: {
                                        l = a ^ 0x6D4A50E67476L;
                                        ilIlOu = packetWrapper.CP_p(this.CP_t);
                                        t2 = null;
                                        bl2 = CP_Xv.CP_H();
                                        try {
                                            bl3 = nBT instanceof NBTNumber;
                                            if (bl2) break block11;
                                            if (!bl3) break block12;
                                        }
                                        catch (CP_Xv ilIlXv) {
                                            throw CP_qm.a(ilIlXv);
                                        }
                                        ClientVersion clientVersion = packetWrapper.CP_w().CP_E();
                                        int n = ((NBTNumber)nBT).getAsInt();
                                        t2 = ilIlOu.getById(clientVersion, n);
                                        break block18;
                                    }
                                    bl3 = nBT instanceof NBTString;
                                }
                                if (bl3) {
                                    t2 = ilIlOu.getByName(((NBTString)nBT).getValue());
                                }
                            }
                            try {
                                try {
                                    t = t2;
                                    if (bl2) break block13;
                                    if (t != null) break block14;
                                }
                                catch (CP_Xv ilIlXv) {
                                    throw CP_qm.a(ilIlXv);
                                }
                                throw new CP_Xv((String)((Object)CP_qm.a("d", (int)23165, (long)(0x288B163B02D1B488L ^ l))) + this.CP_t.CP_X());
                            }
                            catch (CP_Xv ilIlXv) {
                                throw CP_qm.a(ilIlXv);
                            }
                        }
                        t = t2;
                    }
                    try {
                        try {
                            if (PacketWrapper.CP_z() != null) break block15;
                            if (!bl2) break block16;
                        }
                        catch (CP_Xv ilIlXv) {
                            throw CP_qm.a(ilIlXv);
                        }
                        bl = false;
                        break block17;
                    }
                    catch (CP_Xv ilIlXv) {
                        throw CP_qm.a(ilIlXv);
                    }
                }
                bl = true;
            }
            CP_Xv.CP_w(bl);
        }
        return t;
    }

    public NBT CP_N(PacketWrapper<?> packetWrapper, T t) {
        long l = a ^ 0x5F74D0936A74L;
        try {
            if (!t.CP_T()) {
                throw new CP_Xv((String)((Object)CP_qm.a("d", (int)16544, (long)(0x6089D716E4803056L ^ l))));
            }
        }
        catch (CP_Xv ilIlXv) {
            throw CP_qm.a(ilIlXv);
        }
        return ResourceLocation.CODEC.CP_UnderScore(packetWrapper, t.getName());
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        e = new HashMap(13);
        long l = a ^ 0x3CBBFE99B98AL;
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
        String string = "\no\u0080\u00ca\u00f2Ja\u00ad\u0004\u00c1\u00b1\u00f0~=\u0086\u00bcf\u0099C\u009e\u00c2q\u00d4\u0084%AE,T\u00c0k\u00f7\u00efaj\u001f4\u0012\u00be8(\u00f1\u000b`*\u00fb\u0088U\u00a2&l\u00c0\u0016\u0015\u00b6\u00fb\u00d0A\u00c6&\u0015iS*\u00c9\u00cfP\f\u0091\u00das<\u00ed\u008a\"\u007f\r\u00eam\u001f|";
        int n2 = "\no\u0080\u00ca\u00f2Ja\u00ad\u0004\u00c1\u00b1\u00f0~=\u0086\u00bcf\u0099C\u009e\u00c2q\u00d4\u0084%AE,T\u00c0k\u00f7\u00efaj\u001f4\u0012\u00be8(\u00f1\u000b`*\u00fb\u0088U\u00a2&l\u00c0\u0016\u0015\u00b6\u00fb\u00d0A\u00c6&\u0015iS*\u00c9\u00cfP\f\u0091\u00das<\u00ed\u008a\"\u007f\r\u00eam\u001f|".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_qm.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B66;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_qm", exception);
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
            CP_qm.d[n2] = CP_qm.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_qm.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/util/CP_qm" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_qm.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

