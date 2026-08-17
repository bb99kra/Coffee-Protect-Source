package me.nik.coffeeprotect.checks.redstone;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.Chunk;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockRedstoneEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class RedstoneLagListener extends Check implements Listener {

    private final Map<Long, AtomicInteger> chunkUpdates = new ConcurrentHashMap<>();
    private final Map<Long, Long> pausedChunks = new ConcurrentHashMap<>();
    private long currentTick = 0;

    public RedstoneLagListener(@NotNull CoffeeProtect plugin) {
        super(plugin, CheckType.REDSTONE);
    }

    @EventHandler(priority = EventPriority.HIGHEST, ignoreCancelled = true)
    public void onRedstone(BlockRedstoneEvent event) {
        if (!isEnabled()) return;

        Block block = event.getBlock();
        Chunk chunk = block.getChunk();
        long chunkKey = (((long) chunk.getX()) << 32) | (chunk.getZ() & 0xFFFFFFFFL);

        long now = System.currentTimeMillis();
        Long pausedUntil = pausedChunks.get(chunkKey);
        if (pausedUntil != null) {
            if (now < pausedUntil) {
                event.setNewCurrent(0); // Pause redstone signal
                return;
            } else {
                pausedChunks.remove(chunkKey);
            }
        }

        int maxUpdates = plugin.getConfig().getInt("checks.redstone.max_updates_per_chunk_per_tick", 250);
        AtomicInteger counter = chunkUpdates.computeIfAbsent(chunkKey, k -> new AtomicInteger(0));
        int updates = counter.incrementAndGet();

        if (updates > maxUpdates) {
            event.setNewCurrent(0);
            int pauseSeconds = plugin.getConfig().getInt("checks.redstone.pause_clock_duration_seconds", 30);
            pausedChunks.put(chunkKey, now + (pauseSeconds * 1000L));

            if (plugin.getConfig().getBoolean("checks.redstone.notify_staff", true)) {
                plugin.getAlertManager().broadcastStaff(
                    "&8[&6☕ CoffeeProtect&8] &cRunaway Redstone Clock detected &7at &e" +
                    block.getWorld().getName() + " [" + block.getX() + ", " + block.getY() + ", " + block.getZ() + "] " +
                    "&7(" + updates + " updates/tick). &cPaused for " + pauseSeconds + "s."
                );
            }
        }
    }

    public void tickReset() {
        chunkUpdates.clear();
    }
}
