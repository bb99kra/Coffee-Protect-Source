/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_fx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_b1
extends PacketWrapper<CP_b1> {
    private CP_fx CP_v;
    private int CP_N;
    private float CP_B;
    private float CP_b;
    private static final long b = CP_s.a(-4901644525861478614L, 2716664732543471233L, MethodHandles.lookup().lookupClass()).a(105643356671812L);
    private static transient /* synthetic */ String XOInQhFImC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b1(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_b1(CP_fx ilIlfx) {
        this(ilIlfx, 0);
    }

    public CP_b1(CP_fx ilIlfx, int n) {
        this(ilIlfx, n, 0.0f, 0.0f);
    }

    public CP_b1(CP_fx ilIlfx, int n, float f, float f2) {
        super(CP_nN.USE_ITEM);
        this.CP_v = ilIlfx;
        this.CP_N = n;
        this.CP_B = f;
        this.CP_b = f2;
    }

    @Override
    public void CP_e() {
        block3: {
            block4: {
                CP_b1 ilIlb1;
                boolean bl;
                block2: {
                    long l = b ^ 0x37CC5D5320D0L;
                    this.CP_v = CP_fx.CP_H(this.CP_f());
                    String string = CP_JH.CP_w();
                    bl = this.CP_g.CP_z(ServerVersion.V_1_19);
                    if (string != null) break block2;
                    if (!bl) break block3;
                    this.CP_N = this.CP_f();
                    ilIlb1 = this;
                    if (string != null) break block4;
                    bl = ilIlb1.CP_g.CP_z(ServerVersion.V_1_21);
                }
                if (!bl) break block3;
                this.CP_B = this.CP_X();
                ilIlb1 = this;
            }
            ilIlb1.CP_b = this.CP_X();
        }
    }

    @Override
    public void CP_J() {
        block3: {
            CP_b1 ilIlb1;
            block4: {
                boolean bl;
                block2: {
                    long l = b ^ 0x2EB120BA1E78L;
                    String string = CP_JH.CP_w();
                    this.CP_J(this.CP_v.CP_r());
                    String string2 = string;
                    bl = this.CP_g.CP_z(ServerVersion.V_1_19);
                    if (string2 != null) break block2;
                    if (!bl) break block3;
                    this.CP_J(this.CP_N);
                    ilIlb1 = this;
                    if (string2 != null) break block4;
                    bl = ilIlb1.CP_g.CP_z(ServerVersion.V_1_21);
                }
                if (!bl) break block3;
                this.CP_R(this.CP_B);
                ilIlb1 = this;
            }
            ilIlb1.CP_R(this.CP_b);
        }
    }

    public void CP_M(CP_b1 ilIlb1) {
        this.CP_v = ilIlb1.CP_v;
        this.CP_N = ilIlb1.CP_N;
        this.CP_B = ilIlb1.CP_B;
        this.CP_b = ilIlb1.CP_b;
    }

    public CP_fx CP_H() {
        return this.CP_v;
    }

    public void CP_P(CP_fx ilIlfx) {
        this.CP_v = ilIlfx;
    }

    public int CP_p() {
        return this.CP_N;
    }

    public void CP_Y(int n) {
        this.CP_N = n;
    }

    public float CP_A() {
        return this.CP_B;
    }

    public void CP_s(float f) {
        this.CP_B = f;
    }

    public float CP_U() {
        return this.CP_b;
    }

    public void CP_l(float f) {
        this.CP_b = f;
    }
}

