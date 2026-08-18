/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_ZM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JP
extends PacketWrapper<CP_JP> {
    private CP_ZM CP_X;
    private static transient /* synthetic */ String yxwhDztDTo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JP(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JP(CP_ZM ilIlZM) {
        super(CP_nN.CHAT_SESSION_UPDATE);
        this.CP_X = ilIlZM;
    }

    @Override
    public void CP_e() {
        this.CP_X = this.CP_c();
    }

    @Override
    public void CP_J() {
        this.CP_q(this.CP_X);
    }

    public void CP_P(CP_JP ilIlJP) {
        this.CP_X = ilIlJP.CP_X;
    }

    public CP_ZM CP_W() {
        return this.CP_X;
    }

    public void CP_M(CP_ZM ilIlZM) {
        this.CP_X = ilIlZM;
    }
}

