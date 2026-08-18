/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_fR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_jV;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class TypesBuilderData {
    protected final ResourceLocation CP_F;
    protected final int[] CP_r;
    protected final CP_jV CP_e;
    protected final CP_fR CP_UnderScore;
    private static String CP_N;
    private static transient /* synthetic */ String COuciwdpRU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Deprecated
    public TypesBuilderData(ResourceLocation resourceLocation, int[] nArray) {
        this(resourceLocation, nArray, new CP_jV("", true), CP_fR.CP_k);
    }

    @ApiStatus.Internal
    public TypesBuilderData(ResourceLocation resourceLocation, int[] nArray, CP_jV ilIljV, CP_fR ilIlfR) {
        this.CP_F = resourceLocation;
        this.CP_r = nArray;
        this.CP_e = ilIljV;
        this.CP_UnderScore = ilIlfR;
    }

    public int getId(ClientVersion clientVersion) {
        return this.CP_r[this.CP_e.CP_UnderScore(clientVersion)];
    }

    public ResourceLocation CP_UnderScore() {
        return this.CP_F;
    }

    @Deprecated
    public int[] CP_y() {
        return this.CP_r;
    }

    public CP_fR CP_a() {
        return this.CP_UnderScore;
    }

    public static void CP_L(String string) {
        CP_N = string;
    }

    public static String CP_K() {
        return CP_N;
    }

    static {
        if (TypesBuilderData.CP_K() == null) {
            TypesBuilderData.CP_L("y4Lbcb");
        }
    }
}

