/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Lc {
    private String CP_m;
    private Optional<Component> CP_u;
    private static final long a = CP_s.a(1288025771127484469L, -7178469380905542043L, MethodHandles.lookup().lookupClass()).a(235214138823078L);
    private static transient /* synthetic */ String heQIfdgEzk = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Lc(String string, @Nullable Component component) {
        this.CP_m = string;
        this.CP_x(component);
    }

    public CP_Lc(String string) {
        this.CP_m = string;
        this.CP_u = Optional.empty();
    }

    public String CP_R() {
        return this.CP_m;
    }

    public void CP_u(String string) {
        this.CP_m = string;
    }

    public Optional<Component> CP_UnderScore() {
        return this.CP_u;
    }

    public void CP_x(@Nullable Component component) {
        block4: {
            block3: {
                PacketWrapper[] packetWrapperArray;
                block2: {
                    long l = a ^ 0x7ECB21C06969L;
                    packetWrapperArray = CP_Fh.CP_a();
                    if (packetWrapperArray == null) break block2;
                    if (component == null) break block3;
                    this.CP_u = Optional.of(component);
                }
                if (packetWrapperArray != null) break block4;
            }
            this.CP_u = Optional.empty();
        }
    }
}

