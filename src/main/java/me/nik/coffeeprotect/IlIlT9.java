/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbU
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.IlIlPt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class IlIlT9
extends BukkitRunnable {
    final Player IlIlq;
    final IlIlbU IlIle;
    final IlIlPt IlIlp;
    private static final long a = IlIls.a((long)5107075690793499525L, (long)-7722291408395540611L, MethodHandles.lookup().lookupClass()).a(157501393906265L);
    private static transient /* synthetic */ String WXBjaUXHyH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlT9(IlIlPt ilIlPt, Player player, IlIlbU ilIlbU) {
        this.IlIlq = player;
        this.IlIle = ilIlbU;
        this.IlIlp = ilIlPt;
    }

    public void run() {
        block4: {
            IlIlT9 ilIlT9;
            block2: {
                block3: {
                    long l = a ^ 0x56242AA7AABBL;
                    int n = IlIlPt.IlIln();
                    ilIlT9 = this;
                    if (n != 0) break block2;
                    if (!ilIlT9.IlIlq.isOnline()) break block3;
                    IlIlr7.IlIlb().IlIlq().IlIlE((Object)this.IlIlq, (PacketWrapper)this.IlIle);
                    if (n == 0) break block4;
                }
                ilIlT9 = this;
            }
            ilIlT9.cancel();
        }
    }
}

