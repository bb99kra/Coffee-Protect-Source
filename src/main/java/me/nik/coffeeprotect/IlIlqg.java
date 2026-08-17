/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import me.nik.coffeeprotect.IlIlCA;
import me.nik.coffeeprotect.IlIloI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public class IlIlqg<K, V>
extends HashMap<K, V> {
    private final long IlIll;
    private final Map<Long, IlIlCA<K, V>> IlIlR = new HashMap<Long, IlIlCA<K, V>>();
    private static final long a = IlIls.a((long)-7055410901447717863L, (long)9106680948339066501L, MethodHandles.lookup().lookupClass()).a(161746255422673L);
    private static transient /* synthetic */ String fWJfOtKRJq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlqg(long l) {
        this.IlIll = l;
    }

    @Override
    public V get(Object object) {
        long l = a ^ 0x78FB4BCAA2BDL;
        String string = IlIloI.IlIln();
        this.IlIly();
        Iterator<IlIlCA<K, V>> iterator = this.IlIlR.values().iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            block4: {
                Object object2;
                block3: {
                    IlIlCA<K, V> ilIlCA = iterator.next();
                    object2 = ilIlCA.IlIlQ();
                    if (string2 != null) break block3;
                    if (object2 != object) break block4;
                    object2 = ilIlCA.IlIlZ();
                }
                return (V)object2;
            }
            if (string2 == null) continue;
        }
        return null;
    }

    public V IlIln(Object object, V v) {
        IlIlCA<K, V> ilIlCA;
        block5: {
            long l = a ^ 0x6BD7290E7289L;
            this.IlIly();
            IlIlCA<K, V> ilIlCA2 = null;
            Iterator<IlIlCA<K, V>> iterator = this.IlIlR.values().iterator();
            String string = IlIloI.IlIln();
            while (iterator.hasNext()) {
                IlIlCA<K, V> ilIlCA3;
                IlIlCA<K, V> ilIlCA4 = ilIlCA3 = iterator.next();
                if (string == null) {
                    ilIlCA = (IlIlCA<K, V>)ilIlCA4.IlIlQ();
                    if (string != null) break block5;
                    if (ilIlCA != object) continue;
                    ilIlCA4 = ilIlCA2 = ilIlCA3;
                }
                if (string == null) continue;
            }
            ilIlCA = ilIlCA2;
            if (string == null) {
                if (ilIlCA != null) {
                    this.IlIlR.values().remove(ilIlCA2);
                    return ilIlCA2.IlIlZ();
                }
                ilIlCA = (IlIlCA<K, V>)v;
            }
        }
        return (V)ilIlCA;
    }

    @Override
    public V getOrDefault(Object object, V v) {
        V v2;
        V v3;
        String string;
        block4: {
            long l = a ^ 0x4015DCABF4C0L;
            String string2 = IlIloI.IlIln();
            this.IlIly();
            string = string2;
            v3 = null;
            for (IlIlCA<K, V> ilIlCA : this.IlIlR.values()) {
                v2 = (V)ilIlCA.IlIlQ();
                if (string == null) {
                    if (string == null) {
                        if (v2 != object) continue;
                        V v4 = v3 = ilIlCA.IlIlZ();
                    }
                    if (string == null) continue;
                }
                break block4;
            }
            v2 = v3;
        }
        if (string == null) {
            v2 = v2 != null ? v3 : (V)v;
        }
        return v2;
    }

    @Override
    public V put(K k, V v) {
        this.IlIly();
        this.IlIlR.put(System.currentTimeMillis(), new IlIlCA<K, V>(k, v));
        return v;
    }

    @Override
    public V putIfAbsent(K k, V v) {
        V v2;
        String string;
        V v3;
        block5: {
            long l = a ^ 0x3DC903FB1A9FL;
            String string2 = IlIloI.IlIln();
            this.IlIly();
            v3 = null;
            string = string2;
            for (IlIlCA<K, V> ilIlCA : this.IlIlR.values()) {
                v2 = (V)ilIlCA.IlIlQ();
                if (string == null) {
                    if (string == null) {
                        if (v2 != k) continue;
                        V v4 = v3 = ilIlCA.IlIlZ();
                    }
                    if (string == null) continue;
                }
                break block5;
            }
            v2 = v3;
        }
        if (string == null) {
            if (v2 == null) {
                v3 = this.put(k, v);
            }
            v2 = v3;
        }
        return v2;
    }

    @Override
    public int size() {
        this.IlIly();
        return this.IlIlR.size();
    }

    @Override
    public boolean containsKey(Object object) {
        long l = a ^ 0x2260E05D93A5L;
        String string = IlIloI.IlIln();
        this.IlIly();
        Iterator<IlIlCA<K, V>> iterator = this.IlIlR.values().iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            IlIlCA<K, V> ilIlCA = iterator.next();
            if (ilIlCA.IlIlQ() == object) {
                return true;
            }
            if (string2 == null) continue;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object object) {
        long l = a ^ 0x660489CF3499L;
        String string = IlIloI.IlIln();
        this.IlIly();
        Iterator<IlIlCA<K, V>> iterator = this.IlIlR.values().iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            IlIlCA<K, V> ilIlCA = iterator.next();
            if (ilIlCA.IlIlZ() == object) {
                return true;
            }
            if (string2 == null) continue;
        }
        return false;
    }

    @Override
    public void clear() {
        this.IlIlR.clear();
    }

    private void IlIly() {
        this.IlIlR.keySet().removeIf(l -> {
            long l2 = a ^ 0x5CF370BFBC62L;
            String string = IlIloI.IlIln();
            long l3 = System.currentTimeMillis() - l - this.IlIll;
            long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
            if (string == null) {
                l4 = l4 > 0 ? (long)1 : (long)0;
            }
            return (boolean)l4;
        });
    }
}

