/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_QL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_Xx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Fu
extends PacketWrapper<CP_Fu> {
    private int CP_M;
    private CP_QL CP_n;
    private static final long b = CP_s.a(-1133505491477535749L, -9178148373309585364L, MethodHandles.lookup().lookupClass()).a(4243553952877L);
    private static transient /* synthetic */ String bkclWJRrHy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fu(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fu(int n, CP_QL ilIlQL) {
        super(CP_AG.REMOVE_ENTITY_EFFECT);
        this.CP_M = n;
        this.CP_n = ilIlQL;
    }

    @Override
    public void CP_e() {
        int n;
        block4: {
            int n2;
            block2: {
                block3: {
                    long l = b ^ 0x1ED0D0D3D992L;
                    this.CP_M = this.CP_f();
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    n2 = this.CP_g.CP_z(ServerVersion.V_1_18_2);
                    if (packetWrapperArray == null) break block2;
                    if (n2 == 0) break block3;
                    n = this.CP_f();
                    if (packetWrapperArray != null) break block4;
                }
                n2 = this.CP_E();
            }
            n = n2;
        }
        this.CP_n = CP_Xx.CP_z(n, this.CP_g);
    }

    @Override
    public void CP_J() {
        block4: {
            CP_Fu ilIlFu;
            block2: {
                block3: {
                    long l = b ^ 0x7ADAD3AE73AL;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    this.CP_J(this.CP_M);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlFu = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlFu.CP_g.CP_z(ServerVersion.V_1_18_2)) break block3;
                    this.CP_J(this.CP_n.CP_H(this.CP_g.CP_E()));
                    if (packetWrapperArray2 != null) break block4;
                }
                ilIlFu = this;
            }
            ilIlFu.CP_u(this.CP_n.CP_H(this.CP_g.CP_E()));
        }
    }

    public void CP_a(CP_Fu ilIlFu) {
        this.CP_M = ilIlFu.CP_M;
        this.CP_n = ilIlFu.CP_n;
    }

    public int CP_U() {
        return this.CP_M;
    }

    public void CP_c(int n) {
        this.CP_M = n;
    }

    public CP_QL CP_I() {
        return this.CP_n;
    }

    public void CP_N(CP_QL ilIlQL) {
        this.CP_n = ilIlQL;
    }
}

