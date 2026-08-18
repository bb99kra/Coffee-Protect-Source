/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_jx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Fa
extends PacketWrapper<CP_Fa> {
    private CP_jx CP_w;
    private static transient /* synthetic */ String ZoyYRUVGME = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fa(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fa(CP_jx ilIljx) {
        super(CP_AG.RECIPE_BOOK_SETTINGS);
        this.CP_w = ilIljx;
    }

    @Override
    public void CP_e() {
        this.CP_w = CP_jx.CP_I(this);
    }

    @Override
    public void CP_J() {
        CP_jx.CP_X(this, this.CP_w);
    }

    public void CP_T(CP_Fa ilIlFa) {
        this.CP_w = ilIlFa.CP_w;
    }

    public CP_jx CP_q() {
        return this.CP_w;
    }

    public void CP_P(CP_jx ilIljx) {
        this.CP_w = ilIljx;
    }
}

