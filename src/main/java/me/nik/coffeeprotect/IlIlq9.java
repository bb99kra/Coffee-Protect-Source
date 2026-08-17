/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.plugin.Plugin
 *  org.bukkit.scheduler.BukkitRunnable
 */
package me.nik.coffeeprotect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.net.URL;
import java.net.URLConnection;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlPA;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIlx5;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;

public class IlIlq9
extends BukkitRunnable
implements Listener {
    private final CoffeeProtect IlIlX;
    private String IlIlu;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String ttmvDkSrTZ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlq9(CoffeeProtect coffeeProtect) {
        this.IlIlX = coffeeProtect;
    }

    public void run() {
        block7: {
            long l = a ^ 0x272D26705536L;
            boolean bl = IlIlPA.IlIly();
            try {
                URLConnection uRLConnection = new URL((String)((Object)IlIlq9.a("d", (int)24782, (long)(0x7AB68F2356D2B1CAL ^ l)))).openConnection();
                uRLConnection.addRequestProperty((String)((Object)IlIlq9.a("d", (int)14523, (long)(0x3C7688E5DC3669B9L ^ l))), (String)((Object)IlIlq9.a("d", (int)1032, (long)(0x425660BC6975550EL ^ l))));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
                this.IlIlu = bufferedReader.readLine();
                bufferedReader.close();
            }
            catch (IOException iOException) {
                IlIlrW.IlIlU(new String[]{IlIlq9.a("d", (int)19282, (long)(0x281FDC22E1F61A53L ^ l))});
                return;
            }
            try {
                block6: {
                    try {
                        if (this.IlIlX.getDescription().getVersion().equals(this.IlIlu)) break block6;
                        Bukkit.getServer().getConsoleSender().sendMessage(IlIlxi.UPDATE_FOUND.IlIlF().replace((CharSequence)((Object)IlIlq9.a("d", (int)4608, (long)(0x61E8C1D050144300L ^ l))), this.IlIlX.getDescription().getVersion()).replace((CharSequence)((Object)IlIlq9.a("d", (int)17422, (long)(0xCFF3AC59297150DL ^ l))), this.IlIlu));
                        Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)this.IlIlX);
                        if (!bl) break block7;
                    }
                    catch (IOException iOException) {
                        throw IlIlq9.a(iOException);
                    }
                }
                Bukkit.getServer().getConsoleSender().sendMessage(IlIlxi.UPDATE_NOT_FOUND.IlIlF());
            }
            catch (IOException iOException) {
                throw IlIlq9.a(iOException);
            }
        }
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void IlIlg(PlayerJoinEvent playerJoinEvent) {
        block3: {
            String string;
            Player player;
            block2: {
                long l = a ^ 0x6C25492E88AAL;
                Player player2 = playerJoinEvent.getPlayer();
                boolean bl = IlIlPA.IlIlf();
                player = player2;
                string = IlIlx5.ADMIN.IlIla();
                if (!bl) break block2;
                if (!player.hasPermission(string)) break block3;
                player = player2;
                string = IlIlxi.UPDATE_FOUND.IlIlF().replace((CharSequence)((Object)IlIlq9.a("d", (int)32584, (long)(0x5D1C6BB47799F3D1L ^ l))), this.IlIlX.getDescription().getVersion()).replace((CharSequence)((Object)IlIlq9.a("d", (int)25973, (long)(0x16AC4439F84FE9EEL ^ l))), this.IlIlu);
            }
            player.sendMessage(string);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIlq9.a = IlIls.a((long)-6648011666130179356L, (long)7191860037198542525L, MethodHandles.lookup().lookupClass()).a(65881578446608L);
                IlIlq9.d = new HashMap<K, V>(13);
                var0 = IlIlq9.a ^ 137151099854189L;
                var2_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var9_3 = new String[8];
                var7_4 = 0;
                var6_5 = "/\u009b\u00ad\u000f\u00a3\u0092\u00ada\u00dd\u009e\u00079H\u0081P\u0084\u00ca\u00a2\u00fc\u008d)\u009e3R\u0004\u00d8\u0080\u00c5\u00b1\u00a2\u009c\u0006%h\u0083#\u00d7\u001d\u008d\u00e9\u00f3\u0006\u0003/\u0017dx%\u00f2\u0090}\u00e81\u00cb\u00c5\u0091\u0099\u00e3\u00f3\u00c7f\u00e6}\u001e\u00f9\u00b5\u00ec!9e\u0092\u00fa9\u0086#\u00ad\u0099\u00c7\u00ed\u00db\u00dd{\u00e5\u0004\u00b1\u001c\u00f1\u00d1\u001b\u0010\u00a21\u00e4r\u00a7\u008a\u00d5\u00d1\u00f8.4\u00b6\u00b1\u0012\u00ffJ\u00a6\u00db\u00b8H\u0085\u00d9\u0003\u00e3\u00e1Y\u00b4\u00ea\u009a\u00cd\u009c\u00eb\r\u00d8\u00e2\u007f\u00b9\u00b1 G\u0007\u009bY\u000e\u009d7\u00b1q\u00d4m\f\u00c2\u00eaAc\u00d4B\u009c\u00f5\u00bf\n^\t\u0094.\u0083%huM\u00af \u0081\u000eD\u00c9\u00d6\u00edm\u00dc\u0015PF\u00c0H\u00f2\u000f\u0091\u0004\u00cd\u0016R\u00ec\u00c5o*\u00b6\u001b\u0007\u00a6v\u00bdQM\u0010\t6\u0081o6\u00e2v8[\u00bcD\u00bc\u0090\u00c3\u00cb\u00fb\u0018=\u00ed\u00191\u009d\u00b2\u00ac\u0011\u00ea\u00dfF\u00821?\u001dW\u00fa\u00cak8\u00e6\u00c3y\u0002p\u00d9\u00c8K\u00f0\u0087\u00f7fS\u00b5\u00c4\u00b1\u0089\u00b6\u0095\u00f3\u0092{@O\b\u00a8vC5\u0084\u008e;\u00f6p\u0090bI\nE#\u00abi\u00c4\u00aa\u00ab\u00ccgB\bp\u00f5\u0099\u00ce\u00b8\u00f9\u0006\u00ed\u0088\u008f\u00bb\u009b\u0084f\u00d5\u00e2\u009c\u00b6\u00ea2^$\u0098$\u00a6\u008f\u00d5\u0007R8G+\u00cd\u00cd\u00f0\u0092\u00f7\u009e\u00b5\u00ee\"\u0018\u00d1\u00ce\u00e94\u000e\u00b6\u0080\u00144a\u00b2ETA\u00a8\u00deN\u008aO$\u0084\u00b0\u0091L+]";
                var8_6 = "/\u009b\u00ad\u000f\u00a3\u0092\u00ada\u00dd\u009e\u00079H\u0081P\u0084\u00ca\u00a2\u00fc\u008d)\u009e3R\u0004\u00d8\u0080\u00c5\u00b1\u00a2\u009c\u0006%h\u0083#\u00d7\u001d\u008d\u00e9\u00f3\u0006\u0003/\u0017dx%\u00f2\u0090}\u00e81\u00cb\u00c5\u0091\u0099\u00e3\u00f3\u00c7f\u00e6}\u001e\u00f9\u00b5\u00ec!9e\u0092\u00fa9\u0086#\u00ad\u0099\u00c7\u00ed\u00db\u00dd{\u00e5\u0004\u00b1\u001c\u00f1\u00d1\u001b\u0010\u00a21\u00e4r\u00a7\u008a\u00d5\u00d1\u00f8.4\u00b6\u00b1\u0012\u00ffJ\u00a6\u00db\u00b8H\u0085\u00d9\u0003\u00e3\u00e1Y\u00b4\u00ea\u009a\u00cd\u009c\u00eb\r\u00d8\u00e2\u007f\u00b9\u00b1 G\u0007\u009bY\u000e\u009d7\u00b1q\u00d4m\f\u00c2\u00eaAc\u00d4B\u009c\u00f5\u00bf\n^\t\u0094.\u0083%huM\u00af \u0081\u000eD\u00c9\u00d6\u00edm\u00dc\u0015PF\u00c0H\u00f2\u000f\u0091\u0004\u00cd\u0016R\u00ec\u00c5o*\u00b6\u001b\u0007\u00a6v\u00bdQM\u0010\t6\u0081o6\u00e2v8[\u00bcD\u00bc\u0090\u00c3\u00cb\u00fb\u0018=\u00ed\u00191\u009d\u00b2\u00ac\u0011\u00ea\u00dfF\u00821?\u001dW\u00fa\u00cak8\u00e6\u00c3y\u0002p\u00d9\u00c8K\u00f0\u0087\u00f7fS\u00b5\u00c4\u00b1\u0089\u00b6\u0095\u00f3\u0092{@O\b\u00a8vC5\u0084\u008e;\u00f6p\u0090bI\nE#\u00abi\u00c4\u00aa\u00ab\u00ccgB\bp\u00f5\u0099\u00ce\u00b8\u00f9\u0006\u00ed\u0088\u008f\u00bb\u009b\u0084f\u00d5\u00e2\u009c\u00b6\u00ea2^$\u0098$\u00a6\u008f\u00d5\u0007R8G+\u00cd\u00cd\u00f0\u0092\u00f7\u009e\u00b5\u00ee\"\u0018\u00d1\u00ce\u00e94\u000e\u00b6\u0080\u00144a\u00b2ETA\u00a8\u00deN\u008aO$\u0084\u00b0\u0091L+]".length();
                var5_7 = 128;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIlq9.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "E\u00ea\u008ao\u00e6*\u00d31\rzJ\u00c8\u00c1?\u00ba=\u00b89Feg\u00a4\u00df\u00aa\u0010\u00e3\u001cbx\r\u00c8\u00acf\u00f4\u00db\u0019\u001eW\u00b8+\u00b0";
                    var8_6 = "E\u00ea\u008ao\u00e6*\u00d31\rzJ\u00c8\u00c1?\u00ba=\u00b89Feg\u00a4\u00df\u00aa\u0010\u00e3\u001cbx\r\u00c8\u00acf\u00f4\u00db\u0019\u001eW\u00b8+\u00b0".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var4_8;
                        v4 = var6_5.substring(v6, v6 + var5_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIlq9.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var10_9 = var2_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        IlIlq9.b = var9_3;
        IlIlq9.c = new String[8];
    }

    private static IOException a(IOException iOException) {
        return iOException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5790;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlq9", exception);
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
            IlIlq9.c[n2] = IlIlq9.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlq9.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlq9" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlq9.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

