/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTByte;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_fT
implements NbtCodec<Boolean> {
    private static final long a = CP_s.a(6099584361841883653L, -2531167618836073299L, MethodHandles.lookup().lookupClass()).a(2713025458641L);
    private static transient /* synthetic */ String JgfjryAaSg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_fT() {
    }

    public Boolean CP_l(NBT nBT, PacketWrapper<?> packetWrapper) {
        boolean bl;
        block2: {
            block3: {
                long l = a ^ 0x648B312B1546L;
                boolean bl2 = CP_Xv.CP_k();
                try {
                    bl = nBT.CP_S(NBTNumber.class).getAsByte();
                    if (!bl2) break block2;
                    if (!bl) break block3;
                }
                catch (CP_Xv ilIlXv) {
                    throw CP_fT.a(ilIlXv);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public NBT CP_I(PacketWrapper<?> packetWrapper, Boolean bl) {
        return new NBTByte(bl);
    }

    private static CP_Xv a(CP_Xv ilIlXv) {
        return ilIlXv;
    }
}

