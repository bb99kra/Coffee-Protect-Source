/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score.CP_W;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score.CP_j7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.score.CP_qN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public final class CP_QX
implements CP_W {
    private final Component CP_s;
    private static transient /* synthetic */ String SFjSFRpqzp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_QX(Component component) {
        this.CP_s = component;
    }

    public static CP_QX CP_C(PacketWrapper<?> packetWrapper) {
        return new CP_QX(packetWrapper.CP_J());
    }

    public static void CP_a(PacketWrapper<?> packetWrapper, CP_QX ilIlQX) {
        packetWrapper.CP_z(ilIlQX.CP_s);
    }

    @Override
    public Component CP_M(int n) {
        return this.CP_s;
    }

    public CP_qN<CP_QX> CP_w() {
        return CP_j7.CP_h;
    }

    public Component CP_I() {
        return this.CP_s;
    }
}

