package me.nik.coffeeprotect.checks;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.api.events.PlayerExploitEvent;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public abstract class Check {

    protected final CoffeeProtect plugin;
    protected final CheckType checkType;

    public Check(@NotNull CoffeeProtect plugin, @NotNull CheckType checkType) {
        this.plugin = plugin;
        this.checkType = checkType;
    }

    @NotNull
    public CheckType getCheckType() {
        return checkType;
    }

    public boolean isEnabled() {
        String path = "checks." + checkType.name().toLowerCase() + ".enabled";
        return plugin.getConfig().getBoolean(path, true);
    }

    /**
     * Flag a player for violating this check.
     * Fires PlayerExploitEvent, adds violation level, notifies staff, and executes punish actions.
     */
    public boolean flag(@NotNull Player player, @NotNull String details) {
        PlayerData data = plugin.getPlayerDataManager().getPlayerData(player);
        int currentVl = data.incrementViolation(checkType);

        // Fire Bukkit Event
        PlayerExploitEvent event = new PlayerExploitEvent(player, checkType, details, currentVl);
        Bukkit.getPluginManager().callEvent(event);

        if (event.isCancelled()) {
            return false;
        }

        // Increment blocked packets counter
        plugin.incrementBlockedPackets();
        data.incrementBlockedPackets();

        // Send alerts to online staff
        plugin.getAlertManager().sendAlert(player, checkType.getName(), currentVl, details);

        // Dispatch Discord Webhook
        plugin.getDiscordWebhookManager().sendAlert(player, checkType.getName(), currentVl, details);

        // Check punishment trigger
        plugin.getPunishManager().handlePunishment(player, checkType, currentVl);

        return true;
    }
}
