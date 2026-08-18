/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Gd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_OO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Zk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Zy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CP_rg
extends Enum<CP_rg>
implements CP_OO,
CP_Gd {
    public static final /* enum */ CP_rg RESPONSE;
    public static final /* enum */ CP_rg PONG;
    private final int CP_y;
    private final Class<? extends PacketWrapper<?>> CP_O;
    private static final CP_rg[] CP_E;
    private static final long a;

    public static CP_rg[] values() {
        return (CP_rg[])CP_E.clone();
    }

    public static CP_rg valueOf(String string) {
        return Enum.valueOf(CP_rg.class, string);
    }

    private CP_rg(int n2, Class<? extends PacketWrapper<?>> clazz) {
        this.CP_y = n2;
        this.CP_O = clazz;
    }

    @Override
    public Class<? extends PacketWrapper<?>> CP_B() {
        return this.CP_O;
    }

    @Nullable
    public static CP_oL CP_T(int n) {
        long l = a ^ 0x1779129BD9DEL;
        PacketWrapper[] packetWrapperArray = CP_hU.CP_X();
        int n2 = n;
        if (packetWrapperArray == null) {
            if (n2 == 0) {
                return RESPONSE;
            }
            n2 = n;
        }
        if (n2 == 1) {
            return PONG;
        }
        return null;
    }

    @Override
    public int CP_Y() {
        return this.CP_y;
    }

    @Override
    public CP_hC CP_Y() {
        return CP_hC.SERVER;
    }

    private static CP_rg[] CP_m() {
        return new CP_rg[]{RESPONSE, PONG};
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(5114146821938600533L, 8444949370190961408L, MethodHandles.lookup().lookupClass()).a(4452860882623L);
        long l = a ^ 0x23EE8205703AL;
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
        String string = "c!\u00b1\b\u00e5a\u008c\u000f\u0010\u00df\u00be\u00a46\u0018\u00ea3Fl\u00a4\u00c8\u00e3\u00f983X";
        int n2 = "c!\u00b1\b\u00e5a\u008c\u000f\u0010\u00df\u00be\u00a46\u0018\u00ea3Fl\u00a4\u00c8\u00e3\u00f983X".length();
        int n3 = 8;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_rg.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                RESPONSE = new CP_rg(0, CP_Zy.class);
                PONG = new CP_rg(1, CP_Zk.class);
                CP_E = CP_rg.CP_m();
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

