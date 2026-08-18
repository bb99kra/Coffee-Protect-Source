/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
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
import me.nik.coffeeprotect.CP_jf;
import me.nik.coffeeprotect.CP_ju;
import me.nik.coffeeprotect.CP_x5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CP_jy
extends CP_ju {
    private static final long a = CP_s.a(-3570871936624457788L, -4384268528697976604L, MethodHandles.lookup().lookupClass()).a(172994264061024L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String vmupfsDwtV = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    protected String CP_C() {
        long l = a ^ 0x5F39B49D282EL;
        return CP_jy.a("d", (int)16995, (long)(0xE8C50A647D28376L ^ l));
    }

    @Override
    protected String CP_V() {
        long l = a ^ 0x4A38F67372B7L;
        return CP_jy.a("d", (int)13482, (long)(0x7164FB0D7F022F27L ^ l));
    }

    @Override
    protected String CP_d() {
        long l = a ^ 0x606FC173F567L;
        return CP_jy.a("d", (int)20922, (long)(0x4A5128CBF5D9CDE4L ^ l));
    }

    @Override
    protected String CP_a() {
        return CP_x5.DISCONNECT.CP_a();
    }

    @Override
    protected int CP_X() {
        return 2;
    }

    @Override
    protected boolean CP_r() {
        return true;
    }

    @Override
    protected void CP_M(CommandSender commandSender, String[] stringArray) {
        long l = a ^ 0x988F06ADED0L;
        Player player = Bukkit.getPlayer((String)stringArray[1]);
        boolean bl = CP_jf.CP_P();
        if (bl) {
            if (player == null) {
                return;
            }
            CoffeeProtect.CP_K().disconnect(player);
        }
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
        long l = a ^ 0x8F889E45E70L;
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
        String string = "\u00e7\u00b2a}\u00f1\u00d9.X\u0003\u00b4\u00ce\u00efw\u00a1\u00f9\u00d1\u00b4\u00e2\u00b7\u00c8U\u00cd\u00ff\u00a7\u00bf\u000e\u00cb%\u00a9\u0080'%@\u00d0\u00db\u00f9\f\u00d7\u00da\u00ef\u008d!\u0097@4~\u0080\u001e\u001f\u00f1I\u007f\u0087q\u00fa\u00bff\u001df\u00b9\u009c2-\\\u0096\u00ca\u009c5C}F\u00b9\u0098\u00f8R+X]\u0085%\u0090u]\u00ebF1H\u00ac\u0017\u00ca!\u00f5\u00b1\u00c7\u001b/\u00fe@\"\u00a6\u00ea\u00e994\u0083\u0015\u00b2\u00c3Z\u00e3\u009e\u000e\u00beA\u0017ucz?\u0000\u00bd]\u00bdn\u00b6\u0017\u00d2(\u00b6\u00c6\u00f78RW\u000erOM~drS\u00af\u00f7\u00c7\u0016\u00b8\u00a0\u009b\u000eQ\u00d5\u009fb2\u0001\u00842\u0089\u00ec\u00f9\u008a";
        int n2 = "\u00e7\u00b2a}\u00f1\u00d9.X\u0003\u00b4\u00ce\u00efw\u00a1\u00f9\u00d1\u00b4\u00e2\u00b7\u00c8U\u00cd\u00ff\u00a7\u00bf\u000e\u00cb%\u00a9\u0080'%@\u00d0\u00db\u00f9\f\u00d7\u00da\u00ef\u008d!\u0097@4~\u0080\u001e\u001f\u00f1I\u007f\u0087q\u00fa\u00bff\u001df\u00b9\u009c2-\\\u0096\u00ca\u009c5C}F\u00b9\u0098\u00f8R+X]\u0085%\u0090u]\u00ebF1H\u00ac\u0017\u00ca!\u00f5\u00b1\u00c7\u001b/\u00fe@\"\u00a6\u00ea\u00e994\u0083\u0015\u00b2\u00c3Z\u00e3\u009e\u000e\u00beA\u0017ucz?\u0000\u00bd]\u00bdn\u00b6\u0017\u00d2(\u00b6\u00c6\u00f78RW\u000erOM~drS\u00af\u00f7\u00c7\u0016\u00b8\u00a0\u009b\u000eQ\u00d5\u009fb2\u0001\u00842\u0089\u00ec\u00f9\u008a".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_jy.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5C63;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_jy", exception);
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
            CP_jy.c[n2] = CP_jy.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_jy.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_jy" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_jy.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
