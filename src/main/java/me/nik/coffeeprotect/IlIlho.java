/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.IlIlyP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlho {
    private final long IlIlq;
    private static final long a = IlIls.a((long)2386136233741938108L, (long)-4948416592093025147L, MethodHandles.lookup().lookupClass()).a(103329724641013L);
    private static transient /* synthetic */ String eDTCLPemdw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlho() {
        long l = a ^ 0x45B22D37074EL;
        this.IlIlq = System.currentTimeMillis();
        int n = IlIlyP.IlIlB();
        if (PacketWrapper.IlIlz() == null) {
            IlIlyP.IlIlW(++n);
        }
    }

    public long IlIla() {
        return System.currentTimeMillis() - this.IlIlq;
    }
}

