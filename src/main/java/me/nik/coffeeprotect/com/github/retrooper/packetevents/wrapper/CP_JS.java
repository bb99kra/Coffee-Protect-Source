/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.MethodHandles;
import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_Wz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Pz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_JS
extends PacketWrapper<CP_JS> {
    private NBTCompound CP_h;
    private ResourceLocation CP_u;
    private List<CP_Pz> CP_X;
    private static int[] CP_t;
    private static final long b;
    private static transient /* synthetic */ String PFIrkjMFcQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_JS(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    @ApiStatus.Obsolete
    public CP_JS(NBTCompound nBTCompound) {
        this(nBTCompound, null, null);
    }

    public CP_JS(ResourceLocation resourceLocation, List<CP_Pz> list) {
        this(null, resourceLocation, list);
    }

    @ApiStatus.Obsolete
    public CP_JS(@Nullable NBTCompound nBTCompound, @Nullable ResourceLocation resourceLocation, @Nullable List<CP_Pz> list) {
        super(CP_Wz.REGISTRY_DATA);
        this.CP_h = nBTCompound;
        this.CP_u = resourceLocation;
        this.CP_X = list;
    }

    @Override
    public void CP_e() {
        long l = b ^ 0x384195796B8FL;
        int[] nArray = CP_JS.CP_v();
        CP_JS ilIlJS = this;
        if (nArray != null) {
            if (ilIlJS.CP_g.CP_C(ServerVersion.V_1_20_5)) {
                this.CP_h = this.CP_f();
                return;
            }
            this.CP_u = this.readIdentifier();
            ilIlJS = this;
        }
        ilIlJS.CP_X = this.CP_l(packetWrapper -> {
            ResourceLocation resourceLocation = packetWrapper.readIdentifier();
            NBT nBT = (NBT)packetWrapper.CP_N(PacketWrapper::CP_x);
            return new CP_Pz(resourceLocation, nBT);
        });
    }

    @Override
    public void CP_J() {
        long l = b ^ 0x213CE8905527L;
        int[] nArray = CP_JS.CP_v();
        CP_JS ilIlJS = this;
        if (nArray != null) {
            if (ilIlJS.CP_g.CP_C(ServerVersion.V_1_20_5)) {
                this.CP_c(this.CP_h);
                return;
            }
            this.writeIdentifier(this.CP_u);
            ilIlJS = this;
        }
        ilIlJS.CP_Q(this.CP_X, (packetWrapper, ilIlPz) -> {
            packetWrapper.writeIdentifier(ilIlPz.CP_j());
            packetWrapper.CP_I(ilIlPz.CP_H(), PacketWrapper::CP_O);
        });
    }

    public void CP_V(CP_JS ilIlJS) {
        this.CP_h = ilIlJS.CP_h;
        this.CP_u = ilIlJS.CP_u;
        this.CP_X = ilIlJS.CP_X;
    }

    @ApiStatus.Obsolete
    @Nullable
    public NBTCompound CP_k() {
        return this.CP_h;
    }

    @ApiStatus.Obsolete
    public void CP_l(NBTCompound nBTCompound) {
        this.CP_h = nBTCompound;
    }

    @Nullable
    public ResourceLocation CP_t() {
        return this.CP_u;
    }

    public void CP_a(ResourceLocation resourceLocation) {
        this.CP_u = resourceLocation;
    }

    @Nullable
    public List<CP_Pz> CP_o() {
        return this.CP_X;
    }

    public void CP_h(List<CP_Pz> list) {
        this.CP_X = list;
    }

    public static void CP_s(int[] nArray) {
        CP_t = nArray;
    }

    public static int[] CP_v() {
        return CP_t;
    }

    static {
        b = CP_s.a(5399660297605727242L, -2109212608054320907L, MethodHandles.lookup().lookupClass()).a(184590494363589L);
        if (CP_JS.CP_v() == null) {
            CP_JS.CP_s(new int[3]);
        }
    }
}

