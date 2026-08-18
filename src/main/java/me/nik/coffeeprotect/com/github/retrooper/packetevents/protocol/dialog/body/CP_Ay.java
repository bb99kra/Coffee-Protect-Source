/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body.CP_Lv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body.CP_Tp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body.CP_oj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.dialog.body.CP_qE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_Ay
implements CP_qE {
    private final CP_Tp CP_g;
    private static transient /* synthetic */ String uAVothOdUh = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Ay(CP_Tp ilIlTp) {
        this.CP_g = ilIlTp;
    }

    public static CP_Ay CP_i(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) {
        return new CP_Ay(CP_Tp.CP_a(nBTCompound, packetWrapper));
    }

    public static void CP_A(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, CP_Ay ilIlAy) {
        CP_Tp.CP_F(nBTCompound, packetWrapper, ilIlAy.CP_g);
    }

    @Override
    public CP_oj<?> CP_y() {
        return CP_Lv.CP_R;
    }

    public CP_Tp CP_h() {
        return this.CP_g;
    }
}

