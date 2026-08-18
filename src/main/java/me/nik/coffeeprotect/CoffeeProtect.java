/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler
 *  io.papermc.paper.threadedregions.scheduler.ScheduledTask
 *  org.bukkit.Bukkit
 *  org.bukkit.ChatColor
 *  org.bukkit.command.CommandExecutor
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.entity.Player
 *  org.bukkit.event.HandlerList
 *  org.bukkit.event.Listener
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.PluginManager
 *  org.bukkit.plugin.java.JavaPlugin
 *  org.bukkit.scheduler.BukkitTask
 */
package me.nik.coffeeprotect;

import io.papermc.paper.threadedregions.scheduler.GlobalRegionScheduler;
import io.papermc.paper.threadedregions.scheduler.ScheduledTask;
import java.io.File;
import java.io.IOException;
import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_AI;
import me.nik.coffeeprotect.CP_Cq;
import me.nik.coffeeprotect.CP_GT;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_P1;
import me.nik.coffeeprotect.CP_PC;
import me.nik.coffeeprotect.CP_PW;
import me.nik.coffeeprotect.CP_PX;
import me.nik.coffeeprotect.CP_P_;
import me.nik.coffeeprotect.CP_Pm;
import me.nik.coffeeprotect.CP_Pt;
import me.nik.coffeeprotect.CP_Q6;
import me.nik.coffeeprotect.CP_Q7;
import me.nik.coffeeprotect.CP_Qb;
import me.nik.coffeeprotect.CP_Qc;
import me.nik.coffeeprotect.CP_Qf;
import me.nik.coffeeprotect.CP_Qg;
import me.nik.coffeeprotect.CP_Qm;
import me.nik.coffeeprotect.CP_Xi;
import me.nik.coffeeprotect.CP_Z9;
import me.nik.coffeeprotect.CP_Zn;
import me.nik.coffeeprotect.CP_Zv;
import me.nik.coffeeprotect.CP_fJ;
import me.nik.coffeeprotect.CP_hO;
import me.nik.coffeeprotect.CP_hs;
import me.nik.coffeeprotect.CP_iZ;
import me.nik.coffeeprotect.CoffeePlaceholderExpansion;
import me.nik.coffeeprotect.CP_q9;
import me.nik.coffeeprotect.CP_qb;
import me.nik.coffeeprotect.CP_vF;
import me.nik.coffeeprotect.CP_vm;
import me.nik.coffeeprotect.CP_yQ;
import me.nik.coffeeprotect.api.CoffeeProtectAPI;
import me.nik.coffeeprotect.api.CoffeeProtectAPIBackend;
import me.nik.coffeeprotect.api.CoffeeProtectAPIProvider;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_qF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_rX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_uP;
import me.nik.coffeeprotect.metrics.Metrics;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.CommandExecutor;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.entity.Player;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.scheduler.BukkitTask;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class CoffeeProtect
extends JavaPlugin {
    private final String[] CP_A;
    private static CoffeeProtect CP_C;
    private static CoffeeProtectAPI CP_i;
    private final CP_GT CP_g;
    private final CP_fJ CP_n;
    private final CP_yQ CP_W;
    private final CP_vm CP_r;
    private final CP_iZ CP_Q;
    private final CP_hO CP_M;
    private final CP_Qf CP_x;
    private final CP_Pt CP_j;
    private final CP_P1 CP_S;
    private final CP_hs CP_p;
    private final CP_AI CP_L;
    private final CP_Xi CP_D;
    private final CP_Zv CP_Y;
    private boolean CP_z;
    private static PacketWrapper[] CP_O;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static final long[] f;
    private static final Long[] g;
    private static final Map h;
    private static transient /* synthetic */ String jhSEHtmVqM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CoffeeProtect() {
        long l = a ^ 0x413301EB296BL;
        PacketWrapper[] packetWrapperArray = CoffeeProtect.CP_c();
        this.CP_A = new String[]{" ", ChatColor.GOLD + (String)((Object)CoffeeProtect.a("a", (int)29137, (long)(0x72BF7C95BDD78980L ^ l))) + this.getDescription().getVersion(), " ", ChatColor.WHITE + (String)((Object)CoffeeProtect.a("a", (int)15784, (long)(0x7F6D535800F45F5L ^ l))), " "};
        this.CP_g = new CP_GT(this);
        this.CP_n = new CP_fJ();
        this.CP_W = new CP_yQ();
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        this.CP_r = new CP_vm(this);
        this.CP_Q = new CP_iZ();
        this.CP_M = new CP_hO();
        this.CP_x = new CP_Qf();
        this.CP_j = new CP_Pt(this);
        this.CP_S = new CP_P1(this);
        this.CP_p = new CP_hs(this);
        this.CP_L = new CP_AI(this);
        this.CP_D = new CP_Xi();
        this.CP_Y = new CP_Zv();
        if (PacketWrapper.CP_z() == null) {
            CoffeeProtect.CP_c(new PacketWrapper[5]);
        }
    }

    public static CoffeeProtectAPI CP_K() {
        return CP_i;
    }

    /*
     * Unable to fully structure code
     */
    public void onLoad() {
        block20: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                block18: {
                                    block19: {
                                        var1_1 = CoffeeProtect.a ^ 32295839289023L;
                                        Bukkit.getOnlinePlayers().forEach((Consumer<Player>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$onLoad$0(org.bukkit.entity.Player ), (Lorg/bukkit/entity/Player;)V)());
                                        v0 = CoffeeProtect.CP_c();
                                        CP_r7.CP_a(CP_uP.CP_E((Plugin)this));
                                        var3_2 = v0;
                                        CP_r7.CP_b().CP_V().CP_v(false).CP_Y(true).CP_u(false).CP_n(false).CP_W(false).CP_O(CP_rX.MILLIS).CP_w(true);
                                        CP_r7.CP_b().CP_A();
                                        var4_3 = new File(this.getDataFolder().getParent() + (String)CoffeeProtect.a("a", (int)13239, (long)(3237620695285476403L ^ var1_1)), (String)CoffeeProtect.a("a", (int)16400, (long)(8169335449040379795L ^ var1_1)));
                                        v1 = var4_3;
                                        if (var3_2 != null) break block18;
                                        try {
                                            if (v1.exists()) break block19;
                                            break block20;
                                            catch (IOException v2) {
                                                throw CoffeeProtect.a(v2);
                                            }
                                        }
                                        catch (IOException v3) {
                                            throw CoffeeProtect.a(v3);
                                        }
                                    }
                                    v1 = var4_3;
                                }
                                var5_4 = YamlConfiguration.loadConfiguration((File)v1);
                                var6_5 = CoffeeProtect.a("a", (int)10140, (long)(7981996141585905690L ^ var1_1));
                                v4 = var5_4;
                                v5 = var6_5;
                                if (var3_2 != null) break block21;
                                try {
                                    block26: {
                                        if (v4.getBoolean((String)v5)) break block22;
                                        break block26;
                                        catch (IOException v6) {
                                            throw CoffeeProtect.a(v6);
                                        }
                                    }
                                    v4 = var5_4;
                                    v5 = var6_5;
                                }
                                catch (IOException v7) {
                                    throw CoffeeProtect.a(v7);
                                }
                            }
                            v4.set((String)v5, (Object)true);
                        }
                        var7_6 = CoffeeProtect.a("a", (int)17383, (long)(6886161118286011488L ^ var1_1));
                        v8 = var5_4;
                        v9 = var7_6;
                        if (var3_2 != null) break block23;
                        try {
                            block27: {
                                if (v8.getBoolean((String)v9)) break block24;
                                break block27;
                                catch (IOException v10) {
                                    throw CoffeeProtect.a(v10);
                                }
                            }
                            v8 = var5_4;
                            v9 = var7_6;
                        }
                        catch (IOException v11) {
                            throw CoffeeProtect.a(v11);
                        }
                    }
                    v8.set((String)v9, (Object)true);
                }
                var8_7 = CoffeeProtect.a("a", (int)27048, (long)(4573086867277444640L ^ var1_1));
                v12 = var5_4;
                if (var3_2 != null) ** GOTO lbl79
                try {
                    block28: {
                        if (v12.getBoolean((String)var8_7)) break block25;
                        break block28;
                        catch (IOException v13) {
                            throw CoffeeProtect.a(v13);
                        }
                    }
                    var5_4.set((String)var8_7, (Object)true);
                }
                catch (IOException v14) {
                    throw CoffeeProtect.a(v14);
                }
            }
            try {
                v12 = var5_4;
lbl79:
                // 2 sources

                v12.save(var4_3);
            }
            catch (IOException var9_8) {
                var9_8.printStackTrace();
            }
            System.out.println((String)CoffeeProtect.a("a", (int)30119, (long)(1807065025553984039L ^ var1_1)));
        }
    }

    public void onEnable() {
        block67: {
            BukkitTask bukkitTask;
            boolean bl;
            long l;
            block64: {
                PacketWrapper[] packetWrapperArray;
                block65: {
                    block66: {
                        block62: {
                            block63: {
                                boolean bl2;
                                PluginManager pluginManager;
                                block60: {
                                    block61: {
                                        block58: {
                                            block59: {
                                                block56: {
                                                    block57: {
                                                        CoffeeProtect coffeeProtect;
                                                        block55: {
                                                            block54: {
                                                                boolean bl3;
                                                                block53: {
                                                                    block51: {
                                                                        block52: {
                                                                            l = a ^ 0x54F00453B43AL;
                                                                            CP_C = this;
                                                                            packetWrapperArray = CoffeeProtect.CP_c();
                                                                            try {
                                                                                Class.forName((String)((Object)CoffeeProtect.a("a", (int)17603, (long)(0x30BA3CD322CDA1C4L ^ l))));
                                                                                this.CP_z = true;
                                                                            }
                                                                            catch (ClassNotFoundException classNotFoundException) {
                                                                                // empty catch block
                                                                            }
                                                                            try {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            CP_i = new CoffeeProtectAPIBackend(this);
                                                                                            CoffeeProtectAPIProvider.register(CP_i);
                                                                                            this.getServer().getConsoleSender().sendMessage(this.CP_A);
                                                                                            this.CP_D.CP_d();
                                                                                            this.CP_Y.CP_F();
                                                                                            CP_Qb.CP_y(() -> {
                                                                                                long l = a ^ 0x4B27DC53EC73L;
                                                                                                if (!this.CP_D.CP_n()) {
                                                                                                    CP_qb.CP_p();
                                                                                                }
                                                                                            }, (long)CoffeeProtect.b("u", (int)6421, (long)(0x4D7BA03E59E17A18L ^ l)));
                                                                                            CP_Qb.CP_y(() -> {
                                                                                                block4: {
                                                                                                    block3: {
                                                                                                        boolean bl;
                                                                                                        block2: {
                                                                                                            long l = a ^ 0x6ACBA9DFBA00L;
                                                                                                            PacketWrapper[] packetWrapperArray = CoffeeProtect.CP_c();
                                                                                                            bl = this.CP_Y.CP_b();
                                                                                                            if (packetWrapperArray != null) break block2;
                                                                                                            if (bl) break block3;
                                                                                                            bl = this.CP_Y.CP_v();
                                                                                                        }
                                                                                                        if (bl) break block4;
                                                                                                    }
                                                                                                    CP_qb.CP_p();
                                                                                                }
                                                                                            }, (long)CoffeeProtect.b("u", (int)9886, (long)(0x2CFF5F6D7C8B4592L ^ l)));
                                                                                            this.CP_g.CP_m();
                                                                                            this.CP_n.CP_p(this);
                                                                                            this.CP_n.CP_UnderScore();
                                                                                            this.CP_n.CP_n().options().copyDefaults(true);
                                                                                            this.CP_n.CP_E();
                                                                                            this.CP_W.CP_C();
                                                                                            this.CP_r.CP_C();
                                                                                            this.CP_Q.CP_C();
                                                                                            this.CP_x.CP_C();
                                                                                            this.CP_j.CP_C();
                                                                                            this.CP_S.CP_C();
                                                                                            new CoffeePlaceholderExpansion().initialize();
                                                                                            bl3 = CP_Oq.ENTITY_LIMIT_ENABLED.CP_t();
                                                                                            if (packetWrapperArray != null) break block51;
                                                                                            if (!bl3) break block52;
                                                                                        }
                                                                                        catch (ClassNotFoundException classNotFoundException) {
                                                                                            throw CoffeeProtect.a(classNotFoundException);
                                                                                        }
                                                                                        bl3 = this.CP_z;
                                                                                        if (packetWrapperArray != null) break block51;
                                                                                    }
                                                                                    catch (ClassNotFoundException classNotFoundException) {
                                                                                        throw CoffeeProtect.a(classNotFoundException);
                                                                                    }
                                                                                    if (bl3) break block52;
                                                                                }
                                                                                catch (ClassNotFoundException classNotFoundException) {
                                                                                    throw CoffeeProtect.a(classNotFoundException);
                                                                                }
                                                                                this.CP_p.CP_C();
                                                                            }
                                                                            catch (ClassNotFoundException classNotFoundException) {
                                                                                throw CoffeeProtect.a(classNotFoundException);
                                                                            }
                                                                        }
                                                                        bl3 = CP_Oq.OP_PROTECTION_ENABLED.CP_t();
                                                                    }
                                                                    try {
                                                                        try {
                                                                            try {
                                                                                if (packetWrapperArray != null) break block53;
                                                                                if (!bl3) break block54;
                                                                            }
                                                                            catch (ClassNotFoundException classNotFoundException) {
                                                                                throw CoffeeProtect.a(classNotFoundException);
                                                                            }
                                                                            coffeeProtect = this;
                                                                            if (packetWrapperArray != null) break block55;
                                                                        }
                                                                        catch (ClassNotFoundException classNotFoundException) {
                                                                            throw CoffeeProtect.a(classNotFoundException);
                                                                        }
                                                                        bl3 = coffeeProtect.CP_z;
                                                                    }
                                                                    catch (ClassNotFoundException classNotFoundException) {
                                                                        throw CoffeeProtect.a(classNotFoundException);
                                                                    }
                                                                }
                                                                try {
                                                                    if (!bl3) {
                                                                        this.CP_L.CP_C();
                                                                    }
                                                                }
                                                                catch (ClassNotFoundException classNotFoundException) {
                                                                    throw CoffeeProtect.a(classNotFoundException);
                                                                }
                                                            }
                                                            coffeeProtect = this;
                                                        }
                                                        coffeeProtect.getCommand((String)((Object)CoffeeProtect.a("a", (int)14337, (long)(0x7638623CF1BDDD05L ^ l)))).setExecutor((CommandExecutor)new CP_Qc(this));
                                                        pluginManager = Bukkit.getPluginManager();
                                                        try {
                                                            try {
                                                                pluginManager.registerEvents((Listener)new CP_Q6(), (Plugin)this);
                                                                pluginManager.registerEvents((Listener)new CP_PX(this), (Plugin)this);
                                                                bl2 = CP_Oq.DISABLED_COMMANDS_ENABLED.CP_t();
                                                                if (packetWrapperArray != null) break block56;
                                                                if (!bl2) break block57;
                                                            }
                                                            catch (ClassNotFoundException classNotFoundException) {
                                                                throw CoffeeProtect.a(classNotFoundException);
                                                            }
                                                            pluginManager.registerEvents((Listener)new CP_Qg(this), (Plugin)this);
                                                        }
                                                        catch (ClassNotFoundException classNotFoundException) {
                                                            throw CoffeeProtect.a(classNotFoundException);
                                                        }
                                                    }
                                                    bl2 = CP_Oq.TELEPORT_VALIDATOR_ENABLED.CP_t();
                                                }
                                                try {
                                                    try {
                                                        if (packetWrapperArray != null) break block58;
                                                        if (!bl2) break block59;
                                                    }
                                                    catch (ClassNotFoundException classNotFoundException) {
                                                        throw CoffeeProtect.a(classNotFoundException);
                                                    }
                                                    pluginManager.registerEvents((Listener)new CP_vF(), (Plugin)this);
                                                }
                                                catch (ClassNotFoundException classNotFoundException) {
                                                    throw CoffeeProtect.a(classNotFoundException);
                                                }
                                            }
                                            bl2 = CP_Oq.ACTION_VALIDATOR_ENABLED.CP_t();
                                        }
                                        try {
                                            try {
                                                if (packetWrapperArray != null) break block60;
                                                if (!bl2) break block61;
                                            }
                                            catch (ClassNotFoundException classNotFoundException) {
                                                throw CoffeeProtect.a(classNotFoundException);
                                            }
                                            pluginManager.registerEvents((Listener)new CP_Cq(this), (Plugin)this);
                                        }
                                        catch (ClassNotFoundException classNotFoundException) {
                                            throw CoffeeProtect.a(classNotFoundException);
                                        }
                                    }
                                    bl2 = CP_Oq.REDSTONE_ENABLED.CP_t();
                                }
                                try {
                                    if (bl2) {
                                        pluginManager.registerEvents((Listener)new CP_Q7(this), (Plugin)this);
                                    }
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    throw CoffeeProtect.a(classNotFoundException);
                                }
                                CP_qF ilIlqF = CP_r7.CP_b().CP_g();
                                try {
                                    try {
                                        ilIlqF.CP_UnderScore(new CP_P_(this));
                                        ilIlqF.CP_UnderScore(new CP_PC(this));
                                        ilIlqF.CP_UnderScore(new CP_PW(this));
                                        bl = CP_Oq.DISABLED_PACKETS_ENABLED.CP_t();
                                        if (packetWrapperArray != null) break block62;
                                        if (!bl) break block63;
                                    }
                                    catch (ClassNotFoundException classNotFoundException) {
                                        throw CoffeeProtect.a(classNotFoundException);
                                    }
                                    ilIlqF.CP_UnderScore(new CP_Pm());
                                }
                                catch (ClassNotFoundException classNotFoundException) {
                                    throw CoffeeProtect.a(classNotFoundException);
                                }
                            }
                            CP_r7.CP_b().CP_R();
                            bl = this.CP_z;
                        }
                        try {
                            if (packetWrapperArray != null) break block64;
                            if (!bl) break block65;
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            throw CoffeeProtect.a(classNotFoundException);
                        }
                        GlobalRegionScheduler globalRegionScheduler = Bukkit.getGlobalRegionScheduler();
                        try {
                            ScheduledTask scheduledTask2;
                            try {
                                globalRegionScheduler.runAtFixedRate((Plugin)this, scheduledTask -> new CP_Qm(this).run(), CP_Oq.CACHE_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)32154, (long)(0x43DEA6425B241E95L ^ l)), CP_Oq.CACHE_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)));
                                scheduledTask2 = globalRegionScheduler.runAtFixedRate((Plugin)this, scheduledTask -> new CP_Z9(this).run(), CP_Oq.PUNISH_VIOLATION_RESET_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)), CP_Oq.PUNISH_VIOLATION_RESET_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)));
                                if (packetWrapperArray != null || !CP_Oq.LOGS_ENABLED.CP_t()) break block66;
                            }
                            catch (ClassNotFoundException classNotFoundException) {
                                throw CoffeeProtect.a(classNotFoundException);
                            }
                            scheduledTask2 = globalRegionScheduler.runAtFixedRate((Plugin)this, scheduledTask -> new CP_Zn(this).run(), CP_Oq.LOGS_QUEUE_TASK_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)), CP_Oq.LOGS_QUEUE_TASK_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)));
                        }
                        catch (ClassNotFoundException classNotFoundException) {
                            throw CoffeeProtect.a(classNotFoundException);
                        }
                    }
                    try {
                        if (packetWrapperArray == null) break block67;
                        PacketWrapper.CP_e(new int[4]);
                    }
                    catch (ClassNotFoundException classNotFoundException) {
                        throw CoffeeProtect.a(classNotFoundException);
                    }
                }
                try {
                    new CP_Qm(this).runTaskTimerAsynchronously((Plugin)this, CP_Oq.CACHE_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)), CP_Oq.CACHE_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)));
                    bukkitTask = new CP_Z9(this).runTaskTimerAsynchronously((Plugin)this, CP_Oq.PUNISH_VIOLATION_RESET_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)), CP_Oq.PUNISH_VIOLATION_RESET_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)));
                    if (packetWrapperArray != null) break block67;
                    bl = CP_Oq.LOGS_ENABLED.CP_t();
                }
                catch (ClassNotFoundException classNotFoundException) {
                    throw CoffeeProtect.a(classNotFoundException);
                }
            }
            try {
                if (bl) {
                    new CP_Zn(this).runTaskTimerAsynchronously((Plugin)this, CP_Oq.LOGS_QUEUE_TASK_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)), CP_Oq.LOGS_QUEUE_TASK_INTERVAL.CP_q() * CoffeeProtect.b("u", (int)15643, (long)(0x3846399B1BFADE15L ^ l)));
                }
            }
            catch (ClassNotFoundException classNotFoundException) {
                throw CoffeeProtect.a(classNotFoundException);
            }
            bukkitTask = new CP_q9(this).runTaskAsynchronously((Plugin)this);
        }
        new Metrics(this, (int)e);
    }

    public void onDisable() {
        block4: {
            block3: {
                PacketWrapper[] packetWrapperArray;
                block2: {
                    long l = a ^ 0x3B725FEAC7D6L;
                    this.CP_W.CP_y();
                    this.CP_r.CP_y();
                    this.CP_Q.CP_y();
                    this.CP_x.CP_y();
                    this.CP_j.CP_y();
                    PacketWrapper[] packetWrapperArray2 = CoffeeProtect.CP_c();
                    this.CP_S.CP_y();
                    this.CP_L.CP_y();
                    packetWrapperArray = packetWrapperArray2;
                    this.CP_g.CP_d();
                    this.CP_n.CP_d();
                    this.CP_n.CP_E();
                    HandlerList.unregisterAll((Plugin)this);
                    CP_r7.CP_b().CP_h();
                    if (packetWrapperArray != null) break block2;
                    if (!this.CP_z) break block3;
                    Bukkit.getGlobalRegionScheduler().cancelTasks((Plugin)this);
                }
                if (packetWrapperArray == null) break block4;
            }
            Bukkit.getScheduler().cancelTasks((Plugin)this);
        }
        CP_C = null;
        CP_i = null;
    }

    public boolean CP_i() {
        return this.CP_z;
    }

    public CP_hO CP_J() {
        return this.CP_M;
    }

    public CP_Xi CP_O() {
        return this.CP_D;
    }

    public CP_Zv CP_m() {
        return this.CP_Y;
    }

    public CP_yQ CP_F() {
        long l = a ^ 0x48AD72D380DL;
        PacketWrapper[] packetWrapperArray = CoffeeProtect.CP_c();
        CoffeeProtect coffeeProtect = this;
        if (packetWrapperArray == null) {
            if (coffeeProtect.CP_D.CP_S()) {
                CP_qb.CP_p();
                return null;
            }
            coffeeProtect = this;
        }
        return coffeeProtect.CP_W;
    }

    public CP_Qf CP_b() {
        return this.CP_x;
    }

    public CP_vm CP_Z() {
        return this.CP_r;
    }

    public CP_iZ CP_c() {
        return this.CP_Q;
    }

    public CP_Pt CP_b() {
        return this.CP_j;
    }

    public CP_P1 CP_z() {
        return this.CP_S;
    }

    public CP_GT CP_R() {
        long l = a ^ 0x1F017EDCE855L;
        if (this.CP_Y.CP_b() || !this.CP_Y.CP_v()) {
            CP_qb.CP_p();
            return null;
        }
        return this.CP_g;
    }

    public CP_fJ CP_v() {
        return this.CP_n;
    }

    public static CoffeeProtect CP_J() {
        return CP_C;
    }

    private static /* synthetic */ void lambda$onLoad$0(Player player) {
        player.kickPlayer(null);
    }

    public static void CP_c(PacketWrapper[] packetWrapperArray) {
        CP_O = packetWrapperArray;
    }

    public static PacketWrapper[] CP_c() {
        return CP_O;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block24: {
                    block21: {
                        block20: {
                            CoffeeProtect.a = CP_s.a(5023090755829758440L, 3815465495907110824L, MethodHandles.lookup().lookupClass()).a(214152152427538L);
                            CoffeeProtect.d = new HashMap<K, V>(13);
                            CoffeeProtect.CP_c(null);
                            var16 = CoffeeProtect.a ^ 4032544685039L;
                            var18_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var16 >>> 56);
                            for (var19_2 = 1; var19_2 < 8; ++var19_2) {
                                v2 = v2;
                                v2[var19_2] = (byte)(var16 << var19_2 * 8 >>> 56);
                            }
                            var18_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var25_3 = new String[10];
                            var23_4 = 0;
                            var22_5 = "\r\u00b0\u00b6\u00c9r\u00e8AD1dB>I6\u00dbp\u00e8\u0087W\u00ffR\u00db\u00cdba\u00ef\u00aa\u00f8\u00bc\u000b\u00d6\u00e1\u00f8\u008ek\u0015R\u00d17:~}\u00ecD\u0002\u0015C\u00c37\u00b36\u0004g\u00f1o\u0005\u00c9 \u0091A\u00fa\u00b4 \u009c\u00c1^\u00d5\u00d9#\u00cc\u0089\u009cx:\u000f\u00ac\u00f0 jjX X\u008f\u00c5\u00a8\u0091;\u00bc\u008c\u00f3\u00b2\u009e\u00ca\u00aa-\u0018\u00e1\u00e4\u008e=\u0085\u00c9'\u00dc\u00b3\n\u0014D$7&\u009a^\u000e\u0094\u00e2\u0081m:\u00ecX0\u00de]\u00ad)\u00f2\u00e8\u00c3\u0082\u00dc\u00baJN\u00af\u00b7\u00f1\u0003E\b\u0082z\u00eb\u00d2\u009fo\u00f6i\u00e9q\u009fbV(\u0012\u00c7^[\u00f5\u00bc@\u0093\u0019\u00d8\u00f2\u00d9\u0082\u008dbD\u001a\u00ba\u001b\u00e1\u00e76\u008a\u008f\"\u000f\u0007\u0007\u009b\u00ee\u000e\u00b9\u00bd\u00d1\u00d0kY\tV\u00db\u00e1\u0004\u0019\u0081W\u00d9&\u00f9\u00c7\u009ee\u00d8E\u009c\u0086 \u00e20\u00cb`s\u0003u\u00eeV\r\u0001K\u009d~\u00fc\u009f\u00b5\u00ce\u00a1~\u00a9+\u00dcZJ\u0086\u008di\u00e9\u00e5\u00b3\f\u0018pQ\u00eb\u00b7\u0001\u00f8\u00f1\u009d\u00c9\u0090\u00f6^\u00b5\u00a5\u00dd\u00ce\u00c5%D\u009e\u00a4L\u00fbK(`DA\u00fb\u00a9\u0010\u00faF\\\u00c01\u00df\u00b33U\u0092\u00f6\u00e4\u0014/\u00a8\u00cc\u00b2\u0086?\u00f7\u007f\u00d6Sf\u0082\u00f0\u00df\u0001X\u00d9\u00ff\u00e2\u00cbn0r\u000b\"@\u0002\u009f\u00de5\u00c5\u00c0\u0014\u00f1\u0007\u00c4p\u00ca\u00edG+H\u00b0\u00e9\u009c=\u00fcn1\u00aa\u00028\b\u000b\u0017kz\u0018\u009cL\u00d9\u00cd\u00a2\u00bb\u00cf\u00d1'l\u00ccjH\u00c8\u00be\u00ce\u00f0/\u00d9\u001fH\u009c\u00a7\u00ac\u00bde\u00ae>l\u001f\u00fc\u00ba\u0086d\u00c8\u00ce\u00e9V\u0002\u00c1\u00c0-\u0013\u00911\u00db\u00bf*2\u00c3\u00eb?\u0017\u00bb\u00ef\u0097\u0099\u000b]\u00e8\u00e9\u00cbk\u001e\u00f6\u001a\u0086\u00fag\u00e5>\u00c0a\u00a9\u00d2\u0091+\u00e45\u00cb\u00be\u0004\u00ef\u0018\u00d8";
                            var24_6 = "\r\u00b0\u00b6\u00c9r\u00e8AD1dB>I6\u00dbp\u00e8\u0087W\u00ffR\u00db\u00cdba\u00ef\u00aa\u00f8\u00bc\u000b\u00d6\u00e1\u00f8\u008ek\u0015R\u00d17:~}\u00ecD\u0002\u0015C\u00c37\u00b36\u0004g\u00f1o\u0005\u00c9 \u0091A\u00fa\u00b4 \u009c\u00c1^\u00d5\u00d9#\u00cc\u0089\u009cx:\u000f\u00ac\u00f0 jjX X\u008f\u00c5\u00a8\u0091;\u00bc\u008c\u00f3\u00b2\u009e\u00ca\u00aa-\u0018\u00e1\u00e4\u008e=\u0085\u00c9'\u00dc\u00b3\n\u0014D$7&\u009a^\u000e\u0094\u00e2\u0081m:\u00ecX0\u00de]\u00ad)\u00f2\u00e8\u00c3\u0082\u00dc\u00baJN\u00af\u00b7\u00f1\u0003E\b\u0082z\u00eb\u00d2\u009fo\u00f6i\u00e9q\u009fbV(\u0012\u00c7^[\u00f5\u00bc@\u0093\u0019\u00d8\u00f2\u00d9\u0082\u008dbD\u001a\u00ba\u001b\u00e1\u00e76\u008a\u008f\"\u000f\u0007\u0007\u009b\u00ee\u000e\u00b9\u00bd\u00d1\u00d0kY\tV\u00db\u00e1\u0004\u0019\u0081W\u00d9&\u00f9\u00c7\u009ee\u00d8E\u009c\u0086 \u00e20\u00cb`s\u0003u\u00eeV\r\u0001K\u009d~\u00fc\u009f\u00b5\u00ce\u00a1~\u00a9+\u00dcZJ\u0086\u008di\u00e9\u00e5\u00b3\f\u0018pQ\u00eb\u00b7\u0001\u00f8\u00f1\u009d\u00c9\u0090\u00f6^\u00b5\u00a5\u00dd\u00ce\u00c5%D\u009e\u00a4L\u00fbK(`DA\u00fb\u00a9\u0010\u00faF\\\u00c01\u00df\u00b33U\u0092\u00f6\u00e4\u0014/\u00a8\u00cc\u00b2\u0086?\u00f7\u007f\u00d6Sf\u0082\u00f0\u00df\u0001X\u00d9\u00ff\u00e2\u00cbn0r\u000b\"@\u0002\u009f\u00de5\u00c5\u00c0\u0014\u00f1\u0007\u00c4p\u00ca\u00edG+H\u00b0\u00e9\u009c=\u00fcn1\u00aa\u00028\b\u000b\u0017kz\u0018\u009cL\u00d9\u00cd\u00a2\u00bb\u00cf\u00d1'l\u00ccjH\u00c8\u00be\u00ce\u00f0/\u00d9\u001fH\u009c\u00a7\u00ac\u00bde\u00ae>l\u001f\u00fc\u00ba\u0086d\u00c8\u00ce\u00e9V\u0002\u00c1\u00c0-\u0013\u00911\u00db\u00bf*2\u00c3\u00eb?\u0017\u00bb\u00ef\u0097\u0099\u000b]\u00e8\u00e9\u00cbk\u001e\u00f6\u001a\u0086\u00fag\u00e5>\u00c0a\u00a9\u00d2\u0091+\u00e45\u00cb\u00be\u0004\u00ef\u0018\u00d8".length();
                            var21_7 = 96;
                            var20_8 = -1;
lbl21:
                            // 2 sources

                            while (true) {
                                v3 = ++var20_8;
                                v4 = var22_5.substring(v3, v3 + var21_7);
                                v5 = -1;
                                break block20;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = CoffeeProtect.a(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                var22_5 = "\u00e4I\u00d1sQP\u00fe4Q\u0000\u008c\u00d0\u009d\u0081F@\u000b_Tz\u0086q\u00c9\u0011H\u0086\u00da\u00df\u00e9\u0002\u0004\u00ec\u00b8>\u00d6D\u00d6\u00b2\u00d8\u000b\u001b\u00c8\u000fo\u0006\u00cb\u0000\u009b\u00cd\u0092\u0004\u00b2\"\u001cU\u00c2\u0018\u00ed'*\u00b4\u001a_\u0083\u00c4\u0089m\u0082\u0096\u0017\u0013\u00f7\u00e2\u000ecB\u0098\u00c8}\u00b0\u0017";
                                var24_6 = "\u00e4I\u00d1sQP\u00fe4Q\u0000\u008c\u00d0\u009d\u0081F@\u000b_Tz\u0086q\u00c9\u0011H\u0086\u00da\u00df\u00e9\u0002\u0004\u00ec\u00b8>\u00d6D\u00d6\u00b2\u00d8\u000b\u001b\u00c8\u000fo\u0006\u00cb\u0000\u009b\u00cd\u0092\u0004\u00b2\"\u001cU\u00c2\u0018\u00ed'*\u00b4\u001a_\u0083\u00c4\u0089m\u0082\u0096\u0017\u0013\u00f7\u00e2\u000ecB\u0098\u00c8}\u00b0\u0017".length();
                                var21_7 = 56;
                                var20_8 = -1;
lbl35:
                                // 2 sources

                                while (true) {
                                    v6 = ++var20_8;
                                    v4 = var22_5.substring(v6, v6 + var21_7);
                                    v5 = 0;
                                    break block20;
                                    break;
                                }
                                break;
                            }
lbl40:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = CoffeeProtect.a(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                break block21;
                                break;
                            }
                        }
                        var26_9 = var18_1.doFinal(v4.getBytes("ISO-8859-1"));
                        switch (v5) {
                            default: {
                                ** continue;
                            }
                            ** case 0:
lbl52:
                            // 1 sources

                            ** continue;
                        }
                    }
                    CoffeeProtect.b = var25_3;
                    CoffeeProtect.c = new String[10];
                    var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v7 = SecretKeyFactory.getInstance("DES");
                    v8 = new byte[8];
                    v9 = v8;
                    v8[0] = (byte)(var16 >>> 56);
                    for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                        v9 = v9;
                        v9[var12_11] = (byte)(var16 << var12_11 * 8 >>> 56);
                    }
                    break block24;
lbl66:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var13_12 = 1346490726488234376L;
                var15_13 = var11_10.doFinal(new byte[]{(byte)(var13_12 >>> 56), (byte)(var13_12 >>> 48), (byte)(var13_12 >>> 40), (byte)(var13_12 >>> 32), (byte)(var13_12 >>> 24), (byte)(var13_12 >>> 16), (byte)(var13_12 >>> 8), (byte)var13_12});
                ** while (true)
                CoffeeProtect.e = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                CoffeeProtect.h = new HashMap<K, V>(13);
                var0_14 = Cipher.getInstance("DES/CBC/NoPadding");
                v10 = SecretKeyFactory.getInstance("DES");
                v11 = new byte[8];
                v12 = v11;
                v11[0] = (byte)(var16 >>> 56);
                for (var1_15 = 1; var1_15 < 8; ++var1_15) {
                    v12 = v12;
                    v12[var1_15] = (byte)(var16 << var1_15 * 8 >>> 56);
                }
                var0_14.init(2, (Key)v10.generateSecret(new DESKeySpec(v12)), new IvParameterSpec(new byte[8]));
                var6_16 = new long[4];
                var3_17 = 0;
                var4_18 = "\u00fdCo\u00b8\r\t\u0012\u00ce\u00f7\u00f9\u001b\u00ee8wB\u00bd";
                var5_19 = "\u00fdCo\u00b8\r\t\u0012\u00ce\u00f7\u00f9\u001b\u00ee8wB\u00bd".length();
                var2_20 = 0;
                while (true) {
                    var7_21 = var4_18.substring(var2_20, var2_20 += 8).getBytes("ISO-8859-1");
                    v13 = var6_16;
                    v14 = var3_17++;
                    v15 = ((long)var7_21[0] & 255L) << 56 | ((long)var7_21[1] & 255L) << 48 | ((long)var7_21[2] & 255L) << 40 | ((long)var7_21[3] & 255L) << 32 | ((long)var7_21[4] & 255L) << 24 | ((long)var7_21[5] & 255L) << 16 | ((long)var7_21[6] & 255L) << 8 | (long)var7_21[7] & 255L;
                    v16 = -1;
                    break block22;
                    break;
                }
lbl100:
                // 1 sources

                while (true) {
                    v13[v14] = v17;
                    if (var2_20 < var5_19) ** continue;
                    var4_18 = "\u00b5\u0019\u00cd\u00f4\u0006\u00a7\\\u0096\u00cb\u0011\u00a3\u00df\u0089\r\u00fc\u00e2";
                    var5_19 = "\u00b5\u0019\u00cd\u00f4\u0006\u00a7\\\u0096\u00cb\u0011\u00a3\u00df\u0089\r\u00fc\u00e2".length();
                    var2_20 = 0;
                    while (true) {
                        var7_21 = var4_18.substring(var2_20, var2_20 += 8).getBytes("ISO-8859-1");
                        v13 = var6_16;
                        v14 = var3_17++;
                        v15 = ((long)var7_21[0] & 255L) << 56 | ((long)var7_21[1] & 255L) << 48 | ((long)var7_21[2] & 255L) << 40 | ((long)var7_21[3] & 255L) << 32 | ((long)var7_21[4] & 255L) << 24 | ((long)var7_21[5] & 255L) << 16 | ((long)var7_21[6] & 255L) << 8 | (long)var7_21[7] & 255L;
                        v16 = 0;
                        break block22;
                        break;
                    }
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v13[v14] = v17;
                    if (var2_20 < var5_19) ** continue;
                    break block23;
                    break;
                }
            }
            var8_22 = v15;
            var10_23 = var0_14.doFinal(new byte[]{(byte)(var8_22 >>> 56), (byte)(var8_22 >>> 48), (byte)(var8_22 >>> 40), (byte)(var8_22 >>> 32), (byte)(var8_22 >>> 24), (byte)(var8_22 >>> 16), (byte)(var8_22 >>> 8), (byte)var8_22});
            v17 = ((long)var10_23[0] & 255L) << 56 | ((long)var10_23[1] & 255L) << 48 | ((long)var10_23[2] & 255L) << 40 | ((long)var10_23[3] & 255L) << 32 | ((long)var10_23[4] & 255L) << 24 | ((long)var10_23[5] & 255L) << 16 | ((long)var10_23[6] & 255L) << 8 | (long)var10_23[7] & 255L;
            switch (v16) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl126:
                // 1 sources

                ** continue;
            }
        }
        CoffeeProtect.f = var6_16;
        CoffeeProtect.g = new Long[4];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4B3C;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CoffeeProtect", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            CoffeeProtect.c[n2] = CoffeeProtect.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CoffeeProtect.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CoffeeProtect" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4D35;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CoffeeProtect", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CoffeeProtect.g[n2] = l4;
        }
        return g[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CoffeeProtect.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CoffeeProtect" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CoffeeProtect.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(CoffeeProtect.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
