/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  com.github.retrooper.packetevents.protocol.packettype.PacketType$Play$Client
 *  com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClickWindow
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.checks.inventory;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClickWindow;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WindowClickCheck
extends Check {
    public WindowClickCheck(@NotNull CoffeeProtect coffeeProtect) {
        super(coffeeProtect, CheckType.WINDOW_CLICK);
    }

    public void handleClickWindow(@NotNull PacketReceiveEvent packetReceiveEvent, @NotNull Player player) {
        if (!this.isEnabled()) {
            return;
        }
        if (packetReceiveEvent.getPacketType() == PacketType.Play.Client.CLICK_WINDOW) {
            int n;
            WrapperPlayClientClickWindow wrapperPlayClientClickWindow = new WrapperPlayClientClickWindow(packetReceiveEvent);
            int n2 = wrapperPlayClientClickWindow.getSlot();
            if (this.plugin.getConfig().getBoolean("checks.window_click.block_impossible_slots", true) && (n2 < -999 || n2 > 1000)) {
                this.flag(player, "Impossible inventory slot clicked (" + n2 + ")");
                packetReceiveEvent.setCancelled(true);
                return;
            }
            PlayerData playerData = this.plugin.getPlayerDataManager().getPlayerData(player);
            int n3 = playerData.incrementWindowClicks();
            if (n3 > (n = this.plugin.getConfig().getInt("checks.window_click.max_clicks_per_second", 30))) {
                this.flag(player, "Window click flood (" + n3 + " clicks/s > " + n + " clicks/s)");
                packetReceiveEvent.setCancelled(true);
            }
        }
    }
}

