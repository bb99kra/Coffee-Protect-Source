/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Cl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.CP_ZI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Fc
extends PacketWrapper<CP_Fc> {
    private int CP_J;
    private CP_ZI CP_C;
    private CP_Cl CP_H;
    @ApiStatus.Obsolete
    private boolean CP_I = false;
    private static final long b = CP_s.a(-5938412753242375405L, -6979910967326722416L, MethodHandles.lookup().lookupClass()).a(24811817288781L);
    private static transient /* synthetic */ String nkSjKbLSjA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fc(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fc(double d, double d2, double d3, float f, float f2, byte by, int n, boolean bl) {
        this(new CP_v_(d, d2, d3), f, f2, by, n, bl);
    }

    public CP_Fc(CP_v_ ilIlv_, float f, float f2, byte by, int n, boolean bl) {
        this(ilIlv_, f, f2, by, n);
        this.CP_I = bl;
    }

    public CP_Fc(CP_v_ ilIlv_, float f, float f2, byte by, int n) {
        this(n, ilIlv_, CP_v_.CP_d(), f, f2, by);
    }

    public CP_Fc(int n, CP_v_ ilIlv_, CP_v_ ilIlv_2, float f, float f2, byte by) {
        this(n, ilIlv_, ilIlv_2, f, f2, null);
        this.CP_H = new CP_Cl(by);
    }

    public CP_Fc(int n, CP_v_ ilIlv_, CP_v_ ilIlv_2, float f, float f2, CP_Cl ilIlCl) {
        this(n, new CP_ZI(ilIlv_, ilIlv_2, f, f2), ilIlCl);
    }

    public CP_Fc(int n, CP_ZI ilIlZI, CP_Cl ilIlCl) {
        super(CP_AG.PLAYER_POSITION_AND_LOOK);
        this.CP_J = n;
        this.CP_C = ilIlZI;
        this.CP_H = ilIlCl;
    }

    @Override
    public void CP_e() {
        block4: {
            block7: {
                CP_Fc ilIlFc;
                boolean bl;
                block6: {
                    PacketWrapper[] packetWrapperArray;
                    block5: {
                        CP_Fc ilIlFc2;
                        block2: {
                            block3: {
                                long l = b ^ 0x3EEE10CD230FL;
                                packetWrapperArray = CP_Fh.CP_a();
                                ilIlFc2 = this;
                                if (packetWrapperArray == null) break block2;
                                if (!ilIlFc2.CP_g.CP_z(ServerVersion.V_1_21_2)) break block3;
                                this.CP_J = this.CP_f();
                                this.CP_C = CP_ZI.CP_K(this);
                                this.CP_H = new CP_Cl(this.CP_W());
                                if (packetWrapperArray != null) break block4;
                            }
                            ilIlFc2 = this;
                        }
                        CP_v_ ilIlv_ = CP_v_.CP_G(ilIlFc2);
                        float f = this.CP_X();
                        float f2 = this.CP_X();
                        this.CP_C = new CP_ZI(ilIlv_, CP_v_.CP_d(), f, f2);
                        this.CP_H = new CP_Cl(this.CP_P());
                        bl = this.CP_g.CP_z(ServerVersion.V_1_9);
                        if (packetWrapperArray == null) break block5;
                        if (!bl) break block4;
                        this.CP_J = this.CP_f();
                        bl = this.CP_g.CP_z(ServerVersion.V_1_17);
                    }
                    if (packetWrapperArray == null) break block6;
                    if (!bl) break block4;
                    ilIlFc = this;
                    if (packetWrapperArray == null) break block7;
                    bl = ilIlFc.CP_g.CP_S(ServerVersion.V_1_19_3);
                }
                if (!bl) break block4;
                ilIlFc = this;
            }
            ilIlFc.CP_I = this.CP_K();
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_Fc ilIlFc;
            block7: {
                boolean bl;
                block6: {
                    PacketWrapper[] packetWrapperArray;
                    block5: {
                        block2: {
                            block3: {
                                long l = b ^ 0x27936D241DA7L;
                                packetWrapperArray = CP_Fh.CP_a();
                                bl = this.CP_g.CP_z(ServerVersion.V_1_21_2);
                                if (packetWrapperArray == null) break block2;
                                if (!bl) break block3;
                                this.CP_J(this.CP_J);
                                CP_ZI.CP_T(this, this.CP_C);
                                this.CP_a(this.CP_H.CP_s());
                                if (packetWrapperArray != null) break block4;
                            }
                            CP_v_.CP_C(this, this.CP_C.CP_u());
                            this.CP_R(this.CP_C.CP_d());
                            this.CP_R(this.CP_C.CP_U());
                            this.CP_u(this.CP_H.CP_s());
                            bl = this.CP_g.CP_z(ServerVersion.V_1_9);
                        }
                        if (packetWrapperArray == null) break block5;
                        if (!bl) break block4;
                        this.CP_J(this.CP_J);
                        bl = this.CP_g.CP_z(ServerVersion.V_1_17);
                    }
                    if (packetWrapperArray == null) break block6;
                    if (!bl) break block4;
                    ilIlFc = this;
                    if (packetWrapperArray == null) break block7;
                    bl = ilIlFc.CP_g.CP_S(ServerVersion.V_1_19_3);
                }
                if (!bl) break block4;
                ilIlFc = this;
            }
            ilIlFc.CP_a(this.CP_I);
        }
    }

    @Override
    public void CP_B(CP_Fc ilIlFc) {
        this.CP_J = ilIlFc.CP_J;
        this.CP_C = ilIlFc.CP_C;
        this.CP_H = ilIlFc.CP_H;
        this.CP_I = ilIlFc.CP_I;
    }

    public int CP_X() {
        return this.CP_J;
    }

    public void CP_t(int n) {
        this.CP_J = n;
    }

    public CP_ZI CP_r() {
        return this.CP_C;
    }

    public void CP_l(CP_ZI ilIlZI) {
        this.CP_C = ilIlZI;
    }

    public CP_v_ CP_E() {
        return this.CP_C.CP_u();
    }

    public void CP_a(CP_v_ ilIlv_) {
        this.CP_C.CP_y(ilIlv_);
    }

    public double CP_l() {
        return this.CP_E().CP_l();
    }

    public void CP_f(double d) {
        this.CP_a(new CP_v_(d, this.CP_K(), this.CP_S()));
    }

    public double CP_K() {
        return this.CP_E().CP_k();
    }

    public void CP_w(double d) {
        this.CP_a(new CP_v_(this.CP_l(), d, this.CP_S()));
    }

    public double CP_S() {
        return this.CP_E().CP_Y();
    }

    public void CP_L(double d) {
        this.CP_a(new CP_v_(this.CP_l(), this.CP_K(), d));
    }

    public CP_v_ CP_s() {
        return this.CP_C.CP_D();
    }

    public void CP_Z(CP_v_ ilIlv_) {
        this.CP_C.CP_u(ilIlv_);
    }

    public float CP_o() {
        return this.CP_C.CP_d();
    }

    public void CP_s(float f) {
        this.CP_C.CP_b(f);
    }

    public float CP_l() {
        return this.CP_C.CP_U();
    }

    public void CP_L(float f) {
        this.CP_C.CP_U(f);
    }

    @Deprecated
    public byte CP_S() {
        return this.CP_H.CP_S();
    }

    @Deprecated
    public void CP_x(byte by) {
        this.CP_H = new CP_Cl(by);
    }

    public boolean CP_g(CP_Cl ilIlCl) {
        return this.CP_H.CP_b(ilIlCl);
    }

    public void CP_h(CP_Cl ilIlCl, boolean bl) {
        this.CP_H = this.CP_H.CP_H(ilIlCl, bl);
    }

    public CP_Cl CP_C() {
        return this.CP_H;
    }

    public void CP_G(CP_Cl ilIlCl) {
        this.CP_H = ilIlCl;
    }

    @ApiStatus.Obsolete
    public boolean CP_N() {
        return this.CP_I;
    }

    @ApiStatus.Obsolete
    public void CP_I(boolean bl) {
        this.CP_I = bl;
    }
}

