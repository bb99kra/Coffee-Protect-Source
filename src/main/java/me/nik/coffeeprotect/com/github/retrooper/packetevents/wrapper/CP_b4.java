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

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_b4
extends PacketWrapper<CP_b4> {
    @ApiStatus.Obsolete
    private ResourceLocation CP_Q;
    private CP_jZ CP_x;
    private static final long b = CP_s.a(3118578946157218759L, 4090294240883742908L, MethodHandles.lookup().lookupClass()).a(106838922104413L);
    private static transient /* synthetic */ String JpFeDxTWaB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b4(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    @ApiStatus.Obsolete
    public CP_b4(ResourceLocation resourceLocation) {
        super(CP_nN.SET_DISPLAYED_RECIPE);
        this.CP_Q = resourceLocation;
    }

    public CP_b4(CP_jZ ilIljZ) {
        super(CP_nN.SET_DISPLAYED_RECIPE);
        this.CP_x = ilIljZ;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_b4 ilIlb4;
                block3: {
                    long l = b ^ 0x593F2A385C07L;
                    String string = CP_JH.CP_w();
                    ilIlb4 = this;
                    if (string != null) break block2;
                    if (!ilIlb4.CP_g.CP_z(ServerVersion.V_1_21_2)) break block3;
                    this.CP_x = CP_jZ.CP_w(this);
                    if (string == null) break block4;
                }
                ilIlb4 = this;
            }
            ilIlb4.CP_Q = this.readIdentifier();
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_b4 ilIlb4;
            block2: {
                block3: {
                    long l = b ^ 0x404257D162AFL;
                    String string = CP_JH.CP_w();
                    ilIlb4 = this;
                    if (string != null) break block2;
                    if (!ilIlb4.CP_g.CP_z(ServerVersion.V_1_21_2)) break block3;
                    CP_jZ.CP_D(this, this.CP_x);
                    if (string == null) break block4;
                }
                ilIlb4 = this;
            }
            ilIlb4.writeIdentifier(this.CP_Q);
        }
    }

    public void CP_M(CP_b4 ilIlb4) {
        this.CP_Q = ilIlb4.CP_Q;
        this.CP_x = ilIlb4.CP_x;
    }

    @ApiStatus.Obsolete
    public ResourceLocation CP_e() {
        return this.CP_Q;
    }

    @ApiStatus.Obsolete
    public void CP_T(ResourceLocation resourceLocation) {
        this.CP_Q = resourceLocation;
    }

    public CP_jZ CP_K() {
        return this.CP_x;
    }

    public void CP_U(CP_jZ ilIljZ) {
        this.CP_x = ilIljZ;
    }
}

