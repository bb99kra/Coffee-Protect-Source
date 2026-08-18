/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.RegionScheduler
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 *  org.bukkit.World
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitScheduler
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.papermc.paper.threadedregions.scheduler.RegionScheduler;
import java.lang.invoke.MethodHandles;
import java.util.function.Consumer;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Q2;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_fO;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;

public class CP_xJ {
    private BukkitScheduler CP_q;
    private RegionScheduler CP_V;
    private static final long a = CP_s.a(1361030964766101209L, -6161754699843797415L, MethodHandles.lookup().lookupClass()).a(80679620360839L);
    private static transient /* synthetic */ String YZtpauTndb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    protected CP_xJ() {
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    long l = a ^ 0x36B004A7D99CL;
                    String[] stringArray2 = CP_Q2.CP_Q();
                    stringArray = stringArray2;
                    if (stringArray != null) break block2;
                    if (!CP_Q2.CP_K) break block3;
                    this.CP_V = Bukkit.getRegionScheduler();
                }
                if (stringArray == null) break block4;
            }
            this.CP_q = Bukkit.getScheduler();
        }
    }

    public void CP_F(@NotNull Plugin plugin, @NotNull World world, int n, int n2, @NotNull Runnable runnable) {
        long l = a ^ 0x14584BA67BC0L;
        String[] stringArray = CP_Q2.CP_Q();
        if (stringArray == null) {
            if (!CP_Q2.CP_K) {
                this.CP_q.runTask(plugin, runnable);
                return;
            }
            this.CP_V.execute(plugin, world, n, n2, runnable);
        }
    }

    public void CP_t(@NotNull Plugin plugin, @NotNull Location location, @NotNull Runnable runnable) {
        long l = a ^ 0x26DD1F285AC3L;
        String[] stringArray = CP_Q2.CP_Q();
        if (stringArray == null) {
            if (!CP_Q2.CP_K) {
                Bukkit.getScheduler().runTask(plugin, runnable);
                return;
            }
            this.CP_V.execute(plugin, location, runnable);
        }
    }

    public CP_fO CP_l(@NotNull Plugin plugin, @NotNull World world, int n, int n2, @NotNull Consumer<Object> consumer) {
        long l = a ^ 0x1B28C2C41FEFL;
        if (!CP_Q2.CP_K) {
            return new CP_fO(Bukkit.getScheduler().runTask(plugin, () -> consumer.accept(null)));
        }
        return new CP_fO(this.CP_V.run(plugin, world, n, n2, scheduledTask -> consumer.accept(null)));
    }

    public CP_fO CP_Y(@NotNull Plugin plugin, @NotNull Location location, @NotNull Consumer<Object> consumer) {
        long l = a ^ 0x668A42971893L;
        if (!CP_Q2.CP_K) {
            return new CP_fO(Bukkit.getScheduler().runTask(plugin, () -> consumer.accept(null)));
        }
        return new CP_fO(this.CP_V.run(plugin, location, scheduledTask -> consumer.accept(null)));
    }

    public CP_fO CP_l(@NotNull Plugin plugin, @NotNull World world, int n, int n2, @NotNull Consumer<Object> consumer, long l) {
        long l2 = a ^ 0x553F454E6C2DL;
        String[] stringArray = CP_Q2.CP_Q();
        long l3 = l - 1L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (stringArray == null) {
            if (l4 < 0) {
                l = 1L;
            }
            l4 = (long)CP_Q2.CP_K;
        }
        if (l4 == false) {
            return new CP_fO(Bukkit.getScheduler().runTaskLater(plugin, () -> consumer.accept(null), l));
        }
        return new CP_fO(this.CP_V.runDelayed(plugin, world, n, n2, scheduledTask -> consumer.accept(null), l));
    }

    public CP_fO CP_F(@NotNull Plugin plugin, @NotNull Location location, @NotNull Consumer<Object> consumer, long l) {
        long l2 = a ^ 0x4D01CAD0E6FDL;
        String[] stringArray = CP_Q2.CP_Q();
        long l3 = l - 1L;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (stringArray == null) {
            if (l4 < 0) {
                l = 1L;
            }
            l4 = (long)CP_Q2.CP_K;
        }
        if (l4 == false) {
            return new CP_fO(Bukkit.getScheduler().runTaskLater(plugin, () -> consumer.accept(null), l));
        }
        return new CP_fO(this.CP_V.runDelayed(plugin, location, scheduledTask -> consumer.accept(null), l));
    }

    public CP_fO CP_X(@NotNull Plugin plugin, @NotNull World world, int n, int n2, @NotNull Consumer<Object> consumer, long l, long l2) {
        long l3 = a ^ 0x6D1F3B0D1FBL;
        String[] stringArray = CP_Q2.CP_Q();
        long l4 = l - 1L;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (stringArray == null) {
            long l6;
            if (l5 < 0) {
                l = 1L;
            }
            l5 = (l6 = l2 - 1L) == 0L ? 0 : (l6 < 0L ? -1 : 1);
        }
        if (stringArray == null) {
            if (l5 < 0) {
                l2 = 1L;
            }
            l5 = (long)CP_Q2.CP_K;
        }
        if (l5 == false) {
            return new CP_fO(Bukkit.getScheduler().runTaskTimer(plugin, () -> consumer.accept(null), l, l2));
        }
        return new CP_fO(this.CP_V.runAtFixedRate(plugin, world, n, n2, scheduledTask -> consumer.accept(null), l, l2));
    }

    public CP_fO CP_f(@NotNull Plugin plugin, @NotNull Location location, @NotNull Consumer<Object> consumer, long l, long l2) {
        long l3 = a ^ 0x198EF42A29BAL;
        String[] stringArray = CP_Q2.CP_Q();
        long l4 = l - 1L;
        long l5 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (stringArray == null) {
            long l6;
            if (l5 < 0) {
                l = 1L;
            }
            l5 = (l6 = l2 - 1L) == 0L ? 0 : (l6 < 0L ? -1 : 1);
        }
        if (stringArray == null) {
            if (l5 < 0) {
                l2 = 1L;
            }
            l5 = (long)CP_Q2.CP_K;
        }
        if (l5 == false) {
            return new CP_fO(Bukkit.getScheduler().runTaskTimer(plugin, () -> consumer.accept(null), l, l2));
        }
        return new CP_fO(this.CP_V.runAtFixedRate(plugin, location, scheduledTask -> consumer.accept(null), l, l2));
    }
}

