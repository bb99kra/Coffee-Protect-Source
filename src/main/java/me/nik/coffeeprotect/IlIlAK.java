/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.Cache
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 */
package me.nik.coffeeprotect;

import com.google.common.cache.Cache;
import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import java.io.Serializable;
import java.lang.invoke.MethodHandles;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.TimeUnit;
import me.nik.coffeeprotect.IlIlOQ;
import me.nik.coffeeprotect.IlIloI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class IlIlAK<E>
extends AbstractSet<E>
implements Set<E>,
Serializable {
    private static final Object IlIlc;
    private final ConcurrentMap<E, Object> IlIlB;
    private final Cache<E, Object> IlIlk;
    private static final long a;
    private static transient /* synthetic */ String VuXOxxObXa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlAK(long l) {
        long l2 = a ^ 0x3D7D6D195E1L;
        String string = IlIloI.IlIln();
        this.IlIlk = CacheBuilder.newBuilder().expireAfterWrite(l, TimeUnit.MILLISECONDS).build((CacheLoader)new IlIlOQ(this));
        String string2 = string;
        this.IlIlB = this.IlIlk.asMap();
        if (PacketWrapper.IlIlz() == null) {
            IlIloI.IlIlU("x4Kveb");
        }
    }

    @Override
    public Iterator<E> iterator() {
        return this.IlIlB.keySet().iterator();
    }

    @Override
    public boolean contains(Object object) {
        this.IlIlk.cleanUp();
        return this.IlIlB.containsKey(object);
    }

    @Override
    public int size() {
        this.IlIlk.cleanUp();
        return this.IlIlB.size();
    }

    @Override
    public boolean add(E e) {
        long l = a ^ 0x329D0EDAF597L;
        return this.IlIlB.put(e, IlIlc) == null;
    }

    static /* synthetic */ Object IlIlW() {
        return IlIlc;
    }

    static {
        a = IlIls.a((long)4509482400178551896L, (long)-3067572870922504388L, MethodHandles.lookup().lookupClass()).a(263384970808698L);
        IlIlc = new Object();
    }
}

