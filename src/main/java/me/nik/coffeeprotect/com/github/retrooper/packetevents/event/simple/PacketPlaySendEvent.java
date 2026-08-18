/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.event.simple;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_jj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_oL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.libs.jetbrains.annotations.UnknownNullability;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class PacketPlaySendEvent
extends PacketSendEvent {
    private static transient /* synthetic */ String UWtyWEGGfA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public PacketPlaySendEvent(Object object, CP_G2 ilIlG2, @UnknownNullability Object object2, Object object3, boolean bl) throws CP_jj {
        super(object, ilIlG2, object2, object3, bl);
    }

    protected PacketPlaySendEvent(int n, CP_oL ilIloL, ServerVersion serverVersion, Object object, CP_G2 ilIlG2, @UnknownNullability Object object2, Object object3) throws CP_jj {
        super(n, ilIloL, serverVersion, object, ilIlG2, object2, object3);
    }

    @Override
    public PacketPlaySendEvent clone() {
        Object object = ByteBufHelper.CP_U(this.getByteBuf());
        return new PacketPlaySendEvent(this.getPacketId(), this.getPacketType(), this.getServerVersion(), this.getChannel(), this.getUser(), this.getPlayer(), object);
    }

    @Override
    public CP_AG getPacketType() {
        return (CP_AG)super.getPacketType();
    }
}

