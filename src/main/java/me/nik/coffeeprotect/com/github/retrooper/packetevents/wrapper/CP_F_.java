/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_yY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_F_
extends PacketWrapper<CP_F_> {
    private ResourceLocation CP_l;
    private CP_An CP_b;
    private float CP_A;
    private float CP_x;
    private static final long b = CP_s.a(-3240703098246273760L, -5041342426113325871L, MethodHandles.lookup().lookupClass()).a(261036733060609L);
    private static transient /* synthetic */ String zJBeXMjFHS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_F_(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_F_(CP_An ilIlAn) {
        this(ilIlAn, 0.0f);
    }

    public CP_F_(CP_An ilIlAn, float f) {
        this(CP_yY.CP_L, ilIlAn, f, 0.0f);
    }

    public CP_F_(ResourceLocation resourceLocation, CP_An ilIlAn, float f, float f2) {
        super(CP_AG.SPAWN_POSITION);
        this.CP_l = resourceLocation;
        this.CP_b = ilIlAn;
        this.CP_A = f;
        this.CP_x = f2;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_e() {
        block10: {
            block9: {
                block8: {
                    var1_1 = CP_F_.b ^ 91586458830820L;
                    var3_2 = CP_Fh.CP_a();
                    v0 = this;
                    if (var3_2 != null) {
                        if (v0.CP_g.CP_z(ServerVersion.V_1_21_9)) {
                            this.CP_l = ResourceLocation.read(this);
                        }
                        v0 = this;
                    }
                    v1 = this;
                    if (var3_2 == null) ** GOTO lbl12
                    if (v1.CP_g.CP_z(ServerVersion.V_1_8)) {
                        v1 = this;
lbl12:
                        // 2 sources

                        v2 = v1.CP_E();
                    } else {
                        v2 = new CP_An(this.CP_W(), this.CP_W(), this.CP_W());
                    }
                    v0.CP_b = v2;
                    v3 = this.CP_g.CP_z(ServerVersion.V_1_17);
                    if (var3_2 == null) break block8;
                    if (v3) {
                        this.CP_A = this.CP_X();
                    }
                    v4 = this;
                    if (var3_2 == null) break block9;
                    v3 = v4.CP_g.CP_z(ServerVersion.V_1_21_9);
                }
                if (!v3) break block10;
                v4 = this;
            }
            v4.CP_x = this.CP_X();
        }
    }

    @Override
    public void CP_J() {
        block14: {
            CP_F_ ilIlF_;
            block13: {
                boolean bl;
                block12: {
                    PacketWrapper[] packetWrapperArray;
                    block11: {
                        CP_F_ ilIlF_2;
                        block9: {
                            block10: {
                                boolean bl2;
                                block8: {
                                    long l = b ^ 0x4A315FB1794CL;
                                    packetWrapperArray = CP_Fh.CP_a();
                                    bl2 = this.CP_g.CP_z(ServerVersion.V_1_21_9);
                                    if (packetWrapperArray == null) break block8;
                                    if (bl2) {
                                        ResourceLocation.write(this, this.CP_l);
                                    }
                                    ilIlF_2 = this;
                                    if (packetWrapperArray == null) break block9;
                                    bl2 = ilIlF_2.CP_g.CP_z(ServerVersion.V_1_8);
                                }
                                if (!bl2) break block10;
                                this.CP_h(this.CP_b);
                                if (packetWrapperArray != null) break block11;
                            }
                            this.CP_a(this.CP_b.CP_j);
                            this.CP_a(this.CP_b.CP_w);
                            ilIlF_2 = this;
                        }
                        ilIlF_2.CP_a(this.CP_b.CP_k);
                    }
                    bl = this.CP_g.CP_z(ServerVersion.V_1_17);
                    if (packetWrapperArray == null) break block12;
                    if (bl) {
                        this.CP_R(this.CP_A);
                    }
                    ilIlF_ = this;
                    if (packetWrapperArray == null) break block13;
                    bl = ilIlF_.CP_g.CP_z(ServerVersion.V_1_21_9);
                }
                if (!bl) break block14;
                ilIlF_ = this;
            }
            ilIlF_.CP_R(this.CP_x);
        }
    }

    public void CP_H(CP_F_ ilIlF_) {
        this.CP_l = ilIlF_.CP_l;
        this.CP_b = ilIlF_.CP_b;
        this.CP_A = ilIlF_.CP_A;
        this.CP_x = ilIlF_.CP_x;
    }

    public ResourceLocation CP_Q() {
        return this.CP_l;
    }

    public void CP_Y(ResourceLocation resourceLocation) {
        this.CP_l = resourceLocation;
    }

    public CP_An CP_c() {
        return this.CP_b;
    }

    public void CP_f(CP_An ilIlAn) {
        this.CP_b = ilIlAn;
    }

    @Deprecated
    public Optional<Float> CP_E() {
        return Optional.ofNullable(Float.valueOf(this.CP_A));
    }

    @Deprecated
    public void CP_N(float f) {
        this.CP_A = f;
    }

    public float CP_A() {
        return this.CP_A;
    }

    public void CP_u(float f) {
        this.CP_A = f;
    }

    public float CP_O() {
        return this.CP_x;
    }

    public void CP_l(float f) {
        this.CP_x = f;
    }
}

