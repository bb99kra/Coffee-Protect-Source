/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.Bukkit
 *  org.bukkit.World
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.EntityType
 *  org.bukkit.entity.LivingEntity
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.HandlerList
 *  org.bukkit.event.Listener
 *  org.bukkit.event.block.BlockDispenseEvent
 *  org.bukkit.event.entity.ProjectileLaunchEvent
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitTask
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import java.util.List;
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
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitTask;

public class IlIlhs
implements IlIljR,
Runnable,
Listener {
    private final CoffeeProtect IlIlF;
    private BukkitTask IlIlO;
    private static final long a = IlIls.a((long)3295914622622062616L, (long)-375111786799471344L, MethodHandles.lookup().lookupClass()).a(222495457678434L);
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Long[] f;
    private static final Map g;
    private static transient /* synthetic */ String gVRpAnlvnR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlhs(CoffeeProtect coffeeProtect) {
        this.IlIlF = coffeeProtect;
    }

    @Override
    public void IlIlC() {
        long l = a ^ 0x2C937832CB98L;
        try {
            Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)this.IlIlF);
            if (IlIlOq.ENTITY_LIMIT_TASK_ENABLED.IlIlt()) {
                this.IlIlO = this.IlIlF.getServer().getScheduler().runTaskTimerAsynchronously((Plugin)this.IlIlF, (Runnable)this, IlIlOq.ENTITY_LIMIT_TASK_INTERVAL.IlIlq() * IlIlhs.b("e", (int)8475, (long)(0x64CEFBA7A89E3E50L ^ l)), IlIlOq.ENTITY_LIMIT_TASK_INTERVAL.IlIlq() * IlIlhs.b("e", (int)18621, (long)(0x2470B7B30A0A57F7L ^ l)));
            }
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw IlIlhs.a(arrayIndexOutOfBoundsException);
        }
    }

    @Override
    public void IlIly() {
        block5: {
            BukkitTask bukkitTask;
            block4: {
                long l = a ^ 0x60B850BF0E1EL;
                boolean bl = IlIlPA.IlIly();
                HandlerList.unregisterAll((Listener)this);
                boolean bl2 = bl;
                try {
                    try {
                        bukkitTask = this.IlIlO;
                        if (bl2) break block4;
                        if (bukkitTask == null) break block5;
                    }
                    catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                        throw IlIlhs.a(arrayIndexOutOfBoundsException);
                    }
                    bukkitTask = this.IlIlO;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw IlIlhs.a(arrayIndexOutOfBoundsException);
                }
            }
            bukkitTask.cancel();
            this.IlIlO = null;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private boolean IlIlR(Entity entity) {
        Entity entity2;
        block9: {
            boolean bl;
            block8: {
                long l = a ^ 0x27EA70D745D8L;
                bl = IlIlPA.IlIly();
                try {
                    entity2 = entity;
                    if (bl) break block8;
                    if (entity2 == null) return true;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw IlIlhs.a(arrayIndexOutOfBoundsException);
                }
                entity2 = entity;
            }
            try {
                try {
                    if (bl) break block9;
                    if (!(entity2 instanceof LivingEntity)) return false;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw IlIlhs.a(arrayIndexOutOfBoundsException);
                }
                entity2 = entity;
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw IlIlhs.a(arrayIndexOutOfBoundsException);
            }
        }
        try {
            if (entity2.getType() == EntityType.ARMOR_STAND) return false;
            return true;
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw IlIlhs.a(arrayIndexOutOfBoundsException);
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void IlIlh(ProjectileLaunchEvent projectileLaunchEvent) {
        long l = a ^ 0x72AB6A02712AL;
        int n = 0;
        Entity[] entityArray = projectileLaunchEvent.getEntity().getLocation().getChunk().getEntities();
        int n2 = entityArray.length;
        boolean bl = IlIlPA.IlIly();
        for (int i = 0; i < n2; ++i) {
            int n3;
            block8: {
                Entity entity = entityArray[i];
                try {
                    n3 = this.IlIlR(entity);
                    if (bl) break block8;
                    if (n3 != 0) {
                        continue;
                    }
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw IlIlhs.a(arrayIndexOutOfBoundsException);
                }
                n3 = n++;
            }
            try {
                try {
                    if (n3 <= IlIlOq.ENTITY_LIMIT_MAXIMUM_AMOUNT.IlIlj()) continue;
                    projectileLaunchEvent.setCancelled(true);
                    if (!bl) break;
                    continue;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw IlIlhs.a(arrayIndexOutOfBoundsException);
                }
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw IlIlhs.a(arrayIndexOutOfBoundsException);
            }
        }
    }

    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void IlIle(BlockDispenseEvent blockDispenseEvent) {
        long l = a ^ 0x6DBE9A2FC2E3L;
        int n = 0;
        Entity[] entityArray = blockDispenseEvent.getBlock().getChunk().getEntities();
        boolean bl = IlIlPA.IlIlf();
        for (Entity entity : entityArray) {
            int n2;
            block8: {
                try {
                    n2 = this.IlIlR(entity);
                    if (!bl) break block8;
                    if (n2 != 0) {
                        continue;
                    }
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw IlIlhs.a(arrayIndexOutOfBoundsException);
                }
                n2 = n++;
            }
            try {
                try {
                    if (n2 <= IlIlOq.ENTITY_LIMIT_MAXIMUM_AMOUNT.IlIlj()) continue;
                    blockDispenseEvent.setCancelled(true);
                    if (bl) break;
                }
                catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                    throw IlIlhs.a(arrayIndexOutOfBoundsException);
                }
            }
            catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                throw IlIlhs.a(arrayIndexOutOfBoundsException);
            }
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void run() {
        block32: {
            var1_1 = IlIlhs.a ^ 119575871798678L;
            var4_2 = new ArrayList<E>();
            var3_3 = IlIlPA.IlIlf();
            try {
                block38: {
                    var5_4 = Bukkit.getWorlds().iterator();
                    block24: while (true) {
                        try {
                            if (!var5_4.hasNext()) break;
                            v0 /* !! */  = var5_4.next();
                        }
                        catch (NoSuchMethodError v1) {
                            throw IlIlhs.a(v1);
                        }
                        block25: while (true) {
                            block33: {
                                var6_6 = (World)v0 /* !! */ ;
                                if (!var3_3) break block32;
                                try {
                                    v2 = var6_6;
                                    if (!var3_3) break block33;
                                    if (v2 == null) {
                                        continue block24;
                                    }
                                }
                                catch (NoSuchMethodError v3) {
                                    throw IlIlhs.a(v3);
                                }
                                v2 = var6_6;
                            }
                            var7_7 = v2.getLoadedChunks();
                            var8_8 = var7_7.length;
                            var9_9 = 0;
                            block26: while (true) {
                                v4 = var9_9;
                                block27: while (v4 < var8_8) {
                                    block34: {
                                        block36: {
                                            block35: {
                                                var10_10 = var7_7[var9_9];
                                                try {
                                                    if (!var3_3) continue block26;
                                                    v0 /* !! */  = var10_10;
                                                    if (!var3_3) continue block25;
                                                }
                                                catch (NoSuchMethodError v5) {
                                                    throw IlIlhs.a(v5);
                                                }
                                                if (v0 /* !! */  == null) break block34;
                                                try {
                                                    block39: {
                                                        v6 = var10_10.isLoaded();
                                                        if (!var3_3) ** GOTO lbl56
                                                        break block39;
                                                        catch (NoSuchMethodError v7) {
                                                            throw IlIlhs.a(v7);
                                                        }
                                                    }
                                                    if (v6) break block35;
                                                    break block34;
                                                }
                                                catch (NoSuchMethodError v8) {
                                                    throw IlIlhs.a(v8);
                                                }
                                            }
                                            v6 = var10_10.isEntitiesLoaded();
lbl56:
                                            // 2 sources

                                            if (v6) break block36;
                                            try {
                                                if (!var3_3) {
                                                }
                                                break block34;
                                            }
                                            catch (NoSuchMethodError v9) {
                                                throw IlIlhs.a(v9);
                                            }
                                            catch (NoSuchMethodError var11_12) {
                                                // empty catch block
                                            }
                                        }
                                        var11_11 = 0;
                                        for (Entity var15_16 : var10_10.getEntities()) {
                                            block37: {
                                                v4 = (int)this.IlIlR(var15_16);
                                                if (!var3_3) continue block27;
                                                try {
                                                    if (!var3_3) break block37;
                                                    if (v4 != 0) {
                                                        continue;
                                                    }
                                                }
                                                catch (NoSuchMethodError v10) {
                                                    throw IlIlhs.a(v10);
                                                }
                                                v11 = var11_11++;
                                            }
                                            if (!var3_3) continue;
                                            try {
                                                block40: {
                                                    if (v11 <= IlIlOq.ENTITY_LIMIT_MAXIMUM_AMOUNT.IlIlj()) continue;
                                                    break block40;
                                                    catch (NoSuchMethodError v12) {
                                                        throw IlIlhs.a(v12);
                                                    }
                                                }
                                                v11 = (int)var4_2.add(var15_16);
                                            }
                                            catch (NoSuchMethodError v13) {
                                                throw IlIlhs.a(v13);
                                            }
                                        }
                                    }
                                    ++var9_9;
                                    if (var3_3) continue block26;
                                }
                                break block25;
                                break;
                            }
                            break;
                        }
                        if (!var3_3) break;
                    }
                    try {
                        v14 = var4_2.isEmpty();
                        if (!var3_3) break block38;
                        if (v14 != 0) break block32;
                    }
                    catch (NoSuchMethodError v15) {
                        throw IlIlhs.a(v15);
                    }
                    v14 = 1;
                }
                v16 = new String[v14];
                v16[0] = (String)IlIlhs.a("v", (int)6521, (long)(2968706185896188623L ^ var1_1)) + var4_2.size() + (String)IlIlhs.a("v", (int)14133, (long)(6080320337097716866L ^ var1_1));
                IlIlrW.IlIlU(v16);
                IlIlQb.IlIlL((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$run$0(java.util.List ), ()V)(var4_2));
            }
            catch (ArrayIndexOutOfBoundsException | ConcurrentModificationException var5_5) {
                // empty catch block
            }
        }
    }

    private static /* synthetic */ void lambda$run$0(List list) {
        list.forEach(Entity::remove);
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        d = new HashMap(13);
        long l = a ^ 0x3F2657B2D569L;
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray2 = byArray2;
            byArray2[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u0083\u0084\u00ec\u00a1\u0006\u00b44D\u008f\u00bc\u00dbT\u0081\u00f4\u009e\u00bf\u00f4k%\u00e9\u00aa*2:X\u00daX\u00a7\u00b6\u0019\u0019\u00ed\u00b3\u008aQ;\u00b6,\u00d4 \u001aU\u00d7\u00d8\u00cfm\u0005\u00b1o]e\u00f6Zq\u00d2\u00d5l=\u00e2\u008c?hV\u00cf\u0010\u00dam\u00e6\u00a5W\u00b3V\u0010\u00b6\u00b5\u00a5\u0002i\u009d4\u00f6\u00a5\u00a4]\u00d9\r\u00e5\u00f6\u0019[+tM\u00a0g\u00a9\f\u009fg\u00f0\u00ebnP\u00eb\u0005\u00f3\u00a6\u0087Rh`\u00851";
        int n2 = "\u0083\u0084\u00ec\u00a1\u0006\u00b44D\u008f\u00bc\u00dbT\u0081\u00f4\u009e\u00bf\u00f4k%\u00e9\u00aa*2:X\u00daX\u00a7\u00b6\u0019\u0019\u00ed\u00b3\u008aQ;\u00b6,\u00d4 \u001aU\u00d7\u00d8\u00cfm\u0005\u00b1o]e\u00f6Zq\u00d2\u00d5l=\u00e2\u008c?hV\u00cf\u0010\u00dam\u00e6\u00a5W\u00b3V\u0010\u00b6\u00b5\u00a5\u0002i\u009d4\u00f6\u00a5\u00a4]\u00d9\r\u00e5\u00f6\u0019[+tM\u00a0g\u00a9\f\u009fg\u00f0\u00ebnP\u00eb\u0005\u00f3\u00a6\u0087Rh`\u00851".length();
        int n3 = 24;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlhs.a(byArray3).intern();
            if ((n4 += n3) >= n2) break;
            n3 = string.charAt(n4);
        }
        b = stringArray;
        c = new String[2];
        g = new HashMap(13);
        Cipher cipher2 = Cipher.getInstance("DES/CBC/NoPadding");
        SecretKeyFactory secretKeyFactory2 = SecretKeyFactory.getInstance("DES");
        byte[] byArray4 = new byte[8];
        byte[] byArray5 = byArray4;
        byArray4[0] = (byte)(l >>> 56);
        for (int i = 1; i < 8; ++i) {
            byArray5 = byArray5;
            byArray5[i] = (byte)(l << i * 8 >>> 56);
        }
        cipher2.init(2, (Key)secretKeyFactory2.generateSecret(new DESKeySpec(byArray5)), new IvParameterSpec(new byte[8]));
        long[] lArray = new long[2];
        int n6 = 0;
        String string2 = "\u00cdt\u00feC\u00a3\u0098\u0097\u00f6QL\u0083\u00fbr>\u00a7\u008d";
        int n7 = "\u00cdt\u00feC\u00a3\u0098\u0097\u00f6QL\u0083\u00fbr>\u00a7\u008d".length();
        int n8 = 0;
        do {
            byte[] byArray6 = string2.substring(n8, n8 += 8).getBytes("ISO-8859-1");
            int n9 = n6++;
            long l2 = ((long)byArray6[0] & 0xFFL) << 56 | ((long)byArray6[1] & 0xFFL) << 48 | ((long)byArray6[2] & 0xFFL) << 40 | ((long)byArray6[3] & 0xFFL) << 32 | ((long)byArray6[4] & 0xFFL) << 24 | ((long)byArray6[5] & 0xFFL) << 16 | ((long)byArray6[6] & 0xFFL) << 8 | (long)byArray6[7] & 0xFFL;
            byte[] byArray7 = cipher2.doFinal(new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2});
            lArray[n9] = ((long)byArray7[0] & 0xFFL) << 56 | ((long)byArray7[1] & 0xFFL) << 48 | ((long)byArray7[2] & 0xFFL) << 40 | ((long)byArray7[3] & 0xFFL) << 32 | ((long)byArray7[4] & 0xFFL) << 24 | ((long)byArray7[5] & 0xFFL) << 16 | ((long)byArray7[6] & 0xFFL) << 8 | (long)byArray7[7] & 0xFFL;
        } while (n8 < n7);
        e = lArray;
        f = new Long[2];
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xDAE;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlhs", exception);
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
            IlIlhs.c[n2] = IlIlhs.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlhs.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlhs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x275D;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlhs", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlhs.f[n2] = l4;
        }
        return f[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlhs.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlhs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlhs.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlhs.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

