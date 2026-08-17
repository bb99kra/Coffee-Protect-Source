/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIluV;

public class IlIlTE
extends IlIlTV {
    private static int[] IlIlE;
    private static transient /* synthetic */ String hHMTgeyCkM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlTE(IlIluV ilIluV, String string) {
        super(ilIluV, string);
    }

    public IlIlTE(IlIluV ilIluV) {
        super(ilIluV, null);
    }

    public static void IlIlx(int[] nArray) {
        IlIlE = nArray;
    }

    public static int[] IlIlp() {
        return IlIlE;
    }

    static {
        if (IlIlTE.IlIlp() == null) {
            IlIlTE.IlIlx(new int[1]);
        }
    }
}

