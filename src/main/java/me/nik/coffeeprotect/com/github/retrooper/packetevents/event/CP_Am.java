/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_Ps;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_nQ;
import org.jspecify.annotations.NullMarked;

@NullMarked
public interface CP_Am {
    default public void call(CP_Ps ilIlPs) {
        ilIlPs.CP_D((CP_nQ)this);
    }
}

