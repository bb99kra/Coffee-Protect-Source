/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandlerContext
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import java.lang.invoke.MethodHandles;
import java.net.SocketAddress;
import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.CP_Tj;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_uW
implements CP_Tj {
    private static int[] CP_M;
    private static final long a;
    private static transient /* synthetic */ String imiiwFjsMJ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public SocketAddress CP_p(Object object) {
        return ((Channel)object).remoteAddress();
    }

    @Override
    public SocketAddress CP_s(Object object) {
        return ((Channel)object).localAddress();
    }

    @Override
    public boolean CP_z(Object object) {
        return ((Channel)object).isOpen();
    }

    @Override
    public Object CP_g(Object object) {
        return ((Channel)object).close();
    }

    @Override
    public Object CP_K(Object object, Object object2) {
        return ((Channel)object).write(object2);
    }

    @Override
    public Object CP_B(Object object) {
        return ((Channel)object).flush();
    }

    @Override
    public Object CP_X(Object object, Object object2) {
        return ((Channel)object).writeAndFlush(object2);
    }

    @Override
    public Object CP_u(Object object, Object object2) {
        return ((Channel)object).pipeline().fireChannelRead(object2);
    }

    @Override
    public Object CP_G(Object object, String string, Object object2) {
        return ((Channel)object).pipeline().context(string).write(object2);
    }

    @Override
    public Object CP_T(Object object, String string) {
        return ((Channel)object).pipeline().context(string).flush();
    }

    @Override
    public Object CP_Q(Object object, String string, Object object2) {
        long l = a ^ 0x4334E6132C70L;
        int[] nArray = CP_uW.CP_A();
        ChannelFuture channelFuture = ((Channel)object).pipeline().context(string).writeAndFlush(object2);
        if (PacketWrapper.CP_z() == null) {
            CP_uW.CP_R(new int[1]);
        }
        return channelFuture;
    }

    @Override
    public Object CP_q(Object object, String string, Object object2) {
        long l = a ^ 0x7E201B00B6EL;
        int[] nArray = CP_uW.CP_A();
        ChannelHandlerContext channelHandlerContext = ((Channel)object).pipeline().context(string).fireChannelRead(object2);
        if (nArray == null) {
            PacketWrapper.CP_e(new int[2]);
        }
        return channelHandlerContext;
    }

    @Override
    public List<String> CP_C(Object object) {
        return ((Channel)object).pipeline().names();
    }

    @Override
    public Object CP_W(Object object, String string) {
        return ((Channel)object).pipeline().get(string);
    }

    @Override
    public Object CP_K(Object object, String string) {
        return ((Channel)object).pipeline().context(string);
    }

    @Override
    public Object CP_U(Object object) {
        return ((Channel)object).pipeline();
    }

    @Override
    public void CP_i(Object object, Runnable runnable) {
        ((Channel)object).eventLoop().execute(runnable);
    }

    @Override
    public Object CP_p(Object object) {
        return ((Channel)object).alloc().buffer();
    }

    public static void CP_R(int[] nArray) {
        CP_M = nArray;
    }

    public static int[] CP_A() {
        return CP_M;
    }

    static {
        a = CP_s.a(1290224920289603352L, 657687568644328645L, MethodHandles.lookup().lookupClass()).a(121945407379328L);
        if (CP_uW.CP_A() == null) {
            CP_uW.CP_R(new int[5]);
        }
    }
}

