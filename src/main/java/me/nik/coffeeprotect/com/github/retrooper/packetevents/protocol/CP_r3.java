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

public final class CP_r3
extends Enum<CP_r3> {
    public static final /* enum */ CP_r3 KEEP_ALIVE;
    public static final /* enum */ CP_r3 CHAT_MESSAGE;
    public static final /* enum */ CP_r3 INTERACT_ENTITY;
    public static final /* enum */ CP_r3 PLAYER_FLYING;
    public static final /* enum */ CP_r3 PLAYER_POSITION;
    public static final /* enum */ CP_r3 PLAYER_ROTATION;
    public static final /* enum */ CP_r3 PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_r3 PLAYER_DIGGING;
    public static final /* enum */ CP_r3 PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_r3 HELD_ITEM_CHANGE;
    public static final /* enum */ CP_r3 ANIMATION;
    public static final /* enum */ CP_r3 ENTITY_ACTION;
    public static final /* enum */ CP_r3 STEER_VEHICLE;
    public static final /* enum */ CP_r3 CLOSE_WINDOW;
    public static final /* enum */ CP_r3 CLICK_WINDOW;
    public static final /* enum */ CP_r3 WINDOW_CONFIRMATION;
    public static final /* enum */ CP_r3 CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_r3 CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_r3 UPDATE_SIGN;
    public static final /* enum */ CP_r3 PLAYER_ABILITIES;
    public static final /* enum */ CP_r3 TAB_COMPLETE;
    public static final /* enum */ CP_r3 CLIENT_SETTINGS;
    public static final /* enum */ CP_r3 CLIENT_STATUS;
    public static final /* enum */ CP_r3 PLUGIN_MESSAGE;
    private static final /* synthetic */ CP_r3[] CP_h;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_r3[] values() {
        return (CP_r3[])CP_h.clone();
    }

    public static CP_r3 valueOf(String string) {
        return Enum.valueOf(CP_r3.class, string);
    }

    private static /* synthetic */ CP_r3[] CP_G() {
        long l = a ^ 0x7E91903BEBFDL;
        CP_r3[] ilIlr3Array = new CP_r3[CP_r3.a("h", (int)6869, (long)(0x24C83F56BA1EFBCCL ^ l))];
        ilIlr3Array[0] = KEEP_ALIVE;
        ilIlr3Array[1] = CHAT_MESSAGE;
        ilIlr3Array[2] = INTERACT_ENTITY;
        ilIlr3Array[3] = PLAYER_FLYING;
        ilIlr3Array[4] = PLAYER_POSITION;
        ilIlr3Array[5] = PLAYER_ROTATION;
        ilIlr3Array[CP_r3.a("h", (int)1938, (long)(0x6398573B0C8A6682L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIlr3Array[CP_r3.a("h", (int)13905, (long)(0x30FC9DB7D425D752L ^ l))] = PLAYER_DIGGING;
        ilIlr3Array[CP_r3.a("h", (int)27150, (long)(0x29E4FAC95CB98B03L ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIlr3Array[CP_r3.a("h", (int)16657, (long)(0x1478CEF55F042021L ^ l))] = HELD_ITEM_CHANGE;
        ilIlr3Array[CP_r3.a("h", (int)8257, (long)(0x160473C8CE82C144L ^ l))] = ANIMATION;
        ilIlr3Array[CP_r3.a("h", (int)1020, (long)(0x71FE03B2537E2F3L ^ l))] = ENTITY_ACTION;
        ilIlr3Array[CP_r3.a("h", (int)1429, (long)(0x44E83A0A18C6649BL ^ l))] = STEER_VEHICLE;
        ilIlr3Array[CP_r3.a("h", (int)21689, (long)(0x68D2CC34D5A835BBL ^ l))] = CLOSE_WINDOW;
        ilIlr3Array[CP_r3.a("h", (int)4812, (long)(0x71AA70FBF24DF3D6L ^ l))] = CLICK_WINDOW;
        ilIlr3Array[CP_r3.a("h", (int)7803, (long)(0x1D59863C62CB7F68L ^ l))] = WINDOW_CONFIRMATION;
        ilIlr3Array[CP_r3.a("h", (int)13215, (long)(0x7B4E8DDE4EFDD2ACL ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIlr3Array[CP_r3.a("h", (int)11075, (long)(0x597DC54D73C1CA71L ^ l))] = CLICK_WINDOW_BUTTON;
        ilIlr3Array[CP_r3.a("h", (int)25836, (long)(0x61574BF9A0DB85FAL ^ l))] = UPDATE_SIGN;
        ilIlr3Array[CP_r3.a("h", (int)8083, (long)(0x51474502B4C8FE81L ^ l))] = PLAYER_ABILITIES;
        ilIlr3Array[CP_r3.a("h", (int)6753, (long)(0x46D99EFA634E7B7FL ^ l))] = TAB_COMPLETE;
        ilIlr3Array[CP_r3.a("h", (int)31228, (long)(0x2DA27CC98CF698FBL ^ l))] = CLIENT_SETTINGS;
        ilIlr3Array[CP_r3.a("h", (int)1158, (long)(0xEF258D7ECCCE587L ^ l))] = CLIENT_STATUS;
        ilIlr3Array[CP_r3.a("h", (int)23475, (long)(0x70608987AB5B3AB5L ^ l))] = PLUGIN_MESSAGE;
        return ilIlr3Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_r3.a = CP_s.a(-2963717151751730084L, -1810032727642999792L, MethodHandles.lookup().lookupClass()).a(172323354042593L);
                        var20 = CP_r3.a ^ 117445058607083L;
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
                        var11_3 = new String[24];
                        var17_4 = 0;
                        var16_5 = "\u0004\u00d6\u0097gl\u0012\u0085$\u00e1\u00cb\u00d9\u00c6F\u008f\u00196 9\u00cda\u000f\u001f\u00f9\u00a2I%o\u00afj\u0017\u00a5K\n\u00e9\u008c\u00e1$\u00caT*\u00de\u00b9n\f\u00db\u00fe\u001c\u00ffV\u0010\u00c3\u00ea\u0099\u00c7\u00f7\u001c\u0016\u0083{k\u009a\u00f0R\u0095SO\u0010\u0015,\u0014\u00cd\u001a\u00d8\u00f6\u00bc\u0016\u00bf\u00f2\u00a9\u0013\u00e9o\u00b3\u0010\u0002^\u00df\u001clL_\u00a81\u00a24\u0082\u00054\u009e\u00ba\u0010O\u00aa\u00ec<\u00bf\u00f2\u00fdtv\u00fbI\u008ap\u00ba\u00d9+\u0010\u00c7\u00d8I\u0010ox\u00fd\u00c3Z\u00a7'\u001fG&\u00e2\u00bd\u0010]\u00e0\u0005NZw\u00a64RC=\t\u00a7\u00c8\u00e8\u00ce\u0010\u00c7\u00d8I\u0010ox\u00fd\u00c38\u00c8\u0098C\u001c/\u00e0\u00c5\u0010Qj\u00d2\u00ab\u00bf7*\u00ad\u000e\u008d\u00d4\u0096H\u00d8\u00d4\u00ae\u0010|\u00ed\u00f1Es\u0095b\u00d6\u00c2\u00c2\u00f2\u0097-n\u001a\u00eb\u0018\u001b\u0080\u007fn{\u0080\u00ef\u0015\u00c6\u0003[\u00e6\u001f8\u008dzrHd7\u00c4U\u00bd\u00c3 \u00fc\u008fd\u00ee\u00c1\u00e7\u00a6\u00a6\u00d1b\u00966f\u00bbm\u000e\t\u00b4\u0099\u001d\u00bb\u00e9n\u00b7\u00bd\u0000\u00d0\u00ae\u00df\u007fL\u00d5\u0018^\u00f3\u00d3\u00ea\u00c7\u0084\t/?8,\u008e@\u009e^\u0088N\u00a7\u00dcbd\u001e\u00dc\u00b3\u0018\u0005\u00f6\u00c2\u00c2\u00bd\u00f6\u00ca\u0095;\u0086j\u00c0\u00bdM{r\u0095\u00d1\u00c3\u008e\u00c6\u00e8\u00e1\u000e\u0018\u0012||\u00aa\u00bd(\u00f6\u00bf\u0014\u009e\u00d5M\u00f9\u00a7M8\u00c3O5q\u00fb\u0013B\u00ab\u0010\u0012||\u00aa\u00bd(\u00f6\u00bf@fw\u00af\u008a\u00d1}\u00ee\u0010\u00e7^\u00b0\u0019\u0015\u0082\u00be\u00ae\u00feD\u00fct\t/\u00ba}\u0010\u00c5p+\u00ab{\u00aa\u00fe\u00f7\u00b2/L\u001d\\\u008a\fz\u0010\u00bed~%\u007f\u00c8\u00b7\u00ce]q x\u00ea\u000bb\u001a\u0010\u0097\u008e\u00b4S\u0087`w\u008a\u00912@\u0088D\u00a5M\n\u0010\u009c\u0017\u00cf\u001b\u00b1\u0003\u0095\u00fa\u00b7mKq\u0098?gs";
                        var18_6 = "\u0004\u00d6\u0097gl\u0012\u0085$\u00e1\u00cb\u00d9\u00c6F\u008f\u00196 9\u00cda\u000f\u001f\u00f9\u00a2I%o\u00afj\u0017\u00a5K\n\u00e9\u008c\u00e1$\u00caT*\u00de\u00b9n\f\u00db\u00fe\u001c\u00ffV\u0010\u00c3\u00ea\u0099\u00c7\u00f7\u001c\u0016\u0083{k\u009a\u00f0R\u0095SO\u0010\u0015,\u0014\u00cd\u001a\u00d8\u00f6\u00bc\u0016\u00bf\u00f2\u00a9\u0013\u00e9o\u00b3\u0010\u0002^\u00df\u001clL_\u00a81\u00a24\u0082\u00054\u009e\u00ba\u0010O\u00aa\u00ec<\u00bf\u00f2\u00fdtv\u00fbI\u008ap\u00ba\u00d9+\u0010\u00c7\u00d8I\u0010ox\u00fd\u00c3Z\u00a7'\u001fG&\u00e2\u00bd\u0010]\u00e0\u0005NZw\u00a64RC=\t\u00a7\u00c8\u00e8\u00ce\u0010\u00c7\u00d8I\u0010ox\u00fd\u00c38\u00c8\u0098C\u001c/\u00e0\u00c5\u0010Qj\u00d2\u00ab\u00bf7*\u00ad\u000e\u008d\u00d4\u0096H\u00d8\u00d4\u00ae\u0010|\u00ed\u00f1Es\u0095b\u00d6\u00c2\u00c2\u00f2\u0097-n\u001a\u00eb\u0018\u001b\u0080\u007fn{\u0080\u00ef\u0015\u00c6\u0003[\u00e6\u001f8\u008dzrHd7\u00c4U\u00bd\u00c3 \u00fc\u008fd\u00ee\u00c1\u00e7\u00a6\u00a6\u00d1b\u00966f\u00bbm\u000e\t\u00b4\u0099\u001d\u00bb\u00e9n\u00b7\u00bd\u0000\u00d0\u00ae\u00df\u007fL\u00d5\u0018^\u00f3\u00d3\u00ea\u00c7\u0084\t/?8,\u008e@\u009e^\u0088N\u00a7\u00dcbd\u001e\u00dc\u00b3\u0018\u0005\u00f6\u00c2\u00c2\u00bd\u00f6\u00ca\u0095;\u0086j\u00c0\u00bdM{r\u0095\u00d1\u00c3\u008e\u00c6\u00e8\u00e1\u000e\u0018\u0012||\u00aa\u00bd(\u00f6\u00bf\u0014\u009e\u00d5M\u00f9\u00a7M8\u00c3O5q\u00fb\u0013B\u00ab\u0010\u0012||\u00aa\u00bd(\u00f6\u00bf@fw\u00af\u008a\u00d1}\u00ee\u0010\u00e7^\u00b0\u0019\u0015\u0082\u00be\u00ae\u00feD\u00fct\t/\u00ba}\u0010\u00c5p+\u00ab{\u00aa\u00fe\u00f7\u00b2/L\u001d\\\u008a\fz\u0010\u00bed~%\u007f\u00c8\u00b7\u00ce]q x\u00ea\u000bb\u001a\u0010\u0097\u008e\u00b4S\u0087`w\u008a\u00912@\u0088D\u00a5M\n\u0010\u009c\u0017\u00cf\u001b\u00b1\u0003\u0095\u00fa\u00b7mKq\u0098?gs".length();
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
                            var11_3[var17_4++] = CP_r3.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00f7L\u00d8Si\u00ae\\\u0018\u00fa\u000f\u00acw\f\u00a0\u00b3\u009do#:r\u00e5\u001f\u00ab]\u00109\u00cda\u000f\u001f\u00f9\u00a2I\u00cf\u00c0\u00ed\u00cd\u0097\u00e5T\u001b";
                            var18_6 = "\u00f7L\u00d8Si\u00ae\\\u0018\u00fa\u000f\u00acw\f\u00a0\u00b3\u009do#:r\u00e5\u001f\u00ab]\u00109\u00cda\u000f\u001f\u00f9\u00a2I\u00cf\u00c0\u00ed\u00cd\u0097\u00e5T\u001b".length();
                            var15_7 = 24;
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
                            var11_3[var17_4++] = CP_r3.a(var19_9).intern();
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
                CP_r3.d = new HashMap<K, V>(13);
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
                var6_12 = new long[37];
                var3_13 = 0;
                var4_14 = "2|\br>\u0018ab\u0089v`\u00ed\u0000\u00b4\u0083\u00bbf\u00c1B01\u00c48p\u0084\u00a8\u00f1\u00ad}WEt\u00b6\u00ab\u0098)\u000b\u00dd\u00c8$\u00a9\u00f9.D\u008e\u00bc9\u00ba\u0012\u00d4\u00c5\n\u0005\u009dyJ?\u00f8:\u00db\u00af\u00ad\u00d4\u008c\u00a9Y\u00b6\u00ba%\u009e\u00e6%\u00816v\u00dc\u00f7\u00966\u00d7:\u0098\u000f|\u00bc\u00d13\u00ab]\u00ca\u00f3?F\u00e2\u009e\u001a7\u00d1\u00ec\u00d0\u00e8\u0014<\u00a7\u00ed\u00f7\u0089\u0086\u001a\u008a\u00b5\u0015\u0093\b\u00e9\u00a1>h\u000f\u00f0\u0004\u0092z\u00e2\u0016\u001e<\u00be\u0090E[21\u00b8we\u00d8\u00c7\u0097L\u001b~9\u000eN\u000f\u0087I;-'\u001bl\u00d7\u00da\u0002\u00e2\u00e1\u008b\u0014}\u00c2\u007fz\u009d)\u0081\u00f9\u00126}\u00c9\u0011\u00d9\u001d\u00ebg\u0011\u00a5\u008d\u00d4u\u0096\u001eG(-\u0082\u008d;\u00e3\u00b4\u00a4G\u00d7\u00918\u009f\u00fbzw\u00ca\u00df\u00a9\u00c7M~)\u00b6\u0084\u0098M\u009d\u00e6N\u00a3\u00ddN'\b\\G\u0080\u009aF\u00e3\u009a\u00c8\u00a7\u00c2\u00b3\u00d3\u00805#D\u00c9V\u00cc\n\u00a4\u0006\"\u0006\u00da\u00d9g'\u00dc\u00ca\u00f0k\u00d2\u00c6\"\u00d5\nW\u0085\u00b1_\u00f8\u00b4\b\u00e3V\u0092Nc3\u00c6\u008fR\u0086\u00d6\"\u0094\u00e8\u00dc\u0015";
                var5_15 = "2|\br>\u0018ab\u0089v`\u00ed\u0000\u00b4\u0083\u00bbf\u00c1B01\u00c48p\u0084\u00a8\u00f1\u00ad}WEt\u00b6\u00ab\u0098)\u000b\u00dd\u00c8$\u00a9\u00f9.D\u008e\u00bc9\u00ba\u0012\u00d4\u00c5\n\u0005\u009dyJ?\u00f8:\u00db\u00af\u00ad\u00d4\u008c\u00a9Y\u00b6\u00ba%\u009e\u00e6%\u00816v\u00dc\u00f7\u00966\u00d7:\u0098\u000f|\u00bc\u00d13\u00ab]\u00ca\u00f3?F\u00e2\u009e\u001a7\u00d1\u00ec\u00d0\u00e8\u0014<\u00a7\u00ed\u00f7\u0089\u0086\u001a\u008a\u00b5\u0015\u0093\b\u00e9\u00a1>h\u000f\u00f0\u0004\u0092z\u00e2\u0016\u001e<\u00be\u0090E[21\u00b8we\u00d8\u00c7\u0097L\u001b~9\u000eN\u000f\u0087I;-'\u001bl\u00d7\u00da\u0002\u00e2\u00e1\u008b\u0014}\u00c2\u007fz\u009d)\u0081\u00f9\u00126}\u00c9\u0011\u00d9\u001d\u00ebg\u0011\u00a5\u008d\u00d4u\u0096\u001eG(-\u0082\u008d;\u00e3\u00b4\u00a4G\u00d7\u00918\u009f\u00fbzw\u00ca\u00df\u00a9\u00c7M~)\u00b6\u0084\u0098M\u009d\u00e6N\u00a3\u00ddN'\b\\G\u0080\u009aF\u00e3\u009a\u00c8\u00a7\u00c2\u00b3\u00d3\u00805#D\u00c9V\u00cc\n\u00a4\u0006\"\u0006\u00da\u00d9g'\u00dc\u00ca\u00f0k\u00d2\u00c6\"\u00d5\nW\u0085\u00b1_\u00f8\u00b4\b\u00e3V\u0092Nc3\u00c6\u008fR\u0086\u00d6\"\u0094\u00e8\u00dc\u0015".length();
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
                    var4_14 = "Gh\u009e{9\u00b1g\u00e6\u00e5\u00bcCu\u00c4\u00b8A\u00b9";
                    var5_15 = "Gh\u009e{9\u00b1g\u00e6\u00e5\u00bcCu\u00c4\u00b8A\u00b9".length();
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
        CP_r3.b = var6_12;
        CP_r3.c = new Integer[37];
        CP_r3.KEEP_ALIVE = new CP_r3();
        CP_r3.CHAT_MESSAGE = new CP_r3();
        CP_r3.INTERACT_ENTITY = new CP_r3();
        CP_r3.PLAYER_FLYING = new CP_r3();
        CP_r3.PLAYER_POSITION = new CP_r3();
        CP_r3.PLAYER_ROTATION = new CP_r3();
        CP_r3.PLAYER_POSITION_AND_ROTATION = new CP_r3();
        CP_r3.PLAYER_DIGGING = new CP_r3();
        CP_r3.PLAYER_BLOCK_PLACEMENT = new CP_r3();
        CP_r3.HELD_ITEM_CHANGE = new CP_r3();
        CP_r3.ANIMATION = new CP_r3();
        CP_r3.ENTITY_ACTION = new CP_r3();
        CP_r3.STEER_VEHICLE = new CP_r3();
        CP_r3.CLOSE_WINDOW = new CP_r3();
        CP_r3.CLICK_WINDOW = new CP_r3();
        CP_r3.WINDOW_CONFIRMATION = new CP_r3();
        CP_r3.CREATIVE_INVENTORY_ACTION = new CP_r3();
        CP_r3.CLICK_WINDOW_BUTTON = new CP_r3();
        CP_r3.UPDATE_SIGN = new CP_r3();
        CP_r3.PLAYER_ABILITIES = new CP_r3();
        CP_r3.TAB_COMPLETE = new CP_r3();
        CP_r3.CLIENT_SETTINGS = new CP_r3();
        CP_r3.CLIENT_STATUS = new CP_r3();
        CP_r3.PLUGIN_MESSAGE = new CP_r3();
        CP_r3.CP_h = CP_r3.CP_G();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4C51;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_r3", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_r3.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_r3.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_r3" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_r3.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

