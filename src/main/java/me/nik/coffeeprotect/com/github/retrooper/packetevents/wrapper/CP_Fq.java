/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Fq
extends PacketWrapper<CP_Fq> {
    private String CP_r;
    private int CP_o;
    private static transient /* synthetic */ String uutZhFMHKE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fq(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fq(String string, int n) {
        super(CP_AG.TRANSFER);
        this.CP_r = string;
        this.CP_o = n;
    }

    @Override
    public void CP_e() {
        this.CP_r = this.CP_i();
        this.CP_o = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_M(this.CP_r);
        this.CP_J(this.CP_o);
    }

    public void CP_N(CP_Fq ilIlFq) {
        this.CP_r = ilIlFq.CP_r;
        this.CP_o = ilIlFq.CP_o;
    }

    public String CP_L() {
        return this.CP_r;
    }

    public void CP_m(String string) {
        this.CP_r = string;
    }

    public int CP_C() {
        return this.CP_o;
    }

    public void CP_K(int n) {
        this.CP_o = n;
    }
}

