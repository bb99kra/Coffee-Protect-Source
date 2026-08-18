/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

class CP_Q3 {
    static final int[] CP_A;
    private static transient /* synthetic */ String GmPPXGnehO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    static {
        block39: {
            block38: {
                var11 = CP_s.a(1852745790982686632L, 3671658069282427989L, MethodHandles.lookup().lookupClass()).a(262923140430917L) ^ 99373712091423L;
                var1_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var11 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var11 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new long[10];
                var4_4 = 0;
                var5_5 = "\u00b0V;\u0001\u00ffm\u00f4\u0012\u00bc\u009a]b\u009e\u00f6\u00ea\u008d,KJ\u00be\u00d3\u00195\u00103F\u00ec9\u00d2\u0017\u00cf}\u001cW\u0098O\u00fe\u00fe\u0018\u001f,\u0002\u00b2\u00f31\u00dc\u0002\u00f5\u00ed\u00fd\t\u00d5xq>\u00e5<\u0082\f7\u0081\u00b1\u00f9\u00cb";
                var6_6 = "\u00b0V;\u0001\u00ffm\u00f4\u0012\u00bc\u009a]b\u009e\u00f6\u00ea\u008d,KJ\u00be\u00d3\u00195\u00103F\u00ec9\u00d2\u0017\u00cf}\u001cW\u0098O\u00fe\u00fe\u0018\u001f,\u0002\u00b2\u00f31\u00dc\u0002\u00f5\u00ed\u00fd\t\u00d5xq>\u00e5<\u0082\f7\u0081\u00b1\u00f9\u00cb".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block38;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = " c\u00e9\u00ac\u00bb\u00d7z\u00f0\u00bc\\%Y\u00d9\u0097_\u00a8";
                    var6_6 = " c\u00e9\u00ac\u00bb\u00d7z\u00f0\u00bc\\%Y\u00d9\u0097_\u00a8".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block38;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block39;
                    break;
                }
            }
            var8_9 = v5;
            var10_10 = var1_1.doFinal(new byte[]{(byte)(var8_9 >>> 56), (byte)(var8_9 >>> 48), (byte)(var8_9 >>> 40), (byte)(var8_9 >>> 32), (byte)(var8_9 >>> 24), (byte)(var8_9 >>> 16), (byte)(var8_9 >>> 8), (byte)var8_9});
            v7 = ((long)var10_10[0] & 255L) << 56 | ((long)var10_10[1] & 255L) << 48 | ((long)var10_10[2] & 255L) << 40 | ((long)var10_10[3] & 255L) << 32 | ((long)var10_10[4] & 255L) << 24 | ((long)var10_10[5] & 255L) << 16 | ((long)var10_10[6] & 255L) << 8 | (long)var10_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl50:
                // 1 sources

                ** continue;
            }
        }
        CP_Q3.CP_A = new int[CP_nN.values().length];
        try {
            CP_Q3.CP_A[CP_nN.CREATIVE_INVENTORY_ACTION.ordinal()] = 1;
        }
        catch (NoSuchFieldError var13_11) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.CLICK_WINDOW.ordinal()] = 2;
        }
        catch (NoSuchFieldError var13_12) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.PLAYER_BLOCK_PLACEMENT.ordinal()] = 3;
        }
        catch (NoSuchFieldError var13_13) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.EDIT_BOOK.ordinal()] = 4;
        }
        catch (NoSuchFieldError var13_14) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.PLAYER_POSITION.ordinal()] = 5;
        }
        catch (NoSuchFieldError var13_15) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.PLAYER_POSITION_AND_ROTATION.ordinal()] = (int)var0_3[3];
        }
        catch (NoSuchFieldError var13_16) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.PLAYER_ROTATION.ordinal()] = (int)var0_3[5];
        }
        catch (NoSuchFieldError var13_17) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.PLAYER_FLYING.ordinal()] = (int)var0_3[0];
        }
        catch (NoSuchFieldError var13_18) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.PONG.ordinal()] = (int)var0_3[1];
        }
        catch (NoSuchFieldError var13_19) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.WINDOW_CONFIRMATION.ordinal()] = (int)var0_3[2];
        }
        catch (NoSuchFieldError var13_20) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.KEEP_ALIVE.ordinal()] = (int)var0_3[6];
        }
        catch (NoSuchFieldError var13_21) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.PLAYER_LOADED.ordinal()] = (int)var0_3[4];
        }
        catch (NoSuchFieldError var13_22) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.CLIENT_TICK_END.ordinal()] = (int)var0_3[7];
        }
        catch (NoSuchFieldError var13_23) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.ANIMATION.ordinal()] = (int)var0_3[8];
        }
        catch (NoSuchFieldError var13_24) {
            // empty catch block
        }
        try {
            CP_Q3.CP_A[CP_nN.PLAYER_INPUT.ordinal()] = (int)var0_3[9];
        }
        catch (NoSuchFieldError var13_25) {
            // empty catch block
        }
    }
}
