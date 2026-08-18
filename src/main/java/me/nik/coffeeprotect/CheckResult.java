/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.Check;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CheckResult {
    private final String CP_p;
    private final String CP_O;
    private final String CP_A;
    private static int CP_h;
    private static final long a;
    private static transient /* synthetic */ String ubrvjXwZdb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CheckResult(Check ilIluV, String string) {
        long l = a ^ 0x780F5C67CDL;
        this.CP_p = ilIluV.CP_Q();
        this.CP_O = ilIluV.CP_B();
        this.CP_A = string;
        int n = CheckResult.CP_P();
        if (n != 0) {
            PacketWrapper.CP_e(new int[4]);
        }
    }

    public String CP_A() {
        return this.CP_p;
    }

    public String CP_e() {
        return this.CP_O;
    }

    public String CP_z() {
        return this.CP_A;
    }

    public static void CP_U(int n) {
        CP_h = n;
    }

    public static int CP_P() {
        return CP_h;
    }

    public static int CP_Y() {
        int n = CheckResult.CP_P();
        if (n == 0) {
            return 80;
        }
        return 0;
    }

    static {
        a = CP_s.a(265735749012132044L, -8140551015847899728L, MethodHandles.lookup().lookupClass()).a(133765976915495L);
        if (CheckResult.CP_P() != 0) {
            CheckResult.CP_U(114);
        }
    }
}
