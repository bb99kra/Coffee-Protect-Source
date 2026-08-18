/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player;

import java.security.PublicKey;
import java.time.Instant;

public class CP_Lt {
    private final Instant CP_X;
    private final PublicKey CP_s;
    private final byte[] CP_B;
    private static transient /* synthetic */ String scuHJEDMRp = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Lt(Instant instant, PublicKey publicKey, byte[] byArray) {
        this.CP_X = instant;
        this.CP_s = publicKey;
        this.CP_B = byArray;
    }

    public Instant CP_N() {
        return this.CP_X;
    }

    public PublicKey CP_k() {
        return this.CP_s;
    }

    public byte[] CP_H() {
        return this.CP_B;
    }

    public boolean CP_V() {
        return this.CP_X.isBefore(Instant.now());
    }
}

