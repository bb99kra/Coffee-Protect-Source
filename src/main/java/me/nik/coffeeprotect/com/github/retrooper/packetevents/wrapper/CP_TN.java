/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_TN
extends Enum<CP_TN> {
    public static final /* enum */ CP_TN FULL;
    public static final /* enum */ CP_TN SYSTEM;
    public static final /* enum */ CP_TN HIDDEN;
    private static final CP_TN[] CP_J;

    public static CP_TN[] values() {
        return (CP_TN[])CP_J.clone();
    }

    public static CP_TN valueOf(String string) {
        return Enum.valueOf(CP_TN.class, string);
    }

    private static CP_TN[] CP_u() {
        return new CP_TN[]{FULL, SYSTEM, HIDDEN};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(4067860082170045724L, 1663345976860753156L, MethodHandles.lookup().lookupClass()).a(149091243783268L) ^ 0x7A119998C54BL;
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
        String string = "V\u009d\u00b01\u00c7K\u00b1\t\b\u00a4\u0086K\u00e7\u0003\u00db\u00c3m\b\u00a3\u009c\u00de<\u00d4\u0011\u00a0\u00f2";
        int n2 = "V\u009d\u00b01\u00c7K\u00b1\t\b\u00a4\u0086K\u00e7\u0003\u00db\u00c3m\b\u00a3\u009c\u00de<\u00d4\u0011\u00a0\u00f2".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_TN.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                FULL = new CP_TN();
                SYSTEM = new CP_TN();
                HIDDEN = new CP_TN();
                CP_J = CP_TN.CP_u();
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

