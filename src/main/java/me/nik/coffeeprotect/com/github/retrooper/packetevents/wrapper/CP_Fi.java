/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_An;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Fi
extends PacketWrapper<CP_Fi> {
    private int CP_L;
    private CP_An CP_A;
    private static final long b = CP_s.a(-5602598538376486318L, 1913397627085454772L, MethodHandles.lookup().lookupClass()).a(219217294271659L);
    private static transient /* synthetic */ String YkUJGcAzcQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fi(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fi(int n, CP_An ilIlAn) {
        super(CP_AG.USE_BED);
        this.CP_L = n;
        this.CP_A = ilIlAn;
    }

    @Override
    public void CP_e() {
        block4: {
            int n;
            block2: {
                block3: {
                    long l = b ^ 0x40A90B2DCC26L;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    n = this.CP_g.CP_z(ServerVersion.V_1_8);
                    if (packetWrapperArray == null) break block2;
                    if (n == 0) break block3;
                    this.CP_L = this.CP_f();
                    this.CP_A = this.CP_E();
                    if (packetWrapperArray != null) break block4;
                }
                this.CP_L = this.CP_W();
                n = this.CP_W();
            }
            int n2 = n;
            short s = this.CP_P();
            int n3 = this.CP_W();
            this.CP_A = new CP_An(n2, s, n3);
        }
    }

    @Override
    public void CP_J() {
        block4: {
            CP_Fi ilIlFi;
            block2: {
                block3: {
                    long l = b ^ 0x59D476C4F28EL;
                    PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                    ilIlFi = this;
                    if (packetWrapperArray == null) break block2;
                    if (!ilIlFi.CP_g.CP_z(ServerVersion.V_1_8)) break block3;
                    this.CP_J(this.CP_L);
                    this.CP_h(this.CP_A);
                    if (packetWrapperArray != null) break block4;
                }
                this.CP_a(this.CP_L);
                this.CP_a(this.CP_A.CP_w());
                this.CP_u(this.CP_A.CP_c());
                ilIlFi = this;
            }
            ilIlFi.CP_a(this.CP_A.CP_k());
        }
    }

    public void CP_l(CP_Fi ilIlFi) {
        ilIlFi.CP_L = this.CP_L;
        ilIlFi.CP_A = this.CP_A;
    }

    public int CP_o() {
        return this.CP_L;
    }

    public void CP_S(int n) {
        this.CP_L = n;
    }

    public CP_An CP_J() {
        return this.CP_A;
    }

    public void CP_z(CP_An ilIlAn) {
        this.CP_A = ilIlAn;
    }
}

