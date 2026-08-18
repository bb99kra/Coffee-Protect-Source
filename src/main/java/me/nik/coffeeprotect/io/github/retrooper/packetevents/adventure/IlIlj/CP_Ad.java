/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.CP_Z1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_j.CP_A9;

final class CP_Ad<E extends Enum<E>>
extends CP_A9<E> {
    private final Map<String, E> CP_k;
    private static final long c = CP_s.a(7210992146366921178L, -153733907156705431L, MethodHandles.lookup().lookupClass()).a(171545955100927L);
    private static transient /* synthetic */ String IDQljAoIpw = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    CP_Ad(Class<E> clazz) {
        long l = c ^ 0x7F7540007AFFL;
        String string = CP_Z1.CP_b();
        super(clazz);
        String string2 = string;
        this.CP_k = new HashMap<String, E>();
        for (Enum enum_ : (Enum[])clazz.getEnumConstants()) {
            this.CP_k.put(enum_.name().toLowerCase(Locale.ROOT), enum_);
            if (string2 == null) continue;
        }
    }

    public E CP_w(String string) throws IllegalArgumentException {
        Enum enum_;
        block4: {
            Enum enum_2;
            block5: {
                long l = c ^ 0x4CDBFBA64749L;
                enum_2 = (Enum)this.CP_k.get(string.toLowerCase(Locale.ROOT));
                String string2 = CP_Z1.CP_b();
                try {
                    try {
                        enum_ = enum_2;
                        if (string2 != null) break block4;
                        if (enum_ != null) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw CP_Ad.b(illegalArgumentException);
                    }
                    throw CP_Ad.CP_k(string, this.CP_I(), null);
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw CP_Ad.b(illegalArgumentException);
                }
            }
            enum_ = enum_2;
        }
        return (E)enum_;
    }

    private static IllegalArgumentException b(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
    }
}

