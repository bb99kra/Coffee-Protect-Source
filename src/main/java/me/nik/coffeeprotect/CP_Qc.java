/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.command.Command
 *  org.bukkit.command.CommandSender
 *  org.bukkit.command.ConsoleCommandSender
 *  org.bukkit.command.TabExecutor
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_jK;
import me.nik.coffeeprotect.CP_jL;
import me.nik.coffeeprotect.CP_jS;
import me.nik.coffeeprotect.CP_jX;
import me.nik.coffeeprotect.CP_jb;
import me.nik.coffeeprotect.CP_jf;
import me.nik.coffeeprotect.CP_jk;
import me.nik.coffeeprotect.CP_jr;
import me.nik.coffeeprotect.CP_ju;
import me.nik.coffeeprotect.CP_jy;
import me.nik.coffeeprotect.CP_jz;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_xi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.command.ConsoleCommandSender;
import org.bukkit.command.TabExecutor;

public class CP_Qc
implements TabExecutor {
    private static final String CP_H;
    private final List<CP_ju> CP_x;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String PLmesSqIVo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Qc(CoffeeProtect coffeeProtect) {
        long l = a ^ 0x628ED0908558L;
        this.CP_x = new ArrayList<CP_ju>();
        this.CP_x.add(new CP_jk(coffeeProtect));
        this.CP_x.add(new CP_jb(coffeeProtect));
        this.CP_x.add(new CP_jz(coffeeProtect));
        this.CP_x.add(new CP_jS(coffeeProtect));
        this.CP_x.add(new CP_jK(coffeeProtect));
        this.CP_x.add(new CP_jX(coffeeProtect));
        PacketWrapper[] packetWrapperArray = CP_ju.CP_C();
        this.CP_x.add(new CP_jL(coffeeProtect));
        this.CP_x.add(new CP_jf(coffeeProtect));
        PacketWrapper[] packetWrapperArray2 = packetWrapperArray;
        this.CP_x.add(new CP_jy());
        this.CP_x.add(new CP_jr());
        if (packetWrapperArray2 != null) {
            PacketWrapper.CP_e(new int[3]);
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public boolean onCommand(@NotNull CommandSender var1_1, @NotNull Command var2_2, @NotNull String var3_3, String[] var4_4) {
        block20: {
            block25: {
                block21: {
                    block22: {
                        var5_5 = CP_Qc.a ^ 136867715781091L;
                        var7_6 = CP_ju.CP_C();
                        v0 = var4_4.length;
                        if (var7_6 != null) break block21;
                        if (v0 <= false) break block22;
                        for (CP_ju var9_8 : this.CP_x) {
                            block24: {
                                block23: {
                                    v1 = var4_4[0].equalsIgnoreCase(var9_8.CP_C());
                                    if (var7_6 != null) break block20;
                                    if (var7_6 == null) {
                                        if (v1) {
                                            v2 = var9_8.CP_r();
                                            if (var7_6 == null) {
                                                if (v2 == 0) {
                                                    v2 = var1_1 instanceof ConsoleCommandSender;
                                                    if (var7_6 == null) {
                                                        if (v2 != 0) {
                                                            var1_1.sendMessage(CP_xi.CONSOLE_COMMANDS.CP_F());
                                                            return true;
                                                        } else {
                                                            ** GOTO lbl-1000
                                                        }
                                                    }
                                                } else lbl-1000:
                                                // 3 sources

                                                {
                                                    v2 = var1_1.hasPermission(var9_8.CP_a());
                                                }
                                            }
                                            if (var7_6 == null) {
                                                if (v2 == 0) {
                                                    var1_1.sendMessage(CP_xi.NO_PERMISSION.CP_F());
                                                    return true;
                                                }
                                                v2 = var4_4.length;
                                            }
                                            if (var7_6 == null) {
                                                if (v2 < var9_8.CP_X()) {
                                                    this.CP_D(var1_1);
                                                    return true;
                                                }
                                                var9_8.CP_M(var1_1, var4_4);
                                                v2 = 1;
                                            }
                                            return (boolean)v2;
                                        }
                                        v3 = var4_4[0].equalsIgnoreCase((String)CP_Qc.a("u", (int)29400, (long)(2621145753991242445L ^ var5_5)));
                                    }
                                    if (var7_6 != null) break block23;
                                    if (!v3) break block24;
                                    this.CP_D(var1_1);
                                    v3 = true;
                                }
                                return v3;
                            }
                            if (var7_6 == null) continue;
                        }
                        if (var7_6 == null) break block25;
                    }
                    var1_1.sendMessage(CP_Qc.CP_H);
                    v0 = true;
                }
                return v0;
            }
            this.CP_D(var1_1);
            v1 = true;
        }
        return v1;
    }

    public List<String> onTabComplete(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String string, String[] stringArray) {
        PacketWrapper[] packetWrapperArray;
        block7: {
            Object object;
            block6: {
                long l = a ^ 0x664FC3BF16BEL;
                packetWrapperArray = CP_ju.CP_C();
                object = stringArray;
                if (packetWrapperArray != null) break block6;
                if (((String[])object).length >= 2) break block7;
                object = this.CP_x.stream().map(CP_ju::CP_C).collect(Collectors.toList());
            }
            return (List)object;
        }
        for (CP_ju ilIlju : this.CP_x) {
            if (stringArray[0].equalsIgnoreCase(ilIlju.CP_C())) {
                return ilIlju.CP_b(commandSender, stringArray);
            }
            if (packetWrapperArray == null) continue;
        }
        if (PacketWrapper.CP_z() == null) {
            CP_ju.CP_y(new PacketWrapper[4]);
        }
        return null;
    }

    private void CP_D(CommandSender commandSender) {
        long l = a ^ 0x7EFC342DD325L;
        commandSender.sendMessage("");
        commandSender.sendMessage(CP_xi.PREFIX.CP_F() + ChatColor.WHITE + (String)((Object)CP_Qc.a("u", (int)16249, (long)(0x50C4FD2A234EEDA9L ^ l))));
        commandSender.sendMessage("");
        this.CP_x.stream().filter(ilIlju -> commandSender.hasPermission(ilIlju.CP_a())).forEach(ilIlju -> {
            long l = a ^ 0x110098822227L;
            commandSender.sendMessage(ChatColor.GOLD + ilIlju.CP_d() + ChatColor.DARK_GRAY + (String)((Object)CP_Qc.a("u", (int)2884, (long)(0x63B930382EE92893L ^ l))) + ChatColor.GRAY + ilIlju.CP_V());
        });
        commandSender.sendMessage("");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_Qc.a = CP_s.a(-2978625023409676848L, -7770811293078628804L, MethodHandles.lookup().lookupClass()).a(168001311632212L);
                var9 = CP_Qc.a ^ 21733102938272L;
                CP_Qc.d = new HashMap<K, V>(13);
                var0_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var1_2 = 1; var1_2 < 8; ++var1_2) {
                    v2 = v2;
                    v2[var1_2] = (byte)(var9 << var1_2 * 8 >>> 56);
                }
                var0_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var7_3 = new String[6];
                var5_4 = 0;
                var4_5 = "\u0099\u001a8\u00b7\u00cb\rH\u0017z\u00d4\u00fe\u00a7`\u00f6\u00ab\u00a4@\u009b\u00bf+0,\u00c7\u0003H\u0099\u00ed\u00da\u00f0\u001b\u00b1\u0012\u00f1\u00e4\u009f\"^\t\u00b1\u00f505e:\u00f8\u00c7\u00cdx\u0088\u00fb\t\u00aa\u00b7r\u00ec3(FK\u00d3\u009c\rOmA\u0080\u00e5\u0087\u009b6\u001b\u00f1\nn\u001d/\u0013\u00da\"\u00cfG\u00d7\u00bb\u00abB\u0012\u0085E\u00ed\u008e\u00ea\u00a2\u00a9D\u009c\u008f\r\u0010\u00cf\u0006\u00a8\u00dc9J\u0002\u00c8\u000e\u00e6C\u008e\u00fa\u00bb\u00bb\u0095\u0018C\u001a\u00b96\u00df4\u00eeSs\u00e6\u00d1V&\u0004\u008b\u00da\u00cc\u00a4\u00f5\u008e\u00a1\"\u008bq";
                var6_6 = "\u0099\u001a8\u00b7\u00cb\rH\u0017z\u00d4\u00fe\u00a7`\u00f6\u00ab\u00a4@\u009b\u00bf+0,\u00c7\u0003H\u0099\u00ed\u00da\u00f0\u001b\u00b1\u0012\u00f1\u00e4\u009f\"^\t\u00b1\u00f505e:\u00f8\u00c7\u00cdx\u0088\u00fb\t\u00aa\u00b7r\u00ec3(FK\u00d3\u009c\rOmA\u0080\u00e5\u0087\u009b6\u001b\u00f1\nn\u001d/\u0013\u00da\"\u00cfG\u00d7\u00bb\u00abB\u0012\u0085E\u00ed\u008e\u00ea\u00a2\u00a9D\u009c\u008f\r\u0010\u00cf\u0006\u00a8\u00dc9J\u0002\u00c8\u000e\u00e6C\u008e\u00fa\u00bb\u00bb\u0095\u0018C\u001a\u00b96\u00df4\u00eeSs\u00e6\u00d1V&\u0004\u008b\u00da\u00cc\u00a4\u00f5\u008e\u00a1\"\u008bq".length();
                var3_7 = 56;
                var2_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var2_8;
                    v4 = var4_5.substring(v3, v3 + var3_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = CP_Qc.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    var4_5 = "\u008a\u0094\u00d5\u00bb\u00df8i\u00e9K?\u0099\u001aD\u00df\u00f7\u00f4 \u00d4\u0015-\u00f4\u00b9g\u0084T\u0017\u00b3\u00dc\u00c4\u00ad\u00e7)\u00b8&\u00fbK\u000f\u0010\u00cb\u0017m\u001b>\u0015}\u00f6\u0098\u00bb\u00a9";
                    var6_6 = "\u008a\u0094\u00d5\u00bb\u00df8i\u00e9K?\u0099\u001aD\u00df\u00f7\u00f4 \u00d4\u0015-\u00f4\u00b9g\u0084T\u0017\u00b3\u00dc\u00c4\u00ad\u00e7)\u00b8&\u00fbK\u000f\u0010\u00cb\u0017m\u001b>\u0015}\u00f6\u0098\u00bb\u00a9".length();
                    var3_7 = 16;
                    var2_8 = -1;
lbl34:
                    // 2 sources

                    while (true) {
                        v6 = ++var2_8;
                        v4 = var4_5.substring(v6, v6 + var3_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    var7_3[var5_4++] = CP_Qc.a(var8_9).intern();
                    if ((var2_8 += var3_7) < var6_6) {
                        var3_7 = var4_5.charAt(var2_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var0_1.doFinal(v4.getBytes("ISO-8859-1"));
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
        CP_Qc.b = var7_3;
        CP_Qc.c = new String[6];
        CP_Qc.CP_H = CP_xi.PREFIX.CP_F() + CP_rW.CP_W((String)CP_Qc.a("u", (int)2823, (long)(6857380928080110163L ^ var9)) + CoffeeProtect.CP_J().getDescription().getName() + (String)CP_Qc.a("u", (int)23006, (long)(3892022918299431049L ^ var9)) + CoffeeProtect.CP_J().getDescription().getVersion() + (String)CP_Qc.a("u", (int)23851, (long)(5414837217229124730L ^ var9)));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x353E;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Qc", exception);
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
            CP_Qc.c[n2] = CP_Qc.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Qc.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Qc" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Qc.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
