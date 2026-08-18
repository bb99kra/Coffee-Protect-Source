/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;

class CP_ik {
    static final int[] CP_K = new int[CP_nN.values().length];
    private static transient /* synthetic */ String ShdfHGmpzP = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    static {
        try {
            CP_ik.CP_K[CP_nN.CHAT_MESSAGE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_ik.CP_K[CP_nN.CHAT_COMMAND.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
        try {
            CP_ik.CP_K[CP_nN.CHAT_COMMAND_UNSIGNED.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {
            // empty catch block
        }
    }
}
