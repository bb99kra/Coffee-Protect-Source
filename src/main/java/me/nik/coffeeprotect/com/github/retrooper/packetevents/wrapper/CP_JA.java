/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JA
extends PacketWrapper<CP_JA> {
    private int CP_u;
    private int CP_Z;
    private static final long b = CP_s.a(-8719790058172779212L, 4590644045328368376L, MethodHandles.lookup().lookupClass()).a(96742724020887L);
    private static transient /* synthetic */ String LKASlnfzqN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JA(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JA(int n, int n2) {
        super(CP_nN.CLICK_WINDOW_BUTTON);
        this.CP_u = n;
        this.CP_Z = n2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_e() {
        var1_1 = CP_JA.b ^ 114968915296193L;
        var3_2 = CP_JH.CP_w();
        v0 = this;
        if (var3_2 != null) ** GOTO lbl9
        if (v0.CP_g.CP_z(ServerVersion.V_1_21_2)) {
            v1 = this.CP_e();
        } else {
            v0 = this;
lbl9:
            // 2 sources

            v1 = v0.CP_f();
        }
        this.CP_u = v1;
        this.CP_Z = this.CP_E();
    }

    @Override
    public void CP_J() {
        this.CP_r(this.CP_u);
        this.CP_u(this.CP_Z);
    }

    public void CP_u(CP_JA ilIlJA) {
        this.CP_u = ilIlJA.CP_u;
        this.CP_Z = ilIlJA.CP_Z;
    }

    public int CP_g() {
        return this.CP_u;
    }

    public void CP_k(int n) {
        this.CP_u = n;
    }

    public int CP_s() {
        return this.CP_Z;
    }

    public void CP_s(int n) {
        this.CP_Z = n;
    }
}

