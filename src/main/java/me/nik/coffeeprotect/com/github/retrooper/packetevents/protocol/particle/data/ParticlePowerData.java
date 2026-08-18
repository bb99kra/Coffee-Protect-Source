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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTFloat;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.data.CP_ut;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class ParticlePowerData
extends CP_ut {
    private float power;
    private static final long a = CP_s.a(-7089488707824633315L, 6899505303547643289L, MethodHandles.lookup().lookupClass()).a(168151036530448L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String RkwXShwpkT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public ParticlePowerData(float f) {
        this.power = f;
    }

    /*
     * Unable to fully structure code
     */
    public static ParticlePowerData read(PacketWrapper<?> var0) {
        var1_1 = ParticlePowerData.a ^ 95586968112656L;
        var3_2 = CP_ut.CP_c();
        v0 = var0;
        if (var3_2 != null) ** GOTO lbl9
        if (v0.CP_w().CP_C(ServerVersion.V_1_21_9)) {
            v1 = 1.0f;
        } else {
            v0 = var0;
lbl9:
            // 2 sources

            v1 = v0.CP_X();
        }
        var4_3 = v1;
        return new ParticlePowerData(var4_3);
    }

    public static void write(PacketWrapper<?> packetWrapper, ParticlePowerData particlePowerData) {
        block3: {
            PacketWrapper<?> packetWrapper2;
            block2: {
                long l = a ^ 0xA066A8468A4L;
                String[] stringArray = CP_ut.CP_c();
                packetWrapper2 = packetWrapper;
                if (stringArray != null) break block2;
                if (!packetWrapper2.CP_w().CP_z(ServerVersion.V_1_21_9)) break block3;
                packetWrapper2 = packetWrapper;
            }
            packetWrapper2.CP_R(particlePowerData.power);
        }
    }

    @ApiStatus.Internal
    public static ParticlePowerData decode(NBTCompound nBTCompound, ClientVersion clientVersion) {
        long l = a ^ 0x17EABDAA0FA0L;
        float f = nBTCompound.getNumberTagValueOrDefault((String)((Object)ParticlePowerData.a("c", (int)2870, (long)(0x4C95EE7126DA75A1L ^ l))), Float.valueOf(1.0f)).floatValue();
        return new ParticlePowerData(f);
    }

    @ApiStatus.Internal
    public static void encode(ParticlePowerData particlePowerData, ClientVersion clientVersion, NBTCompound nBTCompound) {
        block5: {
            boolean bl;
            long l;
            block4: {
                l = a ^ 0xEA8374D2991L;
                String[] stringArray = CP_ut.CP_c();
                bl = clientVersion.CP_w(ClientVersion.V_1_21_9);
                if (stringArray != null) break block4;
                if (!bl) break block5;
                float f = particlePowerData.power - 1.0f;
                bl = f == 0.0f ? (byte)0 : (f > 0.0f ? (byte)1 : -1);
            }
            if (bl) {
                nBTCompound.setTag((String)((Object)ParticlePowerData.a("c", (int)30759, (long)(0x3960630CD3FAA080L ^ l))), new NBTFloat(particlePowerData.power));
            }
        }
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public float getPower() {
        return this.power;
    }

    public void setPower(float f) {
        this.power = f;
    }

    public boolean equals(Object object) {
        Object object2;
        String[] stringArray;
        block5: {
            block6: {
                block4: {
                    long l = a ^ 0x7878C28EF730L;
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
        ParticlePowerData particlePowerData = (ParticlePowerData)object2;
        boolean bl = Float.compare(particlePowerData.power, this.power);
        if (stringArray == null) {
            bl = !bl;
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.power));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x66335CE18ADEL;
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
        String string = "\u008f\u001d\u00a6\u00db\u00ber\u00d2\u00de\u00f5\u000b\u00fa|\u0094<;|\u0010\u00ef\u0018{x\u00b3\u001aT\u00e8\u00ef\u001b\u008e\u00f0w\u001a+1";
        int n2 = "\u008f\u001d\u00a6\u00db\u00ber\u00d2\u00de\u00f5\u000b\u00fa|\u0094<;|\u0010\u00ef\u0018{x\u00b3\u001aT\u00e8\u00ef\u001b\u008e\u00f0w\u001a+1".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = ParticlePowerData.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7A19;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/data/ParticlePowerData", exception);
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
            ParticlePowerData.c[n2] = ParticlePowerData.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ParticlePowerData.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/data/ParticlePowerData" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ParticlePowerData.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

