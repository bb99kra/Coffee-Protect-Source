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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_Wb;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public final class CP_GZ {
    private static final byte CP_P = 1;
    private static final byte CP_d;
    private CP_Wb CP_G;
    private boolean CP_UnderScore;
    private boolean CP_m;
    private static final long a;
    private static transient /* synthetic */ String sdgduNNrHb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_GZ(CP_Wb ilIlWb, byte by) {
        long l = a ^ 0x608823720CA3L;
        this(ilIlWb, (by & 1) != 0, (by & 2) != 0);
    }

    public CP_GZ(CP_Wb ilIlWb, boolean bl, boolean bl2) {
        this.CP_G = ilIlWb;
        this.CP_UnderScore = bl;
        this.CP_m = bl2;
    }

    public static CP_GZ CP_t(PacketWrapper<?> packetWrapper) {
        CP_Wb ilIlWb = CP_Wb.CP_V(packetWrapper);
        byte by = packetWrapper.CP_E();
        return new CP_GZ(ilIlWb, by);
    }

    public static void CP_z(PacketWrapper<?> packetWrapper, CP_GZ ilIlGZ) {
        CP_Wb.CP_t(packetWrapper, ilIlGZ.CP_G);
        packetWrapper.CP_u(ilIlGZ.CP_I());
    }

    public CP_Wb CP_K() {
        return this.CP_G;
    }

    public void CP_v(CP_Wb ilIlWb) {
        this.CP_G = ilIlWb;
    }

    public boolean CP_UnderScore() {
        return this.CP_UnderScore;
    }

    public void CP_u(boolean bl) {
        this.CP_UnderScore = bl;
    }

    public boolean CP_o() {
        return this.CP_m;
    }

    public void CP_w(boolean bl) {
        this.CP_m = bl;
    }

    public byte CP_I() {
        long l = a ^ 0x11544B7AA1E0L;
        PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
        int n = this.CP_UnderScore;
        if (packetWrapperArray != null) {
            n = n != 0 ? 1 : 0;
        }
        int n2 = this.CP_m;
        if (packetWrapperArray != null) {
            n2 = n2 != 0 ? 2 : 0;
        }
        return (byte)(n | n2);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(-8633205043034516624L, -7283409739166025720L, MethodHandles.lookup().lookupClass()).a(199996525694476L);
        long l = a ^ 0x61C5FFB68AD4L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = 2921890177128653319L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                long l3 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                CP_d = (byte)l3;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }
}

