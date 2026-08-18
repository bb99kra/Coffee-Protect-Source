/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_Ju
extends PacketWrapper<CP_Ju> {
    private String CP_UnderScore;
    private static transient /* synthetic */ String dlsDJDIQLC = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Ju(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Ju(String string) {
        super(CP_Wz.CODE_OF_CONDUCT);
        this.CP_UnderScore = string;
    }

    @Override
    public void CP_e() {
        this.CP_UnderScore = this.CP_i();
    }

    @Override
    public void CP_J() {
        this.CP_M(this.CP_UnderScore);
    }

    public void CP_c(CP_Ju ilIlJu) {
        this.CP_UnderScore = ilIlJu.CP_UnderScore;
    }

    public String CP_G() {
        return this.CP_UnderScore;
    }

    public void CP_S(String string) {
        this.CP_UnderScore = string;
    }
}

