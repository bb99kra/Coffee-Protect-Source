/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Bukkit
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.HandlerList
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent
 *  org.bukkit.event.player.AsyncPlayerPreLoginEvent$Result
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlA6;
import me.nik.coffeeprotect.IlIlfq;
import me.nik.coffeeprotect.IlIlj3;
import me.nik.coffeeprotect.IlIlj9;
import me.nik.coffeeprotect.IlIljR;
import me.nik.coffeeprotect.IlIloU;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import org.bukkit.plugin.Plugin;

public class IlIlGg
implements IlIljR,
Listener {
    private final List<IlIlj9> IlIlh;
    private final LoadingCache<String, Boolean> IlIlw;
    private static String IlIlc;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String GItveLzFem = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlGg() {
        long l = a ^ 0x197AE7913B02L;
        String string = IlIlGg.IlIlp();
        String string2 = string;
        this.IlIlh = new ArrayList<IlIlj9>();
        this.IlIlw = CacheBuilder.newBuilder().expireAfterWrite(e, TimeUnit.MINUTES).build((CacheLoader)new IlIlA6(this));
        if (PacketWrapper.IlIlz() == null) {
            IlIlGg.IlIlZ("t5tKqc");
        }
    }

    private boolean IlIlK(String string) {
        return this.IlIlh.stream().anyMatch(ilIlj9 -> ilIlj9.IlIls(this.IlIlQ(ilIlj9.IlIlO(string))));
    }

    /*
     * Loose catch block
     */
    private String IlIlQ(String string) {
        long l = a ^ 0x6C14C5F56391L;
        String string2 = IlIlGg.IlIlp();
        URLConnection uRLConnection = new URL(string).openConnection();
        uRLConnection.addRequestProperty((String)((Object)IlIlGg.a("l", (int)13849, (long)(0x7672560EE22601B7L ^ l))), (String)((Object)IlIlGg.a("l", (int)26045, (long)(0x63AFA7880CC15212L ^ l))));
        Scanner scanner = new Scanner(uRLConnection.getInputStream(), StandardCharsets.UTF_8.toString());
        try {
            String string3;
            block12: {
                block11: {
                    Scanner scanner2;
                    block13: {
                        scanner.useDelimiter((String)((Object)IlIlGg.a("l", (int)19453, (long)(0x43B4D8F339527C51L ^ l))));
                        scanner2 = scanner;
                        if (string2 == null) break block13;
                        try {
                            block14: {
                                if (!scanner2.hasNext()) break block11;
                                break block14;
                                catch (Throwable throwable) {
                                    throw IlIlGg.a(throwable);
                                }
                            }
                            scanner2 = scanner;
                        }
                        catch (Throwable throwable) {
                            throw IlIlGg.a(throwable);
                        }
                    }
                    string3 = scanner2.next();
                    break block12;
                }
                string3 = "";
            }
            String string4 = string3;
            scanner.close();
            return string4;
        }
        catch (Throwable throwable) {
            try {
                try {
                    scanner.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (Exception exception) {
                return string;
            }
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void IlIla(AsyncPlayerPreLoginEvent asyncPlayerPreLoginEvent) {
        long l = a ^ 0x30784A4E2FA7L;
        System.out.println(asyncPlayerPreLoginEvent.getName());
        if (((Boolean)this.IlIlw.getUnchecked((Object)asyncPlayerPreLoginEvent.getAddress().getHostAddress())).booleanValue()) {
            asyncPlayerPreLoginEvent.disallow(AsyncPlayerPreLoginEvent.Result.KICK_OTHER, (String)((Object)IlIlGg.a("l", (int)32179, (long)(0x56FDEB86EAC38628L ^ l))));
        }
    }

    @Override
    public void IlIlC() {
        long l = a ^ 0x4B7E5A08B5B8L;
        String string = IlIlGg.IlIlp();
        this.IlIlh.addAll(Arrays.asList(new IlIlj3(), new IlIloU(), new IlIlfq()));
        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)CoffeeProtect.IlIlJ());
        String string2 = string;
        if (string2 == null) {
            PacketWrapper.IlIle((int[])new int[3]);
        }
    }

    @Override
    public void IlIly() {
        this.IlIlh.clear();
        HandlerList.unregisterAll((Listener)this);
    }

    static /* synthetic */ boolean IlIll(IlIlGg ilIlGg, String string) {
        return ilIlGg.IlIlK(string);
    }

    public static void IlIlZ(String string) {
        IlIlc = string;
    }

    public static String IlIlp() {
        return IlIlc;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    IlIlGg.a = IlIls.a((long)5211204092583438065L, (long)6348841438887773701L, MethodHandles.lookup().lookupClass()).a(231169681276641L);
                    IlIlGg.d = new HashMap<K, V>(13);
                    var5 = IlIlGg.a ^ 79426790989591L;
                    IlIlGg.IlIlZ("Dimj1");
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[4];
                    var12_4 = 0;
                    var11_5 = "\u00923'g\u00d9\u00d0GeD\u00be\u00f1\u0007\\\u008a\u001f\u008b\u00d1\u00b3s\u0097\u001d\u00a4\u00eaY\u0087T\u0094p\u0019\u00d0\u0096\f\u0018\u00a4^>w\u00987\u00da\u00c2\u0007\u00a9s\u008bX\u00a9\u000b\u00a5\u00d5\u00fd\u00fd9p\u00f5\u0093\u00bb";
                    var13_6 = "\u00923'g\u00d9\u00d0GeD\u00be\u00f1\u0007\\\u008a\u001f\u008b\u00d1\u00b3s\u0097\u001d\u00a4\u00eaY\u0087T\u0094p\u0019\u00d0\u0096\f\u0018\u00a4^>w\u00987\u00da\u00c2\u0007\u00a9s\u008bX\u00a9\u000b\u00a5\u00d5\u00fd\u00fd9p\u00f5\u0093\u00bb".length();
                    var10_7 = 32;
                    var9_8 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = IlIlGg.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "\u00c9@\u001eo\u000f\u00f65\u0013\u0082\u0091\u00ff\u00b4Q\u00a6w]\u0010Z\u00d3\u000bX\u00b0Q\u00e4\u0005H\u0007\u0088\u00b1\u00fc\u009dy\\";
                        var13_6 = "\u00c9@\u001eo\u000f\u00f65\u0013\u0082\u0091\u00ff\u00b4Q\u00a6w]\u0010Z\u00d3\u000bX\u00b0Q\u00e4\u0005H\u0007\u0088\u00b1\u00fc\u009dy\\".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl35:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = IlIlGg.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
                switch (v5) {
                    default: {
                        ** continue;
                    }
                    ** case 0:
lbl52:
                    // 1 sources

                    ** continue;
                }
            }
            IlIlGg.b = var14_3;
            IlIlGg.c = new String[4];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl66:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = 1041471613687077515L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        IlIlGg.e = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5991;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlGg", exception);
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
            IlIlGg.c[n2] = IlIlGg.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlGg.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlGg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlGg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

