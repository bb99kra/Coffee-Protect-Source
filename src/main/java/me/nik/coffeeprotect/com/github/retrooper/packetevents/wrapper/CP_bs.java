/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_bs
extends PacketWrapper<CP_bs> {
    private int CP_b;
    private int CP_O;
    private boolean CP_u;
    private static final long b = CP_s.a(3802116460486184672L, -5221222058175580115L, MethodHandles.lookup().lookupClass()).a(110953846149053L);
    private static transient /* synthetic */ String OjZSCHqtlJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bs(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bs(int n, int n2, boolean bl) {
        super(CP_nN.SLOT_STATE_CHANGE);
        this.CP_b = n;
        this.CP_O = n2;
        this.CP_u = bl;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_e() {
        var1_1 = CP_bs.b ^ 121789242053893L;
        this.CP_b = this.CP_f();
        var3_2 = CP_JH.CP_w();
        v0 = this;
        if (var3_2 != null) ** GOTO lbl10
        if (v0.CP_g.CP_z(ServerVersion.V_1_21_2)) {
            v1 = this.CP_e();
        } else {
            v0 = this;
lbl10:
            // 2 sources

            v1 = v0.CP_f();
        }
        this.CP_O = v1;
        this.CP_u = this.CP_K();
    }

    @Override
    public void CP_J() {
        block4: {
            CP_bs ilIlbs;
            block2: {
                block3: {
                    long l = b ^ 0x77B9396BABADL;
                    String string = CP_JH.CP_w();
                    this.CP_J(this.CP_b);
                    String string2 = string;
                    ilIlbs = this;
                    if (string2 != null) break block2;
                    if (!ilIlbs.CP_g.CP_z(ServerVersion.V_1_21_2)) break block3;
                    this.CP_r(this.CP_O);
                    if (string2 == null) break block4;
                }
                ilIlbs = this;
            }
            ilIlbs.CP_J(this.CP_O);
        }
        this.CP_a(this.CP_u);
    }

    public void CP_H(CP_bs ilIlbs) {
        this.CP_b = ilIlbs.CP_b;
        this.CP_O = ilIlbs.CP_O;
        this.CP_u = ilIlbs.CP_u;
    }

    public int CP_z() {
        return this.CP_b;
    }

    public void CP_N(int n) {
        this.CP_b = n;
    }

    public int CP_E() {
        return this.CP_O;
    }

    public void CP_f(int n) {
        this.CP_O = n;
    }

    public boolean CP_E() {
        return this.CP_u;
    }

    public void CP_u(boolean bl) {
        this.CP_u = bl;
    }
}

