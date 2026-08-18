/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bG
extends PacketWrapper<CP_bG> {
    private CP_v_ CP_s;
    private float CP_y;
    private float CP_r;
    private boolean CP_o;
    private static final long b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(7340531647947353699L, 4346010646402317436L, MethodHandles.lookup().lookupClass()).a(125416301281632L);
    private static transient /* synthetic */ String HOAwnKvggp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bG(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bG(CP_v_ ilIlv_, float f, float f2) {
        this(ilIlv_, f, f2, false);
    }

    public CP_bG(CP_v_ ilIlv_, float f, float f2, boolean bl) {
        super(CP_nN.VEHICLE_MOVE);
        this.CP_s = ilIlv_;
        this.CP_y = f;
        this.CP_r = f2;
        this.CP_o = bl;
    }

    @Override
    public void CP_e() {
        block3: {
            block2: {
                long l = b ^ 0x63DDE377DB2DL;
                this.CP_s = CP_v_.CP_G(this);
                this.CP_y = this.CP_X();
                this.CP_r = this.CP_X();
                String string = CP_JH.CP_w();
                CP_bG ilIlbG = this;
                if (string != null) break block2;
                if (!ilIlbG.CP_g.CP_z(ServerVersion.V_1_21_4)) break block3;
                ilIlbG = this;
            }
            ilIlbG.CP_o = this.CP_K();
        }
    }

    @Override
    public void CP_J() {
        block3: {
            CP_bG ilIlbG;
            block2: {
                long l = b ^ 0x7AA09E9EE585L;
                String string = CP_JH.CP_w();
                CP_v_.CP_C(this, this.CP_s);
                this.CP_R(this.CP_y);
                this.CP_R(this.CP_r);
                String string2 = string;
                ilIlbG = this;
                if (string2 != null) break block2;
                if (!ilIlbG.CP_g.CP_z(ServerVersion.V_1_21_4)) break block3;
                ilIlbG = this;
            }
            ilIlbG.CP_a(this.CP_o);
        }
    }

    public void CP_C(CP_bG ilIlbG) {
        this.CP_s = ilIlbG.CP_s;
        this.CP_y = ilIlbG.CP_y;
        this.CP_r = ilIlbG.CP_r;
        this.CP_o = ilIlbG.CP_o;
    }

    public CP_v_ CP_t() {
        return this.CP_s;
    }

    public void CP_m(CP_v_ ilIlv_) {
        this.CP_s = ilIlv_;
    }

    public float CP_S() {
        return this.CP_y;
    }

    public void CP_N(float f) {
        this.CP_y = f;
    }

    public float CP_D() {
        return this.CP_r;
    }

    public void CP_t(float f) {
        this.CP_r = f;
    }

    public boolean CP_n() {
        return this.CP_o;
    }

    public void CP_d(boolean bl) {
        this.CP_o = bl;
    }
}

