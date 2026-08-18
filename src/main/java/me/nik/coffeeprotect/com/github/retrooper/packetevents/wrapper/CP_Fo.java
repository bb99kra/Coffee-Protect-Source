/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.Optional;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Fo
extends PacketWrapper<CP_Fo> {
    private byte @Nullable [] CP_B;
    private UUID CP_o;
    private byte[] CP_p;
    private byte[] CP_J;
    private static transient /* synthetic */ String gKwKEgzOjR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fo(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fo(byte @Nullable [] byArray, UUID uUID, byte[] byArray2, byte[] byArray3) {
        super(CP_AG.PLAYER_CHAT_HEADER);
        this.CP_B = byArray;
        this.CP_o = uUID;
        this.CP_p = byArray2;
        this.CP_J = byArray3;
    }

    @Override
    public void CP_e() {
        this.CP_B = (byte[])this.CP_N(PacketWrapper::CP_l);
        this.CP_o = this.CP_v();
        this.CP_p = this.CP_l();
        this.CP_J = this.CP_l();
    }

    @Override
    public void CP_J() {
        this.CP_I(this.CP_B, PacketWrapper::CP_U);
        this.CP_c(this.CP_o);
        this.CP_U(this.CP_p);
        this.CP_U(this.CP_J);
    }

    public void CP_V(CP_Fo ilIlFo) {
        this.CP_B = ilIlFo.CP_B;
        this.CP_o = ilIlFo.CP_o;
        this.CP_p = ilIlFo.CP_p;
        this.CP_J = ilIlFo.CP_J;
    }

    public Optional<byte[]> CP_K() {
        return Optional.ofNullable(this.CP_B);
    }

    public void CP_Y(byte @Nullable [] byArray) {
        this.CP_B = byArray;
    }

    public UUID CP_G() {
        return this.CP_o;
    }

    public void CP_m(UUID uUID) {
        this.CP_o = uUID;
    }

    public byte[] CP_D() {
        return this.CP_p;
    }

    public void CP_x(byte[] byArray) {
        this.CP_p = byArray;
    }

    public byte[] CP_g() {
        return this.CP_J;
    }

    public void CP_h(byte[] byArray) {
        this.CP_J = byArray;
    }
}

