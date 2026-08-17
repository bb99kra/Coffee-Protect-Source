/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public final class IlIlZ6 {
    private static final long a = IlIls.a((long)8774892174501936901L, (long)994184873081288345L, MethodHandles.lookup().lookupClass()).a(128934959337320L);
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static transient /* synthetic */ String QjdqEkqpTN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private IlIlZ6() {
    }

    public static <T> boolean IlIli(Collection<T> collection, Predicate<T> predicate) {
        boolean bl;
        block5: {
            long l = a ^ 0x318D9A8E7E1FL;
            String string = IlIlrW.IlIlx();
            if (collection == null || predicate == null) {
                return false;
            }
            for (T t : collection) {
                block7: {
                    boolean bl2;
                    block6: {
                        bl = predicate.test(t);
                        if (string == null) break block5;
                        if (string == null) break block6;
                        if (!bl) break block7;
                        bl2 = true;
                    }
                    return bl2;
                }
                if (string != null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static <T> boolean IlIla(T[] TArray, Predicate<T> predicate) {
        boolean bl;
        block5: {
            long l = a ^ 0x59B445A5E6DFL;
            String string = IlIlrW.IlIlx();
            if (TArray == null || predicate == null) {
                return false;
            }
            T[] TArray2 = TArray;
            int n = TArray2.length;
            int n2 = 0;
            while (n2 < n) {
                T t = TArray2[n2];
                if (string != null) {
                    bl = predicate.test(t);
                    if (string == null) break block5;
                    if (bl) {
                        return true;
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static <T> boolean IlIlQ(Collection<T> collection, Predicate<T> predicate) {
        boolean bl;
        block5: {
            long l = a ^ 0x5119DEA62BD1L;
            String string = IlIlrW.IlIlx();
            if (collection == null || predicate == null) {
                return false;
            }
            for (T t : collection) {
                block7: {
                    boolean bl2;
                    block6: {
                        bl = predicate.test(t);
                        if (string == null) break block5;
                        if (string == null) break block6;
                        if (bl) break block7;
                        bl2 = false;
                    }
                    return bl2;
                }
                if (string != null) continue;
            }
            bl = true;
        }
        return bl;
    }

    public static <T> boolean IlIlq(T[] TArray, Predicate<T> predicate) {
        boolean bl;
        block5: {
            long l = a ^ 0xB4EC65C8B87L;
            String string = IlIlrW.IlIlx();
            if (TArray == null || predicate == null) {
                return false;
            }
            T[] TArray2 = TArray;
            int n = TArray2.length;
            int n2 = 0;
            while (n2 < n) {
                T t = TArray2[n2];
                if (string != null) {
                    bl = predicate.test(t);
                    if (string == null) break block5;
                    if (!bl) {
                        return false;
                    }
                    ++n2;
                }
                if (string != null) continue;
            }
            bl = true;
        }
        return bl;
    }

    public static <T> Collection<T> IlIlV(Collection<T> collection, Function<T, T> function) {
        LinkedList<T> linkedList;
        block6: {
            Collection<T> collection2;
            String string;
            LinkedList<T> linkedList2;
            block8: {
                block9: {
                    block7: {
                        long l = a ^ 0x7D12104CFB35L;
                        linkedList2 = new LinkedList<T>();
                        string = IlIlrW.IlIlx();
                        if (function == null) break block7;
                        collection2 = collection;
                        if (string == null) break block8;
                        if (!collection2.isEmpty()) break block9;
                    }
                    return linkedList2;
                }
                collection2 = collection;
            }
            for (T t : collection2) {
                linkedList = linkedList2;
                if (string != null) {
                    linkedList.add(function.apply(t));
                    if (string != null) continue;
                }
                break block6;
            }
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static <T> double IlIlm(Collection<T> collection, Function<T, Double> function) {
        double d;
        block4: {
            long l = a ^ 0x12841E552DCEL;
            String string = IlIlrW.IlIlx();
            if (function == null || collection.isEmpty()) {
                return 0.0;
            }
            double d2 = Double.MAX_VALUE;
            for (T t : collection) {
                double d3;
                d = d3 = function.apply(t).doubleValue();
                if (string != null) {
                    if (string != null && d < d2) {
                        double d4 = d2 = d3;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            d = d2;
        }
        return d;
    }

    public static <T> double IlIlg(Collection<T> collection, Function<T, Double> function) {
        double d;
        block4: {
            long l = a ^ 0x2A471CA26375L;
            String string = IlIlrW.IlIlx();
            if (function == null || collection.isEmpty()) {
                return 0.0;
            }
            double d2 = Double.MIN_VALUE;
            for (T t : collection) {
                double d3;
                d = d3 = function.apply(t).doubleValue();
                if (string != null) {
                    if (string != null && d > d2) {
                        double d4 = d2 = d3;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            d = d2;
        }
        return d;
    }

    public static List<String> IlIla(Collection<String> collection, Function<String, String> function) {
        LinkedList<String> linkedList;
        block6: {
            Collection<String> collection2;
            String string;
            LinkedList<String> linkedList2;
            block8: {
                block9: {
                    block7: {
                        long l = a ^ 0x4FC9118B7FFFL;
                        linkedList2 = new LinkedList<String>();
                        string = IlIlrW.IlIlx();
                        if (function == null) break block7;
                        collection2 = collection;
                        if (string == null) break block8;
                        if (!collection2.isEmpty()) break block9;
                    }
                    return linkedList2;
                }
                collection2 = collection;
            }
            for (String string2 : collection2) {
                linkedList = linkedList2;
                if (string != null) {
                    linkedList.add(function.apply(string2));
                    if (string != null) continue;
                }
                break block6;
            }
            linkedList = linkedList2;
        }
        return linkedList;
    }

    public static String[] IlIlU(String[] stringArray, Function<String, String> function) {
        String[] stringArray2;
        block6: {
            int n;
            String string;
            String[] stringArray3;
            block8: {
                int n2;
                block9: {
                    block7: {
                        long l = a ^ 0x3F69B975F9DCL;
                        stringArray3 = new String[stringArray.length];
                        string = IlIlrW.IlIlx();
                        if (function == null) break block7;
                        n2 = stringArray.length;
                        if (string == null) break block8;
                        if (n2 != 0) break block9;
                    }
                    return null;
                }
                n2 = n = 0;
            }
            while (n < stringArray.length) {
                stringArray2 = stringArray3;
                if (string != null) {
                    stringArray2[n] = function.apply(stringArray[n]);
                    ++n;
                    if (string != null) continue;
                }
                break block6;
            }
            stringArray2 = stringArray3;
        }
        return stringArray2;
    }

    public static <T> Collection<T> IlIlJ(Collection<T> collection, Predicate<T> predicate) {
        Collection<T> collection2;
        String string;
        LinkedList<T> linkedList;
        block6: {
            block7: {
                block5: {
                    long l = a ^ 0x20F978EE76E3L;
                    linkedList = new LinkedList<T>();
                    string = IlIlrW.IlIlx();
                    if (predicate == null) break block5;
                    collection2 = collection;
                    if (string == null) break block6;
                    if (!collection2.isEmpty()) break block7;
                }
                return linkedList;
            }
            collection2 = collection;
        }
        for (T t : collection2) {
            boolean bl = predicate.test(t);
            if (string != null && bl) {
                bl = linkedList.add(t);
            }
            if (string != null) continue;
        }
        return linkedList;
    }

    public static <T> Collection<T> IlIlO(T[] TArray, Predicate<T> predicate) {
        long l = a ^ 0xD8719B5E435L;
        LinkedList<T> linkedList = new LinkedList<T>();
        String string = IlIlrW.IlIlx();
        if (predicate == null) {
            return linkedList;
        }
        T[] TArray2 = TArray;
        int n = TArray2.length;
        int n2 = 0;
        while (n2 < n) {
            T t = TArray2[n2];
            if (string != null) {
                if (predicate.test(t)) {
                    linkedList.add(t);
                }
                ++n2;
            }
            if (string != null) continue;
        }
        return linkedList;
    }

    public static <T> Collection<T> IlIlI(Collection<T> collection) {
        return new HashSet<T>(collection);
    }

    public static int IlIlo(Collection<?> collection) {
        long l = a ^ 0x680FDF376ED0L;
        String string = IlIlrW.IlIlx();
        int n = collection.isEmpty();
        if (string != null) {
            if (n != 0) {
                return 0;
            }
            n = collection.size() - IlIlZ6.IlIlI(collection).size();
        }
        return n;
    }

    public static double IlIle(Collection<Double> collection) {
        double d;
        block4: {
            long l = a ^ 0x299382F2BD4DL;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0.0;
            }
            double d2 = Double.MIN_VALUE;
            Iterator<Double> iterator = collection.iterator();
            while (iterator.hasNext()) {
                double d3;
                d = d3 = iterator.next().doubleValue();
                if (string != null) {
                    if (string != null && d > d2) {
                        double d4 = d2 = d3;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            d = d2;
        }
        return d;
    }

    public static int IlIlS(Collection<Integer> collection) {
        int n;
        block5: {
            long l = a ^ 0x34496EF0F2EL;
            String string = IlIlrW.IlIlx();
            Object object = collection.isEmpty();
            if (string != null) {
                if (object != 0) {
                    return 0;
                }
                object = IlIlZ6.a("d", (int)21872, (long)(0x45D9143F7B46A058L ^ l));
            }
            int n2 = object;
            Iterator<Integer> iterator = collection.iterator();
            while (iterator.hasNext()) {
                int n3;
                n = n3 = iterator.next().intValue();
                if (string != null) {
                    if (string != null && n > n2) {
                        int n4 = n2 = n3;
                    }
                    if (string != null) continue;
                }
                break block5;
            }
            n = n2;
        }
        return n;
    }

    public static long IlIlF(Collection<Long> collection) {
        Object object;
        block4: {
            long l = a ^ 0x7C0AA13D42A2L;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0L;
            }
            Object object2 = IlIlZ6.b("h", (int)3642, (long)(0x7B1AFA0914D2CE5FL ^ l));
            for (long l2 : collection) {
                object = l2;
                if (string != null) {
                    if (string != null && object > object2) {
                        object2 = l2;
                        Object object3 = object2;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            object = object2;
        }
        return (long)object;
    }

    public static float IlIlP(Collection<Float> collection) {
        float f;
        block4: {
            long l = a ^ 0x32F821EBF4A2L;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0.0f;
            }
            float f2 = Float.MIN_VALUE;
            Iterator<Float> iterator = collection.iterator();
            while (iterator.hasNext()) {
                float f3;
                f = f3 = iterator.next().floatValue();
                if (string != null) {
                    if (string != null && f > f2) {
                        float f4 = f2 = f3;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            f = f2;
        }
        return f;
    }

    public static double IlIlI(Collection<Double> collection) {
        double d;
        block4: {
            long l = a ^ 0x13C0C4141798L;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0.0;
            }
            double d2 = Double.MAX_VALUE;
            Iterator<Double> iterator = collection.iterator();
            while (iterator.hasNext()) {
                double d3;
                d = d3 = iterator.next().doubleValue();
                if (string != null) {
                    if (string != null && d < d2) {
                        double d4 = d2 = d3;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            d = d2;
        }
        return d;
    }

    public static int IlIlR(Collection<Integer> collection) {
        int n;
        block5: {
            long l = a ^ 0x6FDB9A3441C2L;
            String string = IlIlrW.IlIlx();
            Object object = collection.isEmpty();
            if (string != null) {
                if (object != 0) {
                    return 0;
                }
                object = IlIlZ6.a("d", (int)9866, (long)(0x26C7363E57119D4FL ^ l));
            }
            int n2 = object;
            Iterator<Integer> iterator = collection.iterator();
            while (iterator.hasNext()) {
                int n3;
                n = n3 = iterator.next().intValue();
                if (string != null) {
                    if (string != null && n < n2) {
                        int n4 = n2 = n3;
                    }
                    if (string != null) continue;
                }
                break block5;
            }
            n = n2;
        }
        return n;
    }

    public static long IlIlK(Collection<Long> collection) {
        Object object;
        block4: {
            long l = a ^ 0x5EBA308B36E7L;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0L;
            }
            Object object2 = IlIlZ6.b("h", (int)8556, (long)(0xC076E8F1864954DL ^ l));
            for (long l2 : collection) {
                object = l2;
                if (string != null) {
                    if (string != null && object < object2) {
                        object2 = l2;
                        Object object3 = object2;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            object = object2;
        }
        return (long)object;
    }

    public static float IlIlu(Collection<Float> collection) {
        float f;
        block4: {
            long l = a ^ 0x360E2C0E958AL;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0.0f;
            }
            float f2 = Float.MAX_VALUE;
            Iterator<Float> iterator = collection.iterator();
            while (iterator.hasNext()) {
                float f3;
                f = f3 = iterator.next().floatValue();
                if (string != null) {
                    if (string != null && f < f2) {
                        float f4 = f2 = f3;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            f = f2;
        }
        return f;
    }

    public static double IlIlq(Collection<Double> collection) {
        double d;
        block3: {
            long l = a ^ 0x4D8D75A55956L;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0.0;
            }
            double d2 = 0.0;
            for (double d3 : collection) {
                d = d2 + d3;
                if (string != null) {
                    d2 = d;
                    if (string != null) continue;
                }
                break block3;
            }
            d = d2;
        }
        return d;
    }

    public static int IlIlg(Collection<Integer> collection) {
        int n;
        block4: {
            long l = a ^ 0x3EF983CED601L;
            String string = IlIlrW.IlIlx();
            int n2 = collection.isEmpty();
            if (string != null) {
                if (n2 != 0) {
                    return 0;
                }
                n2 = 0;
            }
            int n3 = n2;
            for (int n4 : collection) {
                n = n3 + n4;
                if (string != null) {
                    n3 = n;
                    if (string != null) continue;
                }
                break block4;
            }
            n = n3;
        }
        return n;
    }

    public static long IlIlC(Collection<Long> collection) {
        long l;
        block3: {
            long l2 = a ^ 0x24793FC60B1CL;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0L;
            }
            long l3 = 0L;
            for (long l4 : collection) {
                l = l3 + l4;
                if (string != null) {
                    l3 = l;
                    if (string != null) continue;
                }
                break block3;
            }
            l = l3;
        }
        return l;
    }

    public static float IlIlE(Collection<Float> collection) {
        float f;
        block3: {
            long l = a ^ 0x18435F261D82L;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0.0f;
            }
            float f2 = 0.0f;
            for (float f3 : collection) {
                f = f2 + f3;
                if (string != null) {
                    f2 = f;
                    if (string != null) continue;
                }
                break block3;
            }
            f = f2;
        }
        return f;
    }

    public static double IlIlM(Collection<Double> collection) {
        long l = a ^ 0x3CB1FAE4D987L;
        String string = IlIlrW.IlIlx();
        Collection<Double> collection2 = collection;
        if (string != null) {
            if (collection2.isEmpty()) {
                return 0.0;
            }
            collection2 = collection;
        }
        return IlIlZ6.IlIlq(collection2) / (double)collection.size();
    }

    public static int IlIlp(Collection<Integer> collection) {
        long l = a ^ 0x245624CE7137L;
        String string = IlIlrW.IlIlx();
        int n = collection.isEmpty();
        if (string != null) {
            if (n != 0) {
                return 0;
            }
            n = IlIlZ6.IlIlg(collection) / collection.size();
        }
        return n;
    }

    public static long IlIlR(Collection<Long> collection) {
        long l = a ^ 0x75AA12CCD0F4L;
        String string = IlIlrW.IlIlx();
        Collection<Long> collection2 = collection;
        if (string != null) {
            if (collection2.isEmpty()) {
                return 0L;
            }
            collection2 = collection;
        }
        return IlIlZ6.IlIlC(collection2) / (long)collection.size();
    }

    public static float IlIlX(Collection<Float> collection) {
        long l = a ^ 0x61936AC2EE58L;
        String string = IlIlrW.IlIlx();
        Collection<Float> collection2 = collection;
        if (string != null) {
            if (collection2.isEmpty()) {
                return 0.0f;
            }
            collection2 = collection;
        }
        return IlIlZ6.IlIlE(collection2) / (float)collection.size();
    }

    public static double IlIlC(Collection<Double> collection, Predicate<Double> predicate) {
        double d3;
        block4: {
            long l = a ^ 0x4305239599C7L;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0.0;
            }
            double d2 = 0.0;
            for (double d3 : collection) {
                if (string != null) {
                    double d4 = d3;
                    if (predicate.test(d4)) {
                        d2 += d4;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            d3 = d2 / (double)collection.size();
        }
        return d3;
    }

    public static int IlIlY(Collection<Integer> collection, Predicate<Integer> predicate) {
        int n;
        block5: {
            long l = a ^ 0x303BD6DB1DBL;
            String string = IlIlrW.IlIlx();
            int n2 = collection.isEmpty();
            if (string != null) {
                if (n2 != 0) {
                    return 0;
                }
                n2 = 0;
            }
            int n3 = n2;
            for (int n4 : collection) {
                n = predicate.test(n4) ? 1 : 0;
                if (string != null) {
                    if (string != null && n != 0) {
                        int n5 = n3 = n3 + n4;
                    }
                    if (string != null) continue;
                }
                break block5;
            }
            n = n3 / collection.size();
        }
        return n;
    }

    public static long IlIlU(Collection<Long> collection, Predicate<Long> predicate) {
        long l4;
        block4: {
            long l2 = a ^ 0x20B4D3E5C03L;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0L;
            }
            long l3 = 0L;
            for (long l4 : collection) {
                if (string != null) {
                    long l5 = l4;
                    if (predicate.test(l5)) {
                        l3 += l5;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            l4 = l3 / (long)collection.size();
        }
        return l4;
    }

    public static float IlIlF(Collection<Float> collection, Predicate<Float> predicate) {
        float f3;
        block4: {
            long l = a ^ 0xE9880EC2E7EL;
            String string = IlIlrW.IlIlx();
            if (collection.isEmpty()) {
                return 0.0f;
            }
            float f2 = 0.0f;
            for (float f3 : collection) {
                if (string != null) {
                    float f4 = f3;
                    if (predicate.test(Float.valueOf(f4))) {
                        f2 += f4;
                    }
                    if (string != null) continue;
                }
                break block4;
            }
            f3 = f2 / (float)collection.size();
        }
        return f3;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x62632CC9922L;
        Cipher cipher = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n = 0;
        String string = "\u00f6z+\u008e\u00cc{\u0083\u0015\u00fc\u00af\u00e4|FM3\u009c";
        int n2 = "\u00f6z+\u008e\u00cc{\u0083\u0015\u00fc\u00af\u00e4|FM3\u009c".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Integer[2];
        g = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray5 = new byte[8];
        byte[] byArray6 = byArray5;
        byArray5[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray6 = byArray6;
            byArray6[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray6)), new IvParameterSpec(new byte[8]));
        long[] lArray2 = new long[2];
        int n5 = 0;
        String string2 = "\u0093Ee\u009d\u00a1(\u00a9\u00df\u000e\u00bb\u0014|@a\u0012\u00ed";
        int n6 = "\u0093Ee\u009d\u00a1(\u00a9\u00df\u000e\u00bb\u0014|@a\u0012\u00ed".length();
        int n7 = 0;
        do {
            byte[] byArray7 = string2.substring(n7, n7 += 8).getBytes("ISO-8859-1");
            int n8 = n5++;
            long l3 = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
            byte[] byArray8 = cipher2.doFinal(new byte[]{(byte)(l3 >>> 56), (byte)(l3 >>> 48), (byte)(l3 >>> 40), (byte)(l3 >>> 32), (byte)(l3 >>> 24), (byte)(l3 >>> 16), (byte)(l3 >>> 8), (byte)l3});
            lArray2[n8] = ((long)byArray8[0] & 0xFFL) << 56 | ((long)byArray8[1] & 0xFFL) << 48 | ((long)byArray8[2] & 0xFFL) << 40 | ((long)byArray8[3] & 0xFFL) << 32 | ((long)byArray8[4] & 0xFFL) << 24 | ((long)byArray8[5] & 0xFFL) << 16 | ((long)byArray8[6] & 0xFFL) << 8 | (long)byArray8[7] & 0xFFL;
        } while (n7 < n6);
        e = lArray2;
        f = new Long[2];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x481E;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlZ6", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlZ6.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlZ6.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlZ6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x30DF;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlZ6", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlZ6.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlZ6.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlZ6" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlZ6.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
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
            return MethodHandles.lookup().findStatic(IlIlZ6.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

