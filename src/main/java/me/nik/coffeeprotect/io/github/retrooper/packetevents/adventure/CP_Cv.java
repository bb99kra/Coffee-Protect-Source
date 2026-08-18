/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_Cv
extends Enum<CP_Cv> {
    public static final /* enum */ CP_Cv REPLACE;
    public static final /* enum */ CP_Cv CONTINUE;
    public static final /* enum */ CP_Cv STOP;
    private static final /* synthetic */ CP_Cv[] CP_q;

    public static CP_Cv[] values() {
        return (CP_Cv[])CP_q.clone();
    }

    public static CP_Cv valueOf(String string) {
        return Enum.valueOf(CP_Cv.class, string);
    }

    private static /* synthetic */ CP_Cv[] CP_t() {
        return new CP_Cv[]{REPLACE, CONTINUE, STOP};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(3066438640096824193L, -4271060488994291923L, MethodHandles.lookup().lookupClass()).a(268192798467215L) ^ 0x7EDB0E5D1005L;
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
        String string = "6\u00af\u00fc\u00f0Er8\u00e5\u00103;\u009d\u0082\u00bb\u00f6=\u00a2W\u00b6##\u00ac;\u00e0\u001b\b\u0080P\u00a6\u0099I\u00ac!A";
        int n2 = "6\u00af\u00fc\u00f0Er8\u00e5\u00103;\u009d\u0082\u00bb\u00f6=\u00a2W\u00b6##\u00ac;\u00e0\u001b\b\u0080P\u00a6\u0099I\u00ac!A".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Cv.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                REPLACE = new CP_Cv();
                CONTINUE = new CP_Cv();
                STOP = new CP_Cv();
                CP_q = CP_Cv.CP_t();
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

