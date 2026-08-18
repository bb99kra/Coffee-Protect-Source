/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CP_yP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_ho {
    private final long CP_q;
    private static final long a = CP_s.a(2386136233741938108L, -4948416592093025147L, MethodHandles.lookup().lookupClass()).a(103329724641013L);
    private static transient /* synthetic */ String eDTCLPemdw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_ho() {
        long l = a ^ 0x45B22D37074EL;
        this.CP_q = System.currentTimeMillis();
        int n = CP_yP.CP_B();
        if (PacketWrapper.CP_z() == null) {
            CP_yP.CP_W(++n);
        }
    }

    public long CP_a() {
        return System.currentTimeMillis() - this.CP_q;
    }
}
