/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_og
extends Enum<CP_og> {
    public static final /* enum */ CP_og ADDITION;
    public static final /* enum */ CP_og MULTIPLY_BASE;
    public static final /* enum */ CP_og MULTIPLY_TOTAL;
    private static final /* synthetic */ CP_og[] CP_m;

    public static CP_og[] values() {
        return (CP_og[])CP_m.clone();
    }

    public static CP_og valueOf(String string) {
        return Enum.valueOf(CP_og.class, string);
    }

    private static /* synthetic */ CP_og[] CP_UnderScore() {
        return new CP_og[]{ADDITION, MULTIPLY_BASE, MULTIPLY_TOTAL};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(6181580947830002588L, -1737360874135909723L, MethodHandles.lookup().lookupClass()).a(5079152309986L) ^ 0xF5623ACB0D5L;
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
        String string = "\u009d\rr\u008c\u0093\u00a8y\u00a4\u0091Y\u008e-\u008cp/\u0001\u0010V9\u0090\u00c5\u00b6\u009d\u00ee\u0010\u0085\u0098\u00f0\u00f8\u001d\u0004\u00fd\u00ba\u0010\u009d\rr\u008c\u0093\u00a8y\u00a4\u00c4\u00b9\u00b6\u00038\u0015~8";
        int n2 = "\u009d\rr\u008c\u0093\u00a8y\u00a4\u0091Y\u008e-\u008cp/\u0001\u0010V9\u0090\u00c5\u00b6\u009d\u00ee\u0010\u0085\u0098\u00f0\u00f8\u001d\u0004\u00fd\u00ba\u0010\u009d\rr\u008c\u0093\u00a8y\u00a4\u00c4\u00b9\u00b6\u00038\u0015~8".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_og.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                ADDITION = new CP_og();
                MULTIPLY_BASE = new CP_og();
                MULTIPLY_TOTAL = new CP_og();
                CP_m = CP_og.CP_UnderScore();
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

