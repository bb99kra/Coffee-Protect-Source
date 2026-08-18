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

public final class CP_xD
extends Enum<CP_xD> {
    public static final /* enum */ CP_xD TELEPORT_CONFIRM;
    public static final /* enum */ CP_xD QUERY_BLOCK_NBT;
    public static final /* enum */ CP_xD CHAT_MESSAGE;
    public static final /* enum */ CP_xD CLIENT_STATUS;
    public static final /* enum */ CP_xD CLIENT_SETTINGS;
    public static final /* enum */ CP_xD TAB_COMPLETE;
    public static final /* enum */ CP_xD WINDOW_CONFIRMATION;
    public static final /* enum */ CP_xD CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_xD CLICK_WINDOW;
    public static final /* enum */ CP_xD CLOSE_WINDOW;
    public static final /* enum */ CP_xD PLUGIN_MESSAGE;
    public static final /* enum */ CP_xD EDIT_BOOK;
    public static final /* enum */ CP_xD QUERY_ENTITY_NBT;
    public static final /* enum */ CP_xD INTERACT_ENTITY;
    public static final /* enum */ CP_xD KEEP_ALIVE;
    public static final /* enum */ CP_xD PLAYER_FLYING;
    public static final /* enum */ CP_xD PLAYER_POSITION;
    public static final /* enum */ CP_xD PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_xD PLAYER_ROTATION;
    public static final /* enum */ CP_xD VEHICLE_MOVE;
    public static final /* enum */ CP_xD STEER_BOAT;
    public static final /* enum */ CP_xD PICK_ITEM;
    public static final /* enum */ CP_xD CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_xD PLAYER_ABILITIES;
    public static final /* enum */ CP_xD PLAYER_DIGGING;
    public static final /* enum */ CP_xD ENTITY_ACTION;
    public static final /* enum */ CP_xD STEER_VEHICLE;
    public static final /* enum */ CP_xD RECIPE_BOOK_DATA;
    public static final /* enum */ CP_xD NAME_ITEM;
    public static final /* enum */ CP_xD RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_xD ADVANCEMENT_TAB;
    public static final /* enum */ CP_xD SELECT_TRADE;
    public static final /* enum */ CP_xD SET_BEACON_EFFECT;
    public static final /* enum */ CP_xD HELD_ITEM_CHANGE;
    public static final /* enum */ CP_xD UPDATE_COMMAND_BLOCK;
    public static final /* enum */ CP_xD UPDATE_COMMAND_BLOCK_MINECART;
    public static final /* enum */ CP_xD CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_xD UPDATE_STRUCTURE_BLOCK;
    public static final /* enum */ CP_xD UPDATE_SIGN;
    public static final /* enum */ CP_xD ANIMATION;
    public static final /* enum */ CP_xD SPECTATE;
    public static final /* enum */ CP_xD PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_xD USE_ITEM;
    private static final /* synthetic */ CP_xD[] CP_I;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_xD[] values() {
        return (CP_xD[])CP_I.clone();
    }

    public static CP_xD valueOf(String string) {
        return Enum.valueOf(CP_xD.class, string);
    }

    private static /* synthetic */ CP_xD[] CP_x() {
        long l = a ^ 0xE7D68EA2E16L;
        CP_xD[] ilIlxDArray = new CP_xD[CP_xD.a("y", (int)27511, (long)(0x40DA6E99F0AEE1C2L ^ l))];
        ilIlxDArray[0] = TELEPORT_CONFIRM;
        ilIlxDArray[1] = QUERY_BLOCK_NBT;
        ilIlxDArray[2] = CHAT_MESSAGE;
        ilIlxDArray[3] = CLIENT_STATUS;
        ilIlxDArray[4] = CLIENT_SETTINGS;
        ilIlxDArray[5] = TAB_COMPLETE;
        ilIlxDArray[CP_xD.a("y", (int)2286, (long)(0x640E2859F4648266L ^ l))] = WINDOW_CONFIRMATION;
        ilIlxDArray[CP_xD.a("y", (int)10846, (long)(0x1BD649FC7267A0E4L ^ l))] = CLICK_WINDOW_BUTTON;
        ilIlxDArray[CP_xD.a("y", (int)2803, (long)(0x4F74AD38E647006AL ^ l))] = CLICK_WINDOW;
        ilIlxDArray[CP_xD.a("y", (int)9891, (long)(0x56E775DD0E292C03L ^ l))] = CLOSE_WINDOW;
        ilIlxDArray[CP_xD.a("y", (int)12836, (long)(0x11ED95CE7819B8AFL ^ l))] = PLUGIN_MESSAGE;
        ilIlxDArray[CP_xD.a("y", (int)31028, (long)(0x3B3340B86292F39DL ^ l))] = EDIT_BOOK;
        ilIlxDArray[CP_xD.a("y", (int)6811, (long)(0x422F9CB6860F103AL ^ l))] = QUERY_ENTITY_NBT;
        ilIlxDArray[CP_xD.a("y", (int)7656, (long)(0xEDCAF5895A8976FL ^ l))] = INTERACT_ENTITY;
        ilIlxDArray[CP_xD.a("y", (int)15981, (long)(0x6237B4A43B15B4C2L ^ l))] = KEEP_ALIVE;
        ilIlxDArray[CP_xD.a("y", (int)13025, (long)(0x336221B0B5ACB861L ^ l))] = PLAYER_FLYING;
        ilIlxDArray[CP_xD.a("y", (int)19936, (long)(0x52BDDDB0F9EC477AL ^ l))] = PLAYER_POSITION;
        ilIlxDArray[CP_xD.a("y", (int)29343, (long)(0x56F3ED87038EF82CL ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIlxDArray[CP_xD.a("y", (int)24005, (long)(0x7290F716C8ECD71CL ^ l))] = PLAYER_ROTATION;
        ilIlxDArray[CP_xD.a("y", (int)19204, (long)(0x1B25FA674635C18EL ^ l))] = VEHICLE_MOVE;
        ilIlxDArray[CP_xD.a("y", (int)7536, (long)(0x1EC2DE7CC3D397DEL ^ l))] = STEER_BOAT;
        ilIlxDArray[CP_xD.a("y", (int)12967, (long)(0x78DA032AE3163828L ^ l))] = PICK_ITEM;
        ilIlxDArray[CP_xD.a("y", (int)25917, (long)(0x282D8F7E3D4AEFBBL ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIlxDArray[CP_xD.a("y", (int)16516, (long)(0x67983A45C65FCA20L ^ l))] = PLAYER_ABILITIES;
        ilIlxDArray[CP_xD.a("y", (int)4787, (long)(0x1E8E0FEFAA6F9868L ^ l))] = PLAYER_DIGGING;
        ilIlxDArray[CP_xD.a("y", (int)935, (long)(0x2B8090F6DC880913L ^ l))] = ENTITY_ACTION;
        ilIlxDArray[CP_xD.a("y", (int)11360, (long)(0x4EE9029279826DFL ^ l))] = STEER_VEHICLE;
        ilIlxDArray[CP_xD.a("y", (int)19782, (long)(0x1ABF6DC168034798L ^ l))] = RECIPE_BOOK_DATA;
        ilIlxDArray[CP_xD.a("y", (int)4390, (long)(0x4DCEEDB510699BB1L ^ l))] = NAME_ITEM;
        ilIlxDArray[CP_xD.a("y", (int)16419, (long)(0x103CCD9A9EB14AB7L ^ l))] = RESOURCE_PACK_STATUS;
        ilIlxDArray[CP_xD.a("y", (int)4031, (long)(0x1DEFF4AD6229050DL ^ l))] = ADVANCEMENT_TAB;
        ilIlxDArray[CP_xD.a("y", (int)9734, (long)(0x649863F9A53B2CADL ^ l))] = SELECT_TRADE;
        ilIlxDArray[CP_xD.a("y", (int)22597, (long)(0x6D07DD04EA7DD2DEL ^ l))] = SET_BEACON_EFFECT;
        ilIlxDArray[CP_xD.a("y", (int)14544, (long)(0x4EED5BFE63B93207L ^ l))] = HELD_ITEM_CHANGE;
        ilIlxDArray[CP_xD.a("y", (int)16402, (long)(0xD464445B5D64A9CL ^ l))] = UPDATE_COMMAND_BLOCK;
        ilIlxDArray[CP_xD.a("y", (int)7010, (long)(0x5E640B1820CB11E6L ^ l))] = UPDATE_COMMAND_BLOCK_MINECART;
        ilIlxDArray[CP_xD.a("y", (int)29400, (long)(0x69BADB02BF0CF87DL ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIlxDArray[CP_xD.a("y", (int)26161, (long)(0x2771D21320076C80L ^ l))] = UPDATE_STRUCTURE_BLOCK;
        ilIlxDArray[CP_xD.a("y", (int)4163, (long)(0x7B447936196E1ACFL ^ l))] = UPDATE_SIGN;
        ilIlxDArray[CP_xD.a("y", (int)17673, (long)(0x6ACEF0F436D7CF8AL ^ l))] = ANIMATION;
        ilIlxDArray[CP_xD.a("y", (int)31916, (long)(0x378638DF659763EL ^ l))] = SPECTATE;
        ilIlxDArray[CP_xD.a("y", (int)18752, (long)(0x3BD09D91E66043F9L ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIlxDArray[CP_xD.a("y", (int)3298, (long)(0x3C35C64EE22E8655L ^ l))] = USE_ITEM;
        return ilIlxDArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_xD.a = CP_s.a(4785769154171109329L, 4362768008334583605L, MethodHandles.lookup().lookupClass()).a(267545509813789L);
                        var20 = CP_xD.a ^ 23228592918137L;
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
                        var11_3 = new String[43];
                        var17_4 = 0;
                        var16_5 = "\u00d5\u008d\t\n\u00d9\u0099\u0017\"\u00fa\b\u00c4\u00f9\u00c8\u00a1(\u00e1\u0010\u00f7\u0097YY\u00d9\u00d5\u00c8X\u0096\u009a\u00b4\u00df5\u009bH\u0015\u0010\u0087\u00a6k\u00e4\u00f1?8\u00a1\u00d8\u00e6\u0018\u00dc\u00a9kV\u00aa j\f;\u00ea\u00b0\u00ac\u00a0\u00ae\u0001\u00dc\u008a\u00ce*a\u001ecTda\u001cu\u00d1\u00c57\u00ecw`D\u0012\u0002\u00907\u0010z@ \u000b\u009dq\u008b0\u00b1]\u00ab\u00c3Z\u00016]\u0010y8\u001e\u0090\u000e\u00f0-g\u0099\u009b\u00deSU}\u0001\u00ea\u0018\u0086\f\u00fb\u00dc\u00fc\u00d4!\u008e\u009a\u00c2\u00fd\u001b\u001a\u0000\u00de8\u00eb\u00c3\u00e1\u0090d\u00d0\u00dc.\u0010\u00b8%\u00a9\u00a7\u0013\u0005}k\u00af\u00f2\u00few\u0095\u00e4\u00ec\\\u0010\u00f7\u00efG\u0090\u0013!\"0\u00c2;<\u00ee\u00ac\u00e5~\u00b6\u0018V\u009f\u00a6\u009ac\u00e1\u00b4A\u007f\u0006^w\u00b5h~\u00e6J\u00db\u001f\u00a5\u009d\u00910^ o\u001dD2/\u00b0\u00c6\u0001\u0018\u00b8\u00feD\u00da\u00b6A2\u00bb\u00a1;M;\u00a5\u00b4K\u00b8|\u00fa\u001b\u00dd\u009dp\u00ca\u0010@\u00dd\u0006\u00a0zr\u00a8&8l\u00b0\u00e3\u00aa\u00b9j\u00ba\u0010\u009e\u00fb\u00f6\u00e3?!\u00b5/R-\u001c0\u00a7\u0012eN\u0010\u00ad\u00a3\u0015\u0007y:\u00efs\u00cc\u00b6\u00e2J\u00c4\u00955L\u0018O\u00b7\u00a0T\u0014*a`\u00b2\u00d4o\u008f\u0083\u0080\u00f3\u0080\u00ee\u00a3\fr\u00cf\u0002\u0001\u0005\u0010\u00aa\u00ae\u00d9\u00b40\u00dbB\u00ff*q\u0099\u00d8\u00b0g\u009b7\u0010#\u00c2}\u0094\u0080\u00b7\u0095e\u00f7\u00c6\u00af\u0003\u00d3\u0001nr\u0018\u0084{\u00ac\u00e4\u0003\u00c6\u00bd\u0099g\u0096\u008d\u00daw\u00f6\n\u001cx7\u0002\u00cd\u00be\u0099i%\u0010\u00ef\u009c\u00af\u00e6)\u00b3\u00ad\u00c9\u00de\u00c6\u00c0\u00edCuf\u00ca\u0010/\u0013~\u0014\u0083\u0000\u00c6*mq\u00e6Q\u00a3\u00fd\u0084\u00d9\u0010Xb\u0000\u00fb\u0010\u00f3\u0085nZ\u00db\u00fb\u009b\u00a2\t\u0014X\u0018\u00f3\u0082\u00b7m\u00d6x\u00f5Vs>\u0082\u00a9\n\u00e3\u0019\u00e0a\u008dZ\u00ca2\u00a6\u001eA\u0018\"\u0081\u00f8\u00e8\u00f4\u0099\u00c3O\u0013\u00e7\u00ef\u008c\b\u00db\u001dgz\u00d9~\u00ae\u00dd\u008b\u00c7\f\u0018\u009e\u00fb\u00f6\u00e3?!\u00b5/f?\u00cf\u00b0rb]e\u00e9\u0083\u00a6Z4i\u0089c\u0018\u00f0..N\u0010\u00e8*\u00807\u00f3\u00e9c\u00b3\u00e9q\u0018\u00d4\u008c\u00f0\u00c8\u0099\u0084\u0005\u00f3\u0018egr\u0000[\u0080\u0081\u00af5K\u00b6&.G\u0099\u00cbEv3\u00bc\u0013Q\u001c\u00be\u0018\u000b&\u001a\u00cc\u0007U\u001am\u0016\u00d6H\u00af)\u00f7\u0013\u0004\u00f0\u0017T\u000e\u0081\u00e3\u00f4\u009c\u0018\u00d2i\u0092\u000e/\u00a8\u00c3\u00d4\u00cc\u0081\u00f3\u00c1]\u0015]Z\u00b3\u00c6<\u008e\u0081\u00ce\u00e6\u00db\u0010\u00b0\u00e9=\u00d6\u0002 a\u001d\u00ff`\u00dc\u000ez|\u00ed\u00f3\u0010\u0019,\u008d\u0001\u00d3|\u00e0\u0080\u00cd\u00d3,\u00d8\u0002\u001c/\u00b6\u0010E\u0092\u0019\u00a6\u00dc]%J|\b^\u000f\u00c5\u00a6a0\u0010\u00d8\f\u009e\u00abP\u0083\u0006\u00b0=\u00d9\u00ba\u00c6xGw&\u0010\u00e6\u001e\u00c6\u00a3w\u00d2\u00c5\u001c\u0083\u000e\u0097h\u00fcp\u009ah\u0010\u0080Z\u0002\u0000\u0091h\u0015\u00da\u0002\u00ce\u00c6\u00dc\u00db\u00ab\u00e9\u00cc\u0010y8\u001e\u0090\u000e\u00f0-g\u0081\u0090l}\u00cc\u00c5_C\u0010\u0083\u008b\u00ef\u00ddj\u00f7s\u00f7'p\u00ea\u009c4\u0011'L\u0010c1\u00eb\u00f7\u00b5\u0011\u00dc\u0003!N\u001a\u008fv\u00bbp\u00b3 \u00e6\u001e\u00c6\u00a3w\u00d2\u00c5\u001ci\u008b\u00bf\u0001%\u0003sa.\u00ae\u00c9J\u00d3^:\u00ba\u0093\u0011,\u00baW$C/\u0010egr\u0000[\u0080\u0081\u00af\u00d4\u009c\u00f7\u00ed\u0019\u00bb\u00f1c\u0010\u0083\u0015^\u0013\u00bd\u00f8S\u00b7\u00feU\u001c\u00f2\u0003A9\u008e\u0010B\u00a6\u001c\u00d69\u001d\u00b1\u00ca\u00a7T=\\[Q\u00cc\f";
                        var18_6 = "\u00d5\u008d\t\n\u00d9\u0099\u0017\"\u00fa\b\u00c4\u00f9\u00c8\u00a1(\u00e1\u0010\u00f7\u0097YY\u00d9\u00d5\u00c8X\u0096\u009a\u00b4\u00df5\u009bH\u0015\u0010\u0087\u00a6k\u00e4\u00f1?8\u00a1\u00d8\u00e6\u0018\u00dc\u00a9kV\u00aa j\f;\u00ea\u00b0\u00ac\u00a0\u00ae\u0001\u00dc\u008a\u00ce*a\u001ecTda\u001cu\u00d1\u00c57\u00ecw`D\u0012\u0002\u00907\u0010z@ \u000b\u009dq\u008b0\u00b1]\u00ab\u00c3Z\u00016]\u0010y8\u001e\u0090\u000e\u00f0-g\u0099\u009b\u00deSU}\u0001\u00ea\u0018\u0086\f\u00fb\u00dc\u00fc\u00d4!\u008e\u009a\u00c2\u00fd\u001b\u001a\u0000\u00de8\u00eb\u00c3\u00e1\u0090d\u00d0\u00dc.\u0010\u00b8%\u00a9\u00a7\u0013\u0005}k\u00af\u00f2\u00few\u0095\u00e4\u00ec\\\u0010\u00f7\u00efG\u0090\u0013!\"0\u00c2;<\u00ee\u00ac\u00e5~\u00b6\u0018V\u009f\u00a6\u009ac\u00e1\u00b4A\u007f\u0006^w\u00b5h~\u00e6J\u00db\u001f\u00a5\u009d\u00910^ o\u001dD2/\u00b0\u00c6\u0001\u0018\u00b8\u00feD\u00da\u00b6A2\u00bb\u00a1;M;\u00a5\u00b4K\u00b8|\u00fa\u001b\u00dd\u009dp\u00ca\u0010@\u00dd\u0006\u00a0zr\u00a8&8l\u00b0\u00e3\u00aa\u00b9j\u00ba\u0010\u009e\u00fb\u00f6\u00e3?!\u00b5/R-\u001c0\u00a7\u0012eN\u0010\u00ad\u00a3\u0015\u0007y:\u00efs\u00cc\u00b6\u00e2J\u00c4\u00955L\u0018O\u00b7\u00a0T\u0014*a`\u00b2\u00d4o\u008f\u0083\u0080\u00f3\u0080\u00ee\u00a3\fr\u00cf\u0002\u0001\u0005\u0010\u00aa\u00ae\u00d9\u00b40\u00dbB\u00ff*q\u0099\u00d8\u00b0g\u009b7\u0010#\u00c2}\u0094\u0080\u00b7\u0095e\u00f7\u00c6\u00af\u0003\u00d3\u0001nr\u0018\u0084{\u00ac\u00e4\u0003\u00c6\u00bd\u0099g\u0096\u008d\u00daw\u00f6\n\u001cx7\u0002\u00cd\u00be\u0099i%\u0010\u00ef\u009c\u00af\u00e6)\u00b3\u00ad\u00c9\u00de\u00c6\u00c0\u00edCuf\u00ca\u0010/\u0013~\u0014\u0083\u0000\u00c6*mq\u00e6Q\u00a3\u00fd\u0084\u00d9\u0010Xb\u0000\u00fb\u0010\u00f3\u0085nZ\u00db\u00fb\u009b\u00a2\t\u0014X\u0018\u00f3\u0082\u00b7m\u00d6x\u00f5Vs>\u0082\u00a9\n\u00e3\u0019\u00e0a\u008dZ\u00ca2\u00a6\u001eA\u0018\"\u0081\u00f8\u00e8\u00f4\u0099\u00c3O\u0013\u00e7\u00ef\u008c\b\u00db\u001dgz\u00d9~\u00ae\u00dd\u008b\u00c7\f\u0018\u009e\u00fb\u00f6\u00e3?!\u00b5/f?\u00cf\u00b0rb]e\u00e9\u0083\u00a6Z4i\u0089c\u0018\u00f0..N\u0010\u00e8*\u00807\u00f3\u00e9c\u00b3\u00e9q\u0018\u00d4\u008c\u00f0\u00c8\u0099\u0084\u0005\u00f3\u0018egr\u0000[\u0080\u0081\u00af5K\u00b6&.G\u0099\u00cbEv3\u00bc\u0013Q\u001c\u00be\u0018\u000b&\u001a\u00cc\u0007U\u001am\u0016\u00d6H\u00af)\u00f7\u0013\u0004\u00f0\u0017T\u000e\u0081\u00e3\u00f4\u009c\u0018\u00d2i\u0092\u000e/\u00a8\u00c3\u00d4\u00cc\u0081\u00f3\u00c1]\u0015]Z\u00b3\u00c6<\u008e\u0081\u00ce\u00e6\u00db\u0010\u00b0\u00e9=\u00d6\u0002 a\u001d\u00ff`\u00dc\u000ez|\u00ed\u00f3\u0010\u0019,\u008d\u0001\u00d3|\u00e0\u0080\u00cd\u00d3,\u00d8\u0002\u001c/\u00b6\u0010E\u0092\u0019\u00a6\u00dc]%J|\b^\u000f\u00c5\u00a6a0\u0010\u00d8\f\u009e\u00abP\u0083\u0006\u00b0=\u00d9\u00ba\u00c6xGw&\u0010\u00e6\u001e\u00c6\u00a3w\u00d2\u00c5\u001c\u0083\u000e\u0097h\u00fcp\u009ah\u0010\u0080Z\u0002\u0000\u0091h\u0015\u00da\u0002\u00ce\u00c6\u00dc\u00db\u00ab\u00e9\u00cc\u0010y8\u001e\u0090\u000e\u00f0-g\u0081\u0090l}\u00cc\u00c5_C\u0010\u0083\u008b\u00ef\u00ddj\u00f7s\u00f7'p\u00ea\u009c4\u0011'L\u0010c1\u00eb\u00f7\u00b5\u0011\u00dc\u0003!N\u001a\u008fv\u00bbp\u00b3 \u00e6\u001e\u00c6\u00a3w\u00d2\u00c5\u001ci\u008b\u00bf\u0001%\u0003sa.\u00ae\u00c9J\u00d3^:\u00ba\u0093\u0011,\u00baW$C/\u0010egr\u0000[\u0080\u0081\u00af\u00d4\u009c\u00f7\u00ed\u0019\u00bb\u00f1c\u0010\u0083\u0015^\u0013\u00bd\u00f8S\u00b7\u00feU\u001c\u00f2\u0003A9\u008e\u0010B\u00a6\u001c\u00d69\u001d\u00b1\u00ca\u00a7T=\\[Q\u00cc\f".length();
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
                            var11_3[var17_4++] = CP_xD.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "H\"D\u00e4\u009e]\u0082\u008f\u00ec\u00bf\u0097$\u0085lfhz\u00eb|g\u00c1\u0007\u00f79\u0018o\u001dD2/\u00b0\u00c6\u0001\u0018\u00b8\u00feD\u00da\u00b6A2\u000f{\u0014\u00a5\u00c5\u00f0\u008bd";
                            var18_6 = "H\"D\u00e4\u009e]\u0082\u008f\u00ec\u00bf\u0097$\u0085lfhz\u00eb|g\u00c1\u0007\u00f79\u0018o\u001dD2/\u00b0\u00c6\u0001\u0018\u00b8\u00feD\u00da\u00b6A2\u000f{\u0014\u00a5\u00c5\u00f0\u008bd".length();
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
                            var11_3[var17_4++] = CP_xD.a(var19_9).intern();
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
                CP_xD.d = new HashMap<K, V>(13);
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
                var6_12 = new long[75];
                var3_13 = 0;
                var4_14 = " \u00a5\u008f2\u00e0\u000b\u001a\u00dfT\u0011\r\u000b]\u00b95\u008dl\t\u00d7\u00b6\u00b4\u00c8G!\u0089\u00a5\u008e9\u00daH!\u0012\u00e4F&\u00d7\u001c\u00d6G\u0001DT\u001e\u0099Kt\u00a9\u00ed\u00f6t@M\u00f5\u00d5I\u009b\u00d6.\u0001iEw\u00c6XE\u008cZ\b\u00c2,\u009c\u0092\u00b2s\u00f7\u00fag\u00db`\u0080\u00c6\u001e\u00a0(<\u00c5+[\u00ca\u00b8\u00cd\u00a3\u00e9\u00b7t\u0084V\u0019\u00ef\u00a4r\u00ebD )\u0014\u00f6\u00e0\u00ffX\u008e\u008bpIH\u00c7\u00b0\u00a8\u0091^14\u00c2}\u00ca\u000f'\u00b0\u00cc\u00e2\u008b\u00fe5e\u0016\u007f\u00ee!y\u0013\u00f5\u00d9\u001f\u0019\u009ao\u00e1\u00ea\u001f0L\r\u008bp.\u00a8\u00ce\u0001\u00cd\u0006\u00b6B0\u00ae\u0003\u00f6\u00e7\u0003\u00a2IG\u0092O{\u000f\u00e9\u00f9OL\u00ff\u00a8\u00b8\u00d8.\u00cf\u00ea(\u0086'\u00f2|\u00e8TZV*`+\u00c7\u00fd\u00db\u00c2\u00d9@\u00ff\u00e3\u00c6\u0096\u00118\u00b4c,\u009f3y\u00d1\u0013z\u0015t\u00e5Pm<O\u0000!<!8,\u0083P\u00da\u00b0+n\u00d8\u00b7\u0007 \u00da\u00d6\u00ca\u00c9\u00d9\u00f2\u0012o\u00f1\u00dc}&\u00bf\u001f\u00ee<C\u00bb\u00e5\u001eI\u00b7WZ\u00f5\u00da\u00ec\\\u00bfE\u00bc\n)\u00bbW\u00de\u00c5\u008e\u00d5\u00c5\u00a4:\u0099F\u009a\u00b7\u00e9\u00b6'mH\u0084Y\u0017\u00b3\u00d8>\u00d4\u00f7r\u00f9y\u008cT\u0099\u00c4\u0093\\VB\u0099K\u00cf p\u00e2\u00af\u0080\u00eey\u00f6\u00b0\u00d6\u00e6\u00d2n\u00fcB\u00fb\u008b\u009f\u00a2\u0018O\u0090\u00987\u00bb4\u001c\u00a3N\u008d_o\u00f1\u00da\u00c7\u00d6<\u00df\u009d\u00a6\u0001\u0087\u00ba\rK\u00b0\u00ba\u0003\u00fd\u0017d.+P\u00c7'\u0011\u00c6\u001a\u00feD\u00b9\u00c7\u00cd\u00d0w\u0092\u00dcyC\u00c9*\u00aeDVK\u00d2!\u00b6\u00fb\u00fc\u00bd\u0019\u00e4\u00c4\u00bf]\u00c1\u0011\u00a5\u00c9j\u0086\u00cau\u00d1\u00e2\u00cc\u00c0\u00d5\u0005\u0092Bz6\u0002K\u00d8z\n\u00e4\u00b8\u001f\b/y\u000f\u008d\u00cc\u00a7`\u00c1\u00e6\u00ed+J\u00848u\u00e0\u0093p\u0012d\u00dc@\u0011\u0010\u00e5\u00f6\u00c7\u00d4\u00eb\u00fa\u00ec\u00ab\u00d3\u00b3\u0085\tG!\u008b\u00bet\u0082\u0004\u0010\u00ff\u00ef\u0088\u0095\u001ag\u0097\u00e3[/\u0001\u00d7e\u001b\u00b4h\u0099=oh\u008e\u00e5\u00c7\u00a3\u00ccd\u0001:\u00ce\u00af\u00cc&i\u00adk(_1B\u00d4'ji8\u00e3\\_v\u0086\u00013a\u00d4\u0016\u000e\u00f8o0\u00b6\u00a6\u00bb\u008b\u000e\u00b4\u00ff\u00f2rT'y\u00c4O\u00a7\u009e\u00d4 \u00d9=\u008b\u00d6\u00f3\u008auE\u000f\u00c0L*\u00fa\u00fe\u00adN\u00bb\u00f6\u0095.\u00a6\u00a6\u001c\u00e8U+M\u0005\u0012\u0089&+\u00ee\u009c\u009a";
                var5_15 = " \u00a5\u008f2\u00e0\u000b\u001a\u00dfT\u0011\r\u000b]\u00b95\u008dl\t\u00d7\u00b6\u00b4\u00c8G!\u0089\u00a5\u008e9\u00daH!\u0012\u00e4F&\u00d7\u001c\u00d6G\u0001DT\u001e\u0099Kt\u00a9\u00ed\u00f6t@M\u00f5\u00d5I\u009b\u00d6.\u0001iEw\u00c6XE\u008cZ\b\u00c2,\u009c\u0092\u00b2s\u00f7\u00fag\u00db`\u0080\u00c6\u001e\u00a0(<\u00c5+[\u00ca\u00b8\u00cd\u00a3\u00e9\u00b7t\u0084V\u0019\u00ef\u00a4r\u00ebD )\u0014\u00f6\u00e0\u00ffX\u008e\u008bpIH\u00c7\u00b0\u00a8\u0091^14\u00c2}\u00ca\u000f'\u00b0\u00cc\u00e2\u008b\u00fe5e\u0016\u007f\u00ee!y\u0013\u00f5\u00d9\u001f\u0019\u009ao\u00e1\u00ea\u001f0L\r\u008bp.\u00a8\u00ce\u0001\u00cd\u0006\u00b6B0\u00ae\u0003\u00f6\u00e7\u0003\u00a2IG\u0092O{\u000f\u00e9\u00f9OL\u00ff\u00a8\u00b8\u00d8.\u00cf\u00ea(\u0086'\u00f2|\u00e8TZV*`+\u00c7\u00fd\u00db\u00c2\u00d9@\u00ff\u00e3\u00c6\u0096\u00118\u00b4c,\u009f3y\u00d1\u0013z\u0015t\u00e5Pm<O\u0000!<!8,\u0083P\u00da\u00b0+n\u00d8\u00b7\u0007 \u00da\u00d6\u00ca\u00c9\u00d9\u00f2\u0012o\u00f1\u00dc}&\u00bf\u001f\u00ee<C\u00bb\u00e5\u001eI\u00b7WZ\u00f5\u00da\u00ec\\\u00bfE\u00bc\n)\u00bbW\u00de\u00c5\u008e\u00d5\u00c5\u00a4:\u0099F\u009a\u00b7\u00e9\u00b6'mH\u0084Y\u0017\u00b3\u00d8>\u00d4\u00f7r\u00f9y\u008cT\u0099\u00c4\u0093\\VB\u0099K\u00cf p\u00e2\u00af\u0080\u00eey\u00f6\u00b0\u00d6\u00e6\u00d2n\u00fcB\u00fb\u008b\u009f\u00a2\u0018O\u0090\u00987\u00bb4\u001c\u00a3N\u008d_o\u00f1\u00da\u00c7\u00d6<\u00df\u009d\u00a6\u0001\u0087\u00ba\rK\u00b0\u00ba\u0003\u00fd\u0017d.+P\u00c7'\u0011\u00c6\u001a\u00feD\u00b9\u00c7\u00cd\u00d0w\u0092\u00dcyC\u00c9*\u00aeDVK\u00d2!\u00b6\u00fb\u00fc\u00bd\u0019\u00e4\u00c4\u00bf]\u00c1\u0011\u00a5\u00c9j\u0086\u00cau\u00d1\u00e2\u00cc\u00c0\u00d5\u0005\u0092Bz6\u0002K\u00d8z\n\u00e4\u00b8\u001f\b/y\u000f\u008d\u00cc\u00a7`\u00c1\u00e6\u00ed+J\u00848u\u00e0\u0093p\u0012d\u00dc@\u0011\u0010\u00e5\u00f6\u00c7\u00d4\u00eb\u00fa\u00ec\u00ab\u00d3\u00b3\u0085\tG!\u008b\u00bet\u0082\u0004\u0010\u00ff\u00ef\u0088\u0095\u001ag\u0097\u00e3[/\u0001\u00d7e\u001b\u00b4h\u0099=oh\u008e\u00e5\u00c7\u00a3\u00ccd\u0001:\u00ce\u00af\u00cc&i\u00adk(_1B\u00d4'ji8\u00e3\\_v\u0086\u00013a\u00d4\u0016\u000e\u00f8o0\u00b6\u00a6\u00bb\u008b\u000e\u00b4\u00ff\u00f2rT'y\u00c4O\u00a7\u009e\u00d4 \u00d9=\u008b\u00d6\u00f3\u008auE\u000f\u00c0L*\u00fa\u00fe\u00adN\u00bb\u00f6\u0095.\u00a6\u00a6\u001c\u00e8U+M\u0005\u0012\u0089&+\u00ee\u009c\u009a".length();
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
                    var4_14 = "\u0087\u00fcC\u009b\u00ea\u001b\u0098\u00c8\u00e7\u0088\u0012\u0001\u0090\u0012oi";
                    var5_15 = "\u0087\u00fcC\u009b\u00ea\u001b\u0098\u00c8\u00e7\u0088\u0012\u0001\u0090\u0012oi".length();
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
        CP_xD.b = var6_12;
        CP_xD.c = new Integer[75];
        CP_xD.TELEPORT_CONFIRM = new CP_xD();
        CP_xD.QUERY_BLOCK_NBT = new CP_xD();
        CP_xD.CHAT_MESSAGE = new CP_xD();
        CP_xD.CLIENT_STATUS = new CP_xD();
        CP_xD.CLIENT_SETTINGS = new CP_xD();
        CP_xD.TAB_COMPLETE = new CP_xD();
        CP_xD.WINDOW_CONFIRMATION = new CP_xD();
        CP_xD.CLICK_WINDOW_BUTTON = new CP_xD();
        CP_xD.CLICK_WINDOW = new CP_xD();
        CP_xD.CLOSE_WINDOW = new CP_xD();
        CP_xD.PLUGIN_MESSAGE = new CP_xD();
        CP_xD.EDIT_BOOK = new CP_xD();
        CP_xD.QUERY_ENTITY_NBT = new CP_xD();
        CP_xD.INTERACT_ENTITY = new CP_xD();
        CP_xD.KEEP_ALIVE = new CP_xD();
        CP_xD.PLAYER_FLYING = new CP_xD();
        CP_xD.PLAYER_POSITION = new CP_xD();
        CP_xD.PLAYER_POSITION_AND_ROTATION = new CP_xD();
        CP_xD.PLAYER_ROTATION = new CP_xD();
        CP_xD.VEHICLE_MOVE = new CP_xD();
        CP_xD.STEER_BOAT = new CP_xD();
        CP_xD.PICK_ITEM = new CP_xD();
        CP_xD.CRAFT_RECIPE_REQUEST = new CP_xD();
        CP_xD.PLAYER_ABILITIES = new CP_xD();
        CP_xD.PLAYER_DIGGING = new CP_xD();
        CP_xD.ENTITY_ACTION = new CP_xD();
        CP_xD.STEER_VEHICLE = new CP_xD();
        CP_xD.RECIPE_BOOK_DATA = new CP_xD();
        CP_xD.NAME_ITEM = new CP_xD();
        CP_xD.RESOURCE_PACK_STATUS = new CP_xD();
        CP_xD.ADVANCEMENT_TAB = new CP_xD();
        CP_xD.SELECT_TRADE = new CP_xD();
        CP_xD.SET_BEACON_EFFECT = new CP_xD();
        CP_xD.HELD_ITEM_CHANGE = new CP_xD();
        CP_xD.UPDATE_COMMAND_BLOCK = new CP_xD();
        CP_xD.UPDATE_COMMAND_BLOCK_MINECART = new CP_xD();
        CP_xD.CREATIVE_INVENTORY_ACTION = new CP_xD();
        CP_xD.UPDATE_STRUCTURE_BLOCK = new CP_xD();
        CP_xD.UPDATE_SIGN = new CP_xD();
        CP_xD.ANIMATION = new CP_xD();
        CP_xD.SPECTATE = new CP_xD();
        CP_xD.PLAYER_BLOCK_PLACEMENT = new CP_xD();
        CP_xD.USE_ITEM = new CP_xD();
        CP_xD.CP_I = CP_xD.CP_x();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x981;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_xD", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_xD.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_xD.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_xD" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_xD.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

