/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_b2
extends PacketWrapper<CP_b2> {
    private int CP_z;
    private int CP_A;
    private boolean CP_f;
    private static final long b = CP_s.a(6163871611484386296L, 7954590781712370816L, MethodHandles.lookup().lookupClass()).a(81302117223064L);
    private static transient /* synthetic */ String kpxkAdDmDU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b2(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_b2(int n, int n2, boolean bl) {
        super(CP_AG.ATTACH_ENTITY);
        this.CP_z = n;
        this.CP_A = n2;
        this.CP_f = bl;
    }

    @Override
    public void CP_e() {
        block6: {
            block4: {
                CP_b2 ilIlb2;
                block5: {
                    long l = b ^ 0x4560BAB5E83FL;
                    this.CP_z = this.CP_W();
                    this.CP_A = this.CP_W();
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlb2 = this;
                    if (packetWrapperArray == null) break block4;
                    if (!ilIlb2.CP_g.CP_S(ServerVersion.V_1_8_8)) break block5;
                    short s = this.CP_P();
                    if (packetWrapperArray != null) {
                        this.CP_f = s == 1 ? (short)1 : 0;
                        s = (short)(this.CP_f ? 1 : 0);
                    }
                    if (packetWrapperArray != null) break block6;
                }
                ilIlb2 = this;
            }
            ilIlb2.CP_f = true;
        }
    }

    @Override
    public void CP_J() {
        block5: {
            CP_b2 ilIlb2;
            PacketWrapper[] packetWrapperArray;
            block4: {
                long l = b ^ 0x5C1DC75CD697L;
                PacketWrapper[] packetWrapperArray2 = CP_Fh.CP_a();
                this.CP_a(this.CP_z);
                packetWrapperArray = packetWrapperArray2;
                this.CP_a(this.CP_A);
                ilIlb2 = this;
                if (packetWrapperArray == null) break block4;
                if (!ilIlb2.CP_g.CP_S(ServerVersion.V_1_8_8)) break block5;
                ilIlb2 = this;
            }
            int n = this.CP_f;
            if (packetWrapperArray != null) {
                n = n != 0 ? 1 : 0;
            }
            ilIlb2.CP_u(n);
        }
    }

    public void CP_D(CP_b2 ilIlb2) {
        this.CP_z = ilIlb2.CP_z;
        this.CP_A = ilIlb2.CP_A;
        this.CP_f = ilIlb2.CP_f;
    }

    public int CP_O() {
        return this.CP_z;
    }

    public void CP_v(int n) {
        this.CP_z = n;
    }

    public int CP_m() {
        return this.CP_A;
    }

    public void CP_X(int n) {
        this.CP_A = n;
    }

    public boolean CP_A() {
        return this.CP_f;
    }

    public void CP_G(boolean bl) {
        this.CP_f = bl;
    }
}

