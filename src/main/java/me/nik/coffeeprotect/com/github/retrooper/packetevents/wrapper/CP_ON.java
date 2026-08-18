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

public final class CP_ON
extends Enum<CP_ON> {
    public static final /* enum */ CP_ON CREATE_OR_UPDATE_ITEM;
    public static final /* enum */ CP_ON REMOVE_ITEM;
    public static final CP_ON[] VALUES;
    private static final CP_ON[] CP_v;

    public static CP_ON[] values() {
        return (CP_ON[])CP_v.clone();
    }

    public static CP_ON valueOf(String string) {
        return Enum.valueOf(CP_ON.class, string);
    }

    private static CP_ON[] CP_v() {
        return new CP_ON[]{CREATE_OR_UPDATE_ITEM, REMOVE_ITEM};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = CP_s.a(6091213190749101972L, -6127928786965183087L, MethodHandles.lookup().lookupClass()).a(68047465613255L) ^ 0x7F995D493602L;
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
        String string = "\u0087\u00c1\u00cc\u00ea\u001c\rL\u00e5\u008e\u00b2\u00e4[\u0086\u00ac\u001fC\u00185\u00afN\u001c\u0098p\u00a2\b-V\u0080\u00f5\u00fc\u00c5\u0013\u00e1\u00e8\u00a3tl\u00f0a\u00d0\u00cc";
        int n2 = "\u0087\u00c1\u00cc\u00ea\u001c\rL\u00e5\u008e\u00b2\u00e4[\u0086\u00ac\u001fC\u00185\u00afN\u001c\u0098p\u00a2\b-V\u0080\u00f5\u00fc\u00c5\u0013\u00e1\u00e8\u00a3tl\u00f0a\u00d0\u00cc".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_ON.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                CREATE_OR_UPDATE_ITEM = new CP_ON();
                REMOVE_ITEM = new CP_ON();
                CP_v = CP_ON.CP_v();
                VALUES = CP_ON.values();
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

