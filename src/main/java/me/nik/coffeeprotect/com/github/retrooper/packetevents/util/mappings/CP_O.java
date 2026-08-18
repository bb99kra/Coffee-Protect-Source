/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_dt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.chat.CP_jA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.CP_Tm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.CP_r_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_AW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_QC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_W_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cat.CP_uU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_AC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_fM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_fP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.chicken.CP_yd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_dL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_xN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_y8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.cow.CP_yU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.frog.CP_ZB;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.frog.CP_qA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.nautilus.CP_XC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.nautilus.CP_re;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.CP_dX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.CP_oN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.CP_uj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.pig.CP_vt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_Xo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_Y;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_di;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.wolfvariant.CP_dv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.banner.CP_Zd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.banner.CP_jw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.CP_QY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.CP_yM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.instrument.CP_OE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.instrument.CP_f7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.jukebox.CP_Xe;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.jukebox.CP_ht;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimmaterial.CP_OM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimmaterial.CP_W0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimpattern.CP_WY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimpattern.CP_h2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTList;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.timelines.CP_Q0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.timelines.CP_iy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.biome.CP_dJ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.biome.CP_jF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.clock.CP_hi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.clock.CP_jT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.damagetype.CP_Tk;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.damagetype.CP_qK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_iN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_nq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.CP_G0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.painting.CP_dO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_CJ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_O3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_Te;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_hN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Pz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
@ApiStatus.Internal
public final class CP_O {
    private static final boolean CP_M;
    private static final Map<ResourceLocation, CP_Te<?>> CP_f;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String zcuSDFiNDh = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_O() {
    }

    public static void CP_s() {
        long l = a ^ 0x3C7C0F45275EL;
        try {
            if (CP_f.isEmpty()) {
                throw new AssertionError();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CP_O.a(illegalStateException);
        }
    }

    @Nullable
    public static CP_Te<?> CP_k(ResourceLocation resourceLocation) {
        return CP_f.get(resourceLocation);
    }

    public static void CP_R(CP_G2 ilIlG2, PacketWrapper<?> packetWrapper, ResourceLocation resourceLocation, List<CP_Pz> list) {
        Object object = CP_r7.CP_b().CP_q().CP_P(ilIlG2, packetWrapper.CP_w().CP_E());
        CP_O.CP_u(ilIlG2, packetWrapper, resourceLocation, list, object);
    }

    public static void CP_u(CP_G2 ilIlG2, PacketWrapper<?> packetWrapper, ResourceLocation resourceLocation, List<CP_Pz> list, @Nullable Object object) {
        long l = a ^ 0xAEFE2823C37L;
        CP_Te<?> ilIlTe = CP_f.get(resourceLocation);
        int[] nArray = VersionedRegistry.CP_B();
        try {
            if (ilIlTe == null) {
                return;
            }
        }
        catch (Exception exception) {
            throw CP_O.a(exception);
        }
        try {
            CP_O3<?> ilIlO3;
            block12: {
                block11: {
                    try {
                        if (!CP_M && object != null) break block11;
                    }
                    catch (Exception exception) {
                        throw CP_O.a(exception);
                    }
                    ilIlO3 = ilIlTe.CP_b(list, packetWrapper);
                    if (nArray == null) break block12;
                }
                ilIlO3 = ilIlTe.CP_l(object, () -> ilIlTe.CP_b(list, packetWrapper));
            }
            ilIlG2.CP_K(ilIlO3);
        }
        catch (Exception exception) {
            throw new IllegalStateException((String)((Object)CP_O.a("z", (int)28047, (long)(0x7E457D7F495E913FL ^ l))) + resourceLocation + (String)((Object)CP_O.a("z", (int)6209, (long)(0x5C94B6CEA3CEE4F0L ^ l))) + ilIlG2, exception);
        }
    }

    /*
     * Unable to fully structure code
     */
    public static void CP_P(CP_G2 var0, PacketWrapper<?> var1_1, NBTCompound var2_2) {
        var3_3 = CP_O.a ^ 24401232699148L;
        var6_4 = CP_r7.CP_b().CP_q().CP_P(var0, var1_1.CP_w().CP_E());
        var7_5 = var2_2.getTags().values().iterator();
        var5_6 = VersionedRegistry.CP_B();
        while (var7_5.hasNext()) {
            block10: {
                block9: {
                    var8_7 = var7_5.next();
                    try {
                        v0 = var8_7;
                        if (var5_6 != null) break block9;
                        if (v0 instanceof NBTList) {
                        }
                        ** GOTO lbl19
                    }
                    catch (IllegalStateException v1) {
                        throw CP_O.a(v1);
                    }
                    var9_8 = (NBTList)var8_7;
                    try {
                        CP_O.CP_u(var0, var1_1, CP_iN.CP_Q().CP_X(), CP_Pz.CP_s((NBTList<NBTCompound>)var9_8), var6_4);
                        if (var5_6 == null) break block10;
lbl19:
                        // 2 sources

                        v0 = var8_7;
                    }
                    catch (IllegalStateException v2) {
                        throw CP_O.a(v2);
                    }
                }
                var9_8 = (NBTCompound)v0;
                var10_9 = new ResourceLocation(var9_8.getStringTagValueOrThrow((String)CP_O.a("z", (int)21054, (long)(143429088110022070L ^ var3_3))));
                var11_10 = var9_8.getCompoundListTagOrNull((String)CP_O.a("z", (int)29938, (long)(2581164094479707003L ^ var3_3)));
                try {
                    if (var11_10 != null) {
                        CP_O.CP_u(var0, var1_1, var10_9, CP_Pz.CP_s(var11_10), var6_4);
                    }
                }
                catch (IllegalStateException v3) {
                    throw CP_O.a(v3);
                }
            }
            if (var5_6 == null) continue;
        }
    }

    private static /* synthetic */ void lambda$static$0(CP_Te ilIlTe) {
        CP_f.put(ilIlTe.CP_X(), ilIlTe);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_O.a = CP_s.a(4668991612116246697L, 5682623976416115089L, MethodHandles.lookup().lookupClass()).a(146028670261871L);
                        var20 = CP_O.a ^ 113981084131471L;
                        CP_O.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[5];
                        var16_4 = 0;
                        var15_5 = "t\u00bb\u00997\u00fe8\u00ba\u00f5\u00d4\u008fQ\u00c1\u00f7\u0005\u00ba}\u0010/\u00a6\u00a5\u00d5\u00b0.hHr\u0016w\u000b\u009d\u00b7\u009dV\u0010}we\u008c\u0002\u000bg\u0007\u00bc\u00f29\u00f0\u0018SZ\u00a2";
                        var17_6 = "t\u00bb\u00997\u00fe8\u00ba\u00f5\u00d4\u008fQ\u00c1\u00f7\u0005\u00ba}\u0010/\u00a6\u00a5\u00d5\u00b0.hHr\u0016w\u000b\u009d\u00b7\u009dV\u0010}we\u008c\u0002\u000bg\u0007\u00bc\u00f29\u00f0\u0018SZ\u00a2".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = CP_O.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u009e\u00c2?Y\u008a\u00f6\u001e\u00ba\u00fa\u00b8\u0011~T%?I\u0082BL\u00e2\u00a1\u00f1+\u00f1`\u001c#_\u0082\u00f8\u00b3\u00e9\u0007\u00ae#\u0006\u00ec\u00f7h\"\u0000{%\u0006\u00cb\u0011\u00d3s@\u001b/\u00c8gA,:\u009b<\u001b\u00e2\u00b1wr3\u0003g(\u0081v]\u001c\u008c?F\u00bb\u00a5\u00c7\u00fb\u001c\u00e2\u000f\u00e2;\u00db\u00f0K\u00af<\u00c7<\u00cfu|\u009eL&\u00d1\u00f10\u0083\u009b\u00ba@\u00be\u00d3\u00a6l\u0093S \u00d3\u00ad\u00bb";
                            var17_6 = "\u009e\u00c2?Y\u008a\u00f6\u001e\u00ba\u00fa\u00b8\u0011~T%?I\u0082BL\u00e2\u00a1\u00f1+\u00f1`\u001c#_\u0082\u00f8\u00b3\u00e9\u0007\u00ae#\u0006\u00ec\u00f7h\"\u0000{%\u0006\u00cb\u0011\u00d3s@\u001b/\u00c8gA,:\u009b<\u001b\u00e2\u00b1wr3\u0003g(\u0081v]\u001c\u008c?F\u00bb\u00a5\u00c7\u00fb\u001c\u00e2\u000f\u00e2;\u00db\u00f0K\u00af<\u00c7<\u00cfu|\u009eL&\u00d1\u00f10\u0083\u009b\u00ba@\u00be\u00d3\u00a6l\u0093S \u00d3\u00ad\u00bb".length();
                            var14_7 = 48;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = CP_O.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                CP_O.b = var18_3;
                CP_O.c = new String[5];
                var1_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var2_11 = 1; var2_11 < 8; ++var2_11) {
                    v9 = v9;
                    v9[var2_11] = (byte)(var20 << var2_11 * 8 >>> 56);
                }
                var1_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var0_12 = new long[21];
                var4_13 = 0;
                var5_14 = "\u0003A\u000f\u009e\u00c8to\u00a4N?\u00cds\u0011\u00ba\u0095\u000b5\u0000G\u00c8\u009f\u00c7\u0014\u00ca@\u00e6\u00cfw\u00f0\u00afu\u008f\u00d3\u00a5\u00bc)\u00a5d\u00b1/\u0096\u00b1q[\u00f5\u00a6@K\u00ec'\u00b6\u0001\u00ba\u00a5\u00e8J\u00dc\u00a6/\u009aL\u00d2\u008c\u00b2_\"9L\u00eda3\u0099M\u0081h\u00afB\u0017JL\u001b\u0082\u0007[8\u008a\u0096X\u00a3\u000e\u00cd\u0002\u0006\u00c1\u00e4a5\u00b5\u00e7\u00c7\u008d#N.f\u0092S\u00a9v\u00d7\u0086R\u0002N6\u00bd\u00f8+\u00e9\u00f1\u0097\u00b5\u000f~2%\u001e\u00c7\t\u00af\u00f8$\u0018\u00ceZo(\u00fe\u00d7\u00f5v\u00e6\u00c7\u0084\u0098\u00d5\u00af2\u00f8\u00b2\u00e6_";
                var6_15 = "\u0003A\u000f\u009e\u00c8to\u00a4N?\u00cds\u0011\u00ba\u0095\u000b5\u0000G\u00c8\u009f\u00c7\u0014\u00ca@\u00e6\u00cfw\u00f0\u00afu\u008f\u00d3\u00a5\u00bc)\u00a5d\u00b1/\u0096\u00b1q[\u00f5\u00a6@K\u00ec'\u00b6\u0001\u00ba\u00a5\u00e8J\u00dc\u00a6/\u009aL\u00d2\u008c\u00b2_\"9L\u00eda3\u0099M\u0081h\u00afB\u0017JL\u001b\u0082\u0007[8\u008a\u0096X\u00a3\u000e\u00cd\u0002\u0006\u00c1\u00e4a5\u00b5\u00e7\u00c7\u008d#N.f\u0092S\u00a9v\u00d7\u0086R\u0002N6\u00bd\u00f8+\u00e9\u00f1\u0097\u00b5\u000f~2%\u001e\u00c7\t\u00af\u00f8$\u0018\u00ceZo(\u00fe\u00d7\u00f5v\u00e6\u00c7\u0084\u0098\u00d5\u00af2\u00f8\u00b2\u00e6_".length();
                var3_16 = 0;
                while (true) {
                    var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                    v10 = var0_12;
                    v11 = var4_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    var5_14 = "\u00db\u00a0\u0095VF}:\u00d5\u00f6\u008aZ\u00e3\u008f\u00a7\u00c4P";
                    var6_15 = "\u00db\u00a0\u0095VF}:\u00d5\u00f6\u008aZ\u00e3\u008f\u00a7\u00c4P".length();
                    var3_16 = 0;
                    while (true) {
                        var7_17 = var5_14.substring(var3_16, var3_16 += 8).getBytes("ISO-8859-1");
                        v10 = var0_12;
                        v11 = var4_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var3_16 < var6_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var1_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl103:
                // 1 sources

                ** continue;
            }
        }
        CP_O.CP_M = Boolean.getBoolean((String)CP_O.a("z", (int)22611, (long)(5632263010099165276L ^ var20)));
        CP_O.CP_f = new HashMap<ResourceLocation, CP_Te<?>>();
        v15 = new CP_Te[(int)var0_12[8]];
        v15[0] = new CP_Te<CP_dJ>(CP_jF.CP_n(), CP_dJ.CP_k);
        v15[1] = new CP_Te<CP_jA>(CP_dt.CP_c(), (CP_CJ<CP_jA>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_c(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/chat/CP_jA;)());
        v15[2] = new CP_Te<CP_h2>(CP_WY.CP_n(), (CP_hN<CP_h2>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_v(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/trimpattern/CP_h2;)());
        v15[3] = new CP_Te<CP_OM>(CP_W0.CP_a(), (CP_hN<CP_OM>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_C(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/trimmaterial/CP_OM;)());
        v15[4] = new CP_Te<CP_dv>(CP_di.CP_p(), (CP_hN<CP_dv>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_i(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/wolfvariant/CP_dv;)());
        v15[5] = new CP_Te<CP_Xo>(CP_Y.CP_l(), CP_Xo.CP_J);
        v15[(int)var0_12[14]] = new CP_Te<CP_oN>(CP_vt.CP_G(), (CP_CJ<CP_oN>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_e(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/pig/CP_oN;)());
        v15[(int)var0_12[3]] = new CP_Te<CP_qA>(CP_ZB.CP_a(), (CP_CJ<CP_qA>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_v(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/frog/CP_qA;)());
        v15[(int)var0_12[13]] = new CP_Te<CP_AW>(CP_W_.CP_l(), CP_AW.CP_UnderScore);
        v15[(int)var0_12[12]] = new CP_Te<CP_dL>(CP_xN.CP_i(), CP_dL.CP_k);
        v15[(int)var0_12[6]] = new CP_Te<CP_fP>(CP_yd.CP_M(), CP_fP.CP_h);
        v15[(int)var0_12[10]] = new CP_Te<CP_XC>(CP_re.CP_y(), (CP_CJ<CP_XC>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_O(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/entity/nautilus/CP_XC;)());
        v15[(int)var0_12[2]] = new CP_Te<CP_G0>(CP_dO.CP_Q(), CP_G0.CP_u);
        v15[(int)var0_12[7]] = new CP_Te<CP_nq>(CP_iN.CP_Q(), CP_nq.CP_Y);
        v15[(int)var0_12[19]] = new CP_Te<CP_Tk>(CP_qK.CP_k(), (CP_CJ<CP_Tk>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_u(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/world/damagetype/CP_Tk;)());
        v15[(int)var0_12[15]] = new CP_Te<CP_Zd>(CP_jw.CP_X(), (CP_CJ<CP_Zd>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_A(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/banner/CP_Zd;)());
        v15[(int)var0_12[5]] = new CP_Te<CP_QY>(CP_yM.CP_V(), (CP_hN<CP_QY>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_n(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/enchantment/type/CP_QY;)());
        v15[(int)var0_12[11]] = new CP_Te<CP_ht>(CP_Xe.CP_M(), (CP_hN<CP_ht>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_I(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/jukebox/CP_ht;)());
        v15[(int)var0_12[4]] = new CP_Te<CP_OE>(CP_f7.CP_F(), (CP_hN<CP_OE>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_t(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/instrument/CP_OE;)());
        v15[(int)var0_12[18]] = new CP_Te<CP_Tm>(CP_r_.CP_R(), (CP_hN<CP_Tm>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Ljava/lang/Object;, CP_Q(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/TypesBuilderData;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/dialog/CP_Tm;)());
        v15[(int)var0_12[16]] = new CP_Te<CP_iy>(CP_Q0.CP_F(), CP_iy.CP_V);
        v15[(int)var0_12[20]] = new CP_Te<CP_uj>(CP_dX.CP_x(), CP_uj.CP_g);
        v15[(int)var0_12[9]] = new CP_Te<CP_QC>(CP_uU.CP_I(), CP_QC.CP_B);
        v15[(int)var0_12[1]] = new CP_Te<CP_y8>(CP_yU.CP_V(), CP_y8.CP_p);
        v15[(int)var0_12[17]] = new CP_Te<CP_fM>(CP_AC.CP_R(), CP_fM.CP_o);
        v15[(int)var0_12[0]] = new CP_Te<CP_jT>(CP_hi.CP_n(), CP_jT.CP_P);
        Stream.of(v15).forEach((Consumer<CP_Te>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$static$0(me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_Te ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/CP_Te;)V)());
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4822;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/CP_O", exception);
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
            CP_O.c[n2] = CP_O.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_O.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/util/mappings/CP_O" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_O.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

