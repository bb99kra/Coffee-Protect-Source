package me.nik.coffeeprotect.checks.item;

import com.github.retrooper.packetevents.event.PacketReceiveEvent;
import com.github.retrooper.packetevents.protocol.item.ItemStack;
import com.github.retrooper.packetevents.protocol.nbt.NBT;
import com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import com.github.retrooper.packetevents.protocol.packettype.PacketType;
import com.github.retrooper.packetevents.wrapper.play.client.WrapperPlayClientCreativeInventoryAction;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.checks.Check;
import me.nik.coffeeprotect.checks.CheckType;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class CreativeSlotCheck extends Check {

    public CreativeSlotCheck(@NotNull CoffeeProtect plugin) {
        super(plugin, CheckType.CREATIVE_SLOT);
    }

    public void handleCreativeAction(@NotNull PacketReceiveEvent event, @NotNull Player player) {
        if (!isEnabled()) return;

        if (event.getPacketType() == PacketType.Play.Client.CREATIVE_INVENTORY_ACTION) {
            WrapperPlayClientCreativeInventoryAction wrapper = new WrapperPlayClientCreativeInventoryAction(event);
            ItemStack item = wrapper.getItemStack();
            if (item == null || item.isEmpty()) return;

            NBTCompound nbt = item.getNBT();
            if (nbt == null) return;

            int maxDepth = plugin.getConfig().getInt("checks.creative_slot.max_nbt_depth", 16);
            int depth = calculateNBTDepth(nbt, 1);
            if (depth > maxDepth) {
                flag(player, "Oversized NBT compound depth (" + depth + " > " + maxDepth + ")");
                event.setCancelled(true);
                return;
            }

            // Validate Skull Owner URL if present
            if (plugin.getConfig().getBoolean("checks.creative_slot.validate_skull_urls", true)) {
                NBTCompound skullOwner = nbt.getCompoundTagOrNull("SkullOwner");
                if (skullOwner != null) {
                    NBTCompound properties = skullOwner.getCompoundTagOrNull("Properties");
                    if (properties != null) {
                        String raw = properties.toString();
                        if (raw.contains("http://") || raw.contains("localhost") || raw.contains("127.0.0.1")) {
                            flag(player, "Malicious or insecure skull texture URL");
                            event.setCancelled(true);
                            return;
                        }
                    }
                }
            }
        }
    }

    private int calculateNBTDepth(NBTCompound compound, int currentDepth) {
        int max = currentDepth;
        for (String key : compound.getTagNames()) {
            NBTCompound sub = compound.getCompoundTagOrNull(key);
            if (sub != null) {
                max = Math.max(max, calculateNBTDepth(sub, currentDepth + 1));
            }
        }
        return max;
    }
}
