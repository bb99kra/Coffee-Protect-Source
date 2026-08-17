/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class IlIliW {
    private int IlIlT;
    private int IlIlG;
    private long IlIlw;
    private static final long a = IlIls.a((long)-683635915205466671L, (long)-1568618166094528852L, MethodHandles.lookup().lookupClass()).a(177871806064930L);
    private static transient /* synthetic */ String gDmZqyqzgR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIliW(int n, int n2) {
        long l = a ^ 0x6DE879A2B26L;
        this.IlIlT = n;
        this.IlIlG = n2;
        this.IlIlw = System.currentTimeMillis();
        String string = IlIlu7.IlIlq();
        if (PacketWrapper.IlIlz() == null) {
            IlIlu7.IlIlp("N9uOX");
        }
    }

    public long IlIlc() {
        return this.IlIlw;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean IlIlP(int n, int n2) {
        long l = a ^ 0x5929B2684333L;
        String string = IlIlu7.IlIlq();
        boolean bl = n;
        int n3 = this.IlIlT;
        if (string == null) {
            if (bl != n3) return false;
            bl = n2;
            if (string != null) return bl;
            n3 = this.IlIlG;
        }
        if (bl != n3) return false;
        return true;
    }

    public void IlIl_(int n, int n2) {
        this.IlIlT = n;
        this.IlIlG = n2;
        this.IlIlw = System.currentTimeMillis();
    }
}

