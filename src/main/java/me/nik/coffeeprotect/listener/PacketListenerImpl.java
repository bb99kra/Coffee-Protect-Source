/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.retrooper.packetevents.event.PacketListener
 *  com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  com.github.retrooper.packetevents.event.PacketSendEvent
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.listener;

import com.github.retrooper.packetevents.event.PacketListener;
import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.CoffeeProtect;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PacketListenerImpl
implements PacketListener {
    private final CoffeeProtect plugin;

    public PacketListenerImpl(@NotNull CoffeeProtect coffeeProtect) {
        this.plugin = coffeeProtect;
    }

    public void onPacketReceive(PacketReceiveEvent packetReceiveEvent) {
        block4: {
            Object object = packetReceiveEvent.getPlayer();
            if (!(object instanceof Player)) {
                return;
            }
            Player player = (Player)object;
            if (player.hasPermission("coffeeprotect.bypass")) {
                return;
            }
            try {
                this.plugin.getBookExploitCheck().handleEditBook(packetReceiveEvent, player);
                this.plugin.getSignExploitCheck().handleUpdateSign(packetReceiveEvent, player);
                this.plugin.getCreativeSlotCheck().handleCreativeAction(packetReceiveEvent, player);
                this.plugin.getCustomPayloadCheck().handlePluginMessage(packetReceiveEvent, player);
                this.plugin.getWindowClickCheck().handleClickWindow(packetReceiveEvent, player);
                this.plugin.getMovementPacketCheck().handleFlyingPacket(packetReceiveEvent, player);
            }
            catch (Throwable throwable) {
                if (!this.plugin.getConfig().getBoolean("settings.debug", false)) break block4;
                this.plugin.getLogger().warning("Error handling packet " + String.valueOf(packetReceiveEvent.getPacketType()) + " for " + player.getName() + ": " + throwable.getMessage());
            }
        }
    }

    public void onPacketSend(PacketSendEvent packetSendEvent) {
    }
}

