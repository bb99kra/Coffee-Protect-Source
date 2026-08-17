/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.IlIlPt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

class IlIlTF
extends BukkitRunnable {
    final Player IlIlN;
    final IlIlPt IlIlO;
    private static final long a = IlIls.a((long)7324256210661922564L, (long)5156817036421011209L, MethodHandles.lookup().lookupClass()).a(217014028822228L);
    private static transient /* synthetic */ String CpQxedWJnU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    IlIlTF(IlIlPt ilIlPt, Player player) {
        this.IlIlN = player;
        this.IlIlO = ilIlPt;
    }

    public void run() {
        block4: {
            IlIlTF ilIlTF;
            block2: {
                block3: {
                    long l = a ^ 0x2A5842FFB93BL;
                    int n = IlIlPt.IlIlD();
                    ilIlTF = this;
                    if (n == 0) break block2;
                    if (!ilIlTF.IlIlN.isOnline()) break block3;
                    this.IlIlN.setNoDamageTicks(0);
                    this.IlIlN.damage(0.0, (Entity)null);
                    if (n != 0) break block4;
                }
                ilIlTF = this;
            }
            ilIlTF.cancel();
        }
    }
}

