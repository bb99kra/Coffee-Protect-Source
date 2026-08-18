/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_GZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_FV
extends PacketWrapper<CP_FV> {
    private List<CP_GZ> CP_H;
    private boolean CP_t;
    private static transient /* synthetic */ String hjNOCfcRgX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_FV(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_FV(List<CP_GZ> list, boolean bl) {
        super(CP_AG.RECIPE_BOOK_ADD);
        this.CP_H = list;
        this.CP_t = bl;
    }

    @Override
    public void CP_e() {
        this.CP_H = this.CP_l(CP_GZ::CP_t);
        this.CP_t = this.CP_K();
    }

    @Override
    public void CP_J() {
        this.CP_Q(this.CP_H, CP_GZ::CP_z);
        this.CP_a(this.CP_t);
    }

    public void CP_t(CP_FV ilIlFV) {
        this.CP_H = ilIlFV.CP_H;
        this.CP_t = ilIlFV.CP_t;
    }

    public List<CP_GZ> CP_M() {
        return this.CP_H;
    }

    public void CP_E(List<CP_GZ> list) {
        this.CP_H = list;
    }

    public boolean CP_H() {
        return this.CP_t;
    }

    public void CP_W(boolean bl) {
        this.CP_t = bl;
    }
}

