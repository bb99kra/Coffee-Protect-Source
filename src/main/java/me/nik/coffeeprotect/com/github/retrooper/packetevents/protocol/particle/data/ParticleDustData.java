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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.color.CP_rI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTFloat;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.data.CP_ut;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_QG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class ParticleDustData
extends CP_ut {
    private float scale;
    private CP_rI color;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String oveekvZvfp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public ParticleDustData(float f, float f2, float f3, float f4) {
        this(f, new CP_rI(f2, f3, f4));
    }

    public ParticleDustData(float f, float[] fArray) {
        this(f, fArray[0], fArray[1], fArray[2]);
    }

    public ParticleDustData(float f, CP_QG ilIlQG) {
        this(f, ilIlQG.CP_Y(), ilIlQG.CP_g(), ilIlQG.CP_u());
    }

    public ParticleDustData(float f, int n, int n2, int n3) {
        this(f, new CP_rI(n, n2, n3));
    }

    public ParticleDustData(float f, CP_rI ilIlrI) {
        this.scale = f;
        this.color = ilIlrI;
    }

    public static ParticleDustData read(PacketWrapper<?> packetWrapper) {
        float f;
        CP_rI ilIlrI;
        block4: {
            PacketWrapper<?> packetWrapper2;
            block2: {
                block3: {
                    long l = a ^ 0x700D6BAC3961L;
                    String[] stringArray = CP_ut.CP_c();
                    packetWrapper2 = packetWrapper;
                    if (stringArray != null) break block2;
                    if (!packetWrapper2.CP_w().CP_z(ServerVersion.V_1_21_2)) break block3;
                    ilIlrI = new CP_rI(packetWrapper.CP_W());
                    if (stringArray == null) break block4;
                }
                packetWrapper2 = packetWrapper;
            }
            f = packetWrapper2.CP_X();
            float f2 = packetWrapper.CP_X();
            float f3 = packetWrapper.CP_X();
            ilIlrI = new CP_rI(f, f2, f3);
        }
        f = packetWrapper.CP_X();
        return new ParticleDustData(f, ilIlrI);
    }

    public static void write(PacketWrapper<?> packetWrapper, ParticleDustData particleDustData) {
        block4: {
            PacketWrapper<?> packetWrapper2;
            block2: {
                block3: {
                    long l = a ^ 0x95BC839E665L;
                    String[] stringArray = CP_ut.CP_c();
                    packetWrapper2 = packetWrapper;
                    if (stringArray != null) break block2;
                    if (!packetWrapper2.CP_w().CP_z(ServerVersion.V_1_21_2)) break block3;
                    packetWrapper.CP_a(particleDustData.color.asRGB());
                    if (stringArray == null) break block4;
                }
                packetWrapper.CP_R(particleDustData.getRed());
                packetWrapper.CP_R(particleDustData.getGreen());
                packetWrapper2 = packetWrapper;
            }
            packetWrapper2.CP_R(particleDustData.getBlue());
        }
        packetWrapper.CP_R(particleDustData.scale);
    }

    public static ParticleDustData decode(NBTCompound nBTCompound, ClientVersion clientVersion) {
        long l = a ^ 0x1E2B2F573929L;
        CP_rI ilIlrI = CP_rI.CP_I(nBTCompound.getTagOrThrow((String)((Object)ParticleDustData.a("f", (int)1938, (long)(0x362FBF5A6B8EE14L ^ l)))), clientVersion);
        float f = nBTCompound.getNumberTagOrThrow((String)((Object)ParticleDustData.a("f", (int)25585, (long)(0x2C9AB0DC1A5B0A76L ^ l)))).getAsFloat();
        return new ParticleDustData(f, ilIlrI);
    }

    public static void encode(ParticleDustData particleDustData, ClientVersion clientVersion, NBTCompound nBTCompound) {
        long l = a ^ 0x3E9F67F9ABF3L;
        nBTCompound.setTag((String)((Object)ParticleDustData.a("f", (int)914, (long)(0x3D2C33BC4BDA78CCL ^ l))), CP_rI.CP_G(particleDustData.color, clientVersion));
        nBTCompound.setTag((String)((Object)ParticleDustData.a("f", (int)23225, (long)(0x7ECB119A9A94A1E6L ^ l))), new NBTFloat(particleDustData.scale));
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    public float getRed() {
        return (float)this.color.red() / 255.0f;
    }

    public void setRed(float f) {
        this.color = new CP_rI(f, this.getGreen(), this.getBlue());
    }

    public float getGreen() {
        return (float)this.color.green() / 255.0f;
    }

    public void setGreen(float f) {
        this.color = new CP_rI(this.getRed(), f, this.getBlue());
    }

    public float getBlue() {
        return (float)this.color.blue() / 255.0f;
    }

    public void setBlue(float f) {
        this.color = new CP_rI(this.getRed(), this.getGreen(), f);
    }

    public float getScale() {
        return this.scale;
    }

    public void setScale(float f) {
        this.scale = f;
    }

    public CP_rI getColor() {
        return this.color;
    }

    public void setColor(CP_rI ilIlrI) {
        this.color = ilIlrI;
    }

    public boolean equals(Object object) {
        Object object2;
        String[] stringArray;
        block6: {
            block7: {
                block5: {
                    long l = a ^ 0x152A87DBBD7DL;
                    stringArray = CP_ut.CP_c();
                    if (object == null) break block5;
                    object2 = this.getClass();
                    if (stringArray != null) break block6;
                    if (object2 == object.getClass()) break block7;
                }
                return false;
            }
            object2 = object;
        }
        ParticleDustData particleDustData = (ParticleDustData)object2;
        boolean bl = Float.compare(particleDustData.scale, this.scale);
        if (stringArray == null) {
            if (bl) {
                return false;
            }
            bl = this.color.equals(particleDustData.color);
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(this.scale), this.color);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ParticleDustData.a = CP_s.a(763597209925032813L, 2817347939895671333L, MethodHandles.lookup().lookupClass()).a(161600085417380L);
                ParticleDustData.d = new HashMap<K, V>(13);
                var0 = ParticleDustData.a ^ 17529332407159L;
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
                var6_5 = "\u0017v\u00df<5\u00ef\u009fH\u00aa\u00ec\u00c3\u00b9k\u00deTa\u0010\u008a\u00f2\u0094\r\u00d4V\u0091\u0087s\u00b9\u00eaJu\u00bf\u0001!";
                var8_6 = "\u0017v\u00df<5\u00ef\u009fH\u00aa\u00ec\u00c3\u00b9k\u00deTa\u0010\u008a\u00f2\u0094\r\u00d4V\u0091\u0087s\u00b9\u00eaJu\u00bf\u0001!".length();
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
                    var9_3[var7_4++] = ParticleDustData.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "rC*\u001a{D\u00d4\u0017\u000f}\u0082\u00dcyv\u00a0\b\u0010c\u00f8\u008aKy\u00fe:V\u00a8\u00cdUx\u0013\u00b7F\u00d7";
                    var8_6 = "rC*\u001a{D\u00d4\u0017\u000f}\u0082\u00dcyv\u00a0\b\u0010c\u00f8\u008aKy\u00fe:V\u00a8\u00cdUx\u0013\u00b7F\u00d7".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = ParticleDustData.a(var10_9).intern();
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
        ParticleDustData.b = var9_3;
        ParticleDustData.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x508B;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/data/ParticleDustData", exception);
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
            ParticleDustData.c[n2] = ParticleDustData.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ParticleDustData.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/data/ParticleDustData" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ParticleDustData.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

