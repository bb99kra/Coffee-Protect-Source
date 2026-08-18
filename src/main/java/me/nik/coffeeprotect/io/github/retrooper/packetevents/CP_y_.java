/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

final class CP_y_
extends Enum<CP_y_> {
    public static final /* enum */ CP_y_ UNKNOWN;
    public static final /* enum */ CP_y_ DISABLED;
    public static final /* enum */ CP_y_ ENABLED;
    private static final /* synthetic */ CP_y_[] CP_L;

    public static CP_y_[] values() {
        return (CP_y_[])CP_L.clone();
    }

    public static CP_y_ valueOf(String string) {
        return Enum.valueOf(CP_y_.class, string);
    }

    private static /* synthetic */ CP_y_[] CP_j() {
        return new CP_y_[]{UNKNOWN, DISABLED, ENABLED};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(-5307666890645181308L, 5174166607002162845L, MethodHandles.lookup().lookupClass()).a(9404558014961L) ^ 0x65CDB758A0FAL;
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
        String string = "\u00a2\u00a7\u00e9\u0080\u00a5\u00d5\u00d9l\u00a4\u00d9\u00fa\u0002\u00b8\u00b8`\u0094\b\u0081\u001b\u00df)0\u00af&\u0014\b4\u00c6\u00f0Y\u00b45dM";
        int n2 = "\u00a2\u00a7\u00e9\u0080\u00a5\u00d5\u00d9l\u00a4\u00d9\u00fa\u0002\u00b8\u00b8`\u0094\b\u0081\u001b\u00df)0\u00af&\u0014\b4\u00c6\u00f0Y\u00b45dM".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_y_.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                UNKNOWN = new CP_y_();
                DISABLED = new CP_y_();
                ENABLED = new CP_y_();
                CP_L = CP_y_.CP_j();
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

