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

public class CP_JW
extends PacketWrapper<CP_JW> {
    private CP_fx CP_s;
    private static final long b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(1359581677393010607L, 2889836139784056508L, MethodHandles.lookup().lookupClass()).a(253141520132532L);
    private static transient /* synthetic */ String nGqKGxwKTq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JW(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JW(CP_fx ilIlfx) {
        super(CP_nN.ANIMATION);
        this.CP_s = ilIlfx;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_JW ilIlJW;
                block3: {
                    long l = b ^ 0x1C08488FEDC4L;
                    String string = CP_JH.CP_w();
                    ilIlJW = this;
                    if (string != null) break block2;
                    if (!ilIlJW.CP_g.CP_z(ServerVersion.V_1_9)) break block3;
                    this.CP_s = CP_fx.CP_H(this.CP_f());
                    if (string == null) break block4;
                }
                ilIlJW = this;
            }
            ilIlJW.CP_s = CP_fx.MAIN_HAND;
        }
    }

    public void CP_K(CP_JW ilIlJW) {
        this.CP_s = ilIlJW.CP_s;
    }

    @Override
    public void CP_J() {
        block3: {
            CP_JW ilIlJW;
            block2: {
                long l = b ^ 0x5753566D36CL;
                String string = CP_JH.CP_w();
                ilIlJW = this;
                if (string != null) break block2;
                if (!ilIlJW.CP_g.CP_z(ServerVersion.V_1_9)) break block3;
                ilIlJW = this;
            }
            ilIlJW.CP_J(this.CP_s.CP_r());
        }
    }

    public CP_fx CP_k() {
        return this.CP_s;
    }

    public void CP_k(CP_fx ilIlfx) {
        this.CP_s = ilIlfx;
    }
}

