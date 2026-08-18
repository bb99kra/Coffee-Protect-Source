/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Xk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JH
extends PacketWrapper<CP_JH> {
    private int CP_p;
    private CP_Xk CP_A;
    private int CP_O;
    private static String CP_E;
    private static final long b;
    private static transient /* synthetic */ String qnwvyNyJqP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JH(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JH(int n, CP_Xk ilIlXk, int n2) {
        super(CP_nN.ENTITY_ACTION);
        this.CP_p = n;
        this.CP_A = ilIlXk;
        this.CP_O = n2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_e() {
        var1_1 = CP_JH.b ^ 58182322080675L;
        var4_2 = this.CP_g.CP_z(ServerVersion.V_1_8);
        var3_3 = CP_JH.CP_w();
        v0 = var4_2;
        if (var3_3 == null) {
            v0 = v0 != 0 ? this.CP_f() : this.CP_W();
        }
        this.CP_p = v0;
        v1 = var4_2;
        if (var3_3 == null) {
            v1 = v1 != 0 ? this.CP_f() : (int)this.CP_E();
        }
        var5_4 = v1;
        v2 = this;
        v3 = this;
        if (var3_3 != null) ** GOTO lbl21
        v2.CP_A = CP_Xk.CP_T(v3.CP_g, var5_4);
        v2 = this;
        if (var4_2 != 0) {
            v4 = this.CP_f();
        } else {
            v3 = this;
lbl21:
            // 2 sources

            v4 = v3.CP_W();
        }
        v2.CP_O = v4;
    }

    @Override
    public void CP_J() {
        block4: {
            int n;
            int n2;
            block2: {
                block3: {
                    long l = b ^ 0x2D97DD4AF50BL;
                    int n3 = this.CP_g.CP_z(ServerVersion.V_1_8);
                    String string = CP_JH.CP_w();
                    n2 = n3;
                    if (string != null) break block2;
                    if (n2 == 0) break block3;
                    this.CP_J(this.CP_p);
                    n = this.CP_A.CP_Z(this.CP_g);
                    this.CP_J(n);
                    this.CP_J(this.CP_O);
                    if (string == null) break block4;
                }
                this.CP_a(this.CP_p);
                n2 = this.CP_A.CP_Z(this.CP_g);
            }
            n = n2;
            this.CP_u(n);
            this.CP_a(this.CP_O);
        }
    }

    public void CP_m(CP_JH ilIlJH) {
        this.CP_p = ilIlJH.CP_p;
        this.CP_A = ilIlJH.CP_A;
        this.CP_O = ilIlJH.CP_O;
    }

    public int CP_d() {
        return this.CP_p;
    }

    public void CP_L(int n) {
        this.CP_p = n;
    }

    public CP_Xk CP_l() {
        return this.CP_A;
    }

    public void CP_L(CP_Xk ilIlXk) {
        this.CP_A = ilIlXk;
    }

    public int CP_U() {
        return this.CP_O;
    }

    public void CP_C(int n) {
        this.CP_O = n;
    }

    public static void CP_q(String string) {
        CP_E = string;
    }

    public static String CP_w() {
        return CP_E;
    }

    static {
        b = CP_s.a(3804528840327419277L, -4688949629939202323L, MethodHandles.lookup().lookupClass()).a(1210681928763L);
        if (CP_JH.CP_w() != null) {
            CP_JH.CP_q("sMt2R");
        }
    }
}

