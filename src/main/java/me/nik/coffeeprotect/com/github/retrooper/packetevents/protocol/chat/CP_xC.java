/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.lang.invoke.MethodHandles;
import java.time.Instant;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_OG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_d2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_jA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_qI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_xC
extends CP_xl {
    private String CP_L;
    @Nullable
    private Component CP_M;
    private CP_OG CP_A;
    private byte @Nullable [] CP_j;
    private byte[] CP_O;
    private Instant CP_d;
    private long CP_Y;
    private CP_qI CP_D;
    private CP_d2 CP_F;
    private static final long a = CP_s.a(5319066692877758245L, -675264256816626723L, MethodHandles.lookup().lookupClass()).a(122811494032399L);
    private static transient /* synthetic */ String ciRnTuLLzd = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_xC(String string, Component component, @Nullable Component component2, UUID uUID, CP_OG ilIlOG, byte @Nullable [] byArray, byte[] byArray2, Instant instant, long l, CP_qI ilIlqI, CP_d2 ilIld2) {
        long l2 = a ^ 0x56035D0D781BL;
        super(component, ilIlOG.CP_J(), uUID);
        this.CP_L = string;
        this.CP_M = component2;
        this.CP_A = ilIlOG;
        this.CP_j = byArray;
        this.CP_O = byArray2;
        this.CP_d = instant;
        this.CP_Y = l;
        this.CP_D = ilIlqI;
        this.CP_F = ilIld2;
        boolean bl = CP_xw.CP_P();
        if (PacketWrapper.CP_z() == null) {
            CP_xw.CP_UnderScore(!bl);
        }
    }

    public String CP_k() {
        return this.CP_L;
    }

    public void CP_J(String string) {
        this.CP_L = string;
    }

    public boolean CP_y() {
        long l = a ^ 0x4CC406C609D3L;
        boolean bl = CP_xw.CP_P();
        boolean bl2 = this.CP_b().equals(Component.text(this.CP_L));
        if (bl) {
            bl2 = !bl2;
        }
        return bl2;
    }

    @Nullable
    public Component CP_s() {
        return this.CP_M;
    }

    public void CP_Z(@Nullable Component component) {
        this.CP_M = component;
    }

    @Override
    public CP_jA CP_E() {
        return this.CP_A.CP_J();
    }

    @Override
    public void CP_f(CP_jA ilIljA) {
        this.CP_A.CP_y(ilIljA);
    }

    public CP_OG CP_G() {
        return this.CP_A;
    }

    public void CP_j(CP_OG ilIlOG) {
        this.CP_A = ilIlOG;
    }

    @Deprecated
    public CP_OG CP_c() {
        return this.CP_A;
    }

    @Deprecated
    public void CP_c(CP_OG ilIlOG) {
        this.CP_A = ilIlOG;
    }

    public byte @Nullable [] CP_M() {
        return this.CP_j;
    }

    public void CP_P(byte @Nullable [] byArray) {
        this.CP_j = byArray;
    }

    public byte[] CP_V() {
        return this.CP_O;
    }

    public void CP_a(byte[] byArray) {
        this.CP_O = byArray;
    }

    public Instant CP_X() {
        return this.CP_d;
    }

    public void CP_t(Instant instant) {
        this.CP_d = instant;
    }

    public long CP_A() {
        return this.CP_Y;
    }

    public void CP_g(long l) {
        this.CP_Y = l;
    }

    public CP_qI CP_g() {
        return this.CP_D;
    }

    public void CP_UnderScore(CP_qI ilIlqI) {
        this.CP_D = ilIlqI;
    }

    public CP_d2 CP_n() {
        return this.CP_F;
    }

    public void CP_r(CP_d2 ilIld2) {
        this.CP_F = ilIld2;
    }
}

