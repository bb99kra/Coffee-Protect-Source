/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_dF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_rX;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_P8;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_uP;
import org.bukkit.plugin.Plugin;
import org.bukkit.plugin.java.JavaPlugin;

public class CP_n3
extends JavaPlugin {
    private static String CP_c;
    private static final long a;
    private static transient /* synthetic */ String HqaNrROgLa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public void onLoad() {
        CP_r7.CP_a(CP_uP.CP_E((Plugin)this));
        CP_r7.CP_b().CP_A();
    }

    public void onEnable() {
        long l = a ^ 0x4ACFFB4BD75L;
        String string = CP_n3.CP_Y();
        CP_r7.CP_b().CP_V().CP_N(false).CP_u(true).CP_O(CP_rX.MILLIS).CP_n(true);
        CP_r7.CP_b().CP_R();
        String string2 = string;
        CP_P8 ilIlP8 = new CP_P8(this, CP_dF.HIGH);
        if (string2 != null) {
            PacketWrapper.CP_e(new int[3]);
        }
    }

    public void onDisable() {
        CP_r7.CP_b().CP_h();
    }

    public static void CP_I(String string) {
        CP_c = string;
    }

    public static String CP_Y() {
        return CP_c;
    }

    static {
        a = CP_s.a(1710202073226550836L, 3208825979645805252L, MethodHandles.lookup().lookupClass()).a(166512029219339L);
        if (CP_n3.CP_Y() != null) {
            CP_n3.CP_I("vFVFm");
        }
    }
}

