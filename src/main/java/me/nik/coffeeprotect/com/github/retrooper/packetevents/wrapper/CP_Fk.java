/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Fk
extends PacketWrapper<CP_Fk> {
    private String CP_Q;
    @Nullable
    private String CP_D;
    private static transient /* synthetic */ String YajHLtDpRf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fk(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fk(String string, @Nullable String string2) {
        super(CP_AG.RESET_SCORE);
        this.CP_Q = string;
        this.CP_D = string2;
    }

    @Override
    public void CP_e() {
        this.CP_Q = this.CP_i();
        this.CP_D = (String)this.CP_N(PacketWrapper::CP_i);
    }

    @Override
    public void CP_J() {
        this.CP_M(this.CP_Q);
        this.CP_I(this.CP_D, PacketWrapper::CP_M);
    }

    public void CP_q(CP_Fk ilIlFk) {
        this.CP_Q = ilIlFk.CP_Q;
        this.CP_D = ilIlFk.CP_D;
    }

    public String CP_q() {
        return this.CP_Q;
    }

    public void CP_S(String string) {
        this.CP_Q = string;
    }

    @Nullable
    public String CP_UnderScore() {
        return this.CP_D;
    }

    public void CP_y(@Nullable String string) {
        this.CP_D = string;
    }
}

