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

public final class CP_f4
extends Enum<CP_f4> {
    public static final /* enum */ CP_f4 BUNDLE;
    public static final /* enum */ CP_f4 SPAWN_ENTITY;
    public static final /* enum */ CP_f4 SPAWN_EXPERIENCE_ORB;
    public static final /* enum */ CP_f4 SPAWN_PLAYER;
    public static final /* enum */ CP_f4 ENTITY_ANIMATION;
    public static final /* enum */ CP_f4 STATISTICS;
    public static final /* enum */ CP_f4 ACKNOWLEDGE_BLOCK_CHANGES;
    public static final /* enum */ CP_f4 BLOCK_BREAK_ANIMATION;
    public static final /* enum */ CP_f4 BLOCK_ENTITY_DATA;
    public static final /* enum */ CP_f4 BLOCK_ACTION;
    public static final /* enum */ CP_f4 BLOCK_CHANGE;
    public static final /* enum */ CP_f4 BOSS_BAR;
    public static final /* enum */ CP_f4 SERVER_DIFFICULTY;
    public static final /* enum */ CP_f4 CHUNK_BIOMES;
    public static final /* enum */ CP_f4 CLEAR_TITLES;
    public static final /* enum */ CP_f4 TAB_COMPLETE;
    public static final /* enum */ CP_f4 DECLARE_COMMANDS;
    public static final /* enum */ CP_f4 CLOSE_WINDOW;
    public static final /* enum */ CP_f4 WINDOW_ITEMS;
    public static final /* enum */ CP_f4 WINDOW_PROPERTY;
    public static final /* enum */ CP_f4 SET_SLOT;
    public static final /* enum */ CP_f4 SET_COOLDOWN;
    public static final /* enum */ CP_f4 CUSTOM_CHAT_COMPLETIONS;
    public static final /* enum */ CP_f4 PLUGIN_MESSAGE;
    public static final /* enum */ CP_f4 DAMAGE_EVENT;
    public static final /* enum */ CP_f4 DELETE_CHAT;
    public static final /* enum */ CP_f4 DISCONNECT;
    public static final /* enum */ CP_f4 DISGUISED_CHAT;
    public static final /* enum */ CP_f4 ENTITY_STATUS;
    public static final /* enum */ CP_f4 EXPLOSION;
    public static final /* enum */ CP_f4 UNLOAD_CHUNK;
    public static final /* enum */ CP_f4 CHANGE_GAME_STATE;
    public static final /* enum */ CP_f4 OPEN_HORSE_WINDOW;
    public static final /* enum */ CP_f4 HURT_ANIMATION;
    public static final /* enum */ CP_f4 INITIALIZE_WORLD_BORDER;
    public static final /* enum */ CP_f4 KEEP_ALIVE;
    public static final /* enum */ CP_f4 CHUNK_DATA;
    public static final /* enum */ CP_f4 EFFECT;
    public static final /* enum */ CP_f4 PARTICLE;
    public static final /* enum */ CP_f4 UPDATE_LIGHT;
    public static final /* enum */ CP_f4 JOIN_GAME;
    public static final /* enum */ CP_f4 MAP_DATA;
    public static final /* enum */ CP_f4 MERCHANT_OFFERS;
    public static final /* enum */ CP_f4 ENTITY_RELATIVE_MOVE;
    public static final /* enum */ CP_f4 ENTITY_RELATIVE_MOVE_AND_ROTATION;
    public static final /* enum */ CP_f4 ENTITY_ROTATION;
    public static final /* enum */ CP_f4 VEHICLE_MOVE;
    public static final /* enum */ CP_f4 OPEN_BOOK;
    public static final /* enum */ CP_f4 OPEN_WINDOW;
    public static final /* enum */ CP_f4 OPEN_SIGN_EDITOR;
    public static final /* enum */ CP_f4 PING;
    public static final /* enum */ CP_f4 CRAFT_RECIPE_RESPONSE;
    public static final /* enum */ CP_f4 PLAYER_ABILITIES;
    public static final /* enum */ CP_f4 CHAT_MESSAGE;
    public static final /* enum */ CP_f4 END_COMBAT_EVENT;
    public static final /* enum */ CP_f4 ENTER_COMBAT_EVENT;
    public static final /* enum */ CP_f4 DEATH_COMBAT_EVENT;
    public static final /* enum */ CP_f4 PLAYER_INFO_REMOVE;
    public static final /* enum */ CP_f4 PLAYER_INFO_UPDATE;
    public static final /* enum */ CP_f4 FACE_PLAYER;
    public static final /* enum */ CP_f4 PLAYER_POSITION_AND_LOOK;
    public static final /* enum */ CP_f4 UNLOCK_RECIPES;
    public static final /* enum */ CP_f4 DESTROY_ENTITIES;
    public static final /* enum */ CP_f4 REMOVE_ENTITY_EFFECT;
    public static final /* enum */ CP_f4 RESOURCE_PACK_SEND;
    public static final /* enum */ CP_f4 RESPAWN;
    public static final /* enum */ CP_f4 ENTITY_HEAD_LOOK;
    public static final /* enum */ CP_f4 MULTI_BLOCK_CHANGE;
    public static final /* enum */ CP_f4 SELECT_ADVANCEMENTS_TAB;
    public static final /* enum */ CP_f4 SERVER_DATA;
    public static final /* enum */ CP_f4 ACTION_BAR;
    public static final /* enum */ CP_f4 WORLD_BORDER_CENTER;
    public static final /* enum */ CP_f4 WORLD_BORDER_LERP_SIZE;
    public static final /* enum */ CP_f4 WORLD_BORDER_SIZE;
    public static final /* enum */ CP_f4 WORLD_BORDER_WARNING_DELAY;
    public static final /* enum */ CP_f4 WORLD_BORDER_WARNING_REACH;
    public static final /* enum */ CP_f4 CAMERA;
    public static final /* enum */ CP_f4 HELD_ITEM_CHANGE;
    public static final /* enum */ CP_f4 UPDATE_VIEW_POSITION;
    public static final /* enum */ CP_f4 UPDATE_VIEW_DISTANCE;
    public static final /* enum */ CP_f4 SPAWN_POSITION;
    public static final /* enum */ CP_f4 DISPLAY_SCOREBOARD;
    public static final /* enum */ CP_f4 ENTITY_METADATA;
    public static final /* enum */ CP_f4 ATTACH_ENTITY;
    public static final /* enum */ CP_f4 ENTITY_VELOCITY;
    public static final /* enum */ CP_f4 ENTITY_EQUIPMENT;
    public static final /* enum */ CP_f4 SET_EXPERIENCE;
    public static final /* enum */ CP_f4 UPDATE_HEALTH;
    public static final /* enum */ CP_f4 SCOREBOARD_OBJECTIVE;
    public static final /* enum */ CP_f4 SET_PASSENGERS;
    public static final /* enum */ CP_f4 TEAMS;
    public static final /* enum */ CP_f4 UPDATE_SCORE;
    public static final /* enum */ CP_f4 UPDATE_SIMULATION_DISTANCE;
    public static final /* enum */ CP_f4 SET_TITLE_SUBTITLE;
    public static final /* enum */ CP_f4 TIME_UPDATE;
    public static final /* enum */ CP_f4 SET_TITLE_TEXT;
    public static final /* enum */ CP_f4 SET_TITLE_TIMES;
    public static final /* enum */ CP_f4 ENTITY_SOUND_EFFECT;
    public static final /* enum */ CP_f4 SOUND_EFFECT;
    public static final /* enum */ CP_f4 STOP_SOUND;
    public static final /* enum */ CP_f4 SYSTEM_CHAT_MESSAGE;
    public static final /* enum */ CP_f4 PLAYER_LIST_HEADER_AND_FOOTER;
    public static final /* enum */ CP_f4 NBT_QUERY_RESPONSE;
    public static final /* enum */ CP_f4 COLLECT_ITEM;
    public static final /* enum */ CP_f4 ENTITY_TELEPORT;
    public static final /* enum */ CP_f4 UPDATE_ADVANCEMENTS;
    public static final /* enum */ CP_f4 UPDATE_ATTRIBUTES;
    public static final /* enum */ CP_f4 UPDATE_ENABLED_FEATURES;
    public static final /* enum */ CP_f4 ENTITY_EFFECT;
    public static final /* enum */ CP_f4 DECLARE_RECIPES;
    public static final /* enum */ CP_f4 TAGS;
    private static final /* synthetic */ CP_f4[] CP_e;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static CP_f4[] values() {
        return (CP_f4[])CP_e.clone();
    }

    public static CP_f4 valueOf(String string) {
        return Enum.valueOf(CP_f4.class, string);
    }

    private static /* synthetic */ CP_f4[] CP_S() {
        long l = a ^ 0x4F8F4A1CB8F3L;
        CP_f4[] ilIlf4Array = new CP_f4[CP_f4.a("o", (int)31671, (long)(0x3C212CA4012A7FF9L ^ l))];
        ilIlf4Array[0] = BUNDLE;
        ilIlf4Array[1] = SPAWN_ENTITY;
        ilIlf4Array[2] = SPAWN_EXPERIENCE_ORB;
        ilIlf4Array[3] = SPAWN_PLAYER;
        ilIlf4Array[4] = ENTITY_ANIMATION;
        ilIlf4Array[5] = STATISTICS;
        ilIlf4Array[CP_f4.a("o", (int)7666, (long)(0x30A2ED899BA8190EL ^ l))] = ACKNOWLEDGE_BLOCK_CHANGES;
        ilIlf4Array[CP_f4.a("o", (int)19906, (long)(0x12476DD33324C92CL ^ l))] = BLOCK_BREAK_ANIMATION;
        ilIlf4Array[CP_f4.a("o", (int)31608, (long)(0x4AF616832DBEFFC0L ^ l))] = BLOCK_ENTITY_DATA;
        ilIlf4Array[CP_f4.a("o", (int)1181, (long)(0x318A22C5CE2380BFL ^ l))] = BLOCK_ACTION;
        ilIlf4Array[CP_f4.a("o", (int)20099, (long)(0x4E3E74C656BB4A99L ^ l))] = BLOCK_CHANGE;
        ilIlf4Array[CP_f4.a("o", (int)7805, (long)(0x79669DCA22931A6AL ^ l))] = BOSS_BAR;
        ilIlf4Array[CP_f4.a("o", (int)24204, (long)(0x117C2AE338115AEDL ^ l))] = SERVER_DIFFICULTY;
        ilIlf4Array[CP_f4.a("o", (int)8539, (long)(0x741713D23A542536L ^ l))] = CHUNK_BIOMES;
        ilIlf4Array[CP_f4.a("o", (int)18647, (long)(0x7E580F2426E0CCE0L ^ l))] = CLEAR_TITLES;
        ilIlf4Array[CP_f4.a("o", (int)31216, (long)(0x7AC69CEDDB8BFD32L ^ l))] = TAB_COMPLETE;
        ilIlf4Array[CP_f4.a("o", (int)15186, (long)(0x4195224EFA53BF49L ^ l))] = DECLARE_COMMANDS;
        ilIlf4Array[CP_f4.a("o", (int)9351, (long)(0x4E9577CC07B820E5L ^ l))] = CLOSE_WINDOW;
        ilIlf4Array[CP_f4.a("o", (int)19041, (long)(0x6A892464CC8DCEAEL ^ l))] = WINDOW_ITEMS;
        ilIlf4Array[CP_f4.a("o", (int)11568, (long)(0x7B5F5B726A302904L ^ l))] = WINDOW_PROPERTY;
        ilIlf4Array[CP_f4.a("o", (int)490, (long)(0x248C1DD2046405FAL ^ l))] = SET_SLOT;
        ilIlf4Array[CP_f4.a("o", (int)6790, (long)(0x3DD1680698C81E73L ^ l))] = SET_COOLDOWN;
        ilIlf4Array[CP_f4.a("o", (int)23815, (long)(0x7647E2C52927D9DAL ^ l))] = CUSTOM_CHAT_COMPLETIONS;
        ilIlf4Array[CP_f4.a("o", (int)19008, (long)(0x46985F3237E84EA1L ^ l))] = PLUGIN_MESSAGE;
        ilIlf4Array[CP_f4.a("o", (int)32045, (long)(0x533B33D98553F9D6L ^ l))] = DAMAGE_EVENT;
        ilIlf4Array[CP_f4.a("o", (int)18659, (long)(0x1F4C05661FA64CCCL ^ l))] = DELETE_CHAT;
        ilIlf4Array[CP_f4.a("o", (int)25632, (long)(0x3FDAF0D75AF5E0D7L ^ l))] = DISCONNECT;
        ilIlf4Array[CP_f4.a("o", (int)26557, (long)(0x79F35CBDB28BE3D4L ^ l))] = DISGUISED_CHAT;
        ilIlf4Array[CP_f4.a("o", (int)7639, (long)(0x3707DDC9CE4919D6L ^ l))] = ENTITY_STATUS;
        ilIlf4Array[CP_f4.a("o", (int)22912, (long)(0x750D648DE73B5D85L ^ l))] = EXPLOSION;
        ilIlf4Array[CP_f4.a("o", (int)4441, (long)(0x3A7109BF576154FL ^ l))] = UNLOAD_CHUNK;
        ilIlf4Array[CP_f4.a("o", (int)31490, (long)(0x44A2F3E464D67F39L ^ l))] = CHANGE_GAME_STATE;
        ilIlf4Array[CP_f4.a("o", (int)18247, (long)(0x39555EB99467C322L ^ l))] = OPEN_HORSE_WINDOW;
        ilIlf4Array[CP_f4.a("o", (int)9316, (long)(0x249B173FD424A01CL ^ l))] = HURT_ANIMATION;
        ilIlf4Array[CP_f4.a("o", (int)23906, (long)(0x6D38E2367B64D9D0L ^ l))] = INITIALIZE_WORLD_BORDER;
        ilIlf4Array[CP_f4.a("o", (int)6110, (long)(0x61F5835278C71335L ^ l))] = KEEP_ALIVE;
        ilIlf4Array[CP_f4.a("o", (int)8271, (long)(0x62A4E15E3D92A414L ^ l))] = CHUNK_DATA;
        ilIlf4Array[CP_f4.a("o", (int)11928, (long)(0x6395F011F6102A75L ^ l))] = EFFECT;
        ilIlf4Array[CP_f4.a("o", (int)16902, (long)(0x4B70915DDB2C463EL ^ l))] = PARTICLE;
        ilIlf4Array[CP_f4.a("o", (int)30692, (long)(0x468C4B6537037315L ^ l))] = UPDATE_LIGHT;
        ilIlf4Array[CP_f4.a("o", (int)322, (long)(0x102AE37A4FB5858AL ^ l))] = JOIN_GAME;
        ilIlf4Array[CP_f4.a("o", (int)18565, (long)(0xB90E8993F954CE6L ^ l))] = MAP_DATA;
        ilIlf4Array[CP_f4.a("o", (int)29669, (long)(0x3988E448528D7795L ^ l))] = MERCHANT_OFFERS;
        ilIlf4Array[CP_f4.a("o", (int)3967, (long)(0x4C08832B054A8B3CL ^ l))] = ENTITY_RELATIVE_MOVE;
        ilIlf4Array[CP_f4.a("o", (int)6852, (long)(0x1B3BEB1C52809E28L ^ l))] = ENTITY_RELATIVE_MOVE_AND_ROTATION;
        ilIlf4Array[CP_f4.a("o", (int)28251, (long)(0x708C19E9C916AEDL ^ l))] = ENTITY_ROTATION;
        ilIlf4Array[CP_f4.a("o", (int)17326, (long)(0xFFEE6C4279847A9L ^ l))] = VEHICLE_MOVE;
        ilIlf4Array[CP_f4.a("o", (int)18213, (long)(0x3B358D5688F43FEL ^ l))] = OPEN_BOOK;
        ilIlf4Array[CP_f4.a("o", (int)28471, (long)(0x5B84122D3C306B10L ^ l))] = OPEN_WINDOW;
        ilIlf4Array[CP_f4.a("o", (int)8435, (long)(0x55D1004E9FB4240AL ^ l))] = OPEN_SIGN_EDITOR;
        ilIlf4Array[CP_f4.a("o", (int)19582, (long)(0x22E0E1EABE47C871L ^ l))] = PING;
        ilIlf4Array[CP_f4.a("o", (int)31447, (long)(0x273C9BD354B8FE1EL ^ l))] = CRAFT_RECIPE_RESPONSE;
        ilIlf4Array[CP_f4.a("o", (int)15189, (long)(0x40E5C2E9E29BBFAAL ^ l))] = PLAYER_ABILITIES;
        ilIlf4Array[CP_f4.a("o", (int)17235, (long)(0x5D7ACE470937C715L ^ l))] = CHAT_MESSAGE;
        ilIlf4Array[CP_f4.a("o", (int)13408, (long)(0x163A72309A9B30B8L ^ l))] = END_COMBAT_EVENT;
        ilIlf4Array[CP_f4.a("o", (int)11879, (long)(0x324590B50BF6AA42L ^ l))] = ENTER_COMBAT_EVENT;
        ilIlf4Array[CP_f4.a("o", (int)15410, (long)(0x19DF3747697EB82EL ^ l))] = DEATH_COMBAT_EVENT;
        ilIlf4Array[CP_f4.a("o", (int)23928, (long)(0x3E54AB929B95D9A2L ^ l))] = PLAYER_INFO_REMOVE;
        ilIlf4Array[CP_f4.a("o", (int)14798, (long)(0x66C2EB7C5F573DA1L ^ l))] = PLAYER_INFO_UPDATE;
        ilIlf4Array[CP_f4.a("o", (int)29382, (long)(0x32796EC750F6F626L ^ l))] = FACE_PLAYER;
        ilIlf4Array[CP_f4.a("o", (int)3128, (long)(0x4C2BA8E77D3208C6L ^ l))] = PLAYER_POSITION_AND_LOOK;
        ilIlf4Array[CP_f4.a("o", (int)3470, (long)(0x77A91BC9E6D989A7L ^ l))] = UNLOCK_RECIPES;
        ilIlf4Array[CP_f4.a("o", (int)11433, (long)(0x66AC2950373AA88FL ^ l))] = DESTROY_ENTITIES;
        ilIlf4Array[CP_f4.a("o", (int)19866, (long)(0x2847D82F9147C9F1L ^ l))] = REMOVE_ENTITY_EFFECT;
        ilIlf4Array[CP_f4.a("o", (int)330, (long)(0x735878F861C78515L ^ l))] = RESOURCE_PACK_SEND;
        ilIlf4Array[CP_f4.a("o", (int)646, (long)(0x38E8F038BAA90659L ^ l))] = RESPAWN;
        ilIlf4Array[CP_f4.a("o", (int)28840, (long)(0x3078E649DB45744FL ^ l))] = ENTITY_HEAD_LOOK;
        ilIlf4Array[CP_f4.a("o", (int)277, (long)(0x70005610C7298566L ^ l))] = MULTI_BLOCK_CHANGE;
        ilIlf4Array[CP_f4.a("o", (int)23041, (long)(0x6975EC521341DE6BL ^ l))] = SELECT_ADVANCEMENTS_TAB;
        ilIlf4Array[CP_f4.a("o", (int)17555, (long)(0x5AC10D10905140C9L ^ l))] = SERVER_DATA;
        ilIlf4Array[CP_f4.a("o", (int)7575, (long)(0x17D1AA8DB9A69956L ^ l))] = ACTION_BAR;
        ilIlf4Array[CP_f4.a("o", (int)22050, (long)(0x520360101A62D296L ^ l))] = WORLD_BORDER_CENTER;
        ilIlf4Array[CP_f4.a("o", (int)14800, (long)(0x270A8D5D40843D03L ^ l))] = WORLD_BORDER_LERP_SIZE;
        ilIlf4Array[CP_f4.a("o", (int)18446, (long)(0x2D1EA68CB97C4CDFL ^ l))] = WORLD_BORDER_SIZE;
        ilIlf4Array[CP_f4.a("o", (int)12230, (long)(0x1AFED749E66F2BCFL ^ l))] = WORLD_BORDER_WARNING_DELAY;
        ilIlf4Array[CP_f4.a("o", (int)22654, (long)(0xB79EFECA8885CCEL ^ l))] = WORLD_BORDER_WARNING_REACH;
        ilIlf4Array[CP_f4.a("o", (int)26082, (long)(0x457D135F3CA6E1CAL ^ l))] = CAMERA;
        ilIlf4Array[CP_f4.a("o", (int)20335, (long)(0x6FF43C0ABB6CB38L ^ l))] = HELD_ITEM_CHANGE;
        ilIlf4Array[CP_f4.a("o", (int)17016, (long)(0x69B8873C15404692L ^ l))] = UPDATE_VIEW_POSITION;
        ilIlf4Array[CP_f4.a("o", (int)28962, (long)(0xCCE31C591A7F5FCL ^ l))] = UPDATE_VIEW_DISTANCE;
        ilIlf4Array[CP_f4.a("o", (int)26301, (long)(0x72C0A262F263E24DL ^ l))] = SPAWN_POSITION;
        ilIlf4Array[CP_f4.a("o", (int)28507, (long)(0xD819475EB16B9EL ^ l))] = DISPLAY_SCOREBOARD;
        ilIlf4Array[CP_f4.a("o", (int)10551, (long)(0x6B2E03CA22C5AD8AL ^ l))] = ENTITY_METADATA;
        ilIlf4Array[CP_f4.a("o", (int)12117, (long)(0x50177FD536402BAFL ^ l))] = ATTACH_ENTITY;
        ilIlf4Array[CP_f4.a("o", (int)21314, (long)(0x8CA61726012D708L ^ l))] = ENTITY_VELOCITY;
        ilIlf4Array[CP_f4.a("o", (int)6627, (long)(0x4FFF88AB2FC89D2EL ^ l))] = ENTITY_EQUIPMENT;
        ilIlf4Array[CP_f4.a("o", (int)17615, (long)(0x6553FEA23B1340B4L ^ l))] = SET_EXPERIENCE;
        ilIlf4Array[CP_f4.a("o", (int)32164, (long)(0x22DBFEB1AC5A7970L ^ l))] = UPDATE_HEALTH;
        ilIlf4Array[CP_f4.a("o", (int)12696, (long)(0x511CBD6AF792B57CL ^ l))] = SCOREBOARD_OBJECTIVE;
        ilIlf4Array[CP_f4.a("o", (int)4251, (long)(0x1F472B2484F894DEL ^ l))] = SET_PASSENGERS;
        ilIlf4Array[CP_f4.a("o", (int)6197, (long)(0x580956DA40AC9CC6L ^ l))] = TEAMS;
        ilIlf4Array[CP_f4.a("o", (int)11586, (long)(0x700C5AF9F664A968L ^ l))] = UPDATE_SCORE;
        ilIlf4Array[CP_f4.a("o", (int)21103, (long)(0x2BCD09C58C985686L ^ l))] = UPDATE_SIMULATION_DISTANCE;
        ilIlf4Array[CP_f4.a("o", (int)29024, (long)(0x7F739AD4C5A9F5DEL ^ l))] = SET_TITLE_SUBTITLE;
        ilIlf4Array[CP_f4.a("o", (int)9151, (long)(0x361AB647DC4F270EL ^ l))] = TIME_UPDATE;
        ilIlf4Array[CP_f4.a("o", (int)27685, (long)(0x1619C3B4F50F689AL ^ l))] = SET_TITLE_TEXT;
        ilIlf4Array[CP_f4.a("o", (int)25321, (long)(0xE6CC316AE61669EL ^ l))] = SET_TITLE_TIMES;
        ilIlf4Array[CP_f4.a("o", (int)10937, (long)(0x45434A5785DD2EE0L ^ l))] = ENTITY_SOUND_EFFECT;
        ilIlf4Array[CP_f4.a("o", (int)5993, (long)(0x14F9B5167F4713DEL ^ l))] = SOUND_EFFECT;
        ilIlf4Array[CP_f4.a("o", (int)21430, (long)(0x1C847A0F6638D77CL ^ l))] = STOP_SOUND;
        ilIlf4Array[CP_f4.a("o", (int)26679, (long)(0x2CA562F372146CFCL ^ l))] = SYSTEM_CHAT_MESSAGE;
        ilIlf4Array[CP_f4.a("o", (int)18113, (long)(0xFED54C28581C2FDL ^ l))] = PLAYER_LIST_HEADER_AND_FOOTER;
        ilIlf4Array[CP_f4.a("o", (int)22666, (long)(0x7BA65686156F5C8EL ^ l))] = NBT_QUERY_RESPONSE;
        ilIlf4Array[CP_f4.a("o", (int)7035, (long)(0x37A6683F165D1F2AL ^ l))] = COLLECT_ITEM;
        ilIlf4Array[CP_f4.a("o", (int)7073, (long)(0x6E80A49C47831F53L ^ l))] = ENTITY_TELEPORT;
        ilIlf4Array[CP_f4.a("o", (int)24503, (long)(0x5A75BB67C17FDBD1L ^ l))] = UPDATE_ADVANCEMENTS;
        ilIlf4Array[CP_f4.a("o", (int)1362, (long)(0x373B5D669C47811AL ^ l))] = UPDATE_ATTRIBUTES;
        ilIlf4Array[CP_f4.a("o", (int)13028, (long)(0x46C8916E221636ABL ^ l))] = UPDATE_ENABLED_FEATURES;
        ilIlf4Array[CP_f4.a("o", (int)32230, (long)(0x6235CEAF947AF9D5L ^ l))] = ENTITY_EFFECT;
        ilIlf4Array[CP_f4.a("o", (int)23484, (long)(0x5E88B67415A55FE8L ^ l))] = DECLARE_RECIPES;
        ilIlf4Array[CP_f4.a("o", (int)10320, (long)(0x7C9AA4203A3C2C71L ^ l))] = TAGS;
        return ilIlf4Array;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_f4.a = CP_s.a(1863870511065578836L, 7732562143534902425L, MethodHandles.lookup().lookupClass()).a(147382080603343L);
                        var20 = CP_f4.a ^ 118519810949546L;
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
                        var11_3 = new String[111];
                        var17_4 = 0;
                        var16_5 = "\u00d6\u00f5\u00b2\u00fa\u00ce\u0086q\r5\u0080\u00ef\u0098\u00f11\u00bf\u00d5\u00108\u0081\u00ebK\u001d\u00fa\u00e4|\u00f7\u00de\u0013\u00c3z]\u009eZ\u0010\u0012\u00cb\u00c9\u00b2\u00bfx\u0088\u00f9U\u00ce\u00a9\u00dd4\u00b0\u00b8\u0007\u0018\u00cd\u00ee\u0083\u00bbZM,\u000f\u00e34\u00fe-\u00f9U\u0018E\u0085\u0001\u0019h\u00ba\u00efW\u00e7\u0018\u00f6\u0092L#z\u00e3<\u0098\u00154\u001e\u00a9S\u001e _>\u00bd\u0082\u00c7F\u00b27\u008a\u0010\u008c\f\u0004\u00ad`\u00bc\u00fb\u00a8\u0085U\u008dq\u00a1ik\u00c9\u0010\u008a-\u00bc6\u001c\u00cc\u0095E\u0002\u0005o\u00e2\u009e\u00b1WO\u0010\u00d8\u00e5\u0006\u00d0*\u00fa\u0085\u00f5\u0000\u00bb\u00b8\u00dfF\u00b2\u00b1a\u0010\u00a0\u00d8\t\u0003\u00f1]\u00b4\u00c4\u00f6\u000f\u0010Ne\u00d1[a\u0010\u00ed:9\u00b5\u00ed\u00e1\u008d{\u00ba\u00e2:=\u00cc\u00b9\u001a\u00c0\u0018\u008b\u00d7\u009c\u0002_\u00ea\u00ffU\u00ae{%:\u00c7\u00af\u0093\u00f82\u00c6\u008c\u00c5;\u0015sC\u0018\u008d-'(\u00be\u00ea\u00dc\u0004\u0085m\u0081<\u00d7\u0016\u00b4:\u00f9\u00ceQ\u00d6\u00ad\u00f6\u00ca\u00a1\u0010&\f\u0003\u00ed\u000fx\u00e9\u0016%\u00ff`@\u00e2e\u0012c\u0010\u00deU\u00a7\u00cf\bG\u00b4\u00de\u00e3]\u00c6\u000b\u0080{\u0014T\u0010\u00ab\u0016\n\u00f0\u008e0\u00db\u00c9\u00ed\u00f0\\\u00cdU\u00a8\u00d6\u00b6\u0010\u008f>y\u00949H\u00f9\u00e5\u00d9\\\u00e4\u0081cb\u00b8\u009f\u0018\u00fc\u009fkG\u008e:\b\u0005f\u00e8\\\u0099S\u00b2S\u00c9\u00e4).\u0095{\u008dv\u00c1\u0018_\"\u00ac\u009c\u0096\u0011S\u00e9\u00e70\u00df\u000f\u00f8$?\u0099#\u0090\u001c\u0006\u0092\u0000\u00c9@\u0010\u008b\u00d7\u009c\u0002_\u00ea\u00ffU\u0097\u0087\u00bd1\u0010\u0004\u0094\u0015\u0010h\u00e5\u00d0\u00a4oX2\\\u000fh/,\u0083\u0003io\u0010=O\u00d2\u00b6\u009a\u00bdZ\u00f2\u00ee\u00982\u0018l~8|\u0010\u00b3\u0096)\u008d\u00fc\u0088\u00f7\u00962\u0093\u008aQg\u0002\u00d8\u009f\u0018I|\b\u00c8\u00a4\u0090\u00a5\u00edRp\u00bc\u000f\u00c2\u0019_\u00edE\u0004\u00f2e\u00d0\u00a1\u00d2`\u0010\u0012\u0094M\rC\u0015\u00eaih\u00db\u00ce \u009bz\u00ce\u00d1 \u00f6\u0092L#z\u00e3<\u0098y\u0097\u00a8\u00ee\u00f0>\u00bd\u00bb\"3\u009c\u00e5\u0015\f\u00c4\u009a?\u001d\u00d9(\u00fa\u00b7%\u00fd\u0018Gj\u00aeC\u008bL\u0002\tg\u0005\u00d8\u00e2\u0082\u00cf\u00d0\u00e4\u00a3\u00fe\u00e6M4\u00f3\u008c!\u0010\u0000\u00a8\u0000\u00eb\u009b\u00db\u00f4\u00cae\u00bf\u00a4\u0002\u0094\u00a7=Q\u0010\u00ef6(&d\u0001\f\u00fepk\u00aa\u00c6dd\u00c7\u00d3\u00107Gl\u00d1Zq\u00b1\u00cc\u00ba\u00b2\u00a1b!\u0083\u0017\u00ab\u0018\u00f7\u00cdE\u008d\u00f4g~\u00aaY\u00e5\u00d7g\u00ea\u001a\u00f8\u00e1\u0092\u00bf\u009d\u009c\u0004@\u0082m\u0010\u00c35\u00edR\u00cdNN\u0010\u00b9\u0014* 8\u00cfx\u00f3\u0010\u00c8\u001f7,\u00c0.<\u008c\u00c01$\u00de\u00f8^\u008e]\u0018y\u0085\u00f6$3\u0010\u008c\u00bb\u00ef\u0098\u00cd\u0081\u00c0\u00b5v\u0012\u00d95=\u0083r{Bl\u0010\u00af\u00d6P\u00c3\u00a8\u0002\u00fb\u00ca\u00be\u00cb\u0097V\u00e5.M\u001c\u0018I\\\u00dd7\u0089\u009f\n\u00c8#9\u008c\u0098\u001e\u0006\u0092\u00a3\u00d9\u000b\u0086%\u0000cq\u00d5\u0010\u00c1\u00e9\r\u000bL\u001b^P\u009a0\u00ce\u00ad\u0010\u009d\u00efx\u0018\u000f\u000f\u0004pn\u009b1(\u0007+\u00a6\u00b84%N\u00f4\r]\u00b4\u00c6\u001c=\u00e7\u0084\u0010:\u00b6K\u00fa~\u00f1ma\u00e6L\u00a5X\u00eeIQ/\u0010\u0003\u0082\u00bdW\u00eb[+u&\u00ccm\u0085\u00e3\u0091\t\u0007\u0018\u0000\u00a8\u0000\u00eb\u009b\u00db\u00f4\u00ca\u00a0]\u00f9\u0004\u00e7\u0011\u00c1\u00f3\u0083\u0090K\u00b7\u00dc\u00c7\u00fd\u00f0\u0010\n\u00ec\u0000\u000bJ\u0013z:\u008a\u00a4\u00c4\u00e9y\u00da.G\u0010\u0012.f\u00adkw\u0099\u00fe\u00c2\u0015\u00d4\u00a0\u00e9\u00e7\u00dc\u00f2\u0010/?\u00fc\u00de8\u00a3\u0017\u0092\u00c3\u00e4\u00b1\u0086\u0090w\u00c7\u00ca\u0018\u0012.f\u00adkw\u0099\u00fe\u00d5I^\u0014\u00f6\u00c2w\f')K5B\u00ae\u00ab\u001b\u0010\u009b\u001c\u00168z\"\u00f4\u00ef\u00d3\u009c@O\u00ba\u00ec\u001d8\u0010\u00f9\u00c6#\u00dcj!\u00a6(\u00a5\u00ba\u00c4LJ|\u00fd\u0084\u0010DJy\u00a6{\u00c4\u008c\u00d7\u0000\f\u00ee\u00e1Q\u00f4Y\u00d6\b\u00d8I`7\u0019\u0086\nX\u0018\u0012j'N\u00b1a\u00e3\u0091c\u001dK\u0004\u00ffp\u00c9\u00abc\u00f2\u009a\u00f9\u001f\u00c4\u00f3\u00f4(\u00f7\u00cdE\u008d\u00f4g~\u00aaY\u00e5\u00d7g\u00ea\u001a\u00f8\u00e1\u00dd\u0080\u00b2%q\u00dc\u0017\u00f8!T>\",\u00ea\u00d0p\u0093c\u00d9\u00e03\u008c\u00d6|\u0018\u000f\u008e\u00d0\u00c6\u00f1e\u0082l\u009c*B0\u00a9\u00b3\u001e\u0017\u00cd\u00a6\u00b4%\u00b5MX\u00ae\u0010\u0001t\u00b6\u00f8k \n\u0013D\u00e1\u0005\u00ae\u00ec\u00d36\u00e3\u0010\u0086\u00b4\b\u0007\u0004h\u00a9\u00f5\u00b9q\u001a>^\u0096]5\u0010\u00fd\u0002~\u00a0s\b\u00d4\u001e!:\u00d3M:-t\n\bu\u00a0\u008dT\u009f\u00be\u00b1\u00f3\u0018\u00f6\u0092L#z\u00e3<\u00983\u00ba\u00b3\u009fk\u00d3\u00e2\"b\u00e5\u00dd:\n>\u00ef\u00bd\u0018<$\u00ce\"\rT3\u0019\u00e2\u00b9\u00c7u\u00c2\u00b8\u00c0E:2\u00a2\u00efM\u007f\u00d0C \u0094\u00e9S}1V\u00d3\u00de\u001d\u00b2B]\u00e7\u00e6~LB\u00cf\n\u00fe\u00a0\u001e[C?7\u0084\u00ac\u0098O\u00add\u00184W\u00ccJF\u00f7)\u00c0\u00d2\u00a1\u000b\u00b5\u00f6\u00c8\"\u0003;\u00ab\u009f\u00d2i\u0005\u0005\u0006\u0018\u00fd6d\u0098j\u0015\u009b?o\u00b8\u0084c\u00d9M\u00fe\u0083\u00cc\u00f6.\u00e4$\fu(\u0018X\u0095\u0096\u0000\u00a8@r\u0087d=;\u00ef\u0002\rS\u00c2xO\u00f0!=v\u0019%\u0018I\\\u00dd7\u0089\u009f\n\u00c8\u00c6\u008f\u00d4B\u00c7G\u0089\u00a7\u009d\u00b3\b{\u00c7<\u00fd\u00e5\u0010R;\u00ba\u0096z\u00c51O\u00ebw]\u00eb\u0000\u00ff\u00c7O\u0010\u00d0(\u000f\u00e3\u00b0\u007f\u00d5\u00a9y\u00b0\"\u00e9G\u00dfGo\u0018\u00b4\u00af=\u00ddd\u008b\u00cc\u00f1\u001e\u00f0\u00075k\u000f\u0087|\u0004\u00f9|x\u0011\u009b\u009e8\u0010tGH\u0082\u007f\u00c0\u009f\u00b5\u0013\u00b3W\u0001\u00b8N\u0083/\u0018\u00acD\u0000G2\u000bo\u00a5\u00b5v\u00c4\b\u009a\u009a:\u00e4\u00b9\u00eaTyb\u0092j_\u00108\u00b5!\u00eb\u00bb\u0096\u009c\u00ec\u00e5\u0011\u00faY\"q\u008b?\u0010\u00a9\u00c1\u00a5\u001b\u00eb\u00a2\u00deb\u00f2\u00b6\u00af\u00c9\u00bb\u00e3\u00a0\u00e0\u0010\u0091\u0004\u00f9tbzZ\u00e2\u008b\u00e0\f\u00af\u00f43\u0005\u00b8\u0010\u00e2`\u00c7D\u0099>\u0013\u001c\u00a3n\u00ee7T\u0088R\u0090\u0018X\u0095\u0096\u0000\u00a8@r\u0087\u008f|n[\u00df\u00fe\u00d5\u001c\u008dZ\u00fcz\u001aY\u00b6w\u0010P\u00c7\u00fdS\u0091\u009a\u009a\u009a\u00c5\u00bcC\u00c1\u00d4]\u00e5\u0019\b\u00d0r* \u001dr\u00e87 \u00d4J\u00fd!,(\u00dc\u00e3\u009d\u00c4v\t\u0083=\u00f5\u00e0c\u00e8\u00e2\u00c6R\u00ef\u00f1@\u00a3\u007fa\u00ec\u001f\u0093L\u00ae\u0018\u0000\u00ff\u00b90^\u0011AV\u00af\rt\u00d6\u00b9x\u0018\u00a3\u001a\u00c7\u00f5\u001ac\u00f6\u00e3\u00bf\u0018\u008a\u0017EF\u00d6x8Y\u00c0J3\u0012?\u00b8e\u0096j\u0095\u0082\u001ad+U\u0000\u0010w\u00f7r\u00e8A9\u0002\u009d:\u008an\u00d6+\u001cg\u0010\u0010\u00f7\u00cdE\u008d\u00f4g~\u00aa\u00e8\u00dd\u00a1p\u00c2\u0086\u00f5\u00f9\u0010\u008b\u00d7\u009c\u0002_\u00ea\u00ffUAT8W\u00d8\u00bc\u00d0\u00e8\u0018PrB\u00ec@\u00d6\u00b5F\u00d3\u00f5u{\u0014\u00aa\f\u00d5\u00dd\u00a9\u0003\u00d6\u0091-<\u00af\u0018\u00e2`\u00c7D\u0099>\u0013\u001cq\u00d1\u00b5\u00bc\u00bd?\u00dcm\u00d3\u00bbVpZ\u008902\u0010\u00aaG!\u00ac\u00ad#\u0003\u00e6\u00e6\u00ca\u00c2\u00d5\u00d9FOp\u0018\u00e8\u00bf\u00e4\u001b\u0087\u00bfU\u00a1T\u00e8\u00d6z\u00d8+a8J\u00ad\u008c;\u0093\u00fb\u00df\u00c7\u0018\u00f0t\u001f\u00cb_\u00bc2C\u0000`\u00fa\u00c7\u009e\u0080\u00b80N\u00b0j\u00d3\u00ad\u0082\u00f6\u00e9\u0018^\u00d7/!\u0014U\u00b8\u008c\u00ef\u0085K\u00f3gM{kg\u00e0\u0086\u00ba E\u0001\u00b5\u0018y\u0085\u00f6$3\u0010\u008c\u00bb\"\u00c5m\u001e\u00ed\u0084a}\u00f0\u00d0\t#U\u00fe\u007f\u00b5\u0010c\u00819l\u00ddr\u00d1\u0098\u008dk\u0088\u009d\u0019{\u000e+\b\u000b\u00a1\u00caJ\u00b19\u00c6h =\u00e2\u00d4t\u00f5\u00b2\"Y\u000bbz\u00ee\u00df\u0092cu\u00fb\u00bb\f\u0097\u008c\u00e0\u00e99\u00b4\u008d)\u00ad\u00abH\u00ff\u001a\u00100y\u0017>\u0014\u00e0\u00d9\u00d4\u00f7\u00e1~0[\nH2\b\u009el\u0014\u00d7)IK\u00c8 \u00f6\u0092L#z\u00e3<\u0098y\u0097\u00a8\u00ee\u00f0>\u00bd\u00bb\b\u009bpF\u0006\u00c0\u008el<\u00a6g-\u00fa\u0010Fw\u0018\u00cb\u00e2\u00aa`\u00ea\u009c\u0098\u00d1\u00a7\r]\u00db\u0010w\u00be'\\EY{\u001b \u001fO\u0010\u009b\u00d8L%\u00035h\u00ecB\u00a0\u00ef\u00e54\u00f7\u000b\u008f\u0018\u00d1\u009aA\u0000\u00e4\u00a2\u00e2\u0086\u0082S\u0090\u00eaX\\\u001b~\u00fe\u00b6\u00ef{\u00e3\u00b3\u00afR\u0010\u008b\u00bb=i\u00c5\\\u00f2D7K\u00c8\u00c5=\u00ba\u00bb\u00c3\u0010\u0097\u009bJ\u00b38z\u00fe\u00e7\"XG\u00b6\u00d8\u00b3\u00df\u00e8 \u0012\u00cb\u00c9\u00b2\u00bfx\u0088\u00f9#\u00f4m/64N>g^\u00b9\u00dd\u00b7\u00f8\u00dcUm\u00f9F\u00e4\u0011\u00be\u00ef\u0017\u0018\u0003\u0082\u00bdW\u00eb[+u\u00ba\u0082I\u00d9\u001a\u0080\u00c0\u001d\u00f1\u00bf-\u00fa7\u000f\u00a9\u00d8\u0010TX\u00bb\u0089\u00db\"t(MU(^\u0000\u0086C\u00e4\u0018\u0018\u00edd\u00ec\u00ef\u001a^/\u00fe\u001f\f'\u008cN\u00915jZn\u00e43\u008ei\f\u0010\u00ccA&\u0083\u00c2LNX(\u00b3T\u00d8Z\u00a2ZF\u0018\u009d\u00bd\b\u00b5\u00a6\u00b3\u00cc\u008b\u00b4\u008b\u00b1\u0013\u00f0pR\u0018p:\u0015E\u001dl\u0094\u00de\u0018\u00f6\u0092L#z\u00e3<\u0098\u0085i\u00d54\u00a7\u001e'9S!,\u0099\u008a\u00d7\u0003\u00f6\u0018\u00a2\u00e3\u008c\u00ed\u00feO0\u0001\u0001\u0017y\u0001\u0019\u00d9\u00cf\u0089\u00ce\u0084\u00bc\u0099\u00f0\u00cf\u00b9\u0001\bf\u00abOv\u00a7a\u0002\u0081\u0010\u00cd\u00a5\u0012\u000b{R\u00bc\u0004\u00d2\u00e3F\u001e<woj\u0018\u00d0\u0095U'\u008b\u0093\u00ef6\u000b\u00c2\u00d81\r\u0084\u0084K\u00849+\u00ceJ\"\u007f\u00e9";
                        var18_6 = "\u00d6\u00f5\u00b2\u00fa\u00ce\u0086q\r5\u0080\u00ef\u0098\u00f11\u00bf\u00d5\u00108\u0081\u00ebK\u001d\u00fa\u00e4|\u00f7\u00de\u0013\u00c3z]\u009eZ\u0010\u0012\u00cb\u00c9\u00b2\u00bfx\u0088\u00f9U\u00ce\u00a9\u00dd4\u00b0\u00b8\u0007\u0018\u00cd\u00ee\u0083\u00bbZM,\u000f\u00e34\u00fe-\u00f9U\u0018E\u0085\u0001\u0019h\u00ba\u00efW\u00e7\u0018\u00f6\u0092L#z\u00e3<\u0098\u00154\u001e\u00a9S\u001e _>\u00bd\u0082\u00c7F\u00b27\u008a\u0010\u008c\f\u0004\u00ad`\u00bc\u00fb\u00a8\u0085U\u008dq\u00a1ik\u00c9\u0010\u008a-\u00bc6\u001c\u00cc\u0095E\u0002\u0005o\u00e2\u009e\u00b1WO\u0010\u00d8\u00e5\u0006\u00d0*\u00fa\u0085\u00f5\u0000\u00bb\u00b8\u00dfF\u00b2\u00b1a\u0010\u00a0\u00d8\t\u0003\u00f1]\u00b4\u00c4\u00f6\u000f\u0010Ne\u00d1[a\u0010\u00ed:9\u00b5\u00ed\u00e1\u008d{\u00ba\u00e2:=\u00cc\u00b9\u001a\u00c0\u0018\u008b\u00d7\u009c\u0002_\u00ea\u00ffU\u00ae{%:\u00c7\u00af\u0093\u00f82\u00c6\u008c\u00c5;\u0015sC\u0018\u008d-'(\u00be\u00ea\u00dc\u0004\u0085m\u0081<\u00d7\u0016\u00b4:\u00f9\u00ceQ\u00d6\u00ad\u00f6\u00ca\u00a1\u0010&\f\u0003\u00ed\u000fx\u00e9\u0016%\u00ff`@\u00e2e\u0012c\u0010\u00deU\u00a7\u00cf\bG\u00b4\u00de\u00e3]\u00c6\u000b\u0080{\u0014T\u0010\u00ab\u0016\n\u00f0\u008e0\u00db\u00c9\u00ed\u00f0\\\u00cdU\u00a8\u00d6\u00b6\u0010\u008f>y\u00949H\u00f9\u00e5\u00d9\\\u00e4\u0081cb\u00b8\u009f\u0018\u00fc\u009fkG\u008e:\b\u0005f\u00e8\\\u0099S\u00b2S\u00c9\u00e4).\u0095{\u008dv\u00c1\u0018_\"\u00ac\u009c\u0096\u0011S\u00e9\u00e70\u00df\u000f\u00f8$?\u0099#\u0090\u001c\u0006\u0092\u0000\u00c9@\u0010\u008b\u00d7\u009c\u0002_\u00ea\u00ffU\u0097\u0087\u00bd1\u0010\u0004\u0094\u0015\u0010h\u00e5\u00d0\u00a4oX2\\\u000fh/,\u0083\u0003io\u0010=O\u00d2\u00b6\u009a\u00bdZ\u00f2\u00ee\u00982\u0018l~8|\u0010\u00b3\u0096)\u008d\u00fc\u0088\u00f7\u00962\u0093\u008aQg\u0002\u00d8\u009f\u0018I|\b\u00c8\u00a4\u0090\u00a5\u00edRp\u00bc\u000f\u00c2\u0019_\u00edE\u0004\u00f2e\u00d0\u00a1\u00d2`\u0010\u0012\u0094M\rC\u0015\u00eaih\u00db\u00ce \u009bz\u00ce\u00d1 \u00f6\u0092L#z\u00e3<\u0098y\u0097\u00a8\u00ee\u00f0>\u00bd\u00bb\"3\u009c\u00e5\u0015\f\u00c4\u009a?\u001d\u00d9(\u00fa\u00b7%\u00fd\u0018Gj\u00aeC\u008bL\u0002\tg\u0005\u00d8\u00e2\u0082\u00cf\u00d0\u00e4\u00a3\u00fe\u00e6M4\u00f3\u008c!\u0010\u0000\u00a8\u0000\u00eb\u009b\u00db\u00f4\u00cae\u00bf\u00a4\u0002\u0094\u00a7=Q\u0010\u00ef6(&d\u0001\f\u00fepk\u00aa\u00c6dd\u00c7\u00d3\u00107Gl\u00d1Zq\u00b1\u00cc\u00ba\u00b2\u00a1b!\u0083\u0017\u00ab\u0018\u00f7\u00cdE\u008d\u00f4g~\u00aaY\u00e5\u00d7g\u00ea\u001a\u00f8\u00e1\u0092\u00bf\u009d\u009c\u0004@\u0082m\u0010\u00c35\u00edR\u00cdNN\u0010\u00b9\u0014* 8\u00cfx\u00f3\u0010\u00c8\u001f7,\u00c0.<\u008c\u00c01$\u00de\u00f8^\u008e]\u0018y\u0085\u00f6$3\u0010\u008c\u00bb\u00ef\u0098\u00cd\u0081\u00c0\u00b5v\u0012\u00d95=\u0083r{Bl\u0010\u00af\u00d6P\u00c3\u00a8\u0002\u00fb\u00ca\u00be\u00cb\u0097V\u00e5.M\u001c\u0018I\\\u00dd7\u0089\u009f\n\u00c8#9\u008c\u0098\u001e\u0006\u0092\u00a3\u00d9\u000b\u0086%\u0000cq\u00d5\u0010\u00c1\u00e9\r\u000bL\u001b^P\u009a0\u00ce\u00ad\u0010\u009d\u00efx\u0018\u000f\u000f\u0004pn\u009b1(\u0007+\u00a6\u00b84%N\u00f4\r]\u00b4\u00c6\u001c=\u00e7\u0084\u0010:\u00b6K\u00fa~\u00f1ma\u00e6L\u00a5X\u00eeIQ/\u0010\u0003\u0082\u00bdW\u00eb[+u&\u00ccm\u0085\u00e3\u0091\t\u0007\u0018\u0000\u00a8\u0000\u00eb\u009b\u00db\u00f4\u00ca\u00a0]\u00f9\u0004\u00e7\u0011\u00c1\u00f3\u0083\u0090K\u00b7\u00dc\u00c7\u00fd\u00f0\u0010\n\u00ec\u0000\u000bJ\u0013z:\u008a\u00a4\u00c4\u00e9y\u00da.G\u0010\u0012.f\u00adkw\u0099\u00fe\u00c2\u0015\u00d4\u00a0\u00e9\u00e7\u00dc\u00f2\u0010/?\u00fc\u00de8\u00a3\u0017\u0092\u00c3\u00e4\u00b1\u0086\u0090w\u00c7\u00ca\u0018\u0012.f\u00adkw\u0099\u00fe\u00d5I^\u0014\u00f6\u00c2w\f')K5B\u00ae\u00ab\u001b\u0010\u009b\u001c\u00168z\"\u00f4\u00ef\u00d3\u009c@O\u00ba\u00ec\u001d8\u0010\u00f9\u00c6#\u00dcj!\u00a6(\u00a5\u00ba\u00c4LJ|\u00fd\u0084\u0010DJy\u00a6{\u00c4\u008c\u00d7\u0000\f\u00ee\u00e1Q\u00f4Y\u00d6\b\u00d8I`7\u0019\u0086\nX\u0018\u0012j'N\u00b1a\u00e3\u0091c\u001dK\u0004\u00ffp\u00c9\u00abc\u00f2\u009a\u00f9\u001f\u00c4\u00f3\u00f4(\u00f7\u00cdE\u008d\u00f4g~\u00aaY\u00e5\u00d7g\u00ea\u001a\u00f8\u00e1\u00dd\u0080\u00b2%q\u00dc\u0017\u00f8!T>\",\u00ea\u00d0p\u0093c\u00d9\u00e03\u008c\u00d6|\u0018\u000f\u008e\u00d0\u00c6\u00f1e\u0082l\u009c*B0\u00a9\u00b3\u001e\u0017\u00cd\u00a6\u00b4%\u00b5MX\u00ae\u0010\u0001t\u00b6\u00f8k \n\u0013D\u00e1\u0005\u00ae\u00ec\u00d36\u00e3\u0010\u0086\u00b4\b\u0007\u0004h\u00a9\u00f5\u00b9q\u001a>^\u0096]5\u0010\u00fd\u0002~\u00a0s\b\u00d4\u001e!:\u00d3M:-t\n\bu\u00a0\u008dT\u009f\u00be\u00b1\u00f3\u0018\u00f6\u0092L#z\u00e3<\u00983\u00ba\u00b3\u009fk\u00d3\u00e2\"b\u00e5\u00dd:\n>\u00ef\u00bd\u0018<$\u00ce\"\rT3\u0019\u00e2\u00b9\u00c7u\u00c2\u00b8\u00c0E:2\u00a2\u00efM\u007f\u00d0C \u0094\u00e9S}1V\u00d3\u00de\u001d\u00b2B]\u00e7\u00e6~LB\u00cf\n\u00fe\u00a0\u001e[C?7\u0084\u00ac\u0098O\u00add\u00184W\u00ccJF\u00f7)\u00c0\u00d2\u00a1\u000b\u00b5\u00f6\u00c8\"\u0003;\u00ab\u009f\u00d2i\u0005\u0005\u0006\u0018\u00fd6d\u0098j\u0015\u009b?o\u00b8\u0084c\u00d9M\u00fe\u0083\u00cc\u00f6.\u00e4$\fu(\u0018X\u0095\u0096\u0000\u00a8@r\u0087d=;\u00ef\u0002\rS\u00c2xO\u00f0!=v\u0019%\u0018I\\\u00dd7\u0089\u009f\n\u00c8\u00c6\u008f\u00d4B\u00c7G\u0089\u00a7\u009d\u00b3\b{\u00c7<\u00fd\u00e5\u0010R;\u00ba\u0096z\u00c51O\u00ebw]\u00eb\u0000\u00ff\u00c7O\u0010\u00d0(\u000f\u00e3\u00b0\u007f\u00d5\u00a9y\u00b0\"\u00e9G\u00dfGo\u0018\u00b4\u00af=\u00ddd\u008b\u00cc\u00f1\u001e\u00f0\u00075k\u000f\u0087|\u0004\u00f9|x\u0011\u009b\u009e8\u0010tGH\u0082\u007f\u00c0\u009f\u00b5\u0013\u00b3W\u0001\u00b8N\u0083/\u0018\u00acD\u0000G2\u000bo\u00a5\u00b5v\u00c4\b\u009a\u009a:\u00e4\u00b9\u00eaTyb\u0092j_\u00108\u00b5!\u00eb\u00bb\u0096\u009c\u00ec\u00e5\u0011\u00faY\"q\u008b?\u0010\u00a9\u00c1\u00a5\u001b\u00eb\u00a2\u00deb\u00f2\u00b6\u00af\u00c9\u00bb\u00e3\u00a0\u00e0\u0010\u0091\u0004\u00f9tbzZ\u00e2\u008b\u00e0\f\u00af\u00f43\u0005\u00b8\u0010\u00e2`\u00c7D\u0099>\u0013\u001c\u00a3n\u00ee7T\u0088R\u0090\u0018X\u0095\u0096\u0000\u00a8@r\u0087\u008f|n[\u00df\u00fe\u00d5\u001c\u008dZ\u00fcz\u001aY\u00b6w\u0010P\u00c7\u00fdS\u0091\u009a\u009a\u009a\u00c5\u00bcC\u00c1\u00d4]\u00e5\u0019\b\u00d0r* \u001dr\u00e87 \u00d4J\u00fd!,(\u00dc\u00e3\u009d\u00c4v\t\u0083=\u00f5\u00e0c\u00e8\u00e2\u00c6R\u00ef\u00f1@\u00a3\u007fa\u00ec\u001f\u0093L\u00ae\u0018\u0000\u00ff\u00b90^\u0011AV\u00af\rt\u00d6\u00b9x\u0018\u00a3\u001a\u00c7\u00f5\u001ac\u00f6\u00e3\u00bf\u0018\u008a\u0017EF\u00d6x8Y\u00c0J3\u0012?\u00b8e\u0096j\u0095\u0082\u001ad+U\u0000\u0010w\u00f7r\u00e8A9\u0002\u009d:\u008an\u00d6+\u001cg\u0010\u0010\u00f7\u00cdE\u008d\u00f4g~\u00aa\u00e8\u00dd\u00a1p\u00c2\u0086\u00f5\u00f9\u0010\u008b\u00d7\u009c\u0002_\u00ea\u00ffUAT8W\u00d8\u00bc\u00d0\u00e8\u0018PrB\u00ec@\u00d6\u00b5F\u00d3\u00f5u{\u0014\u00aa\f\u00d5\u00dd\u00a9\u0003\u00d6\u0091-<\u00af\u0018\u00e2`\u00c7D\u0099>\u0013\u001cq\u00d1\u00b5\u00bc\u00bd?\u00dcm\u00d3\u00bbVpZ\u008902\u0010\u00aaG!\u00ac\u00ad#\u0003\u00e6\u00e6\u00ca\u00c2\u00d5\u00d9FOp\u0018\u00e8\u00bf\u00e4\u001b\u0087\u00bfU\u00a1T\u00e8\u00d6z\u00d8+a8J\u00ad\u008c;\u0093\u00fb\u00df\u00c7\u0018\u00f0t\u001f\u00cb_\u00bc2C\u0000`\u00fa\u00c7\u009e\u0080\u00b80N\u00b0j\u00d3\u00ad\u0082\u00f6\u00e9\u0018^\u00d7/!\u0014U\u00b8\u008c\u00ef\u0085K\u00f3gM{kg\u00e0\u0086\u00ba E\u0001\u00b5\u0018y\u0085\u00f6$3\u0010\u008c\u00bb\"\u00c5m\u001e\u00ed\u0084a}\u00f0\u00d0\t#U\u00fe\u007f\u00b5\u0010c\u00819l\u00ddr\u00d1\u0098\u008dk\u0088\u009d\u0019{\u000e+\b\u000b\u00a1\u00caJ\u00b19\u00c6h =\u00e2\u00d4t\u00f5\u00b2\"Y\u000bbz\u00ee\u00df\u0092cu\u00fb\u00bb\f\u0097\u008c\u00e0\u00e99\u00b4\u008d)\u00ad\u00abH\u00ff\u001a\u00100y\u0017>\u0014\u00e0\u00d9\u00d4\u00f7\u00e1~0[\nH2\b\u009el\u0014\u00d7)IK\u00c8 \u00f6\u0092L#z\u00e3<\u0098y\u0097\u00a8\u00ee\u00f0>\u00bd\u00bb\b\u009bpF\u0006\u00c0\u008el<\u00a6g-\u00fa\u0010Fw\u0018\u00cb\u00e2\u00aa`\u00ea\u009c\u0098\u00d1\u00a7\r]\u00db\u0010w\u00be'\\EY{\u001b \u001fO\u0010\u009b\u00d8L%\u00035h\u00ecB\u00a0\u00ef\u00e54\u00f7\u000b\u008f\u0018\u00d1\u009aA\u0000\u00e4\u00a2\u00e2\u0086\u0082S\u0090\u00eaX\\\u001b~\u00fe\u00b6\u00ef{\u00e3\u00b3\u00afR\u0010\u008b\u00bb=i\u00c5\\\u00f2D7K\u00c8\u00c5=\u00ba\u00bb\u00c3\u0010\u0097\u009bJ\u00b38z\u00fe\u00e7\"XG\u00b6\u00d8\u00b3\u00df\u00e8 \u0012\u00cb\u00c9\u00b2\u00bfx\u0088\u00f9#\u00f4m/64N>g^\u00b9\u00dd\u00b7\u00f8\u00dcUm\u00f9F\u00e4\u0011\u00be\u00ef\u0017\u0018\u0003\u0082\u00bdW\u00eb[+u\u00ba\u0082I\u00d9\u001a\u0080\u00c0\u001d\u00f1\u00bf-\u00fa7\u000f\u00a9\u00d8\u0010TX\u00bb\u0089\u00db\"t(MU(^\u0000\u0086C\u00e4\u0018\u0018\u00edd\u00ec\u00ef\u001a^/\u00fe\u001f\f'\u008cN\u00915jZn\u00e43\u008ei\f\u0010\u00ccA&\u0083\u00c2LNX(\u00b3T\u00d8Z\u00a2ZF\u0018\u009d\u00bd\b\u00b5\u00a6\u00b3\u00cc\u008b\u00b4\u008b\u00b1\u0013\u00f0pR\u0018p:\u0015E\u001dl\u0094\u00de\u0018\u00f6\u0092L#z\u00e3<\u0098\u0085i\u00d54\u00a7\u001e'9S!,\u0099\u008a\u00d7\u0003\u00f6\u0018\u00a2\u00e3\u008c\u00ed\u00feO0\u0001\u0001\u0017y\u0001\u0019\u00d9\u00cf\u0089\u00ce\u0084\u00bc\u0099\u00f0\u00cf\u00b9\u0001\bf\u00abOv\u00a7a\u0002\u0081\u0010\u00cd\u00a5\u0012\u000b{R\u00bc\u0004\u00d2\u00e3F\u001e<woj\u0018\u00d0\u0095U'\u008b\u0093\u00ef6\u000b\u00c2\u00d81\r\u0084\u0084K\u00849+\u00ceJ\"\u007f\u00e9".length();
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
                            var11_3[var17_4++] = CP_f4.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "\u001c\u00f2\u00fcV\u0099\u00f9)\u00d5\u00b9sU.\u00a8\u00e2S\u000f\b\u00ec\u0099X\u0083\u00d4\u00b1\u00fa\u00f4";
                            var18_6 = "\u001c\u00f2\u00fcV\u0099\u00f9)\u00d5\u00b9sU.\u00a8\u00e2S\u000f\b\u00ec\u0099X\u0083\u00d4\u00b1\u00fa\u00f4".length();
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
                            var11_3[var17_4++] = CP_f4.a(var19_9).intern();
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
                CP_f4.d = new HashMap<K, V>(13);
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
                var6_12 = new long[211];
                var3_13 = 0;
                var4_14 = "u\u009d#c\\\u0017v\u0007 \u00fb\u008dK\u0002\u000f?R^\u0005\u00b7BX\u0087\u000ez5.**\u00bc-\u00ca\u001a\u00e0\u00c1t\u00ac,-b\u0089\u0094 fe\u00eaEn1\u00eb\u0014):\u00eb\u008fu\u00e7.L\u0003\u00a8O~\u00019\u00d4F\u00a9\u009eP<D5\u00ca\u00a0\u00b2\u00e3\u00cdn\u00a0\u00e2&\u0004\u00e2\u0017\u0089D!2\u001a \u009d{f\u00ac\u0099<|\u00a7\u00e5\u00a6\u00f8\u0000|sZ_\u0089\u00fb\u0082\u00f5C\u00b5\u0091\u00ce \u00b9B\u00ccxhu\"'\u009cXcx\u00a2\u00b6z\u00a6$H\u0099%\u00b5\u00fdSbb\u008en\u00f8\u008bl\u0092\u00fbG\u00d3\u00be\u000e\u00b3\u00c0\u00f1-\u00b1C\u0015\u0014\\\u00f9\u00ad\u00ed\u008e\u00f9\u00fe0\u008f\u00b6\u00f7)\u00db\u0099\b\nU~>\u008b\u00bb\u00cb\u009e\u0013\u00c07\u00fd\u00b5}\u00e5\u001a\u00fd=CYr\u0016\u001f.\u0013g\u00a8LD\u00f0\u00a8\f\u00ff$\u00f5\u0081C\u00f9\u00b5\u0015\u00b9,\u001f\u00b1<\u00c7}\u0084s\u008b\u00e6\u00e7\u00a0\u00a8\u00bb\be\u00ae69:\u00fe\u00f8\u00e8\u00f8\u0095\u0015\u00d2\u0083\u0089\u0090\u00f1\u001aG\u00c7k\u00d7\u00c6\u00e5\u00d7\u0000P\r\u00fc\u001a5\u00ee\u00eb\u00cf\u00f83\u00c4\u0094&\u00a3\u00fe\u00ed;\u00cf\u0099h\u00d7\u00f2\u00f3\u00898\u008b\u0088\u00c7}r\u00a8o\u00d4\u0081h\u001aM'\u00a4\u00c4\u00ce^?\u001e\\\u00b0\u00c1[\u00e4\u00a7\u0010K\u00a6*\u00d8\u00ce\u00dc\u0001\u00ca0\u0082\u00a9\u00ca\u0014\u0080\u00d1\"\u00a0\u00c3\u0005\u00ac\u0001\u00baZ\u00e2\u00ca\u00f6\u00ea]W\u008b6\u00a8d\u00ad\u00fd\u00f7\u00b4,]\u008b\u009e\u00d3&\u00baAh\u008b\u00cfTZ\u00c6\u00a6K\u0091W\u00fe\u00cc\u00f3\u00b8\u00ae\u00cbwU\u00da\u00d9';tQ\u0017PwtR\u00ebD\u009f\u00dc\u00d8\u0086\u00c9\u00c1h\u00c59\u00eaP\u00d9\u00921J\u0089\u00a7V\u0098\u001fV:AMp<\u0084\u00ceS \u00af3\u00df\u007f$\u00f8gz\u00d9\u00a7a)\u00c4\u0093\u00a4\nJ\u00b82\u00d4\u00f9\u001arT:b\u00d6\u00d1\"O7\u00a8n-m(\u0090\u009e\u0007\b\u0099\u00dc\u001eF\u00fdH\u00e0\f\u00c5b\u00f7\u008c\u00ddE\u00ab{\u001a\u00890\u0018\u00b9\u0015\u00c8_\u001bd\u001b\u001b8\u00bd\u008a\u00a8\u009fn\u009a\u00a5n\u00d0\u00b1y\u00a4\u009ccV\u0006\u0014\u00c3s\u0015\u00a1\u008b\u0002\u0018\u00c3\b\u00f0b3wU\u00d1\u00dd\u009b\u0012,\u00ae\u00d0\u0004jj\u00a8\u00e4\u00f6\u00f6MZ\u00dc\u00b2\u00b5\u00db7>Pg\u00df\u00fc\u00fb\u00fa\u009c\u009dT\u00a5\u00c8\u00e8\u0010\u00b7\u00033n\u00f5pJ\u0086\u00df\u00be\u009d\u00ac\u000fZ\u0018\u008d\u008d\u0007\u00f7}\u00e7-\u00a1\b\u0090\u00958\u00c1\u00ad\fS\u00ea\u00f9\u0092\u00c9\u00cc\u0003Ny\u00d1Bu\u00115\u00b0V\u0000\u0094\u0093\u00de\u00b8xf\u00e0\u00a0h\u00ec\u00dd\u0083i\u00c5\u0081\u0018@Q\u0094\u00eeF2\u00a3&\u00fc\u0093:\u0081\u00e6\t\u00c4\u0090\u00e0\u0002\u0017\u0099\u00ec\u000b:\u00ee\u00a9P\n\u0091\u00af\u00f8\u0011Tc1\u00e1\u009f>*:\u00e6\u0096\u00e5d\u00eef\u00eaE\u0082\u00f5Q\u008456\u009a%\u00e4\u0018D \u00fc\u00bc\u009b\u00b2\u008dk\n\u0092\u00ed\u00c8C=\u00b7kr\u00c4$\u0090\u00a1F\u00b2\u00d5h\u00d0h\u00d9\u00cd\u008eh\u00b5q\u00dfu\u001c\u00ad\u000f\u0016d\u00e2\u009b\u00c9\u0001\u0018\u00cf:\u00b4\u00a57v\u001e\u00ae\u00b4C\u00c0_\u00cd\u007f\u00cc\u00b1\u001fZWm\u00b7\u00fb[\u0096~> n\u007f\u00d32\u000e\u00e2\u00b4\\\t\u0081/H\u00ce\u00ae\u008c\t\u0011\u00db&\u00c8\u00a4J\u00bb \tzBO\u00c3L\u0085/\u00f7\u00c1em\u008fU\u00ae\u000325\u00c0\u00d8\u00dfE3\u00c7Z\u0005&\u00de~|*\u0010D\u00da\u001a\u00cd\u0098\u00f9<\u00d6%!xD\u00e9\u00be\u00a8\u0091\u00c3!\u0013@g\u00b7\u00d3!\u00c3\u00bf\u00da\u00b3\u00d7q\u00ca\u00b5\u0094\u00a7Vd\u00a6\u001c\u00f577C\u00d2\u0095\u00c6P\u00de\u00e1\u00c0$x\u00f8\u008f\u00c5 \u00bb\u0081pg(\rms;\u001cY\u00da\u00da\u0093Ku\u00bc\u00e0l\u00f9\u0090\u0012bU\u00b7C\u00e7\u009d2\u0016\"\u0092\u00de\u00e7c\u00d1v!\u00a9\u0095\u00e6\u0082\u00f3*\u008b\u00fb\u0005\u00da\u0096C\u0098\u000e\u00ea\u0088e\u0087\u008eBTh\u00ec}\u0004S\u0085\u00cd\"\u00f3(\ft\u00e8D\u00b1\u008es,+\u0005=\u0093\u00c2\u009dF\u00b7\u00ad\u001f\u00a1#S2\u001di\u00064~E:\u00a9y\u0018Gr]\u00a9\u00ff\u00b8\u00c0\u00f4\u00bd\u0011\u00f4\u0012\u000b\u009dR\u00a2\u00f82\u00f8l/\u008b\u00c16\r\u001a\u00f6E\u00a4\u00d9Mm\u0015\u00f2\u00ef\u00d8\u0098\u009a\u0002B\u00fep\u00d0\u00c9\u00fdwC\u00f1b7\u001eoq|-t\\\u00a6\\z\u00a9~\u00fb\u00e3\u0080\u00b3\u00fbJ\u0016W\u00f9\u009e\u00b0\u00b1*:\u00bf\u0096\u00ea\u00dc\u00e8\u00cb\u0080\u00d3\u00a3\u00da\u00f7\u00a0\u0004\u00fd\u00e3S\u00ea\u00ee\u00d8\u00fcR\u00d5\u00e0\u00ab\u0089\u0097\u00cfc\u0082\u0004\u0098\u00c2>\u00f4\u00c0\u008e\u00c8{\u001d\u0091sm9\t\u00b0\u00f7\u00a6*\u00d0\u00f7\u00d5\u0086@\u00db\u00d6\u00d5Z\u00fd`\nx\u00dfVQ\u00d1\u00d9dy\u00c3b\u00f6\u009fJ\u0093MXRH\u0090j\u00af\u00f5\u00cdS\u00afq\u00aeX\u00d9J\u0014\u00ffT\u00d0\u00ecl\u00f3\u0004\u00f2gbO\u0096\u00ac\rU,\u001f\u0002fv)\u008b\u0010\u0099\u0013\u00f9\u00d7\u00e3cnB\u0002\u00dcI\u00c20\u0091\u00bd\u00de\u0013h\u0007\u008eT \u00b9z\u00c5\u0011\u00f1\u00c5\u00ab\u00dc9;m\u001e\u00b3\u00ab\u00e2:\u00d8\u00e9y\u00f3\u0019\u00c6uq\u0091\u00b8bl\u0005<}\u009c\u0018\u009a\n\u00cd\u00e3\r\u00bc\u00b4i\u008b\u008e\u0003<+\u00a5\n42\u00be\u00bd\u00b2lh\u009au\u00f1\u00be\u00ee\u00ff\u00bd*,(\u001c\u00c4(:\u00d3\u00c4\u00acI\u0086\u00f5\u0013\u00d5W\u0085\u000b\u00ba[H]\u009c\u00fb\u009d\u00c9\u00f7\u00bbA\u00db|[p\u001f\u009f/~\u00b0\u00f8\u0016\u00cc\u00d8I04N\u00f1-\u000b\u001b\u00d1\u0095\u00e2\u0002\u0019\u00cd\u0090\u0095\u0011]5\r\u00dd\\A\u00f3+\u00e9\u0085\u0019\u0011?C\u00b1\u008c\u00fa\u00c5\u00cd:l:x\u00e8c\u00e5\u001f\u0019\u00b5\u00fd\u00f6\u00afA\u00e9\u00e6\u008eH\u00d3\u00b4[\u00ebDU\u00d9J?\u0017D\u00c0m0S\u0013\u00d5u\u00191\u0003N\u00b7\u00b5\u007fz\\\u009e\u00ca\u00db\u00d2\b:\u008c\u00ach\u007f~b*\u00bbn\u0087\u00bb\u00a5\u00aa\u001c\u00a8y\u00e1\u00e5\u00e9f\u00f5K\u0003E,G\u00e0MTs\u00cfYi@\u0015\u007f\u00d3\u0011\u00d1\u00a66\u00f6s\u00e0\u00ad\u008b\u00e0wd\u00faR\u00d7\n\u00c0\u0081\u0089\u00ce\u00d0\u00b1\u0000_\u00e8\u0088\u0083c\u008e\u009d\u0093\u0085-\u00d7\u00f9$8\u0093%\u00af\u0094]\"\u009e^\"\u0082\u008b\u0006\u000f\u001f\u00ddm\u00a9#\u00ea>\u0090\u0081\u001fi\u00ad\u00b3)+\u00be\u0084$\u00f3\u0082\u00e0\u00cd\u0088\u00c6\u00b0*\u00a7\u00d4\u00eb\u00db%\u0080\u00e7\u00be\u00f3H\u00c6\t(XF\u008cS(*O:%-tJN\u00fa\u0010\u009f\u0085\u00f1\u0004\u00e5\u00ba\u0011\u00a9\u00b6\u00a7\u0090EO\u00cf7Xd\u00f1u\u00c9O\u00ac\u00f4\u0094V\u00c3\u0097\u0002\u00d28dX6\u00c38\u00b6j\u00d0<%\u00ca\u00dc\u0097\u0093\u0005\u00fc\u00b6\u00ca\u00d1\u00050N\u00d9\u00ac\u0083\u00f7\u00f0@\\\u008b\u00c2\u00c2\u00e7\u00d6\u00ada0\u0099\u0088\u0098\u008a\u00dc,\u0082\u008e\u00a9\u00e2. \u008e\u001f\u00b4\u001db\u00ed>F\u0081\u00e3\u0095\u00fcZ\u0006\u0011\u00ee\u0015\u00a3,Q\\d\u000e\u00b0\u008a\u00f1\u00cce\u00c8=nyK\u00da\u001e\u0093\u0002A\u0086Kx9B\u00c4\u0016\u00bc\u0083!G\u00e0\u0006\u0013gl\u00d5\u00bd\u00b9\u00c6i1\u0010\u0019s\u0096\u00dde\u00ff\u00c8l1\u0005\u00b9\u0080\u00e0\u0095\u008c\b\u001f\u00c3\u00f2\u00d51@\u00de\u0081\u0087\u00fe_\u0091\u00b2\u00bc\f\u000f\u00db\u00e9HT\u00cd";
                var5_15 = "u\u009d#c\\\u0017v\u0007 \u00fb\u008dK\u0002\u000f?R^\u0005\u00b7BX\u0087\u000ez5.**\u00bc-\u00ca\u001a\u00e0\u00c1t\u00ac,-b\u0089\u0094 fe\u00eaEn1\u00eb\u0014):\u00eb\u008fu\u00e7.L\u0003\u00a8O~\u00019\u00d4F\u00a9\u009eP<D5\u00ca\u00a0\u00b2\u00e3\u00cdn\u00a0\u00e2&\u0004\u00e2\u0017\u0089D!2\u001a \u009d{f\u00ac\u0099<|\u00a7\u00e5\u00a6\u00f8\u0000|sZ_\u0089\u00fb\u0082\u00f5C\u00b5\u0091\u00ce \u00b9B\u00ccxhu\"'\u009cXcx\u00a2\u00b6z\u00a6$H\u0099%\u00b5\u00fdSbb\u008en\u00f8\u008bl\u0092\u00fbG\u00d3\u00be\u000e\u00b3\u00c0\u00f1-\u00b1C\u0015\u0014\\\u00f9\u00ad\u00ed\u008e\u00f9\u00fe0\u008f\u00b6\u00f7)\u00db\u0099\b\nU~>\u008b\u00bb\u00cb\u009e\u0013\u00c07\u00fd\u00b5}\u00e5\u001a\u00fd=CYr\u0016\u001f.\u0013g\u00a8LD\u00f0\u00a8\f\u00ff$\u00f5\u0081C\u00f9\u00b5\u0015\u00b9,\u001f\u00b1<\u00c7}\u0084s\u008b\u00e6\u00e7\u00a0\u00a8\u00bb\be\u00ae69:\u00fe\u00f8\u00e8\u00f8\u0095\u0015\u00d2\u0083\u0089\u0090\u00f1\u001aG\u00c7k\u00d7\u00c6\u00e5\u00d7\u0000P\r\u00fc\u001a5\u00ee\u00eb\u00cf\u00f83\u00c4\u0094&\u00a3\u00fe\u00ed;\u00cf\u0099h\u00d7\u00f2\u00f3\u00898\u008b\u0088\u00c7}r\u00a8o\u00d4\u0081h\u001aM'\u00a4\u00c4\u00ce^?\u001e\\\u00b0\u00c1[\u00e4\u00a7\u0010K\u00a6*\u00d8\u00ce\u00dc\u0001\u00ca0\u0082\u00a9\u00ca\u0014\u0080\u00d1\"\u00a0\u00c3\u0005\u00ac\u0001\u00baZ\u00e2\u00ca\u00f6\u00ea]W\u008b6\u00a8d\u00ad\u00fd\u00f7\u00b4,]\u008b\u009e\u00d3&\u00baAh\u008b\u00cfTZ\u00c6\u00a6K\u0091W\u00fe\u00cc\u00f3\u00b8\u00ae\u00cbwU\u00da\u00d9';tQ\u0017PwtR\u00ebD\u009f\u00dc\u00d8\u0086\u00c9\u00c1h\u00c59\u00eaP\u00d9\u00921J\u0089\u00a7V\u0098\u001fV:AMp<\u0084\u00ceS \u00af3\u00df\u007f$\u00f8gz\u00d9\u00a7a)\u00c4\u0093\u00a4\nJ\u00b82\u00d4\u00f9\u001arT:b\u00d6\u00d1\"O7\u00a8n-m(\u0090\u009e\u0007\b\u0099\u00dc\u001eF\u00fdH\u00e0\f\u00c5b\u00f7\u008c\u00ddE\u00ab{\u001a\u00890\u0018\u00b9\u0015\u00c8_\u001bd\u001b\u001b8\u00bd\u008a\u00a8\u009fn\u009a\u00a5n\u00d0\u00b1y\u00a4\u009ccV\u0006\u0014\u00c3s\u0015\u00a1\u008b\u0002\u0018\u00c3\b\u00f0b3wU\u00d1\u00dd\u009b\u0012,\u00ae\u00d0\u0004jj\u00a8\u00e4\u00f6\u00f6MZ\u00dc\u00b2\u00b5\u00db7>Pg\u00df\u00fc\u00fb\u00fa\u009c\u009dT\u00a5\u00c8\u00e8\u0010\u00b7\u00033n\u00f5pJ\u0086\u00df\u00be\u009d\u00ac\u000fZ\u0018\u008d\u008d\u0007\u00f7}\u00e7-\u00a1\b\u0090\u00958\u00c1\u00ad\fS\u00ea\u00f9\u0092\u00c9\u00cc\u0003Ny\u00d1Bu\u00115\u00b0V\u0000\u0094\u0093\u00de\u00b8xf\u00e0\u00a0h\u00ec\u00dd\u0083i\u00c5\u0081\u0018@Q\u0094\u00eeF2\u00a3&\u00fc\u0093:\u0081\u00e6\t\u00c4\u0090\u00e0\u0002\u0017\u0099\u00ec\u000b:\u00ee\u00a9P\n\u0091\u00af\u00f8\u0011Tc1\u00e1\u009f>*:\u00e6\u0096\u00e5d\u00eef\u00eaE\u0082\u00f5Q\u008456\u009a%\u00e4\u0018D \u00fc\u00bc\u009b\u00b2\u008dk\n\u0092\u00ed\u00c8C=\u00b7kr\u00c4$\u0090\u00a1F\u00b2\u00d5h\u00d0h\u00d9\u00cd\u008eh\u00b5q\u00dfu\u001c\u00ad\u000f\u0016d\u00e2\u009b\u00c9\u0001\u0018\u00cf:\u00b4\u00a57v\u001e\u00ae\u00b4C\u00c0_\u00cd\u007f\u00cc\u00b1\u001fZWm\u00b7\u00fb[\u0096~> n\u007f\u00d32\u000e\u00e2\u00b4\\\t\u0081/H\u00ce\u00ae\u008c\t\u0011\u00db&\u00c8\u00a4J\u00bb \tzBO\u00c3L\u0085/\u00f7\u00c1em\u008fU\u00ae\u000325\u00c0\u00d8\u00dfE3\u00c7Z\u0005&\u00de~|*\u0010D\u00da\u001a\u00cd\u0098\u00f9<\u00d6%!xD\u00e9\u00be\u00a8\u0091\u00c3!\u0013@g\u00b7\u00d3!\u00c3\u00bf\u00da\u00b3\u00d7q\u00ca\u00b5\u0094\u00a7Vd\u00a6\u001c\u00f577C\u00d2\u0095\u00c6P\u00de\u00e1\u00c0$x\u00f8\u008f\u00c5 \u00bb\u0081pg(\rms;\u001cY\u00da\u00da\u0093Ku\u00bc\u00e0l\u00f9\u0090\u0012bU\u00b7C\u00e7\u009d2\u0016\"\u0092\u00de\u00e7c\u00d1v!\u00a9\u0095\u00e6\u0082\u00f3*\u008b\u00fb\u0005\u00da\u0096C\u0098\u000e\u00ea\u0088e\u0087\u008eBTh\u00ec}\u0004S\u0085\u00cd\"\u00f3(\ft\u00e8D\u00b1\u008es,+\u0005=\u0093\u00c2\u009dF\u00b7\u00ad\u001f\u00a1#S2\u001di\u00064~E:\u00a9y\u0018Gr]\u00a9\u00ff\u00b8\u00c0\u00f4\u00bd\u0011\u00f4\u0012\u000b\u009dR\u00a2\u00f82\u00f8l/\u008b\u00c16\r\u001a\u00f6E\u00a4\u00d9Mm\u0015\u00f2\u00ef\u00d8\u0098\u009a\u0002B\u00fep\u00d0\u00c9\u00fdwC\u00f1b7\u001eoq|-t\\\u00a6\\z\u00a9~\u00fb\u00e3\u0080\u00b3\u00fbJ\u0016W\u00f9\u009e\u00b0\u00b1*:\u00bf\u0096\u00ea\u00dc\u00e8\u00cb\u0080\u00d3\u00a3\u00da\u00f7\u00a0\u0004\u00fd\u00e3S\u00ea\u00ee\u00d8\u00fcR\u00d5\u00e0\u00ab\u0089\u0097\u00cfc\u0082\u0004\u0098\u00c2>\u00f4\u00c0\u008e\u00c8{\u001d\u0091sm9\t\u00b0\u00f7\u00a6*\u00d0\u00f7\u00d5\u0086@\u00db\u00d6\u00d5Z\u00fd`\nx\u00dfVQ\u00d1\u00d9dy\u00c3b\u00f6\u009fJ\u0093MXRH\u0090j\u00af\u00f5\u00cdS\u00afq\u00aeX\u00d9J\u0014\u00ffT\u00d0\u00ecl\u00f3\u0004\u00f2gbO\u0096\u00ac\rU,\u001f\u0002fv)\u008b\u0010\u0099\u0013\u00f9\u00d7\u00e3cnB\u0002\u00dcI\u00c20\u0091\u00bd\u00de\u0013h\u0007\u008eT \u00b9z\u00c5\u0011\u00f1\u00c5\u00ab\u00dc9;m\u001e\u00b3\u00ab\u00e2:\u00d8\u00e9y\u00f3\u0019\u00c6uq\u0091\u00b8bl\u0005<}\u009c\u0018\u009a\n\u00cd\u00e3\r\u00bc\u00b4i\u008b\u008e\u0003<+\u00a5\n42\u00be\u00bd\u00b2lh\u009au\u00f1\u00be\u00ee\u00ff\u00bd*,(\u001c\u00c4(:\u00d3\u00c4\u00acI\u0086\u00f5\u0013\u00d5W\u0085\u000b\u00ba[H]\u009c\u00fb\u009d\u00c9\u00f7\u00bbA\u00db|[p\u001f\u009f/~\u00b0\u00f8\u0016\u00cc\u00d8I04N\u00f1-\u000b\u001b\u00d1\u0095\u00e2\u0002\u0019\u00cd\u0090\u0095\u0011]5\r\u00dd\\A\u00f3+\u00e9\u0085\u0019\u0011?C\u00b1\u008c\u00fa\u00c5\u00cd:l:x\u00e8c\u00e5\u001f\u0019\u00b5\u00fd\u00f6\u00afA\u00e9\u00e6\u008eH\u00d3\u00b4[\u00ebDU\u00d9J?\u0017D\u00c0m0S\u0013\u00d5u\u00191\u0003N\u00b7\u00b5\u007fz\\\u009e\u00ca\u00db\u00d2\b:\u008c\u00ach\u007f~b*\u00bbn\u0087\u00bb\u00a5\u00aa\u001c\u00a8y\u00e1\u00e5\u00e9f\u00f5K\u0003E,G\u00e0MTs\u00cfYi@\u0015\u007f\u00d3\u0011\u00d1\u00a66\u00f6s\u00e0\u00ad\u008b\u00e0wd\u00faR\u00d7\n\u00c0\u0081\u0089\u00ce\u00d0\u00b1\u0000_\u00e8\u0088\u0083c\u008e\u009d\u0093\u0085-\u00d7\u00f9$8\u0093%\u00af\u0094]\"\u009e^\"\u0082\u008b\u0006\u000f\u001f\u00ddm\u00a9#\u00ea>\u0090\u0081\u001fi\u00ad\u00b3)+\u00be\u0084$\u00f3\u0082\u00e0\u00cd\u0088\u00c6\u00b0*\u00a7\u00d4\u00eb\u00db%\u0080\u00e7\u00be\u00f3H\u00c6\t(XF\u008cS(*O:%-tJN\u00fa\u0010\u009f\u0085\u00f1\u0004\u00e5\u00ba\u0011\u00a9\u00b6\u00a7\u0090EO\u00cf7Xd\u00f1u\u00c9O\u00ac\u00f4\u0094V\u00c3\u0097\u0002\u00d28dX6\u00c38\u00b6j\u00d0<%\u00ca\u00dc\u0097\u0093\u0005\u00fc\u00b6\u00ca\u00d1\u00050N\u00d9\u00ac\u0083\u00f7\u00f0@\\\u008b\u00c2\u00c2\u00e7\u00d6\u00ada0\u0099\u0088\u0098\u008a\u00dc,\u0082\u008e\u00a9\u00e2. \u008e\u001f\u00b4\u001db\u00ed>F\u0081\u00e3\u0095\u00fcZ\u0006\u0011\u00ee\u0015\u00a3,Q\\d\u000e\u00b0\u008a\u00f1\u00cce\u00c8=nyK\u00da\u001e\u0093\u0002A\u0086Kx9B\u00c4\u0016\u00bc\u0083!G\u00e0\u0006\u0013gl\u00d5\u00bd\u00b9\u00c6i1\u0010\u0019s\u0096\u00dde\u00ff\u00c8l1\u0005\u00b9\u0080\u00e0\u0095\u008c\b\u001f\u00c3\u00f2\u00d51@\u00de\u0081\u0087\u00fe_\u0091\u00b2\u00bc\f\u000f\u00db\u00e9HT\u00cd".length();
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
                    var4_14 = "55\u00ef\u009a\u00e7\u00c5\u00c0\u00edX\u001b\u00e4\u0018\u008f=x\b";
                    var5_15 = "55\u00ef\u009a\u00e7\u00c5\u00c0\u00edX\u001b\u00e4\u0018\u008f=x\b".length();
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
        CP_f4.b = var6_12;
        CP_f4.c = new Integer[211];
        CP_f4.BUNDLE = new CP_f4();
        CP_f4.SPAWN_ENTITY = new CP_f4();
        CP_f4.SPAWN_EXPERIENCE_ORB = new CP_f4();
        CP_f4.SPAWN_PLAYER = new CP_f4();
        CP_f4.ENTITY_ANIMATION = new CP_f4();
        CP_f4.STATISTICS = new CP_f4();
        CP_f4.ACKNOWLEDGE_BLOCK_CHANGES = new CP_f4();
        CP_f4.BLOCK_BREAK_ANIMATION = new CP_f4();
        CP_f4.BLOCK_ENTITY_DATA = new CP_f4();
        CP_f4.BLOCK_ACTION = new CP_f4();
        CP_f4.BLOCK_CHANGE = new CP_f4();
        CP_f4.BOSS_BAR = new CP_f4();
        CP_f4.SERVER_DIFFICULTY = new CP_f4();
        CP_f4.CHUNK_BIOMES = new CP_f4();
        CP_f4.CLEAR_TITLES = new CP_f4();
        CP_f4.TAB_COMPLETE = new CP_f4();
        CP_f4.DECLARE_COMMANDS = new CP_f4();
        CP_f4.CLOSE_WINDOW = new CP_f4();
        CP_f4.WINDOW_ITEMS = new CP_f4();
        CP_f4.WINDOW_PROPERTY = new CP_f4();
        CP_f4.SET_SLOT = new CP_f4();
        CP_f4.SET_COOLDOWN = new CP_f4();
        CP_f4.CUSTOM_CHAT_COMPLETIONS = new CP_f4();
        CP_f4.PLUGIN_MESSAGE = new CP_f4();
        CP_f4.DAMAGE_EVENT = new CP_f4();
        CP_f4.DELETE_CHAT = new CP_f4();
        CP_f4.DISCONNECT = new CP_f4();
        CP_f4.DISGUISED_CHAT = new CP_f4();
        CP_f4.ENTITY_STATUS = new CP_f4();
        CP_f4.EXPLOSION = new CP_f4();
        CP_f4.UNLOAD_CHUNK = new CP_f4();
        CP_f4.CHANGE_GAME_STATE = new CP_f4();
        CP_f4.OPEN_HORSE_WINDOW = new CP_f4();
        CP_f4.HURT_ANIMATION = new CP_f4();
        CP_f4.INITIALIZE_WORLD_BORDER = new CP_f4();
        CP_f4.KEEP_ALIVE = new CP_f4();
        CP_f4.CHUNK_DATA = new CP_f4();
        CP_f4.EFFECT = new CP_f4();
        CP_f4.PARTICLE = new CP_f4();
        CP_f4.UPDATE_LIGHT = new CP_f4();
        CP_f4.JOIN_GAME = new CP_f4();
        CP_f4.MAP_DATA = new CP_f4();
        CP_f4.MERCHANT_OFFERS = new CP_f4();
        CP_f4.ENTITY_RELATIVE_MOVE = new CP_f4();
        CP_f4.ENTITY_RELATIVE_MOVE_AND_ROTATION = new CP_f4();
        CP_f4.ENTITY_ROTATION = new CP_f4();
        CP_f4.VEHICLE_MOVE = new CP_f4();
        CP_f4.OPEN_BOOK = new CP_f4();
        CP_f4.OPEN_WINDOW = new CP_f4();
        CP_f4.OPEN_SIGN_EDITOR = new CP_f4();
        CP_f4.PING = new CP_f4();
        CP_f4.CRAFT_RECIPE_RESPONSE = new CP_f4();
        CP_f4.PLAYER_ABILITIES = new CP_f4();
        CP_f4.CHAT_MESSAGE = new CP_f4();
        CP_f4.END_COMBAT_EVENT = new CP_f4();
        CP_f4.ENTER_COMBAT_EVENT = new CP_f4();
        CP_f4.DEATH_COMBAT_EVENT = new CP_f4();
        CP_f4.PLAYER_INFO_REMOVE = new CP_f4();
        CP_f4.PLAYER_INFO_UPDATE = new CP_f4();
        CP_f4.FACE_PLAYER = new CP_f4();
        CP_f4.PLAYER_POSITION_AND_LOOK = new CP_f4();
        CP_f4.UNLOCK_RECIPES = new CP_f4();
        CP_f4.DESTROY_ENTITIES = new CP_f4();
        CP_f4.REMOVE_ENTITY_EFFECT = new CP_f4();
        CP_f4.RESOURCE_PACK_SEND = new CP_f4();
        CP_f4.RESPAWN = new CP_f4();
        CP_f4.ENTITY_HEAD_LOOK = new CP_f4();
        CP_f4.MULTI_BLOCK_CHANGE = new CP_f4();
        CP_f4.SELECT_ADVANCEMENTS_TAB = new CP_f4();
        CP_f4.SERVER_DATA = new CP_f4();
        CP_f4.ACTION_BAR = new CP_f4();
        CP_f4.WORLD_BORDER_CENTER = new CP_f4();
        CP_f4.WORLD_BORDER_LERP_SIZE = new CP_f4();
        CP_f4.WORLD_BORDER_SIZE = new CP_f4();
        CP_f4.WORLD_BORDER_WARNING_DELAY = new CP_f4();
        CP_f4.WORLD_BORDER_WARNING_REACH = new CP_f4();
        CP_f4.CAMERA = new CP_f4();
        CP_f4.HELD_ITEM_CHANGE = new CP_f4();
        CP_f4.UPDATE_VIEW_POSITION = new CP_f4();
        CP_f4.UPDATE_VIEW_DISTANCE = new CP_f4();
        CP_f4.SPAWN_POSITION = new CP_f4();
        CP_f4.DISPLAY_SCOREBOARD = new CP_f4();
        CP_f4.ENTITY_METADATA = new CP_f4();
        CP_f4.ATTACH_ENTITY = new CP_f4();
        CP_f4.ENTITY_VELOCITY = new CP_f4();
        CP_f4.ENTITY_EQUIPMENT = new CP_f4();
        CP_f4.SET_EXPERIENCE = new CP_f4();
        CP_f4.UPDATE_HEALTH = new CP_f4();
        CP_f4.SCOREBOARD_OBJECTIVE = new CP_f4();
        CP_f4.SET_PASSENGERS = new CP_f4();
        CP_f4.TEAMS = new CP_f4();
        CP_f4.UPDATE_SCORE = new CP_f4();
        CP_f4.UPDATE_SIMULATION_DISTANCE = new CP_f4();
        CP_f4.SET_TITLE_SUBTITLE = new CP_f4();
        CP_f4.TIME_UPDATE = new CP_f4();
        CP_f4.SET_TITLE_TEXT = new CP_f4();
        CP_f4.SET_TITLE_TIMES = new CP_f4();
        CP_f4.ENTITY_SOUND_EFFECT = new CP_f4();
        CP_f4.SOUND_EFFECT = new CP_f4();
        CP_f4.STOP_SOUND = new CP_f4();
        CP_f4.SYSTEM_CHAT_MESSAGE = new CP_f4();
        CP_f4.PLAYER_LIST_HEADER_AND_FOOTER = new CP_f4();
        CP_f4.NBT_QUERY_RESPONSE = new CP_f4();
        CP_f4.COLLECT_ITEM = new CP_f4();
        CP_f4.ENTITY_TELEPORT = new CP_f4();
        CP_f4.UPDATE_ADVANCEMENTS = new CP_f4();
        CP_f4.UPDATE_ATTRIBUTES = new CP_f4();
        CP_f4.UPDATE_ENABLED_FEATURES = new CP_f4();
        CP_f4.ENTITY_EFFECT = new CP_f4();
        CP_f4.DECLARE_RECIPES = new CP_f4();
        CP_f4.TAGS = new CP_f4();
        CP_f4.CP_e = CP_f4.CP_S();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x68F1;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_f4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_f4.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_f4.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_f4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_f4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

