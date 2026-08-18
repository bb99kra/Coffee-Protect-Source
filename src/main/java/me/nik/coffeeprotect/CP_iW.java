/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.InvalidPositionCheck;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_iW {
    private int CP_T;
    private int CP_G;
    private long CP_w;
    private static final long a = CP_s.a(-683635915205466671L, -1568618166094528852L, MethodHandles.lookup().lookupClass()).a(177871806064930L);
    private static transient /* synthetic */ String gDmZqyqzgR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_iW(int n, int n2) {
        long l = a ^ 0x6DE879A2B26L;
        this.CP_T = n;
        this.CP_G = n2;
        this.CP_w = System.currentTimeMillis();
        String string = InvalidPositionCheck.CP_q();
        if (PacketWrapper.CP_z() == null) {
            InvalidPositionCheck.CP_p("N9uOX");
        }
    }

    public long CP_c() {
        return this.CP_w;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean CP_P(int n, int n2) {
        long l = a ^ 0x5929B2684333L;
        String string = InvalidPositionCheck.CP_q();
        boolean bl = n;
        int n3 = this.CP_T;
        if (string == null) {
            if (bl != n3) return false;
            bl = n2;
            if (string != null) return bl;
            n3 = this.CP_G;
        }
        if (bl != n3) return false;
        return true;
    }

    public void CP_UnderScore(int n, int n2) {
        this.CP_T = n;
        this.CP_G = n2;
        this.CP_w = System.currentTimeMillis();
    }
}
