/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.netty.buffer.ByteBufHelper;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_qw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Js
extends PacketWrapper<CP_Js> {
    private int CP_e;
    private boolean CP_m;
    private byte[] CP_x;
    private static String[] CP_O;
    private static final long b;
    private static transient /* synthetic */ String udrerqhvWW = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Js(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Js(ClientVersion clientVersion, int n, boolean bl, byte[] byArray) {
        super(CP_qw.LOGIN_PLUGIN_RESPONSE.CP_Y(), clientVersion);
        this.CP_e = n;
        this.CP_m = bl;
        this.CP_x = byArray;
    }

    @Override
    public void CP_e() {
        block6: {
            block4: {
                CP_Js ilIlJs;
                block5: {
                    long l = b ^ 0x7319CDBDBFAEL;
                    this.CP_e = this.CP_f();
                    String[] stringArray = CP_Js.CP_y();
                    this.CP_m = this.CP_K();
                    ilIlJs = this;
                    if (stringArray == null) break block4;
                    if (!ilIlJs.CP_m) break block5;
                    this.CP_x = this.CP_W(ByteBufHelper.CP_H(this.CP_S));
                    if (stringArray != null) break block6;
                }
                ilIlJs = this;
            }
            ilIlJs.CP_x = new byte[0];
        }
        if (PacketWrapper.CP_z() == null) {
            CP_Js.CP_Y(new String[5]);
        }
    }

    @Override
    public void CP_J() {
        block3: {
            CP_Js ilIlJs;
            block2: {
                long l = b ^ 0x6A64B0548106L;
                String[] stringArray = CP_Js.CP_y();
                this.CP_J(this.CP_e);
                String[] stringArray2 = stringArray;
                this.CP_a(this.CP_m);
                ilIlJs = this;
                if (stringArray2 == null) break block2;
                if (!ilIlJs.CP_m) break block3;
                ilIlJs = this;
            }
            ilIlJs.CP_e(this.CP_x);
        }
    }

    public void CP_H(CP_Js ilIlJs) {
        this.CP_e = ilIlJs.CP_e;
        this.CP_m = ilIlJs.CP_m;
        this.CP_x = ilIlJs.CP_x;
    }

    public int CP_J() {
        return this.CP_e;
    }

    public void CP_f(int n) {
        this.CP_e = n;
    }

    public boolean CP_v() {
        return this.CP_m;
    }

    public void CP_L(boolean bl) {
        this.CP_m = bl;
    }

    public byte[] CP_Z() {
        return this.CP_x;
    }

    public void CP_m(byte[] byArray) {
        this.CP_x = byArray;
    }

    public static void CP_Y(String[] stringArray) {
        CP_O = stringArray;
    }

    public static String[] CP_y() {
        return CP_O;
    }

    static {
        b = CP_s.a(443004440179376121L, -2044303354928965335L, MethodHandles.lookup().lookupClass()).a(192324800082473L);
        if (CP_Js.CP_y() == null) {
            CP_Js.CP_Y(new String[2]);
        }
    }
}

