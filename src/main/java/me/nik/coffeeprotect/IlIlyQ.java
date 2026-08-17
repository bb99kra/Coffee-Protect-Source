/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.HandlerList
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIljR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class IlIlyQ
implements IlIljR,
Listener {
    private final Map<UUID, IlIlTM> IlIlc = new ConcurrentHashMap<UUID, IlIlTM>();
    private static PacketWrapper[] IlIlV;
    private static final long a;
    private static transient /* synthetic */ String rElsNEvpSX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlTM IlIlR(Player player) {
        return this.IlIlc.computeIfAbsent(player.getUniqueId(), uUID -> new IlIlTM(player));
    }

    public Map<UUID, IlIlTM> IlIlO() {
        return this.IlIlc;
    }

    @Override
    public void IlIlC() {
        long l = a ^ 0x61E75B6041DEL;
        String string = IlIlTM.IlIlY();
        Bukkit.getOnlinePlayers().stream().filter(Objects::nonNull).forEach(this::IlIlR);
        String string2 = string;
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)CoffeeProtect.IlIlJ());
        if (PacketWrapper.IlIlz() == null) {
            IlIlTM.IlIlk("jWYUF");
        }
    }

    @Override
    public void IlIly() {
        this.IlIlc.clear();
        HandlerList.unregisterAll((Listener)this);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void IlIls(PlayerJoinEvent playerJoinEvent) {
        this.IlIlR(playerJoinEvent.getPlayer()).IlIlT();
    }

    public static void IlIly(PacketWrapper[] packetWrapperArray) {
        IlIlV = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlB() {
        return IlIlV;
    }

    static {
        a = IlIls.a((long)1486691190213539721L, (long)4572410040935138760L, MethodHandles.lookup().lookupClass()).a(257539488005328L);
        if (IlIlyQ.IlIlB() == null) {
            IlIlyQ.IlIly(new PacketWrapper[1]);
        }
    }
}

