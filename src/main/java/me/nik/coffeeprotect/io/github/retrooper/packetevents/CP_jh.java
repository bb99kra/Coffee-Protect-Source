/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_C8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.UserLoginEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class CP_jh
implements Listener {
    private static transient /* synthetic */ String aJNVWeMELw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @EventHandler
    public void CP_m(PlayerJoinEvent playerJoinEvent) {
        CP_C8<?> ilIlC8 = CP_r7.CP_b();
        CP_G2 ilIlG2 = ilIlC8.CP_q().CP_V(playerJoinEvent.getPlayer());
        CP_r7.CP_b().CP_g().CP_H(new UserLoginEvent(ilIlG2, playerJoinEvent.getPlayer()));
    }
}

