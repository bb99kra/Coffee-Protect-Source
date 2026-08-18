/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.Function;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.ComponentType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.ComponentTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.CP_LE;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.CP_fa;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_a;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_j4;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_n7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.CP_ZC;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.CP_QY;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.enchantment.type.CP_yM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.type.ItemTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.CP_Z1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTInt;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTList;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTNumber;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTShort;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTString;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_h9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_z;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@NullMarked
public class CP_Cg {
    public static final CP_Cg CP_P;
    private final ClientVersion CP_r;
    private final CP_z CP_q;
    private final ItemType CP_m;
    private int CP_X;
    @ApiStatus.Obsolete
    private @Nullable NBTCompound CP_G;
    private @Nullable CP_fa CP_H;
    @ApiStatus.Obsolete
    private int CP_A;
    private static PacketWrapper[] CP_B;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String sxFHakYXly = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_Cg(ItemType itemType, int n, @Nullable NBTCompound nBTCompound, @Nullable CP_fa ilIlfa, int n2, ClientVersion clientVersion, CP_z ilIlz) {
        this.CP_m = itemType;
        this.CP_X = n;
        this.CP_G = nBTCompound;
        this.CP_H = ilIlfa;
        this.CP_A = n2;
        this.CP_r = clientVersion;
        this.CP_q = ilIlz;
    }

    public static CP_Cg CP_z(NBT nBT, PacketWrapper<?> packetWrapper) {
        return CP_Cg.CP_z(nBT, packetWrapper.CP_w().CP_E());
    }

    @Deprecated
    public static CP_Cg CP_z(NBT nBT, ClientVersion clientVersion) {
        NBT nBT2;
        long l;
        block2: {
            block3: {
                l = a ^ 0x1E7F9C04DEDBL;
                boolean bl = CP_n7.CP_g();
                try {
                    nBT2 = nBT;
                    if (bl) break block2;
                    if (!(nBT2 instanceof NBTString)) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
                ResourceLocation resourceLocation = new ResourceLocation(((NBTString)nBT).getValue());
                return CP_Cg.CP_q().CP_C(ItemTypes.getByName(resourceLocation.toString())).CP_D();
            }
            nBT2 = nBT;
        }
        NBTCompound nBTCompound = (NBTCompound)nBT2;
        CP_j4 ilIlj4 = CP_Cg.CP_q();
        ResourceLocation resourceLocation = Optional.ofNullable(nBTCompound.getStringTagValueOrNull((String)((Object)CP_Cg.a("b", (int)1651, (long)(0x25D9DBCD8681E4F5L ^ l))))).map(Optional::of).orElseGet(() -> {
            long l = a ^ 0x1B2D8C2B51A0L;
            return Optional.ofNullable(nBTCompound.getStringTagValueOrNull((String)((Object)CP_Cg.a("b", (int)29745, (long)(0x437EDEC2751919D3L ^ l)))));
        }).map(ResourceLocation::new).orElseThrow(() -> {
            long l = a ^ 0x186787990AC3L;
            return new IllegalArgumentException((String)((Object)CP_Cg.a("b", (int)6584, (long)(0x6A6BA646C066AF3EL ^ l))) + nBTCompound.getTags().keySet());
        });
        ilIlj4.CP_C(ItemTypes.getByName(resourceLocation.toString()));
        ilIlj4.CP_c(nBTCompound.getCompoundTagOrNull((String)((Object)CP_Cg.a("b", (int)20361, (long)(0x2F6CA8BC713F2D0AL ^ l)))));
        Optional.ofNullable(nBTCompound.getNumberTagOrNull((String)((Object)CP_Cg.a("b", (int)12024, (long)(0x25EB11B9FCE9CC69L ^ l))))).map(Optional::of).orElseGet(() -> {
            long l = a ^ 0x5FA42025D833L;
            return Optional.ofNullable(nBTCompound.getNumberTagOrNull((String)((Object)CP_Cg.a("b", (int)2874, (long)(0x1565EDBF851BEF58L ^ l)))));
        }).map(NBTNumber::getAsInt).ifPresent(ilIlj4::CP_r);
        return ilIlj4.CP_D();
    }

    public static NBT CP_K(PacketWrapper<?> packetWrapper, CP_Cg ilIlCg) {
        return CP_Cg.CP_i(ilIlCg, packetWrapper.CP_w().CP_E());
    }

    @Deprecated
    public static NBT CP_i(CP_Cg ilIlCg, ClientVersion clientVersion) {
        NBTCompound nBTCompound;
        block37: {
            boolean bl;
            block39: {
                block38: {
                    boolean bl2;
                    block35: {
                        NBTCompound nBTCompound2;
                        block36: {
                            long l;
                            block30: {
                                boolean bl3;
                                block31: {
                                    block34: {
                                        block32: {
                                            CP_fa ilIlfa;
                                            block33: {
                                                block29: {
                                                    l = a ^ 0x2987F4BEB52CL;
                                                    bl2 = CP_n7.CP_y();
                                                    try {
                                                        try {
                                                            bl3 = clientVersion.CP_w(ClientVersion.V_1_20_5);
                                                            if (!bl2) break block29;
                                                            if (!bl3) break block30;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw CP_Cg.a(illegalArgumentException);
                                                        }
                                                        bl3 = ilIlCg.CP_V();
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                }
                                                try {
                                                    try {
                                                        try {
                                                            try {
                                                                if (!bl2) break block31;
                                                                if (bl3) break block32;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw CP_Cg.a(illegalArgumentException);
                                                            }
                                                            ilIlfa = ilIlCg.CP_H;
                                                            if (!bl2) break block33;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw CP_Cg.a(illegalArgumentException);
                                                        }
                                                        if (ilIlfa == null) break block32;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    ilIlfa = ilIlCg.CP_H;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                            }
                                            try {
                                                bl3 = ilIlfa.CP_f().isEmpty();
                                                if (!bl2) break block31;
                                                if (!bl3) break block34;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                        }
                                        bl3 = true;
                                        break block31;
                                    }
                                    bl3 = false;
                                }
                                boolean bl4 = bl3;
                                try {
                                    if (bl4) {
                                        return new NBTString(ilIlCg.CP_m.getName().toString());
                                    }
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            nBTCompound2 = new NBTCompound();
                            try {
                                try {
                                    try {
                                        try {
                                            nBTCompound = nBTCompound2;
                                            if (!bl2) break block35;
                                            nBTCompound.setTag((String)((Object)CP_Cg.a("b", (int)1651, (long)(0x25D9EC35EE3B8F02L ^ l))), new NBTString(ilIlCg.CP_m.getName().toString()));
                                            if (!clientVersion.CP_O(ClientVersion.V_1_20_5)) break block36;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        nBTCompound2.setTag((String)((Object)CP_Cg.a("b", (int)14961, (long)(0x5A12E4A82D33331CL ^ l))), new NBTInt(ilIlCg.CP_O()));
                                        nBTCompound = ilIlCg.CP_G;
                                        if (!bl2) break block35;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    if (nBTCompound == null) break block36;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                                nBTCompound2.setTag((String)((Object)CP_Cg.a("b", (int)10904, (long)(0x2AAD3675CA57A3E6L ^ l))), ilIlCg.CP_G);
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                        }
                        nBTCompound = nBTCompound2;
                    }
                    try {
                        try {
                            if (PacketWrapper.CP_z() != null) break block37;
                            if (!bl2) break block38;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        bl = false;
                        break block39;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                bl = true;
            }
            CP_n7.CP_m(bl);
        }
        return nBTCompound;
    }

    public int CP_q() {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x15117FD86203L;
                boolean bl = CP_n7.CP_y();
                try {
                    try {
                        n = this.CP_r.CP_w(ClientVersion.V_1_20_5);
                        if (!bl) break block4;
                        if (n == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    return this.CP_J(ComponentTypes.CP_uo, 1);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            n = this.CP_J().getMaxAmount();
        }
        return n;
    }

    public boolean CP_n() {
        boolean bl;
        block12: {
            block11: {
                block13: {
                    boolean bl2;
                    block10: {
                        long l = a ^ 0x6A82A750EB01L;
                        bl2 = CP_n7.CP_y();
                        try {
                            try {
                                bl = this.CP_q();
                                if (!bl2) break block10;
                                if (bl <= true) break block11;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            bl = this.CP_q();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            try {
                                if (!bl2) break block12;
                                if (!bl) break block13;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            bl = this.CP_h();
                            if (!bl2) break block12;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        if (bl) break block11;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                bl = true;
                break block12;
            }
            bl = false;
        }
        return bl;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean CP_q() {
        NBTCompound nBTCompound;
        boolean bl;
        long l;
        block32: {
            CP_Cg ilIlCg;
            block31: {
                int n;
                block30: {
                    block26: {
                        block27: {
                            boolean bl2;
                            block29: {
                                block28: {
                                    l = a ^ 0xD6BE1CECABFL;
                                    bl = CP_n7.CP_g();
                                    try {
                                        try {
                                            try {
                                                try {
                                                    n = this.CP_r.CP_w(ClientVersion.V_1_20_5);
                                                    if (bl) break block26;
                                                    if (n == 0) break block27;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                                bl2 = this.CP_N(ComponentTypes.InvalidSettingsCheck);
                                                if (bl) break block28;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                            if (!bl2) return false;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        bl2 = this.CP_N(ComponentTypes.CP_B);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (bl) break block29;
                                        if (bl2) return false;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    bl2 = this.CP_N(ComponentTypes.InvalidChunkBatchAckCheck);
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            try {
                                if (bl) return bl2;
                                if (!bl2) return false;
                                return true;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                        }
                        n = this.CP_V();
                    }
                    try {
                        try {
                            try {
                                if (bl) break block30;
                                if (n != 0) return false;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            ilIlCg = this;
                            if (bl) break block31;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        n = ilIlCg.CP_R();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                if (n <= 0) return false;
                ilIlCg = this;
            }
            try {
                try {
                    nBTCompound = ilIlCg.CP_G;
                    if (bl) break block32;
                    if (nBTCompound == null) return true;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
                nBTCompound = this.CP_G;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw CP_Cg.a(illegalArgumentException);
            }
        }
        try {
            boolean bl3 = nBTCompound.getBoolean((String)((Object)CP_Cg.a("b", (int)4282, (long)(0x507F80EFE2596642L ^ l))));
            if (bl) return bl3;
            if (bl3) return false;
            return true;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_Cg.a(illegalArgumentException);
        }
    }

    public boolean CP_h() {
        int n;
        block8: {
            block7: {
                boolean bl;
                block6: {
                    long l = a ^ 0x58E45330AA7L;
                    bl = CP_n7.CP_y();
                    try {
                        try {
                            n = this.CP_q();
                            if (!bl) break block6;
                            if (n == 0) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        n = this.CP_h();
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                try {
                    if (!bl) break block8;
                    if (n <= 0) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
                n = 1;
                break block8;
            }
            n = 0;
        }
        return n != 0;
    }

    public int CP_h() {
        int n;
        block16: {
            block17: {
                int n2;
                block22: {
                    NBTNumber nBTNumber;
                    block20: {
                        NBTNumber nBTNumber2;
                        block21: {
                            NBTNumber nBTNumber3;
                            boolean bl;
                            block23: {
                                block19: {
                                    NBTCompound nBTCompound;
                                    long l;
                                    block18: {
                                        block14: {
                                            block15: {
                                                l = a ^ 0x686AEE035B05L;
                                                bl = CP_n7.CP_y();
                                                try {
                                                    n = this.CP_r.CP_w(ClientVersion.V_1_20_5);
                                                    if (!bl) break block14;
                                                    if (n == 0) break block15;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                                int n3 = this.CP_J(ComponentTypes.InvalidChunkBatchAckCheck, 0);
                                                return CP_h9.CP_n(n3, 0, this.CP_R());
                                            }
                                            n = this.CP_r.CP_w(ClientVersion.V_1_13);
                                        }
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        if (!bl) break block16;
                                                        if (n == 0) break block17;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    nBTCompound = this.CP_G;
                                                    if (!bl) break block18;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                                if (nBTCompound == null) break block19;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                            nBTCompound = this.CP_G;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                    }
                                    nBTNumber3 = nBTCompound.getNumberTagOrNull((String)((Object)CP_Cg.a("b", (int)2418, (long)(0x769AB91BF73D6E2CL ^ l))));
                                    break block23;
                                }
                                nBTNumber3 = null;
                            }
                            nBTNumber2 = nBTNumber3;
                            try {
                                try {
                                    nBTNumber = nBTNumber2;
                                    if (!bl) break block20;
                                    if (nBTNumber != null) break block21;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                                n2 = 0;
                                break block22;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                        }
                        nBTNumber = nBTNumber2;
                    }
                    n2 = nBTNumber.getAsInt();
                }
                return n2;
            }
            n = Math.max(0, this.CP_A);
        }
        return n;
    }

    public void CP_l(int n) {
        block14: {
            block15: {
                CP_Cg ilIlCg;
                boolean bl;
                boolean bl2;
                long l;
                block12: {
                    l = a ^ 0x1AAD205AE18L;
                    bl2 = CP_n7.CP_g();
                    try {
                        try {
                            block13: {
                                try {
                                    try {
                                        bl = this.CP_r.CP_w(ClientVersion.V_1_20_5);
                                        if (bl2) break block12;
                                        if (!bl) break block13;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    this.CP_j(ComponentTypes.InvalidChunkBatchAckCheck, CP_h9.CP_n(n, 0, this.CP_R()));
                                    if (!bl2) break block14;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            ilIlCg = this;
                            if (bl2) break block15;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        bl = ilIlCg.CP_r.CP_w(ClientVersion.V_1_13);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                try {
                    block16: {
                        try {
                            if (!bl) break block16;
                            this.CP_O().setTag((String)((Object)CP_Cg.a("b", (int)12825, (long)(0x5819FA960091A05EL ^ l))), new NBTInt(Math.max(0, n)));
                            if (!bl2) break block14;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                    }
                    ilIlCg = this;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            ilIlCg.CP_A = Math.max(0, n);
        }
    }

    public int CP_R() {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x41CCCA2E72D6L;
                boolean bl = CP_n7.CP_y();
                try {
                    try {
                        n = this.CP_r.CP_w(ClientVersion.V_1_20_5);
                        if (!bl) break block4;
                        if (n == 0) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    return this.CP_J(ComponentTypes.InvalidSettingsCheck, 0);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            n = this.CP_J().getMaxDurability();
        }
        return n;
    }

    public NBTCompound CP_O() {
        NBTCompound nBTCompound;
        block4: {
            block5: {
                long l = a ^ 0x192BB502208FL;
                boolean bl = CP_n7.CP_y();
                try {
                    try {
                        nBTCompound = this.CP_G;
                        if (!bl) break block4;
                        if (nBTCompound != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    this.CP_G = new NBTCompound();
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            nBTCompound = this.CP_G;
        }
        return nBTCompound;
    }

    public ItemType CP_J() {
        CP_Cg ilIlCg;
        block8: {
            block9: {
                ItemType itemType;
                block12: {
                    CP_Cg ilIlCg2;
                    block10: {
                        block11: {
                            long l = a ^ 0x5E9F7AF77179L;
                            boolean bl = CP_n7.CP_y();
                            try {
                                try {
                                    try {
                                        try {
                                            ilIlCg = this;
                                            if (!bl) break block8;
                                            if (!ilIlCg.CP_r.CP_w(ClientVersion.V_1_11)) break block9;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        ilIlCg2 = this;
                                        if (!bl) break block10;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    if (!ilIlCg2.CP_V()) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                                itemType = ItemTypes.AIR;
                                break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                        }
                        ilIlCg2 = this;
                    }
                    itemType = ilIlCg2.CP_m;
                }
                return itemType;
            }
            ilIlCg = this;
        }
        return ilIlCg.CP_m;
    }

    public int CP_O() {
        int n;
        block8: {
            block9: {
                int n2;
                block12: {
                    CP_Cg ilIlCg;
                    block10: {
                        block11: {
                            long l = a ^ 0x5A4CDB8C75EDL;
                            boolean bl = CP_n7.CP_g();
                            try {
                                try {
                                    try {
                                        try {
                                            n = this.CP_r.CP_w(ClientVersion.V_1_11);
                                            if (bl) break block8;
                                            if (n == 0) break block9;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        ilIlCg = this;
                                        if (bl) break block10;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    if (!ilIlCg.CP_V()) break block11;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                                n2 = 0;
                                break block12;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                        }
                        ilIlCg = this;
                    }
                    n2 = ilIlCg.CP_X;
                }
                return n2;
            }
            n = this.CP_X;
        }
        return n;
    }

    public void CP_x(int n) {
        this.CP_X -= n;
    }

    public void CP_v(int n) {
        this.CP_X += n;
    }

    public void CP_m(int n) {
        this.CP_X = n;
    }

    public CP_Cg CP_v(int n) {
        int n2 = Math.min(n, this.CP_O());
        CP_Cg ilIlCg = this.CP_r();
        ilIlCg.CP_m(n2);
        this.CP_x(n2);
        return ilIlCg;
    }

    public CP_Cg CP_r() {
        NBTCompound nBTCompound;
        int n;
        ItemType itemType;
        CP_Cg ilIlCg;
        CP_Cg ilIlCg2;
        block7: {
            CP_Cg ilIlCg3;
            block6: {
                long l = a ^ 0x2815B6195A6CL;
                boolean bl = CP_n7.CP_y();
                try {
                    try {
                        ilIlCg3 = this;
                        if (!bl) break block6;
                        if (!ilIlCg3.CP_V()) break block7;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    ilIlCg3 = CP_P;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            return ilIlCg3;
        }
        try {
            CP_Cg ilIlCg4;
            ilIlCg2 = ilIlCg4;
            ilIlCg = ilIlCg4;
            itemType = this.CP_m;
            n = this.CP_X;
            nBTCompound = this.CP_G == null ? null : this.CP_G.copy();
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_Cg.a(illegalArgumentException);
        }
        ilIlCg2(itemType, n, nBTCompound, this.CP_H == null ? null : this.CP_H.CP_t(), this.CP_A, this.CP_r, this.CP_q);
        return ilIlCg;
    }

    public @Nullable NBTCompound CP_L() {
        return this.CP_G;
    }

    public void CP_A(NBTCompound nBTCompound) {
        this.CP_G = nBTCompound;
    }

    public <T> T CP_J(ComponentType<T> componentType, T t) {
        CP_Cg ilIlCg;
        block4: {
            block5: {
                long l = a ^ 0x44DBF026EE6AL;
                boolean bl = CP_n7.CP_y();
                try {
                    try {
                        ilIlCg = this;
                        if (!bl) break block4;
                        if (!ilIlCg.CP_S()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    return this.CP_Z().CP_Y(componentType, t);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            ilIlCg = this.CP_J().getComponents(this.CP_r).CP_Y(componentType, t);
        }
        return (T)ilIlCg;
    }

    public <T> Optional<T> CP_l(ComponentType<T> componentType) {
        CP_Cg ilIlCg;
        block4: {
            block5: {
                long l = a ^ 0x701D9CFCC06DL;
                boolean bl = CP_n7.CP_g();
                try {
                    try {
                        ilIlCg = this;
                        if (bl) break block4;
                        if (!ilIlCg.CP_S()) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    return this.CP_Z().CP_O(componentType);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            ilIlCg = this;
        }
        return ilIlCg.CP_J().getComponents(this.CP_r).CP_O(componentType);
    }

    public <T> void CP_j(ComponentType<T> componentType, T t) {
        this.CP_Z().CP_a(componentType, t);
    }

    public <T> void CP_e(ComponentType<T> componentType) {
        this.CP_Z().CP_M(componentType);
    }

    public <T> void CP_L(ComponentType<T> componentType, Optional<T> optional) {
        this.CP_Z().CP_O(componentType, optional);
    }

    public boolean CP_N(ComponentType<?> componentType) {
        boolean bl;
        block4: {
            block5: {
                long l = a ^ 0x7E4464E6A935L;
                boolean bl2 = CP_n7.CP_g();
                try {
                    try {
                        bl = this.CP_S();
                        if (bl2) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    return this.CP_Z().CP_M(componentType);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            bl = this.CP_J().getComponents(this.CP_r).CP_M(componentType);
        }
        return bl;
    }

    public boolean CP_S() {
        boolean bl;
        block8: {
            block7: {
                CP_fa ilIlfa;
                boolean bl2;
                block6: {
                    long l = a ^ 0x74E8F0263B08L;
                    bl2 = CP_n7.CP_g();
                    try {
                        try {
                            ilIlfa = this.CP_H;
                            if (bl2) break block6;
                            if (ilIlfa == null) break block7;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        ilIlfa = this.CP_H;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                try {
                    bl = ilIlfa.CP_f().isEmpty();
                    if (bl2) break block8;
                    if (bl) break block7;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
                bl = true;
                break block8;
            }
            bl = false;
        }
        return bl;
    }

    public CP_fa CP_Z() {
        CP_fa ilIlfa;
        block4: {
            block5: {
                long l = a ^ 0x7B406E3F816AL;
                boolean bl = CP_n7.CP_g();
                try {
                    try {
                        ilIlfa = this.CP_H;
                        if (bl) break block4;
                        if (ilIlfa != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    this.CP_H = new CP_fa(this.CP_m.getComponents(this.CP_r), new HashMap(4), this.CP_q);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            ilIlfa = this.CP_H;
        }
        return ilIlfa;
    }

    public void CP_s(@Nullable CP_fa ilIlfa) {
        this.CP_H = ilIlfa;
    }

    public int CP_E() {
        return this.CP_A;
    }

    public void CP_J(int n) {
        this.CP_A = n;
    }

    public boolean CP_k() {
        return this.CP_f(this.CP_r);
    }

    @Deprecated
    public boolean CP_f(ClientVersion clientVersion) {
        boolean bl;
        block46: {
            block44: {
                boolean bl2;
                block45: {
                    block43: {
                        CP_Cg ilIlCg;
                        block42: {
                            ItemType itemType;
                            ItemType itemType2;
                            block38: {
                                block39: {
                                    boolean bl3;
                                    block40: {
                                        block41: {
                                            block34: {
                                                boolean bl4;
                                                block37: {
                                                    block36: {
                                                        block35: {
                                                            block33: {
                                                                long l = a ^ 0x12E20DCC1E06L;
                                                                bl2 = CP_n7.CP_g();
                                                                try {
                                                                    try {
                                                                        bl4 = clientVersion.CP_w(ClientVersion.V_1_20_5);
                                                                        if (bl2) break block33;
                                                                        if (!bl4) break block34;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw CP_Cg.a(illegalArgumentException);
                                                                    }
                                                                    bl4 = this.CP_N(ComponentTypes.CP_A);
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw CP_Cg.a(illegalArgumentException);
                                                                }
                                                            }
                                                            try {
                                                                try {
                                                                    if (bl2) break block35;
                                                                    if (!bl4) break block36;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw CP_Cg.a(illegalArgumentException);
                                                                }
                                                                bl4 = this.CP_k(clientVersion);
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw CP_Cg.a(illegalArgumentException);
                                                            }
                                                        }
                                                        try {
                                                            if (bl2) break block37;
                                                            if (bl4) break block36;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw CP_Cg.a(illegalArgumentException);
                                                        }
                                                        bl4 = true;
                                                        break block37;
                                                    }
                                                    bl4 = false;
                                                }
                                                return bl4;
                                            }
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            ItemType itemType = this.CP_m;
                                                            itemType = ItemTypes.BOOK;
                                                            if (bl2) break block38;
                                                            if (itemType2 != itemType) break block39;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw CP_Cg.a(illegalArgumentException);
                                                        }
                                                        bl3 = this.CP_O();
                                                        if (bl2) break block40;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    if (!bl3) break block41;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                                bl3 = true;
                                                break block40;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                        }
                                        bl3 = false;
                                    }
                                    return bl3;
                                }
                                try {
                                    ilIlCg = this;
                                    if (bl2) break block42;
                                    ItemType itemType = ilIlCg.CP_m;
                                    itemType = ItemTypes.ENCHANTED_BOOK;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            try {
                                if (itemType2 == itemType) {
                                    return false;
                                }
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            ilIlCg = this;
                        }
                        try {
                            try {
                                bl = ilIlCg.CP_q();
                                if (bl2) break block43;
                                if (!bl) break block44;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            bl = this.CP_p();
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                    }
                    try {
                        try {
                            if (bl2) break block45;
                            if (!bl) break block44;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        bl = this.CP_k(clientVersion);
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                try {
                    if (bl2) break block46;
                    if (bl) break block44;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
                bl = true;
                break block46;
            }
            bl = false;
        }
        return bl;
    }

    public boolean CP_UnderScore() {
        return this.CP_k(this.CP_r);
    }

    @Deprecated
    public boolean CP_k(ClientVersion clientVersion) {
        block24: {
            boolean bl;
            block27: {
                block26: {
                    NBTList<NBTCompound> nBTList;
                    boolean bl2;
                    block25: {
                        CP_Cg ilIlCg;
                        block23: {
                            block19: {
                                boolean bl3;
                                block20: {
                                    block22: {
                                        block21: {
                                            block18: {
                                                long l = a ^ 0x70C215707839L;
                                                bl2 = CP_n7.CP_g();
                                                try {
                                                    try {
                                                        bl3 = clientVersion.CP_w(ClientVersion.V_1_20_5);
                                                        if (bl2) break block18;
                                                        if (!bl3) break block19;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    bl3 = this.CP_J(ComponentTypes.CP_T, CP_LE.CP_W).CP_E();
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                            }
                                            try {
                                                try {
                                                    try {
                                                        if (bl2) break block20;
                                                        if (!bl3) break block21;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    bl3 = this.CP_J(ComponentTypes.CP_uO, CP_LE.CP_W).CP_E();
                                                    if (bl2) break block20;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                                if (bl3) break block22;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                        }
                                        bl3 = true;
                                        break block20;
                                    }
                                    bl3 = false;
                                }
                                return bl3;
                            }
                            try {
                                try {
                                    ilIlCg = this;
                                    if (bl2) break block23;
                                    if (ilIlCg.CP_G == null) break block24;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                                ilIlCg = this;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                        }
                        String string = ilIlCg.CP_N(clientVersion);
                        NBTList<NBTCompound> nBTList2 = this.CP_G.getCompoundListTagOrNull(string);
                        try {
                            nBTList = nBTList2;
                            if (bl2) break block25;
                            if (nBTList == null) break block26;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        nBTList = nBTList2;
                    }
                    try {
                        bl = nBTList.getTags().isEmpty();
                        if (bl2) break block27;
                        if (bl) break block26;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    bl = true;
                    break block27;
                }
                bl = false;
            }
            return bl;
        }
        return false;
    }

    public List<CP_ZC> CP_a() {
        return this.CP_k(this.CP_r);
    }

    @Deprecated
    public List<CP_ZC> CP_k(ClientVersion clientVersion) {
        block27: {
            NBTList<NBTCompound> nBTList;
            boolean bl;
            long l;
            block28: {
                CP_Cg ilIlCg;
                block26: {
                    block23: {
                        ArrayList<CP_ZC> arrayList;
                        block25: {
                            Map.Entry<CP_QY, Integer> entry;
                            Iterator<Map.Entry<CP_QY, Integer>> iterator;
                            ArrayList<CP_ZC> arrayList2;
                            block24: {
                                Object object;
                                block22: {
                                    l = a ^ 0x28D5D2DFCB1EL;
                                    bl = CP_n7.CP_y();
                                    try {
                                        try {
                                            object = clientVersion;
                                            if (!bl) break block22;
                                            if (!object.CP_w(ClientVersion.V_1_20_5)) break block23;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        object = this.CP_J(ComponentTypes.CP_T, CP_LE.CP_W);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                }
                                CP_LE ilIlLE = (CP_LE)object;
                                CP_LE ilIlLE2 = this.CP_J(ComponentTypes.CP_uO, CP_LE.CP_W);
                                arrayList2 = new ArrayList<CP_ZC>(ilIlLE.CP_X() + ilIlLE2.CP_X());
                                iterator = ilIlLE.iterator();
                                while (iterator.hasNext()) {
                                    entry = iterator.next();
                                    try {
                                        arrayList2.add(new CP_ZC(entry.getKey(), entry.getValue()));
                                        if (bl) {
                                            if (bl) continue;
                                            break;
                                        }
                                        break block24;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                }
                                iterator = ilIlLE2.iterator();
                            }
                            while (iterator.hasNext()) {
                                entry = iterator.next();
                                try {
                                    arrayList = arrayList2;
                                    if (bl) {
                                        arrayList.add(new CP_ZC(entry.getKey(), entry.getValue()));
                                        if (bl) continue;
                                        break;
                                    }
                                    break block25;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            arrayList = arrayList2;
                        }
                        return arrayList;
                    }
                    try {
                        try {
                            ilIlCg = this;
                            if (!bl) break block26;
                            if (ilIlCg.CP_G == null) break block27;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                        ilIlCg = this;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                String string = ilIlCg.CP_N(clientVersion);
                NBTList<NBTCompound> nBTList2 = this.CP_G.getCompoundListTagOrNull(string);
                try {
                    nBTList = nBTList2;
                    if (!bl) break block28;
                    if (nBTList == null) break block27;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
                nBTList = nBTList2;
            }
            List<NBTCompound> list = nBTList.getTags();
            ArrayList<CP_ZC> arrayList = new ArrayList<CP_ZC>(list.size());
            for (NBTCompound nBTCompound : list) {
                block30: {
                    CP_QY ilIlQY = CP_Cg.CP_U(nBTCompound, clientVersion);
                    if (ilIlQY != null) {
                        NBTNumber nBTNumber;
                        block29: {
                            NBTNumber nBTNumber2 = nBTCompound.getNumberTagOrNull((String)((Object)CP_Cg.a("b", (int)16200, (long)(0x73FCC80E49D7480AL ^ l))));
                            try {
                                nBTNumber = nBTNumber2;
                                if (!bl) break block29;
                                if (nBTNumber == null) break block30;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            nBTNumber = nBTNumber2;
                        }
                        int n = nBTNumber.getAsInt();
                        CP_ZC ilIlZC = CP_ZC.CP_s().CP_l(ilIlQY).CP_M(n).CP_X();
                        arrayList.add(ilIlZC);
                    }
                }
                if (bl) continue;
            }
            return arrayList;
        }
        return new ArrayList<CP_ZC>(0);
    }

    public int CP_j(CP_QY ilIlQY) {
        return this.CP_K(ilIlQY, this.CP_r);
    }

    @Deprecated
    public int CP_K(CP_QY ilIlQY, ClientVersion clientVersion) {
        int n;
        block35: {
            block33: {
                NBTList<NBTCompound> nBTList;
                boolean bl;
                long l;
                block34: {
                    CP_Cg ilIlCg;
                    block32: {
                        block27: {
                            int n2;
                            block30: {
                                block31: {
                                    CP_LE ilIlLE;
                                    block28: {
                                        block29: {
                                            Object object;
                                            block26: {
                                                l = a ^ 0x2CB3DF0E753CL;
                                                bl = CP_n7.CP_y();
                                                try {
                                                    try {
                                                        object = clientVersion;
                                                        if (!bl) break block26;
                                                        if (!object.CP_w(ClientVersion.V_1_20_5)) break block27;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    object = this.CP_J(ComponentTypes.CP_T, CP_LE.CP_W);
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                            }
                                            CP_LE ilIlLE2 = (CP_LE)object;
                                            try {
                                                try {
                                                    ilIlLE = ilIlLE2;
                                                    if (!bl) break block28;
                                                    if (ilIlLE.CP_E()) break block29;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                                ilIlLE = ilIlLE2;
                                                if (!bl) break block28;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                            int n3 = ilIlLE.CP_v(ilIlQY);
                                            try {
                                                if (n3 > 0) {
                                                    return n3;
                                                }
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                        }
                                        ilIlLE = this.CP_J(ComponentTypes.CP_uO, CP_LE.CP_W);
                                    }
                                    CP_LE ilIlLE3 = ilIlLE;
                                    try {
                                        try {
                                            n2 = ilIlLE3.CP_E();
                                            if (!bl) break block30;
                                            if (n2 != 0) break block31;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        return ilIlLE3.CP_v(ilIlQY);
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                }
                                n2 = 0;
                            }
                            return n2;
                        }
                        try {
                            try {
                                ilIlCg = this;
                                if (!bl) break block32;
                                if (ilIlCg.CP_G == null) break block33;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            ilIlCg = this;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                    }
                    String string = ilIlCg.CP_N(clientVersion);
                    NBTList<NBTCompound> nBTList2 = this.CP_G.getCompoundListTagOrNull(string);
                    try {
                        nBTList = nBTList2;
                        if (!bl) break block34;
                        if (nBTList == null) break block33;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    nBTList = nBTList2;
                }
                for (NBTCompound nBTCompound : nBTList.getTags()) {
                    block36: {
                        int n3;
                        block39: {
                            block38: {
                                NBTNumber nBTNumber;
                                block37: {
                                    CP_QY ilIlQY2 = CP_Cg.CP_U(nBTCompound, clientVersion);
                                    try {
                                        n = Objects.equals(ilIlQY2, ilIlQY) ? 1 : 0;
                                        if (!bl) break block35;
                                        if (n == 0) break block36;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    NBTNumber nBTNumber2 = nBTCompound.getNumberTagOrNull((String)((Object)CP_Cg.a("b", (int)20075, (long)(0x792F4A72298E071EL ^ l))));
                                    try {
                                        nBTNumber = nBTNumber2;
                                        if (!bl) break block37;
                                        if (nBTNumber == null) break block38;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    nBTNumber = nBTNumber2;
                                }
                                n3 = nBTNumber.getAsInt();
                                break block39;
                            }
                            n3 = 0;
                        }
                        return n3;
                    }
                    if (bl) continue;
                }
            }
            n = 0;
        }
        return n;
    }

    private static @Nullable CP_QY CP_U(NBTCompound nBTCompound, ClientVersion clientVersion) {
        CP_QY ilIlQY;
        long l = a ^ 0x4F90487EFF83L;
        if (clientVersion.CP_w(ClientVersion.V_1_13)) {
            String string = nBTCompound.getStringTagValueOrNull((String)((Object)CP_Cg.a("b", (int)120, (long)(0x6FA02FA21B1AC3BFL ^ l))));
            return CP_yM.CP_v(string);
        }
        NBTShort nBTShort = nBTCompound.getTagOfTypeOrNull((String)((Object)CP_Cg.a("b", (int)1651, (long)(0x25D98A2252FBC5ADL ^ l))), NBTShort.class);
        try {
            ilIlQY = nBTShort != null ? CP_yM.CP_C(clientVersion, nBTShort.getAsInt()) : null;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_Cg.a(illegalArgumentException);
        }
        return ilIlQY;
    }

    public void CP_b(List<CP_ZC> list) {
        this.CP_i(list, this.CP_r);
    }

    /*
     * Could not resolve type clashes
     * Unable to fully structure code
     */
    @Deprecated
    public void CP_i(List<CP_ZC> var1_1, ClientVersion var2_2) {
        block31: {
            block29: {
                block32: {
                    block30: {
                        block35: {
                            block28: {
                                block27: {
                                    var3_3 = CP_Cg.a ^ 118406900101562L;
                                    var5_4 = CP_n7.CP_y();
                                    if (!var2_2.CP_w(ClientVersion.V_1_20_5)) break block35;
                                    var6_5 = new HashMap<K, V>(var1_1.size());
                                    for (Optional<CP_LE> var8_7 : var1_1) {
                                        try {
                                            var6_5.put(var8_7.CP_o(), var8_7.CP_q());
                                            if (var5_4) {
                                                if (var5_4) continue;
                                                break;
                                            }
                                            break block27;
                                        }
                                        catch (IllegalArgumentException v0) {
                                            throw CP_Cg.a(v0);
                                        }
                                    }
                                    try {
                                        if (!this.CP_N(ComponentTypes.CP_uO)) break block27;
                                        v1 = ComponentTypes.CP_uO;
                                        break block28;
                                    }
                                    catch (IllegalArgumentException v2) {
                                        throw CP_Cg.a(v2);
                                    }
                                }
                                v1 = ComponentTypes.CP_T;
                            }
                            var7_6 = v1;
                            var8_7 = this.CP_l(var7_6);
                            var9_8 = var8_7.map((Function<CP_LE, Boolean>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, CP_i(), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/component/CP_LE;)Ljava/lang/Boolean;)()).orElse(true);
                            this.CP_j(var7_6, new CP_LE((Map<CP_QY, Integer>)var6_5, var9_8));
                            if (var5_4) break block31;
                        }
                        var6_5 = this.CP_N(var2_2);
                        try {
                            try {
                                try {
                                    if (!var1_1.isEmpty()) break block29;
                                    v3 /* !! */  = this.CP_G;
                                    if (!var5_4) break block30;
                                }
                                catch (IllegalArgumentException v4) {
                                    throw CP_Cg.a(v4);
                                }
                                if (v3 /* !! */  == null) break block31;
                            }
                            catch (IllegalArgumentException v5) {
                                throw CP_Cg.a(v5);
                            }
                            v3 /* !! */  = this.CP_G.getTagOrNull((String)var6_5);
                        }
                        catch (IllegalArgumentException v6) {
                            throw CP_Cg.a(v6);
                        }
                    }
                    try {
                        try {
                            if (!var5_4) break block32;
                            if (v3 /* !! */  == null) break block31;
                        }
                        catch (IllegalArgumentException v7) {
                            throw CP_Cg.a(v7);
                        }
                        v3 /* !! */  = this.CP_G.removeTag((String)var6_5);
                    }
                    catch (IllegalArgumentException v8) {
                        throw CP_Cg.a(v8);
                    }
                }
                if (var5_4) break block31;
            }
            var7_6 = new ArrayList<E>();
            for (CP_ZC var9_9 : var1_1) {
                block34: {
                    block33: {
                        var10_10 = new NBTCompound();
                        try {
                            try {
                                try {
                                    if (!var5_4) break block31;
                                    if (!var5_4) break block33;
                                }
                                catch (IllegalArgumentException v9) {
                                    throw CP_Cg.a(v9);
                                }
                                if (var2_2.CP_w(ClientVersion.V_1_13)) {
                                }
                                ** GOTO lbl86
                            }
                            catch (IllegalArgumentException v10) {
                                throw CP_Cg.a(v10);
                            }
                            var10_10.setTag((String)CP_Cg.a("b", (int)1651, (long)(2727402376649313172L ^ var3_3)), new NBTString(var9_9.CP_o().getName().toString()));
                        }
                        catch (IllegalArgumentException v11) {
                            throw CP_Cg.a(v11);
                        }
                    }
                    try {
                        if (var5_4) break block34;
lbl86:
                        // 2 sources

                        var10_10.setTag((String)CP_Cg.a("b", (int)1651, (long)(2727402376649313172L ^ var3_3)), new NBTShort((short)var9_9.CP_o().CP_H(var2_2)));
                    }
                    catch (IllegalArgumentException v12) {
                        throw CP_Cg.a(v12);
                    }
                }
                var10_10.setTag((String)CP_Cg.a("b", (int)20075, (long)(8732212982411969432L ^ var3_3)), new NBTShort((short)var9_9.CP_q()));
                var7_6.add((NBTCompound)var10_10);
                if (var5_4) continue;
            }
            this.CP_O().setTag((String)var6_5, new NBTList<CP_LE>((CP_Z1<CP_LE>)CP_Z1.CP_N, (List<CP_LE>)var7_6));
        }
    }

    @Deprecated
    public String CP_N(ClientVersion clientVersion) {
        CallSite callSite;
        long l = a ^ 0x313B057B1CDEL;
        try {
            CallSite callSite2 = callSite = clientVersion.CP_w(ClientVersion.V_1_13) ? CP_Cg.a("b", (int)6996, (long)(0x2AD97555C0413BD3L ^ l)) : CP_Cg.a("b", (int)3324, (long)(0x198893D14A722C6CL ^ l));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_Cg.a(illegalArgumentException);
        }
        if (this.CP_m == ItemTypes.ENCHANTED_BOOK) {
            callSite = CP_Cg.a("b", (int)1593, (long)(0x4195E0B3849EA6A4L ^ l));
        }
        return callSite;
    }

    public boolean CP_p() {
        boolean bl;
        block2: {
            block3: {
                long l = a ^ 0xB8E6C1311D6L;
                boolean bl2 = CP_n7.CP_g();
                try {
                    bl = this.CP_R();
                    if (bl2) break block2;
                    if (bl <= false) break block3;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
                bl = true;
                break block2;
            }
            bl = false;
        }
        return bl;
    }

    public boolean CP_L(ItemType itemType) {
        boolean bl;
        long l = a ^ 0x55FD95AF8CEL;
        try {
            bl = this.CP_J() == itemType;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_Cg.a(illegalArgumentException);
        }
        return bl;
    }

    public static boolean CP_k(CP_Cg ilIlCg, CP_Cg ilIlCg2) {
        return CP_Cg.CP_x(ilIlCg, ilIlCg2);
    }

    public static boolean CP_x(CP_Cg ilIlCg, CP_Cg ilIlCg2) {
        boolean bl;
        block50: {
            block47: {
                block51: {
                    boolean bl2;
                    block48: {
                        block46: {
                            block38: {
                                block39: {
                                    boolean bl3;
                                    block44: {
                                        block41: {
                                            block45: {
                                                block42: {
                                                    block40: {
                                                        ClientVersion clientVersion;
                                                        ClientVersion clientVersion2;
                                                        block36: {
                                                            block37: {
                                                                long l = a ^ 0x6DEEA970D2B3L;
                                                                bl2 = CP_n7.CP_g();
                                                                try {
                                                                    try {
                                                                        clientVersion2 = ilIlCg.CP_r;
                                                                        clientVersion = ilIlCg2.CP_r;
                                                                        if (bl2) break block36;
                                                                        if (clientVersion2 == clientVersion) break block37;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw CP_Cg.a(illegalArgumentException);
                                                                    }
                                                                    throw new IllegalArgumentException((String)((Object)CP_Cg.a("b", (int)8696, (long)(0x7FBDE8488FB4F0BL ^ l))) + (Object)((Object)ilIlCg.CP_r) + (String)((Object)CP_Cg.a("b", (int)24683, (long)(0x21E4992AEB090E94L ^ l))) + (Object)((Object)ilIlCg2.CP_r));
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw CP_Cg.a(illegalArgumentException);
                                                                }
                                                            }
                                                            clientVersion2 = ilIlCg.CP_r;
                                                            clientVersion = ClientVersion.V_1_20_5;
                                                        }
                                                        try {
                                                            try {
                                                                try {
                                                                    try {
                                                                        bl = clientVersion2.CP_w(clientVersion);
                                                                        if (bl2) break block38;
                                                                        if (!bl) break block39;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw CP_Cg.a(illegalArgumentException);
                                                                    }
                                                                    bl3 = ilIlCg.CP_L(ilIlCg2.CP_J());
                                                                    if (bl2) break block40;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw CP_Cg.a(illegalArgumentException);
                                                                }
                                                                if (!bl3) break block41;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw CP_Cg.a(illegalArgumentException);
                                                            }
                                                            bl3 = ilIlCg.CP_V();
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw CP_Cg.a(illegalArgumentException);
                                                        }
                                                    }
                                                    try {
                                                        block43: {
                                                            try {
                                                                try {
                                                                    try {
                                                                        if (bl2) break block42;
                                                                        if (!bl3) break block43;
                                                                    }
                                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                                        throw CP_Cg.a(illegalArgumentException);
                                                                    }
                                                                    bl3 = ilIlCg2.CP_V();
                                                                    if (bl2) break block44;
                                                                }
                                                                catch (IllegalArgumentException illegalArgumentException) {
                                                                    throw CP_Cg.a(illegalArgumentException);
                                                                }
                                                                if (bl3) break block45;
                                                            }
                                                            catch (IllegalArgumentException illegalArgumentException) {
                                                                throw CP_Cg.a(illegalArgumentException);
                                                            }
                                                        }
                                                        bl3 = ilIlCg.CP_Z().equals(ilIlCg2.CP_Z());
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                }
                                                try {
                                                    if (bl2) break block44;
                                                    if (!bl3) break block41;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                            }
                                            bl3 = true;
                                            break block44;
                                        }
                                        bl3 = false;
                                    }
                                    return bl3;
                                }
                                bl = ilIlCg.CP_L(ilIlCg2.CP_J());
                            }
                            try {
                                try {
                                    if (bl2) break block46;
                                    if (!bl) break block47;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                                bl = ilIlCg.CP_V();
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                        }
                        try {
                            block49: {
                                try {
                                    try {
                                        try {
                                            if (bl2) break block48;
                                            if (!bl) break block49;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        bl = ilIlCg2.CP_V();
                                        if (bl2) break block50;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    if (bl) break block51;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            bl = Objects.equals(ilIlCg.CP_G, ilIlCg2.CP_G);
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                    }
                    try {
                        if (bl2) break block50;
                        if (!bl) break block47;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                }
                bl = true;
                break block50;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean CP_j(@Nullable CP_Cg ilIlCg, @Nullable CP_Cg ilIlCg2) {
        boolean bl;
        block28: {
            block29: {
                ClientVersion clientVersion;
                ClientVersion clientVersion2;
                boolean bl2;
                block26: {
                    block27: {
                        CP_Cg ilIlCg3;
                        long l;
                        block24: {
                            block25: {
                                block22: {
                                    block23: {
                                        block20: {
                                            block21: {
                                                l = a ^ 0xA3F49C254ADL;
                                                bl2 = CP_n7.CP_g();
                                                try {
                                                    try {
                                                        ilIlCg3 = ilIlCg;
                                                        if (bl2) break block20;
                                                        if (ilIlCg3 != ilIlCg2) break block21;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    return true;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                            }
                                            ilIlCg3 = ilIlCg;
                                        }
                                        try {
                                            try {
                                                if (bl2) break block22;
                                                if (ilIlCg3 != null) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                            return ilIlCg2.CP_V();
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                    }
                                    ilIlCg3 = ilIlCg2;
                                }
                                try {
                                    try {
                                        if (bl2) break block24;
                                        if (ilIlCg3 != null) break block25;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    return ilIlCg.CP_V();
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            ilIlCg3 = ilIlCg;
                        }
                        try {
                            try {
                                clientVersion2 = ilIlCg3.CP_r;
                                clientVersion = ilIlCg2.CP_r;
                                if (bl2) break block26;
                                if (clientVersion2 == clientVersion) break block27;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            throw new IllegalArgumentException((String)((Object)CP_Cg.a("b", (int)13687, (long)(0x6D7D500829E25D8AL ^ l))) + (Object)((Object)ilIlCg.CP_r) + (String)((Object)CP_Cg.a("b", (int)15161, (long)(0x4E3DE2A4A4EAD3CAL ^ l))) + (Object)((Object)ilIlCg2.CP_r));
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                    }
                    clientVersion2 = ilIlCg.CP_r;
                    clientVersion = ClientVersion.V_1_20_5;
                }
                try {
                    try {
                        bl = clientVersion2.CP_w(clientVersion);
                        if (bl2) break block28;
                        if (!bl) break block29;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    return ilIlCg.CP_Z().equals(ilIlCg2.CP_Z());
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            bl = Objects.equals(ilIlCg.CP_G, ilIlCg2.CP_G);
        }
        return bl;
    }

    public boolean CP_V() {
        int n;
        block26: {
            int n2;
            block27: {
                int n3;
                block28: {
                    block30: {
                        int n4;
                        boolean bl;
                        long l;
                        block24: {
                            block25: {
                                block23: {
                                    CP_Cg ilIlCg;
                                    block22: {
                                        l = a ^ 0x51EFDEB357BBL;
                                        bl = CP_n7.CP_g();
                                        try {
                                            try {
                                                ilIlCg = this;
                                                if (bl) break block22;
                                                if (ilIlCg.CP_m == ItemTypes.AIR) break block23;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                            ilIlCg = this;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        n4 = ilIlCg.CP_X;
                                        if (bl) break block24;
                                        if (n4 > 0) break block25;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                }
                                n4 = 1;
                                break block24;
                            }
                            n4 = 0;
                        }
                        n2 = n4;
                        try {
                            block29: {
                                try {
                                    try {
                                        try {
                                            try {
                                                try {
                                                    try {
                                                        try {
                                                            n = this.CP_r.CP_Z(ClientVersion.V_1_12_2);
                                                            if (bl) break block26;
                                                            if (n == 0) break block27;
                                                        }
                                                        catch (IllegalArgumentException illegalArgumentException) {
                                                            throw CP_Cg.a(illegalArgumentException);
                                                        }
                                                        n3 = n2;
                                                        if (bl) break block28;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    if (n3 != 0) break block29;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                                n3 = this.CP_A;
                                                if (bl) break block28;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                            if (n3 < CP_Cg.b("a", (int)30024, (long)(0x41C2C35CE4E13FA8L ^ l))) break block29;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        n3 = this.CP_A;
                                        if (bl) break block28;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    if (n3 <= CP_Cg.b("a", (int)16404, (long)(0x3B46D847A2FA0AF5L ^ l))) break block30;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            n3 = 1;
                            break block28;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                    }
                    n3 = 0;
                }
                return n3 != 0;
            }
            n = n2;
        }
        return n != 0;
    }

    public ClientVersion CP_z() {
        return this.CP_r;
    }

    public CP_z CP_W() {
        return this.CP_q;
    }

    public boolean equals(Object object) {
        boolean bl;
        block28: {
            block29: {
                int n;
                block35: {
                    block31: {
                        CP_Cg ilIlCg;
                        boolean bl2;
                        block34: {
                            block33: {
                                block32: {
                                    block30: {
                                        Object object2;
                                        block26: {
                                            block27: {
                                                long l = a ^ 0x269131354CB0L;
                                                bl2 = CP_n7.CP_y();
                                                try {
                                                    try {
                                                        object2 = this;
                                                        if (!bl2) break block26;
                                                        if (object2 != object) break block27;
                                                    }
                                                    catch (IllegalArgumentException illegalArgumentException) {
                                                        throw CP_Cg.a(illegalArgumentException);
                                                    }
                                                    return true;
                                                }
                                                catch (IllegalArgumentException illegalArgumentException) {
                                                    throw CP_Cg.a(illegalArgumentException);
                                                }
                                            }
                                            object2 = object;
                                        }
                                        try {
                                            bl = object2 instanceof CP_Cg;
                                            if (!bl2) break block28;
                                            if (!bl) break block29;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        ilIlCg = (CP_Cg)object;
                                        try {
                                            try {
                                                n = this.CP_m.equals(ilIlCg.CP_m);
                                                if (!bl2) break block30;
                                                if (n == 0) break block31;
                                            }
                                            catch (IllegalArgumentException illegalArgumentException) {
                                                throw CP_Cg.a(illegalArgumentException);
                                            }
                                            n = this.CP_X;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                    }
                                    try {
                                        try {
                                            if (!bl2) break block32;
                                            if (n != ilIlCg.CP_X) break block31;
                                        }
                                        catch (IllegalArgumentException illegalArgumentException) {
                                            throw CP_Cg.a(illegalArgumentException);
                                        }
                                        n = Objects.equals(this.CP_G, ilIlCg.CP_G) ? 1 : 0;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                }
                                try {
                                    try {
                                        if (!bl2) break block33;
                                        if (n == 0) break block31;
                                    }
                                    catch (IllegalArgumentException illegalArgumentException) {
                                        throw CP_Cg.a(illegalArgumentException);
                                    }
                                    n = Objects.equals(this.CP_H, ilIlCg.CP_H) ? 1 : 0;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                            }
                            try {
                                try {
                                    if (!bl2) break block34;
                                    if (n == 0) break block31;
                                }
                                catch (IllegalArgumentException illegalArgumentException) {
                                    throw CP_Cg.a(illegalArgumentException);
                                }
                                n = this.CP_A;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                        }
                        try {
                            try {
                                if (!bl2) break block35;
                                if (n != ilIlCg.CP_A) break block31;
                            }
                            catch (IllegalArgumentException illegalArgumentException) {
                                throw CP_Cg.a(illegalArgumentException);
                            }
                            n = 1;
                            break block35;
                        }
                        catch (IllegalArgumentException illegalArgumentException) {
                            throw CP_Cg.a(illegalArgumentException);
                        }
                    }
                    n = 0;
                }
                return n != 0;
            }
            bl = false;
        }
        return bl;
    }

    public String toString() {
        String string;
        StringBuilder stringBuilder;
        String string2;
        StringBuilder stringBuilder2;
        Object object;
        StringBuilder stringBuilder3;
        long l;
        block11: {
            block12: {
                l = a ^ 0x2634558B95C5L;
                boolean bl = CP_n7.CP_g();
                try {
                    if (this.CP_V()) {
                        return CP_Cg.a("b", (int)5541, (long)(0x75BAB86E5579BC3AL ^ l));
                    }
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
                try {
                    try {
                        stringBuilder3 = new StringBuilder().append((String)((Object)CP_Cg.a("b", (int)23422, (long)(0x1E057EDC653472E8L ^ l)))).append(this.CP_O()).append((String)((Object)CP_Cg.a("b", (int)22631, (long)(0x3F224EFC6B271EDL ^ l)))).append(this.CP_q());
                        object = CP_Cg.a("b", (int)3679, (long)(0x2AFB620AF6E927DCL ^ l));
                        if (bl) break block11;
                        stringBuilder3 = stringBuilder3.append((String)object).append(this.CP_m.getName());
                        if (this.CP_G == null) break block12;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Cg.a(illegalArgumentException);
                    }
                    object = (String)((Object)CP_Cg.a("b", (int)3612, (long)(0x55D2482DD9B3A792L ^ l))) + this.CP_G.getTagNames();
                    break block11;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Cg.a(illegalArgumentException);
                }
            }
            object = "";
        }
        try {
            stringBuilder2 = stringBuilder3.append((String)object);
            string2 = this.CP_A != -1 ? (String)((Object)CP_Cg.a("b", (int)9447, (long)(0x5D0E7B0996680D6FL ^ l))) + this.CP_A : "";
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_Cg.a(illegalArgumentException);
        }
        try {
            stringBuilder = stringBuilder2.append(string2);
            string = this.CP_H != null ? (String)((Object)CP_Cg.a("b", (int)10443, (long)(0x5B785390711C0146L ^ l))) + this.CP_H.CP_f() : "";
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw CP_Cg.a(illegalArgumentException);
        }
        return stringBuilder.append(string).append("]").toString();
    }

    public static CP_j4 CP_q() {
        return new CP_j4();
    }

    /* synthetic */ CP_Cg(ItemType itemType, int n, NBTCompound nBTCompound, CP_fa ilIlfa, int n2, ClientVersion clientVersion, CP_z ilIlz, CP_a ilIla) {
        this(itemType, n, nBTCompound, ilIlfa, n2, clientVersion, ilIlz);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        CP_Cg.a = CP_s.a(-7827763783541044280L, 5091885442910769953L, MethodHandles.lookup().lookupClass()).a(239151677344973L);
                        CP_Cg.d = new HashMap<K, V>(13);
                        CP_Cg.CP_c(new PacketWrapper[5]);
                        var11 = CP_Cg.a ^ 72888814046753L;
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
                        var20_3 = new String[28];
                        var18_4 = 0;
                        var17_5 = "b\u00c8\u008b\u008e\u008e\u009cr?U\u00b7w\u00b8\u00e2\u0089\u00c3 \u00e5\u001f\u00c2\u0018\u0094\f\u0017\u00cc\u008e\u00e5\u0096\u0089\u00a9\u00bew\u00ec\u0010\u00cf`\u009cU\u00c5\u0098\u00aa\u00d3\u001d\u00c5y\u00c3Mc\u00b4\"\u0010\u00ba\u00e2\b\u00f1\u00b5\u00ea>y/`j*\u00cbw\u00ab\u00f9(\u008a\fs\u00ad2\u00bd.\u00fe\u00cd\u0089\u00d7J\u00cc_\u008e\u00adB\u00da\tl\u0098\u00d3o\u00aee!\u0095~\u00b2}$\u00c8\u0099hJ\u009b\u009d\u00cf\u0093c\u0010\u00e1\u00c1\u00d8\u0080R\u0001\u0015\u00e4\u0092\u00fcf+\u008b\u00a8\u00eb\u0090 -\u0012`l\u00b4\u00a4\u00e5\u00ae\u00c2\u00f3\u0000\u00f8\u00d0E\u00acD\u00af\u008f\u000e\u00c3U\u0013\u000f\u001d\u00abr\u00b9\u00cb\u00a5\u00a7\u0094\u00f4\u0010)\u00d9\u00ef\"\u008a\u001f\u0000\u0017pW\u00ee\u00c7b\u00f1\u008c\u00db\u0010\u00cf=\u00c4s\u00993\u00fcE\u00cc*\u00d0\u00b0\u00ac|q\u00afP\u0094o\u00ed\u00aed\u008b8\"\u00bb@\u0089\u0001\u00c8q\u00c9\u00e8b\"\t\u007f*\u0006-\u0013(\u00af\u000e\u00f6\u00d6\u0086U\u00c4\u0019\u00c1\u00a7p\u00fd\u00b5J7N\u00af\u0002\u0098\u0084e\u00b4\u00b84\u0095B\u00d4\u00cb\u00f2\u00eb \u0088ypo\u00ca\u00e8UhcER\u0004\u0087\u008b\u00e23Y\u00d2\u000eGu]Y\u00c4\u0010\u00e3\u00b2\u0084F\u00dd\u008b&7\f0\u00bf\u008c\u0094\u009d\u00af\u008c\u00103WR\u00f3\u00cb\\\u001b\u00eb\u00a7~\u00ff\u00cfP\u0095\u0004\u008e(5\u009d\n\u00a4\u00c8\u009efb\u00d7N\u00c2\u00f45\u008f\r2\u00a6t\u0016\b\u009eG\u0001\u0001\u000bX4\u00d55\u00de\u0084z\u00ecl\u00ab\u00d5s-z\u00b5\u0010lL\u0015GwO\u00b1O<?3\u0011\u0093\u00dc-\u00fa8\u001fi\u00def\u00a3\u0017!\u00fa\u000e\u00bb\u00cdR\u00f9\u00bf]\u00e7c\u0019\u0012\u00bb`\u00c1\u00bc\u0000Z\u00be\u00f1\u00e1\u00e5\u00e4\u0099t\u00f5\u00a8\u00e1+\u00ca^\u008ac\u00a5\u0086{oj\u00e1\u00ec\u00a82\u0095\u0087\u00b8\u00e6e\u00e3\u001a\u0010\u0002\u000b\u00d1}\u00b1\u00b9\u00c1\u00a7t\u00ba\u00bf&^\u0091\u00dd,\u0018\u00b0\u00f3_\u0000(RU\u00dcj4\u00aba\u00a8\u00e8B1\u0007\u00f7/\u0002j\u00c5\u00edc\u0010\u00df\u00197\u00c7\u00ddj\u00a5q\u0002\u00db\u00b4\u0094\u00e2\u00de\u0010\u00b3\u0018\u00dc{\u001a\u00ecZ\u00d8`>\u008e\u00dc\u00ef\u0018N\u00e2\u00a6\u009d\u00fc\u0085\u00ec(w~\u00a5!(^b\u008f\u00c5\u0094\u00d4\u00b3G\u00e9u#\u00a8\u00e5\u009d\u0092\u00a5.{\u009b9];\u00e3\u0011~c{\u001b\u00af\u00ba\u00c4\u00a7\u00a1\u00d5+J\u00c7P\u001f4\u0010\u00af\u00f0f\u00f7\u00f7\u00cd\u00b5\u00ac6\u0097\u00eft\u00b0l\u00e9\u00e8\u0010E\u00ca\u00de\"F\u0003\u0099IC\u00a88F\u0015\u0098K\u00f4\u0010Z\u00f7\u00f7m\u0003\u00aa\u009eb\u00fe-\u00fd\u00fa\u009a\u009d\u00cb\u0098\u0010Rl\u00d7\u00e22\u00a5E\u0097\u0082\u001b\u0091*f\u00e4\u00a5g\u0010\u00aax{\u00bb$*\u00b4\u0002\u00fdO\u00e2S\u009b&\u001c\u00a7H-=t\u00a6\u0019\u00fc<.\u00eb\u00ec\u001e\u0091\u00bc\u00d5\u00e6\u00b1\u008b\u00cf\u0012\u00d5\u00a8\u00e0\u00cd\u007fV\u00db\u0096Y\u0003z?i]\u00c8\u00de\u00fd\n\u00d2\u00a8J\u0095\\>\u0094s\u00f0\u007fUf6kCD3\u0089\u0082:zy\u0018\u00b5\u009a\u00a9\u0015kJ\u00e4\u007ft\u00f5\u0081\u00ba\u0010|\u00ce\u00cd\u00c9\u00db\u00ca\u00d6\u00cdjX\u0016qowI\u00ac";
                        var19_6 = "b\u00c8\u008b\u008e\u008e\u009cr?U\u00b7w\u00b8\u00e2\u0089\u00c3 \u00e5\u001f\u00c2\u0018\u0094\f\u0017\u00cc\u008e\u00e5\u0096\u0089\u00a9\u00bew\u00ec\u0010\u00cf`\u009cU\u00c5\u0098\u00aa\u00d3\u001d\u00c5y\u00c3Mc\u00b4\"\u0010\u00ba\u00e2\b\u00f1\u00b5\u00ea>y/`j*\u00cbw\u00ab\u00f9(\u008a\fs\u00ad2\u00bd.\u00fe\u00cd\u0089\u00d7J\u00cc_\u008e\u00adB\u00da\tl\u0098\u00d3o\u00aee!\u0095~\u00b2}$\u00c8\u0099hJ\u009b\u009d\u00cf\u0093c\u0010\u00e1\u00c1\u00d8\u0080R\u0001\u0015\u00e4\u0092\u00fcf+\u008b\u00a8\u00eb\u0090 -\u0012`l\u00b4\u00a4\u00e5\u00ae\u00c2\u00f3\u0000\u00f8\u00d0E\u00acD\u00af\u008f\u000e\u00c3U\u0013\u000f\u001d\u00abr\u00b9\u00cb\u00a5\u00a7\u0094\u00f4\u0010)\u00d9\u00ef\"\u008a\u001f\u0000\u0017pW\u00ee\u00c7b\u00f1\u008c\u00db\u0010\u00cf=\u00c4s\u00993\u00fcE\u00cc*\u00d0\u00b0\u00ac|q\u00afP\u0094o\u00ed\u00aed\u008b8\"\u00bb@\u0089\u0001\u00c8q\u00c9\u00e8b\"\t\u007f*\u0006-\u0013(\u00af\u000e\u00f6\u00d6\u0086U\u00c4\u0019\u00c1\u00a7p\u00fd\u00b5J7N\u00af\u0002\u0098\u0084e\u00b4\u00b84\u0095B\u00d4\u00cb\u00f2\u00eb \u0088ypo\u00ca\u00e8UhcER\u0004\u0087\u008b\u00e23Y\u00d2\u000eGu]Y\u00c4\u0010\u00e3\u00b2\u0084F\u00dd\u008b&7\f0\u00bf\u008c\u0094\u009d\u00af\u008c\u00103WR\u00f3\u00cb\\\u001b\u00eb\u00a7~\u00ff\u00cfP\u0095\u0004\u008e(5\u009d\n\u00a4\u00c8\u009efb\u00d7N\u00c2\u00f45\u008f\r2\u00a6t\u0016\b\u009eG\u0001\u0001\u000bX4\u00d55\u00de\u0084z\u00ecl\u00ab\u00d5s-z\u00b5\u0010lL\u0015GwO\u00b1O<?3\u0011\u0093\u00dc-\u00fa8\u001fi\u00def\u00a3\u0017!\u00fa\u000e\u00bb\u00cdR\u00f9\u00bf]\u00e7c\u0019\u0012\u00bb`\u00c1\u00bc\u0000Z\u00be\u00f1\u00e1\u00e5\u00e4\u0099t\u00f5\u00a8\u00e1+\u00ca^\u008ac\u00a5\u0086{oj\u00e1\u00ec\u00a82\u0095\u0087\u00b8\u00e6e\u00e3\u001a\u0010\u0002\u000b\u00d1}\u00b1\u00b9\u00c1\u00a7t\u00ba\u00bf&^\u0091\u00dd,\u0018\u00b0\u00f3_\u0000(RU\u00dcj4\u00aba\u00a8\u00e8B1\u0007\u00f7/\u0002j\u00c5\u00edc\u0010\u00df\u00197\u00c7\u00ddj\u00a5q\u0002\u00db\u00b4\u0094\u00e2\u00de\u0010\u00b3\u0018\u00dc{\u001a\u00ecZ\u00d8`>\u008e\u00dc\u00ef\u0018N\u00e2\u00a6\u009d\u00fc\u0085\u00ec(w~\u00a5!(^b\u008f\u00c5\u0094\u00d4\u00b3G\u00e9u#\u00a8\u00e5\u009d\u0092\u00a5.{\u009b9];\u00e3\u0011~c{\u001b\u00af\u00ba\u00c4\u00a7\u00a1\u00d5+J\u00c7P\u001f4\u0010\u00af\u00f0f\u00f7\u00f7\u00cd\u00b5\u00ac6\u0097\u00eft\u00b0l\u00e9\u00e8\u0010E\u00ca\u00de\"F\u0003\u0099IC\u00a88F\u0015\u0098K\u00f4\u0010Z\u00f7\u00f7m\u0003\u00aa\u009eb\u00fe-\u00fd\u00fa\u009a\u009d\u00cb\u0098\u0010Rl\u00d7\u00e22\u00a5E\u0097\u0082\u001b\u0091*f\u00e4\u00a5g\u0010\u00aax{\u00bb$*\u00b4\u0002\u00fdO\u00e2S\u009b&\u001c\u00a7H-=t\u00a6\u0019\u00fc<.\u00eb\u00ec\u001e\u0091\u00bc\u00d5\u00e6\u00b1\u008b\u00cf\u0012\u00d5\u00a8\u00e0\u00cd\u007fV\u00db\u0096Y\u0003z?i]\u00c8\u00de\u00fd\n\u00d2\u00a8J\u0095\\>\u0094s\u00f0\u007fUf6kCD3\u0089\u0082:zy\u0018\u00b5\u009a\u00a9\u0015kJ\u00e4\u007ft\u00f5\u0081\u00ba\u0010|\u00ce\u00cd\u00c9\u00db\u00ca\u00d6\u00cdjX\u0016qowI\u00ac".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_Cg.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00c9h*&\u000e\u00d6\u0013\u00c9\u00e1jMm\u00fe\u00c2\u009e\u00fa \u00810`\u0011\u00d9=\u00c1\u0002]\u00cb\u00f7yB\u00e7\u00e8\u00b2u\u00cc\u00b5@%\u00ea\u00abMRY\u00ac\u00ae\u00bbL\u00ec\u0011";
                            var19_6 = "\u00c9h*&\u000e\u00d6\u0013\u00c9\u00e1jMm\u00fe\u00c2\u009e\u00fa \u00810`\u0011\u00d9=\u00c1\u0002]\u00cb\u00f7yB\u00e7\u00e8\u00b2u\u00cc\u00b5@%\u00ea\u00abMRY\u00ac\u00ae\u00bbL\u00ec\u0011".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_Cg.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block14;
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
                CP_Cg.b = var20_3;
                CP_Cg.c = new String[28];
                CP_Cg.g = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u00a6\u00af\u00f0U\u0097b\u00c9\u00c2\u00b1\u00aby(\u0016H\u00b3\u00dd";
                var5_15 = "\u00a6\u00af\u00f0U\u0097b\u00c9\u00c2\u00b1\u00aby(\u0016H\u00b3\u00dd".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl74:
                // 1 sources

                while (true) {
                    var6_12[v10] = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
                    if (var2_16 < var5_15) ** continue;
                    break block16;
                    break;
                }
            }
            var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
            v10 = var3_13++;
            var8_18 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            ** while (true)
        }
        CP_Cg.e = var6_12;
        CP_Cg.f = new Integer[2];
        CP_Cg.CP_P = CP_Cg.CP_q().CP_c(new NBTCompound()).CP_D();
    }

    public static void CP_c(PacketWrapper[] packetWrapperArray) {
        CP_B = packetWrapperArray;
    }

    public static PacketWrapper[] CP_v() {
        return CP_B;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x61A2;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/CP_Cg", exception);
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
            CP_Cg.c[n2] = CP_Cg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Cg.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/CP_Cg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x40B0;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/CP_Cg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Cg.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Cg.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/item/CP_Cg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Cg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Cg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

