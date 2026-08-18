/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.papermc.paper.threadedregions.scheduler.AsyncScheduler
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitScheduler
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import io.papermc.paper.threadedregions.scheduler.AsyncScheduler;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Q2;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_fO;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitScheduler;

public class CP_o4 {
    private BukkitScheduler CP_a;
    private AsyncScheduler CP_r;
    private static final long a = CP_s.a(8817125244828018665L, -8175524097264565063L, MethodHandles.lookup().lookupClass()).a(116128844730733L);
    private static final long[] b;
    private static final Long[] c;
    private static final Map d;
    private static transient /* synthetic */ String gcGOYMuQFN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    protected CP_o4() {
        block4: {
            block3: {
                String[] stringArray;
                block2: {
                    long l = a ^ 0x652FA0E6B6ACL;
                    String[] stringArray2 = CP_Q2.CP_Q();
                    stringArray = stringArray2;
                    if (stringArray != null) break block2;
                    if (!CP_Q2.CP_K) break block3;
                    this.CP_r = Bukkit.getAsyncScheduler();
                }
                if (stringArray == null) break block4;
            }
            this.CP_a = Bukkit.getScheduler();
        }
    }

    public CP_fO CP_K(@NotNull Plugin plugin, @NotNull Consumer<Object> consumer) {
        long l = a ^ 0x794C825DFCFFL;
        if (!CP_Q2.CP_K) {
            return new CP_fO(this.CP_a.runTaskAsynchronously(plugin, () -> consumer.accept(null)));
        }
        return new CP_fO(this.CP_r.runNow(plugin, scheduledTask -> consumer.accept(null)));
    }

    public CP_fO CP_z(@NotNull Plugin plugin, @NotNull Consumer<Object> consumer, long l, @NotNull TimeUnit timeUnit) {
        long l2 = a ^ 0x23BD1B141DD2L;
        if (!CP_Q2.CP_K) {
            return new CP_fO(this.CP_a.runTaskLaterAsynchronously(plugin, () -> consumer.accept(null), this.CP_R(l, timeUnit)));
        }
        return new CP_fO(this.CP_r.runDelayed(plugin, scheduledTask -> consumer.accept(null), l, timeUnit));
    }

    public CP_fO CP_y(@NotNull Plugin plugin, @NotNull Consumer<Object> consumer, long l, long l2, @NotNull TimeUnit timeUnit) {
        long l3 = a ^ 0x2609E0DDC811L;
        String[] stringArray = CP_Q2.CP_Q();
        long l4 = l2 - 1L;
        long l5 = l4 == 0L ? (byte)0 : (l4 < 0L ? (byte)-1 : 1);
        if (stringArray == null) {
            if (l5 < 0) {
                l2 = 1L;
            }
            l5 = (long)CP_Q2.CP_K;
        }
        if (l5 == false) {
            return new CP_fO(this.CP_a.runTaskTimerAsynchronously(plugin, () -> consumer.accept(null), this.CP_R(l, timeUnit), this.CP_R(l2, timeUnit)));
        }
        return new CP_fO(this.CP_r.runAtFixedRate(plugin, scheduledTask -> consumer.accept(null), l, l2, timeUnit));
    }

    public CP_fO CP_w(@NotNull Plugin plugin, @NotNull Consumer<Object> consumer, long l, long l2) {
        long l3 = a ^ 0x3EF69534EC02L;
        String[] stringArray = CP_Q2.CP_Q();
        long l4 = l2 - 1L;
        long l5 = l4 == 0L ? (byte)0 : (l4 < 0L ? (byte)-1 : 1);
        if (stringArray == null) {
            if (l5 < 0) {
                l2 = 1L;
            }
            l5 = (long)CP_Q2.CP_K;
        }
        if (l5 == false) {
            return new CP_fO(this.CP_a.runTaskTimerAsynchronously(plugin, () -> consumer.accept(null), l, l2));
        }
        return new CP_fO(this.CP_r.runAtFixedRate(plugin, scheduledTask -> consumer.accept(null), l * CP_o4.a("o", (int)29962, (long)(0x357F0C603CC558AEL ^ l3)), l2 * CP_o4.a("o", (int)21215, (long)(0x1B479A9D0CE8FF7AL ^ l3)), TimeUnit.MILLISECONDS));
    }

    public void CP_e(@NotNull Plugin plugin) {
        long l = a ^ 0x1D0ADF1FB1D7L;
        String[] stringArray = CP_Q2.CP_Q();
        if (stringArray == null) {
            if (!CP_Q2.CP_K) {
                this.CP_a.cancelTasks(plugin);
                return;
            }
            this.CP_r.cancelTasks(plugin);
        }
    }

    private long CP_R(long l, TimeUnit timeUnit) {
        long l2 = a ^ 0x1E97A51C2501L;
        return timeUnit.toMillis(l) / CP_o4.a("o", (int)21215, (long)(0x1B47BAFC3CC03679L ^ l2));
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x29E7A6028645L;
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
        String string = "|\u00fe\u0011\"b\u00a05\u0088G\u00ab\u00c5\u00cb\u001c/G\u0001";
        int n2 = "|\u00fe\u0011\"b\u00a05\u0088G\u00ab\u00c5\u00cb\u001c/G\u0001".length();
        int n3 = 0;
        do {
            byte[] byArray3 = string.substring(n3, n3 += 8).getBytes("ISO-8859-1");
            int n4 = n++;
            long l2 = ((long)byArray3[0] & 0xFFL) << 56 | ((long)byArray3[1] & 0xFFL) << 48 | ((long)byArray3[2] & 0xFFL) << 40 | ((long)byArray3[3] & 0xFFL) << 32 | ((long)byArray3[4] & 0xFFL) << 24 | ((long)byArray3[5] & 0xFFL) << 16 | ((long)byArray3[6] & 0xFFL) << 8 | (long)byArray3[7] & 0xFFL;
            byte[] byArray4 = cipher.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n4] = ((long)byArray4[0] & 0xFFL) << 56 | ((long)byArray4[1] & 0xFFL) << 48 | ((long)byArray4[2] & 0xFFL) << 40 | ((long)byArray4[3] & 0xFFL) << 32 | ((long)byArray4[4] & 0xFFL) << 24 | ((long)byArray4[5] & 0xFFL) << 16 | ((long)byArray4[6] & 0xFFL) << 8 | (long)byArray4[7] & 0xFFL;
        } while (n3 < n2);
        b = lArray;
        c = new Long[2];
    }

    private static long a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7ACD;
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
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_o4", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_o4.c[n2] = l4;
        }
        return c[n2];
    }

    private static long a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_o4.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_o4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_o4.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

