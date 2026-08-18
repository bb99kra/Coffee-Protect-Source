/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_qy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_J5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_dR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_JE
extends PacketWrapper<CP_JE> {
    private UUID CP_J;
    private CP_dR CP_h;
    private static final long b = CP_s.a(-8549300490353597261L, 9102850934403369936L, MethodHandles.lookup().lookupClass()).a(28223671983304L);
    private static transient /* synthetic */ String enDuPJFOtI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JE(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_JE(CP_dR ilIldR) {
        this(UUID.randomUUID(), ilIldR);
    }

    public CP_JE(UUID uUID, CP_dR ilIldR) {
        super(CP_qy.RESOURCE_PACK_STATUS);
        this.CP_J = uUID;
        this.CP_h = ilIldR;
    }

    @Override
    public void CP_e() {
        long l = b ^ 0x2D81243D634EL;
        int n = CP_J5.CP_o();
        CP_JE ilIlJE = this;
        if (n == 0) {
            if (ilIlJE.CP_g.CP_z(ServerVersion.V_1_20_3)) {
                this.CP_J = this.CP_v();
            }
            ilIlJE = this;
        }
        ilIlJE.CP_h = CP_dR.VALUES[this.CP_f()];
    }

    @Override
    public void CP_J() {
        long l = b ^ 0x34FC59D45DE6L;
        int n = CP_J5.CP_p();
        CP_JE ilIlJE = this;
        if (n != 0) {
            if (ilIlJE.CP_g.CP_z(ServerVersion.V_1_20_3)) {
                this.CP_c(this.CP_J);
            }
            ilIlJE = this;
        }
        ilIlJE.CP_J(this.CP_h.ordinal());
    }

    public void CP_G(CP_JE ilIlJE) {
        this.CP_J = ilIlJE.CP_J;
        this.CP_h = ilIlJE.CP_h;
    }

    public UUID CP_m() {
        return this.CP_J;
    }

    public void CP_F(UUID uUID) {
        this.CP_J = uUID;
    }

    public CP_dR CP_A() {
        return this.CP_h;
    }

    public void CP_a(CP_dR ilIldR) {
        this.CP_h = ilIldR;
    }
}

