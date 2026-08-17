package me.nik.coffeeprotect.checks.inventory;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientClickWindow;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class WindowClickCheck extends Check {

    public WindowClickCheck(@NotNull CoffeeProtect plugin) {
        super(plugin, CheckType.WINDOW_CLICK);
    }

    public void handleClickWindow(@NotNull PacketReceiveEvent event, @NotNull Player player) {
        if (!isEnabled()) return;

        if (event.getPacketType() == PacketType.Play.Client.CLICK_WINDOW) {
            WrapperPlayClientClickWindow wrapper = new WrapperPlayClientClickWindow(event);
            int slot = wrapper.getSlot();

            // Block impossible / out of bounds slots
            if (plugin.getConfig().getBoolean("checks.window_click.block_impossible_slots", true)) {
                if (slot < -999 || slot > 1000) {
                    flag(player, "Impossible inventory slot clicked (" + slot + ")");
                    event.setCancelled(true);
                    return;
                }
            }

            // Click rate limiting
            PlayerData pd = plugin.getPlayerDataManager().getPlayerData(player);
            int clicks = pd.incrementWindowClicks();
            int maxClicks = plugin.getConfig().getInt("checks.window_click.max_clicks_per_second", 30);

            if (clicks > maxClicks) {
                flag(player, "Window click flood (" + clicks + " clicks/s > " + maxClicks + " clicks/s)");
                event.setCancelled(true);
            }
        }
    }
}
