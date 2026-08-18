/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.Nullable;

public final class CP_or {
    private @Nullable Long CP_E;
    private static transient /* synthetic */ String ccBFmilJKv = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_or(@Nullable Long l) {
        this.CP_E = l;
    }

    public static CP_or CP_G(PacketWrapper<?> packetWrapper) {
        return new CP_or((Long)packetWrapper.CP_N(PacketWrapper::CP_i));
    }

    public static void CP_d(PacketWrapper<?> packetWrapper, CP_or ilIlor) {
        packetWrapper.CP_I(ilIlor.CP_E, PacketWrapper::CP_P);
    }

    public @Nullable Long CP_W() {
        return this.CP_E;
    }

    public void CP_e(@Nullable Long l) {
        this.CP_E = l;
    }
}

