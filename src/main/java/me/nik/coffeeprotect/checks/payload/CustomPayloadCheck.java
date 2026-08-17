package me.nik.coffeeprotect.checks.payload;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPluginMessage;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.nio.charset.StandardCharsets;

public class CustomPayloadCheck extends Check {

    public CustomPayloadCheck(@NotNull CoffeeProtect plugin) {
        super(plugin, CheckType.CUSTOM_PAYLOAD);
    }

    public void handlePluginMessage(@NotNull PacketReceiveEvent event, @NotNull Player player) {
        if (!isEnabled()) return;

        if (event.getPacketType() == PacketType.Play.Client.PLUGIN_MESSAGE) {
            WrapperPlayClientPluginMessage wrapper = new WrapperPlayClientPluginMessage(event);
            String channel = wrapper.getChannelName();
            byte[] data = wrapper.getData();

            int maxPayloadSize = plugin.getConfig().getInt("checks.custom_payload.max_payload_size", 32767);

            // Check payload buffer size
            if (data != null && data.length > maxPayloadSize) {
                flag(player, "Custom payload data exceeded limit (" + data.length + "B > " + maxPayloadSize + "B)");
                event.setCancelled(true);
                return;
            }

            // Client brand capture & validation
            if ("minecraft:brand".equalsIgnoreCase(channel) || "MC|Brand".equalsIgnoreCase(channel)) {
                if (data != null && data.length > 0) {
                    try {
                        String brand = new String(data, StandardCharsets.UTF_8).trim();
                        // Strip non-printable ASCII
                        brand = brand.replaceAll("[^a-zA-Z0-9_\\-\\.\\s]", "");
                        if (brand.length() > 64) {
                            brand = brand.substring(0, 64);
                        }
                        PlayerData pd = plugin.getPlayerDataManager().getPlayerData(player);
                        pd.setClientBrand(brand.isEmpty() ? "Vanilla" : brand);
                    } catch (Exception ignored) {}
                }
            }

            // Block channel registration floods
            if ("REGISTER".equalsIgnoreCase(channel) || "minecraft:register".equalsIgnoreCase(channel)) {
                if (data != null && data.length > 1024) {
                    flag(player, "Excessive channel registration flood (" + data.length + " bytes)");
                    event.setCancelled(true);
                }
            }
        }
    }
}
