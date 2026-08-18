/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiFunction;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_T2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_rR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_rt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_yH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTList;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_Ou;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_z;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import org.jspecify.annotations.NullMarked;

@NullMarked
public class CP_OK<T extends MappedEntity>
implements CP_yH<T> {
    @Nullable
    private final ResourceLocation CP_z;
    @Nullable
    private final List<T> CP_v;
    static final /* synthetic */ boolean CP_y;
    private static String[] CP_O;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String OocuQtttqv = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_OK(ResourceLocation resourceLocation) {
        this(resourceLocation, null);
    }

    public CP_OK(List<T> list) {
        this(null, list);
    }

    public CP_OK(@Nullable ResourceLocation resourceLocation, @Nullable List<T> list) {
        long l = a ^ 0x2D8CD10C15C4L;
        if (resourceLocation == null) {
            try {
                if (list == null) {
                    throw new IllegalArgumentException((String)((Object)CP_OK.a("g", (int)5002, (long)(0x532256268DB0705L ^ l))));
                }
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CP_OK.a(illegalArgumentException);
            }
        }
        this.CP_z = resourceLocation;
        this.CP_v = list;
    }

    public static <Z extends MappedEntity> CP_OK<Z> CP_G() {
        return new CP_OK(new ArrayList(0));
    }

    public static <Z extends MappedEntity> CP_yH<Z> CP_A(PacketWrapper<?> packetWrapper) {
        long l = a ^ 0x45E9268F6202L;
        int n = packetWrapper.CP_f() - 1;
        try {
            if (n == -1) {
                return new CP_OK(packetWrapper.readIdentifier());
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_OK.a(illegalArgumentException);
        }
        int[] nArray = packetWrapper.CP_F(Math.min(n, (int)CP_OK.b("k", (int)3334, (long)(0x7EA4D4EAA70A249DL ^ l))));
        return new CP_rR(nArray);
    }

    /*
     * Unable to fully structure code
     */
    public static void CP_X(PacketWrapper<?> var0, CP_yH<?> var1_1) {
        block10: {
            block9: {
                var2_2 = CP_OK.a ^ 48650554199216L;
                var4_3 = CP_T2.CP_e();
                try {
                    v0 = var1_1 instanceof CP_rR;
                    if (!var4_3) break block9;
                    if (v0) {
                    }
                    ** GOTO lbl16
                }
                catch (IllegalArgumentException v1) {
                    throw CP_OK.a(v1);
                }
                var5_4 = (CP_rR)var1_1;
                try {
                    var0.CP_J(CP_rR.CP_W(var5_4).length + 1);
                    var0.CP_R(CP_rR.CP_W(var5_4));
                    if (var4_3) break block10;
lbl16:
                    // 2 sources

                    v0 = var1_1 instanceof CP_OK;
                }
                catch (IllegalArgumentException v2) {
                    throw CP_OK.a(v2);
                }
            }
            try {
                block11: {
                    try {
                        if (!v0) break block11;
                        CP_OK.CP_K(var0, (CP_OK)var1_1);
                        if (var4_3) break block10;
                    }
                    catch (IllegalArgumentException v3) {
                        throw CP_OK.a(v3);
                    }
                }
                throw new UnsupportedOperationException((String)CP_OK.a("g", (int)17237, (long)(819145177803591341L ^ var2_2)) + var1_1);
            }
            catch (IllegalArgumentException v4) {
                throw CP_OK.a(v4);
            }
        }
    }

    public static <Z extends MappedEntity> CP_OK<Z> CP_N(PacketWrapper<?> packetWrapper, CP_Ou<Z> ilIlOu) {
        CP_Ou<Z> ilIlOu2 = packetWrapper.CP_p(ilIlOu);
        return CP_OK.CP_h(packetWrapper, ilIlOu2);
    }

    public static <Z extends MappedEntity> CP_OK<Z> CP_h(PacketWrapper<?> packetWrapper, BiFunction<ClientVersion, Integer, Z> biFunction) {
        long l = a ^ 0x59F39C7EA90AL;
        int n = packetWrapper.CP_f() - 1;
        boolean bl = CP_T2.CP_i();
        try {
            if (n == -1) {
                return new CP_OK(packetWrapper.readIdentifier(), null);
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_OK.a(illegalArgumentException);
        }
        ArrayList<Z> arrayList = new ArrayList<Z>(Math.min(n, (int)CP_OK.b("k", (int)22236, (long)(0x23DE2E41EEC1B44CL ^ l))));
        for (int i = 0; i < n; ++i) {
            arrayList.add(packetWrapper.CP_A(biFunction));
            if (!bl) continue;
        }
        return new CP_OK(null, arrayList);
    }

    public static <Z extends MappedEntity> void CP_K(PacketWrapper<?> packetWrapper, CP_OK<Z> ilIlOK) {
        List list;
        boolean bl;
        block14: {
            block13: {
                block12: {
                    block11: {
                        long l = a ^ 0x411EDEAAD51FL;
                        bl = CP_T2.CP_e();
                        try {
                            try {
                                if (!bl) break block11;
                                if (ilIlOK.CP_z == null) break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_OK.a(illegalArgumentException);
                            }
                            packetWrapper.CP_J(0);
                            packetWrapper.writeIdentifier(ilIlOK.CP_z);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_OK.a(illegalArgumentException);
                        }
                    }
                    return;
                }
                try {
                    try {
                        try {
                            if (CP_y) break block13;
                            list = ilIlOK.CP_v;
                            if (!bl) break block14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_OK.a(illegalArgumentException);
                        }
                        if (list != null) break block13;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_OK.a(illegalArgumentException);
                    }
                    throw new AssertionError();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_OK.a(illegalArgumentException);
                }
            }
            packetWrapper.CP_J(ilIlOK.CP_v.size() + 1);
            list = ilIlOK.CP_v;
        }
        for (MappedEntity mappedEntity : list) {
            packetWrapper.CP_e(mappedEntity);
            if (bl) continue;
        }
    }

    @Deprecated
    public static <Z extends MappedEntity> CP_OK<Z> CP_M(NBT nBT, ClientVersion clientVersion, CP_Ou<Z> ilIlOu) {
        return CP_OK.CP_q(nBT, PacketWrapper.CP_E(clientVersion), ilIlOu);
    }

    public static <Z extends MappedEntity> CP_OK<Z> CP_q(NBT nBT, PacketWrapper<?> packetWrapper, CP_Ou<Z> ilIlOu) {
        ArrayList<Z> arrayList;
        block18: {
            Object object;
            NBT nBT2;
            boolean bl;
            ClientVersion clientVersion;
            block13: {
                block14: {
                    block16: {
                        int n;
                        Object object2;
                        block17: {
                            char c;
                            long l;
                            block15: {
                                l = a ^ 0x2536D35443A1L;
                                clientVersion = packetWrapper.CP_w().CP_E();
                                bl = CP_T2.CP_i();
                                try {
                                    nBT2 = nBT;
                                    if (bl) break block13;
                                    if (!(nBT2 instanceof NBTString)) break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_OK.a(illegalArgumentException);
                                }
                                object = ((NBTString)nBT).getValue();
                                try {
                                    try {
                                        try {
                                            c = ((String)object).isEmpty();
                                            if (bl) break block15;
                                            if (c != '\u0000') break block16;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_OK.a(illegalArgumentException);
                                        }
                                        object2 = object;
                                        n = 0;
                                        if (bl) break block17;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_OK.a(illegalArgumentException);
                                    }
                                    c = ((String)object2).charAt(n);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_OK.a(illegalArgumentException);
                                }
                            }
                            try {
                                if (c != CP_OK.b("k", (int)9399, (long)(0x277F820694D42C8AL ^ l))) break block16;
                                object2 = object;
                                n = 1;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_OK.a(illegalArgumentException);
                            }
                        }
                        String string = ((String)object2).substring(n);
                        ResourceLocation resourceLocation = new ResourceLocation(string);
                        return new CP_OK(resourceLocation);
                    }
                    arrayList = new ArrayList(1);
                    ResourceLocation resourceLocation = new ResourceLocation((String)object);
                    try {
                        arrayList.add(ilIlOu.CP_W(clientVersion, resourceLocation));
                        if (!bl) break block18;
                        PacketWrapper.CP_e(new int[3]);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_OK.a(illegalArgumentException);
                    }
                }
                nBT2 = nBT;
            }
            object = (NBTList)nBT2;
            arrayList = new ArrayList<Z>(((NBTList)object).size());
            for (NBT nBT3 : ((NBTList)object).getTags()) {
                ResourceLocation resourceLocation = new ResourceLocation(((NBTString)nBT3).getValue());
                arrayList.add(ilIlOu.CP_W(clientVersion, resourceLocation));
                if (!bl) continue;
            }
        }
        return new CP_OK(arrayList);
    }

    @Deprecated
    public static <Z extends MappedEntity> NBT CP_j(CP_OK<Z> ilIlOK, ClientVersion clientVersion) {
        return CP_OK.CP_L(PacketWrapper.CP_E(clientVersion), ilIlOK);
    }

    public static <Z extends MappedEntity> NBT CP_r(PacketWrapper<?> packetWrapper, CP_OK<Z> ilIlOK) {
        NBTList<NBTString> nBTList;
        block12: {
            boolean bl;
            block11: {
                long l = a ^ 0x5D42FD62078FL;
                bl = CP_T2.CP_e();
                try {
                    if (ilIlOK.CP_z != null) {
                        return new NBTString("#" + ilIlOK.CP_z);
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_OK.a(illegalArgumentException);
                }
                try {
                    try {
                        if (CP_y || ilIlOK.CP_v != null) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_OK.a(illegalArgumentException);
                    }
                    throw new AssertionError();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_OK.a(illegalArgumentException);
                }
            }
            NBTList<NBTString> nBTList2 = NBTList.createStringList();
            for (MappedEntity mappedEntity : ilIlOK.CP_v) {
                try {
                    nBTList = nBTList2;
                    if (bl) {
                        nBTList.addTag(new NBTString(mappedEntity.getName().toString()));
                        if (bl) continue;
                        break;
                    }
                    break block12;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_OK.a(illegalArgumentException);
                }
            }
            nBTList = nBTList2;
        }
        return nBTList;
    }

    public static <Z extends MappedEntity> CP_yH<Z> CP_M(NBT nBT, PacketWrapper<?> packetWrapper) {
        return CP_OK.CP_T(nBT, packetWrapper.CP_w().CP_E());
    }

    /*
     * Unable to fully structure code
     */
    @Deprecated
    public static <Z extends MappedEntity> CP_yH<Z> CP_T(NBT var0, ClientVersion var1_1) {
        block15: {
            block12: {
                block13: {
                    block14: {
                        var2_2 = CP_OK.a ^ 82975513047172L;
                        var4_3 = CP_T2.CP_e();
                        try {
                            v0 = var0;
                            if (!var4_3) break block12;
                            if (v0 instanceof NBTString) {
                            }
                            ** GOTO lbl39
                        }
                        catch (IllegalArgumentException v1) {
                            throw CP_OK.a(v1);
                        }
                        var6_4 = ((NBTString)var0).getValue();
                        try {
                            try {
                                try {
                                    v2 = var6_4;
                                    if (!var4_3) break block13;
                                    if (v2.isEmpty()) break block14;
                                }
                                catch (IllegalArgumentException v3) {
                                    throw CP_OK.a(v3);
                                }
                                v2 = var6_4;
                                if (!var4_3) break block13;
                            }
                            catch (IllegalArgumentException v4) {
                                throw CP_OK.a(v4);
                            }
                            if (v2.charAt(0) != CP_OK.b("k", (int)14782, (long)(6136388136752677537L ^ var2_2))) break block14;
                        }
                        catch (IllegalArgumentException v5) {
                            throw CP_OK.a(v5);
                        }
                        var7_5 = var6_4.substring(1);
                        var8_7 = new ResourceLocation(var7_5);
                        return new CP_OK<T>(var8_7);
                    }
                    v2 = var6_4;
                }
                var5_9 = Collections.singletonList(v2);
                try {
                    if (var4_3) break block15;
lbl39:
                    // 2 sources

                    v0 = var0;
                }
                catch (IllegalArgumentException v6) {
                    throw CP_OK.a(v6);
                }
            }
            var6_4 = (NBTList)v0;
            var5_9 = new ArrayList<E>(var6_4.size());
            for (NBT var8_8 : var6_4.getTags()) {
                var5_9.add(((NBTString)var8_8).getValue());
                if (var4_3) continue;
            }
        }
        return new CP_rt<T>(var5_9);
    }

    public static <Z extends MappedEntity> NBT CP_L(PacketWrapper<?> packetWrapper, CP_yH<Z> ilIlyH) {
        return CP_OK.CP_c(ilIlyH, packetWrapper.CP_w().CP_E());
    }

    @Deprecated
    public static <Z extends MappedEntity> NBT CP_c(CP_yH<Z> ilIlyH, ClientVersion clientVersion) {
        long l;
        block16: {
            CP_yH<Z> ilIlyH2;
            block15: {
                boolean bl;
                block12: {
                    boolean bl2;
                    block13: {
                        NBTList<NBTString> nBTList;
                        block14: {
                            l = a ^ 0x1F23D2E1C831L;
                            bl2 = CP_T2.CP_i();
                            try {
                                bl = ilIlyH instanceof CP_rt;
                                if (bl2) break block12;
                                if (!bl) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_OK.a(illegalArgumentException);
                            }
                            CP_rt ilIlrt = (CP_rt)ilIlyH;
                            NBTList<NBTString> nBTList2 = NBTList.createStringList();
                            for (String string : CP_rt.CP_c(ilIlrt)) {
                                try {
                                    nBTList = nBTList2;
                                    if (!bl2) {
                                        nBTList.addTag(new NBTString(string));
                                        if (!bl2) continue;
                                        break;
                                    }
                                    break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_OK.a(illegalArgumentException);
                                }
                            }
                            nBTList = nBTList2;
                        }
                        return nBTList;
                    }
                    try {
                        ilIlyH2 = ilIlyH;
                        if (bl2) break block15;
                        bl = ilIlyH2 instanceof CP_OK;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_OK.a(illegalArgumentException);
                    }
                }
                if (!bl) break block16;
                ilIlyH2 = ilIlyH;
            }
            return CP_OK.CP_j((CP_OK)ilIlyH2, clientVersion);
        }
        throw new UnsupportedOperationException((String)((Object)CP_OK.a("g", (int)24723, (long)(0x711DE1DDBD91A9EFL ^ l))) + ilIlyH);
    }

    @Override
    public CP_OK<T> CP_O(PacketWrapper<?> packetWrapper, CP_Ou<T> ilIlOu) {
        return this;
    }

    @Override
    public CP_OK<T> CP_f(ClientVersion clientVersion, CP_z ilIlz, CP_Ou<T> ilIlOu) {
        return this;
    }

    @Override
    public CP_OK<T> CP_L(ClientVersion clientVersion, CP_Ou<T> ilIlOu) {
        return this;
    }

    @Override
    public boolean CP_O() {
        boolean bl;
        block8: {
            block7: {
                List<T> list;
                boolean bl2;
                block6: {
                    long l = a ^ 0x42F408E6555DL;
                    bl2 = CP_T2.CP_i();
                    try {
                        try {
                            list = this.CP_v;
                            if (bl2) break block6;
                            if (list == null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_OK.a(illegalArgumentException);
                        }
                        list = this.CP_v;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_OK.a(illegalArgumentException);
                    }
                }
                try {
                    bl = list.isEmpty();
                    if (bl2) break block8;
                    if (!bl) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_OK.a(illegalArgumentException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    @Nullable
    public ResourceLocation CP_J() {
        return this.CP_z;
    }

    @Nullable
    public List<T> CP_M() {
        return this.CP_v;
    }

    public boolean equals(Object object) {
        boolean bl;
        block16: {
            CP_OK ilIlOK;
            block17: {
                Object object2;
                boolean bl2;
                block14: {
                    block15: {
                        block12: {
                            block13: {
                                long l = a ^ 0x4ED500EC92E5L;
                                bl2 = CP_T2.CP_e();
                                try {
                                    try {
                                        object2 = this;
                                        if (!bl2) break block12;
                                        if (object2 != object) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_OK.a(illegalArgumentException);
                                    }
                                    return true;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_OK.a(illegalArgumentException);
                                }
                            }
                            object2 = object;
                        }
                        try {
                            try {
                                if (!bl2) break block14;
                                if (object2 instanceof CP_OK) break block15;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_OK.a(illegalArgumentException);
                            }
                            return false;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_OK.a(illegalArgumentException);
                        }
                    }
                    object2 = object;
                }
                ilIlOK = (CP_OK)object2;
                try {
                    try {
                        bl = Objects.equals(this.CP_z, ilIlOK.CP_z);
                        if (!bl2) break block16;
                        if (bl) break block17;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_OK.a(illegalArgumentException);
                    }
                    return false;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_OK.a(illegalArgumentException);
                }
            }
            bl = Objects.equals(this.CP_v, ilIlOK.CP_v);
        }
        return bl;
    }

    public int hashCode() {
        return Objects.hash(this.CP_z, this.CP_v);
    }

    public String toString() {
        long l = a ^ 0x6377F8FDAC87L;
        return (String)((Object)CP_OK.a("g", (int)9928, (long)(0x58376794A7E30B05L ^ l))) + this.CP_z + (String)((Object)CP_OK.a("g", (int)23266, (long)(0x67796C1B5F46772CL ^ l))) + this.CP_v + (char)CP_OK.b("k", (int)15920, (long)(0x2B996456AEC6592FL ^ l));
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block21: {
                    block20: {
                        CP_OK.a = CP_s.a(-1003788948597917912L, -3287222157788706543L, MethodHandles.lookup().lookupClass()).a(256973738846344L);
                        CP_OK.d = new HashMap<K, V>(13);
                        var11 = CP_OK.a ^ 74950950438266L;
                        CP_OK.CP_y(new String[4]);
                        var13_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var11 >>> 56);
                        for (var14_2 = 1; var14_2 < 8; ++var14_2) {
                            v2 = v2;
                            v2[var14_2] = (byte)(var11 << var14_2 * 8 >>> 56);
                        }
                        var13_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var20_3 = new String[5];
                        var18_4 = 0;
                        var17_5 = "\u00e23\u00a1_\u00e8_\u0095\u00d7 \u00e52r7\n\u00c7(\u0082\u00c2\u007fX\u00be\u00d5\u0093d3\u00b3N\u0014\u0090o\u00d9\u00cbh\u0093\u00f5\u0082\u0093K\u00c1\u0086>\u00b8\u0006\u008f\u00b7\u00b7\u00ab\u00d9\u0088\u00d3\u008f\u00a7\u0091\u0088%\u00ab\u009d\u00bb\u00a4`\u008d\u00e5*\u0093dS_*\u00b5\u0092\u0004\u001dzhn\u00ad\u00a6\u00c4\u00db\u0001\u0083\u009e)\u0084\u00bb[\u007ft\u0003\u00df\u001a\u00d7\u0081\u0088\u00ee\"{\u00c6\u0000%\u0018\u00db&\u00d1\u00cf\u00ed\u0006\u008be\u0093\u00ca\u001c\u00060\u00fc\u00d3\u0085e\u009d\u00f4\\\u008f\u00aa\u007f-1\u00a7X\u0087\u00efjD-\u00fa\u0017\u00cc\u00f4p\u00a4\u00a3{7\u00b0'\u00a5;\u00c7\u00e2\u00c8NE\u000bO\u008dO\u00b0[col\u00d0\u0016)\u0090\u00fa?(\u0081\u00e8\u00f6V\u00b8\u00bb\u00b3\u00a2\u001f\u00c6t\u001d\u0011\u0095\u00d1\u00af;\u00e5\u00f4Zuy`\\U\u00b6\u0080\u00e9\u00a9\u001b\u00dfP\u00e2\u00a21\u00c0\u00f7\u0091\u00a1\u009dE\u0017\u00d5\u0011#FE$x\u00d3\u00b5M\u0013\u00c7\u00c8\u00e0\u00ed\u00dc\u0007^\u00d7\u00b0\u00da\u001cP m\u00af\u00caa.\u00d3X\u00b4nc\u00c0\u00a9F\u00f5?\u00a2L";
                        var19_6 = "\u00e23\u00a1_\u00e8_\u0095\u00d7 \u00e52r7\n\u00c7(\u0082\u00c2\u007fX\u00be\u00d5\u0093d3\u00b3N\u0014\u0090o\u00d9\u00cbh\u0093\u00f5\u0082\u0093K\u00c1\u0086>\u00b8\u0006\u008f\u00b7\u00b7\u00ab\u00d9\u0088\u00d3\u008f\u00a7\u0091\u0088%\u00ab\u009d\u00bb\u00a4`\u008d\u00e5*\u0093dS_*\u00b5\u0092\u0004\u001dzhn\u00ad\u00a6\u00c4\u00db\u0001\u0083\u009e)\u0084\u00bb[\u007ft\u0003\u00df\u001a\u00d7\u0081\u0088\u00ee\"{\u00c6\u0000%\u0018\u00db&\u00d1\u00cf\u00ed\u0006\u008be\u0093\u00ca\u001c\u00060\u00fc\u00d3\u0085e\u009d\u00f4\\\u008f\u00aa\u007f-1\u00a7X\u0087\u00efjD-\u00fa\u0017\u00cc\u00f4p\u00a4\u00a3{7\u00b0'\u00a5;\u00c7\u00e2\u00c8NE\u000bO\u008dO\u00b0[col\u00d0\u0016)\u0090\u00fa?(\u0081\u00e8\u00f6V\u00b8\u00bb\u00b3\u00a2\u001f\u00c6t\u001d\u0011\u0095\u00d1\u00af;\u00e5\u00f4Zuy`\\U\u00b6\u0080\u00e9\u00a9\u001b\u00dfP\u00e2\u00a21\u00c0\u00f7\u0091\u00a1\u009dE\u0017\u00d5\u0011#FE$x\u00d3\u00b5M\u0013\u00c7\u00c8\u00e0\u00ed\u00dc\u0007^\u00d7\u00b0\u00da\u001cP m\u00af\u00caa.\u00d3X\u00b4nc\u00c0\u00a9F\u00f5?\u00a2L".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block20;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_OK.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = ",\u0006O\u00fdS\u00ca\u000f9\u0007\u0098vgf\u0089\u008f\u00fcJ\u00eb\u00a0)\u00fd\u0081\u0001\u00b4\u00b1\u000b@\u00190t\u009b\u0099f?q\u009f\u00e2<\u00d9\u0019h\u0010PR\u00df\u00d0Hb?\u00ack\"\u00f3\u00ac\u00dd|\u00e3+K\u00f8\u00f0\u00c0,\u00bd\u00a8X\u00baJd/C\u0007\u00e7\u008f%\u00b5\u00186\u00dc\u00a3=\u0085\u00b6\u00e7y\u00f4#y\u00d6\u008e\u00be\u0086\u008c\u00dd\u00a5\u00d7\u00bf\u00b0W\u0096\u00d6\u00f81S7\u0011\u00ea\u00bf\u009b\u00de\u00eb\u00fc\u001b\u0017p\u0088j\u00fa\u00b4\u0012\u00ef\u00a9G(q\f\u00d5!&\u00b7[&3\u00ab\u00dfp\u00cb\u00f4Z@\u00c3\u00b7Q\u0085\u001e";
                            var19_6 = ",\u0006O\u00fdS\u00ca\u000f9\u0007\u0098vgf\u0089\u008f\u00fcJ\u00eb\u00a0)\u00fd\u0081\u0001\u00b4\u00b1\u000b@\u00190t\u009b\u0099f?q\u009f\u00e2<\u00d9\u0019h\u0010PR\u00df\u00d0Hb?\u00ack\"\u00f3\u00ac\u00dd|\u00e3+K\u00f8\u00f0\u00c0,\u00bd\u00a8X\u00baJd/C\u0007\u00e7\u008f%\u00b5\u00186\u00dc\u00a3=\u0085\u00b6\u00e7y\u00f4#y\u00d6\u008e\u00be\u0086\u008c\u00dd\u00a5\u00d7\u00bf\u00b0W\u0096\u00d6\u00f81S7\u0011\u00ea\u00bf\u009b\u00de\u00eb\u00fc\u001b\u0017p\u0088j\u00fa\u00b4\u0012\u00ef\u00a9G(q\f\u00d5!&\u00b7[&3\u00ab\u00dfp\u00cb\u00f4Z@\u00c3\u00b7Q\u0085\u001e".length();
                            var16_7 = 40;
                            var15_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block20;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_OK.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block21;
                            break;
                        }
                    }
                    var21_9 = var13_1.doFinal(v4.getBytes("ISO-8859-1"));
                    switch (v5) {
                        default: {
                            ** continue;
                        }
                        ** case 0:
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_OK.b = var20_3;
                CP_OK.c = new String[5];
                CP_OK.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u00bb\u009e\u000b\u00f5\u0002&\u00cc\u0003=\u00a5\u0004\u00afo\u00afE\u00e3\u00d2\b?2\u00e7\u00e4\f\u0016";
                var5_15 = "\u00bb\u009e\u000b\u00f5\u0002&\u00cc\u0003=\u00a5\u0004\u00afo\u00afE\u00e3\u00d2\b?2\u00e7\u00e4\f\u0016".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block22;
                    break;
                }
lbl79:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "?\u00e8\u00db\u00f0\u001b}\u00df\u00e3\u00a7D\u00ba\u0085F\u0000\u00a2\u0006";
                    var5_15 = "?\u00e8\u00db\u00f0\u001b}\u00df\u00e3\u00a7D\u00ba\u0085F\u0000\u00a2\u0006".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block22;
                        break;
                    }
                    break;
                }
lbl92:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block23;
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
lbl105:
                // 1 sources

                ** continue;
            }
        }
        CP_OK.e = var6_12;
        CP_OK.f = new Integer[5];
        try {
            v15 = CP_OK.class.desiredAssertionStatus() == false;
        }
        catch (IllegalArgumentException v16) {
            throw CP_OK.a(v16);
        }
        CP_OK.CP_y = v15;
    }

    public static void CP_y(String[] stringArray) {
        CP_O = stringArray;
    }

    public static String[] CP_Q() {
        return CP_O;
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6DEF;
        if (c[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])d.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/CP_OK", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = b[n2].getBytes("ISO-8859-1");
            CP_OK.c[n2] = CP_OK.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_OK.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/CP_OK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x273E;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/CP_OK", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_OK.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_OK.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/CP_OK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_OK.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_1() {
        try {
            return MethodHandles.lookup().findStatic(CP_OK.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

