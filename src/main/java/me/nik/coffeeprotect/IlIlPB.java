/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadLocalRandom;
import me.nik.coffeeprotect.IlIlPt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class IlIlPB
extends BukkitRunnable {
    final Location IlIlw;
    final Player IlIlb;
    final IlIlPt IlIlU;
    private static final long a = IlIls.a((long)1049913908178017911L, (long)6029424485528430600L, MethodHandles.lookup().lookupClass()).a(239576701180182L);
    private static transient /* synthetic */ String LqvNgXvpXL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlPB(IlIlPt ilIlPt, Location location, Player player) {
        this.IlIlw = location;
        this.IlIlb = player;
        this.IlIlU = ilIlPt;
    }

    public void run() {
        int n;
        block6: {
            IlIlPB ilIlPB;
            block4: {
                block5: {
                    long l = a ^ 0xFC4D3821728L;
                    int n2 = IlIlPt.IlIln();
                    this.IlIlw.setYaw(this.IlIlw.getYaw() + 10.0f);
                    n = n2;
                    this.IlIlw.setPitch(ThreadLocalRandom.current().nextFloat(0.0f, 90.0f));
                    ilIlPB = this;
                    if (n != 0) break block4;
                    if (!ilIlPB.IlIlb.isOnline()) break block5;
                    this.IlIlb.teleport(this.IlIlw);
                    if (n == 0) break block6;
                }
                ilIlPB = this;
            }
            ilIlPB.cancel();
        }
        if (PacketWrapper.IlIlz() == null) {
            IlIlPt.IlIla(++n);
        }
    }
}

