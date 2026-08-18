/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Z9;
import me.nik.coffeeprotect.CP_vm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.scheduler.BukkitRunnable;

public class CP_Zn
extends BukkitRunnable {
    private final CoffeeProtect CP_o;
    private static final long a = CP_s.a(-7984534498536452444L, -2633191160542227580L, MethodHandles.lookup().lookupClass()).a(142949675266154L);
    private static transient /* synthetic */ String snaVCBBoCQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Zn(CoffeeProtect coffeeProtect) {
        this.CP_o = coffeeProtect;
    }

    public void run() {
        CP_vm ilIlvm;
        boolean bl;
        block6: {
            CP_vm ilIlvm2;
            block7: {
                block5: {
                    boolean bl2;
                    block4: {
                        long l = a ^ 0x894E03014CDL;
                        ilIlvm2 = this.CP_o.CP_Z();
                        bl = CP_Z9.CP_V();
                        bl2 = ilIlvm2.CP_D();
                        if (bl) break block4;
                        if (bl2) break block5;
                        ilIlvm = ilIlvm2;
                        if (bl) break block6;
                        bl2 = ilIlvm.CP_G().isEmpty();
                    }
                    if (!bl2) break block7;
                }
                return;
            }
            ilIlvm2.CP_E().CP_y(ilIlvm2.CP_G());
            ilIlvm2.CP_j();
            ilIlvm = ilIlvm2;
        }
        ilIlvm.CP_Z(false);
        if (PacketWrapper.CP_z() == null) {
            CP_Z9.CP_M(!bl);
        }
    }
}
