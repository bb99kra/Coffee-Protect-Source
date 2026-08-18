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

public final class CP_v6
extends Enum<CP_v6> {
    public static final /* enum */ CP_v6 SPAWN_ENTITY;
    public static final /* enum */ CP_v6 SPAWN_EXPERIENCE_ORB;
    public static final /* enum */ CP_v6 SPAWN_WEATHER_ENTITY;
    public static final /* enum */ CP_v6 SPAWN_LIVING_ENTITY;
    public static final /* enum */ CP_v6 SPAWN_PAINTING;
    public static final /* enum */ CP_v6 SPAWN_PLAYER;
    public static final /* enum */ CP_v6 ENTITY_ANIMATION;
    public static final /* enum */ CP_v6 STATISTICS;
    public static final /* enum */ CP_v6 BLOCK_BREAK_ANIMATION;
    public static final /* enum */ CP_v6 BLOCK_ENTITY_DATA;
    public static final /* enum */ CP_v6 BLOCK_ACTION;
    public static final /* enum */ CP_v6 BLOCK_CHANGE;
    public static final /* enum */ CP_v6 BOSS_BAR;
    public static final /* enum */ CP_v6 SERVER_DIFFICULTY;
    public static final /* enum */ CP_v6 TAB_COMPLETE;
    public static final /* enum */ CP_v6 CHAT_MESSAGE;
    public static final /* enum */ CP_v6 MULTI_BLOCK_CHANGE;
    public static final /* enum */ CP_v6 WINDOW_CONFIRMATION;
    public static final /* enum */ CP_v6 CLOSE_WINDOW;
    public static final /* enum */ CP_v6 OPEN_WINDOW;
    public static final /* enum */ CP_v6 WINDOW_ITEMS;
    public static final /* enum */ CP_v6 WINDOW_PROPERTY;
    public static final /* enum */ CP_v6 SET_SLOT;
    public static final /* enum */ CP_v6 SET_COOLDOWN;
    public static final /* enum */ CP_v6 PLUGIN_MESSAGE;
    public static final /* enum */ CP_v6 NAMED_SOUND_EFFECT;
    public static final /* enum */ CP_v6 DISCONNECT;
    public static final /* enum */ CP_v6 ENTITY_STATUS;
    public static final /* enum */ CP_v6 EXPLOSION;
    public static final /* enum */ CP_v6 UNLOAD_CHUNK;
    public static final /* enum */ CP_v6 CHANGE_GAME_STATE;
    public static final /* enum */ CP_v6 KEEP_ALIVE;
    public static final /* enum */ CP_v6 CHUNK_DATA;
    public static final /* enum */ CP_v6 EFFECT;
    public static final /* enum */ CP_v6 PARTICLE;
    public static final /* enum */ CP_v6 JOIN_GAME;
    public static final /* enum */ CP_v6 MAP_DATA;
    public static final /* enum */ CP_v6 ENTITY_RELATIVE_MOVE;
    public static final /* enum */ CP_v6 ENTITY_RELATIVE_MOVE_AND_ROTATION;
    public static final /* enum */ CP_v6 ENTITY_ROTATION;
    public static final /* enum */ CP_v6 ENTITY_MOVEMENT;
    public static final /* enum */ CP_v6 VEHICLE_MOVE;
    public static final /* enum */ CP_v6 OPEN_SIGN_EDITOR;
    public static final /* enum */ CP_v6 PLAYER_ABILITIES;
    public static final /* enum */ CP_v6 COMBAT_EVENT;
    public static final /* enum */ CP_v6 PLAYER_INFO;
    public static final /* enum */ CP_v6 PLAYER_POSITION_AND_LOOK;
    public static final /* enum */ CP_v6 USE_BED;
    public static final /* enum */ CP_v6 DESTROY_ENTITIES;
    public static final /* enum */ CP_v6 REMOVE_ENTITY_EFFECT;
    public static final /* enum */ CP_v6 RESOURCE_PACK_SEND;
    public static final /* enum */ CP_v6 RESPAWN;
    public static final /* enum */ CP_v6 ENTITY_HEAD_LOOK;
    public static final /* enum */ CP_v6 WORLD_BORDER;
    public static final /* enum */ CP_v6 CAMERA;
    public static final /* enum */ CP_v6 HELD_ITEM_CHANGE;
    public static final /* enum */ CP_v6 DISPLAY_SCOREBOARD;
    public static final /* enum */ CP_v6 ENTITY_METADATA;
    public static final /* enum */ CP_v6 ATTACH_ENTITY;
    public static final /* enum */ CP_v6 ENTITY_VELOCITY;
    public static final /* enum */ CP_v6 ENTITY_EQUIPMENT;
    public static final /* enum */ CP_v6 SET_EXPERIENCE;
    public static final /* enum */ CP_v6 UPDATE_HEALTH;
    public static final /* enum */ CP_v6 SCOREBOARD_OBJECTIVE;
    public static final /* enum */ CP_v6 SET_PASSENGERS;
    public static final /* enum */ CP_v6 TEAMS;
    public static final /* enum */ CP_v6 UPDATE_SCORE;
    public static final /* enum */ CP_v6 SPAWN_POSITION;
    public static final /* enum */ CP_v6 TIME_UPDATE;
    public static final /* enum */ CP_v6 TITLE;
    public static final /* enum */ CP_v6 SOUND_EFFECT;
    public static final /* enum */ CP_v6 PLAYER_LIST_HEADER_AND_FOOTER;
    public static final /* enum */ CP_v6 COLLECT_ITEM;
    public static final /* enum */ CP_v6 ENTITY_TELEPORT;
    public static final /* enum */ CP_v6 UPDATE_ATTRIBUTES;
    public static final /* enum */ CP_v6 ENTITY_EFFECT;
    private static final /* synthetic */ CP_v6[] CP_M;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_v6[] values() {
        return (CP_v6[])CP_M.clone();
    }

    public static CP_v6 valueOf(String string) {
        return Enum.valueOf(CP_v6.class, string);
    }

    private static /* synthetic */ CP_v6[] CP_A() {
        long l = a ^ 0x366E3C2CFDB0L;
        CP_v6[] ilIlv6Array = new CP_v6[CP_v6.a("d", (int)27970, (long)(0x765AE20CF815649L ^ l))];
        ilIlv6Array[0] = SPAWN_ENTITY;
        ilIlv6Array[1] = SPAWN_EXPERIENCE_ORB;
        ilIlv6Array[2] = SPAWN_WEATHER_ENTITY;
        ilIlv6Array[3] = SPAWN_LIVING_ENTITY;
        ilIlv6Array[4] = SPAWN_PAINTING;
        ilIlv6Array[5] = SPAWN_PLAYER;
        ilIlv6Array[CP_v6.a("d", (int)11258, (long)(0x476FCB4B9591909FL ^ l))] = ENTITY_ANIMATION;
        ilIlv6Array[CP_v6.a("d", (int)28741, (long)(0x6CA86805A8164BDEL ^ l))] = STATISTICS;
        ilIlv6Array[CP_v6.a("d", (int)19051, (long)(0x571DB4FE450C7156L ^ l))] = BLOCK_BREAK_ANIMATION;
        ilIlv6Array[CP_v6.a("d", (int)19129, (long)(0x2B0B19CDC279F1B5L ^ l))] = BLOCK_ENTITY_DATA;
        ilIlv6Array[CP_v6.a("d", (int)554, (long)(0x7C313B5A7993970L ^ l))] = BLOCK_ACTION;
        ilIlv6Array[CP_v6.a("d", (int)11129, (long)(0xE03188EDDFB9005L ^ l))] = BLOCK_CHANGE;
        ilIlv6Array[CP_v6.a("d", (int)27991, (long)(0xADAEB8887155601L ^ l))] = BOSS_BAR;
        ilIlv6Array[CP_v6.a("d", (int)1865, (long)(0x7197AF693CBA3C19L ^ l))] = SERVER_DIFFICULTY;
        ilIlv6Array[CP_v6.a("d", (int)21818, (long)(0x3AD179974E40EE45L ^ l))] = TAB_COMPLETE;
        ilIlv6Array[CP_v6.a("d", (int)5891, (long)(0x750B0F219A102C23L ^ l))] = CHAT_MESSAGE;
        ilIlv6Array[CP_v6.a("d", (int)10462, (long)(0x44E3FEB4A0B713FBL ^ l))] = MULTI_BLOCK_CHANGE;
        ilIlv6Array[CP_v6.a("d", (int)12457, (long)(0x496FF6F6E3360BB4L ^ l))] = WINDOW_CONFIRMATION;
        ilIlv6Array[CP_v6.a("d", (int)16116, (long)(0x522DB427B29E85BFL ^ l))] = CLOSE_WINDOW;
        ilIlv6Array[CP_v6.a("d", (int)31027, (long)(0x1BA93DA7431C25FL ^ l))] = OPEN_WINDOW;
        ilIlv6Array[CP_v6.a("d", (int)11612, (long)(0x4F91A9266EE496CAL ^ l))] = WINDOW_ITEMS;
        ilIlv6Array[CP_v6.a("d", (int)5221, (long)(0x51B9DB29C6672F17L ^ l))] = WINDOW_PROPERTY;
        ilIlv6Array[CP_v6.a("d", (int)1360, (long)(0x49CDE9F5C6F23E3FL ^ l))] = SET_SLOT;
        ilIlv6Array[CP_v6.a("d", (int)22651, (long)(0x14904EF7F6F6E36AL ^ l))] = SET_COOLDOWN;
        ilIlv6Array[CP_v6.a("d", (int)10641, (long)(0x33FC9745DBAA12E8L ^ l))] = PLUGIN_MESSAGE;
        ilIlv6Array[CP_v6.a("d", (int)16252, (long)(0x2738E90D86BA8447L ^ l))] = NAMED_SOUND_EFFECT;
        ilIlv6Array[CP_v6.a("d", (int)31441, (long)(0x5DE6D8094EFEC1B6L ^ l))] = DISCONNECT;
        ilIlv6Array[CP_v6.a("d", (int)3648, (long)(0x7C8F97652766352BL ^ l))] = ENTITY_STATUS;
        ilIlv6Array[CP_v6.a("d", (int)31977, (long)(0x6F530BEF8BAD47F5L ^ l))] = EXPLOSION;
        ilIlv6Array[CP_v6.a("d", (int)28258, (long)(0x2452784F03BF55F8L ^ l))] = UNLOAD_CHUNK;
        ilIlv6Array[CP_v6.a("d", (int)23997, (long)(0x3266A5662787668DL ^ l))] = CHANGE_GAME_STATE;
        ilIlv6Array[CP_v6.a("d", (int)22981, (long)(0x201024D25B4D62A3L ^ l))] = KEEP_ALIVE;
        ilIlv6Array[CP_v6.a("d", (int)2042, (long)(0x2B64BF2F25F63CF5L ^ l))] = CHUNK_DATA;
        ilIlv6Array[CP_v6.a("d", (int)19804, (long)(0x5EB8D589BC27F647L ^ l))] = EFFECT;
        ilIlv6Array[CP_v6.a("d", (int)20956, (long)(0x27E2CA42E382EA96L ^ l))] = PARTICLE;
        ilIlv6Array[CP_v6.a("d", (int)18108, (long)(0x228DBECA64A57DFFL ^ l))] = JOIN_GAME;
        ilIlv6Array[CP_v6.a("d", (int)20472, (long)(0x4ADE373CB54F4BEL ^ l))] = MAP_DATA;
        ilIlv6Array[CP_v6.a("d", (int)2954, (long)(0x6DA27B7578D2B0C3L ^ l))] = ENTITY_RELATIVE_MOVE;
        ilIlv6Array[CP_v6.a("d", (int)5775, (long)(0x23DF264CB5D92DBBL ^ l))] = ENTITY_RELATIVE_MOVE_AND_ROTATION;
        ilIlv6Array[CP_v6.a("d", (int)25750, (long)(0x4AA6FDCCE27F5FB0L ^ l))] = ENTITY_ROTATION;
        ilIlv6Array[CP_v6.a("d", (int)21677, (long)(0x28CEA3D1354E6FEFL ^ l))] = ENTITY_MOVEMENT;
        ilIlv6Array[CP_v6.a("d", (int)25009, (long)(0x33A4FAEC325DDA98L ^ l))] = VEHICLE_MOVE;
        ilIlv6Array[CP_v6.a("d", (int)23115, (long)(0x26A6333802226131L ^ l))] = OPEN_SIGN_EDITOR;
        ilIlv6Array[CP_v6.a("d", (int)12015, (long)(0x7B149CDCEC96958CL ^ l))] = PLAYER_ABILITIES;
        ilIlv6Array[CP_v6.a("d", (int)12744, (long)(0x24B8B4D148B70ACDL ^ l))] = COMBAT_EVENT;
        ilIlv6Array[CP_v6.a("d", (int)13870, (long)(0x1575FE3A169D0D62L ^ l))] = PLAYER_INFO;
        ilIlv6Array[CP_v6.a("d", (int)10273, (long)(0x2E71D3E55F78135CL ^ l))] = PLAYER_POSITION_AND_LOOK;
        ilIlv6Array[CP_v6.a("d", (int)12309, (long)(0x3A8BFD12EDE8B14L ^ l))] = USE_BED;
        ilIlv6Array[CP_v6.a("d", (int)25560, (long)(0x4B71281CE1C8D8D5L ^ l))] = DESTROY_ENTITIES;
        ilIlv6Array[CP_v6.a("d", (int)27668, (long)(0x74A553CBBA15737L ^ l))] = REMOVE_ENTITY_EFFECT;
        ilIlv6Array[CP_v6.a("d", (int)22180, (long)(0xF6EDB4D9CA5ED89L ^ l))] = RESOURCE_PACK_SEND;
        ilIlv6Array[CP_v6.a("d", (int)14398, (long)(0x2954D8BC664A0300L ^ l))] = RESPAWN;
        ilIlv6Array[CP_v6.a("d", (int)17148, (long)(0x3CD54D77991F9C3L ^ l))] = ENTITY_HEAD_LOOK;
        ilIlv6Array[CP_v6.a("d", (int)12318, (long)(0x79594D63E5550B68L ^ l))] = WORLD_BORDER;
        ilIlv6Array[CP_v6.a("d", (int)29929, (long)(0x22F71ECD959CFF0L ^ l))] = CAMERA;
        ilIlv6Array[CP_v6.a("d", (int)12745, (long)(0x47124C0DB4DD0A8CL ^ l))] = HELD_ITEM_CHANGE;
        ilIlv6Array[CP_v6.a("d", (int)25973, (long)(0x19EE3A5704AADEE4L ^ l))] = DISPLAY_SCOREBOARD;
        ilIlv6Array[CP_v6.a("d", (int)8578, (long)(0x64C572608EA79A85L ^ l))] = ENTITY_METADATA;
        ilIlv6Array[CP_v6.a("d", (int)28983, (long)(0x18961BCA0DE34A5DL ^ l))] = ATTACH_ENTITY;
        ilIlv6Array[CP_v6.a("d", (int)5387, (long)(0x700A12F24F1CAE31L ^ l))] = ENTITY_VELOCITY;
        ilIlv6Array[CP_v6.a("d", (int)20418, (long)(0x541F3ACEB0A3F4B1L ^ l))] = ENTITY_EQUIPMENT;
        ilIlv6Array[CP_v6.a("d", (int)23731, (long)(0x58B2600C616B678AL ^ l))] = SET_EXPERIENCE;
        ilIlv6Array[CP_v6.a("d", (int)32260, (long)(0x5D00AF8E05C6C590L ^ l))] = UPDATE_HEALTH;
        ilIlv6Array[CP_v6.a("d", (int)13684, (long)(0x2E6704E472590EE6L ^ l))] = SCOREBOARD_OBJECTIVE;
        ilIlv6Array[CP_v6.a("d", (int)11942, (long)(0x642B848B32331582L ^ l))] = SET_PASSENGERS;
        ilIlv6Array[CP_v6.a("d", (int)11308, (long)(0x2BE97B22087A971EL ^ l))] = TEAMS;
        ilIlv6Array[CP_v6.a("d", (int)8857, (long)(0x414A7BC00F251981L ^ l))] = UPDATE_SCORE;
        ilIlv6Array[CP_v6.a("d", (int)11669, (long)(0x2AE0EB044E5B1602L ^ l))] = SPAWN_POSITION;
        ilIlv6Array[CP_v6.a("d", (int)15213, (long)(0x3E8363C556140063L ^ l))] = TIME_UPDATE;
        ilIlv6Array[CP_v6.a("d", (int)24879, (long)(0x7040D3A6E6BFDA13L ^ l))] = TITLE;
        ilIlv6Array[CP_v6.a("d", (int)2737, (long)(0x57D5518462F3319FL ^ l))] = SOUND_EFFECT;
        ilIlv6Array[CP_v6.a("d", (int)31028, (long)(0x7A944845238423CL ^ l))] = PLAYER_LIST_HEADER_AND_FOOTER;
        ilIlv6Array[CP_v6.a("d", (int)18924, (long)(0x5DF95A4215AF2C0L ^ l))] = COLLECT_ITEM;
        ilIlv6Array[CP_v6.a("d", (int)19635, (long)(0x6C100B06F14CF7D2L ^ l))] = ENTITY_TELEPORT;
        ilIlv6Array[CP_v6.a("d", (int)29167, (long)(0x996579D0CEBCAB2L ^ l))] = UPDATE_ATTRIBUTES;
        ilIlv6Array[CP_v6.a("d", (int)13169, (long)(0x3772ECD02E3F081FL ^ l))] = ENTITY_EFFECT;
        return ilIlv6Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_v6.a = CP_s.a(1263829208777142040L, 5522616773116591617L, MethodHandles.lookup().lookupClass()).a(11167345667119L);
                        var20 = CP_v6.a ^ 16957624007146L;
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
                        var11_3 = new String[76];
                        var17_4 = 0;
                        var16_5 = "7\u00da\u00a3y\u00bf\u000e\b\u0003\u00c7\u00ac=N\u009b\u00aa\u0005\u008f4\u001ab\u001aq\u0083&\u009b\b\u0001P\u0005\u0092:&\u00be\u00f0\u0010\u0093\u00fd\n<\u00f1\u00b0\u00acu\u001e6\u00c3H\u00fc\u0090@\n\u0018\u00f14\u001b\u00c1\u00c4\u00ad[M\u00ca\u00c5\u00ec\u00fb\u0018\u00aa\u00e9}\u001c9\u00a1\u00c1\u0000(#\u00e3\b\u00adCQ\u009e\u00c3\u00fc\u00f0\u00e6\u0018\nJ\u000b\u00be\u00a5\u00cc%\u00f7a\u00c6\u00d8\u008cI\u00d9g\u0096\n\u00e4\u00bd\u0019\u00e7\u00cc(!\u0018<\u00e0\u00e2\u00e7\u008f&\u00a4h\u00f8l\u00f3\u00b8\u00dd\u009e\u0014r\u000f\u00de\u00e5\u008e\u0096\u0017\u0096\u0015\u0010\u00d5\u009a\u00f0\u00b7\u00f7\u00bf\u00ac\u0001@5h\u0001\u0082\u0082\u00fb\u0002(\u0092\u00d6\u00ea\u0082\u000b\u00ef\u0091\u009f\u00d4\u0086\u00c2T\u009e\u00e5\u00b4M\u00e8\u0087D\u0093\u0016\u00d6|\u00ab\u0097\u00bd\u0082\u000e6\u0004\u00f0c6\u000f\u00adf\u00c7Mk\u00f4 \u0001C\r\u00b8?\u00d5\u0094K\"\u00df\u0003i\u00c3\u0016\u00bf\u00fa\u00bdy`e\u00a4%\u0007\u001c\u00dd7\u00e9\u001e/\u00ad\u00ba4\u0010 \u0082\u0097\u009f@\\,\u00da\u00a1}k\u00c9\u00ac\u0006h\u00c0\u0010\u00e8_-\u00d3\u0019]\u0099]\u0099\r\u001e\u00a0\u00d1U8\u008c\u0010\u00b9\u00a1Je\u009cC\u0088\u00cd\u00c8\u00bf\u0005!i\u00ab\u00d3\u00e9\u0010\u00a2\u00d8\u0094n&f%s<\u00d9T5\u0007\u00b6er\u0010\u009c\u0096\u00e5\u00d4\u00afUB\u00d2Z\u00df\u00ea4\u00e6\u0011\u008f\u00ed\u0018cm\u00d6\u00d0\bH\u008ec\u0091\u00f3\u001b\u00c2C\u00a6\u00adn:\u00e2\u0007#\u00e3\" -\u0018\u00a1S\u00f8I\u00fc4pK\u00ec\u00b28\u009b/\u008d\u00144>\u00a6\u00c2\u00bf\u008a\u00b4\u00c5\u00cc\b\u008e\u00f2N\u00de\u00fb\u00f0\u00d2\u0003\u0010\u00e6\f\u00b8'7\u009b\u00be\u0096\u00c0\u0085J\u0086\u00e5\\\rN\u0010;\u0091\u0004\u00ac\u00fa\u009b\u0002\u00e7\u0095\u00d5a\u0089\u008dx\u0091F\br3M\u0091as\u00ef\u00de\u0010\u00fe\u00c7P\u00c5\u00d3\u0014\u00e0*]\u00cb\n\u0016\u00cb\u00cb \u00f6\u0010\u0089D\u00fc\u0080(\u00f8\u009b;#\u00e0\u00b3\u00eb\u00f1p\u00cd\u00f6\u0010\u00a0R\u00c9V1u\u00fcb\u00ac\u0081\u00f9xK\u00037/\u0010\u00d2p\u00cez\u00c1\u0017.\u00b7\u00f1\u00c8<\u00825<+^\u0010\u001f\u00f4Y\u008c\u00bd\u0017\u00d6\u00ad\u00d0\u00ec\f\u00db\u00aa\u00bc\u001f\u0082\u0010\u00ed$,F\u001e\u009a8\u00ca\u008c2%kT1_+\u0018*\u001f\u00f5\u00e5\u00bf\u00ee\u00ea`qBo\u00e1\u00f4e\u00b3\u0016r>\u00ba/0Q\u00bf\u00c4\u0010\u0092\u00d6\u00ea\u0082\u000b\u00ef\u0091\u009ftR\u00e2T\u00123w\u00d7\u0018\\\u00f6\u0084p\u00ba\u00b7\u00c8\u00b2f\u00ba\u0093\u00e2\u00fa\u0092\u00f3\u0091\u00f1)2\u00d3w|J\u00e4\u0018\f\u00c7\u00c4`\u001a\u00a4\u00e8\u0083\u00ab\u00f2\b\u00bc\u00d6\u00ab\u0087\u0019\u00e2\u00d0\u0002\u0002\u00d9\u00fc[\u00ec\u0018\u00fc%]\u00e6e\u00dd:\u00d7Y\u007f}\u009bg\u0013\u00ccT\u00d4\u00e09a\u00a5\u00bd\u00c9\u0001\u0010S\u008e\u00ff\u00bej\u00c4\u00b0\u00e7a\u00ece`\u00ff\u00bc\u0005\u00d3\u0018\u00eck\u001b_i\u00d4\u00e6\u001e\u00b1 \u0089Nv\u0015yi7\u0000F!\u00b8P\u00f4\u0014\u00100\u00b2<\u00f6\u000eFN\u00f3l$\u0093 \u00dd_\u0090\u009e\u0018\u00dcZ?.\u00a6q\u00b2\u00af\u007f\u00da\u00cbr\u00e8\u00dez\u008c\u00be\u0014\u00cep\u00d0\u00f0\u00e8\u000f\u0010\u0097*\u00c2\u00e3\u009e8\u008f3\u0093nMU\u0017\u009f\u0096\u00ae\u0018ZDJ\u00e1\u00ab\u00e5\u00c2x\u0088\u000f\u00de1\u00b6 n\u001a\u0092\u00ce%\u00aa\u00e72\u000e\u0014\u0010\u00aa\u00c8\u00ec\u0087\u008c;\u00b9\u00ff\u0082\u0007\u0011\u00a3l\u00fdT\u00cc\u0010\u00c9q\u000b\u00f9\\'t\u00ba\u0082M\u00c2_jPL\u0017\u0010\u00ee\u00af\u000fX\u00f9\u00c0\u00fa~L\u0082\u001d\u00beO\u00eb2s\u0010\u000f\u0097\u00fb\u000b\u008a\u0016\u00eb\u00e2\u0084\u008e\u00bat\u009c;\u00b1\u0083\u0018!\u00c1\u0017!\u0000\u00e4\u00cb7\u0087\u00e9\u0001\u0094\u000f\u00a3O^LKu\u00ff\u00ce_|\u00f0\u0010\u00da\u00cc&\u0095r\u001e\u0097\u00a7\u00c7\u00df\n\"\u00f8\u00c0\u00b9\u0019\u0010\u00d1\u00ef\u00fdW\u00cf\u00bcR\u00dd\u00a5\u00a6\u00dc]9\u0017\u00d5\u00f2\u0010\u00a9\u009cHH\u00c9R\u00c8\u00e1c\u001e\u00df\u00c7-\u0095\u0093\u00d8\u0010\u00b9j\u00f6\u000e\u00a3\u00f2A\u007f\u0080\u0014E\u00e2\u00c2%#\u001d\u0018Q\u00e5^\u00ce\u0089\u00f8\u00c4;\u00dc\u0016\u00a4\u0013\u008e8\u00b4\u008e\u00e9:\u00f6\u00ba\u00ff\u00cb\u00b8\u009b\u00106\u00d5$\u00e5\u0018\u00eb\u00ad>U\u00c8\u008d\u0081\u00e3\u00b7\u000bf\u0018M\u00faS\u00981\u00ff\u009d\u00cb\u00e1\u008ezF]\"\u00d3)\r\u00f4c\u001eM\u001f2\u00e7\u0010\u0010d\u00ae\u0000^\u00c8}\u009b\u00b2\u00ba>\u00ed\u00ab\u0017\u00b04\u0010\u001b\u0090C\u0097\u00b7\"Cp\u00bfzO\b\u008d\u00e3\u000e\"\u0010\u00a6\u008el\u00ea\u0085\u00ea\u00a0\u0007Y\u0012\u000e\b\u001e\u009bCm\u0010\u00ff\u00e8\u008c\"\u00b4d\u0004c\u0080\u00a1\u00d0\u00aah\u0084\u009a\f \u00cf\u0096X\u00f5\u00c4\u00f0)\u00f5m\u00be\f\u00e9\u008c\u0010\u0081\t\u00c7\u00d4p\u00a6X\u00ed\u00b4&do@\u00c0\u00a3R\u009bf\u0010\u00c2\u00f3o\u00b4\u000f\u00c4\u009b$jSt\u00ca\u0010l]\u00fc\u0018\u00bd~0\u009b\u00c3\u00aei\u0083\u00b9\u00d7C<\u00bao\u007f\u001e\u00b1K\u00a3\u00cbX\u00b7\u00ba\u0096\u0010\u00a9\u00ed\u00a9\u00e3/\u00de}{\u00e6\u0006\u00f1\u00b0\u0013\t\u0006\u0094\u0018\u00d2\u00e7\u00dd\u00f5\u00ea\u00c3\u00dc1\u0003\u00ffsM1\u00fbv\u0003<\u00d0\u0016K\u008dH\u00a4\u00eb\u0010\u00d5\u009a\u00f0\u00b7\u00f7\u00bf\u00ac\u0001\u001e\u00ec&\u0097\u00b8\u0085\u00cf\u009a\be,\u00e9oc\u0010>\u00de\u0010\u00c3\u00f4\u00c9\u0018L\u0016T\u009a\u0019\u00c9Z\u0005\u0018\u0001$S\u0010\u00b3\u00cb;cN\u0096\u00ac\u00e1\u0087\u00a3\u00b6\u0002b\t6\u009f\u0018\u00b9\u007f/\u0019\u00e6\u00d2\u00153\u00b4\u001b\u00ee\ft\u00f4s\u0089\u0004\u00e8\u00ea\u0019\u000b\u00dc7\u0094\u0018\u00c5c\u00f9'\u00cc\u00c1\u00b4\u00a0\u00fe\u00eec\u0084\u00f1\u00c7(\u0000\u0088\u00ba#'v\u00ed\u00ce\u00a0\u0018\u0092\u00d6\u00ea\u0082\u000b\u00ef\u0091\u009f\u00d4\u0086\u00c2T\u009e\u00e5\u00b4M\u00c2\u00db\u00ddp\u00b4\b\u00f5\u001b\u0010\\\u00f6\u0084p\u00ba\u00b7\u00c8\u00b2\u0094\u000f\u00e7o\u009d\u00c2b\u00f1\u0010\u001e\u0089r\u00b1\u00de\u009b]\u00faQ\u00a7\u00f1m9-\u0011\u00fe\u0010\u00d1b\u00145H\u0002\u0005\u00a5\u00eaj\u0093\u00dbC*\u00dcE\u0018z\u0014B3\u0016d\u00da\u00ca\u00eb\u00c6dhI\n\u00f6\u00cbR\u00c6\u00e4\u00a6\u0004O\u00e3\u00c5\u0010\u00ec\u00ea\u0002\u00ca\u0087\u00f9\u00b0\u0002D\u00a0@x\u0085Kl]\u0010\u0003\u007f\u00e7\u0015!\u008f/\u0088\u00ee\u00bfx\u0080k\u000f\u00df*\b\u008d\r\u00a9\u0010\u0088\u0095\"-\u0010U\u001d'YG\u009d)\u00a2\u00a59\u00f3f\u001e\u00aeL\u00cb";
                        var18_6 = "7\u00da\u00a3y\u00bf\u000e\b\u0003\u00c7\u00ac=N\u009b\u00aa\u0005\u008f4\u001ab\u001aq\u0083&\u009b\b\u0001P\u0005\u0092:&\u00be\u00f0\u0010\u0093\u00fd\n<\u00f1\u00b0\u00acu\u001e6\u00c3H\u00fc\u0090@\n\u0018\u00f14\u001b\u00c1\u00c4\u00ad[M\u00ca\u00c5\u00ec\u00fb\u0018\u00aa\u00e9}\u001c9\u00a1\u00c1\u0000(#\u00e3\b\u00adCQ\u009e\u00c3\u00fc\u00f0\u00e6\u0018\nJ\u000b\u00be\u00a5\u00cc%\u00f7a\u00c6\u00d8\u008cI\u00d9g\u0096\n\u00e4\u00bd\u0019\u00e7\u00cc(!\u0018<\u00e0\u00e2\u00e7\u008f&\u00a4h\u00f8l\u00f3\u00b8\u00dd\u009e\u0014r\u000f\u00de\u00e5\u008e\u0096\u0017\u0096\u0015\u0010\u00d5\u009a\u00f0\u00b7\u00f7\u00bf\u00ac\u0001@5h\u0001\u0082\u0082\u00fb\u0002(\u0092\u00d6\u00ea\u0082\u000b\u00ef\u0091\u009f\u00d4\u0086\u00c2T\u009e\u00e5\u00b4M\u00e8\u0087D\u0093\u0016\u00d6|\u00ab\u0097\u00bd\u0082\u000e6\u0004\u00f0c6\u000f\u00adf\u00c7Mk\u00f4 \u0001C\r\u00b8?\u00d5\u0094K\"\u00df\u0003i\u00c3\u0016\u00bf\u00fa\u00bdy`e\u00a4%\u0007\u001c\u00dd7\u00e9\u001e/\u00ad\u00ba4\u0010 \u0082\u0097\u009f@\\,\u00da\u00a1}k\u00c9\u00ac\u0006h\u00c0\u0010\u00e8_-\u00d3\u0019]\u0099]\u0099\r\u001e\u00a0\u00d1U8\u008c\u0010\u00b9\u00a1Je\u009cC\u0088\u00cd\u00c8\u00bf\u0005!i\u00ab\u00d3\u00e9\u0010\u00a2\u00d8\u0094n&f%s<\u00d9T5\u0007\u00b6er\u0010\u009c\u0096\u00e5\u00d4\u00afUB\u00d2Z\u00df\u00ea4\u00e6\u0011\u008f\u00ed\u0018cm\u00d6\u00d0\bH\u008ec\u0091\u00f3\u001b\u00c2C\u00a6\u00adn:\u00e2\u0007#\u00e3\" -\u0018\u00a1S\u00f8I\u00fc4pK\u00ec\u00b28\u009b/\u008d\u00144>\u00a6\u00c2\u00bf\u008a\u00b4\u00c5\u00cc\b\u008e\u00f2N\u00de\u00fb\u00f0\u00d2\u0003\u0010\u00e6\f\u00b8'7\u009b\u00be\u0096\u00c0\u0085J\u0086\u00e5\\\rN\u0010;\u0091\u0004\u00ac\u00fa\u009b\u0002\u00e7\u0095\u00d5a\u0089\u008dx\u0091F\br3M\u0091as\u00ef\u00de\u0010\u00fe\u00c7P\u00c5\u00d3\u0014\u00e0*]\u00cb\n\u0016\u00cb\u00cb \u00f6\u0010\u0089D\u00fc\u0080(\u00f8\u009b;#\u00e0\u00b3\u00eb\u00f1p\u00cd\u00f6\u0010\u00a0R\u00c9V1u\u00fcb\u00ac\u0081\u00f9xK\u00037/\u0010\u00d2p\u00cez\u00c1\u0017.\u00b7\u00f1\u00c8<\u00825<+^\u0010\u001f\u00f4Y\u008c\u00bd\u0017\u00d6\u00ad\u00d0\u00ec\f\u00db\u00aa\u00bc\u001f\u0082\u0010\u00ed$,F\u001e\u009a8\u00ca\u008c2%kT1_+\u0018*\u001f\u00f5\u00e5\u00bf\u00ee\u00ea`qBo\u00e1\u00f4e\u00b3\u0016r>\u00ba/0Q\u00bf\u00c4\u0010\u0092\u00d6\u00ea\u0082\u000b\u00ef\u0091\u009ftR\u00e2T\u00123w\u00d7\u0018\\\u00f6\u0084p\u00ba\u00b7\u00c8\u00b2f\u00ba\u0093\u00e2\u00fa\u0092\u00f3\u0091\u00f1)2\u00d3w|J\u00e4\u0018\f\u00c7\u00c4`\u001a\u00a4\u00e8\u0083\u00ab\u00f2\b\u00bc\u00d6\u00ab\u0087\u0019\u00e2\u00d0\u0002\u0002\u00d9\u00fc[\u00ec\u0018\u00fc%]\u00e6e\u00dd:\u00d7Y\u007f}\u009bg\u0013\u00ccT\u00d4\u00e09a\u00a5\u00bd\u00c9\u0001\u0010S\u008e\u00ff\u00bej\u00c4\u00b0\u00e7a\u00ece`\u00ff\u00bc\u0005\u00d3\u0018\u00eck\u001b_i\u00d4\u00e6\u001e\u00b1 \u0089Nv\u0015yi7\u0000F!\u00b8P\u00f4\u0014\u00100\u00b2<\u00f6\u000eFN\u00f3l$\u0093 \u00dd_\u0090\u009e\u0018\u00dcZ?.\u00a6q\u00b2\u00af\u007f\u00da\u00cbr\u00e8\u00dez\u008c\u00be\u0014\u00cep\u00d0\u00f0\u00e8\u000f\u0010\u0097*\u00c2\u00e3\u009e8\u008f3\u0093nMU\u0017\u009f\u0096\u00ae\u0018ZDJ\u00e1\u00ab\u00e5\u00c2x\u0088\u000f\u00de1\u00b6 n\u001a\u0092\u00ce%\u00aa\u00e72\u000e\u0014\u0010\u00aa\u00c8\u00ec\u0087\u008c;\u00b9\u00ff\u0082\u0007\u0011\u00a3l\u00fdT\u00cc\u0010\u00c9q\u000b\u00f9\\'t\u00ba\u0082M\u00c2_jPL\u0017\u0010\u00ee\u00af\u000fX\u00f9\u00c0\u00fa~L\u0082\u001d\u00beO\u00eb2s\u0010\u000f\u0097\u00fb\u000b\u008a\u0016\u00eb\u00e2\u0084\u008e\u00bat\u009c;\u00b1\u0083\u0018!\u00c1\u0017!\u0000\u00e4\u00cb7\u0087\u00e9\u0001\u0094\u000f\u00a3O^LKu\u00ff\u00ce_|\u00f0\u0010\u00da\u00cc&\u0095r\u001e\u0097\u00a7\u00c7\u00df\n\"\u00f8\u00c0\u00b9\u0019\u0010\u00d1\u00ef\u00fdW\u00cf\u00bcR\u00dd\u00a5\u00a6\u00dc]9\u0017\u00d5\u00f2\u0010\u00a9\u009cHH\u00c9R\u00c8\u00e1c\u001e\u00df\u00c7-\u0095\u0093\u00d8\u0010\u00b9j\u00f6\u000e\u00a3\u00f2A\u007f\u0080\u0014E\u00e2\u00c2%#\u001d\u0018Q\u00e5^\u00ce\u0089\u00f8\u00c4;\u00dc\u0016\u00a4\u0013\u008e8\u00b4\u008e\u00e9:\u00f6\u00ba\u00ff\u00cb\u00b8\u009b\u00106\u00d5$\u00e5\u0018\u00eb\u00ad>U\u00c8\u008d\u0081\u00e3\u00b7\u000bf\u0018M\u00faS\u00981\u00ff\u009d\u00cb\u00e1\u008ezF]\"\u00d3)\r\u00f4c\u001eM\u001f2\u00e7\u0010\u0010d\u00ae\u0000^\u00c8}\u009b\u00b2\u00ba>\u00ed\u00ab\u0017\u00b04\u0010\u001b\u0090C\u0097\u00b7\"Cp\u00bfzO\b\u008d\u00e3\u000e\"\u0010\u00a6\u008el\u00ea\u0085\u00ea\u00a0\u0007Y\u0012\u000e\b\u001e\u009bCm\u0010\u00ff\u00e8\u008c\"\u00b4d\u0004c\u0080\u00a1\u00d0\u00aah\u0084\u009a\f \u00cf\u0096X\u00f5\u00c4\u00f0)\u00f5m\u00be\f\u00e9\u008c\u0010\u0081\t\u00c7\u00d4p\u00a6X\u00ed\u00b4&do@\u00c0\u00a3R\u009bf\u0010\u00c2\u00f3o\u00b4\u000f\u00c4\u009b$jSt\u00ca\u0010l]\u00fc\u0018\u00bd~0\u009b\u00c3\u00aei\u0083\u00b9\u00d7C<\u00bao\u007f\u001e\u00b1K\u00a3\u00cbX\u00b7\u00ba\u0096\u0010\u00a9\u00ed\u00a9\u00e3/\u00de}{\u00e6\u0006\u00f1\u00b0\u0013\t\u0006\u0094\u0018\u00d2\u00e7\u00dd\u00f5\u00ea\u00c3\u00dc1\u0003\u00ffsM1\u00fbv\u0003<\u00d0\u0016K\u008dH\u00a4\u00eb\u0010\u00d5\u009a\u00f0\u00b7\u00f7\u00bf\u00ac\u0001\u001e\u00ec&\u0097\u00b8\u0085\u00cf\u009a\be,\u00e9oc\u0010>\u00de\u0010\u00c3\u00f4\u00c9\u0018L\u0016T\u009a\u0019\u00c9Z\u0005\u0018\u0001$S\u0010\u00b3\u00cb;cN\u0096\u00ac\u00e1\u0087\u00a3\u00b6\u0002b\t6\u009f\u0018\u00b9\u007f/\u0019\u00e6\u00d2\u00153\u00b4\u001b\u00ee\ft\u00f4s\u0089\u0004\u00e8\u00ea\u0019\u000b\u00dc7\u0094\u0018\u00c5c\u00f9'\u00cc\u00c1\u00b4\u00a0\u00fe\u00eec\u0084\u00f1\u00c7(\u0000\u0088\u00ba#'v\u00ed\u00ce\u00a0\u0018\u0092\u00d6\u00ea\u0082\u000b\u00ef\u0091\u009f\u00d4\u0086\u00c2T\u009e\u00e5\u00b4M\u00c2\u00db\u00ddp\u00b4\b\u00f5\u001b\u0010\\\u00f6\u0084p\u00ba\u00b7\u00c8\u00b2\u0094\u000f\u00e7o\u009d\u00c2b\u00f1\u0010\u001e\u0089r\u00b1\u00de\u009b]\u00faQ\u00a7\u00f1m9-\u0011\u00fe\u0010\u00d1b\u00145H\u0002\u0005\u00a5\u00eaj\u0093\u00dbC*\u00dcE\u0018z\u0014B3\u0016d\u00da\u00ca\u00eb\u00c6dhI\n\u00f6\u00cbR\u00c6\u00e4\u00a6\u0004O\u00e3\u00c5\u0010\u00ec\u00ea\u0002\u00ca\u0087\u00f9\u00b0\u0002D\u00a0@x\u0085Kl]\u0010\u0003\u007f\u00e7\u0015!\u008f/\u0088\u00ee\u00bfx\u0080k\u000f\u00df*\b\u008d\r\u00a9\u0010\u0088\u0095\"-\u0010U\u001d'YG\u009d)\u00a2\u00a59\u00f3f\u001e\u00aeL\u00cb".length();
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
                            var11_3[var17_4++] = CP_v6.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u0086\u00fd\u0093\u00b9Q]\u00df\u00a8\u00e0\u008fH\u0090g#{hy\u0000!\nL\u0004\u00f6\u00da\u0010\u00e2}\u0080Z\u00a8h\u00b2\u0080C-T\u00a6\u00feL)\u00ba";
                            var18_6 = "\u0086\u00fd\u0093\u00b9Q]\u00df\u00a8\u00e0\u008fH\u0090g#{hy\u0000!\nL\u0004\u00f6\u00da\u0010\u00e2}\u0080Z\u00a8h\u00b2\u0080C-T\u00a6\u00feL)\u00ba".length();
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
                            var11_3[var17_4++] = CP_v6.a(var19_9).intern();
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
                CP_v6.d = new HashMap<K, V>(13);
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
                var6_12 = new long[141];
                var3_13 = 0;
                var4_14 = "v\u00877\u00d5\u0091\u0096\u00ddh\u001b\u00e9\u00f3\u0083Pe\rT\u00a6\u00df06\u00c5\u00fdv:\u00f7|>g\b\u0081\u0092,\u009f\n\u00851\u0087S\u00ea\u00d9\u001c\u000b\u00fd\u0094< \u0085\u00b1\u0003d`\u00b5\u0089\u0099s\u007fB\u008f'$\u0092eNW\u00be\u00ed\u00ec\u00efI\u00b2\u00a7\u00b8\u001e\u00c0\u0014a-N\u0094-\u00b1\u001a}Q \u0002A\u009b\u00c0M\u008f\u0094t\u0007\u009eMn\u00bd\u00a0\u0095uX\u0016\u00b3A\u009bHI(\u0081T\u00c6\f\u00beu\u00f1\u00ec\u00fevBP\u00eb_\u0090.\u001c\u009a\u00de9\u00a8\u00d2F[\u00d2R!.\u009dWh\u00fb\u00d7\u0015\u0094\u009c&\u00b3\u0090\u00c1\r\u009ex\u0018\u00e7V8\u00de\u0015\f\u0019'[-\u00f6PWw\u00b4\u0006\u00c3\u0082\u0086~mgU\u00dc]\u00bdG\u00dc\u00dbW\u00a1l\u00bf\u0093\u00ef\u0090\u00cc\u00fb=\u009den\u00fb\u00d0\u00e3&/S\u00e3m2o\u00bc\u0099G\u007f\u00a31\u0099W@\u0012\u0092\u00d3\u00bf\u0005\u00a2\u00d6\u00f1Ye\u00bag\u001d\u00d9\u00e6\u0086Q\u0084\u00a7\u00d5uk\u00ca\u00db\u00e9\u0083\u007f\u00fd\u00c5\u008cL\u00d7]{6t\u00caW\u00827c\u00d1\u0095\u00c8A\u00d0bS\u00f3{\u000f\u0015-a\n\u00ef\u00d6\u00c8^\u00dd\u00de\u001d\u00ea\u0088\u0091\t\u00b7E\u00a5\u00e8\u00936-f\u0082\u001dV\u00b3!\u00c2b\u00eb\u00d5O\u00e4\u0086\u00d1k\u0098\u001f\u009c\u0086!\u007f\u00a7\u009c\u00f6\u0010\u00cev5R\u009c\u0003\u00e5\u00dc\u0096\u00e3*\u0093\u00c2=\u00b8-\u00beH\u00bcO\u00c3$\u00c8\u00a7\u00ba\u00d8\u00914\u00e1=Y\u0019O\u001d\\\u00fda\u00cd\u00e2\u00a1\u0018u=\u0017y\u00e3{$p[^\u00af\u00fc>;R\u0088Be<&\u00c5\u00c4=\u00f8\u00e3\u00d2\u00c9\u0015\u0018S\u009d\u00d5\u00fd\u00ca\u007f\tL\u000e\u0014\u00c4\u0095gW\u00da\u0096\u008f\u00fb@\u00eb\u00e0\u00055\u008a\u0089H[\u00e7}\u008eJU\u00a6\u0081\u000e\u00b8\u00c6\u00fe\u00fd&\u0081\u0018\u00f9C\u00fd\u00ee\u0012\u0091\u0089\u00c8\u00eb;\u00d0\u00a7\u00cag\u0093\u0092\u00b7+\u0083\u0096 3\u00ed\u000eO\u0098\u0013E\u00b2{\u0084\u00fd\u0096B\u00e94\u00da\u00d6\u0015\u00a5\u0016e\"\u00e4\u0080\u00d5c\u00a7\u001f\u00bbK\u009cw\u0003\u00c8.\u0091@C?\u00ae\u00aa\u0092\u0090\u00a1\t\u00ac\u0004\u00fcNS\u00b0\u00deK\u00bb\u0004d\u00c6\u00af\u0094\u00e0W6W\u00c5\u008e%\u00e4\u00c7\u00c1\u00ae\u00f1\u00a2X>\u00bb\u0095\u0096\u00b4\u00d4r\u00f3\u00fc\u00dc#\u009b\u00c2r\u00b9\u00af\u00a0N\\\u00b1\u00be\u0006\u00f3\u00f4\u009a\u00f7 \u00e9x\u001e`V?\u000f\u00cfYk\u00f9\u00b7~\u0005\u00baz\u00c9\u001cW\u00d7\u00ab\u00a9\u0089<\u008ai|l\u00fb\u00de;\u00d9 \u0090\u0094=\u00ddX\u0092\u00ea\u00b8\u000eyV2\u00b7\u0012{\u0006\u00d0\u0084\u0002\u0094\u000b$^\u0004\u009b\u008a\u0004\u00d6\u00da\u00b7\u00ee\u00c0\u001bnQk\u001fK\u0092P\u00a1|\u00b8t$\u00c0m\u0010\u0083\u00abD\u00a0\u00c12A\u00c8\u00feq\u00f5\u00c88\u00aaX\u00f3jdi\\\u00ce<\u00f5j\u00b3\u00b5\by!,er\u00dc\u009f\u00f2}\u00bd\u00d2\u008eF\u00df\u008c\u00ce\u00a7\f\u00bc6\u00e4\u00d9x\u0003\u00d4{\u00f0\u00c2xxu\u00f5\u00b3\u00b8\u00a3\u000b\u00c9/\u00af\u0014(\u00ef\u00c0a#\u00b6\\\u00e5\u00a2\u00e5)\u00fd\u00d8\u00ff2U9|\u0013\u00ab,\u00d7\u00ea^f=\u008fw\u000f\u00c8N\u00d5\u00e6\u00f6ip\u0002.o\u000f[\t%\u00c0\u008b!Kv\u00ef\u00d0\u0012k\u001f\u0014\u0003\u00c0\u00ce\u00c6\u00b9\u00e9F\u00c8\u00ba\u00ee{0\u00e0x\u0002k\u00a2S\u00a3q\u00cd\u00c5\u00b4\u00bbXEm\u00d8}\u00fc+|\u00b7\u00fb\u001c\u00aey\u00d6\u00d1Ci\u001a-\u00ea0(\u00f6>\u0013\u00d5\u00d6\u001d\u0092\u001f\u00c9$o\u008a\u00e7\u009e \u008c\u001e\u00ecM(\u00f0\u00f9\u00ae\u00ba\u0000\u00cdQ\u0092\u0093\u00aa\u00ffA\u0005\f\u00f0\u001a\u0017\u00e7\u00986\u00c0\u00e2\u008c\u00ddE\u00eaU\u001d\u009f\u0014\t\u00f0\u00da\u00e1d\u00d5\u00fbz\u00b3E \u00eaN\u00d7=C\u00f6\u0088\u00ba\u0091g\u00cc\u00f5\u00f93\u00b3\n\u00d2\u00bb|\u008bB\u00cb7\u00a5\u00e2\u00fb\u00ad\u0019\u00ff6\u00ferb7\u001d\u00d6v#5C/F\u00b2\u009e_P\u00d80\u000bJ\u0002\u00a6\u00c7\u0091\u00ba=P\u00f6\u00b9\u00ff\u00d8\u00fc\u00fdr\u00ccp\u008a;\u0000\u008c1J\u00d7\u001a\u0085\u00c3\u0084\u00beL\u0088E\u0016\u00b4\u00a9\u009e\u00d4\u00e9~\u008c\u00e1a\u0099^\u00aa\u00a5s\u00a5\u00b4o\u00c9P\u00ea\u0083v!\u007f\u00c2\u00bd\u0098\u00e7R\u008by\u00e3\u00e8\u00e1\u00c4i\u0093\u00ca\u00a7\u0088\u00bej\u000fS8\u00ed!^\u0095@l8H\u00ad\u00a1\u0093|\u00f8\u00e0;\u00f7W\u00a9\u0083\u00bf\u00f9\u00be\u00e9\u00adBq\u009dy[\u0016\u001ap\u00ecJ`\u0088\u00db\u0094\u00f8Ypz\u00d5\u0082\u00ad\u00ae\u00ed\n\u0085\u00c7\u008c*\u0091NV\u00cd\u0093\u001a\u009aRx\u00f5\u00c7\u00d3%L\u008cq\u00edI\u00b8t\u008b\u000b\u00a5G\u0081E\u009c\u00dd\u001c\u00c0hd\u00ad\u0091\u008a\u00c8\u00fb\u00c2*\u00047\u00db-:*\u00b1\r\u00f2\u00e3f\u00b8\u00aaA\u0007\u00ab{\u00d11\u00d7\u008e|\u00a8\u008cG\u00e8k\u00e2v\u00b1\u00d8\u009c\u00a2R\u00e7\u00fb\u0014\u00ab\u00c0k";
                var5_15 = "v\u00877\u00d5\u0091\u0096\u00ddh\u001b\u00e9\u00f3\u0083Pe\rT\u00a6\u00df06\u00c5\u00fdv:\u00f7|>g\b\u0081\u0092,\u009f\n\u00851\u0087S\u00ea\u00d9\u001c\u000b\u00fd\u0094< \u0085\u00b1\u0003d`\u00b5\u0089\u0099s\u007fB\u008f'$\u0092eNW\u00be\u00ed\u00ec\u00efI\u00b2\u00a7\u00b8\u001e\u00c0\u0014a-N\u0094-\u00b1\u001a}Q \u0002A\u009b\u00c0M\u008f\u0094t\u0007\u009eMn\u00bd\u00a0\u0095uX\u0016\u00b3A\u009bHI(\u0081T\u00c6\f\u00beu\u00f1\u00ec\u00fevBP\u00eb_\u0090.\u001c\u009a\u00de9\u00a8\u00d2F[\u00d2R!.\u009dWh\u00fb\u00d7\u0015\u0094\u009c&\u00b3\u0090\u00c1\r\u009ex\u0018\u00e7V8\u00de\u0015\f\u0019'[-\u00f6PWw\u00b4\u0006\u00c3\u0082\u0086~mgU\u00dc]\u00bdG\u00dc\u00dbW\u00a1l\u00bf\u0093\u00ef\u0090\u00cc\u00fb=\u009den\u00fb\u00d0\u00e3&/S\u00e3m2o\u00bc\u0099G\u007f\u00a31\u0099W@\u0012\u0092\u00d3\u00bf\u0005\u00a2\u00d6\u00f1Ye\u00bag\u001d\u00d9\u00e6\u0086Q\u0084\u00a7\u00d5uk\u00ca\u00db\u00e9\u0083\u007f\u00fd\u00c5\u008cL\u00d7]{6t\u00caW\u00827c\u00d1\u0095\u00c8A\u00d0bS\u00f3{\u000f\u0015-a\n\u00ef\u00d6\u00c8^\u00dd\u00de\u001d\u00ea\u0088\u0091\t\u00b7E\u00a5\u00e8\u00936-f\u0082\u001dV\u00b3!\u00c2b\u00eb\u00d5O\u00e4\u0086\u00d1k\u0098\u001f\u009c\u0086!\u007f\u00a7\u009c\u00f6\u0010\u00cev5R\u009c\u0003\u00e5\u00dc\u0096\u00e3*\u0093\u00c2=\u00b8-\u00beH\u00bcO\u00c3$\u00c8\u00a7\u00ba\u00d8\u00914\u00e1=Y\u0019O\u001d\\\u00fda\u00cd\u00e2\u00a1\u0018u=\u0017y\u00e3{$p[^\u00af\u00fc>;R\u0088Be<&\u00c5\u00c4=\u00f8\u00e3\u00d2\u00c9\u0015\u0018S\u009d\u00d5\u00fd\u00ca\u007f\tL\u000e\u0014\u00c4\u0095gW\u00da\u0096\u008f\u00fb@\u00eb\u00e0\u00055\u008a\u0089H[\u00e7}\u008eJU\u00a6\u0081\u000e\u00b8\u00c6\u00fe\u00fd&\u0081\u0018\u00f9C\u00fd\u00ee\u0012\u0091\u0089\u00c8\u00eb;\u00d0\u00a7\u00cag\u0093\u0092\u00b7+\u0083\u0096 3\u00ed\u000eO\u0098\u0013E\u00b2{\u0084\u00fd\u0096B\u00e94\u00da\u00d6\u0015\u00a5\u0016e\"\u00e4\u0080\u00d5c\u00a7\u001f\u00bbK\u009cw\u0003\u00c8.\u0091@C?\u00ae\u00aa\u0092\u0090\u00a1\t\u00ac\u0004\u00fcNS\u00b0\u00deK\u00bb\u0004d\u00c6\u00af\u0094\u00e0W6W\u00c5\u008e%\u00e4\u00c7\u00c1\u00ae\u00f1\u00a2X>\u00bb\u0095\u0096\u00b4\u00d4r\u00f3\u00fc\u00dc#\u009b\u00c2r\u00b9\u00af\u00a0N\\\u00b1\u00be\u0006\u00f3\u00f4\u009a\u00f7 \u00e9x\u001e`V?\u000f\u00cfYk\u00f9\u00b7~\u0005\u00baz\u00c9\u001cW\u00d7\u00ab\u00a9\u0089<\u008ai|l\u00fb\u00de;\u00d9 \u0090\u0094=\u00ddX\u0092\u00ea\u00b8\u000eyV2\u00b7\u0012{\u0006\u00d0\u0084\u0002\u0094\u000b$^\u0004\u009b\u008a\u0004\u00d6\u00da\u00b7\u00ee\u00c0\u001bnQk\u001fK\u0092P\u00a1|\u00b8t$\u00c0m\u0010\u0083\u00abD\u00a0\u00c12A\u00c8\u00feq\u00f5\u00c88\u00aaX\u00f3jdi\\\u00ce<\u00f5j\u00b3\u00b5\by!,er\u00dc\u009f\u00f2}\u00bd\u00d2\u008eF\u00df\u008c\u00ce\u00a7\f\u00bc6\u00e4\u00d9x\u0003\u00d4{\u00f0\u00c2xxu\u00f5\u00b3\u00b8\u00a3\u000b\u00c9/\u00af\u0014(\u00ef\u00c0a#\u00b6\\\u00e5\u00a2\u00e5)\u00fd\u00d8\u00ff2U9|\u0013\u00ab,\u00d7\u00ea^f=\u008fw\u000f\u00c8N\u00d5\u00e6\u00f6ip\u0002.o\u000f[\t%\u00c0\u008b!Kv\u00ef\u00d0\u0012k\u001f\u0014\u0003\u00c0\u00ce\u00c6\u00b9\u00e9F\u00c8\u00ba\u00ee{0\u00e0x\u0002k\u00a2S\u00a3q\u00cd\u00c5\u00b4\u00bbXEm\u00d8}\u00fc+|\u00b7\u00fb\u001c\u00aey\u00d6\u00d1Ci\u001a-\u00ea0(\u00f6>\u0013\u00d5\u00d6\u001d\u0092\u001f\u00c9$o\u008a\u00e7\u009e \u008c\u001e\u00ecM(\u00f0\u00f9\u00ae\u00ba\u0000\u00cdQ\u0092\u0093\u00aa\u00ffA\u0005\f\u00f0\u001a\u0017\u00e7\u00986\u00c0\u00e2\u008c\u00ddE\u00eaU\u001d\u009f\u0014\t\u00f0\u00da\u00e1d\u00d5\u00fbz\u00b3E \u00eaN\u00d7=C\u00f6\u0088\u00ba\u0091g\u00cc\u00f5\u00f93\u00b3\n\u00d2\u00bb|\u008bB\u00cb7\u00a5\u00e2\u00fb\u00ad\u0019\u00ff6\u00ferb7\u001d\u00d6v#5C/F\u00b2\u009e_P\u00d80\u000bJ\u0002\u00a6\u00c7\u0091\u00ba=P\u00f6\u00b9\u00ff\u00d8\u00fc\u00fdr\u00ccp\u008a;\u0000\u008c1J\u00d7\u001a\u0085\u00c3\u0084\u00beL\u0088E\u0016\u00b4\u00a9\u009e\u00d4\u00e9~\u008c\u00e1a\u0099^\u00aa\u00a5s\u00a5\u00b4o\u00c9P\u00ea\u0083v!\u007f\u00c2\u00bd\u0098\u00e7R\u008by\u00e3\u00e8\u00e1\u00c4i\u0093\u00ca\u00a7\u0088\u00bej\u000fS8\u00ed!^\u0095@l8H\u00ad\u00a1\u0093|\u00f8\u00e0;\u00f7W\u00a9\u0083\u00bf\u00f9\u00be\u00e9\u00adBq\u009dy[\u0016\u001ap\u00ecJ`\u0088\u00db\u0094\u00f8Ypz\u00d5\u0082\u00ad\u00ae\u00ed\n\u0085\u00c7\u008c*\u0091NV\u00cd\u0093\u001a\u009aRx\u00f5\u00c7\u00d3%L\u008cq\u00edI\u00b8t\u008b\u000b\u00a5G\u0081E\u009c\u00dd\u001c\u00c0hd\u00ad\u0091\u008a\u00c8\u00fb\u00c2*\u00047\u00db-:*\u00b1\r\u00f2\u00e3f\u00b8\u00aaA\u0007\u00ab{\u00d11\u00d7\u008e|\u00a8\u008cG\u00e8k\u00e2v\u00b1\u00d8\u009c\u00a2R\u00e7\u00fb\u0014\u00ab\u00c0k".length();
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
                    var4_14 = "QlC_if-\u0090\u009a\u00ba\u00ba\u00e7Q\u008dP\u0080";
                    var5_15 = "QlC_if-\u0090\u009a\u00ba\u00ba\u00e7Q\u008dP\u0080".length();
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
        CP_v6.b = var6_12;
        CP_v6.c = new Integer[141];
        CP_v6.SPAWN_ENTITY = new CP_v6();
        CP_v6.SPAWN_EXPERIENCE_ORB = new CP_v6();
        CP_v6.SPAWN_WEATHER_ENTITY = new CP_v6();
        CP_v6.SPAWN_LIVING_ENTITY = new CP_v6();
        CP_v6.SPAWN_PAINTING = new CP_v6();
        CP_v6.SPAWN_PLAYER = new CP_v6();
        CP_v6.ENTITY_ANIMATION = new CP_v6();
        CP_v6.STATISTICS = new CP_v6();
        CP_v6.BLOCK_BREAK_ANIMATION = new CP_v6();
        CP_v6.BLOCK_ENTITY_DATA = new CP_v6();
        CP_v6.BLOCK_ACTION = new CP_v6();
        CP_v6.BLOCK_CHANGE = new CP_v6();
        CP_v6.BOSS_BAR = new CP_v6();
        CP_v6.SERVER_DIFFICULTY = new CP_v6();
        CP_v6.TAB_COMPLETE = new CP_v6();
        CP_v6.CHAT_MESSAGE = new CP_v6();
        CP_v6.MULTI_BLOCK_CHANGE = new CP_v6();
        CP_v6.WINDOW_CONFIRMATION = new CP_v6();
        CP_v6.CLOSE_WINDOW = new CP_v6();
        CP_v6.OPEN_WINDOW = new CP_v6();
        CP_v6.WINDOW_ITEMS = new CP_v6();
        CP_v6.WINDOW_PROPERTY = new CP_v6();
        CP_v6.SET_SLOT = new CP_v6();
        CP_v6.SET_COOLDOWN = new CP_v6();
        CP_v6.PLUGIN_MESSAGE = new CP_v6();
        CP_v6.NAMED_SOUND_EFFECT = new CP_v6();
        CP_v6.DISCONNECT = new CP_v6();
        CP_v6.ENTITY_STATUS = new CP_v6();
        CP_v6.EXPLOSION = new CP_v6();
        CP_v6.UNLOAD_CHUNK = new CP_v6();
        CP_v6.CHANGE_GAME_STATE = new CP_v6();
        CP_v6.KEEP_ALIVE = new CP_v6();
        CP_v6.CHUNK_DATA = new CP_v6();
        CP_v6.EFFECT = new CP_v6();
        CP_v6.PARTICLE = new CP_v6();
        CP_v6.JOIN_GAME = new CP_v6();
        CP_v6.MAP_DATA = new CP_v6();
        CP_v6.ENTITY_RELATIVE_MOVE = new CP_v6();
        CP_v6.ENTITY_RELATIVE_MOVE_AND_ROTATION = new CP_v6();
        CP_v6.ENTITY_ROTATION = new CP_v6();
        CP_v6.ENTITY_MOVEMENT = new CP_v6();
        CP_v6.VEHICLE_MOVE = new CP_v6();
        CP_v6.OPEN_SIGN_EDITOR = new CP_v6();
        CP_v6.PLAYER_ABILITIES = new CP_v6();
        CP_v6.COMBAT_EVENT = new CP_v6();
        CP_v6.PLAYER_INFO = new CP_v6();
        CP_v6.PLAYER_POSITION_AND_LOOK = new CP_v6();
        CP_v6.USE_BED = new CP_v6();
        CP_v6.DESTROY_ENTITIES = new CP_v6();
        CP_v6.REMOVE_ENTITY_EFFECT = new CP_v6();
        CP_v6.RESOURCE_PACK_SEND = new CP_v6();
        CP_v6.RESPAWN = new CP_v6();
        CP_v6.ENTITY_HEAD_LOOK = new CP_v6();
        CP_v6.WORLD_BORDER = new CP_v6();
        CP_v6.CAMERA = new CP_v6();
        CP_v6.HELD_ITEM_CHANGE = new CP_v6();
        CP_v6.DISPLAY_SCOREBOARD = new CP_v6();
        CP_v6.ENTITY_METADATA = new CP_v6();
        CP_v6.ATTACH_ENTITY = new CP_v6();
        CP_v6.ENTITY_VELOCITY = new CP_v6();
        CP_v6.ENTITY_EQUIPMENT = new CP_v6();
        CP_v6.SET_EXPERIENCE = new CP_v6();
        CP_v6.UPDATE_HEALTH = new CP_v6();
        CP_v6.SCOREBOARD_OBJECTIVE = new CP_v6();
        CP_v6.SET_PASSENGERS = new CP_v6();
        CP_v6.TEAMS = new CP_v6();
        CP_v6.UPDATE_SCORE = new CP_v6();
        CP_v6.SPAWN_POSITION = new CP_v6();
        CP_v6.TIME_UPDATE = new CP_v6();
        CP_v6.TITLE = new CP_v6();
        CP_v6.SOUND_EFFECT = new CP_v6();
        CP_v6.PLAYER_LIST_HEADER_AND_FOOTER = new CP_v6();
        CP_v6.COLLECT_ITEM = new CP_v6();
        CP_v6.ENTITY_TELEPORT = new CP_v6();
        CP_v6.UPDATE_ATTRIBUTES = new CP_v6();
        CP_v6.ENTITY_EFFECT = new CP_v6();
        CP_v6.CP_M = CP_v6.CP_A();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1636;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_v6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_v6.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_v6.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_v6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_v6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

