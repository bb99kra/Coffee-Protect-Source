/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_qw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_G4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_h8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Js;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Jx
extends PacketWrapper<CP_Jx> {
    private byte[] CP_l;
    private byte[] CP_Q;
    private CP_h8 CP_p;
    private static final long b = CP_s.a(1987908468542125981L, -9178003901634628676L, MethodHandles.lookup().lookupClass()).a(181474389581655L);
    private static final String c;
    private static transient /* synthetic */ String HEGestXjRK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jx(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Jx(ClientVersion clientVersion, byte[] byArray, byte[] byArray2) {
        super(CP_qw.ENCRYPTION_RESPONSE.CP_Y(), clientVersion);
        this.CP_l = byArray;
        this.CP_Q = byArray2;
    }

    public CP_Jx(ClientVersion clientVersion, CP_h8 ilIlh8) {
        super(CP_qw.ENCRYPTION_RESPONSE.CP_Y(), clientVersion);
        this.CP_p = ilIlh8;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_Jx ilIlJx;
                block3: {
                    long l = b ^ 0x7E624AED10CL;
                    this.CP_l = this.CP_N(ByteBufHelper.CP_H(this.CP_S));
                    String[] stringArray = CP_Js.CP_y();
                    ilIlJx = this;
                    if (stringArray == null) break block2;
                    if (!ilIlJx.CP_g.CP_z(ServerVersion.V_1_19)) break block3;
                    ilIlJx = this;
                    if (stringArray == null) break block2;
                    if (!ilIlJx.CP_g.CP_S(ServerVersion.V_1_19_2)) break block3;
                    ilIlJx = this;
                    if (stringArray == null) break block2;
                    if (ilIlJx.CP_K()) break block3;
                    this.CP_p = this.CP_x();
                    if (stringArray != null) break block4;
                    PacketWrapper.CP_e(new int[1]);
                }
                ilIlJx = this;
            }
            ilIlJx.CP_Q = this.CP_l();
        }
    }

    @Override
    public void CP_J() {
        block6: {
            CP_Jx ilIlJx;
            block2: {
                block3: {
                    CP_Jx ilIlJx2;
                    String[] stringArray;
                    block4: {
                        block5: {
                            long l = b ^ 0x1E9B5947EFA4L;
                            String[] stringArray2 = CP_Js.CP_y();
                            this.CP_U(this.CP_l);
                            stringArray = stringArray2;
                            ilIlJx = this;
                            if (stringArray == null) break block2;
                            if (!ilIlJx.CP_g.CP_z(ServerVersion.V_1_19)) break block3;
                            ilIlJx = this;
                            if (stringArray == null) break block2;
                            if (!ilIlJx.CP_g.CP_S(ServerVersion.V_1_19_2)) break block3;
                            this.CP_a(this.CP_p == null);
                            ilIlJx2 = this;
                            if (stringArray == null) break block4;
                            if (ilIlJx2.CP_p == null) break block5;
                            this.CP_l(this.CP_p);
                            if (stringArray != null) break block6;
                        }
                        ilIlJx2 = this;
                    }
                    ilIlJx2.CP_U(this.CP_Q);
                    if (stringArray != null) break block6;
                }
                ilIlJx = this;
            }
            ilIlJx.CP_U(this.CP_Q);
        }
    }

    public void CP_a(CP_Jx ilIlJx) {
        this.CP_l = ilIlJx.CP_l;
        this.CP_Q = ilIlJx.CP_Q;
        this.CP_p = ilIlJx.CP_p;
    }

    public byte[] CP_e() {
        return this.CP_l;
    }

    public void CP_z(byte[] byArray) {
        this.CP_l = byArray;
    }

    public SecretKey CP_O(PrivateKey privateKey) {
        long l = b ^ 0x4D5DB1154C0CL;
        byte[] byArray = this.CP_e();
        byte[] byArray2 = CP_G4.CP_G(privateKey.getAlgorithm(), privateKey, byArray);
        if (byArray2 != null) {
            return new SecretKeySpec(byArray2, c);
        }
        return null;
    }

    public void CP_h(SecretKey secretKey, PublicKey publicKey) {
        this.CP_l = CP_G4.CP_B(publicKey.getAlgorithm(), publicKey, secretKey.getEncoded());
    }

    public Optional<byte[]> CP_f() {
        return Optional.ofNullable(this.CP_Q);
    }

    public void CP_h(byte[] byArray) {
        this.CP_Q = byArray;
    }

    public Optional<CP_h8> CP_z() {
        return Optional.ofNullable(this.CP_p);
    }

    public void CP_x(@Nullable CP_h8 ilIlh8) {
        this.CP_p = ilIlh8;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0xD3DF3596EB8L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("[\u00f95\u0010N\u0089\u00acF".getBytes("ISO-8859-1"));
                c = CP_Jx.b(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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

