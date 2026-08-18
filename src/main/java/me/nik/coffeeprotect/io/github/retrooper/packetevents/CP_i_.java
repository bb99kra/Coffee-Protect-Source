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

public class CP_i_
extends CP_is {
    private final Callable<Integer> CP_P;
    private static final long a = CP_s.a(-5019132653378871002L, -8309940818728691331L, MethodHandles.lookup().lookupClass()).a(184037748227863L);
    private static final String f;
    private static transient /* synthetic */ String ZtMqwUQyNl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_i_(String string, Callable<Integer> callable) {
        super(string);
        this.CP_P = callable;
    }

    @Override
    protected CP_OI CP_S() throws Exception {
        long l = a ^ 0x2C15E4D00CA1L;
        int n = this.CP_P.call();
        try {
            if (n == 0) {
                return null;
            }
        }
        catch (Exception exception) {
            throw CP_i_.a(exception);
        }
        return new CP_Zb().CP_Q(f, n).CP_d();
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x47C3D00806A7L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u001ag<\u00e0p\u00bd\u00ebN".getBytes("ISO-8859-1"));
                f = CP_i_.b(byArray3).intern();
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

