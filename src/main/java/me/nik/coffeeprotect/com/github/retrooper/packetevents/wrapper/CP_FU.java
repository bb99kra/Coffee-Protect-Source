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

public class CP_FU
extends PacketWrapper<CP_FU> {
    private float CP_a;
    private int CP_b;
    private float CP_h;
    private static final long b = CP_s.a(-2144960714857006617L, 9114745197381687577L, MethodHandles.lookup().lookupClass()).a(268801976812792L);
    private static transient /* synthetic */ String iqNHFXVBaC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_FU(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_FU(float f, int n, float f2) {
        super(CP_AG.UPDATE_HEALTH);
        this.CP_a = f;
        this.CP_b = n;
        this.CP_h = f2;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_FU ilIlFU;
                block3: {
                    long l = b ^ 0x65F37B3C9198L;
                    this.CP_a = this.CP_X();
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlFU = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlFU.CP_g.CP_S(ServerVersion.V_1_7_10)) break block3;
                    this.CP_b = this.CP_G();
                    if (packetWrapperArray != null) break block4;
                }
                ilIlFU = this;
            }
            ilIlFU.CP_b = this.CP_f();
        }
        this.CP_h = this.CP_X();
    }

    @Override
    public void CP_J() {
        block4: {
            CP_FU ilIlFU;
            block2: {
                block3: {
                    long l = b ^ 0x7C8E06D5AF30L;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    this.CP_R(this.CP_a);
                    PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
                    ilIlFU = this;
                    if (packetWrapperArray2 == null) break block2;
                    if (!ilIlFU.CP_g.CP_S(ServerVersion.V_1_7_10)) break block3;
                    this.CP_G(this.CP_b);
                    if (packetWrapperArray2 != null) break block4;
                }
                ilIlFU = this;
            }
            ilIlFU.CP_J(this.CP_b);
        }
        this.CP_R(this.CP_h);
    }

    public void CP_P(CP_FU ilIlFU) {
        this.CP_a = ilIlFU.CP_a;
        this.CP_b = ilIlFU.CP_b;
        this.CP_h = ilIlFU.CP_h;
    }

    public float CP_t() {
        return this.CP_a;
    }

    public void CP_b(float f) {
        this.CP_a = f;
    }

    public int CP_V() {
        return this.CP_b;
    }

    public void CP_P(int n) {
        this.CP_b = n;
    }

    public float CP_I() {
        return this.CP_h;
    }

    public void CP_k(float f) {
        this.CP_h = f;
    }
}

