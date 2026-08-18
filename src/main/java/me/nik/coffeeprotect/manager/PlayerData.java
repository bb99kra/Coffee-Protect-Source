/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.manager;

import java.util.EnumMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class PlayerData {
    private final UUID uuid;
    private final String username;
    private String clientBrand = "Vanilla";
    private boolean alertsEnabled = false;
    private final Map<CheckType, AtomicInteger> violations = new EnumMap<CheckType, AtomicInteger>(CheckType.class);
    private final AtomicLong blockedPackets = new AtomicLong(0L);
    private final AtomicInteger windowClicksPerSecond = new AtomicInteger(0);
    private long lastClickSecond = 0L;
    private long lastAlertTimestamp = 0L;

    public PlayerData(@NotNull Player player) {
        this.uuid = player.getUniqueId();
        this.username = player.getName();
        for (CheckType checkType : CheckType.values()) {
            this.violations.put(checkType, new AtomicInteger(0));
        }
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public String getUsername() {
        return this.username;
    }

    public String getClientBrand() {
        return this.clientBrand;
    }

    public void setClientBrand(String string) {
        this.clientBrand = string;
    }

    public boolean hasAlertsEnabled() {
        return this.alertsEnabled;
    }

    public void setAlertsEnabled(boolean bl) {
        this.alertsEnabled = bl;
    }

    public int incrementViolation(@NotNull CheckType checkType) {
        return this.violations.get((Object)checkType).incrementAndGet();
    }

    public int getViolation(@NotNull CheckType checkType) {
        return this.violations.get((Object)checkType).get();
    }

    public int getTotalViolations() {
        int n = 0;
        for (AtomicInteger atomicInteger : this.violations.values()) {
            n += atomicInteger.get();
        }
        return n;
    }

    public void resetViolations() {
        for (AtomicInteger atomicInteger : this.violations.values()) {
            atomicInteger.set(0);
        }
    }

    public long incrementBlockedPackets() {
        return this.blockedPackets.incrementAndGet();
    }

    public long getBlockedPackets() {
        return this.blockedPackets.get();
    }

    public int incrementWindowClicks() {
        long l = System.currentTimeMillis() / 1000L;
        if (l != this.lastClickSecond) {
            this.lastClickSecond = l;
            this.windowClicksPerSecond.set(1);
            return 1;
        }
        return this.windowClicksPerSecond.incrementAndGet();
    }

    public boolean canSendAlert(int n) {
        long l = System.currentTimeMillis();
        if (l - this.lastAlertTimestamp >= (long)n * 1000L) {
            this.lastAlertTimestamp = l;
            return true;
        }
        return false;
    }
}

