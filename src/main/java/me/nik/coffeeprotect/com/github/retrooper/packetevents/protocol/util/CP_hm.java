/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util;

import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.NbtCodecs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

class CP_hm
implements NbtCodec<List<T>> {
    final NbtCodec CP_n;
    private static final long a = CP_s.a(-598540141868900757L, 7016368061973634565L, MethodHandles.lookup().lookupClass()).a(112730861804421L);
    private static transient /* synthetic */ String SKzpOWsIyX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_hm(NbtCodec nbtCodec) {
        this.CP_n = nbtCodec;
    }

    public List<T> CP_k(NBT nBT, PacketWrapper<?> packetWrapper) throws CP_Xv {
        long l = a ^ 0x1EE42FBCF40L;
        boolean bl = CP_Xv.CP_H();
        try {
            ArrayList arrayList;
            block8: {
                List list = (List)NbtCodecs.CP_h.CP_A(nBT, packetWrapper);
                ArrayList arrayList2 = new ArrayList(list.size());
                for (NBT nBT2 : list) {
                    try {
                        arrayList = arrayList2;
                        if (!bl) {
                            arrayList.add(this.CP_n.CP_A(nBT2, packetWrapper));
                            if (!bl) continue;
                            break;
                        }
                        break block8;
                    }
                    catch (CP_Xv ilIlXv) {
                        throw CP_hm.a(ilIlXv);
                    }
                }
                arrayList = arrayList2;
            }
            return arrayList;
        }
        catch (CP_Xv ilIlXv) {
            try {
                Object t = this.CP_n.CP_A(nBT, packetWrapper);
                return Collections.singletonList(t);
            }
            catch (CP_Xv ilIlXv2) {
                ilIlXv.addSuppressed(ilIlXv2);
                throw ilIlXv;
            }
        }
    }

    public NBT CP_s(PacketWrapper<?> packetWrapper, List<T> list) {
        long l = a ^ 0x459F1F63EC9BL;
        ArrayList<NBT> arrayList = new ArrayList<NBT>(list.size());
        boolean bl = CP_Xv.CP_H();
        for (Object t : list) {
            arrayList.add(this.CP_n.CP_UnderScore(packetWrapper, t));
            if (!bl) continue;
        }
        return NbtCodecs.CP_h.CP_UnderScore(packetWrapper, arrayList);
    }

    private static CP_Xv a(CP_Xv ilIlXv) {
        return ilIlXv;
    }
}

