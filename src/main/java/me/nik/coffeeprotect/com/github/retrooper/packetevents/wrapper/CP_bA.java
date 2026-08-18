/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.CP_d_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bA
extends PacketWrapper<CP_bA> {
    private CP_An CP_f;
    private int CP_r;
    private int CP_UnderScore;
    private int CP_C;
    private static final long b = CP_s.a(5233087665860935704L, -5871482829409981539L, MethodHandles.lookup().lookupClass()).a(193315183713768L);
    private static transient /* synthetic */ String KNhOqwsfGi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bA(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bA(CP_An ilIlAn, int n, int n2, int n3) {
        super(CP_AG.BLOCK_ACTION);
        this.CP_f = ilIlAn;
        this.CP_r = n;
        this.CP_UnderScore = n2;
        this.CP_C = n3;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_bA ilIlbA;
                block3: {
                    long l = b ^ 0x7564565CDD68L;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlbA = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlbA.CP_g.CP_S(ServerVersion.V_1_7_10)) break block3;
                    int n = this.CP_W();
                    short s = this.CP_G();
                    int n2 = this.CP_W();
                    this.CP_f = new CP_An(n, s, n2);
                    if (packetWrapperArray != null) break block4;
                }
                ilIlbA = this;
            }
            ilIlbA.CP_f = this.CP_E();
        }
        this.CP_r = this.CP_P();
        this.CP_UnderScore = this.CP_P();
        this.CP_C = this.CP_f();
    }

    @Override
    public void CP_J() {
        block4: {
            CP_bA ilIlbA;
            block2: {
                block3: {
                    long l = b ^ 0x6C192BB5E3C0L;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlbA = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlbA.CP_g.CP_S(ServerVersion.V_1_7_10)) break block3;
                    this.CP_a(this.CP_f.CP_j);
                    this.CP_G(this.CP_f.CP_w);
                    this.CP_a(this.CP_f.CP_k);
                    if (packetWrapperArray != null) break block4;
                }
                ilIlbA = this;
            }
            ilIlbA.CP_h(this.CP_f);
        }
        this.CP_u(this.CP_r);
        this.CP_u(this.CP_UnderScore);
        this.CP_J(this.CP_C);
    }

    public void CP_d(CP_bA ilIlbA) {
        this.CP_f = ilIlbA.CP_f;
        this.CP_r = ilIlbA.CP_r;
        this.CP_UnderScore = ilIlbA.CP_UnderScore;
        this.CP_C = ilIlbA.CP_C;
    }

    public CP_An CP_G() {
        return this.CP_f;
    }

    public void CP_R(CP_An ilIlAn) {
        this.CP_f = ilIlAn;
    }

    public int CP_C() {
        return this.CP_r;
    }

    public void CP_f(int n) {
        this.CP_r = n;
    }

    public int CP_q() {
        return this.CP_UnderScore;
    }

    public void CP_h(int n) {
        this.CP_UnderScore = n;
    }

    public int CP_M() {
        return this.CP_C;
    }

    public void CP_Z(int n) {
        this.CP_C = n;
    }

    public CP_d_ CP_y() {
        return CP_d_.CP_W(this.CP_g.CP_E(), this.CP_C);
    }

    public void CP_Y(CP_d_ ilIld_) {
        this.CP_C = ilIld_.CP_s();
    }
}

