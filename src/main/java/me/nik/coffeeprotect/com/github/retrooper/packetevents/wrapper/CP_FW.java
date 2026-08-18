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

public class CP_FW
extends PacketWrapper<CP_FW> {
    private int CP_d;
    private byte CP_o;
    private double CP_u;
    private double CP_E;
    private double CP_n;
    private static final long b = CP_s.a(3405179736477782648L, 2044165443473905924L, MethodHandles.lookup().lookupClass()).a(206545745928493L);
    private static transient /* synthetic */ String owFnljWKtU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_FW(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_FW(int n, byte by, double d, double d2, double d3) {
        super(CP_AG.SPAWN_WEATHER_ENTITY);
        this.CP_d = n;
        this.CP_o = by;
        this.CP_u = d;
        this.CP_E = d2;
        this.CP_n = d3;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_FW ilIlFW;
                block3: {
                    long l = b ^ 0x1A3DA87D8400L;
                    this.CP_d = this.CP_f();
                    this.CP_o = this.CP_E();
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlFW = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlFW.CP_g.CP_z(ServerVersion.V_1_9)) break block3;
                    this.CP_u = this.CP_b();
                    this.CP_E = this.CP_b();
                    this.CP_n = this.CP_b();
                    if (packetWrapperArray != null) break block4;
                }
                this.CP_u = (double)this.CP_W() / 32.0;
                this.CP_E = (double)this.CP_W() / 32.0;
                ilIlFW = this;
            }
            ilIlFW.CP_n = (double)this.CP_W() / 32.0;
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_FW ilIlFW;
            block2: {
                block3: {
                    long l = b ^ 0x340D594BAA8L;
                    this.CP_J(this.CP_d);
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    this.CP_u(this.CP_o);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlFW = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlFW.CP_g.CP_z(ServerVersion.V_1_9)) break block3;
                    this.CP_Y(this.CP_u);
                    this.CP_Y(this.CP_E);
                    this.CP_Y(this.CP_n);
                    if (packetWrapperArray2 != null) break block4;
                }
                this.CP_a(CP_h9.CP_K(this.CP_u * 32.0));
                this.CP_a(CP_h9.CP_K(this.CP_E * 32.0));
                ilIlFW = this;
            }
            ilIlFW.CP_a(CP_h9.CP_K(this.CP_n * 32.0));
        }
    }

    public void CP_K(CP_FW ilIlFW) {
        this.CP_d = ilIlFW.CP_d;
    }

    public int CP_n() {
        return this.CP_d;
    }

    public void CP_F(int n) {
        this.CP_d = n;
    }

    public byte CP_W() {
        return this.CP_o;
    }

    public void CP_e(byte by) {
        this.CP_o = by;
    }

    public double CP_l() {
        return this.CP_u;
    }

    public void CP_W(double d) {
        this.CP_u = d;
    }

    public double CP_p() {
        return this.CP_E;
    }

    public void CP_T(double d) {
        this.CP_E = d;
    }

    public double CP_c() {
        return this.CP_n;
    }

    public void CP_y(double d) {
        this.CP_n = d;
    }
}

