/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_rH
extends Enum<CP_rH> {
    public static final /* enum */ CP_rH CEILING;
    public static final /* enum */ CP_rH FLOOR;
    public static final /* enum */ CP_rH WALL;
    private static final /* synthetic */ CP_rH[] CP_D;

    public static CP_rH[] values() {
        return (CP_rH[])CP_D.clone();
    }

    public static CP_rH valueOf(String string) {
        return Enum.valueOf(CP_rH.class, string);
    }

    private static /* synthetic */ CP_rH[] CP_D() {
        return new CP_rH[]{CEILING, FLOOR, WALL};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(-8311656036483439431L, -6938399492490208099L, MethodHandles.lookup().lookupClass()).a(168264759973209L) ^ 0x7B13C2F01C2CL;
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
        String string = "\u0017`\u00c7\u00b7\u00ady\u0004\u0014\b\u0091\u00e8\u0018\u0085\u00143Q\u0088\b\u0087\u00bf\u0006\u00c9r\u00d1\u00ad\u00b7";
        int n2 = "\u0017`\u00c7\u00b7\u00ady\u0004\u0014\b\u0091\u00e8\u0018\u0085\u00143Q\u0088\b\u0087\u00bf\u0006\u00c9r\u00d1\u00ad\u00b7".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_rH.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                CEILING = new CP_rH();
                FLOOR = new CP_rH();
                WALL = new CP_rH();
                CP_D = CP_rH.CP_D();
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

