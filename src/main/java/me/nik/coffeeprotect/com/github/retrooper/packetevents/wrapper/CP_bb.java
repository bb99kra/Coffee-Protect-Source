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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bb
extends PacketWrapper<CP_bb> {
    private int CP_M;
    private int CP_Q;
    private static final long b = CP_s.a(2972321024573618715L, 8987313649604939817L, MethodHandles.lookup().lookupClass()).a(154897888820612L);
    private static final String c;
    private static transient /* synthetic */ String yoIMFBlFVA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bb(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bb(int n, int n2) {
        super(CP_nN.SELECT_BUNDLE_ITEM);
        this.CP_M = n;
        this.CP_Q = n2;
    }

    @Override
    public void CP_e() {
        block8: {
            int n;
            block7: {
                long l = b ^ 0x68F65FB9CA8L;
                this.CP_M = this.CP_f();
                String string = CP_JH.CP_w();
                try {
                    try {
                        n = this.CP_Q = this.CP_f();
                        if (string != null) break block7;
                        if (n >= 0) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_bb.a(illegalArgumentException);
                    }
                    n = this.CP_Q;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_bb.a(illegalArgumentException);
                }
            }
            try {
                if (n != -1) {
                    throw new IllegalArgumentException(c + this.CP_Q);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CP_bb.a(illegalArgumentException);
            }
        }
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_M);
        this.CP_J(this.CP_Q);
    }

    public void CP_e(CP_bb ilIlbb) {
        this.CP_M = ilIlbb.CP_M;
        this.CP_Q = ilIlbb.CP_Q;
    }

    public int CP_c() {
        return this.CP_M;
    }

    public void CP_k(int n) {
        this.CP_M = n;
    }

    public int CP_o() {
        return this.CP_Q;
    }

    public void CP_F(int n) {
        this.CP_Q = n;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x4E0DE64AD546L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("n\u008d\u00eaqH\u0011\u00d0'\u00e8\u00df\u0015\u00a5\u00eby\u000b\u00bd\u00fc}\u009a\u00fe\u00b9\u0099\u00f88\u00a5\u0090\u00a6\u00fb\u00f0\u00cb\u0011\u00fb".getBytes("ISO-8859-1"));
                c = CP_bb.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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

