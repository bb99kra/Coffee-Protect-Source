/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_yP {
    private final long CP_f;
    private static int CP_U;
    private static final long a;
    private static transient /* synthetic */ String FlASnmkbkQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_yP() {
        long l = a ^ 0x4B4D5B81FF22L;
        this.CP_f = System.nanoTime();
        int n = CP_yP.CP_k();
        if (n == 0) {
            PacketWrapper.CP_e(new int[3]);
        }
    }

    public long CP_B() {
        return System.nanoTime() - this.CP_f;
    }

    public static void CP_W(int n) {
        CP_U = n;
    }

    public static int CP_B() {
        return CP_U;
    }

    public static int CP_k() {
        int n = CP_yP.CP_B();
        if (n == 0) {
            return 6;
        }
        return 0;
    }

    static {
        a = CP_s.a(-6501028434614111279L, 3731920882238518685L, MethodHandles.lookup().lookupClass()).a(24573438270711L);
        if (CP_yP.CP_B() != 0) {
            CP_yP.CP_W(31);
        }
    }
}
