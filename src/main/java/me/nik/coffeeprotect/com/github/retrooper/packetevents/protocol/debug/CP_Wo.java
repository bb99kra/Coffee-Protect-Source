/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug;

import java.lang.invoke.MethodHandles;
import java.util.List;
import java.util.Set;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.debug.CP_nF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_Wo {
    private final String CP_r;
    private final String CP_J;
    private final int CP_w;
    private final float CP_i;
    private final float CP_D;
    private final String CP_c;
    private final boolean CP_q;
    private final int CP_O;
    private final List<String> CP_B;
    private final List<String> CP_G;
    private final List<String> CP_T;
    private final List<String> CP_l;
    private final Set<CP_An> CP_o;
    private final Set<CP_An> CP_t;
    private static final long a = CP_s.a(-7188995404470769055L, -6889618208757723628L, MethodHandles.lookup().lookupClass()).a(231404088302461L);
    private static transient /* synthetic */ String SmZrHVvGwm = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Wo(String string, String string2, int n, float f, float f2, String string3, boolean bl, int n2, List<String> list, List<String> list2, List<String> list3, List<String> list4, Set<CP_An> set, Set<CP_An> set2) {
        this.CP_r = string;
        this.CP_J = string2;
        this.CP_w = n;
        this.CP_i = f;
        this.CP_D = f2;
        this.CP_c = string3;
        this.CP_q = bl;
        this.CP_O = n2;
        this.CP_B = list;
        this.CP_G = list2;
        this.CP_T = list3;
        this.CP_l = list4;
        this.CP_o = set;
        this.CP_t = set2;
    }

    public static CP_Wo CP_e(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x42C5D8A65D9EL;
        String string = packetWrapper.CP_i();
        String string2 = packetWrapper.CP_i();
        int n = packetWrapper.CP_W();
        PacketWrapper[] packetWrapperArray = CP_nF.CP_b();
        float f = packetWrapper.CP_X();
        float f2 = packetWrapper.CP_X();
        String string3 = packetWrapper.CP_i();
        boolean bl = packetWrapper.CP_K();
        int n2 = packetWrapper.CP_W();
        List<String> list = packetWrapper.CP_l(PacketWrapper::CP_i);
        List<String> list2 = packetWrapper.CP_l(PacketWrapper::CP_i);
        List<String> list3 = packetWrapper.CP_l(PacketWrapper::CP_i);
        List<String> list4 = packetWrapper.CP_l(PacketWrapper::CP_i);
        Set<CP_An> set = packetWrapper.CP_I(PacketWrapper::CP_E);
        Set<CP_An> set2 = packetWrapper.CP_I(PacketWrapper::CP_E);
        CP_Wo ilIlWo = new CP_Wo(string, string2, n, f, f2, string3, bl, n2, list, list2, list3, list4, set, set2);
        if (packetWrapperArray == null) {
            PacketWrapper.CP_e(new int[4]);
        }
        return ilIlWo;
    }

    public static void CP_K(PacketWrapper<?> packetWrapper, CP_Wo ilIlWo) {
        long l = a ^ 0x1BD5B67101E3L;
        packetWrapper.CP_M(ilIlWo.CP_r);
        packetWrapper.CP_M(ilIlWo.CP_J);
        PacketWrapper[] packetWrapperArray = CP_nF.CP_b();
        packetWrapper.CP_a(ilIlWo.CP_w);
        packetWrapper.CP_R(ilIlWo.CP_i);
        packetWrapper.CP_R(ilIlWo.CP_D);
        packetWrapper.CP_M(ilIlWo.CP_c);
        packetWrapper.CP_a(ilIlWo.CP_q);
        packetWrapper.CP_a(ilIlWo.CP_O);
        packetWrapper.CP_Q(ilIlWo.CP_B, PacketWrapper::CP_M);
        packetWrapper.CP_Q(ilIlWo.CP_G, PacketWrapper::CP_M);
        packetWrapper.CP_Q(ilIlWo.CP_T, PacketWrapper::CP_M);
        packetWrapper.CP_Q(ilIlWo.CP_l, PacketWrapper::CP_M);
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        packetWrapper.CP_Z(ilIlWo.CP_o, PacketWrapper::CP_h);
        packetWrapper.CP_Z(ilIlWo.CP_t, PacketWrapper::CP_h);
        if (PacketWrapper.CP_z() == null) {
            CP_nF.CP_F(new PacketWrapper[1]);
        }
    }

    public String CP_C() {
        return this.CP_r;
    }

    public String CP_o() {
        return this.CP_J;
    }

    public int CP_t() {
        return this.CP_w;
    }

    public float CP_u() {
        return this.CP_i;
    }

    public float CP_g() {
        return this.CP_D;
    }

    public String CP_F() {
        return this.CP_c;
    }

    public boolean CP_U() {
        return this.CP_q;
    }

    public int CP_G() {
        return this.CP_O;
    }

    public List<String> CP_U() {
        return this.CP_B;
    }

    public List<String> CP_H() {
        return this.CP_G;
    }

    public List<String> CP_C() {
        return this.CP_T;
    }

    public List<String> CP_n() {
        return this.CP_l;
    }

    public Set<CP_An> CP_M() {
        return this.CP_o;
    }

    public Set<CP_An> CP_N() {
        return this.CP_t;
    }
}

