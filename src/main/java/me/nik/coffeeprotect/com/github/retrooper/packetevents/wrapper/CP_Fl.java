/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_h9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class CP_Fl
extends PacketWrapper<CP_Fl> {
    private int CP_o;
    private double CP_y;
    private double CP_m;
    private double CP_T;
    private short CP_p;
    private static final long b = CP_s.a(7954329323146821095L, -2717841519529925860L, MethodHandles.lookup().lookupClass()).a(17606432033079L);
    private static transient /* synthetic */ String hJidhcpASW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fl(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fl(int n, double d, double d2, double d3, short s) {
        super(CP_AG.SPAWN_EXPERIENCE_ORB);
        this.CP_o = n;
        this.CP_y = d;
        this.CP_m = d2;
        this.CP_T = d3;
        this.CP_p = s;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_Fl ilIlFl;
                block3: {
                    long l = b ^ 0x17BAA77F2AB2L;
                    this.CP_o = this.CP_f();
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlFl = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlFl.CP_g.CP_z(ServerVersion.V_1_9)) break block3;
                    this.CP_y = this.CP_b();
                    this.CP_m = this.CP_b();
                    this.CP_T = this.CP_b();
                    if (packetWrapperArray != null) break block4;
                }
                this.CP_y = (double)this.CP_W() / 32.0;
                this.CP_m = (double)this.CP_W() / 32.0;
                ilIlFl = this;
            }
            ilIlFl.CP_T = (double)this.CP_W() / 32.0;
        }
        this.CP_p = this.CP_G();
    }

    @Override
    public void CP_J() {
        block4: {
            CP_Fl ilIlFl;
            block2: {
                block3: {
                    long l = b ^ 0xEC7DA96141AL;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    this.CP_J(this.CP_o);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlFl = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlFl.CP_g.CP_z(ServerVersion.V_1_9)) break block3;
                    this.CP_Y(this.CP_y);
                    this.CP_Y(this.CP_m);
                    this.CP_Y(this.CP_T);
                    if (packetWrapperArray2 != null) break block4;
                }
                this.CP_a(CP_h9.CP_K(this.CP_y * 32.0));
                this.CP_a(CP_h9.CP_K(this.CP_m * 32.0));
                ilIlFl = this;
            }
            ilIlFl.CP_a(CP_h9.CP_K(this.CP_T * 32.0));
        }
        this.CP_G(this.CP_p);
    }

    public void CP_Z(CP_Fl ilIlFl) {
        this.CP_o = ilIlFl.CP_o;
        this.CP_y = ilIlFl.CP_y;
        this.CP_m = ilIlFl.CP_m;
        this.CP_T = ilIlFl.CP_T;
        this.CP_p = ilIlFl.CP_p;
    }

    public int CP_Q() {
        return this.CP_o;
    }

    public void CP_b(int n) {
        this.CP_o = n;
    }

    public double CP_h() {
        return this.CP_y;
    }

    public void CP_X(double d) {
        this.CP_y = d;
    }

    public double CP_R() {
        return this.CP_m;
    }

    public void CP_K(double d) {
        this.CP_m = d;
    }

    public double CP_I() {
        return this.CP_T;
    }

    public void CP_I(double d) {
        this.CP_T = d;
    }

    public short CP_v() {
        return this.CP_p;
    }

    public void CP_a(short s) {
        this.CP_p = s;
    }
}

