/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_n0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_JC
extends PacketWrapper<CP_JC> {
    private int CP_t;
    private String CP_f;
    private byte[] CP_m;
    private static transient /* synthetic */ String GhjIkjiyki = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JC(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_JC(int n, String string, byte[] byArray) {
        super(CP_n0.LOGIN_PLUGIN_REQUEST);
        this.CP_t = n;
        this.CP_f = string;
        this.CP_m = byArray;
    }

    @Override
    public void CP_e() {
        this.CP_t = this.CP_f();
        this.CP_f = this.CP_i();
        int n = ByteBufHelper.CP_H(this.CP_S);
        this.CP_m = this.CP_W(n);
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_t);
        this.CP_M(this.CP_f);
        this.CP_e(this.CP_m);
    }

    public void CP_T(CP_JC ilIlJC) {
        this.CP_t = ilIlJC.CP_t;
        this.CP_f = ilIlJC.CP_f;
        this.CP_m = ilIlJC.CP_m;
    }

    public int CP_A() {
        return this.CP_t;
    }

    public void CP_t(int n) {
        this.CP_t = n;
    }

    public String CP_s() {
        return this.CP_f;
    }

    public void CP_q(String string) {
        this.CP_f = string;
    }

    public byte[] CP_e() {
        return this.CP_m;
    }

    public void CP_J(byte[] byArray) {
        this.CP_m = byArray;
    }
}

