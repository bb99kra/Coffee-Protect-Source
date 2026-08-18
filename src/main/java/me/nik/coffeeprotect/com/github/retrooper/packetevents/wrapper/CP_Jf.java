/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Jf
extends PacketWrapper<CP_Jf> {
    @Nullable
    private UUID CP_n;
    private static transient /* synthetic */ String kTppGJNLHZ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jf(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Jf(@Nullable UUID uUID) {
        super(CP_Wz.RESOURCE_PACK_REMOVE);
        this.CP_n = uUID;
    }

    @Override
    public void CP_e() {
        this.CP_n = (UUID)this.CP_N(PacketWrapper::CP_v);
    }

    @Override
    public void CP_J() {
        this.CP_I(this.CP_n, PacketWrapper::CP_c);
    }

    public void CP_d(CP_Jf ilIlJf) {
        this.CP_n = ilIlJf.CP_n;
    }

    @Nullable
    public UUID CP_O() {
        return this.CP_n;
    }

    @Override
    public void CP_B(@Nullable UUID uUID) {
        this.CP_n = uUID;
    }
}

