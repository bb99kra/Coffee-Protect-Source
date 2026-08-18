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

public final class CP_i7
extends Enum<CP_i7> {
    public static final /* enum */ CP_i7 TELEPORT_CONFIRM;
    public static final /* enum */ CP_i7 QUERY_BLOCK_NBT;
    public static final /* enum */ CP_i7 SET_DIFFICULTY;
    public static final /* enum */ CP_i7 CHAT_MESSAGE;
    public static final /* enum */ CP_i7 CLIENT_STATUS;
    public static final /* enum */ CP_i7 CLIENT_SETTINGS;
    public static final /* enum */ CP_i7 TAB_COMPLETE;
    public static final /* enum */ CP_i7 WINDOW_CONFIRMATION;
    public static final /* enum */ CP_i7 CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_i7 CLICK_WINDOW;
    public static final /* enum */ CP_i7 CLOSE_WINDOW;
    public static final /* enum */ CP_i7 PLUGIN_MESSAGE;
    public static final /* enum */ CP_i7 EDIT_BOOK;
    public static final /* enum */ CP_i7 QUERY_ENTITY_NBT;
    public static final /* enum */ CP_i7 INTERACT_ENTITY;
    public static final /* enum */ CP_i7 GENERATE_STRUCTURE;
    public static final /* enum */ CP_i7 KEEP_ALIVE;
    public static final /* enum */ CP_i7 LOCK_DIFFICULTY;
    public static final /* enum */ CP_i7 PLAYER_POSITION;
    public static final /* enum */ CP_i7 PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_i7 PLAYER_ROTATION;
    public static final /* enum */ CP_i7 PLAYER_FLYING;
    public static final /* enum */ CP_i7 VEHICLE_MOVE;
    public static final /* enum */ CP_i7 STEER_BOAT;
    public static final /* enum */ CP_i7 PICK_ITEM;
    public static final /* enum */ CP_i7 CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_i7 PLAYER_ABILITIES;
    public static final /* enum */ CP_i7 PLAYER_DIGGING;
    public static final /* enum */ CP_i7 ENTITY_ACTION;
    public static final /* enum */ CP_i7 STEER_VEHICLE;
    public static final /* enum */ CP_i7 RECIPE_BOOK_DATA;
    public static final /* enum */ CP_i7 NAME_ITEM;
    public static final /* enum */ CP_i7 RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_i7 ADVANCEMENT_TAB;
    public static final /* enum */ CP_i7 SELECT_TRADE;
    public static final /* enum */ CP_i7 SET_BEACON_EFFECT;
    public static final /* enum */ CP_i7 HELD_ITEM_CHANGE;
    public static final /* enum */ CP_i7 UPDATE_COMMAND_BLOCK;
    public static final /* enum */ CP_i7 UPDATE_COMMAND_BLOCK_MINECART;
    public static final /* enum */ CP_i7 CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_i7 UPDATE_JIGSAW_BLOCK;
    public static final /* enum */ CP_i7 UPDATE_STRUCTURE_BLOCK;
    public static final /* enum */ CP_i7 UPDATE_SIGN;
    public static final /* enum */ CP_i7 ANIMATION;
    public static final /* enum */ CP_i7 SPECTATE;
    public static final /* enum */ CP_i7 PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_i7 USE_ITEM;
    private static final /* synthetic */ CP_i7[] CP_a;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_i7[] values() {
        return (CP_i7[])CP_a.clone();
    }

    public static CP_i7 valueOf(String string) {
        return Enum.valueOf(CP_i7.class, string);
    }

    private static /* synthetic */ CP_i7[] CP_W() {
        long l = a ^ 0x287E6A8CA0A7L;
        CP_i7[] ilIli7Array = new CP_i7[CP_i7.a("k", (int)1801, (long)(0x2C4FB9F337D669C2L ^ l))];
        ilIli7Array[0] = TELEPORT_CONFIRM;
        ilIli7Array[1] = QUERY_BLOCK_NBT;
        ilIli7Array[2] = SET_DIFFICULTY;
        ilIli7Array[3] = CHAT_MESSAGE;
        ilIli7Array[4] = CLIENT_STATUS;
        ilIli7Array[5] = CLIENT_SETTINGS;
        ilIli7Array[CP_i7.a("k", (int)3975, (long)(0x30CAF928D750612CL ^ l))] = TAB_COMPLETE;
        ilIli7Array[CP_i7.a("k", (int)16893, (long)(0x3A1AB88544012F74L ^ l))] = WINDOW_CONFIRMATION;
        ilIli7Array[CP_i7.a("k", (int)28308, (long)(0x50E1374CF7EA805DL ^ l))] = CLICK_WINDOW_BUTTON;
        ilIli7Array[CP_i7.a("k", (int)18580, (long)(0x4B3FC4943C332603L ^ l))] = CLICK_WINDOW;
        ilIli7Array[CP_i7.a("k", (int)32214, (long)(0x21E7A7A6F3E51375L ^ l))] = CLOSE_WINDOW;
        ilIli7Array[CP_i7.a("k", (int)1977, (long)(0x31675AE604416927L ^ l))] = PLUGIN_MESSAGE;
        ilIli7Array[CP_i7.a("k", (int)26654, (long)(0x10FEDC4D547B06A5L ^ l))] = EDIT_BOOK;
        ilIli7Array[CP_i7.a("k", (int)6573, (long)(0x1CAF71D35D457736L ^ l))] = QUERY_ENTITY_NBT;
        ilIli7Array[CP_i7.a("k", (int)9021, (long)(0x14AFC92A0737CDBAL ^ l))] = INTERACT_ENTITY;
        ilIli7Array[CP_i7.a("k", (int)23237, (long)(0x4D47D4C6117CB401L ^ l))] = GENERATE_STRUCTURE;
        ilIli7Array[CP_i7.a("k", (int)27297, (long)(0x35952587E5848469L ^ l))] = KEEP_ALIVE;
        ilIli7Array[CP_i7.a("k", (int)23995, (long)(0x2B40D19C79B0331DL ^ l))] = LOCK_DIFFICULTY;
        ilIli7Array[CP_i7.a("k", (int)4044, (long)(0x153FE3D3BB85617CL ^ l))] = PLAYER_POSITION;
        ilIli7Array[CP_i7.a("k", (int)25345, (long)(0x1D26FFF73A0D0DB2L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIli7Array[CP_i7.a("k", (int)6150, (long)(0x74C6B22BDE37F6C5L ^ l))] = PLAYER_ROTATION;
        ilIli7Array[CP_i7.a("k", (int)4675, (long)(0x7DA2B85E9ACFFC8DL ^ l))] = PLAYER_FLYING;
        ilIli7Array[CP_i7.a("k", (int)18927, (long)(0x3FE8A81DE047A740L ^ l))] = VEHICLE_MOVE;
        ilIli7Array[CP_i7.a("k", (int)1395, (long)(0x796AE5E224236BE6L ^ l))] = STEER_BOAT;
        ilIli7Array[CP_i7.a("k", (int)19820, (long)(0x7E0C68502563A3C1L ^ l))] = PICK_ITEM;
        ilIli7Array[CP_i7.a("k", (int)25505, (long)(0x149305326E890D08L ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIli7Array[CP_i7.a("k", (int)16926, (long)(0x1C912C80C2BEAC9DL ^ l))] = PLAYER_ABILITIES;
        ilIli7Array[CP_i7.a("k", (int)28299, (long)(0x13425651036D002AL ^ l))] = PLAYER_DIGGING;
        ilIli7Array[CP_i7.a("k", (int)7899, (long)(0xBD88BCB39FFF042L ^ l))] = ENTITY_ACTION;
        ilIli7Array[CP_i7.a("k", (int)11336, (long)(0x35C226226D1E4282L ^ l))] = STEER_VEHICLE;
        ilIli7Array[CP_i7.a("k", (int)10660, (long)(0x22CAD65F679B4768L ^ l))] = RECIPE_BOOK_DATA;
        ilIli7Array[CP_i7.a("k", (int)12014, (long)(0x989011E694E404BL ^ l))] = NAME_ITEM;
        ilIli7Array[CP_i7.a("k", (int)26312, (long)(0x1607E3B3B828805L ^ l))] = RESOURCE_PACK_STATUS;
        ilIli7Array[CP_i7.a("k", (int)14622, (long)(0x67F4B9BCA2635781L ^ l))] = ADVANCEMENT_TAB;
        ilIli7Array[CP_i7.a("k", (int)10986, (long)(0x5AEE761F79944455L ^ l))] = SELECT_TRADE;
        ilIli7Array[CP_i7.a("k", (int)17191, (long)(0x1DDC431F2E292D8DL ^ l))] = SET_BEACON_EFFECT;
        ilIli7Array[CP_i7.a("k", (int)15380, (long)(0x369E8332906F52A9L ^ l))] = HELD_ITEM_CHANGE;
        ilIli7Array[CP_i7.a("k", (int)24167, (long)(0x78739372182AB0E9L ^ l))] = UPDATE_COMMAND_BLOCK;
        ilIli7Array[CP_i7.a("k", (int)24848, (long)(0x2C3DA1D124788FACL ^ l))] = UPDATE_COMMAND_BLOCK_MINECART;
        ilIli7Array[CP_i7.a("k", (int)5911, (long)(0x23EEB79209F379A0L ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIli7Array[CP_i7.a("k", (int)12329, (long)(0x75F56174CAF45EF1L ^ l))] = UPDATE_JIGSAW_BLOCK;
        ilIli7Array[CP_i7.a("k", (int)12139, (long)(0x20C7585F62D1C1C9L ^ l))] = UPDATE_STRUCTURE_BLOCK;
        ilIli7Array[CP_i7.a("k", (int)931, (long)(0x7D5D9BC9B9CD6D3BL ^ l))] = UPDATE_SIGN;
        ilIli7Array[CP_i7.a("k", (int)17122, (long)(0x2C622354FA22C6FL ^ l))] = ANIMATION;
        ilIli7Array[CP_i7.a("k", (int)29209, (long)(0x7578D1A6CC7A1C9DL ^ l))] = SPECTATE;
        ilIli7Array[CP_i7.a("k", (int)18731, (long)(0x2B006198FB7627EDL ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIli7Array[CP_i7.a("k", (int)29595, (long)(0x628080804F491D5AL ^ l))] = USE_ITEM;
        return ilIli7Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_i7.a = CP_s.a(-6717263758777527384L, -448454812367439680L, MethodHandles.lookup().lookupClass()).a(33048870880177L);
                        var20 = CP_i7.a ^ 126394309529443L;
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
                        var11_3 = new String[47];
                        var17_4 = 0;
                        var16_5 = "}$\u00f5\u00ee\u00c5\u00f9\u0089>\u0091\u00edz\u0080e\u0005\u009e\u00e8\u0018\u0011\u00cf\u00fe\u0098)c\u00c4\u00f4\u00a8@\u00c2W?\u008c\u00bc7]\u00e7F\\di\\\u0080\u0018\u00ea'\u00aeA\u00a2\u008f\u009a'\u0096\u00b5\u00f9\u0099\u00a6\u00b8\u0000\u008b\u0082b$\u001d\u009a\u000b\u00edp\u0018\u00be\u008fh\u00dcBR$\fQ\u008e\u008c\u0000'\r\u00c6l\u00e1\u009a|m\u00f1p\u00bd\u00da\u00104\u00df\u00b9O\u00e1z)\u00a3\u0090\u00cf\u00c0(T/\u00f1\u001d\u0010}\u00bf}\u00edRe\u0085\rH\u0006)\u00b1=\u0080@\u0080\u0010}\u00de0Hq\u00a0\u00c0\f\u0012\u00ae\u00dd\u00cfh\u00ee\u00e7f\u0010\u007f\u0082e`\u000ej\u00b1\u001fD\u00fb5\u00cc(\u001eu\u001b ,\u00bd\u00c4\u0015\u00ed\u0015\u00b9\u00f0\u00fd\u009e\u00f6\u00d7\u001d.b\u0094\u00d7\u00f9'\r\u00c98\u0003\u00e0\u00dcIt\u0091\u0000(*o\u0018\u00d9;[0\u00d5\u009c\u0012\u009a\u00f9\u0084\u00c3\u0099\u009f\u00b6'c\u00bc\u00ea@\u00acJw\u001d!\u0010\u000b\u00abI\u009cb\u008dR1!\u00f5O\u0011_\u00efD1\u0010ku.\f\u00abm\u00f3\u00bd\u00e7\u00da#|$\u007f\u00ac\t\u0010\u000f\u00a6\u008b\u00c6\u00a24\u00f0\u001a-\u0088\u00a06~\u0098'\u00ae\u0018\u00c1\u001eb\u00c1\u001c(\u00ff\u001d\u0007\u001d\u00dc\u00ab\u0000\u008b\u00c5\u0089\u008fg9u\u009ct\u0097O\u0010.\u00bb &\u00ea+>\u0099\u00c5.\u00e5qy,\u00ba\u00a7\u0010\u00eb\u00b9\u00c9\u00b5#\u00a9M\u00f5I\u00d0\u0012O.?\u0015\u00a1\u0010\u00a2\u00ba\u0083\u008avE\u00e37\u00b1|*\u001cZt\r\u0081\u0018\u009b\u00efe\u00c8\u00b1z\u0084\u001b\u0001\u00f8\u0016l\u00ea!q\u00f7\u009e\u00f4\u00af)\u00a1\u0081h\u00fb\u0010\u00c4\u00a4\u0013\u00cd\u00ea\u001c\u00be\u00c2\u00a7\u0081[B\u00d0\u00f1\n\u00fd\u0018\u00bf\u00cbo3\u00e1\u008b\u001b\u00fb\u009b\u009a\u0017\u00f7?s\u00f3K\u00da\u00a2W\u00972\u00b4\u0090\u00db\u0010\u009b\u00efe\u00c8\u00b1z\u0084\u001b\u00d17\u00fa\u00a4cy\u00fb\u00f8\u0010\u00c1\u00fd#\u00ee2\u00ec\u007f\u00b7n\u00d9\u00b2\u00dc\u0007*\u0090\u0019\u0010\u00ee\u001b\u00d6\u009cw\u0080\u008d\u00ee\u009e \u00cd?:\u00aa\u00ca \u0010\"\u00a8\u00e4\u001f\u00cf-\u00c5\u00bd\u0082\u00a3\u00ea\u00ad\u00e7\u00dd\u00bdS\u0018\u0087h\u008bo\u0097`\u00e16\t\u0016(\u009d4 \u00cc4[\u00b3\u00e7\u0000?\u00d8HJ\u0018\u00b4;\u0085\u00ca\u00ea\u00aa\u00a8\u009e\u001d7\u00fc*\u00f0\u00b7\u008f\u00cc}C]\u00d0\u007f0?\u00df\u0010\\6\u00a7\u0098\u00ad\u008bc\u0084c]\u001d\u00fd_\u00c2}\u00f7\u0010\u009c\u00ec&9\u0092\u009fd\u00bf\u00cd\u0011\u0090r\u00a7Vs\u00de\u0010\f\u008c!;f\u000f\u00a1\u0083\u00b4}\u000fT\u0092\u00ab\f\u000f\u0010\u00e5\u00ceA3\u009d\u00ed\u0006\b|\u00a2\u00c0\u00ba=\u00de\u00fe\u009c\u0018B\u00e8z\u00ae\u00ce\u00d0\u00daE\u00ee\u0005\u00f0\u008c\u001b\u00c6\u00bf\u00b5\u00ce\u00ed\u0082\u00e8\u00e1BW\u00a9\u0010\u00a4X\u0096\u0004&\u008f\u0000g\u00c6s\u0085B\nJ\u00832\u0010o\u00fd\u00ddA\u000f\u0095aD\u00fdbuC\u00a9\u00bcu\u0082\u0010\u0001\u00e2\u001dU'\u0093:\u00afm\u007f\u00b5\u00e8\u00fa\u00ecI)\u0010\u00be\u008fh\u00dcBR$\f\u0012\u0091\u00e1\u0000\u00c7\u0082\u00da6\u0018\u0094\u00db(/\u0083\u00f4\u00deBf\u00ed\u00a1i\u00df\u00bf\u00b4\u00deep(Ze\u001e\u008b\u0082\u0010_\u001a\u009e\u008a'.\u00b9\u009e\u0084C\u0098Za\u0002\u00c2?\u0010F\u00b0+X\\\u008c\u00fbT\u0093\u00b9`;\u00e7?\u00d7\u009f\u00100h\u00f1\u000e\u0019\u00d2]uv\u00d8\u00c0b\r -Q\u0018J\u000f\u00d5\u00af\u00dd\u00ee\u0085\u00d9\u0094H\u00b31\u008e?\u0081|5\u00903\u00b6\u00c9\u00dcJq B\u00e8z\u00ae\u00ce\u00d0\u00daE\u00ee\u0005\u00f0\u008c\u001b\u00c6\u00bf\u00b5\u00ec\u0002\u00d3\b\u00c6\u009b\u00b5s\u0089\u009d.H\u00e1\u0085\u00b3\u00c0\u0018\u000f:\u00beV\u00f7!\tA\u00d2\u0084\u0013\u00fc0@\u009c\u00bc\u00ad?\u00b9\u00fb~\u00bdU\u00c5\u0010TC\u00a9\u008b\u0085\u00bec\u0016\u0017[L\u00d41\u00ccY\u00ed\u0010ku.\f\u00abm\u00f3\u00bd\u00e2\u0092\u001e\u00ab5T\u008b\u00f5\u00184\u00c5\u00ed\u0096;~\u00aeqWd\u0010pGT\u0000w\u00a759\u0000>E\u0093}";
                        var18_6 = "}$\u00f5\u00ee\u00c5\u00f9\u0089>\u0091\u00edz\u0080e\u0005\u009e\u00e8\u0018\u0011\u00cf\u00fe\u0098)c\u00c4\u00f4\u00a8@\u00c2W?\u008c\u00bc7]\u00e7F\\di\\\u0080\u0018\u00ea'\u00aeA\u00a2\u008f\u009a'\u0096\u00b5\u00f9\u0099\u00a6\u00b8\u0000\u008b\u0082b$\u001d\u009a\u000b\u00edp\u0018\u00be\u008fh\u00dcBR$\fQ\u008e\u008c\u0000'\r\u00c6l\u00e1\u009a|m\u00f1p\u00bd\u00da\u00104\u00df\u00b9O\u00e1z)\u00a3\u0090\u00cf\u00c0(T/\u00f1\u001d\u0010}\u00bf}\u00edRe\u0085\rH\u0006)\u00b1=\u0080@\u0080\u0010}\u00de0Hq\u00a0\u00c0\f\u0012\u00ae\u00dd\u00cfh\u00ee\u00e7f\u0010\u007f\u0082e`\u000ej\u00b1\u001fD\u00fb5\u00cc(\u001eu\u001b ,\u00bd\u00c4\u0015\u00ed\u0015\u00b9\u00f0\u00fd\u009e\u00f6\u00d7\u001d.b\u0094\u00d7\u00f9'\r\u00c98\u0003\u00e0\u00dcIt\u0091\u0000(*o\u0018\u00d9;[0\u00d5\u009c\u0012\u009a\u00f9\u0084\u00c3\u0099\u009f\u00b6'c\u00bc\u00ea@\u00acJw\u001d!\u0010\u000b\u00abI\u009cb\u008dR1!\u00f5O\u0011_\u00efD1\u0010ku.\f\u00abm\u00f3\u00bd\u00e7\u00da#|$\u007f\u00ac\t\u0010\u000f\u00a6\u008b\u00c6\u00a24\u00f0\u001a-\u0088\u00a06~\u0098'\u00ae\u0018\u00c1\u001eb\u00c1\u001c(\u00ff\u001d\u0007\u001d\u00dc\u00ab\u0000\u008b\u00c5\u0089\u008fg9u\u009ct\u0097O\u0010.\u00bb &\u00ea+>\u0099\u00c5.\u00e5qy,\u00ba\u00a7\u0010\u00eb\u00b9\u00c9\u00b5#\u00a9M\u00f5I\u00d0\u0012O.?\u0015\u00a1\u0010\u00a2\u00ba\u0083\u008avE\u00e37\u00b1|*\u001cZt\r\u0081\u0018\u009b\u00efe\u00c8\u00b1z\u0084\u001b\u0001\u00f8\u0016l\u00ea!q\u00f7\u009e\u00f4\u00af)\u00a1\u0081h\u00fb\u0010\u00c4\u00a4\u0013\u00cd\u00ea\u001c\u00be\u00c2\u00a7\u0081[B\u00d0\u00f1\n\u00fd\u0018\u00bf\u00cbo3\u00e1\u008b\u001b\u00fb\u009b\u009a\u0017\u00f7?s\u00f3K\u00da\u00a2W\u00972\u00b4\u0090\u00db\u0010\u009b\u00efe\u00c8\u00b1z\u0084\u001b\u00d17\u00fa\u00a4cy\u00fb\u00f8\u0010\u00c1\u00fd#\u00ee2\u00ec\u007f\u00b7n\u00d9\u00b2\u00dc\u0007*\u0090\u0019\u0010\u00ee\u001b\u00d6\u009cw\u0080\u008d\u00ee\u009e \u00cd?:\u00aa\u00ca \u0010\"\u00a8\u00e4\u001f\u00cf-\u00c5\u00bd\u0082\u00a3\u00ea\u00ad\u00e7\u00dd\u00bdS\u0018\u0087h\u008bo\u0097`\u00e16\t\u0016(\u009d4 \u00cc4[\u00b3\u00e7\u0000?\u00d8HJ\u0018\u00b4;\u0085\u00ca\u00ea\u00aa\u00a8\u009e\u001d7\u00fc*\u00f0\u00b7\u008f\u00cc}C]\u00d0\u007f0?\u00df\u0010\\6\u00a7\u0098\u00ad\u008bc\u0084c]\u001d\u00fd_\u00c2}\u00f7\u0010\u009c\u00ec&9\u0092\u009fd\u00bf\u00cd\u0011\u0090r\u00a7Vs\u00de\u0010\f\u008c!;f\u000f\u00a1\u0083\u00b4}\u000fT\u0092\u00ab\f\u000f\u0010\u00e5\u00ceA3\u009d\u00ed\u0006\b|\u00a2\u00c0\u00ba=\u00de\u00fe\u009c\u0018B\u00e8z\u00ae\u00ce\u00d0\u00daE\u00ee\u0005\u00f0\u008c\u001b\u00c6\u00bf\u00b5\u00ce\u00ed\u0082\u00e8\u00e1BW\u00a9\u0010\u00a4X\u0096\u0004&\u008f\u0000g\u00c6s\u0085B\nJ\u00832\u0010o\u00fd\u00ddA\u000f\u0095aD\u00fdbuC\u00a9\u00bcu\u0082\u0010\u0001\u00e2\u001dU'\u0093:\u00afm\u007f\u00b5\u00e8\u00fa\u00ecI)\u0010\u00be\u008fh\u00dcBR$\f\u0012\u0091\u00e1\u0000\u00c7\u0082\u00da6\u0018\u0094\u00db(/\u0083\u00f4\u00deBf\u00ed\u00a1i\u00df\u00bf\u00b4\u00deep(Ze\u001e\u008b\u0082\u0010_\u001a\u009e\u008a'.\u00b9\u009e\u0084C\u0098Za\u0002\u00c2?\u0010F\u00b0+X\\\u008c\u00fbT\u0093\u00b9`;\u00e7?\u00d7\u009f\u00100h\u00f1\u000e\u0019\u00d2]uv\u00d8\u00c0b\r -Q\u0018J\u000f\u00d5\u00af\u00dd\u00ee\u0085\u00d9\u0094H\u00b31\u008e?\u0081|5\u00903\u00b6\u00c9\u00dcJq B\u00e8z\u00ae\u00ce\u00d0\u00daE\u00ee\u0005\u00f0\u008c\u001b\u00c6\u00bf\u00b5\u00ec\u0002\u00d3\b\u00c6\u009b\u00b5s\u0089\u009d.H\u00e1\u0085\u00b3\u00c0\u0018\u000f:\u00beV\u00f7!\tA\u00d2\u0084\u0013\u00fc0@\u009c\u00bc\u00ad?\u00b9\u00fb~\u00bdU\u00c5\u0010TC\u00a9\u008b\u0085\u00bec\u0016\u0017[L\u00d41\u00ccY\u00ed\u0010ku.\f\u00abm\u00f3\u00bd\u00e2\u0092\u001e\u00ab5T\u008b\u00f5\u00184\u00c5\u00ed\u0096;~\u00aeqWd\u0010pGT\u0000w\u00a759\u0000>E\u0093}".length();
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
                            var11_3[var17_4++] = CP_i7.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u007f\u0082e`\u000ej\u00b1\u001f\u00bf0\u00d2|\u00a6\u00a8G\u00b6Lx'AK\u0082G*\u00dbd:TK\u0082\u0000\u0082\u0018\u0099\u001a\u0088\u00cdZ\u00d5v}\u009e\u0099\u00d63D\u00d0\u00de{\u0016=\u00ef!\u00b1\u0012\"g";
                            var18_6 = "\u007f\u0082e`\u000ej\u00b1\u001f\u00bf0\u00d2|\u00a6\u00a8G\u00b6Lx'AK\u0082G*\u00dbd:TK\u0082\u0000\u0082\u0018\u0099\u001a\u0088\u00cdZ\u00d5v}\u009e\u0099\u00d63D\u00d0\u00de{\u0016=\u00ef!\u00b1\u0012\"g".length();
                            var15_7 = 32;
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
                            var11_3[var17_4++] = CP_i7.a(var19_9).intern();
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
                CP_i7.d = new HashMap<K, V>(13);
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
                var6_12 = new long[83];
                var3_13 = 0;
                var4_14 = "\u009c\u00d5\u0001\";\u00a8D\u0089\u00b3\u00dd\u00e1\u00b9\u00eb\u00ba\u007f\u00d2G\u0095|)\u00ad\u00b2r\u00e8\u00b80\u00db\u00e6p\u0010\u00dd\u0093\u0083\u0006\u008e<=\u0017\u0086\u00a2\u00ac\u00b2\u00c1\u0006\u00d0\u00140v0~\u00ad\u000b4\u0085q\u00ad\u0083\u001d\u00ec\u008d\u00e4\u0084\u00efn\u00d2\u00bf\u0018\u00bb\u00de&\u0083\u00d2\u0013\u008e\u00af\u00fd\u00fcN\u00e9\u00e6\u0012ee\u007f\u00e6\n\u00a4i\u00fb\rD\u00cc>\u00a9<\u00e2*F\u0096\"\u0098(\u008c\u00b4{\u0084\u009f\u00e8\u00d6\u00c7\u00d4,\u00a5\u00bb\u00d1\u0005\u0083\u00ac\u0005[;\u0000h\u00ca2\u00c0\t<\u00de\u00a8\u00ab@E#\u00ba\u00ef[\u001a!No\u0092g\u0098Cs\u0099\u009c\u0006\u009bv6\u00c3|u_\b\u00c6r\u009fj\u0098\u00b5\u007f-\u00cd\u00ce\u00d3QH5\u00ca\u0016R\u00f4\t\u00e1\u00d8\u00f5\u00c9\u009e\u00e0\u009c7\u0088\u0004$\u00c7}wf\u00dd\u00ac\u008c\u008b\u00f4\u00b2\u00ce\u00a2H\u00a8}pAA\u00d6\u0080\u00de\u00cb\u0014\u00b2\u00b0}\u00c0\u0015o%*voH?\u00f9\u00fe{\u00c2\u00cb\u0094\u00ee\u00ad\u00aeP\u008bo~\u00a8\u00dd\u00bblAT\t<\u0002\u000f\u00f2\u00d3\u00cc\u008df&~\u00f0\u009b\u00a2\u00cdr\u0007\u00cd\u00a8\u00b1I\u0096\u0098\u001e\u00ff\u008f\u00b7\u00e1\u00d6\u000b-\u0001\u000f\u00ee\u0093\u008d\"Wtb\u0012N\u00fa\b\u0003\u0093\u00f2\u00f7W\u0082\u00165g\u00d3\u0002\u0080\u00f7S/\u0005~\u0012>\u0016\u00d3\u00cbUHD\u00d1\u0005\u00a6\u00fd\u00ad\u00ef%\u00fa\u00cb\u00175\u001dR\u00c9\u0016*cX+\u0017\u00b1\u00c0R\u00a8q\r\u00e2\u000f\u00bf\u00b5\t\u0082\u00f0p\u00d2pU\u00da\u0015\u00fbr\u00d2\u00fb\u00bb\u00f1\u0019`\u00ac\u00b2H]\u00da\u00cf\u00b9\u00a9\u00c7\u00ae\u00d8\u00f2\u0097\u00f2\u0088\u0099\u00d7\u00e1d\u00d4\u00b1\u008c7s\u008fG\u00b2\u00c7/\u00e7Z\u00e0\u00d7Mp\u00fe>\u0093J\u001b\u00ab\u009b\u00ef\u009a\u00dc\u00ce\u00b1\u0095\u00d3Y\u00d4\u00b1-H\u00b4({\u00db\u0089\u0098\u0082\u00ee\u0013<`#\u00ac:\u0001\u007fhG\u00bb3\u00e2\u00fa\u00f0*\u00be\u00dd\u00b4\f\u00c3\u00cfd\u00e8p<\b\u00bb+\u009d\u0086\u008f\u00c3\u00fe\u0000\u00de\u00c2\u00d6\u009f\u008f\u00ac\u0088ES\u00a3!\u009c\u0085\u00be\u009a\u0092C\u00ed\u00a2\u00d6\u009dg\u00a1t\u00c4b0\u0004`\u00db\u00f1A\u0095\u00c5G\u0080\u0013\u000fA\u00bb\u00eb\u0000U{\u00ba\u00d8l\u00a3\u00b9L\u00a2\u0084\u00d4\u00ceQ\u0017\u0081\u00ba\u0003\u001b&`\u00db\u00faI\u0088\u00f0\u00dblI~\u0010b\fE\u00fe-F\u0018[\u00cb\u00b3SX\u00bb\u00faI\u00d0$\u0005Ft?\u008e\u00de\u00d5\u00a8\u00f8\u00b5\u00bf\u00f6\u00af\u008dr\u0002\u00c6o\u00b8@\u00e2b1v\u0085#8\bc\nb3]\u0088S\u00f3,~\u00f3\u00da\u00a8a\u00cfj\u0019\u00b4\u00ca\u00b0\u00ae\n\u00ed\u00eex\u0095\u00dcI\n1\u00d8\u0014\u00cf\u0086\u00c8\u009b}\u00f3\u0094\u00cc\u00ab\\\u00e8\u0011P9\u0093]\f\u00f8K\u00f0\u00e9\u00d2\u001d\u0002\u00e1\u00e9h\u00fc\u00c5\u008dC\u001a\u00d8\u00a7Y\u0092\u0082z\u00ca\u00d6\bH\u0090\u00eb\u00ef";
                var5_15 = "\u009c\u00d5\u0001\";\u00a8D\u0089\u00b3\u00dd\u00e1\u00b9\u00eb\u00ba\u007f\u00d2G\u0095|)\u00ad\u00b2r\u00e8\u00b80\u00db\u00e6p\u0010\u00dd\u0093\u0083\u0006\u008e<=\u0017\u0086\u00a2\u00ac\u00b2\u00c1\u0006\u00d0\u00140v0~\u00ad\u000b4\u0085q\u00ad\u0083\u001d\u00ec\u008d\u00e4\u0084\u00efn\u00d2\u00bf\u0018\u00bb\u00de&\u0083\u00d2\u0013\u008e\u00af\u00fd\u00fcN\u00e9\u00e6\u0012ee\u007f\u00e6\n\u00a4i\u00fb\rD\u00cc>\u00a9<\u00e2*F\u0096\"\u0098(\u008c\u00b4{\u0084\u009f\u00e8\u00d6\u00c7\u00d4,\u00a5\u00bb\u00d1\u0005\u0083\u00ac\u0005[;\u0000h\u00ca2\u00c0\t<\u00de\u00a8\u00ab@E#\u00ba\u00ef[\u001a!No\u0092g\u0098Cs\u0099\u009c\u0006\u009bv6\u00c3|u_\b\u00c6r\u009fj\u0098\u00b5\u007f-\u00cd\u00ce\u00d3QH5\u00ca\u0016R\u00f4\t\u00e1\u00d8\u00f5\u00c9\u009e\u00e0\u009c7\u0088\u0004$\u00c7}wf\u00dd\u00ac\u008c\u008b\u00f4\u00b2\u00ce\u00a2H\u00a8}pAA\u00d6\u0080\u00de\u00cb\u0014\u00b2\u00b0}\u00c0\u0015o%*voH?\u00f9\u00fe{\u00c2\u00cb\u0094\u00ee\u00ad\u00aeP\u008bo~\u00a8\u00dd\u00bblAT\t<\u0002\u000f\u00f2\u00d3\u00cc\u008df&~\u00f0\u009b\u00a2\u00cdr\u0007\u00cd\u00a8\u00b1I\u0096\u0098\u001e\u00ff\u008f\u00b7\u00e1\u00d6\u000b-\u0001\u000f\u00ee\u0093\u008d\"Wtb\u0012N\u00fa\b\u0003\u0093\u00f2\u00f7W\u0082\u00165g\u00d3\u0002\u0080\u00f7S/\u0005~\u0012>\u0016\u00d3\u00cbUHD\u00d1\u0005\u00a6\u00fd\u00ad\u00ef%\u00fa\u00cb\u00175\u001dR\u00c9\u0016*cX+\u0017\u00b1\u00c0R\u00a8q\r\u00e2\u000f\u00bf\u00b5\t\u0082\u00f0p\u00d2pU\u00da\u0015\u00fbr\u00d2\u00fb\u00bb\u00f1\u0019`\u00ac\u00b2H]\u00da\u00cf\u00b9\u00a9\u00c7\u00ae\u00d8\u00f2\u0097\u00f2\u0088\u0099\u00d7\u00e1d\u00d4\u00b1\u008c7s\u008fG\u00b2\u00c7/\u00e7Z\u00e0\u00d7Mp\u00fe>\u0093J\u001b\u00ab\u009b\u00ef\u009a\u00dc\u00ce\u00b1\u0095\u00d3Y\u00d4\u00b1-H\u00b4({\u00db\u0089\u0098\u0082\u00ee\u0013<`#\u00ac:\u0001\u007fhG\u00bb3\u00e2\u00fa\u00f0*\u00be\u00dd\u00b4\f\u00c3\u00cfd\u00e8p<\b\u00bb+\u009d\u0086\u008f\u00c3\u00fe\u0000\u00de\u00c2\u00d6\u009f\u008f\u00ac\u0088ES\u00a3!\u009c\u0085\u00be\u009a\u0092C\u00ed\u00a2\u00d6\u009dg\u00a1t\u00c4b0\u0004`\u00db\u00f1A\u0095\u00c5G\u0080\u0013\u000fA\u00bb\u00eb\u0000U{\u00ba\u00d8l\u00a3\u00b9L\u00a2\u0084\u00d4\u00ceQ\u0017\u0081\u00ba\u0003\u001b&`\u00db\u00faI\u0088\u00f0\u00dblI~\u0010b\fE\u00fe-F\u0018[\u00cb\u00b3SX\u00bb\u00faI\u00d0$\u0005Ft?\u008e\u00de\u00d5\u00a8\u00f8\u00b5\u00bf\u00f6\u00af\u008dr\u0002\u00c6o\u00b8@\u00e2b1v\u0085#8\bc\nb3]\u0088S\u00f3,~\u00f3\u00da\u00a8a\u00cfj\u0019\u00b4\u00ca\u00b0\u00ae\n\u00ed\u00eex\u0095\u00dcI\n1\u00d8\u0014\u00cf\u0086\u00c8\u009b}\u00f3\u0094\u00cc\u00ab\\\u00e8\u0011P9\u0093]\f\u00f8K\u00f0\u00e9\u00d2\u001d\u0002\u00e1\u00e9h\u00fc\u00c5\u008dC\u001a\u00d8\u00a7Y\u0092\u0082z\u00ca\u00d6\bH\u0090\u00eb\u00ef".length();
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
                    var4_14 = "wz\tf\u00b7\u00ed\u009a\u00ea\fI\u00cbk\u00f8b\u0006!";
                    var5_15 = "wz\tf\u00b7\u00ed\u009a\u00ea\fI\u00cbk\u00f8b\u0006!".length();
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
        CP_i7.b = var6_12;
        CP_i7.c = new Integer[83];
        CP_i7.TELEPORT_CONFIRM = new CP_i7();
        CP_i7.QUERY_BLOCK_NBT = new CP_i7();
        CP_i7.SET_DIFFICULTY = new CP_i7();
        CP_i7.CHAT_MESSAGE = new CP_i7();
        CP_i7.CLIENT_STATUS = new CP_i7();
        CP_i7.CLIENT_SETTINGS = new CP_i7();
        CP_i7.TAB_COMPLETE = new CP_i7();
        CP_i7.WINDOW_CONFIRMATION = new CP_i7();
        CP_i7.CLICK_WINDOW_BUTTON = new CP_i7();
        CP_i7.CLICK_WINDOW = new CP_i7();
        CP_i7.CLOSE_WINDOW = new CP_i7();
        CP_i7.PLUGIN_MESSAGE = new CP_i7();
        CP_i7.EDIT_BOOK = new CP_i7();
        CP_i7.QUERY_ENTITY_NBT = new CP_i7();
        CP_i7.INTERACT_ENTITY = new CP_i7();
        CP_i7.GENERATE_STRUCTURE = new CP_i7();
        CP_i7.KEEP_ALIVE = new CP_i7();
        CP_i7.LOCK_DIFFICULTY = new CP_i7();
        CP_i7.PLAYER_POSITION = new CP_i7();
        CP_i7.PLAYER_POSITION_AND_ROTATION = new CP_i7();
        CP_i7.PLAYER_ROTATION = new CP_i7();
        CP_i7.PLAYER_FLYING = new CP_i7();
        CP_i7.VEHICLE_MOVE = new CP_i7();
        CP_i7.STEER_BOAT = new CP_i7();
        CP_i7.PICK_ITEM = new CP_i7();
        CP_i7.CRAFT_RECIPE_REQUEST = new CP_i7();
        CP_i7.PLAYER_ABILITIES = new CP_i7();
        CP_i7.PLAYER_DIGGING = new CP_i7();
        CP_i7.ENTITY_ACTION = new CP_i7();
        CP_i7.STEER_VEHICLE = new CP_i7();
        CP_i7.RECIPE_BOOK_DATA = new CP_i7();
        CP_i7.NAME_ITEM = new CP_i7();
        CP_i7.RESOURCE_PACK_STATUS = new CP_i7();
        CP_i7.ADVANCEMENT_TAB = new CP_i7();
        CP_i7.SELECT_TRADE = new CP_i7();
        CP_i7.SET_BEACON_EFFECT = new CP_i7();
        CP_i7.HELD_ITEM_CHANGE = new CP_i7();
        CP_i7.UPDATE_COMMAND_BLOCK = new CP_i7();
        CP_i7.UPDATE_COMMAND_BLOCK_MINECART = new CP_i7();
        CP_i7.CREATIVE_INVENTORY_ACTION = new CP_i7();
        CP_i7.UPDATE_JIGSAW_BLOCK = new CP_i7();
        CP_i7.UPDATE_STRUCTURE_BLOCK = new CP_i7();
        CP_i7.UPDATE_SIGN = new CP_i7();
        CP_i7.ANIMATION = new CP_i7();
        CP_i7.SPECTATE = new CP_i7();
        CP_i7.PLAYER_BLOCK_PLACEMENT = new CP_i7();
        CP_i7.USE_ITEM = new CP_i7();
        CP_i7.CP_a = CP_i7.CP_W();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3CF;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_i7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_i7.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_i7.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_i7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_i7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

