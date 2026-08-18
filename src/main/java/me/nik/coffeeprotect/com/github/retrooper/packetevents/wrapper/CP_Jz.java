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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Jz
extends PacketWrapper<CP_Jz> {
    private String CP_p;
    private byte[] CP_E;
    private static final long b = CP_s.a(-1203038720377133394L, 3966186739327591104L, MethodHandles.lookup().lookupClass()).a(212915985249121L);
    private static final String c;
    private static final long g;
    private static transient /* synthetic */ String hqCpQoqOQE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jz(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jz(ResourceLocation resourceLocation, byte[] byArray) {
        this(resourceLocation.toString(), byArray);
    }

    public CP_Jz(String string, byte[] byArray) {
        super(CP_Wz.PLUGIN_MESSAGE);
        this.CP_p = string;
        this.CP_E = byArray;
    }

    @Override
    public void CP_e() {
        block4: {
            CP_Jz ilIlJz;
            block5: {
                long l = b ^ 0xEB663154BE9L;
                this.CP_p = this.CP_i();
                int[] nArray = CP_JS.CP_v();
                try {
                    try {
                        ilIlJz = this;
                        if (nArray == null) break block4;
                        if (ByteBufHelper.CP_H(ilIlJz.CP_S) <= (int)g) break block5;
                    }
                    catch (RuntimeException runtimeException) {
                        throw CP_Jz.a(runtimeException);
                    }
                    throw new RuntimeException(c);
                }
                catch (RuntimeException runtimeException) {
                    throw CP_Jz.a(runtimeException);
                }
            }
            ilIlJz = this;
        }
        ilIlJz.CP_E = this.CP_q();
    }

    @Override
    public void CP_J() {
        this.CP_M(this.CP_p);
        this.CP_e(this.CP_E);
    }

    public void CP_Z(CP_Jz ilIlJz) {
        this.CP_p = ilIlJz.CP_p;
        this.CP_E = ilIlJz.CP_E;
    }

    public String CP_H() {
        return this.CP_p;
    }

    public void CP_U(String string) {
        this.CP_p = string;
    }

    public byte[] CP_i() {
        return this.CP_E;
    }

    public void CP_T(byte[] byArray) {
        this.CP_E = byArray;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x2E52E2FE0C54L;
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
        byte[] byArray3 = cipher.doFinal("\u0014\u001d>\u00ab\u00bb\u0018\u001b\u008c\u00cbi\u00d31\u00d4\u00fd7\u00076\u0090\u00ee\u00f1\u00a9\u009c\u00cd\u0012d\u00cf.\u00d8(\u009c\u0084\u00b7\u00ed\u00a0\u00bb\u0084\u00b1QS\u00d0y\u00ef\u00c9Yaz\u0087\u001d".getBytes("ISO-8859-1"));
        c = CP_Jz.b(byArray3).intern();
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
                long l2 = -4155532639221369027L;
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

