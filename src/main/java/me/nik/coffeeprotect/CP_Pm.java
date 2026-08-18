/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_Z6;
import me.nik.coffeeprotect.CP_vF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_Pw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_dF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_Pm
extends CP_Pw {
    private static final long a = CP_s.a(-5537763915283580032L, 738479468704196657L, MethodHandles.lookup().lookupClass()).a(215853433674779L);
    private static transient /* synthetic */ String RTMyyGnfHW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Pm() {
        super(CP_dF.NORMAL);
    }

    @Override
    public void CP_P(PacketReceiveEvent packetReceiveEvent) {
        boolean bl;
        block7: {
            block8: {
                block5: {
                    PacketReceiveEvent packetReceiveEvent2;
                    String[] stringArray;
                    block6: {
                        CP_G2 ilIlG2;
                        block4: {
                            long l = a ^ 0x323DBA8CEED4L;
                            stringArray = CP_vF.CP_o();
                            ilIlG2 = packetReceiveEvent.getUser();
                            if (stringArray == null) break block4;
                            if (ilIlG2 == null) break block5;
                            packetReceiveEvent2 = packetReceiveEvent;
                            if (stringArray == null) break block6;
                            ilIlG2 = packetReceiveEvent2.getPlayer();
                        }
                        if (ilIlG2 == null) break block5;
                        packetReceiveEvent2 = packetReceiveEvent;
                    }
                    bl = packetReceiveEvent2.isCancelled();
                    if (stringArray == null) break block7;
                    if (!bl) break block8;
                }
                return;
            }
            bl = CP_Z6.CP_i(CP_Oq.DISABLED_PACKETS_PACKETS.CP_T(), string -> packetReceiveEvent.getPacketType().CP_f().equalsIgnoreCase((String)string));
        }
        if (bl) {
            packetReceiveEvent.setCancelled(true);
        }
    }
}
