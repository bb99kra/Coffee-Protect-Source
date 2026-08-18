/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.Location
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.UUID;
import me.nik.coffeeprotect.CP_u7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.Location;

class CP_CU {
    private final UUID CP_p;
    private final double CP_Y;
    private final double CP_h;
    private final double CP_R;
    private static final long a = CP_s.a(426801613118855249L, 2122564356039343365L, MethodHandles.lookup().lookupClass()).a(149366168496475L);
    private static transient /* synthetic */ String KVgLTlgyVf = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_CU(UUID uUID, double d, double d2, double d3) {
        long l = a ^ 0x3D5C178C8EC7L;
        this.CP_p = uUID;
        this.CP_Y = d;
        this.CP_h = d2;
        this.CP_R = d3;
        String string = CP_u7.CP_q();
        if (string != null) {
            PacketWrapper.CP_e(new int[5]);
        }
    }

    public Location CP_P() {
        return new Location(Bukkit.getWorld((UUID)this.CP_p), this.CP_Y, this.CP_h, this.CP_R);
    }
}
