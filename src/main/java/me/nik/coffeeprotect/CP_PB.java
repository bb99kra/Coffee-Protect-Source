/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadLocalRandom;
import me.nik.coffeeprotect.CP_Pt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class CP_PB
extends BukkitRunnable {
    final Location CP_w;
    final Player CP_b;
    final CP_Pt CP_U;
    private static final long a = CP_s.a(1049913908178017911L, 6029424485528430600L, MethodHandles.lookup().lookupClass()).a(239576701180182L);
    private static transient /* synthetic */ String LqvNgXvpXL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_PB(CP_Pt ilIlPt, Location location, Player player) {
        this.CP_w = location;
        this.CP_b = player;
        this.CP_U = ilIlPt;
    }

    public void run() {
        int n;
        block6: {
            CP_PB ilIlPB;
            block4: {
                block5: {
                    long l = a ^ 0xFC4D3821728L;
                    int n2 = CP_Pt.CP_n();
                    this.CP_w.setYaw(this.CP_w.getYaw() + 10.0f);
                    n = n2;
                    this.CP_w.setPitch(ThreadLocalRandom.current().nextFloat(0.0f, 90.0f));
                    ilIlPB = this;
                    if (n != 0) break block4;
                    if (!ilIlPB.CP_b.isOnline()) break block5;
                    this.CP_b.teleport(this.CP_w);
                    if (n == 0) break block6;
                }
                ilIlPB = this;
            }
            ilIlPB.cancel();
        }
        if (PacketWrapper.CP_z() == null) {
            CP_Pt.CP_a(++n);
        }
    }
}
