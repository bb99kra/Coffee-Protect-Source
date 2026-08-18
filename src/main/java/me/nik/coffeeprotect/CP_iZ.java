/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_PA;
import me.nik.coffeeprotect.CP_jR;
import me.nik.coffeeprotect.CP_x5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class CP_iZ
implements Listener,
CP_jR {
    private ExecutorService CP_U;
    private final List<UUID> CP_i = new CopyOnWriteArrayList<UUID>();
    private static final long a = CP_s.a(2408592822792662445L, -3602390034622633912L, MethodHandles.lookup().lookupClass()).a(153656178532783L);
    private static transient /* synthetic */ String cfejZzZyag = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public void CP_C() {
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)CoffeeProtect.CP_J());
        this.CP_U = Executors.newSingleThreadExecutor();
    }

    public ExecutorService CP_c() {
        return this.CP_U;
    }

    public List<UUID> CP_F() {
        return this.CP_i;
    }

    public void CP_S(UUID uUID) {
        this.CP_i.add(uUID);
    }

    public void CP_B(UUID uUID) {
        this.CP_i.remove(uUID);
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void CP_K(PlayerQuitEvent playerQuitEvent) {
        this.CP_B(playerQuitEvent.getPlayer().getUniqueId());
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void CP_q(PlayerJoinEvent playerJoinEvent) {
        block5: {
            boolean bl;
            Player player;
            block4: {
                long l = a ^ 0x66AA109B94CCL;
                player = playerJoinEvent.getPlayer();
                boolean bl2 = CP_PA.CP_f();
                bl = CP_Oq.TOGGLE_ALERTS_ON_JOIN.CP_t();
                if (!bl2) break block4;
                if (!bl) break block5;
                bl = player.hasPermission(CP_x5.ALERTS.CP_a());
            }
            if (bl) {
                this.CP_S(player.getUniqueId());
            }
        }
    }

    @Override
    public void CP_y() {
        this.CP_i.clear();
        this.CP_U.shutdown();
    }
}
