/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.EventHandler
 *  org.bukkit.event.EventPriority
 *  org.bukkit.event.HandlerList
 *  org.bukkit.event.Listener
 *  org.bukkit.event.player.PlayerLoginEvent
 *  org.bukkit.event.player.PlayerLoginEvent$Result
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
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_vF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.HandlerList;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerLoginEvent;

public class CP_TH
implements Listener {
    private final CoffeeProtect CP_i;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String DHKpgZOLrN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_TH(CoffeeProtect coffeeProtect) {
        this.CP_i = coffeeProtect;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @EventHandler(priority=EventPriority.HIGHEST, ignoreCancelled=true)
    public void CP_R(PlayerLoginEvent playerLoginEvent) {
        int n;
        String string;
        long l;
        block28: {
            String[] stringArray;
            block27: {
                String string2;
                String string3;
                String string4;
                String string5;
                block25: {
                    CP_TM ilIlTM;
                    Player player;
                    block24: {
                        l = a ^ 0x5495C3295E67L;
                        player = playerLoginEvent.getPlayer();
                        stringArray = CP_vF.CP_o();
                        CP_TM ilIlTM2 = this.CP_i.CP_F().CP_R(player);
                        try {
                            ilIlTM = ilIlTM2;
                            if (stringArray == null) break block24;
                            if (ilIlTM == null) return;
                        }
                        catch (InterruptedException interruptedException) {
                            throw CP_TH.a(interruptedException);
                        }
                        ilIlTM = ilIlTM2;
                    }
                    try {
                        if (ilIlTM.CP_R()) {
                            return;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        throw CP_TH.a(interruptedException);
                    }
                    UUID uUID = player.getUniqueId();
                    try {
                        if (uUID.getMostSignificantBits() == 0L) {
                            return;
                        }
                    }
                    catch (InterruptedException interruptedException) {
                        throw CP_TH.a(interruptedException);
                    }
                    string = player.getName();
                    string5 = uUID.toString().replace("-", "");
                    string4 = UUID.nameUUIDFromBytes(((String)((Object)CP_TH.a("x", (int)26084, (long)(0x2244929937BCCCE4L ^ l))) + string).getBytes()).toString().replace("-", "");
                    string3 = null;
                    CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(() -> {
                        String string2;
                        block6: {
                            long l = a ^ 0x12CD58870EA1L;
                            string2 = "";
                            String[] stringArray = CP_vF.CP_o();
                            try {
                                String string3;
                                URLConnection uRLConnection = new URL((String)((Object)CP_TH.a("x", (int)12465, (long)(0x584F77E89B87C970L ^ l))) + string).openConnection();
                                uRLConnection.setDoOutput(true);
                                uRLConnection.connect();
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(uRLConnection.getInputStream()));
                                StringBuilder stringBuilder = new StringBuilder();
                                while ((string3 = bufferedReader.readLine()) != null) {
                                    try {
                                        stringBuilder.append(string3).append("\n");
                                        if (stringArray != null) {
                                            if (stringArray != null) continue;
                                            break;
                                        }
                                        break block6;
                                    }
                                    catch (IOException iOException) {
                                        throw CP_TH.a(iOException);
                                    }
                                }
                                bufferedReader.close();
                                string2 = stringBuilder.toString();
                            }
                            catch (IOException iOException) {
                                // empty catch block
                            }
                        }
                        return string2;
                    });
                    try {
                        string3 = completableFuture.get();
                    }
                    catch (InterruptedException | ExecutionException exception) {
                        // empty catch block
                    }
                    try {
                        block26: {
                            try {
                                try {
                                    string2 = string3;
                                    if (stringArray == null) break block25;
                                    if (string2 != null) break block26;
                                }
                                catch (InterruptedException interruptedException) {
                                    throw CP_TH.a(interruptedException);
                                }
                                HandlerList.unregisterAll((Listener)this);
                                if (stringArray != null) return;
                            }
                            catch (InterruptedException interruptedException) {
                                throw CP_TH.a(interruptedException);
                            }
                        }
                        string2 = string5;
                    }
                    catch (InterruptedException interruptedException) {
                        throw CP_TH.a(interruptedException);
                    }
                }
                try {
                    try {
                        n = string2.contains(string4);
                        if (stringArray == null) break block27;
                        if (n != 0) return;
                    }
                    catch (InterruptedException interruptedException) {
                        throw CP_TH.a(interruptedException);
                    }
                    n = string3.contains(string5);
                }
                catch (InterruptedException interruptedException) {
                    throw CP_TH.a(interruptedException);
                }
            }
            try {
                try {
                    if (stringArray == null) break block28;
                    if (n != 0) return;
                }
                catch (InterruptedException interruptedException) {
                    throw CP_TH.a(interruptedException);
                }
                playerLoginEvent.disallow(PlayerLoginEvent.Result.KICK_OTHER, (String)((Object)CP_TH.a("x", (int)15297, (long)(0x4CEEA2021A5B12C5L ^ l))));
                n = 1;
            }
            catch (InterruptedException interruptedException) {
                throw CP_TH.a(interruptedException);
            }
        }
        String[] stringArray = new String[n];
        stringArray[0] = (String)((Object)CP_TH.a("x", (int)23613, (long)(0x180FD0DC86CE753BL ^ l))) + string + (String)((Object)CP_TH.a("x", (int)4082, (long)(0x1E47E8FF7C7DA6F7L ^ l)));
        CP_rW.CP_U(stringArray);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_TH.a = CP_s.a(42187768053062688L, -916908012260212199L, MethodHandles.lookup().lookupClass()).a(163823152389971L);
                CP_TH.d = new HashMap<K, V>(13);
                var0 = CP_TH.a ^ 4123289286966L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "\u00e8\u0081F3[\u00f7.8\u0092\r\u00d4`\n\u00d0F\u00a9R\u00ce\u00d8z\b\u00af~\u00e2(\u00e4R1\u008c\u00bc\u00dc:\u0002\u000e3\u0081\u00ca\u00f9(\u00ec\u00e6\u00b6\u00b0Vb\u00a5\u00f9h|\u000e#g\u0012u\u009ey\u0013\u00b4\u00ba\u00c7\u0011h\u00a3\u00aa\u009b 6\u00ff'\u00c1\b\u00aav\u0007\u0098\u008bi\u00a3\u00bd\u0002\u001d%\u00a3\u0096\u0013\u00b0\u0098m\u00b8\u008d\u00e48\u0087\u00d1\u0097\u00df\u00942";
                var8_6 = "\u00e8\u0081F3[\u00f7.8\u0092\r\u00d4`\n\u00d0F\u00a9R\u00ce\u00d8z\b\u00af~\u00e2(\u00e4R1\u008c\u00bc\u00dc:\u0002\u000e3\u0081\u00ca\u00f9(\u00ec\u00e6\u00b6\u00b0Vb\u00a5\u00f9h|\u000e#g\u0012u\u009ey\u0013\u00b4\u00ba\u00c7\u0011h\u00a3\u00aa\u009b 6\u00ff'\u00c1\b\u00aav\u0007\u0098\u008bi\u00a3\u00bd\u0002\u001d%\u00a3\u0096\u0013\u00b0\u0098m\u00b8\u008d\u00e48\u0087\u00d1\u0097\u00df\u00942".length();
                var5_7 = 24;
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
                    var9_3[var7_4++] = CP_TH.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\\d\u00d9\u00c6\u00e3\u00a7n\u00cbE\u0010\u00fa\u001f\u001c\u00caAa)\u000b\u001d  \u009eNh\u00d1\u00c7\u00e4\u0004\u00e5vRf4u^\u0000\u00f6\u00adkh\u0000\u00d1{\u0086\u0098\r\u00ec\u00eb\u00c4DT\u0083\u00be'\t]v1\u00ecT\u00a3+b\u00fa\u0015&\u0082\u00e9\u00f0\u00f8\u0081\u00b6F|\u00c1!\u00f9w\u00b5=\u0018\u00cb\u00e5\"=\u00aa\u00b5\u008b\u0001$\f\u0018[\u009b\u00b8\u00a4\u00d4\u000f2C\u00d6e(oN";
                    var8_6 = "\\d\u00d9\u00c6\u00e3\u00a7n\u00cbE\u0010\u00fa\u001f\u001c\u00caAa)\u000b\u001d  \u009eNh\u00d1\u00c7\u00e4\u0004\u00e5vRf4u^\u0000\u00f6\u00adkh\u0000\u00d1{\u0086\u0098\r\u00ec\u00eb\u00c4DT\u0083\u00be'\t]v1\u00ecT\u00a3+b\u00fa\u0015&\u0082\u00e9\u00f0\u00f8\u0081\u00b6F|\u00c1!\u00f9w\u00b5=\u0018\u00cb\u00e5\"=\u00aa\u00b5\u008b\u0001$\f\u0018[\u009b\u00b8\u00a4\u00d4\u000f2C\u00d6e(oN".length();
                    var5_7 = 80;
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
                    var9_3[var7_4++] = CP_TH.a(var10_9).intern();
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
        CP_TH.b = var9_3;
        CP_TH.c = new String[5];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2DC3;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_TH", exception);
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
            CP_TH.c[n2] = CP_TH.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_TH.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_TH" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_TH.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
