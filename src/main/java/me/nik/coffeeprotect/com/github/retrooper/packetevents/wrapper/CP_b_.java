/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_nC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_fe;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_b_
extends PacketWrapper<CP_b_> {
    private CP_An CP_o;
    private CP_fe CP_m;
    private CP_nC CP_u;
    private static transient /* synthetic */ String OYuHsvWUAA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b_(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_b_(CP_An ilIlAn, CP_fe ilIlfe, CP_nC ilIlnC) {
        super(CP_nN.TEST_INSTANCE_BLOCK_ACTION);
        this.CP_o = ilIlAn;
        this.CP_m = ilIlfe;
        this.CP_u = ilIlnC;
    }

    @Override
    public void CP_e() {
        this.CP_o = this.CP_E();
        this.CP_m = this.CP_y(CP_fe.class);
        this.CP_u = CP_nC.CP_B(this);
    }

    @Override
    public void CP_J() {
        this.CP_h(this.CP_o);
        this.CP_w(this.CP_m);
        CP_nC.CP_U(this, this.CP_u);
    }

    public void CP_X(CP_b_ ilIlb_) {
        this.CP_o = ilIlb_.CP_o;
        this.CP_m = ilIlb_.CP_m;
        this.CP_u = ilIlb_.CP_u;
    }

    @Override
    public CP_An CP_b() {
        return this.CP_o;
    }

    public void CP_v(CP_An ilIlAn) {
        this.CP_o = ilIlAn;
    }

    public CP_fe CP_G() {
        return this.CP_m;
    }

    public void CP_O(CP_fe ilIlfe) {
        this.CP_m = ilIlfe;
    }

    public CP_nC CP_d() {
        return this.CP_u;
    }

    public void CP_k(CP_nC ilIlnC) {
        this.CP_u = ilIlnC;
    }
}

