/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_LG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Lh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_fC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_fm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_CV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_PF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_WW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.CP_d_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@NullMarked
public class CP_Zq
implements CP_CV {
    private final ClientVersion CP_v;
    private int CP_x;
    private int CP_Z;
    private final CP_PF CP_e;
    private final CP_PF CP_UnderScore;
    private static String CP_G;
    private static final long b;
    private static transient /* synthetic */ String vCjbxluKgU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Deprecated
    public CP_Zq() {
        this(CP_r7.CP_b().CP_q().CP_F().CP_E());
    }

    public CP_Zq(ClientVersion clientVersion) {
        this.CP_v = clientVersion;
        this.CP_e = CP_WW.CHUNK.CP_F();
        this.CP_UnderScore = CP_WW.BIOME.CP_F();
    }

    @Deprecated
    @ApiStatus.Obsolete
    public CP_Zq(int n, CP_PF ilIlPF, CP_PF ilIlPF2) {
        this(CP_r7.CP_b().CP_q().CP_F().CP_E(), n, 0, ilIlPF, ilIlPF2);
    }

    @Deprecated
    public CP_Zq(int n, int n2, CP_PF ilIlPF, CP_PF ilIlPF2) {
        this(CP_r7.CP_b().CP_q().CP_F().CP_E(), n, n2, ilIlPF, ilIlPF2);
    }

    @ApiStatus.Obsolete
    public CP_Zq(ClientVersion clientVersion, int n, CP_PF ilIlPF, CP_PF ilIlPF2) {
        this(clientVersion, n, 0, ilIlPF, ilIlPF2);
    }

    public CP_Zq(ClientVersion clientVersion, int n, int n2, CP_PF ilIlPF, CP_PF ilIlPF2) {
        this.CP_v = clientVersion;
        this.CP_x = n;
        this.CP_Z = n2;
        this.CP_e = ilIlPF;
        this.CP_UnderScore = ilIlPF2;
    }

    public static CP_Zq CP_c(PacketWrapper<?> packetWrapper) {
        ClientVersion clientVersion = packetWrapper.CP_w().CP_E();
        boolean bl = clientVersion.CP_O(ClientVersion.V_1_21_5);
        boolean bl2 = clientVersion.CP_w(ClientVersion.V_26_1);
        return CP_Zq.CP_y(clientVersion, new CP_fm(packetWrapper), bl, bl2);
    }

    @Deprecated
    public static CP_Zq CP_X(CP_fC ilIlfC) {
        return CP_Zq.CP_Z(ilIlfC, true);
    }

    @Deprecated
    public static CP_Zq CP_Z(CP_fC ilIlfC, boolean bl) {
        return CP_Zq.CP_S(ilIlfC, bl, false);
    }

    @Deprecated
    public static CP_Zq CP_S(CP_fC ilIlfC, boolean bl, boolean bl2) {
        return CP_Zq.CP_y(CP_r7.CP_b().CP_q().CP_F().CP_E(), ilIlfC, bl, bl2);
    }

    @Deprecated
    public static CP_Zq CP_y(ClientVersion clientVersion, CP_fC ilIlfC, boolean bl, boolean s) {
        long l = b ^ 0x2DD84C8E7203L;
        short s2 = ilIlfC.CP_V();
        String string = CP_Zq.CP_e();
        short s3 = s;
        if (string != null) {
            s3 = s3 != 0 ? ilIlfC.CP_V() : (short)0;
        }
        short s4 = s3;
        CP_PF ilIlPF = CP_PF.CP_z(ilIlfC, CP_WW.CHUNK, true, bl);
        CP_PF ilIlPF2 = CP_PF.CP_z(ilIlfC, CP_WW.BIOME, true, bl);
        CP_Zq ilIlZq = new CP_Zq(clientVersion, s2, s4, ilIlPF, ilIlPF2);
        if (string == null) {
            PacketWrapper.CP_e(new int[5]);
        }
        return ilIlZq;
    }

    public static void CP_x(PacketWrapper<?> packetWrapper, CP_Zq ilIlZq) {
        boolean bl = packetWrapper.CP_w().CP_C(ServerVersion.V_1_21_5);
        boolean bl2 = packetWrapper.CP_w().CP_z(ServerVersion.V_26_1);
        CP_Zq.CP_i(new CP_Lh(packetWrapper), ilIlZq, bl, bl2);
    }

    @Deprecated
    public static void CP_v(CP_LG ilIlLG, CP_Zq ilIlZq) {
        CP_Zq.CP_A(ilIlLG, ilIlZq, true);
    }

    @Deprecated
    public static void CP_A(CP_LG ilIlLG, CP_Zq ilIlZq, boolean bl) {
        CP_Zq.CP_i(ilIlLG, ilIlZq, bl, false);
    }

    @Deprecated
    public static void CP_i(CP_LG ilIlLG, CP_Zq ilIlZq, boolean bl, boolean bl2) {
        long l = b ^ 0x5CC63E77460BL;
        String string = CP_Zq.CP_e();
        ilIlLG.CP_S(ilIlZq.CP_x);
        String string2 = string;
        if (string2 != null) {
            if (bl2) {
                ilIlLG.CP_S(ilIlZq.CP_Z);
            }
            CP_PF.CP_b(ilIlLG, ilIlZq.CP_e, bl);
            CP_PF.CP_b(ilIlLG, ilIlZq.CP_UnderScore, bl);
        }
    }

    @Override
    public int CP_y(int n, int n2, int n3) {
        return this.CP_e.CP_V(n, n2, n3);
    }

    @Override
    public void CP_k(int n, int n2, int n3, CP_d_ ilIld_) {
        block14: {
            boolean bl;
            block15: {
                block16: {
                    String string;
                    block13: {
                        CP_d_ ilIld_2;
                        block11: {
                            block12: {
                                block9: {
                                    block10: {
                                        long l = b ^ 0x1F629EDD5F55L;
                                        int n4 = this.CP_e.CP_C(n, n2, n3, ilIld_.CP_s());
                                        ilIld_2 = CP_d_.CP_W(this.CP_v, n4);
                                        string = CP_Zq.CP_e();
                                        bl = ilIld_2.CP_f().CP_M();
                                        if (string == null) break block9;
                                        if (!bl) break block10;
                                        bl = ilIld_.CP_f().CP_M();
                                        if (string == null) break block11;
                                        if (bl) break block12;
                                        ++this.CP_x;
                                        if (string != null) break block12;
                                    }
                                    bl = ilIld_.CP_f().CP_M();
                                }
                                if (string == null) break block11;
                                if (bl) {
                                    --this.CP_x;
                                }
                            }
                            bl = this.CP_v.CP_w(ClientVersion.V_26_1);
                        }
                        if (string == null) break block13;
                        if (!bl) break block14;
                        bl = ilIld_2.CP_x();
                    }
                    if (string == null) break block15;
                    if (bl) break block16;
                    if (!ilIld_.CP_x()) break block14;
                    ++this.CP_Z;
                    if (string != null) break block14;
                }
                bl = ilIld_.CP_x();
            }
            if (!bl) {
                --this.CP_Z;
            }
        }
        if (PacketWrapper.CP_z() == null) {
            CP_Zq.CP_r("CRknwb");
        }
    }

    @Override
    public void CP_A(int n, int n2, int n3, int n4) {
        this.CP_k(n, n2, n3, CP_d_.CP_W(this.CP_v, n4));
    }

    @Override
    public void CP_A(ClientVersion clientVersion, int n, int n2, int n3, int n4) {
        this.CP_k(n, n2, n3, CP_d_.CP_W(clientVersion, n4));
    }

    @Override
    public boolean CP_q() {
        long l = b ^ 0x6C4C0B6795A1L;
        String string = CP_Zq.CP_e();
        boolean bl = this.CP_x;
        if (string != null) {
            bl = !bl;
        }
        return bl;
    }

    public int CP_h() {
        return this.CP_x;
    }

    public void CP_w(int n) {
        this.CP_x = n;
    }

    public int CP_j() {
        return this.CP_Z;
    }

    public void CP_Z(int n) {
        this.CP_Z = n;
    }

    public CP_PF CP_q() {
        return this.CP_e;
    }

    public CP_PF CP_V() {
        return this.CP_UnderScore;
    }

    public static void CP_r(String string) {
        CP_G = string;
    }

    public static String CP_e() {
        return CP_G;
    }

    static {
        b = CP_s.a(-2548825872651694355L, -7491716779081937752L, MethodHandles.lookup().lookupClass()).a(13388958774463L);
        if (CP_Zq.CP_e() == null) {
            CP_Zq.CP_r("vivHGb");
        }
    }
}

