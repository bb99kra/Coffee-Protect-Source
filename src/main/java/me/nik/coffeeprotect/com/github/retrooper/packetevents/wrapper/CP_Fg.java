/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class CP_Fg
extends PacketWrapper<CP_Fg> {
    @Deprecated
    public static boolean CP_s = true;
    private Component CP_w;
    private static transient /* synthetic */ String bAhcqhbCMd = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fg(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @Deprecated
    public CP_Fg(String string) {
        super(CP_AG.SET_TITLE_SUBTITLE);
        this.CP_w = this.CP_q().CP_x(string);
    }

    public CP_Fg(Component component) {
        super(CP_AG.SET_TITLE_SUBTITLE);
        this.CP_w = component;
    }

    @Override
    public void CP_e() {
        this.CP_w = this.CP_J();
    }

    @Override
    public void CP_J() {
        this.CP_z(this.CP_w);
    }

    public void CP_n(CP_Fg ilIlFg) {
        this.CP_w = ilIlFg.CP_w;
    }

    public Component CP_Z() {
        return this.CP_w;
    }

    public void CP_T(Component component) {
        this.CP_w = component;
    }

    @Deprecated
    public String CP_W() {
        return this.CP_q().CP_R(this.CP_Z());
    }

    @Deprecated
    public void CP_X(String string) {
        this.CP_T(this.CP_q().CP_x(string));
    }
}

