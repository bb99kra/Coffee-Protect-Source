/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Material
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.Listener
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.inventory.InventoryHolder
 *  org.bukkit.inventory.ItemStack
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.AbstractMenu;
import me.nik.coffeeprotect.CP_vF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;

public class CP_Q6
implements Listener {
    private static final long a = CP_s.a(3705472806037921676L, -1547140735365798980L, MethodHandles.lookup().lookupClass()).a(30815102706032L);
    private static transient /* synthetic */ String QyeeyFLICL = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @EventHandler
    public void CP_f(InventoryClickEvent inventoryClickEvent) {
        InventoryClickEvent inventoryClickEvent2;
        InventoryHolder inventoryHolder;
        block6: {
            block7: {
                block5: {
                    ItemStack itemStack;
                    block4: {
                        long l = a ^ 0x4F273917CE5BL;
                        inventoryHolder = inventoryClickEvent.getInventory().getHolder();
                        String[] stringArray = CP_vF.CP_o();
                        if (!(inventoryHolder instanceof AbstractMenu)) {
                            return;
                        }
                        itemStack = inventoryClickEvent.getCurrentItem();
                        if (stringArray == null) break block4;
                        if (itemStack == null) break block5;
                        inventoryClickEvent2 = inventoryClickEvent;
                        if (stringArray == null) break block6;
                        itemStack = inventoryClickEvent2.getCurrentItem();
                    }
                    if (itemStack.getType() != Material.AIR) break block7;
                }
                return;
            }
            inventoryClickEvent2 = inventoryClickEvent;
        }
        inventoryClickEvent2.setCancelled(true);
        AbstractMenu ilIlOX = (AbstractMenu)inventoryHolder;
        ilIlOX.CP_a(inventoryClickEvent);
    }
}
