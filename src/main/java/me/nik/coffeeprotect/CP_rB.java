/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.EntityType
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.entity.EntityType;

class CP_rB {
    static final int[] CP_t;
    private static transient /* synthetic */ String TdXsMSVnCi = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    static {
        block107: {
            block106: {
                var11 = CP_s.a(-5083992981257761551L, 5261634771834917792L, MethodHandles.lookup().lookupClass()).a(59672251009214L) ^ 68054745003025L;
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
                var0_3 = new long[44];
                var4_4 = 0;
                var5_5 = "Z\u00a1\u00ed\u001f\"=\u00aa\u0016\u0096\u0084\u00cf;J?U\u00f7\u00f2\u00c8\u00934\u00fc2\u001f\u00c2\u001aF\u00b5\u00d7pQ\u00e1e4\u00c0\u008a\u00f7\u00d4-\u0005\u00f4^\u0082d\u0006@Y\u00f7,~\u0014b\u00cc\u008e\u00d3c\u00a6\u00d8:\u0019\u00145\u00df\u0002\u00af\u00d3\u0098\u00cc\u00df@\u00ca\u009e'\u00d1\u00f1\\\u00d3 \u00b7\u008f.\u0093\u00db\u00b2\u00157\u00e1\u0006{\u00c5\u00a1\u0006\u00a80\u00db$M\u00ba\u00d2a\u00c9{Q\u00a0o\u00b4\u0007\u0011-\u00b8#\u0094\u0087\u00cdy\u00c1n\u00aa\u00d3\u0090\u00d4\u00c6\u00dd\u00d2\u00bf\u000bsY!\u00af\u00ce\u0087\u0007;\u0098\u0098\u00d6\u00cfC\u00a9f\fTJN%\u00a2\u00c2\u00b9\u00b2\u00c3V\u00c41\u00de\u00c5]\u00860\u009fgv\u00922\u00902.\u00f9\u00ebr\u00c5@\u00f1\u00a4|\u00b0\u00d9\u009f\u00b56I\u00b60Pzr\u00fb)R\u00c6)o\u0096y\u0097\u00dd\u0080\r\u008b\u00f7Mn'\u0082)L4\u008cu\u00c8\u00f0q\u00fc^\u00b3\u00b7\u00cb\u00a9\u0018f\u00cd\u00f4\u00ba\u00b45u\u007fpPN\u00edeu\u000f\u00d7\u00d1\u0007\u0081\u001a\u00f7\u00d7\u009bt\u00d1\u00ce\u00bfc{o\u00e5\u008e\u00b6Q\u009f\u00c6\u00c6^\u0088Ai\u00a64\u00e3\u00e9\u00e7T\u00c0\u0004\u00de\u001dUr\u00e6\u0014\u0001n\u000b0H\u00b64\u00d3\u00d9oe\fZ\u00b2\u00cbl\u001a\u00a9 \u0093e\u00d0\u00df\u00de\u00ddF\u001f\u00ec\u00ac\f\u00cb\u00a5\u00fceP\u00bfg\u00b4\u00f4\f\u00c7\u0003\u00f1#c\u001d\u00e6\u008c(r@\u00aa~\u0080Rr\u00ad\u00f7;\u0080\u00f5\u000f\u00dc";
                var6_6 = "Z\u00a1\u00ed\u001f\"=\u00aa\u0016\u0096\u0084\u00cf;J?U\u00f7\u00f2\u00c8\u00934\u00fc2\u001f\u00c2\u001aF\u00b5\u00d7pQ\u00e1e4\u00c0\u008a\u00f7\u00d4-\u0005\u00f4^\u0082d\u0006@Y\u00f7,~\u0014b\u00cc\u008e\u00d3c\u00a6\u00d8:\u0019\u00145\u00df\u0002\u00af\u00d3\u0098\u00cc\u00df@\u00ca\u009e'\u00d1\u00f1\\\u00d3 \u00b7\u008f.\u0093\u00db\u00b2\u00157\u00e1\u0006{\u00c5\u00a1\u0006\u00a80\u00db$M\u00ba\u00d2a\u00c9{Q\u00a0o\u00b4\u0007\u0011-\u00b8#\u0094\u0087\u00cdy\u00c1n\u00aa\u00d3\u0090\u00d4\u00c6\u00dd\u00d2\u00bf\u000bsY!\u00af\u00ce\u0087\u0007;\u0098\u0098\u00d6\u00cfC\u00a9f\fTJN%\u00a2\u00c2\u00b9\u00b2\u00c3V\u00c41\u00de\u00c5]\u00860\u009fgv\u00922\u00902.\u00f9\u00ebr\u00c5@\u00f1\u00a4|\u00b0\u00d9\u009f\u00b56I\u00b60Pzr\u00fb)R\u00c6)o\u0096y\u0097\u00dd\u0080\r\u008b\u00f7Mn'\u0082)L4\u008cu\u00c8\u00f0q\u00fc^\u00b3\u00b7\u00cb\u00a9\u0018f\u00cd\u00f4\u00ba\u00b45u\u007fpPN\u00edeu\u000f\u00d7\u00d1\u0007\u0081\u001a\u00f7\u00d7\u009bt\u00d1\u00ce\u00bfc{o\u00e5\u008e\u00b6Q\u009f\u00c6\u00c6^\u0088Ai\u00a64\u00e3\u00e9\u00e7T\u00c0\u0004\u00de\u001dUr\u00e6\u0014\u0001n\u000b0H\u00b64\u00d3\u00d9oe\fZ\u00b2\u00cbl\u001a\u00a9 \u0093e\u00d0\u00df\u00de\u00ddF\u001f\u00ec\u00ac\f\u00cb\u00a5\u00fceP\u00bfg\u00b4\u00f4\f\u00c7\u0003\u00f1#c\u001d\u00e6\u008c(r@\u00aa~\u0080Rr\u00ad\u00f7;\u0080\u00f5\u000f\u00dc".length();
                var3_7 = 0;
                while (true) {
                    var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                    v3 = var0_3;
                    v4 = var4_4++;
                    v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                    v6 = -1;
                    break block106;
                    break;
                }
lbl24:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    var5_5 = "\u0088\u00c9\u0014\u00ac}\f\u00b0M\u00b6(\t\u00c5~\u008d\u00ce\u00c4";
                    var6_6 = "\u0088\u00c9\u0014\u00ac}\f\u00b0M\u00b6(\t\u00c5~\u008d\u00ce\u00c4".length();
                    var3_7 = 0;
                    while (true) {
                        var7_8 = var5_5.substring(var3_7, var3_7 += 8).getBytes("ISO-8859-1");
                        v3 = var0_3;
                        v4 = var4_4++;
                        v5 = ((long)var7_8[0] & 255L) << 56 | ((long)var7_8[1] & 255L) << 48 | ((long)var7_8[2] & 255L) << 40 | ((long)var7_8[3] & 255L) << 32 | ((long)var7_8[4] & 255L) << 24 | ((long)var7_8[5] & 255L) << 16 | ((long)var7_8[6] & 255L) << 8 | (long)var7_8[7] & 255L;
                        v6 = 0;
                        break block106;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var3_7 < var6_6) ** continue;
                    break block107;
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
        CP_rB.CP_t = new int[EntityType.values().length];
        try {
            CP_rB.CP_t[EntityType.HORSE.ordinal()] = 1;
        }
        catch (NoSuchFieldError var13_11) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.DONKEY.ordinal()] = 2;
        }
        catch (NoSuchFieldError var13_12) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.CAMEL.ordinal()] = 3;
        }
        catch (NoSuchFieldError var13_13) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.LLAMA.ordinal()] = 4;
        }
        catch (NoSuchFieldError var13_14) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.TRADER_LLAMA.ordinal()] = 5;
        }
        catch (NoSuchFieldError var13_15) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.ALLAY.ordinal()] = (int)var0_3[33];
        }
        catch (NoSuchFieldError var13_16) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.PIGLIN.ordinal()] = (int)var0_3[29];
        }
        catch (NoSuchFieldError var13_17) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.FALLING_BLOCK.ordinal()] = (int)var0_3[31];
        }
        catch (NoSuchFieldError var13_18) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.ENDER_DRAGON.ordinal()] = (int)var0_3[5];
        }
        catch (NoSuchFieldError var13_19) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.MARKER.ordinal()] = (int)var0_3[42];
        }
        catch (NoSuchFieldError var13_20) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.TRIDENT.ordinal()] = (int)var0_3[16];
        }
        catch (NoSuchFieldError var13_21) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.FIREBALL.ordinal()] = (int)var0_3[13];
        }
        catch (NoSuchFieldError var13_22) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.SNOWBALL.ordinal()] = (int)var0_3[34];
        }
        catch (NoSuchFieldError var13_23) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.MINECART.ordinal()] = (int)var0_3[27];
        }
        catch (NoSuchFieldError var13_24) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.PAINTING.ordinal()] = (int)var0_3[6];
        }
        catch (NoSuchFieldError var13_25) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.FIREWORK.ordinal()] = (int)var0_3[28];
        }
        catch (NoSuchFieldError var13_26) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.LEASH_HITCH.ordinal()] = (int)var0_3[26];
        }
        catch (NoSuchFieldError var13_27) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.ITEM_FRAME.ordinal()] = (int)var0_3[4];
        }
        catch (NoSuchFieldError var13_28) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.DROPPED_ITEM.ordinal()] = (int)var0_3[22];
        }
        catch (NoSuchFieldError var13_29) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.GLOW_ITEM_FRAME.ordinal()] = (int)var0_3[24];
        }
        catch (NoSuchFieldError var13_30) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.EXPERIENCE_ORB.ordinal()] = (int)var0_3[10];
        }
        catch (NoSuchFieldError var13_31) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.FISHING_HOOK.ordinal()] = (int)var0_3[3];
        }
        catch (NoSuchFieldError var13_32) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.LLAMA_SPIT.ordinal()] = (int)var0_3[1];
        }
        catch (NoSuchFieldError var13_33) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.LIGHTNING.ordinal()] = (int)var0_3[8];
        }
        catch (NoSuchFieldError var13_34) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.ARMOR_STAND.ordinal()] = (int)var0_3[21];
        }
        catch (NoSuchFieldError var13_35) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.MINECART_HOPPER.ordinal()] = (int)var0_3[12];
        }
        catch (NoSuchFieldError var13_36) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.MINECART_TNT.ordinal()] = (int)var0_3[38];
        }
        catch (NoSuchFieldError var13_37) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.MINECART_COMMAND.ordinal()] = (int)var0_3[9];
        }
        catch (NoSuchFieldError var13_38) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.MINECART_CHEST.ordinal()] = (int)var0_3[15];
        }
        catch (NoSuchFieldError var13_39) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.MINECART_FURNACE.ordinal()] = (int)var0_3[32];
        }
        catch (NoSuchFieldError var13_40) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.EVOKER_FANGS.ordinal()] = (int)var0_3[14];
        }
        catch (NoSuchFieldError var13_41) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.SMALL_FIREBALL.ordinal()] = (int)var0_3[40];
        }
        catch (NoSuchFieldError var13_42) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.SPECTRAL_ARROW.ordinal()] = (int)var0_3[11];
        }
        catch (NoSuchFieldError var13_43) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.AREA_EFFECT_CLOUD.ordinal()] = (int)var0_3[19];
        }
        catch (NoSuchFieldError var13_44) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.THROWN_EXP_BOTTLE.ordinal()] = (int)var0_3[35];
        }
        catch (NoSuchFieldError var13_45) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.SHULKER_BULLET.ordinal()] = (int)var0_3[0];
        }
        catch (NoSuchFieldError var13_46) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.SPLASH_POTION.ordinal()] = (int)var0_3[17];
        }
        catch (NoSuchFieldError var13_47) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.ENDER_CRYSTAL.ordinal()] = (int)var0_3[36];
        }
        catch (NoSuchFieldError var13_48) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.EGG.ordinal()] = (int)var0_3[20];
        }
        catch (NoSuchFieldError var13_49) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.DRAGON_FIREBALL.ordinal()] = (int)var0_3[30];
        }
        catch (NoSuchFieldError var13_50) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.WIND_CHARGE.ordinal()] = (int)var0_3[43];
        }
        catch (NoSuchFieldError var13_51) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.PLAYER.ordinal()] = (int)var0_3[2];
        }
        catch (NoSuchFieldError var13_52) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.INTERACTION.ordinal()] = (int)var0_3[41];
        }
        catch (NoSuchFieldError var13_53) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.WITHER.ordinal()] = (int)var0_3[39];
        }
        catch (NoSuchFieldError var13_54) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.PRIMED_TNT.ordinal()] = (int)var0_3[25];
        }
        catch (NoSuchFieldError var13_55) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.MINECART_MOB_SPAWNER.ordinal()] = (int)var0_3[18];
        }
        catch (NoSuchFieldError var13_56) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.BLOCK_DISPLAY.ordinal()] = (int)var0_3[7];
        }
        catch (NoSuchFieldError var13_57) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.ITEM_DISPLAY.ordinal()] = (int)var0_3[37];
        }
        catch (NoSuchFieldError var13_58) {
            // empty catch block
        }
        try {
            CP_rB.CP_t[EntityType.TEXT_DISPLAY.ordinal()] = (int)var0_3[23];
        }
        catch (NoSuchFieldError var13_59) {
            // empty catch block
        }
    }
}
