package me.nik.coffeeprotect;

import com.github.retrooper.packetevents.PacketEvents;
import com.github.retrooper.packetevents.event.PacketListenerPriority;
import io.github.retrooper.packetevents.factory.spigot.SpigotPacketEventsBuilder;
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
import me.nik.coffeeprotect.manager.*;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.atomic.AtomicLong;

public class CoffeeProtect extends JavaPlugin implements CoffeeProtectAPI {

    private static CoffeeProtect instance;
    private final AtomicLong totalBlockedPackets = new AtomicLong(0);

    // Managers
    private PlayerDataManager playerDataManager;
    private AlertManager alertManager;
    private DiscordWebhookManager discordWebhookManager;
    private PunishManager punishManager;

    // Checks
    private BookExploitCheck bookExploitCheck;
    private SignExploitCheck signExploitCheck;
    private CreativeSlotCheck creativeSlotCheck;
    private CustomPayloadCheck customPayloadCheck;
    private WindowClickCheck windowClickCheck;
    private MovementPacketCheck movementPacketCheck;
    private RedstoneLagListener redstoneLagListener;

    // PacketListener & GUI
    private PacketListenerImpl packetListener;
    private CoffeeMenu coffeeMenu;

    private boolean folia = false;

    @Override
    public void onLoad() {
        instance = this;
        try {
            if (PacketEvents.getAPI() == null || !PacketEvents.getAPI().isLoaded()) {
                PacketEvents.setAPI(SpigotPacketEventsBuilder.build(this));
                PacketEvents.getAPI().getSettings().reEncodeByDefault(false).checkForUpdates(false);
                PacketEvents.getAPI().load();
                getLogger().info("PacketEvents API loaded successfully!");
            }
        } catch (Throwable t) {
            getLogger().warning("PacketEvents load notice: " + t.getMessage());
        }
    }

    @Override
    public void onEnable() {
        instance = this;
        CoffeeProtectAPIProvider.setApiInstance(this);

        try {
            Class.forName("io.papermc.paper.threadedregions.RegionizedServer");
            folia = true;
        } catch (ClassNotFoundException ignored) {}

        // Save default config
        saveDefaultConfig();

        // Initialize Managers
        this.playerDataManager = new PlayerDataManager(this);
        this.alertManager = new AlertManager(this);
        this.discordWebhookManager = new DiscordWebhookManager(this);
        this.punishManager = new PunishManager(this);

        // Initialize Checks
        this.bookExploitCheck = new BookExploitCheck(this);
        this.signExploitCheck = new SignExploitCheck(this);
        this.creativeSlotCheck = new CreativeSlotCheck(this);
        this.customPayloadCheck = new CustomPayloadCheck(this);
        this.windowClickCheck = new WindowClickCheck(this);
        this.movementPacketCheck = new MovementPacketCheck(this);
        this.redstoneLagListener = new RedstoneLagListener(this);

        // Register PacketEvents Listener
        try {
            if (PacketEvents.getAPI() != null && !PacketEvents.getAPI().isInitialized()) {
                PacketEvents.getAPI().init();
            }
            this.packetListener = new PacketListenerImpl(this);
            PacketEvents.getAPI().getEventManager().registerListener(this.packetListener, PacketListenerPriority.HIGHEST);
            getLogger().info("PacketEvents packet interceptor active!");
        } catch (Throwable t) {
            getLogger().warning("PacketEvents init notice: " + t.getMessage());
        }

        // Register Bukkit Event Listeners
        PluginManager pm = getServer().getPluginManager();
        pm.registerEvents(this.playerDataManager, this);
        pm.registerEvents(this.redstoneLagListener, this);
        this.coffeeMenu = new CoffeeMenu(this);
        pm.registerEvents(this.coffeeMenu, this);

        // Register Commands
        CoffeeProtectCommand cmd = new CoffeeProtectCommand(this);
        if (getCommand("coffeeprotect") != null) {
            getCommand("coffeeprotect").setExecutor(cmd);
            getCommand("coffeeprotect").setTabCompleter(cmd);
        }

        // Register PlaceholderAPI Expansion if present
        if (pm.getPlugin("PlaceholderAPI") != null) {
            new CoffeePlaceholderExpansion(this).register();
            getLogger().info("PlaceholderAPI Expansion hooked successfully (%coffeeprotect_...%)!");
        }

        // Periodic Tasks (Violation Reset & Redstone Tick Reset)
        startScheduledTasks();

        // Print Startup Banner
        printBanner();
    }

    @Override
    public void onDisable() {
        try {
            if (PacketEvents.getAPI() != null && PacketEvents.getAPI().isInitialized()) {
                PacketEvents.getAPI().terminate();
            }
        } catch (Throwable ignored) {}

        if (playerDataManager != null) {
            playerDataManager.clear();
        }
        getLogger().info("CoffeeProtect disabled successfully.");
    }

    private void startScheduledTasks() {
        int resetSec = getConfig().getInt("settings.violation_reset_interval", 300);

        Bukkit.getScheduler().runTaskTimerAsynchronously(this, () -> {
            if (playerDataManager != null) {
                playerDataManager.resetAllViolations();
            }
        }, resetSec * 20L, resetSec * 20L);

        Bukkit.getScheduler().runTaskTimer(this, () -> {
            if (redstoneLagListener != null) {
                redstoneLagListener.tickReset();
            }
        }, 1L, 1L);
    }

    public void runTaskOnMain(@NotNull Runnable runnable) {
        Bukkit.getScheduler().runTask(this, runnable);
    }

    private void printBanner() {
        getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&',
            "\n&6   ____        __  __          ____            _            _   " +
            "\n&6  / ___|___   / _|/ _| ___  ___|  _ \\ _ __ ___ | |_ ___  ___| |_ " +
            "\n&6 | |   / _ \\ | |_| |_ / _ \\/ _ \\ |_) | '__/ _ \\| __/ _ \\/ __| __|" +
            "\n&6 | |__| (_) ||  _|  _|  __/  __/  __/| | | (_) | ||  __/ (__| |_ " +
            "\n&6  \\____\\___/ |_| |_|  \\___|\\___|_|   |_|  \\___/ \\__\\___|\\___|\\__|" +
            "\n&e        ☕ CoffeeProtect v" + getDescription().getVersion() + " • De-obfuscated & Clean Edition ☕" +
            "\n&a        ✔ All Exploit Protection Modules & PacketEvents 2.x Active!\n"
        ));
    }

    public static CoffeeProtect getInstance() {
        return instance;
    }

    public void incrementBlockedPackets() {
        totalBlockedPackets.incrementAndGet();
    }

    @Override
    public long getTotalBlockedPackets() {
        return totalBlockedPackets.get();
    }

    @Override
    public int getViolationLevel(@NotNull Player player) {
        return playerDataManager.getPlayerData(player).getTotalViolations();
    }

    @NotNull
    @Override
    public String getClientBrand(@NotNull Player player) {
        return playerDataManager.getPlayerData(player).getClientBrand();
    }

    @Override
    public boolean hasAlertsEnabled(@NotNull Player player) {
        return playerDataManager.getPlayerData(player).hasAlertsEnabled();
    }

    @Override
    public void toggleAlerts(@NotNull Player player) {
        PlayerData data = playerDataManager.getPlayerData(player);
        data.setAlertsEnabled(!data.hasAlertsEnabled());
    }

    public PlayerDataManager getPlayerDataManager() {
        return playerDataManager;
    }

    public AlertManager getAlertManager() {
        return alertManager;
    }

    public DiscordWebhookManager getDiscordWebhookManager() {
        return discordWebhookManager;
    }

    public PunishManager getPunishManager() {
        return punishManager;
    }

    public BookExploitCheck getBookExploitCheck() {
        return bookExploitCheck;
    }

    public SignExploitCheck getSignExploitCheck() {
        return signExploitCheck;
    }

    public CreativeSlotCheck getCreativeSlotCheck() {
        return creativeSlotCheck;
    }

    public CustomPayloadCheck getCustomPayloadCheck() {
        return customPayloadCheck;
    }

    public WindowClickCheck getWindowClickCheck() {
        return windowClickCheck;
    }

    public MovementPacketCheck getMovementPacketCheck() {
        return movementPacketCheck;
    }

    public RedstoneLagListener getRedstoneLagListener() {
        return redstoneLagListener;
    }

    public CoffeeMenu getCoffeeMenu() {
        return coffeeMenu;
    }
}
