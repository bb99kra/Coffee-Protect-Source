/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Fe
extends PacketWrapper<CP_Fe> {
    private Component CP_m;
    @Nullable
    private CP_An CP_F;
    private static transient /* synthetic */ String RPuRVQwDcL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fe(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fe(Component component, @Nullable CP_An ilIlAn) {
        super(CP_AG.TEST_INSTANCE_BLOCK_STATUS);
        this.CP_m = component;
        this.CP_F = ilIlAn;
    }

    @Override
    public void CP_e() {
        this.CP_m = this.CP_J();
        this.CP_F = (CP_An)this.CP_N(CP_An::CP_K);
    }

    @Override
    public void CP_J() {
        this.CP_z(this.CP_m);
        this.CP_I(this.CP_F, CP_An::CP_F);
    }

    public void CP_a(CP_Fe ilIlFe) {
        this.CP_m = ilIlFe.CP_m;
        this.CP_F = ilIlFe.CP_F;
    }

    public Component CP_h() {
        return this.CP_m;
    }

    public void CP_W(Component component) {
        this.CP_m = component;
    }

    @Nullable
    public CP_An CP_o() {
        return this.CP_F;
    }

    public void CP_i(@Nullable CP_An ilIlAn) {
        this.CP_F = ilIlAn;
    }
}

