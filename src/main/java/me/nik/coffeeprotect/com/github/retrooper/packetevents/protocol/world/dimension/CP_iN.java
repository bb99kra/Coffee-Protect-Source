/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.color.AlphaColor;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.color.CP_rI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.CP_um;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.data.CP_ut;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.particle.type.CP_jn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_Gq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.CP_qP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.CP_v7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.CP_xx;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.biome.CP_nV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.biome.CP_xP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.clock.CP_hi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_XA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_fK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_nq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.CP_AY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_fR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_ue;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.kyori.adventure.nbt.CompoundBinaryTag;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_iN {
    private static final VersionedRegistry<CP_nq> CP_W;
    @ApiStatus.Obsolete
    public static final CP_nq CP_n;
    public static final CP_nq CP_X;
    @ApiStatus.Obsolete
    public static final CP_nq CP_Y;
    public static final CP_nq CP_m;
    private static final Consumer<CP_Gy> CP_J;
    @ApiStatus.Obsolete
    public static final CP_nq CP_V;
    public static final CP_nq CP_u;
    public static final CP_nq CP_T;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static transient /* synthetic */ String PIHmhDOARS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_iN() {
    }

    @ApiStatus.Internal
    public static CP_nq CP_j(String string, Consumer<CP_Gy> consumer) {
        return CP_iN.CP_y(string, CP_fR.CP_k, consumer);
    }

    @ApiStatus.Internal
    public static CP_nq CP_y(String string, CP_fR ilIlfR, Consumer<CP_Gy> consumer) {
        return CP_W.CP_q(string, ilIlfR, typesBuilderData -> {
            CP_Gy ilIlGy = CP_Gy.CP_C();
            consumer.accept(ilIlGy);
            return ilIlGy.CP_y((TypesBuilderData)typesBuilderData);
        });
    }

    public static VersionedRegistry<CP_nq> CP_Q() {
        return CP_W;
    }

    private static /* synthetic */ void lambda$static$7(CP_Gy ilIlGy) {
        long l = a ^ 0x35C254985938L;
        ilIlGy.CP_C(true).CP_l(new NBTInt((int)CP_iN.b("f", (int)31404, (long)(0x678D68B60ADF3595L ^ l)))).CP_T((int)CP_iN.b("f", (int)12148, (long)(0x45784A98B7D26056L ^ l))).CP_d(8.0).CP_V(CP_XA.NONE).CP_c(CP_fK.NETHER).CP_A(0).CP_w((int)CP_iN.b("f", (int)32037, (long)(0x1957DFD64494B20FL ^ l))).CP_E((int)CP_iN.b("f", (int)22604, (long)(0x189961CD010F1778L ^ l))).CP_q(CP_AY.CP_n.CP_R()).CP_y(true).CP_i(false).CP_N(0.1f).CP_Q(CP_xx.CP_X, Float.valueOf(0.0f)).CP_Q(CP_xx.CP_c, new CP_rI((int)CP_iN.b("f", (int)4913, (long)(0x4106419A13BB5C07L ^ l)))).CP_Q(CP_xx.CP_s, Float.valueOf(4.0f)).CP_Q(CP_xx.CP_b, Float.valueOf(10.0f)).CP_Q(CP_xx.CP_I, Float.valueOf(96.0f)).CP_Q(CP_xx.CP_H, new CP_um<CP_ut>(CP_jn.CP_G)).CP_Q(CP_xx.CP_q, false).CP_Q(CP_xx.CP_j, true).CP_Q(CP_xx.CP_x, true).CP_S(false).CP_W(true).CP_N(false).CP_x(new ResourceLocation((String)((Object)CP_iN.a("w", (int)12608, (long)(0x2DFA643C19078B57L ^ l))))).CP_n((long)CP_iN.c("p", (int)10416, (long)(0x711F1826C5F8F56EL ^ l))).CP_Q(CP_xx.CP_l, new CP_rI((int)CP_iN.b("f", (int)31111, (long)(0x4B34394E5EE536ABL ^ l))));
    }

    private static /* synthetic */ void lambda$static$6(CP_Gy ilIlGy) {
        ilIlGy.CP_i(false);
    }

    private static /* synthetic */ void lambda$static$5(CP_Gy ilIlGy) {
        long l = a ^ 0xF8E559D3C31L;
        ilIlGy.CP_C(true).CP_T(0).CP_l(new NBTInt((int)CP_iN.b("f", (int)25490, (long)(0x5FDF536C082EC9A3L ^ l)))).CP_d(1.0).CP_V(CP_XA.END).CP_A(0).CP_w((int)CP_iN.b("f", (int)32037, (long)(0x1957E59A4591D706L ^ l))).CP_E((int)CP_iN.b("f", (int)32037, (long)(0x1957E59A4591D706L ^ l))).CP_q(CP_AY.CP_Y1.CP_R()).CP_y(false).CP_i(true).CP_N(0.25f).CP_Q(CP_xx.CP_v, new CP_qP(new CP_xP(CP_Gq.CP_Ag, (int)CP_iN.b("f", (int)3349, (long)(0x3EAC3850DD712734L ^ l)), (int)CP_iN.b("f", (int)16261, (long)(0x26BF6AB58C6915BEL ^ l)), true), null, null)).CP_Q(CP_xx.CP_h, new CP_v7(null, new CP_nV(CP_Gq.CP_wY, (int)CP_iN.b("f", (int)3349, (long)(0x3EAC3850DD712734L ^ l)), (int)CP_iN.b("f", (int)1196, (long)(0x6A3E1486EB8B2E90L ^ l)), 2.0), Collections.emptyList())).CP_Q(CP_xx.CP_N, new CP_rI((int)CP_iN.b("f", (int)14747, (long)(0x5D3B68581C8C13B9L ^ l)))).CP_Q(CP_xx.CP_G, new CP_rI(0)).CP_Q(CP_xx.CP_c, new CP_rI((int)CP_iN.b("f", (int)1456, (long)(0x3C0EACA6C8A12F8EL ^ l)))).CP_Q(CP_xx.CP_X, Float.valueOf(0.0f)).CP_S(false).CP_W(false).CP_N(false).CP_x(new ResourceLocation((String)((Object)CP_iN.a("w", (int)30329, (long)(0x6629FFD8015A966L ^ l))))).CP_n((long)CP_iN.c("p", (int)30612, (long)(0x78294771723F4F42L ^ l))).CP_Q(CP_xx.CP_Q, true).CP_Q(CP_xx.CP_l, new CP_rI((int)CP_iN.b("f", (int)26415, (long)(0x699B4832AD47CD05L ^ l)))).CP_y(CP_hi.CP_g).CP_T(true);
    }

    private static /* synthetic */ void lambda$static$4(CP_Gy ilIlGy) {
        long l = a ^ 0x27F6BC001CF2L;
        ilIlGy.CP_l(CP_ue.CP_E(((CompoundBinaryTag.Builder)((CompoundBinaryTag.Builder)((CompoundBinaryTag.Builder)((CompoundBinaryTag.Builder)CompoundBinaryTag.builder().putString((String)((Object)CP_iN.a("w", (int)11433, (long)(0x6C5FD2D268C35376L ^ l))), new ResourceLocation((String)((Object)CP_iN.a("w", (int)12943, (long)(0x22F544FD20544D5FL ^ l)))).toString())).putInt((String)((Object)CP_iN.a("w", (int)23184, (long)(0x70B176289ED42542L ^ l))), 0)).putInt((String)((Object)CP_iN.a("w", (int)13577, (long)(0x5D64D7D114BCCAC1L ^ l))), (int)CP_iN.b("f", (int)13935, (long)(0x17789DAE5BFB3C85L ^ l)))).put((String)((Object)CP_iN.a("w", (int)23837, (long)(0x2F1581A3A73EA2C4L ^ l))), ((CompoundBinaryTag.Builder)((CompoundBinaryTag.Builder)CompoundBinaryTag.builder().putInt((String)((Object)CP_iN.a("w", (int)42, (long)(0x3FF9CBE74A657FFFL ^ l))), 0)).putInt((String)((Object)CP_iN.a("w", (int)15310, (long)(0x3B60A89DB542C414L ^ l))), (int)CP_iN.b("f", (int)31404, (long)(0x678D7A82E247705FL ^ l)))).build())).build())).CP_T(0).CP_d(1.0).CP_A((int)CP_iN.b("f", (int)11683, (long)(0x142EE492ADF6275AL ^ l))).CP_w((int)CP_iN.b("f", (int)30064, (long)(0x4E4FDF3938647F95L ^ l))).CP_E((int)CP_iN.b("f", (int)17083, (long)(0x523E150311C44850L ^ l))).CP_q(CP_AY.CP_QQ.CP_R()).CP_y(true).CP_i(true).CP_N(0.0f).CP_Q(CP_xx.CP_v, new CP_qP(new CP_xP(CP_Gq.CP_g8, (int)CP_iN.b("f", (int)8362, (long)(0x54F4BFA752FBAA5FL ^ l)), (int)CP_iN.b("f", (int)18107, (long)(0x6F5949BA83B04C40L ^ l)), false), new CP_xP(CP_Gq.CP_Ny, (int)CP_iN.b("f", (int)30089, (long)(0x6BBFB64FF202FF7FL ^ l)), (int)CP_iN.b("f", (int)16261, (long)(0x26BF42CD65F4357DL ^ l)), false), null)).CP_Q(CP_xx.CP_h, new CP_v7(null, new CP_nV(CP_Gq.CP_wY, (int)CP_iN.b("f", (int)8798, (long)(0x5853E2F51434A8A9L ^ l)), (int)CP_iN.b("f", (int)17145, (long)(0x23C00D7CC1254803L ^ l)), 2.0), Collections.emptyList())).CP_Q(CP_xx.CP_J, Float.valueOf(192.33f)).CP_Q(CP_xx.CP_K, new AlphaColor((int)CP_iN.b("f", (int)14420, (long)(0x3C0844B4DA032A4L ^ l)))).CP_Q(CP_xx.CP_N, new CP_rI((int)CP_iN.b("f", (int)29559, (long)(0x313D8EB02055F993L ^ l)))).CP_Q(CP_xx.CP_G, new CP_rI((int)CP_iN.b("f", (int)26720, (long)(0x565D3357749A628FL ^ l)))).CP_S(true).CP_W(false).CP_N(true).CP_x(new ResourceLocation((String)((Object)CP_iN.a("w", (int)13104, (long)(0x422D41BABEE2CCE4L ^ l))))).CP_Q(CP_xx.CP_Q, true).CP_Q(CP_xx.CP_l, new CP_rI((int)CP_iN.b("f", (int)31267, (long)(0x227AB082F8A0F0C0L ^ l)))).CP_y(CP_hi.CP_O);
    }

    private static /* synthetic */ void lambda$static$3(CP_Gy ilIlGy) {
        long l = a ^ 0xD7705EC8AC5L;
        ilIlGy.CP_d(1.0).CP_A(0).CP_w((int)CP_iN.b("f", (int)32037, (long)(0x1957E76315E061F2L ^ l))).CP_E((int)CP_iN.b("f", (int)32037, (long)(0x1957E76315E061F2L ^ l))).CP_q(CP_AY.CP_QQ.CP_R()).CP_y(true).CP_i(true).CP_N(0.0f).CP_S(true).CP_W(false).CP_N(true).CP_x(new ResourceLocation((String)((Object)CP_iN.a("w", (int)13104, (long)(0x422D6B3B070E5AD3L ^ l))))).CP_Q(CP_xx.CP_Q, true);
    }

    private static /* synthetic */ void lambda$static$2(CP_Gy ilIlGy) {
        long l = a ^ 0x5EE66D34A4C6L;
        ilIlGy.CP_l(CP_ue.CP_E(((CompoundBinaryTag.Builder)((CompoundBinaryTag.Builder)((CompoundBinaryTag.Builder)((CompoundBinaryTag.Builder)CompoundBinaryTag.builder().putString((String)((Object)CP_iN.a("w", (int)10739, (long)(0x5D873DAEAAD36E11L ^ l))), new ResourceLocation((String)((Object)CP_iN.a("w", (int)18731, (long)(0x2F59858D382C0ED5L ^ l)))).toString())).putInt((String)((Object)CP_iN.a("w", (int)42, (long)(0x3FF9B2F79B51C7CBL ^ l))), 0)).putInt((String)((Object)CP_iN.a("w", (int)15310, (long)(0x3B60D18D64767C20L ^ l))), (int)CP_iN.b("f", (int)31404, (long)(0x678D03923373C86BL ^ l)))).put((String)((Object)CP_iN.a("w", (int)20702, (long)(0x65C1AF9AAC0A9734L ^ l))), ((CompoundBinaryTag.Builder)((CompoundBinaryTag.Builder)CompoundBinaryTag.builder().putInt((String)((Object)CP_iN.a("w", (int)42, (long)(0x3FF9B2F79B51C7CBL ^ l))), 0)).putInt((String)((Object)CP_iN.a("w", (int)15310, (long)(0x3B60D18D64767C20L ^ l))), (int)CP_iN.b("f", (int)31404, (long)(0x678D03923373C86BL ^ l)))).build())).build())).CP_T(0).CP_d(1.0).CP_A((int)CP_iN.b("f", (int)5663, (long)(0x96E0DE53A3024DAL ^ l))).CP_w((int)CP_iN.b("f", (int)17083, (long)(0x523E6C13C0F0F064L ^ l))).CP_E((int)CP_iN.b("f", (int)17083, (long)(0x523E6C13C0F0F064L ^ l))).CP_q(CP_AY.CP_QQ.CP_R()).CP_y(false).CP_i(true).CP_N(0.0f).CP_Q(CP_xx.CP_v, new CP_qP(new CP_xP(CP_Gq.CP_g8, (int)CP_iN.b("f", (int)30089, (long)(0x6BBFCF5F2336474BL ^ l)), (int)CP_iN.b("f", (int)16261, (long)(0x26BF3BDDB4C08D49L ^ l)), false), new CP_xP(CP_Gq.CP_Ny, (int)CP_iN.b("f", (int)30089, (long)(0x6BBFCF5F2336474BL ^ l)), (int)CP_iN.b("f", (int)16261, (long)(0x26BF3BDDB4C08D49L ^ l)), false), null)).CP_Q(CP_xx.CP_h, new CP_v7(null, new CP_nV(CP_Gq.CP_wY, (int)CP_iN.b("f", (int)3349, (long)(0x3EAC6938E5D8BFC3L ^ l)), (int)CP_iN.b("f", (int)1196, (long)(0x6A3E45EED322B667L ^ l)), 2.0), Collections.emptyList())).CP_Q(CP_xx.CP_J, Float.valueOf(192.33f)).CP_Q(CP_xx.CP_K, new AlphaColor((int)CP_iN.b("f", (int)7039, (long)(0x45D56E14F5F029A7L ^ l)))).CP_Q(CP_xx.CP_N, new CP_rI((int)CP_iN.b("f", (int)25776, (long)(0x3FBC7FF68BC2D663L ^ l)))).CP_Q(CP_xx.CP_G, new CP_rI((int)CP_iN.b("f", (int)1420, (long)(0x4E290EF5CF53B74CL ^ l)))).CP_S(true).CP_W(false).CP_N(true).CP_x(new ResourceLocation((String)((Object)CP_iN.a("w", (int)13104, (long)(0x422D38AA6FD674D0L ^ l))))).CP_Q(CP_xx.CP_Q, true).CP_Q(CP_xx.CP_l, new CP_rI((int)CP_iN.b("f", (int)4626, (long)(0x79DFBEEF0383A0CBL ^ l)))).CP_y(CP_hi.CP_O);
    }

    private static /* synthetic */ void lambda$static$1(CP_Gy ilIlGy) {
        long l = a ^ 0x2903B2551ADFL;
        ilIlGy.CP_d(1.0).CP_A(0).CP_w((int)CP_iN.b("f", (int)31576, (long)(0x78A03DD0A48D779BL ^ l))).CP_E((int)CP_iN.b("f", (int)32037, (long)(0x1957C317A259F1E8L ^ l))).CP_q(CP_AY.CP_QQ.CP_R()).CP_y(false).CP_i(true).CP_N(0.0f).CP_S(true).CP_W(false).CP_N(true).CP_x(new ResourceLocation((String)((Object)CP_iN.a("w", (int)9760, (long)(0x119567297B2B5FC4L ^ l))))).CP_Q(CP_xx.CP_Q, true);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                CP_iN.a = CP_s.a(-4611862206951453019L, 2631711002495779468L, MethodHandles.lookup().lookupClass()).a(222535533872748L);
                                var31 = CP_iN.a ^ 27114118141504L;
                                CP_iN.d = new HashMap<K, V>(13);
                                var22_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var31 >>> 56);
                                for (var23_2 = 1; var23_2 < 8; ++var23_2) {
                                    v2 = v2;
                                    v2[var23_2] = (byte)(var31 << var23_2 * 8 >>> 56);
                                }
                                var22_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var29_3 = new String[19];
                                var27_4 = 0;
                                var26_5 = "\u009fvb8_\u00f5\u00ba\u0018\u00e8\u007f\u00e1\u00b4\u00a1dqL\u00ca\u00eb\u00afF\u007fu\u00b9\u00b4\u0010\u00a1\u0089(v9.jC\u000e\u00e2\u0016Q[\u00894}\u0018\u0093L\u000e\u00ecc9\u00b2\u0083\u00e0S)\u00c9Qh\u00b0zk\u007f\u008f\u00d0q:\u0082\u00f3\u0018\u0092\u00d6[4\u008bk\u00ebqd\u00ab\u0011\u0099\u0018\u00d1\u00db~\u0005l\u0087Sn\f~\u00fd\u0010\u00e8Kf\u00f1\u00ac\u00a1\u00141\u0093\u0082\u0081\u0083\u008b\u0089I\u00be\u0018\u0087t\u00f0\u00ecy\u00ddi\u00f6\u00ec\u00a3\u00f8_O\u00f8\u00d0\u0015\u00ec}@\u00e1|\u00ac\u007f\u00b9\u0010\fJ\u00cf\u0097\r\u009a}}\u0089KMXH\u00ab54\u0010\u00d6\tOq\u00d2\u0015*\u00f7\u00a8\u00af@\u009a\u00ab\u00959\u00d5\u0010\u008a\u00d2D\u00ea\u00d8i\u0017\u00e1}\u00dc\u000fK\u00cb\u00df1/ \u00ee\u00edJ\u00b8\u0005\u008cJ5\u0006.\u00d9\u001b\"Ab\u009fT\u00a40\u009b\u009d\u00a2\u0004\u008cia\u00b9T\u00e7\u008f\u0085\u009e\u0018f\u00e7C\t'\u00b9\u00d7\u0094\u00a0\u00d1%\u00f3\u00b9\u00a7n\u00b8uk\u00a3\u00b3p\u00f3\u00a7:\u0010\u008a#\u0004\u0081\u00beK\u00c7X\u00d4\u00875\u00071\u0007\u00ea3 \u009ae\u00d5Z\u00fbt\u00d1Z\u00cb\u0015C\u00f4weXl\u00cdz\u0012\u0017\u00b0\u00d8\u00bdPV\u00bce\u001d\u00fb\u0097\u00dc}\u0018\u0095m\u00d0\u00e5\u00b2\u0091\u00a6\u00b3W\u00f0\u00ce\u00a4\u00c7\u0013.\u00a3(t\u00ff\u001f\b\u0015\u009f\u00ad\u0010\u00a6\u00d6)gP\u00d1\u00e3\u0081\b\u00b6\u000f\u00ba2\u0084\u00a1\u00aa 2D\u00bfyb\u00bfSI\u0018\u00e8^\u001a\u00f8\u00f9\u00ef\u00f1\u0017\u00ea\u00de\u00b6\u0099\u00a5\u00bfKj\u0082\u00b99\f\u00d6\u00faW\u0018\u0082A]Y\u00bb\u0089$\u00ba\u0097\u0019\u000e:N0\u00d8\u00d2t\u00a7\u00d1\u008f\u0080k\u00b8\u00bb";
                                var28_6 = "\u009fvb8_\u00f5\u00ba\u0018\u00e8\u007f\u00e1\u00b4\u00a1dqL\u00ca\u00eb\u00afF\u007fu\u00b9\u00b4\u0010\u00a1\u0089(v9.jC\u000e\u00e2\u0016Q[\u00894}\u0018\u0093L\u000e\u00ecc9\u00b2\u0083\u00e0S)\u00c9Qh\u00b0zk\u007f\u008f\u00d0q:\u0082\u00f3\u0018\u0092\u00d6[4\u008bk\u00ebqd\u00ab\u0011\u0099\u0018\u00d1\u00db~\u0005l\u0087Sn\f~\u00fd\u0010\u00e8Kf\u00f1\u00ac\u00a1\u00141\u0093\u0082\u0081\u0083\u008b\u0089I\u00be\u0018\u0087t\u00f0\u00ecy\u00ddi\u00f6\u00ec\u00a3\u00f8_O\u00f8\u00d0\u0015\u00ec}@\u00e1|\u00ac\u007f\u00b9\u0010\fJ\u00cf\u0097\r\u009a}}\u0089KMXH\u00ab54\u0010\u00d6\tOq\u00d2\u0015*\u00f7\u00a8\u00af@\u009a\u00ab\u00959\u00d5\u0010\u008a\u00d2D\u00ea\u00d8i\u0017\u00e1}\u00dc\u000fK\u00cb\u00df1/ \u00ee\u00edJ\u00b8\u0005\u008cJ5\u0006.\u00d9\u001b\"Ab\u009fT\u00a40\u009b\u009d\u00a2\u0004\u008cia\u00b9T\u00e7\u008f\u0085\u009e\u0018f\u00e7C\t'\u00b9\u00d7\u0094\u00a0\u00d1%\u00f3\u00b9\u00a7n\u00b8uk\u00a3\u00b3p\u00f3\u00a7:\u0010\u008a#\u0004\u0081\u00beK\u00c7X\u00d4\u00875\u00071\u0007\u00ea3 \u009ae\u00d5Z\u00fbt\u00d1Z\u00cb\u0015C\u00f4weXl\u00cdz\u0012\u0017\u00b0\u00d8\u00bdPV\u00bce\u001d\u00fb\u0097\u00dc}\u0018\u0095m\u00d0\u00e5\u00b2\u0091\u00a6\u00b3W\u00f0\u00ce\u00a4\u00c7\u0013.\u00a3(t\u00ff\u001f\b\u0015\u009f\u00ad\u0010\u00a6\u00d6)gP\u00d1\u00e3\u0081\b\u00b6\u000f\u00ba2\u0084\u00a1\u00aa 2D\u00bfyb\u00bfSI\u0018\u00e8^\u001a\u00f8\u00f9\u00ef\u00f1\u0017\u00ea\u00de\u00b6\u0099\u00a5\u00bfKj\u0082\u00b99\f\u00d6\u00faW\u0018\u0082A]Y\u00bb\u0089$\u00ba\u0097\u0019\u000e:N0\u00d8\u00d2t\u00a7\u00d1\u008f\u0080k\u00b8\u00bb".length();
                                var25_7 = 24;
                                var24_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var24_8;
                                    v4 = var26_5.substring(v3, v3 + var25_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = CP_iN.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    var26_5 = "\u00a8\u008e\u00a1\u00e9\u00edj\u00ddP\u00ce\u0087LpW\u00ff\u0094\u00f2\u0012\u0011ul\u00e3&\u00e23\u0010\u00b8\u0085\u00d1\u0099\u0097\f\u00b7\u00c8\u0007k\u00c7\u00c5)>\u0097\u00f1";
                                    var28_6 = "\u00a8\u008e\u00a1\u00e9\u00edj\u00ddP\u00ce\u0087LpW\u00ff\u0094\u00f2\u0012\u0011ul\u00e3&\u00e23\u0010\u00b8\u0085\u00d1\u0099\u0097\f\u00b7\u00c8\u0007k\u00c7\u00c5)>\u0097\u00f1".length();
                                    var25_7 = 24;
                                    var24_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var24_8;
                                        v4 = var26_5.substring(v6, v6 + var25_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var29_3[var27_4++] = CP_iN.a(var30_9).intern();
                                    if ((var24_8 += var25_7) < var28_6) {
                                        var25_7 = var26_5.charAt(var24_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var30_9 = var22_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        CP_iN.b = var29_3;
                        CP_iN.c = new String[19];
                        CP_iN.g = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var31 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var31 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[32];
                        var14_13 = 0;
                        var15_14 = "zn\u00a1w\u00ba\u0087\u0091w\u00daO\u00af\u00a1\u00963\u00f4\u00fay\u0082\n+e\u0098\u0097\u0091\u0017\u00f7\u0001\u00a6\u00e4\u00e1\u0010\u00af\u0015i\u0083\u00bb\u00dao[\u0013\u0017\u00a9\u00a3\u00d6\u00a0h({\u00b1c\u00e86K\u00b7\u008f)[\u0001\u00fbT\u00ce.\u00b0\u00cc\u00d1i\u00bf\\\u000e\u00f0Rz\u0018\u00ba\u00b2\u00a0\u00f3\u0093\u0090|\u00e4QX\u001e\u00de'\r\u00f17\u008cl'\u0016}\u0080\u007f/\u00b7\u00a1\u00d9\u001f`\u00ea\u00e74\u00deH\u008f,'V\u00eb+\u00a8\\\u00c2y\u0086\u0002\u00c4\u00c5cg\u00b9\u0091\u00f6au\u00efh\u00a9\u00e5\u00bc\u0081\u00e5P\u0019%\u00ae\u00f5_r\u0099\u00da\u0083=\u0014X0l\u00e0\u00fd_\u00cd\u00d0\u00b9zM\u00e6)iv\u009d\u0090\"L\u0086\u001e\u00a07\u008c\u007f\n\u00e4\u0018&\u00d16\u00f6\u0087\u00b4\u00e9BD\u0094\u001fj\u001e)|S\u00ac\u0088\u00de\u0082\u00cc\u00f0\u00ddQ\u00fd\u00d9\u00e0=R\u00d9\u00d9\rp\u0013\u00f3z\u00d2\u008f\u00df\u00df\u00f8H\u00be\u009dO\b\u00ddW\u00e8}88>2(\u008a\u00b5RL\u00c7\u00bf\u007f\u00f4g\u0085";
                        var16_15 = "zn\u00a1w\u00ba\u0087\u0091w\u00daO\u00af\u00a1\u00963\u00f4\u00fay\u0082\n+e\u0098\u0097\u0091\u0017\u00f7\u0001\u00a6\u00e4\u00e1\u0010\u00af\u0015i\u0083\u00bb\u00dao[\u0013\u0017\u00a9\u00a3\u00d6\u00a0h({\u00b1c\u00e86K\u00b7\u008f)[\u0001\u00fbT\u00ce.\u00b0\u00cc\u00d1i\u00bf\\\u000e\u00f0Rz\u0018\u00ba\u00b2\u00a0\u00f3\u0093\u0090|\u00e4QX\u001e\u00de'\r\u00f17\u008cl'\u0016}\u0080\u007f/\u00b7\u00a1\u00d9\u001f`\u00ea\u00e74\u00deH\u008f,'V\u00eb+\u00a8\\\u00c2y\u0086\u0002\u00c4\u00c5cg\u00b9\u0091\u00f6au\u00efh\u00a9\u00e5\u00bc\u0081\u00e5P\u0019%\u00ae\u00f5_r\u0099\u00da\u0083=\u0014X0l\u00e0\u00fd_\u00cd\u00d0\u00b9zM\u00e6)iv\u009d\u0090\"L\u0086\u001e\u00a07\u008c\u007f\n\u00e4\u0018&\u00d16\u00f6\u0087\u00b4\u00e9BD\u0094\u001fj\u001e)|S\u00ac\u0088\u00de\u0082\u00cc\u00f0\u00ddQ\u00fd\u00d9\u00e0=R\u00d9\u00d9\rp\u0013\u00f3z\u00d2\u008f\u00df\u00df\u00f8H\u00be\u009dO\b\u00ddW\u00e8}88>2(\u008a\u00b5RL\u00c7\u00bf\u007f\u00f4g\u0085".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u009b\u0012\u00f2\u00b6\u00a8\u00b7\u0088\"\u008a'\u008f\u009f4\u00911\u00fe";
                            var16_15 = "\u009b\u0012\u00f2\u00b6\u00a8\u00b7\u0088\"\u008a'\u008f\u009f4\u00911\u00fe".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
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
lbl104:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_iN.e = var17_12;
                CP_iN.f = new Integer[32];
                CP_iN.j = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var31 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var31 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "\u0099R\u00b3._\u0097\u00a8.wN\u00c4\u001aD\u0086\u0005\u009d";
                var5_25 = "\u0099R\u00b3._\u0097\u00a8.wN\u00c4\u001aD\u0086\u0005\u009d".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        CP_iN.h = var6_22;
        CP_iN.i = new Long[2];
        CP_iN.CP_W = new VersionedRegistry<T>((String)CP_iN.a("w", (int)1, (long)(1640356996998903140L ^ var31)), new ClientVersion[]{ClientVersion.V_1_18});
        CP_iN.CP_n = CP_iN.CP_y((String)CP_iN.a("w", (int)13104, (long)(4768607102426121814L ^ var31)), new CP_fR(null, ClientVersion.V_1_17_1), (Consumer<CP_Gy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$1(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_Gy;)V)());
        CP_iN.CP_X = CP_iN.CP_y((String)CP_iN.a("w", (int)13104, (long)(4768607102426121814L ^ var31)), new CP_fR(ClientVersion.V_1_18, null), (Consumer<CP_Gy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$2(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_Gy;)V)());
        CP_iN.CP_Y = CP_iN.CP_y((String)CP_iN.a("w", (int)10978, (long)(4460962170803003275L ^ var31)), new CP_fR(null, ClientVersion.V_1_17_1), (Consumer<CP_Gy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$3(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_Gy;)V)());
        CP_iN.CP_m = CP_iN.CP_y((String)CP_iN.a("w", (int)178, (long)(2769301060695078353L ^ var31)), new CP_fR(ClientVersion.V_1_18, null), (Consumer<CP_Gy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$4(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_Gy;)V)());
        CP_iN.CP_J = (Consumer<CP_Gy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$5(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_Gy;)V)();
        CP_iN.CP_V = CP_iN.CP_y((String)CP_iN.a("w", (int)22053, (long)(3845502693349581636L ^ var31)), new CP_fR(null, ClientVersion.V_1_21_7), CP_iN.CP_J.andThen((Consumer<CP_Gy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$6(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_Gy;)V)()));
        CP_iN.CP_u = CP_iN.CP_y((String)CP_iN.a("w", (int)22053, (long)(3845502693349581636L ^ var31)), new CP_fR(ClientVersion.V_1_21_9, null), CP_iN.CP_J);
        CP_iN.CP_T = CP_iN.CP_j((String)CP_iN.a("w", (int)179, (long)(4918816601024345561L ^ var31)), (Consumer<CP_Gy>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$7(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_Gy ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_Gy;)V)());
        CP_iN.CP_W.unloadMappings();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1D64;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_iN", exception);
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
            CP_iN.c[n2] = CP_iN.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_iN.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_iN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x685F;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_iN", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_iN.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_iN.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_iN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7AA8;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_iN", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_iN.i[n2] = l4;
        }
        return i[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_iN.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/dimension/CP_iN" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_iN.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_iN.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(CP_iN.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

