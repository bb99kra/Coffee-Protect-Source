/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_jq {
    private final int CP_X;
    private final int CP_z;
    private final int CP_x;
    private final int CP_P;
    private final int CP_l;
    private final int CP_O;
    private static transient /* synthetic */ String rAjGhysqpR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_jq(int n, int n2, int n3, int n4, int n5, int n6) {
        this.CP_X = Math.min(n, n4);
        this.CP_z = Math.min(n2, n5);
        this.CP_x = Math.min(n3, n6);
        this.CP_P = Math.max(n4, n);
        this.CP_l = Math.max(n5, n2);
        this.CP_O = Math.max(n6, n3);
    }

    public static CP_jq CP_A(PacketWrapper<?> packetWrapper) {
        CP_An ilIlAn = packetWrapper.CP_E();
        CP_An ilIlAn2 = packetWrapper.CP_E();
        return new CP_jq(ilIlAn.CP_j, ilIlAn.CP_w, ilIlAn.CP_k, ilIlAn2.CP_j, ilIlAn2.CP_w, ilIlAn2.CP_k);
    }

    public static void CP_d(PacketWrapper<?> packetWrapper, CP_jq ilIljq) {
        packetWrapper.CP_h(new CP_An(ilIljq.CP_X, ilIljq.CP_z, ilIljq.CP_x));
        packetWrapper.CP_h(new CP_An(ilIljq.CP_P, ilIljq.CP_l, ilIljq.CP_O));
    }

    public int CP_l() {
        return this.CP_X;
    }

    public int CP_j() {
        return this.CP_z;
    }

    public int CP_r() {
        return this.CP_x;
    }

    public int CP_D() {
        return this.CP_P;
    }

    public int CP_V() {
        return this.CP_l;
    }

    public int CP_e() {
        return this.CP_O;
    }
}

