/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_Ok;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_dt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_jA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;

public class CP_oR
implements CP_Ok {
    private static transient /* synthetic */ String JOqVBgsdJk = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public CP_xw CP_O(@NotNull PacketWrapper<?> packetWrapper) {
        Component component = packetWrapper.CP_J();
        CP_jA ilIljA = packetWrapper.CP_t(CP_dt.CP_c());
        UUID uUID = packetWrapper.CP_v();
        return new CP_xl(component, ilIljA, uUID);
    }

    @Override
    public void CP_W(@NotNull PacketWrapper<?> packetWrapper, @NotNull CP_xw ilIlxw) {
        packetWrapper.CP_z(ilIlxw.CP_b());
        packetWrapper.CP_e(ilIlxw.CP_E());
        packetWrapper.CP_c(((CP_xl)ilIlxw).CP_l());
    }
}

