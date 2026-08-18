/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Z9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class CP_Qm
extends BukkitRunnable {
    private final CoffeeProtect CP_i;
    private static final long a = CP_s.a(3498774329766808481L, -3898783315191080287L, MethodHandles.lookup().lookupClass()).a(226246840274180L);
    private static transient /* synthetic */ String xdPxwqnbJL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Qm(CoffeeProtect coffeeProtect) {
        this.CP_i = coffeeProtect;
    }

    public void run() {
        long l = a ^ 0x3DCDCC544C96L;
        boolean bl = CP_Z9.CP_V();
        this.CP_i.CP_F().CP_O().keySet().removeIf(uUID -> {
            long l = a ^ 0x34498D04DAA1L;
            return Bukkit.getPlayer((UUID)uUID) == null;
        });
        boolean bl2 = bl;
        if (bl2) {
            PacketWrapper.CP_e(new int[3]);
        }
    }
}
