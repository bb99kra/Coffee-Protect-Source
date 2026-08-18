/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_C8;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_rO;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_C1;
import org.bukkit.plugin.Plugin;

public class CP_uP {
    private static CP_C8<Plugin> CP_H;
    private static PacketWrapper[] CP_N;
    private static final long a;
    private static transient /* synthetic */ String OxyFqJmycD = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public static void CP_a() {
        CP_H = null;
    }

    public static CP_C8<Plugin> CP_E(Plugin plugin) {
        long l = a ^ 0x3E76A60F92B9L;
        PacketWrapper[] packetWrapperArray = CP_uP.CP_t();
        CP_C8<Plugin> ilIlC8 = CP_H;
        if (packetWrapperArray == null) {
            if (ilIlC8 == null) {
                CP_H = CP_uP.CP_L(plugin);
            }
            ilIlC8 = CP_H;
        }
        return ilIlC8;
    }

    public static CP_C8<Plugin> CP_B(Plugin plugin, CP_rO ilIlrO) {
        long l = a ^ 0x2A3C03C53BF1L;
        PacketWrapper[] packetWrapperArray = CP_uP.CP_t();
        CP_C8<Plugin> ilIlC8 = CP_H;
        if (packetWrapperArray == null) {
            if (ilIlC8 == null) {
                CP_H = CP_uP.CP_D(plugin, ilIlrO);
            }
            ilIlC8 = CP_H;
        }
        return ilIlC8;
    }

    public static CP_C8<Plugin> CP_L(Plugin plugin) {
        return CP_uP.CP_D(plugin, new CP_rO());
    }

    public static CP_C8<Plugin> CP_D(Plugin plugin, CP_rO ilIlrO) {
        return new CP_C1(ilIlrO, plugin);
    }

    public static void CP_a(PacketWrapper[] packetWrapperArray) {
        CP_N = packetWrapperArray;
    }

    public static PacketWrapper[] CP_t() {
        return CP_N;
    }

    static {
        a = CP_s.a(206711332962496313L, 1831682055115991092L, MethodHandles.lookup().lookupClass()).a(169494859163301L);
        if (CP_uP.CP_t() != null) {
            CP_uP.CP_a(new PacketWrapper[3]);
        }
    }
}

