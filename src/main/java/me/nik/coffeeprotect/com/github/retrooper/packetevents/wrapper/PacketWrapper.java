/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Array;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.security.PublicKey;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.UUID;
import java.util.function.BiFunction;
import java.util.function.IntFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.ProtocolPacketEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.CP_OD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.CP_Zg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_AS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_LP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_O8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_OG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_ZM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_Zz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_d2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_dt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_jA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_jW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_qI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_q_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_vE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_vp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_xt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.Parsers$Parser;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_LD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_ft;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_nm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.CP_uD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession.CP_Xj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.profession.CP_dl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.type.CP_Ww;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.type.CP_y2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_n7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.CP_Gc;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.CP_xj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTEnd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_Lt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_jY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_At;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_ym;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Pu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_yY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_CS;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_G4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_Lb;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_X7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_h8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_h9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_r9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_yF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_Ou;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_hl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_z;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Gf;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_dz;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class PacketWrapper<T extends PacketWrapper<T>> {
    @Nullable
    public Object CP_S;
    @ApiStatus.Internal
    public final Object CP_R;
    protected ClientVersion CP_j;
    protected ServerVersion CP_g;
    private CP_Gf CP_k;
    @Nullable
    protected CP_G2 CP_W;
    protected CP_z CP_P;
    private static final int CP_K;
    private static final int CP_U;
    private static int[] CP_i;
    private static final long a;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static final long[] o;
    private static final Long[] p;
    private static final Map q;
    private static transient /* synthetic */ String LIvFoAUnKB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public PacketWrapper(ClientVersion clientVersion, ServerVersion serverVersion, int n) {
        long l = a ^ 0x671073012540L;
        this.CP_R = new Object();
        this.CP_P = CP_hl.CP_m;
        if (n == -1) {
            throw new IllegalArgumentException((String)((Object)PacketWrapper.a("l", (int)11686, (long)(0xEE68643E878DC5FL ^ l))));
        }
        this.CP_j = clientVersion;
        this.CP_g = serverVersion;
        this.CP_S = null;
        this.CP_k = new CP_Gf(null, n);
    }

    public PacketWrapper(PacketReceiveEvent packetReceiveEvent) {
        this(packetReceiveEvent, true);
    }

    public PacketWrapper(PacketReceiveEvent packetReceiveEvent, boolean bl) {
        block3: {
            PacketWrapper packetWrapper;
            block2: {
                long l = a ^ 0x63C07E7A639L;
                int[] nArray = CP_Gf.CP_y();
                int[] nArray2 = nArray;
                try {
                    this.CP_R = new Object();
                    this.CP_P = CP_hl.CP_m;
                    this.CP_j = packetReceiveEvent.getUser().CP_h();
                    this.CP_g = packetReceiveEvent.getServerVersion();
                    this.CP_W = packetReceiveEvent.getUser();
                    this.CP_S = packetReceiveEvent.getByteBuf();
                    packetWrapper = this;
                    if (nArray2 == null) break block2;
                    packetWrapper.CP_k = new CP_Gf(packetReceiveEvent.getPacketType(), packetReceiveEvent.getPacketId());
                    if (!bl) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                packetWrapper = this;
            }
            packetWrapper.CP_c(packetReceiveEvent);
        }
    }

    public PacketWrapper(PacketSendEvent packetSendEvent) {
        this(packetSendEvent, true);
    }

    public PacketWrapper(PacketSendEvent packetSendEvent, boolean bl) {
        block5: {
            PacketSendEvent packetSendEvent2;
            PacketWrapper packetWrapper;
            block4: {
                long l = a ^ 0x67E4A07EBF58L;
                int[] nArray = CP_Gf.CP_y();
                this.CP_R = new Object();
                this.CP_P = CP_hl.CP_m;
                this.CP_j = packetSendEvent.getUser().CP_h();
                int[] nArray2 = nArray;
                try {
                    try {
                        this.CP_g = packetSendEvent.getServerVersion();
                        this.CP_S = packetSendEvent.getByteBuf();
                        this.CP_k = new CP_Gf(packetSendEvent.getPacketType(), packetSendEvent.getPacketId());
                        packetWrapper = this;
                        packetSendEvent2 = packetSendEvent;
                        if (nArray2 == null) break block4;
                        packetWrapper.CP_W = packetSendEvent2.getUser();
                        if (!bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    packetWrapper = this;
                    packetSendEvent2 = packetSendEvent;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_c(packetSendEvent2);
        }
    }

    public PacketWrapper(int n, ClientVersion clientVersion) {
        this(clientVersion, CP_r7.CP_b().CP_q().CP_F(), n);
    }

    public PacketWrapper(int n) {
        block4: {
            block5: {
                long l = a ^ 0x36B83E0743D6L;
                int[] nArray = CP_Gf.CP_y();
                this.CP_R = new Object();
                this.CP_P = CP_hl.CP_m;
                int[] nArray2 = nArray;
                try {
                    try {
                        if (nArray2 == null) break block4;
                        if (n != -1) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    throw new IllegalArgumentException((String)((Object)PacketWrapper.a("l", (int)28913, (long)(0x23229838479AE798L ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            this.CP_j = ClientVersion.UNKNOWN;
            this.CP_g = CP_r7.CP_b().CP_q().CP_F();
            this.CP_S = null;
            this.CP_k = new CP_Gf(null, n);
        }
    }

    public PacketWrapper(CP_oL ilIloL) {
        this.CP_R = new Object();
        this.CP_P = CP_hl.CP_m;
        this.CP_j = ClientVersion.UNKNOWN;
        this.CP_g = CP_r7.CP_b().CP_q().CP_F();
        this.CP_S = null;
        int n = ilIloL.CP_g(this.CP_g.CP_E());
        this.CP_k = new CP_Gf(ilIloL, n);
    }

    public static PacketWrapper<?> CP_E(ClientVersion clientVersion) {
        long l = a ^ 0x248117C3CA7DL;
        return new PacketWrapper(clientVersion, clientVersion.toServerVersion(), (int)PacketWrapper.c("c", (int)739, (long)(0x3DB9F38E2CF0181BL ^ l)));
    }

    public static PacketWrapper<?> CP_u(Object object) {
        return PacketWrapper.createUniversalPacketWrapper(object, CP_r7.CP_b().CP_q().CP_F());
    }

    public static PacketWrapper<?> createUniversalPacketWrapper(Object object, ServerVersion serverVersion) {
        long l = a ^ 0x3B16F1CC0BA8L;
        PacketWrapper packetWrapper = new PacketWrapper(ClientVersion.UNKNOWN, serverVersion, (int)PacketWrapper.c("c", (int)1856, (long)(0x79B625E1DB105C77L ^ l)));
        packetWrapper.CP_S = object;
        return packetWrapper;
    }

    public static int CP_t(long l) {
        long l2 = a ^ 0x451DF35F3BB1L;
        return (int)(l & PacketWrapper.e("c", (int)8453, (long)(0x6FF672C79745AFB6L ^ l2)));
    }

    public static int CP_i(long l) {
        long l2 = a ^ 0x33748F20C3A6L;
        return (int)(l >>> PacketWrapper.c("c", (int)2415, (long)(0x593C04BEDBEF1A65L ^ l2)) & PacketWrapper.e("c", (int)8453, (long)(0x6FF604AEEB3A57A1L ^ l2)));
    }

    public static long CP_M(int n, int n2) {
        long l = a ^ 0x60C49F5F536EL;
        return (long)n & PacketWrapper.e("c", (int)1606, (long)(0x23094301CE79E028L ^ l)) | ((long)n2 & PacketWrapper.e("c", (int)8453, (long)(0x6FF6571EFB45C769L ^ l))) << PacketWrapper.c("c", (int)12956, (long)(0x10A3A1FD0F1D317EL ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @ApiStatus.Internal
    public final void CP_y(Object var1_1, boolean var2_2, boolean var3_3) {
        block23: {
            block19: {
                block20: {
                    block22: {
                        block21: {
                            block17: {
                                block18: {
                                    block15: {
                                        block16: {
                                            var4_4 = PacketWrapper.a ^ 125527542086334L;
                                            var6_5 = CP_Gf.CP_y();
                                            try {
                                                try {
                                                    try {
                                                        v0 = this;
                                                        if (var6_5 == null) break block15;
                                                        if (v0.CP_S == null) break block16;
                                                    }
                                                    catch (IllegalArgumentException v1) {
                                                        throw PacketWrapper.b(v1);
                                                    }
                                                    v2 = ByteBufHelper.CP_E(this.CP_S);
                                                    if (var6_5 == null) break block17;
                                                }
                                                catch (IllegalArgumentException v3) {
                                                    throw PacketWrapper.b(v3);
                                                }
                                                if (v2 != 0) break block18;
                                            }
                                            catch (IllegalArgumentException v4) {
                                                throw PacketWrapper.b(v4);
                                            }
                                        }
                                        v0 = this;
                                    }
                                    v0.CP_S = CP_Zg.CP_o(var1_1);
                                }
                                v2 = var3_3;
                            }
                            if (v2 == 0) ** GOTO lbl60
                            var7_6 = CP_r7.CP_b().CP_M().CP_g(var1_1);
                            try {
                                try {
                                    try {
                                        v5 = this.CP_k.CP_n();
                                        if (var6_5 == null) break block19;
                                        if (v5 != null) break block20;
                                    }
                                    catch (IllegalArgumentException v6) {
                                        throw PacketWrapper.b(v6);
                                    }
                                    v7 = this.CP_k;
                                    if (!var2_2) break block21;
                                }
                                catch (IllegalArgumentException v8) {
                                    throw PacketWrapper.b(v8);
                                }
                                v9 = CP_hC.SERVER;
                                break block22;
                            }
                            catch (IllegalArgumentException v10) {
                                throw PacketWrapper.b(v10);
                            }
                        }
                        v9 = CP_hC.CLIENT;
                    }
                    v7.CP_c(CP_hU.CP_UnderScore(v9, var7_6.CP_H(), this.CP_g.CP_E(), this.CP_k.CP_Q()));
                }
                this.CP_g = var7_6.CP_h().toServerVersion();
                v5 = this.CP_k.CP_n();
            }
            var8_7 = v5.CP_g(var7_6.CP_h());
            try {
                this.CP_J(var8_7);
                if (var6_5 != null) break block23;
lbl60:
                // 2 sources

                this.CP_J(this.CP_k.CP_Q());
            }
            catch (IllegalArgumentException v11) {
                throw PacketWrapper.b(v11);
            }
        }
        this.CP_J();
    }

    @ApiStatus.Internal
    public final void CP_I(Object object, boolean bl) {
        this.CP_y(object, bl, CP_r7.CP_b().CP_h().CP_K());
    }

    public void CP_e() {
    }

    public void CP_J() {
    }

    public void CP_B(T t) {
    }

    public final void CP_c(ProtocolPacketEvent protocolPacketEvent) {
        block8: {
            PacketWrapper packetWrapper;
            block6: {
                long l = a ^ 0x5EA3A6EEA783L;
                PacketWrapper<?> packetWrapper2 = protocolPacketEvent.getLastUsedWrapper();
                int[] nArray = CP_Gf.CP_y();
                try {
                    block7: {
                        try {
                            try {
                                packetWrapper = this;
                                if (nArray == null) break block6;
                                if (!packetWrapper.getClass().isInstance(packetWrapper2)) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            this.CP_B(packetWrapper2);
                            if (nArray != null) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    packetWrapper = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_e();
        }
        protocolPacketEvent.setLastUsedWrapper(this);
    }

    public ClientVersion CP_B() {
        return this.CP_j;
    }

    public void CP_m(ClientVersion clientVersion) {
        this.CP_j = clientVersion;
    }

    public ServerVersion CP_w() {
        return this.CP_g;
    }

    public void CP_T(ServerVersion serverVersion) {
        this.CP_g = serverVersion;
    }

    public Object CP_b() {
        return this.CP_S;
    }

    public void CP_s(Object object) {
        this.CP_S = object;
    }

    @Deprecated
    public int CP_a() {
        return this.CP_Y();
    }

    @Deprecated
    public void CP_H(int n) {
        this.CP_j(n);
    }

    public int CP_Y() {
        return this.CP_k.CP_Q();
    }

    public void CP_j(int n) {
        this.CP_k.CP_B(n);
    }

    @ApiStatus.Internal
    public CP_Gf CP_e() {
        return this.CP_k;
    }

    public int CP_b() {
        Object object;
        block2: {
            long l;
            block3: {
                l = a ^ 0x55B49C2AAE04L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    object = this.CP_g.CP_z(ServerVersion.V_1_13);
                    if (nArray == null) break block2;
                    if (object == 0) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                object = PacketWrapper.c("c", (int)464, (long)(0x6DB75E94DB46FF5CL ^ l));
                break block2;
            }
            object = PacketWrapper.c("c", (int)14723, (long)(0x55C5CC374333C720L ^ l));
        }
        return object;
    }

    @Deprecated
    public void CP_t() {
        ByteBufHelper.CP_G(this.CP_S);
    }

    public void CP_j() {
        ByteBufHelper.CP_G(this.CP_S);
    }

    public byte CP_E() {
        return ByteBufHelper.CP_Y(this.CP_S);
    }

    public void CP_u(int n) {
        ByteBufHelper.CP_s(this.CP_S, n);
    }

    public short CP_P() {
        return ByteBufHelper.CP_s(this.CP_S);
    }

    public boolean CP_K() {
        boolean bl;
        block2: {
            block3: {
                long l = a ^ 0x2376BF944F34L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    bl = this.CP_E();
                    if (nArray == null) break block2;
                    if (!bl) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public void CP_a(boolean bl) {
        int n;
        PacketWrapper packetWrapper;
        block2: {
            block3: {
                long l = a ^ 0x2B2E29A36549L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    packetWrapper = this;
                    n = bl;
                    if (nArray == null) break block2;
                    if (n == 0) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                n = 1;
                break block2;
            }
            n = 0;
        }
        packetWrapper.CP_u(n);
    }

    public int CP_W() {
        return ByteBufHelper.CP_t(this.CP_S);
    }

    public void CP_a(int n) {
        ByteBufHelper.CP_J(this.CP_S, n);
    }

    public long CP_I() {
        return ByteBufHelper.CP_x(this.CP_S);
    }

    public int CP_w() {
        return ByteBufHelper.CP_V(this.CP_S);
    }

    public void CP_T(int n) {
        ByteBufHelper.CP_k(this.CP_S, n);
    }

    public int CP_f() {
        byte by;
        long l = a ^ 0x3111FB28B571L;
        int n = 0;
        int n2 = 0;
        do {
            by = this.CP_E();
            n |= (by & PacketWrapper.c("c", (int)19728, (long)(0x6C594F324E8528FCL ^ l))) << n2 * PacketWrapper.c("c", (int)11661, (long)(0x352DCD5D0F274877L ^ l));
            if (++n2 <= 5) continue;
            throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)2547, (long)(0x44B4CC44EB14E825L ^ l))));
        } while ((by & PacketWrapper.c("c", (int)31846, (long)(0x74A3F828C69519B3L ^ l))) == PacketWrapper.c("c", (int)31846, (long)(0x74A3F828C69519B3L ^ l)));
        return n;
    }

    /*
     * Unable to fully structure code
     */
    public void CP_J(int var1_1) {
        block23: {
            block26: {
                block25: {
                    block24: {
                        block21: {
                            var2_2 = PacketWrapper.a ^ 19289913757212L;
                            var4_3 = CP_Gf.CP_y();
                            try {
                                block22: {
                                    try {
                                        try {
                                            v0 = var1_1 & PacketWrapper.c("c", (int)16384, (long)(7667755174658514620L ^ var2_2));
                                            if (var4_3 == null) break block21;
                                            if (v0 != 0) break block22;
                                        }
                                        catch (IllegalArgumentException v1) {
                                            throw PacketWrapper.b(v1);
                                        }
                                        this.CP_u(var1_1);
                                        if (var4_3 != null) break block23;
                                    }
                                    catch (IllegalArgumentException v2) {
                                        throw PacketWrapper.b(v2);
                                    }
                                }
                                v0 = var1_1 & PacketWrapper.c("c", (int)5193, (long)(3900066460264876741L ^ var2_2));
                            }
                            catch (IllegalArgumentException v3) {
                                throw PacketWrapper.b(v3);
                            }
                        }
                        try {
                            if (var4_3 == null) break block24;
                            if (v0 == 0) {
                            }
                            ** GOTO lbl34
                        }
                        catch (IllegalArgumentException v4) {
                            throw PacketWrapper.b(v4);
                        }
                        var5_4 = (var1_1 & PacketWrapper.c("c", (int)24353, (long)(8182949668973674943L ^ var2_2)) | PacketWrapper.c("c", (int)3230, (long)(1811440508757201423L ^ var2_2))) << PacketWrapper.c("c", (int)31666, (long)(4570702910207829293L ^ var2_2)) | var1_1 >>> PacketWrapper.c("c", (int)1945, (long)(2665890275818952979L ^ var2_2));
                        try {
                            this.CP_G(var5_4);
                            if (var4_3 != null) break block23;
lbl34:
                            // 2 sources

                            v0 = var1_1 & PacketWrapper.c("c", (int)18532, (long)(465998087007573721L ^ var2_2));
                        }
                        catch (IllegalArgumentException v5) {
                            throw PacketWrapper.b(v5);
                        }
                    }
                    try {
                        if (var4_3 == null) break block25;
                        if (v0 == 0) {
                        }
                        ** GOTO lbl50
                    }
                    catch (IllegalArgumentException v6) {
                        throw PacketWrapper.b(v6);
                    }
                    var5_4 = (var1_1 & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2))) << PacketWrapper.c("c", (int)25318, (long)(1636733359458172003L ^ var2_2)) | (var1_1 >>> PacketWrapper.c("c", (int)11661, (long)(3831980300078609178L ^ var2_2)) & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2))) << PacketWrapper.c("c", (int)31666, (long)(4570702910207829293L ^ var2_2)) | var1_1 >>> PacketWrapper.c("c", (int)17721, (long)(8092110070754253710L ^ var2_2));
                    try {
                        this.CP_T(var5_4);
                        if (var4_3 != null) break block23;
lbl50:
                        // 2 sources

                        v0 = var1_1 & PacketWrapper.c("c", (int)27006, (long)(6827923336643524589L ^ var2_2));
                    }
                    catch (IllegalArgumentException v7) {
                        throw PacketWrapper.b(v7);
                    }
                }
                try {
                    if (var4_3 == null) break block26;
                    if (v0 == 0) {
                    }
                    ** GOTO lbl66
                }
                catch (IllegalArgumentException v8) {
                    throw PacketWrapper.b(v8);
                }
                var5_4 = (var1_1 & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2))) << PacketWrapper.c("c", (int)4925, (long)(5083985745268034952L ^ var2_2)) | (var1_1 >>> PacketWrapper.c("c", (int)11661, (long)(3831980300078609178L ^ var2_2)) & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2))) << PacketWrapper.c("c", (int)16996, (long)(3089233767826431198L ^ var2_2)) | (var1_1 >>> PacketWrapper.c("c", (int)9961, (long)(869449107914225778L ^ var2_2)) & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2))) << PacketWrapper.c("c", (int)31666, (long)(4570702910207829293L ^ var2_2)) | var1_1 >>> PacketWrapper.c("c", (int)32534, (long)(775207734236193177L ^ var2_2));
                try {
                    this.CP_a(var5_4);
                    if (var4_3 != null) break block23;
lbl66:
                    // 2 sources

                    v0 = (var1_1 & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2))) << PacketWrapper.c("c", (int)12737, (long)(7876718832748326726L ^ var2_2)) | (var1_1 >>> PacketWrapper.c("c", (int)11661, (long)(3831980300078609178L ^ var2_2)) & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2))) << PacketWrapper.c("c", (int)16996, (long)(3089233767826431198L ^ var2_2)) | (var1_1 >>> PacketWrapper.c("c", (int)9961, (long)(869449107914225778L ^ var2_2)) & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2))) << PacketWrapper.c("c", (int)31666, (long)(4570702910207829293L ^ var2_2)) | (var1_1 >>> PacketWrapper.c("c", (int)13937, (long)(584204646160722117L ^ var2_2)) & PacketWrapper.c("c", (int)19728, (long)(7807394200627483537L ^ var2_2)) | PacketWrapper.c("c", (int)31846, (long)(8404799590595338974L ^ var2_2)));
                }
                catch (IllegalArgumentException v9) {
                    throw PacketWrapper.b(v9);
                }
            }
            var5_4 = v0;
            this.CP_a(var5_4);
            this.CP_u(var1_1 >>> PacketWrapper.c("c", (int)25735, (long)(4415754405853116977L ^ var2_2)));
        }
    }

    public <K, V> Map<K, V> CP_c(CP_Q9<K> ilIlQ9, CP_Q9<V> ilIlQ92) {
        long l = a ^ 0x60468C188A04L;
        return this.CP_i(ilIlQ9, ilIlQ92, (int)PacketWrapper.c("c", (int)10422, (long)(0x4E82313D85957225L ^ l)));
    }

    public <K, V> Map<K, V> CP_i(CP_Q9<K> ilIlQ9, CP_Q9<V> ilIlQ92, int n) {
        HashMap hashMap;
        block7: {
            long l = a ^ 0x4BD8B3EDCA32L;
            int n2 = this.CP_f();
            int[] nArray = CP_Gf.CP_y();
            try {
                if (n2 > n) {
                    throw new RuntimeException(n2 + (String)((Object)PacketWrapper.a("l", (int)31418, (long)(0x534E81AA4336E424L ^ l))) + n);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw PacketWrapper.b(illegalArgumentException);
            }
            HashMap hashMap2 = new HashMap(n2);
            for (int i = 0; i < n2; ++i) {
                Object r = ilIlQ9.apply(this);
                Object r2 = ilIlQ92.apply(this);
                try {
                    hashMap = hashMap2;
                    if (nArray != null) {
                        hashMap.put(r, r2);
                        if (nArray != null) continue;
                        break;
                    }
                    break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            hashMap = hashMap2;
        }
        return hashMap;
    }

    public <K, V> void CP_a(Map<K, V> map, CP_Ow<K> ilIlOw, CP_Ow<V> ilIlOw2) {
        long l = a ^ 0x3A53322DC05BL;
        this.CP_J(map.size());
        Iterator<Map.Entry<K, V>> iterator = map.entrySet().iterator();
        int[] nArray = CP_Gf.CP_y();
        while (iterator.hasNext()) {
            Map.Entry<K, V> entry = iterator.next();
            K k = entry.getKey();
            V v = entry.getValue();
            ilIlOw.accept(this, k);
            ilIlOw2.accept(this, v);
            if (nArray != null) continue;
        }
    }

    public CP_uD CP_B() {
        CP_Ww ilIlWw = this.CP_t(CP_y2.CP_P());
        CP_Xj ilIlXj = this.CP_t(CP_dl.CP_o());
        int n = this.CP_f();
        return new CP_uD(ilIlWw, ilIlXj, n);
    }

    public void CP_E(CP_uD ilIluD) {
        this.CP_e(ilIluD.CP_P());
        this.CP_e(ilIluD.CP_A());
        this.CP_J(ilIluD.CP_F());
    }

    public CP_Cg CP_f() {
        return CP_n7.CP_t(this);
    }

    public CP_Cg CP_D() {
        CP_Cg ilIlCg;
        block4: {
            CP_Cg ilIlCg2;
            block5: {
                long l = a ^ 0xA91A9003B8DL;
                ilIlCg2 = this.CP_k();
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        ilIlCg = ilIlCg2;
                        if (nArray == null) break block4;
                        if (!ilIlCg.CP_V()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)6154, (long)(0x351FD55B8496F72CL ^ l))));
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            ilIlCg = ilIlCg2;
        }
        return ilIlCg;
    }

    @NotNull
    public CP_Cg CP_k() {
        return CP_n7.CP_UnderScore(this);
    }

    public void CP_D(CP_Cg ilIlCg) {
        CP_n7.CP_H(this, ilIlCg);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void CP_T(CP_Cg ilIlCg) {
        CP_Cg ilIlCg2;
        long l;
        block5: {
            l = a ^ 0x3E4103E57F66L;
            int[] nArray = CP_Gf.CP_y();
            try {
                ilIlCg2 = ilIlCg;
                if (nArray == null) break block5;
                if (ilIlCg2 == null) throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)4703, (long)(0x4DCC0E239421398DL ^ l))));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw PacketWrapper.b(illegalArgumentException);
            }
            ilIlCg2 = ilIlCg;
        }
        try {
            if (ilIlCg2.CP_V()) {
                throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)4703, (long)(0x4DCC0E239421398DL ^ l))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        this.CP_j(ilIlCg);
    }

    public void CP_j(CP_Cg ilIlCg) {
        CP_n7.CP_i(this, ilIlCg);
    }

    public NBTCompound CP_S() {
        return (NBTCompound)this.CP_x();
    }

    @Nullable
    public NBT CP_G() {
        NBT nBT;
        long l = a ^ 0x4E59F17AED6CL;
        NBT nBT2 = this.CP_x();
        try {
            nBT = nBT2 == NBTEnd.INSTANCE ? null : nBT2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        return nBT;
    }

    public NBT CP_x() {
        return CP_xj.CP_Y(this.CP_S, this.CP_g);
    }

    public NBTCompound CP_f() {
        return (NBTCompound)this.CP_E();
    }

    public NBT CP_E() {
        return CP_xj.CP_g(this.CP_S, this.CP_g, CP_Gc.CP_V());
    }

    public void CP_c(NBTCompound nBTCompound) {
        this.CP_O(nBTCompound);
    }

    public void CP_O(NBT nBT) {
        CP_xj.CP_d(this.CP_S, this.CP_g, nBT);
    }

    public String CP_i() {
        long l = a ^ 0x47EDCFC70BF0L;
        return this.CP_p((int)PacketWrapper.c("c", (int)14723, (long)(0x55C5DE6E10DE62D4L ^ l)));
    }

    public String CP_p(int n) {
        String string;
        block13: {
            String string2;
            block14: {
                int n2;
                int[] nArray;
                int n3;
                long l;
                block11: {
                    block12: {
                        l = a ^ 0x6E6E6C141E00L;
                        n3 = this.CP_f();
                        nArray = CP_Gf.CP_y();
                        try {
                            try {
                                n2 = n3;
                                if (nArray == null) break block11;
                                if (n2 <= n * 4) break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)8380, (long)(0x3ADBBA7819596A13L ^ l))) + n3 + (String)((Object)PacketWrapper.a("l", (int)15573, (long)(0x31C33F0D50067678L ^ l))) + n * 4 + ")");
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    n2 = n3;
                }
                try {
                    if (n2 < 0) {
                        throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)16095, (long)(0x1E989F1487EDF46EL ^ l))));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                string2 = ByteBufHelper.CP_t(this.CP_S, ByteBufHelper.readerIndex(this.CP_S), n3, StandardCharsets.UTF_8);
                try {
                    try {
                        ByteBufHelper.readerIndex(this.CP_S, ByteBufHelper.readerIndex(this.CP_S) + n3);
                        string = string2;
                        if (nArray == null) break block13;
                        if (string.length() <= n) break block14;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)27197, (long)(0x5B5F080D2EA52088L ^ l))) + n3 + (String)((Object)PacketWrapper.a("l", (int)10009, (long)(0x3431D1345316DA1L ^ l))) + n + ")");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            string = string2;
        }
        return string;
    }

    @Deprecated
    public String CP_k() {
        return this.CP_q().CP_R(this.CP_J());
    }

    public void CP_M(String string) {
        long l = a ^ 0x4938326C1FBCL;
        this.CP_m(string, (int)PacketWrapper.c("c", (int)14723, (long)(0x55C5D0BBED757698L ^ l)));
    }

    public void CP_m(String string, int n) {
        this.CP_p(string, n, true);
    }

    public void CP_p(String string, int n, boolean bl) {
        block9: {
            Object object;
            byte[] byArray;
            block11: {
                block10: {
                    long l = a ^ 0x3F4F23DE7DAEL;
                    int[] nArray = CP_Gf.CP_y();
                    if (bl) {
                        string = CP_Lb.CP_b(string, n);
                    }
                    byArray = string.getBytes(StandardCharsets.UTF_8);
                    try {
                        try {
                            try {
                                try {
                                    if (nArray == null) break block9;
                                    if (bl) break block10;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw PacketWrapper.b(illegalArgumentException);
                                }
                                object = byArray;
                                if (nArray == null) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            if (((byte[])object).length <= n) break block10;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        throw new IllegalStateException((String)((Object)PacketWrapper.a("l", (int)21595, (long)(0x6A21AAA619787D5FL ^ l))) + byArray.length + (String)((Object)PacketWrapper.a("l", (int)12943, (long)(0x1FB6FB856E159B9BL ^ l))) + n + ")");
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                this.CP_J(byArray.length);
                object = this.CP_S;
            }
            ByteBufHelper.writeBytes(object, byArray);
        }
    }

    public CP_X7 CP_q() {
        return CP_X7.CP_B(this);
    }

    @Deprecated
    public void CP_Y(String string) {
        this.CP_z(this.CP_q().CP_x(string));
    }

    public Component CP_J() {
        Component component;
        block6: {
            PacketWrapper packetWrapper;
            block4: {
                block5: {
                    long l = a ^ 0x7937E7B13D29L;
                    int[] nArray = CP_Gf.CP_y();
                    try {
                        try {
                            packetWrapper = this;
                            if (nArray == null) break block4;
                            if (!packetWrapper.CP_g.CP_z(ServerVersion.V_1_20_3)) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        component = this.CP_k();
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                packetWrapper = this;
            }
            component = packetWrapper.CP_I();
        }
        return component;
    }

    public Component CP_k() {
        return this.CP_q().CP_j(this.CP_x(), this);
    }

    public Component CP_I() {
        String string = this.CP_p(this.CP_b());
        return this.CP_q().CP_x(string);
    }

    public void CP_z(Component component) {
        block8: {
            PacketWrapper packetWrapper;
            block6: {
                long l = a ^ 0x3497AC353285L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    block7: {
                        try {
                            try {
                                packetWrapper = this;
                                if (nArray == null) break block6;
                                if (!packetWrapper.CP_g.CP_z(ServerVersion.V_1_20_3)) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            this.CP_f(component);
                            if (nArray != null) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    packetWrapper = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_v(component);
        }
    }

    public void CP_f(Component component) {
        this.CP_O(this.CP_q().CP_E(component, this));
    }

    public void CP_v(Component component) {
        String string = this.CP_q().CP_R(component);
        this.CP_m(string, this.CP_b());
    }

    public CP_dz CP_v() {
        return this.CP_q().CP_a().CP_w(this.CP_S(), this);
    }

    public void CP_L(CP_dz ilIldz) {
        this.CP_c(this.CP_q().CP_a().CP_H(ilIldz, this));
    }

    public ResourceLocation CP_S(int n) {
        return new ResourceLocation(this.CP_p(n));
    }

    public ResourceLocation readIdentifier() {
        long l = a ^ 0x50D6C7B9DDD9L;
        return this.CP_S((int)PacketWrapper.c("c", (int)14723, (long)(0x55C5C95518A0B4FDL ^ l)));
    }

    public void CP_X(ResourceLocation resourceLocation, int n) {
        this.CP_m(resourceLocation.toString(), n);
    }

    public void writeIdentifier(ResourceLocation resourceLocation) {
        long l = a ^ 0x5F250C5F746L;
        this.CP_X(resourceLocation, (int)PacketWrapper.c("c", (int)14723, (long)(0x55C59C718FDC9E62L ^ l)));
    }

    public int CP_L() {
        return ByteBufHelper.CP_B(this.CP_S);
    }

    public short CP_G() {
        return ByteBufHelper.CP_j(this.CP_S);
    }

    public void CP_G(int n) {
        ByteBufHelper.CP_L(this.CP_S, n);
    }

    public void CP_p(int n) {
        ByteBufHelper.CP_Q(this.CP_S, n);
    }

    public int CP_T() {
        int n;
        block2: {
            short s;
            int n2;
            long l;
            block3: {
                l = a ^ 0x761AA2A8F9A2L;
                n2 = this.CP_L();
                s = 0;
                int[] nArray = CP_Gf.CP_y();
                try {
                    n = n2 & PacketWrapper.c("c", (int)17372, (long)(0x7B447E2615E4EAF4L ^ l));
                    if (nArray == null) break block2;
                    if (n == 0) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                n2 &= PacketWrapper.c("c", (int)14723, (long)(0x55C5EF997DB19086L ^ l));
                s = this.CP_P();
            }
            n = (s & PacketWrapper.c("c", (int)7438, (long)(0x37C2E59F1409B43DL ^ l))) << PacketWrapper.c("c", (int)11683, (long)(0x6005716BC5398485L ^ l)) | n2;
        }
        return n;
    }

    public void CP_I(int n) {
        block9: {
            int n2;
            PacketWrapper packetWrapper;
            block8: {
                int n3;
                int n4;
                block6: {
                    int[] nArray;
                    int n5;
                    block7: {
                        long l = a ^ 0x297E0FAF222DL;
                        n5 = n & PacketWrapper.c("c", (int)14723, (long)(0x55C5B0FDD0B64B09L ^ l));
                        nArray = CP_Gf.CP_y();
                        n4 = (n & PacketWrapper.c("c", (int)11508, (long)(0x3DBACBB2DDD15E58L ^ l))) >> PacketWrapper.c("c", (int)20541, (long)(0x3CF4021B1A5DA290L ^ l));
                        try {
                            n3 = n4;
                            if (nArray == null) break block6;
                            if (n3 == 0) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        n5 |= PacketWrapper.c("c", (int)16232, (long)(0x3B6F70FD36DA4DD0L ^ l));
                    }
                    try {
                        packetWrapper = this;
                        n2 = n5;
                        if (nArray == null) break block8;
                        packetWrapper.CP_G(n2);
                        n3 = n4;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                try {
                    if (n3 == 0) break block9;
                    packetWrapper = this;
                    n2 = n4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_u(n2);
        }
    }

    public long CP_i() {
        return ByteBufHelper.CP_P(this.CP_S);
    }

    public void CP_P(long l) {
        ByteBufHelper.CP_d(this.CP_S, l);
    }

    public long CP_o() {
        long l;
        block2: {
            byte by;
            long l2 = a ^ 0x17A81DBAB0BAL;
            long l3 = 0L;
            int n = 0;
            int[] nArray = CP_Gf.CP_y();
            while (((by = this.CP_E()) & PacketWrapper.c("c", (int)31846, (long)(0x74A3DE9120071C78L ^ l2))) == PacketWrapper.c("c", (int)31846, (long)(0x74A3DE9120071C78L ^ l2))) {
                l = l3 | (long)(by & PacketWrapper.c("c", (int)19728, (long)(0x6C59698BA8172D37L ^ l2))) << n++ * PacketWrapper.c("c", (int)11661, (long)(0x352DEBE4E9B54DBCL ^ l2));
                if (nArray != null) {
                    l3 = l;
                    if (nArray != null) continue;
                }
                break block2;
            }
            l = l3 | (long)(by & PacketWrapper.c("c", (int)19728, (long)(0x6C59698BA8172D37L ^ l2))) << n * PacketWrapper.c("c", (int)11661, (long)(0x352DEBE4E9B54DBCL ^ l2));
        }
        return l;
    }

    public void CP_s(long l) {
        block4: {
            long l2 = a ^ 0x5D5A57EF98DFL;
            int[] nArray = CP_Gf.CP_y();
            while ((l & PacketWrapper.e("c", (int)21710, (long)(0x5159BC5252D97910L ^ l2))) != 0L) {
                this.CP_u((int)(l & PacketWrapper.e("c", (int)1774, (long)(0x4DA09A6F240F2B32L ^ l2))) | PacketWrapper.c("c", (int)31846, (long)(0x74A394636A52341DL ^ l2)));
                l >>>= PacketWrapper.c("c", (int)11661, (long)(0x352DA116A3E065D9L ^ l2));
                try {
                    if (nArray != null) {
                        if (nArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            this.CP_u((int)l);
        }
    }

    public float CP_X() {
        return ByteBufHelper.CP_v(this.CP_S);
    }

    public void CP_R(float f) {
        ByteBufHelper.CP_S(this.CP_S, f);
    }

    public double CP_b() {
        return ByteBufHelper.CP_m(this.CP_S);
    }

    public void CP_Y(double d) {
        ByteBufHelper.CP_UnderScore(this.CP_S, d);
    }

    public byte[] CP_q() {
        return this.CP_W(ByteBufHelper.CP_H(this.CP_S));
    }

    public byte[] CP_W(int n) {
        byte[] byArray = new byte[n];
        ByteBufHelper.CP_b(this.CP_S, byArray);
        return byArray;
    }

    public void CP_e(byte[] byArray) {
        ByteBufHelper.writeBytes(this.CP_S, byArray);
    }

    public byte[] CP_N(int n) {
        long l = a ^ 0x5A74D3278196L;
        int n2 = this.CP_f();
        try {
            if (n2 > n) {
                throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)7842, (long)(0x40891C59063F4B97L ^ l))) + n2 + (String)((Object)PacketWrapper.a("l", (int)10009, (long)(0x3432909FA02F237L ^ l))) + n + ")");
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        return this.CP_W(n2);
    }

    public byte[] CP_l() {
        return this.CP_N(ByteBufHelper.CP_H(this.CP_S));
    }

    public void CP_U(byte[] byArray) {
        this.CP_J(byArray.length);
        this.CP_e(byArray);
    }

    public int[] CP_k() {
        int[] nArray;
        block10: {
            int n;
            int[] nArray2;
            int n2;
            block8: {
                block9: {
                    long l = a ^ 0x2FEA91A90EE2L;
                    int n3 = ByteBufHelper.CP_H(this.CP_S);
                    n2 = this.CP_f();
                    nArray2 = CP_Gf.CP_y();
                    try {
                        try {
                            n = n2;
                            if (nArray2 == null) break block8;
                            if (n <= n3) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        throw new IllegalStateException((String)((Object)PacketWrapper.a("l", (int)2673, (long)(0x557AFADDAA65502EL ^ l))) + n2 + (String)((Object)PacketWrapper.a("l", (int)17207, (long)(0x2A8DDD01902C1966L ^ l))) + n3);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                n = n2;
            }
            int[] nArray3 = new int[n];
            for (int i = 0; i < n2; ++i) {
                try {
                    nArray = nArray3;
                    if (nArray2 != null) {
                        nArray[i] = this.CP_f();
                        if (nArray2 != null) continue;
                        break;
                    }
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            nArray = nArray3;
        }
        return nArray;
    }

    public void CP_W(int[] nArray) {
        long l = a ^ 0x780199E04F2FL;
        this.CP_J(nArray.length);
        int[] nArray2 = nArray;
        int n = nArray2.length;
        int[] nArray3 = CP_Gf.CP_y();
        for (int i = 0; i < n; ++i) {
            int n2 = nArray2[i];
            this.CP_J(n2);
            if (nArray3 != null) continue;
        }
    }

    public long[] CP_D(int n) {
        long[] lArray;
        block4: {
            long l = a ^ 0x3F6D2BE4EE93L;
            long[] lArray2 = new long[n];
            int[] nArray = CP_Gf.CP_y();
            for (int i = 0; i < lArray2.length; ++i) {
                try {
                    lArray = lArray2;
                    if (nArray != null) {
                        lArray[i] = this.CP_i();
                        if (nArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            lArray = lArray2;
        }
        return lArray;
    }

    public byte[] CP_d(int n) {
        byte[] byArray = new byte[n];
        ByteBufHelper.CP_b(this.CP_S, byArray);
        return byArray;
    }

    public void CP_p(byte[] byArray) {
        ByteBufHelper.writeBytes(this.CP_S, byArray);
    }

    public int[] CP_F(int n) {
        int[] nArray;
        block4: {
            long l = a ^ 0xBCF3481DF1FL;
            int[] nArray2 = new int[n];
            int[] nArray3 = CP_Gf.CP_y();
            for (int i = 0; i < nArray2.length; ++i) {
                try {
                    nArray = nArray2;
                    if (nArray3 != null) {
                        nArray[i] = this.CP_f();
                        if (nArray3 != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            nArray = nArray2;
        }
        return nArray;
    }

    public void CP_R(int[] nArray) {
        long l = a ^ 0x5915DD125CE7L;
        int[] nArray2 = nArray;
        int n = nArray2.length;
        int[] nArray3 = CP_Gf.CP_y();
        for (int i = 0; i < n; ++i) {
            int n2 = nArray2[i];
            this.CP_J(n2);
            if (nArray3 != null) continue;
        }
    }

    public long[] CP_J() {
        long[] lArray;
        block10: {
            int n;
            int[] nArray;
            block8: {
                int n2;
                block9: {
                    long l = a ^ 0x2B3AFFC757D5L;
                    int n3 = ByteBufHelper.CP_H(this.CP_S) / PacketWrapper.c("c", (int)31666, (long)(0x3F6E5CA53F7A7CE4L ^ l));
                    n2 = this.CP_f();
                    nArray = CP_Gf.CP_y();
                    try {
                        try {
                            n = n2;
                            if (nArray == null) break block8;
                            if (n <= n3) break block9;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        throw new IllegalStateException((String)((Object)PacketWrapper.a("l", (int)26369, (long)(0x3EDFD2E5AE3E46AL ^ l))) + n2 + (String)((Object)PacketWrapper.a("l", (int)9703, (long)(0x26E55FD0DB25A69BL ^ l))) + n3);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                n = n2;
            }
            long[] lArray2 = new long[n];
            for (int i = 0; i < lArray2.length; ++i) {
                try {
                    lArray = lArray2;
                    if (nArray != null) {
                        lArray[i] = this.CP_i();
                        if (nArray != null) continue;
                        break;
                    }
                    break block10;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            lArray = lArray2;
        }
        return lArray;
    }

    public void CP_s(long[] lArray) {
        long l = a ^ 0xF1CF9A59BECL;
        this.CP_J(lArray.length);
        long[] lArray2 = lArray;
        int n = lArray2.length;
        int[] nArray = CP_Gf.CP_y();
        for (int i = 0; i < n; ++i) {
            long l2 = lArray2[i];
            this.CP_P(l2);
            if (nArray != null) continue;
        }
    }

    public UUID CP_v() {
        long l = this.CP_i();
        long l2 = this.CP_i();
        return new UUID(l, l2);
    }

    public void CP_c(UUID uUID) {
        this.CP_P(uUID.getMostSignificantBits());
        this.CP_P(uUID.getLeastSignificantBits());
    }

    public CP_An CP_E() {
        long l = this.CP_i();
        return new CP_An(l, this.CP_g);
    }

    public void CP_h(CP_An ilIlAn) {
        long l = ilIlAn.CP_b(this.CP_g);
        this.CP_P(l);
    }

    public CP_jY CP_T() {
        return CP_jY.CP_E(this.CP_E());
    }

    public void CP_k(@Nullable CP_jY ilIljY) {
        int n;
        block6: {
            CP_jY ilIljY2;
            block4: {
                block5: {
                    long l = a ^ 0x77635FDFC71CL;
                    int[] nArray = CP_Gf.CP_y();
                    try {
                        try {
                            ilIljY2 = ilIljY;
                            if (nArray == null) break block4;
                            if (ilIljY2 != null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        n = -1;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                ilIljY2 = ilIljY;
            }
            n = ilIljY2.CP_i();
        }
        int n2 = n;
        this.CP_u(n2);
    }

    /*
     * Unable to fully structure code
     */
    public List<CP_nm<?>> CP_c() {
        block24: {
            block19: {
                block18: {
                    var1_1 = PacketWrapper.a ^ 38472462702309L;
                    var4_2 = new ArrayList<CP_nm<?>>();
                    var3_3 = CP_Gf.CP_y();
                    try {
                        v0 = this.CP_g.CP_z(ServerVersion.V_1_9);
                        if (var3_3 == null) break block18;
                        if (v0 != 0) {
                        }
                        ** GOTO lbl53
                    }
                    catch (IllegalArgumentException v1) {
                        throw PacketWrapper.b(v1);
                    }
                    var5_4 = (short)this.CP_g.CP_z(ServerVersion.V_1_10);
                    while ((var6_5 = this.CP_P()) != PacketWrapper.c("c", (int)16754, (long)(1874677158486279941L ^ var1_1))) {
                        block22: {
                            block23: {
                                block20: {
                                    block21: {
                                        try {
                                            try {
                                                try {
                                                    if (var3_3 == null) break block19;
                                                    v2 = var5_4;
                                                    if (var3_3 == null) break block20;
                                                }
                                                catch (IllegalArgumentException v3) {
                                                    throw PacketWrapper.b(v3);
                                                }
                                                if (v2 == 0) break block21;
                                            }
                                            catch (IllegalArgumentException v4) {
                                                throw PacketWrapper.b(v4);
                                            }
                                            v2 = (short)this.CP_f();
                                            break block20;
                                        }
                                        catch (IllegalArgumentException v5) {
                                            throw PacketWrapper.b(v5);
                                        }
                                    }
                                    v2 = this.CP_P();
                                }
                                var7_6 = v2;
                                var8_7 = CP_ft.CP_f(this.CP_g.CP_E(), var7_6);
                                try {
                                    try {
                                        if (var3_3 == null) break block22;
                                        if (var8_7 != null) break block23;
                                    }
                                    catch (IllegalArgumentException v6) {
                                        throw PacketWrapper.b(v6);
                                    }
                                    throw new IllegalStateException((String)PacketWrapper.a("l", (int)23105, (long)(1679253323684845587L ^ var1_1)) + var7_6 + (String)PacketWrapper.a("l", (int)8384, (long)(7554625099077411469L ^ var1_1)) + (Object)this.CP_g.CP_E());
                                }
                                catch (IllegalArgumentException v7) {
                                    throw PacketWrapper.b(v7);
                                }
                            }
                            var4_2.add(new CP_nm<?>(var6_5, var8_7, var8_7.read(this)));
                        }
                        if (var3_3 != null) continue;
                    }
                    try {
                        if (var3_3 != null) break block19;
lbl53:
                        // 2 sources

                        v0 = this.CP_E();
                    }
                    catch (IllegalArgumentException v8) {
                        throw PacketWrapper.b(v8);
                    }
                }
                var5_4 = v0;
                while (var5_4 != PacketWrapper.c("c", (int)19728, (long)(7807373538193869672L ^ var1_1))) {
                    var6_5 = (var5_4 & PacketWrapper.c("c", (int)22845, (long)(2210179401860063094L ^ var1_1))) >> 5;
                    var7_6 = var5_4 & PacketWrapper.c("c", (int)1567, (long)(6600751065277153367L ^ var1_1));
                    var8_7 = CP_ft.CP_f(this.CP_g.CP_E(), var6_5);
                    var9_8 = new CP_nm<?>(var7_6, var8_7, var8_7.read(this));
                    v9 = var4_2;
                    if (var3_3 != null) {
                        v9.add(var9_8);
                        var5_4 = this.CP_E();
                        if (var3_3 != null) continue;
                    }
                    break block24;
                }
            }
            v9 = var4_2;
        }
        return v9;
    }

    public void CP_x(List<CP_nm<?>> list) {
        block27: {
            int[] nArray;
            long l;
            block22: {
                block24: {
                    boolean bl;
                    block21: {
                        l = a ^ 0x76EF44A543ECL;
                        nArray = CP_Gf.CP_y();
                        if (list == null) {
                            list = new ArrayList();
                        }
                        try {
                            try {
                                bl = this.CP_g.CP_z(ServerVersion.V_1_9);
                                if (nArray == null) break block21;
                                if (!bl) break block22;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            bl = this.CP_g.CP_z(ServerVersion.V_1_10);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    boolean bl2 = bl;
                    for (CP_nm<?> ilIlnm : list) {
                        block26: {
                            int n;
                            PacketWrapper packetWrapper;
                            block23: {
                                try {
                                    block25: {
                                        try {
                                            try {
                                                try {
                                                    packetWrapper = this;
                                                    n = ilIlnm.CP_a();
                                                    if (nArray == null) break block23;
                                                    packetWrapper.CP_u(n);
                                                    if (nArray == null) break block24;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw PacketWrapper.b(illegalArgumentException);
                                                }
                                                if (!bl2) break block25;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw PacketWrapper.b(illegalArgumentException);
                                            }
                                            this.CP_J(ilIlnm.CP_Y().CP_H(this.CP_g.CP_E()));
                                            if (nArray != null) break block26;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw PacketWrapper.b(illegalArgumentException);
                                        }
                                    }
                                    packetWrapper = this;
                                    n = ilIlnm.CP_Y().CP_H(this.CP_g.CP_E());
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw PacketWrapper.b(illegalArgumentException);
                                }
                            }
                            packetWrapper.CP_u(n);
                        }
                        ilIlnm.CP_Y().write(this, ilIlnm.CP_F());
                        if (nArray != null) continue;
                    }
                    this.CP_u((int)PacketWrapper.c("c", (int)16754, (long)(0x1A0464E3A1C1520CL ^ l)));
                }
                if (nArray != null) break block27;
            }
            for (CP_nm<?> ilIlnm : list) {
                int n = ilIlnm.CP_Y().CP_H(this.CP_g.CP_E());
                int n2 = ilIlnm.CP_a();
                int n3 = (n << 5 | n2 & PacketWrapper.c("c", (int)26752, (long)(0x61A25DE21E87BE5L ^ l))) & PacketWrapper.c("c", (int)16754, (long)(0x1A0464E3A1C1520CL ^ l));
                try {
                    this.CP_u(n3);
                    ilIlnm.CP_Y().write(this, ilIlnm.CP_F());
                    if (nArray != null) {
                        if (nArray != null) continue;
                        break;
                    }
                    break block27;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            this.CP_u((int)PacketWrapper.c("c", (int)19728, (long)(0x6C5908CCF108DE61L ^ l)));
        }
    }

    public void CP_x(CP_LD ilIlLD) {
        this.CP_x(ilIlLD.CP_p(this.CP_g.CP_E()));
    }

    @Deprecated
    public CP_Pu CP_Q() {
        block14: {
            block13: {
                boolean bl;
                block12: {
                    int[] nArray;
                    block10: {
                        block11: {
                            long l = a ^ 0x3AEBE7302957L;
                            nArray = CP_Gf.CP_y();
                            try {
                                try {
                                    bl = this.CP_g.CP_z(ServerVersion.V_1_20_5);
                                    if (nArray == null) break block10;
                                    if (!bl) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw PacketWrapper.b(illegalArgumentException);
                                }
                                return new CP_Pu(this.CP_f());
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                        }
                        bl = this.CP_g.CP_z(ServerVersion.V_1_19);
                    }
                    try {
                        try {
                            if (nArray == null) break block12;
                            if (bl) break block13;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        bl = this.CP_g.CP_C(ServerVersion.V_1_16_2);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                if (!bl) break block14;
            }
            CP_Pu ilIlPu = new CP_Pu(new NBTCompound());
            ilIlPu.CP_C(this.readIdentifier().toString());
            return ilIlPu;
        }
        return new CP_Pu(this.CP_S());
    }

    /*
     * Unable to fully structure code
     */
    @Deprecated
    public void CP_B(CP_Pu var1_1) {
        block20: {
            block19: {
                block17: {
                    block15: {
                        block16: {
                            var2_2 = PacketWrapper.a ^ 47997652435882L;
                            var4_3 = CP_Gf.CP_y();
                            try {
                                try {
                                    v0 = this.CP_g.CP_z(ServerVersion.V_1_20_5);
                                    if (var4_3 == null) break block15;
                                    if (!v0) break block16;
                                }
                                catch (IllegalArgumentException v1) {
                                    throw PacketWrapper.b(v1);
                                }
                                this.CP_J(var1_1.CP_F());
                                return;
                            }
                            catch (IllegalArgumentException v2) {
                                throw PacketWrapper.b(v2);
                            }
                        }
                        try {
                            v3 = this;
                            if (var4_3 == null) break block17;
                            v0 = v3.CP_g.CP_z(ServerVersion.V_1_19);
                        }
                        catch (IllegalArgumentException v4) {
                            throw PacketWrapper.b(v4);
                        }
                    }
                    try {
                        block18: {
                            try {
                                try {
                                    if (v0) break block18;
                                    v5 = this;
                                    if (var4_3 == null) break block19;
                                }
                                catch (IllegalArgumentException v6) {
                                    throw PacketWrapper.b(v6);
                                }
                                if (v5.CP_g.CP_C(ServerVersion.V_1_16_2)) {
                                }
                                ** GOTO lbl47
                            }
                            catch (IllegalArgumentException v7) {
                                throw PacketWrapper.b(v7);
                            }
                        }
                        v3 = this;
                    }
                    catch (IllegalArgumentException v8) {
                        throw PacketWrapper.b(v8);
                    }
                }
                try {
                    v3.CP_m(var1_1.CP_J(), (int)PacketWrapper.c("c", (int)30140, (long)(5342650604416345736L ^ var2_2)));
                    if (var4_3 != null) break block20;
lbl47:
                    // 2 sources

                    v5 = this;
                }
                catch (IllegalArgumentException v9) {
                    throw PacketWrapper.b(v9);
                }
            }
            v5.CP_c(var1_1.CP_t());
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public CP_h8 CP_x() {
        block14: {
            block12: {
                block13: {
                    var1_1 = PacketWrapper.a ^ 17800793782020L;
                    var4_2 = this.CP_i();
                    var3_3 = CP_Gf.CP_y();
                    try {
                        try {
                            try {
                                v0 = this;
                                if (var3_3 == null) break block12;
                                if (v0.CP_g.CP_z(ServerVersion.V_1_19_3)) {
                                }
                                ** GOTO lbl35
                            }
                            catch (IllegalArgumentException v1) {
                                throw PacketWrapper.b(v1);
                            }
                            v2 = this.CP_K();
                            if (var3_3 == null) break block13;
                        }
                        catch (IllegalArgumentException v3) {
                            throw PacketWrapper.b(v3);
                        }
                        if (v2 != 0) {
                        }
                        ** GOTO lbl27
                    }
                    catch (IllegalArgumentException v4) {
                        throw PacketWrapper.b(v4);
                    }
                    var6_4 = this.CP_W((int)PacketWrapper.c("c", (int)1928, (long)(1168449998818123822L ^ var1_1)));
                    try {
                        if (var3_3 != null) break block14;
lbl27:
                        // 2 sources

                        v2 = 0;
                    }
                    catch (IllegalArgumentException v5) {
                        throw PacketWrapper.b(v5);
                    }
                }
                var6_4 = new byte[v2];
                try {
                    if (var3_3 != null) break block14;
lbl35:
                    // 2 sources

                    v0 = this;
                }
                catch (IllegalArgumentException v6) {
                    throw PacketWrapper.b(v6);
                }
            }
            var6_4 = v0.CP_N((int)PacketWrapper.c("c", (int)31372, (long)(7977805293718134030L ^ var1_1)));
        }
        return new CP_h8(var4_2, var6_4);
    }

    /*
     * Unable to fully structure code
     */
    public void CP_l(CP_h8 var1_1) {
        block18: {
            block13: {
                block17: {
                    block16: {
                        block14: {
                            block15: {
                                var2_2 = PacketWrapper.a ^ 52845405220153L;
                                v0 = CP_Gf.CP_y();
                                this.CP_P(var1_1.CP_A());
                                var4_3 = v0;
                                try {
                                    try {
                                        try {
                                            v1 = this;
                                            if (var4_3 == null) break block13;
                                            if (v1.CP_g.CP_z(ServerVersion.V_1_19_3)) {
                                            }
                                            ** GOTO lbl48
                                        }
                                        catch (IllegalArgumentException v2) {
                                            throw PacketWrapper.b(v2);
                                        }
                                        v3 = var1_1.CP_p().length;
                                        if (var4_3 == null) break block14;
                                    }
                                    catch (IllegalArgumentException v4) {
                                        throw PacketWrapper.b(v4);
                                    }
                                    if (!v3) break block15;
                                }
                                catch (IllegalArgumentException v5) {
                                    throw PacketWrapper.b(v5);
                                }
                                v3 = true;
                                break block14;
                            }
                            v3 = false;
                        }
                        var5_4 = v3;
                        try {
                            try {
                                v6 = this;
                                if (var4_3 == null) break block16;
                                v6.CP_a(var5_4);
                                if (!var5_4) break block17;
                            }
                            catch (IllegalArgumentException v7) {
                                throw PacketWrapper.b(v7);
                            }
                            v6 = this;
                        }
                        catch (IllegalArgumentException v8) {
                            throw PacketWrapper.b(v8);
                        }
                    }
                    v6.CP_e(var1_1.CP_p());
                }
                try {
                    if (var4_3 != null) break block18;
lbl48:
                    // 2 sources

                    v1 = this;
                }
                catch (IllegalArgumentException v9) {
                    throw PacketWrapper.b(v9);
                }
            }
            v1.CP_U(var1_1.CP_p());
        }
    }

    public PublicKey CP_t() {
        long l = a ^ 0xFAA2FABC655L;
        return CP_G4.CP_m(this.CP_N((int)PacketWrapper.c("c", (int)26342, (long)(0xF69248128701CL ^ l))));
    }

    public void CP_V(PublicKey publicKey) {
        this.CP_U(publicKey.getEncoded());
    }

    public CP_Lt CP_g() {
        long l = a ^ 0x3D6FEEFB67FBL;
        Instant instant = this.CP_e();
        PublicKey publicKey = this.CP_t();
        byte[] byArray = this.CP_N((int)PacketWrapper.c("c", (int)21947, (long)(0x42B5FE0591CDE2DCL ^ l)));
        return new CP_Lt(instant, publicKey, byArray);
    }

    public void CP_M(CP_Lt ilIlLt) {
        this.CP_w(ilIlLt.CP_N());
        this.CP_V(ilIlLt.CP_k());
        this.CP_U(ilIlLt.CP_H());
    }

    public CP_ZM CP_c() {
        return new CP_ZM(this.CP_v(), this.CP_g());
    }

    public void CP_q(CP_ZM ilIlZM) {
        this.CP_c(ilIlZM.CP_P());
        this.CP_M(ilIlZM.CP_A());
    }

    public Instant CP_e() {
        return Instant.ofEpochMilli(this.CP_i());
    }

    public void CP_w(Instant instant) {
        this.CP_P(instant.toEpochMilli());
    }

    public CP_yF CP_p() {
        long l = a ^ 0x7061C8F05527L;
        return new CP_yF(this.CP_e(), this.CP_t(), this.CP_N((int)PacketWrapper.c("c", (int)11820, (long)(0x3DE7C840CADAAB85L ^ l))));
    }

    public void CP_Q(CP_yF ilIlyF) {
        this.CP_w(ilIlyF.CP_u());
        this.CP_V(ilIlyF.CP_g());
        this.CP_U(ilIlyF.CP_q());
    }

    public static <K> IntFunction<K> CP_W(IntFunction<K> intFunction, int n) {
        return n2 -> {
            long l = a ^ 0x11F898A10C63L;
            try {
                if (n2 > n) {
                    throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)10172, (long)(0x46DEE215B02E7F79L ^ l))) + n2 + (String)((Object)PacketWrapper.a("l", (int)22957, (long)(0x11F1D7CC9B3E8172L ^ l))) + n);
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw PacketWrapper.b(illegalArgumentException);
            }
            return intFunction.apply(n2);
        };
    }

    public CP_yY CP_j() {
        return new CP_yY(this.readIdentifier(), this.CP_E());
    }

    public void CP_h(CP_yY ilIlyY) {
        this.writeIdentifier(ilIlyY.CP_K());
        this.CP_h(ilIlyY.CP_i());
    }

    public CP_xI CP_E() {
        return new CP_xI(this.CP_v(), this.CP_l());
    }

    public void CP_L(CP_xI ilIlxI) {
        this.CP_c(ilIlxI.CP_k());
        this.CP_U(ilIlxI.CP_m());
    }

    public CP_Zz CP_B() {
        byte by;
        BitSet bitSet;
        int n;
        block4: {
            block5: {
                long l = a ^ 0xCDFB5E9E8D4L;
                n = this.CP_f();
                int[] nArray = CP_Gf.CP_y();
                bitSet = BitSet.valueOf(this.CP_W(3));
                try {
                    try {
                        by = this.CP_g.CP_z(ServerVersion.V_1_21_5);
                        if (nArray == null) break block4;
                        if (by == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    by = this.CP_E();
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            by = 0;
        }
        byte by2 = by;
        return new CP_Zz(n, bitSet, by2);
    }

    public void CP_D(CP_Zz ilIlZz) {
        block5: {
            PacketWrapper packetWrapper;
            block4: {
                long l = a ^ 0x992A8E3C2EFL;
                this.CP_J(ilIlZz.CP_e());
                int[] nArray = CP_Gf.CP_y();
                this.CP_e(Arrays.copyOf(ilIlZz.CP_C().toByteArray(), 3));
                int[] nArray2 = nArray;
                try {
                    try {
                        packetWrapper = this;
                        if (nArray2 == null) break block4;
                        if (!packetWrapper.CP_g.CP_z(ServerVersion.V_1_21_5)) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    packetWrapper = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_u(ilIlZz.CP_j());
        }
    }

    public CP_vE CP_e() {
        CP_qI ilIlqI = this.CP_Q();
        CP_xI ilIlxI = (CP_xI)this.CP_N(PacketWrapper::CP_E);
        return new CP_vE(ilIlqI, ilIlxI);
    }

    public void CP_h(CP_vE ilIlvE) {
        this.CP_r(ilIlvE.CP_T());
        this.CP_I(ilIlvE.CP_c(), PacketWrapper::CP_L);
    }

    public CP_vp CP_b() {
        long l = a ^ 0x7DAF263AE24FL;
        try {
            if (this.CP_g.CP_z(ServerVersion.V_1_19_3)) {
                return new CP_vp(this.CP_W((int)PacketWrapper.c("c", (int)31372, (long)(0x6EB6B63ACC8B4845L ^ l))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        return new CP_vp(this.CP_l());
    }

    public void CP_F(CP_vp ilIlvp) {
        this.CP_e(ilIlvp.CP_Z());
    }

    public CP_LP CP_W() {
        long l = a ^ 0x5C66CB314916L;
        int n = this.CP_f() - 1;
        try {
            if (n == -1) {
                return new CP_LP(new CP_vp(this.CP_W((int)PacketWrapper.c("c", (int)31372, (long)(0x6EB697F32180E31CL ^ l)))));
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        return new CP_LP(n);
    }

    public void CP_O(CP_LP ilIlLP) {
        block5: {
            Object object;
            PacketWrapper packetWrapper;
            block4: {
                long l = a ^ 0x1B6FA9FBF908L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        packetWrapper = this;
                        object = ilIlLP;
                        if (nArray == null) break block4;
                        packetWrapper.CP_J(((CP_LP)object).CP_U() + 1);
                        if (!ilIlLP.CP_R().isPresent()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    packetWrapper = this;
                    object = ilIlLP.CP_R().get();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_e(((CP_vp)object).CP_Z());
        }
    }

    public CP_AS CP_h() {
        long l = a ^ 0x1C2605399FE1L;
        List list = this.CP_q(PacketWrapper.CP_W(ArrayList::new, (int)PacketWrapper.c("c", (int)4332, (long)(0x52EE250DC4105FA8L ^ l))), PacketWrapper::CP_W);
        return new CP_AS(list);
    }

    public void CP_f(CP_AS ilIlAS) {
        this.CP_l(ilIlAS.CP_H(), PacketWrapper::CP_O);
    }

    public CP_qI CP_Q() {
        List list = this.CP_q(PacketWrapper.CP_W(ArrayList::new, 5), PacketWrapper::CP_E);
        return new CP_qI(list);
    }

    public void CP_r(CP_qI ilIlqI) {
        this.CP_l(ilIlqI.CP_t(), PacketWrapper::CP_L);
    }

    public List<CP_jW> CP_m() {
        long l = a ^ 0x581E8E875A21L;
        return this.CP_q(PacketWrapper.CP_W(ArrayList::new, (int)PacketWrapper.c("c", (int)3295, (long)(0x7B556A6D7CDD866AL ^ l))), packetWrapper -> {
            long l = a ^ 0x2C94BFD6E599L;
            return new CP_jW(this.CP_p((int)PacketWrapper.c("c", (int)16996, (long)(0x2ADF14A178CC775BL ^ l))), (CP_vp)this.CP_b());
        });
    }

    public void CP_X(List<CP_jW> list) {
        this.CP_l(list, (packetWrapper, ilIljW) -> {
            long l = a ^ 0x8206C63A2D7L;
            this.CP_m(ilIljW.CP_f(), (int)PacketWrapper.c("c", (int)16996, (long)(0x2ADF3015AB793015L ^ l)));
            this.CP_F(ilIljW.CP_y());
        });
    }

    public BitSet CP_S() {
        return BitSet.valueOf(this.CP_J());
    }

    public void CP_d(BitSet bitSet) {
        this.CP_s(bitSet.toLongArray());
    }

    /*
     * Exception decompiling
     */
    public CP_d2 CP_G() {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 1[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public void CP_r(CP_d2 ilIld2) {
        block5: {
            CP_d2 ilIld22;
            PacketWrapper packetWrapper;
            block4: {
                long l = a ^ 0x5F43C1775273L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        packetWrapper = this;
                        ilIld22 = ilIld2;
                        if (nArray == null) break block4;
                        packetWrapper.CP_J(ilIld22.CP_G().CP_f());
                        if (ilIld2.CP_G() != CP_O8.PARTIALLY_FILTERED) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    packetWrapper = this;
                    ilIld22 = ilIld2;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_d(ilIld22.CP_B());
        }
    }

    public CP_At CP_s() {
        CP_At ilIlAt;
        CP_Cg ilIlCg;
        CP_Cg ilIlCg2;
        CP_Cg ilIlCg3;
        block18: {
            PacketWrapper packetWrapper;
            block16: {
                block17: {
                    ServerVersion serverVersion;
                    block14: {
                        long l = a ^ 0x8D501DE718L;
                        ilIlCg3 = CP_ym.CP_f(this);
                        ilIlCg2 = this.CP_k();
                        int[] nArray = CP_Gf.CP_y();
                        try {
                            block15: {
                                try {
                                    try {
                                        try {
                                            serverVersion = this.CP_w();
                                            if (nArray == null) break block14;
                                            if (serverVersion.CP_z(ServerVersion.V_1_20_5)) break block15;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw PacketWrapper.b(illegalArgumentException);
                                        }
                                        packetWrapper = this;
                                        if (nArray == null) break block16;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw PacketWrapper.b(illegalArgumentException);
                                    }
                                    if (!packetWrapper.CP_w().CP_C(ServerVersion.V_1_19)) break block17;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw PacketWrapper.b(illegalArgumentException);
                                }
                            }
                            serverVersion = this.CP_N(CP_ym::CP_f);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    ilIlCg = (CP_Cg)((Object)serverVersion);
                    break block18;
                }
                packetWrapper = this;
            }
            ilIlCg = packetWrapper.CP_k();
        }
        CP_Cg ilIlCg4 = ilIlCg;
        boolean bl = this.CP_K();
        int n = this.CP_W();
        int n2 = this.CP_W();
        int n3 = this.CP_W();
        int n4 = this.CP_W();
        float f = this.CP_X();
        int n5 = this.CP_W();
        CP_At ilIlAt2 = CP_At.CP_Y(ilIlCg3, ilIlCg4, ilIlCg2, n, n2, n3, n4, f, n5);
        try {
            if (bl) {
                ilIlAt2.CP_K(ilIlAt2.CP_y());
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        try {
            ilIlAt = ilIlAt2;
            if (PacketWrapper.CP_z() == null) {
                CP_Gf.CP_M(new int[1]);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        return ilIlAt;
    }

    public void CP_y(CP_At ilIlAt) {
        int n;
        PacketWrapper packetWrapper;
        block26: {
            block27: {
                int[] nArray;
                block25: {
                    PacketWrapper packetWrapper2;
                    CP_Cg ilIlCg;
                    block23: {
                        block24: {
                            PacketWrapper packetWrapper3;
                            block21: {
                                boolean bl;
                                block20: {
                                    block19: {
                                        CP_Cg ilIlCg2;
                                        block18: {
                                            long l = a ^ 0x9D8B2491C6EL;
                                            int[] nArray2 = CP_Gf.CP_y();
                                            CP_ym.CP_d(this, ilIlAt.CP_y());
                                            nArray = nArray2;
                                            this.CP_j(ilIlAt.CP_n());
                                            ilIlCg = ilIlAt.CP_Q();
                                            try {
                                                ilIlCg2 = ilIlCg;
                                                if (nArray == null) break block18;
                                                if (ilIlCg2 == null) break block19;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw PacketWrapper.b(illegalArgumentException);
                                            }
                                            ilIlCg2 = ilIlCg;
                                        }
                                        try {
                                            bl = ilIlCg2.CP_V();
                                            if (nArray == null) break block20;
                                            if (!bl) break block19;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw PacketWrapper.b(illegalArgumentException);
                                        }
                                        ilIlCg = null;
                                    }
                                    try {
                                        packetWrapper3 = this;
                                        if (nArray == null) break block21;
                                        bl = packetWrapper3.CP_w().CP_z(ServerVersion.V_1_20_5);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw PacketWrapper.b(illegalArgumentException);
                                    }
                                }
                                try {
                                    block22: {
                                        try {
                                            try {
                                                if (bl) break block22;
                                                packetWrapper2 = this;
                                                if (nArray == null) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw PacketWrapper.b(illegalArgumentException);
                                            }
                                            if (!packetWrapper2.CP_w().CP_C(ServerVersion.V_1_19)) break block24;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw PacketWrapper.b(illegalArgumentException);
                                        }
                                    }
                                    packetWrapper3 = this;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw PacketWrapper.b(illegalArgumentException);
                                }
                            }
                            try {
                                packetWrapper3.CP_I(ilIlCg, CP_ym::CP_d);
                                if (nArray != null) break block25;
                                PacketWrapper.CP_e(new int[2]);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                        }
                        packetWrapper2 = this;
                    }
                    packetWrapper2.CP_j(ilIlCg);
                }
                try {
                    try {
                        packetWrapper = this;
                        n = ilIlAt.CP_V();
                        if (nArray == null) break block26;
                        if (n < ilIlAt.CP_y()) break block27;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    n = 1;
                    break block26;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            n = 0;
        }
        packetWrapper.CP_a(n != 0);
        this.CP_a(ilIlAt.CP_V());
        this.CP_a(ilIlAt.CP_y());
        this.CP_a(ilIlAt.CP_c());
        this.CP_a(ilIlAt.CP_W());
        this.CP_R(ilIlAt.CP_R());
        this.CP_a(ilIlAt.CP_g());
    }

    public CP_OG CP_i() {
        CP_jA ilIljA;
        block6: {
            PacketWrapper packetWrapper;
            block4: {
                block5: {
                    long l = a ^ 0x6A1EC3F3DA1FL;
                    int[] nArray = CP_Gf.CP_y();
                    try {
                        try {
                            packetWrapper = this;
                            if (nArray == null) break block4;
                            if (!packetWrapper.CP_g.CP_z(ServerVersion.V_1_21)) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        ilIljA = this.CP_Z(CP_dt.CP_c(), CP_jA::CP_E);
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                packetWrapper = this;
            }
            ilIljA = packetWrapper.CP_t(CP_dt.CP_c());
        }
        CP_jA ilIljA2 = ilIljA;
        Component component = this.CP_J();
        Component component2 = (Component)this.CP_N(PacketWrapper::CP_J);
        return new CP_OG(ilIljA2, component, component2);
    }

    public void CP_M(CP_OG ilIlOG) {
        block8: {
            PacketWrapper packetWrapper;
            block6: {
                long l = a ^ 0x150074F0CF10L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    block7: {
                        try {
                            try {
                                packetWrapper = this;
                                if (nArray == null) break block6;
                                if (!packetWrapper.CP_g.CP_z(ServerVersion.V_1_21)) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            this.CP_C(ilIlOG.CP_J(), CP_jA::CP_l);
                            if (nArray != null) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    packetWrapper = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_e(ilIlOG.CP_J());
        }
        this.CP_z(ilIlOG.CP_I());
        this.CP_I(ilIlOG.CP_i(), PacketWrapper::CP_z);
    }

    public CP_q_ CP_a() {
        int n;
        int n2;
        int n3;
        List<Integer> list;
        byte by;
        block15: {
            int n4;
            block16: {
                ResourceLocation resourceLocation;
                Parsers$Parser parsers$Parser;
                String string;
                long l;
                block19: {
                    PacketWrapper packetWrapper;
                    block17: {
                        block18: {
                            int n5;
                            int[] nArray;
                            block13: {
                                block14: {
                                    l = a ^ 0xC6838B9EE9BL;
                                    by = this.CP_E();
                                    n4 = by & 3;
                                    nArray = CP_Gf.CP_y();
                                    list = this.CP_l(PacketWrapper::CP_f);
                                    try {
                                        try {
                                            n5 = by & PacketWrapper.c("c", (int)31666, (long)(0x3F6E7BF7F804C5AAL ^ l));
                                            if (nArray == null) break block13;
                                            if (n5 == 0) break block14;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw PacketWrapper.b(illegalArgumentException);
                                        }
                                        n5 = this.CP_f();
                                        break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw PacketWrapper.b(illegalArgumentException);
                                    }
                                }
                                n5 = 0;
                            }
                            n3 = n5;
                            try {
                                n2 = n4;
                                n = 2;
                                if (nArray == null) break block15;
                                if (n2 != n) break block16;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            string = this.CP_i();
                            try {
                                try {
                                    packetWrapper = this;
                                    if (nArray == null) break block17;
                                    if (!packetWrapper.CP_g.CP_z(ServerVersion.V_1_19)) break block18;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw PacketWrapper.b(illegalArgumentException);
                                }
                                parsers$Parser = this.CP_A(CP_xt::CP_o);
                                break block19;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                        }
                        packetWrapper = this;
                    }
                    parsers$Parser = CP_xt.CP_Z(packetWrapper.readIdentifier().toString());
                }
                Parsers$Parser parsers$Parser2 = parsers$Parser;
                List list2 = parsers$Parser2.readProperties(this).orElse(null);
                try {
                    resourceLocation = (by & PacketWrapper.c("c", (int)16996, (long)(0x2ADF345DFFA37C59L ^ l))) != 0 ? this.readIdentifier() : null;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                ResourceLocation resourceLocation2 = resourceLocation;
                return new CP_q_(by, list, n3, string, parsers$Parser2, (List<Object>)list2, resourceLocation2);
            }
            n2 = n4;
            n = 1;
        }
        if (n2 == n) {
            String string = this.CP_i();
            return new CP_q_(by, list, n3, string, (Parsers$Parser)null, null, null);
        }
        return new CP_q_(by, list, n3, null, (Parsers$Parser)null, null, null);
    }

    public void CP_p(CP_q_ ilIlq_) {
        Optional<Object> optional;
        block19: {
            block23: {
                int n;
                int[] nArray;
                block17: {
                    block18: {
                        long l = a ^ 0x146692A1354AL;
                        int[] nArray2 = CP_Gf.CP_y();
                        this.CP_u(ilIlq_.CP_s());
                        nArray = nArray2;
                        try {
                            try {
                                this.CP_Q(ilIlq_.CP_R(), PacketWrapper::CP_J);
                                n = ilIlq_.CP_s() & PacketWrapper.c("c", (int)31666, (long)(0x3F6E63F9521C1E7BL ^ l));
                                if (nArray == null) break block17;
                                if (n == 0) break block18;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            this.CP_J(ilIlq_.CP_X());
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    try {
                        ilIlq_.CP_A().ifPresent(this::CP_M);
                        optional = ilIlq_.CP_T();
                        if (nArray == null) break block19;
                        n = optional.isPresent() ? 1 : 0;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                if (n != 0) {
                    Parsers$Parser parsers$Parser;
                    block22: {
                        PacketWrapper packetWrapper;
                        block20: {
                            parsers$Parser = ilIlq_.CP_T().get();
                            try {
                                block21: {
                                    try {
                                        try {
                                            packetWrapper = this;
                                            if (nArray == null) break block20;
                                            if (!packetWrapper.CP_g.CP_z(ServerVersion.V_1_19)) break block21;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw PacketWrapper.b(illegalArgumentException);
                                        }
                                        this.CP_e(parsers$Parser);
                                        if (nArray != null) break block22;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw PacketWrapper.b(illegalArgumentException);
                                    }
                                }
                                packetWrapper = this;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                        }
                        packetWrapper.writeIdentifier(parsers$Parser.getName());
                    }
                    try {
                        try {
                            optional = ilIlq_.CP_a();
                            if (nArray == null) break block19;
                            if (!optional.isPresent()) break block23;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        parsers$Parser.writeProperties(this, ilIlq_.CP_a().get());
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
            }
            optional = ilIlq_.CP_m();
        }
        optional.ifPresent(this::writeIdentifier);
    }

    public CP_r9 CP_M() {
        String string = this.CP_i();
        String string2 = this.CP_i();
        String string3 = this.CP_i();
        return new CP_r9(string, string2, string3);
    }

    public void CP_y(CP_r9 ilIlr9) {
        this.CP_M(ilIlr9.CP_d());
        this.CP_M(ilIlr9.CP_v());
        this.CP_M(ilIlr9.CP_s());
    }

    public <T extends Enum<T>> EnumSet<T> CP_Y(Class<T> clazz) {
        long l = a ^ 0x4C1B324D3493L;
        Enum[] enumArray = (Enum[])clazz.getEnumConstants();
        byte[] byArray = new byte[-Math.floorDiv(-enumArray.length, (int)PacketWrapper.c("c", (int)31666, (long)(0x3F6E3B84F2F01FA2L ^ l)))];
        int[] nArray = CP_Gf.CP_y();
        ByteBufHelper.CP_b(this.CP_b(), byArray);
        BitSet bitSet = BitSet.valueOf(byArray);
        EnumSet<T> enumSet = EnumSet.noneOf(clazz);
        for (int i = 0; i < enumArray.length; ++i) {
            try {
                boolean bl;
                try {
                    bl = bitSet.get(i);
                    if (nArray == null || !bl) continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                bl = enumSet.add(enumArray[i]);
                continue;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw PacketWrapper.b(illegalArgumentException);
            }
        }
        return enumSet;
    }

    public <T extends Enum<T>> void CP_G(EnumSet<T> enumSet, Class<T> clazz) {
        block5: {
            long l = a ^ 0x688CDB984E8EL;
            Enum[] enumArray = (Enum[])clazz.getEnumConstants();
            BitSet bitSet = new BitSet(enumArray.length);
            int[] nArray = CP_Gf.CP_y();
            for (int i = 0; i < enumArray.length; ++i) {
                try {
                    try {
                        if (nArray == null) break block5;
                        if (!enumSet.contains(enumArray[i])) continue;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    bitSet.set(i);
                    continue;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            this.CP_e(Arrays.copyOf(bitSet.toByteArray(), -Math.floorDiv(-enumArray.length, (int)PacketWrapper.c("c", (int)31666, (long)(0x3F6E1F131B2565BFL ^ l)))));
        }
    }

    @ApiStatus.Experimental
    public <U, V, R> U CP_m(CP_OD ilIlOD, ServerVersion serverVersion, CP_Q9<V> ilIlQ9, CP_Q9<R> ilIlQ92) {
        ServerVersion serverVersion2;
        block4: {
            block5: {
                long l = a ^ 0x2F2AE7AAF0F3L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        serverVersion2 = this.CP_g;
                        if (nArray == null) break block4;
                        if (!serverVersion2.CP_M(ilIlOD, serverVersion)) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    return (U)ilIlQ9.apply(this);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            serverVersion2 = ilIlQ92.apply(this);
        }
        return (U)((Object)serverVersion2);
    }

    /*
     * Unable to fully structure code
     */
    @ApiStatus.Experimental
    public <V> void CP_b(CP_OD var1_1, ServerVersion var2_2, V var3_3, CP_Ow<V> var4_4, CP_Ow<V> var5_5) {
        block9: {
            block8: {
                var6_6 = PacketWrapper.a ^ 12871769698935L;
                var8_7 = CP_Gf.CP_y();
                try {
                    try {
                        if (var8_7 == null) break block8;
                        if (this.CP_g.CP_M(var1_1, var2_2)) {
                        }
                        ** GOTO lbl18
                    }
                    catch (IllegalArgumentException v0) {
                        throw PacketWrapper.b(v0);
                    }
                    var4_4.accept(this, var3_3);
                }
                catch (IllegalArgumentException v1) {
                    throw PacketWrapper.b(v1);
                }
            }
            try {
                if (var8_7 != null) break block9;
lbl18:
                // 2 sources

                var5_5.accept(this, var3_3);
            }
            catch (IllegalArgumentException v2) {
                throw PacketWrapper.b(v2);
            }
        }
    }

    @Nullable
    public <R> R CP_N(CP_Q9<R> ilIlQ9) {
        PacketWrapper<Object> packetWrapper;
        block4: {
            block5: {
                long l = a ^ 0x6060C31CF69DL;
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        packetWrapper = this;
                        if (nArray == null) break block4;
                        if (!packetWrapper.CP_K()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    packetWrapper = ilIlQ9.apply(this);
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper = null;
        }
        return (R)packetWrapper;
    }

    /*
     * Unable to fully structure code
     */
    public <V> void CP_I(@Nullable V var1_1, CP_Ow<V> var2_2) {
        block9: {
            block8: {
                var3_3 = PacketWrapper.a ^ 75803936212391L;
                var5_4 = CP_Gf.CP_y();
                try {
                    try {
                        if (var5_4 == null) break block8;
                        if (var1_1 != null) {
                        }
                        ** GOTO lbl19
                    }
                    catch (IllegalArgumentException v0) {
                        throw PacketWrapper.b(v0);
                    }
                    this.CP_a(true);
                    var2_2.accept(this, var1_1);
                }
                catch (IllegalArgumentException v1) {
                    throw PacketWrapper.b(v1);
                }
            }
            try {
                if (var5_4 != null) break block9;
lbl19:
                // 2 sources

                this.CP_a(false);
            }
            catch (IllegalArgumentException v2) {
                throw PacketWrapper.b(v2);
            }
        }
    }

    public <R> Optional<R> CP_P(CP_Q9<R> ilIlQ9) {
        Optional<PacketWrapper<T>> optional;
        block6: {
            block5: {
                PacketWrapper<Object> packetWrapper;
                block4: {
                    long l = a ^ 0x5E5C1E43676CL;
                    int[] nArray = CP_Gf.CP_y();
                    try {
                        try {
                            packetWrapper = this;
                            if (nArray == null) break block4;
                            if (!packetWrapper.CP_K()) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        packetWrapper = ilIlQ9.apply(this);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                optional = Optional.of(packetWrapper);
                break block6;
            }
            optional = Optional.empty();
        }
        return optional;
    }

    /*
     * Unable to fully structure code
     */
    public <V> void CP_f(Optional<V> var1_1, CP_Ow<V> var2_2) {
        block9: {
            block8: {
                var3_3 = PacketWrapper.a ^ 8795339781118L;
                var5_4 = CP_Gf.CP_y();
                try {
                    try {
                        if (var5_4 == null) break block8;
                        if (var1_1.isPresent()) {
                        }
                        ** GOTO lbl19
                    }
                    catch (IllegalArgumentException v0) {
                        throw PacketWrapper.b(v0);
                    }
                    this.CP_a(true);
                    var2_2.accept(this, var1_1.get());
                }
                catch (IllegalArgumentException v1) {
                    throw PacketWrapper.b(v1);
                }
            }
            try {
                if (var5_4 != null) break block9;
lbl19:
                // 2 sources

                this.CP_a(false);
            }
            catch (IllegalArgumentException v2) {
                throw PacketWrapper.b(v2);
            }
        }
    }

    public <K, C extends Collection<K>> C CP_q(IntFunction<C> intFunction, CP_Q9<K> ilIlQ9) {
        int n = this.CP_f();
        return this.CP_K(intFunction, ilIlQ9, n);
    }

    public <K, C extends Collection<K>> C CP_z(IntFunction<C> intFunction, CP_Q9<K> ilIlQ9, int n) {
        long l = a ^ 0x5180985C6002L;
        int n2 = this.CP_f();
        try {
            if (n2 > n) {
                throw new RuntimeException(n2 + (String)((Object)PacketWrapper.a("l", (int)27063, (long)(0x2E91D7FEE29FDD10L ^ l))) + n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        return this.CP_K(intFunction, ilIlQ9, n2);
    }

    private <K, C extends Collection<K>> C CP_K(IntFunction<C> intFunction, CP_Q9<K> ilIlQ9, int n) {
        Collection collection;
        block4: {
            long l = a ^ 0x486C483706CBL;
            Collection collection2 = (Collection)intFunction.apply(n);
            int[] nArray = CP_Gf.CP_y();
            for (int i = 0; i < n; ++i) {
                try {
                    collection = collection2;
                    if (nArray != null) {
                        collection.add(ilIlQ9.apply(this));
                        if (nArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            collection = collection2;
        }
        return (C)collection;
    }

    public <K> void CP_l(Collection<K> collection, CP_Ow<K> ilIlOw) {
        long l = a ^ 0x57CC9D8301C3L;
        int[] nArray = CP_Gf.CP_y();
        this.CP_J(collection.size());
        int[] nArray2 = nArray;
        for (K k : collection) {
            ilIlOw.accept(this, k);
            if (nArray2 != null) continue;
        }
    }

    public <K> List<K> CP_l(CP_Q9<K> ilIlQ9) {
        return this.CP_q(ArrayList::new, ilIlQ9);
    }

    public <K> List<K> CP_Y(CP_Q9<K> ilIlQ9, int n) {
        return this.CP_z(ArrayList::new, ilIlQ9, n);
    }

    public <K> void CP_Q(List<K> list, CP_Ow<K> ilIlOw) {
        long l = a ^ 0x44ED06C54463L;
        int[] nArray = CP_Gf.CP_y();
        this.CP_J(list.size());
        int[] nArray2 = nArray;
        for (K k : list) {
            ilIlOw.accept(this, k);
            if (nArray2 != null) continue;
        }
    }

    public <K> Set<K> CP_I(CP_Q9<K> ilIlQ9) {
        return this.CP_q(HashSet::new, ilIlQ9);
    }

    public <K> Set<K> CP_X(CP_Q9<K> ilIlQ9, int n) {
        return this.CP_z(HashSet::new, ilIlQ9, n);
    }

    public <K> void CP_Z(Set<K> set, CP_Ow<K> ilIlOw) {
        long l = a ^ 0x129551B89CEEL;
        int[] nArray = CP_Gf.CP_y();
        this.CP_J(set.size());
        int[] nArray2 = nArray;
        for (K k : set) {
            ilIlOw.accept(this, k);
            if (nArray2 != null) continue;
        }
    }

    public <K> K[] CP_o(CP_Q9<K> ilIlQ9, Class<K> clazz) {
        Object[] objectArray;
        block4: {
            long l = a ^ 0x3CC0DF63EBDFL;
            int n = this.CP_f();
            Object[] objectArray2 = (Object[])Array.newInstance(clazz, n);
            int[] nArray = CP_Gf.CP_y();
            for (int i = 0; i < n; ++i) {
                try {
                    objectArray = objectArray2;
                    if (nArray != null) {
                        objectArray[i] = ilIlQ9.apply(this);
                        if (nArray != null) continue;
                        break;
                    }
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            objectArray = objectArray2;
        }
        return objectArray;
    }

    public <K> void CP_P(K[] KArray, CP_Ow<K> ilIlOw) {
        long l = a ^ 0x1C6E6E88240DL;
        this.CP_J(KArray.length);
        K[] KArray2 = KArray;
        int[] nArray = CP_Gf.CP_y();
        for (K k : KArray2) {
            ilIlOw.accept(this, k);
            if (nArray != null) continue;
        }
    }

    public <Z extends Enum<?>> Z CP_y(Class<Z> clazz) {
        return (Z)this.CP_H((Enum[])clazz.getEnumConstants());
    }

    public <Z extends Enum<?>> Z CP_H(Z[] ZArray) {
        return ZArray[this.CP_f()];
    }

    public <Z extends Enum<?>> Z CP_i(Class<Z> clazz, Z z) {
        return (Z)this.CP_O((Enum[])clazz.getEnumConstants(), z);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public <Z extends Enum<?>> Z CP_O(Z[] ZArray, Z z) {
        int n;
        int n2;
        block4: {
            long l = a ^ 0x125188F1E2B9L;
            n2 = this.CP_f();
            int[] nArray = CP_Gf.CP_y();
            try {
                n = n2;
                if (nArray == null) break block4;
                if (n < 0) return z;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw PacketWrapper.b(illegalArgumentException);
            }
            n = n2;
        }
        try {
            if (n < ZArray.length) return ZArray[n2];
            return z;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
    }

    public void CP_w(Enum<?> enum_) {
        this.CP_J(enum_.ordinal());
    }

    public <Z extends MappedEntity> Z CP_A(BiFunction<ClientVersion, Integer, Z> biFunction) {
        MappedEntity mappedEntity;
        block4: {
            MappedEntity mappedEntity2;
            block5: {
                long l = a ^ 0x64C4A63C322CL;
                int n = this.CP_f();
                int[] nArray = CP_Gf.CP_y();
                mappedEntity2 = (MappedEntity)biFunction.apply(this.CP_g.CP_E(), n);
                try {
                    try {
                        mappedEntity = mappedEntity2;
                        if (nArray == null) break block4;
                        if (mappedEntity != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    throw new IllegalStateException((String)((Object)PacketWrapper.a("l", (int)14133, (long)(0x39239ADD1F59D1A9L ^ l))) + n + (String)((Object)PacketWrapper.a("l", (int)6405, (long)(0x5A1693F78869FF87L ^ l))) + biFunction);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            mappedEntity = mappedEntity2;
        }
        return (Z)mappedEntity;
    }

    public <Z extends MappedEntity> Z CP_p(CP_Ou<Z> ilIlOu, Z z) {
        block5: {
            CP_Ou<Z> ilIlOu2;
            block4: {
                long l = a ^ 0x284315879F97L;
                CP_Ou<Z> ilIlOu3 = this.CP_p(ilIlOu);
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        ilIlOu2 = ilIlOu3;
                        if (nArray == null) break block4;
                        if (ilIlOu2 == ilIlOu) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    ilIlOu2 = ilIlOu3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            return ilIlOu2.CP_W(this.CP_g.CP_E(), z.getName());
        }
        return z;
    }

    public <Z extends MappedEntity> CP_Ou<Z> CP_p(CP_Ou<Z> ilIlOu) {
        return this.CP_u().CP_F(ilIlOu, this.CP_g.CP_E());
    }

    public CP_z CP_u() {
        CP_z ilIlz;
        block6: {
            PacketWrapper packetWrapper;
            block4: {
                block5: {
                    long l = a ^ 0x2FD817CAF41EL;
                    int[] nArray = CP_Gf.CP_y();
                    try {
                        try {
                            packetWrapper = this;
                            if (nArray == null) break block4;
                            if (packetWrapper.CP_W == null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        ilIlz = this.CP_W;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                packetWrapper = this;
            }
            ilIlz = packetWrapper.CP_P;
        }
        return ilIlz;
    }

    @ApiStatus.Internal
    public void CP_m(CP_z ilIlz) {
        this.CP_P = ilIlz;
    }

    public <Z extends MappedEntity> Z CP_Y(BiFunction<ClientVersion, Integer, Z> biFunction, CP_Q9<Z> ilIlQ9) {
        MappedEntity mappedEntity;
        block7: {
            MappedEntity mappedEntity2;
            block8: {
                long l = a ^ 0x6A22CC6C157BL;
                int n = this.CP_f();
                int[] nArray = CP_Gf.CP_y();
                try {
                    if (n == 0) {
                        return (Z)((MappedEntity)ilIlQ9.apply(this));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
                mappedEntity2 = (MappedEntity)biFunction.apply(this.CP_g.CP_E(), n - 1);
                try {
                    try {
                        mappedEntity = mappedEntity2;
                        if (nArray == null) break block7;
                        if (mappedEntity != null) break block8;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    throw new IllegalStateException((String)((Object)PacketWrapper.a("l", (int)9163, (long)(0x1B3432C97ACC6202L ^ l))) + n + (String)((Object)PacketWrapper.a("l", (int)13163, (long)(0x11C246AF051072B0L ^ l))) + biFunction);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            mappedEntity = mappedEntity2;
        }
        return (Z)mappedEntity;
    }

    public <Z extends MappedEntity> Z CP_t(CP_Ou<Z> ilIlOu) {
        return this.CP_A(this.CP_p(ilIlOu));
    }

    public <Z extends MappedEntity> Z CP_Z(CP_Ou<Z> ilIlOu, CP_Q9<Z> ilIlQ9) {
        return this.CP_Y(this.CP_p(ilIlOu), ilIlQ9);
    }

    public void CP_e(MappedEntity mappedEntity) {
        block4: {
            block5: {
                long l = a ^ 0x6AF0A7BC8B26L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        if (nArray == null) break block4;
                        if (mappedEntity.CP_T()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    throw new IllegalArgumentException((String)((Object)PacketWrapper.a("l", (int)22076, (long)(0x62327362310589BBL ^ l))) + mappedEntity.getName() + (String)((Object)PacketWrapper.a("l", (int)28807, (long)(0x36CF506814492F17L ^ l))) + mappedEntity + ")");
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            this.CP_J(mappedEntity.CP_H(this.CP_g.CP_E()));
        }
    }

    public <Z extends MappedEntity> void CP_C(Z z, CP_Ow<Z> ilIlOw) {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x34C61B3D0E7EL;
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        n = z.CP_T();
                        if (nArray == null) break block4;
                        if (n != 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    this.CP_J(0);
                    ilIlOw.accept(this, z);
                    return;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            n = z.CP_H(this.CP_g.CP_E());
        }
        int n2 = n;
        this.CP_J(n2 + 1);
    }

    public int CP_e() {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x181193757CDBL;
                int[] nArray = CP_Gf.CP_y();
                try {
                    try {
                        n = this.CP_g.CP_z(ServerVersion.V_1_21_2);
                        if (nArray == null) break block4;
                        if (n == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                    return this.CP_f();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            n = this.CP_P();
        }
        return n;
    }

    public void CP_r(int n) {
        block8: {
            PacketWrapper packetWrapper;
            block6: {
                long l = a ^ 0x3A9E799EA117L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    block7: {
                        try {
                            try {
                                packetWrapper = this;
                                if (nArray == null) break block6;
                                if (!packetWrapper.CP_g.CP_z(ServerVersion.V_1_21_2)) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            this.CP_J(n);
                            if (nArray != null) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    packetWrapper = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            packetWrapper.CP_u(n);
        }
    }

    public <L, R> CP_CS<L, R> CP_w(CP_Q9<L> ilIlQ9, CP_Q9<R> ilIlQ92) {
        CP_CS<Object, PacketWrapper<Object>> ilIlCS;
        block6: {
            PacketWrapper<Object> packetWrapper;
            block4: {
                block5: {
                    long l = a ^ 0x65DA09DC8A95L;
                    int[] nArray = CP_Gf.CP_y();
                    try {
                        try {
                            packetWrapper = this;
                            if (nArray == null) break block4;
                            if (!packetWrapper.CP_K()) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        ilIlCS = CP_CS.CP_L(ilIlQ9.apply(this));
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                packetWrapper = ilIlQ92.apply(this);
            }
            ilIlCS = CP_CS.CP_j(packetWrapper);
        }
        return ilIlCS;
    }

    public <L, R> void CP_O(CP_CS<L, R> ilIlCS, CP_Ow<L> ilIlOw, CP_Ow<R> ilIlOw2) {
        block8: {
            block6: {
                long l = a ^ 0x76A0BFD24236L;
                int[] nArray = CP_Gf.CP_y();
                try {
                    block7: {
                        try {
                            try {
                                if (nArray == null) break block6;
                                if (!ilIlCS.CP_z()) break block7;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw PacketWrapper.b(illegalArgumentException);
                            }
                            this.CP_a(true);
                            ilIlOw.accept(this, ilIlCS.CP_b());
                            if (nArray != null) break block8;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                    }
                    this.CP_a(false);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw PacketWrapper.b(illegalArgumentException);
                }
            }
            ilIlOw2.accept(this, ilIlCS.CP_a());
        }
    }

    public void CP_w(float f) {
        this.CP_u((byte)CP_h9.CP_s(f * 256.0f / 360.0f));
    }

    public float CP_i() {
        long l = a ^ 0x660D0493EE52L;
        return (float)(this.CP_E() * PacketWrapper.c("c", (int)17563, (long)(0x3FDEEADCCE917A6AL ^ l))) / 256.0f;
    }

    @Nullable
    public Integer CP_H() {
        Integer n;
        block6: {
            int n2;
            block4: {
                int n3;
                block5: {
                    long l = a ^ 0x74C3F5F7211BL;
                    n3 = this.CP_f();
                    int[] nArray = CP_Gf.CP_y();
                    try {
                        try {
                            n2 = n3;
                            if (nArray == null) break block4;
                            if (n2 != 0) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        n = null;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                n2 = n3 - 1;
            }
            n = n2;
        }
        return n;
    }

    public void CP_F(@Nullable Integer n) {
        int n2;
        PacketWrapper packetWrapper;
        block6: {
            Integer n3;
            block4: {
                block5: {
                    long l = a ^ 0x649E49279B22L;
                    int[] nArray = CP_Gf.CP_y();
                    try {
                        try {
                            packetWrapper = this;
                            n3 = n;
                            if (nArray == null) break block4;
                            if (n3 != null) break block5;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw PacketWrapper.b(illegalArgumentException);
                        }
                        n2 = 0;
                        break block6;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw PacketWrapper.b(illegalArgumentException);
                    }
                }
                n3 = n;
            }
            n2 = n3 + 1;
        }
        packetWrapper.CP_J(n2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public <Z> Z CP_e(int n, CP_Q9<Z> ilIlQ9) {
        long l = a ^ 0x5F6D6FDF4256L;
        int n2 = this.CP_f();
        try {
            if (n2 > n) {
                throw new RuntimeException((String)((Object)PacketWrapper.a("l", (int)24884, (long)(0x3246B50C3F56F7C6L ^ l))) + n2 + (String)((Object)PacketWrapper.a("l", (int)24232, (long)(0x23C7BABF42B2485CL ^ l))) + n);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw PacketWrapper.b(illegalArgumentException);
        }
        Object object = this.CP_S;
        try {
            this.CP_S = ByteBufHelper.CP_e(object, n2);
            Object r = ilIlQ9.apply(this);
            return (Z)r;
        }
        finally {
            this.CP_S = object;
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public <Z> void CP_q(Z z, CP_Ow<Z> ilIlOw) {
        Object object = ByteBufHelper.CP_w(this.CP_S);
        Object object2 = this.CP_S;
        try {
            this.CP_S = object;
            ilIlOw.accept(this, z);
        }
        finally {
            this.CP_S = object2;
        }
        this.CP_J(ByteBufHelper.CP_H(object));
        ByteBufHelper.CP_u(object2, object);
    }

    public static void CP_e(int[] nArray) {
        CP_i = nArray;
    }

    public static int[] CP_z() {
        return CP_i;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block31: {
            block30: {
                block29: {
                    block28: {
                        block27: {
                            block26: {
                                PacketWrapper.a = CP_s.a(-1777870267373603144L, 4365829167057931928L, MethodHandles.lookup().lookupClass()).a(54854730174011L);
                                PacketWrapper.f = new HashMap<K, V>(13);
                                PacketWrapper.CP_e(new int[4]);
                                var22 = PacketWrapper.a ^ 140079139246297L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[31];
                                var29_4 = 0;
                                var28_5 = "2\u00af\u00fc\u009cn\u00d6='\u00df\u00bd\u00b4v\u00e2D\u0094\u00f1-u2;\u0089\u0090\u00a2\u00cf@i\u00b6^b\fu $h\u00a1\u00a1\u00e9\u0014\n\u00d3\u00dd\u00d7kf\u00e2\u008a\u0010m\u00e0\u0091\u00a1AW#\u00c8*\u0005\u00fd\u00c8\u0097\u009f\u00dbG\u0098\u0092\u0019\u00bb\\\u00abP\u00b6\u001b\u0017\u0084y\u0092&\u00fc\u00e7\u0081j\u00afs\u00cd\u00f4 \u00ee\u00a7\u00c2\u0010\u000e%\u008f\u00db\u0003u\u007f\u00ce8Q\u0018\u001fR-\u00c5tX\u00d5\u00ebh\u0005\u0010*~\u00d7\u00fd\u0018*\u00b4|M\u0099\u00f0O\u00f1\u00a6\u00f8\u0007A]\u00f1\u0094U C6u\u00f2\u00ff\u00f7;\u00a5I%RTm\u00fd\u0082\u0096Bj\u00ebm\u00013\u00d9[\u00870\u0003\u00d9(\u008b\u009c\u0087\u0003\u00e0\u009dV\u0015\u0080\u00dc\u00c5B\u00a6\u0091\u00fe\f\u00e5\u00b3D\u00eaGqNqe\u0098\u00fd\u00ef\u00a3\u00f1\u00e7\u00ac\u0010*C\u0001\n\u008bc\u00a3\u0011\u0015\u007f\u0094\u00ff\u0019\u00cf\u00e3\u00f3Hc\u00e2Q7\u00f3\u0082,\u009d\u0086\u0088J\\bE\u0086D\u0086\u0007B/\u008b\u00ad\u00f9\u000e\u00e8\u00a5\u008a\u00feiq_(&\u00bc6\u00e8\u0086.\u00fb\u00a7\u00f2\u008e\u00ac\u008e\u00f6\u00c0\u0098\u0083\u00c1\u0084\n\u0085H\u009c\u0003W\u00ad\u00c3\u000e\u008dW\u000f\u009a\u000e\u00d7\u00db\u00ebA\u009e\u00b8\u0017\u00b1H\u00b4\u0002\u00bf\u00f2\u00af\u00b9?\u00c8\u00ef;\u0084\u00dc\u00b1\u00db\u0083\u00fd\u0090\u00e4\u0010&`\u00a4\u0012\u00d4:\u009f\u001evU\u00b8\u00bc/\t\u0084\u0080\u00b8\u00b8gbf?\u00be\u00de\t\u0097+\u00be\u00b6U\u00edN\u0002S\u00b1\u00d9\u00a97\u00f1bp\u00e3R-f\u00c8\u00cc\n3\u001b4E=`\u00d9\u0018+Z^\u00cf>\u00e0\u00c9\u0096\u00fe\u009b\u0010\b\u009d\u00bd\u00a0`\u00cf\u00ebK\u00c9\u0005f\u00b7\u00a4\u000fkI\u00ac\u0097N&U\u00b4\u0001\u00f8\u0097U_\u00b1C\u0003\u0015)\\\u00e8\u0006\u0006T\u00f8\u0014\u00b6\u00ec/u\u00c7\u00d9\u00cb\u00ab\u0001\u00e2^\u00f0\u0099\u00d3;`=\u001dR\u00180\u007f\u00f7A\u00ca \b\u00e2\u00c7\u00e2\u00a1'\u00b1\u00c7\u00a2\u00b7D\u00c6m\u00aa\u001d$@\"@\u001dn\u00e6\u00d0o\u00143h\u00fa\r\u0015\u0019zVuzY61\u0005\u008c\u0082p\u00ac\u00c4\u00f9\u00b4\u00be\u00c7A\u00a0^\u00daP\u00c8Z?\u00dd\u0004\u00c9\u00f6)\u00d1\u00c5B\u00e3\u00a2\u0081\u00c3\u00d8\u00db\u00a4\f\u00fa/\u00fd\u009d\u008b\u00d8\u00af\u00a9:A\u000b\u0010\u00c3$\u00dax\u001b\u0081\u0090\u0083\u00ea\u009d\u00c3l3\u0098wS\u0010\u0011\u009d\u00ed\u0016\u0091\u0012{Q\u0081&+\u009e\u001e\u00a9\u00cdC\u0080\u00fa\u009e\u00bcf\u00f4^\u00f1\u00b9\u00f0\u00a6\u00a7^\u0014n\u001dw9yJ2$d\u0010\u00c1\u00c7\u0001\u000b\u00bd\u001d\u00ce6\u0014\u00ae\u00fb\u00b4\u00a0\u00e4\u009fX\u00f3\u00f7\u001b;TKE\u00ff\u00ce\u000fO\u000b\u00ab\u001d\u00eb`\u00e8\u0013H\u00eb,S\u00a3\u00fa-e\\\u0011;x\u00d9T\n\u00f1\u0002\u00f77\u0002{\u00b1\u00c6y\u00c7f\u00d0\u00a6\u00cb\u00f1\u0083\u008f\u00ea\u0013\u00aa\u00e5\u009e\u0094WF\u0097\u0085$`\u00d9c'}\u00a4\u00fe\u00b6\n\u00ad\u00a1\u00dfO\u00d8BD\u00e4S\u0005\u00ea\u00c2\u00a12\u00e0Nk\u00afd\u0018\u00bcf\n\u00df'\u008ew\u00be\u0016A\u0011\u008dX\u00e7\u00bdP\u0095#\u001b]\u0092?\u0089\u00b60|\u0018\u00e3\u0083\u00f4*H\u00f3\u009a\u0084\u001e\u00e4\u00e8\u0018\u00f6a%\u00f4\u0088~\u00bd\u00d0!mD\"\u00caz\u00e55\u0013\u00ef\"\u00d9\u009c\u0001@b\u0082\u00e6\u0017 t)\u00d9\u00b1\u00c0\u00b5(\u00eb\u0006\u00d0\u00bb\u0099\u00caRl6\u00e1\u00a1>\rE\u00a5\u00d7Q\u00ab\u00c6\n\u001f\u0001\u008e;\u00c9T\u00c7\u00ab\u0005U \u00fb\t}\u00e1\"I\u00a2Kl8\u00ca'\u009b\u0007\u00ff\u00a0\u00bd\u0082l,\u000fPhA\u00a8\b\u0098u\u00b9:;\u00d3\u00e6\u0013\u00e4K)\u00fe\u00af\u00a5\u0016B\u00cc7O\u00c3\u009e$P\u00bd\u00ef\u009c\u0000\\\u009a\u00c9\u008f\u00b8/\u009f]\u00a8\u00d4@h\u00a28`6\u0001m\u00a4(\u00f5\u00a2;\t \u00a22\bg\u00c0i\u00c8Bf\u0086(*\u0012\u00b8Zr\u00d6\u00f1\u00e7m\u008cf$\u0018\u000fBB\u0002\u00cd\u008d\u00e0P\u0012\u00e7\u00ac\u00eb\u00db\u00f4\u00f5;4\u0012\u00da\u00f3M`\u0095\u001d\u00f7\r\u009e\u00a2\u001f)}s\u00ee\u00c2\u00d6\u0001\u0000xO\u00e5~\u00cb\u0091\u0080c\u00e4QS\u00da\u00faw\u00d2\u0085i\u0089\u0010\u00ca]\u00b6\u009ai\u00da\u0086O'\u0005\u00b08\u00f2}f\u009c\u00ce\u00eae\u009b\u00cc\u00f7\u008b\u00b6/\u00cbXj\u00fc\u00d2\u00df\u00cd%$8\u001b\u00edO\u008b\u00af3\u00b3E*\u009a'=l\u00afl<\u00c2\u00f8Z\u00c0\u00a9( Al\u0019\u00cb\u0010gx\u0097\u0006g\u00d3\u00d4@%E\u00cf/\u0093\r\u00c6T@\u001a[\u0084u\u00f9\u008b\u0084\u00d4w\u0093\u001c\u0082n\u0015U*\u00b4;\u00fc\u00f6\f\u0016\u00af\u0013\u0015\u00f9z\"C\u00a3-\u00abi4G\u0084]\u00ad\t\u0099;!\u009b\u00e0hx\u008c\u008cO\u00ca\u0089Js\u00d4\u00ee_\\\u00d4\u009d\u00c8\u00fb\u009azg@!\u0013\u00cf\u000f9[\u0018\u00cd\u00e7#\u000f\u00b1\u00f9\u00c6\u00f0\">\u00c1H\u0080l\u00e8\u0080}\u0086\u00ee@O9YI\u00d1z\u0082|j\u001d\u00c3m\u000b&@\u001a\f\u009b\u00db\u00f84e\u009b_\u0093\u009f\u00e5k\u00bbmik\u0001DXg\u00c4x\u00a1_v\u00cdgh\u00c2\u00b2?\u00de\u00e7\u00e64#\u00bd\u00c1\u00dd\u00b4V\u00ac\u0006=\u00c4\u0086\u0002\u00e5\u00dd\u000b\t\u00de\u0091'\u00ad\u00cd\u00b3\u00d8\u0017\u00de\u001f\u00ea\u0002\u00f3\u0002\u00d2\u00e5\u008f\u00a3\u00874g\u00d2\u008b\u00d4\u000e\u00a2.\u009bH\u00d0\u008e\u00fe\bw}?\u00f9\u00cd0\u0084\u00b0\u0004\u000f__:5\u00ce\u00da\u00d7y\u00e3A\u00eb\u00b5a\u00ecD\u0002`UxG-\u00b7\u00cfx>-,][\u0017\u00fe\u00cd,Zq\u0082\u0015gT\u00c0\u001byd\u009fg=\u00c3\u00ac@\u00d6\u00d7\u00ce\u00a3\u0006\u009d\fzV*\u00ce\u00cc?\u00feW{j\u00a1\u00cd\u00f8\u00c8\u00fe\u00a0O\u0095\u0088*\u008b\u00dcPE\u00f69\u00be m\u00fb3\u00d1>\u0099?\u00d4Y$\u0002\u00d0l\u00ed\u000e!\u00e1\u009e\u00a5J\u0005X\u0099\u00b4\u0013PE\"u0C\u00ba!\u00ca\u0091x\u00de\u001e\n\u0098z;'\u00a4C\u00bdJ\u008c\u000e\u00c9\u001c\u00d3\u0011\u008b\u00f5\u008em\u00d8H\u008e\u00dcg\u00cd\u00ac \u00a8T\u00a4\u00b6\u009a\u00b7\u00f8D\u00c9!\u0014\u00a7R(\u0012\u0098MI\u00cb\u0002\u0012\u0018$6?1\u00fd\u00b1\u00a5J\u0089e\u001c\u008c\u00a4\u00f2>^\f\u00a5\u0085\u00d8\u00ce9\u0082\u0084h\u00a3yu\u00f65\u00c34(\u008a\u00d0Y\u00ee\u00d9PL\u0001\u00ca\u00abg\u00aeen=C\u00a5\u001e\u00d9N7\u00d2\u009bf\u00bd)!G\u00cf8\u00d1\u0001gRX!\u00b8\u0081\u00ab\u00de(n\u00de\u000e\u00c2\u007f\u00edd\u00e4\u00cdu\u000e}s\u00b4Bw\u00c4\u00c9\u009b\u001d\u00fb/\u0088jt\u00b2/I\u00ab+\u00ff\u0018>3\u00fb\u00e6\u00c0>\u00d6/P\u00a1[8\u00dd\u00c6-\u0095?h\u0098\u00b6\b\u00c6\u00c3\u00fe-Z\u0018-]\u0098+`8\u00ae\u00beag\u00de%\u00e2\u00c1)x@O\u008f\u0007!\u009e\u00b2\u00a3\u0085\u00f8\u0015\u0014\u0083\u00a9\u0001$\u009f\u00bd\u00cc,\u0017\u0084\u00be\u0087<\u0002b\u0085\u0083\u001aD^\u00ac\u0093\u00d0\u00f5UB'\u00ab\u00e7\u00ad\u0006-Rk\u0010\u00fd\u000b\u0087\u00f5!\u00be\u00d2\u008b,\u00c60^\u0010;'z";
                                var30_6 = "2\u00af\u00fc\u009cn\u00d6='\u00df\u00bd\u00b4v\u00e2D\u0094\u00f1-u2;\u0089\u0090\u00a2\u00cf@i\u00b6^b\fu $h\u00a1\u00a1\u00e9\u0014\n\u00d3\u00dd\u00d7kf\u00e2\u008a\u0010m\u00e0\u0091\u00a1AW#\u00c8*\u0005\u00fd\u00c8\u0097\u009f\u00dbG\u0098\u0092\u0019\u00bb\\\u00abP\u00b6\u001b\u0017\u0084y\u0092&\u00fc\u00e7\u0081j\u00afs\u00cd\u00f4 \u00ee\u00a7\u00c2\u0010\u000e%\u008f\u00db\u0003u\u007f\u00ce8Q\u0018\u001fR-\u00c5tX\u00d5\u00ebh\u0005\u0010*~\u00d7\u00fd\u0018*\u00b4|M\u0099\u00f0O\u00f1\u00a6\u00f8\u0007A]\u00f1\u0094U C6u\u00f2\u00ff\u00f7;\u00a5I%RTm\u00fd\u0082\u0096Bj\u00ebm\u00013\u00d9[\u00870\u0003\u00d9(\u008b\u009c\u0087\u0003\u00e0\u009dV\u0015\u0080\u00dc\u00c5B\u00a6\u0091\u00fe\f\u00e5\u00b3D\u00eaGqNqe\u0098\u00fd\u00ef\u00a3\u00f1\u00e7\u00ac\u0010*C\u0001\n\u008bc\u00a3\u0011\u0015\u007f\u0094\u00ff\u0019\u00cf\u00e3\u00f3Hc\u00e2Q7\u00f3\u0082,\u009d\u0086\u0088J\\bE\u0086D\u0086\u0007B/\u008b\u00ad\u00f9\u000e\u00e8\u00a5\u008a\u00feiq_(&\u00bc6\u00e8\u0086.\u00fb\u00a7\u00f2\u008e\u00ac\u008e\u00f6\u00c0\u0098\u0083\u00c1\u0084\n\u0085H\u009c\u0003W\u00ad\u00c3\u000e\u008dW\u000f\u009a\u000e\u00d7\u00db\u00ebA\u009e\u00b8\u0017\u00b1H\u00b4\u0002\u00bf\u00f2\u00af\u00b9?\u00c8\u00ef;\u0084\u00dc\u00b1\u00db\u0083\u00fd\u0090\u00e4\u0010&`\u00a4\u0012\u00d4:\u009f\u001evU\u00b8\u00bc/\t\u0084\u0080\u00b8\u00b8gbf?\u00be\u00de\t\u0097+\u00be\u00b6U\u00edN\u0002S\u00b1\u00d9\u00a97\u00f1bp\u00e3R-f\u00c8\u00cc\n3\u001b4E=`\u00d9\u0018+Z^\u00cf>\u00e0\u00c9\u0096\u00fe\u009b\u0010\b\u009d\u00bd\u00a0`\u00cf\u00ebK\u00c9\u0005f\u00b7\u00a4\u000fkI\u00ac\u0097N&U\u00b4\u0001\u00f8\u0097U_\u00b1C\u0003\u0015)\\\u00e8\u0006\u0006T\u00f8\u0014\u00b6\u00ec/u\u00c7\u00d9\u00cb\u00ab\u0001\u00e2^\u00f0\u0099\u00d3;`=\u001dR\u00180\u007f\u00f7A\u00ca \b\u00e2\u00c7\u00e2\u00a1'\u00b1\u00c7\u00a2\u00b7D\u00c6m\u00aa\u001d$@\"@\u001dn\u00e6\u00d0o\u00143h\u00fa\r\u0015\u0019zVuzY61\u0005\u008c\u0082p\u00ac\u00c4\u00f9\u00b4\u00be\u00c7A\u00a0^\u00daP\u00c8Z?\u00dd\u0004\u00c9\u00f6)\u00d1\u00c5B\u00e3\u00a2\u0081\u00c3\u00d8\u00db\u00a4\f\u00fa/\u00fd\u009d\u008b\u00d8\u00af\u00a9:A\u000b\u0010\u00c3$\u00dax\u001b\u0081\u0090\u0083\u00ea\u009d\u00c3l3\u0098wS\u0010\u0011\u009d\u00ed\u0016\u0091\u0012{Q\u0081&+\u009e\u001e\u00a9\u00cdC\u0080\u00fa\u009e\u00bcf\u00f4^\u00f1\u00b9\u00f0\u00a6\u00a7^\u0014n\u001dw9yJ2$d\u0010\u00c1\u00c7\u0001\u000b\u00bd\u001d\u00ce6\u0014\u00ae\u00fb\u00b4\u00a0\u00e4\u009fX\u00f3\u00f7\u001b;TKE\u00ff\u00ce\u000fO\u000b\u00ab\u001d\u00eb`\u00e8\u0013H\u00eb,S\u00a3\u00fa-e\\\u0011;x\u00d9T\n\u00f1\u0002\u00f77\u0002{\u00b1\u00c6y\u00c7f\u00d0\u00a6\u00cb\u00f1\u0083\u008f\u00ea\u0013\u00aa\u00e5\u009e\u0094WF\u0097\u0085$`\u00d9c'}\u00a4\u00fe\u00b6\n\u00ad\u00a1\u00dfO\u00d8BD\u00e4S\u0005\u00ea\u00c2\u00a12\u00e0Nk\u00afd\u0018\u00bcf\n\u00df'\u008ew\u00be\u0016A\u0011\u008dX\u00e7\u00bdP\u0095#\u001b]\u0092?\u0089\u00b60|\u0018\u00e3\u0083\u00f4*H\u00f3\u009a\u0084\u001e\u00e4\u00e8\u0018\u00f6a%\u00f4\u0088~\u00bd\u00d0!mD\"\u00caz\u00e55\u0013\u00ef\"\u00d9\u009c\u0001@b\u0082\u00e6\u0017 t)\u00d9\u00b1\u00c0\u00b5(\u00eb\u0006\u00d0\u00bb\u0099\u00caRl6\u00e1\u00a1>\rE\u00a5\u00d7Q\u00ab\u00c6\n\u001f\u0001\u008e;\u00c9T\u00c7\u00ab\u0005U \u00fb\t}\u00e1\"I\u00a2Kl8\u00ca'\u009b\u0007\u00ff\u00a0\u00bd\u0082l,\u000fPhA\u00a8\b\u0098u\u00b9:;\u00d3\u00e6\u0013\u00e4K)\u00fe\u00af\u00a5\u0016B\u00cc7O\u00c3\u009e$P\u00bd\u00ef\u009c\u0000\\\u009a\u00c9\u008f\u00b8/\u009f]\u00a8\u00d4@h\u00a28`6\u0001m\u00a4(\u00f5\u00a2;\t \u00a22\bg\u00c0i\u00c8Bf\u0086(*\u0012\u00b8Zr\u00d6\u00f1\u00e7m\u008cf$\u0018\u000fBB\u0002\u00cd\u008d\u00e0P\u0012\u00e7\u00ac\u00eb\u00db\u00f4\u00f5;4\u0012\u00da\u00f3M`\u0095\u001d\u00f7\r\u009e\u00a2\u001f)}s\u00ee\u00c2\u00d6\u0001\u0000xO\u00e5~\u00cb\u0091\u0080c\u00e4QS\u00da\u00faw\u00d2\u0085i\u0089\u0010\u00ca]\u00b6\u009ai\u00da\u0086O'\u0005\u00b08\u00f2}f\u009c\u00ce\u00eae\u009b\u00cc\u00f7\u008b\u00b6/\u00cbXj\u00fc\u00d2\u00df\u00cd%$8\u001b\u00edO\u008b\u00af3\u00b3E*\u009a'=l\u00afl<\u00c2\u00f8Z\u00c0\u00a9( Al\u0019\u00cb\u0010gx\u0097\u0006g\u00d3\u00d4@%E\u00cf/\u0093\r\u00c6T@\u001a[\u0084u\u00f9\u008b\u0084\u00d4w\u0093\u001c\u0082n\u0015U*\u00b4;\u00fc\u00f6\f\u0016\u00af\u0013\u0015\u00f9z\"C\u00a3-\u00abi4G\u0084]\u00ad\t\u0099;!\u009b\u00e0hx\u008c\u008cO\u00ca\u0089Js\u00d4\u00ee_\\\u00d4\u009d\u00c8\u00fb\u009azg@!\u0013\u00cf\u000f9[\u0018\u00cd\u00e7#\u000f\u00b1\u00f9\u00c6\u00f0\">\u00c1H\u0080l\u00e8\u0080}\u0086\u00ee@O9YI\u00d1z\u0082|j\u001d\u00c3m\u000b&@\u001a\f\u009b\u00db\u00f84e\u009b_\u0093\u009f\u00e5k\u00bbmik\u0001DXg\u00c4x\u00a1_v\u00cdgh\u00c2\u00b2?\u00de\u00e7\u00e64#\u00bd\u00c1\u00dd\u00b4V\u00ac\u0006=\u00c4\u0086\u0002\u00e5\u00dd\u000b\t\u00de\u0091'\u00ad\u00cd\u00b3\u00d8\u0017\u00de\u001f\u00ea\u0002\u00f3\u0002\u00d2\u00e5\u008f\u00a3\u00874g\u00d2\u008b\u00d4\u000e\u00a2.\u009bH\u00d0\u008e\u00fe\bw}?\u00f9\u00cd0\u0084\u00b0\u0004\u000f__:5\u00ce\u00da\u00d7y\u00e3A\u00eb\u00b5a\u00ecD\u0002`UxG-\u00b7\u00cfx>-,][\u0017\u00fe\u00cd,Zq\u0082\u0015gT\u00c0\u001byd\u009fg=\u00c3\u00ac@\u00d6\u00d7\u00ce\u00a3\u0006\u009d\fzV*\u00ce\u00cc?\u00feW{j\u00a1\u00cd\u00f8\u00c8\u00fe\u00a0O\u0095\u0088*\u008b\u00dcPE\u00f69\u00be m\u00fb3\u00d1>\u0099?\u00d4Y$\u0002\u00d0l\u00ed\u000e!\u00e1\u009e\u00a5J\u0005X\u0099\u00b4\u0013PE\"u0C\u00ba!\u00ca\u0091x\u00de\u001e\n\u0098z;'\u00a4C\u00bdJ\u008c\u000e\u00c9\u001c\u00d3\u0011\u008b\u00f5\u008em\u00d8H\u008e\u00dcg\u00cd\u00ac \u00a8T\u00a4\u00b6\u009a\u00b7\u00f8D\u00c9!\u0014\u00a7R(\u0012\u0098MI\u00cb\u0002\u0012\u0018$6?1\u00fd\u00b1\u00a5J\u0089e\u001c\u008c\u00a4\u00f2>^\f\u00a5\u0085\u00d8\u00ce9\u0082\u0084h\u00a3yu\u00f65\u00c34(\u008a\u00d0Y\u00ee\u00d9PL\u0001\u00ca\u00abg\u00aeen=C\u00a5\u001e\u00d9N7\u00d2\u009bf\u00bd)!G\u00cf8\u00d1\u0001gRX!\u00b8\u0081\u00ab\u00de(n\u00de\u000e\u00c2\u007f\u00edd\u00e4\u00cdu\u000e}s\u00b4Bw\u00c4\u00c9\u009b\u001d\u00fb/\u0088jt\u00b2/I\u00ab+\u00ff\u0018>3\u00fb\u00e6\u00c0>\u00d6/P\u00a1[8\u00dd\u00c6-\u0095?h\u0098\u00b6\b\u00c6\u00c3\u00fe-Z\u0018-]\u0098+`8\u00ae\u00beag\u00de%\u00e2\u00c1)x@O\u008f\u0007!\u009e\u00b2\u00a3\u0085\u00f8\u0015\u0014\u0083\u00a9\u0001$\u009f\u00bd\u00cc,\u0017\u0084\u00be\u0087<\u0002b\u0085\u0083\u001aD^\u00ac\u0093\u00d0\u00f5UB'\u00ab\u00e7\u00ad\u0006-Rk\u0010\u00fd\u000b\u0087\u00f5!\u00be\u00d2\u008b,\u00c60^\u0010;'z".length();
                                var27_7 = 24;
                                var26_8 = -1;
lbl21:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block26;
                                    break;
                                }
lbl26:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = PacketWrapper.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u0098\u00b4\u00d4\u0005\u00b0)\u0097\u00d5\u00ab\u0096|*\u0096dg2\u0098TWSnP\t\u00e2q\u00ec\u00be\u00eeZp^\u001e\u0017s\u00be\u00e8\u0017|\u00ac\u001fHO\u00b5\u00b8\u00d5\u00b3\u00a4\u00b0\u00bc}\u00d6\u009d\u00fb\u00ef\bua\u0003\u000e\u00fex\u00a6a\b|N\u00bbz\u00cdE\u00e1\u008b\u0007D\u00deU+\"Q (u\u00eb\u0000\u0017_\u00b8\u00a1\u00db\u00a6\u0003\u00f4`>\u0011\u0095\u00c8\u00e1*\u0090\u00ebE\u00c8\u00d0w\u008f.\u0007@\u00dc\u008aJH\u00ae\"\u0097\u00d3\u00a1\u00a8d\u00de";
                                    var30_6 = "\u0098\u00b4\u00d4\u0005\u00b0)\u0097\u00d5\u00ab\u0096|*\u0096dg2\u0098TWSnP\t\u00e2q\u00ec\u00be\u00eeZp^\u001e\u0017s\u00be\u00e8\u0017|\u00ac\u001fHO\u00b5\u00b8\u00d5\u00b3\u00a4\u00b0\u00bc}\u00d6\u009d\u00fb\u00ef\bua\u0003\u000e\u00fex\u00a6a\b|N\u00bbz\u00cdE\u00e1\u008b\u0007D\u00deU+\"Q (u\u00eb\u0000\u0017_\u00b8\u00a1\u00db\u00a6\u0003\u00f4`>\u0011\u0095\u00c8\u00e1*\u0090\u00ebE\u00c8\u00d0w\u008f.\u0007@\u00dc\u008aJH\u00ae\"\u0097\u00d3\u00a1\u00a8d\u00de".length();
                                    var27_7 = 80;
                                    var26_8 = -1;
lbl35:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block26;
                                        break;
                                    }
                                    break;
                                }
lbl40:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = PacketWrapper.a(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block27;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        PacketWrapper.d = var31_3;
                        PacketWrapper.e = new String[31];
                        PacketWrapper.k = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[48];
                        var14_13 = 0;
                        var15_14 = "nK\u00cb\r\u00d1X\u00ce\u001a_\u00af\u00f7\\\u00990\u0011\u00a9]\u00b6\b\u00a3\u00f3\u00c1O\u00b9\u00c0\u00bd\u00ef\u00b6\u000be\u0014\u00ffus\u008c\u0019\u001f\u00ba\u000e\u00d0z\u00d9#\u00b7\u008f2\u00cd\u00c4\u00b3\u0007\u0011\u0083\u00dc3\u00ed&J\u00d1\u00a7]\u0083\u00e2\u0092\u00b7Y\u00c2k\u00f6\u00bcu\u00b9p\u008c&2\u00cf_\u00dd\f\u0093\u00dc\u00a2*h\u00bb\u00abv\u0014\u00c0& \u00af\u008e\u00afPL\u0003b\u00d8DM\u00ef\u00a2\u00d6\u00d0\u00c7S\u0014:\u009e\u00bbZ!I\u00cc\u00d3\u0091\u00cc\u00f9\u00e6\u0084\u00a5\u00c4\u0086\u00f6\u00db\u0015\u001eY{\u0092\u001f\u00c8\u0004\u00a36\u00df\u00ba\u00b7\u008e\u00f1\u0097\u0010\u00ccQ\u0091\ns\u00b40\u0015\u00fa-\u00c3fm\u00a4\u00f0\u00d5\u00d7\u0088\u0099m\u00fc\u00c1\u0080]J\u0094I8\u0005\u00a6\u00f9(\u0097\u0097\u00f5\u001f\u00db\u0089\u00a0\u0012\u0098\u0080;N\u00f3\u00f7r\u00840\f\u008a\f\u00e0z\u00f9C\u0084\u008c\u0013H\u00da\u00e0\u00c2q\u00c1.\u00a27\u00106R\u00e5\u0083k\u00f1=)!\u00c0:G.\u00b1c@\u00db\u00de\u00c5\u000e\u00c8Y\u0019\u008f\u00d4\u00ac\u00e6FF\u00a3S\u00ed`\u00c4\\\u0017N\u00fc4i)X\u00c1\u00eb\u0015J\u0096\u001c\u00b4\u000f\u00b2\u00fcjCj\u00ecI\u00deM\u00ec\u00e6\u0000\u00e5\u00b6\u001e\u00e8*\u00dbS6\rao\u0007B\u00f4\u0081\u00f2\u00f9{\u00ec\u00a3\u0004\u001c\u0019\u0012\u00e4\u00cb\u0091\u0013\u0000t\u00b0\u00cd\t\u00dbo\u00c8\u0081E\u0096\u009e\u00ea\u0091\u001f\u00c3?\u00a2\u009a\u0006K}\u0097\u00b4]\u00dc\u00af\u009d5\u009cJ\u00a2\u0084|\u00c5\u00ef\u0089\u00f2\u00c4\u00e2\u00b5\u0095 y\u0002o\u0004\u00b8\u0017\u0015\u008e{\u00df\u009b\u008cW\u00c3\u0011\u00fbT4\u00db\u00c0\u00a9z\u00cf";
                        var16_15 = "nK\u00cb\r\u00d1X\u00ce\u001a_\u00af\u00f7\\\u00990\u0011\u00a9]\u00b6\b\u00a3\u00f3\u00c1O\u00b9\u00c0\u00bd\u00ef\u00b6\u000be\u0014\u00ffus\u008c\u0019\u001f\u00ba\u000e\u00d0z\u00d9#\u00b7\u008f2\u00cd\u00c4\u00b3\u0007\u0011\u0083\u00dc3\u00ed&J\u00d1\u00a7]\u0083\u00e2\u0092\u00b7Y\u00c2k\u00f6\u00bcu\u00b9p\u008c&2\u00cf_\u00dd\f\u0093\u00dc\u00a2*h\u00bb\u00abv\u0014\u00c0& \u00af\u008e\u00afPL\u0003b\u00d8DM\u00ef\u00a2\u00d6\u00d0\u00c7S\u0014:\u009e\u00bbZ!I\u00cc\u00d3\u0091\u00cc\u00f9\u00e6\u0084\u00a5\u00c4\u0086\u00f6\u00db\u0015\u001eY{\u0092\u001f\u00c8\u0004\u00a36\u00df\u00ba\u00b7\u008e\u00f1\u0097\u0010\u00ccQ\u0091\ns\u00b40\u0015\u00fa-\u00c3fm\u00a4\u00f0\u00d5\u00d7\u0088\u0099m\u00fc\u00c1\u0080]J\u0094I8\u0005\u00a6\u00f9(\u0097\u0097\u00f5\u001f\u00db\u0089\u00a0\u0012\u0098\u0080;N\u00f3\u00f7r\u00840\f\u008a\f\u00e0z\u00f9C\u0084\u008c\u0013H\u00da\u00e0\u00c2q\u00c1.\u00a27\u00106R\u00e5\u0083k\u00f1=)!\u00c0:G.\u00b1c@\u00db\u00de\u00c5\u000e\u00c8Y\u0019\u008f\u00d4\u00ac\u00e6FF\u00a3S\u00ed`\u00c4\\\u0017N\u00fc4i)X\u00c1\u00eb\u0015J\u0096\u001c\u00b4\u000f\u00b2\u00fcjCj\u00ecI\u00deM\u00ec\u00e6\u0000\u00e5\u00b6\u001e\u00e8*\u00dbS6\rao\u0007B\u00f4\u0081\u00f2\u00f9{\u00ec\u00a3\u0004\u001c\u0019\u0012\u00e4\u00cb\u0091\u0013\u0000t\u00b0\u00cd\t\u00dbo\u00c8\u0081E\u0096\u009e\u00ea\u0091\u001f\u00c3?\u00a2\u009a\u0006K}\u0097\u00b4]\u00dc\u00af\u009d5\u009cJ\u00a2\u0084|\u00c5\u00ef\u0089\u00f2\u00c4\u00e2\u00b5\u0095 y\u0002o\u0004\u00b8\u0017\u0015\u008e{\u00df\u009b\u008cW\u00c3\u0011\u00fbT4\u00db\u00c0\u00a9z\u00cf".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block28;
                            break;
                        }
lbl79:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "#\u00cd-\u00b5\u00ce\u00ab\u00df\u00b58\u00fb\u00db\u00d8\\/\u00f5i";
                            var16_15 = "#\u00cd-\u00b5\u00ce\u00ab\u00df\u00b58\u00fb\u00db\u00d8\\/\u00f5i".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block28;
                                break;
                            }
                            break;
                        }
lbl92:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block29;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                    switch (v13) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl105:
                        // 1 sources

                        ** continue;
                    }
                }
                PacketWrapper.i = var17_12;
                PacketWrapper.j = new Integer[48];
                PacketWrapper.CP_U = (int)PacketWrapper.c("c", (int)29443, (long)(var22 ^ 5851897448511009600L));
                PacketWrapper.CP_K = (int)PacketWrapper.c("c", (int)19220, (long)(var22 ^ 3511094690632649557L));
                PacketWrapper.q = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[4];
                var3_23 = 0;
                var4_24 = "\u0004\u00e9\u00c8\u00f9\u00d9\u008am\\\u0004\u00feCV\u00c3\u00b2\u008f\u00c4";
                var5_25 = "\u0004\u00e9\u00c8\u00f9\u00d9\u008am\\\u0004\u00feCV\u00c3\u00b2\u008f\u00c4".length();
                var2_26 = 0;
                while (true) {
                    var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                    v18 = var6_22;
                    v19 = var3_23++;
                    v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                    v21 = -1;
                    break block30;
                    break;
                }
lbl134:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    var4_24 = "\u001c\u00e7\u00eb\u000b\u00fbR\u00f3\u001c/\u00ef\u00dc\u0018(\\\u00aa\u008a";
                    var5_25 = "\u001c\u00e7\u00eb\u000b\u00fbR\u00f3\u001c/\u00ef\u00dc\u0018(\\\u00aa\u008a".length();
                    var2_26 = 0;
                    while (true) {
                        var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
                        v18 = var6_22;
                        v19 = var3_23++;
                        v20 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
                        v21 = 0;
                        break block30;
                        break;
                    }
                    break;
                }
lbl147:
                // 1 sources

                while (true) {
                    v18[v19] = v22;
                    if (var2_26 < var5_25) ** continue;
                    break block31;
                    break;
                }
            }
            var8_28 = v20;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            v22 = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
            switch (v21) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl160:
                // 1 sources

                ** continue;
            }
        }
        PacketWrapper.o = var6_22;
        PacketWrapper.p = new Long[4];
    }

    private static IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x19D;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            PacketWrapper.e[n2] = PacketWrapper.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = PacketWrapper.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5BB;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            PacketWrapper.j[n2] = n3;
        }
        return j[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = PacketWrapper.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long e(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6039;
        if (p[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = o[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])q.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    q.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            PacketWrapper.p[n2] = l4;
        }
        return p[n2];
    }

    private static long e(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = PacketWrapper.e(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite e(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(PacketWrapper.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(PacketWrapper.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(PacketWrapper.class, "e", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

