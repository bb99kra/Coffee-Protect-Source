/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.data;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.data.CP_ut;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class ParticleShriekData
extends CP_ut {
    private int delay;
    private static final long a = CP_s.a(1016906611403049173L, -7758925918642876079L, MethodHandles.lookup().lookupClass()).a(262584135395901L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String DNXTgLfIBy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public ParticleShriekData(int n) {
        this.delay = n;
    }

    public int getDelay() {
        return this.delay;
    }

    public void setDelay(int n) {
        this.delay = n;
    }

    public static ParticleShriekData read(PacketWrapper<?> packetWrapper) {
        return new ParticleShriekData(packetWrapper.CP_f());
    }

    public static void write(PacketWrapper<?> packetWrapper, ParticleShriekData particleShriekData) {
        packetWrapper.CP_J(particleShriekData.getDelay());
    }

    public static ParticleShriekData decode(NBTCompound nBTCompound, ClientVersion clientVersion) {
        long l = a ^ 0x1DA6DFCDE3D3L;
        int n = nBTCompound.getNumberTagOrThrow((String)((Object)ParticleShriekData.a("p", (int)6758, (long)(0x3A97CCABD71049F4L ^ l)))).getAsInt();
        return new ParticleShriekData(n);
    }

    public static void encode(ParticleShriekData particleShriekData, ClientVersion clientVersion, NBTCompound nBTCompound) {
        long l = a ^ 0x2526DFCD3E0AL;
        nBTCompound.setTag((String)((Object)ParticleShriekData.a("p", (int)8816, (long)(0x3A0F0FB0C4C2C3AL ^ l))), new NBTInt(particleShriekData.delay));
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public boolean equals(Object object) {
        Object object2;
        String[] stringArray;
        block5: {
            block6: {
                block4: {
                    long l = a ^ 0x577599812D63L;
                    stringArray = CP_ut.CP_c();
                    if (object == null) break block4;
                    object2 = this.getClass();
                    if (stringArray != null) break block5;
                    if (object2 == object.getClass()) break block6;
                }
                return false;
            }
            object2 = object;
        }
        ParticleShriekData particleShriekData = (ParticleShriekData)object2;
        int n = this.delay;
        if (stringArray == null) {
            n = n == particleShriekData.delay ? 1 : 0;
        }
        return n != 0;
    }

    public int hashCode() {
        return Objects.hashCode(this.delay);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x4A3C3043E131L;
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
        String string = "\u00e3\u0086\u00fa\u00ecM6\"s\u0084\u0089\u00c7\u00aa\u00cf\u0095\u00f7y\u0010\u0018\u00b4\u00c9\u00f8\u0002\u00b7\u001f\u00e3\u00de\u0018d\na\u00bbH\u00e4";
        int n2 = "\u00e3\u0086\u00fa\u00ecM6\"s\u0084\u0089\u00c7\u00aa\u00cf\u0095\u00f7y\u0010\u0018\u00b4\u00c9\u00f8\u0002\u00b7\u001f\u00e3\u00de\u0018d\na\u00bbH\u00e4".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ParticleShriekData.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x15F9;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/data/ParticleShriekData", exception);
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
            ParticleShriekData.c[n2] = ParticleShriekData.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ParticleShriekData.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/data/ParticleShriekData" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ParticleShriekData.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

