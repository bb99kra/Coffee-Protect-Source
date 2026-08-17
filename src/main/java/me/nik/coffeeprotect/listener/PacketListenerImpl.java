package me.nik.coffeeprotect.listener;

import com.github.retrooper.packetevents.event.PacketListener;
import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.CoffeeProtect;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PacketListenerImpl implements PacketListener {

    private final CoffeeProtect plugin;

    public PacketListenerImpl(@NotNull CoffeeProtect plugin) {
        this.plugin = plugin;
    }

    @Override
    public void onPacketReceive(PacketReceiveEvent event) {
        Object playerObj = event.getPlayer();
        if (!(playerObj instanceof Player)) {
            return;
        }
        Player player = (Player) playerObj;

        // Bypass for OPs / bypass permission if configured
        if (player.hasPermission("coffeeprotect.bypass")) {
            return;
        }

        try {
            plugin.getBookExploitCheck().handleEditBook(event, player);
            plugin.getSignExploitCheck().handleUpdateSign(event, player);
            plugin.getCreativeSlotCheck().handleCreativeAction(event, player);
            plugin.getCustomPayloadCheck().handlePluginMessage(event, player);
            plugin.getWindowClickCheck().handleClickWindow(event, player);
            plugin.getMovementPacketCheck().handleFlyingPacket(event, player);
        } catch (Throwable t) {
            if (plugin.getConfig().getBoolean("settings.debug", false)) {
                plugin.getLogger().warning("Error handling packet " + event.getPacketType() + " for " + player.getName() + ": " + t.getMessage());
            }
        }
    }

    @Override
    public void onPacketSend(PacketSendEvent event) {
    }
}
