/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_O_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_AV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_bV
extends PacketWrapper<CP_bV> {
    private CP_O_ CP_B;
    private CP_An CP_A;
    private CP_AV CP_u;
    private int CP_F;
    private int CP_v;
    private static final long b = CP_s.a(7220779705509819929L, -7651038957283747183L, MethodHandles.lookup().lookupClass()).a(77897926356548L);
    private static transient /* synthetic */ String XCVuBkmEmJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bV(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bV(CP_O_ ilIlO_, CP_An ilIlAn, CP_AV ilIlAV, int n) {
        super(CP_nN.PLAYER_DIGGING);
        this.CP_B = ilIlO_;
        this.CP_A = ilIlAn;
        this.CP_u = ilIlAV;
        this.CP_F = ilIlAV.CP_K();
        this.CP_v = n;
    }

    public CP_bV(CP_O_ ilIlO_, CP_An ilIlAn, int n, int n2) {
        super(CP_nN.PLAYER_DIGGING);
        this.CP_B = ilIlO_;
        this.CP_A = ilIlAn;
        this.CP_u = CP_AV.CP_f(n);
        this.CP_F = n;
        this.CP_v = n2;
    }

    @Override
    public void CP_e() {
        block13: {
            block12: {
                String string;
                block11: {
                    int n;
                    block9: {
                        block10: {
                            block8: {
                                block6: {
                                    CP_bV ilIlbV;
                                    block7: {
                                        long l = b ^ 0x7EA7F1D540C9L;
                                        string = CP_JH.CP_w();
                                        ilIlbV = this;
                                        if (string != null) break block6;
                                        if (!ilIlbV.CP_g.CP_z(ServerVersion.V_1_9)) break block7;
                                        this.CP_B = CP_O_.CP_Z(this.CP_f());
                                        if (string == null) break block8;
                                    }
                                    ilIlbV = this;
                                }
                                ilIlbV.CP_B = CP_O_.CP_Z(this.CP_E());
                            }
                            n = this.CP_g.CP_z(ServerVersion.V_1_8);
                            if (string != null) break block9;
                            if (n == 0) break block10;
                            this.CP_A = this.CP_E();
                            if (string == null) break block11;
                        }
                        n = this.CP_W();
                    }
                    int n2 = n;
                    short s = this.CP_P();
                    int n3 = this.CP_W();
                    this.CP_A = new CP_An(n2, s, n3);
                }
                this.CP_F = this.CP_P();
                this.CP_u = CP_AV.CP_f(this.CP_F);
                CP_bV ilIlbV = this;
                if (string != null) break block12;
                if (!ilIlbV.CP_g.CP_z(ServerVersion.V_1_19)) break block13;
                ilIlbV = this;
            }
            ilIlbV.CP_v = this.CP_f();
        }
    }

    @Override
    public void CP_J() {
        block8: {
            CP_bV ilIlbV;
            block7: {
                String string;
                block6: {
                    CP_bV ilIlbV2;
                    block4: {
                        block5: {
                            long l = b ^ 0x67DA8C3C7E61L;
                            string = CP_JH.CP_w();
                            ilIlbV2 = this;
                            if (string != null) break block4;
                            if (!ilIlbV2.CP_g.CP_z(ServerVersion.V_1_8)) break block5;
                            this.CP_J(this.CP_B.CP_r());
                            this.CP_h(this.CP_A);
                            if (string == null) break block6;
                        }
                        this.CP_u(this.CP_B.CP_r());
                        this.CP_a(this.CP_A.CP_j);
                        this.CP_u(this.CP_A.CP_w);
                        ilIlbV2 = this;
                    }
                    ilIlbV2.CP_a(this.CP_A.CP_k);
                }
                this.CP_u(this.CP_F);
                ilIlbV = this;
                if (string != null) break block7;
                if (!ilIlbV.CP_g.CP_z(ServerVersion.V_1_19)) break block8;
                ilIlbV = this;
            }
            ilIlbV.CP_J(this.CP_v);
        }
    }

    public void CP_k(CP_bV ilIlbV) {
        this.CP_B = ilIlbV.CP_B;
        this.CP_A = ilIlbV.CP_A;
        this.CP_u = ilIlbV.CP_u;
        this.CP_F = ilIlbV.CP_F;
        this.CP_v = ilIlbV.CP_v;
    }

    public CP_O_ CP_g() {
        return this.CP_B;
    }

    public void CP_L(CP_O_ ilIlO_) {
        this.CP_B = ilIlO_;
    }

    public CP_An CP_T() {
        return this.CP_A;
    }

    public void CP_l(CP_An ilIlAn) {
        this.CP_A = ilIlAn;
    }

    public CP_AV CP_g() {
        return this.CP_u;
    }

    public void CP_b(CP_AV ilIlAV) {
        this.CP_u = ilIlAV;
        this.CP_F = ilIlAV.CP_K();
    }

    public int CP_S() {
        return this.CP_F;
    }

    public void CP_b(int n) {
        this.CP_u = CP_AV.CP_f(n);
        this.CP_F = n;
    }

    public int CP_n() {
        return this.CP_v;
    }

    public void CP_l(int n) {
        this.CP_v = n;
    }
}

