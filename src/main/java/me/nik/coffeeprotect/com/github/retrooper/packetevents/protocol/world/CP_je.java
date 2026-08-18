/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import java.util.BitSet;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_CR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_CV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_XH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Zq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.dimension.CP_nq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public class CP_je
implements CP_XH {
    private static final long a = CP_s.a(-6025591208835711112L, 4246915924862263776L, MethodHandles.lookup().lookupClass()).a(197207349122480L);
    private static transient /* synthetic */ String pvIVsvdcCr = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    @ApiStatus.Internal
    public static int CP_M(CP_CV[] var0) {
        var1_1 = CP_je.a ^ 132106153542618L;
        var4_2 = 0;
        var5_3 = var0;
        var6_4 = var5_3.length;
        var3_6 = CP_CR.CP_U();
        for (var7_5 = 0; var7_5 < var6_4; ++var7_5) {
            var8_7 = var5_3[var7_5];
            v0 = var9_8 = ((CP_Zq)var8_7).CP_q().CP_e;
            if (!var3_6) ** GOTO lbl12
            if (v0 != null) {
                v0 = var9_8;
lbl12:
                // 2 sources

                v1 = v0.CP_UnderScore().length;
            } else {
                v1 = 0;
            }
            var10_9 = ByteBufHelper.CP_F(v1);
            v2 = var11_10 = ((CP_Zq)var8_7).CP_V().CP_e;
            if (!var3_6) ** GOTO lbl20
            if (v2 != null) {
                v2 = var11_10;
lbl20:
                // 2 sources

                v3 = v2.CP_UnderScore().length;
            } else {
                v3 = 0;
            }
            var12_11 = ByteBufHelper.CP_F(v3);
            var4_2 += var10_9 + var12_11;
            if (var3_6) continue;
        }
        return var4_2;
    }

    @Override
    public CP_CV[] CP_Z(CP_nq ilIlnq, BitSet bitSet, BitSet bitSet2, boolean bl, boolean bl2, boolean bl3, int n, int n2, PacketWrapper<?> packetWrapper) {
        CP_CV[] ilIlCVArray;
        block7: {
            Object object;
            int n3;
            block9: {
                boolean bl4;
                int n4;
                block8: {
                    long l = a ^ 0x7E2D47465FF8L;
                    n4 = ByteBufHelper.readerIndex(packetWrapper.CP_S);
                    bl4 = CP_CR.CP_f();
                    ilIlCVArray = new CP_CV[n];
                    for (int i = 0; i < n; ++i) {
                        ilIlCVArray[i] = CP_Zq.CP_c(packetWrapper);
                        if (!bl4) {
                            if (!bl4) continue;
                        }
                        break block7;
                    }
                    n3 = packetWrapper.CP_w().CP_C(ServerVersion.V_1_21_6);
                    if (bl4) break block8;
                    if (n3 == 0) break block7;
                    n3 = packetWrapper.CP_w().CP_z(ServerVersion.V_1_21_5) ? 1 : 0;
                }
                if (bl4) break block9;
                if (n3 == 0) break block7;
                object = packetWrapper.CP_S;
                if (bl4) break block7;
                n3 = ByteBufHelper.readerIndex(object) - n4;
            }
            if (n3 < n2) {
                object = ByteBufHelper.CP_J(packetWrapper.CP_S, CP_je.CP_M(ilIlCVArray));
            }
        }
        return ilIlCVArray;
    }
}

