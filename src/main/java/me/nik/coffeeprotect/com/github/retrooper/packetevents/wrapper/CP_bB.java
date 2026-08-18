/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.MonotonicNonNull
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_WM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.checkerframework.checker.nullness.qual.MonotonicNonNull;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_bB
extends PacketWrapper<CP_bB> {
    private @MonotonicNonNull List<CP_WM> CP_o;
    private static transient /* synthetic */ String AtYNLpmLdn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bB(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bB(List<CP_WM> list) {
        super(CP_nN.SET_GAME_RULE);
        this.CP_o = list;
    }

    @Override
    public void CP_e() {
        this.CP_o = this.CP_l(CP_WM::CP_M);
    }

    @Override
    public void CP_J() {
        this.CP_Q(this.CP_o, CP_WM::CP_n);
    }

    public void CP_H(CP_bB ilIlbB) {
        this.CP_o = ilIlbB.CP_o;
    }

    public List<CP_WM> CP_z() {
        return this.CP_o;
    }

    public void CP_f(List<CP_WM> list) {
        this.CP_o = list;
    }
}

