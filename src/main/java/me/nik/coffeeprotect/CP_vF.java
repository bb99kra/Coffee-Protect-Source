/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Location
 *  org.bukkit.World$Environment
 *  org.bukkit.entity.Entity
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.Listener
 *  org.bukkit.event.entity.EntityTeleportEvent
 *  org.bukkit.event.player.PlayerTeleportEvent
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_AK;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_Qb;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_vs;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityTeleportEvent;
import org.bukkit.event.player.PlayerTeleportEvent;

public class CP_vF
implements Listener {
    private final CP_AK<UUID> CP_z = new CP_AK(CP_Oq.TELEPORT_VALIDATOR_WORLD_CHANGE_DELAY.CP_q());
    private static String[] CP_p;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String iDaNjIACCu = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void CP_j(PlayerTeleportEvent var1_1) {
        var2_2 = CP_vF.a ^ 80333656121890L;
        var4_3 = CP_vF.CP_o();
        if (var4_3 == null) ** GOTO lbl7
        switch (CP_vs.CP_m[var1_1.getCause().ordinal()]) {
            case 1: 
            case 2: 
            case 3: {
                var1_1.setCancelled(true);
lbl7:
                // 2 sources

                if ((var5_4 = var1_1.getPlayer()) == null) {
                    return;
                }
                v0 = var6_5 = CoffeeProtect.CP_J().CP_F().CP_R(var5_4);
                if (var4_3 != null) {
                    if (v0 == null) {
                        return;
                    }
                    v0 = var6_5;
                }
                var7_6 = v0.CP_f();
                if (var4_3 != null) {
                    if (var7_6 <= CP_Oq.TELEPORT_VALIDATOR_PORTAL_DELAY.CP_q()) {
                        CP_rW.CP_U(new String[]{(String)CP_vF.a("c", (int)28113, (long)(4175946689866256212L ^ var2_2)) + var5_4.getName() + (String)CP_vF.a("c", (int)14613, (long)(5366856034799655827L ^ var2_2)) + var7_6});
                        if (var4_3 != null) break;
                    }
                    var6_5.CP_l();
                }
                if ((var9_7 = var1_1.getTo()) == null) {
                    return;
                }
                CP_Qb.CP_l((Runnable)LambdaMetafactory.metafactory(null, null, null, ()V, lambda$onTeleport$0(org.bukkit.entity.Player org.bukkit.Location ), ()V)((Player)var5_4, (Location)var9_7), CP_Oq.TELEPORT_VALIDATOR_VALIDATION_DELAY.CP_q());
            }
        }
    }

    @EventHandler(priority=EventPriority.LOWEST, ignoreCancelled=true)
    public void CP_o(EntityTeleportEvent entityTeleportEvent) {
        block10: {
            boolean bl;
            Entity entity;
            block12: {
                String[] stringArray;
                block11: {
                    Location location;
                    block9: {
                        block8: {
                            boolean bl2;
                            block7: {
                                long l = a ^ 0x2C694E1BB130L;
                                entity = entityTeleportEvent.getEntity();
                                stringArray = CP_vF.CP_o();
                                bl2 = entity.getWorld().getEnvironment().equals((Object)World.Environment.THE_END);
                                if (stringArray == null) break block7;
                                if (!bl2) break block8;
                                bl2 = entity.isEmpty();
                            }
                            if (!bl2) {
                                entityTeleportEvent.setCancelled(true);
                            }
                        }
                        location = entityTeleportEvent.getTo();
                        if (stringArray == null) break block9;
                        if (location == null) break block10;
                        location = entityTeleportEvent.getFrom();
                    }
                    bl = location.getWorld().getUID().equals(entityTeleportEvent.getTo().getWorld().getUID());
                    if (stringArray == null) break block11;
                    if (bl) break block10;
                    bl = this.CP_z.contains(entity.getUniqueId());
                }
                if (stringArray == null) break block10;
                if (!bl) break block12;
                entityTeleportEvent.setCancelled(true);
                if (stringArray != null) break block10;
            }
            bl = this.CP_z.add(entity.getUniqueId());
        }
    }

    private static /* synthetic */ void lambda$onTeleport$0(Player player, Location location) {
        block4: {
            boolean bl;
            block5: {
                int n;
                String[] stringArray;
                long l;
                block2: {
                    block3: {
                        l = a ^ 0x57855D8C4AE8L;
                        stringArray = CP_vF.CP_o();
                        n = player.isDead();
                        if (stringArray == null) break block2;
                        if (n != 0) break block3;
                        bl = player.isValid();
                        if (stringArray == null) break block4;
                        if (bl) break block5;
                    }
                    n = 1;
                }
                String[] stringArray2 = new String[n];
                stringArray2[0] = (String)((Object)CP_vF.a("c", (int)27692, (long)(0x5F82334B3A466662L ^ l))) + player.getName();
                CP_rW.CP_U(stringArray2);
                if (stringArray != null) break block4;
            }
            bl = player.teleport(location);
        }
    }

    public static void CP_F(String[] stringArray) {
        CP_p = stringArray;
    }

    public static String[] CP_o() {
        return CP_p;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = CP_s.a(4935696816322873284L, -8968562935679179643L, MethodHandles.lookup().lookupClass()).a(220290152594533L);
        d = new HashMap(13);
        long l = a ^ 0x23EB0544EA8AL;
        CP_vF.CP_F(new String[1]);
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
        String[] stringArray = new String[3];
        int n = 0;
        String string = "~x\u001bA\u0000}jV\u00c7i\u00c3\u0091S\th\u008d\u008dp\u001f\u00e1`\u00fe\u00fcGV\u00be\u0090\u00f0\u00184\u00f0 \u000e\u007f\u00c8_\u00a5l\u00bc\u0087\u00b4/\u00b6\u000e\u00f5\u00fd\u00b8\u0090\u001c`\u0007\u0090\u00c0\u00c2Kl\u0086\u00f7M\u008fi\u0081\u00e8;\u0092\u0097\u00a05\u00e5\u00c3Y\u00f3\u00abA\u0095\"\u00ed`I\u00c0\u0096\u00fb\u00e6p2\u00b9\u00fbWX\u00aavj\r#\u0091\u00ff{o\u000b\u00c9[\u00a0A\u00e46!\u00ab?\u00e8a\u008a\u0092#\u00df\u00f0\u00ce\u00ec\r\u008a:\u00ad\u0018\u00e7\u0082@\u00c4\f{OHy\u00d19m.<\u00dfs&\u0001\u0094\u00a1\u0007}\u0090C\u00a6F\u00c5c\u00df\u00d2H\u007f\u00e2\u0017_\u0013X\u009c\u00dem\u00bd\u00f5\u0088;L\u00e2~V%\u00cc\u00a5\u00deE\u0084\u00a6 \u00b1S\u00b5\u00e5\u00e3!\u00c0\u00b7\u0095\u00ddkD\u00d1\u0006\u00bbb\u00aa^U\u001cjp\u0018k\u00a7\u00d3c\u00dcg\u00c6|?";
        int n2 = "~x\u001bA\u0000}jV\u00c7i\u00c3\u0091S\th\u008d\u008dp\u001f\u00e1`\u00fe\u00fcGV\u00be\u0090\u00f0\u00184\u00f0 \u000e\u007f\u00c8_\u00a5l\u00bc\u0087\u00b4/\u00b6\u000e\u00f5\u00fd\u00b8\u0090\u001c`\u0007\u0090\u00c0\u00c2Kl\u0086\u00f7M\u008fi\u0081\u00e8;\u0092\u0097\u00a05\u00e5\u00c3Y\u00f3\u00abA\u0095\"\u00ed`I\u00c0\u0096\u00fb\u00e6p2\u00b9\u00fbWX\u00aavj\r#\u0091\u00ff{o\u000b\u00c9[\u00a0A\u00e46!\u00ab?\u00e8a\u008a\u0092#\u00df\u00f0\u00ce\u00ec\r\u008a:\u00ad\u0018\u00e7\u0082@\u00c4\f{OHy\u00d19m.<\u00dfs&\u0001\u0094\u00a1\u0007}\u0090C\u00a6F\u00c5c\u00df\u00d2H\u007f\u00e2\u0017_\u0013X\u009c\u00dem\u00bd\u00f5\u0088;L\u00e2~V%\u00cc\u00a5\u00deE\u0084\u00a6 \u00b1S\u00b5\u00e5\u00e3!\u00c0\u00b7\u0095\u00ddkD\u00d1\u0006\u00bbb\u00aa^U\u001cjp\u0018k\u00a7\u00d3c\u00dcg\u00c6|?".length();
        int n3 = 88;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = CP_vF.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                b = stringArray;
                c = new String[3];
                return;
            }
            n3 = string.charAt(n4);
        }
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x793C;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_vF", exception);
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
            CP_vF.c[n2] = CP_vF.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_vF.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_vF" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_vF.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
