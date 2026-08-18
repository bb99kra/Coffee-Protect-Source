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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_b8
extends PacketWrapper<CP_b8> {
    private CP_An CP_M;
    private String[] CP_d;
    private boolean CP_Z;
    private static final long b = CP_s.a(5171570608187491530L, -3830344956316178671L, MethodHandles.lookup().lookupClass()).a(190453344268893L);
    private static final long c;
    private static transient /* synthetic */ String fcczeGAgxi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b8(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_b8(CP_An ilIlAn, String[] stringArray, boolean bl) {
        super(CP_nN.UPDATE_SIGN);
        this.CP_M = ilIlAn;
        this.CP_d = stringArray;
        this.CP_Z = bl;
    }

    @Override
    public void CP_e() {
        int n;
        String string;
        block10: {
            block8: {
                CP_b8 ilIlb8;
                block9: {
                    block7: {
                        int n2;
                        block5: {
                            block6: {
                                long l = b ^ 0x79C987815140L;
                                string = CP_JH.CP_w();
                                n2 = this.CP_g.CP_z(ServerVersion.V_1_8);
                                if (string != null) break block5;
                                if (n2 == 0) break block6;
                                this.CP_M = new CP_An(this.CP_i(), this.CP_g);
                                if (string == null) break block7;
                            }
                            n2 = this.CP_W();
                        }
                        n = n2;
                        short s = this.CP_G();
                        int n3 = this.CP_W();
                        this.CP_M = new CP_An(n, s, n3);
                    }
                    ilIlb8 = this;
                    if (string != null) break block8;
                    if (!ilIlb8.CP_g.CP_z(ServerVersion.V_1_20)) break block9;
                    this.CP_Z = this.CP_K();
                    if (string == null) break block10;
                }
                ilIlb8 = this;
            }
            ilIlb8.CP_Z = true;
        }
        this.CP_d = new String[4];
        for (n = 0; n < 4; ++n) {
            this.CP_d[n] = this.CP_p((int)c);
            if (string == null) continue;
        }
    }

    @Override
    public void CP_J() {
        int n;
        String string;
        block8: {
            CP_b8 ilIlb8;
            block6: {
                block7: {
                    long l = b ^ 0x60B4FA686FE8L;
                    string = CP_JH.CP_w();
                    ilIlb8 = this;
                    if (string != null) break block6;
                    if (!ilIlb8.CP_g.CP_z(ServerVersion.V_1_8)) break block7;
                    long l2 = this.CP_M.CP_b(this.CP_g);
                    this.CP_P(l2);
                    if (string == null) break block8;
                }
                this.CP_a(this.CP_M.CP_j);
                this.CP_G(this.CP_M.CP_w);
                ilIlb8 = this;
            }
            ilIlb8.CP_a(this.CP_M.CP_k);
        }
        int n2 = this.CP_g.CP_z(ServerVersion.V_1_20);
        if (string == null) {
            if (n2 != 0) {
                this.CP_a(this.CP_Z);
            }
            n2 = n = 0;
        }
        while (n < 4) {
            this.CP_M(this.CP_d[n]);
            ++n;
            if (string == null) continue;
        }
    }

    public void CP_M(CP_b8 ilIlb8) {
        this.CP_M = ilIlb8.CP_M;
        this.CP_Z = ilIlb8.CP_Z;
        this.CP_d = ilIlb8.CP_d;
    }

    public CP_An CP_X() {
        return this.CP_M;
    }

    public void CP_E(CP_An ilIlAn) {
        this.CP_M = ilIlAn;
    }

    public String[] CP_E() {
        return this.CP_d;
    }

    public void CP_UnderScore(String[] stringArray) {
        this.CP_d = stringArray;
    }

    public boolean CP_V() {
        return this.CP_Z;
    }

    public void CP_h(boolean bl) {
        this.CP_Z = bl;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = b ^ 0x677B6ECCF78EL;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 6862156474189994872L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                c = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

