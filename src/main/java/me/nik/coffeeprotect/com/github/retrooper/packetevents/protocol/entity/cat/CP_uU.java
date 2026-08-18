/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_QC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_Xq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.StaticCatSoundVariant;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_uU {
    private static final VersionedRegistry<CP_QC> CP_z;
    public static final CP_QC CP_A;
    public static final CP_QC CP_Y;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String RamjOyAFYy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_uU() {
    }

    @ApiStatus.Internal
    private static CP_QC CP_w(String string, String string2) {
        long l = a ^ 0x3FB4B3B1F652L;
        CP_Xq ilIlXq = CP_Xq.CP_L((String)((Object)CP_uU.a("n", (int)14060, (long)(0x243AC2AC4F20E151L ^ l))) + string2 + ".");
        CP_Xq ilIlXq2 = CP_Xq.CP_L((String)((Object)CP_uU.a("n", (int)29153, (long)(0x5B6118D9A0F5265EL ^ l))));
        return CP_z.define(string, typesBuilderData -> new StaticCatSoundVariant((TypesBuilderData)typesBuilderData, ilIlXq, ilIlXq2));
    }

    public static VersionedRegistry<CP_QC> CP_I() {
        return CP_z;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_uU.a = CP_s.a(-2880015178974304148L, 2621750748948346468L, MethodHandles.lookup().lookupClass()).a(187499118813421L);
                var9 = CP_uU.a ^ 34857344345329L;
                CP_uU.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[7];
                var5_4 = 0;
                var4_5 = "\u0086\u0092\u00f0\u00c1\u00bf\u0081-\u00e51\u00e9#}!?2\u00b8\u00dd\u008c\u00e3\u008c\u00a8\u008d\u001e=\u00ca\u00adJ\u00f9A\u001b\u00ceO\\ g\u0003\u000fcy\u00d2\u0010W\u008f\u00a5U\u0003i\u00b0\u00b1\n\u00fas\u00ff*\u00a2\u0096\u00f8\u0010\u0016C\u00e8\u0089oC\u00cf\u00ef{\u0092\u001b~}\u0012IJ\u0010\u0089*\u007fn\u00f0+(\u00b9q\u00c9\u009b\u00da\u00d5s\u009bU\u0010>\u0012\u0019\u00e5\u0018\u00a8\u00dc\u00ed\u00f9\u0097\u0080\u00cb\u00db\u00be\u00e2b";
                var6_6 = "\u0086\u0092\u00f0\u00c1\u00bf\u0081-\u00e51\u00e9#}!?2\u00b8\u00dd\u008c\u00e3\u008c\u00a8\u008d\u001e=\u00ca\u00adJ\u00f9A\u001b\u00ceO\\ g\u0003\u000fcy\u00d2\u0010W\u008f\u00a5U\u0003i\u00b0\u00b1\n\u00fas\u00ff*\u00a2\u0096\u00f8\u0010\u0016C\u00e8\u0089oC\u00cf\u00ef{\u0092\u001b~}\u0012IJ\u0010\u0089*\u007fn\u00f0+(\u00b9q\u00c9\u009b\u00da\u00d5s\u009bU\u0010>\u0012\u0019\u00e5\u0018\u00a8\u00dc\u00ed\u00f9\u0097\u0080\u00cb\u00db\u00be\u00e2b".length();
                var3_7 = 40;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = CP_uU.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u00052v\u00f1\u0019\u0092%\u008a#\u00f1J\u00d3\u00f3$,\u00e7\u00b7Y\u0095\u008f\u00f1WRd\u00b8\u00be\u00be\u0084X\u00ee\u00ca\u00e2(\u00e3\u00e2\u00a4\u00ebt9\u00bf\u00da;\u008c\u00104b\u0080\u00c3\u0099\u00c4\u00d1$\u00d7\u00db\u00c4\u00e4\u008d\u00ccv\u0099'X\u008b&\f\u00f4\u00c8\u00da\u0091\u0087\u00abi\u0018";
                    var6_6 = "\u00052v\u00f1\u0019\u0092%\u008a#\u00f1J\u00d3\u00f3$,\u00e7\u00b7Y\u0095\u008f\u00f1WRd\u00b8\u00be\u00be\u0084X\u00ee\u00ca\u00e2(\u00e3\u00e2\u00a4\u00ebt9\u00bf\u00da;\u008c\u00104b\u0080\u00c3\u0099\u00c4\u00d1$\u00d7\u00db\u00c4\u00e4\u008d\u00ccv\u0099'X\u008b&\f\u00f4\u00c8\u00da\u0091\u0087\u00abi\u0018".length();
                    var3_7 = 32;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = CP_uU.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        CP_uU.b = var7_3;
        CP_uU.c = new String[7];
        CP_uU.CP_z = new VersionedRegistry<T>((String)CP_uU.a("n", (int)7064, (long)(1377650071071923842L ^ var9)));
        CP_uU.CP_A = CP_uU.CP_w((String)CP_uU.a("n", (int)32590, (long)(3307090573503593047L ^ var9)), (String)CP_uU.a("n", (int)6885, (long)(2917132793224470526L ^ var9)));
        CP_uU.CP_Y = CP_uU.CP_w((String)CP_uU.a("n", (int)20337, (long)(9030301472547818089L ^ var9)), (String)CP_uU.a("n", (int)22398, (long)(8288051701407699553L ^ var9)));
        CP_uU.CP_z.unloadMappings();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6F41;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/CP_uU", exception);
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
            CP_uU.c[n2] = CP_uU.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_uU.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/CP_uU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_uU.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

