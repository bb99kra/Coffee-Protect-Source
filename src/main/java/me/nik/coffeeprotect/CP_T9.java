/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CP_Pt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_bU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class CP_T9
extends BukkitRunnable {
    final Player CP_q;
    final CP_bU CP_e;
    final CP_Pt CP_p;
    private static final long a = CP_s.a(5107075690793499525L, -7722291408395540611L, MethodHandles.lookup().lookupClass()).a(157501393906265L);
    private static transient /* synthetic */ String WXBjaUXHyH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_T9(CP_Pt ilIlPt, Player player, CP_bU ilIlbU) {
        this.CP_q = player;
        this.CP_e = ilIlbU;
        this.CP_p = ilIlPt;
    }

    public void run() {
        block4: {
            CP_T9 ilIlT9;
            block2: {
                block3: {
                    long l = a ^ 0x56242AA7AABBL;
                    int n = CP_Pt.CP_n();
                    ilIlT9 = this;
                    if (n != 0) break block2;
                    if (!ilIlT9.CP_q.isOnline()) break block3;
                    CP_r7.CP_b().CP_q().CP_E(this.CP_q, this.CP_e);
                    if (n == 0) break block4;
                }
                ilIlT9 = this;
            }
            ilIlT9.cancel();
        }
    }
}
