/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

public class CP_u9 {
    private static int CP_c;
    private static transient /* synthetic */ String MhVGlFnaCS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public static void CP_q(int n) {
        CP_c = n;
    }

    public static int CP_UnderScore() {
        return CP_c;
    }

    public static int CP_X() {
        int n = CP_u9.CP_UnderScore();
        if (n == 0) {
            return 13;
        }
        return 0;
    }

    static {
        if (CP_u9.CP_X() != 0) {
            CP_u9.CP_q(20);
        }
    }
}

