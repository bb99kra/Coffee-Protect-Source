/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component;

import java.lang.invoke.MethodHandles;
import java.util.function.Function;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.ComponentType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.CP_G1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.CP_ZU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.StaticComponentMap$Builder;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.mapper.CP_T2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBT;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class StaticComponentType<T>
extends CP_T2
implements ComponentType<T> {
    @Nullable
    private final CP_Q9<T> reader;
    @Nullable
    private final CP_Ow<T> writer;
    @Nullable
    private final CP_G1<T> decoder;
    @Nullable
    private final CP_ZU<T> encoder;
    private static final long a = CP_s.a(6106093577907897347L, 1486049921924608088L, MethodHandles.lookup().lookupClass()).a(187042610170692L);
    private static transient /* synthetic */ String xpHDzgidTv = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @ApiStatus.Internal
    public StaticComponentType(@Nullable TypesBuilderData typesBuilderData, @Nullable CP_Q9<T> ilIlQ9, @Nullable CP_Ow<T> ilIlOw) {
        this(typesBuilderData, ilIlQ9, ilIlOw, null, null);
    }

    @ApiStatus.Internal
    public StaticComponentType(@Nullable TypesBuilderData typesBuilderData, @Nullable CP_G1<T> ilIlG1, @Nullable CP_ZU<T> ilIlZU) {
        this(typesBuilderData, null, null, ilIlG1, ilIlZU);
    }

    @ApiStatus.Internal
    public StaticComponentType(@Nullable TypesBuilderData typesBuilderData, @Nullable CP_Q9<T> ilIlQ9, @Nullable CP_Ow<T> ilIlOw, @Nullable CP_G1<T> ilIlG1, @Nullable CP_ZU<T> ilIlZU) {
        super(typesBuilderData);
        this.reader = ilIlQ9;
        this.writer = ilIlOw;
        this.decoder = ilIlG1;
        this.encoder = ilIlZU;
    }

    @Override
    public T read(PacketWrapper<?> packetWrapper) {
        CP_Q9<Object> ilIlQ9;
        block4: {
            block5: {
                long l = a ^ 0x7BF1448DC156L;
                boolean bl = StaticComponentMap$Builder.CP_D();
                try {
                    try {
                        ilIlQ9 = this.reader;
                        if (!bl) break block4;
                        if (ilIlQ9 == null) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw StaticComponentType.a(unsupportedOperationException);
                    }
                    ilIlQ9 = this.reader.apply(packetWrapper);
                    break block4;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw StaticComponentType.a(unsupportedOperationException);
                }
            }
            ilIlQ9 = null;
        }
        return (T)ilIlQ9;
    }

    @Override
    public void write(PacketWrapper<?> packetWrapper, T t) {
        block5: {
            CP_Ow<PacketWrapper<?>> ilIlOw;
            block4: {
                long l = a ^ 0x51879CD7D4F7L;
                boolean bl = StaticComponentMap$Builder.CP_D();
                try {
                    try {
                        ilIlOw = this.writer;
                        if (!bl) break block4;
                        if (ilIlOw == null) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw StaticComponentType.a(unsupportedOperationException);
                    }
                    ilIlOw = this.writer;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw StaticComponentType.a(unsupportedOperationException);
                }
            }
            ilIlOw.accept(packetWrapper, t);
        }
    }

    @Override
    public T decode(NBT nBT, ClientVersion clientVersion) {
        block5: {
            CP_G1<T> ilIlG1;
            block4: {
                long l = a ^ 0x4FD89992595CL;
                boolean bl = StaticComponentMap$Builder.CP_D();
                try {
                    try {
                        ilIlG1 = this.decoder;
                        if (!bl) break block4;
                        if (ilIlG1 == null) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw StaticComponentType.a(unsupportedOperationException);
                    }
                    ilIlG1 = this.decoder.CP_H(nBT, clientVersion);
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw StaticComponentType.a(unsupportedOperationException);
                }
            }
            return (T)ilIlG1;
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public NBT encode(T t, ClientVersion clientVersion) {
        block5: {
            CP_ZU<T> ilIlZU;
            block4: {
                long l = a ^ 0x6458CB1E24D0L;
                boolean bl = StaticComponentMap$Builder.CP_D();
                try {
                    try {
                        ilIlZU = this.encoder;
                        if (!bl) break block4;
                        if (ilIlZU == null) break block5;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw StaticComponentType.a(unsupportedOperationException);
                    }
                    ilIlZU = this.encoder;
                }
                catch (UnsupportedOperationException unsupportedOperationException) {
                    throw StaticComponentType.a(unsupportedOperationException);
                }
            }
            return ilIlZU.CP_e(t, clientVersion);
        }
        throw new UnsupportedOperationException();
    }

    @Override
    public <Z> ComponentType<Z> legacyMap(Function<T, Z> function, Function<Z, T> function2) {
        StaticComponentType<T> staticComponentType;
        block28: {
            boolean bl;
            block30: {
                block29: {
                    CP_ZU<Object> ilIlZU;
                    CP_G1<T> ilIlG1;
                    CP_Ow ilIlOw;
                    CP_Q9 ilIlQ9;
                    boolean bl2;
                    block26: {
                        block27: {
                            CP_G1<Object> ilIlG12;
                            block24: {
                                block25: {
                                    CP_Ow ilIlOw2;
                                    block22: {
                                        block23: {
                                            CP_Q9 ilIlQ92;
                                            block20: {
                                                block21: {
                                                    long l = a ^ 0x3247183E8408L;
                                                    bl2 = StaticComponentMap$Builder.CP_t();
                                                    try {
                                                        try {
                                                            ilIlQ92 = this.reader;
                                                            if (bl2) break block20;
                                                            if (ilIlQ92 == null) break block21;
                                                        }
                                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                                            throw StaticComponentType.a(unsupportedOperationException);
                                                        }
                                                        ilIlQ92 = packetWrapper -> function.apply(this.reader.apply((PacketWrapper)packetWrapper));
                                                        break block20;
                                                    }
                                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                                        throw StaticComponentType.a(unsupportedOperationException);
                                                    }
                                                }
                                                ilIlQ92 = null;
                                            }
                                            ilIlQ9 = ilIlQ92;
                                            try {
                                                try {
                                                    ilIlOw2 = this.writer;
                                                    if (bl2) break block22;
                                                    if (ilIlOw2 == null) break block23;
                                                }
                                                catch (UnsupportedOperationException unsupportedOperationException) {
                                                    throw StaticComponentType.a(unsupportedOperationException);
                                                }
                                                ilIlOw2 = (packetWrapper, object) -> this.writer.accept((PacketWrapper)packetWrapper, function2.apply(object));
                                                break block22;
                                            }
                                            catch (UnsupportedOperationException unsupportedOperationException) {
                                                throw StaticComponentType.a(unsupportedOperationException);
                                            }
                                        }
                                        ilIlOw2 = null;
                                    }
                                    ilIlOw = ilIlOw2;
                                    try {
                                        try {
                                            ilIlG12 = this.decoder;
                                            if (bl2) break block24;
                                            if (ilIlG12 == null) break block25;
                                        }
                                        catch (UnsupportedOperationException unsupportedOperationException) {
                                            throw StaticComponentType.a(unsupportedOperationException);
                                        }
                                        ilIlG12 = (nBT, clientVersion) -> function.apply(this.decoder.CP_H(nBT, clientVersion));
                                        break block24;
                                    }
                                    catch (UnsupportedOperationException unsupportedOperationException) {
                                        throw StaticComponentType.a(unsupportedOperationException);
                                    }
                                }
                                ilIlG12 = null;
                            }
                            ilIlG1 = ilIlG12;
                            try {
                                try {
                                    ilIlZU = this.encoder;
                                    if (bl2) break block26;
                                    if (ilIlZU == null) break block27;
                                }
                                catch (UnsupportedOperationException unsupportedOperationException) {
                                    throw StaticComponentType.a(unsupportedOperationException);
                                }
                                ilIlZU = (object, clientVersion) -> this.encoder.CP_e(function2.apply(object), clientVersion);
                                break block26;
                            }
                            catch (UnsupportedOperationException unsupportedOperationException) {
                                throw StaticComponentType.a(unsupportedOperationException);
                            }
                        }
                        ilIlZU = null;
                    }
                    CP_ZU<T> ilIlZU2 = ilIlZU;
                    try {
                        try {
                            staticComponentType = new StaticComponentType<T>(this.CP_e, ilIlQ9, ilIlOw, ilIlG1, ilIlZU2);
                            if (PacketWrapper.CP_z() != null) break block28;
                            if (!bl2) break block29;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw StaticComponentType.a(unsupportedOperationException);
                        }
                        bl = false;
                        break block30;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw StaticComponentType.a(unsupportedOperationException);
                    }
                }
                bl = true;
            }
            StaticComponentMap$Builder.CP_b(bl);
        }
        return staticComponentType;
    }

    private static UnsupportedOperationException a(UnsupportedOperationException unsupportedOperationException) {
        return unsupportedOperationException;
    }
}

