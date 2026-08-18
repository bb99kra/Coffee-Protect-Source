/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.CP_Tm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_J0;

public class CP_Jj
extends CP_J0<CP_Jj> {
    private static transient /* synthetic */ String zCuWzoATWF = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jj(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jj(CP_Tm ilIlTm) {
        super(CP_Wz.SHOW_DIALOG, ilIlTm);
    }

    @Override
    public void CP_e() {
        this.CP_C = CP_Tm.CP_D(this);
    }

    @Override
    public void CP_J() {
        CP_Tm.CP_w(this, this.CP_C);
    }
}

