/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public final class IlIlQb {
    private static String IlIli;
    private static final long a;
    private static transient /* synthetic */ String cGiRsfUlUz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlQb() {
    }

    public static void IlIlJ(Runnable runnable, long l, long l2) {
        long l3 = a ^ 0x3C828B40B708L;
        String string = IlIlrW.IlIlx();
        if (string != null) {
            if (CoffeeProtect.IlIlJ().IlIli()) {
                IlIlQb.IlIla(runnable, l, l2);
                return;
            }
            Bukkit.getScheduler().runTaskTimer((Plugin)CoffeeProtect.IlIlJ(), runnable, l, l2);
        }
    }

    public static void IlIla(Runnable runnable, long l, long l2) {
        block4: {
            block3: {
                String string;
                block2: {
                    long l3 = a ^ 0x76EE2CAF64C4L;
                    string = IlIlrW.IlIlx();
                    if (string == null) break block2;
                    if (!CoffeeProtect.IlIlJ().IlIli()) break block3;
                    Bukkit.getGlobalRegionScheduler().runAtFixedRate((Plugin)CoffeeProtect.IlIlJ(), scheduledTask -> runnable.run(), l, l2);
                }
                if (string != null) break block4;
            }
            Bukkit.getScheduler().runTaskTimerAsynchronously((Plugin)CoffeeProtect.IlIlJ(), runnable, l, l2);
        }
    }

    public static void IlIlL(Runnable runnable) {
        long l = a ^ 0x40E507CE59C1L;
        String string = IlIlrW.IlIlx();
        if (string != null) {
            if (CoffeeProtect.IlIlJ().IlIli()) {
                IlIlQb.IlIlt(runnable);
                return;
            }
            Bukkit.getScheduler().runTask((Plugin)CoffeeProtect.IlIlJ(), runnable);
        }
    }

    public static void IlIlt(Runnable runnable) {
        block4: {
            block3: {
                String string;
                block2: {
                    long l = a ^ 0x2AE8F9CB7D36L;
                    string = IlIlrW.IlIlx();
                    if (string == null) break block2;
                    if (!CoffeeProtect.IlIlJ().IlIli()) break block3;
                    Bukkit.getGlobalRegionScheduler().run((Plugin)CoffeeProtect.IlIlJ(), scheduledTask -> runnable.run());
                }
                if (string != null) break block4;
            }
            Bukkit.getScheduler().runTaskAsynchronously((Plugin)CoffeeProtect.IlIlJ(), runnable);
        }
    }

    public static void IlIll(Runnable runnable, long l) {
        long l2 = a ^ 0x62B66F26A19BL;
        String string = IlIlrW.IlIlx();
        if (string != null) {
            if (CoffeeProtect.IlIlJ().IlIli()) {
                IlIlQb.IlIly(runnable, l);
                return;
            }
            Bukkit.getScheduler().runTaskLater((Plugin)CoffeeProtect.IlIlJ(), runnable, l);
        }
    }

    public static void IlIly(Runnable runnable, long l) {
        block4: {
            block3: {
                String string;
                block2: {
                    long l2 = a ^ 0x6259318994DBL;
                    string = IlIlrW.IlIlx();
                    if (string == null) break block2;
                    if (!CoffeeProtect.IlIlJ().IlIli()) break block3;
                    Bukkit.getGlobalRegionScheduler().runDelayed((Plugin)CoffeeProtect.IlIlJ(), scheduledTask -> runnable.run(), l);
                }
                if (string != null) break block4;
            }
            Bukkit.getScheduler().runTaskLaterAsynchronously((Plugin)CoffeeProtect.IlIlJ(), runnable, l);
        }
    }

    public static void IlIlt(String string) {
        IlIli = string;
    }

    public static String IlIlY() {
        return IlIli;
    }

    static {
        a = IlIls.a((long)2324071666454829649L, (long)8101275184455157005L, MethodHandles.lookup().lookupClass()).a(279203871717858L);
        if (IlIlQb.IlIlY() != null) {
            IlIlQb.IlIlt("xrAwnc");
        }
    }
}

