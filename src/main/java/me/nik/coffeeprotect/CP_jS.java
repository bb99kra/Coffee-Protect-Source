/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Og;
import me.nik.coffeeprotect.CP_Tz;
import me.nik.coffeeprotect.CP_ju;
import me.nik.coffeeprotect.CP_x5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CP_jS
extends CP_ju {
    private final CoffeeProtect CP_N;
    private static final long a = CP_s.a(7635839213217543297L, 6962304832109031096L, MethodHandles.lookup().lookupClass()).a(47094924054803L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String hoDEEEtAFf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_jS(CoffeeProtect coffeeProtect) {
        this.CP_N = coffeeProtect;
    }

    @Override
    protected String CP_C() {
        long l = a ^ 0x49346B4BAD8AL;
        return CP_jS.a("v", (int)14850, (long)(0x52EE8985B0A7B26DL ^ l));
    }

    @Override
    protected String CP_V() {
        long l = a ^ 0x5C3529A5F713L;
        return CP_jS.a("v", (int)27535, (long)(0x77FCCE9BE4F3397BL ^ l));
    }

    @Override
    protected String CP_d() {
        long l = a ^ 0x76621EA570C3L;
        return CP_jS.a("v", (int)15013, (long)(0x593C610479756F82L ^ l));
    }

    @Override
    protected String CP_a() {
        return CP_x5.MENU.CP_a();
    }

    @Override
    protected int CP_X() {
        return 1;
    }

    @Override
    protected boolean CP_r() {
        return false;
    }

    @Override
    protected void CP_M(CommandSender commandSender, String[] stringArray) {
        new CP_Og(new CP_Tz((Player)commandSender), this.CP_N).CP_M();
    }

    @Override
    protected List<String> CP_b(CommandSender commandSender, String[] stringArray) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x27143D1A32D0L;
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "\u00e7\u00e3\u00a1zgL\u0080\u00f1\u009aT\u001a6\u00e5\u000b\f\u00ae(_g#\u0007t/]\u00ca\tYe\u0004\u0013\u00b5\u0082\u00ef\u00e4\u00a0[\u000b\u00e7\u0098\u00e1;\b\u00a1\u00d9\u00d1\u0011\u001a\u00e1>\u00ab\"\u00efN'+XB8\u0019-\u00ae|~w\u00d7\u00cdVkO\u0014b\u00d0 2\u00b4\u00e2\u001e\u00e6:?\u0005I\u0003$qt\u00d7O \u00a8\u00bb\u000b\u0011\u0088\u0005l*\u00b6\u00f4\u00e1\u0098\u00cf\u00c9\u001c\u009a4?8?G\u00e2q\u00e9\u00d0";
        int n2 = "\u00e7\u00e3\u00a1zgL\u0080\u00f1\u009aT\u001a6\u00e5\u000b\f\u00ae(_g#\u0007t/]\u00ca\tYe\u0004\u0013\u00b5\u0082\u00ef\u00e4\u00a0[\u000b\u00e7\u0098\u00e1;\b\u00a1\u00d9\u00d1\u0011\u001a\u00e1>\u00ab\"\u00efN'+XB8\u0019-\u00ae|~w\u00d7\u00cdVkO\u0014b\u00d0 2\u00b4\u00e2\u001e\u00e6:?\u0005I\u0003$qt\u00d7O \u00a8\u00bb\u000b\u0011\u0088\u0005l*\u00b6\u00f4\u00e1\u0098\u00cf\u00c9\u001c\u009a4?8?G\u00e2q\u00e9\u00d0".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_jS.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1519;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_jS", exception);
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
            CP_jS.c[n2] = CP_jS.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_jS.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_jS" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_jS.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
