/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_jA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_X7;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;

public class CP_xw {
    private Component CP_H;
    private CP_jA CP_X;
    private static boolean CP_h;
    private static transient /* synthetic */ String xTjDriMXJR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    protected CP_xw(Component component, CP_jA ilIljA) {
        this.CP_H = component;
        this.CP_X = ilIljA;
    }

    public Component CP_b() {
        return this.CP_H;
    }

    public String CP_H(ClientVersion clientVersion) {
        return CP_X7.CP_X(clientVersion).CP_R(this.CP_b());
    }

    public void CP_v(Component component) {
        this.CP_H = component;
    }

    public void CP_x(ClientVersion clientVersion, String string) {
        this.CP_v(CP_X7.CP_X(clientVersion).CP_x(string));
    }

    public CP_jA CP_E() {
        return this.CP_X;
    }

    public void CP_f(CP_jA ilIljA) {
        this.CP_X = ilIljA;
    }

    public static void CP_UnderScore(boolean bl) {
        CP_h = bl;
    }

    public static boolean CP_P() {
        return CP_h;
    }

    public static boolean CP_v() {
        boolean bl = CP_xw.CP_P();
        return !bl;
    }

    static {
        if (CP_xw.CP_v()) {
            CP_xw.CP_UnderScore(true);
        }
    }
}

