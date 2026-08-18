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

public final class CP_u_
extends Enum<CP_u_> {
    public static final /* enum */ CP_u_ TELEPORT_CONFIRM;
    public static final /* enum */ CP_u_ QUERY_BLOCK_NBT;
    public static final /* enum */ CP_u_ SET_DIFFICULTY;
    public static final /* enum */ CP_u_ CHAT_MESSAGE;
    public static final /* enum */ CP_u_ CLIENT_STATUS;
    public static final /* enum */ CP_u_ CLIENT_SETTINGS;
    public static final /* enum */ CP_u_ TAB_COMPLETE;
    public static final /* enum */ CP_u_ WINDOW_CONFIRMATION;
    public static final /* enum */ CP_u_ CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_u_ CLICK_WINDOW;
    public static final /* enum */ CP_u_ CLOSE_WINDOW;
    public static final /* enum */ CP_u_ PLUGIN_MESSAGE;
    public static final /* enum */ CP_u_ EDIT_BOOK;
    public static final /* enum */ CP_u_ QUERY_ENTITY_NBT;
    public static final /* enum */ CP_u_ INTERACT_ENTITY;
    public static final /* enum */ CP_u_ GENERATE_STRUCTURE;
    public static final /* enum */ CP_u_ KEEP_ALIVE;
    public static final /* enum */ CP_u_ LOCK_DIFFICULTY;
    public static final /* enum */ CP_u_ PLAYER_POSITION;
    public static final /* enum */ CP_u_ PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_u_ PLAYER_ROTATION;
    public static final /* enum */ CP_u_ PLAYER_FLYING;
    public static final /* enum */ CP_u_ VEHICLE_MOVE;
    public static final /* enum */ CP_u_ STEER_BOAT;
    public static final /* enum */ CP_u_ PICK_ITEM;
    public static final /* enum */ CP_u_ CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_u_ PLAYER_ABILITIES;
    public static final /* enum */ CP_u_ PLAYER_DIGGING;
    public static final /* enum */ CP_u_ ENTITY_ACTION;
    public static final /* enum */ CP_u_ STEER_VEHICLE;
    public static final /* enum */ CP_u_ SET_RECIPE_BOOK_STATE;
    public static final /* enum */ CP_u_ SET_DISPLAYED_RECIPE;
    public static final /* enum */ CP_u_ NAME_ITEM;
    public static final /* enum */ CP_u_ RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_u_ ADVANCEMENT_TAB;
    public static final /* enum */ CP_u_ SELECT_TRADE;
    public static final /* enum */ CP_u_ SET_BEACON_EFFECT;
    public static final /* enum */ CP_u_ HELD_ITEM_CHANGE;
    public static final /* enum */ CP_u_ UPDATE_COMMAND_BLOCK;
    public static final /* enum */ CP_u_ UPDATE_COMMAND_BLOCK_MINECART;
    public static final /* enum */ CP_u_ CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_u_ UPDATE_JIGSAW_BLOCK;
    public static final /* enum */ CP_u_ UPDATE_STRUCTURE_BLOCK;
    public static final /* enum */ CP_u_ UPDATE_SIGN;
    public static final /* enum */ CP_u_ ANIMATION;
    public static final /* enum */ CP_u_ SPECTATE;
    public static final /* enum */ CP_u_ PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_u_ USE_ITEM;
    private static final /* synthetic */ CP_u_[] CP_W;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_u_[] values() {
        return (CP_u_[])CP_W.clone();
    }

    public static CP_u_ valueOf(String string) {
        return Enum.valueOf(CP_u_.class, string);
    }

    private static /* synthetic */ CP_u_[] CP_z() {
        long l = a ^ 0x72DEA4D94DB9L;
        CP_u_[] ilIlu_Array = new CP_u_[CP_u_.a("w", (int)18778, (long)(0x6938C1F8FD3CBF7AL ^ l))];
        ilIlu_Array[0] = TELEPORT_CONFIRM;
        ilIlu_Array[1] = QUERY_BLOCK_NBT;
        ilIlu_Array[2] = SET_DIFFICULTY;
        ilIlu_Array[3] = CHAT_MESSAGE;
        ilIlu_Array[4] = CLIENT_STATUS;
        ilIlu_Array[5] = CLIENT_SETTINGS;
        ilIlu_Array[CP_u_.a("w", (int)20619, (long)(0x1B7908B7B396A6F9L ^ l))] = TAB_COMPLETE;
        ilIlu_Array[CP_u_.a("w", (int)26500, (long)(0x35B9F8B8403D11EDL ^ l))] = WINDOW_CONFIRMATION;
        ilIlu_Array[CP_u_.a("w", (int)25979, (long)(0x2E13C6296EA9343L ^ l))] = CLICK_WINDOW_BUTTON;
        ilIlu_Array[CP_u_.a("w", (int)14890, (long)(0x2600434D4588CC21L ^ l))] = CLICK_WINDOW;
        ilIlu_Array[CP_u_.a("w", (int)10373, (long)(0x1CFD8D66FE94DEB1L ^ l))] = CLOSE_WINDOW;
        ilIlu_Array[CP_u_.a("w", (int)6096, (long)(0x2B5936876661A7L ^ l))] = PLUGIN_MESSAGE;
        ilIlu_Array[CP_u_.a("w", (int)1375, (long)(0xE30C2CB54E3F320L ^ l))] = EDIT_BOOK;
        ilIlu_Array[CP_u_.a("w", (int)10719, (long)(0x5E1FEBEB2BE1DFCCL ^ l))] = QUERY_ENTITY_NBT;
        ilIlu_Array[CP_u_.a("w", (int)25665, (long)(0x41A47C616EA3124BL ^ l))] = INTERACT_ENTITY;
        ilIlu_Array[CP_u_.a("w", (int)4106, (long)(0x2A4EEDEE6FAFE604L ^ l))] = GENERATE_STRUCTURE;
        ilIlu_Array[CP_u_.a("w", (int)25696, (long)(0x3E8BBAB42630127AL ^ l))] = KEEP_ALIVE;
        ilIlu_Array[CP_u_.a("w", (int)28278, (long)(0x98A5B4F64441803L ^ l))] = LOCK_DIFFICULTY;
        ilIlu_Array[CP_u_.a("w", (int)17994, (long)(0x2992BD6A8ECA3024L ^ l))] = PLAYER_POSITION;
        ilIlu_Array[CP_u_.a("w", (int)21471, (long)(0xEB7B2826B50A5D0L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIlu_Array[CP_u_.a("w", (int)22463, (long)(0x154E06B6CAE521BFL ^ l))] = PLAYER_ROTATION;
        ilIlu_Array[CP_u_.a("w", (int)10614, (long)(0xF54E2E64D83DF46L ^ l))] = PLAYER_FLYING;
        ilIlu_Array[CP_u_.a("w", (int)1416, (long)(0x59CBAE980A12F3FBL ^ l))] = VEHICLE_MOVE;
        ilIlu_Array[CP_u_.a("w", (int)11030, (long)(0x381E17A68FACDD1BL ^ l))] = STEER_BOAT;
        ilIlu_Array[CP_u_.a("w", (int)23915, (long)(0x461ADB4949C0AB47L ^ l))] = PICK_ITEM;
        ilIlu_Array[CP_u_.a("w", (int)24824, (long)(0x4C954C27CA416F1L ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIlu_Array[CP_u_.a("w", (int)18989, (long)(0x1182E6989A923C02L ^ l))] = PLAYER_ABILITIES;
        ilIlu_Array[CP_u_.a("w", (int)24780, (long)(0x7CBC5B46F41D16EEL ^ l))] = PLAYER_DIGGING;
        ilIlu_Array[CP_u_.a("w", (int)30758, (long)(0x7AB9F98E17AB0E5DL ^ l))] = ENTITY_ACTION;
        ilIlu_Array[CP_u_.a("w", (int)32317, (long)(0x11F67DDFF9CD0814L ^ l))] = STEER_VEHICLE;
        ilIlu_Array[CP_u_.a("w", (int)20635, (long)(0x337BA3EA0BC8A68EL ^ l))] = SET_RECIPE_BOOK_STATE;
        ilIlu_Array[CP_u_.a("w", (int)7483, (long)(0x4607D473737F6B22L ^ l))] = SET_DISPLAYED_RECIPE;
        ilIlu_Array[CP_u_.a("w", (int)8620, (long)(0x155D22B6DF53D7D0L ^ l))] = NAME_ITEM;
        ilIlu_Array[CP_u_.a("w", (int)29908, (long)(0x70F0F872F94702C5L ^ l))] = RESOURCE_PACK_STATUS;
        ilIlu_Array[CP_u_.a("w", (int)31669, (long)(0x7E867D2218E20DA8L ^ l))] = ADVANCEMENT_TAB;
        ilIlu_Array[CP_u_.a("w", (int)29154, (long)(0x4E0E5395405307D5L ^ l))] = SELECT_TRADE;
        ilIlu_Array[CP_u_.a("w", (int)26239, (long)(0x41D2699499D21012L ^ l))] = SET_BEACON_EFFECT;
        ilIlu_Array[CP_u_.a("w", (int)1016, (long)(0x7A745C2643D4F5E6L ^ l))] = HELD_ITEM_CHANGE;
        ilIlu_Array[CP_u_.a("w", (int)14877, (long)(0x2B6AFDA041BCCC19L ^ l))] = UPDATE_COMMAND_BLOCK;
        ilIlu_Array[CP_u_.a("w", (int)23228, (long)(0x203AF993D82AAC9BL ^ l))] = UPDATE_COMMAND_BLOCK_MINECART;
        ilIlu_Array[CP_u_.a("w", (int)31749, (long)(0x4811DB6F83A70A1EL ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIlu_Array[CP_u_.a("w", (int)14691, (long)(0x24803195F2D64F65L ^ l))] = UPDATE_JIGSAW_BLOCK;
        ilIlu_Array[CP_u_.a("w", (int)4529, (long)(0x19549095FF36679BL ^ l))] = UPDATE_STRUCTURE_BLOCK;
        ilIlu_Array[CP_u_.a("w", (int)11251, (long)(0x2F33B26260805DE7L ^ l))] = UPDATE_SIGN;
        ilIlu_Array[CP_u_.a("w", (int)11911, (long)(0x3B576C6E005758A3L ^ l))] = ANIMATION;
        ilIlu_Array[CP_u_.a("w", (int)6784, (long)(0x2C0EA8904606ECBFL ^ l))] = SPECTATE;
        ilIlu_Array[CP_u_.a("w", (int)31661, (long)(0x634A4CB60C558DBFL ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIlu_Array[CP_u_.a("w", (int)7342, (long)(0x84BED707B556A98L ^ l))] = USE_ITEM;
        return ilIlu_Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_u_.a = CP_s.a(-8542629484229421308L, 1399802823045363245L, MethodHandles.lookup().lookupClass()).a(1532303240190L);
                        var20 = CP_u_.a ^ 60423128862735L;
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
                        var11_3 = new String[48];
                        var17_4 = 0;
                        var16_5 = "\u00e4Gy\u00ab\u00ffS\u00b7\u00cbd\u00d4\u00d7\u0013\u00d4\u0019\u00d1\u009c\u0010\u00d2+\u00b8\u00d8\u00e6\u0097\u0012\u00b0l\u00c7%R\u00fc\u0006R\u00f3\u0010\u008dN8G$\u007f\u00da\u00d5\u00ad\u00e4\u00154k:-\u0011\u0018%\u0014\u00c5\u00cd\u00d5H%\u00ef\u00a7\u008cF\u00ba68,\u00c4\u00b7-\u00de\u00f2f\u0005\u00e3}\u0010\u00e2\u0083=]p\u00c5#/\u008cI,=SS\u00af\u00c2\u0018p[\u00de\u00bc\u00bau\u00ba\u00ef\u00918\u0096\\1\u0087\u00c3\u00c4s\u009e\u00ee\u00b3u\\j\u00a8\u0018\u00caE\u00e5pB\u009fM_\u00d3io\u000f/5\u009e\u00ad8.\u008a\u009c\u0084}|\u0091\u0010\u00dd\u00cfXj\f\u00d7\u00f6CP(\u00d4{\u007f\u0089T\u0000\u0018\u0016\u00f3a\u00b8\u00f1k\u0016IG%9\u00dc}\u0089\u001a\u00ef\u0089w\r_\u0094wx\u0090\u0018xA&\u00aeGTN\u0004\u0002d6\u001ba@Z\u0099q1H]n\u00be\u00a2\u0081\u0010In\u00c7c0\u00cc\u0017\u00d7o\u007f$\u0010\u0001K\u00c5\u0010\u0018\u0099\u008e\u0093+\u00f0\u0012G\u00a8~\u00b9\u00bbG7^\u009b\\\u00afV\u0092G\u00c9\u000f\u0091\u00e7\u0010\u00e7\u0098\u001408\u00fd\u00d0O[9D\u00c4\u00b3\u0007\u0003\u009d\u0010\u00de\u00dc\u00d8\u00f7\u00bb\u00a7\u00ad\u00ae\u00f8\u00b8\u0095v\u00ac\u00ae\u000e(\u0010\u00ef6\u00ee\u00bb\u00ff\u0086\u001b_\u0098\u00f6\u00dbnS\u00cf~\u0004\u0018\u00d45D\u00be5\u0099\u0095\u00bcF\u008b=\u00d1\u000bS\u00c4\u00d7\t?\u0000\u00e0\u00c6\u00eb\u000fr\u0010\u001e\u00bf\u000e\u00c5(\u0017\u001b\u0094\u00a3\u0098\u00da\u00c0\u0001\u00e4pk\u0010\u00c4\u00dc\u00c46\u00f1+~\u00ff\u0007\u00e6C\u00fb\u00feVQ\u0014\u0018\u00a3Hc\u00ef\u00b5\u00e5\u00ac\u00da\u009b\u001e\u007fi\u0017K|y\u00f6\u00d5\u0084\u00fb\u00aa\u00be6\u008e\u0018\u00d2+\u00b8\u00d8\u00e6\u0097\u0012\u00b0\u00c6\u00e8@:\u0096?\u00a0N\u00a2\u00db\u0015\u00f7\u0097\u00db\u00add\u0010=\u0089\u00a8\u00f9\u00ff\u00b8\u00f1\u00c2\u00a2\u00ff\u00013\u00fa2\u0086\u000b\u0010\u00fdb\u00fa\u0006}{\u00eeT\u00bc\u00ee\u0080}\u00e0\u00a2\u00fb\u00ee\u0010\u00054L\u00805\u00c5X\u0097\u00c5\u0004\u00da+uc\u00a8\u00c4\u0010\u00ce\u0016[\u00fb\u00c1\u0095\u008e9\u0088=\u00f0V^1z\u00b3\u0010G\u001c \u00cd\u00beNl\u00b89Y\u0003\u00c3i$\u00e6\u00ab\u0018\f\u00b0w\u00e1\u009aM1 L\u00aa\\\u00f7c\u008e]\u00c0\u009do\u00a3\u00b8\u00ce\u00c0sN\u0010!\"\u00c0\u009fv\u0016\u00c4\u00a5\u00e6\u007f[\r\u00cc\u00d9\u00b5\u00f5\u0018\u00054L\u00805\u00c5X\u0097\u0001\u001c3\u0013\u008a/\u0097)\u00c1\u00a1YE\u001b1\u0013\u00a3\u0010\u001bR?\u0014C\u00f0M\u00c9c\u00c9\u0090\n\r\u0000#\u009b \u00d3\u00e6\u00e6>\u0015\u0086\u00ba\\\u009a\u0091\u0019\u00b0\u00a4\u00c6moF\u00d2a\u00845\u0089\u00ff\u00c0$A\u00baz\u008e\u009e\u0018H\u0010\u00f0\u00c7\u00f4\u00af\u009f\u00de\u00c6M'\u00c1\u0089\u0019{^\u0094\u00e7\u0010\u00f8\u00d4\u00b4\u0012 \u0099\u00d8\u0012\u0018\u00e81z\u000bV\u00ca\u00ea\u0010=\u0089\u00a8\u00f9\u00ff\u00b8\u00f1\u00c2\u0003\u008b\u008dc\u00dd\u0003ma\u0018\u00cd\u0083\u00d6\u00b0\u00cf\u007f\u009ba\u00e9\u00acL\u000b\u001cT3\u00f2S#Q\u00d8\u008az\u00eb\u00ce\u0010\u00c8\u009f(\u0019\u008dRL\f\u0092SF\u0000\u00ddG\u0083\\\u0010\u0081\u0081z\u0004\u00c8><\u00cdZ\u0092\u00ef\u008b\u000b\b\u00a8N\u0018\u0005P\u00aa\u00f1RBA\u0093\u00e8\u0017 G\u007f\u00e3\u00d4(\u0089'\u00d4\u00d6\u00ed\u0019\u00a3\u0091\u00108\u00bc\u00cd\u00c9`0\u0089\u00be[\u009ez|n4Vh\u0018\u008b\u00e9G\t\u0002M\u00a8\u00c8y&\u00b5\u00bdpdWF5.d\u0002*\u008bb\u008d \u00ce\u0016[\u00fb\u00c1\u0095\u008e9\u00a2\u00ebYx;\u0014\u00c1\u0007i\u001d\u00ee\u00b4D\u00f7\u0015aS\u00ff\u00ea{\u0099Z\u00d7\u0086\u0010W\u009d\u00bc\u00e9\u00e2K;\u00e9\u00a2\u0090\u00f8#2R\u001d\u00be\u0010>\u00d8\u001a`\u0012\u0094b\u0019\u00ec\u00dc\u00bcD\u0010\u00d8;\u0096\u0018J\u0018\u0098\nH\u00ddt\u0095\u00d9\u0000\nL\u00ebt\u00a8\u00ac\u00f6yF\u00d3C\u00bbeT\u0010\u00d7\u00ceF\u001bv\u00a8\u00ada\n\u00ef\u00d5!e\u00fc\u00e8a\u0010!\u0087\u00a2rN\u00af\u009f+V\u0018\u00ed#5\u00f7+9\u0010\u00af\u00c0\u00b9\u008b\u009f\u00f5\u00101\u00b2T_a\u00d6\u0006J\u0005";
                        var18_6 = "\u00e4Gy\u00ab\u00ffS\u00b7\u00cbd\u00d4\u00d7\u0013\u00d4\u0019\u00d1\u009c\u0010\u00d2+\u00b8\u00d8\u00e6\u0097\u0012\u00b0l\u00c7%R\u00fc\u0006R\u00f3\u0010\u008dN8G$\u007f\u00da\u00d5\u00ad\u00e4\u00154k:-\u0011\u0018%\u0014\u00c5\u00cd\u00d5H%\u00ef\u00a7\u008cF\u00ba68,\u00c4\u00b7-\u00de\u00f2f\u0005\u00e3}\u0010\u00e2\u0083=]p\u00c5#/\u008cI,=SS\u00af\u00c2\u0018p[\u00de\u00bc\u00bau\u00ba\u00ef\u00918\u0096\\1\u0087\u00c3\u00c4s\u009e\u00ee\u00b3u\\j\u00a8\u0018\u00caE\u00e5pB\u009fM_\u00d3io\u000f/5\u009e\u00ad8.\u008a\u009c\u0084}|\u0091\u0010\u00dd\u00cfXj\f\u00d7\u00f6CP(\u00d4{\u007f\u0089T\u0000\u0018\u0016\u00f3a\u00b8\u00f1k\u0016IG%9\u00dc}\u0089\u001a\u00ef\u0089w\r_\u0094wx\u0090\u0018xA&\u00aeGTN\u0004\u0002d6\u001ba@Z\u0099q1H]n\u00be\u00a2\u0081\u0010In\u00c7c0\u00cc\u0017\u00d7o\u007f$\u0010\u0001K\u00c5\u0010\u0018\u0099\u008e\u0093+\u00f0\u0012G\u00a8~\u00b9\u00bbG7^\u009b\\\u00afV\u0092G\u00c9\u000f\u0091\u00e7\u0010\u00e7\u0098\u001408\u00fd\u00d0O[9D\u00c4\u00b3\u0007\u0003\u009d\u0010\u00de\u00dc\u00d8\u00f7\u00bb\u00a7\u00ad\u00ae\u00f8\u00b8\u0095v\u00ac\u00ae\u000e(\u0010\u00ef6\u00ee\u00bb\u00ff\u0086\u001b_\u0098\u00f6\u00dbnS\u00cf~\u0004\u0018\u00d45D\u00be5\u0099\u0095\u00bcF\u008b=\u00d1\u000bS\u00c4\u00d7\t?\u0000\u00e0\u00c6\u00eb\u000fr\u0010\u001e\u00bf\u000e\u00c5(\u0017\u001b\u0094\u00a3\u0098\u00da\u00c0\u0001\u00e4pk\u0010\u00c4\u00dc\u00c46\u00f1+~\u00ff\u0007\u00e6C\u00fb\u00feVQ\u0014\u0018\u00a3Hc\u00ef\u00b5\u00e5\u00ac\u00da\u009b\u001e\u007fi\u0017K|y\u00f6\u00d5\u0084\u00fb\u00aa\u00be6\u008e\u0018\u00d2+\u00b8\u00d8\u00e6\u0097\u0012\u00b0\u00c6\u00e8@:\u0096?\u00a0N\u00a2\u00db\u0015\u00f7\u0097\u00db\u00add\u0010=\u0089\u00a8\u00f9\u00ff\u00b8\u00f1\u00c2\u00a2\u00ff\u00013\u00fa2\u0086\u000b\u0010\u00fdb\u00fa\u0006}{\u00eeT\u00bc\u00ee\u0080}\u00e0\u00a2\u00fb\u00ee\u0010\u00054L\u00805\u00c5X\u0097\u00c5\u0004\u00da+uc\u00a8\u00c4\u0010\u00ce\u0016[\u00fb\u00c1\u0095\u008e9\u0088=\u00f0V^1z\u00b3\u0010G\u001c \u00cd\u00beNl\u00b89Y\u0003\u00c3i$\u00e6\u00ab\u0018\f\u00b0w\u00e1\u009aM1 L\u00aa\\\u00f7c\u008e]\u00c0\u009do\u00a3\u00b8\u00ce\u00c0sN\u0010!\"\u00c0\u009fv\u0016\u00c4\u00a5\u00e6\u007f[\r\u00cc\u00d9\u00b5\u00f5\u0018\u00054L\u00805\u00c5X\u0097\u0001\u001c3\u0013\u008a/\u0097)\u00c1\u00a1YE\u001b1\u0013\u00a3\u0010\u001bR?\u0014C\u00f0M\u00c9c\u00c9\u0090\n\r\u0000#\u009b \u00d3\u00e6\u00e6>\u0015\u0086\u00ba\\\u009a\u0091\u0019\u00b0\u00a4\u00c6moF\u00d2a\u00845\u0089\u00ff\u00c0$A\u00baz\u008e\u009e\u0018H\u0010\u00f0\u00c7\u00f4\u00af\u009f\u00de\u00c6M'\u00c1\u0089\u0019{^\u0094\u00e7\u0010\u00f8\u00d4\u00b4\u0012 \u0099\u00d8\u0012\u0018\u00e81z\u000bV\u00ca\u00ea\u0010=\u0089\u00a8\u00f9\u00ff\u00b8\u00f1\u00c2\u0003\u008b\u008dc\u00dd\u0003ma\u0018\u00cd\u0083\u00d6\u00b0\u00cf\u007f\u009ba\u00e9\u00acL\u000b\u001cT3\u00f2S#Q\u00d8\u008az\u00eb\u00ce\u0010\u00c8\u009f(\u0019\u008dRL\f\u0092SF\u0000\u00ddG\u0083\\\u0010\u0081\u0081z\u0004\u00c8><\u00cdZ\u0092\u00ef\u008b\u000b\b\u00a8N\u0018\u0005P\u00aa\u00f1RBA\u0093\u00e8\u0017 G\u007f\u00e3\u00d4(\u0089'\u00d4\u00d6\u00ed\u0019\u00a3\u0091\u00108\u00bc\u00cd\u00c9`0\u0089\u00be[\u009ez|n4Vh\u0018\u008b\u00e9G\t\u0002M\u00a8\u00c8y&\u00b5\u00bdpdWF5.d\u0002*\u008bb\u008d \u00ce\u0016[\u00fb\u00c1\u0095\u008e9\u00a2\u00ebYx;\u0014\u00c1\u0007i\u001d\u00ee\u00b4D\u00f7\u0015aS\u00ff\u00ea{\u0099Z\u00d7\u0086\u0010W\u009d\u00bc\u00e9\u00e2K;\u00e9\u00a2\u0090\u00f8#2R\u001d\u00be\u0010>\u00d8\u001a`\u0012\u0094b\u0019\u00ec\u00dc\u00bcD\u0010\u00d8;\u0096\u0018J\u0018\u0098\nH\u00ddt\u0095\u00d9\u0000\nL\u00ebt\u00a8\u00ac\u00f6yF\u00d3C\u00bbeT\u0010\u00d7\u00ceF\u001bv\u00a8\u00ada\n\u00ef\u00d5!e\u00fc\u00e8a\u0010!\u0087\u00a2rN\u00af\u009f+V\u0018\u00ed#5\u00f7+9\u0010\u00af\u00c0\u00b9\u008b\u009f\u00f5\u00101\u00b2T_a\u00d6\u0006J\u0005".length();
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
                            var11_3[var17_4++] = CP_u_.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00d3\u00e6\u00e6>\u0015\u0086\u00ba\\\u009a\u0091\u0019\u00b0\u00a4\u00c6mo\u00eb$(\u00fd\u00e3*5\u00e5 \u00ae\u009a\u0091\u00a5\u00c8C\u0012,\u00bf \u00c8\u00dax\u0017[;\u0010x\u00a2h\u00cb;\u0001\u00be\u0011\u00c8\u00ae\u0012\u001a\u0082W_";
                            var18_6 = "\u00d3\u00e6\u00e6>\u0015\u0086\u00ba\\\u009a\u0091\u0019\u00b0\u00a4\u00c6mo\u00eb$(\u00fd\u00e3*5\u00e5 \u00ae\u009a\u0091\u00a5\u00c8C\u0012,\u00bf \u00c8\u00dax\u0017[;\u0010x\u00a2h\u00cb;\u0001\u00be\u0011\u00c8\u00ae\u0012\u001a\u0082W_".length();
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
                            var11_3[var17_4++] = CP_u_.a(var19_9).intern();
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
                CP_u_.d = new HashMap<K, V>(13);
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
                var6_12 = new long[85];
                var3_13 = 0;
                var4_14 = "\u00d6\\\u0093\u00bf(\u0082\u00d2EO\u00f9\u00e6\u00d8\u00cf\u00a6\u00ae \u00be\f\u00da\u009e\u00cbz\u00a8#\u00fd\u0013\u008e\u00a0S8\u00d0\u009cD\u00b3f\n\u00fd\b\u00baC]\u0006\u0084\u00d0>\u00ca\u0016h\u001e\u008e\u00a0\n1\u0097\u00a2y\u00f2o|\u00c5\u0013\u0005\u001a\u00b5\u00cf\u008e\u00849\u00e0u\u00ac}\t\u008a\u00f7\u00ea\u00a8s\u00ee\u001e\u00a0K3\u00cd\u0092\u00c95\u0010-\u00b5\u00c4\u00b1\u0007\u00e0\u0001\u001ezu\u00ae\u009b\u0083\u0090\u008dm'\u0080\u00efy\u00a1\u0002\fw\"\u0088\u00e4\u0086o\u00d0oid\u000ex\u00da\u00a6Y\u00bcO\u00dc\u0098*\u00bf\rm\u00bc\u00fd&\u00cd|\u00b9\u00aa\u0005\u00c9\u0088\u00ec\u00ec\u00fb\u00b6\u00a2\u0000\u0096\u00b9\u00d5\u00a8\u00bczg\u00bf\u00f3$\u00c2\u00b2\u00ccq\u0002\u00c1\u0004\u00c9\u0013\u00fe}L\\(\u00a1\u00f3NBl\u001a\f\u00de,\u00f4F\u00d22\u0004Zo\u00b0\br\u009c\u00dd\u00b1\u0093\u00e5sr\u00e2y\u0000\u00aaz\u00c8W\u0018\u008a\u00d5\u00ba\u00ffc0B|\u00d2v\u00fa\u00f2\u0011\u00fa\u000bo\u0086g_\u00f5K&t\u00a4\u00e5^\u00da\u00ff\u007faX\u0016\u00a1p\r#A\u0007\t\u00a1\u00b6hu\u00e5\u00e6\u00c4\u0007\u00a1\u00e6\u00a7d\u0000i\u0002\u0002p[|5\u0089<t\u00f7\u00c2\u00b3Z.\u0089\u0016^B\u00ed\u00de2\u001aL\u0097\u00eeh\u00db\u00c8\u00f1\u001fYvD\u00f6G@\u00ea\u00c3\u00b2=\u0003N\u00f0Gy\u00a0\u000b\u00df2\u00e6\u00ed/\u00b0\u00d2op\u00aeP\u00cau\u00a3\u00c5\u00ee\u00938\u009ab\u00a4\u009a\"\u0081\u00fbo\u00d9\u00b6)\u00e4\u00aeo\u00aa\u008c\u00d8s\u00abT\u00bc\u00e8\u0012DcJ\u001a\u00d6:O\u00bb@\u00daZ\u00ec\u009e\u00e1.\u00b0\u00f5w\u00f3\u00bf\u001b\u00f2\u00bb\u00e0\u00d2Ieq\u00a5\u00af[\u007fr\u00a2\u00e7r\\2\u00d4\u00e4\\J~\u0000Q\u00afBP\u00a0\u00d3j;\u00cd\u00b0k+\u001f\u00d6\u00cd\u00f4\u00dc\u00cf\u00bb\u00dc\u0015$\u0094\u00815\u00c3\u0090\u00f0\u001a~!\u009d\u00c9\u0005\u0011'\u00df~@\u001c\u00f6\u00db\u0004\u00f5\u0005M@>&z\u00e3=\u00d3_\u0016c\u00aec\u00bc\u00a0\u00ff\u00c1?4\u00d2\u00e1\u00ed\u00cc\u00ec\u00a7\u008f\u0011`\u00c2x#E\t\u007f\u00afE\u0018\u00bd\u00ea\u0087\u008f\u0082\t\u00fa\u0017\u00f3\u009f\u00ad\f\u00b8\u00d9\u00c3*B\u0000\u00b3\u00f6,\u0088\u0016r\u0015\u009f\u0011\u0007{<\u00a3\u0017\\\tc\u0083<\u0094m\u0017\u00e7R \u00bc\u000b&\u00b5\u00e12\u00f0\u00b3Q\u00e6\u00b9\u008b\u0092ST\u00dd\u00dd\u00df38\u00e8as7\u00ca\u00c5\u00a1\u00f8\u00c9\nY\u0000\bbbP\u00b3J\u00a7\u00c6\u00b7Si$r\u00ce\u00a8\u00ec/nl\u00a3\u00ce@\u0088g\u00cb\u00c7\u00ce\u0010\u00a0\u00a1.\u00f2\u00d6\u00c8jR\u00b9\u00a0..b/\u009e\u0002\u00f9\u0080Cs.\u00a4\u00c3\u001a 0\u00b9-\u00ae\u008f\u00ee\u00e6\u00c2\u00cfU\u00bd\u0013\u00bb\u0000:\u00e3\u00010N6f{r\u00dd TI\u00ad\u00fb\u00f6\u0004\u00a1\u00fco\u008a\u0013\u00c4\u007f\u00b6\u0092\u008dh$\u00f2\u00b2,;\u0003N\u0017`4\t\u0017\u0003\u00df\u0095\u00dfk\u00e4\u00fb";
                var5_15 = "\u00d6\\\u0093\u00bf(\u0082\u00d2EO\u00f9\u00e6\u00d8\u00cf\u00a6\u00ae \u00be\f\u00da\u009e\u00cbz\u00a8#\u00fd\u0013\u008e\u00a0S8\u00d0\u009cD\u00b3f\n\u00fd\b\u00baC]\u0006\u0084\u00d0>\u00ca\u0016h\u001e\u008e\u00a0\n1\u0097\u00a2y\u00f2o|\u00c5\u0013\u0005\u001a\u00b5\u00cf\u008e\u00849\u00e0u\u00ac}\t\u008a\u00f7\u00ea\u00a8s\u00ee\u001e\u00a0K3\u00cd\u0092\u00c95\u0010-\u00b5\u00c4\u00b1\u0007\u00e0\u0001\u001ezu\u00ae\u009b\u0083\u0090\u008dm'\u0080\u00efy\u00a1\u0002\fw\"\u0088\u00e4\u0086o\u00d0oid\u000ex\u00da\u00a6Y\u00bcO\u00dc\u0098*\u00bf\rm\u00bc\u00fd&\u00cd|\u00b9\u00aa\u0005\u00c9\u0088\u00ec\u00ec\u00fb\u00b6\u00a2\u0000\u0096\u00b9\u00d5\u00a8\u00bczg\u00bf\u00f3$\u00c2\u00b2\u00ccq\u0002\u00c1\u0004\u00c9\u0013\u00fe}L\\(\u00a1\u00f3NBl\u001a\f\u00de,\u00f4F\u00d22\u0004Zo\u00b0\br\u009c\u00dd\u00b1\u0093\u00e5sr\u00e2y\u0000\u00aaz\u00c8W\u0018\u008a\u00d5\u00ba\u00ffc0B|\u00d2v\u00fa\u00f2\u0011\u00fa\u000bo\u0086g_\u00f5K&t\u00a4\u00e5^\u00da\u00ff\u007faX\u0016\u00a1p\r#A\u0007\t\u00a1\u00b6hu\u00e5\u00e6\u00c4\u0007\u00a1\u00e6\u00a7d\u0000i\u0002\u0002p[|5\u0089<t\u00f7\u00c2\u00b3Z.\u0089\u0016^B\u00ed\u00de2\u001aL\u0097\u00eeh\u00db\u00c8\u00f1\u001fYvD\u00f6G@\u00ea\u00c3\u00b2=\u0003N\u00f0Gy\u00a0\u000b\u00df2\u00e6\u00ed/\u00b0\u00d2op\u00aeP\u00cau\u00a3\u00c5\u00ee\u00938\u009ab\u00a4\u009a\"\u0081\u00fbo\u00d9\u00b6)\u00e4\u00aeo\u00aa\u008c\u00d8s\u00abT\u00bc\u00e8\u0012DcJ\u001a\u00d6:O\u00bb@\u00daZ\u00ec\u009e\u00e1.\u00b0\u00f5w\u00f3\u00bf\u001b\u00f2\u00bb\u00e0\u00d2Ieq\u00a5\u00af[\u007fr\u00a2\u00e7r\\2\u00d4\u00e4\\J~\u0000Q\u00afBP\u00a0\u00d3j;\u00cd\u00b0k+\u001f\u00d6\u00cd\u00f4\u00dc\u00cf\u00bb\u00dc\u0015$\u0094\u00815\u00c3\u0090\u00f0\u001a~!\u009d\u00c9\u0005\u0011'\u00df~@\u001c\u00f6\u00db\u0004\u00f5\u0005M@>&z\u00e3=\u00d3_\u0016c\u00aec\u00bc\u00a0\u00ff\u00c1?4\u00d2\u00e1\u00ed\u00cc\u00ec\u00a7\u008f\u0011`\u00c2x#E\t\u007f\u00afE\u0018\u00bd\u00ea\u0087\u008f\u0082\t\u00fa\u0017\u00f3\u009f\u00ad\f\u00b8\u00d9\u00c3*B\u0000\u00b3\u00f6,\u0088\u0016r\u0015\u009f\u0011\u0007{<\u00a3\u0017\\\tc\u0083<\u0094m\u0017\u00e7R \u00bc\u000b&\u00b5\u00e12\u00f0\u00b3Q\u00e6\u00b9\u008b\u0092ST\u00dd\u00dd\u00df38\u00e8as7\u00ca\u00c5\u00a1\u00f8\u00c9\nY\u0000\bbbP\u00b3J\u00a7\u00c6\u00b7Si$r\u00ce\u00a8\u00ec/nl\u00a3\u00ce@\u0088g\u00cb\u00c7\u00ce\u0010\u00a0\u00a1.\u00f2\u00d6\u00c8jR\u00b9\u00a0..b/\u009e\u0002\u00f9\u0080Cs.\u00a4\u00c3\u001a 0\u00b9-\u00ae\u008f\u00ee\u00e6\u00c2\u00cfU\u00bd\u0013\u00bb\u0000:\u00e3\u00010N6f{r\u00dd TI\u00ad\u00fb\u00f6\u0004\u00a1\u00fco\u008a\u0013\u00c4\u007f\u00b6\u0092\u008dh$\u00f2\u00b2,;\u0003N\u0017`4\t\u0017\u0003\u00df\u0095\u00dfk\u00e4\u00fb".length();
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
                    var4_14 = "+\u0004\u009a\u00f3I\u0089\u008a\u00ce\u0007\u0011\u0015\u00c2e\u00a6xE";
                    var5_15 = "+\u0004\u009a\u00f3I\u0089\u008a\u00ce\u0007\u0011\u0015\u00c2e\u00a6xE".length();
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
        CP_u_.b = var6_12;
        CP_u_.c = new Integer[85];
        CP_u_.TELEPORT_CONFIRM = new CP_u_();
        CP_u_.QUERY_BLOCK_NBT = new CP_u_();
        CP_u_.SET_DIFFICULTY = new CP_u_();
        CP_u_.CHAT_MESSAGE = new CP_u_();
        CP_u_.CLIENT_STATUS = new CP_u_();
        CP_u_.CLIENT_SETTINGS = new CP_u_();
        CP_u_.TAB_COMPLETE = new CP_u_();
        CP_u_.WINDOW_CONFIRMATION = new CP_u_();
        CP_u_.CLICK_WINDOW_BUTTON = new CP_u_();
        CP_u_.CLICK_WINDOW = new CP_u_();
        CP_u_.CLOSE_WINDOW = new CP_u_();
        CP_u_.PLUGIN_MESSAGE = new CP_u_();
        CP_u_.EDIT_BOOK = new CP_u_();
        CP_u_.QUERY_ENTITY_NBT = new CP_u_();
        CP_u_.INTERACT_ENTITY = new CP_u_();
        CP_u_.GENERATE_STRUCTURE = new CP_u_();
        CP_u_.KEEP_ALIVE = new CP_u_();
        CP_u_.LOCK_DIFFICULTY = new CP_u_();
        CP_u_.PLAYER_POSITION = new CP_u_();
        CP_u_.PLAYER_POSITION_AND_ROTATION = new CP_u_();
        CP_u_.PLAYER_ROTATION = new CP_u_();
        CP_u_.PLAYER_FLYING = new CP_u_();
        CP_u_.VEHICLE_MOVE = new CP_u_();
        CP_u_.STEER_BOAT = new CP_u_();
        CP_u_.PICK_ITEM = new CP_u_();
        CP_u_.CRAFT_RECIPE_REQUEST = new CP_u_();
        CP_u_.PLAYER_ABILITIES = new CP_u_();
        CP_u_.PLAYER_DIGGING = new CP_u_();
        CP_u_.ENTITY_ACTION = new CP_u_();
        CP_u_.STEER_VEHICLE = new CP_u_();
        CP_u_.SET_RECIPE_BOOK_STATE = new CP_u_();
        CP_u_.SET_DISPLAYED_RECIPE = new CP_u_();
        CP_u_.NAME_ITEM = new CP_u_();
        CP_u_.RESOURCE_PACK_STATUS = new CP_u_();
        CP_u_.ADVANCEMENT_TAB = new CP_u_();
        CP_u_.SELECT_TRADE = new CP_u_();
        CP_u_.SET_BEACON_EFFECT = new CP_u_();
        CP_u_.HELD_ITEM_CHANGE = new CP_u_();
        CP_u_.UPDATE_COMMAND_BLOCK = new CP_u_();
        CP_u_.UPDATE_COMMAND_BLOCK_MINECART = new CP_u_();
        CP_u_.CREATIVE_INVENTORY_ACTION = new CP_u_();
        CP_u_.UPDATE_JIGSAW_BLOCK = new CP_u_();
        CP_u_.UPDATE_STRUCTURE_BLOCK = new CP_u_();
        CP_u_.UPDATE_SIGN = new CP_u_();
        CP_u_.ANIMATION = new CP_u_();
        CP_u_.SPECTATE = new CP_u_();
        CP_u_.PLAYER_BLOCK_PLACEMENT = new CP_u_();
        CP_u_.USE_ITEM = new CP_u_();
        CP_u_.CP_W = CP_u_.CP_z();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x73C8;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_u_", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_u_.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_u_.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_u_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_u_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

