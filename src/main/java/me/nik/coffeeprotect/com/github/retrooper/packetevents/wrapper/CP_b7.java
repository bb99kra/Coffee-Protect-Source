/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_fd;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_b7
extends PacketWrapper<CP_b7> {
    private CP_fd CP_M;
    private static final long b = CP_s.a(-5652759534376067517L, 5788034843586504021L, MethodHandles.lookup().lookupClass()).a(147766684346107L);
    private static transient /* synthetic */ String uMHacIFsTA = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_b7(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_b7(CP_fd ilIlfd) {
        super(CP_nN.SET_DIFFICULTY);
        this.CP_M = ilIlfd;
    }

    @Override
    public void CP_e() {
        block4: {
            block2: {
                CP_b7 ilIlb7;
                block3: {
                    long l = b ^ 0x700D6311E5CAL;
                    String string = CP_JH.CP_w();
                    ilIlb7 = this;
                    if (string != null) break block2;
                    if (!ilIlb7.CP_g.CP_z(ServerVersion.V_1_21_6)) break block3;
                    this.CP_M = this.CP_y(CP_fd.class);
                    if (string == null) break block4;
                }
                ilIlb7 = this;
            }
            ilIlb7.CP_M = CP_fd.CP_B(this.CP_P());
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_b7 ilIlb7;
            block2: {
                block3: {
                    long l = b ^ 0x69701EF8DB62L;
                    String string = CP_JH.CP_w();
                    ilIlb7 = this;
                    if (string != null) break block2;
                    if (!ilIlb7.CP_g.CP_z(ServerVersion.V_1_21_6)) break block3;
                    this.CP_w(this.CP_M);
                    if (string == null) break block4;
                }
                ilIlb7 = this;
            }
            ilIlb7.CP_u(this.CP_M.CP_M());
        }
    }

    public void CP_Z(CP_b7 ilIlb7) {
        this.CP_M = ilIlb7.CP_M;
    }

    public CP_fd CP_t() {
        return this.CP_M;
    }

    public void CP_v(CP_fd ilIlfd) {
        this.CP_M = ilIlfd;
    }
}

