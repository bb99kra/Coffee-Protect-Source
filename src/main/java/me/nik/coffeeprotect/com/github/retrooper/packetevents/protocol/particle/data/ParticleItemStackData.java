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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_n7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.data.CP_AF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.data.CP_ut;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.data.LegacyParticleData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class ParticleItemStackData
extends CP_ut
implements CP_AF {
    private CP_Cg itemStack;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String cUhuUfQnJk = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public ParticleItemStackData(CP_Cg ilIlCg) {
        this.itemStack = ilIlCg;
    }

    public CP_Cg getItemStack() {
        return this.itemStack;
    }

    public void setItemStack(CP_Cg ilIlCg) {
        this.itemStack = ilIlCg;
    }

    public static ParticleItemStackData read(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0xFC35AE13741L;
        if (packetWrapper.CP_w().CP_z(ServerVersion.V_1_13)) {
            return new ParticleItemStackData(CP_n7.CP_q(packetWrapper));
        }
        return new ParticleItemStackData(CP_Cg.CP_q().CP_C((ItemType)ItemTypes.getRegistry().CP_A(packetWrapper.CP_B(), packetWrapper.CP_f())).CP_t(packetWrapper).CP_D());
    }

    public static void write(PacketWrapper<?> packetWrapper, ParticleItemStackData particleItemStackData) {
        CP_n7.CP_x(packetWrapper, particleItemStackData.getItemStack());
    }

    public static ParticleItemStackData decode(NBTCompound nBTCompound, ClientVersion clientVersion) {
        long l = a ^ 0x3284616C3D99L;
        CallSite callSite = clientVersion.CP_w(ClientVersion.V_1_20_5) ? ParticleItemStackData.a("e", (int)32374, (long)(0x538748567C2000FCL ^ l)) : ParticleItemStackData.a("e", (int)1570, (long)(0x7D5767C93BE478A9L ^ l));
        CP_Cg ilIlCg = CP_Cg.CP_z(nBTCompound.getTagOrThrow((String)((Object)callSite)), clientVersion);
        return new ParticleItemStackData(ilIlCg);
    }

    public static void encode(ParticleItemStackData particleItemStackData, ClientVersion clientVersion, NBTCompound nBTCompound) {
        long l = a ^ 0x295AA107A84AL;
        CallSite callSite = clientVersion.CP_w(ClientVersion.V_1_20_5) ? ParticleItemStackData.a("e", (int)20136, (long)(0x638B7044C141A5F2L ^ l)) : ParticleItemStackData.a("e", (int)23536, (long)(0xB62FBF977CE30ABL ^ l));
        nBTCompound.setTag((String)((Object)callSite), CP_Cg.CP_i(particleItemStackData.itemStack, clientVersion));
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public LegacyParticleData toLegacy(ClientVersion clientVersion) {
        return LegacyParticleData.ofTwo(this.itemStack.CP_J().CP_H(clientVersion), this.itemStack.CP_E());
    }

    public boolean equals(Object object) {
        Object object2;
        block3: {
            block4: {
                block2: {
                    long l = a ^ 0x71468D056DA2L;
                    String[] stringArray = CP_ut.CP_c();
                    if (object == null) break block2;
                    object2 = this.getClass();
                    if (stringArray != null) break block3;
                    if (object2 == object.getClass()) break block4;
                }
                return false;
            }
            object2 = object;
        }
        ParticleItemStackData particleItemStackData = (ParticleItemStackData)object2;
        return this.itemStack.equals(particleItemStackData.itemStack);
    }

    public int hashCode() {
        return Objects.hashCode(this.itemStack);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                ParticleItemStackData.a = CP_s.a(-281712786797865248L, -2773642733151287000L, MethodHandles.lookup().lookupClass()).a(277138964030038L);
                ParticleItemStackData.d = new HashMap<K, V>(13);
                var0 = ParticleItemStackData.a ^ 67438448797930L;
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
                var6_5 = "\u00a9\u00dfSwD\u00e3\u00d9 p?\u008c^\u00dc\b\u00e3\u0080\u0010\r\u008d\\\u00d9d!A\u00c8\u0000\u0005\u000by7\u00fa\u0093i";
                var8_6 = "\u00a9\u00dfSwD\u00e3\u00d9 p?\u008c^\u00dc\b\u00e3\u0080\u0010\r\u008d\\\u00d9d!A\u00c8\u0000\u0005\u000by7\u00fa\u0093i".length();
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
                    var9_3[var7_4++] = ParticleItemStackData.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "F\n7\u0097S\u00cc\u00d1\u00dd\u001c\u00df\u00ed\u00deE\u000f\u00eas\u0010\u00ef\u00f3d5\u00b1i8\u008e\u00d1_C\u0093\u00a2\u007f`\u00e6";
                    var8_6 = "F\n7\u0097S\u00cc\u00d1\u00dd\u001c\u00df\u00ed\u00deE\u000f\u00eas\u0010\u00ef\u00f3d5\u00b1i8\u008e\u00d1_C\u0093\u00a2\u007f`\u00e6".length();
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
                    var9_3[var7_4++] = ParticleItemStackData.a(var10_9).intern();
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
        ParticleItemStackData.b = var9_3;
        ParticleItemStackData.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x79A6;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/data/ParticleItemStackData", exception);
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
            ParticleItemStackData.c[n2] = ParticleItemStackData.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = ParticleItemStackData.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/data/ParticleItemStackData" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(ParticleItemStackData.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

