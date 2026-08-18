/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Color
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_iD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Color;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_jp {
    private final List<CP_iD> CP_j = new ArrayList<CP_iD>();
    private String CP_w;
    private String CP_t;
    private String CP_h;
    private Color CP_P;
    private static final long a = CP_s.a(-1808429419862115675L, 3976736307175729832L, MethodHandles.lookup().lookupClass()).a(164441762817113L);
    private static final String b;
    private static transient /* synthetic */ String GgAeCTOBXA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public String CP_o() {
        return this.CP_w;
    }

    public CP_jp CP_UnderScore(String string) {
        this.CP_w = string;
        return this;
    }

    public String CP_V() {
        return this.CP_t;
    }

    public CP_jp CP_z(String string) {
        long l = a ^ 0x7BDDA4FE8F75L;
        this.CP_t = b + string;
        return this;
    }

    public void CP_UnderScore(String string) {
        this.CP_t = string;
    }

    public String CP_a() {
        return this.CP_h;
    }

    public CP_jp CP_i(String string) {
        this.CP_h = string;
        return this;
    }

    public Color CP_A() {
        return this.CP_P;
    }

    public CP_jp CP_k(Color color) {
        this.CP_P = color;
        return this;
    }

    public List<CP_iD> CP_z() {
        return this.CP_j;
    }

    public CP_jp CP_W(String string, String string2) {
        this.CP_j.add(new CP_iD(string, string2, null));
        return this;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x5F998F6B9223L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00e6]\u0085\u00eb\u00a9\u000f\u00b4T-\u00da\u00e7{\u00ac=\u00ceV\u009cV\u00b4\u00e6\u00e2\u008a\u0096.b\u00e3M~2\u0005\u0081\n".getBytes("ISO-8859-1"));
                b = CP_jp.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
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
