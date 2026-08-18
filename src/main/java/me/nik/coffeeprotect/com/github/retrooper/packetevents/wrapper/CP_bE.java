/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_iP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bE
extends PacketWrapper<CP_bE> {
    private boolean CP_A;
    private boolean CP_M;
    private CP_iP CP_c;
    private boolean CP_n;
    private boolean CP_l;
    private static final long b = CP_s.a(-8071125979818011991L, -4848100154134063116L, MethodHandles.lookup().lookupClass()).a(38983381486751L);
    private static transient /* synthetic */ String TjembubKae = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    public CP_bE(PacketReceiveEvent var1_1) {
        block5: {
            block4: {
                var2_2 = CP_bE.b ^ 70111869622054L;
                v0 = CP_JH.CP_w();
                super(var1_1, false);
                var4_3 = v0;
                v1 = var1_1.getPacketType();
                v2 = CP_nN.PLAYER_POSITION;
                if (var4_3 != null) break block4;
                if (v1 == v2) ** GOTO lbl-1000
                v1 = var1_1.getPacketType();
                v2 = CP_nN.PLAYER_POSITION_AND_ROTATION;
            }
            if (v1 == v2) lbl-1000:
            // 2 sources

            {
                v3 = true;
            } else {
                v3 = false;
            }
            this.CP_A = v3;
            v4 = var1_1.getPacketType();
            v5 = CP_nN.PLAYER_ROTATION;
            if (var4_3 != null) break block5;
            if (v4 == v5) ** GOTO lbl-1000
            v4 = var1_1.getPacketType();
            v5 = CP_nN.PLAYER_POSITION_AND_ROTATION;
        }
        if (v4 == v5) lbl-1000:
        // 2 sources

        {
            v6 = true;
        } else {
            v6 = false;
        }
        this.CP_M = v6;
        this.CP_c(var1_1);
    }

    public CP_bE(boolean bl, boolean bl2, boolean bl3, CP_iP ilIliP) {
        this(bl, bl2, bl3, false, ilIliP);
    }

    public CP_bE(boolean bl, boolean bl2, boolean bl3, boolean bl4, CP_iP ilIliP) {
        long l = b ^ 0x1559C3C6C87L;
        super(bl && bl2 ? CP_nN.PLAYER_POSITION_AND_ROTATION : (bl ? CP_nN.PLAYER_POSITION : (bl2 ? CP_nN.PLAYER_ROTATION : CP_nN.PLAYER_FLYING)));
        this.CP_A = bl;
        this.CP_M = bl2;
        this.CP_n = bl3;
        this.CP_l = bl4;
        this.CP_c = ilIliP;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean CP_M(CP_oL ilIloL) {
        long l = b ^ 0x45F77EF2B774L;
        String string = CP_JH.CP_w();
        CP_oL ilIloL2 = ilIloL;
        CP_nN ilIlnN = CP_nN.PLAYER_FLYING;
        if (string == null) {
            if (ilIloL2 == ilIlnN) return true;
            ilIloL2 = ilIloL;
            ilIlnN = CP_nN.PLAYER_POSITION;
        }
        if (string == null) {
            if (ilIloL2 == ilIlnN) return true;
            ilIloL2 = ilIloL;
            ilIlnN = CP_nN.PLAYER_ROTATION;
        }
        if (string == null) {
            if (ilIloL2 == ilIlnN) return true;
            ilIloL2 = ilIloL;
            ilIlnN = CP_nN.PLAYER_POSITION_AND_ROTATION;
        }
        if (ilIloL2 != ilIlnN) return false;
        return true;
    }

    @Override
    public void CP_e() {
        long l = b ^ 0x3F8A1085C887L;
        CP_v_ ilIlv_ = new CP_v_();
        String string = CP_JH.CP_w();
        float f = 0.0f;
        float f2 = 0.0f;
        byte by = this.CP_A;
        if (string == null) {
            if (by != 0) {
                double d;
                double d2 = this.CP_b();
                double d3 = this.CP_b();
                CP_bE ilIlbE = this;
                if (string == null) {
                    if (ilIlbE.CP_g.CP_S(ServerVersion.V_1_7_10)) {
                        d = this.CP_b();
                    }
                    ilIlbE = this;
                }
                d = ilIlbE.CP_b();
                ilIlv_ = new CP_v_(d2, d3, d);
            }
            by = this.CP_M;
        }
        if (string == null) {
            if (by != 0) {
                f = this.CP_X();
                f2 = this.CP_X();
            }
            this.CP_c = new CP_iP(ilIlv_, f, f2);
            by = this.CP_E();
        }
        byte by2 = by;
        boolean bl = by2 & true;
        if (string == null) {
            bl = bl;
        }
        this.CP_n = bl;
        int n = by2 & 2;
        if (string == null) {
            n = n == 2 ? 1 : 0;
        }
        this.CP_l = n;
    }

    @Override
    public void CP_J() {
        CP_bE ilIlbE;
        String string;
        block10: {
            boolean bl;
            block9: {
                long l = b ^ 0x26F76D6CF62FL;
                string = CP_JH.CP_w();
                bl = this.CP_A;
                if (string != null) break block9;
                if (bl) {
                    this.CP_Y(this.CP_c.CP_n().CP_l());
                    CP_bE ilIlbE2 = this;
                    if (string == null) {
                        if (ilIlbE2.CP_g.CP_S(ServerVersion.V_1_7_10)) {
                            this.CP_Y(this.CP_c.CP_n().CP_k() + 1.62);
                        }
                        this.CP_Y(this.CP_c.CP_n().CP_k());
                        ilIlbE2 = this;
                    }
                    ilIlbE2.CP_Y(this.CP_c.CP_n().CP_Y());
                }
                ilIlbE = this;
                if (string != null) break block10;
                bl = ilIlbE.CP_M;
            }
            if (bl) {
                this.CP_R(this.CP_c.CP_H());
                this.CP_R(this.CP_c.CP_P());
            }
            ilIlbE = this;
        }
        int n = this.CP_n;
        if (string == null) {
            n = n != 0 ? 1 : 0;
        }
        int n2 = this.CP_l;
        if (string == null) {
            n2 = n2 != 0 ? 2 : 0;
        }
        ilIlbE.CP_u(n | n2);
    }

    public void CP_z(CP_bE ilIlbE) {
        this.CP_A = ilIlbE.CP_A;
        this.CP_M = ilIlbE.CP_M;
        this.CP_c = ilIlbE.CP_c;
        this.CP_n = ilIlbE.CP_n;
        this.CP_l = ilIlbE.CP_l;
    }

    public CP_iP CP_P() {
        return this.CP_c;
    }

    public void CP_I(CP_iP ilIliP) {
        this.CP_c = ilIliP;
    }

    public boolean CP_o() {
        return this.CP_A;
    }

    public void CP_z(boolean bl) {
        this.CP_A = bl;
    }

    public boolean CP_z() {
        return this.CP_M;
    }

    public void CP_m(boolean bl) {
        this.CP_M = bl;
    }

    public boolean CP_D() {
        return this.CP_n;
    }

    public void CP_U(boolean bl) {
        this.CP_n = bl;
    }

    public boolean CP_r() {
        return this.CP_l;
    }

    public void CP_k(boolean bl) {
        this.CP_l = bl;
    }
}

