/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import me.nik.coffeeprotect.UserData;
import me.nik.coffeeprotect.CP_jR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;

public class CP_yQ
implements CP_jR,
Listener {
    private final Map<UUID, UserData> CP_c = new ConcurrentHashMap<UUID, UserData>();
    private static PacketWrapper[] CP_V;
    private static final long a;
    private static transient /* synthetic */ String rElsNEvpSX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public UserData CP_R(Player player) {
        return this.CP_c.computeIfAbsent(player.getUniqueId(), uUID -> new UserData(player));
    }

    public Map<UUID, UserData> CP_O() {
        return this.CP_c;
    }

    @Override
    public void CP_C() {
        long l = a ^ 0x61E75B6041DEL;
        String string = UserData.CP_Y();
        Bukkit.getOnlinePlayers().stream().filter(Objects::nonNull).forEach(this::CP_R);
        String string2 = string;
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)CoffeeProtect.CP_J());
        if (PacketWrapper.CP_z() == null) {
            UserData.CP_k("jWYUF");
        }
    }

    @Override
    public void CP_y() {
        this.CP_c.clear();
        HandlerList.unregisterAll((Listener)this);
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void CP_s(PlayerJoinEvent playerJoinEvent) {
        this.CP_R(playerJoinEvent.getPlayer()).CP_T();
    }

    public static void CP_y(PacketWrapper[] packetWrapperArray) {
        CP_V = packetWrapperArray;
    }

    public static PacketWrapper[] CP_B() {
        return CP_V;
    }

    static {
        a = CP_s.a(1486691190213539721L, 4572410040935138760L, MethodHandles.lookup().lookupClass()).a(257539488005328L);
        if (CP_yQ.CP_B() == null) {
            CP_yQ.CP_y(new PacketWrapper[1]);
        }
    }
}
