/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JO
extends PacketWrapper<CP_JO> {
    private float CP_C;
    private static transient /* synthetic */ String zsJYckvtZn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JO(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JO(float f) {
        super(CP_nN.CHUNK_BATCH_ACK);
        this.CP_C = f;
    }

    @Override
    public void CP_e() {
        this.CP_C = this.CP_X();
    }

    @Override
    public void CP_J() {
        this.CP_R(this.CP_C);
    }

    public void CP_C(CP_JO ilIlJO) {
        this.CP_C = ilIlJO.CP_C;
    }

    public float CP_g() {
        return this.CP_C;
    }

    public void CP_W(float f) {
        this.CP_C = f;
    }
}

