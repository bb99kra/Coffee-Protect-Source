/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_oQ;

public class CP_Oa {
    private UUID CP_c;
    private String CP_s;
    private List<CP_oQ> CP_L;
    private static transient /* synthetic */ String tEOUjwOxXM = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Oa(UUID uUID, String string) {
        this.CP_c = uUID;
        this.CP_s = string;
        this.CP_L = new ArrayList<CP_oQ>();
    }

    public CP_Oa(UUID uUID, String string, List<CP_oQ> list) {
        this.CP_c = uUID;
        this.CP_s = string;
        this.CP_L = list;
    }

    public UUID CP_M() {
        return this.CP_c;
    }

    public void CP_K(UUID uUID) {
        this.CP_c = uUID;
    }

    public String CP_E() {
        return this.CP_s;
    }

    public void CP_N(String string) {
        this.CP_s = string;
    }

    public List<CP_oQ> CP_f() {
        return this.CP_L;
    }

    public void CP_UnderScore(List<CP_oQ> list) {
        this.CP_L = list;
    }
}

