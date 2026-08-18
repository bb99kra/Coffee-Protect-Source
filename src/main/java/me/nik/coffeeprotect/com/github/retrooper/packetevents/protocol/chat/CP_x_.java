/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import java.time.Instant;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_AS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_OG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_d2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xm;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_x_
extends CP_xm {
    int CP_r;
    private static transient /* synthetic */ String BLTVZZdhyl = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_x_(int n, UUID uUID, int n2, byte[] byArray, String string, Instant instant, long l, CP_AS ilIlAS, @Nullable Component component, CP_d2 ilIld2, CP_OG ilIlOG) {
        super(uUID, n2, byArray, string, instant, l, ilIlAS, component, ilIld2, ilIlOG);
        this.CP_r = n;
    }

    public int CP_v() {
        return this.CP_r;
    }

    public void CP_R(int n) {
        this.CP_r = n;
    }
}

