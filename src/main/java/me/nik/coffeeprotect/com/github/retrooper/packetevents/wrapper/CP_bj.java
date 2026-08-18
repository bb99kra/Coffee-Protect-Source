/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bj
extends PacketWrapper<CP_bj> {
    private String CP_o;
    private static transient /* synthetic */ String BMhREkKoIa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bj(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bj(String string) {
        super(CP_nN.NAME_ITEM);
        this.CP_o = string;
    }

    @Override
    public void CP_e() {
        this.CP_o = this.CP_i();
    }

    @Override
    public void CP_J() {
        this.CP_M(this.CP_o);
    }

    public void CP_w(CP_bj ilIlbj) {
        this.CP_o = ilIlbj.CP_o;
    }

    public String CP_p() {
        return this.CP_o;
    }

    public void CP_y(String string) {
        this.CP_o = string;
    }
}

