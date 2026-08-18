/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimmaterial;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.armormaterial.CP_A2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.armormaterial.CP_iz;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimmaterial.CP_W0;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.trimmaterial.StaticTrimMaterial;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_Tq;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_jH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTFloat;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public interface CP_OM
extends MappedEntity,
CP_Tq<CP_OM>,
CP_jH {
    public static final float CP_p = 0.0f;
    public static final long b;
    public static final String[] d;
    public static final String[] e;
    public static final Map f;

    public String getAssetName();

    @ApiStatus.Obsolete
    public ItemType getIngredient();

    @ApiStatus.Obsolete
    public float getItemModelIndex();

    default public @Nullable String CP_D(CP_A2 ilIlA2) {
        return this.getOverrideArmorMaterials().get(ilIlA2);
    }

    public Map<CP_A2, String> getOverrideArmorMaterials();

    public Component getDescription();

    public static CP_OM CP_Z(PacketWrapper<?> packetWrapper) {
        return packetWrapper.CP_Z(CP_W0.CP_a(), CP_OM::CP_S);
    }

    /*
     * Unable to fully structure code
     */
    public static CP_OM CP_S(PacketWrapper<?> var0) {
        var1_1 = CP_OM.b ^ 116509936438019L;
        var4_2 = var0.CP_i();
        var3_3 = StaticTrimMaterial.CP_K();
        v0 = var0;
        if (var3_3 == null) ** GOTO lbl10
        if (v0.CP_w().CP_z(ServerVersion.V_1_21_5)) {
            v1 = null;
        } else {
            v0 = var0;
lbl10:
            // 2 sources

            v1 = v0.CP_A((BiFunction<ClientVersion, Integer, ItemType>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, getById(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Ljava/lang/Integer;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/type/ItemType;)());
        }
        var5_4 = v1;
        v2 = var0;
        if (var3_3 == null) ** GOTO lbl18
        if (v2.CP_w().CP_z(ServerVersion.V_1_21_4)) {
            v3 = 0.0f;
        } else {
            v2 = var0;
lbl18:
            // 2 sources

            v3 = v2.CP_X();
        }
        var6_5 = v3;
        var7_6 = var0.CP_c((CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$readDirect$0(me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/armormaterial/CP_A2;)(), (CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_i(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/String;)());
        var8_7 = var0.CP_J();
        return new StaticTrimMaterial(var4_2, var5_4, var6_5, var7_6, var8_7);
    }

    public static void CP_i(PacketWrapper<?> packetWrapper, CP_OM ilIlOM) {
        packetWrapper.CP_C(ilIlOM, CP_OM::CP_X);
    }

    public static void CP_X(PacketWrapper<?> packetWrapper, CP_OM ilIlOM) {
        PacketWrapper<?> packetWrapper2;
        block6: {
            boolean bl;
            block5: {
                long l = b ^ 0x7E2D099C5FB9L;
                String string = StaticTrimMaterial.CP_K();
                packetWrapper.CP_M(ilIlOM.getAssetName());
                String string2 = string;
                bl = packetWrapper.CP_w().CP_C(ServerVersion.V_1_21_5);
                if (string2 == null) break block5;
                if (bl) {
                    packetWrapper.CP_e(ilIlOM.getIngredient());
                }
                packetWrapper2 = packetWrapper;
                if (string2 == null) break block6;
                bl = packetWrapper2.CP_w().CP_C(ServerVersion.V_1_21_4);
            }
            if (bl) {
                packetWrapper.CP_R(ilIlOM.getItemModelIndex());
            }
            packetWrapper.CP_a(ilIlOM.getOverrideArmorMaterials(), PacketWrapper::CP_e, PacketWrapper::CP_M);
            packetWrapper2 = packetWrapper;
        }
        packetWrapper2.CP_z(ilIlOM.getDescription());
    }

    @Deprecated
    public static CP_OM CP_d(NBT nBT, ClientVersion clientVersion, @Nullable TypesBuilderData typesBuilderData) {
        return CP_OM.CP_C(nBT, PacketWrapper.CP_E(clientVersion), typesBuilderData);
    }

    public static CP_OM CP_C(NBT nBT, PacketWrapper<?> packetWrapper, @Nullable TypesBuilderData typesBuilderData) {
        Map<CP_A2, String> map;
        float f;
        ItemType itemType;
        String string;
        long l;
        block6: {
            block7: {
                l = b ^ 0x4A23ED193CB5L;
                NBTCompound nBTCompound = (NBTCompound)nBT;
                string = nBTCompound.getStringTagValueOrThrow((String)((Object)CP_OM.a("i", (int)17695, (long)(0x7B1474AD092B115FL ^ l))));
                String string2 = StaticTrimMaterial.CP_K();
                itemType = packetWrapper.CP_w().CP_z(ServerVersion.V_1_21_5) ? null : ItemTypes.getByName(nBTCompound.getStringTagValueOrThrow((String)((Object)CP_OM.a("i", (int)13317, (long)(0x4222AB7B71FE040L ^ l)))));
                f = packetWrapper.CP_w().CP_z(ServerVersion.V_1_21_4) ? 0.0f : nBTCompound.getNumberTagOrThrow((String)((Object)CP_OM.a("i", (int)15289, (long)(0x7BE224AD9922EFF8L ^ l)))).getAsFloat();
                NBTCompound nBTCompound2 = nBTCompound.getCompoundTagOrNull((String)((Object)CP_OM.a("i", (int)30278, (long)(0x5A8286DCEDC3A201L ^ l))));
                if (nBTCompound2 == null) break block7;
                map = new HashMap();
                for (Map.Entry<String, NBT> entry : nBTCompound2.getTags().entrySet()) {
                    CP_A2 ilIlA2 = CP_iz.CP_P(entry.getKey());
                    String string3 = ((NBTString)entry.getValue()).getValue();
                    map.put(ilIlA2, string3);
                    if (string2 != null) {
                        if (string2 != null) continue;
                    }
                    break block6;
                }
                if (string2 != null) break block6;
            }
            map = Collections.emptyMap();
        }
        Component component = ((NBTCompound)nBT).getOrThrow((String)((Object)CP_OM.a("i", (int)14791, (long)(0x5689FC09AB1D6D81L ^ l))), packetWrapper.CP_q(), packetWrapper);
        return new StaticTrimMaterial(typesBuilderData, string, itemType, f, map, component);
    }

    @Deprecated
    public static NBT CP_G(CP_OM ilIlOM, ClientVersion clientVersion) {
        return CP_OM.CP_s(PacketWrapper.CP_E(clientVersion), ilIlOM);
    }

    public static NBT CP_s(PacketWrapper<?> packetWrapper, CP_OM ilIlOM) {
        NBTCompound nBTCompound;
        String string;
        long l;
        block11: {
            block12: {
                l = b ^ 0x5C2484B28C6L;
                string = StaticTrimMaterial.CP_K();
                if (ilIlOM.getOverrideArmorMaterials().isEmpty()) break block12;
                nBTCompound = new NBTCompound();
                for (Map.Entry entry : ilIlOM.getOverrideArmorMaterials().entrySet()) {
                    String string2 = ((CP_A2)entry.getKey()).getName().toString();
                    NBTString nBTString = new NBTString((String)entry.getValue());
                    nBTCompound.setTag(string2, nBTString);
                    if (string != null) {
                        if (string != null) continue;
                    }
                    break block11;
                }
                if (string != null) break block11;
            }
            nBTCompound = null;
        }
        NBTCompound nBTCompound2 = new NBTCompound();
        nBTCompound2.setTag((String)((Object)CP_OM.a("i", (int)6902, (long)(0x3431BCD03E85AC1L ^ l))), new NBTString(ilIlOM.getAssetName()));
        boolean bl = packetWrapper.CP_w().CP_C(ServerVersion.V_1_21_5);
        if (string != null) {
            if (bl) {
                nBTCompound2.setTag((String)((Object)CP_OM.a("i", (int)2102, (long)(0x6FB993B7A75480DL ^ l))), new NBTString(ilIlOM.getIngredient().getName().toString()));
            }
            bl = packetWrapper.CP_w().CP_C(ServerVersion.V_1_21_4);
        }
        if (bl) {
            nBTCompound2.setTag((String)((Object)CP_OM.a("i", (int)20707, (long)(0x1A1EB286D1A390D3L ^ l))), new NBTFloat(ilIlOM.getItemModelIndex()));
        }
        Object object = nBTCompound;
        if (string != null) {
            if (object != null) {
                nBTCompound2.setTag((String)((Object)CP_OM.a("i", (int)1206, (long)(0x5B423DFA0489448CL ^ l))), nBTCompound);
            }
            nBTCompound2.set((String)((Object)CP_OM.a("i", (int)6196, (long)(0x405083E69233D805L ^ l))), ilIlOM.getDescription(), packetWrapper.CP_q(), packetWrapper);
            object = nBTCompound2;
        }
        return object;
    }

    private static /* synthetic */ CP_A2 lambda$readDirect$0(PacketWrapper packetWrapper) {
        return packetWrapper.CP_A(CP_iz::CP_Y);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_OM.b = CP_s.a(606011610350830588L, -3908007306811618360L, MethodHandles.lookup().lookupClass()).a(275235144315609L);
                CP_OM.f = new HashMap<K, V>(13);
                var0 = CP_OM.b ^ 84422039588844L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[10];
                var7_4 = 0;
                var6_5 = "\u00bepB\u000e!\u0087\u00e76\u00fa!\u00e3l\u00a4\u00fa\u00ccV\u00f6\u00e7\u001b\u00c4\u00c2\u000b\u00e0\b5\u00e2#\u00f3\u0018\u0001\u00b0\u009e \u00da\u00fc\u00d1\u00d2\u009e\u00der\u000b\u0096\u00e6YE\u0081\u00b4\u0093\u009836\u0010\u00e0S\u00ec>.\u00e4e\u0007\u00b2C\u00f3Rz(\u00d8U\u00c0\u00c0\"8%\u00c8\u008f\u00e9N\u00fds\u001b\u00da\u0007\u00b1g\u0007\u00e8j\u00b9\u00c6\u0019c\u009b8\u00e0\u00db\u00a5\u001d@\u00a2\u00d5\r!\u0082\u009eH\u00b4 j\u0086E\u00028\u0085\u009b\u00b2\u00ad\u00a5\u00cb\u0092\u008es\u0003G\u00bb\u008d\u00f1R\u00d9${\u0004\u009f\u000b\u0085\u00e6r\u001b0\u00af\u0018\u00deo\u00bb^la\u00d0\u00bfG\u00c2\u00fbl\u00a7\u0015\u008c\u0082\u00f4\u00f9\u00873\u00fd9\u007fO \u009e\u00fedq*&\u00e3\u00a6\u0090\u0096\u009e\u00c0\u009e\u0080\u00f7\u00d4\u00d0\u00bf\u00f4\u00b7\u0016\u008e\u00bf,\u00fc\u00a7n\u001e\u00cd\u0090\u00cfv0\u0016\r\u000b\u000bH\u00ae\u00fb\u001a\u00b2*G\u00e6\u00c7\u00b0z\u0002\u00be\u00c6\u008f\u000bs}\u00bf\u00ecb\u000f\u0016\u00f8Xi\u00fa\u00a1\u00efH?\u00e4\u0000\b6e\u0088\u00f6\u00bd\u00dfl\u0097oN 5\u00d1\u00f1}o\u001a\re7\u00cb\u00c4n\u0007\u00fb\u0081\u00bf\u00d1\u00c0W9\u00a3\u00a1\u00c6`K\u0094\u00a7=7p\u001e\u00c9";
                var8_6 = "\u00bepB\u000e!\u0087\u00e76\u00fa!\u00e3l\u00a4\u00fa\u00ccV\u00f6\u00e7\u001b\u00c4\u00c2\u000b\u00e0\b5\u00e2#\u00f3\u0018\u0001\u00b0\u009e \u00da\u00fc\u00d1\u00d2\u009e\u00der\u000b\u0096\u00e6YE\u0081\u00b4\u0093\u009836\u0010\u00e0S\u00ec>.\u00e4e\u0007\u00b2C\u00f3Rz(\u00d8U\u00c0\u00c0\"8%\u00c8\u008f\u00e9N\u00fds\u001b\u00da\u0007\u00b1g\u0007\u00e8j\u00b9\u00c6\u0019c\u009b8\u00e0\u00db\u00a5\u001d@\u00a2\u00d5\r!\u0082\u009eH\u00b4 j\u0086E\u00028\u0085\u009b\u00b2\u00ad\u00a5\u00cb\u0092\u008es\u0003G\u00bb\u008d\u00f1R\u00d9${\u0004\u009f\u000b\u0085\u00e6r\u001b0\u00af\u0018\u00deo\u00bb^la\u00d0\u00bfG\u00c2\u00fbl\u00a7\u0015\u008c\u0082\u00f4\u00f9\u00873\u00fd9\u007fO \u009e\u00fedq*&\u00e3\u00a6\u0090\u0096\u009e\u00c0\u009e\u0080\u00f7\u00d4\u00d0\u00bf\u00f4\u00b7\u0016\u008e\u00bf,\u00fc\u00a7n\u001e\u00cd\u0090\u00cfv0\u0016\r\u000b\u000bH\u00ae\u00fb\u001a\u00b2*G\u00e6\u00c7\u00b0z\u0002\u00be\u00c6\u008f\u000bs}\u00bf\u00ecb\u000f\u0016\u00f8Xi\u00fa\u00a1\u00efH?\u00e4\u0000\b6e\u0088\u00f6\u00bd\u00dfl\u0097oN 5\u00d1\u00f1}o\u001a\re7\u00cb\u00c4n\u0007\u00fb\u0081\u00bf\u00d1\u00c0W9\u00a3\u00a1\u00c6`K\u0094\u00a7=7p\u001e\u00c9".length();
                var5_7 = 32;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_OM.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\\\u00179\u00cc0Uv\u00cd\u00d8G9\u0018\u00c7\u00b3\u00fc\u000fYF\u00b5\u00b5q\u00ab<\u00ec\u00d7\b\u0085M!\u000b\u0015\u00b9\u00f6\u00d2\u00bc\u00b4L\u0010\u00cd\u00f8z4\u0089\u00db\u009aT\u00c0H\u00afKH\u00cc$*hh\u0018b\u0003\bb4\u00e7\u0085\u00f3\u00b1n\u00e0\u00fc=\u0084c\u00fa_\u0000\u00b5Y\u0016\u00a5\u00f9\u00c1";
                    var8_6 = "\\\u00179\u00cc0Uv\u00cd\u00d8G9\u0018\u00c7\u00b3\u00fc\u000fYF\u00b5\u00b5q\u00ab<\u00ec\u00d7\b\u0085M!\u000b\u0015\u00b9\u00f6\u00d2\u00bc\u00b4L\u0010\u00cd\u00f8z4\u0089\u00db\u009aT\u00c0H\u00afKH\u00cc$*hh\u0018b\u0003\bb4\u00e7\u0085\u00f3\u00b1n\u00e0\u00fc=\u0084c\u00fa_\u0000\u00b5Y\u0016\u00a5\u00f9\u00c1".length();
                    var5_7 = 56;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_OM.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl51:
                // 1 sources

                ** continue;
            }
        }
        CP_OM.d = var9_3;
        CP_OM.e = new String[10];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1716;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/trimmaterial/CP_OM", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            CP_OM.e[n2] = CP_OM.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_OM.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/trimmaterial/CP_OM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_OM.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

