/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_JI
extends PacketWrapper<CP_JI> {
    private CP_An CP_v;
    private int CP_J;
    private boolean CP_x;
    private static transient /* synthetic */ String onCoEnWRve = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JI(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JI(CP_An ilIlAn, int n, boolean bl) {
        super(CP_nN.GENERATE_STRUCTURE);
        this.CP_v = ilIlAn;
        this.CP_J = n;
        this.CP_x = bl;
    }

    @Override
    public void CP_e() {
        this.CP_v = new CP_An(this.CP_i(), this.CP_g);
        this.CP_J = this.CP_f();
        this.CP_x = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_P(this.CP_v.CP_b(this.CP_g));
        this.CP_J(this.CP_J);
        this.CP_a(this.CP_x);
    }

    public void CP_h(CP_JI ilIlJI) {
        this.CP_v = ilIlJI.CP_v;
        this.CP_J = ilIlJI.CP_J;
        this.CP_x = ilIlJI.CP_x;
    }

    public CP_An CP_H() {
        return this.CP_v;
    }

    public void CP_u(CP_An ilIlAn) {
        this.CP_v = ilIlAn;
    }

    public int CP_S() {
        return this.CP_J;
    }

    public void CP_O(int n) {
        this.CP_J = n;
    }

    public boolean CP_e() {
        return this.CP_x;
    }

    public void CP_Q(boolean bl) {
        this.CP_x = bl;
    }
}

