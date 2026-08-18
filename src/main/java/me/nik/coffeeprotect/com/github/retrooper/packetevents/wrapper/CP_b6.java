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

public class CP_b6
extends PacketWrapper<CP_b6> {
    private int CP_F;
    private int CP_B;
    private static final long b = CP_s.a(3707803121974813627L, -5656349647792743244L, MethodHandles.lookup().lookupClass()).a(119769937724614L);
    private static transient /* synthetic */ String RAtfDNhHJS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b6(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_b6(int n, int n2) {
        super(CP_nN.SET_BEACON_EFFECT);
        this.CP_F = n;
        this.CP_B = n2;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_b6 ilIlb6;
                block3: {
                    long l = b ^ 0x15C5E698A9FFL;
                    String string = CP_JH.CP_w();
                    ilIlb6 = this;
                    if (string != null) break block2;
                    if (!ilIlb6.CP_g.CP_z(ServerVersion.V_1_19)) break block3;
                    this.CP_F = this.CP_q();
                    this.CP_B = this.CP_q();
                    if (string == null) break block4;
                }
                this.CP_F = this.CP_f();
                ilIlb6 = this;
            }
            ilIlb6.CP_B = this.CP_f();
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_b6 ilIlb6;
            block2: {
                block3: {
                    long l = b ^ 0xCB89B719757L;
                    String string = CP_JH.CP_w();
                    ilIlb6 = this;
                    if (string != null) break block2;
                    if (!ilIlb6.CP_g.CP_z(ServerVersion.V_1_19)) break block3;
                    this.CP_i(this.CP_F);
                    this.CP_i(this.CP_B);
                    if (string == null) break block4;
                }
                this.CP_J(this.CP_F);
                ilIlb6 = this;
            }
            ilIlb6.CP_J(this.CP_B);
        }
    }

    public void CP_p(CP_b6 ilIlb6) {
        this.CP_F = ilIlb6.CP_F;
        this.CP_B = ilIlb6.CP_B;
    }

    public int CP_B() {
        return this.CP_F;
    }

    public void CP_c(int n) {
        this.CP_F = n;
    }

    public int CP_g() {
        return this.CP_B;
    }

    @Override
    public void CP_B(int n) {
        this.CP_B = n;
    }

    private int CP_q() {
        long l = b ^ 0x298711EE6749L;
        String string = CP_JH.CP_w();
        int n = this.CP_K();
        if (string == null) {
            if (n != 0) {
                return this.CP_f();
            }
            n = -1;
        }
        return n;
    }

    private void CP_i(int n) {
        long l = b ^ 0x2BC16E72824L;
        String string = CP_JH.CP_w();
        boolean bl = n;
        if (string == null) {
            bl = !bl;
        }
        this.CP_a(bl);
        if (n != -1) {
            this.CP_J(n);
        }
    }
}

