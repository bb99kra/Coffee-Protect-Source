/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_jo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class CP_JN
extends PacketWrapper<CP_JN> {
    private CP_jo CP_E;
    private static transient /* synthetic */ String NkvpyfkckN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JN(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JN(CP_jo ilIljo) {
        super(CP_nN.DEBUG_SAMPLE_SUBSCRIPTION);
        this.CP_E = ilIljo;
    }

    @Override
    public void CP_e() {
        this.CP_E = CP_jo.values()[this.CP_f()];
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_E.ordinal());
    }

    public void CP_F(CP_JN ilIlJN) {
        this.CP_E = ilIlJN.CP_E;
    }

    public CP_jo CP_X() {
        return this.CP_E;
    }

    public void CP_L(CP_jo ilIljo) {
        this.CP_E = ilIljo;
    }
}

