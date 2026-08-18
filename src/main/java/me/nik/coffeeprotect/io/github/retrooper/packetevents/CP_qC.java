/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.GameMode
 *  org.bukkit.Location
 *  org.bukkit.Material
 *  org.bukkit.World
 *  org.bukkit.block.data.BlockData
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.Pose
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.MainHand
 *  org.bukkit.material.MaterialData
 *  org.bukkit.potion.PotionEffectType
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.CP_qX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_nm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.type.CP_Gt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.type.CP_QP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.type.CP_Lo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_Oh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_jY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_QL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_Xx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Pu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_iP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_iN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_nq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.CP_d_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.SimpleTypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Lg;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import org.bukkit.Bukkit;
import org.bukkit.GameMode;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Pose;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.MainHand;
import org.bukkit.material.MaterialData;
import org.bukkit.potion.PotionEffectType;

public final class CP_qC {
    private static final long a = CP_s.a(-4066280008938196712L, -2400664892051433931L, MethodHandles.lookup().lookupClass()).a(202189980878356L);
    private static final String b;
    private static transient /* synthetic */ String hmgiolfKKs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_qC() {
    }

    public static CP_iP CP_g(Location location) {
        return new CP_iP(location.getX(), location.getY(), location.getZ(), location.getYaw(), location.getPitch());
    }

    public static Location CP_p(World world, CP_iP ilIliP) {
        return new Location(world, ilIliP.CP_m(), ilIliP.CP_h(), ilIliP.CP_R(), ilIliP.CP_H(), ilIliP.CP_P());
    }

    public static CP_QL CP_D(PotionEffectType potionEffectType) {
        long l = a ^ 0xB6ED74C1B21L;
        ServerVersion serverVersion = CP_r7.CP_b().CP_q().CP_F();
        PacketWrapper[] packetWrapperArray = CP_Lg.CP_w();
        int n = potionEffectType.getId();
        int n2 = serverVersion.CP_z(ServerVersion.V_1_20_2);
        if (packetWrapperArray == null) {
            if (n2 != 0) {
                // empty if block
            }
            n2 = --n;
        }
        return CP_Xx.CP_z(n2, serverVersion);
    }

    public static PotionEffectType CP_D(CP_QL ilIlQL) {
        long l = a ^ 0x212AABC4CABFL;
        ClientVersion clientVersion = CP_r7.CP_b().CP_q().CP_F().CP_E();
        PacketWrapper[] packetWrapperArray = CP_Lg.CP_w();
        int n = ilIlQL.CP_H(clientVersion);
        int n2 = clientVersion.CP_w(ClientVersion.V_1_20_2);
        if (packetWrapperArray == null) {
            if (n2 != 0) {
                // empty if block
            }
            n2 = ++n;
        }
        return PotionEffectType.getById((int)n2);
    }

    public static CP_jY CP_j(GameMode gameMode) {
        return CP_jY.CP_E(gameMode.getValue());
    }

    public static GameMode CP_S(CP_jY ilIljY) {
        return GameMode.getByValue((int)ilIljY.CP_i());
    }

    public static CP_d_ CP_A(BlockData blockData) {
        String string = blockData.getAsString(false);
        return CP_d_.CP_E(CP_r7.CP_b().CP_q().CP_F().CP_E(), string);
    }

    public static BlockData CP_o(CP_d_ ilIld_) {
        return Bukkit.createBlockData((String)ilIld_.toString());
    }

    public static CP_Gt CP_J(EntityType entityType) {
        long l = a ^ 0x4448C1650555L;
        ServerVersion serverVersion = CP_r7.CP_b().CP_q().CP_F();
        PacketWrapper[] packetWrapperArray = CP_Lg.CP_w();
        int n = serverVersion.CP_z(ServerVersion.V_1_14);
        if (packetWrapperArray == null) {
            if (n != 0) {
                return CP_QP.CP_s(entityType.getKey().toString());
            }
            n = serverVersion.CP_z(ServerVersion.V_1_13);
        }
        if (packetWrapperArray == null) {
            if (n != 0) {
                return CP_QP.CP_s(b + entityType.getName());
            }
            n = entityType.getTypeId();
        }
        if (n == -1) {
            return null;
        }
        return CP_QP.CP_P(serverVersion.CP_E(), entityType.getTypeId());
    }

    public static EntityType CP_I(CP_Gt ilIlGt) {
        long l = a ^ 0xF81D38B902BL;
        ServerVersion serverVersion = CP_r7.CP_b().CP_q().CP_F();
        PacketWrapper[] packetWrapperArray = CP_Lg.CP_w();
        int n = serverVersion.CP_z(ServerVersion.V_1_13);
        if (packetWrapperArray == null) {
            if (n != 0) {
                return EntityType.fromName((String)ilIlGt.getName().getKey());
            }
            n = ilIlGt.CP_H(serverVersion.CP_E());
        }
        return EntityType.fromId((int)n);
    }

    public static ItemType CP_F(Material material) {
        ItemStack itemStack = new ItemStack(material);
        CP_Cg ilIlCg = CP_qC.CP_n(itemStack);
        return ilIlCg.CP_J();
    }

    public static Material CP_v(ItemType itemType) {
        CP_Cg ilIlCg = CP_Cg.CP_q().CP_C(itemType).CP_D();
        ItemStack itemStack = CP_qC.CP_m(ilIlCg);
        return itemStack.getType();
    }

    public static CP_d_ CP_Y(MaterialData materialData) {
        int n = CP_Lg.CP_Y(materialData);
        ServerVersion serverVersion = CP_r7.CP_b().CP_q().CP_F();
        return CP_d_.CP_W(serverVersion.CP_E(), n);
    }

    public static MaterialData CP_U(CP_d_ ilIld_) {
        return CP_Lg.CP_UnderScore(ilIld_.CP_s());
    }

    public static CP_Cg CP_n(ItemStack itemStack) {
        return CP_Lg.CP_c(itemStack);
    }

    public static ItemStack CP_m(CP_Cg ilIlCg) {
        return CP_Lg.CP_s(ilIlCg);
    }

    public static CP_nq CP_l(World world) {
        Object object;
        ServerVersion serverVersion;
        block6: {
            boolean bl;
            block5: {
                long l = a ^ 0x614F538E0F05L;
                serverVersion = CP_r7.CP_b().CP_q().CP_F();
                PacketWrapper[] packetWrapperArray = CP_Lg.CP_w();
                bl = serverVersion.CP_C(ServerVersion.V_1_14);
                if (packetWrapperArray != null) break block5;
                if (bl) {
                    int n = world.getEnvironment().getId();
                    return CP_iN.CP_Q().getById(serverVersion.CP_E(), n);
                }
                object = serverVersion;
                if (packetWrapperArray != null) break block6;
                bl = ((ServerVersion)((Object)object)).CP_C(ServerVersion.V_1_16);
            }
            if (bl) {
                Object object2 = CP_Lg.CP_K(world);
                int n = CP_Lg.CP_Z(object2);
                return CP_iN.CP_Q().getById(serverVersion.CP_E(), n);
            }
            object = CP_Lg.CP_K(world);
        }
        Object object3 = object;
        Object object4 = CP_Lg.CP_B(object3);
        NBTCompound nBTCompound = CP_Lg.CP_Q(object4);
        ResourceLocation resourceLocation = new ResourceLocation(CP_Lg.CP_g(object3));
        int n = CP_Lg.CP_Z(object3);
        return (CP_nq)((CP_nq)CP_nq.CP_Y.CP_A(nBTCompound, PacketWrapper.CP_E(serverVersion.CP_E()))).copy(new SimpleTypesBuilderData(resourceLocation, n));
    }

    @Deprecated
    public static CP_Pu CP_F(World world) {
        Object object;
        PacketWrapper[] packetWrapperArray;
        ServerVersion serverVersion;
        block8: {
            boolean bl;
            block7: {
                long l = a ^ 0x4739CB9805F1L;
                serverVersion = CP_r7.CP_b().CP_q().CP_F();
                packetWrapperArray = CP_Lg.CP_w();
                bl = serverVersion.CP_C(ServerVersion.V_1_14);
                if (packetWrapperArray != null) break block7;
                if (bl) {
                    return new CP_Pu(world.getEnvironment().getId());
                }
                object = serverVersion;
                if (packetWrapperArray != null) break block8;
                bl = ((ServerVersion)((Object)object)).CP_C(ServerVersion.V_1_16);
            }
            if (bl) {
                Object object2 = CP_Lg.CP_K(world);
                return new CP_Pu(CP_Lg.CP_Z(object2));
            }
            object = CP_Lg.CP_K(world);
        }
        Object object3 = object;
        Object object4 = CP_Lg.CP_B(object3);
        CP_Pu ilIlPu = new CP_Pu(CP_Lg.CP_Q(object4));
        if (packetWrapperArray == null) {
            if (serverVersion.CP_C(ServerVersion.V_1_16_2)) {
                ilIlPu.CP_C(CP_Lg.CP_g(object3));
            }
            ilIlPu.CP_l(CP_Lg.CP_Z(object3));
        }
        return ilIlPu;
    }

    public static CP_Lo<?> CP_L(Enum<?> enum_) {
        return CP_Lg.CP_C(enum_);
    }

    public static Enum<?> CP_z(CP_Lo<?> ilIlLo) {
        return CP_Lg.CP_j(ilIlLo);
    }

    public static @Nullable Entity CP_s(@Nullable World world, int n) {
        return CP_Lg.CP_i(world, n);
    }

    public static Pose CP_g(CP_qX ilIlqX) {
        return Pose.values()[ilIlqX.ordinal()];
    }

    public static CP_qX CP_e(Pose pose) {
        return CP_qX.values()[pose.ordinal()];
    }

    public static MainHand CP_v(CP_Oh ilIlOh) {
        return MainHand.values()[ilIlOh.ordinal()];
    }

    public static List<CP_nm<?>> CP_U(Entity entity) {
        return CP_Lg.CP_O(entity);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        long l = a ^ 0x4E26D8963124L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("\u00ed@\u00f96\u00c7\u00a1nc\u0098x\f\u00ee\u0097:\u00d8\u00de".getBytes("ISO-8859-1"));
                b = CP_qC.a(byArray3).intern();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
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
}

