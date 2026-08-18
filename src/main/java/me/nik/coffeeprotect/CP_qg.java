/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import me.nik.coffeeprotect.CP_CA;
import me.nik.coffeeprotect.CP_oI;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

public class CP_qg<K, V>
extends HashMap<K, V> {
    private final long CP_l;
    private final Map<Long, CP_CA<K, V>> CP_R = new HashMap<Long, CP_CA<K, V>>();
    private static final long a = CP_s.a(-7055410901447717863L, 9106680948339066501L, MethodHandles.lookup().lookupClass()).a(161746255422673L);
    private static transient /* synthetic */ String fWJfOtKRJq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_qg(long l) {
        this.CP_l = l;
    }

    @Override
    public V get(Object object) {
        long l = a ^ 0x78FB4BCAA2BDL;
        String string = CP_oI.CP_n();
        this.CP_y();
        Iterator<CP_CA<K, V>> iterator = this.CP_R.values().iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            block4: {
                Object object2;
                block3: {
                    CP_CA<K, V> ilIlCA = iterator.next();
                    object2 = ilIlCA.CP_Q();
                    if (string2 != null) break block3;
                    if (object2 != object) break block4;
                    object2 = ilIlCA.CP_Z();
                }
                return (V)object2;
            }
            if (string2 == null) continue;
        }
        return null;
    }

    public V CP_n(Object object, V v) {
        CP_CA<K, V> ilIlCA;
        block5: {
            long l = a ^ 0x6BD7290E7289L;
            this.CP_y();
            CP_CA<K, V> ilIlCA2 = null;
            Iterator<CP_CA<K, V>> iterator = this.CP_R.values().iterator();
            String string = CP_oI.CP_n();
            while (iterator.hasNext()) {
                CP_CA<K, V> ilIlCA3;
                CP_CA<K, V> ilIlCA4 = ilIlCA3 = iterator.next();
                if (string == null) {
                    ilIlCA = (CP_CA<K, V>)ilIlCA4.CP_Q();
                    if (string != null) break block5;
                    if (ilIlCA != object) continue;
                    ilIlCA4 = ilIlCA2 = ilIlCA3;
                }
                if (string == null) continue;
            }
            ilIlCA = ilIlCA2;
            if (string == null) {
                if (ilIlCA != null) {
                    this.CP_R.values().remove(ilIlCA2);
                    return ilIlCA2.CP_Z();
                }
                ilIlCA = (CP_CA<K, V>)v;
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
            String string2 = CP_oI.CP_n();
            this.CP_y();
            string = string2;
            v3 = null;
            for (CP_CA<K, V> ilIlCA : this.CP_R.values()) {
                v2 = (V)ilIlCA.CP_Q();
                if (string == null) {
                    if (string == null) {
                        if (v2 != object) continue;
                        V v4 = v3 = ilIlCA.CP_Z();
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
        this.CP_y();
        this.CP_R.put(System.currentTimeMillis(), new CP_CA<K, V>(k, v));
        return v;
    }

    @Override
    public V putIfAbsent(K k, V v) {
        V v2;
        String string;
        V v3;
        block5: {
            long l = a ^ 0x3DC903FB1A9FL;
            String string2 = CP_oI.CP_n();
            this.CP_y();
            v3 = null;
            string = string2;
            for (CP_CA<K, V> ilIlCA : this.CP_R.values()) {
                v2 = (V)ilIlCA.CP_Q();
                if (string == null) {
                    if (string == null) {
                        if (v2 != k) continue;
                        V v4 = v3 = ilIlCA.CP_Z();
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
        this.CP_y();
        return this.CP_R.size();
    }

    @Override
    public boolean containsKey(Object object) {
        long l = a ^ 0x2260E05D93A5L;
        String string = CP_oI.CP_n();
        this.CP_y();
        Iterator<CP_CA<K, V>> iterator = this.CP_R.values().iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            CP_CA<K, V> ilIlCA = iterator.next();
            if (ilIlCA.CP_Q() == object) {
                return true;
            }
            if (string2 == null) continue;
        }
        return false;
    }

    @Override
    public boolean containsValue(Object object) {
        long l = a ^ 0x660489CF3499L;
        String string = CP_oI.CP_n();
        this.CP_y();
        Iterator<CP_CA<K, V>> iterator = this.CP_R.values().iterator();
        String string2 = string;
        while (iterator.hasNext()) {
            CP_CA<K, V> ilIlCA = iterator.next();
            if (ilIlCA.CP_Z() == object) {
                return true;
            }
            if (string2 == null) continue;
        }
        return false;
    }

    @Override
    public void clear() {
        this.CP_R.clear();
    }

    private void CP_y() {
        this.CP_R.keySet().removeIf(l -> {
            long l2 = a ^ 0x5CF370BFBC62L;
            String string = CP_oI.CP_n();
            long l3 = System.currentTimeMillis() - l - this.CP_l;
            long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
            if (string == null) {
                l4 = l4 > 0 ? (long)1 : (long)0;
            }
            return (boolean)l4;
        });
    }
}
