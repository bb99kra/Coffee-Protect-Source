/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.plugin.Plugin
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

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
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.CP_jv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.CP_hl;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Bukkit;
import org.bukkit.plugin.Plugin;

public class CP_np
implements CP_jv {
    private ServerVersion CP_i;
    private static String[] CP_w;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String NFTPGeToCN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private ServerVersion CP_q() {
        ServerVersion serverVersion;
        block8: {
            String string;
            String string2;
            String[] stringArray;
            Plugin plugin;
            block10: {
                block9: {
                    long l = a ^ 0x248B7ECB3042L;
                    plugin = (Plugin)CP_r7.CP_b().CP_j();
                    stringArray = CP_np.CP_R();
                    string2 = Bukkit.getBukkitVersion();
                    serverVersion = ServerVersion.V_1_8_8;
                    string = (String)((Object)CP_np.a("z", (int)29394, (long)(0x70A3401D529A8328L ^ l))) + Bukkit.getBukkitVersion() + (String)((Object)CP_np.a("z", (int)8897, (long)(0x50D8A7177DBB5339L ^ l))) + serverVersion.name() + (String)((Object)CP_np.a("z", (int)20110, (long)(0x348DF65A7BE2BF75L ^ l)));
                    if (stringArray == null) break block9;
                    if (!string2.contains((CharSequence)((Object)CP_np.a("z", (int)24464, (long)(0x5D844D49E2AFAE69L ^ l))))) break block10;
                    plugin.getLogger().warning(string);
                }
                return serverVersion;
            }
            ServerVersion[] serverVersionArray = ServerVersion.CP_s();
            int n = serverVersionArray.length;
            int n2 = 0;
            while (n2 < n) {
                ServerVersion serverVersion2 = serverVersionArray[n2];
                if (stringArray != null) {
                    if (stringArray != null) {
                        if (string2.contains(serverVersion2.CP_z())) {
                            return serverVersion2;
                        }
                        ++n2;
                    }
                    if (stringArray != null) continue;
                }
                break block8;
            }
            plugin.getLogger().warning(string);
        }
        return serverVersion;
    }

    @Override
    public ServerVersion CP_F() {
        long l = a ^ 0x7BD41711E87L;
        String[] stringArray = CP_np.CP_R();
        ServerVersion serverVersion = this.CP_i;
        if (stringArray != null) {
            if (serverVersion == null) {
                this.CP_i = this.CP_q();
            }
            serverVersion = this.CP_i;
        }
        return serverVersion;
    }

    @Override
    public Object CP_P(CP_G2 ilIlG2, ClientVersion clientVersion) {
        return CP_hl.CP_p(ilIlG2, clientVersion);
    }

    public static void CP_Z(String[] stringArray) {
        CP_w = stringArray;
    }

    public static String[] CP_R() {
        return CP_w;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_np.a = CP_s.a(-2953653242418560172L, 204699444736102468L, MethodHandles.lookup().lookupClass()).a(217156356981501L);
                CP_np.d = new HashMap<K, V>(13);
                var0 = CP_np.a ^ 28741886090023L;
                CP_np.CP_Z(new String[3]);
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u0084\u0098>\u00a0M\u00a1\u00faRvk7\u00c2\u00b1\u00d41\u008b\u00c6T_\u00c7\u0015\u00dbk\u00cf\u00df\u00b1\u0082\u00e9\u00d4\u00e52\u00c8\u0086u\u00da{^\u00f2\u00db\u00a1\u0092\u001csH\u00c2F\u00bd\u00fd\u009f@]\u00a1\u00a1\u0002J\u00e024;\u00cc{Uq\u00acu \u00efe\u00f3FaW\u000b}\u008d\u00b5~\u0002\u00c0;.(6\u00cc\u00afd\u0093[\u00b5\u0088\u00b66\u0082qR\u0019\u00ee\u00c8PzL0\u00fa\u0018=y]\u00b8W\\i\u00943\u00d3\u0014\u00a4\u00f0\u00ceI\u007f\u00b6\u00196]\u00abi\u00d2G\u00b0\u009f\u00b6&\u00a7\u00b2\t\u00c9\u00bc\u00f8\u0016\u00c2\u001c\u00ea\u0016\u00d9T\u00e2\u009ah*o\u007f\u0081\u0087\u00ebQ\u009fAM\u00ec\u009b\u00f2\u00e9+}\u001f\\\u00ba\u00b4Y<\u00ef\u00e7\u0092\u00bf7=pf\u008al_\r\u00d0\u00caZ\u00fd\u00d7\\\u00ca\u00d7\u00bf4x\u00e7WR\u0014\u00dcB\u00d2&\u0093\u008e+%cJ\u00d0RPS\u00bb\u00e3\u0013#{\u0019\u0084\u00ef95\u0013\u00cd\u00d2\u008b8\\\u00ab\u00b1\u001e\u00b1\u0004\u00af4\u00b4\u0019@\u0081\u0019\u000e\u001e\u00b4}\u0091\u00b3D\u00be^\u00ac\u00b4\u00a5\u009d69\u00ce\u00f2]^\u00f6\u00d7\u00d1l\u0003\u0096\u0007\u00c5rTt\u0017\u00f2\u00c9\u00c3\f\u00fdG\f\u0099D\u0005\u00d6a\u00d1\u00b9\u00eep\u00a8\u000f]\u008d\u00d4+/(\u00bd\u00ba`\u00c8\u00fe['\u0095N\u00f4\u00fb";
                var8_6 = "\u0084\u0098>\u00a0M\u00a1\u00faRvk7\u00c2\u00b1\u00d41\u008b\u00c6T_\u00c7\u0015\u00dbk\u00cf\u00df\u00b1\u0082\u00e9\u00d4\u00e52\u00c8\u0086u\u00da{^\u00f2\u00db\u00a1\u0092\u001csH\u00c2F\u00bd\u00fd\u009f@]\u00a1\u00a1\u0002J\u00e024;\u00cc{Uq\u00acu \u00efe\u00f3FaW\u000b}\u008d\u00b5~\u0002\u00c0;.(6\u00cc\u00afd\u0093[\u00b5\u0088\u00b66\u0082qR\u0019\u00ee\u00c8PzL0\u00fa\u0018=y]\u00b8W\\i\u00943\u00d3\u0014\u00a4\u00f0\u00ceI\u007f\u00b6\u00196]\u00abi\u00d2G\u00b0\u009f\u00b6&\u00a7\u00b2\t\u00c9\u00bc\u00f8\u0016\u00c2\u001c\u00ea\u0016\u00d9T\u00e2\u009ah*o\u007f\u0081\u0087\u00ebQ\u009fAM\u00ec\u009b\u00f2\u00e9+}\u001f\\\u00ba\u00b4Y<\u00ef\u00e7\u0092\u00bf7=pf\u008al_\r\u00d0\u00caZ\u00fd\u00d7\\\u00ca\u00d7\u00bf4x\u00e7WR\u0014\u00dcB\u00d2&\u0093\u008e+%cJ\u00d0RPS\u00bb\u00e3\u0013#{\u0019\u0084\u00ef95\u0013\u00cd\u00d2\u008b8\\\u00ab\u00b1\u001e\u00b1\u0004\u00af4\u00b4\u0019@\u0081\u0019\u000e\u001e\u00b4}\u0091\u00b3D\u00be^\u00ac\u00b4\u00a5\u009d69\u00ce\u00f2]^\u00f6\u00d7\u00d1l\u0003\u0096\u0007\u00c5rTt\u0017\u00f2\u00c9\u00c3\f\u00fdG\f\u0099D\u0005\u00d6a\u00d1\u00b9\u00eep\u00a8\u000f]\u008d\u00d4+/(\u00bd\u00ba`\u00c8\u00fe['\u0095N\u00f4\u00fb".length();
                var5_7 = 128;
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
                    var9_3[var7_4++] = CP_np.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "C\u0087\u0003w\u00c0\u00a9^\u00d6K\u009bd\u008a\u001e\u00f8\u00e6\u00c3@\u00e1\u00f1`\u00b8t\u00d1\u000f\u0091\u00a7\u0082g\u00cf])\u0082L\u00ff\u00b1\u00d2oW\u00d1\u000e\u00ab\u009c\u00b9`i\u00b1\u00e3\u0099\u00e6\u00c9\u00a3\u00b7U\u00fc\u00a3\u00aby\u00c7I\u00e6/\u00ab\u0002\u00c1\u00df\u001f.0\u009a\u00af\u00fb\u00ab@ \u00b3R\u008bC\u00b6Lw";
                    var8_6 = "C\u0087\u0003w\u00c0\u00a9^\u00d6K\u009bd\u008a\u001e\u00f8\u00e6\u00c3@\u00e1\u00f1`\u00b8t\u00d1\u000f\u0091\u00a7\u0082g\u00cf])\u0082L\u00ff\u00b1\u00d2oW\u00d1\u000e\u00ab\u009c\u00b9`i\u00b1\u00e3\u0099\u00e6\u00c9\u00a3\u00b7U\u00fc\u00a3\u00aby\u00c7I\u00e6/\u00ab\u0002\u00c1\u00df\u001f.0\u009a\u00af\u00fb\u00ab@ \u00b3R\u008bC\u00b6Lw".length();
                    var5_7 = 16;
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
                    var9_3[var7_4++] = CP_np.a(var10_9).intern();
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
        CP_np.b = var9_3;
        CP_np.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x602E;
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
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_np", exception);
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
            CP_np.c[n2] = CP_np.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_np.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_np" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_np.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

