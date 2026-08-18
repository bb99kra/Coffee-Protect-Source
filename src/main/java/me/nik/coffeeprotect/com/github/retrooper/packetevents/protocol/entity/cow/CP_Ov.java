/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_vo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_Gq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_QO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_Ov {
    public static final NbtCodec<CP_Ov> CP_V;
    private final CP_QO CP_C;
    private final CP_QO CP_D;
    private final CP_QO CP_f;
    private final CP_QO CP_W;
    private static PacketWrapper[] CP_M;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String IdwYZveOco = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Ov(CP_QO ilIlQO, CP_QO ilIlQO2, CP_QO ilIlQO3, CP_QO ilIlQO4) {
        this.CP_C = ilIlQO;
        this.CP_D = ilIlQO2;
        this.CP_f = ilIlQO3;
        this.CP_W = ilIlQO4;
    }

    @ApiStatus.Internal
    public static CP_Ov CP_J(String string) {
        long l = a ^ 0x17E032F3B477L;
        VersionedRegistry<CP_QO> versionedRegistry = CP_Gq.CP_o();
        CP_QO ilIlQO = (CP_QO)versionedRegistry.CP_u(string + (String)((Object)CP_Ov.a("t", (int)31004, (long)(0x7F9C23D87E8A497L ^ l))));
        CP_QO ilIlQO2 = (CP_QO)versionedRegistry.CP_u(string + (String)((Object)CP_Ov.a("t", (int)8107, (long)(0x21D004957F5D4222L ^ l))));
        CP_QO ilIlQO3 = (CP_QO)versionedRegistry.CP_u(string + (String)((Object)CP_Ov.a("t", (int)32213, (long)(0x7B33EDB3ED3A205DL ^ l))));
        CP_QO ilIlQO4 = (CP_QO)versionedRegistry.CP_u(string + (String)((Object)CP_Ov.a("t", (int)19821, (long)(0x7C309C80B59910E7L ^ l))));
        return new CP_Ov(ilIlQO, ilIlQO2, ilIlQO3, ilIlQO4);
    }

    public CP_QO CP_A() {
        return this.CP_C;
    }

    public CP_QO CP_z() {
        return this.CP_D;
    }

    public CP_QO CP_Z() {
        return this.CP_f;
    }

    public CP_QO CP_n() {
        return this.CP_W;
    }

    public boolean equals(Object object) {
        long l = a ^ 0xD5B10CF5C0AL;
        PacketWrapper[] packetWrapperArray = CP_Ov.CP_u();
        Object object2 = object;
        if (packetWrapperArray != null) {
            if (!(object2 instanceof CP_Ov)) {
                return false;
            }
            object2 = object;
        }
        CP_Ov ilIlOv = (CP_Ov)object2;
        boolean bl = this.CP_C.equals(ilIlOv.CP_C);
        if (packetWrapperArray != null) {
            if (!bl) {
                return false;
            }
            bl = this.CP_D.equals(ilIlOv.CP_D);
        }
        if (packetWrapperArray != null) {
            if (!bl) {
                return false;
            }
            bl = this.CP_f.equals(ilIlOv.CP_f);
        }
        if (packetWrapperArray != null) {
            if (!bl) {
                return false;
            }
            bl = this.CP_W.equals(ilIlOv.CP_W);
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash(this.CP_C, this.CP_D, this.CP_f, this.CP_W);
    }

    static /* synthetic */ CP_QO CP_P(CP_Ov ilIlOv) {
        return ilIlOv.CP_C;
    }

    static /* synthetic */ CP_QO CP_J(CP_Ov ilIlOv) {
        return ilIlOv.CP_D;
    }

    static /* synthetic */ CP_QO CP_A(CP_Ov ilIlOv) {
        return ilIlOv.CP_f;
    }

    static /* synthetic */ CP_QO CP_y(CP_Ov ilIlOv) {
        return ilIlOv.CP_W;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_Ov.a = CP_s.a(2238156240968955881L, -441703529701504848L, MethodHandles.lookup().lookupClass()).a(191648943582300L);
                CP_Ov.d = new HashMap<K, V>(13);
                var0 = CP_Ov.a ^ 4696852979893L;
                CP_Ov.CP_Q(new PacketWrapper[1]);
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
                var6_5 = "\u00c0\u00db\u00ab\u00e1\u00d0h\u00f5L\u00bf\u00a2\u00ca{\u00fbu\u00b8\u00b5\u0010V\u00ceB\u0080H\u0097\u0092'\u00a7\u0001\u007f\u00be$\u00cf\u0010\u00ed";
                var8_6 = "\u00c0\u00db\u00ab\u00e1\u00d0h\u00f5L\u00bf\u00a2\u00ca{\u00fbu\u00b8\u00b5\u0010V\u00ceB\u0080H\u0097\u0092'\u00a7\u0001\u007f\u00be$\u00cf\u0010\u00ed".length();
                var5_7 = 16;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_Ov.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00a7\u00c8$\u00aa\u00a2\u00ceR\u00bc\u0087:\u00e9^X\u0003\u00d1\u009f\u0010\u00de\u000f\u00f1\u00eb'\u0090\u0001\u001a\u0002\u001b\n\u00bc\u0012\u00d3\u00952";
                    var8_6 = "\u00a7\u00c8$\u00aa\u00a2\u00ceR\u00bc\u0087:\u00e9^X\u0003\u00d1\u009f\u0010\u00de\u000f\u00f1\u00eb'\u0090\u0001\u001a\u0002\u001b\n\u00bc\u0012\u00d3\u00952".length();
                    var5_7 = 16;
                    var4_8 = -1;
lbl35:
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
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_Ov.a(var10_9).intern();
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        CP_Ov.b = var9_3;
        CP_Ov.c = new String[4];
        CP_Ov.CP_V = new CP_vo().CP_q();
    }

    public static void CP_Q(PacketWrapper[] packetWrapperArray) {
        CP_M = packetWrapperArray;
    }

    public static PacketWrapper[] CP_u() {
        return CP_M;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x473A;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/CP_Ov", exception);
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
            CP_Ov.c[n2] = CP_Ov.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Ov.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/CP_Ov" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Ov.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

