/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_bQ
extends PacketWrapper<CP_bQ> {
    private int CP_q;
    private static transient /* synthetic */ String emRhiKjAHQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bQ(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bQ(int n) {
        super(CP_nN.SPECTATE_ENTITY);
        this.CP_q = n;
    }

    @Override
    public void CP_e() {
        this.CP_q = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_q);
    }

    public void CP_o(CP_bQ ilIlbQ) {
        this.CP_q = ilIlbQ.CP_q;
    }

    public int CP_s() {
        return this.CP_q;
    }

    public void CP_A(int n) {
        this.CP_q = n;
    }
}

