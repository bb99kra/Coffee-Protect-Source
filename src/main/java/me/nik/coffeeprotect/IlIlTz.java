/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.entity.Player;

public class IlIlTz {
    private Player IlIlj;
    private static PacketWrapper[] IlIlY;
    private static transient /* synthetic */ String fgngQrnCba = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlTz(Player player) {
        this.IlIlj = player;
    }

    public Player IlIlu() {
        return this.IlIlj;
    }

    public void IlIlz(Player player) {
        this.IlIlj = player;
    }

    public static void IlIlH(PacketWrapper[] packetWrapperArray) {
        IlIlY = packetWrapperArray;
    }

    public static PacketWrapper[] IlIlt() {
        return IlIlY;
    }

    static {
        if (IlIlTz.IlIlt() != null) {
            IlIlTz.IlIlH(new PacketWrapper[3]);
        }
    }
}

