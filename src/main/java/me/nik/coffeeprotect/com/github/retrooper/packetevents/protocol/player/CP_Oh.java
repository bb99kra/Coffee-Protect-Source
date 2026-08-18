/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class CP_Oh
extends Enum<CP_Oh> {
    public static final /* enum */ CP_Oh LEFT;
    public static final /* enum */ CP_Oh RIGHT;
    public static final CP_Oh[] VALUES;
    private static final /* synthetic */ CP_Oh[] CP_R;
    private static final long a;

    public static CP_Oh[] values() {
        return (CP_Oh[])CP_R.clone();
    }

    public static CP_Oh valueOf(String string) {
        return Enum.valueOf(CP_Oh.class, string);
    }

    public int CP_Z() {
        long l = a ^ 0x5B879FDACE30L;
        return this == RIGHT ? 0 : 1;
    }

    public static CP_Oh CP_y(int n) {
        long l = a ^ 0x62223C18EC4EL;
        return n == 0 ? RIGHT : LEFT;
    }

    public static CP_Oh CP_E(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x3D65C68E439DL;
        return packetWrapper.CP_f() == 1 ? RIGHT : LEFT;
    }

    public static void CP_q(PacketWrapper<?> packetWrapper, CP_Oh ilIlOh) {
        packetWrapper.CP_w(ilIlOh);
    }

    private static /* synthetic */ CP_Oh[] CP_Y() {
        return new CP_Oh[]{LEFT, RIGHT};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-8689461233775913772L, 905091003382397201L, MethodHandles.lookup().lookupClass()).a(183965382924285L);
        long l = a ^ 0x17FB410CE320L;
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
        String string = "C9\u00a4\u0089+\u00dd\u0015\u0004\b\u00e7w\u00b5\u0089\u008b\u001a\u0013\u0016";
        int n2 = "C9\u00a4\u0089+\u00dd\u0015\u0004\b\u00e7w\u00b5\u0089\u008b\u001a\u0013\u0016".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Oh.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                LEFT = new CP_Oh();
                RIGHT = new CP_Oh();
                CP_R = CP_Oh.CP_Y();
                VALUES = CP_Oh.values();
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
}

