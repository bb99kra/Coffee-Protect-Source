/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_n7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JZ
extends PacketWrapper<CP_JZ> {
    private int CP_Z;
    private CP_Cg CP_C;
    private static final long b = CP_s.a(2574188429297067160L, 3434756886944332348L, MethodHandles.lookup().lookupClass()).a(92037355260350L);
    private static transient /* synthetic */ String dRcUBhvGvK = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JZ(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JZ(int n, CP_Cg ilIlCg) {
        super(CP_nN.CREATIVE_INVENTORY_ACTION);
        this.CP_Z = n;
        this.CP_C = ilIlCg;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_e() {
        var1_1 = CP_JZ.b ^ 61558977571284L;
        var3_2 = CP_JH.CP_w();
        v0 = this;
        if (var3_2 != null) ** GOTO lbl9
        if (v0.CP_g.CP_z(ServerVersion.V_1_20_5)) {
            v1 = this.CP_L();
        } else {
            v0 = this;
lbl9:
            // 2 sources

            v1 = v0.CP_G();
        }
        this.CP_Z = v1;
        v2 = this;
        if (var3_2 != null) ** GOTO lbl17
        if (v2.CP_g.CP_z(ServerVersion.V_1_21_5)) {
            v3 = CP_n7.CP_V(this);
        } else {
            v2 = this;
lbl17:
            // 2 sources

            v3 = CP_n7.CP_UnderScore(v2);
        }
        this.CP_C = v3;
    }

    @Override
    public void CP_J() {
        block4: {
            CP_JZ ilIlJZ;
            block2: {
                block3: {
                    long l = b ^ 0x2E81AD14977CL;
                    String string = CP_JH.CP_w();
                    this.CP_G(this.CP_Z);
                    String string2 = string;
                    ilIlJZ = this;
                    if (string2 != null) break block2;
                    if (!ilIlJZ.CP_g.CP_z(ServerVersion.V_1_21_5)) break block3;
                    CP_n7.CP_P(this, this.CP_C);
                    if (string2 == null) break block4;
                }
                ilIlJZ = this;
            }
            CP_n7.CP_i(ilIlJZ, this.CP_C);
        }
    }

    public void CP_Q(CP_JZ ilIlJZ) {
        this.CP_Z = ilIlJZ.CP_Z;
        this.CP_C = ilIlJZ.CP_C;
    }

    public int CP_q() {
        return this.CP_Z;
    }

    public void CP_v(int n) {
        this.CP_Z = n;
    }

    public CP_Cg CP_M() {
        return this.CP_C;
    }

    public void CP_d(CP_Cg ilIlCg) {
        this.CP_C = ilIlCg;
    }
}

