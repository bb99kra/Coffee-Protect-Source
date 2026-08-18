/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.time.Instant;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_jA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xl;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_xT
extends CP_xl {
    @Nullable
    private Component CP_o;
    private Component CP_B;
    @Nullable
    private Component CP_w;
    private Instant CP_f;
    private long CP_I;
    private byte[] CP_l;
    private static transient /* synthetic */ String mVtIwODkus = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_xT(Component component, @Nullable Component component2, CP_jA ilIljA, UUID uUID, Component component3, @Nullable Component component4, Instant instant, long l, byte[] byArray) {
        super(component, ilIljA, uUID);
        this.CP_o = component2;
        this.CP_B = component3;
        this.CP_w = component4;
        this.CP_f = instant;
        this.CP_I = l;
        this.CP_l = byArray;
    }

    @Nullable
    public Component CP_l() {
        return this.CP_o;
    }

    public Component CP_F() {
        return this.CP_B;
    }

    @Nullable
    public Component CP_g() {
        return this.CP_w;
    }

    public Instant CP_H() {
        return this.CP_f;
    }

    public long CP_t() {
        return this.CP_I;
    }

    public byte[] CP_F() {
        return this.CP_l;
    }

    public void CP_O(@Nullable Component component) {
        this.CP_o = component;
    }

    public void CP_E(Component component) {
        this.CP_B = component;
    }

    public void CP_i(@Nullable Component component) {
        this.CP_w = component;
    }

    public void CP_o(Instant instant) {
        this.CP_f = instant;
    }

    public void CP_A(long l) {
        this.CP_I = l;
    }

    public void CP_w(byte[] byArray) {
        this.CP_l = byArray;
    }
}

