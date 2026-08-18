/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_J9
extends PacketWrapper<CP_J9> {
    private int CP_D;
    private static transient /* synthetic */ String iJbaKJpqjn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J9(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_J9(int n) {
        super(CP_nN.CLOSE_WINDOW);
        this.CP_D = n;
    }

    @Override
    public void CP_e() {
        this.CP_D = this.CP_e();
    }

    @Override
    public void CP_J() {
        this.CP_r(this.CP_D);
    }

    @Override
    public void CP_B(CP_J9 ilIlJ9) {
        this.CP_D = ilIlJ9.CP_D;
    }

    public int CP_x() {
        return this.CP_D;
    }

    public void CP_K(int n) {
        this.CP_D = n;
    }
}

