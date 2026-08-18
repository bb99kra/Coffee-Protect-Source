/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_rU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodecs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_X7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

class CP_oq
implements CP_rU {
    private Component CP_T;
    final Map.Entry CP_d;
    final String CP_B;
    private static final long a = CP_s.a(4605149413150807025L, -3138647006722510783L, MethodHandles.lookup().lookupClass()).a(76731107804923L);
    private static transient /* synthetic */ String WOPTrWAeAa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    CP_oq(Map.Entry entry, String string) {
        this.CP_d = entry;
        this.CP_B = string;
    }

    @Override
    public String CP_k() {
        return (String)this.CP_d.getKey();
    }

    @Override
    public Component CP_M() {
        long l = a ^ 0x5C71EC03989AL;
        String[] stringArray = NbtCodecs.CP_u();
        Component component = this.CP_T;
        if (stringArray != null) {
            if (component == null) {
                this.CP_T = CP_X7.CP_P().CP_x(this.CP_B);
            }
            component = this.CP_T;
        }
        return component;
    }

    public boolean equals(Object object) {
        long l = a ^ 0x478D405BD668L;
        String[] stringArray = NbtCodecs.CP_u();
        boolean bl = object instanceof CP_rU;
        if (stringArray != null) {
            if (bl) {
                return ((CP_rU)object).CP_k().equals(this.CP_k());
            }
            bl = false;
        }
        return bl;
    }
}

