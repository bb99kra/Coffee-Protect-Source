/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Fy
extends PacketWrapper<CP_Fy> {
    @Nullable
    private UUID CP_A;
    private static transient /* synthetic */ String WfBIBsXkfg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fy(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fy(@Nullable UUID uUID) {
        super(CP_AG.RESOURCE_PACK_REMOVE);
        this.CP_A = uUID;
    }

    @Override
    public void CP_e() {
        this.CP_A = (UUID)this.CP_N(PacketWrapper::CP_v);
    }

    @Override
    public void CP_J() {
        this.CP_I(this.CP_A, PacketWrapper::CP_c);
    }

    public void CP_e(CP_Fy ilIlFy) {
        this.CP_A = ilIlFy.CP_A;
    }

    @Nullable
    public UUID CP_n() {
        return this.CP_A;
    }

    public void CP_o(@Nullable UUID uUID) {
        this.CP_A = uUID;
    }
}

