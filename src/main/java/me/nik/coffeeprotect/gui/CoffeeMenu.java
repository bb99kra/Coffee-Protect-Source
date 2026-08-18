/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.gui;

import java.util.ArrayList;
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

public class CoffeeMenu
implements Listener {
    private final CoffeeProtect plugin;
    private final String menuTitle = ChatColor.translateAlternateColorCodes((char)'&', (String)"&8[&6\u2615 CoffeeProtect Admin GUI&8]");

    public CoffeeMenu(@NotNull CoffeeProtect coffeeProtect) {
        this.plugin = coffeeProtect;
    }

    public void openMenu(@NotNull Player player) {
        Inventory inventory = Bukkit.createInventory(null, (int)27, (String)this.menuTitle);
        ItemStack itemStack = this.createItem(Material.GRAY_STAINED_GLASS_PANE, " ", new String[0]);
        for (int i = 0; i < 27; ++i) {
            inventory.setItem(i, itemStack);
        }
        ItemStack itemStack2 = this.createItem(Material.NETHER_STAR, "&6&lServer Protection Stats", "&7\u2022 Total Blocked Packets: &e" + this.plugin.getTotalBlockedPackets(), "&7\u2022 Online Players: &f" + Bukkit.getOnlinePlayers().size(), "&7\u2022 Server Version: &f" + Bukkit.getVersion());
        inventory.setItem(4, itemStack2);
        CheckType[] checkTypeArray = CheckType.values();
        int[] nArray = new int[]{10, 11, 12, 13, 14, 15, 16};
        for (int i = 0; i < Math.min(checkTypeArray.length, nArray.length); ++i) {
            CheckType checkType = checkTypeArray[i];
            boolean bl = this.plugin.getConfig().getBoolean("checks." + checkType.name().toLowerCase() + ".enabled", true);
            Material material = bl ? Material.LIME_DYE : Material.GRAY_DYE;
            ItemStack itemStack3 = this.createItem(material, (bl ? "&a\u2714 " : "&c\u2716 ") + "&6" + checkType.getName() + " Check", "&7" + checkType.getDescription(), "", "&7Status: " + (bl ? "&aENABLED" : "&cDISABLED"), "&eClick to toggle module!");
            inventory.setItem(nArray[i], itemStack3);
        }
        ItemStack itemStack4 = this.createItem(Material.REPEATER, "&e&lReload Configuration", "&7Click to reload config.yml & checks");
        inventory.setItem(22, itemStack4);
        player.openInventory(inventory);
    }

    @EventHandler
    public void onInventoryClick(InventoryClickEvent inventoryClickEvent) {
        if (!inventoryClickEvent.getView().getTitle().equals(this.menuTitle)) {
            return;
        }
        inventoryClickEvent.setCancelled(true);
        if (!(inventoryClickEvent.getWhoClicked() instanceof Player)) {
            return;
        }
        Player player = (Player)inventoryClickEvent.getWhoClicked();
        int n = inventoryClickEvent.getRawSlot();
        CheckType[] checkTypeArray = CheckType.values();
        int[] nArray = new int[]{10, 11, 12, 13, 14, 15, 16};
        for (int i = 0; i < Math.min(checkTypeArray.length, nArray.length); ++i) {
            if (n != nArray[i]) continue;
            CheckType checkType = checkTypeArray[i];
            String string = "checks." + checkType.name().toLowerCase() + ".enabled";
            boolean bl = this.plugin.getConfig().getBoolean(string, true);
            this.plugin.getConfig().set(string, (Object)(!bl ? 1 : 0));
            this.plugin.saveConfig();
            player.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)("&8[&6\u2615 CoffeeProtect&8] &7Module &e" + checkType.getName() + " &7is now " + (!bl ? "&aENABLED" : "&cDISABLED"))));
            this.openMenu(player);
            return;
        }
        if (n == 22) {
            this.plugin.reloadConfig();
            player.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8[&6\u2615 CoffeeProtect&8] &aConfiguration reloaded!"));
            this.openMenu(player);
        }
    }

    private ItemStack createItem(Material material, String string, String ... stringArray) {
        ItemStack itemStack = new ItemStack(material);
        ItemMeta itemMeta = itemStack.getItemMeta();
        if (itemMeta != null) {
            itemMeta.setDisplayName(ChatColor.translateAlternateColorCodes((char)'&', (String)string));
            if (stringArray.length > 0) {
                ArrayList<String> arrayList = new ArrayList<String>();
                for (String string2 : stringArray) {
                    arrayList.add(ChatColor.translateAlternateColorCodes((char)'&', (String)string2));
                }
                itemMeta.setLore(arrayList);
            }
            itemStack.setItemMeta(itemMeta);
        }
        return itemStack;
    }
}

