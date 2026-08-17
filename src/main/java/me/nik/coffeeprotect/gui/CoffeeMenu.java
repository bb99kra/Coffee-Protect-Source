package me.nik.coffeeprotect.gui;

import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

public class CoffeeMenu implements Listener {

    private final CoffeeProtect plugin;
    private final String menuTitle = ChatColor.translateAlternateColorCodes('&', "&8[&6☕ CoffeeProtect Admin GUI&8]");

    public CoffeeMenu(@NotNull CoffeeProtect plugin) {
        this.plugin = plugin;
    }

    public void openMenu(@NotNull Player player) {
        Inventory inv = Bukkit.createInventory(null, 27, menuTitle);

        // Infill glass panes
        ItemStack grayGlass = createItem(Material.GRAY_STAINED_GLASS_PANE, " ");
        for (int i = 0; i < 27; i++) {
            inv.setItem(i, grayGlass);
        }

        // Stats Item (Slot 4)
        ItemStack stats = createItem(
            Material.NETHER_STAR,
            "&6&lServer Protection Stats",
            "&7• Total Blocked Packets: &e" + plugin.getTotalBlockedPackets(),
            "&7• Online Players: &f" + Bukkit.getOnlinePlayers().size(),
            "&7• Server Version: &f" + Bukkit.getVersion()
        );
        inv.setItem(4, stats);

        // Check Modules toggles (Slots 10 to 16)
        CheckType[] types = CheckType.values();
        int[] slots = {10, 11, 12, 13, 14, 15, 16};
        for (int i = 0; i < Math.min(types.length, slots.length); i++) {
            CheckType type = types[i];
            boolean enabled = plugin.getConfig().getBoolean("checks." + type.name().toLowerCase() + ".enabled", true);
            Material mat = enabled ? Material.LIME_DYE : Material.GRAY_DYE;

            ItemStack checkItem = createItem(
                mat,
                (enabled ? "&a✔ " : "&c✖ ") + "&6" + type.getName() + " Check",
                "&7" + type.getDescription(),
                "",
                "&7Status: " + (enabled ? "&aENABLED" : "&cDISABLED"),
                "&eClick to toggle module!"
            );
            inv.setItem(slots[i], checkItem);
        }

        // Reload Button (Slot 22)
        ItemStack reload = createItem(Material.REPEATER, "&e&lReload Configuration", "&7Click to reload config.yml & checks");
        inv.setItem(22, reload);

        player.openInventory(inv);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent event) {
        if (!event.getView().getTitle().equals(menuTitle)) {
            return;
        }

        event.setCancelled(true);
        if (!(event.getWhoClicked() instanceof Player)) return;
        Player player = (Player) event.getWhoClicked();
        int slot = event.getRawSlot();

        CheckType[] types = CheckType.values();
        int[] slots = {10, 11, 12, 13, 14, 15, 16};

        for (int i = 0; i < Math.min(types.length, slots.length); i++) {
            if (slot == slots[i]) {
                CheckType type = types[i];
                String path = "checks." + type.name().toLowerCase() + ".enabled";
                boolean current = plugin.getConfig().getBoolean(path, true);
                plugin.getConfig().set(path, !current);
                plugin.saveConfig();
                player.sendMessage(ChatColor.translateAlternateColorCodes('&',
                    "&8[&6☕ CoffeeProtect&8] &7Module &e" + type.getName() + " &7is now " + (!current ? "&aENABLED" : "&cDISABLED")
                ));
                openMenu(player); // Refresh GUI
                return;
            }
        }

        if (slot == 22) {
            plugin.reloadConfig();
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8[&6☕ CoffeeProtect&8] &aConfiguration reloaded!"));
            openMenu(player);
        }
    }

    private ItemStack createItem(Material mat, String name, String... lore) {
        ItemStack item = new ItemStack(mat);
        ItemMeta meta = item.getItemMeta();
        if (meta != null) {
            meta.setDisplayName(ChatColor.translateAlternateColorCodes('&', name));
            if (lore.length > 0) {
                List<String> list = new ArrayList<>();
                for (String s : lore) {
                    list.add(ChatColor.translateAlternateColorCodes('&', s));
                }
                meta.setLore(list);
            }
            item.setItemMeta(meta);
        }
        return item;
    }
}
