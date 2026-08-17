package me.nik.coffeeprotect.commands;

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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoffeeProtectCommand implements CommandExecutor, TabCompleter {

    private final CoffeeProtect plugin;

    public CoffeeProtectCommand(@NotNull CoffeeProtect plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (args.length == 0) {
            sendHelp(sender);
            return true;
        }

        String sub = args[0].toLowerCase();

        switch (sub) {
            case "reload":
            case "rl": {
                if (!sender.hasPermission("coffeeprotect.reload")) {
                    sendMsg(sender, plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                long start = System.currentTimeMillis();
                plugin.reloadConfig();
                long took = System.currentTimeMillis() - start;
                String msg = plugin.getConfig().getString("messages.reload_success", "&aReloaded in {time}ms")
                    .replace("{time}", String.valueOf(took));
                sendMsg(sender, msg);
                return true;
            }

            case "alerts":
            case "toggle": {
                if (!(sender instanceof Player)) {
                    sender.sendMessage("This command is for players only.");
                    return true;
                }
                Player player = (Player) sender;
                if (!player.hasPermission("coffeeprotect.alerts")) {
                    sendMsg(sender, plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                PlayerData data = plugin.getPlayerDataManager().getPlayerData(player);
                boolean current = data.hasAlertsEnabled();
                data.setAlertsEnabled(!current);
                String msg = !current ?
                    plugin.getConfig().getString("messages.alerts_toggled_on", "&aAlerts ON") :
                    plugin.getConfig().getString("messages.alerts_toggled_off", "&cAlerts OFF");
                sendMsg(sender, msg);
                return true;
            }

            case "menu":
            case "gui": {
                if (!(sender instanceof Player)) {
                    sender.sendMessage("This command is for players only.");
                    return true;
                }
                Player player = (Player) sender;
                if (!player.hasPermission("coffeeprotect.menu")) {
                    sendMsg(sender, plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                plugin.getCoffeeMenu().openMenu(player);
                return true;
            }

            case "info": {
                if (!sender.hasPermission("coffeeprotect.info")) {
                    sendMsg(sender, plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                if (args.length < 2) {
                    sendMsg(sender, "&cUsage: /cp info <player>");
                    return true;
                }
                Player target = Bukkit.getPlayer(args[1]);
                if (target == null) {
                    String msg = plugin.getConfig().getString("messages.player_not_found", "&cPlayer not found.")
                        .replace("{target}", args[1]);
                    sendMsg(sender, msg);
                    return true;
                }
                PlayerData data = plugin.getPlayerDataManager().getPlayerData(target);
                List<String> lines = plugin.getConfig().getStringList("messages.player_info");
                for (String l : lines) {
                    String formatted = l
                        .replace("{player}", target.getName())
                        .replace("{brand}", data.getClientBrand())
                        .replace("{ping}", String.valueOf(target.getPing()))
                        .replace("{total_vl}", String.valueOf(data.getTotalViolations()))
                        .replace("{blocked_packets}", String.valueOf(data.getBlockedPackets()));
                    sender.sendMessage(ChatColor.translateAlternateColorCodes('&', formatted));
                }
                return true;
            }

            case "discord":
            case "testwebhook": {
                if (!sender.hasPermission("coffeeprotect.admin")) {
                    sendMsg(sender, plugin.getConfig().getString("messages.no_permission", "&cNo permission."));
                    return true;
                }
                if (sender instanceof Player) {
                    plugin.getDiscordWebhookManager().sendAlert((Player) sender, "TestExploit", 1, "Testing Discord webhook integration");
                }
                sendMsg(sender, "&aDispatched test webhook alert to Discord!");
                return true;
            }

            case "stats": {
                sendMsg(sender, "&7Total Blocked Packets: &e" + plugin.getTotalBlockedPackets());
                return true;
            }

            default:
                sendHelp(sender);
                return true;
        }
    }

    private void sendHelp(CommandSender sender) {
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m----------------------------------------"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&6☕ CoffeeProtect &7- Commands List:"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/cp menu &7- Open Admin Management GUI"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/cp reload &7- Reload configuration & checks"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/cp alerts &7- Toggle exploit alert notifications"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/cp info <player> &7- Inspect player network & security info"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/cp discord &7- Test Discord webhook integration"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&e/cp stats &7- View blocked packet statistics"));
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', "&8&m----------------------------------------"));
    }

    private void sendMsg(CommandSender sender, String msg) {
        String prefix = plugin.getConfig().getString("messages.prefix", "&8[&6☕ CoffeeProtect&8] ");
        sender.sendMessage(ChatColor.translateAlternateColorCodes('&', prefix + msg));
    }

    @Override
    public @Nullable List<String> onTabComplete(@NotNull CommandSender sender, @NotNull Command command, @NotNull String alias, @NotNull String[] args) {
        if (args.length == 1) {
            List<String> list = Arrays.asList("menu", "reload", "alerts", "info", "discord", "stats");
            List<String> result = new ArrayList<>();
            for (String s : list) {
                if (s.toLowerCase().startsWith(args[0].toLowerCase())) {
                    result.add(s);
                }
            }
            return result;
        }
        if (args.length == 2 && args[0].equalsIgnoreCase("info")) {
            List<String> result = new ArrayList<>();
            for (Player p : Bukkit.getOnlinePlayers()) {
                if (p.getName().toLowerCase().startsWith(args[1].toLowerCase())) {
                    result.add(p.getName());
                }
            }
            return result;
        }
        return new ArrayList<>();
    }
}
