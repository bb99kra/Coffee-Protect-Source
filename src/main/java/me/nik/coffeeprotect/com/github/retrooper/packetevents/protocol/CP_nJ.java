/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Xp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_ZL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_n7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public final class CP_nJ {
    public static final int CP_t = 1;
    public static final int CP_Z;
    public static final int CP_h;
    private Component CP_j;
    private Component CP_X;
    private CP_Cg CP_J;
    private CP_Xp CP_b;
    private boolean CP_E;
    private boolean CP_U;
    @Nullable
    private ResourceLocation CP_a;
    private float CP_r;
    private float CP_K;
    private static final long a;
    private static transient /* synthetic */ String gREQWgiUjE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_nJ(Component component, Component component2, CP_Cg ilIlCg, CP_Xp ilIlXp, @Nullable ResourceLocation resourceLocation, boolean bl, boolean bl2, float f, float f2) {
        this.CP_j = component;
        this.CP_X = component2;
        this.CP_J = ilIlCg;
        this.CP_b = ilIlXp;
        this.CP_E = bl;
        this.CP_U = bl2;
        this.CP_a = resourceLocation;
        this.CP_r = f;
        this.CP_K = f2;
    }

    public static CP_nJ CP_L(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x12B3C728CF91L;
        Component component = packetWrapper.CP_J();
        Component component2 = packetWrapper.CP_J();
        CP_Cg ilIlCg = CP_n7.CP_q(packetWrapper);
        String[] stringArray = CP_ZL.CP_K();
        CP_Xp ilIlXp = packetWrapper.CP_y(CP_Xp.class);
        int n = packetWrapper.CP_W();
        ResourceLocation resourceLocation = (n & 1) != 0 ? ResourceLocation.read(packetWrapper) : null;
        boolean bl = n & 2;
        if (stringArray != null) {
            bl = bl;
        }
        boolean bl2 = bl;
        boolean bl3 = n & 4;
        if (stringArray != null) {
            bl3 = bl3;
        }
        boolean bl4 = bl3;
        float f = packetWrapper.CP_X();
        float f2 = packetWrapper.CP_X();
        CP_nJ ilIlnJ = new CP_nJ(component, component2, ilIlCg, ilIlXp, resourceLocation, bl2, bl4, f, f2);
        if (stringArray == null) {
            PacketWrapper.CP_e(new int[3]);
        }
        return ilIlnJ;
    }

    public static void CP_v(PacketWrapper<?> packetWrapper, CP_nJ ilIlnJ) {
        long l = a ^ 0x6952B61AD837L;
        String[] stringArray = CP_ZL.CP_K();
        packetWrapper.CP_z(ilIlnJ.CP_j);
        packetWrapper.CP_z(ilIlnJ.CP_X);
        String[] stringArray2 = stringArray;
        CP_n7.CP_x(packetWrapper, ilIlnJ.CP_J);
        packetWrapper.CP_w(ilIlnJ.CP_b);
        packetWrapper.CP_a(ilIlnJ.CP_o());
        if (stringArray2 != null) {
            if (ilIlnJ.CP_a != null) {
                ResourceLocation.write(packetWrapper, ilIlnJ.CP_a);
            }
            packetWrapper.CP_R(ilIlnJ.CP_r);
            packetWrapper.CP_R(ilIlnJ.CP_K);
        }
    }

    public int CP_o() {
        long l = a ^ 0x6BE0751D00ADL;
        int n = 0;
        String[] stringArray = CP_ZL.CP_K();
        CP_nJ ilIlnJ = this;
        if (stringArray != null) {
            if (ilIlnJ.CP_a != null) {
                n |= 1;
            }
            ilIlnJ = this;
        }
        int n2 = ilIlnJ.CP_E;
        if (stringArray != null) {
            if (n2 != 0) {
                n |= 2;
            }
            n2 = this.CP_U;
        }
        if (stringArray != null) {
            if (n2 != 0) {
                n |= 4;
            }
            n2 = n;
        }
        return n2;
    }

    public Component CP_s() {
        return this.CP_j;
    }

    public void CP_U(Component component) {
        this.CP_j = component;
    }

    public Component CP_P() {
        return this.CP_X;
    }

    public void CP_A(Component component) {
        this.CP_X = component;
    }

    public CP_Cg CP_A() {
        return this.CP_J;
    }

    public void CP_C(CP_Cg ilIlCg) {
        this.CP_J = ilIlCg;
    }

    public CP_Xp CP_S() {
        return this.CP_b;
    }

    public void CP_F(CP_Xp ilIlXp) {
        this.CP_b = ilIlXp;
    }

    public boolean CP_x() {
        return this.CP_E;
    }

    public void CP_n(boolean bl) {
        this.CP_E = bl;
    }

    public boolean CP_Y() {
        return this.CP_U;
    }

    public void CP_w(boolean bl) {
        this.CP_U = bl;
    }

    @Nullable
    public ResourceLocation CP_a() {
        return this.CP_a;
    }

    public void CP_U(@Nullable ResourceLocation resourceLocation) {
        this.CP_a = resourceLocation;
    }

    public float CP_G() {
        return this.CP_r;
    }

    public void CP_N(float f) {
        this.CP_r = f;
    }

    public float CP_J() {
        return this.CP_K;
    }

    public void CP_w(float f) {
        this.CP_K = f;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(2709233601086049909L, 182412047121032348L, MethodHandles.lookup().lookupClass()).a(180216224662550L);
        long l = a ^ 0x5D823B04C745L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00f1s\u00f6'\u00ac\u00de\u00f6B#\u001c\u00c8\u009a\u00a0R\u0003\u0004";
        int n2 = "\u00f1s\u00f6'\u00ac\u00de\u00f6B#\u001c\u00c8\u009a\u00a0R\u0003\u0004".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        CP_Z = (int)lArray[0];
        CP_h = (int)lArray[1];
    }
}

