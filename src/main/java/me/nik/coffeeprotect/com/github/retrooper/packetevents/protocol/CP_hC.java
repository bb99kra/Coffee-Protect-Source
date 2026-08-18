/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_hC
extends Enum<CP_hC> {
    public static final /* enum */ CP_hC CLIENT;
    public static final /* enum */ CP_hC SERVER;
    private static final /* synthetic */ CP_hC[] CP_L;
    private static String CP_S;
    private static final long a;

    public static CP_hC[] values() {
        return (CP_hC[])CP_L.clone();
    }

    public static CP_hC valueOf(String string) {
        return Enum.valueOf(CP_hC.class, string);
    }

    public CP_hC CP_j() {
        long l = a ^ 0x3A98CFCD86D1L;
        String string = CP_hC.CP_q();
        CP_hC ilIlhC = this;
        if (string == null) {
            if (ilIlhC == CLIENT) {
                return SERVER;
            }
            ilIlhC = CLIENT;
        }
        return ilIlhC;
    }

    private static /* synthetic */ CP_hC[] CP_J() {
        return new CP_hC[]{CLIENT, SERVER};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-17351528100889264L, -171327137699654195L, MethodHandles.lookup().lookupClass()).a(43921717014293L);
        long l = a ^ 0x1B3C38B5B311L;
        if (CP_hC.CP_q() != null) {
            CP_hC.CP_d("ifchCc");
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
        String string = "\u00fe\u00fcRm\u0016N\u00a0\u00b5\b\u00eb\u001a\u0010a/\u00ddA\u0007";
        int n2 = "\u00fe\u00fcRm\u0016N\u00a0\u00b5\b\u00eb\u001a\u0010a/\u00ddA\u0007".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_hC.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                CLIENT = new CP_hC();
                SERVER = new CP_hC();
                CP_L = CP_hC.CP_J();
                return;
            }
            n3 = string.charAt(n4);
        }
    }

    public static void CP_d(String string) {
        CP_S = string;
    }

    public static String CP_q() {
        return CP_S;
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

