/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 *  org.jspecify.annotations.Nullable
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_jH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.MappedEntity;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.jspecify.annotations.NullMarked;
import org.jspecify.annotations.Nullable;

@NullMarked
public abstract class CP_T2
implements MappedEntity {
    protected final @Nullable TypesBuilderData CP_e;
    private static boolean CP_m;
    private static final long c;
    private static final long j;

    protected CP_T2(@Nullable TypesBuilderData typesBuilderData) {
        this.CP_e = typesBuilderData;
    }

    public @Nullable TypesBuilderData CP_v() {
        return this.CP_e;
    }

    @Override
    public ResourceLocation getName() {
        long l = c ^ 0x4F8F39FA1B4CL;
        try {
            if (this.CP_e != null) {
                return this.CP_e.CP_UnderScore();
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CP_T2.b(unsupportedOperationException);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public int CP_H(ClientVersion clientVersion) {
        block5: {
            TypesBuilderData typesBuilderData;
            block4: {
                long l = c ^ 0x35A3D35A91EEL;
                boolean bl = CP_T2.CP_i();
                try {
                    try {
                        typesBuilderData = this.CP_e;
                        if (bl) break block4;
                        if (typesBuilderData == null) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw CP_T2.b(unsupportedOperationException);
                    }
                    typesBuilderData = this.CP_e;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CP_T2.b(unsupportedOperationException);
                }
            }
            return typesBuilderData.getId(clientVersion);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean CP_T() {
        boolean bl;
        long l = c ^ 0x3D6B8C6636A4L;
        try {
            bl = this.CP_e != null;
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CP_T2.b(unsupportedOperationException);
        }
        return bl;
    }

    public boolean equals(Object object) {
        boolean bl;
        block29: {
            block30: {
                CP_T2 ilIlT2;
                boolean bl2;
                block27: {
                    block28: {
                        CP_T2 ilIlT22;
                        block25: {
                            block26: {
                                block23: {
                                    block24: {
                                        long l = c ^ 0x1F3577BAF155L;
                                        bl2 = CP_T2.CP_i();
                                        try {
                                            block22: {
                                                try {
                                                    try {
                                                        if (object == null) break block22;
                                                        ilIlT22 = this;
                                                        if (bl2) break block23;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw CP_T2.b(unsupportedOperationException);
                                                    }
                                                    if (ilIlT22.getClass() == object.getClass()) break block24;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw CP_T2.b(unsupportedOperationException);
                                                }
                                            }
                                            return false;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw CP_T2.b(unsupportedOperationException);
                                        }
                                    }
                                    ilIlT22 = this;
                                }
                                try {
                                    try {
                                        if (bl2) break block25;
                                        if (ilIlT22 != object) break block26;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw CP_T2.b(unsupportedOperationException);
                                    }
                                    return true;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw CP_T2.b(unsupportedOperationException);
                                }
                            }
                            ilIlT22 = (CP_T2)object;
                        }
                        CP_T2 ilIlT23 = ilIlT22;
                        try {
                            try {
                                try {
                                    try {
                                        ilIlT2 = this;
                                        if (bl2) break block27;
                                        if (ilIlT2.CP_e == null) break block28;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw CP_T2.b(unsupportedOperationException);
                                    }
                                    ilIlT2 = ilIlT23;
                                    if (bl2) break block27;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw CP_T2.b(unsupportedOperationException);
                                }
                                if (ilIlT2.CP_e == null) break block28;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw CP_T2.b(unsupportedOperationException);
                            }
                            return this.CP_e.CP_UnderScore().equals(ilIlT23.CP_e.CP_UnderScore());
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw CP_T2.b(unsupportedOperationException);
                        }
                    }
                    ilIlT2 = this;
                }
                try {
                    try {
                        bl = ilIlT2 instanceof CP_jH;
                        if (bl2) break block29;
                        if (!bl) break block30;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw CP_T2.b(unsupportedOperationException);
                    }
                    return ((CP_jH)((Object)this)).deepEquals(object);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CP_T2.b(unsupportedOperationException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public int hashCode() {
        int n;
        block10: {
            block11: {
                CP_T2 ilIlT2;
                boolean bl;
                block8: {
                    block9: {
                        long l = c ^ 0x5330437DEC5FL;
                        bl = CP_T2.CP_e();
                        try {
                            try {
                                ilIlT2 = this;
                                if (!bl) break block8;
                                if (ilIlT2.CP_e == null) break block9;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw CP_T2.b(unsupportedOperationException);
                            }
                            return Objects.hash(this.getClass(), this.CP_e.CP_UnderScore());
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw CP_T2.b(unsupportedOperationException);
                        }
                    }
                    ilIlT2 = this;
                }
                try {
                    try {
                        n = ilIlT2 instanceof CP_jH;
                        if (!bl) break block10;
                        if (n == 0) break block11;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw CP_T2.b(unsupportedOperationException);
                    }
                    return ((CP_jH)((Object)this)).deepHashCode();
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw CP_T2.b(unsupportedOperationException);
                }
            }
            n = System.identityHashCode(this);
        }
        return n;
    }

    public String toString() {
        Object object;
        StringBuilder stringBuilder;
        block6: {
            TypesBuilderData typesBuilderData;
            block4: {
                block5: {
                    long l = c ^ 0x58A4113A241L;
                    boolean bl = CP_T2.CP_e();
                    try {
                        try {
                            stringBuilder = new StringBuilder().append(this.getClass().getSimpleName()).append("[");
                            typesBuilderData = this.CP_e;
                            if (!bl) break block4;
                            if (typesBuilderData != null) break block5;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw CP_T2.b(unsupportedOperationException);
                        }
                        object = this.hashCode();
                        break block6;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw CP_T2.b(unsupportedOperationException);
                    }
                }
                typesBuilderData = this.CP_e;
            }
            object = typesBuilderData.CP_UnderScore();
        }
        return stringBuilder.append(object).append((char)j).toString();
    }

    public static void CP_h(boolean bl) {
        CP_m = bl;
    }

    public static boolean CP_i() {
        return CP_m;
    }

    public static boolean CP_e() {
        boolean bl = CP_T2.CP_i();
        try {
            if (!bl) {
                return true;
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CP_T2.b(unsupportedOperationException);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        c = CP_s.a(7605966489406568381L, -4711554238490330283L, MethodHandles.lookup().lookupClass()).a(255507496396703L);
        long l = c ^ 0x3856BE5BFA99L;
        CP_T2.CP_h(false);
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                long l2 = -5531003376675256979L;
                byte[] byArray3 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
                j = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    private static UnsupportedOperationException b(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

