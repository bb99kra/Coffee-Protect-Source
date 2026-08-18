/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_vE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_J8
extends PacketWrapper<CP_J8> {
    private CP_vE CP_Y;
    private int CP_l;
    private static final long b = CP_s.a(-2137856107838399271L, -5371465920437507787L, MethodHandles.lookup().lookupClass()).a(236660800996294L);
    private static transient /* synthetic */ String VQEpIuWhJu = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J8(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_J8(CP_vE ilIlvE) {
        super(CP_nN.CHAT_ACK);
        this.CP_Y = ilIlvE;
    }

    public CP_J8(int n) {
        super(CP_nN.CHAT_ACK);
        this.CP_l = n;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_J8 ilIlJ8;
                block3: {
                    long l = b ^ 0x1FE28E46F162L;
                    String string = CP_JH.CP_w();
                    ilIlJ8 = this;
                    if (string != null) break block2;
                    if (!ilIlJ8.CP_g.CP_z(ServerVersion.V_1_19_3)) break block3;
                    this.CP_l = this.CP_f();
                    if (string == null) break block4;
                }
                ilIlJ8 = this;
            }
            ilIlJ8.CP_Y = this.CP_e();
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_J8 ilIlJ8;
            block2: {
                block3: {
                    long l = b ^ 0x69FF3AFCFCAL;
                    String string = CP_JH.CP_w();
                    ilIlJ8 = this;
                    if (string != null) break block2;
                    if (!ilIlJ8.CP_g.CP_z(ServerVersion.V_1_19_3)) break block3;
                    this.CP_J(this.CP_l);
                    if (string == null) break block4;
                }
                ilIlJ8 = this;
            }
            ilIlJ8.CP_h(this.CP_Y);
        }
    }

    public void CP_b(CP_J8 ilIlJ8) {
        this.CP_Y = ilIlJ8.CP_Y;
        this.CP_l = ilIlJ8.CP_l;
    }

    public int CP_j() {
        return this.CP_l;
    }

    public void CP_f(int n) {
        this.CP_l = n;
    }

    public CP_vE CP_K() {
        return this.CP_Y;
    }

    public void CP_O(CP_vE ilIlvE) {
        this.CP_Y = ilIlvE;
    }
}

