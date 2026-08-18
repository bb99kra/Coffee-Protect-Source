/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Fx
extends PacketWrapper<CP_Fx> {
    private int CP_A;
    private int CP_x;
    private int CP_T;
    private CP_Cg CP_H;
    private static final long b = CP_s.a(8664564702676127284L, 1982466993768082477L, MethodHandles.lookup().lookupClass()).a(109836195210346L);
    private static transient /* synthetic */ String DUqaVEFNri = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fx(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fx(int n, int n2, int n3, CP_Cg ilIlCg) {
        super(CP_AG.SET_SLOT);
        this.CP_A = n;
        this.CP_x = n2;
        this.CP_T = n3;
        this.CP_H = ilIlCg;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_e() {
        var1_1 = CP_Fx.b ^ 68069411485956L;
        var3_2 = CP_Fh.CP_a();
        v0 = this;
        if (var3_2 == null) ** GOTO lbl9
        if (v0.CP_g.CP_z(ServerVersion.V_1_21_2)) {
            v1 = this.CP_e();
        } else {
            v0 = this;
lbl9:
            // 2 sources

            v1 = v0.CP_E();
        }
        this.CP_A = v1;
        v2 = this;
        if (var3_2 != null) {
            if (v2.CP_g.CP_z(ServerVersion.V_1_17_1)) {
                this.CP_x = this.CP_f();
            }
            this.CP_T = this.CP_G();
            v2 = this;
        }
        v2.CP_H = this.CP_k();
    }

    @Override
    public void CP_J() {
        long l = b ^ 0x2495D8FE47ACL;
        PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
        this.CP_r(this.CP_A);
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        CP_Fx ilIlFx = this;
        if (packetWrapperArray2 != null) {
            if (ilIlFx.CP_g.CP_z(ServerVersion.V_1_17_1)) {
                this.CP_J(this.CP_x);
            }
            this.CP_G(this.CP_T);
            ilIlFx = this;
        }
        ilIlFx.CP_j(this.CP_H);
    }

    public void CP_E(CP_Fx ilIlFx) {
        this.CP_A = ilIlFx.CP_A;
        this.CP_x = ilIlFx.CP_x;
        this.CP_T = ilIlFx.CP_T;
        this.CP_H = ilIlFx.CP_H;
    }

    public int CP_E() {
        return this.CP_A;
    }

    public void CP_D(int n) {
        this.CP_A = n;
    }

    public int CP_d() {
        return this.CP_x;
    }

    @Override
    public void CP_B(int n) {
        this.CP_x = n;
    }

    public int CP_Q() {
        return this.CP_T;
    }

    public void CP_O(int n) {
        this.CP_T = n;
    }

    public CP_Cg CP_w() {
        return this.CP_H;
    }

    public void CP_t(CP_Cg ilIlCg) {
        this.CP_H = ilIlCg;
    }
}

