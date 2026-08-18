/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event.simple;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_jj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PacketPlayReceiveEvent
extends PacketReceiveEvent {
    private static String[] CP_p;
    private static final long b;
    private static transient /* synthetic */ String FDuNEpadth = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public PacketPlayReceiveEvent(Object object, CP_G2 ilIlG2, @UnknownNullability Object object2, Object object3, boolean bl) throws CP_jj {
        super(object, ilIlG2, object2, object3, bl);
    }

    protected PacketPlayReceiveEvent(int n, CP_oL ilIloL, ServerVersion serverVersion, Object object, CP_G2 ilIlG2, @UnknownNullability Object object2, Object object3) throws CP_jj {
        super(n, ilIloL, serverVersion, object, ilIlG2, object2, object3);
    }

    @Override
    public PacketPlayReceiveEvent clone() {
        PacketPlayReceiveEvent packetPlayReceiveEvent;
        long l = b ^ 0x60E638CAB8C5L;
        Object object = ByteBufHelper.CP_U(this.getByteBuf());
        String[] stringArray = PacketPlayReceiveEvent.CP_l();
        try {
            packetPlayReceiveEvent = new PacketPlayReceiveEvent(this.getPacketId(), this.getPacketType(), this.getServerVersion(), this.getChannel(), this.getUser(), this.getPlayer(), object);
            if (PacketWrapper.CP_z() == null) {
                PacketPlayReceiveEvent.CP_s(new String[2]);
            }
        }
        catch (CP_jj ilIljj) {
            throw PacketPlayReceiveEvent.a(ilIljj);
        }
        return packetPlayReceiveEvent;
    }

    @Override
    public CP_nN getPacketType() {
        return (CP_nN)super.getPacketType();
    }

    public static void CP_s(String[] stringArray) {
        CP_p = stringArray;
    }

    public static String[] CP_l() {
        return CP_p;
    }

    static {
        b = CP_s.a(-8805551161873620179L, 1120204273047690804L, MethodHandles.lookup().lookupClass()).a(46482139965241L);
        if (PacketPlayReceiveEvent.CP_l() == null) {
            PacketPlayReceiveEvent.CP_s(new String[2]);
        }
    }

    private static CP_jj a(CP_jj ilIljj) {
        return ilIljj;
    }
}

