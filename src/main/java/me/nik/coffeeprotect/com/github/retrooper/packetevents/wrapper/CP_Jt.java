/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_Jt
extends PacketWrapper<CP_Jt> {
    private int CP_H;
    private static transient /* synthetic */ String QxbltNpHBN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jt(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Jt(int n) {
        super(CP_nN.ATTACK);
        this.CP_H = n;
    }

    @Override
    public void CP_e() {
        this.CP_H = this.CP_f();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_H);
    }

    public void CP_j(CP_Jt ilIlJt) {
        this.CP_H = ilIlJt.CP_H;
    }

    public int CP_E() {
        return this.CP_H;
    }

    public void CP_K(int n) {
        this.CP_H = n;
    }
}

