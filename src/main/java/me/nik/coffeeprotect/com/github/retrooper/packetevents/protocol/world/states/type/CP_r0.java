/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.states.type;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.CP_n1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

class CP_r0 {
    static final int[] CP_Y;
    private static transient /* synthetic */ String XqBdyPmhMR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    static {
        block29: {
            block28: {
                var11 = CP_s.a(1754202150227652361L, -1764278182512113872L, MethodHandles.lookup().lookupClass()).a(159521122615465L) ^ 117362031642356L;
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
                var0_3 = new long[5];
                var4_4 = 0;
                var5_5 = "\u0018\u00a4\u0004oC\u0001\u00d5\u0093\u0016\u00e7k.\u0094R*\u00f1\u000f|\u00c7\u00a2\u00a0\u00f3\u009b@";
                var6_6 = "\u0018\u00a4\u0004oC\u0001\u00d5\u0093\u0016\u00e7k.\u0094R*\u00f1\u000f|\u00c7\u00a2\u00a0\u00f3\u009b@".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block28;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "m5)\u008c\u00c6\u0003\u0006\u00c6<\u001aNcTz?\u0011";
                    var6_6 = "m5)\u008c\u00c6\u0003\u0006\u00c6<\u001aNcTz?\u0011".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block28;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block29;
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
        CP_r0.CP_Y = new int[CP_n1.values().length];
        try {
            CP_r0.CP_Y[CP_n1.AIR.ordinal()] = 1;
        }
        catch (NoSuchFieldError var13_11) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.STRUCTURAL_AIR.ordinal()] = 2;
        }
        catch (NoSuchFieldError var13_12) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.REPLACEABLE_PLANT.ordinal()] = 3;
        }
        catch (NoSuchFieldError var13_13) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.REPLACEABLE_FIREPROOF_PLANT.ordinal()] = 4;
        }
        catch (NoSuchFieldError var13_14) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.REPLACEABLE_WATER_PLANT.ordinal()] = 5;
        }
        catch (NoSuchFieldError var13_15) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.WATER.ordinal()] = (int)var0_3[4];
        }
        catch (NoSuchFieldError var13_16) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.BUBBLE_COLUMN.ordinal()] = (int)var0_3[1];
        }
        catch (NoSuchFieldError var13_17) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.LAVA.ordinal()] = (int)var0_3[3];
        }
        catch (NoSuchFieldError var13_18) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.TOP_SNOW.ordinal()] = (int)var0_3[0];
        }
        catch (NoSuchFieldError var13_19) {
            // empty catch block
        }
        try {
            CP_r0.CP_Y[CP_n1.FIRE.ordinal()] = (int)var0_3[2];
        }
        catch (NoSuchFieldError var13_20) {
            // empty catch block
        }
    }
}

