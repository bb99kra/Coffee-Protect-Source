/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.CP_GL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.CP_Qp;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_OK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTList;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_AT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.util.CP_Xv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_Z4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.jspecify.annotations.NullMarked;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@NullMarked
public final class CP_x9 {
    private final CP_OK<ItemType> CP_S;
    private final Optional<CP_OK<ItemType>> CP_UnderScore;
    private final int CP_y;
    private final int CP_k;
    private final CP_Qp CP_z;
    private final CP_Qp CP_q;
    private final int CP_Y;
    private final List<CP_GL> CP_t;
    private static int[] CP_V;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String AkLumchQTt = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_x9(CP_OK<ItemType> ilIlOK, Optional<CP_OK<ItemType>> optional, int n, int n2, CP_Qp ilIlQp, CP_Qp ilIlQp2, int n3, List<CP_GL> list) {
        this.CP_S = ilIlOK;
        this.CP_UnderScore = optional;
        this.CP_y = n;
        this.CP_k = n2;
        this.CP_z = ilIlQp;
        this.CP_q = ilIlQp2;
        this.CP_Y = n3;
        this.CP_t = list;
    }

    @Deprecated
    public static CP_x9 CP_I(NBT nBT, ClientVersion clientVersion) {
        return CP_x9.CP_B(nBT, PacketWrapper.CP_E(clientVersion));
    }

    /*
     * Unable to fully structure code
     */
    public static CP_x9 CP_B(NBT var0, PacketWrapper<?> var1_1) {
        block9: {
            block8: {
                var2_2 = CP_x9.a ^ 97963697089314L;
                var5_3 = (NBTCompound)var0;
                var6_4 = var5_3.getOrThrow((String)CP_x9.a("n", (int)5468, (long)(6346914825186211245L ^ var2_2)), (CP_AT<CP_OK>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, lambda$decode$0(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/CP_OK;)(), var1_1);
                var7_5 = Optional.ofNullable(var5_3.getOrNull((String)CP_x9.a("n", (int)29323, (long)(7404690942280536701L ^ var2_2)), (CP_AT<CP_OK>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, lambda$decode$1(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/mapper/CP_OK;)(), var1_1));
                var8_6 = var5_3.getNumberTagOrThrow((String)CP_x9.a("n", (int)25339, (long)(4616426753899594256L ^ var2_2))).getAsInt();
                var9_7 = var5_3.getNumberTagOrThrow((String)CP_x9.a("n", (int)120, (long)(5085976407236337815L ^ var2_2))).getAsInt();
                var4_8 = CP_x9.CP_j();
                var10_9 = var5_3.getOrThrow((String)CP_x9.a("n", (int)1293, (long)(5261859551630091775L ^ var2_2)), (CP_AT<CP_Qp>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_o(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/enchantment/CP_Qp;)(), var1_1);
                var11_10 = var5_3.getOrThrow((String)CP_x9.a("n", (int)25876, (long)(425555330974189038L ^ var2_2)), (CP_AT<CP_Qp>)LambdaMetafactory.metafactory(null, null, null, (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/Object;, CP_o(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper<?> ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/nbt/NBT;Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/enchantment/CP_Qp;)(), var1_1);
                var12_11 = var5_3.getNumberTagOrThrow((String)CP_x9.a("n", (int)5801, (long)(6279323703391188561L ^ var2_2))).getAsInt();
                var13_12 = var5_3.getTagOrThrow((String)CP_x9.a("n", (int)20476, (long)(6157015512852049671L ^ var2_2)));
                try {
                    v0 = var13_12;
                    if (var4_8 == null) break block8;
                    if (v0 instanceof NBTList) {
                    }
                    ** GOTO lbl36
                }
                catch (CP_Xv v1) {
                    throw CP_x9.a(v1);
                }
                var15_13 = (NBTList)var13_12;
                var14_14 = new ArrayList<CP_GL>(var15_13.size());
                for (NBT var17_16 : var15_13.getTags()) {
                    var18_17 = ((NBTString)var17_16).getValue();
                    try {
                        var14_14.add(CP_Z4.CP_s(CP_GL.ID_INDEX, var18_17));
                        if (var4_8 == null) break block9;
                        if (var4_8 != null) continue;
                    }
                    catch (CP_Xv v2) {
                        throw CP_x9.a(v2);
                    }
                    PacketWrapper.CP_e(new int[5]);
                    break;
                }
                try {
                    if (var4_8 != null) break block9;
lbl36:
                    // 2 sources

                    v0 = var13_12;
                }
                catch (CP_Xv v3) {
                    throw CP_x9.a(v3);
                }
            }
            var15_13 = ((NBTString)v0).getValue();
            var16_15 = CP_Z4.CP_s(CP_GL.ID_INDEX, var15_13);
            var14_14 = Collections.singletonList(var16_15);
        }
        return new CP_x9(var6_4, var7_5, var8_6, var9_7, var10_9, var11_10, var12_11, var14_14);
    }

    @Deprecated
    public static NBT CP_i(CP_x9 ilIlx9, ClientVersion clientVersion) {
        return CP_x9.CP_Q(PacketWrapper.CP_E(clientVersion), ilIlx9);
    }

    public static NBT CP_Q(PacketWrapper<?> packetWrapper, CP_x9 ilIlx9) {
        NBTCompound nBTCompound = new NBTCompound();
        CP_x9.CP_P(nBTCompound, packetWrapper, ilIlx9);
        return nBTCompound;
    }

    public static void CP_P(NBTCompound nBTCompound, PacketWrapper<?> packetWrapper, CP_x9 ilIlx9) {
        block7: {
            long l = a ^ 0x413E101EA584L;
            NBTList<NBTString> nBTList = NBTList.createStringList();
            Iterator<CP_GL> iterator = ilIlx9.CP_t.iterator();
            int[] nArray = CP_x9.CP_j();
            while (iterator.hasNext()) {
                CP_GL ilIlGL = iterator.next();
                try {
                    nBTList.addTag(new NBTString(ilIlGL.CP_Z()));
                    if (nArray != null) {
                        if (nArray != null) continue;
                        break;
                    }
                    break block7;
                }
                catch (CP_Xv ilIlXv) {
                    throw CP_x9.a(ilIlXv);
                }
            }
            nBTCompound.set((String)((Object)CP_x9.a("n", (int)8831, (long)(0x75837A7E9FF3CC34L ^ l))), ilIlx9.CP_S, CP_OK::CP_r, packetWrapper);
            ilIlx9.CP_UnderScore.ifPresent(ilIlOK -> {
                long l = a ^ 0x4621F168C4FL;
                nBTCompound.set((String)((Object)CP_x9.a("n", (int)30382, (long)(0x56E7F3925BE3B13AL ^ l))), ilIlOK, CP_OK::CP_r, packetWrapper);
            });
            nBTCompound.setTag((String)((Object)CP_x9.a("n", (int)4151, (long)(0x60ABE1FC6719FE7FL ^ l))), new NBTInt(ilIlx9.CP_y));
            nBTCompound.setTag((String)((Object)CP_x9.a("n", (int)23492, (long)(0x6F7B0114956FB592L ^ l))), new NBTInt(ilIlx9.CP_k));
            nBTCompound.set((String)((Object)CP_x9.a("n", (int)14832, (long)(0x40234AC8122457BCL ^ l))), ilIlx9.CP_z, CP_Qp::CP_y, packetWrapper);
            nBTCompound.set((String)((Object)CP_x9.a("n", (int)22526, (long)(0x5717AE145FE239A5L ^ l))), ilIlx9.CP_q, CP_Qp::CP_y, packetWrapper);
            nBTCompound.setTag((String)((Object)CP_x9.a("n", (int)26736, (long)(0x7AD88C1D87358621L ^ l))), new NBTInt(ilIlx9.CP_Y));
            nBTCompound.setTag((String)((Object)CP_x9.a("n", (int)6054, (long)(0x6C8A8D2433FFF9E9L ^ l))), nBTList);
        }
        try {
            if (PacketWrapper.CP_z() == null) {
                CP_x9.CP_R(new int[5]);
            }
        }
        catch (CP_Xv ilIlXv) {
            throw CP_x9.a(ilIlXv);
        }
    }

    public CP_OK<ItemType> CP_UnderScore() {
        return this.CP_S;
    }

    public Optional<CP_OK<ItemType>> CP_X() {
        return this.CP_UnderScore;
    }

    public int CP_Y() {
        return this.CP_y;
    }

    public int CP_W() {
        return this.CP_k;
    }

    public CP_Qp CP_u() {
        return this.CP_z;
    }

    public CP_Qp CP_F() {
        return this.CP_q;
    }

    public int CP_F() {
        return this.CP_Y;
    }

    public List<CP_GL> CP_V() {
        return this.CP_t;
    }

    public boolean equals(Object object) {
        int n;
        block52: {
            CP_x9 ilIlx9;
            block53: {
                int[] nArray;
                block50: {
                    block51: {
                        block48: {
                            block49: {
                                block46: {
                                    block47: {
                                        block45: {
                                            int n2;
                                            block43: {
                                                block44: {
                                                    block41: {
                                                        block42: {
                                                            Object object2;
                                                            block39: {
                                                                block40: {
                                                                    block37: {
                                                                        block38: {
                                                                            long l = a ^ 0x2B6CFE806CA3L;
                                                                            nArray = CP_x9.CP_j();
                                                                            try {
                                                                                try {
                                                                                    object2 = this;
                                                                                    if (nArray == null) break block37;
                                                                                    if (object2 != object) break block38;
                                                                                }
                                                                                catch (CP_Xv ilIlXv) {
                                                                                    throw CP_x9.a(ilIlXv);
                                                                                }
                                                                                return true;
                                                                            }
                                                                            catch (CP_Xv ilIlXv) {
                                                                                throw CP_x9.a(ilIlXv);
                                                                            }
                                                                        }
                                                                        object2 = object;
                                                                    }
                                                                    try {
                                                                        try {
                                                                            if (nArray == null) break block39;
                                                                            if (object2 instanceof CP_x9) break block40;
                                                                        }
                                                                        catch (CP_Xv ilIlXv) {
                                                                            throw CP_x9.a(ilIlXv);
                                                                        }
                                                                        return false;
                                                                    }
                                                                    catch (CP_Xv ilIlXv) {
                                                                        throw CP_x9.a(ilIlXv);
                                                                    }
                                                                }
                                                                object2 = object;
                                                            }
                                                            ilIlx9 = (CP_x9)object2;
                                                            try {
                                                                try {
                                                                    int n2 = this.CP_y;
                                                                    n2 = ilIlx9.CP_y;
                                                                    if (nArray == null) break block41;
                                                                    if (n == n2) break block42;
                                                                }
                                                                catch (CP_Xv ilIlXv) {
                                                                    throw CP_x9.a(ilIlXv);
                                                                }
                                                                return false;
                                                            }
                                                            catch (CP_Xv ilIlXv) {
                                                                throw CP_x9.a(ilIlXv);
                                                            }
                                                        }
                                                        int n2 = this.CP_k;
                                                        n2 = ilIlx9.CP_k;
                                                    }
                                                    try {
                                                        try {
                                                            if (nArray == null) break block43;
                                                            if (n == n2) break block44;
                                                        }
                                                        catch (CP_Xv ilIlXv) {
                                                            throw CP_x9.a(ilIlXv);
                                                        }
                                                        return false;
                                                    }
                                                    catch (CP_Xv ilIlXv) {
                                                        throw CP_x9.a(ilIlXv);
                                                    }
                                                }
                                                try {
                                                    n = this.CP_Y;
                                                    if (nArray == null) break block45;
                                                    n2 = ilIlx9.CP_Y;
                                                }
                                                catch (CP_Xv ilIlXv) {
                                                    throw CP_x9.a(ilIlXv);
                                                }
                                            }
                                            try {
                                                if (n != n2) {
                                                    return false;
                                                }
                                            }
                                            catch (CP_Xv ilIlXv) {
                                                throw CP_x9.a(ilIlXv);
                                            }
                                            n = this.CP_S.equals(ilIlx9.CP_S) ? 1 : 0;
                                        }
                                        try {
                                            try {
                                                if (nArray == null) break block46;
                                                if (n) break block47;
                                            }
                                            catch (CP_Xv ilIlXv) {
                                                throw CP_x9.a(ilIlXv);
                                            }
                                            return false;
                                        }
                                        catch (CP_Xv ilIlXv) {
                                            throw CP_x9.a(ilIlXv);
                                        }
                                    }
                                    n = this.CP_UnderScore.equals(ilIlx9.CP_UnderScore) ? 1 : 0;
                                }
                                try {
                                    try {
                                        if (nArray == null) break block48;
                                        if (n) break block49;
                                    }
                                    catch (CP_Xv ilIlXv) {
                                        throw CP_x9.a(ilIlXv);
                                    }
                                    return false;
                                }
                                catch (CP_Xv ilIlXv) {
                                    throw CP_x9.a(ilIlXv);
                                }
                            }
                            n = this.CP_z.equals(ilIlx9.CP_z) ? 1 : 0;
                        }
                        try {
                            try {
                                if (nArray == null) break block50;
                                if (n) break block51;
                            }
                            catch (CP_Xv ilIlXv) {
                                throw CP_x9.a(ilIlXv);
                            }
                            return false;
                        }
                        catch (CP_Xv ilIlXv) {
                            throw CP_x9.a(ilIlXv);
                        }
                    }
                    n = this.CP_q.equals(ilIlx9.CP_q);
                }
                try {
                    try {
                        if (nArray == null) break block52;
                        if (n) break block53;
                    }
                    catch (CP_Xv ilIlXv) {
                        throw CP_x9.a(ilIlXv);
                    }
                    return false;
                }
                catch (CP_Xv ilIlXv) {
                    throw CP_x9.a(ilIlXv);
                }
            }
            n = this.CP_t.equals(ilIlx9.CP_t);
        }
        return n;
    }

    public int hashCode() {
        long l = a ^ 0x63F502FF27F7L;
        Object[] objectArray = new Object[CP_x9.b("p", (int)25114, (long)(0x244E8763B48B1941L ^ l))];
        objectArray[0] = this.CP_S;
        objectArray[1] = this.CP_UnderScore;
        objectArray[2] = this.CP_y;
        objectArray[3] = this.CP_k;
        objectArray[4] = this.CP_z;
        objectArray[5] = this.CP_q;
        objectArray[CP_x9.b("p", (int)17002, (long)(0x35A6CC1B89D0B933L ^ l))] = this.CP_Y;
        objectArray[CP_x9.b("p", (int)12074, (long)(0x7EE16D051B885472L ^ l))] = this.CP_t;
        return Objects.hash(objectArray);
    }

    public String toString() {
        long l = a ^ 0x21ECAA4E8F65L;
        return (String)((Object)CP_x9.a("n", (int)30226, (long)(0x1E69DC0B8FB032ABL ^ l))) + this.CP_S + (String)((Object)CP_x9.a("n", (int)32639, (long)(0x606EB04AF5603BC4L ^ l))) + this.CP_UnderScore + (String)((Object)CP_x9.a("n", (int)559, (long)(0x6EE660E08B1E4697L ^ l))) + this.CP_y + (String)((Object)CP_x9.a("n", (int)12126, (long)(0x1F16D8123F77EBF5L ^ l))) + this.CP_k + (String)((Object)CP_x9.a("n", (int)30690, (long)(0xA027E67F4FB3356L ^ l))) + this.CP_z + (String)((Object)CP_x9.a("n", (int)626, (long)(0x59F71CBBAAC046DDL ^ l))) + this.CP_q + (String)((Object)CP_x9.a("n", (int)13922, (long)(0x3AD6CEEB3D4872D0L ^ l))) + this.CP_Y + (String)((Object)CP_x9.a("n", (int)26762, (long)(0x3146DB6A9D462C39L ^ l))) + this.CP_t + (char)CP_x9.b("p", (int)13519, (long)(0x5929FB5571D2E707L ^ l));
    }

    private static /* synthetic */ CP_OK lambda$decode$1(NBT nBT, PacketWrapper packetWrapper) throws CP_Xv {
        return CP_OK.CP_q(nBT, packetWrapper, ItemTypes.getRegistry());
    }

    private static /* synthetic */ CP_OK lambda$decode$0(NBT nBT, PacketWrapper packetWrapper) throws CP_Xv {
        return CP_OK.CP_q(nBT, packetWrapper, ItemTypes.getRegistry());
    }

    public static void CP_R(int[] nArray) {
        CP_V = nArray;
    }

    public static int[] CP_j() {
        return CP_V;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_x9.a = CP_s.a(3712053909540838373L, -4783497138497798840L, MethodHandles.lookup().lookupClass()).a(111632181484242L);
                        CP_x9.d = new HashMap<K, V>(13);
                        CP_x9.CP_R(new int[4]);
                        var11 = CP_x9.a ^ 97571571034767L;
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
                        var20_3 = new String[24];
                        var18_4 = 0;
                        var17_5 = "O\u00d6F4\u0084\u00b6\u001b\u00f1G\u00d8l>\u00a7Y\u00aev\u008d%Ow\u00d9\u00a9%\u00b1 \n\u00fd\u00a6d\u00bd\u00ca\u00f2\u0002\u0089\u0088\\u\u00e4\u00aa\u00c57\u0006\u0084R\u00c9\u009ab\u00ab\u00f8\u0003~\u0094\u009fo\u00a2\u0089\u00bb@U\u0097\u00bd\u0002\u00e0O\u0082\u00aa\u00d5\"\u00a5\u0018\u0094\u00b1\"lI\u0004\u00d3\u00e0\u0090\u0086N\u00fe\u00ea\u00b6\u0005 \u00aaH\u0001\u0089\u008c\u0093\n\u0000\u008e\n\u0099\u00d8\u00ca\u001b.\u00d2\u00e3f\u0016T\u00d5i\u0010\u00f0\u001fv\u00d0M\u00b9H8i\u00da\u00a9\u00c2\u00f5\u0018Zb\u00ea\u00edzH\u00c7\u008b\u000e\u009f\u00ed\u00bf \u00a75\u00fd\u00a4\r\u00d0\u00eb\u0019\u00f4\u00dc\u00dd SC\u00af\u00dd\u0095[\u001f\u00ce\u00baxf00=\u0093\u001e\tu|<\u00dc\u00c4\u00ad%\u009b\u0092\u00a1\u0000/\u00fd\u00de\u00d9\u0018\u0099%: \u000f\u00bf\u0089\u008a\u00bds&\u0019\u00f4\u009f\u00de\u009ck\r\u0013\u00e5\u00e0\u00c8\n\u00c6 s\u000fv\u00e2\u008e\u0003.\u0011\u00da\u00d8\u00d8lf?B7\u00b0\u00d5\u0003\u001dJ\u000e\u00c4\u009dQ\u00d9\u00ac\u0083D\u0082S\u00b2\u0010\u00b9\f!\u0006\u0086Y \u0003<\u001d\u00c8\u00aa\u000f\u00b1Tj \u00fa\u00bf}j\u00b5\u0000\u0015\u00e2\u000b\u00d0\u0097Y\u0000\u00e6<\u00d9S\u00e1V\u009b\u00b5\u00dc3K1\u00120\u008f2\u0011\u0014\u0010\u0018\u00957\u00a2T\u00d3o/\u00e4@\u0087\u00f6>\u00ef\u0089};P\u00ba5S\u009a\u00adP\u0088 \u00e75\u0090\u00edOT\u00e3\u001b\u00e2\u00e8\u00b0\u0002\u000e\r*\u000bM@\u0013?\u0092\u0006\u00ec\u00af\u00a3H\u00ce\u0007iun{ O\u0003\u00e6\u00efA\u009e\u00e3\u00b3\u0017\u00c3\u0000\u00cdCv.\u009e\u00be\u008ea#\u008a2\u00df\u0006<d\u0004d09\u00c9\u00c3 \u00ecv\u00ef\u0013W\u00cd\u00b6\u00a9\u00aa\u008e\u0099@\u00bd\u009a\u0002l\u00d2\u009d\u00f6\u00fb\u00b0\u00f9\u0015\u00a6\u0082\u0092\u00bb\u0007\u0083\\\u00c6\u0018 '\u0087\u0088\u00df\u00a6\u00a86\u00e5cf\u00a7\u00bb\u0001\u00ea\u008a\u009a<\u00f4\u00fb\u00fd\u00fc\u00b1\u00f8\u00a5\u00e4\u0098H#\u00e49\u00cb\u00ed \u009e)\u00f8\u008a\u009c~!\u008dk\u00ec\u00ad\u00a7M1\u009f\u000bN\u00c1lR\u001c\u00d2\u00c7\u0005\u00b2\u00e9\u00cf\u0006\u00a7\u00bc-t x\u00baZU\u00b9\u00f9\u00c5:q\u00e4\u001b,}\u00bex0\u00ce\u00b6\fN\u0087Fgj\r|2\u0087\u00115\u000f\u0082 _@n6\u00aa\u00dfrfg!\u00a1c@\u0004\u001c\u00fcc\u00ef\u0015\u001dN\u00f3u\u0003\u00d7\u00c2\u001d\u00cb1w\u00d1\u0098 C\u00b0\u0083r\u00ff\u00f8\u0084\u00857INoMc\u0084\u00b4\u001ckB\u00bd\u00e3\u00c4/\u001e\u00e2\u00bb\u00a0`(p\u001dm\u0010$\u00f0I\u0089\u00d6\u00933\u00ceQ\u0003\u00fb\u0084\u00af\u00a1OS h$+A\u00fag\u00be\u00e9\u0081\u00f1\u0010\u00fd\u000f\u00f0\u0095,\u0085\u007f\u00f1q\u00f5\u0095o+\u00df\u00b6U\u007f\u00d8Ie\u00cb\u0018\u00e5\u00b1Fr\u00b827\u00b9\u007fZ\u00f7H\u0097O\u0019\u0004-\u0003\u0090\u008eeS>\u009f\u0010\u00d9\u00f5M\u00fd\u00edm\u00ff)\u00cd\u00b7Zi <U\u0087";
                        var19_6 = "O\u00d6F4\u0084\u00b6\u001b\u00f1G\u00d8l>\u00a7Y\u00aev\u008d%Ow\u00d9\u00a9%\u00b1 \n\u00fd\u00a6d\u00bd\u00ca\u00f2\u0002\u0089\u0088\\u\u00e4\u00aa\u00c57\u0006\u0084R\u00c9\u009ab\u00ab\u00f8\u0003~\u0094\u009fo\u00a2\u0089\u00bb@U\u0097\u00bd\u0002\u00e0O\u0082\u00aa\u00d5\"\u00a5\u0018\u0094\u00b1\"lI\u0004\u00d3\u00e0\u0090\u0086N\u00fe\u00ea\u00b6\u0005 \u00aaH\u0001\u0089\u008c\u0093\n\u0000\u008e\n\u0099\u00d8\u00ca\u001b.\u00d2\u00e3f\u0016T\u00d5i\u0010\u00f0\u001fv\u00d0M\u00b9H8i\u00da\u00a9\u00c2\u00f5\u0018Zb\u00ea\u00edzH\u00c7\u008b\u000e\u009f\u00ed\u00bf \u00a75\u00fd\u00a4\r\u00d0\u00eb\u0019\u00f4\u00dc\u00dd SC\u00af\u00dd\u0095[\u001f\u00ce\u00baxf00=\u0093\u001e\tu|<\u00dc\u00c4\u00ad%\u009b\u0092\u00a1\u0000/\u00fd\u00de\u00d9\u0018\u0099%: \u000f\u00bf\u0089\u008a\u00bds&\u0019\u00f4\u009f\u00de\u009ck\r\u0013\u00e5\u00e0\u00c8\n\u00c6 s\u000fv\u00e2\u008e\u0003.\u0011\u00da\u00d8\u00d8lf?B7\u00b0\u00d5\u0003\u001dJ\u000e\u00c4\u009dQ\u00d9\u00ac\u0083D\u0082S\u00b2\u0010\u00b9\f!\u0006\u0086Y \u0003<\u001d\u00c8\u00aa\u000f\u00b1Tj \u00fa\u00bf}j\u00b5\u0000\u0015\u00e2\u000b\u00d0\u0097Y\u0000\u00e6<\u00d9S\u00e1V\u009b\u00b5\u00dc3K1\u00120\u008f2\u0011\u0014\u0010\u0018\u00957\u00a2T\u00d3o/\u00e4@\u0087\u00f6>\u00ef\u0089};P\u00ba5S\u009a\u00adP\u0088 \u00e75\u0090\u00edOT\u00e3\u001b\u00e2\u00e8\u00b0\u0002\u000e\r*\u000bM@\u0013?\u0092\u0006\u00ec\u00af\u00a3H\u00ce\u0007iun{ O\u0003\u00e6\u00efA\u009e\u00e3\u00b3\u0017\u00c3\u0000\u00cdCv.\u009e\u00be\u008ea#\u008a2\u00df\u0006<d\u0004d09\u00c9\u00c3 \u00ecv\u00ef\u0013W\u00cd\u00b6\u00a9\u00aa\u008e\u0099@\u00bd\u009a\u0002l\u00d2\u009d\u00f6\u00fb\u00b0\u00f9\u0015\u00a6\u0082\u0092\u00bb\u0007\u0083\\\u00c6\u0018 '\u0087\u0088\u00df\u00a6\u00a86\u00e5cf\u00a7\u00bb\u0001\u00ea\u008a\u009a<\u00f4\u00fb\u00fd\u00fc\u00b1\u00f8\u00a5\u00e4\u0098H#\u00e49\u00cb\u00ed \u009e)\u00f8\u008a\u009c~!\u008dk\u00ec\u00ad\u00a7M1\u009f\u000bN\u00c1lR\u001c\u00d2\u00c7\u0005\u00b2\u00e9\u00cf\u0006\u00a7\u00bc-t x\u00baZU\u00b9\u00f9\u00c5:q\u00e4\u001b,}\u00bex0\u00ce\u00b6\fN\u0087Fgj\r|2\u0087\u00115\u000f\u0082 _@n6\u00aa\u00dfrfg!\u00a1c@\u0004\u001c\u00fcc\u00ef\u0015\u001dN\u00f3u\u0003\u00d7\u00c2\u001d\u00cb1w\u00d1\u0098 C\u00b0\u0083r\u00ff\u00f8\u0084\u00857INoMc\u0084\u00b4\u001ckB\u00bd\u00e3\u00c4/\u001e\u00e2\u00bb\u00a0`(p\u001dm\u0010$\u00f0I\u0089\u00d6\u00933\u00ceQ\u0003\u00fb\u0084\u00af\u00a1OS h$+A\u00fag\u00be\u00e9\u0081\u00f1\u0010\u00fd\u000f\u00f0\u0095,\u0085\u007f\u00f1q\u00f5\u0095o+\u00df\u00b6U\u007f\u00d8Ie\u00cb\u0018\u00e5\u00b1Fr\u00b827\u00b9\u007fZ\u00f7H\u0097O\u0019\u0004-\u0003\u0090\u008eeS>\u009f\u0010\u00d9\u00f5M\u00fd\u00edm\u00ff)\u00cd\u00b7Zi <U\u0087".length();
                        var16_7 = 24;
                        var15_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_x9.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "b\u0005>M\u00c3\u00b8O>\u001c\u0084\u00b1,\u0091\u0098\u00d2*9\u00ed\u00a6\u00a4-\u00d3{\u009a8%\u0089\u009f\u00b8\u0096~\u00e3\u0010\u00bd217\u00fa\u0017<\u0084\u008c\u00f3[\u0080_q\u00d3\n";
                            var19_6 = "b\u0005>M\u00c3\u00b8O>\u001c\u0084\u00b1,\u0091\u0098\u00d2*9\u00ed\u00a6\u00a4-\u00d3{\u009a8%\u0089\u009f\u00b8\u0096~\u00e3\u0010\u00bd217\u00fa\u0017<\u0084\u008c\u00f3[\u0080_q\u00d3\n".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_x9.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
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
                CP_x9.b = var20_3;
                CP_x9.c = new String[24];
                CP_x9.g = new HashMap<K, V>(13);
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
                var6_12 = new long[4];
                var3_13 = 0;
                var4_14 = "+G7\u000b\u00c3\u0086\u0018@-\u00b4\u00b2p\u0082\u00c1\u00bfu";
                var5_15 = "+G7\u000b\u00c3\u0086\u0018@-\u00b4\u00b2p\u0082\u00c1\u00bfu".length();
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
lbl79:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00b6\u008a2\u0006.y\t\u00e8h\u00d8p\u00c8t=\u00a7\u000f";
                    var5_15 = "\u00b6\u008a2\u0006.y\t\u00e8h\u00d8p\u00c8t=\u00a7\u000f".length();
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
lbl92:
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
lbl105:
                // 1 sources

                ** continue;
            }
        }
        CP_x9.e = var6_12;
        CP_x9.f = new Integer[4];
    }

    private static CP_Xv a(CP_Xv ilIlXv) {
        return ilIlXv;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7B98;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/enchantment/CP_x9", exception);
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
            CP_x9.c[n2] = CP_x9.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_x9.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/enchantment/CP_x9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6CEA;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/enchantment/CP_x9", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_x9.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_x9.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/enchantment/CP_x9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_x9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_x9.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

