/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.CP_AR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.CP_Zg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_rG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public abstract class CP_vx
implements CP_AR {
    private static PacketWrapper[] CP_x;
    private static final long b;

    @Override
    public abstract CP_rG CP_T();

    @Override
    public void CP_E(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x42A8CA8EE42CL;
                PacketWrapper[] packetWrapperArray = CP_vx.CP_UnderScore();
                bl = CP_Zg.CP_N(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                CP_Zg.CP_H(object, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void CP_C(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x5ACA29078F75L;
                PacketWrapper[] packetWrapperArray = CP_vx.CP_UnderScore();
                bl = CP_Zg.CP_N(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                CP_Zg.CP_r(object, CP_r7.CP_h, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void CP_M(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x6D5BE6D4FE23L;
                PacketWrapper[] packetWrapperArray = CP_vx.CP_UnderScore();
                bl = CP_Zg.CP_N(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                CP_Zg.CP_b(object, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void CP_D(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x41E12F5745B3L;
                PacketWrapper[] packetWrapperArray = CP_vx.CP_UnderScore();
                bl = CP_Zg.CP_N(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                CP_Zg.CP_i(object, CP_r7.CP_h, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void CP_f(Object object, Object object2) {
        block2: {
            boolean bl;
            block3: {
                long l = b ^ 0x714FDE6B8F76L;
                PacketWrapper[] packetWrapperArray = CP_vx.CP_UnderScore();
                bl = CP_Zg.CP_N(object);
                if (packetWrapperArray == null) break block2;
                if (!bl) break block3;
                CP_Zg.CP_S(object, object2);
                if (packetWrapperArray != null) break block2;
            }
            bl = ((ByteBuf)object2).release();
        }
    }

    @Override
    public void CP_V(Object object, Object object2) {
        block4: {
            boolean bl;
            block5: {
                long l = b ^ 0x1C8E6A403134L;
                PacketWrapper[] packetWrapperArray = CP_vx.CP_UnderScore();
                bl = CP_Zg.CP_N(object);
                if (packetWrapperArray == null) break block4;
                if (!bl) break block5;
                CP_Zg.CP_l(object, CP_r7.CP_h, object2);
                if (packetWrapperArray != null) break block4;
            }
            bl = ((ByteBuf)object2).release();
        }
        if (PacketWrapper.CP_z() == null) {
            CP_vx.CP_i(new PacketWrapper[1]);
        }
    }

    @Override
    public ClientVersion CP_o(Object object) {
        ClientVersion clientVersion;
        long l = b ^ 0x246896C1D6CAL;
        CP_G2 ilIlG2 = this.CP_g(object);
        PacketWrapper[] packetWrapperArray = CP_vx.CP_UnderScore();
        ClientVersion clientVersion2 = clientVersion = ilIlG2.CP_h();
        if (packetWrapperArray != null) {
            if (clientVersion2 == null) {
                clientVersion = ClientVersion.CP_w(CP_r7.CP_b().CP_q().CP_F().CP_N());
            }
            clientVersion2 = clientVersion;
        }
        if (packetWrapperArray == null) {
            PacketWrapper.CP_e(new int[4]);
        }
        return clientVersion2;
    }

    public static void CP_i(PacketWrapper[] packetWrapperArray) {
        CP_x = packetWrapperArray;
    }

    public static PacketWrapper[] CP_UnderScore() {
        return CP_x;
    }

    static {
        b = CP_s.a(3519959932563815245L, -3977095029101564052L, MethodHandles.lookup().lookupClass()).a(194706504837223L);
        if (CP_vx.CP_UnderScore() == null) {
            CP_vx.CP_i(new PacketWrapper[4]);
        }
    }
}

