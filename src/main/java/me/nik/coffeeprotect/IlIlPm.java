/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlZ6;
import me.nik.coffeeprotect.IlIlvF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public class IlIlPm
extends IlIlPw {
    private static final long a = IlIls.a((long)-5537763915283580032L, (long)738479468704196657L, MethodHandles.lookup().lookupClass()).a(215853433674779L);
    private static transient /* synthetic */ String RTMyyGnfHW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlPm() {
        super(IlIldF.NORMAL);
    }

    public void IlIlP(PacketReceiveEvent packetReceiveEvent) {
        boolean bl;
        block7: {
            block8: {
                block5: {
                    PacketReceiveEvent packetReceiveEvent2;
                    String[] stringArray;
                    block6: {
                        Object object;
                        block4: {
                            long l = a ^ 0x323DBA8CEED4L;
                            stringArray = IlIlvF.IlIlo();
                            object = packetReceiveEvent.getUser();
                            if (stringArray == null) break block4;
                            if (object == null) break block5;
                            packetReceiveEvent2 = packetReceiveEvent;
                            if (stringArray == null) break block6;
                            object = packetReceiveEvent2.getPlayer();
                        }
                        if (object == null) break block5;
                        packetReceiveEvent2 = packetReceiveEvent;
                    }
                    bl = packetReceiveEvent2.isCancelled();
                    if (stringArray == null) break block7;
                    if (!bl) break block8;
                }
                return;
            }
            bl = IlIlZ6.IlIli(IlIlOq.DISABLED_PACKETS_PACKETS.IlIlT(), string -> packetReceiveEvent.getPacketType().IlIlf().equalsIgnoreCase((String)string));
        }
        if (bl) {
            packetReceiveEvent.setCancelled(true);
        }
    }
}

