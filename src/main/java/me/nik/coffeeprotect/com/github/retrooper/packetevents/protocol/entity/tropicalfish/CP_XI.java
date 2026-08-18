/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.tropicalfish;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_XI
extends Enum<CP_XI> {
    public static final /* enum */ CP_XI SMALL;
    public static final /* enum */ CP_XI LARGE;
    private static final CP_XI[] CP_t;
    private static int[] CP_N;

    public static CP_XI[] values() {
        return (CP_XI[])CP_t.clone();
    }

    public static CP_XI valueOf(String string) {
        return Enum.valueOf(CP_XI.class, string);
    }

    private static CP_XI[] CP_U() {
        return new CP_XI[]{SMALL, LARGE};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(1022132286396053641L, 1181872228269455512L, MethodHandles.lookup().lookupClass()).a(76348878610600L) ^ 0x44A9B2AA178FL;
        if (CP_XI.CP_Q() != null) {
            CP_XI.CP_M(new int[3]);
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "T\u00f12\u00a88\u00f3DB\b\u00dev\u0084h\u00f7\u00de\u00bc\u00ea";
        int n2 = "T\u00f12\u00a88\u00f3DB\b\u00dev\u0084h\u00f7\u00de\u00bc\u00ea".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_XI.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                SMALL = new CP_XI();
                LARGE = new CP_XI();
                CP_t = CP_XI.CP_U();
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static void CP_M(int[] nArray) {
        CP_N = nArray;
    }

    public static int[] CP_Q() {
        return CP_N;
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

