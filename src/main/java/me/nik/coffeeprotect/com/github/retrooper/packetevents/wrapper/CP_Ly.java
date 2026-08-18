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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_TN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.kyori.adventure.util.Index;

@Deprecated
public final class CP_Ly
extends Enum<CP_Ly> {
    public static final /* enum */ CP_Ly FULL;
    public static final /* enum */ CP_Ly SYSTEM;
    public static final /* enum */ CP_Ly HIDDEN;
    public static final CP_Ly[] VALUES;
    private static final Index<CP_TN, CP_Ly> CP_C;
    private final CP_TN CP_t;
    private static final CP_Ly[] CP_f;

    public static CP_Ly[] values() {
        return (CP_Ly[])CP_f.clone();
    }

    public static CP_Ly valueOf(String string) {
        return Enum.valueOf(CP_Ly.class, string);
    }

    private CP_Ly(CP_TN ilIlTN) {
        this.CP_t = ilIlTN;
    }

    private static CP_TN lambda$static$0(CP_Ly ilIlLy) {
        return ilIlLy.CP_t;
    }

    static CP_TN CP_d(CP_Ly ilIlLy) {
        return ilIlLy.CP_t;
    }

    static Index CP_D() {
        return CP_C;
    }

    private static CP_Ly[] CP_S() {
        return new CP_Ly[]{FULL, SYSTEM, HIDDEN};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(1845897766395799500L, 685527874960977457L, MethodHandles.lookup().lookupClass()).a(240107521529987L) ^ 0x6AFD552A920DL;
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
        String string = "\u00ac\u00b8Z\u00c8\u0092Z\r\u00ee\b&\u00eb/2K\u00db\u00d0\u00e6\b1T\u00f6^\u00f7\u00b0`7";
        int n2 = "\u00ac\u00b8Z\u00c8\u0092Z\r\u00ee\b&\u00eb/2K\u00db\u00d0\u00e6\b1T\u00f6^\u00f7\u00b0`7".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Ly.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                FULL = new CP_Ly(CP_TN.FULL);
                SYSTEM = new CP_Ly(CP_TN.SYSTEM);
                HIDDEN = new CP_Ly(CP_TN.HIDDEN);
                CP_f = CP_Ly.CP_S();
                VALUES = CP_Ly.values();
                CP_C = Index.create(CP_Ly.class, CP_Ly::lambda$static$0);
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

