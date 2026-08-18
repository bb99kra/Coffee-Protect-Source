/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_o6;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity.CP_CL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity.CP_yI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_b9
extends PacketWrapper<CP_b9> {
    private CP_An CP_l;
    private CP_CL CP_J;
    private NBTCompound CP_X;
    private static final long b = CP_s.a(3397257594512042431L, -6220528877477410095L, MethodHandles.lookup().lookupClass()).a(114976111644143L);
    private static transient /* synthetic */ String JNpkTCsfFq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b9(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @Deprecated
    public CP_b9(CP_An ilIlAn, CP_o6 ilIlo6, NBTCompound nBTCompound) {
        this(ilIlAn, ilIlo6.CP_x(), nBTCompound);
    }

    @Deprecated
    public CP_b9(CP_An ilIlAn, int n, NBTCompound nBTCompound) {
        this(ilIlAn, CP_yI.CP_v(CP_r7.CP_b().CP_q().CP_F().CP_E(), n), nBTCompound);
    }

    public CP_b9(CP_An ilIlAn, CP_CL ilIlCL, NBTCompound nBTCompound) {
        super(CP_AG.BLOCK_ENTITY_DATA);
        this.CP_l = ilIlAn;
        this.CP_J = ilIlCL;
        this.CP_X = nBTCompound;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_e() {
        var1_1 = CP_b9.b ^ 97497848022069L;
        this.CP_l = this.CP_E();
        var3_2 = CP_Fh.CP_a();
        v0 = this;
        if (var3_2 == null) ** GOTO lbl10
        if (v0.CP_g.CP_z(ServerVersion.V_1_18)) {
            v1 = this.CP_f();
        } else {
            v0 = this;
lbl10:
            // 2 sources

            v1 = v0.CP_P();
        }
        var4_3 = v1;
        this.CP_J = CP_yI.CP_v(this.CP_g.CP_E(), var4_3);
        this.CP_X = this.CP_S();
    }

    @Override
    public void CP_J() {
        block4: {
            CP_b9 ilIlb9;
            int n;
            block2: {
                block3: {
                    long l = b ^ 0x41D101703A9DL;
                    this.CP_h(this.CP_l);
                    n = this.CP_J.CP_H(this.CP_g.CP_E());
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlb9 = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlb9.CP_g.CP_z(ServerVersion.V_1_18)) break block3;
                    this.CP_J(n);
                    if (packetWrapperArray != null) break block4;
                }
                ilIlb9 = this;
            }
            ilIlb9.CP_u(n);
        }
        this.CP_c(this.CP_X);
    }

    public void CP_x(CP_b9 ilIlb9) {
        this.CP_l = ilIlb9.CP_l;
        this.CP_J = ilIlb9.CP_J;
        this.CP_X = ilIlb9.CP_X;
    }

    public CP_An CP_K() {
        return this.CP_l;
    }

    @Override
    public void CP_B(CP_An ilIlAn) {
        this.CP_l = ilIlAn;
    }

    @Deprecated
    public int CP_V() {
        return this.CP_J.CP_H(this.CP_g.CP_E());
    }

    public CP_CL CP_K() {
        return this.CP_J;
    }

    @Deprecated
    public CP_o6 CP_h() {
        return CP_o6.CP_Y(this.CP_V());
    }

    @Deprecated
    public void CP_V(int n) {
        this.CP_I(CP_yI.CP_v(this.CP_g.CP_E(), n));
    }

    public void CP_I(CP_CL ilIlCL) {
        this.CP_J = ilIlCL;
    }

    @Deprecated
    public void CP_X(CP_o6 ilIlo6) {
        this.CP_V(ilIlo6.CP_x());
    }

    @Override
    public NBTCompound CP_x() {
        return this.CP_X;
    }

    public void CP_UnderScore(NBTCompound nBTCompound) {
        this.CP_X = nBTCompound;
    }
}

