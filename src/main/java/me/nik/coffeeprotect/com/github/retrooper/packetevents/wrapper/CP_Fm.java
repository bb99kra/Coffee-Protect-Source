/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_LD;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.entity.data.CP_nm;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_iP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_h9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_v_;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Fm
extends PacketWrapper<CP_Fm> {
    private static final float CP_t = 0.7111111f;
    private int CP_I;
    private UUID CP_l;
    private CP_v_ CP_O;
    private float CP_F;
    private float CP_u;
    @Deprecated
    private ItemType CP_z;
    private List<CP_nm<?>> CP_Y;
    private static final long b = CP_s.a(-618751298647819304L, -5837083355105236127L, MethodHandles.lookup().lookupClass()).a(78881728558273L);
    private static transient /* synthetic */ String BActqzOjDw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fm(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fm(int n, UUID uUID, CP_iP ilIliP, CP_LD ilIlLD) {
        this(n, uUID, ilIliP.CP_n(), ilIliP.CP_H(), ilIliP.CP_P(), ilIlLD.CP_p(CP_r7.CP_b().CP_q().CP_F().CP_E()));
    }

    public CP_Fm(int n, UUID uUID, CP_iP ilIliP, List<CP_nm<?>> list) {
        this(n, uUID, ilIliP.CP_n(), ilIliP.CP_H(), ilIliP.CP_P(), list);
    }

    public CP_Fm(int n, UUID uUID, CP_iP ilIliP, CP_nm<?> ... ilIlnmArray) {
        this(n, uUID, ilIliP.CP_n(), ilIliP.CP_H(), ilIliP.CP_P(), Arrays.asList(ilIlnmArray));
    }

    public CP_Fm(int n, UUID uUID, CP_v_ ilIlv_, float f, float f2, List<CP_nm<?>> list) {
        super(CP_AG.SPAWN_PLAYER);
        this.CP_I = n;
        this.CP_l = uUID;
        this.CP_O = ilIlv_;
        this.CP_F = f;
        this.CP_u = f2;
        this.CP_Y = list;
        this.CP_z = ItemTypes.AIR;
    }

    public CP_Fm(int n, UUID uUID, CP_v_ ilIlv_, float f, float f2, CP_LD ilIlLD) {
        this(n, uUID, ilIlv_, f, f2, ilIlLD.CP_p(CP_r7.CP_b().CP_q().CP_F().CP_E()));
    }

    @Override
    public void CP_e() {
        block14: {
            block12: {
                CP_Fm ilIlFm;
                block13: {
                    PacketWrapper[] packetWrapperArray;
                    block11: {
                        block9: {
                            CP_Fm ilIlFm2;
                            block10: {
                                boolean bl;
                                block8: {
                                    block7: {
                                        block6: {
                                            long l = b ^ 0x494FAD37D700L;
                                            this.CP_I = this.CP_f();
                                            packetWrapperArray = CP_Fh.CP_a();
                                            this.CP_l = this.CP_v();
                                            bl = this.CP_g.CP_z(ServerVersion.V_1_9);
                                            if (packetWrapperArray == null) break block6;
                                            if (!bl) break block7;
                                            this.CP_O = new CP_v_(this.CP_b(), this.CP_b(), this.CP_b());
                                        }
                                        if (packetWrapperArray != null) break block8;
                                    }
                                    this.CP_O = new CP_v_((double)this.CP_W() / 32.0, (double)this.CP_W() / 32.0, (double)this.CP_W() / 32.0);
                                }
                                this.CP_F = (float)this.CP_E() / 0.7111111f;
                                ilIlFm2 = this;
                                if (packetWrapperArray == null) break block9;
                                ilIlFm2.CP_u = (float)this.CP_E() / 0.7111111f;
                                if (bl) break block10;
                                this.CP_z = ItemTypes.getById(this.CP_g.CP_E(), this.CP_G());
                                if (packetWrapperArray != null) break block11;
                            }
                            ilIlFm2 = this;
                        }
                        ilIlFm2.CP_z = ItemTypes.AIR;
                    }
                    ilIlFm = this;
                    if (packetWrapperArray == null) break block12;
                    if (!ilIlFm.CP_g.CP_C(ServerVersion.V_1_15)) break block13;
                    this.CP_Y = this.CP_c();
                    if (packetWrapperArray != null) break block14;
                }
                ilIlFm = this;
            }
            ilIlFm.CP_Y = new ArrayList();
        }
    }

    @Override
    public void CP_J() {
        block12: {
            CP_Fm ilIlFm;
            block11: {
                boolean bl;
                block10: {
                    boolean bl2;
                    PacketWrapper[] packetWrapperArray;
                    block9: {
                        block7: {
                            block8: {
                                long l = b ^ 0x5032D0DEE9A8L;
                                this.CP_J(this.CP_I);
                                PacketWrapper[] packetWrapperArray2 = CP_Fh.CP_a();
                                this.CP_c(this.CP_l);
                                packetWrapperArray = packetWrapperArray2;
                                bl2 = this.CP_g.CP_z(ServerVersion.V_1_9);
                                if (packetWrapperArray == null) break block7;
                                if (!bl2) break block8;
                                this.CP_Y(this.CP_O.CP_l());
                                this.CP_Y(this.CP_O.CP_k());
                                this.CP_Y(this.CP_O.CP_Y());
                                if (packetWrapperArray != null) break block9;
                            }
                            this.CP_a(CP_h9.CP_K(this.CP_O.CP_l() * 32.0));
                            this.CP_a(CP_h9.CP_K(this.CP_O.CP_k() * 32.0));
                        }
                        this.CP_a(CP_h9.CP_K(this.CP_O.CP_Y() * 32.0));
                    }
                    this.CP_u((byte)(this.CP_F * 0.7111111f));
                    this.CP_u((byte)(this.CP_u * 0.7111111f));
                    bl = bl2;
                    if (packetWrapperArray == null) break block10;
                    if (!bl) {
                        this.CP_G(this.CP_z.CP_H(this.CP_g.CP_E()));
                    }
                    ilIlFm = this;
                    if (packetWrapperArray == null) break block11;
                    bl = ilIlFm.CP_g.CP_C(ServerVersion.V_1_15);
                }
                if (!bl) break block12;
                ilIlFm = this;
            }
            ilIlFm.CP_x(this.CP_Y);
        }
    }

    public void CP_E(CP_Fm ilIlFm) {
        this.CP_I = ilIlFm.CP_I;
        this.CP_l = ilIlFm.CP_l;
        this.CP_O = ilIlFm.CP_O;
        this.CP_F = ilIlFm.CP_F;
        this.CP_u = ilIlFm.CP_u;
        this.CP_z = ilIlFm.CP_z;
        this.CP_Y = ilIlFm.CP_Y;
    }

    public int CP_V() {
        return this.CP_I;
    }

    public void CP_m(int n) {
        this.CP_I = n;
    }

    public UUID CP_n() {
        return this.CP_l;
    }

    public void CP_UnderScore(UUID uUID) {
        this.CP_l = uUID;
    }

    public CP_v_ CP_p() {
        return this.CP_O;
    }

    public void CP_u(CP_v_ ilIlv_) {
        this.CP_O = ilIlv_;
    }

    public float CP_s() {
        return this.CP_F;
    }

    public void CP_a(float f) {
        this.CP_F = f;
    }

    public float CP_B() {
        return this.CP_u;
    }

    public void CP_h(float f) {
        this.CP_u = f;
    }

    @Deprecated
    public List<CP_nm<?>> CP_j() {
        return this.CP_Y;
    }

    @Deprecated
    public void CP_f(List<CP_nm<?>> list) {
        this.CP_Y = list;
    }

    @Deprecated
    public void CP_H(CP_LD ilIlLD) {
        this.CP_Y = ilIlLD.CP_p(this.CP_g.CP_E());
    }

    @Deprecated
    public ItemType CP_V() {
        return this.CP_z;
    }

    @Deprecated
    public void CP_w(ItemType itemType) {
        this.CP_z = itemType;
    }
}

