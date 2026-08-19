/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.manager;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

public class PlayerDataManager
implements Listener {
    private final CoffeeProtect plugin;
    private final Map<UUID, PlayerData> playerDataMap = new ConcurrentHashMap<UUID, PlayerData>();

    public PlayerDataManager(@NotNull CoffeeProtect coffeeProtect) {
        this.plugin = coffeeProtect;
    }

    @NotNull
    public PlayerData getPlayerData(@NotNull Player player) {
        return this.playerDataMap.computeIfAbsent(player.getUniqueId(), uUID -> new PlayerData(player));
    }

    public PlayerData getPlayerData(@NotNull UUID uUID) {
        return this.playerDataMap.get(uUID);
    }

    @EventHandler(priority=EventPriority.LOWEST)
    public void onJoin(PlayerJoinEvent playerJoinEvent) {
        Player player = playerJoinEvent.getPlayer();
        PlayerData playerData = this.getPlayerData(player);
        if (player.hasPermission("coffeeprotect.alerts")) {
            playerData.setAlertsEnabled(true);
        }
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void onQuit(PlayerQuitEvent playerQuitEvent) {
        this.playerDataMap.remove(playerQuitEvent.getPlayer().getUniqueId());
    }

    public void resetAllViolations() {
        for (PlayerData playerData : this.playerDataMap.values()) {
            playerData.resetViolations();
        }
    }

    public void clear() {
        this.playerDataMap.clear();
    }
}

