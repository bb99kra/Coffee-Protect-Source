/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_d0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_iI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_OU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.kyori.adventure.key.KeyPattern;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_uA {
    public static final CP_OU<CP_uA> CP_M;
    public static final NbtCodec<CP_uA> CP_k;
    private final ResourceLocation CP_c;
    private final ResourceLocation CP_Q;
    private final ResourceLocation CP_i;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String ZAVUaTgibM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_uA(ResourceLocation resourceLocation, ResourceLocation resourceLocation2, ResourceLocation resourceLocation3) {
        this.CP_c = resourceLocation;
        this.CP_Q = resourceLocation2;
        this.CP_i = resourceLocation3;
    }

    @ApiStatus.Internal
    public static CP_uA CP_N(@KeyPattern.Namespace String string, @KeyPattern.Value String string2, @KeyPattern.Value String string3) {
        long l = a ^ 0x595A9BB55FDCL;
        return new CP_uA(new ResourceLocation(string, string2 + string3), new ResourceLocation(string, string2 + (String)((Object)CP_uA.a("z", (int)15179, (long)(0x36F8A1E5CA3D8658L ^ l))) + string3), new ResourceLocation(string, string2 + (String)((Object)CP_uA.a("z", (int)32638, (long)(0x4F7E0E0F3754C26CL ^ l))) + string3));
    }

    public ResourceLocation CP_E() {
        return this.CP_c;
    }

    public ResourceLocation CP_N() {
        return this.CP_Q;
    }

    public ResourceLocation CP_Q() {
        return this.CP_i;
    }

    public boolean equals(Object object) {
        long l = a ^ 0x182D94498218L;
        int n = CP_d0.CP_R();
        Object object2 = object;
        if (n == 0) {
            if (!(object2 instanceof CP_uA)) {
                return false;
            }
            object2 = object;
        }
        CP_uA ilIluA = (CP_uA)object2;
        boolean bl = this.CP_c.equals(ilIluA.CP_c);
        if (n == 0) {
            if (!bl) {
                return false;
            }
            bl = this.CP_Q.equals(ilIluA.CP_Q);
        }
        if (n == 0) {
            if (!bl) {
                return false;
            }
            bl = this.CP_i.equals(ilIluA.CP_i);
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash(this.CP_c, this.CP_Q, this.CP_i);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-3592093284983013076L, -104858918261947435L, MethodHandles.lookup().lookupClass()).a(221272120941919L);
        d = new HashMap(13);
        long l = a ^ 0x63519940CC0EL;
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
        String string = "\u00f9\u00ab\u00eae\b4\u001a?\u009d\u00a3\u0000\u0001i\u00b2\u007f\u008c\u0010\u00f0\t\u00ae\u008a14>y\u00fe%\u0011\u000b\u0014\u0084\u00f6@";
        int n2 = "\u00f9\u00ab\u00eae\b4\u001a?\u009d\u00a3\u0000\u0001i\u00b2\u007f\u008c\u0010\u00f0\t\u00ae\u008a14>y\u00fe%\u0011\u000b\u0014\u0084\u00f6@".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_uA.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[2];
                CP_M = new CP_iI();
                CP_k = CP_M.CP_q();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x43FC;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/CP_uA", exception);
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
            CP_uA.c[n2] = CP_uA.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_uA.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/CP_uA" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_uA.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

