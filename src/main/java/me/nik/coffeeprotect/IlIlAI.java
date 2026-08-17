/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.Bukkit
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.HandlerList
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerCommandPreprocessEvent
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitTask
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlPA;
import me.nik.coffeeprotect.IlIlQb;
import me.nik.coffeeprotect.IlIljR;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerCommandPreprocessEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

public class IlIlAI
implements IlIljR,
Runnable,
Listener {
    private final CoffeeProtect IlIll;
    private BukkitTask IlIle;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static transient /* synthetic */ String IuqzMQflHq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlAI(CoffeeProtect coffeeProtect) {
        this.IlIll = coffeeProtect;
    }

    @Override
    public void IlIlC() {
        block3: {
            long l;
            block2: {
                l = a ^ 0x5BF04728EC03L;
                boolean bl = IlIlPA.IlIlf();
                IlIlAI ilIlAI = this;
                if (!bl) break block2;
                ilIlAI.IlIlP();
                Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)this.IlIll);
                if (!IlIlOq.OP_PROTECTION_TASK_ENABLED.IlIlt()) break block3;
                ilIlAI = this;
            }
            ilIlAI.IlIle = this.IlIll.getServer().getScheduler().runTaskTimerAsynchronously((Plugin)this.IlIll, (Runnable)this, IlIlOq.OP_PROTECTION_TASK_INTERVAL.IlIlq() * IlIlAI.b("e", (int)20270, (long)(0x5317841619F43845L ^ l)), IlIlOq.OP_PROTECTION_TASK_INTERVAL.IlIlq() * IlIlAI.b("e", (int)8894, (long)(0x679D1DB36957D5D6L ^ l)));
        }
    }

    @Override
    public void IlIly() {
        block3: {
            BukkitTask bukkitTask;
            block2: {
                long l = a ^ 0x17DB6FA52985L;
                boolean bl = IlIlPA.IlIly();
                HandlerList.unregisterAll((Listener)this);
                boolean bl2 = bl;
                bukkitTask = this.IlIle;
                if (bl2) break block2;
                if (bukkitTask == null) break block3;
                bukkitTask = this.IlIle;
            }
            bukkitTask.cancel();
            this.IlIle = null;
        }
    }

    @Override
    public void run() {
        this.IlIlP();
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void IlIll(PlayerCommandPreprocessEvent playerCommandPreprocessEvent) {
        block5: {
            int n;
            long l;
            block4: {
                l = a ^ 0x35CB0B1F8573L;
                String[] stringArray = playerCommandPreprocessEvent.getMessage().split((String)((Object)IlIlAI.a("g", (int)3577, (long)(0x1A6FF2E064FE18B8L ^ l))));
                boolean bl = IlIlPA.IlIlf();
                n = stringArray.length;
                if (!bl) break block4;
                if (n <= 0) break block5;
                n = stringArray[0].equalsIgnoreCase((String)((Object)IlIlAI.a("g", (int)18555, (long)(0x19D4F3647076DD3BL ^ l)))) ? 1 : 0;
            }
            if (n != 0) {
                IlIlQb.IlIly(this::IlIlP, (long)IlIlAI.b("e", (int)11060, (long)(0xC1CFED15C13B52DL ^ l)));
            }
        }
    }

    private void IlIlP() {
        Bukkit.getOperators().forEach(offlinePlayer -> {
            block3: {
                int n;
                long l;
                block2: {
                    l = a ^ 0x4AFBFC983D38L;
                    boolean bl = IlIlPA.IlIly();
                    n = IlIlOq.OP_PROTECTION_ALLOWED_OPERATORS.IlIlT().contains(offlinePlayer.getName());
                    if (bl) break block2;
                    if (n != 0) break block3;
                    offlinePlayer.setOp(false);
                    n = 1;
                }
                String[] stringArray = new String[n];
                stringArray[0] = (String)((Object)IlIlAI.a("g", (int)214, (long)(0x24C7327474D6ADDFL ^ l))) + offlinePlayer.getName() + (String)((Object)IlIlAI.a("g", (int)29633, (long)(0x14D274BD98EFDEC9L ^ l)));
                IlIlrW.IlIlU(stringArray);
            }
        });
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        IlIlAI.a = IlIls.a((long)7426027934056897553L, (long)-8922782959630258067L, MethodHandles.lookup().lookupClass()).a(81372311824846L);
                        IlIlAI.d = new HashMap<K, V>(13);
                        var11 = IlIlAI.a ^ 33431276357874L;
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
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "\u00fa\u00c0\u00ad\u0092\\\u0013e\u001f\u00fe/Y\u00c6\u00a1\u0095\u00ba\u00d2\u0010\u0094\u00a7<\u0018\u00ca\u00cd\u0092\u00ff\u00ffS\u0093z\u00d0T\u00f2X";
                        var19_6 = "\u00fa\u00c0\u00ad\u0092\\\u0013e\u001f\u00fe/Y\u00c6\u00a1\u0095\u00ba\u00d2\u0010\u0094\u00a7<\u0018\u00ca\u00cd\u0092\u00ff\u00ffS\u0093z\u00d0T\u00f2X".length();
                        var16_7 = 16;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIlAI.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u0004\u001d\u0012\u007fZ\u00d2\u00fcD\u0018T\u00be\u00d2(\u00c4z-\u0004\u008d\u0019\u00a7\u00b7\u00ba\u008e\u0096\u00bcB\u00cf\u0015 ;\u00c4\u00878\u001a\u00d7\u00d3\u00bf.\u00cb\u00bdVZ\u00bb,A\u00faW\u00e4=\u00ff\u00d5[@\u00f7B\u00ef\u00f1\u0016f\u00ea1D\u000b\u0081H\u009d\u00fc\u00fc\u00c9^\u0002)\u0018\u001c\u009c\u00f2R8U\u001d\u00cb{P~\u0099i!\r\u00f5";
                            var19_6 = "\u0004\u001d\u0012\u007fZ\u00d2\u00fcD\u0018T\u00be\u00d2(\u00c4z-\u0004\u008d\u0019\u00a7\u00b7\u00ba\u008e\u0096\u00bcB\u00cf\u0015 ;\u00c4\u00878\u001a\u00d7\u00d3\u00bf.\u00cb\u00bdVZ\u00bb,A\u00faW\u00e4=\u00ff\u00d5[@\u00f7B\u00ef\u00f1\u0016f\u00ea1D\u000b\u0081H\u009d\u00fc\u00fc\u00c9^\u0002)\u0018\u001c\u009c\u00f2R8U\u001d\u00cb{P~\u0099i!\r\u00f5".length();
                            var16_7 = 32;
                            var15_8 = -1;
lbl34:
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
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIlAI.a(var21_9).intern();
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
lbl51:
                        // 1 sources

                        ** continue;
                    }
                }
                IlIlAI.b = var20_3;
                IlIlAI.c = new String[4];
                IlIlAI.g = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "\u00caPvR\u00d5s\u00d2\u009a\u0011\u00b4\u0005\u00d7\u00cas\u00dc\u00be\u00ea\u00a7\u00fb\u00e0\u00bb&\u008e7";
                var5_15 = "\u00caPvR\u00d5s\u00d2\u009a\u0011\u00b4\u0005\u00d7\u00cas\u00dc\u00be\u00ea\u00a7\u00fb\u00e0\u00bb&\u008e7".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl73:
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
        IlIlAI.e = var6_12;
        IlIlAI.f = new Long[3];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4426;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlAI", exception);
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
            IlIlAI.c[n2] = IlIlAI.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlAI.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlAI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4F7F;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlAI", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlAI.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlAI.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlAI" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlAI.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlAI.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

