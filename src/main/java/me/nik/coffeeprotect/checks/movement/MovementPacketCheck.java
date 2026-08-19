/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  com.github.retrooper.packetevents.protocol.packettype.PacketType$Play$Client
 *  com.github.retrooper.packetevents.protocol.world.Location
 *  com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientPlayerFlying
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
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

public class MovementPacketCheck
extends Check {
    public MovementPacketCheck(@NotNull CoffeeProtect coffeeProtect) {
        super(coffeeProtect, CheckType.MOVEMENT);
    }

    public void handleFlyingPacket(@NotNull PacketReceiveEvent packetReceiveEvent, @NotNull Player player) {
        PacketType.Play.Client client;
        if (!this.isEnabled()) {
            return;
        }
        if (packetReceiveEvent.getPacketType() instanceof PacketType.Play.Client && ((client = (PacketType.Play.Client)packetReceiveEvent.getPacketType()) == PacketType.Play.Client.PLAYER_POSITION || client == PacketType.Play.Client.PLAYER_POSITION_AND_ROTATION || client == PacketType.Play.Client.PLAYER_ROTATION || client == PacketType.Play.Client.PLAYER_FLYING)) {
            WrapperPlayClientPlayerFlying wrapperPlayClientPlayerFlying = new WrapperPlayClientPlayerFlying(packetReceiveEvent);
            Location location = wrapperPlayClientPlayerFlying.getLocation();
            if (location == null) {
                return;
            }
            double d = location.getX();
            double d2 = location.getY();
            double d3 = location.getZ();
            float f = location.getYaw();
            float f2 = location.getPitch();
            if (this.plugin.getConfig().getBoolean("checks.movement.block_nan_coordinates", true) && (Double.isNaN(d) || Double.isInfinite(d) || Double.isNaN(d2) || Double.isInfinite(d2) || Double.isNaN(d3) || Double.isInfinite(d3) || Float.isNaN(f) || Float.isInfinite(f) || Float.isNaN(f2) || Float.isInfinite(f2))) {
                this.flag(player, "NaN / Infinite coordinate packet detected");
                packetReceiveEvent.setCancelled(true);
                return;
            }
            double d4 = this.plugin.getConfig().getDouble("checks.movement.max_coordinate", 3.0E7);
            if (Math.abs(d) > d4 || Math.abs(d3) > d4 || Math.abs(d2) > 4000.0) {
                this.flag(player, "Extreme coordinate teleport crash packet (" + d + ", " + d2 + ", " + d3 + ")");
                packetReceiveEvent.setCancelled(true);
                return;
            }
            if (this.plugin.getConfig().getBoolean("checks.movement.block_extreme_angles", true) && Math.abs(f2) > 90.5f) {
                this.flag(player, "Illegal pitch angle (" + f2 + " > 90.0)");
                packetReceiveEvent.setCancelled(true);
            }
        }
    }
}

