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

public class CP_bF
extends PacketWrapper<CP_bF> {
    private long CP_C;
    private static final long b = CP_s.a(-649928335610195459L, -8564614338333168752L, MethodHandles.lookup().lookupClass()).a(75041876348856L);
    private static transient /* synthetic */ String kFDLqcVPfq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bF(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bF(long l) {
        super(CP_nN.KEEP_ALIVE);
        this.CP_C = l;
    }

    @Override
    public void CP_e() {
        block4: {
            block5: {
                CP_bF ilIlbF;
                block6: {
                    boolean bl;
                    String string;
                    block2: {
                        block3: {
                            long l = b ^ 0x3CFE38EBF1EBL;
                            string = CP_JH.CP_w();
                            bl = this.CP_g.CP_z(ServerVersion.V_1_12_2);
                            if (string != null) break block2;
                            if (!bl) break block3;
                            this.CP_C = this.CP_i();
                            if (string == null) break block4;
                        }
                        ilIlbF = this;
                        if (string != null) break block5;
                        bl = ilIlbF.CP_g.CP_z(ServerVersion.V_1_8);
                    }
                    if (!bl) break block6;
                    this.CP_C = this.CP_f();
                    if (string == null) break block4;
                }
                ilIlbF = this;
            }
            ilIlbF.CP_C = this.CP_W();
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_bF ilIlbF;
            block5: {
                block6: {
                    boolean bl;
                    String string;
                    block2: {
                        block3: {
                            long l = b ^ 0x25834502CF43L;
                            string = CP_JH.CP_w();
                            bl = this.CP_g.CP_z(ServerVersion.V_1_12_2);
                            if (string != null) break block2;
                            if (!bl) break block3;
                            this.CP_P(this.CP_C);
                            if (string == null) break block4;
                        }
                        ilIlbF = this;
                        if (string != null) break block5;
                        bl = ilIlbF.CP_g.CP_z(ServerVersion.V_1_8);
                    }
                    if (!bl) break block6;
                    this.CP_J((int)this.CP_C);
                    if (string == null) break block4;
                }
                ilIlbF = this;
            }
            ilIlbF.CP_a((int)this.CP_C);
        }
    }

    public void CP_S(CP_bF ilIlbF) {
        this.CP_C = ilIlbF.CP_C;
    }

    public long CP_s() {
        return this.CP_C;
    }

    public void CP_p(long l) {
        this.CP_C = l;
    }
}

