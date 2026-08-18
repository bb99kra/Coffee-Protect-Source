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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_qy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_J5
extends PacketWrapper<CP_J5> {
    private String CP_a;
    private byte[] CP_d;
    private static int CP_Y;
    private static final long b;
    private static final String c;
    private static final long g;
    private static transient /* synthetic */ String ewAbpzxQqW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J5(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_J5(ResourceLocation resourceLocation, byte[] byArray) {
        this(resourceLocation.toString(), byArray);
    }

    public CP_J5(String string, byte[] byArray) {
        super(CP_qy.PLUGIN_MESSAGE);
        this.CP_a = string;
        this.CP_d = byArray;
    }

    @Override
    public void CP_e() {
        int n;
        block7: {
            CP_J5 ilIlJ5;
            block8: {
                long l = b ^ 0x51F1D7560D2AL;
                this.CP_a = this.CP_i();
                n = CP_J5.CP_o();
                try {
                    try {
                        ilIlJ5 = this;
                        if (n != 0) break block7;
                        if (ByteBufHelper.CP_H(ilIlJ5.CP_S) <= (int)g) break block8;
                    }
                    catch (RuntimeException runtimeException) {
                        throw CP_J5.a(runtimeException);
                    }
                    throw new RuntimeException(c);
                }
                catch (RuntimeException runtimeException) {
                    throw CP_J5.a(runtimeException);
                }
            }
            ilIlJ5 = this;
        }
        try {
            ilIlJ5.CP_d = this.CP_q();
            if (n != 0) {
                PacketWrapper.CP_e(new int[4]);
            }
        }
        catch (RuntimeException runtimeException) {
            throw CP_J5.a(runtimeException);
        }
    }

    @Override
    public void CP_J() {
        this.CP_M(this.CP_a);
        this.CP_e(this.CP_d);
    }

    public void CP_t(CP_J5 ilIlJ5) {
        this.CP_a = ilIlJ5.CP_a;
        this.CP_d = ilIlJ5.CP_d;
    }

    public String CP_K() {
        return this.CP_a;
    }

    public void CP_f(String string) {
        this.CP_a = string;
    }

    public byte[] CP_h() {
        return this.CP_d;
    }

    public void CP_F(byte[] byArray) {
        this.CP_d = byArray;
    }

    public static void CP_d(int n) {
        CP_Y = n;
    }

    public static int CP_o() {
        return CP_Y;
    }

    public static int CP_p() {
        int n = CP_J5.CP_o();
        try {
            if (n == 0) {
                return 56;
            }
        }
        catch (RuntimeException runtimeException) {
            throw CP_J5.a(runtimeException);
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = CP_s.a(-103352098018344109L, -8598636277114292252L, MethodHandles.lookup().lookupClass()).a(77375556990757L);
        long l = b ^ 0x60208E0BFDBEL;
        CP_J5.CP_d(0);
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
        byte[] byArray3 = cipher.doFinal("*c\u0096\u00dd\u000b\u008a\u00c0y\u00fa=\u00e1\u001do\u009c\u0099\u0080\u00df\u00ffPWK\u0093d4#\u00be\u00a4-\u007f\u009ba\u0007*\u001b2}\u0090zk\u00c4\u00ecm\n\u0014>A\u00f9-".getBytes("ISO-8859-1"));
        c = CP_J5.b(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = 2325589973340719353L;
                byte[] byArray6 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                g = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
                return;
            }
            byArray5 = byArray5;
            byArray5[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static RuntimeException a(RuntimeException runtimeException) {
        return runtimeException;
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

