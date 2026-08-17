/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Bukkit
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlZ9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.scheduler.BukkitRunnable;

public class IlIlQm
extends BukkitRunnable {
    private final CoffeeProtect IlIli;
    private static final long a = IlIls.a((long)3498774329766808481L, (long)-3898783315191080287L, MethodHandles.lookup().lookupClass()).a(226246840274180L);
    private static transient /* synthetic */ String xdPxwqnbJL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlQm(CoffeeProtect coffeeProtect) {
        this.IlIli = coffeeProtect;
    }

    public void run() {
        long l = a ^ 0x3DCDCC544C96L;
        boolean bl = IlIlZ9.IlIlV();
        this.IlIli.IlIlF().IlIlO().keySet().removeIf(uUID -> {
            long l = a ^ 0x34498D04DAA1L;
            return Bukkit.getPlayer((UUID)uUID) == null;
        });
        boolean bl2 = bl;
        if (bl2) {
            PacketWrapper.IlIle((int[])new int[3]);
        }
    }
}

