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

public final class CP_yx
extends Enum<CP_yx> {
    public static final /* enum */ CP_yx TELEPORT_CONFIRM;
    public static final /* enum */ CP_yx TAB_COMPLETE;
    public static final /* enum */ CP_yx CHAT_MESSAGE;
    public static final /* enum */ CP_yx CLIENT_STATUS;
    public static final /* enum */ CP_yx CLIENT_SETTINGS;
    public static final /* enum */ CP_yx WINDOW_CONFIRMATION;
    public static final /* enum */ CP_yx CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_yx CLICK_WINDOW;
    public static final /* enum */ CP_yx CLOSE_WINDOW;
    public static final /* enum */ CP_yx PLUGIN_MESSAGE;
    public static final /* enum */ CP_yx INTERACT_ENTITY;
    public static final /* enum */ CP_yx KEEP_ALIVE;
    public static final /* enum */ CP_yx PLAYER_FLYING;
    public static final /* enum */ CP_yx PLAYER_POSITION;
    public static final /* enum */ CP_yx PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_yx PLAYER_ROTATION;
    public static final /* enum */ CP_yx VEHICLE_MOVE;
    public static final /* enum */ CP_yx STEER_BOAT;
    public static final /* enum */ CP_yx CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_yx PLAYER_ABILITIES;
    public static final /* enum */ CP_yx PLAYER_DIGGING;
    public static final /* enum */ CP_yx ENTITY_ACTION;
    public static final /* enum */ CP_yx STEER_VEHICLE;
    public static final /* enum */ CP_yx RECIPE_BOOK_DATA;
    public static final /* enum */ CP_yx RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_yx ADVANCEMENT_TAB;
    public static final /* enum */ CP_yx HELD_ITEM_CHANGE;
    public static final /* enum */ CP_yx CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_yx UPDATE_SIGN;
    public static final /* enum */ CP_yx ANIMATION;
    public static final /* enum */ CP_yx SPECTATE;
    public static final /* enum */ CP_yx PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_yx USE_ITEM;
    private static final /* synthetic */ CP_yx[] CP_y;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_yx[] values() {
        return (CP_yx[])CP_y.clone();
    }

    public static CP_yx valueOf(String string) {
        return Enum.valueOf(CP_yx.class, string);
    }

    private static /* synthetic */ CP_yx[] CP_e() {
        long l = a ^ 0x2CA7B4A196F1L;
        CP_yx[] ilIlyxArray = new CP_yx[CP_yx.a("y", (int)2397, (long)(0x2665692F99BB610DL ^ l))];
        ilIlyxArray[0] = TELEPORT_CONFIRM;
        ilIlyxArray[1] = TAB_COMPLETE;
        ilIlyxArray[2] = CHAT_MESSAGE;
        ilIlyxArray[3] = CLIENT_STATUS;
        ilIlyxArray[4] = CLIENT_SETTINGS;
        ilIlyxArray[5] = WINDOW_CONFIRMATION;
        ilIlyxArray[CP_yx.a("y", (int)32659, (long)(0x387F1F06F7F217E8L ^ l))] = CLICK_WINDOW_BUTTON;
        ilIlyxArray[CP_yx.a("y", (int)28234, (long)(0x521A0CC6E91A862AL ^ l))] = CLICK_WINDOW;
        ilIlyxArray[CP_yx.a("y", (int)24881, (long)(0x56D88F1E405E0947L ^ l))] = CLOSE_WINDOW;
        ilIlyxArray[CP_yx.a("y", (int)2198, (long)(0x23E5D47DD0E6E0E5L ^ l))] = PLUGIN_MESSAGE;
        ilIlyxArray[CP_yx.a("y", (int)5959, (long)(0x7C13158B15CB7F14L ^ l))] = INTERACT_ENTITY;
        ilIlyxArray[CP_yx.a("y", (int)1309, (long)(0x129993C93969ED6DL ^ l))] = KEEP_ALIVE;
        ilIlyxArray[CP_yx.a("y", (int)3178, (long)(0x4390D8461918E425L ^ l))] = PLAYER_FLYING;
        ilIlyxArray[CP_yx.a("y", (int)23157, (long)(0xE14071FED23B204L ^ l))] = PLAYER_POSITION;
        ilIlyxArray[CP_yx.a("y", (int)5179, (long)(0x5EB028ACBE7CFC46L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIlyxArray[CP_yx.a("y", (int)4352, (long)(0x31EA467F1E227963L ^ l))] = PLAYER_ROTATION;
        ilIlyxArray[CP_yx.a("y", (int)3447, (long)(0x912296794766522L ^ l))] = VEHICLE_MOVE;
        ilIlyxArray[CP_yx.a("y", (int)7965, (long)(0x40550D7AC049777FL ^ l))] = STEER_BOAT;
        ilIlyxArray[CP_yx.a("y", (int)26492, (long)(0x12B371BA0A640F24L ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIlyxArray[CP_yx.a("y", (int)15677, (long)(0x69195D208F91D549L ^ l))] = PLAYER_ABILITIES;
        ilIlyxArray[CP_yx.a("y", (int)12770, (long)(0x1B5F4C8C4DA85997L ^ l))] = PLAYER_DIGGING;
        ilIlyxArray[CP_yx.a("y", (int)22275, (long)(0x56D5AC687F84BF7DL ^ l))] = ENTITY_ACTION;
        ilIlyxArray[CP_yx.a("y", (int)31296, (long)(0x1BC58CB53B21923CL ^ l))] = STEER_VEHICLE;
        ilIlyxArray[CP_yx.a("y", (int)12556, (long)(0x6ED5318E2CA4D96BL ^ l))] = RECIPE_BOOK_DATA;
        ilIlyxArray[CP_yx.a("y", (int)587, (long)(0xA6369C952A26A00L ^ l))] = RESOURCE_PACK_STATUS;
        ilIlyxArray[CP_yx.a("y", (int)5224, (long)(0x54F0A5EC8297FC2CL ^ l))] = ADVANCEMENT_TAB;
        ilIlyxArray[CP_yx.a("y", (int)24648, (long)(0x1FD999CCD8710806L ^ l))] = HELD_ITEM_CHANGE;
        ilIlyxArray[CP_yx.a("y", (int)22451, (long)(0x3E5AAA767E103FE7L ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIlyxArray[CP_yx.a("y", (int)3197, (long)(0x57A49B4799A5643CL ^ l))] = UPDATE_SIGN;
        ilIlyxArray[CP_yx.a("y", (int)28222, (long)(0x6C395AD4E3F48658L ^ l))] = ANIMATION;
        ilIlyxArray[CP_yx.a("y", (int)11274, (long)(0x27359061781DC442L ^ l))] = SPECTATE;
        ilIlyxArray[CP_yx.a("y", (int)8108, (long)(0x698787B4C47977EBL ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIlyxArray[CP_yx.a("y", (int)24649, (long)(0x63C0095F64D80809L ^ l))] = USE_ITEM;
        return ilIlyxArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_yx.a = CP_s.a(4803265526566113001L, 8531282589460700165L, MethodHandles.lookup().lookupClass()).a(8050096880195L);
                        var20 = CP_yx.a ^ 36533334993647L;
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
                        var11_3 = new String[33];
                        var17_4 = 0;
                        var16_5 = "<~\u00152\u008c\u00e1\u0088\u00e7!m\u0093\u0007qY\u0089q\u0010\u00ca\u00b3\u00ca\u0017\u0090n\u00034\u00a8\u00ad\u0091\u0087mPi[\u0018\u00c3\u00faw\u00d9\u00d0\u008f\u00c6\u009a\u00f1d\u0013\u00ae14\u0015\u009b\u00d4\u00b5\u001a\u00e6\u0094\u000e\u0085\u009f\u0018\u00f1l\u00d8Y\u00c6\u0005\u00d3l3\u00f7;d\u00d8\r\u0005\tH\u00e3&\u00f8\u00e7r\u0006\u009c\u0010m\u00ecj\u00d9\u00936\u00c4\u00e9<\u000e*:o\u00d0\u008an\u0010r\tM\u00a4\u00a6\u00c5\u0002\u0095\u0093\u00ae\u0092\\\u00a8\u00f2eN\u0010\u000b\u008bGQP\u00dc?Eh\u00db*\u00fc\u0011\u00b4S\n\u0018\u0090\u0006\u0001v\u00fd\u00b4\u0084p\u008b\u00ef\u009cY\u00a0\u00aav\u00e7\u0096YoEL\u0085\u00c4y\u0010Jsd\u00f5\u00c9\u00a5`\u00e5\u0013I\u00d0$Q7\u0014\u0085\u0010%V\u00ce\u00ed=\u0080f\u00f8\u008d\u00aao#\u00a2\u00fam\u0016\u0010\u00d4\u0080\u00cf\u00b0\u00fb\u00f4\u00ea\u008f\u009a\u00bb\u009d|\u00b1\u00e4j\u00f5\u0010\u00b2n\u00ec\u00ea^\u00b2\u00fd^!\u0013\u0007\u00ef\u0092\u00d4\u00ab\u0014\u0010\u008eV\f|\u00a6S\u00d4V\u0017\u00ff\u0013\u0092\u00f6\u009c\u0095] \u00f7\u00efcX\u00b3M\u000e\u0091\u000e\u00d1k\u00f8\u00abi\u0095\u0096q\u00baa\u00c2\u0000\u001b\u00b1\u0095`b\u00cb6\u00e3l\u00e1G\u0010\u00e3\u000b\u0015\u00cf\u00ab\u00d0p\u0002\u008fe\u001b\u00d1\u00ec5\u0092w\u0010Gh\u0000\u00f6\u008c\u00a6\u0098\u00d4\u00af,\u00ae\u0096\u0090y\u00b3\u0091 \u000b\u008bGQP\u00dc?E\u0005\u0098\u00b7#\u0097\u0000\u009b\u00c9\u0003bsb\u00a7l\u00a6\u00fb\u008e*Yk\u001dS|\u0090\u0010\u0080\u00ad\u00f0e\u00e3\u0005\u00b3\u00cc\u00ca\u009b\u00b2\u0015\u00b52_\u00e8\u0010\u0016(O\u008d$\u0000\u00a7\u00f7\u00bd\u00b0\u00d7\u0086Cl\u0082_\u00107\u0005\u00ba\u00e5\u00ed[\u00c2\u00e2q\u00f0\b\u0002sd\u00d1\\\u0010HQ#\u00d0\u00aa\u009e\u009d\u0090\u0088\u00eb\u0087,\u00d4\u00ff\u00f2\u00b1\u0010\u00dco\u00b4ha\u001d\b\"i\u00f1\u00af\u00cd\u00a1#\u00b0\u009f\u00103\u0089!\u00f2\u00db8@N\u00df\u00a2k\u00f9\u00ff\u00cb\u00da\u0010\u0010\u0012u\u0001;\u00a8\u0084\u00d1FH\u00cb\u008b[\u00cc\\\u0082\\\u0010\u0093d\u0088\r\u00f11\u0082\u000bB\u00a0\u00933\u0017\u00f9\u00b7\u00f5\u0010\u00b2n\u00ec\u00ea^\u00b2\u00fd^a\u00eeq\u0086\u0018\u009c\u00e4\u00ac\u0010\u00fb\u00acF\u00be\u0081\u00aab\u00c9\u00ed:kk\u00b3\u00efy\u00c4\u0018BL`\u00e5y\u001b\u0094\u00afu\u00a9\u00c3\u00d4H\u00b7\u00ecT\u00f2\u00e8\u00cbT%\u0014\u0085\u008c\u0018!\u00f0\u00e0\u00ff\u0004\u00d5\u00bar\u008e\u00ca\u0093\u00be\u00e6\u00e1\u00f4\u00fd\u00ea\fp\u0001\u001d\u0013=X\u0018\u000e\u008f\u00e9 @\u008d)\u00da\u00c6-\u00f3Y\u00c4\u00f6>\u0090\u00f0\u00c4\u008au\u00cf\u00e2\u00faZ\u0018u\\\u0094\u0092T\u00b0?-0\u0014\u00c9Z\u00fd\u0087\u00eb{\u008b\u00cf\u001c\u00b6R\u00afHR";
                        var18_6 = "<~\u00152\u008c\u00e1\u0088\u00e7!m\u0093\u0007qY\u0089q\u0010\u00ca\u00b3\u00ca\u0017\u0090n\u00034\u00a8\u00ad\u0091\u0087mPi[\u0018\u00c3\u00faw\u00d9\u00d0\u008f\u00c6\u009a\u00f1d\u0013\u00ae14\u0015\u009b\u00d4\u00b5\u001a\u00e6\u0094\u000e\u0085\u009f\u0018\u00f1l\u00d8Y\u00c6\u0005\u00d3l3\u00f7;d\u00d8\r\u0005\tH\u00e3&\u00f8\u00e7r\u0006\u009c\u0010m\u00ecj\u00d9\u00936\u00c4\u00e9<\u000e*:o\u00d0\u008an\u0010r\tM\u00a4\u00a6\u00c5\u0002\u0095\u0093\u00ae\u0092\\\u00a8\u00f2eN\u0010\u000b\u008bGQP\u00dc?Eh\u00db*\u00fc\u0011\u00b4S\n\u0018\u0090\u0006\u0001v\u00fd\u00b4\u0084p\u008b\u00ef\u009cY\u00a0\u00aav\u00e7\u0096YoEL\u0085\u00c4y\u0010Jsd\u00f5\u00c9\u00a5`\u00e5\u0013I\u00d0$Q7\u0014\u0085\u0010%V\u00ce\u00ed=\u0080f\u00f8\u008d\u00aao#\u00a2\u00fam\u0016\u0010\u00d4\u0080\u00cf\u00b0\u00fb\u00f4\u00ea\u008f\u009a\u00bb\u009d|\u00b1\u00e4j\u00f5\u0010\u00b2n\u00ec\u00ea^\u00b2\u00fd^!\u0013\u0007\u00ef\u0092\u00d4\u00ab\u0014\u0010\u008eV\f|\u00a6S\u00d4V\u0017\u00ff\u0013\u0092\u00f6\u009c\u0095] \u00f7\u00efcX\u00b3M\u000e\u0091\u000e\u00d1k\u00f8\u00abi\u0095\u0096q\u00baa\u00c2\u0000\u001b\u00b1\u0095`b\u00cb6\u00e3l\u00e1G\u0010\u00e3\u000b\u0015\u00cf\u00ab\u00d0p\u0002\u008fe\u001b\u00d1\u00ec5\u0092w\u0010Gh\u0000\u00f6\u008c\u00a6\u0098\u00d4\u00af,\u00ae\u0096\u0090y\u00b3\u0091 \u000b\u008bGQP\u00dc?E\u0005\u0098\u00b7#\u0097\u0000\u009b\u00c9\u0003bsb\u00a7l\u00a6\u00fb\u008e*Yk\u001dS|\u0090\u0010\u0080\u00ad\u00f0e\u00e3\u0005\u00b3\u00cc\u00ca\u009b\u00b2\u0015\u00b52_\u00e8\u0010\u0016(O\u008d$\u0000\u00a7\u00f7\u00bd\u00b0\u00d7\u0086Cl\u0082_\u00107\u0005\u00ba\u00e5\u00ed[\u00c2\u00e2q\u00f0\b\u0002sd\u00d1\\\u0010HQ#\u00d0\u00aa\u009e\u009d\u0090\u0088\u00eb\u0087,\u00d4\u00ff\u00f2\u00b1\u0010\u00dco\u00b4ha\u001d\b\"i\u00f1\u00af\u00cd\u00a1#\u00b0\u009f\u00103\u0089!\u00f2\u00db8@N\u00df\u00a2k\u00f9\u00ff\u00cb\u00da\u0010\u0010\u0012u\u0001;\u00a8\u0084\u00d1FH\u00cb\u008b[\u00cc\\\u0082\\\u0010\u0093d\u0088\r\u00f11\u0082\u000bB\u00a0\u00933\u0017\u00f9\u00b7\u00f5\u0010\u00b2n\u00ec\u00ea^\u00b2\u00fd^a\u00eeq\u0086\u0018\u009c\u00e4\u00ac\u0010\u00fb\u00acF\u00be\u0081\u00aab\u00c9\u00ed:kk\u00b3\u00efy\u00c4\u0018BL`\u00e5y\u001b\u0094\u00afu\u00a9\u00c3\u00d4H\u00b7\u00ecT\u00f2\u00e8\u00cbT%\u0014\u0085\u008c\u0018!\u00f0\u00e0\u00ff\u0004\u00d5\u00bar\u008e\u00ca\u0093\u00be\u00e6\u00e1\u00f4\u00fd\u00ea\fp\u0001\u001d\u0013=X\u0018\u000e\u008f\u00e9 @\u008d)\u00da\u00c6-\u00f3Y\u00c4\u00f6>\u0090\u00f0\u00c4\u008au\u00cf\u00e2\u00faZ\u0018u\\\u0094\u0092T\u00b0?-0\u0014\u00c9Z\u00fd\u0087\u00eb{\u008b\u00cf\u001c\u00b6R\u00afHR".length();
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
                            var11_3[var17_4++] = CP_yx.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "r\tM\u00a4\u00a6\u00c5\u0002\u0095n\u0083<\u009a\u00b2`\u00ef9\u00f3\u00ec\u0002\u001e\u00d8\u00ea\u0002P\u0018\u0006\u001cL5\u0018u\u00b7\u00ab\u00a2\u0080:\u00f5\u007f_D\u00ca\u00c8r\u0002\u0091\u0005\u007f\u00c5h";
                            var18_6 = "r\tM\u00a4\u00a6\u00c5\u0002\u0095n\u0083<\u009a\u00b2`\u00ef9\u00f3\u00ec\u0002\u001e\u00d8\u00ea\u0002P\u0018\u0006\u001cL5\u0018u\u00b7\u00ab\u00a2\u0080:\u00f5\u007f_D\u00ca\u00c8r\u0002\u0091\u0005\u007f\u00c5h".length();
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
                            var11_3[var17_4++] = CP_yx.a(var19_9).intern();
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
                CP_yx.d = new HashMap<K, V>(13);
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
                var6_12 = new long[55];
                var3_13 = 0;
                var4_14 = "\u000e\u00bfI\u0095A\u008f\u00b1Y\u00f4\u00c8\u007f\u0080\u0095\u009dF4\u00b6M\u001a@\u009cm=>\u0092PP\u0088\u0012\u00da\u00ad\u00e1\u00f7U\u00b7\u0094|\u0000\u0099\u00a9}\u000e\u00b08\u00c8\u00ed\u00ff6\u0004\u007f5\u00b5\b~\u001f\u00ad\u0084\u0085\u00d0\u00a9\u00f1\u00bedS?e\u00ea\u00c3\b\u0096l\u00eee\u00e0\u00eb[\u0017hO\t\u00d1E\u00db\u00e4\u009aW\u0004\u0014D\u00b1\u0096F\u00e3\u0017\u0098\u008f\u00d5\u00fd{\u00e0\u0086\u0084\u0002\u0093\u0093\u00db\u00e3f:\u00f8l'\u00f6\u00b6\u00de66\u00d2\u00142#\u00f3\u00d6\u00c3\u00b4D\u00b3*\u001fSrs\u00e4\u00bfT)\u0086\u00d4\u0086\u0006\u0081\u007f\u00e9\u009c'p\u00c2ELR\u0010E\u00ac3\u00e8\u00a3\f\u00a52r\u00e7\u0000\u00f4M\u00df\u0091;\u00a1tj5\u00a7;\u00cfdf\u00f5h\u00c2\u008b\u00f5)P\u00d0&\u0002A\u001a\r-Y#\u00c4\u00e2\u00ce\u008e\r\u007f\u0006B\u00cd\u0085\u00fcZu+)\u0083\u00e1S\\\u00cf1\u00c8\u009a\u0007\u001f\u00ea}\u00c9\u00b2b}\u00d5)\u00fb\u00e6\u00f2\u00b3\u00fe\u00da\u0090\u00b2i(\u00bb0\u00b5>\u0004\u00a0\u00d0\u00014K[\u00f5WA\u00d7\u001e5\u0086M8k2\u0010\u0081te\u00c7}\u00f3xo\u0013K\u00b8\u0010\u00ce\u00fe\u00a7\u00f9\u00d9/\u0015\u00fa\u008c@\u00c2\u00ee\u00e3{5%\u00a7\u00ad<\u0081\u009f\u000f\u0099\u00c5m\u00f8\u008ab\u00d8\u007f\u00bd\u001a)\u007f\u00fd\u00bdH\u00b9i\u00f2\u00cc(]a\u00a3u1F\u0095>\n\u00ea\u00f3\u009a\u009a\u00bc\u0086\u0003\u00e8o\\\u0011E>\u00d8\u00f4\u00b9\u00fe\u0099'\u0090\u0088&\u00adL\u0089*\u00f2\u009d\u008b1\u0088\u001b\u0081[\u0005\u008a2\u001e\u00a6\u00a0Je>f\u008e\u00a1\u00ad\u008b\u00be\u00f8\u00e5\u0000\u00f2`'\u008eb\u00bfz\u008a\u0002uY\u00e7\u008a\u000f\u00b1_q\u00aa\u0002\u001f(+\tr\u008d\u00ac\u0095\u00fdg\u00c7m\u00f3\u00ac\u00de\u00d9\u00b3\u00ed\u00ee\u00a1\u00f5\u00a4\u00feV\u0016\u00e7\u008a\u00a2\u00c2X1\u00f4";
                var5_15 = "\u000e\u00bfI\u0095A\u008f\u00b1Y\u00f4\u00c8\u007f\u0080\u0095\u009dF4\u00b6M\u001a@\u009cm=>\u0092PP\u0088\u0012\u00da\u00ad\u00e1\u00f7U\u00b7\u0094|\u0000\u0099\u00a9}\u000e\u00b08\u00c8\u00ed\u00ff6\u0004\u007f5\u00b5\b~\u001f\u00ad\u0084\u0085\u00d0\u00a9\u00f1\u00bedS?e\u00ea\u00c3\b\u0096l\u00eee\u00e0\u00eb[\u0017hO\t\u00d1E\u00db\u00e4\u009aW\u0004\u0014D\u00b1\u0096F\u00e3\u0017\u0098\u008f\u00d5\u00fd{\u00e0\u0086\u0084\u0002\u0093\u0093\u00db\u00e3f:\u00f8l'\u00f6\u00b6\u00de66\u00d2\u00142#\u00f3\u00d6\u00c3\u00b4D\u00b3*\u001fSrs\u00e4\u00bfT)\u0086\u00d4\u0086\u0006\u0081\u007f\u00e9\u009c'p\u00c2ELR\u0010E\u00ac3\u00e8\u00a3\f\u00a52r\u00e7\u0000\u00f4M\u00df\u0091;\u00a1tj5\u00a7;\u00cfdf\u00f5h\u00c2\u008b\u00f5)P\u00d0&\u0002A\u001a\r-Y#\u00c4\u00e2\u00ce\u008e\r\u007f\u0006B\u00cd\u0085\u00fcZu+)\u0083\u00e1S\\\u00cf1\u00c8\u009a\u0007\u001f\u00ea}\u00c9\u00b2b}\u00d5)\u00fb\u00e6\u00f2\u00b3\u00fe\u00da\u0090\u00b2i(\u00bb0\u00b5>\u0004\u00a0\u00d0\u00014K[\u00f5WA\u00d7\u001e5\u0086M8k2\u0010\u0081te\u00c7}\u00f3xo\u0013K\u00b8\u0010\u00ce\u00fe\u00a7\u00f9\u00d9/\u0015\u00fa\u008c@\u00c2\u00ee\u00e3{5%\u00a7\u00ad<\u0081\u009f\u000f\u0099\u00c5m\u00f8\u008ab\u00d8\u007f\u00bd\u001a)\u007f\u00fd\u00bdH\u00b9i\u00f2\u00cc(]a\u00a3u1F\u0095>\n\u00ea\u00f3\u009a\u009a\u00bc\u0086\u0003\u00e8o\\\u0011E>\u00d8\u00f4\u00b9\u00fe\u0099'\u0090\u0088&\u00adL\u0089*\u00f2\u009d\u008b1\u0088\u001b\u0081[\u0005\u008a2\u001e\u00a6\u00a0Je>f\u008e\u00a1\u00ad\u008b\u00be\u00f8\u00e5\u0000\u00f2`'\u008eb\u00bfz\u008a\u0002uY\u00e7\u008a\u000f\u00b1_q\u00aa\u0002\u001f(+\tr\u008d\u00ac\u0095\u00fdg\u00c7m\u00f3\u00ac\u00de\u00d9\u00b3\u00ed\u00ee\u00a1\u00f5\u00a4\u00feV\u0016\u00e7\u008a\u00a2\u00c2X1\u00f4".length();
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
                    var4_14 = "\u00b5\u0085\u00d6\u00fe\u008a\u0083qz\u0089^\u0018\u0084\u00b3\u0002\u0089\\";
                    var5_15 = "\u00b5\u0085\u00d6\u00fe\u008a\u0083qz\u0089^\u0018\u0084\u00b3\u0002\u0089\\".length();
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
        CP_yx.b = var6_12;
        CP_yx.c = new Integer[55];
        CP_yx.TELEPORT_CONFIRM = new CP_yx();
        CP_yx.TAB_COMPLETE = new CP_yx();
        CP_yx.CHAT_MESSAGE = new CP_yx();
        CP_yx.CLIENT_STATUS = new CP_yx();
        CP_yx.CLIENT_SETTINGS = new CP_yx();
        CP_yx.WINDOW_CONFIRMATION = new CP_yx();
        CP_yx.CLICK_WINDOW_BUTTON = new CP_yx();
        CP_yx.CLICK_WINDOW = new CP_yx();
        CP_yx.CLOSE_WINDOW = new CP_yx();
        CP_yx.PLUGIN_MESSAGE = new CP_yx();
        CP_yx.INTERACT_ENTITY = new CP_yx();
        CP_yx.KEEP_ALIVE = new CP_yx();
        CP_yx.PLAYER_FLYING = new CP_yx();
        CP_yx.PLAYER_POSITION = new CP_yx();
        CP_yx.PLAYER_POSITION_AND_ROTATION = new CP_yx();
        CP_yx.PLAYER_ROTATION = new CP_yx();
        CP_yx.VEHICLE_MOVE = new CP_yx();
        CP_yx.STEER_BOAT = new CP_yx();
        CP_yx.CRAFT_RECIPE_REQUEST = new CP_yx();
        CP_yx.PLAYER_ABILITIES = new CP_yx();
        CP_yx.PLAYER_DIGGING = new CP_yx();
        CP_yx.ENTITY_ACTION = new CP_yx();
        CP_yx.STEER_VEHICLE = new CP_yx();
        CP_yx.RECIPE_BOOK_DATA = new CP_yx();
        CP_yx.RESOURCE_PACK_STATUS = new CP_yx();
        CP_yx.ADVANCEMENT_TAB = new CP_yx();
        CP_yx.HELD_ITEM_CHANGE = new CP_yx();
        CP_yx.CREATIVE_INVENTORY_ACTION = new CP_yx();
        CP_yx.UPDATE_SIGN = new CP_yx();
        CP_yx.ANIMATION = new CP_yx();
        CP_yx.SPECTATE = new CP_yx();
        CP_yx.PLAYER_BLOCK_PLACEMENT = new CP_yx();
        CP_yx.USE_ITEM = new CP_yx();
        CP_yx.CP_y = CP_yx.CP_e();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xEB5;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_yx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_yx.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_yx.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_yx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_yx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

