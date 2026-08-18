/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import java.util.logging.Logger;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_C3;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_rO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_qF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.CP_AR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.CP_qc;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.CP_jv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.CP_WE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_Cp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_ZH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_d8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_nn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public abstract class CP_C8<T> {
    private final CP_qF CP_I;
    private final CP_rO CP_S;
    private final CP_nn CP_A;
    private final CP_Cp CP_G;
    private static final Logger CP_o;
    private static boolean CP_C;
    private static final long a;

    public CP_C8() {
        long l = a ^ 0x26C0D7FF421BL;
        this.CP_I = new CP_qF();
        boolean bl = CP_C8.CP_T();
        this.CP_S = new CP_rO();
        this.CP_A = new CP_nn();
        this.CP_G = new CP_Cp();
        if (bl) {
            PacketWrapper.CP_e(new int[4]);
        }
    }

    public CP_qF CP_g() {
        return this.CP_I;
    }

    public CP_rO CP_V() {
        return this.CP_S;
    }

    public CP_nn CP_f() {
        return this.CP_A;
    }

    public CP_d8 CP_M() {
        return CP_ZH.CP_UnderScore;
    }

    public Logger CP_y() {
        return CP_o;
    }

    public CP_Cp CP_m() {
        return this.CP_G;
    }

    public abstract void CP_A();

    public abstract boolean CP_L();

    public abstract void CP_R();

    public abstract boolean CP_f();

    public abstract void CP_h();

    public abstract boolean CP_s();

    public abstract T CP_j();

    public abstract CP_jv CP_q();

    public abstract CP_AR CP_M();

    public abstract CP_qc CP_q();

    public abstract CP_WE CP_i();

    public abstract CP_C3 CP_h();

    static {
        a = CP_s.a(-8106922675801316264L, 8017710358934157780L, MethodHandles.lookup().lookupClass()).a(77873440358449L);
        CP_o = Logger.getLogger(CP_C8.class.getName());
        CP_C8.CP_k(true);
    }

    public static void CP_k(boolean bl) {
        CP_C = bl;
    }

    public static boolean CP_O() {
        return CP_C;
    }

    public static boolean CP_T() {
        boolean bl = CP_C8.CP_O();
        return !bl;
    }
}

