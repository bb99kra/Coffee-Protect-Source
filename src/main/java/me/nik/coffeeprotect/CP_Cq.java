/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.block.Block
 *  org.bukkit.block.BlockFace
 *  org.bukkit.block.CreatureSpawner
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.HumanEntity
 *  org.bukkit.entity.Item
 *  org.bukkit.entity.Player
 *  org.bukkit.entity.Projectile
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.Action
 *  org.bukkit.event.block.BlockBreakEvent
 *  org.bukkit.event.block.BlockPlaceEvent
 *  org.bukkit.event.entity.CreatureSpawnEvent
 *  org.bukkit.event.entity.CreatureSpawnEvent$SpawnReason
 *  org.bukkit.event.entity.EntityDamageEvent
 *  org.bukkit.event.entity.EntityDamageEvent$DamageCause
 *  org.bukkit.event.entity.EntityPickupItemEvent
 *  org.bukkit.event.entity.EntityPortalEvent
 *  org.bukkit.event.entity.ProjectileLaunchEvent
 *  org.bukkit.event.entity.SpawnerSpawnEvent
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.event.inventory.InventoryType
 *  org.bukkit.event.player.PlayerBucketEmptyEvent
 *  org.bukkit.event.player.PlayerInteractEvent
 *  org.bukkit.event.player.PlayerLoginEvent
 *  org.bukkit.event.player.PlayerLoginEvent$Result
 *  org.bukkit.event.player.PlayerMoveEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.event.player.PlayerShearEntityEvent
 *  org.bukkit.event.player.PlayerTeleportEvent
 *  org.bukkit.event.vehicle.VehicleEnterEvent
 *  org.bukkit.event.world.ChunkUnloadEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryHolder
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.projectiles.ProjectileSource
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Cz;
import me.nik.coffeeprotect.CP_Li;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_jC;
import me.nik.coffeeprotect.CP_rB;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_vF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.CreatureSpawner;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.HumanEntity;
import org.bukkit.entity.Item;
import org.bukkit.entity.Player;
import org.bukkit.entity.Projectile;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.block.Action;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.event.entity.EntityPickupItemEvent;
import org.bukkit.event.entity.EntityPortalEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.event.entity.SpawnerSpawnEvent;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.event.player.PlayerBucketEmptyEvent;
import org.bukkit.event.player.PlayerInteractEvent;
import org.bukkit.event.player.PlayerLoginEvent;
import org.bukkit.event.player.PlayerMoveEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.event.player.PlayerShearEntityEvent;
import org.bukkit.event.player.PlayerTeleportEvent;
import org.bukkit.event.vehicle.VehicleEnterEvent;
import org.bukkit.event.world.ChunkUnloadEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.projectiles.ProjectileSource;

public class CP_Cq
implements Listener {
    private final CoffeeProtect CP_d;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String mndoidjOao = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Cq(CoffeeProtect coffeeProtect) {
        this.CP_d = coffeeProtect;
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void CP_F(EntityPortalEvent entityPortalEvent) {
        long l = a ^ 0x5823482EC71BL;
        String[] stringArray = CP_vF.CP_o();
        if (!CP_Oq.ACTION_VALIDATOR_DISABLE_CHESTED_ENTITIES_ON_PORTALS.CP_t()) {
            return;
        }
        EntityType entityType = entityPortalEvent.getEntityType();
        int n = CP_rB.CP_t[entityType.ordinal()];
        if (stringArray != null) {
            switch (n) {
                case 1: 
                case 2: 
                case 3: 
                case 4: 
                case 5: {
                    entityPortalEvent.setCancelled(true);
                    return;
                }
            }
            n = entityType.getName().contains((CharSequence)((Object)CP_Cq.a("g", (int)6991, (long)(0x33E3B3AFC0548056L ^ l)))) ? 1 : 0;
        }
        if (n != 0) {
            entityPortalEvent.setCancelled(true);
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_k(BlockPlaceEvent var1_1) {
        block16: {
            block15: {
                block14: {
                    block13: {
                        block11: {
                            block12: {
                                var2_2 = CP_Cq.a ^ 69706146437888L;
                                var4_3 = CP_vF.CP_o();
                                if (!CP_Oq.ACTION_VALIDATOR_DISABLE_AIR_PLACEMENTS.CP_t()) {
                                    return;
                                }
                                var5_4 = var1_1.getBlockPlaced();
                                var6_5 = var5_4.getType();
                                if (var5_4 == null) break block11;
                                v0 = var6_5.isSolid();
                                if (var4_3 == null) break block12;
                                if (!v0) break block11;
                                v0 = CP_Li.CP_z(var6_5.toString(), new String[]{CP_Cq.a("g", (int)9713, (long)(2694874957737337599L ^ var2_2)), CP_Cq.a("g", (int)9370, (long)(4529373517270262678L ^ var2_2))});
                            }
                            if (!v0) break block13;
                        }
                        return;
                    }
                    var7_6 = var1_1.getBlockAgainst();
                    var8_7 = var5_4.getFace(var7_6);
                    if (var8_7 != BlockFace.SELF) {
                        return;
                    }
                    var9_8 = var1_1.getPlayer();
                    var10_9 = var9_8.getItemInHand();
                    var11_10 = CP_jC.CP_Z().CP_R(CP_jC.v1_8_R3) != false ? var9_8.getInventory().getItemInOffHand() : CP_Li.CP_V;
                    v1 = var10_9.getType();
                    v2 = var6_5;
                    if (var4_3 == null) break block14;
                    if (v1 == v2) ** GOTO lbl-1000
                    v1 = var11_10.getType();
                    v2 = var6_5;
                }
                if (v1 == v2) lbl-1000:
                // 2 sources

                {
                    v3 = true;
                } else {
                    v3 = false;
                }
                var12_11 = v3;
                v4 = var5_4.getRelative(BlockFace.DOWN).getType().isSolid();
                if (var4_3 == null) break block15;
                if (v4) break block16;
                v4 = var12_11;
            }
            if (v4) {
                var1_1.setCancelled(true);
            }
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_n(PlayerLoginEvent playerLoginEvent) {
        block2: {
            PlayerLoginEvent playerLoginEvent2;
            long l;
            block3: {
                l = a ^ 0x7200AEB265AEL;
                String[] stringArray = CP_vF.CP_o();
                if (!CP_Oq.ACTION_VALIDATOR_DISABLE_NULL_ADDRESS.CP_t()) break block2;
                playerLoginEvent2 = playerLoginEvent;
                if (stringArray == null) break block3;
                if (playerLoginEvent2.getAddress() != null) break block2;
                playerLoginEvent2 = playerLoginEvent;
            }
            playerLoginEvent2.disallow(PlayerLoginEvent.Result.KICK_OTHER, (String)((Object)CP_Cq.a("g", (int)11001, (long)(0x494314A367A69356L ^ l))));
            CP_rW.CP_U((String)((Object)CP_Cq.a("g", (int)30994, (long)(0x651E4AEB311140B4L ^ l))) + playerLoginEvent.getPlayer().getName() + (String)((Object)CP_Cq.a("g", (int)7094, (long)(0x7B6C74ED74BD2211L ^ l))));
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_H(InventoryClickEvent inventoryClickEvent) {
        block21: {
            CP_TM ilIlTM;
            block23: {
                CP_TM ilIlTM2;
                block24: {
                    String[] stringArray;
                    block22: {
                        ItemStack itemStack;
                        Player player;
                        block20: {
                            ItemStack itemStack2;
                            block19: {
                                block17: {
                                    boolean bl;
                                    block18: {
                                        block16: {
                                            block13: {
                                                block14: {
                                                    Player player2;
                                                    block15: {
                                                        long l = a ^ 0x6D728BDEEA52L;
                                                        stringArray = CP_vF.CP_o();
                                                        HumanEntity humanEntity = inventoryClickEvent.getWhoClicked();
                                                        if (stringArray != null) {
                                                            if (!(humanEntity instanceof Player)) {
                                                                return;
                                                            }
                                                            humanEntity = inventoryClickEvent.getWhoClicked();
                                                        }
                                                        player = (Player)humanEntity;
                                                        bl = CP_Oq.ACTION_VALIDATOR_CLOSE_INVENTORY_ON_UNMATCHED_CLICKS.CP_t();
                                                        if (stringArray == null) break block13;
                                                        if (!bl) break block14;
                                                        player2 = player;
                                                        if (stringArray == null) break block15;
                                                        if (player2.getOpenInventory() == inventoryClickEvent.getView()) break block14;
                                                        player2 = player;
                                                    }
                                                    if (player2.getGameMode() == GameMode.SURVIVAL) {
                                                        inventoryClickEvent.setCancelled(true);
                                                    }
                                                }
                                                bl = CP_Oq.ACTION_VALIDATOR_CLOSE_INVENTORY_ON_ITEM_USE.CP_t();
                                            }
                                            if (stringArray == null) break block16;
                                            if (!bl) break block17;
                                            bl = CP_jC.CP_Z().CP_W(CP_jC.v1_13_R1);
                                        }
                                        if (stringArray == null) break block18;
                                        if (!bl) break block17;
                                        bl = this.CP_d.CP_i();
                                    }
                                    itemStack = itemStack2 = bl ? player.getActiveItem() : player.getItemInUse();
                                    if (stringArray == null) break block19;
                                    if (itemStack == null) break block17;
                                    itemStack = itemStack2;
                                    if (stringArray == null) break block19;
                                    if (!itemStack.getType().isEmpty()) {
                                        inventoryClickEvent.setCancelled(true);
                                    }
                                }
                                itemStack = itemStack2 = player.getItemInHand();
                            }
                            if (stringArray == null) break block20;
                            if (itemStack == null) break block21;
                            itemStack = itemStack2;
                        }
                        if (!CP_Cz.CP_r(itemStack.getType().name(), CP_Cz.BUNDLE)) break block21;
                        ilIlTM = ilIlTM2 = this.CP_d.CP_F().CP_R(player);
                        if (stringArray == null) break block22;
                        if (ilIlTM == null) break block21;
                        ilIlTM = ilIlTM2;
                    }
                    if (stringArray == null) break block23;
                    if (ilIlTM.CP_j() >= CP_Oq.ACTION_VALIDATOR_BUNDLE_USAGE_DELAY.CP_q()) break block24;
                    inventoryClickEvent.setCancelled(true);
                    if (stringArray != null) break block21;
                }
                ilIlTM = ilIlTM2;
            }
            ilIlTM.CP_L();
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_P(PlayerInteractEvent playerInteractEvent) {
        block7: {
            CP_TM ilIlTM;
            block9: {
                CP_TM ilIlTM2;
                block10: {
                    String[] stringArray;
                    block8: {
                        Block block;
                        long l = a ^ 0x7D9B4D7D59C3L;
                        stringArray = CP_vF.CP_o();
                        PlayerInteractEvent playerInteractEvent2 = playerInteractEvent;
                        if (stringArray != null) {
                            if (playerInteractEvent2.getAction() != Action.RIGHT_CLICK_BLOCK) {
                                return;
                            }
                            playerInteractEvent2 = playerInteractEvent;
                        }
                        Block block2 = block = playerInteractEvent2.getClickedBlock();
                        if (stringArray != null) {
                            if (block2 == null) {
                                return;
                            }
                            block2 = block;
                        }
                        if (!CP_Cz.CP_r(block2.getType().toString(), CP_Cz.CONTAINER)) break block7;
                        ilIlTM = ilIlTM2 = this.CP_d.CP_F().CP_R(playerInteractEvent.getPlayer());
                        if (stringArray == null) break block8;
                        if (ilIlTM == null) break block7;
                        ilIlTM = ilIlTM2;
                    }
                    if (stringArray == null) break block9;
                    if (ilIlTM.CP_h() >= CP_Oq.ACTION_VALIDATOR_CONTAINER_OPEN_DELAY.CP_q()) break block10;
                    playerInteractEvent.setCancelled(true);
                    if (stringArray != null) break block7;
                }
                ilIlTM = ilIlTM2;
            }
            ilIlTM.CP_E();
        }
    }

    /*
     * Unable to fully structure code
     */
    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void CP_A(EntityPickupItemEvent var1_1) {
        var2_2 = CP_Cq.a ^ 106955396059340L;
        var4_3 = CP_vF.CP_o();
        v0 = CP_rB.CP_t[var1_1.getEntityType().ordinal()];
        if (var4_3 == null) ** GOTO lbl8
        switch (v0) {
            case 6: {
                v0 = (int)CP_Oq.ACTION_VALIDATOR_EJECT_ALLAYS_ON_VEHICLES.CP_t();
lbl8:
                // 2 sources

                if (var4_3 != null) {
                    if (v0 == 0) break;
                    v0 = (int)var1_1.getEntity().isInsideVehicle();
                }
                if (var4_3 != null) {
                    if (v0 == 0) break;
                    v0 = (int)var1_1.getEntity().leaveVehicle();
                }
                var1_1.setCancelled(true);
                if (var4_3 != null) break;
            }
            case 7: {
                if (!CP_Oq.ACTION_VALIDATOR_DISABLE_PIGLIN_TRADING.CP_t()) break;
                var1_1.setCancelled(true);
                var1_1.getEntity().setCanPickupItems(false);
            }
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_q(PlayerShearEntityEvent playerShearEntityEvent) {
        block7: {
            CP_TM ilIlTM;
            block5: {
                CP_TM ilIlTM2;
                block6: {
                    long l = a ^ 0x67B727AB0FC2L;
                    ilIlTM2 = this.CP_d.CP_F().CP_R(playerShearEntityEvent.getPlayer());
                    String[] stringArray = CP_vF.CP_o();
                    ilIlTM = ilIlTM2;
                    if (stringArray != null) {
                        if (ilIlTM == null) {
                            return;
                        }
                        ilIlTM = ilIlTM2;
                    }
                    if (stringArray == null) break block5;
                    if (ilIlTM.CP_C() > CP_Oq.ACTION_VALIDATOR_SHEAR_DELAY.CP_q()) break block6;
                    playerShearEntityEvent.setCancelled(true);
                    if (stringArray != null) break block7;
                }
                ilIlTM = ilIlTM2;
            }
            ilIlTM.CP_d();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_V(VehicleEnterEvent var1_1) {
        var2_2 = CP_Cq.a ^ 48717094982700L;
        var4_3 = CP_vF.CP_o();
        v0 = CP_Oq.ACTION_VALIDATOR_INVALID_VEHICLE.CP_t();
        if (var4_3 != null) {
            if (v0 != 0) {
                var1_1.setCancelled(this.CP_M((Entity)var1_1.getVehicle()));
            }
            v0 = CP_rB.CP_t[var1_1.getEntered().getType().ordinal()];
        }
        if (var4_3 == null) ** GOTO lbl12
        switch (v0 ? 1 : 0) {
            case 6: {
                v0 = CP_Oq.ACTION_VALIDATOR_EJECT_ALLAYS_ON_VEHICLES.CP_t();
lbl12:
                // 2 sources

                if (v0 == 0) break;
                var1_1.setCancelled(true);
            }
        }
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void CP_g(PlayerMoveEvent playerMoveEvent) {
        block8: {
            long l;
            Player player;
            long l2;
            block11: {
                long l3;
                Object object;
                String[] stringArray;
                block10: {
                    Object object2;
                    boolean bl;
                    block9: {
                        block7: {
                            block4: {
                                block5: {
                                    block6: {
                                        l2 = a ^ 0x51E18BE1FBF4L;
                                        player = playerMoveEvent.getPlayer();
                                        stringArray = CP_vF.CP_o();
                                        bl = CP_Oq.ACTION_VALIDATOR_INVALID_VEHICLE.CP_t();
                                        if (stringArray == null) break block4;
                                        if (!bl) break block5;
                                        bl = player.isInsideVehicle();
                                        if (stringArray == null) break block4;
                                        if (!bl) break block5;
                                        object2 = player.getVehicle();
                                        if (object2 == null) break block6;
                                        bl = this.CP_M((Entity)object2);
                                        if (stringArray == null) break block4;
                                        if (!bl) break block5;
                                    }
                                    player.leaveVehicle();
                                }
                                bl = CP_Oq.ACTION_VALIDATOR_INVALID_PLAYER_STATUS.CP_t();
                            }
                            if (stringArray == null) break block7;
                            if (!bl) break block8;
                            bl = player.isDead();
                        }
                        if (stringArray == null) break block9;
                        if (bl) break block8;
                        bl = player.isValid();
                    }
                    if (bl) break block8;
                    object = object2 = this.CP_d.CP_F().CP_R(playerMoveEvent.getPlayer());
                    if (stringArray == null) break block10;
                    if (object == null) break block8;
                    object = object2;
                }
                l = (l3 = ((CP_TM)object).CP_S() - e) == 0L ? 0 : (l3 < 0L ? -1 : 1);
                if (stringArray == null) break block11;
                if (l <= 0) break block8;
                player.kickPlayer((String)((Object)CP_Cq.a("g", (int)29799, (long)(0x82F4157C0BED398L ^ l2))));
                l = 1;
            }
            String[] stringArray = new String[l];
            stringArray[0] = (String)((Object)CP_Cq.a("g", (int)13859, (long)(0x7339B9522F4891DDL ^ l2))) + player.getName() + (String)((Object)CP_Cq.a("g", (int)31162, (long)(0xF07A7CC29BDDE4AL ^ l2)));
            CP_rW.CP_U(stringArray);
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_G(CreatureSpawnEvent creatureSpawnEvent) {
        long l = a ^ 0x77F83D155E5CL;
        if (!CP_Oq.ACTION_VALIDATOR_INVALID_EGG_SPAWNS.CP_t()) {
            return;
        }
        if (creatureSpawnEvent.getSpawnReason() == CreatureSpawnEvent.SpawnReason.SPAWNER_EGG && this.CP_d(creatureSpawnEvent.getEntityType())) {
            creatureSpawnEvent.setCancelled(true);
            Location location = creatureSpawnEvent.getLocation();
            CP_rW.CP_U((String)((Object)CP_Cq.a("g", (int)25548, (long)(0x51CD42CC3319E193L ^ l))) + location.getX() + (String)((Object)CP_Cq.a("g", (int)644, (long)(0x1142858528D480D8L ^ l))) + location.getY() + (String)((Object)CP_Cq.a("g", (int)19397, (long)(0x738121840D7CC994L ^ l))) + location.getZ());
        }
    }

    private boolean CP_d(EntityType entityType) {
        long l = a ^ 0xC17453648AL;
        String[] stringArray = CP_vF.CP_o();
        boolean bl = CP_rB.CP_t[entityType.ordinal()];
        if (stringArray != null) {
            switch (bl) {
                case 8: 
                case 9: 
                case 10: 
                case 11: 
                case 12: 
                case 13: 
                case 14: 
                case 15: 
                case 16: 
                case 17: 
                case 18: 
                case 19: 
                case 20: 
                case 21: 
                case 22: 
                case 23: 
                case 24: 
                case 25: 
                case 26: 
                case 27: 
                case 28: 
                case 29: 
                case 30: 
                case 31: 
                case 32: 
                case 33: 
                case 34: 
                case 35: 
                case 36: 
                case 37: 
                case 38: 
                case 39: 
                case 40: 
                case 41: 
                case 42: 
                case 43: 
                case 44: 
                case 45: 
                case 46: 
                case 47: 
                case 48: 
                case 49: {
                    return true;
                }
            }
            bl = false;
        }
        return bl;
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_H(SpawnerSpawnEvent spawnerSpawnEvent) {
        block5: {
            CreatureSpawner creatureSpawner;
            long l;
            block6: {
                CreatureSpawner creatureSpawner2;
                l = a ^ 0xFDAF674F361L;
                String[] stringArray = CP_vF.CP_o();
                boolean bl = CP_Oq.ACTION_VALIDATOR_DESTROY_INVALID_SPAWNERS.CP_t();
                if (stringArray != null) {
                    if (!bl) {
                        return;
                    }
                    bl = this.CP_d(spawnerSpawnEvent.getEntityType());
                }
                if (!bl) break block5;
                spawnerSpawnEvent.setCancelled(true);
                creatureSpawner = creatureSpawner2 = spawnerSpawnEvent.getSpawner();
                if (stringArray == null) break block6;
                if (creatureSpawner == null) break block5;
                creatureSpawner2.getBlock().setType(Material.AIR);
                creatureSpawner = creatureSpawner2;
            }
            Location location = creatureSpawner.getLocation();
            CP_rW.CP_U((String)((Object)CP_Cq.a("g", (int)15489, (long)(0x1D6BDC6BCD6113E7L ^ l))) + location.getX() + (String)((Object)CP_Cq.a("g", (int)25429, (long)(0x278A3EE178E9CC31L ^ l))) + location.getY() + (String)((Object)CP_Cq.a("g", (int)28159, (long)(0x3ED9E4E4B7D2C28EL ^ l))) + location.getZ());
        }
    }

    @EventHandler(priority=EventPriority.MONITOR)
    private void CP_h(PlayerQuitEvent playerQuitEvent) {
        boolean bl;
        String[] stringArray;
        Player player;
        block6: {
            block7: {
                Entity entity;
                block8: {
                    long l = a ^ 0x5A7525FAB8BL;
                    player = playerQuitEvent.getPlayer();
                    stringArray = CP_vF.CP_o();
                    bl = CP_Oq.ACTION_VALIDATOR_EJECT_VEHICLE_ON_QUIT.CP_t();
                    if (stringArray == null) break block6;
                    if (!bl) break block7;
                    entity = player.getVehicle();
                    if (stringArray == null) break block8;
                    if (entity == null) break block7;
                    entity = player.getVehicle();
                }
                entity.eject();
            }
            bl = CP_Oq.ACTION_VALIDATOR_CLOSE_VEHICLE_INVENTORY_ON_QUIT.CP_t();
        }
        if (stringArray != null) {
            if (bl) {
                this.CP_X(player.getVehicle());
            }
            bl = CP_Oq.ACTION_VALIDATOR_CLOSE_INVENTORY_ON_QUIT.CP_t();
        }
        if (bl) {
            this.CP_b(player);
        }
    }

    private void CP_X(Entity entity) {
        block4: {
            Inventory inventory;
            String[] stringArray;
            block5: {
                Inventory inventory2;
                Entity entity2;
                block3: {
                    long l = a ^ 0x89134136A5CL;
                    stringArray = CP_vF.CP_o();
                    entity2 = entity;
                    if (stringArray == null) break block3;
                    if (!(entity2 instanceof InventoryHolder)) break block4;
                    entity2 = entity;
                }
                inventory = inventory2 = ((InventoryHolder)entity2).getInventory();
                if (stringArray == null) break block5;
                if (inventory == null) break block4;
                inventory = inventory2;
            }
            for (HumanEntity humanEntity : inventory.getViewers()) {
                humanEntity.closeInventory();
                if (stringArray != null) continue;
            }
        }
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void CP_t(ChunkUnloadEvent chunkUnloadEvent) {
        long l = a ^ 0x7043CE958A55L;
        String[] stringArray = CP_vF.CP_o();
        if (CP_Oq.ACTION_VALIDATOR_CLOSE_INVENTORY_ON_CHUNK_UNLOAD.CP_t()) {
            for (Entity entity : chunkUnloadEvent.getChunk().getEntities()) {
                this.CP_X(entity);
                if (stringArray != null) continue;
            }
        }
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void CP_A(BlockBreakEvent blockBreakEvent) {
        long l = a ^ 0x3433A852FA53L;
        if (CP_Oq.ACTION_VALIDATOR_CLOSE_INVENTORY_ON_BLOCK_BREAK.CP_t()) {
            this.CP_b(blockBreakEvent.getPlayer());
        }
    }

    @EventHandler(priority=EventPriority.MONITOR)
    public void CP_P(PlayerTeleportEvent playerTeleportEvent) {
        long l = a ^ 0x51FC5C13BDD2L;
        if (CP_Oq.ACTION_VALIDATOR_CLOSE_INVENTORY_ON_TELEPORT.CP_t()) {
            this.CP_b(playerTeleportEvent.getPlayer());
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_l(EntityDamageEvent entityDamageEvent) {
        block3: {
            EntityDamageEvent entityDamageEvent2;
            Item item;
            block8: {
                int n;
                block7: {
                    EntityDamageEvent entityDamageEvent3;
                    String[] stringArray;
                    block5: {
                        block6: {
                            block4: {
                                boolean bl;
                                block2: {
                                    long l = a ^ 0x670B57452A9EL;
                                    stringArray = CP_vF.CP_o();
                                    bl = CP_Oq.ACTION_VALIDATOR_DISABLE_BUNDLE_EXPLOSION_DROPS.CP_t();
                                    if (stringArray == null) break block2;
                                    if (!bl) break block3;
                                    entityDamageEvent3 = entityDamageEvent;
                                    if (stringArray == null) break block4;
                                    bl = entityDamageEvent3.getEntity() instanceof Item;
                                }
                                if (!bl) break block3;
                                entityDamageEvent3 = entityDamageEvent;
                            }
                            if (stringArray == null) break block5;
                            if (entityDamageEvent3.getCause() == EntityDamageEvent.DamageCause.BLOCK_EXPLOSION) break block6;
                            entityDamageEvent3 = entityDamageEvent;
                            if (stringArray == null) break block5;
                            if (entityDamageEvent3.getCause() != EntityDamageEvent.DamageCause.ENTITY_EXPLOSION) break block3;
                        }
                        entityDamageEvent3 = entityDamageEvent;
                    }
                    item = (Item)entityDamageEvent3.getEntity();
                    n = CP_Cz.CP_r(item.getItemStack().getType().name(), CP_Cz.BUNDLE);
                    if (stringArray == null) break block7;
                    if (n == 0) break block3;
                    entityDamageEvent2 = entityDamageEvent;
                    if (stringArray == null) break block8;
                    double d = entityDamageEvent2.getFinalDamage() - (double)item.getHealth();
                    n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                }
                if (n < 0) break block3;
                entityDamageEvent2 = entityDamageEvent;
            }
            entityDamageEvent2.setCancelled(true);
            item.remove();
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_t(PlayerBucketEmptyEvent playerBucketEmptyEvent) {
        block2: {
            int n;
            Player player;
            long l;
            block3: {
                l = a ^ 0x519E3805DC16L;
                String[] stringArray = CP_vF.CP_o();
                if (!CP_Oq.ACTION_VALIDATOR_DISABLE_BUCKET_PLACING_NEAR_END_PORTALS.CP_t()) break block2;
                player = playerBucketEmptyEvent.getPlayer();
                n = CP_Cz.CP_r(playerBucketEmptyEvent.getBlockClicked().getRelative(playerBucketEmptyEvent.getBlockFace()).getType().name(), CP_Cz.END_PORTAL);
                if (stringArray == null) break block3;
                if (n == 0) break block2;
                playerBucketEmptyEvent.setCancelled(true);
                player.updateInventory();
                n = 1;
            }
            String[] stringArray = new String[n];
            stringArray[0] = (String)((Object)CP_Cq.a("g", (int)17642, (long)(0x62F7C43E31C244FAL ^ l))) + player.getName();
            CP_rW.CP_U(stringArray);
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void CP_e(ProjectileLaunchEvent projectileLaunchEvent) {
        block8: {
            int n;
            ProjectileSource projectileSource;
            long l;
            block7: {
                l = a ^ 0x2EDC15218F4DL;
                Projectile projectile = projectileLaunchEvent.getEntity();
                String[] stringArray = CP_vF.CP_o();
                Projectile projectile2 = projectile;
                if (stringArray != null) {
                    if (projectile2 == null) {
                        return;
                    }
                    projectile2 = projectile;
                }
                projectileSource = projectile2.getShooter();
                n = projectileSource instanceof Player;
                if (stringArray != null) {
                    if (n == 0) {
                        return;
                    }
                    double d = projectile.getVelocity().lengthSquared() - CP_Oq.ACTION_VALIDATOR_MAXIMUM_PROJECTILE_VELOCITY.CP_x();
                    n = d == 0.0 ? 0 : (d > 0.0 ? 1 : -1);
                }
                if (stringArray == null) break block7;
                if (n <= 0) break block8;
                projectileLaunchEvent.setCancelled(true);
                n = 1;
            }
            String[] stringArray = new String[n];
            stringArray[0] = (String)((Object)CP_Cq.a("g", (int)28756, (long)(0x7E5CB50414902316L ^ l))) + ((Player)projectileSource).getName();
            CP_rW.CP_U(stringArray);
        }
    }

    private void CP_b(Player player) {
        block5: {
            InventoryType inventoryType;
            InventoryType inventoryType2;
            block6: {
                InventoryType inventoryType3;
                Player player2;
                String[] stringArray;
                block4: {
                    long l = a ^ 0x639D7DC6E0D2L;
                    stringArray = CP_vF.CP_o();
                    player2 = player;
                    if (stringArray == null) break block4;
                    if (player2 == null) break block5;
                    player2 = player;
                }
                inventoryType2 = inventoryType3 = player2.getOpenInventory().getType();
                inventoryType = InventoryType.PLAYER;
                if (stringArray == null) break block6;
                if (inventoryType2 == inventoryType) break block5;
                inventoryType2 = inventoryType3;
                inventoryType = InventoryType.CREATIVE;
            }
            if (inventoryType2 != inventoryType) {
                player.closeInventory();
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean CP_M(Entity entity) {
        long l = a ^ 0x3BC457DE56B9L;
        String[] stringArray = CP_vF.CP_o();
        boolean bl = entity.getLocation().getChunk().isLoaded();
        if (stringArray == null) return bl;
        if (!bl) return true;
        bl = entity.isDead();
        if (stringArray == null) return bl;
        if (bl) return true;
        bl = entity.isValid();
        if (stringArray == null) return bl;
        if (bl) return false;
        return true;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_Cq.a = CP_s.a(5601754109604326189L, -4986783414903858980L, MethodHandles.lookup().lookupClass()).a(125053902379112L);
                    CP_Cq.d = new HashMap<K, V>(13);
                    var5 = CP_Cq.a ^ 102940628898470L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[17];
                    var12_4 = 0;
                    var11_5 = "\u00c1'\u00c6\u00af\u00c9/\u00b8\u0083\u0001u6\u00b4\u001e\u00ce\u008a\u00e2 {\u00e2\u00e4L\u001dq\u00b0\u000e\u00f8\u00dbW/\u0000\u0086\u0017C\u00dd o-\u00e9C\u00ffW(gG\u00fbk\u0094\u00c6\u0006 \u00e4L\u00bb!\u00f9\u001f4\u00b4\u00f1\u0010\u00f4w\u00a1is\u0015_^9\u0012Y\u0084\u0097\u0005\u0018\u00a3\u0018\u0097m\u00a0u\u001b@d\f\u0018\u008e\u0089\u00f3v\u001bg:\u00df\u00dci\u0001\u0090\u00e7\u00bbH\u00f4a)\u00e6\u00ce\b\u00cb9\u00f5I`\u0014Jr\u0086*Jnl\u0018)\u00ce\u00ec\u00bd\u00e8\f%\u00aa\u00b3\u00c4\u0018_\u00f7{\u00c5\"\u00f1\u00fc\u000f\u00a0\u000eZ(\u008d\u0098\u000f8/\u0098&\u00a5\u00bb\u00cf'j\u00e8f\u001ct\u00c4\u00cbt\u00e3\u0019B\u000bl\u00bbTx\u00d9\u00e6W]\u00f4i\u0012{\u0084\u00aa\u00ac^\u00a5\u0011\u00ca\u00ba\\\u0018\u00ad\u009d\u00ae\u0017,\u0085\u0084\u00a6\u0086+\u00ad\u0000\u009f\u00b3\u009e\u0010\u0013W\u00a8\u00a3j]\u00cf-W\u00fb3\u0085z\u00d1\u0080yP\u0094\u00aa\u00e3@>@\u00eb\u000e+\u009e\u0014?\u00bd\u000f\t\u008b\u00df&?\u0001\u0017\u00d8\u00b5Pl#\u00a1\u0095\b\u00eaa'\b\u0001\u00cf\u0090`_L\u00e4\u00af\u00dd\u00c12v\u008dy2\u00fd\u00a5\u00e1i\u000eo\u00c3\u00a7\u00ad\u008b\u0018\u00cb\u00dd\u00efXm\u0019\u0091\u00aaN\u00ec\u0016\u00f7;!\u0011\u00b0/\u0019\u00be\u00de\u00c4@u\u00dbB)\u00db\u0012Ra\u00dah\u00ab\u0095\u00b8S\u00e0\u0096\u000f\u00ab7\u0097\u00c5\u001a\"n\u00f5\u00a6\u008c\u00b8\u00da\u00bb\u00bf\u0098\u0092 z:3G\u00b7\u00bb}\u00ba\u0017'}\u00e5t\ri\u00c0&D\u0092^\u00b7\u00e6'\"5fG\u00a5\u0019\u00ad\u0018\u00d1\u00ben\u00a0w~\u0090\u00c7;\u00a1-\u0093\u009d\u0007\u0082!\u00a8`\u00afs\u0090\u00c8*:(\u0012\u00a5J\u0002\u00d9\u0002U\u001d\u00d9\u00b4\u00cd'\u00b0\u0088\u00fd\u0094E\u00d5\u0000{\u0098\u009dV\u0001\u008d\u00f9MgL\u00aa\u00a7\u00ea8,\u00afz}t\u00ae-\u0010\u00ab\u0016\u00ad_\u0005W\u00d4\u0090\u00d9\f\u0082\u00dc\u00a9\u00ab\u0017W\u0018\u00b5\u008a[\u00f5\u00c9]\u0017\u00d1L`,~E\u0098\u001c\u000b<\u00f4o9>\u0005\tw\u0010\u00a6\u009dn5r\u00c0g\u000f\u00aa\u00d9H\u00d5\u008f\u00888V\u0010\u00a8\u00e5\u00e2|\u001c~\u00d0\u00028\u00c6\u00c3\u00ba\u00a3\u00a3\u008b\u000f\u0010$\u00fdY/RsJm\u00bfO\u00fc\u00c9\u00e1E\u0089~";
                    var13_6 = "\u00c1'\u00c6\u00af\u00c9/\u00b8\u0083\u0001u6\u00b4\u001e\u00ce\u008a\u00e2 {\u00e2\u00e4L\u001dq\u00b0\u000e\u00f8\u00dbW/\u0000\u0086\u0017C\u00dd o-\u00e9C\u00ffW(gG\u00fbk\u0094\u00c6\u0006 \u00e4L\u00bb!\u00f9\u001f4\u00b4\u00f1\u0010\u00f4w\u00a1is\u0015_^9\u0012Y\u0084\u0097\u0005\u0018\u00a3\u0018\u0097m\u00a0u\u001b@d\f\u0018\u008e\u0089\u00f3v\u001bg:\u00df\u00dci\u0001\u0090\u00e7\u00bbH\u00f4a)\u00e6\u00ce\b\u00cb9\u00f5I`\u0014Jr\u0086*Jnl\u0018)\u00ce\u00ec\u00bd\u00e8\f%\u00aa\u00b3\u00c4\u0018_\u00f7{\u00c5\"\u00f1\u00fc\u000f\u00a0\u000eZ(\u008d\u0098\u000f8/\u0098&\u00a5\u00bb\u00cf'j\u00e8f\u001ct\u00c4\u00cbt\u00e3\u0019B\u000bl\u00bbTx\u00d9\u00e6W]\u00f4i\u0012{\u0084\u00aa\u00ac^\u00a5\u0011\u00ca\u00ba\\\u0018\u00ad\u009d\u00ae\u0017,\u0085\u0084\u00a6\u0086+\u00ad\u0000\u009f\u00b3\u009e\u0010\u0013W\u00a8\u00a3j]\u00cf-W\u00fb3\u0085z\u00d1\u0080yP\u0094\u00aa\u00e3@>@\u00eb\u000e+\u009e\u0014?\u00bd\u000f\t\u008b\u00df&?\u0001\u0017\u00d8\u00b5Pl#\u00a1\u0095\b\u00eaa'\b\u0001\u00cf\u0090`_L\u00e4\u00af\u00dd\u00c12v\u008dy2\u00fd\u00a5\u00e1i\u000eo\u00c3\u00a7\u00ad\u008b\u0018\u00cb\u00dd\u00efXm\u0019\u0091\u00aaN\u00ec\u0016\u00f7;!\u0011\u00b0/\u0019\u00be\u00de\u00c4@u\u00dbB)\u00db\u0012Ra\u00dah\u00ab\u0095\u00b8S\u00e0\u0096\u000f\u00ab7\u0097\u00c5\u001a\"n\u00f5\u00a6\u008c\u00b8\u00da\u00bb\u00bf\u0098\u0092 z:3G\u00b7\u00bb}\u00ba\u0017'}\u00e5t\ri\u00c0&D\u0092^\u00b7\u00e6'\"5fG\u00a5\u0019\u00ad\u0018\u00d1\u00ben\u00a0w~\u0090\u00c7;\u00a1-\u0093\u009d\u0007\u0082!\u00a8`\u00afs\u0090\u00c8*:(\u0012\u00a5J\u0002\u00d9\u0002U\u001d\u00d9\u00b4\u00cd'\u00b0\u0088\u00fd\u0094E\u00d5\u0000{\u0098\u009dV\u0001\u008d\u00f9MgL\u00aa\u00a7\u00ea8,\u00afz}t\u00ae-\u0010\u00ab\u0016\u00ad_\u0005W\u00d4\u0090\u00d9\f\u0082\u00dc\u00a9\u00ab\u0017W\u0018\u00b5\u008a[\u00f5\u00c9]\u0017\u00d1L`,~E\u0098\u001c\u000b<\u00f4o9>\u0005\tw\u0010\u00a6\u009dn5r\u00c0g\u000f\u00aa\u00d9H\u00d5\u008f\u00888V\u0010\u00a8\u00e5\u00e2|\u001c~\u00d0\u00028\u00c6\u00c3\u00ba\u00a3\u00a3\u008b\u000f\u0010$\u00fdY/RsJm\u00bfO\u00fc\u00c9\u00e1E\u0089~".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl25:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = CP_Cq.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "k\u0018\u00e4\u00c6\u0012>\u00f7\u00a3\u00c9\u00d5\u0080\u007fz{W\u0085\u008a\u0087%\u0090\u0086\u00c2\u0080\u00c0p9hq\u0086\u0083\u0001\u0015\u0005$\u00dac\u00f0\u0083\u0094\u00ab\u0090J\u00a0\u0010G|\u001d=\u00d6\u0083\u0000\u0082\u00e3o\u00cf\u00cf\u0099\u0080\u00f8V\u00c7\u00fbHZ\u00a1\u00d8X\u00ce\u00d5\u00b6%\u00cc\u00d3\u00d7\u0096Gw>\u00c8\u0082\u0010a;\u00e7C\u007f\u00a3\u00c1wd\u00e7W1:\u0080 \u008f";
                        var13_6 = "k\u0018\u00e4\u00c6\u0012>\u00f7\u00a3\u00c9\u00d5\u0080\u007fz{W\u0085\u008a\u0087%\u0090\u0086\u00c2\u0080\u00c0p9hq\u0086\u0083\u0001\u0015\u0005$\u00dac\u00f0\u0083\u0094\u00ab\u0090J\u00a0\u0010G|\u001d=\u00d6\u0083\u0000\u0082\u00e3o\u00cf\u00cf\u0099\u0080\u00f8V\u00c7\u00fbHZ\u00a1\u00d8X\u00ce\u00d5\u00b6%\u00cc\u00d3\u00d7\u0096Gw>\u00c8\u0082\u0010a;\u00e7C\u007f\u00a3\u00c1wd\u00e7W1:\u0080 \u008f".length();
                        var10_7 = 80;
                        var9_8 = -1;
lbl34:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl39:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = CP_Cq.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl51:
                    // 1 sources

                    ** continue;
                }
            }
            CP_Cq.b = var14_3;
            CP_Cq.c = new String[17];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl65:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 3478700414899009490L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_Cq.e = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4AEA;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Cq", exception);
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
            CP_Cq.c[n2] = CP_Cq.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Cq.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Cq" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Cq.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
