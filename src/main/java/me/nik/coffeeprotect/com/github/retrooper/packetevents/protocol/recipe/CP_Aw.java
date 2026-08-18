/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_CM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.recipe.CP_GM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

@ApiStatus.Obsolete
public class CP_Aw
implements CP_GM {
    private final CP_CM CP_o;
    private final CP_CM CP_b;
    private final CP_CM CP_P;
    private static transient /* synthetic */ String sDuzksxUmG = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Aw(CP_CM ilIlCM, CP_CM ilIlCM2, CP_CM ilIlCM3) {
        this.CP_o = ilIlCM;
        this.CP_b = ilIlCM2;
        this.CP_P = ilIlCM3;
    }

    public static CP_Aw CP_Y(PacketWrapper<?> packetWrapper) {
        CP_CM ilIlCM = CP_CM.CP_w(packetWrapper);
        CP_CM ilIlCM2 = CP_CM.CP_w(packetWrapper);
        CP_CM ilIlCM3 = CP_CM.CP_w(packetWrapper);
        return new CP_Aw(ilIlCM, ilIlCM2, ilIlCM3);
    }

    public static void CP_i(PacketWrapper<?> packetWrapper, CP_Aw ilIlAw) {
        CP_CM.CP_O(packetWrapper, ilIlAw.CP_o);
        CP_CM.CP_O(packetWrapper, ilIlAw.CP_b);
        CP_CM.CP_O(packetWrapper, ilIlAw.CP_P);
    }

    public CP_CM CP_y() {
        return this.CP_o;
    }

    public CP_CM CP_l() {
        return this.CP_b;
    }

    public CP_CM CP_W() {
        return this.CP_P;
    }
}

