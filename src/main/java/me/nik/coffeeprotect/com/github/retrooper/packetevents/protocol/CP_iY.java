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

public final class CP_iY
extends Enum<CP_iY> {
    public static final /* enum */ CP_iY TELEPORT_CONFIRM;
    public static final /* enum */ CP_iY QUERY_BLOCK_NBT;
    public static final /* enum */ CP_iY SET_DIFFICULTY;
    public static final /* enum */ CP_iY CHAT_ACK;
    public static final /* enum */ CP_iY CHAT_COMMAND;
    public static final /* enum */ CP_iY CHAT_MESSAGE;
    public static final /* enum */ CP_iY CHAT_PREVIEW;
    public static final /* enum */ CP_iY CLIENT_STATUS;
    public static final /* enum */ CP_iY CLIENT_SETTINGS;
    public static final /* enum */ CP_iY TAB_COMPLETE;
    public static final /* enum */ CP_iY CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_iY CLICK_WINDOW;
    public static final /* enum */ CP_iY CLOSE_WINDOW;
    public static final /* enum */ CP_iY PLUGIN_MESSAGE;
    public static final /* enum */ CP_iY EDIT_BOOK;
    public static final /* enum */ CP_iY QUERY_ENTITY_NBT;
    public static final /* enum */ CP_iY INTERACT_ENTITY;
    public static final /* enum */ CP_iY GENERATE_STRUCTURE;
    public static final /* enum */ CP_iY KEEP_ALIVE;
    public static final /* enum */ CP_iY LOCK_DIFFICULTY;
    public static final /* enum */ CP_iY PLAYER_POSITION;
    public static final /* enum */ CP_iY PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_iY PLAYER_ROTATION;
    public static final /* enum */ CP_iY PLAYER_FLYING;
    public static final /* enum */ CP_iY VEHICLE_MOVE;
    public static final /* enum */ CP_iY STEER_BOAT;
    public static final /* enum */ CP_iY PICK_ITEM;
    public static final /* enum */ CP_iY CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_iY PLAYER_ABILITIES;
    public static final /* enum */ CP_iY PLAYER_DIGGING;
    public static final /* enum */ CP_iY ENTITY_ACTION;
    public static final /* enum */ CP_iY STEER_VEHICLE;
    public static final /* enum */ CP_iY PONG;
    public static final /* enum */ CP_iY SET_RECIPE_BOOK_STATE;
    public static final /* enum */ CP_iY SET_DISPLAYED_RECIPE;
    public static final /* enum */ CP_iY NAME_ITEM;
    public static final /* enum */ CP_iY RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_iY ADVANCEMENT_TAB;
    public static final /* enum */ CP_iY SELECT_TRADE;
    public static final /* enum */ CP_iY SET_BEACON_EFFECT;
    public static final /* enum */ CP_iY HELD_ITEM_CHANGE;
    public static final /* enum */ CP_iY UPDATE_COMMAND_BLOCK;
    public static final /* enum */ CP_iY UPDATE_COMMAND_BLOCK_MINECART;
    public static final /* enum */ CP_iY CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_iY UPDATE_JIGSAW_BLOCK;
    public static final /* enum */ CP_iY UPDATE_STRUCTURE_BLOCK;
    public static final /* enum */ CP_iY UPDATE_SIGN;
    public static final /* enum */ CP_iY ANIMATION;
    public static final /* enum */ CP_iY SPECTATE;
    public static final /* enum */ CP_iY PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_iY USE_ITEM;
    private static final /* synthetic */ CP_iY[] CP_t;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_iY[] values() {
        return (CP_iY[])CP_t.clone();
    }

    public static CP_iY valueOf(String string) {
        return Enum.valueOf(CP_iY.class, string);
    }

    private static /* synthetic */ CP_iY[] CP_I() {
        long l = a ^ 0x6B4E3958BDF5L;
        CP_iY[] ilIliYArray = new CP_iY[CP_iY.a("y", (int)32721, (long)(0x46ADD0F235BC4F5L ^ l))];
        ilIliYArray[0] = TELEPORT_CONFIRM;
        ilIliYArray[1] = QUERY_BLOCK_NBT;
        ilIliYArray[2] = SET_DIFFICULTY;
        ilIliYArray[3] = CHAT_ACK;
        ilIliYArray[4] = CHAT_COMMAND;
        ilIliYArray[5] = CHAT_MESSAGE;
        ilIliYArray[CP_iY.a("y", (int)28974, (long)(0x52782F20DF674A16L ^ l))] = CHAT_PREVIEW;
        ilIliYArray[CP_iY.a("y", (int)2249, (long)(0x34999F83A078B3DCL ^ l))] = CLIENT_STATUS;
        ilIliYArray[CP_iY.a("y", (int)5096, (long)(0x3300F4402F23A8EBL ^ l))] = CLIENT_SETTINGS;
        ilIliYArray[CP_iY.a("y", (int)10761, (long)(0x51B3E29CBC791126L ^ l))] = TAB_COMPLETE;
        ilIliYArray[CP_iY.a("y", (int)19316, (long)(0x1F5B6875795C7052L ^ l))] = CLICK_WINDOW_BUTTON;
        ilIliYArray[CP_iY.a("y", (int)7607, (long)(0x213904754217A6EEL ^ l))] = CLICK_WINDOW;
        ilIliYArray[CP_iY.a("y", (int)1253, (long)(0x721858CC82D33FCBL ^ l))] = CLOSE_WINDOW;
        ilIliYArray[CP_iY.a("y", (int)8958, (long)(0x528C45FE580519BFL ^ l))] = PLUGIN_MESSAGE;
        ilIliYArray[CP_iY.a("y", (int)11240, (long)(0x5903BD6E50510A7L ^ l))] = EDIT_BOOK;
        ilIliYArray[CP_iY.a("y", (int)8664, (long)(0x1D1729475DD39A88L ^ l))] = QUERY_ENTITY_NBT;
        ilIliYArray[CP_iY.a("y", (int)2750, (long)(0x10A3589240B7B1B1L ^ l))] = INTERACT_ENTITY;
        ilIliYArray[CP_iY.a("y", (int)28452, (long)(0x35C9B3955650D461L ^ l))] = GENERATE_STRUCTURE;
        ilIliYArray[CP_iY.a("y", (int)21661, (long)(0x3DFC51F99515EFAAL ^ l))] = KEEP_ALIVE;
        ilIliYArray[CP_iY.a("y", (int)25013, (long)(0x5E257ACD482F5A8BL ^ l))] = LOCK_DIFFICULTY;
        ilIliYArray[CP_iY.a("y", (int)6031, (long)(0x76664D992F052C96L ^ l))] = PLAYER_POSITION;
        ilIliYArray[CP_iY.a("y", (int)28022, (long)(0x5D11DCA8556FD664L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIliYArray[CP_iY.a("y", (int)18690, (long)(0x6B600845E490F213L ^ l))] = PLAYER_ROTATION;
        ilIliYArray[CP_iY.a("y", (int)26913, (long)(0x72D48C18476A5275L ^ l))] = PLAYER_FLYING;
        ilIliYArray[CP_iY.a("y", (int)15867, (long)(0x4CCA9001E84E06A0L ^ l))] = VEHICLE_MOVE;
        ilIliYArray[CP_iY.a("y", (int)10168, (long)(0xFC68451D5071CB5L ^ l))] = STEER_BOAT;
        ilIliYArray[CP_iY.a("y", (int)6567, (long)(0x2ACCEEACD8B42293L ^ l))] = PICK_ITEM;
        ilIliYArray[CP_iY.a("y", (int)2581, (long)(0x43E5BE23D61DB103L ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIliYArray[CP_iY.a("y", (int)15033, (long)(0x52EF844F147901B2L ^ l))] = PLAYER_ABILITIES;
        ilIliYArray[CP_iY.a("y", (int)25570, (long)(0x3DFF5BF9FF8D58B0L ^ l))] = PLAYER_DIGGING;
        ilIliYArray[CP_iY.a("y", (int)16710, (long)(0x58F78670DF9F7A6CL ^ l))] = ENTITY_ACTION;
        ilIliYArray[CP_iY.a("y", (int)2677, (long)(0x1B1D4748FBD53175L ^ l))] = STEER_VEHICLE;
        ilIliYArray[CP_iY.a("y", (int)7477, (long)(0x250AC7BD8EE5263DL ^ l))] = PONG;
        ilIliYArray[CP_iY.a("y", (int)29271, (long)(0x71A7D3D0DB42C906L ^ l))] = SET_RECIPE_BOOK_STATE;
        ilIliYArray[CP_iY.a("y", (int)7628, (long)(0x101181295F4AA6D7L ^ l))] = SET_DISPLAYED_RECIPE;
        ilIliYArray[CP_iY.a("y", (int)24270, (long)(0x492FBE3842AC65C8L ^ l))] = NAME_ITEM;
        ilIliYArray[CP_iY.a("y", (int)10220, (long)(0xE7587A57B079CAEL ^ l))] = RESOURCE_PACK_STATUS;
        ilIliYArray[CP_iY.a("y", (int)29347, (long)(0x2892D5640A15C99EL ^ l))] = ADVANCEMENT_TAB;
        ilIliYArray[CP_iY.a("y", (int)1509, (long)(0x1A0CBF6A619D3EDAL ^ l))] = SELECT_TRADE;
        ilIliYArray[CP_iY.a("y", (int)13603, (long)(0x83B49EE7A8E1FL ^ l))] = SET_BEACON_EFFECT;
        ilIliYArray[CP_iY.a("y", (int)17044, (long)(0x19E88EF613367993L ^ l))] = HELD_ITEM_CHANGE;
        ilIliYArray[CP_iY.a("y", (int)28967, (long)(0x26AE2D011F76CA16L ^ l))] = UPDATE_COMMAND_BLOCK;
        ilIliYArray[CP_iY.a("y", (int)3306, (long)(0x5488DF0EB28837E6L ^ l))] = UPDATE_COMMAND_BLOCK_MINECART;
        ilIliYArray[CP_iY.a("y", (int)19142, (long)(0x4EB550DCE48E719EL ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIliYArray[CP_iY.a("y", (int)31043, (long)(0x3D191226C572C247L ^ l))] = UPDATE_JIGSAW_BLOCK;
        ilIliYArray[CP_iY.a("y", (int)18195, (long)(0x5BA324743639FC30L ^ l))] = UPDATE_STRUCTURE_BLOCK;
        ilIliYArray[CP_iY.a("y", (int)14555, (long)(0x22D1161000B2039CL ^ l))] = UPDATE_SIGN;
        ilIliYArray[CP_iY.a("y", (int)32066, (long)(0x384731FECCA9C677L ^ l))] = ANIMATION;
        ilIliYArray[CP_iY.a("y", (int)11529, (long)(0x260F049405C09617L ^ l))] = SPECTATE;
        ilIliYArray[CP_iY.a("y", (int)28401, (long)(0x3F9FEB2E83FAD5FFL ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIliYArray[CP_iY.a("y", (int)31107, (long)(0x651EAC2C431942A6L ^ l))] = USE_ITEM;
        return ilIliYArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_iY.a = CP_s.a(981764093665288433L, 7050233069940721941L, MethodHandles.lookup().lookupClass()).a(22217212754451L);
                        var20 = CP_iY.a ^ 140515605323350L;
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
                        var16_5 = "L\u00bd\u00ef\u00c79\u00be\u00d7\u00f9\u00f6\u000b\u001f\u00c10V%\u008d%\u00c6\u00de\u00c9\u00c4\u0004\u00e6\u00aa\u0010\u00ba\u0017\u00f8\u0092\u00b8\fqTy:h\u00b6\u009b\u00bc\u00b9_\u0018\u00bd\u00a3\u00de\u0093a\\\u0089|\u0003\u00f8x\u0081Q&\u009b\u0004\u00a9\u00dav\u00det\f\u00f8\u00f3\u0010\u00d1m\u0011\u00d5\u0019\u00f1\u00e65G\u009f\u0096k\u0081\u0002\u0085\u0098\u0010Q\u00bbnp\u00e1\u0001\"y<\u0090:(\u0003W\u0010\u000b\u0010IWI\u00e70\u00b0.\u008c\u0086\u00d5\u00b4B\u00bakH\u0090\u0010Z\u00cb\"{/,\u001b\u0090wrk\u009e\u00ffH]T\u0010\u0019N9\u009a)\u00d2\u00c5=\u009d\u00b5\u00b7n\u00fau3\u00fb\u0010@0\u00d1\u00a0\u00fd\u00ab\u0095\u0010n\u008b\u00fa\u00ed\u00dfB\u00d8\u0098\u0010\u0082\u00deI\u0099\u00f6\u009c\u0016\u00d0\u0001w\u0012\u0084mc\u0085i\u0010\u00a5\u0087\u00a3Zv\u00c2\u00e8#\u00fe\u00efG\u00c0\u00b3\u0085%7 \u00e0eI\u0095M\u00c4\u00c4`Q+<\u00fd\u00da\u00a7\u0018NsX\u00a7*\u0015\u00d1\u009c\u00e1Z_+\u008f\u0017\u009d\u00c7<\u0018\u00feE\u00c5\u00e1\u0019\u0011\u00de\"\u00c0;}H\u00f0x\u0001\u008a\u00fe\u00b3mK4Ir:\u0010]\u0098\u00d4Ve\u00de\u0089m\u00e1`\u00c0\u00f8\u00e1\u00a9n{\u0010L\u00bd\u00ef\u00c79\u00be\u00d7\u00f9\u008e\u0099\u0086-\u009a\u00a9j,\u0010\u00f8\u0096}B,\u00f8\u00afd1\u00fd\u0015\u00fbC\u0099X\u00b9\u0010C\u000bz\r\u0098\u0011\u0099\u00b9\f\u00a5|iV\u008e^\u00ee\u0018*\u00eb\u00ef\u0087\u0017\u0007\u00bdH>\u00c5\u007f\u0097\u00c0\u00eb\u0018\u00f0G\u0095!\u009e>\u00bd\u001d\u00b1\u0010R_\u0084Q\u0081\u0013\u0010\u0001\u00e7T\u00c7\u001e%\u009a9w\u0010\u001f\u00f8B6\u00be\u00b4\u00a6\u0096=d\u008e&s\u0092\u0087g\u0018\u00e5S\u00c7\u009b\r\u0017\u00b8A\u00abw!\u00b1\u0083L-\u0007\u00cch\u001c]\u00f2\u00cb\u0003\b\u0010<p6\u00e6\u0095\u00ef\u009e8\u00ae\u0000k,\u00ea\u0096\u00ff\u0010\u00189\u001bF\u00dd\u00c9R]\u00a7\u000f%\u001bP\u00f5\bB\u00b4\u00b8\u0083\u00c0c\u00d1\u008b\u0001\u00b1\u0018\u00ba\u0090\u00ed+\"\u007fY\u001ai\u00c9Iu\u00be\u00c4\u00ebN\u00d3\u0000`<%\u00ecZ\u0018\u0010$e*\u0014\u00f2V?\u00d6\u0002\u00df\u00d5\u00ad\u0003]\u00e3\u00e5\u0010\u00a2\u00be\u0094\u008cE\u008dx\u0087u\u000f\u0003\bU9jN \u00d1m\u0011\u00d5\u0019\u00f1\u00e65\bsu\u00d2\u0097;\u00a7\u008ak\u00c4\u00ae\r\u00bfF\u00ac\u00fej\u0001\u00a4\u001b\u001d\u00d2\u00f9+\u0010*\u0080\u00c5\u009a\u0015\u00a1\u008b\\\u00b1XK*E\u00a2q\u00c1\u0010\u00ebB\u0010\u0081\u0014\u00ea\u00d5@j\u0099\u00f3\u00b4b\u00d5\u00d0\u009b\u0010\u00a2\u00be\u0094\u008cE\u008dx\u0087\u00a1\u0011\u008a\u0001O~\u00f9\u00e4\u0010\u00c7\u001b\u0006\u00b0V+\u00d7^\u00c9[\u00ca\u00ceq\u00fa7\u00f8\u0010\\W\u00a0\u008d\u0081Mtv\u0002t-\u000b\u00cd\f\u00f5;\u0010\u0093\u0082\u00ddo\u0092v\u00b9\u00e91\u00aelBW\u00d3\u00a0\u0086\u0010\u0097\u008cS\u0084\u00a0$]\u0098\u00d7\u0092\u00f7\u0092\u00b7\u00f1\u00a9\u0096\u0018\u00b8\u008c\u00a6\u00d1\u00d5<%\u00b7\u0001v[kf\u0087oR\u0001\u00c7\u0014\u00b0\u00a5c\u0007\u0010\u0018R_\u0084Q\u0081\u0013\u0010\u0001\u007f\u00d66\u00f3DU\u0011y\u0018\u0017P\u00e2\u00cc\u00cdT\u00b6\u0018\u0003\u00b8y\u00c1hP\u00ae\u00cd|\u008c\u0097me\u001c\u009a\u00ba\u0080]N51\u00d4\u009b~ c-[P\u0003\u000e\u00d2\u00bd(\u0007}+\u00b1\u00e9\u00b1\u00f2\u00b2\u00fb\u00b1\u0092r&\u009d\u00b7\u00d1A\u00b1Q\u00ed\u00d4\u00fe\u00e2\u0010G\u00bd\u00ee\u0083\u00efOy3\u00e3\u00c2i\u00a3y$Q\u009b\u0018\u008f\u00e7C\u00a1\u00ccE\u00e6,\u0085{\u00cf&m\u0081\u0010\u0016\u00a13\u001b\u00f3\u00b1\u00a1\t\u009e\u0010\u00b7\u0011\u0095\u0006G\u0086\u0084\u00ef\u009e_\u00dd\u0015\u0082\u0019v\u0019\u0010\u00e7\u0015YL\u00f6\u00a1\u0007\u0083\n\u00fb\u001e)jN=\u009e\u0018}\u00eb+\u0018\u0007\u0086\u0018h\u00f9U9\u0082\u00f6n\u0002;P\u0000\u00c4\u0083\u00da\u00cf\u00cd\u001d\u0010\u0091\u0019\u0095\u00c4V&\u00a0\u0015\u00ed\u00cb\u00d2\u00d3\u0087\u008c\u00e1\u00dd\u0010\u00c6\u0014\u00ae\u00f8\u0087\u00bbk\u0097\u00b8\u00f2\u00da\u0080Y?\u00f5\u009a\u0018\u001e\u00caLTEQ!b\u0015r\u00b9N\u0084_-+\u00c8\u009a\u00c7H\u00e9\u0018f\u009f\b\u00b1\u00abF\u00ec\u0000\u00ac5\u0005\u0018\u00bc\u00b52!mQ\u00d5\u00a8\u00f2\u00efTW\u0002\u00da\u00a9\u00bf\u0010\u0011\u00faC\u008dq,\u0084\u0010xd\u00e1\u00988\u00f0\t\u0092\u008a\u00a2!)\u00cd\u00efP[";
                        var18_6 = "L\u00bd\u00ef\u00c79\u00be\u00d7\u00f9\u00f6\u000b\u001f\u00c10V%\u008d%\u00c6\u00de\u00c9\u00c4\u0004\u00e6\u00aa\u0010\u00ba\u0017\u00f8\u0092\u00b8\fqTy:h\u00b6\u009b\u00bc\u00b9_\u0018\u00bd\u00a3\u00de\u0093a\\\u0089|\u0003\u00f8x\u0081Q&\u009b\u0004\u00a9\u00dav\u00det\f\u00f8\u00f3\u0010\u00d1m\u0011\u00d5\u0019\u00f1\u00e65G\u009f\u0096k\u0081\u0002\u0085\u0098\u0010Q\u00bbnp\u00e1\u0001\"y<\u0090:(\u0003W\u0010\u000b\u0010IWI\u00e70\u00b0.\u008c\u0086\u00d5\u00b4B\u00bakH\u0090\u0010Z\u00cb\"{/,\u001b\u0090wrk\u009e\u00ffH]T\u0010\u0019N9\u009a)\u00d2\u00c5=\u009d\u00b5\u00b7n\u00fau3\u00fb\u0010@0\u00d1\u00a0\u00fd\u00ab\u0095\u0010n\u008b\u00fa\u00ed\u00dfB\u00d8\u0098\u0010\u0082\u00deI\u0099\u00f6\u009c\u0016\u00d0\u0001w\u0012\u0084mc\u0085i\u0010\u00a5\u0087\u00a3Zv\u00c2\u00e8#\u00fe\u00efG\u00c0\u00b3\u0085%7 \u00e0eI\u0095M\u00c4\u00c4`Q+<\u00fd\u00da\u00a7\u0018NsX\u00a7*\u0015\u00d1\u009c\u00e1Z_+\u008f\u0017\u009d\u00c7<\u0018\u00feE\u00c5\u00e1\u0019\u0011\u00de\"\u00c0;}H\u00f0x\u0001\u008a\u00fe\u00b3mK4Ir:\u0010]\u0098\u00d4Ve\u00de\u0089m\u00e1`\u00c0\u00f8\u00e1\u00a9n{\u0010L\u00bd\u00ef\u00c79\u00be\u00d7\u00f9\u008e\u0099\u0086-\u009a\u00a9j,\u0010\u00f8\u0096}B,\u00f8\u00afd1\u00fd\u0015\u00fbC\u0099X\u00b9\u0010C\u000bz\r\u0098\u0011\u0099\u00b9\f\u00a5|iV\u008e^\u00ee\u0018*\u00eb\u00ef\u0087\u0017\u0007\u00bdH>\u00c5\u007f\u0097\u00c0\u00eb\u0018\u00f0G\u0095!\u009e>\u00bd\u001d\u00b1\u0010R_\u0084Q\u0081\u0013\u0010\u0001\u00e7T\u00c7\u001e%\u009a9w\u0010\u001f\u00f8B6\u00be\u00b4\u00a6\u0096=d\u008e&s\u0092\u0087g\u0018\u00e5S\u00c7\u009b\r\u0017\u00b8A\u00abw!\u00b1\u0083L-\u0007\u00cch\u001c]\u00f2\u00cb\u0003\b\u0010<p6\u00e6\u0095\u00ef\u009e8\u00ae\u0000k,\u00ea\u0096\u00ff\u0010\u00189\u001bF\u00dd\u00c9R]\u00a7\u000f%\u001bP\u00f5\bB\u00b4\u00b8\u0083\u00c0c\u00d1\u008b\u0001\u00b1\u0018\u00ba\u0090\u00ed+\"\u007fY\u001ai\u00c9Iu\u00be\u00c4\u00ebN\u00d3\u0000`<%\u00ecZ\u0018\u0010$e*\u0014\u00f2V?\u00d6\u0002\u00df\u00d5\u00ad\u0003]\u00e3\u00e5\u0010\u00a2\u00be\u0094\u008cE\u008dx\u0087u\u000f\u0003\bU9jN \u00d1m\u0011\u00d5\u0019\u00f1\u00e65\bsu\u00d2\u0097;\u00a7\u008ak\u00c4\u00ae\r\u00bfF\u00ac\u00fej\u0001\u00a4\u001b\u001d\u00d2\u00f9+\u0010*\u0080\u00c5\u009a\u0015\u00a1\u008b\\\u00b1XK*E\u00a2q\u00c1\u0010\u00ebB\u0010\u0081\u0014\u00ea\u00d5@j\u0099\u00f3\u00b4b\u00d5\u00d0\u009b\u0010\u00a2\u00be\u0094\u008cE\u008dx\u0087\u00a1\u0011\u008a\u0001O~\u00f9\u00e4\u0010\u00c7\u001b\u0006\u00b0V+\u00d7^\u00c9[\u00ca\u00ceq\u00fa7\u00f8\u0010\\W\u00a0\u008d\u0081Mtv\u0002t-\u000b\u00cd\f\u00f5;\u0010\u0093\u0082\u00ddo\u0092v\u00b9\u00e91\u00aelBW\u00d3\u00a0\u0086\u0010\u0097\u008cS\u0084\u00a0$]\u0098\u00d7\u0092\u00f7\u0092\u00b7\u00f1\u00a9\u0096\u0018\u00b8\u008c\u00a6\u00d1\u00d5<%\u00b7\u0001v[kf\u0087oR\u0001\u00c7\u0014\u00b0\u00a5c\u0007\u0010\u0018R_\u0084Q\u0081\u0013\u0010\u0001\u007f\u00d66\u00f3DU\u0011y\u0018\u0017P\u00e2\u00cc\u00cdT\u00b6\u0018\u0003\u00b8y\u00c1hP\u00ae\u00cd|\u008c\u0097me\u001c\u009a\u00ba\u0080]N51\u00d4\u009b~ c-[P\u0003\u000e\u00d2\u00bd(\u0007}+\u00b1\u00e9\u00b1\u00f2\u00b2\u00fb\u00b1\u0092r&\u009d\u00b7\u00d1A\u00b1Q\u00ed\u00d4\u00fe\u00e2\u0010G\u00bd\u00ee\u0083\u00efOy3\u00e3\u00c2i\u00a3y$Q\u009b\u0018\u008f\u00e7C\u00a1\u00ccE\u00e6,\u0085{\u00cf&m\u0081\u0010\u0016\u00a13\u001b\u00f3\u00b1\u00a1\t\u009e\u0010\u00b7\u0011\u0095\u0006G\u0086\u0084\u00ef\u009e_\u00dd\u0015\u0082\u0019v\u0019\u0010\u00e7\u0015YL\u00f6\u00a1\u0007\u0083\n\u00fb\u001e)jN=\u009e\u0018}\u00eb+\u0018\u0007\u0086\u0018h\u00f9U9\u0082\u00f6n\u0002;P\u0000\u00c4\u0083\u00da\u00cf\u00cd\u001d\u0010\u0091\u0019\u0095\u00c4V&\u00a0\u0015\u00ed\u00cb\u00d2\u00d3\u0087\u008c\u00e1\u00dd\u0010\u00c6\u0014\u00ae\u00f8\u0087\u00bbk\u0097\u00b8\u00f2\u00da\u0080Y?\u00f5\u009a\u0018\u001e\u00caLTEQ!b\u0015r\u00b9N\u0084_-+\u00c8\u009a\u00c7H\u00e9\u0018f\u009f\b\u00b1\u00abF\u00ec\u0000\u00ac5\u0005\u0018\u00bc\u00b52!mQ\u00d5\u00a8\u00f2\u00efTW\u0002\u00da\u00a9\u00bf\u0010\u0011\u00faC\u008dq,\u0084\u0010xd\u00e1\u00988\u00f0\t\u0092\u008a\u00a2!)\u00cd\u00efP[".length();
                        var15_7 = 24;
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
                            var11_3[var17_4++] = CP_iY.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "`vH\u00dd\u0010t\u00a5D\u0082\u00ac\u00e4\u001a\u00d8\u001f6\u0013\u0018c-[P\u0003\u000e\u00d2\u00bd(\u0007}+\u00b1\u00e9\u00b1\u00f2.\u001d:\u00ae\u00a9X\u0097\u00a5";
                            var18_6 = "`vH\u00dd\u0010t\u00a5D\u0082\u00ac\u00e4\u001a\u00d8\u001f6\u0013\u0018c-[P\u0003\u000e\u00d2\u00bd(\u0007}+\u00b1\u00e9\u00b1\u00f2.\u001d:\u00ae\u00a9X\u0097\u00a5".length();
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
                            var11_3[var17_4++] = CP_iY.a(var19_9).intern();
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
                CP_iY.d = new HashMap<K, V>(13);
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
                var4_14 = "\u00cbW\u00e2\u00d6d\u00fc\u0089.\u000e\u00e8\u0084;\u00a0B\u00ffZz\u00a3f\u0086\u00e7\u00d2\u000b\u00de\u00e9\u008e\r\u00d6\"\u0080Z\u00c2\u00eag\f\u00a2}&\u0006\u00b3=\u00b9S-\u00fbRI\u00ed\u00001\u00a5\u00ed\u00f6b\u009fx\u00af\u00df\u00c6\u00fd\u00a7\u00c4&\u00c2W\u008d+rzf\u00f1\u00f2\u00dc\u00f0\u00b2\u001a^du\u001c\u00d8R2\u00ed%pJ\u00bf\u00d2\u0007\u00f5\u00dcN~\u00f3R\u001c\u00d9\u0080\u0082\u0090\u00e1\u00d8T\u00ed\u00ee\u0019\u0014\u00cd\u00a0\u00cfP2=\t\f\n\u009d~\b\u008c\u00ab\u00b6\"^\u00ebsb\u0000\u00fb7v\u00e6\u00b8\u0006\u00e4jTD6]_{\u00eb\u0096\u00b8|\u00d0<\u00e5\u00dd\u001e\u00d4\u0017wJ\\\u00bdd\u0085\u00dc&\u00d4\u00a6l\u00ba\u00d5\u00ec=\u00a2<\u0097\b\"\u00d6B\u00cb,Hz\u0016l\u00ce>z\u00a8\u0093k\u00ebgL?\u00da\u001c\u0093\u00ff\u00f1m!\u00fa\u00eee)5\u00cd\u00d1\u00c3\u00c8\u0092e)\u00a6xg\u001c#\u00f0\u000b,\u0084{\u000f\u00dd\u00af\u00be\u0087\u0006\u00e6\u00c0\u00f0\n~\u00b3\u001fu\u00df6R\u0093\u00ad\u00f6\b\u008cr\u00e6\u00e5\u00d2\u00f1\u00a2\u00e55\u00a2VYm3\u00d9\u00ab\u001e\u00bcXn\u00ca1\u00ec\u008b\u00cf\u00f0\u0017*\u008e\u00d6P}\u00ea\u0019\u00bf\u00c9\u00ea;\u00b2jYq\u001bf\u00ed\u00f6\u00c6~\u00df8R\u00ffp\u00efoP\u0013\u00bb\u00c9G\u00cctn\u00b7\u00b4\u00ba\u00c5 \u00d7\u00d3#\u0080\u00e7\u0085`\u00f6!\u00d2\u00e5>\u00e3P\u00d1\u00aa\u00b8\u00b9r\u0018.\u00e1m\u008cBo$\u00c1\u0003\u009e\u009e\u00f0?SG\u00afc\u00f1\u00e9\u00c5*\u00c8\u00b6\u00e2\u00a93\u00ce=\u00f3\u008f\u0084\u00c6\u0098\u00c9\u0014I\u00ad\u000b\u00a8\u00a9\u00bc\u00dd+\u00c9*\u00fcat\u00a3\u0002\u00fbb\u00c3\u00f0\u00cdfO\u00e6\u00e0a\u0000d\u0082\u00cc\u0084:R\u0086/\u0016WZ!\u00d0\u00f8\u009c\u00ba\u0016\\\u00f3K\u00bcF\u00a3\u0090\u009b\u009e\u00ef\u00c2\u00ad,i\u00d8{\u00f4\u00f00\t\u00ec\u00b3\u00e9\u00e6\u00c0\u00bc\u00f1y\u00c2\u00ccdl\u00f7\t\u00f1\u00ebV\u00ec\u00e0\u00cd\u00e2\u00ea\u0004\u00e4\u00afS\u000e\f\u00fd~i\u0084\u0093\u0016\u00c5Q`\u00b9C\u00e2\u00f4v\u009ep\u0013\u0003\u0004W%B\u0018\u00bbo\u00ce\u00ff\u000f~\u0088\u00e0A\u0089<r\u0003\u00a5[\u008am\u00e6\u008d\u00caa\u001a\u00fc\u0099I.\u00f8\r\u0007\u00fb\u00f04.^>\u0081\u00f20\u009b1o\u00ab\u00fb\u00a1\u00c5\u0088 \u00ed\u00ee\u00fa\u00ca\u0085a\u00a0\u008bH\u008d\u0089|Sb\u00a2D\u0017F'\u0001\u00ba\u00bc\u00d0\u00cf\u007f\u00d1]\u00c5\u00ddZ\u00c6\u00e4Y\u00d2a\u00ff:\u0090\u0091_\u0016\u00aa*\u00ed\u00be\u00176\u00e6\n\u000b\u00889t\u00bf,\u00d8\u00ce\u00ac\u0080T\u0006\u00bf'\u00cc\u00fe\u00b8:\u00cc\u009bv\u00e23\r\u00b7dv\u0016\u00f6\u00ee\u00b0\u00c1B\u00e1\u0093)O\u00a9}Y\u00d8J\u00f4\u009b\u00d62\u00b2`N\u00d9\u0088|\u00d2\u0086\"Gd\u00bf\u00ed\u00e5\f\u00f40\u0018po\u00d7\u00b2?~\u0005;\u00b6\u00d4Q\u00e7\u008d\\Y\u0087B\u00f3\u00bfw\u0017M\u00d9\u0013(\u0005q\u00bc\u0013\u00cd\u00f8\u0080m\u00fd\u00a8CAV\u0087'\u00ed$\u001f2\u00a2(\u00d4v\u009e-\u00bcY\u00cd\u0095\u00e4M\u00f1\u00ac\u00ac\u00ff\u00be3J\u00a6\u00bf+#\u009d\u00c9;b\u00b5|";
                var5_15 = "\u00cbW\u00e2\u00d6d\u00fc\u0089.\u000e\u00e8\u0084;\u00a0B\u00ffZz\u00a3f\u0086\u00e7\u00d2\u000b\u00de\u00e9\u008e\r\u00d6\"\u0080Z\u00c2\u00eag\f\u00a2}&\u0006\u00b3=\u00b9S-\u00fbRI\u00ed\u00001\u00a5\u00ed\u00f6b\u009fx\u00af\u00df\u00c6\u00fd\u00a7\u00c4&\u00c2W\u008d+rzf\u00f1\u00f2\u00dc\u00f0\u00b2\u001a^du\u001c\u00d8R2\u00ed%pJ\u00bf\u00d2\u0007\u00f5\u00dcN~\u00f3R\u001c\u00d9\u0080\u0082\u0090\u00e1\u00d8T\u00ed\u00ee\u0019\u0014\u00cd\u00a0\u00cfP2=\t\f\n\u009d~\b\u008c\u00ab\u00b6\"^\u00ebsb\u0000\u00fb7v\u00e6\u00b8\u0006\u00e4jTD6]_{\u00eb\u0096\u00b8|\u00d0<\u00e5\u00dd\u001e\u00d4\u0017wJ\\\u00bdd\u0085\u00dc&\u00d4\u00a6l\u00ba\u00d5\u00ec=\u00a2<\u0097\b\"\u00d6B\u00cb,Hz\u0016l\u00ce>z\u00a8\u0093k\u00ebgL?\u00da\u001c\u0093\u00ff\u00f1m!\u00fa\u00eee)5\u00cd\u00d1\u00c3\u00c8\u0092e)\u00a6xg\u001c#\u00f0\u000b,\u0084{\u000f\u00dd\u00af\u00be\u0087\u0006\u00e6\u00c0\u00f0\n~\u00b3\u001fu\u00df6R\u0093\u00ad\u00f6\b\u008cr\u00e6\u00e5\u00d2\u00f1\u00a2\u00e55\u00a2VYm3\u00d9\u00ab\u001e\u00bcXn\u00ca1\u00ec\u008b\u00cf\u00f0\u0017*\u008e\u00d6P}\u00ea\u0019\u00bf\u00c9\u00ea;\u00b2jYq\u001bf\u00ed\u00f6\u00c6~\u00df8R\u00ffp\u00efoP\u0013\u00bb\u00c9G\u00cctn\u00b7\u00b4\u00ba\u00c5 \u00d7\u00d3#\u0080\u00e7\u0085`\u00f6!\u00d2\u00e5>\u00e3P\u00d1\u00aa\u00b8\u00b9r\u0018.\u00e1m\u008cBo$\u00c1\u0003\u009e\u009e\u00f0?SG\u00afc\u00f1\u00e9\u00c5*\u00c8\u00b6\u00e2\u00a93\u00ce=\u00f3\u008f\u0084\u00c6\u0098\u00c9\u0014I\u00ad\u000b\u00a8\u00a9\u00bc\u00dd+\u00c9*\u00fcat\u00a3\u0002\u00fbb\u00c3\u00f0\u00cdfO\u00e6\u00e0a\u0000d\u0082\u00cc\u0084:R\u0086/\u0016WZ!\u00d0\u00f8\u009c\u00ba\u0016\\\u00f3K\u00bcF\u00a3\u0090\u009b\u009e\u00ef\u00c2\u00ad,i\u00d8{\u00f4\u00f00\t\u00ec\u00b3\u00e9\u00e6\u00c0\u00bc\u00f1y\u00c2\u00ccdl\u00f7\t\u00f1\u00ebV\u00ec\u00e0\u00cd\u00e2\u00ea\u0004\u00e4\u00afS\u000e\f\u00fd~i\u0084\u0093\u0016\u00c5Q`\u00b9C\u00e2\u00f4v\u009ep\u0013\u0003\u0004W%B\u0018\u00bbo\u00ce\u00ff\u000f~\u0088\u00e0A\u0089<r\u0003\u00a5[\u008am\u00e6\u008d\u00caa\u001a\u00fc\u0099I.\u00f8\r\u0007\u00fb\u00f04.^>\u0081\u00f20\u009b1o\u00ab\u00fb\u00a1\u00c5\u0088 \u00ed\u00ee\u00fa\u00ca\u0085a\u00a0\u008bH\u008d\u0089|Sb\u00a2D\u0017F'\u0001\u00ba\u00bc\u00d0\u00cf\u007f\u00d1]\u00c5\u00ddZ\u00c6\u00e4Y\u00d2a\u00ff:\u0090\u0091_\u0016\u00aa*\u00ed\u00be\u00176\u00e6\n\u000b\u00889t\u00bf,\u00d8\u00ce\u00ac\u0080T\u0006\u00bf'\u00cc\u00fe\u00b8:\u00cc\u009bv\u00e23\r\u00b7dv\u0016\u00f6\u00ee\u00b0\u00c1B\u00e1\u0093)O\u00a9}Y\u00d8J\u00f4\u009b\u00d62\u00b2`N\u00d9\u0088|\u00d2\u0086\"Gd\u00bf\u00ed\u00e5\f\u00f40\u0018po\u00d7\u00b2?~\u0005;\u00b6\u00d4Q\u00e7\u008d\\Y\u0087B\u00f3\u00bfw\u0017M\u00d9\u0013(\u0005q\u00bc\u0013\u00cd\u00f8\u0080m\u00fd\u00a8CAV\u0087'\u00ed$\u001f2\u00a2(\u00d4v\u009e-\u00bcY\u00cd\u0095\u00e4M\u00f1\u00ac\u00ac\u00ff\u00be3J\u00a6\u00bf+#\u009d\u00c9;b\u00b5|".length();
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
                    var4_14 = "\n{\u00aa.\u00d4\u0007}Q\u00c9\tU\u008e^\u00feR\u00f7";
                    var5_15 = "\n{\u00aa.\u00d4\u0007}Q\u00c9\tU\u008e^\u00feR\u00f7".length();
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
        CP_iY.b = var6_12;
        CP_iY.c = new Integer[91];
        CP_iY.TELEPORT_CONFIRM = new CP_iY();
        CP_iY.QUERY_BLOCK_NBT = new CP_iY();
        CP_iY.SET_DIFFICULTY = new CP_iY();
        CP_iY.CHAT_ACK = new CP_iY();
        CP_iY.CHAT_COMMAND = new CP_iY();
        CP_iY.CHAT_MESSAGE = new CP_iY();
        CP_iY.CHAT_PREVIEW = new CP_iY();
        CP_iY.CLIENT_STATUS = new CP_iY();
        CP_iY.CLIENT_SETTINGS = new CP_iY();
        CP_iY.TAB_COMPLETE = new CP_iY();
        CP_iY.CLICK_WINDOW_BUTTON = new CP_iY();
        CP_iY.CLICK_WINDOW = new CP_iY();
        CP_iY.CLOSE_WINDOW = new CP_iY();
        CP_iY.PLUGIN_MESSAGE = new CP_iY();
        CP_iY.EDIT_BOOK = new CP_iY();
        CP_iY.QUERY_ENTITY_NBT = new CP_iY();
        CP_iY.INTERACT_ENTITY = new CP_iY();
        CP_iY.GENERATE_STRUCTURE = new CP_iY();
        CP_iY.KEEP_ALIVE = new CP_iY();
        CP_iY.LOCK_DIFFICULTY = new CP_iY();
        CP_iY.PLAYER_POSITION = new CP_iY();
        CP_iY.PLAYER_POSITION_AND_ROTATION = new CP_iY();
        CP_iY.PLAYER_ROTATION = new CP_iY();
        CP_iY.PLAYER_FLYING = new CP_iY();
        CP_iY.VEHICLE_MOVE = new CP_iY();
        CP_iY.STEER_BOAT = new CP_iY();
        CP_iY.PICK_ITEM = new CP_iY();
        CP_iY.CRAFT_RECIPE_REQUEST = new CP_iY();
        CP_iY.PLAYER_ABILITIES = new CP_iY();
        CP_iY.PLAYER_DIGGING = new CP_iY();
        CP_iY.ENTITY_ACTION = new CP_iY();
        CP_iY.STEER_VEHICLE = new CP_iY();
        CP_iY.PONG = new CP_iY();
        CP_iY.SET_RECIPE_BOOK_STATE = new CP_iY();
        CP_iY.SET_DISPLAYED_RECIPE = new CP_iY();
        CP_iY.NAME_ITEM = new CP_iY();
        CP_iY.RESOURCE_PACK_STATUS = new CP_iY();
        CP_iY.ADVANCEMENT_TAB = new CP_iY();
        CP_iY.SELECT_TRADE = new CP_iY();
        CP_iY.SET_BEACON_EFFECT = new CP_iY();
        CP_iY.HELD_ITEM_CHANGE = new CP_iY();
        CP_iY.UPDATE_COMMAND_BLOCK = new CP_iY();
        CP_iY.UPDATE_COMMAND_BLOCK_MINECART = new CP_iY();
        CP_iY.CREATIVE_INVENTORY_ACTION = new CP_iY();
        CP_iY.UPDATE_JIGSAW_BLOCK = new CP_iY();
        CP_iY.UPDATE_STRUCTURE_BLOCK = new CP_iY();
        CP_iY.UPDATE_SIGN = new CP_iY();
        CP_iY.ANIMATION = new CP_iY();
        CP_iY.SPECTATE = new CP_iY();
        CP_iY.PLAYER_BLOCK_PLACEMENT = new CP_iY();
        CP_iY.USE_ITEM = new CP_iY();
        CP_iY.CP_t = CP_iY.CP_I();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x23F0;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_iY", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_iY.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_iY.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_iY" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_iY.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

