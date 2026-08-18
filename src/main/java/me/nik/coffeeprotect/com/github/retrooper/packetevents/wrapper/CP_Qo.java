/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.util.List;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Qo {
    private ResourceLocation CP_H;
    private List<Integer> CP_Y;
    private static transient /* synthetic */ String QNgGPbCyYQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Qo(String string, List<Integer> list) {
        this(new ResourceLocation(string), list);
    }

    public CP_Qo(ResourceLocation resourceLocation, List<Integer> list) {
        this.CP_H = resourceLocation;
        this.CP_Y = list;
    }

    public static CP_Qo CP_W(PacketWrapper<?> packetWrapper) {
        ResourceLocation resourceLocation = packetWrapper.readIdentifier();
        List<Integer> list = packetWrapper.CP_l(PacketWrapper::CP_f);
        return new CP_Qo(resourceLocation, list);
    }

    public static void CP_l(PacketWrapper<?> packetWrapper, CP_Qo ilIlQo) {
        packetWrapper.writeIdentifier(ilIlQo.CP_H);
        packetWrapper.CP_Q(ilIlQo.CP_Y, PacketWrapper::CP_J);
    }

    public String CP_C() {
        return this.CP_H.toString();
    }

    public void CP_O(String string) {
        this.CP_H = new ResourceLocation(string);
    }

    public ResourceLocation CP_b() {
        return this.CP_H;
    }

    public void CP_d(ResourceLocation resourceLocation) {
        this.CP_H = resourceLocation;
    }

    public List<Integer> CP_X() {
        return this.CP_Y;
    }

    public void CP_I(List<Integer> list) {
        this.CP_Y = list;
    }
}

