/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  com.github.retrooper.packetevents.protocol.packettype.PacketType$Play$Client
 *  com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPluginMessage
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.checks.payload;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPluginMessage;
import java.nio.charset.StandardCharsets;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CustomPayloadCheck
extends Check {
    public CustomPayloadCheck(@NotNull CoffeeProtect coffeeProtect) {
        super(coffeeProtect, CheckType.CUSTOM_PAYLOAD);
    }

    public void handlePluginMessage(@NotNull PacketReceiveEvent packetReceiveEvent, @NotNull Player player) {
        if (!this.isEnabled()) {
            return;
        }
        if (packetReceiveEvent.getPacketType() == PacketType.Play.Client.PLUGIN_MESSAGE) {
            WrapperPlayClientPluginMessage wrapperPlayClientPluginMessage = new WrapperPlayClientPluginMessage(packetReceiveEvent);
            String string = wrapperPlayClientPluginMessage.getChannelName();
            byte[] byArray = wrapperPlayClientPluginMessage.getData();
            int n = this.plugin.getConfig().getInt("checks.custom_payload.max_payload_size", Short.MAX_VALUE);
            if (byArray != null && byArray.length > n) {
                this.flag(player, "Custom payload data exceeded limit (" + byArray.length + "B > " + n + "B)");
                packetReceiveEvent.setCancelled(true);
                return;
            }
            if (("minecraft:brand".equalsIgnoreCase(string) || "MC|Brand".equalsIgnoreCase(string)) && byArray != null && byArray.length > 0) {
                try {
                    String string2 = new String(byArray, StandardCharsets.UTF_8).trim();
                    string2 = string2.replaceAll("[^a-zA-Z0-9_\\-\\.\\s]", "");
                    if (string2.length() > 64) {
                        string2 = string2.substring(0, 64);
                    }
                    PlayerData playerData = this.plugin.getPlayerDataManager().getPlayerData(player);
                    playerData.setClientBrand(string2.isEmpty() ? "Vanilla" : string2);
                }
                catch (Exception exception) {
                    // empty catch block
                }
            }
            if (("REGISTER".equalsIgnoreCase(string) || "minecraft:register".equalsIgnoreCase(string)) && byArray != null && byArray.length > 1024) {
                this.flag(player, "Excessive channel registration flood (" + byArray.length + " bytes)");
                packetReceiveEvent.setCancelled(true);
            }
        }
    }
}

