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

public final class CP_Po
extends Enum<CP_Po> {
    public static final /* enum */ CP_Po ALL;
    public static final /* enum */ CP_Po DECREASED;
    public static final /* enum */ CP_Po MINIMAL;
    private static final CP_Po[] CP_h;

    public static CP_Po[] values() {
        return (CP_Po[])CP_h.clone();
    }

    public static CP_Po valueOf(String string) {
        return Enum.valueOf(CP_Po.class, string);
    }

    private static CP_Po[] CP_O() {
        return new CP_Po[]{ALL, DECREASED, MINIMAL};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(7733752115252370921L, 7901705446778323985L, MethodHandles.lookup().lookupClass()).a(151575779950469L) ^ 0x36C3DD03D940L;
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
        String string = "\u00e3l\u0092\u001aC\u00e9\u00acU\u00ff\u00ce\u00f7\t\u00dc,d\u00fc\bd\u00e5\u0084\u00bb\u0096\u00db\u00be\u00bd\b\u00c1p\u000b\u0086G\u00a4J\u008f";
        int n2 = "\u00e3l\u0092\u001aC\u00e9\u00acU\u00ff\u00ce\u00f7\t\u00dc,d\u00fc\bd\u00e5\u0084\u00bb\u0096\u00db\u00be\u00bd\b\u00c1p\u000b\u0086G\u00a4J\u008f".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Po.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                ALL = new CP_Po();
                DECREASED = new CP_Po();
                MINIMAL = new CP_Po();
                CP_h = CP_Po.CP_O();
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

