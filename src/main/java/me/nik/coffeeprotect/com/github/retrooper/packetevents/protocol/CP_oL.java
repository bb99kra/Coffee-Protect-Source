/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public interface CP_oL {
    default public String CP_f() {
        return ((Enum)((Object)this)).name();
    }

    public int CP_g(ClientVersion var1);

    public CP_hC CP_Y();

    @Nullable
    public Class<? extends PacketWrapper<?>> CP_B();
}

