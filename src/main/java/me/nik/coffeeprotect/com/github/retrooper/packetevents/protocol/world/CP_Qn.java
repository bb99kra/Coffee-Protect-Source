/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_Qn
extends Enum<CP_Qn> {
    public static final /* enum */ CP_Qn CLEARED;
    public static final /* enum */ CP_Qn RUNNING;
    public static final /* enum */ CP_Qn FINISHED;
    private static final CP_Qn[] CP_R;

    public static CP_Qn[] values() {
        return (CP_Qn[])CP_R.clone();
    }

    public static CP_Qn valueOf(String string) {
        return Enum.valueOf(CP_Qn.class, string);
    }

    private static CP_Qn[] CP_z() {
        return new CP_Qn[]{CLEARED, RUNNING, FINISHED};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(5584141287427665649L, -90493209679414135L, MethodHandles.lookup().lookupClass()).a(28804437267446L) ^ 0xF5602556276L;
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
        String string = "\u009b\u009c\u00c0\u0086\u00dc$d\u00e3O\u00f4\u00af\u00b4\u0098\u00b9\u00b1\u00ae\b\u00b3\u000f\u00f5W6~8O\bk\u00f9v\u0006'\u00df\u00a6w";
        int n2 = "\u009b\u009c\u00c0\u0086\u00dc$d\u00e3O\u00f4\u00af\u00b4\u0098\u00b9\u00b1\u00ae\b\u00b3\u000f\u00f5W6~8O\bk\u00f9v\u0006'\u00df\u00a6w".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Qn.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                CLEARED = new CP_Qn();
                RUNNING = new CP_Qn();
                FINISHED = new CP_Qn();
                CP_R = CP_Qn.CP_z();
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

