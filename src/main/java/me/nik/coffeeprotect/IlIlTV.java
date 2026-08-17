/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlTV {
    private final String IlIlp;
    private final String IlIlO;
    private final String IlIlA;
    private static int IlIlh;
    private static final long a;
    private static transient /* synthetic */ String ubrvjXwZdb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlTV(IlIluV ilIluV, String string) {
        long l = a ^ 0x780F5C67CDL;
        this.IlIlp = ilIluV.IlIlQ();
        this.IlIlO = ilIluV.IlIlB();
        this.IlIlA = string;
        int n = IlIlTV.IlIlP();
        if (n != 0) {
            PacketWrapper.IlIle((int[])new int[4]);
        }
    }

    public String IlIlA() {
        return this.IlIlp;
    }

    public String IlIle() {
        return this.IlIlO;
    }

    public String IlIlz() {
        return this.IlIlA;
    }

    public static void IlIlU(int n) {
        IlIlh = n;
    }

    public static int IlIlP() {
        return IlIlh;
    }

    public static int IlIlY() {
        int n = IlIlTV.IlIlP();
        if (n == 0) {
            return 80;
        }
        return 0;
    }

    static {
        a = IlIls.a((long)265735749012132044L, (long)-8140551015847899728L, MethodHandles.lookup().lookupClass()).a(133765976915495L);
        if (IlIlTV.IlIlP() != 0) {
            IlIlTV.IlIlU(114);
        }
    }
}

