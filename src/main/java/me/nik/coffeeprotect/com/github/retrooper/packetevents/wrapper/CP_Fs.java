/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Fs
extends PacketWrapper<CP_Fs> {
    private int CP_D;
    private int CP_N;
    private int CP_A;
    private static transient /* synthetic */ String uthOdbJErp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fs(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fs(int n, int n2, int n3) {
        super(CP_AG.SET_TITLE_TIMES);
        this.CP_D = n;
        this.CP_N = n2;
        this.CP_A = n3;
    }

    @Override
    public void CP_e() {
        this.CP_D = this.CP_W();
        this.CP_N = this.CP_W();
        this.CP_A = this.CP_W();
    }

    @Override
    public void CP_J() {
        this.CP_a(this.CP_D);
        this.CP_a(this.CP_N);
        this.CP_a(this.CP_A);
    }

    @Override
    public void CP_B(CP_Fs ilIlFs) {
        this.CP_D = ilIlFs.CP_D;
        this.CP_N = ilIlFs.CP_N;
        this.CP_A = ilIlFs.CP_A;
    }

    public int CP_s() {
        return this.CP_D;
    }

    public void CP_c(int n) {
        this.CP_D = n;
    }

    public int CP_Q() {
        return this.CP_N;
    }

    public void CP_g(int n) {
        this.CP_N = n;
    }

    public int CP_x() {
        return this.CP_A;
    }

    public void CP_W(int n) {
        this.CP_A = n;
    }
}

