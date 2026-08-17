/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlPA;
import me.nik.coffeeprotect.IlIljR;
import me.nik.coffeeprotect.IlIlx5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

public class IlIliZ
implements Listener,
IlIljR {
    private ExecutorService IlIlU;
    private final List<UUID> IlIli = new CopyOnWriteArrayList<UUID>();
    private static final long a = IlIls.a((long)2408592822792662445L, (long)-3602390034622633912L, MethodHandles.lookup().lookupClass()).a(153656178532783L);
    private static transient /* synthetic */ String cfejZzZyag = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public void IlIlC() {
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)CoffeeProtect.IlIlJ());
        this.IlIlU = Executors.newSingleThreadExecutor();
    }

    public ExecutorService IlIlc() {
        return this.IlIlU;
    }

    public List<UUID> IlIlF() {
        return this.IlIli;
    }

    public void IlIlS(UUID uUID) {
        this.IlIli.add(uUID);
    }

    public void IlIlB(UUID uUID) {
        this.IlIli.remove(uUID);
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void IlIlK(PlayerQuitEvent playerQuitEvent) {
        this.IlIlB(playerQuitEvent.getPlayer().getUniqueId());
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void IlIlq(PlayerJoinEvent playerJoinEvent) {
        block5: {
            boolean bl;
            Player player;
            block4: {
                long l = a ^ 0x66AA109B94CCL;
                player = playerJoinEvent.getPlayer();
                boolean bl2 = IlIlPA.IlIlf();
                bl = IlIlOq.TOGGLE_ALERTS_ON_JOIN.IlIlt();
                if (!bl2) break block4;
                if (!bl) break block5;
                bl = player.hasPermission(IlIlx5.ALERTS.IlIla());
            }
            if (bl) {
                this.IlIlS(player.getUniqueId());
            }
        }
    }

    @Override
    public void IlIly() {
        this.IlIli.clear();
        this.IlIlU.shutdown();
    }
}

