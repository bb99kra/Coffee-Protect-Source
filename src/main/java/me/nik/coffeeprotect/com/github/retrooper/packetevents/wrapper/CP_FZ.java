/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_FZ
extends PacketWrapper<CP_FZ> {
    private int CP_z;
    private NBTCompound CP_r;
    private static transient /* synthetic */ String xFupiSBCSJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_FZ(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_FZ(int n, NBTCompound nBTCompound) {
        super(CP_AG.UPDATE_ENTITY_NBT);
        this.CP_z = n;
        this.CP_r = nBTCompound;
    }

    @Override
    public void CP_e() {
        this.CP_z = this.CP_f();
        this.CP_r = this.CP_S();
    }

    @Override
    public void CP_J() {
        this.CP_J(this.CP_z);
        this.CP_c(this.CP_r);
    }

    public void CP_n(CP_FZ ilIlFZ) {
        this.CP_z = ilIlFZ.CP_z;
        this.CP_r = ilIlFZ.CP_r;
    }

    public int CP_H() {
        return this.CP_z;
    }

    public void CP_X(int n) {
        this.CP_z = n;
    }

    public NBTCompound CP_y() {
        return this.CP_r;
    }

    public void CP_s(NBTCompound nBTCompound) {
        this.CP_r = nBTCompound;
    }
}

