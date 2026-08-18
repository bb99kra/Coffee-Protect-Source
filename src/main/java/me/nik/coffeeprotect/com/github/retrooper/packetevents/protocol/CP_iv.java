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

public final class CP_iv
extends Enum<CP_iv> {
    public static final /* enum */ CP_iv TELEPORT_CONFIRM;
    public static final /* enum */ CP_iv QUERY_BLOCK_NBT;
    public static final /* enum */ CP_iv SET_DIFFICULTY;
    public static final /* enum */ CP_iv CHAT_ACK;
    public static final /* enum */ CP_iv CHAT_COMMAND;
    public static final /* enum */ CP_iv CHAT_MESSAGE;
    public static final /* enum */ CP_iv CHAT_SESSION_UPDATE;
    public static final /* enum */ CP_iv CHUNK_BATCH_ACK;
    public static final /* enum */ CP_iv CLIENT_STATUS;
    public static final /* enum */ CP_iv CLIENT_SETTINGS;
    public static final /* enum */ CP_iv TAB_COMPLETE;
    public static final /* enum */ CP_iv CONFIGURATION_ACK;
    public static final /* enum */ CP_iv CLICK_WINDOW_BUTTON;
    public static final /* enum */ CP_iv CLICK_WINDOW;
    public static final /* enum */ CP_iv CLOSE_WINDOW;
    public static final /* enum */ CP_iv PLUGIN_MESSAGE;
    public static final /* enum */ CP_iv EDIT_BOOK;
    public static final /* enum */ CP_iv QUERY_ENTITY_NBT;
    public static final /* enum */ CP_iv INTERACT_ENTITY;
    public static final /* enum */ CP_iv GENERATE_STRUCTURE;
    public static final /* enum */ CP_iv KEEP_ALIVE;
    public static final /* enum */ CP_iv LOCK_DIFFICULTY;
    public static final /* enum */ CP_iv PLAYER_POSITION;
    public static final /* enum */ CP_iv PLAYER_POSITION_AND_ROTATION;
    public static final /* enum */ CP_iv PLAYER_ROTATION;
    public static final /* enum */ CP_iv PLAYER_FLYING;
    public static final /* enum */ CP_iv VEHICLE_MOVE;
    public static final /* enum */ CP_iv STEER_BOAT;
    public static final /* enum */ CP_iv PICK_ITEM;
    public static final /* enum */ CP_iv DEBUG_PING;
    public static final /* enum */ CP_iv CRAFT_RECIPE_REQUEST;
    public static final /* enum */ CP_iv PLAYER_ABILITIES;
    public static final /* enum */ CP_iv PLAYER_DIGGING;
    public static final /* enum */ CP_iv ENTITY_ACTION;
    public static final /* enum */ CP_iv STEER_VEHICLE;
    public static final /* enum */ CP_iv PONG;
    public static final /* enum */ CP_iv SET_RECIPE_BOOK_STATE;
    public static final /* enum */ CP_iv SET_DISPLAYED_RECIPE;
    public static final /* enum */ CP_iv NAME_ITEM;
    public static final /* enum */ CP_iv RESOURCE_PACK_STATUS;
    public static final /* enum */ CP_iv ADVANCEMENT_TAB;
    public static final /* enum */ CP_iv SELECT_TRADE;
    public static final /* enum */ CP_iv SET_BEACON_EFFECT;
    public static final /* enum */ CP_iv HELD_ITEM_CHANGE;
    public static final /* enum */ CP_iv UPDATE_COMMAND_BLOCK;
    public static final /* enum */ CP_iv UPDATE_COMMAND_BLOCK_MINECART;
    public static final /* enum */ CP_iv CREATIVE_INVENTORY_ACTION;
    public static final /* enum */ CP_iv UPDATE_JIGSAW_BLOCK;
    public static final /* enum */ CP_iv UPDATE_STRUCTURE_BLOCK;
    public static final /* enum */ CP_iv UPDATE_SIGN;
    public static final /* enum */ CP_iv ANIMATION;
    public static final /* enum */ CP_iv SPECTATE;
    public static final /* enum */ CP_iv PLAYER_BLOCK_PLACEMENT;
    public static final /* enum */ CP_iv USE_ITEM;
    private static final /* synthetic */ CP_iv[] CP_U;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_iv[] values() {
        return (CP_iv[])CP_U.clone();
    }

    public static CP_iv valueOf(String string) {
        return Enum.valueOf(CP_iv.class, string);
    }

    private static /* synthetic */ CP_iv[] CP_u() {
        long l = a ^ 0x2CC7D743E2D6L;
        CP_iv[] ilIlivArray = new CP_iv[CP_iv.a("v", (int)3547, (long)(0x67F9964CFEB9CEB7L ^ l))];
        ilIlivArray[0] = TELEPORT_CONFIRM;
        ilIlivArray[1] = QUERY_BLOCK_NBT;
        ilIlivArray[2] = SET_DIFFICULTY;
        ilIlivArray[3] = CHAT_ACK;
        ilIlivArray[4] = CHAT_COMMAND;
        ilIlivArray[5] = CHAT_MESSAGE;
        ilIlivArray[CP_iv.a("v", (int)9719, (long)(0x164987139175669DL ^ l))] = CHAT_SESSION_UPDATE;
        ilIlivArray[CP_iv.a("v", (int)22895, (long)(0xDFD7DF414029A3FL ^ l))] = CHUNK_BATCH_ACK;
        ilIlivArray[CP_iv.a("v", (int)12373, (long)(0x7C9099F62F04737BL ^ l))] = CLIENT_STATUS;
        ilIlivArray[CP_iv.a("v", (int)23177, (long)(0x11662C76FB7419F0L ^ l))] = CLIENT_SETTINGS;
        ilIlivArray[CP_iv.a("v", (int)22654, (long)(0x7DE0894A5D691B2CL ^ l))] = TAB_COMPLETE;
        ilIlivArray[CP_iv.a("v", (int)27976, (long)(0x7065A2E353512E6BL ^ l))] = CONFIGURATION_ACK;
        ilIlivArray[CP_iv.a("v", (int)22952, (long)(0x4E2288EBC46E1ADEL ^ l))] = CLICK_WINDOW_BUTTON;
        ilIlivArray[CP_iv.a("v", (int)10221, (long)(0x4B1E4CB1834264BEL ^ l))] = CLICK_WINDOW;
        ilIlivArray[CP_iv.a("v", (int)7421, (long)(0x11DCB0EFEE005F9DL ^ l))] = CLOSE_WINDOW;
        ilIlivArray[CP_iv.a("v", (int)13992, (long)(0x58B52BBD483BF59AL ^ l))] = PLUGIN_MESSAGE;
        ilIlivArray[CP_iv.a("v", (int)3753, (long)(0x370E63734233CD92L ^ l))] = EDIT_BOOK;
        ilIlivArray[CP_iv.a("v", (int)14822, (long)(0x1E838C0279A27AA5L ^ l))] = QUERY_ENTITY_NBT;
        ilIlivArray[CP_iv.a("v", (int)23841, (long)(0x641C3B9DA7359E0CL ^ l))] = INTERACT_ENTITY;
        ilIlivArray[CP_iv.a("v", (int)30745, (long)(0x37DEA9C6AFDFBB4CL ^ l))] = GENERATE_STRUCTURE;
        ilIlivArray[CP_iv.a("v", (int)14019, (long)(0x60491F14B9EF5AEL ^ l))] = KEEP_ALIVE;
        ilIlivArray[CP_iv.a("v", (int)22541, (long)(0x6146FE4EC7D79B6BL ^ l))] = LOCK_DIFFICULTY;
        ilIlivArray[CP_iv.a("v", (int)13122, (long)(0x6D7DFE5401CBF00AL ^ l))] = PLAYER_POSITION;
        ilIlivArray[CP_iv.a("v", (int)22048, (long)(0x2C6F64DE08011514L ^ l))] = PLAYER_POSITION_AND_ROTATION;
        ilIlivArray[CP_iv.a("v", (int)25337, (long)(0x8C531F80692A1D0L ^ l))] = PLAYER_ROTATION;
        ilIlivArray[CP_iv.a("v", (int)4227, (long)(0x7821F9C6E531D3F6L ^ l))] = PLAYER_FLYING;
        ilIlivArray[CP_iv.a("v", (int)30022, (long)(0x4BB4F61059E8B63AL ^ l))] = VEHICLE_MOVE;
        ilIlivArray[CP_iv.a("v", (int)20776, (long)(0x34BFC7B8BA20120CL ^ l))] = STEER_BOAT;
        ilIlivArray[CP_iv.a("v", (int)18067, (long)(0xF16D038CE5085ABL ^ l))] = PICK_ITEM;
        ilIlivArray[CP_iv.a("v", (int)24825, (long)(0x74DCE89D3AFC23AEL ^ l))] = DEBUG_PING;
        ilIlivArray[CP_iv.a("v", (int)2277, (long)(0x4B759AA4F1BE4BA1L ^ l))] = CRAFT_RECIPE_REQUEST;
        ilIlivArray[CP_iv.a("v", (int)31757, (long)(0x21C76D1450E1BF72L ^ l))] = PLAYER_ABILITIES;
        ilIlivArray[CP_iv.a("v", (int)31452, (long)(0x694990123C083991L ^ l))] = PLAYER_DIGGING;
        ilIlivArray[CP_iv.a("v", (int)7477, (long)(0x78504A0675F75E7FL ^ l))] = ENTITY_ACTION;
        ilIlivArray[CP_iv.a("v", (int)31457, (long)(0x5EFAA83E4496B9B5L ^ l))] = STEER_VEHICLE;
        ilIlivArray[CP_iv.a("v", (int)24152, (long)(0x515904CA75A51D03L ^ l))] = PONG;
        ilIlivArray[CP_iv.a("v", (int)11150, (long)(0x6699E17E1DF368F6L ^ l))] = SET_RECIPE_BOOK_STATE;
        ilIlivArray[CP_iv.a("v", (int)14092, (long)(0x79A1BEB03588744BL ^ l))] = SET_DISPLAYED_RECIPE;
        ilIlivArray[CP_iv.a("v", (int)13441, (long)(0x3DFD312DBE8B77DDL ^ l))] = NAME_ITEM;
        ilIlivArray[CP_iv.a("v", (int)4957, (long)(0x57C9503F24C5075L ^ l))] = RESOURCE_PACK_STATUS;
        ilIlivArray[CP_iv.a("v", (int)15586, (long)(0x14AE86AF63D0FFADL ^ l))] = ADVANCEMENT_TAB;
        ilIlivArray[CP_iv.a("v", (int)27002, (long)(0x508AED6355E2AA49L ^ l))] = SELECT_TRADE;
        ilIlivArray[CP_iv.a("v", (int)14029, (long)(0x214F0DFFB2CFF5F4L ^ l))] = SET_BEACON_EFFECT;
        ilIlivArray[CP_iv.a("v", (int)22560, (long)(0x17097DD926D71B17L ^ l))] = HELD_ITEM_CHANGE;
        ilIlivArray[CP_iv.a("v", (int)10913, (long)(0x67D0FCCDF91FE9C9L ^ l))] = UPDATE_COMMAND_BLOCK;
        ilIlivArray[CP_iv.a("v", (int)14402, (long)(0x43386ACB10087B1BL ^ l))] = UPDATE_COMMAND_BLOCK_MINECART;
        ilIlivArray[CP_iv.a("v", (int)23162, (long)(0x151764B02115991DL ^ l))] = CREATIVE_INVENTORY_ACTION;
        ilIlivArray[CP_iv.a("v", (int)24498, (long)(0x3EBEF0E081CE1CEAL ^ l))] = UPDATE_JIGSAW_BLOCK;
        ilIlivArray[CP_iv.a("v", (int)24508, (long)(0x1859B1F4C4B09CC8L ^ l))] = UPDATE_STRUCTURE_BLOCK;
        ilIlivArray[CP_iv.a("v", (int)7615, (long)(0x232897D39788DEEEL ^ l))] = UPDATE_SIGN;
        ilIlivArray[CP_iv.a("v", (int)20391, (long)(0x628BE86F135D8C81L ^ l))] = ANIMATION;
        ilIlivArray[CP_iv.a("v", (int)26655, (long)(0x799D17387D5CAB5FL ^ l))] = SPECTATE;
        ilIlivArray[CP_iv.a("v", (int)23452, (long)(0x163B02BF721D18A1L ^ l))] = PLAYER_BLOCK_PLACEMENT;
        ilIlivArray[CP_iv.a("v", (int)30074, (long)(0x41727E1300E9B633L ^ l))] = USE_ITEM;
        return ilIlivArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_iv.a = CP_s.a(-9192607748320842748L, -2236331216271177831L, MethodHandles.lookup().lookupClass()).a(157770206576408L);
                        var20 = CP_iv.a ^ 46144394738481L;
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
                        var11_3 = new String[54];
                        var17_4 = 0;
                        var16_5 = "\u00a4\u00d3\u00d5\u00ce\\O\u00b1\u0093v1\u0088\u00e0T\u00ad\u00f3\u00c5\u0018Lg3\u00d5@\u0087\u007f\u0083\u0007\u00a6 \u00aa\u00c3\u0098\u00906\u00f1\u00e89\u00a9bO\u00eb;\u0010\u0081\u00cb@\u008e\u00a4\u00fb9|\u00d8\u00e3fF\u00df\u00a1\u00f8\u00a1\u0010\u000b\u00e9\b\u00d0f\u00f4\u001f\u0090\u00a4\u000b\u00bc0~46\u0092\u0010\u00e3\u0088\u00d7\u0002\u00f7e`\\v\u00c8\u00df\u009d+P_b\u0018\u009a-$18\u00ccy\u00a7\u0095n\u00bf|\u0095~fL\u0095\u000e\u008e\u009d\u00c7\u0012\u009b\u00ac\u0010\u0007B\u00df\u00b7\u00eaSN\u0011m\u008b\u00c6w4\u0012{\u00da\u0010\u0098\u0019\u0080\u00e4\n\u00f1\u00c5\u009c\u00e2\u00ea\u00b5\u009e\u001f\u00823\u0098\u0018&\u00c6MF\u000bF\u0093\u0007_\u0080\u00b3\u00fd\u0006\u00f75A\u00c4n\u00e0B\u00c6\u00c1)/\u0010\u00dc\u00a4I:\u00a2\u00a6\u00bd\u00a6U\u00c6*\r\u00d24&\u00c7\u0010oV\u0019\u00ee\u001f\u00e6\u00eb\u0096\u0002W\u00c2\u00b5\u00c35\u008c\u0094\u0018_rB\u00b0`'\u00c7E\u001b\u0081<\u00c2\u00f9\u009e,s\u008f\u001e\u0090\u00b7@j\u0084\u00aa\u0010\u0014KgU\u00c0\nk\u0006\u00ae\u00aepj\u00a8\u00c4S\u001d\u0018B\u00ef\u0097e\u00d5\u00a3\u00cb\u00c9\u00b8\u009d\u00b5\u00d4\u00d0\u00ca\u00a0_\u0000\u0094\u001a\u0017\u00ceO\u0089\u00d1\u0018\u00f9\u00c4\u00e4Es\u0082\u00ff\u0007\u000fM\u0010\u0082s'\u00adA,\u0083\u00ceT\u00cb\u0014\u00a4]\u0018\u00b1\u008e\u0015\u00b1l\u0084/\u00ef\u00f5\u001a\u00de\u00df\u00a2\u00de\u00e5\u0002\u00df\u00bf\r:\u00c2\u008fv\u00ac\u0010^?\u00fd\u0018\u0093H\u00cb\u0087\u0003>rg\u008b\u00daM\u00a6\u0018\u00ea\u00b4\u0084\u00a6\"\u00b4\u000f\u0093\u00ad?H\u008d\u00d3\u000f\u00bc\u00d5u\u0093\u00c5r1\u0001r\u00ba\u00109o\u00ae\u00b5\u00fd\u009b\t\u000f\u00b2\u0093\u00c0\u00ad\u00e8Z\u0083[\u0010\u0013\u0011\u00c7\u00ff:\u00bc\u00cd\u00ca\n\u00d5m\u00c8\u00c23O\u00fc\u0018\u008f\u009f\u00fa\u0002#\u00dc>\u00e7!\u00feu\u0088e*\u00d0z\u00b9K~\u00ce1\u00b0\u00a8A\u0010\u00cc\u007f\"\u00da\u00ae\u0097i\u0013_\u00ee\u0098x\u009a2\u00bc\u00ed\u0018>\u00e0Y\f\u00b3E\u00f1\u001e\u00b2\u001c\u00cf\u0001\u0001\f\u00d6\u001bt!x\u00af\u00cc\u00bfl\u00c1\u0010\u0086\u009e\u000e\u00dd\u00fdW1\u0003\u0019\u009d\u00d7\u00b5\u00c7\u007f\u00ad\u00ce\u0018?\r\u000echy1\u00ecF\u00ec\u00c53U&A\u008f\u00c9\u001e^\u0094\u00fc5\b\u0083\u0010\u0081\u00cb@\u008e\u00a4\u00fb9|`\u00e5\u0006G|qa/\u0010e \u0012\u00delA\u00cff7\u00eb\u00d1\u00b0.W}\u00ad\u0010\u0083\u00cd.W\u0093\u001d\u00a6\u0006\u00b2\u0099O\u00a6\f+\u00d6\u00de\u0010\u00b1\u008e\u0015\u00b1l\u0084/\u00ef\u009e\u0091\n\u0018VL\u00e7\u000e\u0010\u00b0f+\u00e5\u00a5\u0091g\u009f\u00a5\u00fd\u009bq\u0087\u001e.m\bdNXtX\u00aeY\u00be\u0010\u000b\u00f7\u00e57=K\u00c8k\"#1\u00a3\u00b18\u0001\u00d1\u0010\u00da\u00c4v\u00f9\u00a8#\u0016u\u00ac\u00a5\u00f4\u0002\u0099\u00dd\u00ec\u0014\u0010{\u00a7\u0019g\u00f8;\u00a0U\u001e\u00e0\u00fa\u00bdL}\u00d9\u00a4\u0018\u00efj^\r\u00d9\u0017\u00e1\u001b)\u0087\u00ecq6dg\u0012 B\u00b1\u00ec\u0015,\u00a16\u0018\u00812\u00ddx\t\\\u0092Tpi0\u00b5\u00f6\u001a\u00c1\u0016C\u00abV#6\u00da\u00dd6\u0010\u0006\u00a4\u0015H\u0017\fX\u0080\u00edHf \u00eb\u0007C\u00ca \u00c8\u00f6z\u0080\u007f<\u00fa\u001b\u0005\u0085@\u00fe<\u00ff\u00ec\u00d4}\u00dc\u0081N\n\u00b5\u00c9\u00cb\u00c4\u0092r\u00fc\u0095hE\u00fb \u0088+\u00b6+\u00d2\u00cb%\u00fbU\u00a7:\u00c6\u009e\u0088\u00ben\u00a7w9\u0089\u0019\u00e6^\u00ac$\u00bbX\u0011\u00f31{G\u0010\u00d4J\u0088;Z;\u00ee\u001aQ\r\u00c1\u00e3\u0014\u00f7o\u0019\u0010\u00c1?W\u00c5\u0014\u00f0\u00f6Y\u00e4\u00ec\u009e\u00d6,K\r\u00a6\u0010&\u00cf\u0006\u0081W\u00e1\u000e\u0089\u00ad;Q?8\u00f4\u00a73\u0018q\u001f\u00bc\r\fe\u00d61(?\u00f7\u001e8\u0019SMTm\b\u009e\u00ef3\u00c0\u00f9 \u00da\u00c4v\u00f9\u00a8#\u0016u,\u009cM\u00c9\u00d7\u00f0\u00fb(I\u0011\u0006t\u00ac\u0099\u0014\u0002\u00e8\u00e5\u009c\u00bcs,\u001b\u0000\u0010zNR\u001d<\u00c32kbo9e\u0019O\u00e2\u00a4\u0010\u00aa\u0085\u00882*\u00b6\u009dG\u0081}J\u0000\u008c\u0082\u00cf\u0000\u0010V|\u00a24\u008f\u00e9j\u00bc\u00e8\u00c6\u00b57<\u00c1\u00e7\u0007\u0010\u0093\u00db\u008dR\u00a6 \u00a5\u00c7;-\u0098{\u0013<\u0081k\u0010\u00d6)\u000fZ\u00e0_\u00ea\u00d5[\u00acbu\u0013\u00df\u0095\u0096\u0010\u00ec\u0012\u0098\u00dct\u00bbr\u00b38\u00c9\u00f3\u00d0\u008b\u0094\u00f5]\u0018e \u0012\u00delA\u00cff\u00c2hR\u00bb3Z\u00a0CU\u00cf\u000e\u0083W\u00e5\u00cb\u00a9\u0010Z\u00c3\u009a\u00ae_Z7A\u0013\u00bd\u0000\u00969\u00c5{V";
                        var18_6 = "\u00a4\u00d3\u00d5\u00ce\\O\u00b1\u0093v1\u0088\u00e0T\u00ad\u00f3\u00c5\u0018Lg3\u00d5@\u0087\u007f\u0083\u0007\u00a6 \u00aa\u00c3\u0098\u00906\u00f1\u00e89\u00a9bO\u00eb;\u0010\u0081\u00cb@\u008e\u00a4\u00fb9|\u00d8\u00e3fF\u00df\u00a1\u00f8\u00a1\u0010\u000b\u00e9\b\u00d0f\u00f4\u001f\u0090\u00a4\u000b\u00bc0~46\u0092\u0010\u00e3\u0088\u00d7\u0002\u00f7e`\\v\u00c8\u00df\u009d+P_b\u0018\u009a-$18\u00ccy\u00a7\u0095n\u00bf|\u0095~fL\u0095\u000e\u008e\u009d\u00c7\u0012\u009b\u00ac\u0010\u0007B\u00df\u00b7\u00eaSN\u0011m\u008b\u00c6w4\u0012{\u00da\u0010\u0098\u0019\u0080\u00e4\n\u00f1\u00c5\u009c\u00e2\u00ea\u00b5\u009e\u001f\u00823\u0098\u0018&\u00c6MF\u000bF\u0093\u0007_\u0080\u00b3\u00fd\u0006\u00f75A\u00c4n\u00e0B\u00c6\u00c1)/\u0010\u00dc\u00a4I:\u00a2\u00a6\u00bd\u00a6U\u00c6*\r\u00d24&\u00c7\u0010oV\u0019\u00ee\u001f\u00e6\u00eb\u0096\u0002W\u00c2\u00b5\u00c35\u008c\u0094\u0018_rB\u00b0`'\u00c7E\u001b\u0081<\u00c2\u00f9\u009e,s\u008f\u001e\u0090\u00b7@j\u0084\u00aa\u0010\u0014KgU\u00c0\nk\u0006\u00ae\u00aepj\u00a8\u00c4S\u001d\u0018B\u00ef\u0097e\u00d5\u00a3\u00cb\u00c9\u00b8\u009d\u00b5\u00d4\u00d0\u00ca\u00a0_\u0000\u0094\u001a\u0017\u00ceO\u0089\u00d1\u0018\u00f9\u00c4\u00e4Es\u0082\u00ff\u0007\u000fM\u0010\u0082s'\u00adA,\u0083\u00ceT\u00cb\u0014\u00a4]\u0018\u00b1\u008e\u0015\u00b1l\u0084/\u00ef\u00f5\u001a\u00de\u00df\u00a2\u00de\u00e5\u0002\u00df\u00bf\r:\u00c2\u008fv\u00ac\u0010^?\u00fd\u0018\u0093H\u00cb\u0087\u0003>rg\u008b\u00daM\u00a6\u0018\u00ea\u00b4\u0084\u00a6\"\u00b4\u000f\u0093\u00ad?H\u008d\u00d3\u000f\u00bc\u00d5u\u0093\u00c5r1\u0001r\u00ba\u00109o\u00ae\u00b5\u00fd\u009b\t\u000f\u00b2\u0093\u00c0\u00ad\u00e8Z\u0083[\u0010\u0013\u0011\u00c7\u00ff:\u00bc\u00cd\u00ca\n\u00d5m\u00c8\u00c23O\u00fc\u0018\u008f\u009f\u00fa\u0002#\u00dc>\u00e7!\u00feu\u0088e*\u00d0z\u00b9K~\u00ce1\u00b0\u00a8A\u0010\u00cc\u007f\"\u00da\u00ae\u0097i\u0013_\u00ee\u0098x\u009a2\u00bc\u00ed\u0018>\u00e0Y\f\u00b3E\u00f1\u001e\u00b2\u001c\u00cf\u0001\u0001\f\u00d6\u001bt!x\u00af\u00cc\u00bfl\u00c1\u0010\u0086\u009e\u000e\u00dd\u00fdW1\u0003\u0019\u009d\u00d7\u00b5\u00c7\u007f\u00ad\u00ce\u0018?\r\u000echy1\u00ecF\u00ec\u00c53U&A\u008f\u00c9\u001e^\u0094\u00fc5\b\u0083\u0010\u0081\u00cb@\u008e\u00a4\u00fb9|`\u00e5\u0006G|qa/\u0010e \u0012\u00delA\u00cff7\u00eb\u00d1\u00b0.W}\u00ad\u0010\u0083\u00cd.W\u0093\u001d\u00a6\u0006\u00b2\u0099O\u00a6\f+\u00d6\u00de\u0010\u00b1\u008e\u0015\u00b1l\u0084/\u00ef\u009e\u0091\n\u0018VL\u00e7\u000e\u0010\u00b0f+\u00e5\u00a5\u0091g\u009f\u00a5\u00fd\u009bq\u0087\u001e.m\bdNXtX\u00aeY\u00be\u0010\u000b\u00f7\u00e57=K\u00c8k\"#1\u00a3\u00b18\u0001\u00d1\u0010\u00da\u00c4v\u00f9\u00a8#\u0016u\u00ac\u00a5\u00f4\u0002\u0099\u00dd\u00ec\u0014\u0010{\u00a7\u0019g\u00f8;\u00a0U\u001e\u00e0\u00fa\u00bdL}\u00d9\u00a4\u0018\u00efj^\r\u00d9\u0017\u00e1\u001b)\u0087\u00ecq6dg\u0012 B\u00b1\u00ec\u0015,\u00a16\u0018\u00812\u00ddx\t\\\u0092Tpi0\u00b5\u00f6\u001a\u00c1\u0016C\u00abV#6\u00da\u00dd6\u0010\u0006\u00a4\u0015H\u0017\fX\u0080\u00edHf \u00eb\u0007C\u00ca \u00c8\u00f6z\u0080\u007f<\u00fa\u001b\u0005\u0085@\u00fe<\u00ff\u00ec\u00d4}\u00dc\u0081N\n\u00b5\u00c9\u00cb\u00c4\u0092r\u00fc\u0095hE\u00fb \u0088+\u00b6+\u00d2\u00cb%\u00fbU\u00a7:\u00c6\u009e\u0088\u00ben\u00a7w9\u0089\u0019\u00e6^\u00ac$\u00bbX\u0011\u00f31{G\u0010\u00d4J\u0088;Z;\u00ee\u001aQ\r\u00c1\u00e3\u0014\u00f7o\u0019\u0010\u00c1?W\u00c5\u0014\u00f0\u00f6Y\u00e4\u00ec\u009e\u00d6,K\r\u00a6\u0010&\u00cf\u0006\u0081W\u00e1\u000e\u0089\u00ad;Q?8\u00f4\u00a73\u0018q\u001f\u00bc\r\fe\u00d61(?\u00f7\u001e8\u0019SMTm\b\u009e\u00ef3\u00c0\u00f9 \u00da\u00c4v\u00f9\u00a8#\u0016u,\u009cM\u00c9\u00d7\u00f0\u00fb(I\u0011\u0006t\u00ac\u0099\u0014\u0002\u00e8\u00e5\u009c\u00bcs,\u001b\u0000\u0010zNR\u001d<\u00c32kbo9e\u0019O\u00e2\u00a4\u0010\u00aa\u0085\u00882*\u00b6\u009dG\u0081}J\u0000\u008c\u0082\u00cf\u0000\u0010V|\u00a24\u008f\u00e9j\u00bc\u00e8\u00c6\u00b57<\u00c1\u00e7\u0007\u0010\u0093\u00db\u008dR\u00a6 \u00a5\u00c7;-\u0098{\u0013<\u0081k\u0010\u00d6)\u000fZ\u00e0_\u00ea\u00d5[\u00acbu\u0013\u00df\u0095\u0096\u0010\u00ec\u0012\u0098\u00dct\u00bbr\u00b38\u00c9\u00f3\u00d0\u008b\u0094\u00f5]\u0018e \u0012\u00delA\u00cff\u00c2hR\u00bb3Z\u00a0CU\u00cf\u000e\u0083W\u00e5\u00cb\u00a9\u0010Z\u00c3\u009a\u00ae_Z7A\u0013\u00bd\u0000\u00969\u00c5{V".length();
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
                            var11_3[var17_4++] = CP_iv.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u00c8\u00f6z\u0080\u007f<\u00fa\u001b\u0005\u0085@\u00fe<\u00ff\u00ec\u00d4\u0096\u00c9s\u0082\u00bd(\u00ea\u00cd\u0018:K`\u0083G\u0010h\u00f9\u0088\u00e66h\u00a3\u00af\u008c\u00fe{\u00aa\r\u0086\u00f0\u00d3U6";
                            var18_6 = "\u00c8\u00f6z\u0080\u007f<\u00fa\u001b\u0005\u0085@\u00fe<\u00ff\u00ec\u00d4\u0096\u00c9s\u0082\u00bd(\u00ea\u00cd\u0018:K`\u0083G\u0010h\u00f9\u0088\u00e66h\u00a3\u00af\u008c\u00fe{\u00aa\r\u0086\u00f0\u00d3U6".length();
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
                            var11_3[var17_4++] = CP_iv.a(var19_9).intern();
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
                CP_iv.d = new HashMap<K, V>(13);
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
                var6_12 = new long[97];
                var3_13 = 0;
                var4_14 = "\u00f3\u0010\u00e0\u00efP\u00ee\u00cf\u000b\u00cb\u00bf\u00a7\u00f3\u000f\u00edG\u0019/\u00e3t\u008dv\u0080\u00be\u00f0\u00a1\u0083\u00b8!\u00db\u001d\u0095-\u00c6\u00d5\u0016\\,\u009f}\u00f5\u000bq\u00fdN\u00e8i\u00f2\u00c3\u008a\u009f\u009fml\u00e1\u00d4Y\u008e\u0082\u00cb\u00b2\u00d6\u0083_\u0007zE\u00d6@\u00a0\u000e\u00fcd\u00ca.p[\u00a6\u00c0\u00f2\u00c1\u00ed*\u00c1jV.1\u00e7T\u00d3\u0096K~w\u0012k\u00e3\u00fcxq\u009d\u009b\u0007C\u00d7LNM\tL\u00a9\u00c8,\u00ed9Z\u00a4\t\u00e8\u00db\u0083[XB]\u0094\u00e4#+\u00a5}\u00ae\u001c-\u00e3\u00f7[*\u00aeP\u00fbx\u009a\u001cT?\u00ab\u008a\u00ceU\u0010\u008b\u0006\u0091s\u00f4\u00e9\u00c7\u00a1\u0006\u0017\u001e\u00ea8\u00e3/\u00cf\u00d3\u008a\u00a0\u00e0\u0097\r\u009afw\u00cf0\u00db\u00ab\u00b5\u00df\u000eZ&\u00e5m\u00a9|\u0092c\u009f\u0083\u0011d\u008e\u00fa\u00ba+J\u00fe\u00de,\u00d0\u009f\u0007\u00ea\u00ee\u00b8\u00f3P\u00d2i\u00a7\u0001\u00b2\u0010\u00ef\u00bb^\u00e4[d~\u00aa\u00ea7\"<\u00be\u00b3\u00f9\u00a2T\u00c8\u00a94a\u008cA|\u00beR\u00b3\u00b4\u00dc\u009b1\u008cnU\u00c62/D33\u0007\u00b6\u009e\u00b0\u001a\u001b\u008dXjw\u0012s\u00fe\u001e*\u008f#\u00f6\u000bm\u00d2\u00ce{\u009e\u00adix-\u00bd\u00fb\u00c8L\u00bf\ty\u00b1\u0007d0\u0011R\u00e1\u0087\u00e8\u00ad\u007f\u00da$\u00a0\u008a\u00c1\u001e\u00faf\u0011\u00c0\u0015B\u008dT\u00fd\u00d4o#\u001c\u00c6\u008d\\A\u000f=\u00a3\u00ba3\u00b8,%rRg\u009b\u0005\u008c\u001e\u008b\u00d5\u00fa\u00c9\u00f1X\u00bfR\u00f6\u00cb\u00e59\u000f\u00a9'\u00b3E^\u00c2Q\u00c6\u00ac;*\u0007\u00bb\u00f6{)\u00fa,\u00c5\u00a6$\u008b\u00de\u00e8\u00a4\u00a6\u00c7^v\u00b0\u009d\u0089u\u0088]V^\u0004<\u008f\u00a3\u00f1Gza\u0091\u00b9W\u00a2)\u00e7\u0005g\u000b\u00174`\u0012\u0083&\u00d1\u00d0\u0085fH\u007f&\u00de\u00da\u00dak\u009a\u00fc\u00a1U\u001e\u0084\u00ae)o\u00b5\u0080\u00dbp\u000e\u00a2\u00bb'\u009d.\u0088 \u00acF\u0095\u00bd\\:L\u00f3k\u00b3W\u00a1\u0013!qo~a/&,M\u00ba\u0095)\u0091\u00daw@@(xY\u008a)\u00d0\n\u00bd\u0001H\u00a7]\u0010P\u0098\u00b6*\u0002j\"*cho\u00da41\u0001\u0094g-\u00ac]zL\u00ab\u0089\u00dd\u008b&$\u00c8\u00aa\u00af1C\u00b7\f}N\u008a\u00f4=X \u00ab\u00b4\u0092X\u00fb\\.z=\u009b\f\u0098`\u00ec{g\u00f2c\u0085\u0001\u00ba~\u0004\u00a3.D\u0010z\u0003w\u009fM\u00a2;\u00f6\u00c4\u00c2\u00da\u00a5=[\u00cfWr\u0091X\u00af\u0016P\u008f\u00865\u001f\u007f\u00fe#\u00d7\u009dn_\u0012\u00d5/\u00e0\u00d1/\u008f\u009c\u0007B\u0014\u00f7\u0019\u008c\u00ec\u00c7\u0090\u00e1\u009c\u0085\u00b0\u00d9\u00bf\u008e_\u0088\u00fdu\u00feN\u001a|\u00a1z\u0083#\u0018\u00ef\u00dbm\u00d39-!\u00bf:Y|\u0088\u00a1\u0001\u00f2S\u00c5i\u00b2\u00d6|\u00b2\u00d22\u00dc\r\n.\u008a\u0010\u00dc\u00aa\u0082\u0089C\u00a4\u00cf\u00b1\u00c9\u0091\u0097)\u00ab\u0093b\"k\u00a9\"\u00f6\u0016Z\u00cd\u0013\u00fd\"\u0001\u00de\u001b\u00e39\u0010\u00a4\u009e\u0002p\u0096\u001d\u0003\u0015\u009a\u00a1\u00e2\u00a86~1\u0014\u0019\u00edL\u001d\u0007\u00d0&\u0093\u0003\u00e2\u00f6H\u0092\u00e8\u0006\u0000\u008eq\u000b`\u0098S\u00c6\u0080\u00a3\u00df\u00a8\u00d3[(\u00ca\u00a9\u00df=\u0011w\u00bb\u000f\u001a\u00e2\u008b\u00b5G\u0084\u00c9\u00c1\u00ab\u00fc\u00f7\u001e\u00ca\u00aa|\u009a";
                var5_15 = "\u00f3\u0010\u00e0\u00efP\u00ee\u00cf\u000b\u00cb\u00bf\u00a7\u00f3\u000f\u00edG\u0019/\u00e3t\u008dv\u0080\u00be\u00f0\u00a1\u0083\u00b8!\u00db\u001d\u0095-\u00c6\u00d5\u0016\\,\u009f}\u00f5\u000bq\u00fdN\u00e8i\u00f2\u00c3\u008a\u009f\u009fml\u00e1\u00d4Y\u008e\u0082\u00cb\u00b2\u00d6\u0083_\u0007zE\u00d6@\u00a0\u000e\u00fcd\u00ca.p[\u00a6\u00c0\u00f2\u00c1\u00ed*\u00c1jV.1\u00e7T\u00d3\u0096K~w\u0012k\u00e3\u00fcxq\u009d\u009b\u0007C\u00d7LNM\tL\u00a9\u00c8,\u00ed9Z\u00a4\t\u00e8\u00db\u0083[XB]\u0094\u00e4#+\u00a5}\u00ae\u001c-\u00e3\u00f7[*\u00aeP\u00fbx\u009a\u001cT?\u00ab\u008a\u00ceU\u0010\u008b\u0006\u0091s\u00f4\u00e9\u00c7\u00a1\u0006\u0017\u001e\u00ea8\u00e3/\u00cf\u00d3\u008a\u00a0\u00e0\u0097\r\u009afw\u00cf0\u00db\u00ab\u00b5\u00df\u000eZ&\u00e5m\u00a9|\u0092c\u009f\u0083\u0011d\u008e\u00fa\u00ba+J\u00fe\u00de,\u00d0\u009f\u0007\u00ea\u00ee\u00b8\u00f3P\u00d2i\u00a7\u0001\u00b2\u0010\u00ef\u00bb^\u00e4[d~\u00aa\u00ea7\"<\u00be\u00b3\u00f9\u00a2T\u00c8\u00a94a\u008cA|\u00beR\u00b3\u00b4\u00dc\u009b1\u008cnU\u00c62/D33\u0007\u00b6\u009e\u00b0\u001a\u001b\u008dXjw\u0012s\u00fe\u001e*\u008f#\u00f6\u000bm\u00d2\u00ce{\u009e\u00adix-\u00bd\u00fb\u00c8L\u00bf\ty\u00b1\u0007d0\u0011R\u00e1\u0087\u00e8\u00ad\u007f\u00da$\u00a0\u008a\u00c1\u001e\u00faf\u0011\u00c0\u0015B\u008dT\u00fd\u00d4o#\u001c\u00c6\u008d\\A\u000f=\u00a3\u00ba3\u00b8,%rRg\u009b\u0005\u008c\u001e\u008b\u00d5\u00fa\u00c9\u00f1X\u00bfR\u00f6\u00cb\u00e59\u000f\u00a9'\u00b3E^\u00c2Q\u00c6\u00ac;*\u0007\u00bb\u00f6{)\u00fa,\u00c5\u00a6$\u008b\u00de\u00e8\u00a4\u00a6\u00c7^v\u00b0\u009d\u0089u\u0088]V^\u0004<\u008f\u00a3\u00f1Gza\u0091\u00b9W\u00a2)\u00e7\u0005g\u000b\u00174`\u0012\u0083&\u00d1\u00d0\u0085fH\u007f&\u00de\u00da\u00dak\u009a\u00fc\u00a1U\u001e\u0084\u00ae)o\u00b5\u0080\u00dbp\u000e\u00a2\u00bb'\u009d.\u0088 \u00acF\u0095\u00bd\\:L\u00f3k\u00b3W\u00a1\u0013!qo~a/&,M\u00ba\u0095)\u0091\u00daw@@(xY\u008a)\u00d0\n\u00bd\u0001H\u00a7]\u0010P\u0098\u00b6*\u0002j\"*cho\u00da41\u0001\u0094g-\u00ac]zL\u00ab\u0089\u00dd\u008b&$\u00c8\u00aa\u00af1C\u00b7\f}N\u008a\u00f4=X \u00ab\u00b4\u0092X\u00fb\\.z=\u009b\f\u0098`\u00ec{g\u00f2c\u0085\u0001\u00ba~\u0004\u00a3.D\u0010z\u0003w\u009fM\u00a2;\u00f6\u00c4\u00c2\u00da\u00a5=[\u00cfWr\u0091X\u00af\u0016P\u008f\u00865\u001f\u007f\u00fe#\u00d7\u009dn_\u0012\u00d5/\u00e0\u00d1/\u008f\u009c\u0007B\u0014\u00f7\u0019\u008c\u00ec\u00c7\u0090\u00e1\u009c\u0085\u00b0\u00d9\u00bf\u008e_\u0088\u00fdu\u00feN\u001a|\u00a1z\u0083#\u0018\u00ef\u00dbm\u00d39-!\u00bf:Y|\u0088\u00a1\u0001\u00f2S\u00c5i\u00b2\u00d6|\u00b2\u00d22\u00dc\r\n.\u008a\u0010\u00dc\u00aa\u0082\u0089C\u00a4\u00cf\u00b1\u00c9\u0091\u0097)\u00ab\u0093b\"k\u00a9\"\u00f6\u0016Z\u00cd\u0013\u00fd\"\u0001\u00de\u001b\u00e39\u0010\u00a4\u009e\u0002p\u0096\u001d\u0003\u0015\u009a\u00a1\u00e2\u00a86~1\u0014\u0019\u00edL\u001d\u0007\u00d0&\u0093\u0003\u00e2\u00f6H\u0092\u00e8\u0006\u0000\u008eq\u000b`\u0098S\u00c6\u0080\u00a3\u00df\u00a8\u00d3[(\u00ca\u00a9\u00df=\u0011w\u00bb\u000f\u001a\u00e2\u008b\u00b5G\u0084\u00c9\u00c1\u00ab\u00fc\u00f7\u001e\u00ca\u00aa|\u009a".length();
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
                    var4_14 = "o\u009c\u0088\u00c3^\u00b6\u000e:\u00cc\u00fa\u00ec:\n\u00ff\u00b3\u00a9";
                    var5_15 = "o\u009c\u0088\u00c3^\u00b6\u000e:\u00cc\u00fa\u00ec:\n\u00ff\u00b3\u00a9".length();
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
        CP_iv.b = var6_12;
        CP_iv.c = new Integer[97];
        CP_iv.TELEPORT_CONFIRM = new CP_iv();
        CP_iv.QUERY_BLOCK_NBT = new CP_iv();
        CP_iv.SET_DIFFICULTY = new CP_iv();
        CP_iv.CHAT_ACK = new CP_iv();
        CP_iv.CHAT_COMMAND = new CP_iv();
        CP_iv.CHAT_MESSAGE = new CP_iv();
        CP_iv.CHAT_SESSION_UPDATE = new CP_iv();
        CP_iv.CHUNK_BATCH_ACK = new CP_iv();
        CP_iv.CLIENT_STATUS = new CP_iv();
        CP_iv.CLIENT_SETTINGS = new CP_iv();
        CP_iv.TAB_COMPLETE = new CP_iv();
        CP_iv.CONFIGURATION_ACK = new CP_iv();
        CP_iv.CLICK_WINDOW_BUTTON = new CP_iv();
        CP_iv.CLICK_WINDOW = new CP_iv();
        CP_iv.CLOSE_WINDOW = new CP_iv();
        CP_iv.PLUGIN_MESSAGE = new CP_iv();
        CP_iv.EDIT_BOOK = new CP_iv();
        CP_iv.QUERY_ENTITY_NBT = new CP_iv();
        CP_iv.INTERACT_ENTITY = new CP_iv();
        CP_iv.GENERATE_STRUCTURE = new CP_iv();
        CP_iv.KEEP_ALIVE = new CP_iv();
        CP_iv.LOCK_DIFFICULTY = new CP_iv();
        CP_iv.PLAYER_POSITION = new CP_iv();
        CP_iv.PLAYER_POSITION_AND_ROTATION = new CP_iv();
        CP_iv.PLAYER_ROTATION = new CP_iv();
        CP_iv.PLAYER_FLYING = new CP_iv();
        CP_iv.VEHICLE_MOVE = new CP_iv();
        CP_iv.STEER_BOAT = new CP_iv();
        CP_iv.PICK_ITEM = new CP_iv();
        CP_iv.DEBUG_PING = new CP_iv();
        CP_iv.CRAFT_RECIPE_REQUEST = new CP_iv();
        CP_iv.PLAYER_ABILITIES = new CP_iv();
        CP_iv.PLAYER_DIGGING = new CP_iv();
        CP_iv.ENTITY_ACTION = new CP_iv();
        CP_iv.STEER_VEHICLE = new CP_iv();
        CP_iv.PONG = new CP_iv();
        CP_iv.SET_RECIPE_BOOK_STATE = new CP_iv();
        CP_iv.SET_DISPLAYED_RECIPE = new CP_iv();
        CP_iv.NAME_ITEM = new CP_iv();
        CP_iv.RESOURCE_PACK_STATUS = new CP_iv();
        CP_iv.ADVANCEMENT_TAB = new CP_iv();
        CP_iv.SELECT_TRADE = new CP_iv();
        CP_iv.SET_BEACON_EFFECT = new CP_iv();
        CP_iv.HELD_ITEM_CHANGE = new CP_iv();
        CP_iv.UPDATE_COMMAND_BLOCK = new CP_iv();
        CP_iv.UPDATE_COMMAND_BLOCK_MINECART = new CP_iv();
        CP_iv.CREATIVE_INVENTORY_ACTION = new CP_iv();
        CP_iv.UPDATE_JIGSAW_BLOCK = new CP_iv();
        CP_iv.UPDATE_STRUCTURE_BLOCK = new CP_iv();
        CP_iv.UPDATE_SIGN = new CP_iv();
        CP_iv.ANIMATION = new CP_iv();
        CP_iv.SPECTATE = new CP_iv();
        CP_iv.PLAYER_BLOCK_PLACEMENT = new CP_iv();
        CP_iv.USE_ITEM = new CP_iv();
        CP_iv.CP_U = CP_iv.CP_u();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5E8A;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_iv", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_iv.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_iv.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_iv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_iv.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

