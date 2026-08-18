/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.CP_Tm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_J0<T extends CP_J0<T>>
extends PacketWrapper<T> {
    protected CP_Tm CP_C;
    private static transient /* synthetic */ String oISZLsMQwo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J0(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_J0(CP_oL ilIloL, CP_Tm ilIlTm) {
        super(ilIloL);
        this.CP_C = ilIlTm;
    }

    @Override
    public void CP_e() {
        this.CP_C = CP_Tm.CP_x(this);
    }

    @Override
    public void CP_J() {
        CP_Tm.CP_u(this, this.CP_C);
    }

    public void CP_b(T t) {
        this.CP_C = ((CP_J0)t).CP_A();
    }

    public CP_Tm CP_A() {
        return this.CP_C;
    }

    public void CP_S(CP_Tm ilIlTm) {
        this.CP_C = ilIlTm;
    }
}

