/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_fx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_AV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_QG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_b5
extends PacketWrapper<CP_b5> {
    private CP_fx CP_y;
    private CP_An CP_A;
    private int CP_m;
    private CP_AV CP_H;
    private CP_QG CP_w;
    private Optional<CP_Cg> CP_J;
    private Optional<Boolean> CP_b;
    private Optional<Boolean> CP_u;
    private int CP_n;
    private static final long b = CP_s.a(-8193144901611122526L, -5482908511664327224L, MethodHandles.lookup().lookupClass()).a(82652576211662L);
    private static transient /* synthetic */ String EtvGKOaRRQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b5(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_b5(CP_fx ilIlfx, CP_An ilIlAn, CP_AV ilIlAV, CP_QG ilIlQG, CP_Cg ilIlCg, Boolean bl, int n) {
        this(ilIlfx, ilIlAn, ilIlAV, ilIlQG, ilIlCg, bl, null, n);
    }

    public CP_b5(CP_fx ilIlfx, CP_An ilIlAn, CP_AV ilIlAV, CP_QG ilIlQG, CP_Cg ilIlCg, Boolean bl, Boolean bl2, int n) {
        super(CP_nN.PLAYER_BLOCK_PLACEMENT);
        this.CP_y = ilIlfx;
        this.CP_A = ilIlAn;
        this.CP_H = ilIlAV;
        this.CP_m = ilIlAV.CP_K();
        this.CP_w = ilIlQG;
        this.CP_J = Optional.ofNullable(ilIlCg);
        this.CP_b = Optional.ofNullable(bl);
        this.CP_u = Optional.ofNullable(bl2);
        this.CP_n = n;
    }

    @Override
    public void CP_e() {
        block16: {
            block24: {
                CP_b5 ilIlb5;
                block25: {
                    String string;
                    block23: {
                        block21: {
                            CP_b5 ilIlb52;
                            block22: {
                                block20: {
                                    block18: {
                                        CP_b5 ilIlb53;
                                        block19: {
                                            boolean bl;
                                            block13: {
                                                block14: {
                                                    block17: {
                                                        CP_b5 ilIlb54;
                                                        boolean bl2;
                                                        block15: {
                                                            long l = b ^ 0x53CE264F8D73L;
                                                            this.CP_J = Optional.empty();
                                                            this.CP_b = Optional.empty();
                                                            string = CP_JH.CP_w();
                                                            bl = this.CP_g.CP_z(ServerVersion.V_1_14);
                                                            if (string != null) break block13;
                                                            if (!bl) break block14;
                                                            this.CP_y = CP_fx.CP_H(this.CP_f());
                                                            this.CP_A = this.CP_E();
                                                            this.CP_m = this.CP_f();
                                                            this.CP_H = CP_AV.CP_f(this.CP_m);
                                                            this.CP_w = new CP_QG(this.CP_X(), this.CP_X(), this.CP_X());
                                                            this.CP_b = Optional.of(this.CP_K());
                                                            bl2 = this.CP_g.CP_z(ServerVersion.V_1_19);
                                                            if (string != null) break block15;
                                                            if (!bl2) break block16;
                                                            ilIlb54 = this;
                                                            if (string != null) break block17;
                                                            bl2 = ilIlb54.CP_g.CP_z(ServerVersion.V_1_21_2);
                                                        }
                                                        if (bl2) {
                                                            this.CP_u = Optional.of(this.CP_K());
                                                        }
                                                        ilIlb54 = this;
                                                    }
                                                    ilIlb54.CP_n = this.CP_f();
                                                    if (string == null) break block16;
                                                }
                                                ilIlb53 = this;
                                                if (string != null) break block18;
                                                bl = ilIlb53.CP_g.CP_S(ServerVersion.V_1_7_10);
                                            }
                                            if (!bl) break block19;
                                            this.CP_A = new CP_An(this.CP_W(), this.CP_P(), this.CP_W());
                                            if (string == null) break block20;
                                        }
                                        ilIlb53 = this;
                                    }
                                    ilIlb53.CP_A = this.CP_E();
                                }
                                ilIlb52 = this;
                                if (string != null) break block21;
                                if (!ilIlb52.CP_g.CP_z(ServerVersion.V_1_9)) break block22;
                                this.CP_m = this.CP_f();
                                this.CP_H = CP_AV.CP_f(this.CP_m);
                                this.CP_y = CP_fx.CP_H(this.CP_f());
                                if (string == null) break block23;
                            }
                            this.CP_m = this.CP_P();
                            this.CP_H = CP_AV.CP_A(this.CP_m);
                            this.CP_J = Optional.of(this.CP_k());
                            ilIlb52 = this;
                        }
                        ilIlb52.CP_y = CP_fx.MAIN_HAND;
                    }
                    ilIlb5 = this;
                    if (string != null) break block24;
                    if (!ilIlb5.CP_g.CP_z(ServerVersion.V_1_11)) break block25;
                    this.CP_w = new CP_QG(this.CP_X(), this.CP_X(), this.CP_X());
                    if (string == null) break block16;
                }
                ilIlb5 = this;
            }
            ilIlb5.CP_w = new CP_QG((float)this.CP_P() / 16.0f, (float)this.CP_P() / 16.0f, (float)this.CP_P() / 16.0f);
        }
    }

    @Override
    public void CP_J() {
        block16: {
            CP_b5 ilIlb5;
            block24: {
                block25: {
                    String string;
                    block23: {
                        CP_b5 ilIlb52;
                        block21: {
                            block22: {
                                block20: {
                                    CP_b5 ilIlb53;
                                    block18: {
                                        block19: {
                                            boolean bl;
                                            block13: {
                                                block14: {
                                                    CP_b5 ilIlb54;
                                                    block17: {
                                                        boolean bl2;
                                                        block15: {
                                                            long l = b ^ 0x4AB35BA6B3DBL;
                                                            string = CP_JH.CP_w();
                                                            bl = this.CP_g.CP_z(ServerVersion.V_1_14);
                                                            if (string != null) break block13;
                                                            if (!bl) break block14;
                                                            this.CP_J(this.CP_y.CP_r());
                                                            this.CP_h(this.CP_A);
                                                            this.CP_J(this.CP_m);
                                                            this.CP_R(this.CP_w.CP_A);
                                                            this.CP_R(this.CP_w.CP_F);
                                                            this.CP_R(this.CP_w.CP_p);
                                                            this.CP_a(this.CP_b.orElse(false));
                                                            bl2 = this.CP_g.CP_z(ServerVersion.V_1_19);
                                                            if (string != null) break block15;
                                                            if (!bl2) break block16;
                                                            ilIlb54 = this;
                                                            if (string != null) break block17;
                                                            bl2 = ilIlb54.CP_g.CP_z(ServerVersion.V_1_21_2);
                                                        }
                                                        if (bl2) {
                                                            this.CP_a(this.CP_u.orElse(false));
                                                        }
                                                        ilIlb54 = this;
                                                    }
                                                    ilIlb54.CP_J(this.CP_n);
                                                    if (string == null) break block16;
                                                }
                                                ilIlb53 = this;
                                                if (string != null) break block18;
                                                bl = ilIlb53.CP_g.CP_S(ServerVersion.V_1_7_10);
                                            }
                                            if (!bl) break block19;
                                            this.CP_a(this.CP_A.CP_j);
                                            this.CP_u(this.CP_A.CP_w);
                                            this.CP_a(this.CP_A.CP_k);
                                            if (string == null) break block20;
                                        }
                                        ilIlb53 = this;
                                    }
                                    ilIlb53.CP_h(this.CP_A);
                                }
                                ilIlb52 = this;
                                if (string != null) break block21;
                                if (!ilIlb52.CP_g.CP_z(ServerVersion.V_1_9)) break block22;
                                this.CP_J(this.CP_m);
                                this.CP_J(this.CP_y.CP_r());
                                if (string == null) break block23;
                            }
                            this.CP_u(this.CP_m);
                            ilIlb52 = this;
                        }
                        ilIlb52.CP_j(this.CP_J.orElse(CP_Cg.CP_P));
                    }
                    ilIlb5 = this;
                    if (string != null) break block24;
                    if (!ilIlb5.CP_g.CP_z(ServerVersion.V_1_11)) break block25;
                    this.CP_R(this.CP_w.CP_A);
                    this.CP_R(this.CP_w.CP_F);
                    this.CP_R(this.CP_w.CP_p);
                    if (string == null) break block16;
                }
                this.CP_u((int)(this.CP_w.CP_A * 16.0f));
                this.CP_u((int)(this.CP_w.CP_F * 16.0f));
                ilIlb5 = this;
            }
            ilIlb5.CP_u((int)(this.CP_w.CP_p * 16.0f));
        }
    }

    public void CP_Z(CP_b5 ilIlb5) {
        this.CP_y = ilIlb5.CP_y;
        this.CP_A = ilIlb5.CP_A;
        this.CP_H = ilIlb5.CP_H;
        this.CP_m = ilIlb5.CP_m;
        this.CP_w = ilIlb5.CP_w;
        this.CP_J = ilIlb5.CP_J;
        this.CP_b = ilIlb5.CP_b;
        this.CP_u = ilIlb5.CP_u;
        this.CP_n = ilIlb5.CP_n;
    }

    public CP_fx CP_Y() {
        return this.CP_y;
    }

    public void CP_h(CP_fx ilIlfx) {
        this.CP_y = ilIlfx;
    }

    public CP_An CP_u() {
        return this.CP_A;
    }

    public void CP_H(CP_An ilIlAn) {
        this.CP_A = ilIlAn;
    }

    public int CP_D() {
        return this.CP_m;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void CP_l(int var1_1) {
        var2_2 = CP_b5.b ^ 88020058969502L;
        this.CP_m = var1_1;
        var4_3 = CP_JH.CP_w();
        v0 = this.CP_g.CP_z(ServerVersion.V_1_9);
        if (var4_3 != null) ** GOTO lbl10
        if (v0 != 0) {
            v1 = CP_AV.CP_f(var1_1);
        } else {
            v0 = var1_1;
lbl10:
            // 2 sources

            v1 = CP_AV.CP_A(v0);
        }
        this.CP_H = v1;
    }

    public CP_AV CP_T() {
        return this.CP_H;
    }

    public void CP_c(CP_AV ilIlAV) {
        this.CP_H = ilIlAV;
        this.CP_m = ilIlAV.CP_K();
    }

    public CP_QG CP_f() {
        return this.CP_w;
    }

    public void CP_d(CP_QG ilIlQG) {
        this.CP_w = ilIlQG;
    }

    public Optional<CP_Cg> CP_m() {
        return this.CP_J;
    }

    public void CP_F(Optional<CP_Cg> optional) {
        this.CP_J = optional;
    }

    public Optional<Boolean> CP_t() {
        long l = b ^ 0x4F4B98A9F93FL;
        String string = CP_JH.CP_w();
        Optional<Boolean> optional = this.CP_b;
        if (string == null) {
            optional = optional != null ? this.CP_b : Optional.empty();
        }
        return optional;
    }

    public void CP_v(Optional<Boolean> optional) {
        this.CP_b = optional;
    }

    public Optional<Boolean> CP_N() {
        long l = b ^ 0xEF6C4A0B49FL;
        String string = CP_JH.CP_w();
        Optional<Boolean> optional = this.CP_u;
        if (string == null) {
            optional = optional != null ? this.CP_u : Optional.empty();
        }
        return optional;
    }

    public void CP_d(Optional<Boolean> optional) {
        this.CP_u = optional;
    }

    public int CP_UnderScore() {
        return this.CP_n;
    }

    public void CP_Q(int n) {
        this.CP_n = n;
    }
}

