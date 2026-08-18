/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_TM;
import org.bukkit.scheduler.BukkitRunnable;

public class CP_Z9
extends BukkitRunnable {
    private final CoffeeProtect CP_W;
    private static boolean CP_x;
    private static transient /* synthetic */ String zReYkchVcD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Z9(CoffeeProtect coffeeProtect) {
        this.CP_W = coffeeProtect;
    }

    public void run() {
        this.CP_W.CP_F().CP_O().values().forEach(CP_TM::CP_W);
    }

    public static void CP_M(boolean bl) {
        CP_x = bl;
    }

    public static boolean CP_I() {
        return CP_x;
    }

    public static boolean CP_V() {
        boolean bl = CP_Z9.CP_I();
        return !bl;
    }

    static {
        if (CP_Z9.CP_V()) {
            CP_Z9.CP_M(true);
        }
    }
}
