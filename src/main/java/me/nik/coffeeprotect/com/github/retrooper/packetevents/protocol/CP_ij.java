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

public final class CP_ij
extends Enum<CP_ij> {
    public static final /* enum */ CP_ij TELEPORT_CONFIRM;
    public static final /* enum */ CP_ij QUERY_BLOCK_NBT;
    public static final /* enum */ CP_ij SET_DIFFICULTY;
    public static final /* enum */ CP_ij CHAT_MESSAGE;
    public static final /* enum */ CP_ij CLIENT_STATUS;
    public static final /* enum */ CP_ij CLIENT_SETTINGS;
    public static final /* enum */ CP_ij TAB_COMPLETE;
    public static final /* enum */ CP_ij WINDOW_CONFIRMATION;
    public static final /* enum */ CP_ij CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_ij CLICK_WINDOW;
    public static final /* enum */ CP_ij CLOSE_WINDOW;
    public static final /* enum */ CP_ij PLUGIN_MESSAGE;
    public static final /* enum */ CP_ij EDIT_BOOK;
    public static final /* enum */ CP_ij QUERY_ENTITY_NBT;
    public static final /* enum */ CP_ij INTERACT_ENTITY;
    public static final /* enum */ CP_ij KEEP_ALIVE;
    public static final /* enum */ CP_ij LOCK_DIFFICULTY;
    public static final /* enum */ CP_ij PLAYER_POSITION;
    public static final /* enum */ CP_ij PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_ij PLAYER_ROTATION;
    public static final /* enum */ CP_ij PLAYER_FLYING;
    public static final /* enum */ CP_ij VEHICLE_MOVE;
    public static final /* enum */ CP_ij STEER_BOAT;
    public static final /* enum */ CP_ij PICK_ITEM;
    public static final /* enum */ CP_ij CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_ij PLAYER_ABILITIES;
    public static final /* enum */ CP_ij PLAYER_DIGGING;
    public static final /* enum */ CP_ij ENTITY_ACTION;
    public static final /* enum */ CP_ij STEER_VEHICLE;
    public static final /* enum */ CP_ij RECIPE_BOOK_DATA;
    public static final /* enum */ CP_ij NAME_ITEM;
    public static final /* enum */ CP_ij RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_ij ADVANCEMENT_TAB;
    public static final /* enum */ CP_ij SELECT_TRADE;
    public static final /* enum */ CP_ij SET_BEACON_EFFECT;
    public static final /* enum */ CP_ij HELD_ITEM_CHANGE;
    public static final /* enum */ CP_ij UPDATE_COMMAND_BLOCK;
    public static final /* enum */ CP_ij UPDATE_COMMAND_BLOCK_MINECART;
    public static final /* enum */ CP_ij CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_ij UPDATE_JIGSAW_BLOCK;
    public static final /* enum */ CP_ij UPDATE_STRUCTURE_BLOCK;
    public static final /* enum */ CP_ij UPDATE_SIGN;
    public static final /* enum */ CP_ij ANIMATION;
    public static final /* enum */ CP_ij SPECTATE;
    public static final /* enum */ CP_ij PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_ij USE_ITEM;
    private static final /* synthetic */ CP_ij[] CP_o;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_ij[] values() {
        return (CP_ij[])CP_o.clone();
    }

    public static CP_ij valueOf(String string) {
        return Enum.valueOf(CP_ij.class, string);
    }

    private static /* synthetic */ CP_ij[] CP_l() {
        long l = a ^ 0x7CAA70E0C6D8L;
        CP_ij[] ilIlijArray = new CP_ij[CP_ij.a("c", (int)5748, (long)(0x3142A32228EBDF5L ^ l))];
        ilIlijArray[0] = TELEPORT_CONFIRM;
        ilIlijArray[1] = QUERY_BLOCK_NBT;
        ilIlijArray[2] = SET_DIFFICULTY;
        ilIlijArray[3] = CHAT_MESSAGE;
        ilIlijArray[4] = CLIENT_STATUS;
        ilIlijArray[5] = CLIENT_SETTINGS;
        ilIlijArray[CP_ij.a("c", (int)31500, (long)(0x2345EA89989F5082L ^ l))] = TAB_COMPLETE;
        ilIlijArray[CP_ij.a("c", (int)13644, (long)(0x22EF39C440F71ED5L ^ l))] = WINDOW_CONFIRMATION;
        ilIlijArray[CP_ij.a("c", (int)14425, (long)(0xA54CB1510713F3L ^ l))] = CLICK_WINDOW_BUTTON;
        ilIlijArray[CP_ij.a("c", (int)30122, (long)(0x120B3A43E8855E03L ^ l))] = CLICK_WINDOW;
        ilIlijArray[CP_ij.a("c", (int)8362, (long)(0x4DE1BC976FD10B02L ^ l))] = CLOSE_WINDOW;
        ilIlijArray[CP_ij.a("c", (int)17843, (long)(0x4690B78F3C0F6E20L ^ l))] = PLUGIN_MESSAGE;
        ilIlijArray[CP_ij.a("c", (int)8133, (long)(0x6F48625E5E603453L ^ l))] = EDIT_BOOK;
        ilIlijArray[CP_ij.a("c", (int)3335, (long)(0x1E55052D1092A6A0L ^ l))] = QUERY_ENTITY_NBT;
        ilIlijArray[CP_ij.a("c", (int)26924, (long)(0x3537A49C3C14C2C8L ^ l))] = INTERACT_ENTITY;
        ilIlijArray[CP_ij.a("c", (int)29658, (long)(0x40F710DAF622D839L ^ l))] = KEEP_ALIVE;
        ilIlijArray[CP_ij.a("c", (int)30626, (long)(0x3EA6E7037B88DC1DL ^ l))] = LOCK_DIFFICULTY;
        ilIlijArray[CP_ij.a("c", (int)5386, (long)(0x226388C909DEBEBAL ^ l))] = PLAYER_POSITION;
        ilIlijArray[CP_ij.a("c", (int)10405, (long)(0x2CB6AF7B34FE0319L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIlijArray[CP_ij.a("c", (int)3643, (long)(0x7EC4D8258FE625D7L ^ l))] = PLAYER_ROTATION;
        ilIlijArray[CP_ij.a("c", (int)20695, (long)(0x58BDF48F2C49FB5FL ^ l))] = PLAYER_FLYING;
        ilIlijArray[CP_ij.a("c", (int)5300, (long)(0x692A089D2D77BF56L ^ l))] = VEHICLE_MOVE;
        ilIlijArray[CP_ij.a("c", (int)4288, (long)(0xC6CF5410EAE3B74L ^ l))] = STEER_BOAT;
        ilIlijArray[CP_ij.a("c", (int)15012, (long)(0x36493BEAC184914FL ^ l))] = PICK_ITEM;
        ilIlijArray[CP_ij.a("c", (int)24439, (long)(0x617AF3BD256674D3L ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIlijArray[CP_ij.a("c", (int)14020, (long)(0x751D2F0715081D43L ^ l))] = PLAYER_ABILITIES;
        ilIlijArray[CP_ij.a("c", (int)21020, (long)(0x3552AD122DB179F9L ^ l))] = PLAYER_DIGGING;
        ilIlijArray[CP_ij.a("c", (int)391, (long)(0x642B0CFB73CCAA3AL ^ l))] = ENTITY_ACTION;
        ilIlijArray[CP_ij.a("c", (int)10038, (long)(0x6F227B4C929B8CA8L ^ l))] = STEER_VEHICLE;
        ilIlijArray[CP_ij.a("c", (int)31708, (long)(0x257A67D6F723D064L ^ l))] = RECIPE_BOOK_DATA;
        ilIlijArray[CP_ij.a("c", (int)19712, (long)(0x51C61B610BA6E697L ^ l))] = NAME_ITEM;
        ilIlijArray[CP_ij.a("c", (int)10385, (long)(0x70C1F867AE84033CL ^ l))] = RESOURCE_PACK_STATUS;
        ilIlijArray[CP_ij.a("c", (int)5725, (long)(0x2BDE3C7E6F7D3DEAL ^ l))] = ADVANCEMENT_TAB;
        ilIlijArray[CP_ij.a("c", (int)1371, (long)(0x3B464ABD6E0DAED9L ^ l))] = SELECT_TRADE;
        ilIlijArray[CP_ij.a("c", (int)8144, (long)(0x682A570E1C65B43FL ^ l))] = SET_BEACON_EFFECT;
        ilIlijArray[CP_ij.a("c", (int)5037, (long)(0x5B2FDE49EF563830L ^ l))] = HELD_ITEM_CHANGE;
        ilIlijArray[CP_ij.a("c", (int)28672, (long)(0xA87D60FDA9ADBE8L ^ l))] = UPDATE_COMMAND_BLOCK;
        ilIlijArray[CP_ij.a("c", (int)18377, (long)(0x39F865195B516C70L ^ l))] = UPDATE_COMMAND_BLOCK_MINECART;
        ilIlijArray[CP_ij.a("c", (int)17547, (long)(0x613A096B21EF6F61L ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIlijArray[CP_ij.a("c", (int)13831, (long)(0x59CAAC3266329DB1L ^ l))] = UPDATE_JIGSAW_BLOCK;
        ilIlijArray[CP_ij.a("c", (int)19874, (long)(0x5C1EA26600BE617L ^ l))] = UPDATE_STRUCTURE_BLOCK;
        ilIlijArray[CP_ij.a("c", (int)12626, (long)(0x649E793767591AC6L ^ l))] = UPDATE_SIGN;
        ilIlijArray[CP_ij.a("c", (int)6857, (long)(0x3BBD1384864AB155L ^ l))] = ANIMATION;
        ilIlijArray[CP_ij.a("c", (int)26040, (long)(0x610C8DF298CCE32L ^ l))] = SPECTATE;
        ilIlijArray[CP_ij.a("c", (int)28650, (long)(0x3DA753C8898BC45BL ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIlijArray[CP_ij.a("c", (int)10825, (long)(0x6766F6EAF9F001C9L ^ l))] = USE_ITEM;
        return ilIlijArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_ij.a = CP_s.a(-2276254422438157999L, -916803854625828835L, MethodHandles.lookup().lookupClass()).a(65742380691590L);
                        var20 = CP_ij.a ^ 40376020364775L;
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
                        var16_5 = "\u001a\u00b5\u000b\u00b0\u00a1FF\u0096_\u00c2\u00ea\u00f9F?\u00db&\u0010\u00841\u00c3=\u009e\u00a4&\u00b5\u00de\u00c2\u00c8sM\u00d8\u009d,\u0010.O 6\u00f2\u00e7\u00b4!E\u00c3?!\u008e\u0018,@\u0010\u0004Rf\\\u00a3y=X\u0000CCx\u00a7\u00a5\u0005+\u0010\u001c\u0017\u0081\u00bal\u00c6X\u008c\u0091\u00d6k-\u0097M\u009a\u00e1\u0010\u007fg\u00a7\u00b6\u00eeU\u00da[\u0014\u00dd_~p\u00c2\u00f1\u0005\u0018k\u00e6\u00ddD(\u0092\u00b4;\u0000\u009e\u00bf\u00a7\u00f1\u00a3\u0081\u00ec\u0091\u0016\u00af9w6\u00a2\u008a\u0010\u008c\u00da'\u0014\u0001=\u001a\u00b7\u0094\u0006\u00f3\u00f9U-z(\u0018\u00c3\\! \u00e8\u0019_\u00c1\u00f9b\u00b2\u00076\u00dc\u0001\u0086\u0000\u0011\u009f\u0083\u00aa\u0093A\u00f2\u0018M\u00a2V|\u008d\u00a8\u00ee\u001fR\u00ff\u00d5+0V\u00b1\u0013\u00e3\u00e4\u00cf\u008d\u008c\u00f9\u00aa/\u0010H\u00edW\u009a>\u00e1\u0011\u0094\u00d0\u00b9\u0086\u0093\u00b6(\u00d3\u00e8\u0010\u00e6yY}\u00a4TM\u00b9^\u00ba\u00f9+\u00ba\u0002V\u00d8\u0010B$\u00a1\u00c8JD^\u00a4\u00bfT~\u00ca\u00b1[\u0082p\u0018\u00f4\u00c4\u00b9y\u000e\u00b2q\u009d\u00a1\u00ad\u00db\u00f2\u0083\b\u0001\u0015(\u009b(\u00ee\u00fee\u00fa\u00c5\u0010L\u00ca\u0099UG\u00967HQ\u0089\u00a4\u000f\u000e\u00bf\u009f\u00ca\u0018.O 6\u00f2\u00e7\u00b4!\u00b5\u0085\u00b6\u008e\u00b11o\u0087Y\u0094\u00ef_7\u00d0\u0014\u001c\u0010g\u0088<\u00b92\u00e0y\u0089\r\boIi\u00882R\u0010\u00f25\u009f\u00e8\u00f0I\u00fe\u009f\u00bd\u00ad\u008a\u001d<\u00d9F7\u0010\u00e7\u00de\u001e\\\u00fb\u00f0\t\u0091\u00fa*\u00dd\u00f8M\u0087\u0092\u00c7\u0018\u001c\u0017\u0081\u00bal\u00c6X\u008cC\u00e3{c/\n\u00a0t\u00ec\u00146\u00f2d\u00bbV\u0099\u0018F\u00efT\u00a5%\u008f0\u0000D\u00b7\u00c0\u0003F&.p\u00a85\u008a\u00a2\u0096\u00f8\u0001\u001a\u0018C\u00f5\u000f\t\u001f^n\u0098Z\u00d2\b\u00ec`\u00df\u009d\u0096\u00a4S \u00e5\u001f\"\u0084\u00ed\u0010\u00c1\u00af\u00e1ML\u00b4\u00cae\u00d6\u00d5\u00e3\u00cbcy\u00ab\u008b\u0018E\u0019:\u00afvb,\u00a95,g\u0083\u0017\u0081i\u00ef\u00f7\u00e4\u00c29q\t\u0097\u009b\u0018\u0081\"Q\u0098\u00dc\u000f.\u00f1\u0017Ur\u00ce8W\u00c8j3\u00c0j\u00b9\u0089p\u00a2\u0080\u0010\u009e\u00b5\u0015\u00c0.Pr\u00e4\u00ce\u00a4I\u001e5.we \u00ac\u00c2\u00a8\u00ee\u0003i\u00c1\u00f9\u00b9\u009f\u0014\u008b\u00f5\u00160\u009f&\u00ea;\u0098\u0095\u00e9p\u0096_3d\u001aQ\u00aa\u00c30\u0010\u0001\u00cfo\u00a3\u00f8\u00dc\u0088\u00e5\u009e\b\u0093o\u00b2\u0087u\u00ec\u0010 \u00c1\u00a7;\u009f}\u000eg\n\u00c8\u001eAO\u0082{\u008a\u0010\u0098E\u009bT}i\u00ea\u00a3\u00c8q\r\u00e7\u00c7\bp\u00ca\u0010\u0014+G\u0005\u00a4\u00b4X~\u001b\u00c9lKz?\u0082 \u0010\u00c7\u0080\u00aa\u00f1\u008e\u00ffg\u0006'\u00dc\u0088zJ%\u00ef\u00e8\u0010m\u0000\u00f0i\u00b5\u00165\u00bdX\u0094\u0097U#\r\u001bR k\u00e6\u00ddD(\u0092\u00b4;\u0000\u009e\u00bf\u00a7\u00f1\u00a3\u0081\u00ecJ\u00aa\u00d7\u00d3\u0083\u0098H\u00f2\u0010\u00ad\nn/\u00ad\fK\u0018\u0004\u00f3\u0004\u0098\u00b4.\u00deh\u00beT\u0011\u00feO\u00f8!\u008f\u0017\u00ea\u00d5v\u00195\\\u00a5\u0010\u00f0\u00a6\u00dcZS\u001d|\u007f\u0086\u00e7\u00feh\u00c4[|\u009b\u0010\u0005_\u0010\u001eIX\u00e0\u00be7\u00e6\u008e\u00d3\u00a9\\\u0018I\u00185iI\u00c5\b\u00d8\u00ad\u001f\u00dfZ\u00f6|(c\u00c7\u00a0_\u00a4\u00f8\nU\u00c8\u0012\u00a1\u00181\u00b4[\u0002\u0000\u00c34eu\u001f\u00d2A\u00d3\u0003r\b\u009by\u00bau\u00ef\n\u00e3\u00bc\u00106ZENes\u00b3e2Hc\u008ak\u00b3\u00cf\\ \u00f0\u00a6\u00dcZS\u001d|\u007f\u00e1S:\u00e6\u00a2\u00a1|\u00ceK\u00be\u00cd\u0087\u00b5K\u008ccm\u00d0xl\u0098\u0092\u00f6\u0098\u0010\"\u00cb\u00f9\n`\bL\u001d\u00af\u00d0,\u001am\u009e\u00f5\u0085\u0010\u0005\u0083\u00bf\u00d9\u00dc\u0011\u009fw\u00f9\u009e\u0014\u00aa\u00c5\u0080\u00e2\u009d\u0018\u00d8 _>\u00f7i)\u001f\u00a7\u00bf\u00bb\u00bd\u0002\f\u00b0\u0010]{\u0006m\u00a5\u00d0G.";
                        var18_6 = "\u001a\u00b5\u000b\u00b0\u00a1FF\u0096_\u00c2\u00ea\u00f9F?\u00db&\u0010\u00841\u00c3=\u009e\u00a4&\u00b5\u00de\u00c2\u00c8sM\u00d8\u009d,\u0010.O 6\u00f2\u00e7\u00b4!E\u00c3?!\u008e\u0018,@\u0010\u0004Rf\\\u00a3y=X\u0000CCx\u00a7\u00a5\u0005+\u0010\u001c\u0017\u0081\u00bal\u00c6X\u008c\u0091\u00d6k-\u0097M\u009a\u00e1\u0010\u007fg\u00a7\u00b6\u00eeU\u00da[\u0014\u00dd_~p\u00c2\u00f1\u0005\u0018k\u00e6\u00ddD(\u0092\u00b4;\u0000\u009e\u00bf\u00a7\u00f1\u00a3\u0081\u00ec\u0091\u0016\u00af9w6\u00a2\u008a\u0010\u008c\u00da'\u0014\u0001=\u001a\u00b7\u0094\u0006\u00f3\u00f9U-z(\u0018\u00c3\\! \u00e8\u0019_\u00c1\u00f9b\u00b2\u00076\u00dc\u0001\u0086\u0000\u0011\u009f\u0083\u00aa\u0093A\u00f2\u0018M\u00a2V|\u008d\u00a8\u00ee\u001fR\u00ff\u00d5+0V\u00b1\u0013\u00e3\u00e4\u00cf\u008d\u008c\u00f9\u00aa/\u0010H\u00edW\u009a>\u00e1\u0011\u0094\u00d0\u00b9\u0086\u0093\u00b6(\u00d3\u00e8\u0010\u00e6yY}\u00a4TM\u00b9^\u00ba\u00f9+\u00ba\u0002V\u00d8\u0010B$\u00a1\u00c8JD^\u00a4\u00bfT~\u00ca\u00b1[\u0082p\u0018\u00f4\u00c4\u00b9y\u000e\u00b2q\u009d\u00a1\u00ad\u00db\u00f2\u0083\b\u0001\u0015(\u009b(\u00ee\u00fee\u00fa\u00c5\u0010L\u00ca\u0099UG\u00967HQ\u0089\u00a4\u000f\u000e\u00bf\u009f\u00ca\u0018.O 6\u00f2\u00e7\u00b4!\u00b5\u0085\u00b6\u008e\u00b11o\u0087Y\u0094\u00ef_7\u00d0\u0014\u001c\u0010g\u0088<\u00b92\u00e0y\u0089\r\boIi\u00882R\u0010\u00f25\u009f\u00e8\u00f0I\u00fe\u009f\u00bd\u00ad\u008a\u001d<\u00d9F7\u0010\u00e7\u00de\u001e\\\u00fb\u00f0\t\u0091\u00fa*\u00dd\u00f8M\u0087\u0092\u00c7\u0018\u001c\u0017\u0081\u00bal\u00c6X\u008cC\u00e3{c/\n\u00a0t\u00ec\u00146\u00f2d\u00bbV\u0099\u0018F\u00efT\u00a5%\u008f0\u0000D\u00b7\u00c0\u0003F&.p\u00a85\u008a\u00a2\u0096\u00f8\u0001\u001a\u0018C\u00f5\u000f\t\u001f^n\u0098Z\u00d2\b\u00ec`\u00df\u009d\u0096\u00a4S \u00e5\u001f\"\u0084\u00ed\u0010\u00c1\u00af\u00e1ML\u00b4\u00cae\u00d6\u00d5\u00e3\u00cbcy\u00ab\u008b\u0018E\u0019:\u00afvb,\u00a95,g\u0083\u0017\u0081i\u00ef\u00f7\u00e4\u00c29q\t\u0097\u009b\u0018\u0081\"Q\u0098\u00dc\u000f.\u00f1\u0017Ur\u00ce8W\u00c8j3\u00c0j\u00b9\u0089p\u00a2\u0080\u0010\u009e\u00b5\u0015\u00c0.Pr\u00e4\u00ce\u00a4I\u001e5.we \u00ac\u00c2\u00a8\u00ee\u0003i\u00c1\u00f9\u00b9\u009f\u0014\u008b\u00f5\u00160\u009f&\u00ea;\u0098\u0095\u00e9p\u0096_3d\u001aQ\u00aa\u00c30\u0010\u0001\u00cfo\u00a3\u00f8\u00dc\u0088\u00e5\u009e\b\u0093o\u00b2\u0087u\u00ec\u0010 \u00c1\u00a7;\u009f}\u000eg\n\u00c8\u001eAO\u0082{\u008a\u0010\u0098E\u009bT}i\u00ea\u00a3\u00c8q\r\u00e7\u00c7\bp\u00ca\u0010\u0014+G\u0005\u00a4\u00b4X~\u001b\u00c9lKz?\u0082 \u0010\u00c7\u0080\u00aa\u00f1\u008e\u00ffg\u0006'\u00dc\u0088zJ%\u00ef\u00e8\u0010m\u0000\u00f0i\u00b5\u00165\u00bdX\u0094\u0097U#\r\u001bR k\u00e6\u00ddD(\u0092\u00b4;\u0000\u009e\u00bf\u00a7\u00f1\u00a3\u0081\u00ecJ\u00aa\u00d7\u00d3\u0083\u0098H\u00f2\u0010\u00ad\nn/\u00ad\fK\u0018\u0004\u00f3\u0004\u0098\u00b4.\u00deh\u00beT\u0011\u00feO\u00f8!\u008f\u0017\u00ea\u00d5v\u00195\\\u00a5\u0010\u00f0\u00a6\u00dcZS\u001d|\u007f\u0086\u00e7\u00feh\u00c4[|\u009b\u0010\u0005_\u0010\u001eIX\u00e0\u00be7\u00e6\u008e\u00d3\u00a9\\\u0018I\u00185iI\u00c5\b\u00d8\u00ad\u001f\u00dfZ\u00f6|(c\u00c7\u00a0_\u00a4\u00f8\nU\u00c8\u0012\u00a1\u00181\u00b4[\u0002\u0000\u00c34eu\u001f\u00d2A\u00d3\u0003r\b\u009by\u00bau\u00ef\n\u00e3\u00bc\u00106ZENes\u00b3e2Hc\u008ak\u00b3\u00cf\\ \u00f0\u00a6\u00dcZS\u001d|\u007f\u00e1S:\u00e6\u00a2\u00a1|\u00ceK\u00be\u00cd\u0087\u00b5K\u008ccm\u00d0xl\u0098\u0092\u00f6\u0098\u0010\"\u00cb\u00f9\n`\bL\u001d\u00af\u00d0,\u001am\u009e\u00f5\u0085\u0010\u0005\u0083\u00bf\u00d9\u00dc\u0011\u009fw\u00f9\u009e\u0014\u00aa\u00c5\u0080\u00e2\u009d\u0018\u00d8 _>\u00f7i)\u001f\u00a7\u00bf\u00bb\u00bd\u0002\f\u00b0\u0010]{\u0006m\u00a5\u00d0G.".length();
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
                            var11_3[var17_4++] = CP_ij.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "B$\u00a1\u00c8JD^\u00a4\u00b0\u00d3d\u00df\\\u0098\u00ef\u008a\u0010\u00c3%\u0099\u001f3\u0099j\u0011d\u00ab9\u0082Hu\u00f1\u00fc";
                            var18_6 = "B$\u00a1\u00c8JD^\u00a4\u00b0\u00d3d\u00df\\\u0098\u00ef\u008a\u0010\u00c3%\u0099\u001f3\u0099j\u0011d\u00ab9\u0082Hu\u00f1\u00fc".length();
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
                            var11_3[var17_4++] = CP_ij.a(var19_9).intern();
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
                CP_ij.d = new HashMap<K, V>(13);
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
                var4_14 = "\u00a4C\u00b0m\u008cEl\u00c8\u001d\u00caw\u00e3W\ru\u00d1&}\u00c2\u00db\u00b4E\u00fd#\u001e;\u00faz\u0011m\u00da\u0088+s_\u00b1\u0003R\u00e1\r\u00d2\u0099<\u00933\"\u00e5\n\u001bk\u00b5H\u0018\u00a4\u00aa\u008a\u00a6\u0015\u00a2m\u00b6X\u00f2\u00f1i\u0097<$\u00c3V\u00dc\u00f02\u009dZ\u00da\u00a6\u00eb\u0096\u001a\u00cf~\u00f2\u00d7\u0004qT\u0002/\u0083\u0000\u00eb\u00f1\u0013XY\u00d8\u00cb\u00e5\u008e\u00fcE<\u00b9\u00d1\u00ce\u00fc\u00cf\u00f6\u00da\u0085\u00c1\u0099\u0097\u0092n'\u0016a\u00bbd\u0087\u0014\u00e6\u00c4iB\u00be\n\u00a2\u00f8\u001e\u00da\u00ad2\u0010\u00ad8\u00bbW\u00db\u009b\u00dd\n:\u00e0\u0096\u0091\u00d0\u00fe;\u00ee\u000b\u00d6,A\u00e02CZ__\u008cH\u00cb\u0092-^\u00b7F\u00ff\u0087\u00bc\u00a8&Y* H\u00cf\u0080\u00aa6\u00b8\u0002\u0014\u00d3\u00a9\u00f3\u00e9J\u00a99\u00f1\u001e$\u008f\r\u0095f\u00e7\"\u009a\u00fdS\u00ae\u00c4.\u0015q5*Q\u00f8\u0001\u00fd\u00bc\u00ea\u009a~t\u00a4\u00acw\u00da%\u001e\u00d1r\u008e0P#\u00a6\u00cb6=\u00eb\u00ce\u00ad<\u0005[_\u00caG\u00ff1\u00b9/p\u008a\u00b4^\u008dC\u00db\u00ef\u0016d\u001a\u0085\u00bc*e\u00c9\u00ac\u0016y\u0018N!\u0086\u00b2M\u009d\"24&[z.\u00bc\u00ca\u00e8\u00e5#\u000fP\u00b0\u009a\u00d4\u00a3\bj\u00cd\u00a5\u0089\u0004n\u0090\\\u000bf\u00e1\u00bb\u00ed\u0007\u00b7\u0011\u001e\u00d0\u0005\u00cc\u00b4\u0083m\n\u0015F\u0012RO\u00b7z\u00e3\u00ff\u0011u[\u00a3\u0080\u0086\u0019uPF\u0083e[\u008ba\u00b1\u00d1\u0085\u00cd\u00f6Ux\u00b7!\u00b1\u00b2\u0007\\\u0081\u00cf\u0096\u00d4wd\u00e9\u00f0\u00c2Z\u0092l\u00bc\u00b4\u009a\u0011\u00c7\u0001g\u00f4(b\u0003U|Ty\u0086\u00e3\u001b\u00f2\u00c1\u00ce\u00ac\u009cJ\u0086\u009b\u00acg(Kq\u00a7\u00e1\u007fEb\u00d9\u001a(\u00b0W\u0091\u0086\u0082i\bz\u00c5\u00b4\u00bc\"\u0098\u00e7o\u0093\u0089j\u00c4\u00c4&\u0001\u00dfG\u00f3\u00bf\u00f9u'Z\u0085EI\u00f4\u00dc\u0080\u0083\u00a7\u00f3\f\u00a8dVZ*\u001d\u00c3H\u009fz\u00a5\u0015s\u0012\u00b5aXL\u00ee\u00b1\u0017\u00f4\u00c9n\u00f7K\u00b5\u00e7\u0002\u00f4;\u00b2\u0095\u00e9b\u00b0\tI\u00f8\u0080<\u00072\u000f\u00e2\u0002\u00bc\u00ebU,\u0086\u009d\u00015K\u00eb!TX)B[\u00f3\u0081\b\u00bc{\u0006<\u00b9\u00d1\u00aa\u00ec\u008d*\u0084\u00e3\u00c5\"q\u00fcv\u00d6'\u00eb\u00b2>\u00ab\u00bbO9\u00c2Q\u0015Vr\u00de)\u00cb\u00b8\u007f\u00a9\u00cf\u00c6\u00cc\u0003\u00c5\u001f1v\u007f\u00b1\u00eeu\u00bb\u00b76\u0000\u00f0\u00f3\u0084\u00b5\u00a5\u0007\u008cH<|E\u00d9y*\u0018\u00c3\u00a5Q\u00c3\u00d3w.'\u00d0\u0094\u00ab\u0001\u009c\u00a9\u00d5\u00ed\u00b7\u0011J\u00a6\u0080dFq\u0019bL%\u00cc\u00c3\u00c8)\u0080\u0093\u00baCMJ\u00bf\u00fd\u00d70\u00b0w\u00ee\r\u00b0\u0018n\u0007\u0099E";
                var5_15 = "\u00a4C\u00b0m\u008cEl\u00c8\u001d\u00caw\u00e3W\ru\u00d1&}\u00c2\u00db\u00b4E\u00fd#\u001e;\u00faz\u0011m\u00da\u0088+s_\u00b1\u0003R\u00e1\r\u00d2\u0099<\u00933\"\u00e5\n\u001bk\u00b5H\u0018\u00a4\u00aa\u008a\u00a6\u0015\u00a2m\u00b6X\u00f2\u00f1i\u0097<$\u00c3V\u00dc\u00f02\u009dZ\u00da\u00a6\u00eb\u0096\u001a\u00cf~\u00f2\u00d7\u0004qT\u0002/\u0083\u0000\u00eb\u00f1\u0013XY\u00d8\u00cb\u00e5\u008e\u00fcE<\u00b9\u00d1\u00ce\u00fc\u00cf\u00f6\u00da\u0085\u00c1\u0099\u0097\u0092n'\u0016a\u00bbd\u0087\u0014\u00e6\u00c4iB\u00be\n\u00a2\u00f8\u001e\u00da\u00ad2\u0010\u00ad8\u00bbW\u00db\u009b\u00dd\n:\u00e0\u0096\u0091\u00d0\u00fe;\u00ee\u000b\u00d6,A\u00e02CZ__\u008cH\u00cb\u0092-^\u00b7F\u00ff\u0087\u00bc\u00a8&Y* H\u00cf\u0080\u00aa6\u00b8\u0002\u0014\u00d3\u00a9\u00f3\u00e9J\u00a99\u00f1\u001e$\u008f\r\u0095f\u00e7\"\u009a\u00fdS\u00ae\u00c4.\u0015q5*Q\u00f8\u0001\u00fd\u00bc\u00ea\u009a~t\u00a4\u00acw\u00da%\u001e\u00d1r\u008e0P#\u00a6\u00cb6=\u00eb\u00ce\u00ad<\u0005[_\u00caG\u00ff1\u00b9/p\u008a\u00b4^\u008dC\u00db\u00ef\u0016d\u001a\u0085\u00bc*e\u00c9\u00ac\u0016y\u0018N!\u0086\u00b2M\u009d\"24&[z.\u00bc\u00ca\u00e8\u00e5#\u000fP\u00b0\u009a\u00d4\u00a3\bj\u00cd\u00a5\u0089\u0004n\u0090\\\u000bf\u00e1\u00bb\u00ed\u0007\u00b7\u0011\u001e\u00d0\u0005\u00cc\u00b4\u0083m\n\u0015F\u0012RO\u00b7z\u00e3\u00ff\u0011u[\u00a3\u0080\u0086\u0019uPF\u0083e[\u008ba\u00b1\u00d1\u0085\u00cd\u00f6Ux\u00b7!\u00b1\u00b2\u0007\\\u0081\u00cf\u0096\u00d4wd\u00e9\u00f0\u00c2Z\u0092l\u00bc\u00b4\u009a\u0011\u00c7\u0001g\u00f4(b\u0003U|Ty\u0086\u00e3\u001b\u00f2\u00c1\u00ce\u00ac\u009cJ\u0086\u009b\u00acg(Kq\u00a7\u00e1\u007fEb\u00d9\u001a(\u00b0W\u0091\u0086\u0082i\bz\u00c5\u00b4\u00bc\"\u0098\u00e7o\u0093\u0089j\u00c4\u00c4&\u0001\u00dfG\u00f3\u00bf\u00f9u'Z\u0085EI\u00f4\u00dc\u0080\u0083\u00a7\u00f3\f\u00a8dVZ*\u001d\u00c3H\u009fz\u00a5\u0015s\u0012\u00b5aXL\u00ee\u00b1\u0017\u00f4\u00c9n\u00f7K\u00b5\u00e7\u0002\u00f4;\u00b2\u0095\u00e9b\u00b0\tI\u00f8\u0080<\u00072\u000f\u00e2\u0002\u00bc\u00ebU,\u0086\u009d\u00015K\u00eb!TX)B[\u00f3\u0081\b\u00bc{\u0006<\u00b9\u00d1\u00aa\u00ec\u008d*\u0084\u00e3\u00c5\"q\u00fcv\u00d6'\u00eb\u00b2>\u00ab\u00bbO9\u00c2Q\u0015Vr\u00de)\u00cb\u00b8\u007f\u00a9\u00cf\u00c6\u00cc\u0003\u00c5\u001f1v\u007f\u00b1\u00eeu\u00bb\u00b76\u0000\u00f0\u00f3\u0084\u00b5\u00a5\u0007\u008cH<|E\u00d9y*\u0018\u00c3\u00a5Q\u00c3\u00d3w.'\u00d0\u0094\u00ab\u0001\u009c\u00a9\u00d5\u00ed\u00b7\u0011J\u00a6\u0080dFq\u0019bL%\u00cc\u00c3\u00c8)\u0080\u0093\u00baCMJ\u00bf\u00fd\u00d70\u00b0w\u00ee\r\u00b0\u0018n\u0007\u0099E".length();
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
                    var4_14 = "\fPB\u00f6\u00b3{\u0003\u00e0?\u0001\u00d8\u0081b\r\u0017r";
                    var5_15 = "\fPB\u00f6\u00b3{\u0003\u00e0?\u0001\u00d8\u0081b\r\u0017r".length();
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
        CP_ij.b = var6_12;
        CP_ij.c = new Integer[81];
        CP_ij.TELEPORT_CONFIRM = new CP_ij();
        CP_ij.QUERY_BLOCK_NBT = new CP_ij();
        CP_ij.SET_DIFFICULTY = new CP_ij();
        CP_ij.CHAT_MESSAGE = new CP_ij();
        CP_ij.CLIENT_STATUS = new CP_ij();
        CP_ij.CLIENT_SETTINGS = new CP_ij();
        CP_ij.TAB_COMPLETE = new CP_ij();
        CP_ij.WINDOW_CONFIRMATION = new CP_ij();
        CP_ij.CLICK_WINDOW_BUTTON = new CP_ij();
        CP_ij.CLICK_WINDOW = new CP_ij();
        CP_ij.CLOSE_WINDOW = new CP_ij();
        CP_ij.PLUGIN_MESSAGE = new CP_ij();
        CP_ij.EDIT_BOOK = new CP_ij();
        CP_ij.QUERY_ENTITY_NBT = new CP_ij();
        CP_ij.INTERACT_ENTITY = new CP_ij();
        CP_ij.KEEP_ALIVE = new CP_ij();
        CP_ij.LOCK_DIFFICULTY = new CP_ij();
        CP_ij.PLAYER_POSITION = new CP_ij();
        CP_ij.PLAYER_POSITION_AND_ROTATION = new CP_ij();
        CP_ij.PLAYER_ROTATION = new CP_ij();
        CP_ij.PLAYER_FLYING = new CP_ij();
        CP_ij.VEHICLE_MOVE = new CP_ij();
        CP_ij.STEER_BOAT = new CP_ij();
        CP_ij.PICK_ITEM = new CP_ij();
        CP_ij.CRAFT_RECIPE_REQUEST = new CP_ij();
        CP_ij.PLAYER_ABILITIES = new CP_ij();
        CP_ij.PLAYER_DIGGING = new CP_ij();
        CP_ij.ENTITY_ACTION = new CP_ij();
        CP_ij.STEER_VEHICLE = new CP_ij();
        CP_ij.RECIPE_BOOK_DATA = new CP_ij();
        CP_ij.NAME_ITEM = new CP_ij();
        CP_ij.RESOURCE_PACK_STATUS = new CP_ij();
        CP_ij.ADVANCEMENT_TAB = new CP_ij();
        CP_ij.SELECT_TRADE = new CP_ij();
        CP_ij.SET_BEACON_EFFECT = new CP_ij();
        CP_ij.HELD_ITEM_CHANGE = new CP_ij();
        CP_ij.UPDATE_COMMAND_BLOCK = new CP_ij();
        CP_ij.UPDATE_COMMAND_BLOCK_MINECART = new CP_ij();
        CP_ij.CREATIVE_INVENTORY_ACTION = new CP_ij();
        CP_ij.UPDATE_JIGSAW_BLOCK = new CP_ij();
        CP_ij.UPDATE_STRUCTURE_BLOCK = new CP_ij();
        CP_ij.UPDATE_SIGN = new CP_ij();
        CP_ij.ANIMATION = new CP_ij();
        CP_ij.SPECTATE = new CP_ij();
        CP_ij.PLAYER_BLOCK_PLACEMENT = new CP_ij();
        CP_ij.USE_ITEM = new CP_ij();
        CP_ij.CP_o = CP_ij.CP_l();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4AE5;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_ij", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_ij.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_ij.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_ij" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_ij.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

