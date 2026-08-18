/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_QW {
    private final int CP_l;
    private int CP_t;
    private final boolean CP_p;
    private final boolean CP_I;
    private byte[] CP_Z;
    private static transient /* synthetic */ String VLmIfAJqZR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_QW(int n, boolean bl, boolean bl2, byte[] byArray) {
        this.CP_l = n;
        this.CP_p = bl;
        this.CP_I = bl2;
        this.CP_Z = byArray;
    }

    public CP_QW(int n, int n2, boolean bl, boolean bl2, byte[] byArray) {
        this(n, bl, bl2, byArray);
        this.CP_t = n2;
    }

    public int CP_D() {
        return this.CP_l;
    }

    public int CP_A() {
        return this.CP_t;
    }

    public boolean CP_A() {
        return this.CP_p;
    }

    public boolean CP_m() {
        return this.CP_I;
    }

    public byte[] CP_V() {
        return this.CP_Z;
    }

    public void CP_I(byte[] byArray) {
        this.CP_Z = byArray;
    }
}

