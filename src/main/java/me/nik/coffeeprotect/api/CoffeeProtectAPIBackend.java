/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlDX
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Event
 */
package me.nik.coffeeprotect.api;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlQb;
import me.nik.coffeeprotect.IlIlWx;
import me.nik.coffeeprotect.api.CoffeeProtectAPI;
import me.nik.coffeeprotect.api.CoffeeProtectAPIProvider;
import me.nik.coffeeprotect.api.events.PlayerExploitEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlDX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;

public class CoffeeProtectAPIBackend
implements CoffeeProtectAPI {
    private final CoffeeProtect plugin;
    private static final long a = IlIls.a((long)-3880287820901094488L, (long)7721233456899950532L, MethodHandles.lookup().lookupClass()).a(119407661284545L);
    private static transient /* synthetic */ String EVtDRguIgb = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CoffeeProtectAPIBackend(CoffeeProtect coffeeProtect) {
        long l = a ^ 0x18EC847FC76EL;
        this.plugin = coffeeProtect;
        String[] stringArray = CoffeeProtectAPIProvider.IlIl_();
        if (PacketWrapper.IlIlz() == null) {
            CoffeeProtectAPIProvider.IlIlV(new String[3]);
        }
    }

    @Override
    public void flag(Player player, String string, String string2, String string3) {
        long l = a ^ 0x20E8B5BF186EL;
        String[] stringArray = CoffeeProtectAPIProvider.IlIl_();
        if (stringArray == null) {
            if (player == null) {
                return;
            }
            Bukkit.getPluginManager().callEvent((Event)new PlayerExploitEvent(player, string, string2, string3));
        }
    }

    @Override
    public void disconnect(Player player) {
        long l = a ^ 0x6AE8D70EE8CAL;
        String[] stringArray = CoffeeProtectAPIProvider.IlIl_();
        this.plugin.IlIlb().IlIlq(player, IlIlWx.LAG);
        this.plugin.IlIlb().IlIlY(player);
        String[] stringArray2 = stringArray;
        IlIlr7.IlIlb().IlIlq().IlIlR((Object)player, (PacketWrapper)new IlIlDX((Component)Component.empty()));
        IlIlQb.IlIll(() -> {
            block3: {
                Player player2;
                block4: {
                    String[] stringArray;
                    block2: {
                        long l = a ^ 0x197ACF4B0F51L;
                        stringArray = CoffeeProtectAPIProvider.IlIl_();
                        player2 = player;
                        if (stringArray != null) break block2;
                        if (player2 == null) break block3;
                        player2 = player;
                    }
                    if (stringArray != null) break block4;
                    if (!player2.isOnline()) break block3;
                    player2 = player;
                }
                player2.kickPlayer(null);
            }
        }, 1L);
        if (stringArray2 != null) {
            PacketWrapper.IlIle((int[])new int[5]);
        }
    }
}

