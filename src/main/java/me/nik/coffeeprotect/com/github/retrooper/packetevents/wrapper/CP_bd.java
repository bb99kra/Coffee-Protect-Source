/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.EnumSet;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_L9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_uG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.kyori.adventure.bossbar.BossBar;

public class CP_bd
extends PacketWrapper<CP_bd> {
    private UUID CP_X;
    private CP_L9 CP_V;
    private Component CP_E;
    private float CP_h;
    private BossBar.Color CP_O;
    private BossBar.Overlay CP_T;
    private EnumSet<BossBar.Flag> CP_B;
    private static final long b = CP_s.a(4285144128724232558L, -4724425570089761456L, MethodHandles.lookup().lookupClass()).a(63362943507895L);
    private static transient /* synthetic */ String vkxqyTestH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_bd(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_bd(UUID uUID, CP_L9 ilIlL9) {
        super(CP_AG.BOSS_BAR);
        this.CP_X = uUID;
        this.CP_V = ilIlL9;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_e() {
        var1_1 = CP_bd.b ^ 47835088065665L;
        this.CP_X = this.CP_v();
        var3_2 = CP_Fh.CP_a();
        this.CP_V = this.CP_y(CP_L9.class);
        v0 = this;
        if (var3_2 == null) ** GOTO lbl14
        switch (v0.CP_V.ordinal()) {
            case 0: {
                this.CP_E = this.CP_J();
                this.CP_h = this.CP_X();
                this.CP_O = this.CP_y(BossBar.Color.class);
                this.CP_T = this.CP_y(BossBar.Overlay.class);
                v0 = this;
lbl14:
                // 2 sources

                v0.CP_B = this.CP_T(this.CP_P());
                if (var3_2 != null) break;
            }
            case 1: {
                if (var3_2 != null) break;
            }
            case 2: {
                this.CP_h = this.CP_X();
                if (var3_2 != null) break;
            }
            case 3: {
                this.CP_E = this.CP_J();
                if (var3_2 != null) break;
            }
            case 4: {
                this.CP_O = this.CP_y(BossBar.Color.class);
                this.CP_T = this.CP_y(BossBar.Overlay.class);
                if (var3_2 != null) break;
            }
            case 5: {
                this.CP_B = this.CP_T(this.CP_P());
            }
        }
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_J() {
        var1_1 = CP_bd.b ^ 56057989147177L;
        this.CP_c(this.CP_X);
        v0 = CP_Fh.CP_a();
        this.CP_w(this.CP_V);
        var3_2 = v0;
        v1 = this;
        if (var3_2 == null) ** GOTO lbl15
        switch (v1.CP_V.ordinal()) {
            case 0: {
                this.CP_z(this.CP_E);
                this.CP_R(this.CP_h);
                this.CP_w(this.CP_O);
                this.CP_w(this.CP_T);
                v1 = this;
lbl15:
                // 2 sources

                v1.CP_u(this.CP_B());
                if (var3_2 != null) break;
            }
            case 1: {
                if (var3_2 != null) break;
            }
            case 2: {
                this.CP_R(this.CP_h);
                if (var3_2 != null) break;
            }
            case 3: {
                this.CP_z(this.CP_E);
                if (var3_2 != null) break;
            }
            case 4: {
                this.CP_w(this.CP_O);
                this.CP_w(this.CP_T);
                if (var3_2 != null) break;
            }
            case 5: {
                this.CP_u(this.CP_B());
            }
        }
    }

    public void CP_m(CP_bd ilIlbd) {
        this.CP_X = ilIlbd.CP_X;
        this.CP_V = ilIlbd.CP_V;
        this.CP_E = ilIlbd.CP_E;
        this.CP_h = ilIlbd.CP_h;
        this.CP_O = ilIlbd.CP_O;
        this.CP_T = ilIlbd.CP_T;
        this.CP_B = ilIlbd.CP_B;
    }

    private EnumSet<BossBar.Flag> CP_T(short s) {
        long l = b ^ 0x4BBC69772BE2L;
        EnumSet<BossBar.Flag> enumSet = EnumSet.noneOf(BossBar.Flag.class);
        PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
        int n = s & 1;
        if (packetWrapperArray != null) {
            if (n != 0) {
                enumSet.add(BossBar.Flag.DARKEN_SCREEN);
            }
            n = s & 2;
        }
        if (packetWrapperArray != null) {
            if (n != 0) {
                enumSet.add(BossBar.Flag.PLAY_BOSS_MUSIC);
            }
            n = s & 4;
        }
        if (packetWrapperArray != null && n != 0) {
            n = enumSet.add(BossBar.Flag.CREATE_WORLD_FOG) ? 1 : 0;
        }
        return enumSet;
    }

    private byte CP_B() {
        byte by;
        block6: {
            long l = b ^ 0x43F193316062L;
            int n = 0;
            PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
            for (BossBar.Flag flag : this.CP_B) {
                int n2;
                block8: {
                    boolean bl;
                    block7: {
                        by = (byte)CP_uG.CP_a[flag.ordinal()];
                        if (packetWrapperArray == null) break block6;
                        if (packetWrapperArray == null) break block7;
                        switch (by) {
                            case 1: {
                                n2 = 1;
                                if (packetWrapperArray != null) break block8;
                            }
                            case 2: {
                                n2 = 2;
                                if (packetWrapperArray != null) break block8;
                            }
                            case 3: {
                                n2 = 4;
                                if (packetWrapperArray != null) break block8;
                            }
                            default: {
                                bl = false;
                            }
                        }
                    }
                    n2 = bl;
                }
                n |= n2;
                if (packetWrapperArray != null) continue;
            }
            by = (byte)n;
        }
        return by;
    }

    public UUID CP_I() {
        return this.CP_X;
    }

    public void CP_A(UUID uUID) {
        this.CP_X = uUID;
    }

    public CP_L9 CP_k() {
        return this.CP_V;
    }

    public void CP_b(CP_L9 ilIlL9) {
        this.CP_V = ilIlL9;
    }

    public Component CP_F() {
        return this.CP_E;
    }

    public void CP_F(Component component) {
        this.CP_E = component;
    }

    public float CP_c() {
        return this.CP_h;
    }

    public void CP_p(float f) {
        this.CP_h = f;
    }

    public BossBar.Color CP_D() {
        return this.CP_O;
    }

    public void CP_P(BossBar.Color color) {
        this.CP_O = color;
    }

    public BossBar.Overlay CP_UnderScore() {
        return this.CP_T;
    }

    public void CP_m(BossBar.Overlay overlay) {
        this.CP_T = overlay;
    }

    public EnumSet<BossBar.Flag> CP_e() {
        return this.CP_B;
    }

    public void CP_z(EnumSet<BossBar.Flag> enumSet) {
        this.CP_B = enumSet;
    }
}

