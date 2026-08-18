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

public final class CP_hx
extends Enum<CP_hx> {
    public static final /* enum */ CP_hx TELEPORT_CONFIRM;
    public static final /* enum */ CP_hx QUERY_BLOCK_NBT;
    public static final /* enum */ CP_hx SET_DIFFICULTY;
    public static final /* enum */ CP_hx CHAT_ACK;
    public static final /* enum */ CP_hx CHAT_COMMAND;
    public static final /* enum */ CP_hx CHAT_MESSAGE;
    public static final /* enum */ CP_hx CHAT_SESSION_UPDATE;
    public static final /* enum */ CP_hx CLIENT_STATUS;
    public static final /* enum */ CP_hx CLIENT_SETTINGS;
    public static final /* enum */ CP_hx TAB_COMPLETE;
    public static final /* enum */ CP_hx CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_hx CLICK_WINDOW;
    public static final /* enum */ CP_hx CLOSE_WINDOW;
    public static final /* enum */ CP_hx PLUGIN_MESSAGE;
    public static final /* enum */ CP_hx EDIT_BOOK;
    public static final /* enum */ CP_hx QUERY_ENTITY_NBT;
    public static final /* enum */ CP_hx INTERACT_ENTITY;
    public static final /* enum */ CP_hx GENERATE_STRUCTURE;
    public static final /* enum */ CP_hx KEEP_ALIVE;
    public static final /* enum */ CP_hx LOCK_DIFFICULTY;
    public static final /* enum */ CP_hx PLAYER_POSITION;
    public static final /* enum */ CP_hx PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_hx PLAYER_ROTATION;
    public static final /* enum */ CP_hx PLAYER_FLYING;
    public static final /* enum */ CP_hx VEHICLE_MOVE;
    public static final /* enum */ CP_hx STEER_BOAT;
    public static final /* enum */ CP_hx PICK_ITEM;
    public static final /* enum */ CP_hx CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_hx PLAYER_ABILITIES;
    public static final /* enum */ CP_hx PLAYER_DIGGING;
    public static final /* enum */ CP_hx ENTITY_ACTION;
    public static final /* enum */ CP_hx STEER_VEHICLE;
    public static final /* enum */ CP_hx PONG;
    public static final /* enum */ CP_hx SET_RECIPE_BOOK_STATE;
    public static final /* enum */ CP_hx SET_DISPLAYED_RECIPE;
    public static final /* enum */ CP_hx NAME_ITEM;
    public static final /* enum */ CP_hx RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_hx ADVANCEMENT_TAB;
    public static final /* enum */ CP_hx SELECT_TRADE;
    public static final /* enum */ CP_hx SET_BEACON_EFFECT;
    public static final /* enum */ CP_hx HELD_ITEM_CHANGE;
    public static final /* enum */ CP_hx UPDATE_COMMAND_BLOCK;
    public static final /* enum */ CP_hx UPDATE_COMMAND_BLOCK_MINECART;
    public static final /* enum */ CP_hx CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_hx UPDATE_JIGSAW_BLOCK;
    public static final /* enum */ CP_hx UPDATE_STRUCTURE_BLOCK;
    public static final /* enum */ CP_hx UPDATE_SIGN;
    public static final /* enum */ CP_hx ANIMATION;
    public static final /* enum */ CP_hx SPECTATE;
    public static final /* enum */ CP_hx PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_hx USE_ITEM;
    private static final /* synthetic */ CP_hx[] CP_y;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_hx[] values() {
        return (CP_hx[])CP_y.clone();
    }

    public static CP_hx valueOf(String string) {
        return Enum.valueOf(CP_hx.class, string);
    }

    private static /* synthetic */ CP_hx[] CP_J() {
        long l = a ^ 0x4BE8E2EED264L;
        CP_hx[] ilIlhxArray = new CP_hx[CP_hx.a("g", (int)27144, (long)(0x704C51E358C52FACL ^ l))];
        ilIlhxArray[0] = TELEPORT_CONFIRM;
        ilIlhxArray[1] = QUERY_BLOCK_NBT;
        ilIlhxArray[2] = SET_DIFFICULTY;
        ilIlhxArray[3] = CHAT_ACK;
        ilIlhxArray[4] = CHAT_COMMAND;
        ilIlhxArray[5] = CHAT_MESSAGE;
        ilIlhxArray[CP_hx.a("g", (int)12028, (long)(0x456E3DEE6E0C6B29L ^ l))] = CHAT_SESSION_UPDATE;
        ilIlhxArray[CP_hx.a("g", (int)4417, (long)(0x668D095267B1D4E6L ^ l))] = CLIENT_STATUS;
        ilIlhxArray[CP_hx.a("g", (int)8510, (long)(0x1E065892F1A464F2L ^ l))] = CLIENT_SETTINGS;
        ilIlhxArray[CP_hx.a("g", (int)36, (long)(0x6BA9B824CA61C59EL ^ l))] = TAB_COMPLETE;
        ilIlhxArray[CP_hx.a("g", (int)31683, (long)(0x2C370F03383CBE7BL ^ l))] = CLICK_WINDOW_BUTTON;
        ilIlhxArray[CP_hx.a("g", (int)3019, (long)(0x7D7DEB982B49CE02L ^ l))] = CLICK_WINDOW;
        ilIlhxArray[CP_hx.a("g", (int)9385, (long)(0x616C4651EB52E11AL ^ l))] = CLOSE_WINDOW;
        ilIlhxArray[CP_hx.a("g", (int)12402, (long)(0x71CDC855E83875B7L ^ l))] = PLUGIN_MESSAGE;
        ilIlhxArray[CP_hx.a("g", (int)6746, (long)(0x311F9971A3515FF2L ^ l))] = EDIT_BOOK;
        ilIlhxArray[CP_hx.a("g", (int)23095, (long)(0x1B3C59315BA09F85L ^ l))] = QUERY_ENTITY_NBT;
        ilIlhxArray[CP_hx.a("g", (int)24923, (long)(0x4154646D4D3524ABL ^ l))] = INTERACT_ENTITY;
        ilIlhxArray[CP_hx.a("g", (int)21922, (long)(0x6AECD0BECD9A1062L ^ l))] = GENERATE_STRUCTURE;
        ilIlhxArray[CP_hx.a("g", (int)20148, (long)(0x89BE922C3ED0B11L ^ l))] = KEEP_ALIVE;
        ilIlhxArray[CP_hx.a("g", (int)29136, (long)(0x5621982835AF341FL ^ l))] = LOCK_DIFFICULTY;
        ilIlhxArray[CP_hx.a("g", (int)27162, (long)(0x40F59738402B2FA4L ^ l))] = PLAYER_POSITION;
        ilIlhxArray[CP_hx.a("g", (int)32233, (long)(0x46B837D91601B805L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIlhxArray[CP_hx.a("g", (int)29180, (long)(0x2D8F8D65CBCB417L ^ l))] = PLAYER_ROTATION;
        ilIlhxArray[CP_hx.a("g", (int)24394, (long)(0x4569D69659ED9A8BL ^ l))] = PLAYER_FLYING;
        ilIlhxArray[CP_hx.a("g", (int)20667, (long)(0x2AF79F5B67699556L ^ l))] = VEHICLE_MOVE;
        ilIlhxArray[CP_hx.a("g", (int)17208, (long)(0x47736EC7B22886FFL ^ l))] = STEER_BOAT;
        ilIlhxArray[CP_hx.a("g", (int)20057, (long)(0x353E121ED7908BBEL ^ l))] = PICK_ITEM;
        ilIlhxArray[CP_hx.a("g", (int)3376, (long)(0x41E111EE113FC8F6L ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIlhxArray[CP_hx.a("g", (int)11405, (long)(0x733952993BC26967L ^ l))] = PLAYER_ABILITIES;
        ilIlhxArray[CP_hx.a("g", (int)30209, (long)(0x3C84596BA340B3A0L ^ l))] = PLAYER_DIGGING;
        ilIlhxArray[CP_hx.a("g", (int)4841, (long)(0x177614C5CC885723L ^ l))] = ENTITY_ACTION;
        ilIlhxArray[CP_hx.a("g", (int)3245, (long)(0x6AC0D74EE530C910L ^ l))] = STEER_VEHICLE;
        ilIlhxArray[CP_hx.a("g", (int)13838, (long)(0x328FC0D2ACC3F3B1L ^ l))] = PONG;
        ilIlhxArray[CP_hx.a("g", (int)30029, (long)(0x381A145106F630BCL ^ l))] = SET_RECIPE_BOOK_STATE;
        ilIlhxArray[CP_hx.a("g", (int)12195, (long)(0x6BEC2BD2B4D16A55L ^ l))] = SET_DISPLAYED_RECIPE;
        ilIlhxArray[CP_hx.a("g", (int)13593, (long)(0x373DE28F185470C5L ^ l))] = NAME_ITEM;
        ilIlhxArray[CP_hx.a("g", (int)24217, (long)(0x70C4C592CB299B4FL ^ l))] = RESOURCE_PACK_STATUS;
        ilIlhxArray[CP_hx.a("g", (int)22015, (long)(0x55D56A15C8B01002L ^ l))] = ADVANCEMENT_TAB;
        ilIlhxArray[CP_hx.a("g", (int)21334, (long)(0xFD9D1C03232168CL ^ l))] = SELECT_TRADE;
        ilIlhxArray[CP_hx.a("g", (int)15361, (long)(0x656D32E09468F9C9L ^ l))] = SET_BEACON_EFFECT;
        ilIlhxArray[CP_hx.a("g", (int)22542, (long)(0x2987CDBF39749DD3L ^ l))] = HELD_ITEM_CHANGE;
        ilIlhxArray[CP_hx.a("g", (int)24206, (long)(0x530610D3D52E9B50L ^ l))] = UPDATE_COMMAND_BLOCK;
        ilIlhxArray[CP_hx.a("g", (int)26736, (long)(0x580C771B6852AD88L ^ l))] = UPDATE_COMMAND_BLOCK_MINECART;
        ilIlhxArray[CP_hx.a("g", (int)12202, (long)(0x7D336D651BABEA78L ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIlhxArray[CP_hx.a("g", (int)14742, (long)(0x5EE958D70DA07C30L ^ l))] = UPDATE_JIGSAW_BLOCK;
        ilIlhxArray[CP_hx.a("g", (int)20707, (long)(0x26BB8809C0279521L ^ l))] = UPDATE_STRUCTURE_BLOCK;
        ilIlhxArray[CP_hx.a("g", (int)24129, (long)(0x68959DBE4EA19B99L ^ l))] = UPDATE_SIGN;
        ilIlhxArray[CP_hx.a("g", (int)2340, (long)(0x44BB5232C15F4C93L ^ l))] = ANIMATION;
        ilIlhxArray[CP_hx.a("g", (int)27104, (long)(0x6D882D3117162C30L ^ l))] = SPECTATE;
        ilIlhxArray[CP_hx.a("g", (int)373, (long)(0x4A14DC9E5F21C4B8L ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIlhxArray[CP_hx.a("g", (int)8622, (long)(0x42A0DA10F509644CL ^ l))] = USE_ITEM;
        return ilIlhxArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_hx.a = CP_s.a(-639802010213178508L, 7416808816713695141L, MethodHandles.lookup().lookupClass()).a(279858416800255L);
                        var20 = CP_hx.a ^ 96313641926236L;
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
                        var11_3 = new String[51];
                        var17_4 = 0;
                        var16_5 = "\u00ce\u0094q\t\u00004p\u00ae,\u001d;\u00ad\u00b6\u00bb\u00a4\u00d7 \u00dd\u00b6&\u00f5\u00ac\u0018N\u00bcE87\u001dh\u00c5\u00ae\u008c%I\u00f8x\u0097k\u009e>\u00a8\u00de\u00db\u00e9_\u00e5\u0081\u0099\u0018\u00c0-\u00c7o\u00f5\u00d23r\u00f8\u00a8\u0086e\u00e5D\u00aa\u0015\u00a7A\u000fO\u00e5\u00c0$\u00e1\u0010o\u00eb\u00d1\u00ae\u00c6\f\u0092\u0018\u00e7\u00b5\u0001\u00ab\u00a7\u0003y\u0085\u0010\u0096\u0011\u00eb\r9}\u00af\u00ddh\u008bzl\u00cf-s\u00de\u0018\u008d\u008fm\u0098\u00a5\u001cl\r\u00a5E\u001eQ\u0000\u0099U\u001e\u009c\u00e4\u0013\u008d\u008f5C\u0004\u0010\u00aa\u00efI\u0017\u008eSK\u00af\u00bd\u00b9HE%\u00a8u\u00a4\u0010\u00e5=f\u00bc]\u00d3\u0097+\r_\u00e7Ao\u00d2\u00fa\u00bd \u00f7\u0082\u00c1`\u00c7\u0017\u0093\u00c6\u00aa\u00fd9\u0099\n,]\u00c1B\u009a6\u001f\u0086V;0*\u00f01\u009f=\u0019\u0013\u00df\u0010\u008f\u00ca\u00d5\u00eb\u0000\u00d5\u0097NQ\u001e\u0091\u00c54\u00fap\u0095\u0010re\u00cc\u00dex\u00a9\u000e\u00e0\u00c5\u00b8\u00f1\u00f0Q\b\u00f9\u008e\u0018\u001a\u0014\u00e0\u00a5\b\u00a5\u009a\u00bbbz|\u0017\u00a4\u00a5\u0098[\u00d0\u00f4\u00d1\u00a73\u00cc\u00d1N\u0018z\u00a5k\u00a7rHa\u009d\u00bc1&_\u00ed\u00adI\u00cc\u00b7\u0000\u008d\u00d1\u00a76\u009e&\u0018\u00af\u00ec\u00a1P\u00cf\u00d8]\u0096L5\u0014\u00dbkc6\u00fd\u0081\u008eL\u00c7~\u00e0\u00143 T\u00af\u008c!>*?\u00be\u00e1\u0084sj\u009a\u000e\u00d7v3\u00de)>\u00d0\u0017\u00d3\u00fe\u00b7\u000f+<\u001f\u00a7\u00f4|\u0010\t\u00aa\u009c~{\u0002\u00a4\u0087\u0097\u0014\u00a3\u00ed\u00f6{5T\u0010X\u008f\u00ecR\u0091\u00a0\u00a1\u00fa\u00f7\u00ff\u00d0\u00d0\u00d6\u0015\u00ae\u008c\u0018\u0000\u0087V\u00c7\u00b7\r\u0007\u008d\u00b5\u00cfN\u00f8\u00f3\u00e6\u0003\u0018?\u00d5V\u00e2\u0089\u00f8\u001fv\u0010\u00f3\u0016lu\u00ba\u0010v\u000f\u0088\u00c2\u0087%A\u0097\u00ad/\u0010\u00e8\u00d4\u00c8\u00e7\u000b+8.\u00db\u00c7\u009e\u0083\u00ab\u00f3\u00a3\u001a\u0018T\u00af\u008c!>*?\u00be\u00e1\u0084sj\u009a\u000e\u00d7v\u0006\u0006v\u0007$e'^\u0010y0Ip^\u00a6\u00a6\u00a3\u001bx\u0098%S#\u008e\u00c0\u0010\u001eF\u00e3\u0099\u0095\u00100,Q\u00d6\u00b6\u00ee4\u00cc\u00edv\u0018\u0010+\u0002\u0098V\u00e2\u00ff\u00f5q.\u00ceY\u00e34D\u0016\u00c7\u0018D/4\u00f9{\u00f7\u0010\u00f7\u0082\u00c1`\u00c7\u0017\u0093\u00c6\u00b9\u00b4\u00a0\u00d2Q`\u0002\u00b6\u0010o\u0082I\u009b\u0093\u00de}\rPU\u00cbL\u00bf\u00ec\u00bd\"\u0018\u00c8\u009f*\u00d2\u00a2\u00f6\u0089:\u00d7H\u00b4\u00dd\u00d3P\u00f2\u00eeJ\u00b1\u0097\u00ca\u0098\u00c8-\u0004\u0010\u00e1\r)\u00da^\u00a4e;rmf\u00f4S\u00af\u0097\u0080\u0010\u001e\u008f\u0000H\u00e3\u00a4t\u00942\u00c4\u00a7\u00d5]\u00be78\u0010\u00b9\u00ed\u007f\u00d8\u0091\u0085\u00b4+\u00d1\u0001J\u0007&\u00a5\u007fI\u0010\u00c0-\u00c7o\u00f5\u00d23r\u00c6X\u00f0\u00fe\u00caT\u00cf\u00a8\u0010\u00e40\u00cc\u00dfq\u00a7\u00e9\u00fa\u00d2\u008c~\u00aa\u00c8^P\u00a6\bX#f\u00dd\u00cce\u00ccx\u0010F\u00dd\nV\u00d1{BwK\u0080\u00fd:y\u00e7%x\u0010\u00a2\u00a3xx\u00e1(\u00fd\u00f1U\\z\u00db\u008c\u0091\u00fd\"\u0010o\u00ffl\u00de\u00b0v\u00b7Z\u008b\u0010\u008f\u00f2x+\u00a7\f\u0018\u00d9\u00f6\u00ea\u00ebpj\u009eZ\u000b\u00b3\u00db}\u009a\u0006P\u00c8\u00ef\u00b2\\\u0099\u00cc\u00eeI\u00fa\u0010\u00c1i\u00d1\u0087\u009e`>\u008f\u0006\u00d4\u00af4nF\u00ce\u00d0\u0018\u00fd\u0090i\u00f9\u00e1Y\u00b1-\u00c8\u00bd^J\u0098\u00d9\u00fde\u00deS\u009d\r\u00ee\u0082\u00b9\u00fa\u0010\u00ec\u001f\u00eaz\u0086\u0004\u0010[J\u00b7~\u00c6\u008f[\u0088\u008a\u0018\u00ec\u00f3\u0010\u00c3\u00a9\u00ceI~VQY\u0093\u00d62l\u0090m{\u0010\u00f7(\u00ff\u0005\u00ee\u0010\u0010>0\u0002\u0019\u001c\u00af\u009f)\u00abF\u0005r*=\u00a7\u0010\u0087\u00c5\u000b\u00ea\u00ca:\u0001\\}'\u00d6\u0086&b\u00f2\u0086\u0010\u00fd\u0090i\u00f9\u00e1Y\u00b1-8!\u00cf\u00d2\u0000C\u00f9\u00a2\u0010\u0010>0\u0002\u0019\u001c\u00af\u009fV\u00ae_\u000f\u00f0\\e\u00ff\u0018R\b\u000fpO\u0013\u00ab\u00f8\u0093\u00e8\u000b\u00a5r\u009a?\u008e\u00e6\u007f\u0098\u0098\u00b1d\u0000\u00c3\u0018\u00a4\u0007\u0091\u0096\u0010\u0011&,\fy`\u00ba\u00e0`n\u00d7\"K\u00da\u00ed\u00d7\u0082oL\u0010+\u00e2>Z6\u0015mM\u0099\u00d3\u0083Y<\u0016\u00e1>\u0018S\u00b3\u0003Y9\u00d7\u00f2\\5\u00bc\u00d2\u00ed!7P\u0018\u00c7\u00f1\u0095\u00cf\u0091s\u00dd]";
                        var18_6 = "\u00ce\u0094q\t\u00004p\u00ae,\u001d;\u00ad\u00b6\u00bb\u00a4\u00d7 \u00dd\u00b6&\u00f5\u00ac\u0018N\u00bcE87\u001dh\u00c5\u00ae\u008c%I\u00f8x\u0097k\u009e>\u00a8\u00de\u00db\u00e9_\u00e5\u0081\u0099\u0018\u00c0-\u00c7o\u00f5\u00d23r\u00f8\u00a8\u0086e\u00e5D\u00aa\u0015\u00a7A\u000fO\u00e5\u00c0$\u00e1\u0010o\u00eb\u00d1\u00ae\u00c6\f\u0092\u0018\u00e7\u00b5\u0001\u00ab\u00a7\u0003y\u0085\u0010\u0096\u0011\u00eb\r9}\u00af\u00ddh\u008bzl\u00cf-s\u00de\u0018\u008d\u008fm\u0098\u00a5\u001cl\r\u00a5E\u001eQ\u0000\u0099U\u001e\u009c\u00e4\u0013\u008d\u008f5C\u0004\u0010\u00aa\u00efI\u0017\u008eSK\u00af\u00bd\u00b9HE%\u00a8u\u00a4\u0010\u00e5=f\u00bc]\u00d3\u0097+\r_\u00e7Ao\u00d2\u00fa\u00bd \u00f7\u0082\u00c1`\u00c7\u0017\u0093\u00c6\u00aa\u00fd9\u0099\n,]\u00c1B\u009a6\u001f\u0086V;0*\u00f01\u009f=\u0019\u0013\u00df\u0010\u008f\u00ca\u00d5\u00eb\u0000\u00d5\u0097NQ\u001e\u0091\u00c54\u00fap\u0095\u0010re\u00cc\u00dex\u00a9\u000e\u00e0\u00c5\u00b8\u00f1\u00f0Q\b\u00f9\u008e\u0018\u001a\u0014\u00e0\u00a5\b\u00a5\u009a\u00bbbz|\u0017\u00a4\u00a5\u0098[\u00d0\u00f4\u00d1\u00a73\u00cc\u00d1N\u0018z\u00a5k\u00a7rHa\u009d\u00bc1&_\u00ed\u00adI\u00cc\u00b7\u0000\u008d\u00d1\u00a76\u009e&\u0018\u00af\u00ec\u00a1P\u00cf\u00d8]\u0096L5\u0014\u00dbkc6\u00fd\u0081\u008eL\u00c7~\u00e0\u00143 T\u00af\u008c!>*?\u00be\u00e1\u0084sj\u009a\u000e\u00d7v3\u00de)>\u00d0\u0017\u00d3\u00fe\u00b7\u000f+<\u001f\u00a7\u00f4|\u0010\t\u00aa\u009c~{\u0002\u00a4\u0087\u0097\u0014\u00a3\u00ed\u00f6{5T\u0010X\u008f\u00ecR\u0091\u00a0\u00a1\u00fa\u00f7\u00ff\u00d0\u00d0\u00d6\u0015\u00ae\u008c\u0018\u0000\u0087V\u00c7\u00b7\r\u0007\u008d\u00b5\u00cfN\u00f8\u00f3\u00e6\u0003\u0018?\u00d5V\u00e2\u0089\u00f8\u001fv\u0010\u00f3\u0016lu\u00ba\u0010v\u000f\u0088\u00c2\u0087%A\u0097\u00ad/\u0010\u00e8\u00d4\u00c8\u00e7\u000b+8.\u00db\u00c7\u009e\u0083\u00ab\u00f3\u00a3\u001a\u0018T\u00af\u008c!>*?\u00be\u00e1\u0084sj\u009a\u000e\u00d7v\u0006\u0006v\u0007$e'^\u0010y0Ip^\u00a6\u00a6\u00a3\u001bx\u0098%S#\u008e\u00c0\u0010\u001eF\u00e3\u0099\u0095\u00100,Q\u00d6\u00b6\u00ee4\u00cc\u00edv\u0018\u0010+\u0002\u0098V\u00e2\u00ff\u00f5q.\u00ceY\u00e34D\u0016\u00c7\u0018D/4\u00f9{\u00f7\u0010\u00f7\u0082\u00c1`\u00c7\u0017\u0093\u00c6\u00b9\u00b4\u00a0\u00d2Q`\u0002\u00b6\u0010o\u0082I\u009b\u0093\u00de}\rPU\u00cbL\u00bf\u00ec\u00bd\"\u0018\u00c8\u009f*\u00d2\u00a2\u00f6\u0089:\u00d7H\u00b4\u00dd\u00d3P\u00f2\u00eeJ\u00b1\u0097\u00ca\u0098\u00c8-\u0004\u0010\u00e1\r)\u00da^\u00a4e;rmf\u00f4S\u00af\u0097\u0080\u0010\u001e\u008f\u0000H\u00e3\u00a4t\u00942\u00c4\u00a7\u00d5]\u00be78\u0010\u00b9\u00ed\u007f\u00d8\u0091\u0085\u00b4+\u00d1\u0001J\u0007&\u00a5\u007fI\u0010\u00c0-\u00c7o\u00f5\u00d23r\u00c6X\u00f0\u00fe\u00caT\u00cf\u00a8\u0010\u00e40\u00cc\u00dfq\u00a7\u00e9\u00fa\u00d2\u008c~\u00aa\u00c8^P\u00a6\bX#f\u00dd\u00cce\u00ccx\u0010F\u00dd\nV\u00d1{BwK\u0080\u00fd:y\u00e7%x\u0010\u00a2\u00a3xx\u00e1(\u00fd\u00f1U\\z\u00db\u008c\u0091\u00fd\"\u0010o\u00ffl\u00de\u00b0v\u00b7Z\u008b\u0010\u008f\u00f2x+\u00a7\f\u0018\u00d9\u00f6\u00ea\u00ebpj\u009eZ\u000b\u00b3\u00db}\u009a\u0006P\u00c8\u00ef\u00b2\\\u0099\u00cc\u00eeI\u00fa\u0010\u00c1i\u00d1\u0087\u009e`>\u008f\u0006\u00d4\u00af4nF\u00ce\u00d0\u0018\u00fd\u0090i\u00f9\u00e1Y\u00b1-\u00c8\u00bd^J\u0098\u00d9\u00fde\u00deS\u009d\r\u00ee\u0082\u00b9\u00fa\u0010\u00ec\u001f\u00eaz\u0086\u0004\u0010[J\u00b7~\u00c6\u008f[\u0088\u008a\u0018\u00ec\u00f3\u0010\u00c3\u00a9\u00ceI~VQY\u0093\u00d62l\u0090m{\u0010\u00f7(\u00ff\u0005\u00ee\u0010\u0010>0\u0002\u0019\u001c\u00af\u009f)\u00abF\u0005r*=\u00a7\u0010\u0087\u00c5\u000b\u00ea\u00ca:\u0001\\}'\u00d6\u0086&b\u00f2\u0086\u0010\u00fd\u0090i\u00f9\u00e1Y\u00b1-8!\u00cf\u00d2\u0000C\u00f9\u00a2\u0010\u0010>0\u0002\u0019\u001c\u00af\u009fV\u00ae_\u000f\u00f0\\e\u00ff\u0018R\b\u000fpO\u0013\u00ab\u00f8\u0093\u00e8\u000b\u00a5r\u009a?\u008e\u00e6\u007f\u0098\u0098\u00b1d\u0000\u00c3\u0018\u00a4\u0007\u0091\u0096\u0010\u0011&,\fy`\u00ba\u00e0`n\u00d7\"K\u00da\u00ed\u00d7\u0082oL\u0010+\u00e2>Z6\u0015mM\u0099\u00d3\u0083Y<\u0016\u00e1>\u0018S\u00b3\u0003Y9\u00d7\u00f2\\5\u00bc\u00d2\u00ed!7P\u0018\u00c7\u00f1\u0095\u00cf\u0091s\u00dd]".length();
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
                            var11_3[var17_4++] = CP_hx.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "F1H\u00aa\u00e0<\u00c9k}\\\u00bf\u00afx\u00d0\u00a2j\u0018r15\u00f8\u00fa\\\u00c9S\u001f|4\u0018D\u00d5@b\u00da\u00ab\u00e2\u00f4j\u0099_\u00da";
                            var18_6 = "F1H\u00aa\u00e0<\u00c9k}\\\u00bf\u00afx\u00d0\u00a2j\u0018r15\u00f8\u00fa\\\u00c9S\u001f|4\u0018D\u00d5@b\u00da\u00ab\u00e2\u00f4j\u0099_\u00da".length();
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
                            var11_3[var17_4++] = CP_hx.a(var19_9).intern();
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
                CP_hx.d = new HashMap<K, V>(13);
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
                var6_12 = new long[91];
                var3_13 = 0;
                var4_14 = "`\u00e3O}\u00f8a\u00fcf\u00deS\u0012\u001d\u00bd\u00fd..\u00fb\u0017\u00c2\u0002!\u00dd\u00da\u001dR\n3\u009a\u00ad\u00afA\u00e7\u007f-\u00e0(\u0097}_\u0089\u00b6\u0013~\u0018\u00bb\u00ba\u00f8d\u00f5m\u00822\u00f1\u00bf\u00f1\u00ac\u001d\u0090\u0089\u00e8m>\u00a9\u00a4B6\u00aa\u0085\u008c\u0012\u00a4\u00ad\u00ac\u00df&\f\u00aa\u0007\u00d4\u00e2\u008b>\u0099\u0095%\u00cb*\u009c\u00cf)-\u00fc\u00beAJ\u00ea\u009c;\u00c5\u0003\u0097\u00c3\u001b\u009f\u00d6\u008aX\u00edg\u00b9\u0005\u00a1\u00bb!R\u0001\f\u00babS\u0010`\u0006\"\u00ee\u0001\r\u0017\u00e2\u009d/7\n\u00aa'IKS\u00dd\bWD0x$\u00bcw\u00c5@\u00d3\u00ca\u00c9\u00favU\u0007_s1\u00f3\u00e2\u0005\u00d7\u0002\n\u00c9}\"\u00e3,\u00efR\u001bE\u00ed\u0090\u00a9$\u0088\u008cd>\u0017\u009e\u00b6\u0016\t\u0088\u008a\u0015\f\u00aegw\u00be\f\u0080\u00ddn\t\u00ad\u00c2{ HO\u00cf\u0098\u0013\u00a4\u009b\u00eb3\u00dd:2\u00b6\u00e2\u00feL\u0086\u00f4\u0012\u0098\u00af{\u00bdF\u00f1\u0016?r%`/%\u00f4!S\u00ef)\u0091r`p\u00f9 i\u00e2\u00eb\u00dc\u00bb\u00caU\u00c0'd\u00f1.\u001dINb\u00a2\b\u00d8\u00001G$/J7\u00a2\u0099\u00bc\u00d1\u00bdwvsA<\u0002j\u00f7z\u00ea\u00b1\u008c\u0087\u001e\u0086\u008bC4\u00a9\u00cb\u00edC`\u00ae\u00c0\u00bf\u00d9\u00ad\u0096\u00f3\u00c8\u00ce\u00b3\u00a9\u00c03\u0085_\u00b6D\u00a0\u00a0\u00acU\u0089\u00f2G\u00cb\u0007\u00d4`\u00f4l\u0090p\u00bf\u00c5\u00ad\u00ffg=W\u00c4\u00fe\u00eb'5^\u00c1\u0018]vU\u009b\u00dc\u008f\u00b0\u00c1\u0014\u001a\u00bb\u00c7\u0007\u00c9-\u00f5\u00abz+\u00d5g\u00a4i\u008d\u008f]f7\u00d8\u0082\u001e\u00d1\u00b2\u008d\u00a8\u008f\u00f4\u009a^H\u00fc\u009fC\u0093\u00d7\u0011%\u00fa\u00e3\u0088\u0086\u00f4A\u00a1'\u00dd5\u001c9\u00bau\u0083\u008a\f\u00ca\"\u0013\u0001Y\u00954\u00be\u00a8\u00f3\u0089\u00d6\u0016s\u00c3\u009c\u0085\u00e8\u00e7Yb\u00ac\u00c0\u0012Zz\u0001\u00e7\u00d2\u00b7\u0011\u0003\u00b8\u0092\u0017*\u008bZ\u00a3r\u0000|\u001aj\u000bF`\u00d5SF7\u00c8\u0012\u00b2\u0012s\u00f4\u00a9\u00e7\u00b0\u00b9\u00b7!B\u00fe3\u00d5\u008f\u009cZ\u0087\u00e2\u00db\u0082E\u0019I|A\"b\"2+7\u00c3\u007fO\u008a#a<%l\u0019W$\u0082;\u0088\u00ea[a\u00e7-\u00b4\u00eac/y[M\u0087{X\u00fb\u0099\u00a0BG\\\u008f\u00c1\u0097\u0084\u00e1\u001c\u009e\u00cf,\u00a4\u00cdew4\u00a1Q\u0005\u0083%\u00d5\u0093\u0099\u0002k\u00b3W\u00ca\u00cb\u0089\u009bK\u00cee\u00b6\u00ec!\u001d\u0092j\u00fet\u00e9p\u009d&ubf\u0087-e-\u007fu \u00e8\u00c9\u00a8\u00d1\u00e2j\u00af\u00d9\u00d6N\u0093\u00a3\u0098{\u0088\u00b2\u00f0{Y\u00d9\u00f4\n\u00adf\u0013\u0083i\u00a9\u00e1\u00a1%\u00ed\u00f2/\u00fah\u00e6Wv\u00a1s\u00ddQ0\u00bc\u00f2\u0081\u0091\u0086\u009bQ\u00f7\u0090\u00bb\u009ej\u00d3z\u0000%;\r\u008b\u0004Bo\u00c3\"''x\u00a2\u00a1r\u00b2\u00cb\u0003\u00ff8\u00b3.e\u00fe\u00a7\u008d\u00af^^&\u00f3[\u007f\u0012Z\u009bV\u0097!\u0010\u00c1\u009b\u00ee\u00e4\u0084\u007fY$\u009b\u00c7\u0000,RTv\u00d6\u0085\u00e7\f\u00fe\u00a3\u00a3\u00ccP\u00f5";
                var5_15 = "`\u00e3O}\u00f8a\u00fcf\u00deS\u0012\u001d\u00bd\u00fd..\u00fb\u0017\u00c2\u0002!\u00dd\u00da\u001dR\n3\u009a\u00ad\u00afA\u00e7\u007f-\u00e0(\u0097}_\u0089\u00b6\u0013~\u0018\u00bb\u00ba\u00f8d\u00f5m\u00822\u00f1\u00bf\u00f1\u00ac\u001d\u0090\u0089\u00e8m>\u00a9\u00a4B6\u00aa\u0085\u008c\u0012\u00a4\u00ad\u00ac\u00df&\f\u00aa\u0007\u00d4\u00e2\u008b>\u0099\u0095%\u00cb*\u009c\u00cf)-\u00fc\u00beAJ\u00ea\u009c;\u00c5\u0003\u0097\u00c3\u001b\u009f\u00d6\u008aX\u00edg\u00b9\u0005\u00a1\u00bb!R\u0001\f\u00babS\u0010`\u0006\"\u00ee\u0001\r\u0017\u00e2\u009d/7\n\u00aa'IKS\u00dd\bWD0x$\u00bcw\u00c5@\u00d3\u00ca\u00c9\u00favU\u0007_s1\u00f3\u00e2\u0005\u00d7\u0002\n\u00c9}\"\u00e3,\u00efR\u001bE\u00ed\u0090\u00a9$\u0088\u008cd>\u0017\u009e\u00b6\u0016\t\u0088\u008a\u0015\f\u00aegw\u00be\f\u0080\u00ddn\t\u00ad\u00c2{ HO\u00cf\u0098\u0013\u00a4\u009b\u00eb3\u00dd:2\u00b6\u00e2\u00feL\u0086\u00f4\u0012\u0098\u00af{\u00bdF\u00f1\u0016?r%`/%\u00f4!S\u00ef)\u0091r`p\u00f9 i\u00e2\u00eb\u00dc\u00bb\u00caU\u00c0'd\u00f1.\u001dINb\u00a2\b\u00d8\u00001G$/J7\u00a2\u0099\u00bc\u00d1\u00bdwvsA<\u0002j\u00f7z\u00ea\u00b1\u008c\u0087\u001e\u0086\u008bC4\u00a9\u00cb\u00edC`\u00ae\u00c0\u00bf\u00d9\u00ad\u0096\u00f3\u00c8\u00ce\u00b3\u00a9\u00c03\u0085_\u00b6D\u00a0\u00a0\u00acU\u0089\u00f2G\u00cb\u0007\u00d4`\u00f4l\u0090p\u00bf\u00c5\u00ad\u00ffg=W\u00c4\u00fe\u00eb'5^\u00c1\u0018]vU\u009b\u00dc\u008f\u00b0\u00c1\u0014\u001a\u00bb\u00c7\u0007\u00c9-\u00f5\u00abz+\u00d5g\u00a4i\u008d\u008f]f7\u00d8\u0082\u001e\u00d1\u00b2\u008d\u00a8\u008f\u00f4\u009a^H\u00fc\u009fC\u0093\u00d7\u0011%\u00fa\u00e3\u0088\u0086\u00f4A\u00a1'\u00dd5\u001c9\u00bau\u0083\u008a\f\u00ca\"\u0013\u0001Y\u00954\u00be\u00a8\u00f3\u0089\u00d6\u0016s\u00c3\u009c\u0085\u00e8\u00e7Yb\u00ac\u00c0\u0012Zz\u0001\u00e7\u00d2\u00b7\u0011\u0003\u00b8\u0092\u0017*\u008bZ\u00a3r\u0000|\u001aj\u000bF`\u00d5SF7\u00c8\u0012\u00b2\u0012s\u00f4\u00a9\u00e7\u00b0\u00b9\u00b7!B\u00fe3\u00d5\u008f\u009cZ\u0087\u00e2\u00db\u0082E\u0019I|A\"b\"2+7\u00c3\u007fO\u008a#a<%l\u0019W$\u0082;\u0088\u00ea[a\u00e7-\u00b4\u00eac/y[M\u0087{X\u00fb\u0099\u00a0BG\\\u008f\u00c1\u0097\u0084\u00e1\u001c\u009e\u00cf,\u00a4\u00cdew4\u00a1Q\u0005\u0083%\u00d5\u0093\u0099\u0002k\u00b3W\u00ca\u00cb\u0089\u009bK\u00cee\u00b6\u00ec!\u001d\u0092j\u00fet\u00e9p\u009d&ubf\u0087-e-\u007fu \u00e8\u00c9\u00a8\u00d1\u00e2j\u00af\u00d9\u00d6N\u0093\u00a3\u0098{\u0088\u00b2\u00f0{Y\u00d9\u00f4\n\u00adf\u0013\u0083i\u00a9\u00e1\u00a1%\u00ed\u00f2/\u00fah\u00e6Wv\u00a1s\u00ddQ0\u00bc\u00f2\u0081\u0091\u0086\u009bQ\u00f7\u0090\u00bb\u009ej\u00d3z\u0000%;\r\u008b\u0004Bo\u00c3\"''x\u00a2\u00a1r\u00b2\u00cb\u0003\u00ff8\u00b3.e\u00fe\u00a7\u008d\u00af^^&\u00f3[\u007f\u0012Z\u009bV\u0097!\u0010\u00c1\u009b\u00ee\u00e4\u0084\u007fY$\u009b\u00c7\u0000,RTv\u00d6\u0085\u00e7\f\u00fe\u00a3\u00a3\u00ccP\u00f5".length();
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
                    var4_14 = "\u0019D\u00bbl\u00f5\u00b9fG\u0097\u001f \u00fe\t\u00c4n\u00cf";
                    var5_15 = "\u0019D\u00bbl\u00f5\u00b9fG\u0097\u001f \u00fe\t\u00c4n\u00cf".length();
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
        CP_hx.b = var6_12;
        CP_hx.c = new Integer[91];
        CP_hx.TELEPORT_CONFIRM = new CP_hx();
        CP_hx.QUERY_BLOCK_NBT = new CP_hx();
        CP_hx.SET_DIFFICULTY = new CP_hx();
        CP_hx.CHAT_ACK = new CP_hx();
        CP_hx.CHAT_COMMAND = new CP_hx();
        CP_hx.CHAT_MESSAGE = new CP_hx();
        CP_hx.CHAT_SESSION_UPDATE = new CP_hx();
        CP_hx.CLIENT_STATUS = new CP_hx();
        CP_hx.CLIENT_SETTINGS = new CP_hx();
        CP_hx.TAB_COMPLETE = new CP_hx();
        CP_hx.CLICK_WINDOW_BUTTON = new CP_hx();
        CP_hx.CLICK_WINDOW = new CP_hx();
        CP_hx.CLOSE_WINDOW = new CP_hx();
        CP_hx.PLUGIN_MESSAGE = new CP_hx();
        CP_hx.EDIT_BOOK = new CP_hx();
        CP_hx.QUERY_ENTITY_NBT = new CP_hx();
        CP_hx.INTERACT_ENTITY = new CP_hx();
        CP_hx.GENERATE_STRUCTURE = new CP_hx();
        CP_hx.KEEP_ALIVE = new CP_hx();
        CP_hx.LOCK_DIFFICULTY = new CP_hx();
        CP_hx.PLAYER_POSITION = new CP_hx();
        CP_hx.PLAYER_POSITION_AND_ROTATION = new CP_hx();
        CP_hx.PLAYER_ROTATION = new CP_hx();
        CP_hx.PLAYER_FLYING = new CP_hx();
        CP_hx.VEHICLE_MOVE = new CP_hx();
        CP_hx.STEER_BOAT = new CP_hx();
        CP_hx.PICK_ITEM = new CP_hx();
        CP_hx.CRAFT_RECIPE_REQUEST = new CP_hx();
        CP_hx.PLAYER_ABILITIES = new CP_hx();
        CP_hx.PLAYER_DIGGING = new CP_hx();
        CP_hx.ENTITY_ACTION = new CP_hx();
        CP_hx.STEER_VEHICLE = new CP_hx();
        CP_hx.PONG = new CP_hx();
        CP_hx.SET_RECIPE_BOOK_STATE = new CP_hx();
        CP_hx.SET_DISPLAYED_RECIPE = new CP_hx();
        CP_hx.NAME_ITEM = new CP_hx();
        CP_hx.RESOURCE_PACK_STATUS = new CP_hx();
        CP_hx.ADVANCEMENT_TAB = new CP_hx();
        CP_hx.SELECT_TRADE = new CP_hx();
        CP_hx.SET_BEACON_EFFECT = new CP_hx();
        CP_hx.HELD_ITEM_CHANGE = new CP_hx();
        CP_hx.UPDATE_COMMAND_BLOCK = new CP_hx();
        CP_hx.UPDATE_COMMAND_BLOCK_MINECART = new CP_hx();
        CP_hx.CREATIVE_INVENTORY_ACTION = new CP_hx();
        CP_hx.UPDATE_JIGSAW_BLOCK = new CP_hx();
        CP_hx.UPDATE_STRUCTURE_BLOCK = new CP_hx();
        CP_hx.UPDATE_SIGN = new CP_hx();
        CP_hx.ANIMATION = new CP_hx();
        CP_hx.SPECTATE = new CP_hx();
        CP_hx.PLAYER_BLOCK_PLACEMENT = new CP_hx();
        CP_hx.USE_ITEM = new CP_hx();
        CP_hx.CP_y = CP_hx.CP_J();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7D53;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_hx", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_hx.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_hx.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_hx" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_hx.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

