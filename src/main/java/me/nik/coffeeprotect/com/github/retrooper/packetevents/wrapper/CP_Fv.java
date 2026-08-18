/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Fv
extends PacketWrapper<CP_Fv> {
    private int CP_O;
    private static transient /* synthetic */ String IFWPDzcDKi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fv(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fv(int n) {
        super(CP_AG.UPDATE_SIMULATION_DISTANCE);
        this.CP_O = n;
    }

    @Override
    public void CP_e() {
        this.CP_O = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_O);
    }

    public void CP_O(CP_Fv ilIlFv) {
        this.CP_O = ilIlFv.CP_O;
    }

    public int CP_x() {
        return this.CP_O;
    }

    public void CP_C(int n) {
        this.CP_O = n;
    }
}

