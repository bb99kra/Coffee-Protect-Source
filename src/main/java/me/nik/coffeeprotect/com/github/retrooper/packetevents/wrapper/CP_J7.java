/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_J7
extends PacketWrapper<CP_J7> {
    private String CP_A;
    private int CP_z;
    private static transient /* synthetic */ String AnXObbEwSQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J7(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_J7(String string, int n) {
        super(CP_Wz.TRANSFER);
        this.CP_A = string;
        this.CP_z = n;
    }

    @Override
    public void CP_e() {
        this.CP_A = this.CP_i();
        this.CP_z = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_M(this.CP_A);
        this.CP_J(this.CP_z);
    }

    public void CP_G(CP_J7 ilIlJ7) {
        this.CP_A = ilIlJ7.CP_A;
        this.CP_z = ilIlJ7.CP_z;
    }

    public String CP_n() {
        return this.CP_A;
    }

    public void CP_l(String string) {
        this.CP_A = string;
    }

    public int CP_P() {
        return this.CP_z;
    }

    public void CP_S(int n) {
        this.CP_z = n;
    }
}

