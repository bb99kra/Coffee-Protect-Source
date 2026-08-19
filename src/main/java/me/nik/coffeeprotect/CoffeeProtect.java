/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.retrooper.packetevents.PacketEvents
 *  com.github.retrooper.packetevents.PacketEventsAPI
 *  com.github.retrooper.packetevents.event.PacketListener
 *  com.github.retrooper.packetevents.event.PacketListenerPriority
 *  io.github.retrooper.packetevents.factory.spigot.SpigotPacketEventsBuilder
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.command.TabCompleter
 *  org.bukkit.entity.Player
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 *  org.bukkit.plugin.java.JavaPlugin
 *  org.jetbrains.annotations.NotNull
 */
package me.nik.coffeeprotect;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.PacketEventsAPI;
import com.github.retrooper.packetevents.event.PacketListener;
import com.github.retrooper.packetevents.event.PacketListenerPriority;
import io.github.retrooper.packetevents.factory.spigot.SpigotPacketEventsBuilder;
import java.util.concurrent.atomic.AtomicLong;
import me.nik.coffeeprotect.api.CoffeeProtectAPI;
import me.nik.coffeeprotect.api.CoffeeProtectAPIProvider;
import me.nik.coffeeprotect.checks.book.BookExploitCheck;
import me.nik.coffeeprotect.checks.inventory.WindowClickCheck;
import me.nik.coffeeprotect.checks.item.CreativeSlotCheck;
import me.nik.coffeeprotect.checks.movement.MovementPacketCheck;
import me.nik.coffeeprotect.checks.payload.CustomPayloadCheck;
import me.nik.coffeeprotect.checks.redstone.RedstoneLagListener;
import me.nik.coffeeprotect.checks.sign.SignExploitCheck;
import me.nik.coffeeprotect.commands.CoffeeProtectCommand;
import me.nik.coffeeprotect.gui.CoffeeMenu;
import me.nik.coffeeprotect.hook.CoffeePlaceholderExpansion;
import me.nik.coffeeprotect.listener.PacketListenerImpl;
import me.nik.coffeeprotect.manager.AlertManager;
import me.nik.coffeeprotect.manager.DiscordWebhookManager;
import me.nik.coffeeprotect.manager.PlayerData;
import me.nik.coffeeprotect.manager.PlayerDataManager;
import me.nik.coffeeprotect.manager.PunishManager;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.TabCompleter;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

public class CoffeeProtect
extends JavaPlugin
implements CoffeeProtectAPI {
    private static CoffeeProtect instance;
    private final AtomicLong totalBlockedPackets = new AtomicLong(0L);
    private PlayerDataManager playerDataManager;
    private AlertManager alertManager;
    private DiscordWebhookManager discordWebhookManager;
    private PunishManager punishManager;
    private BookExploitCheck bookExploitCheck;
    private SignExploitCheck signExploitCheck;
    private CreativeSlotCheck creativeSlotCheck;
    private CustomPayloadCheck customPayloadCheck;
    private WindowClickCheck windowClickCheck;
    private MovementPacketCheck movementPacketCheck;
    private RedstoneLagListener redstoneLagListener;
    private PacketListenerImpl packetListener;
    private CoffeeMenu coffeeMenu;
    private boolean folia = false;

    public void onLoad() {
        instance = this;
        try {
            if (PacketEvents.getAPI() == null || !PacketEvents.getAPI().isLoaded()) {
                PacketEvents.setAPI((PacketEventsAPI)SpigotPacketEventsBuilder.build((Plugin)this));
                PacketEvents.getAPI().getSettings().reEncodeByDefault(false).checkForUpdates(false);
                PacketEvents.getAPI().load();
                this.getLogger().info("PacketEvents API loaded successfully!");
            }
        }
        catch (Throwable throwable) {
            this.getLogger().warning("PacketEvents load notice: " + throwable.getMessage());
        }
    }

    public void onEnable() {
        instance = this;
        CoffeeProtectAPIProvider.setApiInstance(this);
        try {
            Class.forName("io.papermc.paper.threadedregions.RegionizedServer");
            this.folia = true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        this.saveDefaultConfig();
        this.playerDataManager = new PlayerDataManager(this);
        this.alertManager = new AlertManager(this);
        this.discordWebhookManager = new DiscordWebhookManager(this);
        this.punishManager = new PunishManager(this);
        this.bookExploitCheck = new BookExploitCheck(this);
        this.signExploitCheck = new SignExploitCheck(this);
        this.creativeSlotCheck = new CreativeSlotCheck(this);
        this.customPayloadCheck = new CustomPayloadCheck(this);
        this.windowClickCheck = new WindowClickCheck(this);
        this.movementPacketCheck = new MovementPacketCheck(this);
        this.redstoneLagListener = new RedstoneLagListener(this);
        try {
            if (PacketEvents.getAPI() != null && !PacketEvents.getAPI().isInitialized()) {
                PacketEvents.getAPI().init();
            }
            this.packetListener = new PacketListenerImpl(this);
            PacketEvents.getAPI().getEventManager().registerListener((PacketListener)this.packetListener, PacketListenerPriority.HIGHEST);
            this.getLogger().info("PacketEvents packet interceptor active!");
        }
        catch (Throwable throwable) {
            this.getLogger().warning("PacketEvents init notice: " + throwable.getMessage());
        }
        PluginManager pluginManager = this.getServer().getPluginManager();
        pluginManager.registerEvents((Listener)this.playerDataManager, (Plugin)this);
        pluginManager.registerEvents((Listener)this.redstoneLagListener, (Plugin)this);
        this.coffeeMenu = new CoffeeMenu(this);
        pluginManager.registerEvents((Listener)this.coffeeMenu, (Plugin)this);
        CoffeeProtectCommand coffeeProtectCommand = new CoffeeProtectCommand(this);
        if (this.getCommand("coffeeprotect") != null) {
            this.getCommand("coffeeprotect").setExecutor((CommandExecutor)coffeeProtectCommand);
            this.getCommand("coffeeprotect").setTabCompleter((TabCompleter)coffeeProtectCommand);
        }
        if (pluginManager.getPlugin("PlaceholderAPI") != null) {
            new CoffeePlaceholderExpansion(this).register();
            this.getLogger().info("PlaceholderAPI Expansion hooked successfully (%coffeeprotect_...%)!");
        }
        this.startScheduledTasks();
        this.printBanner();
    }

    public void onDisable() {
        try {
            if (PacketEvents.getAPI() != null && PacketEvents.getAPI().isInitialized()) {
                PacketEvents.getAPI().terminate();
            }
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (this.playerDataManager != null) {
            this.playerDataManager.clear();
        }
        this.getLogger().info("CoffeeProtect disabled successfully.");
    }

    private void startScheduledTasks() {
        int n = this.getConfig().getInt("settings.violation_reset_interval", 300);
        Bukkit.getScheduler().runTaskTimerAsynchronously((Plugin)this, () -> {
            if (this.playerDataManager != null) {
                this.playerDataManager.resetAllViolations();
            }
        }, (long)n * 20L, (long)n * 20L);
        Bukkit.getScheduler().runTaskTimer((Plugin)this, () -> {
            if (this.redstoneLagListener != null) {
                this.redstoneLagListener.tickReset();
            }
        }, 1L, 1L);
    }

    public void runTaskOnMain(@NotNull Runnable runnable) {
        Bukkit.getScheduler().runTask((Plugin)this, runnable);
    }

    private void printBanner() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes((char)'&', (String)("\n&6   ____        __  __          ____            _            _   \n&6  / ___|___   / _|/ _| ___  ___|  _ \\ _ __ ___ | |_ ___  ___| |_ \n&6 | |   / _ \\ | |_| |_ / _ \\/ _ \\ |_) | '__/ _ \\| __/ _ \\/ __| __|\n&6 | |__| (_) ||  _|  _|  __/  __/  __/| | | (_) | ||  __/ (__| |_ \n&6  \\____\\___/ |_| |_|  \\___|\\___|_|   |_|  \\___/ \\__\\___|\\___|\\__|\n&e        \u2615 CoffeeProtect v" + this.getDescription().getVersion() + " \u2022 De-obfuscated & Clean Edition \u2615\n&a        \u2714 All Exploit Protection Modules & PacketEvents 2.x Active!\n")));
    }

    public static CoffeeProtect getInstance() {
        return instance;
    }

    public void incrementBlockedPackets() {
        this.totalBlockedPackets.incrementAndGet();
    }

    @Override
    public long getTotalBlockedPackets() {
        return this.totalBlockedPackets.get();
    }

    @Override
    public int getViolationLevel(@NotNull Player player) {
        return this.playerDataManager.getPlayerData(player).getTotalViolations();
    }

    @Override
    @NotNull
    public String getClientBrand(@NotNull Player player) {
        return this.playerDataManager.getPlayerData(player).getClientBrand();
    }

    @Override
    public boolean hasAlertsEnabled(@NotNull Player player) {
        return this.playerDataManager.getPlayerData(player).hasAlertsEnabled();
    }

    @Override
    public void toggleAlerts(@NotNull Player player) {
        PlayerData playerData;
        playerData = this.playerDataManager.getPlayerData(player);
        playerData.setAlertsEnabled(!playerData.hasAlertsEnabled());
    }

    public PlayerDataManager getPlayerDataManager() {
        return this.playerDataManager;
    }

    public AlertManager getAlertManager() {
        return this.alertManager;
    }

    public DiscordWebhookManager getDiscordWebhookManager() {
        return this.discordWebhookManager;
    }

    public PunishManager getPunishManager() {
        return this.punishManager;
    }

    public BookExploitCheck getBookExploitCheck() {
        return this.bookExploitCheck;
    }

    public SignExploitCheck getSignExploitCheck() {
        return this.signExploitCheck;
    }

    public CreativeSlotCheck getCreativeSlotCheck() {
        return this.creativeSlotCheck;
    }

    public CustomPayloadCheck getCustomPayloadCheck() {
        return this.customPayloadCheck;
    }

    public WindowClickCheck getWindowClickCheck() {
        return this.windowClickCheck;
    }

    public MovementPacketCheck getMovementPacketCheck() {
        return this.movementPacketCheck;
    }

    public RedstoneLagListener getRedstoneLagListener() {
        return this.redstoneLagListener;
    }

    public CoffeeMenu getCoffeeMenu() {
        return this.coffeeMenu;
    }
}

