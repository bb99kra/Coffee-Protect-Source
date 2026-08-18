/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.CheckResult;
import me.nik.coffeeprotect.Check;

public class CP_TE
extends CheckResult {
    private static int[] CP_E;
    private static transient /* synthetic */ String hHMTgeyCkM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_TE(Check ilIluV, String string) {
        super(ilIluV, string);
    }

    public CP_TE(Check ilIluV) {
        super(ilIluV, null);
    }

    public static void CP_x(int[] nArray) {
        CP_E = nArray;
    }

    public static int[] CP_p() {
        return CP_E;
    }

    static {
        if (CP_TE.CP_p() == null) {
            CP_TE.CP_x(new int[1]);
        }
    }
}
