/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.md_5.bungee.api.ChatMessageType
 *  net.md_5.bungee.api.chat.BaseComponent
 *  net.md_5.bungee.api.chat.TextComponent
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_qb;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import net.md_5.bungee.api.ChatMessageType;
import net.md_5.bungee.api.chat.BaseComponent;
import net.md_5.bungee.api.chat.TextComponent;
import org.bukkit.entity.Player;

public final class CP_QU {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String RCulHeOifj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_QU() {
    }

    /*
     * Unable to fully structure code
     */
    public static void CP_Y(Player var0, String var1_1) {
        block7: {
            var2_2 = CP_QU.a ^ 58164444526585L;
            var4_3 = CP_qb.CP_t();
            try {
                v0 = var0;
                if (var4_3 != null) {
                    if (v0 != null) break block7;
                }
                ** GOTO lbl15
            }
            catch (NoSuchMethodError v1) {
                throw CP_QU.a(v1);
            }
            return;
        }
        try {
            v0 = var0;
lbl15:
            // 2 sources

            v0.spigot().sendMessage(ChatMessageType.ACTION_BAR, (BaseComponent)new TextComponent(CP_rW.CP_W(var1_1)));
        }
        catch (NoSuchMethodError var5_4) {
            try {
                var6_5 = CP_qb.CP_r(CP_qb.CP_p((String)CP_QU.a("b", (int)13304, (long)(4202996844343412764L ^ var2_2))), "a", new Class[]{String.class}).invoke(null, new Object[]{(String)CP_QU.a("b", (int)15581, (long)(3674482770410719034L ^ var2_2)) + CP_rW.CP_W(var1_1) + (String)CP_QU.a("b", (int)1354, (long)(1084407007096110763L ^ var2_2))});
                var7_7 = CP_qb.CP_N(CP_qb.CP_p((String)CP_QU.a("b", (int)32343, (long)(7047931936912278961L ^ var2_2))), new Class[]{CP_qb.CP_p((String)CP_QU.a("b", (int)4582, (long)(6513060536923122179L ^ var2_2))), Byte.TYPE}).newInstance(new Object[]{var6_5, (byte)2});
                CP_qb.CP_M(var0, var7_7);
            }
            catch (IllegalAccessException | InstantiationException | InvocationTargetException var6_6) {
                var6_6.printStackTrace();
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_QU.a = CP_s.a(-2259587030225154663L, 145752951321819864L, MethodHandles.lookup().lookupClass()).a(142909347266007L);
                CP_QU.d = new HashMap<K, V>(13);
                var0 = CP_QU.a ^ 96735484348869L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u00b8{\u0015\u0006G\u001d6\u00a7S\u0098\u0090\u0090E\u00f2`:Y\u00d8f\u00db\"yZ4Qa\u00034\u00fb{\u00d6\u00f7\u00dd\u00ab&]RK\u00ca @\u00c8\u00ac\u00e1g-\u00a0\u00aaH\u0087\u001a\u00d0\u0097=\u00d8\u00a6s\u0014\u0083n\u00a3)*]\u00f7FD7\u00d9[\u0013\u00b8\u0097\u00bbf\u00ea\u0016\u0015N\u00bc\\E\u00d9\u00b3uvvJ\u00e6\u0096}\u00dc\u00e5\u00df\u0088\u008d\u00f9J?K*\u0019\u001c\u00a6\u00a1\u0018T\u00c5\u00eac-\u00a1\u00aa\u00c0\u00a8\u0084&\u0084\u00b9H\u00ab\u00caB\u00a74#1Xj'";
                var8_6 = "\u00b8{\u0015\u0006G\u001d6\u00a7S\u0098\u0090\u0090E\u00f2`:Y\u00d8f\u00db\"yZ4Qa\u00034\u00fb{\u00d6\u00f7\u00dd\u00ab&]RK\u00ca @\u00c8\u00ac\u00e1g-\u00a0\u00aaH\u0087\u001a\u00d0\u0097=\u00d8\u00a6s\u0014\u0083n\u00a3)*]\u00f7FD7\u00d9[\u0013\u00b8\u0097\u00bbf\u00ea\u0016\u0015N\u00bc\\E\u00d9\u00b3uvvJ\u00e6\u0096}\u00dc\u00e5\u00df\u0088\u008d\u00f9J?K*\u0019\u001c\u00a6\u00a1\u0018T\u00c5\u00eac-\u00a1\u00aa\u00c0\u00a8\u0084&\u0084\u00b9H\u00ab\u00caB\u00a74#1Xj'".length();
                var5_7 = 40;
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
                    var9_3[var7_4++] = CP_QU.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00c6\u00fd\u0083\u00e9\u00a3\u0002<\u001e\u00f3*\u00afDU\u00ed\u009d\u00eb(K/q\u00c1\u0006\u00b7\u00ae\u0001\u00c7[\u0092\u00a9\u00e1\u00f8@\u00f6O\u00f4\u00a0\u00e5\u00f8|U\u0010\u001e;(\u00f6\u00bc\u0092\u00f8c\u00ac\u009e\u0087\u009a'!ye";
                    var8_6 = "\u00c6\u00fd\u0083\u00e9\u00a3\u0002<\u001e\u00f3*\u00afDU\u00ed\u009d\u00eb(K/q\u00c1\u0006\u00b7\u00ae\u0001\u00c7[\u0092\u00a9\u00e1\u00f8@\u00f6O\u00f4\u00a0\u00e5\u00f8|U\u0010\u001e;(\u00f6\u00bc\u0092\u00f8c\u00ac\u009e\u0087\u009a'!ye".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = CP_QU.a(var10_9).intern();
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
        CP_QU.b = var9_3;
        CP_QU.c = new String[5];
    }

    private static NoSuchMethodError a(NoSuchMethodError noSuchMethodError) {
        return noSuchMethodError;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3A35;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_QU", exception);
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
            CP_QU.c[n2] = CP_QU.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_QU.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_QU" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_QU.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
