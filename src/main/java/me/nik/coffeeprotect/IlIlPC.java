/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJ5
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbK
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlAK;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlQb;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlZ6;
import me.nik.coffeeprotect.IlIlfF;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIlvF;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlqy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlJ5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIlbK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class IlIlPC
extends IlIlPw {
    private final CoffeeProtect IlIlS;
    private final IlIlAK<UUID> IlIlZ;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static final long[] f;
    private static final Long[] g;
    private static final Map h;
    private static transient /* synthetic */ String iPJSxhWiKX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlPC(CoffeeProtect coffeeProtect) {
        long l = a ^ 0x46002606A0CFL;
        super(IlIldF.LOWEST);
        this.IlIlZ = new IlIlAK((long)IlIlPC.b("u", (int)7925, (long)(0x316D099177731ED4L ^ l)));
        this.IlIlS = coffeeProtect;
        String[] stringArray = IlIlvF.IlIlo();
        try {
            if (PacketWrapper.IlIlz() == null) {
                IlIlvF.IlIlF(new String[4]);
            }
        }
        catch (IlIlfF ilIlfF) {
            throw IlIlPC.a(ilIlfF);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void IlIlP(PacketReceiveEvent var1_1) {
        block52: {
            block53: {
                block59: {
                    block48: {
                        block49: {
                            block47: {
                                block46: {
                                    block45: {
                                        block43: {
                                            block44: {
                                                block42: {
                                                    block41: {
                                                        block54: {
                                                            var2_2 = IlIlPC.a ^ 128433516513071L;
                                                            var4_3 = IlIlvF.IlIlo();
                                                            v0 /* !! */  = var1_1.getUser();
                                                            if (var4_3 == null) break block41;
                                                            if (v0 /* !! */  == null) ** GOTO lbl34
                                                            break block54;
                                                            catch (Exception v1) {
                                                                throw IlIlPC.a(v1);
                                                            }
                                                        }
                                                        try {
                                                            block55: {
                                                                v2 = var1_1;
                                                                if (var4_3 == null) break block42;
                                                                break block55;
                                                                catch (Exception v3) {
                                                                    throw IlIlPC.a(v3);
                                                                }
                                                            }
                                                            v0 /* !! */  = v2.getPlayer();
                                                        }
                                                        catch (Exception v4) {
                                                            throw IlIlPC.a(v4);
                                                        }
                                                    }
                                                    if (v0 /* !! */  == null) ** GOTO lbl34
                                                    v2 = var1_1;
                                                }
                                                if (var4_3 == null) break block43;
                                                try {
                                                    block56: {
                                                        if (!v2.isCancelled()) break block44;
                                                        break block56;
                                                        catch (Exception v5) {
                                                            throw IlIlPC.a(v5);
                                                        }
                                                    }
                                                    return;
                                                }
                                                catch (Exception v6) {
                                                    throw IlIlPC.a(v6);
                                                }
                                            }
                                            v2 = var1_1;
                                        }
                                        try {
                                            v7 = v2.getPacketType();
                                            if (var4_3 == null) break block45;
                                            if (v7 == IlIlnN.PLUGIN_MESSAGE) {
                                            }
                                            ** GOTO lbl54
                                        }
                                        catch (Exception v8) {
                                            throw IlIlPC.a(v8);
                                        }
                                        var7_4 = new IlIlbK(var1_1);
                                        var5_5 = var7_4.IlIlR();
                                        var6_6 = var7_4.IlIlb();
                                        try {
                                            if (var4_3 != null) break block46;
lbl54:
                                            // 2 sources

                                            v7 = var1_1.getPacketType();
                                        }
                                        catch (Exception v9) {
                                            throw IlIlPC.a(v9);
                                        }
                                    }
                                    if (v7 != IlIlqy.PLUGIN_MESSAGE) ** GOTO lbl65
                                    var7_4 = new IlIlJ5(var1_1);
                                    var5_5 = var7_4.IlIlK();
                                    var6_6 = var7_4.IlIlh();
                                    try {
                                        if (var4_3 != null) break block46;
lbl65:
                                        // 2 sources

                                        return;
                                    }
                                    catch (Exception v10) {
                                        throw IlIlPC.a(v10);
                                    }
                                }
                                var7_4 = (Player)var1_1.getPlayer();
                                var8_7 = var7_4.getUniqueId();
                                v11 = var5_5;
                                if (var4_3 == null) break block47;
                                try {
                                    block57: {
                                        if (v11 == null) break block48;
                                        break block57;
                                        catch (Exception v12) {
                                            throw IlIlPC.a(v12);
                                        }
                                    }
                                    v11 = var5_5.toLowerCase();
                                }
                                catch (Exception v13) {
                                    throw IlIlPC.a(v13);
                                }
                            }
                            v14 = v11.endsWith((String)IlIlPC.a("k", (int)31686, (long)(2061613923750953110L ^ var2_2)));
                            if (var4_3 == null) break block49;
                            try {
                                block58: {
                                    if (!v14) break block48;
                                    break block58;
                                    catch (Exception v15) {
                                        throw IlIlPC.a(v15);
                                    }
                                }
                                v14 = this.IlIlZ.contains(var8_7);
                            }
                            catch (Exception v16) {
                                throw IlIlPC.a(v16);
                            }
                        }
                        if (!v14) break block59;
                    }
                    return;
                }
                try {
                    block50: {
                        block51: {
                            var10_8 = new String(var6_6, StandardCharsets.UTF_8);
                            v17 = var10_8;
                            if (var4_3 == null) break block50;
                            try {
                                block60: {
                                    if (v17.length() <= (int)IlIlPC.e) break block51;
                                    break block60;
                                    catch (Exception v18) {
                                        throw IlIlPC.a(v18);
                                    }
                                }
                                throw new IlIlfF("");
                            }
                            catch (Exception v19) {
                                throw IlIlPC.a(v19);
                            }
                        }
                        v17 = IlIlrW.IlIlz(var10_8.substring(1));
                    }
                    var9_10 = v17;
                }
                catch (Exception var10_9) {
                    var1_1.setCancelled(true);
                    IlIlQb.IlIlL((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onPacketReceive$0(org.bukkit.entity.Player ), ()V)((Player)var7_4));
                    IlIlrW.IlIlU(new String[]{(String)IlIlPC.a("k", (int)25347, (long)(3705249696198547541L ^ var2_2)) + var7_4.getName() + (String)IlIlPC.a("k", (int)28512, (long)(7921576687229162549L ^ var2_2))});
                    return;
                }
                this.IlIlZ.add(var8_7);
                var10_8 = this.IlIlS.IlIlF().IlIlR((Player)var7_4);
                try {
                    try {
                        if (var4_3 == null) break block52;
                        if (var10_8 != null) break block53;
                    }
                    catch (Exception v20) {
                        throw IlIlPC.a(v20);
                    }
                    return;
                }
                catch (Exception v21) {
                    throw IlIlPC.a(v21);
                }
            }
            IlIlQb.IlIly((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onPacketReceive$2(me.nik.coffeeprotect.IlIlTM java.lang.String org.bukkit.entity.Player ), ()V)((IlIlPC)this, (IlIlTM)var10_8, (String)var9_10, (Player)var7_4), (long)IlIlPC.b("u", (int)22086, (long)(369448858305524102L ^ var2_2)));
        }
    }

    private /* synthetic */ void lambda$onPacketReceive$2(IlIlTM ilIlTM, String string, Player player) {
        block28: {
            CallSite callSite;
            String string2;
            Object object;
            String[] stringArray;
            block29: {
                boolean bl;
                long l;
                block27: {
                    block26: {
                        block23: {
                            block24: {
                                block25: {
                                    List<String> list;
                                    block22: {
                                        l = a ^ 0x17D12BC79E0L;
                                        String[] stringArray2 = IlIlvF.IlIlo();
                                        ilIlTM.IlIlR(string);
                                        stringArray = stringArray2;
                                        object = IlIlOq.CLIENT_SETTINGS_BANNED_CLIENTS.IlIlT();
                                        try {
                                            list = object;
                                            if (stringArray == null) break block22;
                                            if (list == null) break block23;
                                        }
                                        catch (IlIlfF ilIlfF) {
                                            throw IlIlPC.a(ilIlfF);
                                        }
                                        list = object;
                                    }
                                    try {
                                        bl = list.isEmpty();
                                        if (stringArray == null) break block24;
                                        if (!bl) break block25;
                                        break block23;
                                    }
                                    catch (IlIlfF ilIlfF) {
                                        throw IlIlPC.a(ilIlfF);
                                    }
                                }
                                bl = IlIlZ6.IlIli(object, string::contains);
                            }
                            try {
                                try {
                                    if (stringArray == null) break block26;
                                    if (!bl) break block23;
                                }
                                catch (IlIlfF ilIlfF) {
                                    throw IlIlPC.a(ilIlfF);
                                }
                                IlIlQb.IlIlL(() -> {
                                    long l = a ^ 0x4AB175561450L;
                                    player.kickPlayer(IlIlxi.CLIENT_KICK.IlIlF().replace((CharSequence)((Object)IlIlPC.a("k", (int)8098, (long)(0x60F51AEEBE07B78CL ^ l))), string));
                                });
                                return;
                            }
                            catch (IlIlfF ilIlfF) {
                                throw IlIlPC.a(ilIlfF);
                            }
                        }
                        bl = IlIlOq.CLIENT_SETTINGS_ALERT_NON_VANILLA.IlIlt();
                    }
                    try {
                        try {
                            try {
                                if (stringArray == null) break block27;
                                if (!bl) break block28;
                            }
                            catch (IlIlfF ilIlfF) {
                                throw IlIlPC.a(ilIlfF);
                            }
                            string2 = string;
                            callSite = IlIlPC.a("k", (int)203, (long)(0x69F2185493BCC557L ^ l));
                            if (stringArray == null) break block29;
                        }
                        catch (IlIlfF ilIlfF) {
                            throw IlIlPC.a(ilIlfF);
                        }
                        bl = string2.equals(callSite);
                    }
                    catch (IlIlfF ilIlfF) {
                        throw IlIlPC.a(ilIlfF);
                    }
                }
                try {
                    try {
                        if (bl && stringArray != null) break block28;
                    }
                    catch (IlIlfF ilIlfF) {
                        throw IlIlPC.a(ilIlfF);
                    }
                    string2 = IlIlxi.CLIENT_ALERT.IlIlF().replace((CharSequence)((Object)IlIlPC.a("k", (int)405, (long)(0x26E787173B4FC40DL ^ l))), player.getName());
                    callSite = IlIlPC.a("k", (int)3737, (long)(0x7B9A53040C1B4B04L ^ l));
                }
                catch (IlIlfF ilIlfF) {
                    throw IlIlPC.a(ilIlfF);
                }
            }
            object = string2.replace((CharSequence)((Object)callSite), string);
            for (UUID uUID : this.IlIlS.IlIlc().IlIlF()) {
                Player player2;
                block30: {
                    Player player3 = Bukkit.getPlayer((UUID)uUID);
                    try {
                        player2 = player3;
                        if (stringArray == null) break block30;
                        if (player2 == null) {
                            continue;
                        }
                    }
                    catch (IlIlfF ilIlfF) {
                        throw IlIlPC.a(ilIlfF);
                    }
                    player2 = player3;
                }
                player2.sendMessage((String)object);
                if (stringArray != null) continue;
            }
        }
    }

    private static /* synthetic */ void lambda$onPacketReceive$0(Player player) {
        block7: {
            Player player2;
            long l;
            block8: {
                String[] stringArray;
                block6: {
                    l = a ^ 0x1949163665FDL;
                    stringArray = IlIlvF.IlIlo();
                    try {
                        player2 = player;
                        if (stringArray == null) break block6;
                        if (player2 == null) break block7;
                    }
                    catch (IlIlfF ilIlfF) {
                        throw IlIlPC.a(ilIlfF);
                    }
                    player2 = player;
                }
                try {
                    try {
                        if (stringArray == null) break block8;
                        if (!player2.isOnline()) break block7;
                    }
                    catch (IlIlfF ilIlfF) {
                        throw IlIlPC.a(ilIlfF);
                    }
                    player2 = player;
                }
                catch (IlIlfF ilIlfF) {
                    throw IlIlPC.a(ilIlfF);
                }
            }
            player2.kickPlayer((String)((Object)IlIlPC.a("k", (int)31741, (long)(0x48EF38ECE032A27BL ^ l))));
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block18: {
            block17: {
                block19: {
                    block16: {
                        block15: {
                            IlIlPC.a = IlIls.a((long)3557988327809697792L, (long)-1722157644503866023L, MethodHandles.lookup().lookupClass()).a(227397306741959L);
                            IlIlPC.d = new HashMap<K, V>(13);
                            var16 = IlIlPC.a ^ 6294798002637L;
                            var18_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var16 >>> 56);
                            for (var19_2 = 1; var19_2 < 8; ++var19_2) {
                                v2 = v2;
                                v2[var19_2] = (byte)(var16 << var19_2 * 8 >>> 56);
                            }
                            var18_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var25_3 = new String[8];
                            var23_4 = 0;
                            var22_5 = "\u00c8Y\u00e6\u009cKn1;\u00ca\u00aefp\u00d2\u0011\u009a\u00b3\u00c6\u00c9\u00b9R\u00b9\\\u00ee3b-\u00ed\u00d4\u00ac{\u0085\u00b5(}l\u00d8\u00cd\u0007A\u00f0c\u00ba\u00f6\u00fd\u00adf\u00d0\u00d7-\u00b95\f\u00e1\u00e10\u0001\u00c1\u00f6u\u00b6f\u001f\u009d\u000e\u008d5\u0002\u00cf\u00e6\u00d9}\u00a7\u00f00=\u00dfTo*H\u00bb\u00d3\u00a0\u00fba\u00ab{\u0099\u00beSW\u001e%\u00f2\u0099\u00d6\u00db\u008ce\u00c5\u0083\u00d9\u00ea#\r\u00fcAl\u00d5tA\u00ed\u00a8|\r&\u00eey)c\u00e1\u00a9(-\u000b\u00c5\u00e9o\u00c3\u0007\u0001\u00a8;\u00edr\u0018\u00df\u00bd\u00f4\u00a5g\u008aXH\u009c\\\u00ad\u00baQ\u0005\bO@\u0006JV\u00aa\u00e3\u00e9IZ\u00d5A\u0010\u009b\u00f2gN\u0097\\i\u00de5*\u0084DK\u009a)y\u0018r\u008eA\u00a0\u00b9\u0015\r\nv\u00fb\u00a8\u00f7\u000eL\u0099'r\u00ac\u00d1\u00f5\u00a5Z\u00e2\u00f6";
                            var24_6 = "\u00c8Y\u00e6\u009cKn1;\u00ca\u00aefp\u00d2\u0011\u009a\u00b3\u00c6\u00c9\u00b9R\u00b9\\\u00ee3b-\u00ed\u00d4\u00ac{\u0085\u00b5(}l\u00d8\u00cd\u0007A\u00f0c\u00ba\u00f6\u00fd\u00adf\u00d0\u00d7-\u00b95\f\u00e1\u00e10\u0001\u00c1\u00f6u\u00b6f\u001f\u009d\u000e\u008d5\u0002\u00cf\u00e6\u00d9}\u00a7\u00f00=\u00dfTo*H\u00bb\u00d3\u00a0\u00fba\u00ab{\u0099\u00beSW\u001e%\u00f2\u0099\u00d6\u00db\u008ce\u00c5\u0083\u00d9\u00ea#\r\u00fcAl\u00d5tA\u00ed\u00a8|\r&\u00eey)c\u00e1\u00a9(-\u000b\u00c5\u00e9o\u00c3\u0007\u0001\u00a8;\u00edr\u0018\u00df\u00bd\u00f4\u00a5g\u008aXH\u009c\\\u00ad\u00baQ\u0005\bO@\u0006JV\u00aa\u00e3\u00e9IZ\u00d5A\u0010\u009b\u00f2gN\u0097\\i\u00de5*\u0084DK\u009a)y\u0018r\u008eA\u00a0\u00b9\u0015\r\nv\u00fb\u00a8\u00f7\u000eL\u0099'r\u00ac\u00d1\u00f5\u00a5Z\u00e2\u00f6".length();
                            var21_7 = 32;
                            var20_8 = -1;
lbl20:
                            // 2 sources

                            while (true) {
                                v3 = ++var20_8;
                                v4 = var22_5.substring(v3, v3 + var21_7);
                                v5 = -1;
                                break block15;
                                break;
                            }
lbl25:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = IlIlPC.a(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                var22_5 = "6\u00c2\u00c2\u0097\u00f3\u0091\u0007\u008d\n\u00bb^\u00ad\f\u00e4\u00a4NZO\u0007V\u00bb\u00a4O\u00cd\u0010\u00e7\u00c6\u0018\u00a4\u00a1\u00a1\u00a6*\u00a1\u00fd|\u001f<\u0099#\u0002";
                                var24_6 = "6\u00c2\u00c2\u0097\u00f3\u0091\u0007\u008d\n\u00bb^\u00ad\f\u00e4\u00a4NZO\u0007V\u00bb\u00a4O\u00cd\u0010\u00e7\u00c6\u0018\u00a4\u00a1\u00a1\u00a6*\u00a1\u00fd|\u001f<\u0099#\u0002".length();
                                var21_7 = 24;
                                var20_8 = -1;
lbl34:
                                // 2 sources

                                while (true) {
                                    v6 = ++var20_8;
                                    v4 = var22_5.substring(v6, v6 + var21_7);
                                    v5 = 0;
                                    break block15;
                                    break;
                                }
                                break;
                            }
lbl39:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = IlIlPC.a(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                break block16;
                                break;
                            }
                        }
                        var26_9 = var18_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                    IlIlPC.b = var25_3;
                    IlIlPC.c = new String[8];
                    var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v7 = SecretKeyFactory.getInstance("DES");
                    v8 = new byte[8];
                    v9 = v8;
                    v8[0] = (byte)(var16 >>> 56);
                    for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                        v9 = v9;
                        v9[var12_11] = (byte)(var16 << var12_11 * 8 >>> 56);
                    }
                    break block19;
lbl65:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var13_12 = 7637581411561354091L;
                var15_13 = var11_10.doFinal(new byte[]{(byte)(var13_12 >>> 56), (byte)(var13_12 >>> 48), (byte)(var13_12 >>> 40), (byte)(var13_12 >>> 32), (byte)(var13_12 >>> 24), (byte)(var13_12 >>> 16), (byte)(var13_12 >>> 8), (byte)var13_12});
                ** while (true)
                IlIlPC.e = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                IlIlPC.h = new HashMap<K, V>(13);
                var0_14 = Cipher.getInstance("DES/CBC/NoPadding");
                v10 = SecretKeyFactory.getInstance("DES");
                v11 = new byte[8];
                v12 = v11;
                v11[0] = (byte)(var16 >>> 56);
                for (var1_15 = 1; var1_15 < 8; ++var1_15) {
                    v12 = v12;
                    v12[var1_15] = (byte)(var16 << var1_15 * 8 >>> 56);
                }
                var0_14.init(2, (Key)v10.generateSecret(new DESKeySpec(v12)), new IvParameterSpec(new byte[8]));
                var6_16 = new long[2];
                var3_17 = 0;
                var4_18 = "\u00f7S\u0004\u00c5\u00af%\u008d~\u00fdQa\u00c5\u000f\u00b9Q\u00e9";
                var5_19 = "\u00f7S\u0004\u00c5\u00af%\u008d~\u00fdQa\u00c5\u000f\u00b9Q\u00e9".length();
                var2_20 = 0;
                while (true) {
                    break block17;
                    break;
                }
lbl94:
                // 1 sources

                while (true) {
                    var6_16[v13] = ((long)var10_23[0] & 255L) << 56 | ((long)var10_23[1] & 255L) << 48 | ((long)var10_23[2] & 255L) << 40 | ((long)var10_23[3] & 255L) << 32 | ((long)var10_23[4] & 255L) << 24 | ((long)var10_23[5] & 255L) << 16 | ((long)var10_23[6] & 255L) << 8 | (long)var10_23[7] & 255L;
                    if (var2_20 < var5_19) ** continue;
                    break block18;
                    break;
                }
            }
            var7_21 = var4_18.substring(var2_20, var2_20 += 8).getBytes("ISO-8859-1");
            v13 = var3_17++;
            var8_22 = ((long)var7_21[0] & 255L) << 56 | ((long)var7_21[1] & 255L) << 48 | ((long)var7_21[2] & 255L) << 40 | ((long)var7_21[3] & 255L) << 32 | ((long)var7_21[4] & 255L) << 24 | ((long)var7_21[5] & 255L) << 16 | ((long)var7_21[6] & 255L) << 8 | (long)var7_21[7] & 255L;
            var10_23 = var0_14.doFinal(new byte[]{(byte)(var8_22 >>> 56), (byte)(var8_22 >>> 48), (byte)(var8_22 >>> 40), (byte)(var8_22 >>> 32), (byte)(var8_22 >>> 24), (byte)(var8_22 >>> 16), (byte)(var8_22 >>> 8), (byte)var8_22});
            ** while (true)
        }
        IlIlPC.f = var6_16;
        IlIlPC.g = new Long[2];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6DBB;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlPC", exception);
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
            IlIlPC.c[n2] = IlIlPC.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlPC.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlPC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x712C;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = f[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlPC", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlPC.g[n2] = l4;
        }
        return g[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlPC.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlPC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlPC.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlPC.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

