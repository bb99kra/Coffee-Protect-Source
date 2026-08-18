/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.Cache
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
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
import me.nik.coffeeprotect.CP_OQ;
import me.nik.coffeeprotect.CP_oI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_AK<E>
extends AbstractSet<E>
implements Set<E>,
Serializable {
    private static final Object CP_c;
    private final ConcurrentMap<E, Object> CP_B;
    private final Cache<E, Object> CP_k;
    private static final long a;
    private static transient /* synthetic */ String VuXOxxObXa = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_AK(long l) {
        long l2 = a ^ 0x3D7D6D195E1L;
        String string = CP_oI.CP_n();
        this.CP_k = CacheBuilder.newBuilder().expireAfterWrite(l, TimeUnit.MILLISECONDS).build((CacheLoader)new CP_OQ(this));
        String string2 = string;
        this.CP_B = this.CP_k.asMap();
        if (PacketWrapper.CP_z() == null) {
            CP_oI.CP_U("x4Kveb");
        }
    }

    @Override
    public Iterator<E> iterator() {
        return this.CP_B.keySet().iterator();
    }

    @Override
    public boolean contains(Object object) {
        this.CP_k.cleanUp();
        return this.CP_B.containsKey(object);
    }

    @Override
    public int size() {
        this.CP_k.cleanUp();
        return this.CP_B.size();
    }

    @Override
    public boolean add(E e) {
        long l = a ^ 0x329D0EDAF597L;
        return this.CP_B.put(e, CP_c) == null;
    }

    static /* synthetic */ Object CP_W() {
        return CP_c;
    }

    static {
        a = CP_s.a(4509482400178551896L, -3067572870922504388L, MethodHandles.lookup().lookupClass()).a(263384970808698L);
        CP_c = new Object();
    }
}
