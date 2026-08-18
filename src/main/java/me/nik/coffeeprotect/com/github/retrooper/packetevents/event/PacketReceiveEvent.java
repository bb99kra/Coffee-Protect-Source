/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_jj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.CP_Ps;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.ProtocolPacketEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_hC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PacketReceiveEvent
extends ProtocolPacketEvent {
    private static PacketWrapper[] CP_O;
    private static transient /* synthetic */ String iCqiTfoQnE = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    protected PacketReceiveEvent(Object object, CP_G2 ilIlG2, @UnknownNullability Object object2, Object object3, boolean bl) throws CP_jj {
        super(CP_hC.CLIENT, object, ilIlG2, object2, object3, bl);
    }

    protected PacketReceiveEvent(int n, CP_oL ilIloL, ServerVersion serverVersion, Object object, CP_G2 ilIlG2, @UnknownNullability Object object2, Object object3) throws CP_jj {
        super(n, ilIloL, serverVersion, object, ilIlG2, object2, object3);
    }

    @Override
    public void call(CP_Ps ilIlPs) {
        ilIlPs.CP_P(this);
    }

    @Override
    public PacketReceiveEvent clone() {
        Object object = ByteBufHelper.CP_U(this.getByteBuf());
        return new PacketReceiveEvent(this.getPacketId(), this.getPacketType(), this.getServerVersion(), this.getChannel(), this.getUser(), this.getPlayer(), object);
    }

    public static void CP_b(PacketWrapper[] packetWrapperArray) {
        CP_O = packetWrapperArray;
    }

    public static PacketWrapper[] CP_m() {
        return CP_O;
    }

    static {
        if (PacketReceiveEvent.CP_m() != null) {
            PacketReceiveEvent.CP_b(new PacketWrapper[4]);
        }
    }
}

