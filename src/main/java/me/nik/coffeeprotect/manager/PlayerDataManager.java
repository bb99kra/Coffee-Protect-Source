package me.nik.coffeeprotect.manager;

import me.nik.coffeeprotect.CoffeeProtect;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

public class PlayerDataManager implements Listener {

    private final CoffeeProtect plugin;
    private final Map<UUID, PlayerData> playerDataMap = new ConcurrentHashMap<>();

    public PlayerDataManager(@NotNull CoffeeProtect plugin) {
        this.plugin = plugin;
    }

    @NotNull
    public PlayerData getPlayerData(@NotNull Player player) {
        return playerDataMap.computeIfAbsent(player.getUniqueId(), k -> new PlayerData(player));
    }

    public PlayerData getPlayerData(@NotNull UUID uuid) {
        return playerDataMap.get(uuid);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    public void onJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        PlayerData data = getPlayerData(player);
        if (player.hasPermission("coffeeprotect.alerts")) {
            data.setAlertsEnabled(true);
        }
    }

    @EventHandler(priority = EventPriority.MONITOR)
    public void onQuit(PlayerQuitEvent event) {
        playerDataMap.remove(event.getPlayer().getUniqueId());
    }

    public void resetAllViolations() {
        for (PlayerData data : playerDataMap.values()) {
            data.resetViolations();
        }
    }

    public void clear() {
        playerDataMap.clear();
    }
}
