/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  com.github.retrooper.packetevents.protocol.item.ItemStack
 *  com.github.retrooper.packetevents.protocol.nbt.NBTCompound
 *  com.github.retrooper.packetevents.protocol.packettype.PacketType$Play$Client
 *  com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCreativeInventoryAction
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect.checks.item;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.item.ItemStack;
import com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCreativeInventoryAction;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CreativeSlotCheck
extends Check {
    public CreativeSlotCheck(@NotNull CoffeeProtect coffeeProtect) {
        super(coffeeProtect, CheckType.CREATIVE_SLOT);
    }

    public void handleCreativeAction(@NotNull PacketReceiveEvent packetReceiveEvent, @NotNull Player player) {
        if (!this.isEnabled()) {
            return;
        }
        if (packetReceiveEvent.getPacketType() == PacketType.Play.Client.CREATIVE_INVENTORY_ACTION) {
            String string;
            NBTCompound nBTCompound;
            NBTCompound nBTCompound2;
            WrapperPlayClientCreativeInventoryAction wrapperPlayClientCreativeInventoryAction = new WrapperPlayClientCreativeInventoryAction(packetReceiveEvent);
            ItemStack itemStack = wrapperPlayClientCreativeInventoryAction.getItemStack();
            if (itemStack == null || itemStack.isEmpty()) {
                return;
            }
            NBTCompound nBTCompound3 = itemStack.getNBT();
            if (nBTCompound3 == null) {
                return;
            }
            int n = this.plugin.getConfig().getInt("checks.creative_slot.max_nbt_depth", 16);
            int n2 = this.calculateNBTDepth(nBTCompound3, 1);
            if (n2 > n) {
                this.flag(player, "Oversized NBT compound depth (" + n2 + " > " + n + ")");
                packetReceiveEvent.setCancelled(true);
                return;
            }
            if (this.plugin.getConfig().getBoolean("checks.creative_slot.validate_skull_urls", true) && (nBTCompound2 = nBTCompound3.getCompoundTagOrNull("SkullOwner")) != null && (nBTCompound = nBTCompound2.getCompoundTagOrNull("Properties")) != null && ((string = nBTCompound.toString()).contains("http://") || string.contains("localhost") || string.contains("127.0.0.1"))) {
                this.flag(player, "Malicious or insecure skull texture URL");
                packetReceiveEvent.setCancelled(true);
                return;
            }
        }
    }

    private int calculateNBTDepth(NBTCompound nBTCompound, int n) {
        int n2 = n;
        for (String string : nBTCompound.getTagNames()) {
            NBTCompound nBTCompound2 = nBTCompound.getCompoundTagOrNull(string);
            if (nBTCompound2 == null) continue;
            n2 = Math.max(n2, this.calculateNBTDepth(nBTCompound2, n + 1));
        }
        return n2;
    }
}

