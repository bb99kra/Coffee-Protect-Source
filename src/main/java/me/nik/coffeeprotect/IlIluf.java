/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbo
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.GameMode
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTE;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.IlIlyR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.IlIlQG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;

@IlIljl(IlIlJ="Invalid Interact", IlIlM="Checks for invalid interact packets")
public class IlIluf
extends IlIluV {
    private static final long b = IlIls.a((long)2468697650310457394L, (long)275094828146818516L, MethodHandles.lookup().lookupClass()).a(196778933684497L);
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static transient /* synthetic */ String NVdxQtUYQN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIluf(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_INTERACT_ENABLED.IlIlt());
    }

    @Override
    public IlIlTV IlIlh(PacketReceiveEvent packetReceiveEvent) {
        long l = b ^ 0x6BFF188835D5L;
        String string = IlIlu7.IlIlq();
        if (packetReceiveEvent.getPacketType() != IlIlnN.INTERACT_ENTITY) {
            return null;
        }
        IlIlbo ilIlbo = new IlIlbo(packetReceiveEvent);
        int n = ilIlbo.IlIl_();
        if (n < 0) {
            return new IlIlTE(this, (String)((Object)IlIluf.a("s", (int)21809, (long)(0x755858BC98A97581L ^ l))));
        }
        GameMode gameMode = ((Player)packetReceiveEvent.getPlayer()).getGameMode();
        if (string == null) {
            if (gameMode != GameMode.SPECTATOR && n == packetReceiveEvent.getUser().IlIlw()) {
                return new IlIlTV(this, (String)((Object)IlIluf.a("s", (int)32605, (long)(0x47BCFE06C3DDFECL ^ l))));
            }
            gameMode = ilIlbo.IlIlA().orElse(null);
        }
        IlIlQG ilIlQG = (IlIlQG)gameMode;
        if (IlIlyR.IlIlj(n) || ilIlQG != null && IlIlyR.IlIlM(ilIlQG.IlIlY(), ilIlQG.IlIlg(), ilIlQG.IlIlu())) {
            return new IlIlTV(this, (String)((Object)IlIluf.a("s", (int)6979, (long)(0x49B7B3A2FD1C3BF0L ^ l))));
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        f = new HashMap(13);
        long l = b ^ 0x249F52C7E450L;
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
        String string = "V\u0093@E{\u000e5rg\"\u00d5\u0003\u000b\u0098\u00e6}\u00ffY\u0095\u001daR_\u00f7\u00f1&\u0010\u00a4\u00b43\u00a7y )\u0099\t\u0015c\u00d4\u008a\u00f7\u00bb\u0013>\u0017o\u0011\u0000\u00e5m\u007fOi\u00a4\u00f0\u0006anD\u0001\u00d1\u00a74\u00f7# \u00ccLncA\u00de`]\u00a0?\u0013\u00c1\u0001\u00b7\u008fZ\u00d1\u00b7\u00e2\u00c5\u00acp{sp\u008f\u00a6\u0091'\u00ed\u008c\u0084";
        int n2 = "V\u0093@E{\u000e5rg\"\u00d5\u0003\u000b\u0098\u00e6}\u00ffY\u0095\u001daR_\u00f7\u00f1&\u0010\u00a4\u00b43\u00a7y )\u0099\t\u0015c\u00d4\u008a\u00f7\u00bb\u0013>\u0017o\u0011\u0000\u00e5m\u007fOi\u00a4\u00f0\u0006anD\u0001\u00d1\u00a74\u00f7# \u00ccLncA\u00de`]\u00a0?\u0013\u00c1\u0001\u00b7\u008fZ\u00d1\u00b7\u00e2\u00c5\u00acp{sp\u008f\u00a6\u0091'\u00ed\u008c\u0084".length();
        int n3 = 32;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIluf.b(byArray3).intern();
            if ((n4 += n3) >= n2) {
                d = stringArray;
                e = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x169E;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIluf", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            IlIluf.e[n2] = IlIluf.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIluf.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIluf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIluf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

