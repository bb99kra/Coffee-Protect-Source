/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_bR
extends PacketWrapper<CP_bR> {
    private int CP_V;
    @Nullable
    private Component CP_c;
    private static transient /* synthetic */ String ufFruXepWM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bR(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bR(int n, @Nullable Component component) {
        super(CP_AG.CHAT_PREVIEW_PACKET);
        this.CP_V = n;
        this.CP_c = component;
    }

    @Override
    public void CP_e() {
        this.CP_V = this.CP_W();
        this.CP_c = (Component)this.CP_N(PacketWrapper::CP_J);
    }

    @Override
    public void CP_J() {
        this.CP_a(this.CP_V);
        this.CP_I(this.CP_c, PacketWrapper::CP_z);
    }

    public void CP_g(CP_bR ilIlbR) {
        this.CP_V = ilIlbR.CP_V;
        this.CP_c = ilIlbR.CP_c;
    }

    public int CP_E() {
        return this.CP_V;
    }

    public void CP_UnderScore(int n) {
        this.CP_V = n;
    }

    public Optional<Component> CP_k() {
        return Optional.ofNullable(this.CP_c);
    }

    public void CP_C(@Nullable Component component) {
        this.CP_c = component;
    }
}

