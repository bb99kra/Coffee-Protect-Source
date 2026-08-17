/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlyP {
    private final long IlIlf;
    private static int IlIlU;
    private static final long a;
    private static transient /* synthetic */ String FlASnmkbkQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlyP() {
        long l = a ^ 0x4B4D5B81FF22L;
        this.IlIlf = System.nanoTime();
        int n = IlIlyP.IlIlk();
        if (n == 0) {
            PacketWrapper.IlIle((int[])new int[3]);
        }
    }

    public long IlIlB() {
        return System.nanoTime() - this.IlIlf;
    }

    public static void IlIlW(int n) {
        IlIlU = n;
    }

    public static int IlIlB() {
        return IlIlU;
    }

    public static int IlIlk() {
        int n = IlIlyP.IlIlB();
        if (n == 0) {
            return 6;
        }
        return 0;
    }

    static {
        a = IlIls.a((long)-6501028434614111279L, (long)3731920882238518685L, MethodHandles.lookup().lookupClass()).a(24573438270711L);
        if (IlIlyP.IlIlB() != 0) {
            IlIlyP.IlIlW(31);
        }
    }
}

