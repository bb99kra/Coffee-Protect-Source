/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.command.CommandSender
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
import me.nik.coffeeprotect.IlIlju;
import me.nik.coffeeprotect.IlIlx5;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.command.CommandSender;

public class IlIljb
extends IlIlju {
    private final CoffeeProtect IlIlj;
    private static final long a = IlIls.a((long)-6152108339691767620L, (long)-8115199705135690291L, MethodHandles.lookup().lookupClass()).a(58038640171495L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String TDeaJuadtR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIljb(CoffeeProtect coffeeProtect) {
        this.IlIlj = coffeeProtect;
    }

    @Override
    protected String IlIlC() {
        long l = a ^ 0x8DDBD2DB4D4L;
        return IlIljb.a("p", (int)9656, (long)(0xAC08BFD7E7B1123L ^ l));
    }

    @Override
    protected String IlIlV() {
        long l = a ^ 0x1DDCFFC3EE4DL;
        return IlIljb.a("p", (int)26567, (long)(0x4DA3960CAAFE89C4L ^ l));
    }

    @Override
    protected String IlIld() {
        long l = a ^ 0x378BC8C3699DL;
        return IlIljb.a("p", (int)21346, (long)(0x43C2C7CD540ABAB2L ^ l));
    }

    @Override
    protected String IlIla() {
        return IlIlx5.RELOAD.IlIla();
    }

    @Override
    protected int IlIlX() {
        return 1;
    }

    @Override
    protected boolean IlIlr() {
        return true;
    }

    @Override
    protected void IlIlM(CommandSender commandSender, String[] stringArray) {
        this.IlIlj.IlIlR().IlIlm();
        this.IlIlj.IlIlv().IlIld();
        this.IlIlj.IlIlF().IlIlO().values().forEach(ilIlTM -> ilIlTM.IlIlG().IlIl_());
        commandSender.sendMessage(IlIlxi.RELOADED.IlIlF());
    }

    @Override
    protected List<String> IlIlb(CommandSender commandSender, String[] stringArray) {
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x726F120EEADDL;
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
        String string = "\u009eu\u00c9\u00bf(W$\u001bh\u00e6\u00f8\u009dd\u00c6\u00dc\u00e0(\u00b6\u00bc#\u00db\u00e5\u0005_\u00d6z\u00ce\u00c2{:@\u001a\u00c8}\u00f4\u00c8\r\u00e2\u009b\u0016O\u0011\u001e\u00ef\u0097\u008e\u00ba\u00d7\u008f\u00d9\u00be\u00a87r\u009c\u00c9b(In\u00a6\u0081\u00c8\u00ac_\u00af\u00c3\u00a7\u00e5By\u0091\u009a\u00f1w!G\u00caYG\u00ce\u00df\u0090\u008c\u0084\u0080\u00e8\u00c9u\u00ea\u00dc\u00f1{\u00a6M\u00de\u00c5F";
        int n2 = "\u009eu\u00c9\u00bf(W$\u001bh\u00e6\u00f8\u009dd\u00c6\u00dc\u00e0(\u00b6\u00bc#\u00db\u00e5\u0005_\u00d6z\u00ce\u00c2{:@\u001a\u00c8}\u00f4\u00c8\r\u00e2\u009b\u0016O\u0011\u001e\u00ef\u0097\u008e\u00ba\u00d7\u008f\u00d9\u00be\u00a87r\u009c\u00c9b(In\u00a6\u0081\u00c8\u00ac_\u00af\u00c3\u00a7\u00e5By\u0091\u009a\u00f1w!G\u00caYG\u00ce\u00df\u0090\u008c\u0084\u0080\u00e8\u00c9u\u00ea\u00dc\u00f1{\u00a6M\u00de\u00c5F".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIljb.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x29ED;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIljb", exception);
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
            IlIljb.c[n2] = IlIljb.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIljb.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIljb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIljb.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

