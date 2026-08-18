/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.entity.Player;

public class CP_Tz {
    private Player CP_j;
    private static PacketWrapper[] CP_Y;
    private static transient /* synthetic */ String fgngQrnCba = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Tz(Player player) {
        this.CP_j = player;
    }

    public Player CP_u() {
        return this.CP_j;
    }

    public void CP_z(Player player) {
        this.CP_j = player;
    }

    public static void CP_H(PacketWrapper[] packetWrapperArray) {
        CP_Y = packetWrapperArray;
    }

    public static PacketWrapper[] CP_t() {
        return CP_Y;
    }

    static {
        if (CP_Tz.CP_t() != null) {
            CP_Tz.CP_H(new PacketWrapper[3]);
        }
    }
}
