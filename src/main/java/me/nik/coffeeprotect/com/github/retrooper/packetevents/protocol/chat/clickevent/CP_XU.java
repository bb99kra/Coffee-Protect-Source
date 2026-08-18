/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_dW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_rj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.clickevent.CP_ui;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.event.CP_nh;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_XU
implements CP_ui {
    private final String CP_D;
    private static int CP_UnderScore;
    private static final long a;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static transient /* synthetic */ String cKQvypDWdp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_XU(String string) {
        this.CP_D = string;
    }

    public static CP_XU CP_b(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x4E11DA10E594L;
        boolean bl = packetWrapper.CP_w().CP_z(ServerVersion.V_1_21_5);
        String string = nBTCompound.getStringTagValueOrThrow((String)((Object)(bl ? CP_XU.b("a", (int)18917, (long)(0x584007BDB4E6FEC1L ^ l)) : CP_XU.b("a", (int)9133, (long)(0x2EBCFE1BE1D19488L ^ l)))));
        return new CP_XU(string);
    }

    public static void CP_C(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, CP_XU ilIlXU) {
        long l = a ^ 0x3955D3A2DBF9L;
        boolean bl = packetWrapper.CP_w().CP_z(ServerVersion.V_1_21_5);
        nBTCompound.setTag((String)((Object)(bl ? CP_XU.b("a", (int)8092, (long)(0x2B43F8C1775316D7L ^ l)) : CP_XU.b("a", (int)10504, (long)(0x68251CA8E5DAA042L ^ l)))), new NBTString(ilIlXU.CP_D));
    }

    @Override
    public CP_rj<?> CP_s() {
        return CP_dW.CP_R;
    }

    @Override
    public CP_nh CP_g() {
        return CP_nh.CP_D(this.CP_D);
    }

    public String CP_l() {
        return this.CP_D;
    }

    public static void CP_A(int n) {
        CP_UnderScore = n;
    }

    public static int CP_T() {
        return CP_UnderScore;
    }

    public static int CP_v() {
        int n = CP_XU.CP_T();
        if (n == 0) {
            return 50;
        }
        return 0;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_XU.a = CP_s.a(3658411279736000629L, 4694627182956987092L, MethodHandles.lookup().lookupClass()).a(183638460995882L);
                CP_XU.h = new HashMap<K, V>(13);
                CP_XU.CP_A(0);
                var0 = CP_XU.a ^ 38902687334692L;
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
                var6_5 = "\u00c7\u00df\u00db\u000ex\u00e8\u0092\u0089\t\u00a1\u00f2C\u00ad\u0011\u0080\u00eb\u0010$]\u00b2;J\u00c7T\u00d5\u00ec\u001c\u00a9\u0086\u000f\u00d2\u00b9\u0006";
                var8_6 = "\u00c7\u00df\u00db\u000ex\u00e8\u0092\u0089\t\u00a1\u00f2C\u00ad\u0011\u0080\u00eb\u0010$]\u00b2;J\u00c7T\u00d5\u00ec\u001c\u00a9\u0086\u000f\u00d2\u00b9\u0006".length();
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
                    var9_3[var7_4++] = CP_XU.b(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "D\u00b4\u00d5\u00a2\u001b*\u00a7^~\u008bWW\u00f8\u0085\u0098\u00f6\u0010\u001d\u00c50&#E\u00b2I\u009a\u0005r\u00aa\u00e0p\u00eb\u0086";
                    var8_6 = "D\u00b4\u00d5\u00a2\u001b*\u00a7^~\u008bWW\u00f8\u0085\u0098\u00f6\u0010\u001d\u00c50&#E\u00b2I\u009a\u0005r\u00aa\u00e0p\u00eb\u0086".length();
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
                    var9_3[var7_4++] = CP_XU.b(var10_9).intern();
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
        CP_XU.f = var9_3;
        CP_XU.g = new String[4];
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x789B;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_XU", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            CP_XU.g[n2] = CP_XU.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_XU.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/clickevent/CP_XU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_XU.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

