/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Ff
extends PacketWrapper<CP_Ff> {
    private int CP_M;
    private static transient /* synthetic */ String fCbSfATJVs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Ff(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Ff(int n) {
        super(CP_AG.SET_COMPRESSION);
        this.CP_M = n;
    }

    @Override
    public void CP_e() {
        this.CP_M = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_M);
    }

    public void CP_p(CP_Ff ilIlFf) {
        this.CP_M = ilIlFf.CP_M;
    }

    public int CP_J() {
        return this.CP_M;
    }

    public void CP_M(int n) {
        this.CP_M = n;
    }
}

