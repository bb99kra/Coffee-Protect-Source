/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bt
extends PacketWrapper<CP_bt> {
    private int CP_v;
    private String CP_x;
    private boolean CP_Q;
    private static transient /* synthetic */ String AszdKZANwQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bt(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bt(int n, String string, boolean bl) {
        super(CP_nN.UPDATE_COMMAND_BLOCK_MINECART);
        this.CP_v = n;
        this.CP_x = string;
        this.CP_Q = bl;
    }

    @Override
    public void CP_e() {
        this.CP_v = this.CP_f();
        this.CP_x = this.CP_i();
        this.CP_Q = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_v);
        this.CP_M(this.CP_x);
        this.CP_a(this.CP_Q);
    }

    public void CP_H(CP_bt ilIlbt) {
        this.CP_v = ilIlbt.CP_v;
        this.CP_x = ilIlbt.CP_x;
        this.CP_Q = ilIlbt.CP_Q;
    }

    public int CP_p() {
        return this.CP_v;
    }

    public void CP_W(int n) {
        this.CP_v = n;
    }

    public String CP_M() {
        return this.CP_x;
    }

    public void CP_x(String string) {
        this.CP_x = string;
    }

    public boolean CP_g() {
        return this.CP_Q;
    }

    public void CP_F(boolean bl) {
        this.CP_Q = bl;
    }
}

