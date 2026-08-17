/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIliZ;
import me.nik.coffeeprotect.IlIljf;
import me.nik.coffeeprotect.IlIlju;
import me.nik.coffeeprotect.IlIlx5;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IlIljk
extends IlIlju {
    private final CoffeeProtect IlIlx;
    private static final long a = IlIls.a((long)565229063273202640L, (long)-8476492630298569552L, MethodHandles.lookup().lookupClass()).a(192272654946962L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String fwNRIrOWEm = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIljk(CoffeeProtect coffeeProtect) {
        this.IlIlx = coffeeProtect;
    }

    @Override
    protected String IlIlC() {
        long l = a ^ 0x2F5275ECFC4FL;
        return IlIljk.a("j", (int)3637, (long)(0x4BC4734E1B027825L ^ l));
    }

    @Override
    protected String IlIlV() {
        long l = a ^ 0x3A533702A6D6L;
        return IlIljk.a("j", (int)10380, (long)(0x79D59B10CFD38404L ^ l));
    }

    @Override
    protected String IlIld() {
        long l = a ^ 0x100400022106L;
        return IlIljk.a("j", (int)16624, (long)(0x68F0AB4DCD6FEBAAL ^ l));
    }

    @Override
    protected String IlIla() {
        return IlIlx5.ALERTS.IlIla();
    }

    @Override
    protected int IlIlX() {
        return 1;
    }

    @Override
    protected boolean IlIlr() {
        return false;
    }

    @Override
    protected void IlIlM(CommandSender commandSender, String[] stringArray) {
        boolean bl;
        block6: {
            IlIliZ ilIliZ;
            UUID uUID;
            block4: {
                block5: {
                    long l = a ^ 0x79E3311B0AB1L;
                    uUID = ((Player)commandSender).getUniqueId();
                    bl = IlIljf.IlIlJ();
                    ilIliZ = this.IlIlx.IlIlc();
                    if (bl) break block4;
                    if (!ilIliZ.IlIlF().contains(uUID)) break block5;
                    this.IlIlx.IlIlc().IlIlB(uUID);
                    commandSender.sendMessage(IlIlxi.ALERTS_DISABLED.IlIlF());
                    if (!bl) break block6;
                }
                ilIliZ = this.IlIlx.IlIlc();
            }
            ilIliZ.IlIlS(uUID);
            commandSender.sendMessage(IlIlxi.ALERTS_ENABLED.IlIlF());
        }
        if (PacketWrapper.IlIlz() == null) {
            IlIljf.IlIlp(!bl);
        }
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
        long l = a ^ 0x6CF6DD96C8B6L;
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
        String string = "\u009b\u00fc\u00f3\u00e1\u00cc3\u00b9\u00937]\u00a4>0\u00d5\u00aa\u000f?\u00f2\u0097\u00f2p\n\u00b0\u00a7\u009f\u00ec~*\u0099\"\u001b\u0019\u0001\u00e2M 2\f\u00ce\u00ce\u0010\u00ea\u00fa\u00f9\u00d0*h\u0004@\u00c4(\u00f1\u00ea:\u00a0\u00d8z(\u009e\u00ba\u001b\u00ce\u0006Vb\u001c2\u0012X\u00e5\u0083\u00eb\u0003\u00b2\u00cb\u0095;Sz\u00a5\u001f\u00f6\u00e1\u00ddJ\u00a8\u00a4\u00a3\u00c5\u00c5N\u00a4>\u00034\u00dfu\u00b5";
        int n2 = "\u009b\u00fc\u00f3\u00e1\u00cc3\u00b9\u00937]\u00a4>0\u00d5\u00aa\u000f?\u00f2\u0097\u00f2p\n\u00b0\u00a7\u009f\u00ec~*\u0099\"\u001b\u0019\u0001\u00e2M 2\f\u00ce\u00ce\u0010\u00ea\u00fa\u00f9\u00d0*h\u0004@\u00c4(\u00f1\u00ea:\u00a0\u00d8z(\u009e\u00ba\u001b\u00ce\u0006Vb\u001c2\u0012X\u00e5\u0083\u00eb\u0003\u00b2\u00cb\u0095;Sz\u00a5\u001f\u00f6\u00e1\u00ddJ\u00a8\u00a4\u00a3\u00c5\u00c5N\u00a4>\u00034\u00dfu\u00b5".length();
        int n3 = 40;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIljk.a(byArray3).intern();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6B67;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIljk", exception);
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
            IlIljk.c[n2] = IlIljk.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIljk.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIljk" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIljk.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

