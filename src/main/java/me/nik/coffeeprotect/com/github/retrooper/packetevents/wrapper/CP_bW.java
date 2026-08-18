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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_ri;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_bW
extends PacketWrapper<CP_bW> {
    private static final int CP_c = 1;
    private static final int CP_C;
    private static final int CP_D;
    private CP_An CP_V;
    private String CP_h;
    private CP_ri CP_b;
    private boolean CP_T;
    private boolean CP_M;
    private boolean CP_Z;
    private short CP_d;
    private static final long b;
    private static transient /* synthetic */ String oQmAuvMNLQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bW(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bW(CP_An ilIlAn, String string, CP_ri ilIlri, boolean bl, boolean bl2, boolean bl3) {
        super(CP_nN.UPDATE_COMMAND_BLOCK);
        this.CP_V = ilIlAn;
        this.CP_h = string;
        this.CP_b = ilIlri;
        this.CP_T = bl;
        this.CP_M = bl2;
        this.CP_Z = bl3;
    }

    @Override
    public void CP_e() {
        long l = b ^ 0x21329477793EL;
        this.CP_V = new CP_An(this.CP_i(), this.CP_g);
        this.CP_h = this.CP_i();
        this.CP_b = CP_ri.CP_e(this.CP_f());
        this.CP_d = this.CP_P();
        String string = CP_JH.CP_w();
        int n = this.CP_d & 1;
        if (string == null) {
            n = n != 0 ? 1 : 0;
        }
        this.CP_T = n;
        int n2 = this.CP_d & 2;
        if (string == null) {
            n2 = n2 != 0 ? 1 : 0;
        }
        this.CP_M = n2;
        int n3 = this.CP_d & 4;
        if (string == null) {
            n3 = n3 != 0 ? 1 : 0;
        }
        this.CP_Z = n3;
    }

    @Override
    public void CP_J() {
        CP_bW ilIlbW;
        block8: {
            boolean bl;
            block7: {
                long l = b ^ 0x384FE99E4796L;
                String string = CP_JH.CP_w();
                this.CP_P(this.CP_V.CP_b(this.CP_g));
                String string2 = string;
                this.CP_M(this.CP_h);
                this.CP_J(this.CP_b.ordinal());
                bl = this.CP_T;
                if (string2 == null) {
                    if (bl) {
                        this.CP_d = (short)(this.CP_d | 1);
                    }
                    bl = this.CP_M;
                }
                if (string2 != null) break block7;
                if (bl) {
                    this.CP_d = (short)(this.CP_d | 2);
                }
                ilIlbW = this;
                if (string2 != null) break block8;
                bl = ilIlbW.CP_Z;
            }
            if (bl) {
                this.CP_d = (short)(this.CP_d | 4);
            }
            ilIlbW = this;
        }
        ilIlbW.CP_u(this.CP_d);
    }

    public void CP_c(CP_bW ilIlbW) {
        this.CP_V = ilIlbW.CP_V;
        this.CP_h = ilIlbW.CP_h;
        this.CP_b = ilIlbW.CP_b;
        this.CP_T = ilIlbW.CP_T;
        this.CP_M = ilIlbW.CP_M;
        this.CP_Z = ilIlbW.CP_Z;
        this.CP_d = ilIlbW.CP_d;
    }

    public CP_An CP_v() {
        return this.CP_V;
    }

    public void CP_A(CP_An ilIlAn) {
        this.CP_V = ilIlAn;
    }

    public String CP_P() {
        return this.CP_h;
    }

    public void CP_N(String string) {
        this.CP_h = string;
    }

    public CP_ri CP_k() {
        return this.CP_b;
    }

    public void CP_u(CP_ri ilIlri) {
        this.CP_b = ilIlri;
    }

    public boolean CP_l() {
        return this.CP_T;
    }

    public void CP_P(boolean bl) {
        this.CP_T = bl;
    }

    public boolean CP_p() {
        return this.CP_M;
    }

    public void CP_z(boolean bl) {
        this.CP_M = bl;
    }

    public boolean CP_G() {
        return this.CP_Z;
    }

    public void CP_I(boolean bl) {
        this.CP_Z = bl;
    }

    public short CP_J() {
        return this.CP_d;
    }

    public void CP_a(short s) {
        this.CP_d = s;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        b = CP_s.a(7386966187548575582L, -419509618622767104L, MethodHandles.lookup().lookupClass()).a(224565893694161L);
        long l = b ^ 0x703388058A77L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "0T\u00bb\u00cay\u00b4\u00ea+1r\u001b\u00a6q\u0017\u00e8\u00f2";
        int n2 = "0T\u00bb\u00cay\u00b4\u00ea+1r\u001b\u00a6q\u0017\u00e8\u00f2".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        CP_D = (int)lArray[1];
        CP_C = (int)lArray[0];
    }
}

