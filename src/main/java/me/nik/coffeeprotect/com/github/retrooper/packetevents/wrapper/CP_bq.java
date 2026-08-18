/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_bq
extends PacketWrapper<CP_bq> {
    private int CP_t;
    private CP_An CP_Y;
    private byte CP_N;
    private static final long b = CP_s.a(-8134874350185090897L, 6062466982296223620L, MethodHandles.lookup().lookupClass()).a(84896658469978L);
    private static transient /* synthetic */ String mdzKlMdYsX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bq(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bq(int n, CP_An ilIlAn, byte by) {
        super(CP_AG.BLOCK_BREAK_ANIMATION);
        this.CP_t = n;
        this.CP_Y = ilIlAn;
        this.CP_N = by;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_bq ilIlbq;
                block3: {
                    long l = b ^ 0x269DCB9D9642L;
                    this.CP_t = this.CP_f();
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlbq = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlbq.CP_g.CP_S(ServerVersion.V_1_7_10)) break block3;
                    int n = this.CP_W();
                    int n2 = this.CP_W();
                    int n3 = this.CP_W();
                    this.CP_Y = new CP_An(n, n2, n3);
                    if (packetWrapperArray != null) break block4;
                }
                ilIlbq = this;
            }
            ilIlbq.CP_Y = this.CP_E();
        }
        this.CP_N = (byte)this.CP_P();
    }

    @Override
    public void CP_J() {
        block4: {
            CP_bq ilIlbq;
            block2: {
                block3: {
                    long l = b ^ 0x3FE0B674A8EAL;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    this.CP_J(this.CP_t);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlbq = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlbq.CP_g.CP_S(ServerVersion.V_1_7_10)) break block3;
                    this.CP_a(this.CP_Y.CP_j);
                    this.CP_a(this.CP_Y.CP_w);
                    this.CP_a(this.CP_Y.CP_k);
                    if (packetWrapperArray2 != null) break block4;
                }
                ilIlbq = this;
            }
            ilIlbq.CP_h(this.CP_Y);
        }
        this.CP_u(this.CP_N);
    }

    public void CP_M(CP_bq ilIlbq) {
        this.CP_t = ilIlbq.CP_t;
        this.CP_Y = ilIlbq.CP_Y;
        this.CP_N = ilIlbq.CP_N;
    }

    public int CP_I() {
        return this.CP_t;
    }

    public void CP_UnderScore(int n) {
        this.CP_t = n;
    }

    public CP_An CP_s() {
        return this.CP_Y;
    }

    public void CP_M(CP_An ilIlAn) {
        this.CP_Y = ilIlAn;
    }

    public byte CP_O() {
        return this.CP_N;
    }

    public void CP_UnderScore(byte by) {
        this.CP_N = by;
    }
}

