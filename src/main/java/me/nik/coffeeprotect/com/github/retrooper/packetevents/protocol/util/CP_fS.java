/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.util.function.Function;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_OU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_fS
implements CP_OU<Z> {
    final Function CP_Q;
    final Function CP_C;
    final CP_OU CP_g;
    private static transient /* synthetic */ String RpPzUkFszO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    CP_fS(CP_OU ilIlOU, Function function, Function function2) {
        this.CP_g = ilIlOU;
        this.CP_Q = function;
        this.CP_C = function2;
    }

    @Override
    public Z CP_j(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper) throws CP_Xv {
        return this.CP_Q.apply(this.CP_g.CP_j(nBTCompound, packetWrapper));
    }

    @Override
    public void CP_r(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, Z z) throws CP_Xv {
        this.CP_g.CP_r(nBTCompound, packetWrapper, this.CP_C.apply(z));
    }
}

