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

public final class CP_Cx
extends Enum<CP_Cx> {
    public static final /* enum */ CP_Cx SNAKE_CASE;
    public static final /* enum */ CP_Cx CAMEL_CASE;
    public static final /* enum */ CP_Cx BOTH;
    private static final CP_Cx[] CP_P;

    public static CP_Cx[] values() {
        return (CP_Cx[])CP_P.clone();
    }

    public static CP_Cx valueOf(String string) {
        return Enum.valueOf(CP_Cx.class, string);
    }

    private static CP_Cx[] CP_F() {
        return new CP_Cx[]{SNAKE_CASE, CAMEL_CASE, BOTH};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(-7908634208148441679L, 3560257445118416061L, MethodHandles.lookup().lookupClass()).a(146706164551626L) ^ 0x3EFCF0A61D5L;
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
        String string = "V\u0098cC\"\u000b\u00d9&\u0010\u00e9\u00fch\u00b6\u0019\u0012\u00d1\u00d6\u00ad\u00a9Z\u00da\u00b9\u00a9/\u008d\u0010Bq!\u00be\u00c8\u00ea\u00d0\u00b9x\u00cf\u00ff\u00d7G\u0085\u00ddU";
        int n2 = "V\u0098cC\"\u000b\u00d9&\u0010\u00e9\u00fch\u00b6\u0019\u0012\u00d1\u00d6\u00ad\u00a9Z\u00da\u00b9\u00a9/\u008d\u0010Bq!\u00be\u00c8\u00ea\u00d0\u00b9x\u00cf\u00ff\u00d7G\u0085\u00ddU".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_Cx.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                SNAKE_CASE = new CP_Cx();
                CAMEL_CASE = new CP_Cx();
                BOTH = new CP_Cx();
                CP_P = CP_Cx.CP_F();
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

