/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

public abstract class CP_Qv {
    private static int CP_m;

    public abstract long[] CP_UnderScore();

    public abstract int CP_U();

    abstract int CP_r();

    public abstract int CP_o(int var1);

    public abstract void CP_r(int var1, int var2);

    public static void CP_E(int n) {
        CP_m = n;
    }

    public static int CP_x() {
        return CP_m;
    }

    public static int CP_V() {
        int n = CP_Qv.CP_x();
        if (n == 0) {
            return 69;
        }
        return 0;
    }

    static {
        if (CP_Qv.CP_V() == 0) {
            CP_Qv.CP_E(57);
        }
    }
}

