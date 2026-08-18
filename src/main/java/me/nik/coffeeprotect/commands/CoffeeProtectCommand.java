/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.TabCompleter
 *  org.bukkit.entity.Player
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
package me.nik.coffeeprotect.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.manager.PlayerData;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CoffeeProtectCommand
implements CommandExecutor,
TabCompleter {
    private final CoffeeProtect plugin;

    public CoffeeProtectCommand(@NotNull CoffeeProtect coffeeProtect) {
        this.plugin = coffeeProtect;
    }

    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, @NotNull String[] stringArray) {
        String string2;
        if (stringArray.length == 0) {
            this.sendHelp(commandSender);
            return true;
        }
        switch (string2 = stringArray[0].toLowerCase()) {
            case "reload": 
            case "rl": {
                if (!commandSender.hasPermission("coffeeprotect.reload")) {
                    this.sendMsg(commandSender, this.plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                long l = System.currentTimeMillis();
                this.plugin.reloadConfig();
                long l2 = System.currentTimeMillis() - l;
                String string3 = this.plugin.getConfig().getString("messages.reload_success", "&aReloaded in {time}ms").replace("{time}", String.valueOf(l2));
                this.sendMsg(commandSender, string3);
                return true;
            }
            case "alerts": 
            case "toggle": {
                PlayerData playerData;
                if (!(commandSender instanceof Player)) {
                    commandSender.sendMessage("This command is for players only.");
                    return true;
                }
                Player player = (Player)commandSender;
                if (!player.hasPermission("coffeeprotect.alerts")) {
                    this.sendMsg(commandSender, this.plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                boolean bl = (playerData = this.plugin.getPlayerDataManager().getPlayerData(player)).hasAlertsEnabled();
                playerData.setAlertsEnabled(!bl);
                String string4 = !bl ? this.plugin.getConfig().getString("messages.alerts_toggled_on", "&aAlerts ON") : this.plugin.getConfig().getString("messages.alerts_toggled_off", "&cAlerts OFF");
                this.sendMsg(commandSender, string4);
                return true;
            }
            case "menu": 
            case "gui": {
                if (!(commandSender instanceof Player)) {
                    commandSender.sendMessage("This command is for players only.");
                    return true;
                }
                Player player = (Player)commandSender;
                if (!player.hasPermission("coffeeprotect.menu")) {
                    this.sendMsg(commandSender, this.plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                this.plugin.getCoffeeMenu().openMenu(player);
                return true;
            }
            case "info": {
                if (!commandSender.hasPermission("coffeeprotect.info")) {
                    this.sendMsg(commandSender, this.plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                if (stringArray.length < 2) {
                    this.sendMsg(commandSender, "&cUsage: /cp info <player>");
                    return true;
                }
                Player player = Bukkit.getPlayer((String)stringArray[1]);
                if (player == null) {
                    String string5 = this.plugin.getConfig().getString("messages.player_not_found", "&cPlayer not found.").replace("{target}", stringArray[1]);
                    this.sendMsg(commandSender, string5);
                    return true;
                }
                PlayerData playerData = this.plugin.getPlayerDataManager().getPlayerData(player);
                List list = this.plugin.getConfig().getStringList("messages.player_info");
                for (Object obj6 : list) {
                    String string6 = String.valueOf(obj6);
                    String string7 = string6.replace("{player}", player.getName()).replace("{brand}", playerData.getClientBrand()).replace("{ping}", String.valueOf(player.getPing())).replace("{total_vl}", String.valueOf(playerData.getTotalViolations())).replace("{blocked_packets}", String.valueOf(playerData.getBlockedPackets()));
                    commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)string7));
                }
                return true;
            }
            case "discord": 
            case "testwebhook": {
                if (!commandSender.hasPermission("coffeeprotect.admin")) {
                    this.sendMsg(commandSender, this.plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                if (commandSender instanceof Player) {
                    this.plugin.getDiscordWebhookManager().sendAlert((Player)commandSender, "TestExploit", 1, "Testing Discord webhook integration");
                }
                this.sendMsg(commandSender, "&aDispatched test webhook alert to Discord!");
                return true;
            }
            case "stats": {
                this.sendMsg(commandSender, "&7Total Blocked Packets: &e" + this.plugin.getTotalBlockedPackets());
                return true;
            }
        }
        this.sendHelp(commandSender);
        return true;
    }

    private void sendHelp(CommandSender commandSender) {
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------------"));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&6\u2615 CoffeeProtect &7- Commands List:"));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&e/cp menu &7- Open Admin Management GUI"));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&e/cp reload &7- Reload configuration & checks"));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&e/cp alerts &7- Toggle exploit alert notifications"));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&e/cp info <player> &7- Inspect player network & security info"));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&e/cp discord &7- Test Discord webhook integration"));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&e/cp stats &7- View blocked packet statistics"));
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)"&8&m----------------------------------------"));
    }

    private void sendMsg(CommandSender commandSender, String string) {
        String string2 = this.plugin.getConfig().getString("messages.prefix", "&8[&6\u2615 CoffeeProtect&8] ");
        commandSender.sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)(string2 + string)));
    }

    @Nullable
    public List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, @NotNull String[] stringArray) {
        if (stringArray.length == 1) {
            List<String> list = Arrays.asList("menu", "reload", "alerts", "info", "discord", "stats");
            ArrayList<String> arrayList = new ArrayList<String>();
            for (String string2 : list) {
                if (!string2.toLowerCase().startsWith(stringArray[0].toLowerCase())) continue;
                arrayList.add(string2);
            }
            return arrayList;
        }
        if (stringArray.length == 2 && stringArray[0].equalsIgnoreCase("info")) {
            ArrayList<String> arrayList = new ArrayList<String>();
            for (Player player : Bukkit.getOnlinePlayers()) {
                if (!player.getName().toLowerCase().startsWith(stringArray[1].toLowerCase())) continue;
                arrayList.add(player.getName());
            }
            return arrayList;
        }
        return new ArrayList<String>();
    }
}

