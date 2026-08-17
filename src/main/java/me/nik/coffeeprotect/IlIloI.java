/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlCf;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIloI {
    private static final Map<String, Float> IlIlj;
    private long IlIlC;
    private float IlIlK;
    private static String IlIlH;
    private static final long a;
    private static transient /* synthetic */ String unwgztDwZf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public void IlIlv(float f) {
        this.IlIlK += f;
    }

    public void IlIlY(PacketReceiveEvent packetReceiveEvent) {
        long l = a ^ 0x7E3104D41AD9L;
        long l2 = packetReceiveEvent.IlIlO();
        String string = IlIloI.IlIln();
        if (string == null) {
            if (l2 - this.IlIlC >= IlIlOq.PACKET_LIMITER_RESET_TIME.IlIlq()) {
                this.IlIlC = l2;
                this.IlIlK = 0.0f;
            }
            this.IlIlK += IlIlj.getOrDefault(packetReceiveEvent.getPacketType().IlIlf(), Float.valueOf(1.0f)).floatValue();
        }
        if (string != null) {
            PacketWrapper.IlIle((int[])new int[2]);
        }
    }

    public float IlIlw() {
        return this.IlIlK;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a((long)2990205600531547008L, (long)3522527238982171048L, MethodHandles.lookup().lookupClass()).a(36211065234290L);
        long l = a ^ 0x70EFF0B508C8L;
        if (IlIloI.IlIln() != null) {
            IlIloI.IlIlU("LoI6h");
        }
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
        byte[] byArray3 = cipher.doFinal("\u00ee\f\u00ef\u00bb^\u0080\u00e9B\u0080\u00af\t\u00be5$\u001d\u0010h8\u009c\u00e3Fh\u007f%\u0016\u0093\u008f\u00e5\u00d4=\u00bdA".getBytes("ISO-8859-1"));
        String string2 = IlIloI.a(byArray3).intern();
        IlIlj = new HashMap<String, Float>();
        IlIlCf ilIlCf = CoffeeProtect.IlIlJ().IlIlR().IlIlS().IlIlb(string2);
        if (ilIlCf != null) {
            ilIlCf.getKeys(false).forEach(string -> IlIlj.put((String)string, Float.valueOf((float)ilIlCf.getDouble((String)string))));
        }
    }

    public static void IlIlU(String string) {
        IlIlH = string;
    }

    public static String IlIln() {
        return IlIlH;
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
}

