/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.concurrent.Callable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_OI;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Zb;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_is;

public class CP_im
extends CP_is {
    private final Callable<String> CP_P;
    private static final long a = CP_s.a(4672464929565793500L, 2671025911104995892L, MethodHandles.lookup().lookupClass()).a(122777307572313L);
    private static final String f;
    private static transient /* synthetic */ String wfrpCfqhYq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_im(String string, Callable<String> callable) {
        super(string);
        this.CP_P = callable;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    protected CP_OI CP_S() throws Exception {
        String string;
        String string2;
        block4: {
            long l = a ^ 0x2AD0877E391FL;
            string2 = this.CP_P.call();
            int n = CP_is.CP_m();
            try {
                string = string2;
                if (n != 0) break block4;
                if (string == null) return null;
            }
            catch (Exception exception) {
                throw CP_im.a(exception);
            }
            string = string2;
        }
        try {
            if (!string.isEmpty()) return new CP_Zb().CP_p(f, string2).CP_d();
            return null;
        }
        catch (Exception exception) {
            throw CP_im.a(exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x54E8304186EFL;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("r\u00b8k\u00ad\u00da\u00ce\u00d0\u00d8".getBytes("ISO-8859-1"));
                f = CP_im.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(byte[] byArray) {
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

