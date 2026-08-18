/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_fx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Gk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_QG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_E;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.Nullable;

public class CP_bo
extends PacketWrapper<CP_bo> {
    private int CP_q;
    private CP_E CP_a;
    private @Nullable CP_v_ CP_p;
    private CP_fx CP_u;
    private boolean CP_w;
    private static final long b = CP_s.a(5718448999281940912L, -4724233492664047208L, MethodHandles.lookup().lookupClass()).a(42316123087244L);
    private static transient /* synthetic */ String POQXoGNxqC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bo(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    @Deprecated
    public CP_bo(int n, CP_E ilIlE, CP_fx ilIlfx, Optional<CP_QG> optional, Optional<Boolean> optional2) {
        this(n, ilIlE, optional.map(CP_v_::new).orElse(null), ilIlfx, optional2.orElse(false));
    }

    public CP_bo(int n, CP_fx ilIlfx, CP_v_ ilIlv_, boolean bl) {
        this(n, CP_E.INTERACT_AT, ilIlv_, ilIlfx, bl);
    }

    @ApiStatus.Obsolete
    public CP_bo(int n, CP_E ilIlE, @Nullable CP_v_ ilIlv_, CP_fx ilIlfx, boolean bl) {
        super(CP_nN.INTERACT_ENTITY);
        this.CP_q = n;
        this.CP_a = ilIlE;
        this.CP_p = ilIlv_;
        this.CP_u = ilIlfx;
        this.CP_w = bl;
    }

    @Override
    public void CP_e() {
        block8: {
            block9: {
                CP_bo ilIlbo;
                block10: {
                    String string;
                    block19: {
                        block18: {
                            block14: {
                                CP_bo ilIlbo2;
                                block15: {
                                    block16: {
                                        CP_bo ilIlbo3;
                                        block17: {
                                            block13: {
                                                block11: {
                                                    CP_bo ilIlbo4;
                                                    block12: {
                                                        boolean bl;
                                                        block6: {
                                                            block7: {
                                                                long l = b ^ 0x495618E93131L;
                                                                string = CP_JH.CP_w();
                                                                bl = this.CP_g.CP_z(ServerVersion.V_26_1);
                                                                if (string != null) break block6;
                                                                if (!bl) break block7;
                                                                this.CP_q = this.CP_f();
                                                                this.CP_u = (CP_fx)this.CP_H(CP_fx.values());
                                                                this.CP_p = CP_Gk.CP_X(this);
                                                                this.CP_w = this.CP_K();
                                                                this.CP_a = CP_E.INTERACT_AT;
                                                                if (string == null) break block8;
                                                            }
                                                            ilIlbo = this;
                                                            if (string != null) break block9;
                                                            bl = ilIlbo.CP_g.CP_z(ServerVersion.V_1_8);
                                                        }
                                                        if (!bl) break block10;
                                                        this.CP_q = this.CP_f();
                                                        this.CP_a = (CP_E)this.CP_H(CP_E.values());
                                                        ilIlbo4 = this;
                                                        if (string != null) break block11;
                                                        if (ilIlbo4.CP_a != CP_E.INTERACT_AT) break block12;
                                                        this.CP_p = new CP_v_(CP_QG.CP_b(this));
                                                        if (string == null) break block13;
                                                    }
                                                    ilIlbo4 = this;
                                                }
                                                ilIlbo4.CP_p = CP_v_.CP_d();
                                            }
                                            ilIlbo2 = this;
                                            if (string != null) break block14;
                                            if (!ilIlbo2.CP_g.CP_z(ServerVersion.V_1_9)) break block15;
                                            ilIlbo3 = this;
                                            if (string != null) break block16;
                                            if (ilIlbo3.CP_a == CP_E.INTERACT) break block17;
                                            ilIlbo2 = this;
                                            if (string != null) break block14;
                                            if (ilIlbo2.CP_a != CP_E.INTERACT_AT) break block15;
                                        }
                                        ilIlbo3 = this;
                                    }
                                    ilIlbo3.CP_u = (CP_fx)this.CP_H(CP_fx.values());
                                    if (string == null) break block18;
                                }
                                ilIlbo2 = this;
                            }
                            ilIlbo2.CP_u = CP_fx.MAIN_HAND;
                        }
                        CP_bo ilIlbo5 = this;
                        if (string != null) break block19;
                        if (!ilIlbo5.CP_g.CP_z(ServerVersion.V_1_16)) break block8;
                        ilIlbo5 = this;
                    }
                    ilIlbo5.CP_w = this.CP_K();
                    if (string == null) break block8;
                }
                this.CP_q = this.CP_W();
                this.CP_a = CP_E.VALUES[this.CP_E()];
                this.CP_u = CP_fx.MAIN_HAND;
                ilIlbo = this;
            }
            ilIlbo.CP_a = CP_E.INTERACT;
        }
    }

    @Override
    public void CP_J() {
        block11: {
            CP_bo ilIlbo;
            block12: {
                block13: {
                    CP_bo ilIlbo2;
                    String string;
                    block19: {
                        boolean bl;
                        block14: {
                            block18: {
                                block15: {
                                    CP_bo ilIlbo3;
                                    block16: {
                                        block17: {
                                            boolean bl2;
                                            block9: {
                                                block10: {
                                                    long l = b ^ 0x502B65000F99L;
                                                    string = CP_JH.CP_w();
                                                    bl2 = this.CP_g.CP_z(ServerVersion.V_26_1);
                                                    if (string != null) break block9;
                                                    if (!bl2) break block10;
                                                    this.CP_J(this.CP_q);
                                                    this.CP_w(this.CP_u);
                                                    CP_v_ ilIlv_ = this.CP_p;
                                                    if (string == null) {
                                                        ilIlv_ = ilIlv_ != null ? this.CP_p : CP_v_.CP_d();
                                                    }
                                                    CP_Gk.CP_E(this, ilIlv_);
                                                    this.CP_a(this.CP_w);
                                                    if (string == null) break block11;
                                                }
                                                ilIlbo = this;
                                                if (string != null) break block12;
                                                bl2 = ilIlbo.CP_g.CP_z(ServerVersion.V_1_8);
                                            }
                                            if (!bl2) break block13;
                                            this.CP_J(this.CP_q);
                                            this.CP_w(this.CP_a);
                                            CP_bo ilIlbo4 = this;
                                            if (string == null) {
                                                if (ilIlbo4.CP_a == CP_E.INTERACT_AT) {
                                                    CP_QG.CP_y(this, new CP_QG(this.CP_p != null ? this.CP_p : CP_v_.CP_d()));
                                                }
                                                ilIlbo4 = this;
                                            }
                                            bl = ilIlbo4.CP_g.CP_z(ServerVersion.V_1_9);
                                            if (string != null) break block14;
                                            if (!bl) break block15;
                                            ilIlbo3 = this;
                                            if (string != null) break block16;
                                            if (ilIlbo3.CP_a == CP_E.INTERACT) break block17;
                                            ilIlbo2 = this;
                                            if (string != null) break block18;
                                            if (ilIlbo2.CP_a != CP_E.INTERACT_AT) break block15;
                                        }
                                        ilIlbo3 = this;
                                    }
                                    ilIlbo3.CP_w(this.CP_u);
                                }
                                ilIlbo2 = this;
                            }
                            if (string != null) break block19;
                            bl = ilIlbo2.CP_g.CP_z(ServerVersion.V_1_16);
                        }
                        if (!bl) break block11;
                        ilIlbo2 = this;
                    }
                    ilIlbo2.CP_a(this.CP_w);
                    if (string == null) break block11;
                }
                this.CP_a(this.CP_q);
                ilIlbo = this;
            }
            ilIlbo.CP_u(this.CP_a.ordinal());
        }
    }

    public void CP_D(CP_bo ilIlbo) {
        this.CP_q = ilIlbo.CP_q;
        this.CP_a = ilIlbo.CP_a;
        this.CP_p = ilIlbo.CP_p;
        this.CP_u = ilIlbo.CP_u;
        this.CP_w = ilIlbo.CP_w;
    }

    public int CP_UnderScore() {
        return this.CP_q;
    }

    public void CP_b(int n) {
        this.CP_q = n;
    }

    @ApiStatus.Obsolete
    public CP_E CP_K() {
        return this.CP_a;
    }

    @ApiStatus.Obsolete
    public void CP_m(CP_E ilIlE) {
        this.CP_a = ilIlE;
    }

    public CP_fx CP_x() {
        return this.CP_u;
    }

    public void CP_S(CP_fx ilIlfx) {
        this.CP_u = ilIlfx;
    }

    public @UnknownNullability CP_v_ CP_l() {
        return this.CP_p;
    }

    public void CP_R(@UnknownNullability CP_v_ ilIlv_) {
        this.CP_p = ilIlv_;
    }

    @Deprecated
    public Optional<CP_QG> CP_A() {
        return Optional.ofNullable(this.CP_p).map(CP_QG::new);
    }

    @Deprecated
    public void CP_J(Optional<CP_QG> optional) {
        this.CP_p = optional.map(CP_v_::new).orElse(null);
    }

    public Optional<Boolean> CP_J() {
        return Optional.of(this.CP_w);
    }

    public void CP_y(boolean bl) {
        this.CP_w = bl;
    }

    @Deprecated
    public void CP_o(Optional<Boolean> optional) {
        this.CP_w = optional.orElse(false);
    }
}

