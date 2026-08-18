/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_OK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_yH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTByte;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTDouble;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTFloat;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTLong;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_AT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_OU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_rm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.CP_Gp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.CP_xx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.timelines.CP_iy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.clock.CP_jT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Qs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_XA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_fK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_nq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.CP_Gw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_ro
implements CP_OU<CP_nq> {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String DtpFOBBSNR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_ro() {
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_nq CP_V(NBTCompound var1_1, PacketWrapper<?> var2_2) throws CP_Xv {
        block63: {
            block61: {
                block60: {
                    block56: {
                        block57: {
                            block59: {
                                block58: {
                                    block55: {
                                        block47: {
                                            block48: {
                                                block53: {
                                                    block54: {
                                                        block51: {
                                                            block52: {
                                                                block62: {
                                                                    block50: {
                                                                        block49: {
                                                                            block46: {
                                                                                block45: {
                                                                                    var3_3 = CP_ro.a ^ 29955802155031L;
                                                                                    var6_4 = CP_Gy.CP_C();
                                                                                    var7_5 = var2_2.CP_w();
                                                                                    var5_6 = CP_Qs.CP_Y();
                                                                                    try {
                                                                                        try {
                                                                                            v0 = var7_5.CP_z(ServerVersion.V_1_21_11);
                                                                                            if (var5_6 == null) break block45;
                                                                                            if (!v0) break block46;
                                                                                        }
                                                                                        catch (CP_Xv v1) {
                                                                                            throw CP_ro.a(v1);
                                                                                        }
                                                                                        var6_4.CP_C(var1_1.getBooleanOr((String)CP_ro.a("p", (int)497, (long)(2707465616204168386L ^ var3_3)), false)).CP_V(var1_1.getOr((String)CP_ro.a("p", (int)11433, (long)(6425766926942982571L ^ var3_3)), CP_XA.CODEC, CP_XA.OVERWORLD, var2_2)).CP_c(var1_1.getOr((String)CP_ro.a("p", (int)11145, (long)(3802692360431654566L ^ var3_3)), CP_fK.CODEC, CP_fK.DEFAULT, var2_2)).CP_E(var1_1.getOr((String)CP_ro.a("p", (int)8811, (long)(1284949983960424281L ^ var3_3)), CP_Gp.CP_T, CP_Gp.CP_M, var2_2)).CP_q((CP_yH<CP_iy>)var1_1.getOr((String)CP_ro.a("p", (int)17124, (long)(5812036869374230480L ^ var3_3)), (CP_AT<CP_yH>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_M(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/CP_yH;)(), CP_OK.CP_G(), var2_2));
                                                                                        v0 = var7_5.CP_z(ServerVersion.V_26_1);
                                                                                    }
                                                                                    catch (CP_Xv v2) {
                                                                                        throw CP_ro.a(v2);
                                                                                    }
                                                                                }
                                                                                try {
                                                                                    try {
                                                                                        if (var5_6 == null) break block47;
                                                                                        if (!v0) break block48;
                                                                                    }
                                                                                    catch (CP_Xv v3) {
                                                                                        throw CP_ro.a(v3);
                                                                                    }
                                                                                    var6_4.CP_y(var1_1.getOrNull((String)CP_ro.a("p", (int)25195, (long)(6320458589949304689L ^ var3_3)), CP_jT.CP_D, var2_2));
                                                                                    var6_4.CP_T(var1_1.getBooleanOrThrow((String)CP_ro.a("p", (int)29776, (long)(4310091960931780944L ^ var3_3))));
                                                                                    if (var5_6 != null) break block48;
                                                                                }
                                                                                catch (CP_Xv v4) {
                                                                                    throw CP_ro.a(v4);
                                                                                }
                                                                            }
                                                                            var8_7 = var1_1.getNumberTagValueOrNull((String)CP_ro.a("p", (int)6072, (long)(3987078131390638770L ^ var3_3)));
                                                                            try {
                                                                                v5 = var6_4;
                                                                                v6 = var8_7;
                                                                                if (var5_6 == null) break block49;
                                                                                if (v6 == null) break block50;
                                                                            }
                                                                            catch (CP_Xv v7) {
                                                                                throw CP_ro.a(v7);
                                                                            }
                                                                            v6 = var8_7;
                                                                        }
                                                                        v8 = v6.longValue();
                                                                        break block62;
                                                                    }
                                                                    v8 = null;
                                                                }
                                                                try {
                                                                    v9 = v5.CP_n(v8).CP_Q(CP_xx.CP_x, var1_1.getBoolean((String)CP_ro.a("p", (int)15402, (long)(591797951677448502L ^ var3_3)))).CP_S(var1_1.getBoolean((String)CP_ro.a("p", (int)28740, (long)(2026939559348800867L ^ var3_3)))).CP_N(var1_1.getBoolean((String)CP_ro.a("p", (int)864, (long)(8227785594406895231L ^ var3_3)))).CP_W(var1_1.getBoolean((String)CP_ro.a("p", (int)1139, (long)(2750615541573187923L ^ var3_3))));
                                                                    v10 = CP_xx.CP_q;
                                                                    v11 = var1_1.getBoolean((String)CP_ro.a("p", (int)14508, (long)(8398269761983759789L ^ var3_3)));
                                                                    if (var5_6 == null) break block51;
                                                                    if (v11) break block52;
                                                                }
                                                                catch (CP_Xv v12) {
                                                                    throw CP_ro.a(v12);
                                                                }
                                                                v11 = true;
                                                                break block51;
                                                            }
                                                            v11 = false;
                                                        }
                                                        try {
                                                            try {
                                                                v9.CP_Q(v10, v11).CP_Q(CP_xx.CP_Q, var1_1.getBoolean((String)CP_ro.a("p", (int)13472, (long)(864209447810451899L ^ var3_3))));
                                                                v0 = var7_5.CP_z(ServerVersion.V_1_16_2);
                                                                if (var5_6 == null) break block53;
                                                                if (!v0) break block54;
                                                            }
                                                            catch (CP_Xv v13) {
                                                                throw CP_ro.a(v13);
                                                            }
                                                            var6_4.CP_x(var1_1.getOrThrow((String)CP_ro.a("p", (int)22607, (long)(5893799946123978056L ^ var3_3)), ResourceLocation.CODEC, var2_2));
                                                        }
                                                        catch (CP_Xv v14) {
                                                            throw CP_ro.a(v14);
                                                        }
                                                    }
                                                    v0 = var7_5.CP_z(ServerVersion.V_1_21_6);
                                                }
                                                try {
                                                    if (var5_6 == null) break block47;
                                                    if (!v0) break block48;
                                                }
                                                catch (CP_Xv v15) {
                                                    throw CP_ro.a(v15);
                                                }
                                                var9_8 = var1_1.getNumberTagOrNull((String)CP_ro.a("p", (int)8095, (long)(4387110068399923889L ^ var3_3)));
                                                try {
                                                    if (var9_8 != null) {
                                                        var6_4.CP_Q(CP_xx.CP_J, Float.valueOf(var9_8.getAsFloat()));
                                                    }
                                                }
                                                catch (CP_Xv v16) {
                                                    throw CP_ro.a(v16);
                                                }
                                            }
                                            v0 = var7_5.CP_z(ServerVersion.V_1_16_2);
                                        }
                                        try {
                                            try {
                                                try {
                                                    if (var5_6 == null) break block55;
                                                    if (v0) {
                                                    }
                                                    ** GOTO lbl145
                                                }
                                                catch (CP_Xv v17) {
                                                    throw CP_ro.a(v17);
                                                }
                                                v18 = var6_4.CP_d(var1_1.getNumberTagOrThrow((String)CP_ro.a("p", (int)3179, (long)(3910935649689104751L ^ var3_3))).getAsDouble());
                                                if (var5_6 == null) break block56;
                                            }
                                            catch (CP_Xv v19) {
                                                throw CP_ro.a(v19);
                                            }
                                            v0 = var7_5.CP_z(ServerVersion.V_1_17);
                                        }
                                        catch (CP_Xv v20) {
                                            throw CP_ro.a(v20);
                                        }
                                    }
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (!v0) break block57;
                                                        var6_4.CP_A(var1_1.getNumberTagOrThrow((String)CP_ro.a("p", (int)5693, (long)(6644592304223906605L ^ var3_3))).getAsInt());
                                                        v18 = var6_4.CP_w(var1_1.getNumberTagOrThrow((String)CP_ro.a("p", (int)10504, (long)(8816533123853177863L ^ var3_3))).getAsInt());
                                                        if (var5_6 == null) break block56;
                                                    }
                                                    catch (CP_Xv v21) {
                                                        throw CP_ro.a(v21);
                                                    }
                                                    if (!var7_5.CP_z(ServerVersion.V_1_19)) break block57;
                                                }
                                                catch (CP_Xv v22) {
                                                    throw CP_ro.a(v22);
                                                }
                                                var6_4.CP_l(var1_1.getTagOrThrow((String)CP_ro.a("p", (int)23831, (long)(8870226681702490113L ^ var3_3))));
                                                var6_4.CP_T(var1_1.getNumberTagOrThrow((String)CP_ro.a("p", (int)21075, (long)(5496980544267202418L ^ var3_3))).getAsInt());
                                                if (var5_6 != null) break block57;
                                            }
                                            catch (CP_Xv v23) {
                                                throw CP_ro.a(v23);
                                            }
lbl145:
                                            // 2 sources

                                            v24 = var6_4;
                                            if (!var1_1.getBoolean((String)CP_ro.a("p", (int)11150, (long)(7262468338053076610L ^ var3_3)))) break block58;
                                        }
                                        catch (CP_Xv v25) {
                                            throw CP_ro.a(v25);
                                        }
                                        v26 = 8.0;
                                        break block59;
                                    }
                                    catch (CP_Xv v27) {
                                        throw CP_ro.a(v27);
                                    }
                                }
                                v26 = 1.0;
                            }
                            v24.CP_d(v26);
                        }
                        v18 = var6_4;
                    }
                    try {
                        try {
                            v28 /* !! */  = var7_5;
                            if (var5_6 == null) break block60;
                            if (!v28 /* !! */ .CP_z(ServerVersion.V_1_18_2)) break block61;
                        }
                        catch (CP_Xv v29) {
                            throw CP_ro.a(v29);
                        }
                        v28 /* !! */  = var1_1.getOrThrow((String)CP_ro.a("p", (int)8731, (long)(4015980689850392366L ^ var3_3)), CP_Gw.CP_j, var2_2);
                    }
                    catch (CP_Xv v30) {
                        throw CP_ro.a(v30);
                    }
                }
                v31 = (CP_Gw)v28 /* !! */ ;
                break block63;
            }
            v31 = new CP_Gw(var1_1.getOrThrow((String)CP_ro.a("p", (int)8731, (long)(4015980689850392366L ^ var3_3)), ResourceLocation.CODEC, var2_2));
        }
        try {
            v18.CP_q(v31);
            v32 = var6_4.CP_i(var1_1.getBooleanOrThrow((String)CP_ro.a("p", (int)29543, (long)(7080459476334775930L ^ var3_3)))).CP_y(var1_1.getBooleanOrThrow((String)CP_ro.a("p", (int)12388, (long)(8028190237829188969L ^ var3_3)))).CP_E(var1_1.getNumberTagValueOrThrow((String)CP_ro.a("p", (int)612, (long)(6508552265460285292L ^ var3_3))).intValue()).CP_N(var1_1.getNumberTagValueOrThrow((String)CP_ro.a("p", (int)6625, (long)(8585887207680206027L ^ var3_3))).floatValue()).CP_V();
            if (PacketWrapper.CP_z() == null) {
                CP_Qs.CP_U("NXOjtb");
            }
        }
        catch (CP_Xv v33) {
            throw CP_ro.a(v33);
        }
        return v32;
    }

    /*
     * Unable to fully structure code
     */
    public void CP_Z(NBTCompound var1_1, PacketWrapper<?> var2_2, CP_nq var3_3) throws CP_Xv {
        block79: {
            block77: {
                block75: {
                    block76: {
                        block74: {
                            block72: {
                                block73: {
                                    block70: {
                                        block71: {
                                            block68: {
                                                block69: {
                                                    block64: {
                                                        block66: {
                                                            block67: {
                                                                block65: {
                                                                    block63: {
                                                                        var4_4 = CP_ro.a ^ 31761430679323L;
                                                                        var7_5 = var2_2.CP_w();
                                                                        var6_6 = CP_Qs.CP_Y();
                                                                        try {
                                                                            try {
                                                                                try {
                                                                                    v0 = var7_5.CP_z(ServerVersion.V_1_21_11);
                                                                                    if (var6_6 == null) break block63;
                                                                                    if (!v0) break block64;
                                                                                }
                                                                                catch (CP_Xv v1) {
                                                                                    throw CP_ro.a(v1);
                                                                                }
                                                                                v2 = var3_3;
                                                                                if (var6_6 == null) break block65;
                                                                            }
                                                                            catch (CP_Xv v3) {
                                                                                throw CP_ro.a(v3);
                                                                            }
                                                                            v0 = v2.hasFixedTime();
                                                                        }
                                                                        catch (CP_Xv v4) {
                                                                            throw CP_ro.a(v4);
                                                                        }
                                                                    }
                                                                    try {
                                                                        if (v0) {
                                                                            var1_1.setTag((String)CP_ro.a("p", (int)20974, (long)(7716269101946596302L ^ var4_4)), new NBTByte(true));
                                                                        }
                                                                    }
                                                                    catch (CP_Xv v5) {
                                                                        throw CP_ro.a(v5);
                                                                    }
                                                                    v2 = var3_3;
                                                                }
                                                                var8_7 = v2.getSkybox();
                                                                try {
                                                                    if (var8_7 != CP_XA.OVERWORLD) {
                                                                        var1_1.set((String)CP_ro.a("p", (int)22283, (long)(5348577622117051694L ^ var4_4)), var8_7, CP_XA.CODEC, var2_2);
                                                                    }
                                                                }
                                                                catch (CP_Xv v6) {
                                                                    throw CP_ro.a(v6);
                                                                }
                                                                var9_8 = var3_3.getCardinalLight();
                                                                try {
                                                                    if (var9_8 != CP_fK.DEFAULT) {
                                                                        var1_1.set((String)CP_ro.a("p", (int)28449, (long)(4380880199352571172L ^ var4_4)), var9_8, CP_fK.CODEC, var2_2);
                                                                    }
                                                                }
                                                                catch (CP_Xv v7) {
                                                                    throw CP_ro.a(v7);
                                                                }
                                                                var10_9 = var3_3.getAttributes();
                                                                try {
                                                                    if (!var10_9.CP_N()) {
                                                                        var1_1.set((String)CP_ro.a("p", (int)215, (long)(3111684443145353936L ^ var4_4)), var10_9, CP_Gp.CP_T, var2_2);
                                                                    }
                                                                }
                                                                catch (CP_Xv v8) {
                                                                    throw CP_ro.a(v8);
                                                                }
                                                                var11_10 = var3_3.getTimelinesRef();
                                                                try {
                                                                    try {
                                                                        v9 = var11_10.CP_O();
                                                                        if (var6_6 == null) break block66;
                                                                        if (v9) break block67;
                                                                    }
                                                                    catch (CP_Xv v10) {
                                                                        throw CP_ro.a(v10);
                                                                    }
                                                                    var1_1.set((String)CP_ro.a("p", (int)17324, (long)(4444867426354919813L ^ var4_4)), var11_10, (CP_rm<CP_yH>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Object;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;, CP_L(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_yH<Z> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/CP_yH;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;)(), var2_2);
                                                                }
                                                                catch (CP_Xv v11) {
                                                                    throw CP_ro.a(v11);
                                                                }
                                                            }
                                                            v9 = var7_5.CP_z(ServerVersion.V_26_1);
                                                        }
                                                        if (v9) {
                                                            var12_11 = var3_3.getDefaultClock();
                                                            try {
                                                                if (var12_11 != null) {
                                                                    var1_1.set((String)CP_ro.a("p", (int)24058, (long)(3224254913239771073L ^ var4_4)), var12_11, CP_jT.CP_D, var2_2);
                                                                }
                                                            }
                                                            catch (CP_Xv v12) {
                                                                throw CP_ro.a(v12);
                                                            }
                                                            var1_1.setTag((String)CP_ro.a("p", (int)6411, (long)(4987263961512878895L ^ var4_4)), new NBTByte(var3_3.isHasEnderDragonFight()));
                                                        }
                                                        if (var6_6 != null) break block73;
                                                    }
                                                    var8_7 = var3_3.getFixedTime();
                                                    try {
                                                        try {
                                                            v13 = var8_7.isPresent();
                                                            if (var6_6 == null) break block68;
                                                            if (!v13) break block69;
                                                        }
                                                        catch (CP_Xv v14) {
                                                            throw CP_ro.a(v14);
                                                        }
                                                        var1_1.setTag((String)CP_ro.a("p", (int)28505, (long)(7351559946363983223L ^ var4_4)), new NBTLong(var8_7.getAsLong()));
                                                    }
                                                    catch (CP_Xv v15) {
                                                        throw CP_ro.a(v15);
                                                    }
                                                }
                                                var1_1.setTag((String)CP_ro.a("p", (int)30258, (long)(6178008490515647531L ^ var4_4)), new NBTByte(var3_3.isUltraWarm()));
                                                var1_1.setTag((String)CP_ro.a("p", (int)29650, (long)(6628404437253671389L ^ var4_4)), new NBTByte(var3_3.isNatural()));
                                                var1_1.setTag((String)CP_ro.a("p", (int)14020, (long)(7889884199175326928L ^ var4_4)), new NBTByte(var3_3.isBedWorking()));
                                                var1_1.setTag((String)CP_ro.a("p", (int)18985, (long)(4151513419246071811L ^ var4_4)), new NBTByte(var3_3.isRespawnAnchorWorking()));
                                                var1_1.setTag((String)CP_ro.a("p", (int)20077, (long)(8423305766060258415L ^ var4_4)), new NBTByte(var3_3.isPiglinSafe()));
                                                var1_1.setTag((String)CP_ro.a("p", (int)8459, (long)(155363867059919665L ^ var4_4)), new NBTByte(var3_3.hasRaids()));
                                                v13 = var7_5.CP_z(ServerVersion.V_1_16_2);
                                            }
                                            try {
                                                try {
                                                    if (var6_6 == null) break block70;
                                                    if (!v13) break block71;
                                                }
                                                catch (CP_Xv v16) {
                                                    throw CP_ro.a(v16);
                                                }
                                                var1_1.set((String)CP_ro.a("p", (int)2064, (long)(3228835213659746865L ^ var4_4)), var3_3.getEffectsLocation(), ResourceLocation.CODEC, var2_2);
                                            }
                                            catch (CP_Xv v17) {
                                                throw CP_ro.a(v17);
                                            }
                                        }
                                        v13 = var7_5.CP_z(ServerVersion.V_1_21_6);
                                    }
                                    try {
                                        if (var6_6 == null) break block72;
                                        if (!v13) break block73;
                                    }
                                    catch (CP_Xv v18) {
                                        throw CP_ro.a(v18);
                                    }
                                    var9_8 = var3_3.getCloudHeight();
                                    try {
                                        if (var9_8 != null) {
                                            var1_1.setTag((String)CP_ro.a("p", (int)13261, (long)(2346952089744312802L ^ var4_4)), new NBTInt(var9_8.intValue()));
                                        }
                                    }
                                    catch (CP_Xv v19) {
                                        throw CP_ro.a(v19);
                                    }
                                }
                                v13 = var7_5.CP_z(ServerVersion.V_1_16_2);
                            }
                            try {
                                try {
                                    if (var6_6 == null) break block74;
                                    if (v13) {
                                    }
                                    ** GOTO lbl172
                                }
                                catch (CP_Xv v20) {
                                    throw CP_ro.a(v20);
                                }
                                var1_1.setTag((String)CP_ro.a("p", (int)5849, (long)(172382973488016592L ^ var4_4)), new NBTDouble(var3_3.getCoordinateScale()));
                                v13 = var7_5.CP_z(ServerVersion.V_1_17);
                            }
                            catch (CP_Xv v21) {
                                throw CP_ro.a(v21);
                            }
                        }
                        try {
                            try {
                                try {
                                    try {
                                        try {
                                            if (var6_6 == null) break block75;
                                            if (!v13) break block76;
                                        }
                                        catch (CP_Xv v22) {
                                            throw CP_ro.a(v22);
                                        }
                                        var1_1.setTag((String)CP_ro.a("p", (int)6525, (long)(2585914620260885347L ^ var4_4)), new NBTInt(var3_3.getMinY()));
                                        var1_1.setTag((String)CP_ro.a("p", (int)30440, (long)(3686184835135065331L ^ var4_4)), new NBTInt(var3_3.getHeight()));
                                        v13 = var7_5.CP_z(ServerVersion.V_1_19);
                                        if (var6_6 == null) break block75;
                                    }
                                    catch (CP_Xv v23) {
                                        throw CP_ro.a(v23);
                                    }
                                    if (!v13) break block76;
                                }
                                catch (CP_Xv v24) {
                                    throw CP_ro.a(v24);
                                }
                                var1_1.setTag((String)CP_ro.a("p", (int)14423, (long)(7254811962358694527L ^ var4_4)), var3_3.getMonsterSpawnLightLevel());
                                var1_1.setTag((String)CP_ro.a("p", (int)29782, (long)(2476934098801446513L ^ var4_4)), new NBTInt(var3_3.getMonsterSpawnBlockLightLimit()));
                                if (var6_6 != null) break block76;
                            }
                            catch (CP_Xv v25) {
                                throw CP_ro.a(v25);
                            }
lbl172:
                            // 2 sources

                            var1_1.setTag((String)CP_ro.a("p", (int)14661, (long)(5358326959043806032L ^ var4_4)), new NBTByte(var3_3.CP_Q()));
                        }
                        catch (CP_Xv v26) {
                            throw CP_ro.a(v26);
                        }
                    }
                    try {
                        var1_1.setTag((String)CP_ro.a("p", (int)11589, (long)(6717337808671053647L ^ var4_4)), new NBTByte(var3_3.hasSkyLight()));
                        var1_1.setTag((String)CP_ro.a("p", (int)20717, (long)(3438672114318109429L ^ var4_4)), new NBTByte(var3_3.hasCeiling()));
                        v27 = var1_1;
                        v28 = CP_ro.a("p", (int)9011, (long)(7132250492521978158L ^ var4_4));
                        if (var6_6 == null) break block77;
                        v27.setTag((String)v28, new NBTInt(var3_3.getLogicalHeight()));
                        v13 = var2_2.CP_w().CP_z(ServerVersion.V_1_18_2);
                    }
                    catch (CP_Xv v29) {
                        throw CP_ro.a(v29);
                    }
                }
                try {
                    block78: {
                        try {
                            if (!v13) break block78;
                            var1_1.set((String)CP_ro.a("p", (int)23910, (long)(6252554251484915577L ^ var4_4)), var3_3.getInfiniburn(), CP_Gw.CP_j, var2_2);
                            if (var6_6 != null) break block79;
                        }
                        catch (CP_Xv v30) {
                            throw CP_ro.a(v30);
                        }
                    }
                    v27 = var1_1;
                    v28 = CP_ro.a("p", (int)8731, (long)(4015987065058826274L ^ var4_4));
                }
                catch (CP_Xv v31) {
                    throw CP_ro.a(v31);
                }
            }
            v27.set((String)v28, var3_3.getInfiniburn().CP_U(), ResourceLocation.CODEC, var2_2);
        }
        var1_1.setTag((String)CP_ro.a("p", (int)32401, (long)(6635683909200626819L ^ var4_4)), new NBTFloat(var3_3.getAmbientLight()));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_ro.a = CP_s.a(-5866839228002208535L, 9187077045575786204L, MethodHandles.lookup().lookupClass()).a(45538938057632L);
                CP_ro.d = new HashMap<K, V>(13);
                var0 = CP_ro.a ^ 70752542100550L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[54];
                var7_4 = 0;
                var6_5 = "\u0099W (&dj\\\u00d74\r!\u00d0\u00a6\u0095\u0018\u00fd\u0085\u00ce\u00f8d\u00a3\u0018QcQ\u00f7\u0004t\u00bee\u00df\u0010\u00c5\u0016\u00b7[`\u00a3\u001f\u0094\u008a3\u00f85\u0019HI\u00f0 \u00912\u009b\u00b0\u00f0HE!I\u00f7\u008eQ\u00a10D\u00e4\u00b6%?\u0013\u00daP\u0081\"\u008c@\u00a2=6\u00893J0[\u00f5'$\u00ab^\u00e7\u00e0\u00f9|\u001a1\u00a7\u00f2\u009cW\u00ce\u0011\u00b9\u00c3qt\u00e8q+,i\u00f9\u0003\u00e0\u00b6F\u0092\u009f1_\u0013C\u00c3\u00ee\u00e2R\u00c6Fj\u00b9.\u0083\u0010\u0018\u00f7BD\u00d9\u00d4\n\u00cdG\u00b0\u00f5M\u0001s\u000eK\u0010\u00f9-\f\u00c2\u00a8~\u00b2\u008dy\u00d1\u008b\u00e37\u00e4\u000b\u0096(f[\u00ad-s:$lo\u001b\u00df\u00c3u8\u00bb`\u00e9?\u001e\u00c4\u00cb\u00e9\u00c4k\u00b1\u00f1P\u00f7\u00df\u009c\u00f9U\u0084 -\rI\u0093\u009f< \u00be\u00af\u001f\u0080\u00ed^\u00d3x\u001d\u00ce\u00ea0\u00b9\u00ed\u0084\u00c9Y@oK+\u00c4\u00c5\u0083\u00ac\u0086\u00a7\u0082\u00e5\u0006\u00ec\u0091\u0018zRC#@OzItU\u00c7\u00b2=T{\u0084\u0081\"\u00a2\u00b3E\u0080\u00cf\u00a1\u00104\u00bc\u0012\u00afP\u0097\u008bc\u0018\u0012\u00f1\u00a7\u0015\u00d4u\u008a\u0010kTt\u00d8\u0090\u0084S!\u00e1\u00f1\u0092\u00d7\u00a0|D\u00fd \u008c\u0006\u00fb\u008a\u00a7\u00c5\u00e0k-M\u0084\u009c\u00ae>C\u0083h\u00f5\u00b5\u00f9i=\u001a\u000b|\u00ac\u00d0,V=\u00f5\u00eb\u0018)\u0087\u00d5\u00d7\u0001>\u00b0\u00a0\u001a\u008c{\u00ef\nv\u0093i\u000b;&\u0007|\u0011GH\u0018\u00f65\u00c3\u000e\u00ae\u001fcun\u00d5\u00e3V\u0086A,^\u0080\u0001\u00d2y331Y\u0018\u0018\u0081\u00aa\u00bd\u00f0+)\u0012\u00ae$\u0086CB\u00cdZ\u00bb\u0018\u0005$\u00f7\u00d73\u00a3\u00d3 9\u00ce\u0081d\u00db.R\bo\u0082\u00d5\u00a5\u00a1\u0086\u00e8`\u000b\u009d\u00b3\u00ab\r\u0088L\u00fb\u001aJX7\u00fba\r\u009b8\u0093ae\u0087J\u001cU^_\u00d6\u001f\u00acY\u00f8\t>\u00c2~\u00be\u0003\u00b4\n\u00f1\u0098y\u0090L\u00b5'\b\u001b,Cm\u00c1\u00bb\u0001V\u00efp\u0093\u00d6\u0094\u00d4\u001e\u00db&3\u0094m\u00f6\u00dbD\u00f5\u00f6c\u0010Y\u0017\u00bf\u00b7sW\u00e1\u00ca\u00bc\u00aa\b\u00e4\u000f\u00f7@\u009d\u0018P\u009f\u00b3\u009ex\u00d3\u00d5\u001b\u0007\u00fb\u008a\u000bf5.\u00d3\u00a9F_\u009az\u00c7\u00e2W \u0083i\u00bewAi\u0094Nm\u00cbK\u00c49\u0013\u00efJ\u0002\u00f2'5\u00a6+\u00fd\u0004;\u00da5\u000f\u009f\u0094\u0005\u0000\u0010\u00f8l\u0088l\u001740@i\u00dd\u009c\u00db\u0080\u008e\u00d1\u0015 ](\u00f1\u00c8\u0016\u00c4\u00dd\u0017\bH\u0082\u00f7\u0095\u0094\u00d8\u00c3\u00ca\u00b7Qa\u00e4\u00c6\u00a7Fz\u00a1\u00da\u00b0\u009f\u00d8\u00ec\u00b7\u0010\u001b\u00f8\u00f4\u0087EUW\u00eeo\u0003\u00e5YB\u00ae\u00f0\u0003 \u00a1\u00ec\u00f4\\g\u00dc\u00fa\u0015\u0004\u00b2\u00f2\u00cf\u00d9i\u0014c\u00e8:$SX\u001bh\u00b7M\u00a5\u0007c\u00ad\u0093\u0018\u00e5 uUi2\u0082PI\u00a5\u00ef\u00d1\u0084\u00f5,v\u008b^\u0084\u00ffH\u008c\u00b6x\u0089\u000f\u00bd\u0099\u00f5u\u00ba\u0093[\u00c0 \u00fa\u001a{h&U\u0099\u000f7\u00ee\u00f6/\r8\u00ea\b0Y&\u001ccV$\u00fd(\u0017\u00a1\u00b4\u0011\n$x (\r(\u00b7lF\u00ba\u00a3PL(\u00b3$\u00ff\u00a4\u00c4{\u0091~)\n\u00c2\u00fa\u007fH80\u00ed\u00f9U\u001c\u0000 Q\u00f0$\u00da$,\u00fb(\u00daS5CW\u00e9?\u0080\u0002\u0098!jB\u00e6\u008a\\M\u00b1\u0082\u00d9\u00ed\u008a\u00e9\u00b6 h]\u009d\u009f\u00cb\u0016\u009c0\u00b9\u00d5\u009b\u00e2\u00c1\u00f4\nw{b \u00a2\u0000\u00f3\u00cb\u00fc\u0091\u00c9A\u00eb\u00bcXcW u\u00a8\u0080pIU\u00f6\u00f2\u00dc\u00131\u00bf\u00bb\u00e6$m\u00e2~J\u00d2\u00ab\u00a5\u001f\u00eeA\u00af}wKy8u\u0018\u00fe\u00fa'd\\K\u00b3\u00f7\u001e\u00c51\u00b9~\u00ee\u00d7\u00e0\u00fb\u0094\u00f2\u00f4\u00c8~\u00f3\u008d\u0010v\u00c4t\f\u0019\u00aa\\\u00c6\u001e.\b\u00e7^wX.(c|\u00fa\u0095\u0013\u00db\u00d6\u00c3\u0091U\u00cbR\u00cb\u008f_\u00dc\nZ_\u00b6\u0087\u00b5e-tx\u00fe\u0089s\u0010\u00a75\u0083\u0015\u009c\u009f\u0014\u000f$\u00b4\u0010\u00d3.\u0017\u00de>XS\u0089\u00bb\u009c\u00ec\u0098e8\u00d9\u00fa0,\u0096N<@\u00cf7\u00b1\u00f3\u0088\u00fe\u00966n\u008d\u00a6\u00e1\u00d1\u00bd=1\u008b\u00ac\u00bd\u00c3\u00d2\u00dfS\u0080\u001d\u0006\u00bf\u0016<)\u00ca\u0082\u00d6:\u0087\u00f9\u00f6\u00bb\u001a\u008ceTM \u0015\u00b6\u009f\u00dc\u00de\u0011TV\u0098\u00f8}\u00f6{\u000f\u0017\u00a9\u00c6?\u009c\u00e9pQ\u00b8\u0011B\u00fc\u0010\u008c\u009dn.`\u0018\u001f\u008f(Ph\u00c7\u00b7:\u00fdI\u00b1\u0089\u00e7\u00d9Y_#\u00f3\u008e\u00f1\u00ce\u0018\u00d8\u00dd\u0018\u00fa@K\u00c05\u0014\u001e\u00a6S\u0017i\u00ce\u00a8\u00f2n\n{R\u00ba\u00f0\u0081\u0017\u0090\u00d2(\u00ef^H\u001f\u00e8\u00a4\u00bb\u0013\u00ac!@\u009d\u008d\u00dae\u0098l\u00cf\u001f\u008eJ\u00f70O|=^W\u009c-\u00c4\u0089\u008a\u0002\u0007\u00fa\u00b9\u00d0.\n07\u00e9\u00ad\u00ddd_g\u00e9\u00ee\u0085F\u00fc\u00c4\u00ceJ\u0000\u00f4\u00ae\u00d3\u00db\u00aa&\u0006\u00d0e\u00ea\u00b0g\u0081\u001fP_\u00e5\u0091\u00bd3\u00c9p\u0011\u008d\u00b6ii\u00d9\u00e0\u0084\u00dbp\u0018\u00d6s{\u0014\u00f3\u00a8c9J\u00d4W<\u00fco\u0019\u00a4\u00ee\u009d\u00e8]m/\u00ceO \u00f3\u00fa\u0086Rl\u00ec$\u001b\u00d0*\u00a4=7{\u0094Nq\u0089\u0080\u009a\u00c4\u0007W\u00de\u00a5\u00b9\u0091\u00afC\u0010\u001dG\u0018\u0080M\u0087\u00f5\u009b\u009a\u00cbvu>a\u00c6\u0091m\u00a07\u00b9\u00fe\u009f2\u00f6\b\u00d2\u00ab\u0010w\u00d3\u00a5\u00fa\u0091d\u009a>\u0019z\u0001}|\u00d2\u008er R\u001e\u00c8\u00b6\u00f5Y<o\u000b\u0005@\u00eeP?\u00cf\u00cc1\u0002\u00c5\u00f5Zud\u00ad\u00c6d\u0004\u00e3?1\u0087B0\u001c\u00cf8}\u00fb8\u00ca4v\u00f3K\u009b\u0080\\\u000b_\u00b6\u001f7\u00e8\u00e3l&\u00ca\u0092q#\r\u00ab\u008d\u0014\u00ee\u00b4A\u00ce\u0085\u00d8|*\u0004\u00d0\u00ced\u00ad}\u0001s\u00ac(\u00e9\u00d8lWn1\u001a9\u0019A!N\u001c\u00941\u00f0\r\u00d3\u0017F \u0099\u00a7\u0086fH}\u00163c\u00a0v=%\u00de\u00ce\u00f2-X\u0094\u0010\u00b3\u00c8\u00c6\u007f\u0097\u008ez!\u00ce)\n\u00ed\u00b1\u00a53} \u00a1\u00bf4\u00ca\u0088$j\u00d7\u00bfar+)\u0089\u00ec\u0003:\u00b6\u00ee2\u00e4U\u00f1nW_\u00fcmm3\u00f4\u00c0 r\u0084\u0006Z\u00ea\u00c4\u00f0\u00b0\u00e1F\u00b7vC\u001b\u00f5\u007f\u001fa\u0093\u00f4\u000e\u0086}\u00df\u00cd\u00f7H\u00b8k\u0088?K\u0018|\u00d2\u008b.\u0091\u00baQY\u009dKM\u00bd,\u0004A\u009e\u0082F[\u001c\u00bc\u00ad\f\u001b\u0018\u00e5\u008dm/\u00bc.Q\u00a1\u009dh\u008f\u0083T\u0011j3\u0014\u00d2\u0090\u00c80Y\u00ba\u0083";
                var8_6 = "\u0099W (&dj\\\u00d74\r!\u00d0\u00a6\u0095\u0018\u00fd\u0085\u00ce\u00f8d\u00a3\u0018QcQ\u00f7\u0004t\u00bee\u00df\u0010\u00c5\u0016\u00b7[`\u00a3\u001f\u0094\u008a3\u00f85\u0019HI\u00f0 \u00912\u009b\u00b0\u00f0HE!I\u00f7\u008eQ\u00a10D\u00e4\u00b6%?\u0013\u00daP\u0081\"\u008c@\u00a2=6\u00893J0[\u00f5'$\u00ab^\u00e7\u00e0\u00f9|\u001a1\u00a7\u00f2\u009cW\u00ce\u0011\u00b9\u00c3qt\u00e8q+,i\u00f9\u0003\u00e0\u00b6F\u0092\u009f1_\u0013C\u00c3\u00ee\u00e2R\u00c6Fj\u00b9.\u0083\u0010\u0018\u00f7BD\u00d9\u00d4\n\u00cdG\u00b0\u00f5M\u0001s\u000eK\u0010\u00f9-\f\u00c2\u00a8~\u00b2\u008dy\u00d1\u008b\u00e37\u00e4\u000b\u0096(f[\u00ad-s:$lo\u001b\u00df\u00c3u8\u00bb`\u00e9?\u001e\u00c4\u00cb\u00e9\u00c4k\u00b1\u00f1P\u00f7\u00df\u009c\u00f9U\u0084 -\rI\u0093\u009f< \u00be\u00af\u001f\u0080\u00ed^\u00d3x\u001d\u00ce\u00ea0\u00b9\u00ed\u0084\u00c9Y@oK+\u00c4\u00c5\u0083\u00ac\u0086\u00a7\u0082\u00e5\u0006\u00ec\u0091\u0018zRC#@OzItU\u00c7\u00b2=T{\u0084\u0081\"\u00a2\u00b3E\u0080\u00cf\u00a1\u00104\u00bc\u0012\u00afP\u0097\u008bc\u0018\u0012\u00f1\u00a7\u0015\u00d4u\u008a\u0010kTt\u00d8\u0090\u0084S!\u00e1\u00f1\u0092\u00d7\u00a0|D\u00fd \u008c\u0006\u00fb\u008a\u00a7\u00c5\u00e0k-M\u0084\u009c\u00ae>C\u0083h\u00f5\u00b5\u00f9i=\u001a\u000b|\u00ac\u00d0,V=\u00f5\u00eb\u0018)\u0087\u00d5\u00d7\u0001>\u00b0\u00a0\u001a\u008c{\u00ef\nv\u0093i\u000b;&\u0007|\u0011GH\u0018\u00f65\u00c3\u000e\u00ae\u001fcun\u00d5\u00e3V\u0086A,^\u0080\u0001\u00d2y331Y\u0018\u0018\u0081\u00aa\u00bd\u00f0+)\u0012\u00ae$\u0086CB\u00cdZ\u00bb\u0018\u0005$\u00f7\u00d73\u00a3\u00d3 9\u00ce\u0081d\u00db.R\bo\u0082\u00d5\u00a5\u00a1\u0086\u00e8`\u000b\u009d\u00b3\u00ab\r\u0088L\u00fb\u001aJX7\u00fba\r\u009b8\u0093ae\u0087J\u001cU^_\u00d6\u001f\u00acY\u00f8\t>\u00c2~\u00be\u0003\u00b4\n\u00f1\u0098y\u0090L\u00b5'\b\u001b,Cm\u00c1\u00bb\u0001V\u00efp\u0093\u00d6\u0094\u00d4\u001e\u00db&3\u0094m\u00f6\u00dbD\u00f5\u00f6c\u0010Y\u0017\u00bf\u00b7sW\u00e1\u00ca\u00bc\u00aa\b\u00e4\u000f\u00f7@\u009d\u0018P\u009f\u00b3\u009ex\u00d3\u00d5\u001b\u0007\u00fb\u008a\u000bf5.\u00d3\u00a9F_\u009az\u00c7\u00e2W \u0083i\u00bewAi\u0094Nm\u00cbK\u00c49\u0013\u00efJ\u0002\u00f2'5\u00a6+\u00fd\u0004;\u00da5\u000f\u009f\u0094\u0005\u0000\u0010\u00f8l\u0088l\u001740@i\u00dd\u009c\u00db\u0080\u008e\u00d1\u0015 ](\u00f1\u00c8\u0016\u00c4\u00dd\u0017\bH\u0082\u00f7\u0095\u0094\u00d8\u00c3\u00ca\u00b7Qa\u00e4\u00c6\u00a7Fz\u00a1\u00da\u00b0\u009f\u00d8\u00ec\u00b7\u0010\u001b\u00f8\u00f4\u0087EUW\u00eeo\u0003\u00e5YB\u00ae\u00f0\u0003 \u00a1\u00ec\u00f4\\g\u00dc\u00fa\u0015\u0004\u00b2\u00f2\u00cf\u00d9i\u0014c\u00e8:$SX\u001bh\u00b7M\u00a5\u0007c\u00ad\u0093\u0018\u00e5 uUi2\u0082PI\u00a5\u00ef\u00d1\u0084\u00f5,v\u008b^\u0084\u00ffH\u008c\u00b6x\u0089\u000f\u00bd\u0099\u00f5u\u00ba\u0093[\u00c0 \u00fa\u001a{h&U\u0099\u000f7\u00ee\u00f6/\r8\u00ea\b0Y&\u001ccV$\u00fd(\u0017\u00a1\u00b4\u0011\n$x (\r(\u00b7lF\u00ba\u00a3PL(\u00b3$\u00ff\u00a4\u00c4{\u0091~)\n\u00c2\u00fa\u007fH80\u00ed\u00f9U\u001c\u0000 Q\u00f0$\u00da$,\u00fb(\u00daS5CW\u00e9?\u0080\u0002\u0098!jB\u00e6\u008a\\M\u00b1\u0082\u00d9\u00ed\u008a\u00e9\u00b6 h]\u009d\u009f\u00cb\u0016\u009c0\u00b9\u00d5\u009b\u00e2\u00c1\u00f4\nw{b \u00a2\u0000\u00f3\u00cb\u00fc\u0091\u00c9A\u00eb\u00bcXcW u\u00a8\u0080pIU\u00f6\u00f2\u00dc\u00131\u00bf\u00bb\u00e6$m\u00e2~J\u00d2\u00ab\u00a5\u001f\u00eeA\u00af}wKy8u\u0018\u00fe\u00fa'd\\K\u00b3\u00f7\u001e\u00c51\u00b9~\u00ee\u00d7\u00e0\u00fb\u0094\u00f2\u00f4\u00c8~\u00f3\u008d\u0010v\u00c4t\f\u0019\u00aa\\\u00c6\u001e.\b\u00e7^wX.(c|\u00fa\u0095\u0013\u00db\u00d6\u00c3\u0091U\u00cbR\u00cb\u008f_\u00dc\nZ_\u00b6\u0087\u00b5e-tx\u00fe\u0089s\u0010\u00a75\u0083\u0015\u009c\u009f\u0014\u000f$\u00b4\u0010\u00d3.\u0017\u00de>XS\u0089\u00bb\u009c\u00ec\u0098e8\u00d9\u00fa0,\u0096N<@\u00cf7\u00b1\u00f3\u0088\u00fe\u00966n\u008d\u00a6\u00e1\u00d1\u00bd=1\u008b\u00ac\u00bd\u00c3\u00d2\u00dfS\u0080\u001d\u0006\u00bf\u0016<)\u00ca\u0082\u00d6:\u0087\u00f9\u00f6\u00bb\u001a\u008ceTM \u0015\u00b6\u009f\u00dc\u00de\u0011TV\u0098\u00f8}\u00f6{\u000f\u0017\u00a9\u00c6?\u009c\u00e9pQ\u00b8\u0011B\u00fc\u0010\u008c\u009dn.`\u0018\u001f\u008f(Ph\u00c7\u00b7:\u00fdI\u00b1\u0089\u00e7\u00d9Y_#\u00f3\u008e\u00f1\u00ce\u0018\u00d8\u00dd\u0018\u00fa@K\u00c05\u0014\u001e\u00a6S\u0017i\u00ce\u00a8\u00f2n\n{R\u00ba\u00f0\u0081\u0017\u0090\u00d2(\u00ef^H\u001f\u00e8\u00a4\u00bb\u0013\u00ac!@\u009d\u008d\u00dae\u0098l\u00cf\u001f\u008eJ\u00f70O|=^W\u009c-\u00c4\u0089\u008a\u0002\u0007\u00fa\u00b9\u00d0.\n07\u00e9\u00ad\u00ddd_g\u00e9\u00ee\u0085F\u00fc\u00c4\u00ceJ\u0000\u00f4\u00ae\u00d3\u00db\u00aa&\u0006\u00d0e\u00ea\u00b0g\u0081\u001fP_\u00e5\u0091\u00bd3\u00c9p\u0011\u008d\u00b6ii\u00d9\u00e0\u0084\u00dbp\u0018\u00d6s{\u0014\u00f3\u00a8c9J\u00d4W<\u00fco\u0019\u00a4\u00ee\u009d\u00e8]m/\u00ceO \u00f3\u00fa\u0086Rl\u00ec$\u001b\u00d0*\u00a4=7{\u0094Nq\u0089\u0080\u009a\u00c4\u0007W\u00de\u00a5\u00b9\u0091\u00afC\u0010\u001dG\u0018\u0080M\u0087\u00f5\u009b\u009a\u00cbvu>a\u00c6\u0091m\u00a07\u00b9\u00fe\u009f2\u00f6\b\u00d2\u00ab\u0010w\u00d3\u00a5\u00fa\u0091d\u009a>\u0019z\u0001}|\u00d2\u008er R\u001e\u00c8\u00b6\u00f5Y<o\u000b\u0005@\u00eeP?\u00cf\u00cc1\u0002\u00c5\u00f5Zud\u00ad\u00c6d\u0004\u00e3?1\u0087B0\u001c\u00cf8}\u00fb8\u00ca4v\u00f3K\u009b\u0080\\\u000b_\u00b6\u001f7\u00e8\u00e3l&\u00ca\u0092q#\r\u00ab\u008d\u0014\u00ee\u00b4A\u00ce\u0085\u00d8|*\u0004\u00d0\u00ced\u00ad}\u0001s\u00ac(\u00e9\u00d8lWn1\u001a9\u0019A!N\u001c\u00941\u00f0\r\u00d3\u0017F \u0099\u00a7\u0086fH}\u00163c\u00a0v=%\u00de\u00ce\u00f2-X\u0094\u0010\u00b3\u00c8\u00c6\u007f\u0097\u008ez!\u00ce)\n\u00ed\u00b1\u00a53} \u00a1\u00bf4\u00ca\u0088$j\u00d7\u00bfar+)\u0089\u00ec\u0003:\u00b6\u00ee2\u00e4U\u00f1nW_\u00fcmm3\u00f4\u00c0 r\u0084\u0006Z\u00ea\u00c4\u00f0\u00b0\u00e1F\u00b7vC\u001b\u00f5\u007f\u001fa\u0093\u00f4\u000e\u0086}\u00df\u00cd\u00f7H\u00b8k\u0088?K\u0018|\u00d2\u008b.\u0091\u00baQY\u009dKM\u00bd,\u0004A\u009e\u0082F[\u001c\u00bc\u00ad\f\u001b\u0018\u00e5\u008dm/\u00bc.Q\u00a1\u009dh\u008f\u0083T\u0011j3\u0014\u00d2\u0090\u00c80Y\u00ba\u0083".length();
                var5_7 = 32;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_ro.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00e9\u00b4\u00ad W\\\u00e8\u00c0\u0090\u000f\u00b5\u00b3\u0004\u00f7\u00a7o\u00b8\u00dc\u00c5\u00be\u0093\u0097\u009c\u008f\u00ce7\n\u00fb!\u0010\u0093\u0000 5\u00ae\u00df\u00d6\u0092\u00aa\u0099\u001bW/fL\b\u00fe\u00b8\u00d1/\u00d5\u00a1\u0097\u000b7}\u008a\u000e\u00fd\u00ab\u00f4\u00bd\u0014a\u00af";
                    var8_6 = "\u00e9\u00b4\u00ad W\\\u00e8\u00c0\u0090\u000f\u00b5\u00b3\u0004\u00f7\u00a7o\u00b8\u00dc\u00c5\u00be\u0093\u0097\u009c\u008f\u00ce7\n\u00fb!\u0010\u0093\u0000 5\u00ae\u00df\u00d6\u0092\u00aa\u0099\u001bW/fL\b\u00fe\u00b8\u00d1/\u00d5\u00a1\u0097\u000b7}\u008a\u000e\u00fd\u00ab\u00f4\u00bd\u0014a\u00af".length();
                    var5_7 = 32;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_ro.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        CP_ro.b = var9_3;
        CP_ro.c = new String[54];
    }

    private static CP_Xv a(CP_Xv ilIlXv) {
        return ilIlXv;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x236;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_ro", exception);
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
            CP_ro.c[n2] = CP_ro.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_ro.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_ro" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_ro.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

