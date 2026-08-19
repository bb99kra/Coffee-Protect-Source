/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Chunk
 *  org.bukkit.block.Block
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.BlockRedstoneEvent
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.checks.redstone;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.Chunk;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.jetbrains.annotations.NotNull;

public class RedstoneLagListener
extends Check
implements Listener {
    private final Map<Long, AtomicInteger> chunkUpdates = new ConcurrentHashMap<Long, AtomicInteger>();
    private final Map<Long, Long> pausedChunks = new ConcurrentHashMap<Long, Long>();
    private long currentTick = 0L;

    public RedstoneLagListener(@NotNull CoffeeProtect coffeeProtect) {
        super(coffeeProtect, CheckType.REDSTONE);
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void onRedstone(BlockRedstoneEvent blockRedstoneEvent) {
        if (!this.isEnabled()) {
            return;
        }
        Block block = blockRedstoneEvent.getBlock();
        Chunk chunk = block.getChunk();
        long l2 = (long)chunk.getX() << 32 | (long)chunk.getZ() & 0xFFFFFFFFL;
        long l3 = System.currentTimeMillis();
        Long l4 = this.pausedChunks.get(l2);
        if (l4 != null) {
            if (l3 < l4) {
                blockRedstoneEvent.setNewCurrent(0);
                return;
            }
            this.pausedChunks.remove(l2);
        }
        int n = this.plugin.getConfig().getInt("checks.redstone.max_updates_per_chunk_per_tick", 250);
        AtomicInteger atomicInteger = this.chunkUpdates.computeIfAbsent(l2, l -> new AtomicInteger(0));
        int n2 = atomicInteger.incrementAndGet();
        if (n2 > n) {
            blockRedstoneEvent.setNewCurrent(0);
            int n3 = this.plugin.getConfig().getInt("checks.redstone.pause_clock_duration_seconds", 30);
            this.pausedChunks.put(l2, l3 + (long)n3 * 1000L);
            if (this.plugin.getConfig().getBoolean("checks.redstone.notify_staff", true)) {
                this.plugin.getAlertManager().broadcastStaff("&8[&6\u2615 CoffeeProtect&8] &cRunaway Redstone Clock detected &7at &e" + block.getWorld().getName() + " [" + block.getX() + ", " + block.getY() + ", " + block.getZ() + "] &7(" + n2 + " updates/tick). &cPaused for " + n3 + "s.");
            }
        }
    }

    public void tickReset() {
        this.chunkUpdates.clear();
    }
}

