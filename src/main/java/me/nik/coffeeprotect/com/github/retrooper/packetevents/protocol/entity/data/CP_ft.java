/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.CP_qa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.CP_iR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.CP_qX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.CP_vu;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_AW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_QC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_fM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_fP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_dL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_y8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.EntityDataType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_qq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_xV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.frog.CP_qA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.nautilus.CP_XC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.CP_oN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.CP_uj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.CP_uD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_Xo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_dv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.CP_um;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_Oh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_AV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_yY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.CP_G0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_QG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_hJ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public final class CP_ft {
    private static final VersionedRegistry<EntityDataType<?>> CP_s;
    public static final EntityDataType<Byte> CP_r;
    public static final EntityDataType<Short> CP_W;
    public static final EntityDataType<Integer> CP_f;
    public static final EntityDataType<Long> CP_F;
    public static final EntityDataType<Float> CP_J;
    public static final EntityDataType<String> CP_x;
    @Deprecated
    public static final EntityDataType<String> CP_m;
    public static final EntityDataType<Component> CP_Y;
    @Deprecated
    public static final EntityDataType<Optional<String>> CP_C;
    public static final EntityDataType<Optional<Component>> CP_O;
    public static final EntityDataType<CP_Cg> CP_V;
    public static final EntityDataType<Optional<CP_Cg>> CP_d;
    public static final EntityDataType<Boolean> CP_t;
    public static final EntityDataType<CP_QG> CP_w;
    public static final EntityDataType<CP_An> CP_e;
    public static final EntityDataType<Optional<CP_An>> CP_o;
    public static final EntityDataType<CP_AV> CP_Q;
    public static final EntityDataType<Optional<UUID>> CP_b;
    public static final EntityDataType<Integer> CP_k;
    public static final EntityDataType<Integer> CP_h;
    @ApiStatus.Obsolete
    public static final EntityDataType<NBTCompound> CP_K;
    public static final EntityDataType<CP_um<?>> CP_R;
    public static final EntityDataType<CP_uD> CP_i;
    public static final EntityDataType<Optional<Integer>> CP_T;
    public static final EntityDataType<CP_qX> CP_y;
    @Deprecated
    public static final EntityDataType<Integer> CP_g;
    public static final EntityDataType<CP_AW> CP_q;
    @Deprecated
    public static final EntityDataType<Integer> CP_A;
    public static final EntityDataType<CP_qA> CP_u;
    public static final EntityDataType<Optional<CP_yY>> CP_Z;
    @Deprecated
    public static final EntityDataType<Integer> CP_P;
    public static final EntityDataType<CP_G0> CP_j;
    public static final EntityDataType<CP_iR> CP_a;
    public static final EntityDataType<CP_QG> CP_M;
    public static final EntityDataType<CP_hJ> CP_L;
    public static final EntityDataType<CP_vu> CP_N;
    public static final EntityDataType<List<CP_um<?>>> CP_n;
    @Deprecated
    public static final EntityDataType<Integer> CP_X;
    public static final EntityDataType<CP_dv> CP_E;
    public static final EntityDataType<CP_dL> CP_G;
    public static final EntityDataType<CP_Xo> CP_c;
    public static final EntityDataType<CP_oN> CP_UnderScore;
    public static final EntityDataType<CP_fP> CP_v;
    public static final EntityDataType<CP_qq> CP_H;
    public static final EntityDataType<CP_xV> CP_z;
    public static final EntityDataType<CP_qa> CP_l;
    public static final EntityDataType<CP_XC> CP_B;
    public static final EntityDataType<CP_Oh> CP_S;
    public static final EntityDataType<CP_QC> CP_U;
    public static final EntityDataType<CP_fM> CP_I;
    public static final EntityDataType<CP_y8> CP_D;
    public static final EntityDataType<CP_uj> CP_p;
    private static final long a;
    private static final long b;
    private static transient /* synthetic */ String jSmSemXGIr = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_ft() {
    }

    public static VersionedRegistry<EntityDataType<?>> CP_n() {
        return CP_s;
    }

    public static Collection<EntityDataType<?>> CP_Q() {
        return CP_s.getEntries();
    }

    public static @Nullable EntityDataType<?> CP_f(ClientVersion clientVersion, int n) {
        return CP_s.getById(clientVersion, n);
    }

    public static @Nullable EntityDataType<?> CP_x(String string) {
        return CP_s.getByName(string);
    }

    @ApiStatus.Internal
    public static <T, Z extends T> EntityDataType<Z> CP_N(String string, CP_Q9<Z> ilIlQ9, CP_Ow<T> ilIlOw) {
        return CP_s.define(string, typesBuilderData -> new EntityDataType((TypesBuilderData)typesBuilderData, ilIlQ9, ilIlOw::accept));
    }

    private static CP_Q9<Integer> CP_v() {
        return packetWrapper -> {
            int n;
            long l = a ^ 0x2AD407B6B272L;
            int n2 = EntityDataType.CP_W();
            PacketWrapper packetWrapper2 = packetWrapper;
            if (n2 == 0) {
                if (packetWrapper2.CP_w().CP_z(ServerVersion.V_1_9)) {
                    n = packetWrapper.CP_f();
                    return n;
                }
                packetWrapper2 = packetWrapper;
            }
            n = packetWrapper2.CP_W();
            return n;
        };
    }

    private static CP_Ow<Number> CP_v() {
        return (packetWrapper, number) -> {
            block4: {
                PacketWrapper packetWrapper2;
                block2: {
                    block3: {
                        long l = a ^ 0x60193F4C5CE5L;
                        int n = EntityDataType.CP_W();
                        packetWrapper2 = packetWrapper;
                        if (n != 0) break block2;
                        if (!packetWrapper2.CP_w().CP_z(ServerVersion.V_1_9)) break block3;
                        packetWrapper.CP_J(number.intValue());
                        if (n == 0) break block4;
                    }
                    packetWrapper2 = packetWrapper;
                }
                packetWrapper2.CP_a(number.intValue());
            }
        };
    }

    @Deprecated
    private static CP_Q9<Optional<String>> CP_L() {
        return packetWrapper -> packetWrapper.CP_P(PacketWrapper::CP_k);
    }

    @Deprecated
    private static CP_Ow<Optional<String>> CP_C() {
        return (packetWrapper, optional) -> packetWrapper.CP_f(optional, PacketWrapper::CP_Y);
    }

    private static CP_Q9<Optional<Component>> CP_U() {
        return packetWrapper -> packetWrapper.CP_P(PacketWrapper::CP_J);
    }

    private static CP_Ow<Optional<Component>> CP_N() {
        return (packetWrapper, optional) -> packetWrapper.CP_f(optional, PacketWrapper::CP_z);
    }

    private static CP_Q9<Optional<CP_An>> CP_S() {
        return packetWrapper2 -> {
            long l = a ^ 0x25C131307711L;
            int n = EntityDataType.CP_W();
            PacketWrapper packetWrapper3 = packetWrapper2;
            if (n == 0) {
                if (packetWrapper3.CP_w().CP_z(ServerVersion.V_1_9)) {
                    return packetWrapper2.CP_P(PacketWrapper::CP_E);
                }
                packetWrapper3 = packetWrapper2;
            }
            return packetWrapper3.CP_P(packetWrapper -> new CP_An(packetWrapper.CP_W(), packetWrapper.CP_W(), packetWrapper.CP_W()));
        };
    }

    private static CP_Ow<Optional<CP_An>> CP_L() {
        return (packetWrapper, optional) -> {
            block4: {
                PacketWrapper packetWrapper3;
                block2: {
                    block3: {
                        long l = a ^ 0x4802F2BEA45FL;
                        int n = EntityDataType.CP_z();
                        packetWrapper3 = packetWrapper;
                        if (n == 0) break block2;
                        if (!packetWrapper3.CP_w().CP_z(ServerVersion.V_1_9)) break block3;
                        packetWrapper.CP_f(optional, PacketWrapper::CP_h);
                        if (n != 0) break block4;
                    }
                    packetWrapper3 = packetWrapper;
                }
                packetWrapper3.CP_f(optional, (packetWrapper2, ilIlAn) -> {
                    packetWrapper.CP_a(ilIlAn.CP_w());
                    packetWrapper.CP_a(ilIlAn.CP_c());
                    packetWrapper.CP_a(ilIlAn.CP_k());
                });
            }
        };
    }

    private static /* synthetic */ void lambda$static$29(PacketWrapper packetWrapper, List list) {
        packetWrapper.CP_Q(list, CP_um::CP_u);
    }

    private static /* synthetic */ List lambda$static$28(PacketWrapper packetWrapper) {
        return packetWrapper.CP_l(CP_um::CP_g);
    }

    private static /* synthetic */ void lambda$static$27(PacketWrapper packetWrapper, CP_vu ilIlvu) {
        packetWrapper.CP_J(ilIlvu.ordinal());
    }

    private static /* synthetic */ CP_vu lambda$static$26(PacketWrapper packetWrapper) {
        return CP_vu.values()[packetWrapper.CP_f()];
    }

    private static /* synthetic */ void lambda$static$25(PacketWrapper packetWrapper, CP_hJ ilIlhJ) {
        packetWrapper.CP_R(ilIlhJ.CP_S());
        packetWrapper.CP_R(ilIlhJ.CP_Y());
        packetWrapper.CP_R(ilIlhJ.CP_w());
        packetWrapper.CP_R(ilIlhJ.CP_j());
    }

    private static /* synthetic */ CP_hJ lambda$static$24(PacketWrapper packetWrapper) {
        return new CP_hJ(packetWrapper.CP_X(), packetWrapper.CP_X(), packetWrapper.CP_X(), packetWrapper.CP_X());
    }

    private static /* synthetic */ void lambda$static$23(PacketWrapper packetWrapper, CP_QG ilIlQG) {
        packetWrapper.CP_R(ilIlQG.CP_A);
        packetWrapper.CP_R(ilIlQG.CP_F);
        packetWrapper.CP_R(ilIlQG.CP_p);
    }

    private static /* synthetic */ CP_QG lambda$static$22(PacketWrapper packetWrapper) {
        return new CP_QG(packetWrapper.CP_X(), packetWrapper.CP_X(), packetWrapper.CP_X());
    }

    private static /* synthetic */ void lambda$static$21(PacketWrapper packetWrapper, CP_iR ilIliR) {
        packetWrapper.CP_J(ilIliR.ordinal());
    }

    private static /* synthetic */ CP_iR lambda$static$20(PacketWrapper packetWrapper) {
        int n = packetWrapper.CP_f();
        return CP_iR.values()[n];
    }

    private static /* synthetic */ void lambda$static$19(PacketWrapper packetWrapper2, Optional optional) {
        packetWrapper2.CP_I(optional.orElse(null), (packetWrapper, ilIlyY) -> {
            packetWrapper.CP_M(ilIlyY.CP_K().toString());
            packetWrapper.CP_h(ilIlyY.CP_i());
        });
    }

    private static /* synthetic */ Optional lambda$static$17(PacketWrapper packetWrapper2) {
        return Optional.ofNullable((CP_yY)packetWrapper2.CP_N(packetWrapper -> {
            long l = a ^ 0x34349208B3F4L;
            return new CP_yY(new ResourceLocation(packetWrapper.CP_p((int)b)), packetWrapper.CP_E());
        }));
    }

    private static /* synthetic */ void lambda$static$15(PacketWrapper packetWrapper, CP_qX ilIlqX) {
        packetWrapper.CP_J(ilIlqX.CP_T(packetWrapper.CP_w().CP_E()));
    }

    private static /* synthetic */ CP_qX lambda$static$14(PacketWrapper packetWrapper) {
        int n = packetWrapper.CP_f();
        return CP_qX.CP_w(packetWrapper.CP_w().CP_E(), n);
    }

    private static /* synthetic */ void lambda$static$13(PacketWrapper packetWrapper, Optional optional) {
        packetWrapper.CP_J(optional.orElse(-1) + 1);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ Optional lambda$static$12(PacketWrapper packetWrapper) {
        Optional<Object> optional;
        long l = a ^ 0x64184F2B2198L;
        int n = packetWrapper.CP_f();
        int n2 = EntityDataType.CP_z();
        int n3 = n;
        if (n2 != 0) {
            if (n3 == 0) {
                optional = Optional.empty();
                return optional;
            }
            n3 = n - 1;
        }
        optional = Optional.of(n3);
        return optional;
    }

    private static /* synthetic */ void lambda$static$11(PacketWrapper packetWrapper, Optional optional) {
        packetWrapper.CP_I(optional.orElse(null), PacketWrapper::CP_c);
    }

    private static /* synthetic */ Optional lambda$static$10(PacketWrapper packetWrapper) {
        return Optional.ofNullable((UUID)packetWrapper.CP_N(PacketWrapper::CP_v));
    }

    private static /* synthetic */ void lambda$static$9(PacketWrapper packetWrapper, CP_AV ilIlAV) {
        packetWrapper.CP_J(ilIlAV.CP_K());
    }

    private static /* synthetic */ CP_AV lambda$static$8(PacketWrapper packetWrapper) {
        int n = packetWrapper.CP_f();
        return CP_AV.CP_f(n);
    }

    private static /* synthetic */ void lambda$static$7(PacketWrapper packetWrapper, CP_An ilIlAn) {
        block4: {
            PacketWrapper packetWrapper2;
            block2: {
                block3: {
                    long l = a ^ 0x4ABECF936129L;
                    int n = EntityDataType.CP_W();
                    packetWrapper2 = packetWrapper;
                    if (n != 0) break block2;
                    if (!packetWrapper2.CP_w().CP_z(ServerVersion.V_1_9)) break block3;
                    packetWrapper.CP_h(ilIlAn);
                    if (n == 0) break block4;
                }
                packetWrapper.CP_a(ilIlAn.CP_w());
                packetWrapper.CP_a(ilIlAn.CP_c());
                packetWrapper2 = packetWrapper;
            }
            packetWrapper2.CP_a(ilIlAn.CP_k());
        }
    }

    private static /* synthetic */ CP_An lambda$static$6(PacketWrapper packetWrapper) {
        long l = a ^ 0x4295D162F331L;
        int n = EntityDataType.CP_z();
        int n2 = packetWrapper.CP_w().CP_z(ServerVersion.V_1_9);
        if (n != 0) {
            if (n2 != 0) {
                return packetWrapper.CP_E();
            }
            n2 = packetWrapper.CP_W();
        }
        int n3 = n2;
        int n4 = packetWrapper.CP_W();
        int n5 = packetWrapper.CP_W();
        return new CP_An(n3, n4, n5);
    }

    private static /* synthetic */ void lambda$static$5(PacketWrapper packetWrapper, CP_QG ilIlQG) {
        packetWrapper.CP_R(ilIlQG.CP_A);
        packetWrapper.CP_R(ilIlQG.CP_F);
        packetWrapper.CP_R(ilIlQG.CP_p);
    }

    private static /* synthetic */ CP_QG lambda$static$4(PacketWrapper packetWrapper) {
        return new CP_QG(packetWrapper.CP_X(), packetWrapper.CP_X(), packetWrapper.CP_X());
    }

    private static /* synthetic */ void lambda$static$3(PacketWrapper packetWrapper, Optional optional) {
        packetWrapper.CP_j(optional.orElse(null));
    }

    private static /* synthetic */ Optional lambda$static$2(PacketWrapper packetWrapper) {
        return Optional.of(packetWrapper.CP_k());
    }

    private static /* synthetic */ void lambda$static$1(PacketWrapper packetWrapper, Integer n) {
        block4: {
            PacketWrapper packetWrapper2;
            block2: {
                block3: {
                    long l = a ^ 0x30D1F625718FL;
                    int n2 = EntityDataType.CP_W();
                    packetWrapper2 = packetWrapper;
                    if (n2 != 0) break block2;
                    if (!packetWrapper2.CP_w().CP_z(ServerVersion.V_1_9)) break block3;
                    packetWrapper.CP_J(n);
                    if (n2 == 0) break block4;
                }
                packetWrapper2 = packetWrapper;
            }
            packetWrapper2.CP_a(n);
        }
    }

    private static /* synthetic */ Integer lambda$static$0(PacketWrapper packetWrapper) {
        long l = a ^ 0x6C33E1794DA8L;
        int n = EntityDataType.CP_z();
        int n2 = packetWrapper.CP_w().CP_z(ServerVersion.V_1_9);
        if (n != 0) {
            if (n2 != 0) {
                return packetWrapper.CP_f();
            }
            n2 = packetWrapper.CP_W();
        }
        return n2;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_ft.a = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(-1518099984617577340L, 8851132370153426800L, MethodHandles.lookup().lookupClass()).a(42588750634932L);
                    var14 = CP_ft.a ^ 29706011688165L;
                    var6_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var14 >>> 56);
                    for (var7_2 = 1; var7_2 < 8; ++var7_2) {
                        v2 = v2;
                        v2[var7_2] = (byte)(var14 << var7_2 * 8 >>> 56);
                    }
                    var6_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var5_3 = new String[53];
                    var11_4 = 0;
                    var10_5 = "\u00e6&\\\u00f0\u00b5\u00d4\u00e5\u00c6\u0010x\u00cd\r\u0002\u0084m\u00de-\u0011{\u00ce%\u00f5\u0003\u00a0\u0091\u0018\u00ff\u00c3e\u0087\u001c\u00a8\u00e2\u00e5\u00e6\u008d.\u00e9\u00faT\u0098dD\u00d3f\u00c4\u00c8\u001c\u00bc\u00fa\u0010J\u00cag*\u00e8\u00e1\u0090\u00a3Wi?\u00c7,\u0092Uk\u0018\u00e2\u00bb\u0016+\u00b9\u0096\u0083\u00ef\u00ae\u00f7S\u00c3\u00eb\u00a6\u00aa\u00029\u00dd\u008f\u0089efG\u00c4\u0010\u00f9\u009cl\u00fd\u00b9 \u001e\u0085i\u00d3+\u0002\u0000\u0090\u00a7\u00e3\u0018\u00ed wJMy\u00f2\u009b\u00f2\u00a6\u0082a\u00d5\u00d4t)\u0080H\u00eby\u00f5\u00dff\u00ee\u0010q\u00b8\u0012\u0011\u0089\u0012\u00f5\u00ca\u00b0\u009b\u0089\u00acqj~\u00e3\u0010V\u001f\u00d3\u00dd\u00c0!\u009e\t\u00c2T?\u008f\u00ef\u00f5\u00abM\b\u00e97\u00fa%\u00e3\u001b\u00f1\u0091\u0018K\u00d6\u0003\u0091U1'/\u00a1^},\u00bc\u0015\u0094\u0018\u00cb\u0095\u00e5\u00f3\u00cen\u00fd\u0003\u0018\u00e4b\u00f6\u00ca\u00c6\u00caI\u00abU\u00b66\u00b2\u00eb\u008f\\\u00c7\u00a2\u00e8q}\u00bfwd\u00b0\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2H\u00f8\u009b\u00b1\u00fe0CT\u00ea\u009f\u0001\u00f5\u0004\u00b67}\u0010\u00dap\u00e2\u00ab\u009d\u001f\u00c6\u00c8\u008b3\u00a6\u00ec\u001d\u00f9\"g\u0018|\u0012\u00be\u00c6$\u00d0\u009bS\u00da\u00d0\t=\u00d0\u00fedO\u0010\u00c7\u0010u\u00c7Q91\u0010\u008cy\u0001P\u0084\u00fc&n\u001d(\u009a\u001a\u00e9\u00da\u00c0c\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u007fC>\u00d0n\b\u00e9s\u00c2/\u0087X\u0002\u00d5\u00cd\u00a3\u0010B,+`\u001c:7G<\u00ff8\u00c4M \u00ack\u0010\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u00daT\u0015c\u00aa\u00dc|\r\b2\u00c5\u0019L!Tk\u00d1\u0010\u0082\u00fc\tZJ\u00b6<[\u00f7\u0018\u00a4qS\u00a4\u0004\u0001\b]\u000e(\u00f2\u009b\u009d\n0\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2H\u00f8\u009b\u00b1\u00fe0CT\u00ea\u009f\u0001\u00f5\u0004\u00b67}\b&\u0091\u000f\u00fd\u0087N-@\u0010J\u00cc\u00b9\u0090v\u00c3\u0011\u00d6\u00edg\u00f2\u001b\u00de~\u008f\u0083\u0018\u0011\u0094\u00af\u00a9,~\"c\u00ae\u0084\u00cc\u001e\\\u00cb\u0016}\u0099\u0018\u00faN\u00b9\u00af\u0000\u00b7\u0010\u00c9\u00b8gt\u00a2\u000b\u00c4\u00d8\u00fd\u00acb:\u009fSX\u00e4 \u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\b.\u0004\u00f7\u00c8\u00ddC\u0082\u001b\u00dc\u00ec\u001c\u0011\u00e3\u009b\u009bmU\u0082\u00f9\u00fe\u00f9L}\u0018'\u008eu#\u0007\u000fOMKH\u00b2\u001b\u00bf\u00bb\u00c3g\u00c3\u0093p*B\u00f4\u0017\u00d2\b\u00c0\u0002:\u0092\u0098\u00e9k'\u0018\u0088$6\u001c\u00d6\"\u00bc\u0019?\u0015^V\u0085\u00a4\u00c2\u00e2\u009f\u00a02\u00bc^*\u00e2\u0016 \u00ae~B-]\u00de\u00b9\u00ed\u00c3\u00bf^\u00cf2\u00d9\u00e6Ukq\u0082\u00d2\u00af\u00ee\n\u00f8\u00d3\u0004~`u\b\u0089\u0012\u0018\u00ae~B-]\u00de\u00b9\u00ed\u00ee\u0083u\u00d0\u001d\u00b41_\u00df\"E:\u00d4\u0018L=\u0010\u0082\u00fc\tZJ\u00b6<[\u00f7\u0018\u00a4qS\u00a4\u0004\u0001\u0018\u00e2\u00bb\u0016+\u00b9\u0096\u0083\u00ef\u00ae\u00f7S\u00c3\u00eb\u00a6\u00aa\u00029\u00dd\u008f\u0089efG\u00c4\u0018\u0011\u0094\u00af\u00a9,~\"c\u00ae\u0084\u00cc\u001e\\\u00cb\u0016}\u0099\u0018\u00faN\u00b9\u00af\u0000\u00b7\u0018\u00ea5\u00e6\u001f1\u00bf\u00ab\u00d8S\u00e7\u001f'\u00e4\u0004\u0097\u00e0\u009b\u0086\u0011\u00f2\u0003\u0001h\u00dc\u0018\u00c6\u00c5\u00bc\u0097Iv\u00ae\u00e6h0\u00cb9i\u00b0\u0007\u00142t\u00f4\"\u00f9\u00c3\u00c9B\u00101\u00a3<?^\u00d7\u0088,]\u00a9\u008fU\u00a2n\r\u00a1\b\u00fc\u00ac\u00f4\u00adT\u0097r\u009d\u0010\u00ea\u00d3\u000b15\u00a6k_\u00a1\u008a\u00ad\u00aa\u00a4\u00e2\\\u00f4\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u001e\u00db\u0098\u00ef\u0091\u001f\u00c8g\u00f1\u0017\u00cc\u0017ql\u00b8c\u0010\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2S\u00f9\u0085\u00f4F\u0092\u00f9\u0017\u0018\u00c6\u00c5\u00bc\u0097Iv\u00ae\u00e6h0\u00cb9i\u00b0\u0007\u00142t\u00f4\"\u00f9\u00c3\u00c9B\u0018\u001e\u0019\u0084\u00d0\u00eb\"\u0091\u0005\u00049\u00d3Ffc\u00e7\u00ba|T\u00cevG\u0091\u00fb\u00f2\u0018\u00fb\u0012\u00a1\u00ea\u001fR\u0015\u00fc\r\u00dd\u0080\u0089y*\u00a8p:\u00f1\u00aa\u0088\u0084;\u00b0b\b\u0019\u001e6\u00ae\u0090`\u009eR\u0018EJ0\u009f\u008ct\u001d\u00ad\u000f\u0086\u00d2.\u00ffu\"\u009a\u00e2\u0004\u0082\u00d1\u00e6,jl\u0010s\u00fb\u0019cJ\u00c6!\u00c8\u0018\u00a8\u0097i0\u009d\u00b2\u00f1\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2C)>C\u00e0~\u0082^\u008b\u00fb\u00a59\u00ff\u00967\u00dc\u0018f[\u00ebS\u00fb\u00dfx\u00e9:c7\u0019RE@dSH\r\u00b8FB\u00bci";
                    var12_6 = "\u00e6&\\\u00f0\u00b5\u00d4\u00e5\u00c6\u0010x\u00cd\r\u0002\u0084m\u00de-\u0011{\u00ce%\u00f5\u0003\u00a0\u0091\u0018\u00ff\u00c3e\u0087\u001c\u00a8\u00e2\u00e5\u00e6\u008d.\u00e9\u00faT\u0098dD\u00d3f\u00c4\u00c8\u001c\u00bc\u00fa\u0010J\u00cag*\u00e8\u00e1\u0090\u00a3Wi?\u00c7,\u0092Uk\u0018\u00e2\u00bb\u0016+\u00b9\u0096\u0083\u00ef\u00ae\u00f7S\u00c3\u00eb\u00a6\u00aa\u00029\u00dd\u008f\u0089efG\u00c4\u0010\u00f9\u009cl\u00fd\u00b9 \u001e\u0085i\u00d3+\u0002\u0000\u0090\u00a7\u00e3\u0018\u00ed wJMy\u00f2\u009b\u00f2\u00a6\u0082a\u00d5\u00d4t)\u0080H\u00eby\u00f5\u00dff\u00ee\u0010q\u00b8\u0012\u0011\u0089\u0012\u00f5\u00ca\u00b0\u009b\u0089\u00acqj~\u00e3\u0010V\u001f\u00d3\u00dd\u00c0!\u009e\t\u00c2T?\u008f\u00ef\u00f5\u00abM\b\u00e97\u00fa%\u00e3\u001b\u00f1\u0091\u0018K\u00d6\u0003\u0091U1'/\u00a1^},\u00bc\u0015\u0094\u0018\u00cb\u0095\u00e5\u00f3\u00cen\u00fd\u0003\u0018\u00e4b\u00f6\u00ca\u00c6\u00caI\u00abU\u00b66\u00b2\u00eb\u008f\\\u00c7\u00a2\u00e8q}\u00bfwd\u00b0\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2H\u00f8\u009b\u00b1\u00fe0CT\u00ea\u009f\u0001\u00f5\u0004\u00b67}\u0010\u00dap\u00e2\u00ab\u009d\u001f\u00c6\u00c8\u008b3\u00a6\u00ec\u001d\u00f9\"g\u0018|\u0012\u00be\u00c6$\u00d0\u009bS\u00da\u00d0\t=\u00d0\u00fedO\u0010\u00c7\u0010u\u00c7Q91\u0010\u008cy\u0001P\u0084\u00fc&n\u001d(\u009a\u001a\u00e9\u00da\u00c0c\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u007fC>\u00d0n\b\u00e9s\u00c2/\u0087X\u0002\u00d5\u00cd\u00a3\u0010B,+`\u001c:7G<\u00ff8\u00c4M \u00ack\u0010\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u00daT\u0015c\u00aa\u00dc|\r\b2\u00c5\u0019L!Tk\u00d1\u0010\u0082\u00fc\tZJ\u00b6<[\u00f7\u0018\u00a4qS\u00a4\u0004\u0001\b]\u000e(\u00f2\u009b\u009d\n0\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2H\u00f8\u009b\u00b1\u00fe0CT\u00ea\u009f\u0001\u00f5\u0004\u00b67}\b&\u0091\u000f\u00fd\u0087N-@\u0010J\u00cc\u00b9\u0090v\u00c3\u0011\u00d6\u00edg\u00f2\u001b\u00de~\u008f\u0083\u0018\u0011\u0094\u00af\u00a9,~\"c\u00ae\u0084\u00cc\u001e\\\u00cb\u0016}\u0099\u0018\u00faN\u00b9\u00af\u0000\u00b7\u0010\u00c9\u00b8gt\u00a2\u000b\u00c4\u00d8\u00fd\u00acb:\u009fSX\u00e4 \u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\b.\u0004\u00f7\u00c8\u00ddC\u0082\u001b\u00dc\u00ec\u001c\u0011\u00e3\u009b\u009bmU\u0082\u00f9\u00fe\u00f9L}\u0018'\u008eu#\u0007\u000fOMKH\u00b2\u001b\u00bf\u00bb\u00c3g\u00c3\u0093p*B\u00f4\u0017\u00d2\b\u00c0\u0002:\u0092\u0098\u00e9k'\u0018\u0088$6\u001c\u00d6\"\u00bc\u0019?\u0015^V\u0085\u00a4\u00c2\u00e2\u009f\u00a02\u00bc^*\u00e2\u0016 \u00ae~B-]\u00de\u00b9\u00ed\u00c3\u00bf^\u00cf2\u00d9\u00e6Ukq\u0082\u00d2\u00af\u00ee\n\u00f8\u00d3\u0004~`u\b\u0089\u0012\u0018\u00ae~B-]\u00de\u00b9\u00ed\u00ee\u0083u\u00d0\u001d\u00b41_\u00df\"E:\u00d4\u0018L=\u0010\u0082\u00fc\tZJ\u00b6<[\u00f7\u0018\u00a4qS\u00a4\u0004\u0001\u0018\u00e2\u00bb\u0016+\u00b9\u0096\u0083\u00ef\u00ae\u00f7S\u00c3\u00eb\u00a6\u00aa\u00029\u00dd\u008f\u0089efG\u00c4\u0018\u0011\u0094\u00af\u00a9,~\"c\u00ae\u0084\u00cc\u001e\\\u00cb\u0016}\u0099\u0018\u00faN\u00b9\u00af\u0000\u00b7\u0018\u00ea5\u00e6\u001f1\u00bf\u00ab\u00d8S\u00e7\u001f'\u00e4\u0004\u0097\u00e0\u009b\u0086\u0011\u00f2\u0003\u0001h\u00dc\u0018\u00c6\u00c5\u00bc\u0097Iv\u00ae\u00e6h0\u00cb9i\u00b0\u0007\u00142t\u00f4\"\u00f9\u00c3\u00c9B\u00101\u00a3<?^\u00d7\u0088,]\u00a9\u008fU\u00a2n\r\u00a1\b\u00fc\u00ac\u00f4\u00adT\u0097r\u009d\u0010\u00ea\u00d3\u000b15\u00a6k_\u00a1\u008a\u00ad\u00aa\u00a4\u00e2\\\u00f4\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2\u001e\u00db\u0098\u00ef\u0091\u001f\u00c8g\u00f1\u0017\u00cc\u0017ql\u00b8c\u0010\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2S\u00f9\u0085\u00f4F\u0092\u00f9\u0017\u0018\u00c6\u00c5\u00bc\u0097Iv\u00ae\u00e6h0\u00cb9i\u00b0\u0007\u00142t\u00f4\"\u00f9\u00c3\u00c9B\u0018\u001e\u0019\u0084\u00d0\u00eb\"\u0091\u0005\u00049\u00d3Ffc\u00e7\u00ba|T\u00cevG\u0091\u00fb\u00f2\u0018\u00fb\u0012\u00a1\u00ea\u001fR\u0015\u00fc\r\u00dd\u0080\u0089y*\u00a8p:\u00f1\u00aa\u0088\u0084;\u00b0b\b\u0019\u001e6\u00ae\u0090`\u009eR\u0018EJ0\u009f\u008ct\u001d\u00ad\u000f\u0086\u00d2.\u00ffu\"\u009a\u00e2\u0004\u0082\u00d1\u00e6,jl\u0010s\u00fb\u0019cJ\u00c6!\u00c8\u0018\u00a8\u0097i0\u009d\u00b2\u00f1\u0018\u0001q\u00f6\u007f[\u00e1\u00bc\u00e2C)>C\u00e0~\u0082^\u008b\u00fb\u00a59\u00ff\u00967\u00dc\u0018f[\u00ebS\u00fb\u00dfx\u00e9:c7\u0019RE@dSH\r\u00b8FB\u00bci".length();
                    var9_7 = 8;
                    var8_8 = -1;
lbl19:
                    // 2 sources

                    while (true) {
                        v3 = ++var8_8;
                        v4 = var10_5.substring(v3, v3 + var9_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl24:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = CP_ft.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        var10_5 = "\u008cy\u0001P\u0084\u00fc&nbH\u00cbE\u00d2\u0097\u00eb\u00bf\u0018|\u0012\u00be\u00c6$\u00d0\u009bS\u00da\u00d0\t=\u00d0\u00fedO\u0010\u00c7\u0010u\u00c7Q91";
                        var12_6 = "\u008cy\u0001P\u0084\u00fc&nbH\u00cbE\u00d2\u0097\u00eb\u00bf\u0018|\u0012\u00be\u00c6$\u00d0\u009bS\u00da\u00d0\t=\u00d0\u00fedO\u0010\u00c7\u0010u\u00c7Q91".length();
                        var9_7 = 16;
                        var8_8 = -1;
lbl33:
                        // 2 sources

                        while (true) {
                            v6 = ++var8_8;
                            v4 = var10_5.substring(v6, v6 + var9_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl38:
                    // 1 sources

                    while (true) {
                        var5_3[var11_4++] = CP_ft.a(var13_9).intern();
                        if ((var8_8 += var9_7) < var12_6) {
                            var9_7 = var10_5.charAt(var8_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var13_9 = var6_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl50:
                    // 1 sources

                    ** continue;
                }
            }
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var14 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var14 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl62:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 3585532949718297115L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        CP_ft.b = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
        CP_ft.CP_s = new VersionedRegistry<T>(var5_3[45]);
        CP_ft.CP_r = CP_ft.CP_N(var5_3[39], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_E(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Byte;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_u(int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Byte;)V)());
        CP_ft.CP_W = CP_ft.CP_N(var5_3[19], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_G(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Short;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_G(int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Short;)V)());
        CP_ft.CP_f = CP_ft.CP_N(var5_3[46], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$0(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Integer;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$1(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.lang.Integer ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Integer;)V)());
        CP_ft.CP_F = CP_ft.CP_N(var5_3[0], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_o(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Long;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_s(long ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Long;)V)());
        CP_ft.CP_J = CP_ft.CP_N(var5_3[9], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_X(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Float;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_R(float ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Float;)V)());
        CP_ft.CP_x = CP_ft.CP_N(var5_3[29], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_i(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/String;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_M(java.lang.String ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/String;)V)());
        CP_ft.CP_m = CP_ft.CP_N(var5_3[33], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_k(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/String;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_Y(java.lang.String ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/String;)V)());
        CP_ft.CP_Y = CP_ft.CP_N(var5_3[20], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_J(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/Component;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_z(me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/io/github/retrooper/packetevents/adventure/Component;)V)());
        CP_ft.CP_C = CP_ft.CP_N(var5_3[22], CP_ft.CP_L(), CP_ft.CP_C());
        CP_ft.CP_O = CP_ft.CP_N(var5_3[12], CP_ft.CP_U(), CP_ft.CP_N());
        CP_ft.CP_V = CP_ft.CP_N(var5_3[40], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_k(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/CP_Cg;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_j(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/CP_Cg;)V)());
        CP_ft.CP_d = CP_ft.CP_N(var5_3[16], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$2(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/Optional;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$3(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.Optional ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
        CP_ft.CP_t = CP_ft.CP_N(var5_3[21], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_K(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Boolean;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_a(boolean ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/Boolean;)V)());
        CP_ft.CP_w = CP_ft.CP_N(var5_3[5], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$4(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/CP_QG;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$5(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_QG ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/CP_QG;)V)());
        CP_ft.CP_e = CP_ft.CP_N(var5_3[1], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$6(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/CP_An;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$7(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/CP_An;)V)());
        CP_ft.CP_o = CP_ft.CP_N(var5_3[41], CP_ft.CP_S(), CP_ft.CP_L());
        CP_ft.CP_Q = CP_ft.CP_N(var5_3[7], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$8(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_AV;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$9(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_AV ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/CP_AV;)V)());
        CP_ft.CP_b = CP_ft.CP_N(var5_3[42], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$10(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/Optional;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$11(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.Optional ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
        CP_ft.CP_k = CP_ft.CP_N(var5_3[17], CP_ft.CP_v(), CP_ft.CP_v());
        CP_ft.CP_h = CP_ft.CP_N(var5_3[49], CP_ft.CP_v(), CP_ft.CP_v());
        CP_ft.CP_K = CP_ft.CP_N(var5_3[23], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_S(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_c(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBTCompound;)V)());
        CP_ft.CP_R = CP_ft.CP_N(var5_3[51], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_g(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/CP_um;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_u(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.CP_um<T> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/particle/CP_um;)V)());
        CP_ft.CP_i = CP_ft.CP_N(var5_3[3], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_B(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/villager/CP_uD;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_E(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.villager.CP_uD ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/villager/CP_uD;)V)());
        CP_ft.CP_T = CP_ft.CP_N(var5_3[18], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$12(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/Optional;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$13(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.Optional ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
        CP_ft.CP_y = CP_ft.CP_N(var5_3[48], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$14(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/CP_qX;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$15(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.CP_qX ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/CP_qX;)V)());
        CP_ft.CP_g = CP_ft.CP_N(var5_3[43], CP_ft.CP_v(), CP_ft.CP_v());
        CP_ft.CP_q = CP_ft.CP_N(var5_3[37], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_q(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/CP_AW;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_A(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_AW ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/CP_AW;)V)());
        CP_ft.CP_A = CP_ft.CP_N(var5_3[34], CP_ft.CP_v(), CP_ft.CP_v());
        CP_ft.CP_u = CP_ft.CP_N(var5_3[4], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_g(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/frog/CP_qA;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_Z(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.frog.CP_qA ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/frog/CP_qA;)V)());
        CP_ft.CP_Z = CP_ft.CP_N(var5_3[27], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$17(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/Optional;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$19(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.Optional ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/Optional;)V)());
        CP_ft.CP_P = CP_ft.CP_N(var5_3[25], CP_ft.CP_v(), CP_ft.CP_v());
        CP_ft.CP_j = CP_ft.CP_N(var5_3[35], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_c(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/CP_G0;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_F(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.CP_G0 ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/painting/CP_G0;)V)());
        CP_ft.CP_a = CP_ft.CP_N(var5_3[13], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$20(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/CP_iR;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$21(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.CP_iR ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/CP_iR;)V)());
        CP_ft.CP_M = CP_ft.CP_N(var5_3[8], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$22(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/CP_QG;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$23(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_QG ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/CP_QG;)V)());
        CP_ft.CP_L = CP_ft.CP_N(var5_3[38], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$24(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/CP_hJ;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$25(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_hJ ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/CP_hJ;)V)());
        CP_ft.CP_N = CP_ft.CP_N(var5_3[24], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$26(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/CP_vu;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$27(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.CP_vu ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/CP_vu;)V)());
        CP_ft.CP_n = CP_ft.CP_N(var5_3[15], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$28(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/util/List;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$static$29(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.util.List ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/util/List;)V)());
        CP_ft.CP_X = CP_ft.CP_N(var5_3[14], CP_ft.CP_v(), CP_ft.CP_v());
        CP_ft.CP_E = CP_ft.CP_N(var5_3[52], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_f(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/CP_dv;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_i(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_dv ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/CP_dv;)V)());
        CP_ft.CP_G = CP_ft.CP_N(var5_3[28], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_l(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/CP_dL;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_q(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_dL ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/CP_dL;)V)());
        CP_ft.CP_c = CP_ft.CP_N(var5_3[30], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_UnderScore(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/CP_Xo;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_s(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_Xo ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/CP_Xo;)V)());
        CP_ft.CP_UnderScore = CP_ft.CP_N(var5_3[47], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_D(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/CP_oN;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_r(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.CP_oN ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/CP_oN;)V)());
        CP_ft.CP_v = CP_ft.CP_N(var5_3[32], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_l(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/CP_fP;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_s(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_fP ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/CP_fP;)V)());
        CP_ft.CP_H = CP_ft.CP_N(var5_3[6], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_F(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/data/CP_qq;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_Z(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_qq ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/data/CP_qq;)V)());
        CP_ft.CP_z = CP_ft.CP_N(var5_3[36], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_X(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/data/CP_xV;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_K(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_xV ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/data/CP_xV;)V)());
        CP_ft.CP_l = CP_ft.CP_N(var5_3[44], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_t(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/component/CP_qa;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_i(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.CP_qa ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/component/CP_qa;)V)());
        CP_ft.CP_B = CP_ft.CP_N(var5_3[50], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_t(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/nautilus/CP_XC;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_T(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.nautilus.CP_XC ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/nautilus/CP_XC;)V)());
        CP_ft.CP_S = CP_ft.CP_N(var5_3[26], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_E(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/CP_Oh;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_q(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_Oh ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/CP_Oh;)V)());
        CP_ft.CP_U = CP_ft.CP_N(var5_3[10], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_X(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/CP_QC;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_I(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_QC ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cat/CP_QC;)V)());
        CP_ft.CP_I = CP_ft.CP_N(var5_3[31], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_v(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/CP_fM;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_b(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_fM ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/chicken/CP_fM;)V)());
        CP_ft.CP_D = CP_ft.CP_N(var5_3[2], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_J(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/CP_y8;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_W(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_y8 ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/cow/CP_y8;)V)());
        CP_ft.CP_p = CP_ft.CP_N(var5_3[11], (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_r(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/CP_uj;)(), (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, CP_Z(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.CP_uj ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/CP_uj;)V)());
        CP_ft.CP_s.unloadMappings();
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

