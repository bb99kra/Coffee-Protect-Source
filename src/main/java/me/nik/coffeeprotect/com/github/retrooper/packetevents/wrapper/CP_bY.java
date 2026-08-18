/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class CP_bY
extends PacketWrapper<CP_bY> {
    private int CP_d;
    private static transient /* synthetic */ String mYrXSrnxLQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bY(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bY(int n) {
        super(CP_nN.PICK_ITEM);
        this.CP_d = n;
    }

    @Override
    public void CP_e() {
        this.CP_d = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_d);
    }

    public void CP_m(CP_bY ilIlbY) {
        this.CP_d = ilIlbY.CP_d;
    }

    public int CP_j() {
        return this.CP_d;
    }

    public void CP_L(int n) {
        this.CP_d = n;
    }
}

