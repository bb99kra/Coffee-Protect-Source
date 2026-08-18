/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelPipeline
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.HandlerList
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerJoinEvent
 *  org.bukkit.event.player.PlayerQuitEvent
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelPipeline;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.NettyPacketDecoder;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_jR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_Lw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Lg;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.event.player.PlayerQuitEvent;
import org.bukkit.plugin.Plugin;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class CP_Qf
implements CP_jR,
Listener {
    private ExecutorService CP_z;
    private final Map<UUID, Channel> CP_O = new HashMap<UUID, Channel>();
    private static final String CP_j;
    private static String CP_L;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String tragYjSDEv = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    public void CP_C() {
        long l = a ^ 0x1E38C24FF364L;
        String string = CP_Qf.CP_C();
        if (string != null) {
            if (CP_Oq.PACKET_DECODER_INJECT_ASYNC.CP_t()) {
                this.CP_z = Executors.newSingleThreadExecutor();
            }
            Bukkit.getOnlinePlayers().forEach(this::CP_I);
            Bukkit.getPluginManager().registerEvents((Listener)this, (Plugin)CoffeeProtect.CP_J());
        }
    }

    @Override
    public void CP_y() {
        block3: {
            ExecutorService executorService;
            block2: {
                long l = a ^ 0x5213EAC236E2L;
                HandlerList.unregisterAll((Listener)this);
                String string = CP_Qf.CP_C();
                this.CP_O.clear();
                String string2 = string;
                executorService = this.CP_z;
                if (string2 == null) break block2;
                if (executorService == null) break block3;
                executorService = this.CP_z;
            }
            executorService.shutdown();
            this.CP_z = null;
        }
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void CP_n(PlayerJoinEvent playerJoinEvent) {
        block4: {
            CP_Qf ilIlQf;
            block2: {
                block3: {
                    long l = a ^ 0x3643D3140B59L;
                    String string = CP_Qf.CP_C();
                    ilIlQf = this;
                    if (string == null) break block2;
                    if (ilIlQf.CP_z == null) break block3;
                    this.CP_z.execute(() -> this.CP_I(playerJoinEvent.getPlayer()));
                    if (string != null) break block4;
                }
                ilIlQf = this;
            }
            ilIlQf.CP_I(playerJoinEvent.getPlayer());
        }
    }

    @EventHandler(priority=EventPriority.MONITOR, ignoreCancelled=true)
    public void CP_u(PlayerQuitEvent playerQuitEvent) {
        this.CP_O.remove(playerQuitEvent.getPlayer().getUniqueId());
    }

    private Channel CP_r(Player player) {
        return this.CP_O.computeIfAbsent(player.getUniqueId(), uUID -> (Channel)CP_Lg.CP_D(player));
    }

    public void CP_Y(Player player) {
        block2: {
            Channel channel;
            block3: {
                Channel channel2;
                long l = a ^ 0x1FC275F0825CL;
                String string = CP_Qf.CP_C();
                if (player == null) break block2;
                channel = channel2 = this.CP_r(player);
                if (string == null) break block3;
                if (channel == null) break block2;
                channel = channel2;
            }
            channel.close();
        }
    }

    private void CP_I(Player player) {
        block6: {
            CallSite callSite;
            ChannelPipeline channelPipeline;
            long l;
            block11: {
                ChannelHandler channelHandler;
                ChannelPipeline channelPipeline2;
                block9: {
                    String string;
                    block10: {
                        Channel channel;
                        block8: {
                            Channel channel2;
                            block7: {
                                l = a ^ 0x68EB86872AF3L;
                                string = CP_Qf.CP_C();
                                if (player == null) {
                                    return;
                                }
                                channel2 = this.CP_r(player);
                                if (!CP_Oq.PACKET_DECODER_ENABLED.CP_t()) break block6;
                                channel = channel2;
                                if (string == null) break block7;
                                if (channel == null) break block6;
                                channel = channel2;
                            }
                            if (string == null) break block8;
                            if (CP_Lw.CP_b(channel)) break block6;
                            channel = channel2;
                        }
                        channelPipeline2 = channel.pipeline();
                        channelHandler = channelPipeline2.get((String)((Object)CP_Qf.a("p", (int)26301, (long)(0x2229841167853EF7L ^ l))));
                        if (string != null) {
                            if (channelHandler != null) {
                                channelPipeline2.remove((String)((Object)CP_Qf.a("p", (int)13136, (long)(0x5CF181D64161EB1FL ^ l))));
                            }
                            channelHandler = channelPipeline2.get((String)((Object)CP_Qf.a("p", (int)28219, (long)(0x37408F060ED9B675L ^ l))));
                        }
                        if (string == null) break block9;
                        if (channelHandler == null) break block10;
                        channelPipeline2.addAfter((String)((Object)CP_Qf.a("p", (int)19626, (long)(0x2CA6105DE23A14E2L ^ l))), (String)((Object)CP_Qf.a("p", (int)13136, (long)(0x5CF181D64161EB1FL ^ l))), (ChannelHandler)new NettyPacketDecoder(player));
                        if (string != null) break block6;
                    }
                    channelPipeline = channelPipeline2;
                    callSite = CP_Qf.a("p", (int)21157, (long)(0x43197062D6478AE8L ^ l));
                    if (string == null) break block11;
                    channelHandler = channelPipeline.get((String)((Object)callSite));
                }
                if (channelHandler == null) break block6;
                channelPipeline = channelPipeline2;
                callSite = CP_Qf.a("p", (int)979, (long)(0x6ACFE9C664455B9FL ^ l));
            }
            channelPipeline.addAfter((String)((Object)callSite), (String)((Object)CP_Qf.a("p", (int)13136, (long)(0x5CF181D64161EB1FL ^ l))), (ChannelHandler)new NettyPacketDecoder(player));
        }
    }

    public static void CP_k(String string) {
        CP_L = string;
    }

    public static String CP_C() {
        return CP_L;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_Qf.a = CP_s.a(-2884238759590195632L, 6789376593839429008L, MethodHandles.lookup().lookupClass()).a(154038073994929L);
                CP_Qf.d = new HashMap<K, V>(13);
                var0 = CP_Qf.a ^ 86757215202L;
                CP_Qf.CP_k("TSWIOc");
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
                var9_3 = new String[7];
                var7_4 = 0;
                var6_5 = "\rL\u00e6\u00d4\u001e/\u00da\t\u0015\"\u001eK\u0090\u00f5\u00df\u00b7\u00fa\u00bc\u00f7^ly\u0018y\u00c8$\u00f4\u00c4\u00d1\u00d0\n\u00b1 \u009am\u008b>@\u00dax\u00ff\u00a5\u0083G\u00cf\u00d4J\to=\u00f08\u00aa\u000f\u00c11I\u00eb\u007f\u00a8\u00f6\u00ed\u0001\u009cI\u0018\u00d23{\u00ca\u00a6\u00fd\u00d9}\u00f8\u008e$\u009d\u00d0\u001dBy\u00ad\u009e\u0007\u00a7H\u00b8\u0011$ :\u00c0\u0012|K\u0005\u0090:K\u00be\u001b\u00dc\tu\u00dd\u00af\u009e\u0097r\u00e3jF\u0019\u0010\u00e8\"^\u0082\u00c6\u00dc\u00e5\u00f0\u0018%\u0090\u008b?\u0087\u0016#~\u0087\u00ab\u000b\u000b7C\u00fb5I\u009e\u00f7\u00a8\u0017\u00ae\u007f\u0000";
                var8_6 = "\rL\u00e6\u00d4\u001e/\u00da\t\u0015\"\u001eK\u0090\u00f5\u00df\u00b7\u00fa\u00bc\u00f7^ly\u0018y\u00c8$\u00f4\u00c4\u00d1\u00d0\n\u00b1 \u009am\u008b>@\u00dax\u00ff\u00a5\u0083G\u00cf\u00d4J\to=\u00f08\u00aa\u000f\u00c11I\u00eb\u007f\u00a8\u00f6\u00ed\u0001\u009cI\u0018\u00d23{\u00ca\u00a6\u00fd\u00d9}\u00f8\u008e$\u009d\u00d0\u001dBy\u00ad\u009e\u0007\u00a7H\u00b8\u0011$ :\u00c0\u0012|K\u0005\u0090:K\u00be\u001b\u00dc\tu\u00dd\u00af\u009e\u0097r\u00e3jF\u0019\u0010\u00e8\"^\u0082\u00c6\u00dc\u00e5\u00f0\u0018%\u0090\u008b?\u0087\u0016#~\u0087\u00ab\u000b\u000b7C\u00fb5I\u009e\u00f7\u00a8\u0017\u00ae\u007f\u0000".length();
                var5_7 = 32;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_Qf.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00b8\u0018\u00de\u0010\u00f9\u00e7\u0091\u00f6\u00f5\u00ec\u001c\u00b0\u009c\u0011\u008ddD\u00de\u00da\u00009.7`\u0018Q\u008a\u00af\u009b\u00ffpT7\u00eb\u001a\u00bd\u00ef#i\u00c2'n\u00b8\u00daIms\u0001]";
                    var8_6 = "\u00b8\u0018\u00de\u0010\u00f9\u00e7\u0091\u00f6\u00f5\u00ec\u001c\u00b0\u009c\u0011\u008ddD\u00de\u00da\u00009.7`\u0018Q\u008a\u00af\u009b\u00ffpT7\u00eb\u001a\u00bd\u00ef#i\u00c2'n\u00b8\u00daIms\u0001]".length();
                    var5_7 = 24;
                    var4_8 = -1;
lbl35:
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
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_Qf.a(var10_9).intern();
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        CP_Qf.b = var9_3;
        CP_Qf.c = new String[7];
        CP_Qf.CP_j = CP_Qf.a("p", (int)27275, (long)(2641850512891352019L ^ var0));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x39CD;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Qf", exception);
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
            CP_Qf.c[n2] = CP_Qf.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Qf.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_Qf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Qf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
