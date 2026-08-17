/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlTM;
import org.bukkit.scheduler.BukkitRunnable;

public class IlIlZ9
extends BukkitRunnable {
    private final CoffeeProtect IlIlW;
    private static boolean IlIlx;
    private static transient /* synthetic */ String zReYkchVcD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlZ9(CoffeeProtect coffeeProtect) {
        this.IlIlW = coffeeProtect;
    }

    public void run() {
        this.IlIlW.IlIlF().IlIlO().values().forEach(IlIlTM::IlIlW);
    }

    public static void IlIlM(boolean bl) {
        IlIlx = bl;
    }

    public static boolean IlIlI() {
        return IlIlx;
    }

    public static boolean IlIlV() {
        boolean bl = IlIlZ9.IlIlI();
        return !bl;
    }

    static {
        if (IlIlZ9.IlIlV()) {
            IlIlZ9.IlIlM(true);
        }
    }
}

