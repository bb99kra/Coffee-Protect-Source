/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_oV;

public class CP_FY
extends PacketWrapper<CP_FY> {
    @Deprecated
    public static boolean CP_H = true;
    private Component CP_m;
    private Component CP_L;
    private static transient /* synthetic */ String bcUSXZMhkK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_FY(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @Deprecated
    public CP_FY(String string, String string2) {
        super(CP_AG.PLAYER_LIST_HEADER_AND_FOOTER);
        CP_oV ilIloV = this.CP_q().CP_s();
        this.CP_m = ilIloV.CP_u(string);
        this.CP_L = ilIloV.CP_u(string2);
    }

    public CP_FY(Component component, Component component2) {
        super(CP_AG.PLAYER_LIST_HEADER_AND_FOOTER);
        this.CP_m = component;
        this.CP_L = component2;
    }

    @Override
    public void CP_e() {
        this.CP_m = this.CP_J();
        this.CP_L = this.CP_J();
    }

    @Override
    public void CP_J() {
        this.CP_z(this.CP_m);
        this.CP_z(this.CP_L);
    }

    public void CP_b(CP_FY ilIlFY) {
        this.CP_m = ilIlFY.CP_m;
        this.CP_L = ilIlFY.CP_L;
    }

    public Component CP_t() {
        return this.CP_m;
    }

    public void CP_N(Component component) {
        this.CP_m = component;
    }

    public Component CP_v() {
        return this.CP_L;
    }

    public void CP_E(Component component) {
        this.CP_L = component;
    }

    @Deprecated
    public String CP_UnderScore() {
        return this.CP_q().CP_R(this.CP_t());
    }

    @Deprecated
    public void CP_r(String string) {
        this.CP_N(this.CP_q().CP_x(string));
    }

    @Deprecated
    public String CP_p() {
        return this.CP_q().CP_R(this.CP_v());
    }

    @Deprecated
    public void CP_UnderScore(String string) {
        this.CP_E(this.CP_q().CP_x(string));
    }

    @Deprecated
    public Component CP_Z() {
        return this.CP_t();
    }

    @Deprecated
    public void CP_M(Component component) {
        this.CP_N(component);
    }

    @Deprecated
    public Component CP_X() {
        return this.CP_v();
    }

    @Deprecated
    public void CP_UnderScore(Component component) {
        this.CP_E(component);
    }
}

