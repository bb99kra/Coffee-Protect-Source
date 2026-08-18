/*
 * Decompiled with CFR 0.152.
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
import me.nik.coffeeprotect.CP_Cf;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_oI {
    private static final Map<String, Float> CP_j;
    private long CP_C;
    private float CP_K;
    private static String CP_H;
    private static final long a;
    private static transient /* synthetic */ String unwgztDwZf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public void CP_v(float f) {
        this.CP_K += f;
    }

    public void CP_Y(PacketReceiveEvent packetReceiveEvent) {
        long l = a ^ 0x7E3104D41AD9L;
        long l2 = packetReceiveEvent.CP_O();
        String string = CP_oI.CP_n();
        if (string == null) {
            if (l2 - this.CP_C >= CP_Oq.PACKET_LIMITER_RESET_TIME.CP_q()) {
                this.CP_C = l2;
                this.CP_K = 0.0f;
            }
            this.CP_K += CP_j.getOrDefault(packetReceiveEvent.getPacketType().CP_f(), Float.valueOf(1.0f)).floatValue();
        }
        if (string != null) {
            PacketWrapper.CP_e(new int[2]);
        }
    }

    public float CP_w() {
        return this.CP_K;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(2990205600531547008L, 3522527238982171048L, MethodHandles.lookup().lookupClass()).a(36211065234290L);
        long l = a ^ 0x70EFF0B508C8L;
        if (CP_oI.CP_n() != null) {
            CP_oI.CP_U("LoI6h");
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
        String string2 = CP_oI.a(byArray3).intern();
        CP_j = new HashMap<String, Float>();
        CP_Cf ilIlCf = CoffeeProtect.CP_J().CP_R().CP_S().CP_b(string2);
        if (ilIlCf != null) {
            ilIlCf.getKeys(false).forEach(string -> CP_j.put((String)string, Float.valueOf((float)ilIlCf.getDouble((String)string))));
        }
    }

    public static void CP_U(String string) {
        CP_H = string;
    }

    public static String CP_n() {
        return CP_H;
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
