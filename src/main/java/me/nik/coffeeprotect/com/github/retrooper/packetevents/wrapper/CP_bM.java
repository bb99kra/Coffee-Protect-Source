/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_ZK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bM
extends PacketWrapper<CP_bM> {
    private CP_An CP_l;
    private CP_ZK CP_J;
    private String CP_Z;
    private static transient /* synthetic */ String imiyZySbWK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bM(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bM(CP_An ilIlAn, CP_ZK ilIlZK, String string) {
        super(CP_nN.SET_TEST_BLOCK);
        this.CP_l = ilIlAn;
        this.CP_J = ilIlZK;
        this.CP_Z = string;
    }

    @Override
    public void CP_e() {
        this.CP_l = this.CP_E();
        this.CP_J = this.CP_y(CP_ZK.class);
        this.CP_Z = this.CP_i();
    }

    @Override
    public void CP_J() {
        this.CP_h(this.CP_l);
        this.CP_w(this.CP_J);
        this.CP_M(this.CP_Z);
    }

    public void CP_k(CP_bM ilIlbM) {
        this.CP_l = ilIlbM.CP_l;
        this.CP_J = ilIlbM.CP_J;
        this.CP_Z = ilIlbM.CP_Z;
    }

    public CP_An CP_K() {
        return this.CP_l;
    }

    public void CP_y(CP_An ilIlAn) {
        this.CP_l = ilIlAn;
    }

    public CP_ZK CP_o() {
        return this.CP_J;
    }

    public void CP_p(CP_ZK ilIlZK) {
        this.CP_J = ilIlZK;
    }

    public String CP_s() {
        return this.CP_Z;
    }

    public void CP_i(String string) {
        this.CP_Z = string;
    }
}

