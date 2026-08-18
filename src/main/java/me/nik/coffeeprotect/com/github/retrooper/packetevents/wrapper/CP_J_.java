/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_oS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_J_
extends PacketWrapper<CP_J_> {
    private CP_oS CP_u;
    @Nullable
    private String CP_f;
    private static final long b = CP_s.a(2501797095912831227L, 7248829391743829377L, MethodHandles.lookup().lookupClass()).a(65007763077098L);
    private static transient /* synthetic */ String FOccXwKLrG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J_(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_J_(CP_oS ilIloS, @Nullable String string) {
        super(CP_nN.ADVANCEMENT_TAB);
        this.CP_u = ilIloS;
        this.CP_f = string;
    }

    @Override
    public void CP_e() {
        block3: {
            block2: {
                long l = b ^ 0x1C9EACC96AD6L;
                this.CP_u = CP_oS.CP_j(this.CP_f());
                String string = CP_JH.CP_w();
                CP_J_ ilIlJ_ = this;
                if (string != null) break block2;
                if (ilIlJ_.CP_u != CP_oS.OPENED_TAB) break block3;
                ilIlJ_ = this;
            }
            ilIlJ_.CP_f = this.CP_i();
        }
    }

    public void CP_c(CP_J_ ilIlJ_) {
        this.CP_u = ilIlJ_.CP_u;
        this.CP_f = ilIlJ_.CP_f;
    }

    @Override
    public void CP_J() {
        block3: {
            CP_J_ ilIlJ_;
            block2: {
                long l = b ^ 0x5E3D120547EL;
                String string = CP_JH.CP_w();
                this.CP_J(this.CP_u.ordinal());
                String string2 = string;
                ilIlJ_ = this;
                if (string2 != null) break block2;
                if (ilIlJ_.CP_u != CP_oS.OPENED_TAB) break block3;
                ilIlJ_ = this;
            }
            ilIlJ_.CP_M(this.CP_f);
        }
    }

    public CP_oS CP_j() {
        return this.CP_u;
    }

    public void CP_C(CP_oS ilIloS) {
        this.CP_u = ilIloS;
    }

    public Optional<String> CP_Q() {
        return Optional.ofNullable(this.CP_f);
    }

    public void CP_F(String string) {
        this.CP_f = string;
    }
}

