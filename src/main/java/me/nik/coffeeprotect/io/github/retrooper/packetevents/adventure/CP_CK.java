/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.SortedMap;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_OY;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_PH;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_PP;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_fk;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_nK;
import org.jspecify.annotations.Nullable;

final class CP_CK
implements CP_PP {
    private final CP_PH CP_f;
    private final SortedMap<Integer, CP_OY> CP_J;
    private final int CP_R;
    private final CP_OY CP_n;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String irUUguiOor = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_CK(CP_PH ilIlPH, SortedMap<Integer, CP_OY> sortedMap, int n, CP_OY ilIlOY) {
        this.CP_f = ilIlPH;
        this.CP_J = sortedMap;
        this.CP_R = n;
        this.CP_n = ilIlOY;
    }

    @Override
    public CP_PH CP_p() {
        return this.CP_f;
    }

    @Override
    public boolean CP_Q(CP_fk<?> ilIlfk) {
        return this.CP_n.CP_Q(ilIlfk);
    }

    @Override
    public <V> @Nullable V CP_d(CP_fk<V> ilIlfk) {
        return this.CP_n.CP_d(ilIlfk);
    }

    @Override
    public Map<Integer, CP_OY> CP_P() {
        return Collections.unmodifiableSortedMap(this.CP_J.headMap(this.CP_R + 1));
    }

    @Override
    public CP_PP CP_D(int n) {
        return new CP_CK(this.CP_f, this.CP_J, n, CP_CK.CP_B(this.CP_f, this.CP_J, n));
    }

    public static CP_OY CP_B(CP_PH ilIlPH, SortedMap<Integer, CP_OY> sortedMap, int n) {
        CP_nK ilIlnK;
        block2: {
            long l = a ^ 0x64C62909B7CAL;
            SortedMap<Integer, CP_OY> sortedMap2 = sortedMap.headMap(n + 1);
            CP_nK ilIlnK2 = ilIlPH.CP_S();
            Iterator iterator = sortedMap2.values().iterator();
            int[] nArray = CP_v_.CP_l();
            while (iterator.hasNext()) {
                CP_OY ilIlOY = (CP_OY)iterator.next();
                ilIlnK = ilIlnK2.CP_Z(ilIlOY);
                if (nArray == null) {
                    if (nArray == null) continue;
                }
                break block2;
            }
            ilIlnK = ilIlnK2;
        }
        return ilIlnK.CP_z();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object object) {
        long l = a ^ 0x508BB775289EL;
        int[] nArray = CP_v_.CP_l();
        Object object2 = this;
        if (nArray == null) {
            if (object2 == object) {
                return true;
            }
            object2 = object;
        }
        if (object2 == null) return false;
        Object object3 = this.getClass();
        if (nArray == null) {
            if (object3 != object.getClass()) {
                return false;
            }
            object3 = object;
        }
        CP_CK ilIlCK = (CP_CK)object3;
        boolean bl = this.CP_R;
        if (nArray == null) {
            if (bl != ilIlCK.CP_R) return false;
            bl = Objects.equals(this.CP_f, ilIlCK.CP_f);
        }
        if (nArray == null) {
            if (!bl) return false;
            bl = Objects.equals(this.CP_J, ilIlCK.CP_J);
        }
        if (nArray == null) {
            if (!bl) return false;
            bl = Objects.equals(this.CP_n, ilIlCK.CP_n);
        }
        if (nArray != null) return bl;
        if (!bl) return false;
        return true;
    }

    public int hashCode() {
        long l = a ^ 0x54935FFAFE19L;
        int[] nArray = CP_v_.CP_l();
        int n = Objects.hash(this.CP_f, this.CP_J, this.CP_R, this.CP_n);
        if (PacketWrapper.CP_z() == null) {
            CP_v_.CP_o(new int[2]);
        }
        return n;
    }

    public String toString() {
        long l = a ^ 0x79118742369AL;
        int[] nArray = CP_v_.CP_l();
        String string = this.getClass().getSimpleName() + (String)((Object)CP_CK.a("y", (int)11281, (long)(0x40883540E26DDE13L ^ l))) + this.CP_f + (String)((Object)CP_CK.a("y", (int)1396, (long)(0x7C324062757777L ^ l))) + this.CP_J + (String)((Object)CP_CK.a("y", (int)14201, (long)(0x3528FA0303AD4579L ^ l))) + this.CP_R + (String)((Object)CP_CK.a("y", (int)31372, (long)(0x2CA552E341A5888DL ^ l))) + this.CP_n + (char)e;
        if (nArray != null) {
            PacketWrapper.CP_e(new int[2]);
        }
        return string;
    }

    static CP_OY CP_Q(CP_CK ilIlCK) {
        return ilIlCK.CP_n;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_CK.a = CP_s.a(5214339231819302017L, -4529412556033417115L, MethodHandles.lookup().lookupClass()).a(131433200456515L);
                    CP_CK.d = new HashMap<K, V>(13);
                    var5 = CP_CK.a ^ 10287705236335L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[4];
                    var12_4 = 0;
                    var11_5 = "\fJB\u00f9\u00ed:\u0092\u0005%\u001bAI\u001cn\"s\u0089wcR\u00c6\u00c3O\u00fe(\u00aaj\u00df6\u00e0\u00ba\u00b3\u00aesb\u0001\u00b6\u00d8\u00fe\u00fel\u00de1\u001a\u0092\u008d\u00cb\u00f2\u00feK\u00ca\u00bb=\u009c\\\u00ad\u00cd\u00b8P\u00e4\u00ba(\u00b8\u0014\u0015";
                    var13_6 = "\fJB\u00f9\u00ed:\u0092\u0005%\u001bAI\u001cn\"s\u0089wcR\u00c6\u00c3O\u00fe(\u00aaj\u00df6\u00e0\u00ba\u00b3\u00aesb\u0001\u00b6\u00d8\u00fe\u00fel\u00de1\u001a\u0092\u008d\u00cb\u00f2\u00feK\u00ca\u00bb=\u009c\\\u00ad\u00cd\u00b8P\u00e4\u00ba(\u00b8\u0014\u0015".length();
                    var10_7 = 24;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = CP_CK.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u001b\fq\u00f6=!b\u00c4\u00b5`\u00b0\u0088H.\u00dfJ *\u0007_5\n\u00eeF\u0090m\u00ef\u0091\u00ed6\u00a2},\u00d1\u00e3g\u00f93\u00b2\u0014\u00fdh\u00e5V\u00a67\u00feA~";
                        var13_6 = "\u001b\fq\u00f6=!b\u00c4\u00b5`\u00b0\u0088H.\u00dfJ *\u0007_5\n\u00eeF\u0090m\u00ef\u0091\u00ed6\u00a2},\u00d1\u00e3g\u00f93\u00b2\u0014\u00fdh\u00e5V\u00a67\u00feA~".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = CP_CK.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            CP_CK.b = var14_3;
            CP_CK.c = new String[4];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 3230117252784727876L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_CK.e = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3CB1;
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
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/CP_CK", exception);
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
            CP_CK.c[n2] = CP_CK.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_CK.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/CP_CK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_CK.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

