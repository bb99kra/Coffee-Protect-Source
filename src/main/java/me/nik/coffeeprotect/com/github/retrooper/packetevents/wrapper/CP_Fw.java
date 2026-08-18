/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.concurrent.ThreadLocalRandom;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_Gq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_QO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.CP_Tl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.sound.StaticSound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Fw
extends PacketWrapper<CP_Fw> {
    private CP_QO CP_v;
    private CP_Tl CP_B;
    private CP_An CP_J;
    private float CP_UnderScore;
    private float CP_q;
    private long CP_r;
    private static final long b = CP_s.a(-2033920527473383743L, -4348279589856632687L, MethodHandles.lookup().lookupClass()).a(112975741376418L);
    private static transient /* synthetic */ String fhTHVinXDc = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fw(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fw(int n, CP_Tl ilIlTl, CP_An ilIlAn, float f, float f2) {
        this(n, ilIlTl, ilIlAn, f, f2, ThreadLocalRandom.current().nextLong());
    }

    public CP_Fw(int n, CP_Tl ilIlTl, CP_An ilIlAn, float f, float f2, long l) {
        this(CP_Gq.CP_k(CP_r7.CP_b().CP_q().CP_F().CP_E(), n), ilIlTl, ilIlAn, f, f2, l);
    }

    public CP_Fw(CP_QO ilIlQO, CP_Tl ilIlTl, CP_An ilIlAn, float f, float f2) {
        this(ilIlQO, ilIlTl, ilIlAn, f, f2, ThreadLocalRandom.current().nextLong());
    }

    public CP_Fw(CP_QO ilIlQO, CP_Tl ilIlTl, CP_An ilIlAn, float f, float f2, long l) {
        super(CP_AG.SOUND_EFFECT);
        this.CP_v = ilIlQO;
        this.CP_B = ilIlTl;
        this.CP_J = ilIlAn;
        this.CP_UnderScore = f;
        this.CP_q = f2;
        this.CP_r = l;
    }

    @Override
    public void CP_e() {
        block20: {
            block19: {
                PacketWrapper[] packetWrapperArray;
                block18: {
                    block16: {
                        CP_Fw ilIlFw;
                        block17: {
                            boolean bl;
                            block15: {
                                block12: {
                                    ResourceLocation resourceLocation;
                                    CP_QO ilIlQO;
                                    CP_Fw ilIlFw2;
                                    block13: {
                                        block14: {
                                            boolean bl2;
                                            block10: {
                                                block11: {
                                                    long l = b ^ 0x131D54B14DB4L;
                                                    packetWrapperArray = CP_Fh.CP_a();
                                                    bl2 = this.CP_g.CP_z(ServerVersion.V_1_19_3);
                                                    if (packetWrapperArray == null) break block10;
                                                    if (!bl2) break block11;
                                                    this.CP_v = CP_QO.CP_q(this);
                                                    if (packetWrapperArray != null) break block12;
                                                }
                                                ilIlFw2 = this;
                                                if (packetWrapperArray == null) break block13;
                                                bl2 = ilIlFw2.CP_g.CP_z(ServerVersion.V_1_9);
                                            }
                                            if (!bl2) break block14;
                                            this.CP_v = CP_Gq.CP_k(this.CP_g.CP_E(), this.CP_f());
                                            if (packetWrapperArray != null) break block12;
                                        }
                                        ilIlFw2 = this;
                                    }
                                    this.CP_v = (ilIlQO = CP_Gq.CP_C((resourceLocation = ilIlFw2.readIdentifier()).toString())) == null ? new StaticSound(resourceLocation, null) : ilIlQO;
                                }
                                bl = this.CP_g.CP_z(ServerVersion.V_1_9);
                                if (packetWrapperArray == null) break block15;
                                if (bl) {
                                    this.CP_B = CP_Tl.CP_F(this.CP_f());
                                }
                                this.CP_J = new CP_An(this.CP_W(), this.CP_W(), this.CP_W());
                                this.CP_UnderScore = this.CP_X();
                                ilIlFw = this;
                                if (packetWrapperArray == null) break block16;
                                bl = ilIlFw.CP_g.CP_z(ServerVersion.V_1_10);
                            }
                            if (!bl) break block17;
                            this.CP_q = this.CP_X();
                            if (packetWrapperArray != null) break block18;
                        }
                        ilIlFw = this;
                    }
                    ilIlFw.CP_q = (float)this.CP_P() / 63.5f;
                }
                CP_Fw ilIlFw = this;
                if (packetWrapperArray == null) break block19;
                if (!ilIlFw.CP_g.CP_z(ServerVersion.V_1_19)) break block20;
                ilIlFw = this;
            }
            ilIlFw.CP_r = this.CP_i();
        }
    }

    @Override
    public void CP_J() {
        block20: {
            CP_Fw ilIlFw;
            block19: {
                PacketWrapper[] packetWrapperArray;
                block18: {
                    CP_Fw ilIlFw2;
                    block16: {
                        block17: {
                            boolean bl;
                            block15: {
                                block12: {
                                    CP_Fw ilIlFw3;
                                    block13: {
                                        block14: {
                                            boolean bl2;
                                            block10: {
                                                block11: {
                                                    long l = b ^ 0xA602958731CL;
                                                    packetWrapperArray = CP_Fh.CP_a();
                                                    bl2 = this.CP_g.CP_z(ServerVersion.V_1_19_3);
                                                    if (packetWrapperArray == null) break block10;
                                                    if (!bl2) break block11;
                                                    CP_QO.CP_w(this, this.CP_v);
                                                    if (packetWrapperArray != null) break block12;
                                                }
                                                ilIlFw3 = this;
                                                if (packetWrapperArray == null) break block13;
                                                bl2 = ilIlFw3.CP_g.CP_z(ServerVersion.V_1_9);
                                            }
                                            if (!bl2) break block14;
                                            this.CP_J(this.CP_v.CP_H(this.CP_g.CP_E()));
                                            if (packetWrapperArray != null) break block12;
                                        }
                                        ilIlFw3 = this;
                                    }
                                    ilIlFw3.CP_M(this.CP_v.getSoundId().getKey());
                                }
                                bl = this.CP_g.CP_z(ServerVersion.V_1_9);
                                if (packetWrapperArray == null) break block15;
                                if (bl) {
                                    this.CP_J(this.CP_B.ordinal());
                                }
                                this.CP_a(this.CP_J.CP_j);
                                this.CP_a(this.CP_J.CP_w);
                                this.CP_a(this.CP_J.CP_k);
                                this.CP_R(this.CP_UnderScore);
                                ilIlFw2 = this;
                                if (packetWrapperArray == null) break block16;
                                bl = ilIlFw2.CP_g.CP_z(ServerVersion.V_1_10);
                            }
                            if (!bl) break block17;
                            this.CP_R(this.CP_q);
                            if (packetWrapperArray != null) break block18;
                        }
                        ilIlFw2 = this;
                    }
                    ilIlFw2.CP_u((int)(this.CP_q * 63.5f));
                }
                ilIlFw = this;
                if (packetWrapperArray == null) break block19;
                if (!ilIlFw.CP_g.CP_z(ServerVersion.V_1_19)) break block20;
                ilIlFw = this;
            }
            ilIlFw.CP_P(this.CP_r);
        }
    }

    public void CP_C(CP_Fw ilIlFw) {
        this.CP_v = ilIlFw.CP_v;
        this.CP_B = ilIlFw.CP_B;
        this.CP_J = ilIlFw.CP_J;
        this.CP_UnderScore = ilIlFw.CP_UnderScore;
        this.CP_q = ilIlFw.CP_q;
        this.CP_r = ilIlFw.CP_r;
    }

    public CP_QO CP_s() {
        return this.CP_v;
    }

    public void CP_G(CP_QO ilIlQO) {
        this.CP_v = ilIlQO;
    }

    @Deprecated
    public int CP_y() {
        return this.CP_s().CP_H(this.CP_g.CP_E());
    }

    @Deprecated
    public void CP_C(int n) {
        this.CP_G(CP_Gq.CP_k(this.CP_g.CP_E(), n));
    }

    @Nullable
    public CP_Tl CP_I() {
        return this.CP_B;
    }

    public void CP_q(CP_Tl ilIlTl) {
        this.CP_B = ilIlTl;
    }

    public CP_An CP_f() {
        return this.CP_J;
    }

    public void CP_F(CP_An ilIlAn) {
        this.CP_J = ilIlAn;
    }

    public float CP_o() {
        return this.CP_UnderScore;
    }

    public void CP_O(float f) {
        this.CP_UnderScore = f;
    }

    public float CP_n() {
        return this.CP_q;
    }

    public void CP_M(float f) {
        this.CP_q = f;
    }

    public long CP_V() {
        return this.CP_r;
    }

    public void CP_t(long l) {
        this.CP_r = l;
    }
}

