/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Set;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_C2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_Zt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_JR
extends PacketWrapper<CP_JR> {
    private Set<CP_C2<?>> CP_E;
    private static transient /* synthetic */ String IkXxxngfDl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JR(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JR(Set<CP_C2<?>> set) {
        super(CP_nN.DEBUG_SUBSCRIPTION_REQUEST);
        this.CP_E = set;
    }

    @Override
    public void CP_e() {
        this.CP_E = this.CP_I(packetWrapper -> packetWrapper.CP_t(CP_Zt.CP_p()));
    }

    @Override
    public void CP_J() {
        this.CP_Z(this.CP_E, PacketWrapper::CP_e);
    }

    public void CP_J(CP_JR ilIlJR) {
        this.CP_E = ilIlJR.CP_E;
    }

    public Set<CP_C2<?>> CP_V() {
        return this.CP_E;
    }

    public void CP_X(Set<CP_C2<?>> set) {
        this.CP_E = set;
    }
}

