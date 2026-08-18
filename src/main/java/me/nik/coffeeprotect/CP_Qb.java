/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public final class CP_Qb {
    private static String CP_i;
    private static final long a;
    private static transient /* synthetic */ String cGiRsfUlUz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_Qb() {
    }

    public static void CP_J(Runnable runnable, long l, long l2) {
        long l3 = a ^ 0x3C828B40B708L;
        String string = CP_rW.CP_x();
        if (string != null) {
            if (CoffeeProtect.CP_J().CP_i()) {
                CP_Qb.CP_a(runnable, l, l2);
                return;
            }
            Bukkit.getScheduler().runTaskTimer((Plugin)CoffeeProtect.CP_J(), runnable, l, l2);
        }
    }

    public static void CP_a(Runnable runnable, long l, long l2) {
        block4: {
            block3: {
                String string;
                block2: {
                    long l3 = a ^ 0x76EE2CAF64C4L;
                    string = CP_rW.CP_x();
                    if (string == null) break block2;
                    if (!CoffeeProtect.CP_J().CP_i()) break block3;
                    Bukkit.getGlobalRegionScheduler().runAtFixedRate((Plugin)CoffeeProtect.CP_J(), scheduledTask -> runnable.run(), l, l2);
                }
                if (string != null) break block4;
            }
            Bukkit.getScheduler().runTaskTimerAsynchronously((Plugin)CoffeeProtect.CP_J(), runnable, l, l2);
        }
    }

    public static void CP_L(Runnable runnable) {
        long l = a ^ 0x40E507CE59C1L;
        String string = CP_rW.CP_x();
        if (string != null) {
            if (CoffeeProtect.CP_J().CP_i()) {
                CP_Qb.CP_t(runnable);
                return;
            }
            Bukkit.getScheduler().runTask((Plugin)CoffeeProtect.CP_J(), runnable);
        }
    }

    public static void CP_t(Runnable runnable) {
        block4: {
            block3: {
                String string;
                block2: {
                    long l = a ^ 0x2AE8F9CB7D36L;
                    string = CP_rW.CP_x();
                    if (string == null) break block2;
                    if (!CoffeeProtect.CP_J().CP_i()) break block3;
                    Bukkit.getGlobalRegionScheduler().run((Plugin)CoffeeProtect.CP_J(), scheduledTask -> runnable.run());
                }
                if (string != null) break block4;
            }
            Bukkit.getScheduler().runTaskAsynchronously((Plugin)CoffeeProtect.CP_J(), runnable);
        }
    }

    public static void CP_l(Runnable runnable, long l) {
        long l2 = a ^ 0x62B66F26A19BL;
        String string = CP_rW.CP_x();
        if (string != null) {
            if (CoffeeProtect.CP_J().CP_i()) {
                CP_Qb.CP_y(runnable, l);
                return;
            }
            Bukkit.getScheduler().runTaskLater((Plugin)CoffeeProtect.CP_J(), runnable, l);
        }
    }

    public static void CP_y(Runnable runnable, long l) {
        block4: {
            block3: {
                String string;
                block2: {
                    long l2 = a ^ 0x6259318994DBL;
                    string = CP_rW.CP_x();
                    if (string == null) break block2;
                    if (!CoffeeProtect.CP_J().CP_i()) break block3;
                    Bukkit.getGlobalRegionScheduler().runDelayed((Plugin)CoffeeProtect.CP_J(), scheduledTask -> runnable.run(), l);
                }
                if (string != null) break block4;
            }
            Bukkit.getScheduler().runTaskLaterAsynchronously((Plugin)CoffeeProtect.CP_J(), runnable, l);
        }
    }

    public static void CP_t(String string) {
        CP_i = string;
    }

    public static String CP_Y() {
        return CP_i;
    }

    static {
        a = CP_s.a(2324071666454829649L, 8101275184455157005L, MethodHandles.lookup().lookupClass()).a(279203871717858L);
        if (CP_Qb.CP_Y() != null) {
            CP_Qb.CP_t("xrAwnc");
        }
    }
}
