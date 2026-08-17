/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.ChatColor
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.ChatColor;

public final class IlIlrW {
    private static final Pattern IlIlJ;
    private static String IlIlV;
    private static final long a;
    private static final long b;
    private static transient /* synthetic */ String vKCznhbGRt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlrW() {
    }

    public static String IlIlW(String string) {
        long l = a ^ 0x6DCE1453D278L;
        return ChatColor.translateAlternateColorCodes((char)b, (String)string);
    }

    public static String IlIlz(String string) {
        return ChatColor.stripColor((String)IlIlJ.matcher(string).replaceAll(""));
    }

    public static void IlIlU(String ... stringArray) {
        long l = a ^ 0x3D2C427CC56DL;
        String[] stringArray2 = stringArray;
        int n = stringArray2.length;
        int n2 = 0;
        String string = IlIlrW.IlIlx();
        while (n2 < n) {
            String string2 = stringArray2[n2];
            if (string != null) {
                if (string2 != null) {
                    CoffeeProtect.IlIlJ().getLogger().info(string2);
                }
                ++n2;
            }
            if (string != null) continue;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a((long)-7842931353528495544L, (long)8637661245626815437L, MethodHandles.lookup().lookupClass()).a(195237996076079L);
        long l = a ^ 0x45B2A2DCA230L;
        if (IlIlrW.IlIlx() == null) {
            IlIlrW.IlIla("iF4LAb");
        }
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
        byte[] byArray3 = cipher.doFinal("\u0019\u008e\u00ce\u009a\u00d4\u009b[\u00c7\u00954\u000696\u0006\u001aN\u00b4~t\u00a8\u00c8\u008c\r\u00e1".getBytes("ISO-8859-1"));
        String string = IlIlrW.a(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 1886442256461304871L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                b = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                IlIlJ = Pattern.compile(string);
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static void IlIla(String string) {
        IlIlV = string;
    }

    public static String IlIlx() {
        return IlIlV;
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

