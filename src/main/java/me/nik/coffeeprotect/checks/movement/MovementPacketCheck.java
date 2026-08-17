package me.nik.coffeeprotect.checks.movement;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.protocol.world.Location;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class MovementPacketCheck extends Check {

    public MovementPacketCheck(@NotNull CoffeeProtect plugin) {
        super(plugin, CheckType.MOVEMENT);
    }

    public void handleFlyingPacket(@NotNull PacketReceiveEvent event, @NotNull Player player) {
        if (!isEnabled()) return;

        if (event.getPacketType() instanceof PacketType.Play.Client) {
            PacketType.Play.Client type = (PacketType.Play.Client) event.getPacketType();
            if (type == PacketType.Play.Client.PLAYER_POSITION ||
                type == PacketType.Play.Client.PLAYER_POSITION_AND_ROTATION ||
                type == PacketType.Play.Client.PLAYER_ROTATION ||
                type == PacketType.Play.Client.PLAYER_FLYING) {

                WrapperPlayClientPlayerFlying wrapper = new WrapperPlayClientPlayerFlying(event);
                Location loc = wrapper.getLocation();
                if (loc == null) return;

                double x = loc.getX();
                double y = loc.getY();
                double z = loc.getZ();
                float yaw = loc.getYaw();
                float pitch = loc.getPitch();

                // Check for NaN or Infinity
                if (plugin.getConfig().getBoolean("checks.movement.block_nan_coordinates", true)) {
                    if (Double.isNaN(x) || Double.isInfinite(x) ||
                        Double.isNaN(y) || Double.isInfinite(y) ||
                        Double.isNaN(z) || Double.isInfinite(z) ||
                        Float.isNaN(yaw) || Float.isInfinite(yaw) ||
                        Float.isNaN(pitch) || Float.isInfinite(pitch)) {

                        flag(player, "NaN / Infinite coordinate packet detected");
                        event.setCancelled(true);
                        return;
                    }
                }

                // Check extreme coordinate bounds (> 30 million)
                double maxCoord = plugin.getConfig().getDouble("checks.movement.max_coordinate", 30000000.0);
                if (Math.abs(x) > maxCoord || Math.abs(z) > maxCoord || Math.abs(y) > 4000.0) {
                    flag(player, "Extreme coordinate teleport crash packet (" + x + ", " + y + ", " + z + ")");
                    event.setCancelled(true);
                    return;
                }

                // Check extreme pitch bounds
                if (plugin.getConfig().getBoolean("checks.movement.block_extreme_angles", true)) {
                    if (Math.abs(pitch) > 90.5f) {
                        flag(player, "Illegal pitch angle (" + pitch + " > 90.0)");
                        event.setCancelled(true);
                    }
                }
            }
        }
    }
}
