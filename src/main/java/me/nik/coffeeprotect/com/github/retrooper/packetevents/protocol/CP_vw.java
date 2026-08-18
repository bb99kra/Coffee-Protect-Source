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

public final class CP_vw
extends Enum<CP_vw> {
    public static final /* enum */ CP_vw TELEPORT_CONFIRM;
    public static final /* enum */ CP_vw QUERY_BLOCK_NBT;
    public static final /* enum */ CP_vw SET_DIFFICULTY;
    public static final /* enum */ CP_vw CHAT_MESSAGE;
    public static final /* enum */ CP_vw CLIENT_STATUS;
    public static final /* enum */ CP_vw CLIENT_SETTINGS;
    public static final /* enum */ CP_vw TAB_COMPLETE;
    public static final /* enum */ CP_vw WINDOW_CONFIRMATION;
    public static final /* enum */ CP_vw CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_vw CLICK_WINDOW;
    public static final /* enum */ CP_vw CLOSE_WINDOW;
    public static final /* enum */ CP_vw PLUGIN_MESSAGE;
    public static final /* enum */ CP_vw EDIT_BOOK;
    public static final /* enum */ CP_vw QUERY_ENTITY_NBT;
    public static final /* enum */ CP_vw INTERACT_ENTITY;
    public static final /* enum */ CP_vw KEEP_ALIVE;
    public static final /* enum */ CP_vw LOCK_DIFFICULTY;
    public static final /* enum */ CP_vw PLAYER_POSITION;
    public static final /* enum */ CP_vw PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_vw PLAYER_ROTATION;
    public static final /* enum */ CP_vw PLAYER_FLYING;
    public static final /* enum */ CP_vw VEHICLE_MOVE;
    public static final /* enum */ CP_vw STEER_BOAT;
    public static final /* enum */ CP_vw PICK_ITEM;
    public static final /* enum */ CP_vw CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_vw PLAYER_ABILITIES;
    public static final /* enum */ CP_vw PLAYER_DIGGING;
    public static final /* enum */ CP_vw ENTITY_ACTION;
    public static final /* enum */ CP_vw STEER_VEHICLE;
    public static final /* enum */ CP_vw RECIPE_BOOK_DATA;
    public static final /* enum */ CP_vw NAME_ITEM;
    public static final /* enum */ CP_vw RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_vw ADVANCEMENT_TAB;
    public static final /* enum */ CP_vw SELECT_TRADE;
    public static final /* enum */ CP_vw SET_BEACON_EFFECT;
    public static final /* enum */ CP_vw HELD_ITEM_CHANGE;
    public static final /* enum */ CP_vw UPDATE_COMMAND_BLOCK;
    public static final /* enum */ CP_vw UPDATE_COMMAND_BLOCK_MINECART;
    public static final /* enum */ CP_vw CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_vw UPDATE_JIGSAW_BLOCK;
    public static final /* enum */ CP_vw UPDATE_STRUCTURE_BLOCK;
    public static final /* enum */ CP_vw UPDATE_SIGN;
    public static final /* enum */ CP_vw ANIMATION;
    public static final /* enum */ CP_vw SPECTATE;
    public static final /* enum */ CP_vw PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_vw USE_ITEM;
    private static final /* synthetic */ CP_vw[] CP_E;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_vw[] values() {
        return (CP_vw[])CP_E.clone();
    }

    public static CP_vw valueOf(String string) {
        return Enum.valueOf(CP_vw.class, string);
    }

    private static /* synthetic */ CP_vw[] CP_M() {
        long l = a ^ 0x279F6DD1F61AL;
        CP_vw[] ilIlvwArray = new CP_vw[CP_vw.a("r", (int)24197, (long)(0x5AF48D7BCB325DFL ^ l))];
        ilIlvwArray[0] = TELEPORT_CONFIRM;
        ilIlvwArray[1] = QUERY_BLOCK_NBT;
        ilIlvwArray[2] = SET_DIFFICULTY;
        ilIlvwArray[3] = CHAT_MESSAGE;
        ilIlvwArray[4] = CLIENT_STATUS;
        ilIlvwArray[5] = CLIENT_SETTINGS;
        ilIlvwArray[CP_vw.a("r", (int)13655, (long)(0x592152FEB96F4E5DL ^ l))] = TAB_COMPLETE;
        ilIlvwArray[CP_vw.a("r", (int)3342, (long)(0x468BAA9BD0D9F663L ^ l))] = WINDOW_CONFIRMATION;
        ilIlvwArray[CP_vw.a("r", (int)3495, (long)(0x1975369099FFF6DDL ^ l))] = CLICK_WINDOW_BUTTON;
        ilIlvwArray[CP_vw.a("r", (int)3754, (long)(0x72195E99430E75F6L ^ l))] = CLICK_WINDOW;
        ilIlvwArray[CP_vw.a("r", (int)26363, (long)(0x52FB7AE6E2D89D8FL ^ l))] = CLOSE_WINDOW;
        ilIlvwArray[CP_vw.a("r", (int)17592, (long)(0x32E856DB1BEE3FCFL ^ l))] = PLUGIN_MESSAGE;
        ilIlvwArray[CP_vw.a("r", (int)29486, (long)(0x1E3313704A710855L ^ l))] = EDIT_BOOK;
        ilIlvwArray[CP_vw.a("r", (int)16598, (long)(0x6B70FB4190AD3B8BL ^ l))] = QUERY_ENTITY_NBT;
        ilIlvwArray[CP_vw.a("r", (int)10129, (long)(0x1649751692845CF5L ^ l))] = INTERACT_ENTITY;
        ilIlvwArray[CP_vw.a("r", (int)16406, (long)(0x4DFB552469DCBB5EL ^ l))] = KEEP_ALIVE;
        ilIlvwArray[CP_vw.a("r", (int)2379, (long)(0x219D85A3A385F21CL ^ l))] = LOCK_DIFFICULTY;
        ilIlvwArray[CP_vw.a("r", (int)3848, (long)(0x4FA5A71B90527408L ^ l))] = PLAYER_POSITION;
        ilIlvwArray[CP_vw.a("r", (int)14718, (long)(0x2ADE5C020AB6C221L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIlvwArray[CP_vw.a("r", (int)2336, (long)(0x13D3CE33C2EBF273L ^ l))] = PLAYER_ROTATION;
        ilIlvwArray[CP_vw.a("r", (int)1758, (long)(0x687FCB96CA037DD6L ^ l))] = PLAYER_FLYING;
        ilIlvwArray[CP_vw.a("r", (int)6534, (long)(0x5E3DC9E1F4496282L ^ l))] = VEHICLE_MOVE;
        ilIlvwArray[CP_vw.a("r", (int)28760, (long)(0x7141F4D62D640B20L ^ l))] = STEER_BOAT;
        ilIlvwArray[CP_vw.a("r", (int)26809, (long)(0x214A8E71EAC193F5L ^ l))] = PICK_ITEM;
        ilIlvwArray[CP_vw.a("r", (int)6542, (long)(0x55E14E006FE162E5L ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIlvwArray[CP_vw.a("r", (int)4931, (long)(0x7E2337978E8D6826L ^ l))] = PLAYER_ABILITIES;
        ilIlvwArray[CP_vw.a("r", (int)32099, (long)(0x4CC7A4FCC53C066CL ^ l))] = PLAYER_DIGGING;
        ilIlvwArray[CP_vw.a("r", (int)11620, (long)(0x3E2251143619D62BL ^ l))] = ENTITY_ACTION;
        ilIlvwArray[CP_vw.a("r", (int)27708, (long)(0x677D45A112391777L ^ l))] = STEER_VEHICLE;
        ilIlvwArray[CP_vw.a("r", (int)23320, (long)(0x5F288BAC695B2070L ^ l))] = RECIPE_BOOK_DATA;
        ilIlvwArray[CP_vw.a("r", (int)28988, (long)(0x478F92E81B2B8A6CL ^ l))] = NAME_ITEM;
        ilIlvwArray[CP_vw.a("r", (int)11092, (long)(0x5D55C61C18B05011L ^ l))] = RESOURCE_PACK_STATUS;
        ilIlvwArray[CP_vw.a("r", (int)16587, (long)(0x43472652A1B3BB5L ^ l))] = ADVANCEMENT_TAB;
        ilIlvwArray[CP_vw.a("r", (int)24307, (long)(0x696C575F1F2425F0L ^ l))] = SELECT_TRADE;
        ilIlvwArray[CP_vw.a("r", (int)18689, (long)(0x74E3D9088C28324FL ^ l))] = SET_BEACON_EFFECT;
        ilIlvwArray[CP_vw.a("r", (int)10410, (long)(0x5E4D887F2B0253E0L ^ l))] = HELD_ITEM_CHANGE;
        ilIlvwArray[CP_vw.a("r", (int)26891, (long)(0x6CDDD246B9C59253L ^ l))] = UPDATE_COMMAND_BLOCK;
        ilIlvwArray[CP_vw.a("r", (int)19732, (long)(0x753D08E910B0B641L ^ l))] = UPDATE_COMMAND_BLOCK_MINECART;
        ilIlvwArray[CP_vw.a("r", (int)18387, (long)(0x24E6D0B59D563CB2L ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIlvwArray[CP_vw.a("r", (int)25859, (long)(0x335BC7D84C911E73L ^ l))] = UPDATE_JIGSAW_BLOCK;
        ilIlvwArray[CP_vw.a("r", (int)2567, (long)(0x7AB8492E3328F160L ^ l))] = UPDATE_STRUCTURE_BLOCK;
        ilIlvwArray[CP_vw.a("r", (int)6285, (long)(0x1C1557130AD063DBL ^ l))] = UPDATE_SIGN;
        ilIlvwArray[CP_vw.a("r", (int)26465, (long)(0x1547131DC22E9C0EL ^ l))] = ANIMATION;
        ilIlvwArray[CP_vw.a("r", (int)23191, (long)(0x5DF6C1C27AD2A1F1L ^ l))] = SPECTATE;
        ilIlvwArray[CP_vw.a("r", (int)1577, (long)(0x2796CDD21788FD49L ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIlvwArray[CP_vw.a("r", (int)23955, (long)(0x7B2C060EA24126C1L ^ l))] = USE_ITEM;
        return ilIlvwArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_vw.a = CP_s.a(-8817381233029364248L, 1455236371121035488L, MethodHandles.lookup().lookupClass()).a(153167348170095L);
                        var20 = CP_vw.a ^ 118923582281306L;
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
                        var11_3 = new String[46];
                        var17_4 = 0;
                        var16_5 = "\u00975\"\tIpJ\u00b8\u0089H*:\u00c4\u0002R\u008f\u0018\u00e7u\u0098\u00f5\u00a0\u008bp\u00c2\u009e\u00c8Y.\u0006^\u00b0\u00eey!\u0097Kc\u00b8\u00c5\u00dc\u0010\u00a1\u00e68\u00f7\u0096\u0086x|?!\n\u0011\u0099p\u00a4w Y3t\u00fdu\u000fp\u009f\u00e2\u00fd\u00da\u00c1V<\u00ebT\u00de\u00a7u\u00da\u00a6arw\u00e1\u00e0SG\u00a0\u00d6}\u00ae\u00189I\u00e2\u00df\u00efM\u0011077\u00df\u00d7\u00e5\u001b\u00de\u001d\u0080\u0086\u00e6\u00db0*\u0087\u00f8\u0010\u00e6\u00a8vn>\nT\u00ca\b\u00b1\u0017\u00f1[\u00ce\u0002f\u0018\u0097O\u0003\t\u00c3\u00c4X\u00c8\u000f\u001fy\u00e5\u00f21d\u00a5\u00c1V\u00b6\u0085\u0090\u0087\u0016\u00e5 \u00bc\u00c4T\u00df\u0005l:\u00c5v\u009d@\u0011\u009e\u0089\u00aa\u00b5$u\u00b6w\u0090\u00bc\u00e4\u00c7\u009eZ\u00cdIh\u00b2=\u0085\u0010\u00db\u0000\u009e\u0002i\u00c6\u00e8X\u00e1\u009b\u00fba'\u00a7)\u009b\u0010\u00be\u00ea\u001a\u00c4\u00a8\u00c0\u0095C\u009bfM\u00bb\u00da\u001c\n\u0096\u0010*\u008e\u00f9\u00fa\u000eku\u00f2\u00bf\u00c4\u0093\u0018\u0098\u0003a$\u0010\u00c6\u00ab\u00c6\u009arT\u00d4z\r\u0014\u0099T^\u009a'\u0015 \u000f~\u0095\u0006?\u00d5:\u0000\u00beE6f\u00c2\u00fas1\u00a0@\u008e\u00a7\u00a5\u00c3\"0\u000e,\u00cf\u00bc\u008b\u0090\u00bf\f\u0010\u00be\u00ea\u001a\u00c4\u00a8\u00c0\u0095C\u00d1\u000eI3\u007f\u00c2&\u0080\u0010\u0095\u0004m\u00bboi\u00a76\u00b7\u009e\u00ed\u00fa\u00b26\u001d\\\u0010\u00ac\u00e7&\u0005\u0097e?.@\u00celkrE\u0091\u009b\u0010\u0097O\u0003\t\u00c3\u00c4X\u00c8{\u00bb\u000e\u001c49\u001d\u00f6\u0018\u0080\u00a5\u00ac\u0088\u00f1\u0094\u00e3F\u0018+MY\u00b5\u00de\u0000\u00fe\u00b6UQ\u00de\u00d1(\u00e9\u00cd\u0010\u00d9\u00c6F\u0091\u00a9|t\u0013K\u00b8\f\u00e6\u00b4\u00e2_\u0007\u0010\u00eaE\u00c6\u00c2\u00f0\u00c2\u00e8\u0018\u00cem\u00cb7\u00bcGo@\u0010\u00ae\u0098;\u00f3\u00b02\u00bb\u00b9%\u009e\u00cf\u00f6e\u00b8\u00e1\u00f7\u0010\u00bc\u00c4T\u00df\u0005l:\u00c5I\u00dc\u00c07\u009f\u00c8\b\u00c3\u0010_\u0015\"P'\u0093M\u0082\u00c5\u009a\u00e7\u007f\u00ed0\u0012\u00ab\u0010=F/1\u001aQ\\E\u0004i_]_W\u00b4\u00e6\u0018\u00c0[]Ua\u00aa\u00d4\u00b0i\u0093\u00b5)\u0019H\u00ffR\u0010\fsp}\u0003~\u00c1\u0018J\nv:\u00f4\u00f3K\u00baf\u00f9\u0092\u00f9-\u00f0)\u00a6()\u001f\u00d6\u0085\u00fc~\u00d0\u0018\"\u0014G\u001eF\u0092p\u00be&\u00e8`\u00f7`6\u00ce!\u00e1\u00a8d\u00a6X\u0098\u00f3\u001c\u0018Y3t\u00fdu\u000fp\u009f\u00e2\u00fd\u00da\u00c1V<\u00ebT\u0003\u0006o\u0084\u00f2\u00d2\u00bf\u00da\u0018*^io\u0013L\u00b1#.h+\u009cJ4k\u0084\u0096`\u00e6e6\u00f2\u00e5\u0003\u0010&\u0084\u008e2\u0087\u0016\u00e0\u0098\u00f1\u008d\u0081\u000eB\u00141X\u0018\u00f0\u0010\u00f9\u00b6\f_\u00c52j\u00f1\u00e8v\u0084\u001a\u00e9\u00a9\u00ed0\u0094\u00aa\u00174\u00d8\u00aa\u0010,c\u009e\u00a3H\b\u00ae\u00a22\u008a\u00b3\u00b5\u00c9L?\u00b9\u0010\u0015\u00c3Z\u001aCP.\u0098\u00c1\u0000TC?\r\u00ea\u0007\u0010\u00fe\u00fe\u00fe\u00c0\u00da\u00b7!\u0016\u00cd\u009f\u00a1\u00a7g `\u00f5\u0010-\u00b5gt\u00f8\u0016o\u001c\u00f5\u00e5\u0016=\u00be\u00f6\u008c\u00c6\u0010\u00c7o\u0096\u00c0m\u00db\u0098\u0007z\u00c1\"\u00ca\u00beU\u00c98\u0010\t\u00ad(js\u00f5\u00b9\u00fc\u008d\u0005\u00e6u\u008c\u00b7#+\u0018E\u008d\u00cb.:\u0010uH\u00122\u00f8\u00f4*\u00c2\u00a1\u008ek\u0094\u00d2G\u00e6#D\u00c9\u0018\u00bb|G\u00a2,\u00e0\u0006s/vm\u00c8&\u00a8\u0007\u00e9\u0004\u001c\u00ed\u00e1~\u00ae\u00ac\u00c3\u0010\f\u0089\u00b22[2\u00c9b\u0084\u00d8\u00ab\"G\u00df\u0012\u00c7\u0010t\u00ef\u00f1i\u00008\u0086\u00f7\u00f4F\u0083\u00e7\u0012^0\u00e4\u0010\u00e7u\u0098\u00f5\u00a0\u008bp\u00c2\u009aZ\u00cf)\u00d7\u00fa2\u00e0\u0018\u0002\u00e2\u009e\u00d6\u00e4r\u00e8\u00d2g\u00b4\u0014\u0018\u00c5r\u00a2\u009d\u00ca?E\fx\u00c3\u0099z\u0018\u00de,I;z\u00cf\u00eb\u00aa\u00a8\u00fbv`\u009d\u00dc\u00a3'\u000e\u0084\u00f0\u0082BA=$";
                        var18_6 = "\u00975\"\tIpJ\u00b8\u0089H*:\u00c4\u0002R\u008f\u0018\u00e7u\u0098\u00f5\u00a0\u008bp\u00c2\u009e\u00c8Y.\u0006^\u00b0\u00eey!\u0097Kc\u00b8\u00c5\u00dc\u0010\u00a1\u00e68\u00f7\u0096\u0086x|?!\n\u0011\u0099p\u00a4w Y3t\u00fdu\u000fp\u009f\u00e2\u00fd\u00da\u00c1V<\u00ebT\u00de\u00a7u\u00da\u00a6arw\u00e1\u00e0SG\u00a0\u00d6}\u00ae\u00189I\u00e2\u00df\u00efM\u0011077\u00df\u00d7\u00e5\u001b\u00de\u001d\u0080\u0086\u00e6\u00db0*\u0087\u00f8\u0010\u00e6\u00a8vn>\nT\u00ca\b\u00b1\u0017\u00f1[\u00ce\u0002f\u0018\u0097O\u0003\t\u00c3\u00c4X\u00c8\u000f\u001fy\u00e5\u00f21d\u00a5\u00c1V\u00b6\u0085\u0090\u0087\u0016\u00e5 \u00bc\u00c4T\u00df\u0005l:\u00c5v\u009d@\u0011\u009e\u0089\u00aa\u00b5$u\u00b6w\u0090\u00bc\u00e4\u00c7\u009eZ\u00cdIh\u00b2=\u0085\u0010\u00db\u0000\u009e\u0002i\u00c6\u00e8X\u00e1\u009b\u00fba'\u00a7)\u009b\u0010\u00be\u00ea\u001a\u00c4\u00a8\u00c0\u0095C\u009bfM\u00bb\u00da\u001c\n\u0096\u0010*\u008e\u00f9\u00fa\u000eku\u00f2\u00bf\u00c4\u0093\u0018\u0098\u0003a$\u0010\u00c6\u00ab\u00c6\u009arT\u00d4z\r\u0014\u0099T^\u009a'\u0015 \u000f~\u0095\u0006?\u00d5:\u0000\u00beE6f\u00c2\u00fas1\u00a0@\u008e\u00a7\u00a5\u00c3\"0\u000e,\u00cf\u00bc\u008b\u0090\u00bf\f\u0010\u00be\u00ea\u001a\u00c4\u00a8\u00c0\u0095C\u00d1\u000eI3\u007f\u00c2&\u0080\u0010\u0095\u0004m\u00bboi\u00a76\u00b7\u009e\u00ed\u00fa\u00b26\u001d\\\u0010\u00ac\u00e7&\u0005\u0097e?.@\u00celkrE\u0091\u009b\u0010\u0097O\u0003\t\u00c3\u00c4X\u00c8{\u00bb\u000e\u001c49\u001d\u00f6\u0018\u0080\u00a5\u00ac\u0088\u00f1\u0094\u00e3F\u0018+MY\u00b5\u00de\u0000\u00fe\u00b6UQ\u00de\u00d1(\u00e9\u00cd\u0010\u00d9\u00c6F\u0091\u00a9|t\u0013K\u00b8\f\u00e6\u00b4\u00e2_\u0007\u0010\u00eaE\u00c6\u00c2\u00f0\u00c2\u00e8\u0018\u00cem\u00cb7\u00bcGo@\u0010\u00ae\u0098;\u00f3\u00b02\u00bb\u00b9%\u009e\u00cf\u00f6e\u00b8\u00e1\u00f7\u0010\u00bc\u00c4T\u00df\u0005l:\u00c5I\u00dc\u00c07\u009f\u00c8\b\u00c3\u0010_\u0015\"P'\u0093M\u0082\u00c5\u009a\u00e7\u007f\u00ed0\u0012\u00ab\u0010=F/1\u001aQ\\E\u0004i_]_W\u00b4\u00e6\u0018\u00c0[]Ua\u00aa\u00d4\u00b0i\u0093\u00b5)\u0019H\u00ffR\u0010\fsp}\u0003~\u00c1\u0018J\nv:\u00f4\u00f3K\u00baf\u00f9\u0092\u00f9-\u00f0)\u00a6()\u001f\u00d6\u0085\u00fc~\u00d0\u0018\"\u0014G\u001eF\u0092p\u00be&\u00e8`\u00f7`6\u00ce!\u00e1\u00a8d\u00a6X\u0098\u00f3\u001c\u0018Y3t\u00fdu\u000fp\u009f\u00e2\u00fd\u00da\u00c1V<\u00ebT\u0003\u0006o\u0084\u00f2\u00d2\u00bf\u00da\u0018*^io\u0013L\u00b1#.h+\u009cJ4k\u0084\u0096`\u00e6e6\u00f2\u00e5\u0003\u0010&\u0084\u008e2\u0087\u0016\u00e0\u0098\u00f1\u008d\u0081\u000eB\u00141X\u0018\u00f0\u0010\u00f9\u00b6\f_\u00c52j\u00f1\u00e8v\u0084\u001a\u00e9\u00a9\u00ed0\u0094\u00aa\u00174\u00d8\u00aa\u0010,c\u009e\u00a3H\b\u00ae\u00a22\u008a\u00b3\u00b5\u00c9L?\u00b9\u0010\u0015\u00c3Z\u001aCP.\u0098\u00c1\u0000TC?\r\u00ea\u0007\u0010\u00fe\u00fe\u00fe\u00c0\u00da\u00b7!\u0016\u00cd\u009f\u00a1\u00a7g `\u00f5\u0010-\u00b5gt\u00f8\u0016o\u001c\u00f5\u00e5\u0016=\u00be\u00f6\u008c\u00c6\u0010\u00c7o\u0096\u00c0m\u00db\u0098\u0007z\u00c1\"\u00ca\u00beU\u00c98\u0010\t\u00ad(js\u00f5\u00b9\u00fc\u008d\u0005\u00e6u\u008c\u00b7#+\u0018E\u008d\u00cb.:\u0010uH\u00122\u00f8\u00f4*\u00c2\u00a1\u008ek\u0094\u00d2G\u00e6#D\u00c9\u0018\u00bb|G\u00a2,\u00e0\u0006s/vm\u00c8&\u00a8\u0007\u00e9\u0004\u001c\u00ed\u00e1~\u00ae\u00ac\u00c3\u0010\f\u0089\u00b22[2\u00c9b\u0084\u00d8\u00ab\"G\u00df\u0012\u00c7\u0010t\u00ef\u00f1i\u00008\u0086\u00f7\u00f4F\u0083\u00e7\u0012^0\u00e4\u0010\u00e7u\u0098\u00f5\u00a0\u008bp\u00c2\u009aZ\u00cf)\u00d7\u00fa2\u00e0\u0018\u0002\u00e2\u009e\u00d6\u00e4r\u00e8\u00d2g\u00b4\u0014\u0018\u00c5r\u00a2\u009d\u00ca?E\fx\u00c3\u0099z\u0018\u00de,I;z\u00cf\u00eb\u00aa\u00a8\u00fbv`\u009d\u00dc\u00a3'\u000e\u0084\u00f0\u0082BA=$".length();
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
                            var11_3[var17_4++] = CP_vw.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u0019S\f\u00b7\u00ac\u00cc\u0088\u0083\u00bc\u00e2\u00eaF\u0095\u0087\u0007\u000b\u0010b.\u00fcl\u00f3\u00d3i\u00f7\u0090`\u0087\u009e5\u00daxP";
                            var18_6 = "\u0019S\f\u00b7\u00ac\u00cc\u0088\u0083\u00bc\u00e2\u00eaF\u0095\u0087\u0007\u000b\u0010b.\u00fcl\u00f3\u00d3i\u00f7\u0090`\u0087\u009e5\u00daxP".length();
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
                            var11_3[var17_4++] = CP_vw.a(var19_9).intern();
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
                CP_vw.d = new HashMap<K, V>(13);
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
                var6_12 = new long[81];
                var3_13 = 0;
                var4_14 = "\u00e7\u008f\u00f0\u00aav\u0083\u00f9\u0016\u0013\u00e2]\u00f4v\u0092(b\u00b4\u00fbx\u00e7\u00ee-\u0086y\u00d2\u00dar\u00ce(\u00bf\b\u0096(\u00d6\u00e1\u00ab\u0088\u00b1`\u00df\u00f8E\u00c2\u00d5/\u00a4\u00e8\u00b9_\u0016\u000b\u001e\u008cJ\u001f4n\u00b9BL7]q\fj\u00e8\u0000Vr\u00df9\u00e1\u00a4\u00b4\u00c2![\u0090\u00d7A[\u0092W\u00a4\u0096\u0099O\u009c=e\u009a0~|8s\u00cd\u001a\u00f8\u0096\u00fc@\u00db\u0080\u00ebXK\u0010\u00176s\u009d\u0003Ydr.\u0093\u00a4n\u0092\u00f1s\u008b\u00ab\u00ca\u00c0\u00d8yN\u00a1\u00ff\u00e72\u0015\u000f\u001b\u00b37}\u00c47\u0003\u0088\u00e3\u00aa\u00dc\u00c1\u0080-\u00b4\u0094\u00fa\u0007\n?~D\u00ddUi<2U\u00c1e^\u00c2)\u0088\u00ff\u00f2\u0002V\u00ac\u00c0\u0082\u00f7\u00d4\u0084\u009er\u00bd\u00f2\u00fa\u000b\u008b\u0013\u00abN\u00e4\n/5q\u00a7\u0096\u0098\u00b0~\u00ae{f\u0091-n\u00844\u001f\u00fe2\n\u00b62\"\u000f\u001a\u00cf:\u001eD\u0086Z\u009a<\u00a1.\u0092\u00e2\u00a0Q\u00d7\u001ePC\u00a9\u00ca\u00c6\u00d3\u0007M\u00c4\u00e9!\u0088g\u0001)(\u00bem=v_[\u0000\u00bb\u00c8\u00bd\u0000\u009b\u00ce\u00b88L\u0001\u0082\u00cd\u00d1\u00ce\u00bf\u0089\u00cdh\u0000:\u00af\u009bQ\u00e1\u00e7\u00a7\u0090\u00f93\u008f\u0005\u00d0\u00fe73\u009d\u00d4WzI\u00e6l4\u00e3\u009b\u0085\u008c\u00aa\fsG\u0000\u00e4\u00d0Z\u0003O\u00a2p7r\u00c7\u00d9\u008c[7\u00d3\u0089\u00b4\u001cW\u00fe\u0080a\u008b4d/\u00ad\u00de\u00e0\u00c5\u008c\u0098\u00e0\u0012A\u00da\u00b7)\u0000\u00d9\u001c\u0088i\u0096m\u0002 04f\u00aa\u009fCT7\u00e7w\u00b4%\u0085nGb\u00f9\u00f9o\u009b\u0019Q\u00cb\u00f3\u0018\u00d1\u0086o\\4\u0011\u0014a\u0094\u00a4T\u00ef\\\u00ca\u00da\u00d2\u0080\u00f0g&Z\u00e7\u009a{\u00e1\u00a3lF\u00db\u00af\u00f8\u00b1\u0013v\u00d8]\u00d4\u00fe%\u0007\u0012am\u000f\u00d1\u0003\u0084\u0002\u009a\u00fc/\u0083\u0006\u00b0,\u00fb\u00f6<\u00bf9\u008eC\u00aeK,\u0018\u00f4\u0083X\u00ff>C`\u00f2@^\u00ef\u0011+\u00174\u00c68\u00b1\u00a2\u00cao}#\u00be\u00bb6\u00d1\t\u00a32\u00f5%\u00ee\u0004\u0017\u0080*+\u00cd\u009e\u00151$\u0003\u00f4\u00f6\u00c3\u0005\u00fd\u00af\u007f8\u00f8\u008c\\\u001dw\u00c0\u00ca\u00b3\f\u000b\u00ce\u00f6\"%\u00ab%~t`\u00f8\u00f5\u00fc\u0084\u00bel \u00b4\u00fdS\u0089\u00bd\u00d5\u001f\u00f6o\u008a\u00a9\u00aa\u0088X\u00d4\u00d8\u00b8{\u0013\u00c1\u00a3-\u00a2\u000e\u00cf\u0099\u00f5\u00e00(P\u00b2\u001a\u009e\u00a9|\u00a3\u00e8\u00ae\u0094s\u0001\u00fd\u00a5\u00c41\u00da\u001f\u0018\u00e3\u0015\u00929J\u00c5\u00af\u0015I\u00bd\u000e\u008f\u00ed\u00b9\u00d8pB\"Q\u0092W\u00c3q\u001d\u00f6\u0001\u00eb\u008e\u009f\u00c5\u001e\u00dc~\u00f9y\u00a1\u00ea;v\u00d0\u00e2E\u00b96^\u008dI\u0012(R\u00be\b\u008f\u00d1\u00c5\u008e\u00f2<\u00ba";
                var5_15 = "\u00e7\u008f\u00f0\u00aav\u0083\u00f9\u0016\u0013\u00e2]\u00f4v\u0092(b\u00b4\u00fbx\u00e7\u00ee-\u0086y\u00d2\u00dar\u00ce(\u00bf\b\u0096(\u00d6\u00e1\u00ab\u0088\u00b1`\u00df\u00f8E\u00c2\u00d5/\u00a4\u00e8\u00b9_\u0016\u000b\u001e\u008cJ\u001f4n\u00b9BL7]q\fj\u00e8\u0000Vr\u00df9\u00e1\u00a4\u00b4\u00c2![\u0090\u00d7A[\u0092W\u00a4\u0096\u0099O\u009c=e\u009a0~|8s\u00cd\u001a\u00f8\u0096\u00fc@\u00db\u0080\u00ebXK\u0010\u00176s\u009d\u0003Ydr.\u0093\u00a4n\u0092\u00f1s\u008b\u00ab\u00ca\u00c0\u00d8yN\u00a1\u00ff\u00e72\u0015\u000f\u001b\u00b37}\u00c47\u0003\u0088\u00e3\u00aa\u00dc\u00c1\u0080-\u00b4\u0094\u00fa\u0007\n?~D\u00ddUi<2U\u00c1e^\u00c2)\u0088\u00ff\u00f2\u0002V\u00ac\u00c0\u0082\u00f7\u00d4\u0084\u009er\u00bd\u00f2\u00fa\u000b\u008b\u0013\u00abN\u00e4\n/5q\u00a7\u0096\u0098\u00b0~\u00ae{f\u0091-n\u00844\u001f\u00fe2\n\u00b62\"\u000f\u001a\u00cf:\u001eD\u0086Z\u009a<\u00a1.\u0092\u00e2\u00a0Q\u00d7\u001ePC\u00a9\u00ca\u00c6\u00d3\u0007M\u00c4\u00e9!\u0088g\u0001)(\u00bem=v_[\u0000\u00bb\u00c8\u00bd\u0000\u009b\u00ce\u00b88L\u0001\u0082\u00cd\u00d1\u00ce\u00bf\u0089\u00cdh\u0000:\u00af\u009bQ\u00e1\u00e7\u00a7\u0090\u00f93\u008f\u0005\u00d0\u00fe73\u009d\u00d4WzI\u00e6l4\u00e3\u009b\u0085\u008c\u00aa\fsG\u0000\u00e4\u00d0Z\u0003O\u00a2p7r\u00c7\u00d9\u008c[7\u00d3\u0089\u00b4\u001cW\u00fe\u0080a\u008b4d/\u00ad\u00de\u00e0\u00c5\u008c\u0098\u00e0\u0012A\u00da\u00b7)\u0000\u00d9\u001c\u0088i\u0096m\u0002 04f\u00aa\u009fCT7\u00e7w\u00b4%\u0085nGb\u00f9\u00f9o\u009b\u0019Q\u00cb\u00f3\u0018\u00d1\u0086o\\4\u0011\u0014a\u0094\u00a4T\u00ef\\\u00ca\u00da\u00d2\u0080\u00f0g&Z\u00e7\u009a{\u00e1\u00a3lF\u00db\u00af\u00f8\u00b1\u0013v\u00d8]\u00d4\u00fe%\u0007\u0012am\u000f\u00d1\u0003\u0084\u0002\u009a\u00fc/\u0083\u0006\u00b0,\u00fb\u00f6<\u00bf9\u008eC\u00aeK,\u0018\u00f4\u0083X\u00ff>C`\u00f2@^\u00ef\u0011+\u00174\u00c68\u00b1\u00a2\u00cao}#\u00be\u00bb6\u00d1\t\u00a32\u00f5%\u00ee\u0004\u0017\u0080*+\u00cd\u009e\u00151$\u0003\u00f4\u00f6\u00c3\u0005\u00fd\u00af\u007f8\u00f8\u008c\\\u001dw\u00c0\u00ca\u00b3\f\u000b\u00ce\u00f6\"%\u00ab%~t`\u00f8\u00f5\u00fc\u0084\u00bel \u00b4\u00fdS\u0089\u00bd\u00d5\u001f\u00f6o\u008a\u00a9\u00aa\u0088X\u00d4\u00d8\u00b8{\u0013\u00c1\u00a3-\u00a2\u000e\u00cf\u0099\u00f5\u00e00(P\u00b2\u001a\u009e\u00a9|\u00a3\u00e8\u00ae\u0094s\u0001\u00fd\u00a5\u00c41\u00da\u001f\u0018\u00e3\u0015\u00929J\u00c5\u00af\u0015I\u00bd\u000e\u008f\u00ed\u00b9\u00d8pB\"Q\u0092W\u00c3q\u001d\u00f6\u0001\u00eb\u008e\u009f\u00c5\u001e\u00dc~\u00f9y\u00a1\u00ea;v\u00d0\u00e2E\u00b96^\u008dI\u0012(R\u00be\b\u008f\u00d1\u00c5\u008e\u00f2<\u00ba".length();
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
                    var4_14 = "\u00d89^9C\u001d\u001e\u00a0\u0092\u0092\u00f7\u00eb\u00cay.^";
                    var5_15 = "\u00d89^9C\u001d\u001e\u00a0\u0092\u0092\u00f7\u00eb\u00cay.^".length();
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
        CP_vw.b = var6_12;
        CP_vw.c = new Integer[81];
        CP_vw.TELEPORT_CONFIRM = new CP_vw();
        CP_vw.QUERY_BLOCK_NBT = new CP_vw();
        CP_vw.SET_DIFFICULTY = new CP_vw();
        CP_vw.CHAT_MESSAGE = new CP_vw();
        CP_vw.CLIENT_STATUS = new CP_vw();
        CP_vw.CLIENT_SETTINGS = new CP_vw();
        CP_vw.TAB_COMPLETE = new CP_vw();
        CP_vw.WINDOW_CONFIRMATION = new CP_vw();
        CP_vw.CLICK_WINDOW_BUTTON = new CP_vw();
        CP_vw.CLICK_WINDOW = new CP_vw();
        CP_vw.CLOSE_WINDOW = new CP_vw();
        CP_vw.PLUGIN_MESSAGE = new CP_vw();
        CP_vw.EDIT_BOOK = new CP_vw();
        CP_vw.QUERY_ENTITY_NBT = new CP_vw();
        CP_vw.INTERACT_ENTITY = new CP_vw();
        CP_vw.KEEP_ALIVE = new CP_vw();
        CP_vw.LOCK_DIFFICULTY = new CP_vw();
        CP_vw.PLAYER_POSITION = new CP_vw();
        CP_vw.PLAYER_POSITION_AND_ROTATION = new CP_vw();
        CP_vw.PLAYER_ROTATION = new CP_vw();
        CP_vw.PLAYER_FLYING = new CP_vw();
        CP_vw.VEHICLE_MOVE = new CP_vw();
        CP_vw.STEER_BOAT = new CP_vw();
        CP_vw.PICK_ITEM = new CP_vw();
        CP_vw.CRAFT_RECIPE_REQUEST = new CP_vw();
        CP_vw.PLAYER_ABILITIES = new CP_vw();
        CP_vw.PLAYER_DIGGING = new CP_vw();
        CP_vw.ENTITY_ACTION = new CP_vw();
        CP_vw.STEER_VEHICLE = new CP_vw();
        CP_vw.RECIPE_BOOK_DATA = new CP_vw();
        CP_vw.NAME_ITEM = new CP_vw();
        CP_vw.RESOURCE_PACK_STATUS = new CP_vw();
        CP_vw.ADVANCEMENT_TAB = new CP_vw();
        CP_vw.SELECT_TRADE = new CP_vw();
        CP_vw.SET_BEACON_EFFECT = new CP_vw();
        CP_vw.HELD_ITEM_CHANGE = new CP_vw();
        CP_vw.UPDATE_COMMAND_BLOCK = new CP_vw();
        CP_vw.UPDATE_COMMAND_BLOCK_MINECART = new CP_vw();
        CP_vw.CREATIVE_INVENTORY_ACTION = new CP_vw();
        CP_vw.UPDATE_JIGSAW_BLOCK = new CP_vw();
        CP_vw.UPDATE_STRUCTURE_BLOCK = new CP_vw();
        CP_vw.UPDATE_SIGN = new CP_vw();
        CP_vw.ANIMATION = new CP_vw();
        CP_vw.SPECTATE = new CP_vw();
        CP_vw.PLAYER_BLOCK_PLACEMENT = new CP_vw();
        CP_vw.USE_ITEM = new CP_vw();
        CP_vw.CP_E = CP_vw.CP_M();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x76A6;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_vw", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_vw.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_vw.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_vw" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_vw.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

