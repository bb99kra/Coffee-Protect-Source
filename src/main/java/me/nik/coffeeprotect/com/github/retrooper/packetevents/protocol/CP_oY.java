/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public final class CP_oY
extends Enum<CP_oY> {
    public static final /* enum */ CP_oY TELEPORT_CONFIRM;
    public static final /* enum */ CP_oY TAB_COMPLETE;
    public static final /* enum */ CP_oY CHAT_MESSAGE;
    public static final /* enum */ CP_oY CLIENT_STATUS;
    public static final /* enum */ CP_oY CLIENT_SETTINGS;
    public static final /* enum */ CP_oY WINDOW_CONFIRMATION;
    public static final /* enum */ CP_oY CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_oY CLICK_WINDOW;
    public static final /* enum */ CP_oY CLOSE_WINDOW;
    public static final /* enum */ CP_oY PLUGIN_MESSAGE;
    public static final /* enum */ CP_oY INTERACT_ENTITY;
    public static final /* enum */ CP_oY KEEP_ALIVE;
    public static final /* enum */ CP_oY PLAYER_POSITION;
    public static final /* enum */ CP_oY PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_oY PLAYER_ROTATION;
    public static final /* enum */ CP_oY PLAYER_FLYING;
    public static final /* enum */ CP_oY VEHICLE_MOVE;
    public static final /* enum */ CP_oY STEER_BOAT;
    public static final /* enum */ CP_oY PLAYER_ABILITIES;
    public static final /* enum */ CP_oY PLAYER_DIGGING;
    public static final /* enum */ CP_oY ENTITY_ACTION;
    public static final /* enum */ CP_oY STEER_VEHICLE;
    public static final /* enum */ CP_oY RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_oY HELD_ITEM_CHANGE;
    public static final /* enum */ CP_oY CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_oY UPDATE_SIGN;
    public static final /* enum */ CP_oY ANIMATION;
    public static final /* enum */ CP_oY SPECTATE;
    public static final /* enum */ CP_oY PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_oY USE_ITEM;
    private static final /* synthetic */ CP_oY[] CP_W;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_oY[] values() {
        return (CP_oY[])CP_W.clone();
    }

    public static CP_oY valueOf(String string) {
        return Enum.valueOf(CP_oY.class, string);
    }

    private static /* synthetic */ CP_oY[] CP_O() {
        long l = a ^ 0x4C0A6E3E949L;
        CP_oY[] ilIloYArray = new CP_oY[CP_oY.a("y", (int)27537, (long)(0x2846D9EA93CD493EL ^ l))];
        ilIloYArray[0] = TELEPORT_CONFIRM;
        ilIloYArray[1] = TAB_COMPLETE;
        ilIloYArray[2] = CHAT_MESSAGE;
        ilIloYArray[3] = CLIENT_STATUS;
        ilIloYArray[4] = CLIENT_SETTINGS;
        ilIloYArray[5] = WINDOW_CONFIRMATION;
        ilIloYArray[CP_oY.a("y", (int)2223, (long)(0x9FA9E373AC32A3CL ^ l))] = CLICK_WINDOW_BUTTON;
        ilIloYArray[CP_oY.a("y", (int)11583, (long)(0x4E9FA259CD438FB7L ^ l))] = CLICK_WINDOW;
        ilIloYArray[CP_oY.a("y", (int)29752, (long)(0x46758A74264456A3L ^ l))] = CLOSE_WINDOW;
        ilIloYArray[CP_oY.a("y", (int)19859, (long)(0x18ED3F152826F03L ^ l))] = PLUGIN_MESSAGE;
        ilIloYArray[CP_oY.a("y", (int)14299, (long)(0x77866B78A08A9577L ^ l))] = INTERACT_ENTITY;
        ilIloYArray[CP_oY.a("y", (int)16550, (long)(0x4EFEF58E09F2E226L ^ l))] = KEEP_ALIVE;
        ilIloYArray[CP_oY.a("y", (int)17274, (long)(0x2C59C0944B5BE1F1L ^ l))] = PLAYER_POSITION;
        ilIloYArray[CP_oY.a("y", (int)9291, (long)(0x7C5CCAE816AF06CEL ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIloYArray[CP_oY.a("y", (int)457, (long)(0xBFAE9456046A363L ^ l))] = PLAYER_ROTATION;
        ilIloYArray[CP_oY.a("y", (int)18417, (long)(0x5CBFE2841639E576L ^ l))] = PLAYER_FLYING;
        ilIloYArray[CP_oY.a("y", (int)30814, (long)(0x39AE846FB48F5AC2L ^ l))] = VEHICLE_MOVE;
        ilIloYArray[CP_oY.a("y", (int)22918, (long)(0x650D0B314C20FB05L ^ l))] = STEER_BOAT;
        ilIloYArray[CP_oY.a("y", (int)20785, (long)(0x6BB4F6CDD802F3A6L ^ l))] = PLAYER_ABILITIES;
        ilIloYArray[CP_oY.a("y", (int)22057, (long)(0x298309D9B20DF4A6L ^ l))] = PLAYER_DIGGING;
        ilIloYArray[CP_oY.a("y", (int)3503, (long)(0x141B6C9B7887AF01L ^ l))] = ENTITY_ACTION;
        ilIloYArray[CP_oY.a("y", (int)9298, (long)(0x1E80C9E0A22B06DFL ^ l))] = STEER_VEHICLE;
        ilIloYArray[CP_oY.a("y", (int)12682, (long)(0x5DD0048E4D2E1304L ^ l))] = RESOURCE_PACK_STATUS;
        ilIloYArray[CP_oY.a("y", (int)6616, (long)(0x58C41DF25EA2BB49L ^ l))] = HELD_ITEM_CHANGE;
        ilIloYArray[CP_oY.a("y", (int)9217, (long)(0x32FCB060D5CD06A5L ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIloYArray[CP_oY.a("y", (int)25563, (long)(0x72C37021FB264159L ^ l))] = UPDATE_SIGN;
        ilIloYArray[CP_oY.a("y", (int)21418, (long)(0x7E2720E615D6712EL ^ l))] = ANIMATION;
        ilIloYArray[CP_oY.a("y", (int)32065, (long)(0x1D74BB6662695FD8L ^ l))] = SPECTATE;
        ilIloYArray[CP_oY.a("y", (int)14815, (long)(0x426FC86CF5BC9B47L ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIloYArray[CP_oY.a("y", (int)8908, (long)(0x5BAF52B30D5A005AL ^ l))] = USE_ITEM;
        return ilIloYArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_oY.a = CP_s.a(-8616185224788803364L, -7058933686749666224L, MethodHandles.lookup().lookupClass()).a(262957483589510L);
                        var20 = CP_oY.a ^ 130115626370648L;
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[30];
                        var17_4 = 0;
                        var16_5 = "Z\u00fa/\u00a6\u00c8\u0090|\u00115\u00bc\u00a2\u009f\u000eq\u00e4\u00c3\u0010\u0090\u0092\u00b0\fm\u00b6\u0097\u0011\u00ec\f\u0088\u00bdV\u00dd\u00f8\u00c0 \u00e9\u00dd\u00e4\u00f1NJ\u00d8s\u00e4p\u00fbD\u00a3\u00df\u00a9\u00c1\u0084\u0095Kc\u00e8\u008a\u0083\u00ec\u00cb\u00d5\u00a3\u00a4\u00a1K\u00a0\u00f3\u0018[\u000b\u00cb\u00e3z\u0013\u00ae?'W\u00e3\u0006\u00af\u00ab\u00c0\u00ad\u00a3 \u001b\u00d5\u00ff~\u00b6\"\u0010]\u00b16\u00eb\u0080\u00d1>\u001a\u001f\u00dd\u0017\u00a2\u00balK\u0001\u0010sm.\u00a5S\u009bty\u0013F\u0015\u0086\u00ef_\u00ee\u0091\u0010\u00d7\\i2\u00beF7\u001f\u00a7\u009f!\u00a2\u0091\u001c\u00ac\u001a\u0010\u00e8\u0005\u00af\n\u00b0\u00f3\u008fea,\u0004\u00d3P\u008a]<\u0018R\u00f7\u0018\u00e6\u00fc\u00d45%\u009b\u00a3\u00f7\u001a\u00d8\u00ed\u00f1\u0004\u00c3J~\u00e1\u00c7\u00a8\u00d6h\u0010\u00a3\u00d5\u00b4\ty?&\u009f\u007f\u0092$\u00b5\u00f4\b\u001c,\u0010\u00e9\u00ea\u0005#\u009e\u008cc\u0012\u0097\u00d6\u001c&)3\u0004\u00b0\u0010\u00fc\u00ea\u0016T\u0013\u0087/\u00c1s\u00f43\u0004\u0004\u00c5\u00b6&\u0010[K.\u00c8x\u009ai&\u00d3\u008a\u008dr'\u00ea\u00ba\u00d2\u0010\u00ca0\u00ffQV\u008d\u00f4\u00c8\u00cc\u001f\u00bc\u0086>\u00cb\u007fI\u0018P\u00cd\u00f5\u008b\u00ccC\u00ef2\u00bf\u00fd\u00b9\u001d\u00c3\u00ac\u00b2\n\u0002S\u00ec\u0081p\u0098oY\u0010\\\u0007X)}\u0090\u0080\u00d6\u00de\u00a19\u0017\u00b6\u008a\u008c\u00a2 W\u00de\u00eeF\u00ce|r\\\u0004\u00c1\u0016u\u008c\u0014\u00ef\u0004\u00f2\u00bd\u00db\u00ee\u0004\u008e'\n\u00a6(0l\u00e5\u0000\u0016\u0091\u0010T+\u0006V\u009d\u00b6$\u00e4\u001e\u00d3\u0086@\u00d7\u0006\u00ad\u00fc\u0010-\u0015\u00c4\u00f9\u00ac\u00cc\u009d\u00dc5\u00ce\u00b9@\u00ab\u008fs\u008c\u0010R\u00f7\u0018\u00e6\u00fc\u00d45%\u00b3 \u00b1\u0007?9\u00d46\u0010\u008a\u00edDS2\u00ec\u00f6\u00ee\u0097\u00d0\u00b8\u00d4\u009c\u00b0\u00ee\u00e4\u0018:W\u00b85\u00e3\u00c4\u00c6\u0004\f\u008bU\u00a3\u00df\u00ff\u001a\\\u00cfY}\u001a\u0003\u00d0\u00d6\u0099\u0010-\u0015\u00c4\u00f9\u00ac\u00cc\u009d\u00dc\u0010S\u0090C\u0010\u001f}\u0011\u0010\u00ec\u00d6\u00cd\u00ed\u000eI\u00c7O\u00fd\u0013\u00ba\u00cd\u00fe{\u009aQ\u0010!\u008a\u009e \u00ccY&a\u0089\u001b\u0083\u009c\u00e9\u00d0\u00a9*\u0010Ew \u0001\u00d6\u00d5\u00b4z\u00e3-\u00df\\\u008eC\u0018'\u0018\u00dd\u0081\u0089p\u00c2\u00ee\u008d\u0012\u00ff\u0010xMr\r\u00c8\u0094\u00fe;\u00c1*\u0001\u00a7\u00acm\u0018M^8\u00ddQ\u0018Cm\u00e0\u00be=\u00c7\u00bb\u001b\u00c5\u000f\u00a3\u00a3\u00df\u00f6\u0002\u00f9\u009f\u00f4";
                        var18_6 = "Z\u00fa/\u00a6\u00c8\u0090|\u00115\u00bc\u00a2\u009f\u000eq\u00e4\u00c3\u0010\u0090\u0092\u00b0\fm\u00b6\u0097\u0011\u00ec\f\u0088\u00bdV\u00dd\u00f8\u00c0 \u00e9\u00dd\u00e4\u00f1NJ\u00d8s\u00e4p\u00fbD\u00a3\u00df\u00a9\u00c1\u0084\u0095Kc\u00e8\u008a\u0083\u00ec\u00cb\u00d5\u00a3\u00a4\u00a1K\u00a0\u00f3\u0018[\u000b\u00cb\u00e3z\u0013\u00ae?'W\u00e3\u0006\u00af\u00ab\u00c0\u00ad\u00a3 \u001b\u00d5\u00ff~\u00b6\"\u0010]\u00b16\u00eb\u0080\u00d1>\u001a\u001f\u00dd\u0017\u00a2\u00balK\u0001\u0010sm.\u00a5S\u009bty\u0013F\u0015\u0086\u00ef_\u00ee\u0091\u0010\u00d7\\i2\u00beF7\u001f\u00a7\u009f!\u00a2\u0091\u001c\u00ac\u001a\u0010\u00e8\u0005\u00af\n\u00b0\u00f3\u008fea,\u0004\u00d3P\u008a]<\u0018R\u00f7\u0018\u00e6\u00fc\u00d45%\u009b\u00a3\u00f7\u001a\u00d8\u00ed\u00f1\u0004\u00c3J~\u00e1\u00c7\u00a8\u00d6h\u0010\u00a3\u00d5\u00b4\ty?&\u009f\u007f\u0092$\u00b5\u00f4\b\u001c,\u0010\u00e9\u00ea\u0005#\u009e\u008cc\u0012\u0097\u00d6\u001c&)3\u0004\u00b0\u0010\u00fc\u00ea\u0016T\u0013\u0087/\u00c1s\u00f43\u0004\u0004\u00c5\u00b6&\u0010[K.\u00c8x\u009ai&\u00d3\u008a\u008dr'\u00ea\u00ba\u00d2\u0010\u00ca0\u00ffQV\u008d\u00f4\u00c8\u00cc\u001f\u00bc\u0086>\u00cb\u007fI\u0018P\u00cd\u00f5\u008b\u00ccC\u00ef2\u00bf\u00fd\u00b9\u001d\u00c3\u00ac\u00b2\n\u0002S\u00ec\u0081p\u0098oY\u0010\\\u0007X)}\u0090\u0080\u00d6\u00de\u00a19\u0017\u00b6\u008a\u008c\u00a2 W\u00de\u00eeF\u00ce|r\\\u0004\u00c1\u0016u\u008c\u0014\u00ef\u0004\u00f2\u00bd\u00db\u00ee\u0004\u008e'\n\u00a6(0l\u00e5\u0000\u0016\u0091\u0010T+\u0006V\u009d\u00b6$\u00e4\u001e\u00d3\u0086@\u00d7\u0006\u00ad\u00fc\u0010-\u0015\u00c4\u00f9\u00ac\u00cc\u009d\u00dc5\u00ce\u00b9@\u00ab\u008fs\u008c\u0010R\u00f7\u0018\u00e6\u00fc\u00d45%\u00b3 \u00b1\u0007?9\u00d46\u0010\u008a\u00edDS2\u00ec\u00f6\u00ee\u0097\u00d0\u00b8\u00d4\u009c\u00b0\u00ee\u00e4\u0018:W\u00b85\u00e3\u00c4\u00c6\u0004\f\u008bU\u00a3\u00df\u00ff\u001a\\\u00cfY}\u001a\u0003\u00d0\u00d6\u0099\u0010-\u0015\u00c4\u00f9\u00ac\u00cc\u009d\u00dc\u0010S\u0090C\u0010\u001f}\u0011\u0010\u00ec\u00d6\u00cd\u00ed\u000eI\u00c7O\u00fd\u0013\u00ba\u00cd\u00fe{\u009aQ\u0010!\u008a\u009e \u00ccY&a\u0089\u001b\u0083\u009c\u00e9\u00d0\u00a9*\u0010Ew \u0001\u00d6\u00d5\u00b4z\u00e3-\u00df\\\u008eC\u0018'\u0018\u00dd\u0081\u0089p\u00c2\u00ee\u008d\u0012\u00ff\u0010xMr\r\u00c8\u0094\u00fe;\u00c1*\u0001\u00a7\u00acm\u0018M^8\u00ddQ\u0018Cm\u00e0\u00be=\u00c7\u00bb\u001b\u00c5\u000f\u00a3\u00a3\u00df\u00f6\u0002\u00f9\u009f\u00f4".length();
                        var15_7 = 16;
                        var14_8 = -1;
lbl19:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl24:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = CP_oY.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "W\u00de\u00eeF\u00ce|r\\\u00ee2\u0081\u00d0?\u009ah\u0013\u0018\u00ceS&~\u00d4N\u0096\u0012\u0097\u00b4\u00ba$~\u00b7B\u00e1\u00da\u00867\u00d5C\u00a3Tt";
                            var18_6 = "W\u00de\u00eeF\u00ce|r\\\u00ee2\u0081\u00d0?\u009ah\u0013\u0018\u00ceS&~\u00d4N\u0096\u0012\u0097\u00b4\u00ba$~\u00b7B\u00e1\u00da\u00867\u00d5C\u00a3Tt".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl33:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl38:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = CP_oY.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl50:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_oY.d = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[49];
                var3_13 = 0;
                var4_14 = "g\u00c8\u0013\u00ba\u0080#i\u00eb\u0013\u00ee\u0080\u00ff]&\u00ca\u00f3\u0097\u0099\u0087\u0003U\u00f2E\u00ecl\u00f4>iT\u0086\u008cJ\u0094I\u0093\u00b0\u00c5\u0014\u0006<\u00a61\u00d3\u00c5\u00bc\u0012\u0086_\u0098S\u00f2oO\u0093\u00a9\u00c3\f\u0082+t1H`Z\u009dXy\u00fe\u00a1\u00c4\u00e8/\u00ecX:\u0090Q\u00f5\u0097\u00be\u00bf\u0097O\u0099\u00bc,yeLQb\u0005\u0012\u000by\u00fa\u00d4=\u009d&\u00b3\u008c\u00cc\u00ad\u00f3\u00fe\u00de\u00d0L\u0090/\u00e4x\u00a8\r\u009d\u0001\u00f7\u0081\u0014\u00a2\u00a9\u008e\u00d39\b\u00dc7\u00e1\u00ab\u0095n\u0003\u00986\u00f6\u0090B\u0007\u00ca\bR\u00f5\u0083\u0080\u00867\u001d'\u0018n\u00af\u009bh\u001b\u00e5\u009f&\u00deY\u00b3\u0086\u00e8Z\u00c9\u00d0)\u007f3\u0004\u00d0W\u00c3\u00f8G\u00f6$\u001f;\u00c4\u00f4x8\u00e4>\u001e\u0018\u00db{\u001c8{\u00f2Dj\u00e7\u009f\u00fd\u00f7x\u0002\b%\u001d\u001eA6[\u0092\u00fe\u009aLQ\u00f6?\u0096a\u000ba\u00e1\u00bd\u00cc\u000eQh\u00f4\u00b5S=\u00ae\u009e(\u001eb\u00f5M<8\u0002Z\u001f\u0004>,\u008aV>\r@\u00aeuj\u00b9\u00bf0\u000b\u0090+\u0090\u0019\u00ad/\u00b1\u0088\u00e3\u008c\u00a0\u00d1\u00a0\u00e2\n\u00cd\u00e3\u00df,\t\u00e5K\u00e2\u0002\u00d9\u0094\u001400\u00f8\u00e55a\u00cf\u00bcT\u00e3\u00c2\u0004\u0094\u00af\u0091\u009d\u00c1WO+\u00bch\u00dc\u0019\u0004\u0017\u0096\u00d7]\u00fd\r\u00b0\u008d/\u00b3\u00e8\u00a4\u008bN\u00a6\u00bdG\u00da]xu\u00e7\u00a3Y|\u00d3\u0007\u00ad\u00cf\u00cb3\u00d5\u00a2W\u00e7&\u00f8\u009f\u00af>\u007f\u00b5\u0013k\u00d5\u00ac\u00e1\u0018\nT\u001a\u00ec\u008b\u00fe\u00e3P\u008f\u00e9\nJA(\u00fa![\\\u001f\u00df";
                var5_15 = "g\u00c8\u0013\u00ba\u0080#i\u00eb\u0013\u00ee\u0080\u00ff]&\u00ca\u00f3\u0097\u0099\u0087\u0003U\u00f2E\u00ecl\u00f4>iT\u0086\u008cJ\u0094I\u0093\u00b0\u00c5\u0014\u0006<\u00a61\u00d3\u00c5\u00bc\u0012\u0086_\u0098S\u00f2oO\u0093\u00a9\u00c3\f\u0082+t1H`Z\u009dXy\u00fe\u00a1\u00c4\u00e8/\u00ecX:\u0090Q\u00f5\u0097\u00be\u00bf\u0097O\u0099\u00bc,yeLQb\u0005\u0012\u000by\u00fa\u00d4=\u009d&\u00b3\u008c\u00cc\u00ad\u00f3\u00fe\u00de\u00d0L\u0090/\u00e4x\u00a8\r\u009d\u0001\u00f7\u0081\u0014\u00a2\u00a9\u008e\u00d39\b\u00dc7\u00e1\u00ab\u0095n\u0003\u00986\u00f6\u0090B\u0007\u00ca\bR\u00f5\u0083\u0080\u00867\u001d'\u0018n\u00af\u009bh\u001b\u00e5\u009f&\u00deY\u00b3\u0086\u00e8Z\u00c9\u00d0)\u007f3\u0004\u00d0W\u00c3\u00f8G\u00f6$\u001f;\u00c4\u00f4x8\u00e4>\u001e\u0018\u00db{\u001c8{\u00f2Dj\u00e7\u009f\u00fd\u00f7x\u0002\b%\u001d\u001eA6[\u0092\u00fe\u009aLQ\u00f6?\u0096a\u000ba\u00e1\u00bd\u00cc\u000eQh\u00f4\u00b5S=\u00ae\u009e(\u001eb\u00f5M<8\u0002Z\u001f\u0004>,\u008aV>\r@\u00aeuj\u00b9\u00bf0\u000b\u0090+\u0090\u0019\u00ad/\u00b1\u0088\u00e3\u008c\u00a0\u00d1\u00a0\u00e2\n\u00cd\u00e3\u00df,\t\u00e5K\u00e2\u0002\u00d9\u0094\u001400\u00f8\u00e55a\u00cf\u00bcT\u00e3\u00c2\u0004\u0094\u00af\u0091\u009d\u00c1WO+\u00bch\u00dc\u0019\u0004\u0017\u0096\u00d7]\u00fd\r\u00b0\u008d/\u00b3\u00e8\u00a4\u008bN\u00a6\u00bdG\u00da]xu\u00e7\u00a3Y|\u00d3\u0007\u00ad\u00cf\u00cb3\u00d5\u00a2W\u00e7&\u00f8\u009f\u00af>\u007f\u00b5\u0013k\u00d5\u00ac\u00e1\u0018\nT\u001a\u00ec\u008b\u00fe\u00e3P\u008f\u00e9\nJA(\u00fa![\\\u001f\u00df".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl75:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "h\u00f0b\u00adA\u00b4$\u00d66pk\u00b5\u00df\u001c\r3";
                    var5_15 = "h\u00f0b\u00adA\u00b4$\u00d66pk\u00b5\u00df\u001c\r3".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl88:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl101:
                // 1 sources

                ** continue;
            }
        }
        CP_oY.b = var6_12;
        CP_oY.c = new Integer[49];
        CP_oY.TELEPORT_CONFIRM = new CP_oY();
        CP_oY.TAB_COMPLETE = new CP_oY();
        CP_oY.CHAT_MESSAGE = new CP_oY();
        CP_oY.CLIENT_STATUS = new CP_oY();
        CP_oY.CLIENT_SETTINGS = new CP_oY();
        CP_oY.WINDOW_CONFIRMATION = new CP_oY();
        CP_oY.CLICK_WINDOW_BUTTON = new CP_oY();
        CP_oY.CLICK_WINDOW = new CP_oY();
        CP_oY.CLOSE_WINDOW = new CP_oY();
        CP_oY.PLUGIN_MESSAGE = new CP_oY();
        CP_oY.INTERACT_ENTITY = new CP_oY();
        CP_oY.KEEP_ALIVE = new CP_oY();
        CP_oY.PLAYER_POSITION = new CP_oY();
        CP_oY.PLAYER_POSITION_AND_ROTATION = new CP_oY();
        CP_oY.PLAYER_ROTATION = new CP_oY();
        CP_oY.PLAYER_FLYING = new CP_oY();
        CP_oY.VEHICLE_MOVE = new CP_oY();
        CP_oY.STEER_BOAT = new CP_oY();
        CP_oY.PLAYER_ABILITIES = new CP_oY();
        CP_oY.PLAYER_DIGGING = new CP_oY();
        CP_oY.ENTITY_ACTION = new CP_oY();
        CP_oY.STEER_VEHICLE = new CP_oY();
        CP_oY.RESOURCE_PACK_STATUS = new CP_oY();
        CP_oY.HELD_ITEM_CHANGE = new CP_oY();
        CP_oY.CREATIVE_INVENTORY_ACTION = new CP_oY();
        CP_oY.UPDATE_SIGN = new CP_oY();
        CP_oY.ANIMATION = new CP_oY();
        CP_oY.SPECTATE = new CP_oY();
        CP_oY.PLAYER_BLOCK_PLACEMENT = new CP_oY();
        CP_oY.USE_ITEM = new CP_oY();
        CP_oY.CP_W = CP_oY.CP_O();
    }

    private static String a(byte[] byArray) {
        int n = 0;
        int n2 = byArray.length;
        char[] cArray = new char[n2];
        for (int i = 0; i < n2; ++i) {
            char c;
            int n3 = 0xFF & byArray[i];
            if (n3 < 192) {
                cArray[n++] = (char)n3;
                continue;
            }
            if (n3 < 224) {
                c = (char)((char)(n3 & 0x1F) << 6);
                n3 = byArray[++i];
                c = (char)(c | (char)(n3 & 0x3F));
                cArray[n++] = c;
                continue;
            }
            if (i >= n2 - 2) continue;
            c = (char)((char)(n3 & 0xF) << 12);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F) << 6);
            n3 = byArray[++i];
            c = (char)(c | (char)(n3 & 0x3F));
            cArray[n++] = c;
        }
        return new String(cArray, 0, n);
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7552;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_oY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_oY.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_oY.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_oY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_oY.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

