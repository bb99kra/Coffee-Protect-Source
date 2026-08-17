package me.nik.coffeeprotect.manager;

import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class PlayerData {

    private final UUID uuid;
    private final String username;
    private String clientBrand = "Vanilla";
    private boolean alertsEnabled = false;

    private final Map<CheckType, AtomicInteger> violations = new EnumMap<>(CheckType.class);
    private final AtomicLong blockedPackets = new AtomicLong(0);
    private final AtomicInteger windowClicksPerSecond = new AtomicInteger(0);
    private long lastClickSecond = 0;
    private long lastAlertTimestamp = 0;

    public PlayerData(@NotNull Player player) {
        this.uuid = player.getUniqueId();
        this.username = player.getName();
        for (CheckType type : CheckType.values()) {
            violations.put(type, new AtomicInteger(0));
        }
    }

    public UUID getUuid() {
        return uuid;
    }

    public String getUsername() {
        return username;
    }

    public String getClientBrand() {
        return clientBrand;
    }

    public void setClientBrand(String clientBrand) {
        this.clientBrand = clientBrand;
    }

    public boolean hasAlertsEnabled() {
        return alertsEnabled;
    }

    public void setAlertsEnabled(boolean alertsEnabled) {
        this.alertsEnabled = alertsEnabled;
    }

    public int incrementViolation(@NotNull CheckType type) {
        return violations.get(type).incrementAndGet();
    }

    public int getViolation(@NotNull CheckType type) {
        return violations.get(type).get();
    }

    public int getTotalViolations() {
        int total = 0;
        for (AtomicInteger vl : violations.values()) {
            total += vl.get();
        }
        return total;
    }

    public void resetViolations() {
        for (AtomicInteger vl : violations.values()) {
            vl.set(0);
        }
    }

    public long incrementBlockedPackets() {
        return blockedPackets.incrementAndGet();
    }

    public long getBlockedPackets() {
        return blockedPackets.get();
    }

    public int incrementWindowClicks() {
        long currentSec = System.currentTimeMillis() / 1000;
        if (currentSec != lastClickSecond) {
            lastClickSecond = currentSec;
            windowClicksPerSecond.set(1);
            return 1;
        }
        return windowClicksPerSecond.incrementAndGet();
    }

    public boolean canSendAlert(int cooldownSeconds) {
        long now = System.currentTimeMillis();
        if (now - lastAlertTimestamp >= cooldownSeconds * 1000L) {
            lastAlertTimestamp = now;
            return true;
        }
        return false;
    }
}
