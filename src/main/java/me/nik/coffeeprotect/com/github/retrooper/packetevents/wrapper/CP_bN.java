/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_Aj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_C9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_L8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_Ok;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_TQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_Ti;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_ZO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_oR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public class CP_bN
extends PacketWrapper<CP_bN> {
    private static final CP_Ok CP_t;
    private static final CP_Ok CP_n;
    private static final CP_Ok CP_G;
    private static final CP_Ok CP_m;
    private static final CP_Ok CP_r;
    private static final CP_Ok CP_UnderScore;
    private static final CP_Ok CP_a;
    private CP_xw CP_O;
    private static final long b;
    private static transient /* synthetic */ String zAXWuoGLJn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bN(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bN(CP_xw ilIlxw) {
        super(CP_AG.CHAT_MESSAGE);
        this.CP_O = ilIlxw;
    }

    @Override
    public void CP_e() {
        this.CP_O = this.CP_H().CP_O(this);
    }

    @Override
    public void CP_J() {
        this.CP_H().CP_W(this, this.CP_O);
    }

    public void CP_Z(CP_bN ilIlbN) {
        this.CP_O = ilIlbN.CP_O;
    }

    public CP_xw CP_u() {
        return this.CP_O;
    }

    public void CP_c(CP_xw ilIlxw) {
        this.CP_O = ilIlxw;
    }

    @ApiStatus.Internal
    protected CP_Ok CP_H() {
        long l = b ^ 0x2783F22FA4DBL;
        PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
        boolean bl = this.CP_g.CP_z(ServerVersion.V_1_21_5);
        if (packetWrapperArray != null) {
            if (bl) {
                return CP_a;
            }
            bl = this.CP_g.CP_z(ServerVersion.V_1_19_3);
        }
        if (packetWrapperArray != null) {
            if (bl) {
                return CP_UnderScore;
            }
            bl = this.CP_g.CP_z(ServerVersion.V_1_19_1);
        }
        if (packetWrapperArray != null) {
            if (bl) {
                return CP_r;
            }
            bl = this.CP_g.CP_z(ServerVersion.V_1_19);
        }
        if (packetWrapperArray != null) {
            if (bl) {
                return CP_m;
            }
            bl = this.CP_g.CP_z(ServerVersion.V_1_16);
        }
        if (packetWrapperArray != null) {
            if (bl) {
                return CP_G;
            }
            bl = this.CP_g.CP_z(ServerVersion.V_1_8);
        }
        if (bl) {
            return CP_n;
        }
        return CP_t;
    }

    static {
        b = CP_s.a(-6696890644565006668L, -1421782617087597040L, MethodHandles.lookup().lookupClass()).a(131330349441342L);
        CP_t = new CP_Aj();
        CP_n = new CP_ZO();
        CP_G = new CP_oR();
        CP_m = new CP_TQ();
        CP_r = new CP_C9();
        CP_UnderScore = new CP_Ti();
        CP_a = new CP_L8();
    }
}

