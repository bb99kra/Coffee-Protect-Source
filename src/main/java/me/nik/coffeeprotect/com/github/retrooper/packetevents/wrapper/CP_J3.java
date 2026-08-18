/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_jZ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public class CP_J3
extends PacketWrapper<CP_J3> {
    private int CP_n;
    @ApiStatus.Obsolete
    private ResourceLocation CP_f;
    private CP_jZ CP_T;
    private boolean CP_u;
    private static final long b = CP_s.a(8847872129815086172L, -175981498238874763L, MethodHandles.lookup().lookupClass()).a(218320504068867L);
    private static transient /* synthetic */ String FAlHSWOTMT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_J3(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_J3(int n, int n2, boolean bl) {
        this(n, new CP_jZ(n2), bl);
    }

    public CP_J3(int n, CP_jZ ilIljZ, boolean bl) {
        super(CP_nN.CRAFT_RECIPE_REQUEST);
        this.CP_n = n;
        this.CP_T = ilIljZ;
        this.CP_u = bl;
    }

    public CP_J3(int n, String string, boolean bl) {
        this(n, new ResourceLocation(string), bl);
    }

    public CP_J3(int n, ResourceLocation resourceLocation, boolean bl) {
        super(CP_nN.CRAFT_RECIPE_REQUEST);
        this.CP_n = n;
        this.CP_f = resourceLocation;
        this.CP_u = bl;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_J3 ilIlJ3;
                block3: {
                    long l = b ^ 0x28A63630D343L;
                    this.CP_n = this.CP_e();
                    String string = CP_JH.CP_w();
                    ilIlJ3 = this;
                    if (string != null) break block2;
                    if (!ilIlJ3.CP_g.CP_C(ServerVersion.V_1_21_2)) break block3;
                    ilIlJ3 = this;
                    if (string != null) break block2;
                    if (!ilIlJ3.CP_g.CP_z(ServerVersion.V_1_13)) break block3;
                    this.CP_f = this.readIdentifier();
                    if (string == null) break block4;
                }
                ilIlJ3 = this;
            }
            ilIlJ3.CP_T = CP_jZ.CP_w(this);
        }
        this.CP_u = this.CP_K();
    }

    @Override
    public void CP_J() {
        block4: {
            CP_J3 ilIlJ3;
            block2: {
                block3: {
                    long l = b ^ 0x31DB4BD9EDEBL;
                    String string = CP_JH.CP_w();
                    this.CP_r(this.CP_n);
                    String string2 = string;
                    ilIlJ3 = this;
                    if (string2 != null) break block2;
                    if (!ilIlJ3.CP_g.CP_C(ServerVersion.V_1_21_2)) break block3;
                    ilIlJ3 = this;
                    if (string2 != null) break block2;
                    if (!ilIlJ3.CP_g.CP_z(ServerVersion.V_1_13)) break block3;
                    this.writeIdentifier(this.CP_f);
                    if (string2 == null) break block4;
                }
                ilIlJ3 = this;
            }
            CP_jZ.CP_D(ilIlJ3, this.CP_T);
        }
        this.CP_a(this.CP_u);
    }

    public void CP_j(CP_J3 ilIlJ3) {
        this.CP_n = ilIlJ3.CP_n;
        this.CP_T = ilIlJ3.CP_T;
        this.CP_f = ilIlJ3.CP_f;
        this.CP_u = ilIlJ3.CP_u;
    }

    public int CP_V() {
        return this.CP_n;
    }

    public void CP_E(int n) {
        this.CP_n = n;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Deprecated
    public <T> T CP_t() {
        var1_1 = CP_J3.b ^ 87306760515637L;
        var3_2 = CP_JH.CP_w();
        v0 = this.CP_g.CP_C(ServerVersion.V_1_21_2);
        if (var3_2 != null) ** GOTO lbl13
        if (v0 == 0) ** GOTO lbl-1000
        v0 = (int)this.CP_g.CP_z(ServerVersion.V_1_13);
        if (var3_2 == null) {
            ** if (v0 == 0) goto lbl-1000
lbl-1000:
            // 1 sources

            {
                v1 = this.CP_f;
                ** GOTO lbl14
            }
        }
        ** GOTO lbl13
lbl-1000:
        // 2 sources

        {
            v0 = this.CP_T.CP_h();
lbl13:
            // 3 sources

            v1 = v0;
        }
lbl14:
        // 2 sources

        return (T)v1;
    }

    @Deprecated
    public <T> void CP_K(T t) {
        block4: {
            block2: {
                CP_J3 ilIlJ3;
                block3: {
                    long l = b ^ 0x2865AEC4B7A3L;
                    String string = CP_JH.CP_w();
                    ilIlJ3 = this;
                    if (string != null) break block2;
                    if (!ilIlJ3.CP_g.CP_z(ServerVersion.V_1_13)) break block3;
                    this.CP_f = new ResourceLocation((String)t);
                    if (string == null) break block4;
                }
                ilIlJ3 = this;
            }
            ilIlJ3.CP_T = new CP_jZ((Integer)t);
        }
    }

    public ResourceLocation CP_h() {
        return this.CP_f;
    }

    public void CP_p(ResourceLocation resourceLocation) {
        this.CP_f = resourceLocation;
    }

    public CP_jZ CP_P() {
        return this.CP_T;
    }

    public void CP_l(CP_jZ ilIljZ) {
        this.CP_T = ilIljZ;
    }

    public boolean CP_s() {
        return this.CP_u;
    }

    public void CP_m(boolean bl) {
        this.CP_u = bl;
    }
}

