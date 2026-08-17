/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.plugin.java.JavaPlugin
 */
package me.nik.coffeeprotect;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Paths;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlCb;
import me.nik.coffeeprotect.IlIlCf;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.plugin.java.JavaPlugin;

public class IlIlxh {
    private final JavaPlugin IlIlq;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String xIodtJCGan = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlxh(JavaPlugin javaPlugin) {
        this.IlIlq = javaPlugin;
    }

    /*
     * Loose catch block
     */
    public IlIlCb IlIlt(File file) {
        IlIlCb ilIlCb;
        block13: {
            boolean bl;
            int[] nArray;
            block11: {
                block12: {
                    long l = a ^ 0x141F3B6A5753L;
                    nArray = IlIlCf.IlIlG();
                    bl = this.IlIlq.getDataFolder().exists();
                    if (nArray != null) break block11;
                    try {
                        block14: {
                            if (bl) break block12;
                            break block14;
                            catch (IOException iOException) {
                                throw IlIlxh.a(iOException);
                            }
                        }
                        this.IlIlq.getDataFolder().mkdir();
                    }
                    catch (IOException iOException) {
                        throw IlIlxh.a(iOException);
                    }
                }
                bl = file.exists();
            }
            try {
                if (nArray != null) break block13;
                if (bl) break block13;
            }
            catch (IOException iOException) {
                throw IlIlxh.a(iOException);
            }
            try {
                bl = file.createNewFile();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        try {
            ilIlCb = new IlIlCb(this.IlIlD(file), file, this.IlIlG(file), this.IlIlq);
            if (PacketWrapper.IlIlz() == null) {
                IlIlCf.IlIlS(new int[2]);
            }
        }
        catch (IOException iOException) {
            throw IlIlxh.a(iOException);
        }
        return ilIlCb;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public Reader IlIlD(File var1_1) {
        block13: {
            var2_2 = IlIlxh.a ^ 88624853926022L;
            var4_3 = IlIlCf.IlIlG();
            v0 = var1_1.exists();
            if (var4_3 != null) ** GOTO lbl18
            try {
                block17: {
                    if (v0 != 0) break block13;
                    break block17;
                    catch (IOException v1) {
                        throw IlIlxh.a(v1);
                    }
                }
                return new InputStreamReader(new ByteArrayInputStream(new byte[0]));
            }
            catch (IOException v2) {
                throw IlIlxh.a(v2);
            }
        }
        try {
            block14: {
                v0 = 0;
lbl18:
                // 2 sources

                var5_4 = v0;
                var6_6 = this.IlIlr();
                var7_7 = new StringBuilder();
                var8_8 = Files.newBufferedReader(Paths.get(var1_1.getAbsolutePath(), new String[0]), StandardCharsets.UTF_8);
                while ((var9_9 = var8_8.readLine()) != null) {
                    block16: {
                        block15: {
                            block18: {
                                v3 = var9_9.trim();
                                if (var4_3 != null) break block14;
                                if (var4_3 != null) break block15;
                                break block18;
                                catch (IOException v4) {
                                    throw IlIlxh.a(v4);
                                }
                            }
                            try {
                                block19: {
                                    if (!v3.startsWith("#")) break block16;
                                    break block19;
                                    catch (IOException v5) {
                                        throw IlIlxh.a(v5);
                                    }
                                }
                                v6 = var9_9.replaceAll(Pattern.quote("'"), Matcher.quoteReplacement((String)IlIlxh.a("z", (int)3977, (long)(7481863483928329800L ^ var2_2)))).replaceFirst("#", var6_6 + (String)IlIlxh.a("z", (int)22384, (long)(2779672976256951986L ^ var2_2)) + var5_4++ + (String)IlIlxh.a("z", (int)6335, (long)(2540950862807411064L ^ var2_2))) + "'";
                            }
                            catch (IOException v7) {
                                throw IlIlxh.a(v7);
                            }
                        }
                        var10_10 = v6;
                        var7_7.append(var10_10).append("\n");
                        if (var4_3 == null) continue;
                    }
                    var7_7.append(var9_9).append("\n");
                    if (var4_3 == null) continue;
                }
                v3 = var7_7.toString();
            }
            var10_10 = v3;
            var11_11 = new StringReader(var10_10);
            var8_8.close();
            return var11_11;
        }
        catch (IOException var5_5) {
            var5_5.printStackTrace();
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private int IlIlG(File var1_1) {
        block10: {
            var2_2 = IlIlxh.a ^ 65680356353570L;
            var4_3 = IlIlCf.IlIlG();
            v0 = var1_1.exists();
            if (var4_3 != null) ** GOTO lbl18
            try {
                block12: {
                    if (v0 != 0) break block10;
                    break block12;
                    catch (IOException v1) {
                        throw IlIlxh.a(v1);
                    }
                }
                return 0;
            }
            catch (IOException v2) {
                throw IlIlxh.a(v2);
            }
        }
        try {
            block11: {
                v0 = 0;
lbl18:
                // 2 sources

                var5_4 = v0;
                var7_6 = Files.newBufferedReader(Paths.get(var1_1.getAbsolutePath(), new String[0]), StandardCharsets.UTF_8);
                block8: while (true) {
                    v3 = var7_6.readLine();
                    v4 = v3;
                    v5 = v3;
                    do {
                        var6_7 = v4;
                        if (v5 == null) break block8;
                        v5 = var6_7.trim();
                        v4 = "#";
                    } while (var4_3 != null);
                    try {
                        v6 = (int)v5.startsWith(v4);
                        if (var4_3 != null) break block11;
                        if (v6 == 0) continue;
                    }
                    catch (IOException v7) {
                        throw IlIlxh.a(v7);
                    }
                    ++var5_4;
                    if (var4_3 != null) break;
                }
                var7_6.close();
                v6 = var5_4;
            }
            return v6;
        }
        catch (IOException var5_5) {
            var5_5.printStackTrace();
            return 0;
        }
    }

    private String IlIlg(String string) {
        String string2;
        block5: {
            long l = a ^ 0x35BC4FCC90E7L;
            boolean bl = false;
            String[] stringArray = string.split("\n");
            int[] nArray = IlIlCf.IlIlG();
            StringBuilder stringBuilder = new StringBuilder();
            for (String string3 : stringArray) {
                boolean bl2;
                block6: {
                    block7: {
                        block13: {
                            String string4;
                            block12: {
                                block11: {
                                    block10: {
                                        String string5;
                                        block8: {
                                            String string6;
                                            block9: {
                                                string2 = string3.trim();
                                                if (nArray != null) break block5;
                                                bl2 = string2.startsWith(this.IlIlr() + (String)((Object)IlIlxh.a("z", (int)14705, (long)(0x515BF3A7BFA0D8D0L ^ l))));
                                                if (nArray != null) break block6;
                                                if (!bl2) break block7;
                                                int n = string3.indexOf(string3.trim());
                                                string6 = string3.substring(0, n) + "#" + string3.substring(string3.indexOf(":") + 3, string3.length() - 1);
                                                string5 = string6.trim();
                                                if (nArray != null) break block8;
                                                if (!string5.startsWith((String)((Object)IlIlxh.a("z", (int)27746, (long)(0x1BFDD2F66E70DC5L ^ l))))) break block9;
                                                string4 = string6.substring(0, string6.length() - 1).replaceFirst((String)((Object)IlIlxh.a("z", (int)3734, (long)(0x1BAE58D3F130EF3AL ^ l))), (String)((Object)IlIlxh.a("z", (int)28630, (long)(0x5CF9A0D5596F0E74L ^ l))));
                                                if (nArray == null) break block10;
                                            }
                                            string5 = string6;
                                        }
                                        string4 = string5;
                                    }
                                    string4 = string4.replaceAll((String)((Object)IlIlxh.a("z", (int)24174, (long)(0xF1878B856363FCBL ^ l))), "'");
                                    if (nArray != null) break block11;
                                    if (bl) break block12;
                                    stringBuilder.append(string4).append("\n");
                                }
                                if (nArray == null) break block13;
                            }
                            stringBuilder.append("\n").append(string4).append("\n");
                        }
                        bl = false;
                        if (nArray == null) continue;
                    }
                    stringBuilder.append(string3).append("\n");
                    bl2 = true;
                }
                bl = bl2;
                if (nArray == null) continue;
            }
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void IlIlJ(String var1_1, File var2_2, boolean var3_3) {
        block81: {
            var4_4 = IlIlxh.a ^ 72714855171807L;
            var7_5 = this.IlIlg(var1_1).replaceAll((String)IlIlxh.a("z", (int)7075, (long)(7802551719430859839L ^ var4_4)), "\n");
            var6_6 = IlIlCf.IlIlG();
            var8_7 = new StringBuilder();
            var9_8 = new Scanner(var7_5);
            try {
                var10_10 = 0;
                var11_13 = -1;
                var12_16 = -1;
                var13_17 = 0;
                while (var9_8.hasNextLine()) {
                    block72: {
                        block73: {
                            block79: {
                                block75: {
                                    block76: {
                                        block97: {
                                            block78: {
                                                block94: {
                                                    block95: {
                                                        block77: {
                                                            block92: {
                                                                block74: {
                                                                    block90: {
                                                                        block89: {
                                                                            block88: {
                                                                                block87: {
                                                                                    block86: {
                                                                                        block85: {
                                                                                            block84: {
                                                                                                block71: {
                                                                                                    block70: {
                                                                                                        block69: {
                                                                                                            var14_18 = var9_8.nextLine();
                                                                                                            var15_19 = 0;
                                                                                                            var16_20 = 0;
                                                                                                            var17_21 = -1;
                                                                                                            var18_22 = var14_18.indexOf(var14_18.trim());
                                                                                                            v0 = var14_18.trim();
                                                                                                            if (var6_6 != null) ** GOTO lbl226
                                                                                                            try {
                                                                                                                block83: {
                                                                                                                    v1 = v0.startsWith("#");
                                                                                                                    if (var6_6 != null) break block69;
                                                                                                                    break block83;
                                                                                                                    catch (Throwable v2) {
                                                                                                                        throw IlIlxh.a(v2);
                                                                                                                    }
                                                                                                                }
                                                                                                                if (v1 != 0) {
                                                                                                                }
                                                                                                                ** GOTO lbl37
                                                                                                            }
                                                                                                            catch (Throwable v3) {
                                                                                                                throw IlIlxh.a(v3);
                                                                                                            }
                                                                                                            var16_20 = 1;
                                                                                                            var19_23 = var14_18.trim().replaceFirst("#", "");
                                                                                                            var17_21 = var19_23.indexOf(var19_23.trim());
                                                                                                            try {
                                                                                                                if (var6_6 == null) break block70;
lbl37:
                                                                                                                // 2 sources

                                                                                                                v1 = var14_18.trim().isEmpty();
                                                                                                            }
                                                                                                            catch (Throwable v4) {
                                                                                                                throw IlIlxh.a(v4);
                                                                                                            }
                                                                                                        }
                                                                                                        try {
                                                                                                            if (var6_6 != null) break block71;
                                                                                                            if (v1 != 0) break block70;
                                                                                                        }
                                                                                                        catch (Throwable v5) {
                                                                                                            throw IlIlxh.a(v5);
                                                                                                        }
                                                                                                        var15_19 = 1;
                                                                                                        try {
                                                                                                            v1 = var14_18.trim().startsWith("-");
                                                                                                            if (var6_6 != null) break block71;
                                                                                                            if (v1 == 0) break block70;
                                                                                                        }
                                                                                                        catch (Throwable v6) {
                                                                                                            throw IlIlxh.a(v6);
                                                                                                        }
                                                                                                        var13_17 = 1;
                                                                                                    }
                                                                                                    v1 = var3_3;
                                                                                                }
                                                                                                if (var6_6 != null) break block72;
                                                                                                if (v1 != 0) break block73;
                                                                                                break block84;
                                                                                                catch (Throwable v7) {
                                                                                                    throw IlIlxh.a(v7);
                                                                                                }
                                                                                            }
                                                                                            v1 = var13_17;
                                                                                            if (var6_6 != null) break block72;
                                                                                            break block85;
                                                                                            catch (Throwable v8) {
                                                                                                throw IlIlxh.a(v8);
                                                                                            }
                                                                                        }
                                                                                        if (v1 != 0) break block73;
                                                                                        break block86;
                                                                                        catch (Throwable v9) {
                                                                                            throw IlIlxh.a(v9);
                                                                                        }
                                                                                    }
                                                                                    v1 = var12_16;
                                                                                    v10 = -1;
                                                                                    if (var6_6 != null) break block74;
                                                                                    break block87;
                                                                                    catch (Throwable v11) {
                                                                                        throw IlIlxh.a(v11);
                                                                                    }
                                                                                }
                                                                                if (v1 == v10) ** GOTO lbl107
                                                                                break block88;
                                                                                catch (Throwable v12) {
                                                                                    throw IlIlxh.a(v12);
                                                                                }
                                                                            }
                                                                            v1 = var18_22;
                                                                            if (var6_6 != null) break block75;
                                                                            break block89;
                                                                            catch (Throwable v13) {
                                                                                throw IlIlxh.a(v13);
                                                                            }
                                                                        }
                                                                        if (v1 != var12_16) break block76;
                                                                        break block90;
                                                                        catch (Throwable v14) {
                                                                            throw IlIlxh.a(v14);
                                                                        }
                                                                    }
                                                                    try {
                                                                        block91: {
                                                                            v1 = var17_21;
                                                                            if (var6_6 != null) break block77;
                                                                            break block91;
                                                                            catch (Throwable v15) {
                                                                                throw IlIlxh.a(v15);
                                                                            }
                                                                        }
                                                                        v10 = -1;
                                                                    }
                                                                    catch (Throwable v16) {
                                                                        throw IlIlxh.a(v16);
                                                                    }
                                                                }
                                                                if (v1 == v10) ** GOTO lbl134
                                                                v1 = var17_21;
                                                                if (var6_6 != null) break block75;
                                                                break block92;
                                                                catch (Throwable v17) {
                                                                    throw IlIlxh.a(v17);
                                                                }
                                                            }
                                                            try {
                                                                block93: {
                                                                    if (v1 < var11_13) break block76;
                                                                    break block93;
                                                                    catch (Throwable v18) {
                                                                        throw IlIlxh.a(v18);
                                                                    }
                                                                }
                                                                v1 = var10_10;
                                                            }
                                                            catch (Throwable v19) {
                                                                throw IlIlxh.a(v19);
                                                            }
                                                        }
                                                        if (var6_6 != null) break block78;
                                                        if (v1 == 0) break block94;
                                                        break block95;
                                                        catch (Throwable v20) {
                                                            throw IlIlxh.a(v20);
                                                        }
                                                    }
                                                    try {
                                                        block96: {
                                                            v1 = var15_19;
                                                            if (var6_6 != null) break block75;
                                                            break block96;
                                                            catch (Throwable v21) {
                                                                throw IlIlxh.a(v21);
                                                            }
                                                        }
                                                        if (v1 != 0) break block76;
                                                    }
                                                    catch (Throwable v22) {
                                                        throw IlIlxh.a(v22);
                                                    }
                                                }
                                                v1 = var16_20;
                                            }
                                            if (var6_6 != null) break block72;
                                            if (v1 == 0) break block73;
                                            break block97;
                                            catch (Throwable v23) {
                                                throw IlIlxh.a(v23);
                                            }
                                        }
                                        try {
                                            block98: {
                                                v1 = var10_10;
                                                if (var6_6 != null) break block72;
                                                break block98;
                                                catch (Throwable v24) {
                                                    throw IlIlxh.a(v24);
                                                }
                                            }
                                            if (v1 == 0) break block73;
                                        }
                                        catch (Throwable v25) {
                                            throw IlIlxh.a(v25);
                                        }
                                    }
                                    v1 = var10_10;
                                }
                                try {
                                    if (var6_6 != null) break block79;
                                    if (v1 != 0) {
                                    }
                                    ** GOTO lbl200
                                }
                                catch (Throwable v26) {
                                    throw IlIlxh.a(v26);
                                }
                                v1 = var16_20;
                            }
                            if (var6_6 != null) break block72;
                            try {
                                block99: {
                                    if (v1 == 0) break block73;
                                    break block99;
                                    catch (Throwable v27) {
                                        throw IlIlxh.a(v27);
                                    }
                                }
                                var8_7.append((char)IlIlxh.b("f", (int)1093, (long)(1397348897931864419L ^ var4_4)));
                            }
                            catch (Throwable v28) {
                                throw IlIlxh.a(v28);
                            }
                        }
                        var8_7.append(var14_18).append((char)IlIlxh.b("f", (int)11205, (long)(4297167001425381090L ^ var4_4)));
                        var10_10 = var15_19;
                        var11_13 = var17_21;
                        var12_16 = var18_22;
                        v1 = var13_17 = 0;
                    }
                    if (var6_6 == null) continue;
                }
                var9_8.close();
            }
            catch (Throwable var10_11) {
                try {
                    var9_8.close();
                }
                catch (Throwable var11_14) {
                    var10_11.addSuppressed(var11_14);
                }
                throw var10_11;
            }
            try {
                block80: {
                    v0 = var2_2.getAbsolutePath();
lbl226:
                    // 2 sources

                    var9_8 = Files.newBufferedWriter(Paths.get(v0, new String[0]), StandardCharsets.UTF_8, new OpenOption[0]);
                    try {
                        var9_8.write(var8_7.toString());
                        var9_8.flush();
                        v29 = var9_8;
                        if (var6_6 != null) break block80;
                    }
                    catch (Throwable var10_12) {
                        block82: {
                            try {
                                v30 = var9_8;
                                if (var6_6 == null) {
                                    if (v30 == null) break block82;
                                }
                                ** GOTO lbl243
                            }
                            catch (Throwable v31) {
                                throw IlIlxh.a(v31);
                            }
                            try {
                                v30 = var9_8;
lbl243:
                                // 2 sources

                                v30.close();
                            }
                            catch (Throwable var11_15) {
                                var10_12.addSuppressed(var11_15);
                            }
                        }
                        throw var10_12;
                    }
                    if (v29 == null) break block81;
                    v29 = var9_8;
                }
                v29.close();
            }
            catch (IOException var9_9) {
                var9_9.printStackTrace();
            }
        }
    }

    public String IlIlr() {
        return this.IlIlq.getDescription().getName();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        IlIlxh.a = IlIls.a((long)4654341444940207980L, (long)-1338663462525659416L, MethodHandles.lookup().lookupClass()).a(40396180513134L);
                        IlIlxh.d = new HashMap<K, V>(13);
                        var11 = IlIlxh.a ^ 77166127758863L;
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
                        var20_3 = new String[9];
                        var18_4 = 0;
                        var17_5 = "\u0092\u00ca\u00d0\u001fM?\u00fe9\u000039\u0003\u00cd\u00efC\u00cb\u0010u\u00e1\u0093\u00ae\u008a\u00874\u0085[L\u00ba\u00a6\u0099Y(+\u0010FL\u00eb`@|D\u0095\u00f4\u00e28*\u00dc\u0096\u00dc\u00ac\u0010\u0097\u00e1{z\u00a2\u00a9\u007f\u000fB\u00b4Q\u0017;\u000e)\u001e\u0010N\u0001\u008d\u007fv\u00d77<1\u00f6\u0080\u00f5)]`\u00c4 9_[\u0099.\u00ce\u00d0\u00f0\u00a5\u00f1\u00f2R\u00cc\u0003\u00ff\u009dW/8\u00eezk\u0019<\u00f4/D\u00f94\u0012\u00f0\u00f3\u0010\u00b1K\u0006\u00f5\u00d5Q\u0001\u00a8\u007fr\u00ba\u0017s10q";
                        var19_6 = "\u0092\u00ca\u00d0\u001fM?\u00fe9\u000039\u0003\u00cd\u00efC\u00cb\u0010u\u00e1\u0093\u00ae\u008a\u00874\u0085[L\u00ba\u00a6\u0099Y(+\u0010FL\u00eb`@|D\u0095\u00f4\u00e28*\u00dc\u0096\u00dc\u00ac\u0010\u0097\u00e1{z\u00a2\u00a9\u007f\u000fB\u00b4Q\u0017;\u000e)\u001e\u0010N\u0001\u008d\u007fv\u00d77<1\u00f6\u0080\u00f5)]`\u00c4 9_[\u0099.\u00ce\u00d0\u00f0\u00a5\u00f1\u00f2R\u00cc\u0003\u00ff\u009dW/8\u00eezk\u0019<\u00f4/D\u00f94\u0012\u00f0\u00f3\u0010\u00b1K\u0006\u00f5\u00d5Q\u0001\u00a8\u007fr\u00ba\u0017s10q".length();
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
                            var20_3[var18_4++] = IlIlxh.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u008d\u0087\u00cf\u0084B\u0087AqM\u00f3^I\u00952\u00e6\u00fc\u0005\u00ec\u00dak\u008d\u00b14[t$\u00d3\u00e47,\u00f0\t\u00104'm7\"\u00d2I\r\u0091a.  \r\u0002\u00cd";
                            var19_6 = "\u008d\u0087\u00cf\u0084B\u0087AqM\u00f3^I\u00952\u00e6\u00fc\u0005\u00ec\u00dak\u008d\u00b14[t$\u00d3\u00e47,\u00f0\t\u00104'm7\"\u00d2I\r\u0091a.  \r\u0002\u00cd".length();
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
                            var20_3[var18_4++] = IlIlxh.a(var21_9).intern();
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
                IlIlxh.b = var20_3;
                IlIlxh.c = new String[9];
                IlIlxh.g = new HashMap<K, V>(13);
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
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u00ba^5;\u0090l\u00e4\"\u00c4\u00c1\u00d6\u00cbZ\u00ec\u00a2\t";
                var5_15 = "\u00ba^5;\u0090l\u00e4\"\u00c4\u00c1\u00d6\u00cbZ\u00ec\u00a2\t".length();
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
        IlIlxh.e = var6_12;
        IlIlxh.f = new Integer[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x711C;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlxh", exception);
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
            IlIlxh.c[n2] = IlIlxh.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlxh.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlxh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6BA6;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlxh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlxh.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlxh.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlxh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlxh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlxh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

