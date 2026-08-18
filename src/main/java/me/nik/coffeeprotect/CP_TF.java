/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CP_Pt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class CP_TF
extends BukkitRunnable {
    final Player CP_N;
    final CP_Pt CP_O;
    private static final long a = CP_s.a(7324256210661922564L, 5156817036421011209L, MethodHandles.lookup().lookupClass()).a(217014028822228L);
    private static transient /* synthetic */ String CpQxedWJnU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_TF(CP_Pt ilIlPt, Player player) {
        this.CP_N = player;
        this.CP_O = ilIlPt;
    }

    public void run() {
        block4: {
            CP_TF ilIlTF;
            block2: {
                block3: {
                    long l = a ^ 0x2A5842FFB93BL;
                    int n = CP_Pt.CP_D();
                    ilIlTF = this;
                    if (n == 0) break block2;
                    if (!ilIlTF.CP_N.isOnline()) break block3;
                    this.CP_N.setNoDamageTicks(0);
                    this.CP_N.damage(0.0, (Entity)null);
                    if (n != 0) break block4;
                }
                ilIlTF = this;
            }
            ilIlTF.cancel();
        }
    }
}
