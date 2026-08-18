/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.Optional;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_Qw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_bn
extends PacketWrapper<CP_bn> {
    private CP_An CP_b;
    private ResourceLocation CP_x;
    @Nullable
    private ResourceLocation CP_c;
    private ResourceLocation CP_L;
    private String CP_q;
    @Nullable
    private CP_Qw CP_Z;
    private int CP_t;
    private int CP_Q;
    private static final long b = CP_s.a(1093754850800421919L, 770969115542174584L, MethodHandles.lookup().lookupClass()).a(90851156633223L);
    private static transient /* synthetic */ String wdANaSkfNj = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bn(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_bn(CP_An ilIlAn, ResourceLocation resourceLocation, ResourceLocation resourceLocation2, String string) {
        this(ilIlAn, resourceLocation, null, resourceLocation2, string, null);
    }

    public CP_bn(CP_An ilIlAn, ResourceLocation resourceLocation, @Nullable ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, String string, @Nullable CP_Qw ilIlQw) {
        this(ilIlAn, resourceLocation, resourceLocation2, resourceLocation3, string, ilIlQw, 0, 0);
    }

    public CP_bn(CP_An ilIlAn, ResourceLocation resourceLocation, @Nullable ResourceLocation resourceLocation2, ResourceLocation resourceLocation3, String string, @Nullable CP_Qw ilIlQw, int n, int n2) {
        super(CP_nN.UPDATE_JIGSAW_BLOCK);
        this.CP_b = ilIlAn;
        this.CP_x = resourceLocation;
        this.CP_c = resourceLocation2;
        this.CP_L = resourceLocation3;
        this.CP_q = string;
        this.CP_Z = ilIlQw;
        this.CP_t = n;
        this.CP_Q = n2;
    }

    @Override
    public void CP_e() {
        block8: {
            block7: {
                CP_bn ilIlbn;
                boolean bl;
                block6: {
                    long l = b ^ 0x7B161788E931L;
                    this.CP_b = this.CP_E();
                    String string = CP_JH.CP_w();
                    this.CP_x = this.readIdentifier();
                    bl = this.CP_C();
                    if (string == null) {
                        if (bl) {
                            this.CP_c = this.readIdentifier();
                        }
                        this.CP_L = this.readIdentifier();
                        this.CP_q = this.CP_i();
                        bl = this.CP_C();
                    }
                    if (string != null) break block6;
                    if (bl) {
                        this.CP_Z = CP_Qw.CP_Y(this.CP_i()).orElse(CP_Qw.ALIGNED);
                    }
                    ilIlbn = this;
                    if (string != null) break block7;
                    bl = ilIlbn.CP_g.CP_z(ServerVersion.V_1_20_3);
                }
                if (!bl) break block8;
                this.CP_t = this.CP_f();
                ilIlbn = this;
            }
            ilIlbn.CP_Q = this.CP_f();
        }
    }

    @Override
    public void CP_J() {
        block8: {
            CP_bn ilIlbn;
            block7: {
                boolean bl;
                block6: {
                    long l = b ^ 0x626B6A61D799L;
                    String string = CP_JH.CP_w();
                    this.CP_h(this.CP_b);
                    this.writeIdentifier(this.CP_x);
                    String string2 = string;
                    bl = this.CP_C();
                    if (string2 == null) {
                        if (bl) {
                            this.writeIdentifier(this.CP_c);
                        }
                        this.writeIdentifier(this.CP_L);
                        this.CP_M(this.CP_q);
                        bl = this.CP_C();
                    }
                    if (string2 != null) break block6;
                    if (bl) {
                        this.CP_M(this.CP_Z.CP_G());
                    }
                    ilIlbn = this;
                    if (string2 != null) break block7;
                    bl = ilIlbn.CP_g.CP_z(ServerVersion.V_1_20_3);
                }
                if (!bl) break block8;
                this.CP_J(this.CP_t);
                ilIlbn = this;
            }
            ilIlbn.CP_J(this.CP_Q);
        }
    }

    public void CP_b(CP_bn ilIlbn) {
        this.CP_b = ilIlbn.CP_b;
        this.CP_x = ilIlbn.CP_x;
        this.CP_c = ilIlbn.CP_c;
        this.CP_L = ilIlbn.CP_L;
        this.CP_q = ilIlbn.CP_q;
        this.CP_Z = ilIlbn.CP_Z;
        this.CP_t = ilIlbn.CP_t;
        this.CP_Q = ilIlbn.CP_Q;
    }

    private boolean CP_C() {
        return this.CP_g.CP_z(ServerVersion.V_1_16);
    }

    public CP_An CP_Z() {
        return this.CP_b;
    }

    public void CP_W(CP_An ilIlAn) {
        this.CP_b = ilIlAn;
    }

    public ResourceLocation CP_i() {
        return this.CP_x;
    }

    public void CP_W(ResourceLocation resourceLocation) {
        this.CP_x = resourceLocation;
    }

    public Optional<ResourceLocation> CP_f() {
        return Optional.ofNullable(this.CP_c);
    }

    public void CP_P(@Nullable ResourceLocation resourceLocation) {
        this.CP_c = resourceLocation;
    }

    public ResourceLocation CP_h() {
        return this.CP_L;
    }

    public void CP_D(ResourceLocation resourceLocation) {
        this.CP_L = resourceLocation;
    }

    public String CP_S() {
        return this.CP_q;
    }

    public void CP_K(String string) {
        this.CP_q = string;
    }

    public Optional<CP_Qw> CP_x() {
        return Optional.ofNullable(this.CP_Z);
    }

    public void CP_F(@Nullable CP_Qw ilIlQw) {
        this.CP_Z = ilIlQw;
    }

    public int CP_j() {
        return this.CP_t;
    }

    public void CP_h(int n) {
        this.CP_t = n;
    }

    public int CP_H() {
        return this.CP_Q;
    }

    public void CP_W(int n) {
        this.CP_Q = n;
    }
}

