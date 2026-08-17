/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlZ9;
import me.nik.coffeeprotect.IlIlvm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.scheduler.BukkitRunnable;

public class IlIlZn
extends BukkitRunnable {
    private final CoffeeProtect IlIlo;
    private static final long a = IlIls.a((long)-7984534498536452444L, (long)-2633191160542227580L, MethodHandles.lookup().lookupClass()).a(142949675266154L);
    private static transient /* synthetic */ String snaVCBBoCQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlZn(CoffeeProtect coffeeProtect) {
        this.IlIlo = coffeeProtect;
    }

    public void run() {
        IlIlvm ilIlvm;
        boolean bl;
        block6: {
            IlIlvm ilIlvm2;
            block7: {
                block5: {
                    boolean bl2;
                    block4: {
                        long l = a ^ 0x894E03014CDL;
                        ilIlvm2 = this.IlIlo.IlIlZ();
                        bl = IlIlZ9.IlIlV();
                        bl2 = ilIlvm2.IlIlD();
                        if (bl) break block4;
                        if (bl2) break block5;
                        ilIlvm = ilIlvm2;
                        if (bl) break block6;
                        bl2 = ilIlvm.IlIlG().isEmpty();
                    }
                    if (!bl2) break block7;
                }
                return;
            }
            ilIlvm2.IlIlE().IlIly(ilIlvm2.IlIlG());
            ilIlvm2.IlIlj();
            ilIlvm = ilIlvm2;
        }
        ilIlvm.IlIlZ(false);
        if (PacketWrapper.IlIlz() == null) {
            IlIlZ9.IlIlM(!bl);
        }
    }
}

