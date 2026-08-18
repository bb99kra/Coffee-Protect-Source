/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.configuration.ConfigurationSection
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.plugin.java.JavaPlugin
 *  org.yaml.snakeyaml.DumperOptions
 */
package me.nik.coffeeprotect;

import java.io.File;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_Cf;
import me.nik.coffeeprotect.CP_xh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_l;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.yaml.snakeyaml.DumperOptions;

public class CP_Cb
extends CP_Cf {
    private int CP_B;
    private final CP_xh CP_M;
    private final File CP_y;
    private static final long b;
    private static final String[] f;
    private static final String[] g;
    private static final Map h;
    private static final long[] i;
    private static final Integer[] j;
    private static final Map k;
    private static transient /* synthetic */ String RSNXICsNjn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Cb(Reader reader, File file, int n, JavaPlugin javaPlugin) {
        long l = b ^ 0x398928A9FDE2L;
        int[] nArray = CP_Cf.CP_G();
        super((ConfigurationSection)YamlConfiguration.loadConfiguration((Reader)reader));
        this.CP_B = n;
        int[] nArray2 = nArray;
        try {
            this.CP_M = new CP_xh(javaPlugin);
            this.CP_y = file;
            if (nArray2 != null) {
                PacketWrapper.CP_e(new int[1]);
            }
        }
        catch (UnsupportedOperationException unsupportedOperationException) {
            throw CP_Cb.a(unsupportedOperationException);
        }
    }

    public static CP_Cb CP_m(JavaPlugin javaPlugin, File file) {
        return new CP_xh(javaPlugin).CP_t(file);
    }

    public void CP_W(String string, Object object, String ... stringArray) {
        block10: {
            String string2;
            CP_Cb ilIlCb;
            block8: {
                block9: {
                    String string3;
                    long l = b ^ 0x737B6A609862L;
                    int[] nArray = CP_Cf.CP_G();
                    try {
                        ilIlCb = this;
                        string2 = string;
                        if (nArray != null) break block8;
                        if (ilIlCb.contains(string2)) break block9;
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw CP_Cb.a(unsupportedOperationException);
                    }
                    int n = string.lastIndexOf((int)CP_Cb.c("b", (int)31092, (long)(0x377DC195973E25BFL ^ l)));
                    try {
                        string3 = n == -1 ? "" : string.substring(0, n) + (char)CP_Cb.c("b", (int)15211, (long)(0x44C5BCFDD4EEE7A2L ^ l));
                    }
                    catch (UnsupportedOperationException unsupportedOperationException) {
                        throw CP_Cb.a(unsupportedOperationException);
                    }
                    String string4 = string3;
                    for (String string5 : stringArray) {
                        try {
                            this.set(string4 + this.CP_M.CP_r() + (String)((Object)CP_Cb.b("j", (int)19806, (long)(0x50754AA8827EB019L ^ l))) + this.CP_B, " " + string5);
                            ++this.CP_B;
                            if (nArray == null) {
                                if (nArray == null) continue;
                                break;
                            }
                            break block10;
                        }
                        catch (UnsupportedOperationException unsupportedOperationException) {
                            throw CP_Cb.a(unsupportedOperationException);
                        }
                    }
                }
                ilIlCb = this;
                string2 = string;
            }
            ilIlCb.set(string2, object);
        }
    }

    public void CP_H(String ... stringArray) {
        long l = b ^ 0x4D944052F602L;
        String[] stringArray2 = stringArray;
        int[] nArray = CP_Cf.CP_G();
        for (String string : stringArray2) {
            this.set(this.CP_M.CP_r() + (String)((Object)CP_Cb.b("j", (int)253, (long)(0x70CD0979FD3013DCL ^ l))) + this.CP_B, " " + string);
            ++this.CP_B;
            if (nArray == null) continue;
        }
    }

    public void CP_H() {
        this.CP_t = YamlConfiguration.loadConfiguration((Reader)this.CP_M.CP_D(this.CP_y));
    }

    public void CP_R() {
        this.CP_Y(false);
    }

    public void CP_Y(boolean bl) {
        String string = this.CP_L();
        this.CP_M.CP_J(string, this.CP_y, bl);
    }

    public void CP_Q(File file) {
        this.CP_E(file, false);
    }

    public void CP_E(File file, boolean bl) {
        String string = this.CP_L();
        this.CP_M.CP_J(string, file, bl);
    }

    /*
     * Loose catch block
     */
    private String CP_L() {
        ConfigurationSection configurationSection;
        int[] nArray;
        long l;
        block19: {
            block20: {
                l = b ^ 0x6240DDB1C146L;
                nArray = CP_Cf.CP_G();
                configurationSection = this.CP_t;
                if (nArray != null) break block19;
                try {
                    block26: {
                        if (configurationSection instanceof YamlConfiguration) break block20;
                        break block26;
                        catch (NoSuchFieldException noSuchFieldException) {
                            throw CP_Cb.a(noSuchFieldException);
                        }
                    }
                    throw new UnsupportedOperationException((String)((Object)CP_Cb.b("j", (int)15832, (long)(0x27DFE0A8A9A199B8L ^ l))));
                }
                catch (NoSuchFieldException noSuchFieldException) {
                    throw CP_Cb.a(noSuchFieldException);
                }
            }
            configurationSection = this.CP_t;
        }
        YamlConfiguration yamlConfiguration = (YamlConfiguration)configurationSection;
        try {
            boolean bl;
            DumperOptions dumperOptions;
            block23: {
                block24: {
                    block21: {
                        block22: {
                            Field field;
                            try {
                                field = YamlConfiguration.class.getDeclaredField(CP_l.c(YamlConfiguration.class, (String)((Object)CP_Cb.b("j", (int)6332, (long)(0x6356117761293CDAL ^ l)))));
                            }
                            catch (NoSuchFieldException noSuchFieldException) {
                                field = YamlConfiguration.class.getDeclaredField((String)((Object)CP_Cb.b("j", (int)28342, (long)(0x42E42FDE2F25CAD2L ^ l))));
                            }
                            field.setAccessible(true);
                            dumperOptions = (DumperOptions)field.get(yamlConfiguration);
                            dumperOptions.setWidth((int)CP_Cb.c("b", (int)28854, (long)(0x594560F642717558L ^ l)));
                            bl = Stream.of(DumperOptions.class.getDeclaredMethods()).anyMatch(method -> {
                                long l = b ^ 0x70E891C59CB5L;
                                return method.getName().equals(CP_Cb.b("j", (int)13515, (long)(0x59F54D0809A8CD5FL ^ l)));
                            });
                            if (nArray != null) break block21;
                            try {
                                block27: {
                                    if (!bl) break block22;
                                    break block27;
                                    catch (NoSuchFieldException noSuchFieldException) {
                                        throw CP_Cb.a(noSuchFieldException);
                                    }
                                }
                                dumperOptions.setIndicatorIndent(2);
                            }
                            catch (NoSuchFieldException noSuchFieldException) {
                                throw CP_Cb.a(noSuchFieldException);
                            }
                        }
                        bl = Stream.of(DumperOptions.class.getDeclaredMethods()).anyMatch(method -> {
                            long l = b ^ 0x1B1AB4C9451CL;
                            return method.getName().equals(CP_Cb.b("j", (int)28873, (long)(0x2BCF0AA307F050F1L ^ l)));
                        });
                    }
                    if (nArray != null) break block23;
                    try {
                        block28: {
                            if (!bl) break block24;
                            break block28;
                            catch (NoSuchFieldException noSuchFieldException) {
                                throw CP_Cb.a(noSuchFieldException);
                            }
                        }
                        dumperOptions.setProcessComments(false);
                    }
                    catch (NoSuchFieldException noSuchFieldException) {
                        throw CP_Cb.a(noSuchFieldException);
                    }
                }
                bl = Stream.of(DumperOptions.class.getDeclaredMethods()).anyMatch(method -> {
                    long l = b ^ 0x49C6E2DBBDA8L;
                    return method.getName().equals(CP_Cb.b("j", (int)3090, (long)(0x7B7D61112DFB549DL ^ l)));
                });
            }
            try {
                if (bl) {
                    dumperOptions.setSplitLines(false);
                }
            }
            catch (NoSuchFieldException noSuchFieldException) {
                throw CP_Cb.a(noSuchFieldException);
            }
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
        }
        return yamlConfiguration.saveToString();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        CP_Cb.b = CP_s.a(6174144188835621412L, -4760405580783192059L, MethodHandles.lookup().lookupClass()).a(181924979626045L);
                        CP_Cb.h = new HashMap<K, V>(13);
                        var11 = CP_Cb.b ^ 87777262206669L;
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
                        var20_3 = new String[8];
                        var18_4 = 0;
                        var17_5 = "\u0089\u0010\u008eB\u00fb\u0013\u0010{\u00f9\u00c2\u007f]+\u00b7G\u00f1\u001b|\u00ba\u00a5V\u00b3\u0081g\u00aeq\u00e3\u00b7z\u00dcN\u0015(\u00cb\u0018Z\u008b\u00a8\u00cflI\u000e\u009b\u0004\u00f4\u00d0\u00cd\u0090.\u00ba\u00e7\u0092N\b\u0084B\u0006(\f\u009c7\u00af\nV\u0082q\u0015\u009ei\u0010\u00ed\u001e\u0006(\u00b5\u00a3(\u008b/\u00fcV\u001b%:\u0007\u0082('\u00dd\u00fa=z\u00f1\r/k\u009b\u00b8\u00d2A7\u0081\u009b\u000f'\u000bZg/\u001aj\u0080o+ \u009d\u00fb}\u00ce0\u00c0\u00f6Sv\u00ca\u001c7\u0087\u00dd\u00dc8h0\u00d8\u0003)6\u00b9\u009b\u00e3Gc9\u00c5\u00aej\u00ab(i\r2\u0014\u00c7w0_\u001f\u00b8\u00e4\f`_\u0015\u00e8\u0082\u0012b\u00af\u00c7>L\u009b`\u00bc\u00d0\u0098\u00e0\u00cb\u00e7g\u0018\u009c\u00c2\u0090f\u009a\u0082= ,\u00b5\u00a3.\u00b9J[t\u009d\u00bai&\u00ec\u0089\u00e6!\u00bc|\t\u001c\u00b3\u008eq\u0090\u008e52g \u00a1ql";
                        var19_6 = "\u0089\u0010\u008eB\u00fb\u0013\u0010{\u00f9\u00c2\u007f]+\u00b7G\u00f1\u001b|\u00ba\u00a5V\u00b3\u0081g\u00aeq\u00e3\u00b7z\u00dcN\u0015(\u00cb\u0018Z\u008b\u00a8\u00cflI\u000e\u009b\u0004\u00f4\u00d0\u00cd\u0090.\u00ba\u00e7\u0092N\b\u0084B\u0006(\f\u009c7\u00af\nV\u0082q\u0015\u009ei\u0010\u00ed\u001e\u0006(\u00b5\u00a3(\u008b/\u00fcV\u001b%:\u0007\u0082('\u00dd\u00fa=z\u00f1\r/k\u009b\u00b8\u00d2A7\u0081\u009b\u000f'\u000bZg/\u001aj\u0080o+ \u009d\u00fb}\u00ce0\u00c0\u00f6Sv\u00ca\u001c7\u0087\u00dd\u00dc8h0\u00d8\u0003)6\u00b9\u009b\u00e3Gc9\u00c5\u00aej\u00ab(i\r2\u0014\u00c7w0_\u001f\u00b8\u00e4\f`_\u0015\u00e8\u0082\u0012b\u00af\u00c7>L\u009b`\u00bc\u00d0\u0098\u00e0\u00cb\u00e7g\u0018\u009c\u00c2\u0090f\u009a\u0082= ,\u00b5\u00a3.\u00b9J[t\u009d\u00bai&\u00ec\u0089\u00e6!\u00bc|\t\u001c\u00b3\u008eq\u0090\u008e52g \u00a1ql".length();
                        var16_7 = 32;
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
                            var20_3[var18_4++] = CP_Cb.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "r\u00d2\u00ac\u00deT\u0089,\\\u001c^\u00e1\u000f\u00ff\u000b\u00f3{\u00f2>\u00eb5\u00c3\u00d6\u00b5\u00bf\u00ce\u00b3\u00c4\u00e7\u0091\u0097[ @\u001bQ-\u00dd\u00a3)\u00a5u\u009a<J\u007fq\u0095\"\u0019\u0005G\u0099h\u00f7\n`\u009e\u00dco\u00f36\u0012\u00ac%\u00907\u0005\u00f1\u00e6?\u00b0\u0098\u00c5\u0004\u00f9\u00ebIP\u0015\u0099 m\u0012\u00b5\u0088\u00f877a\u00ff\u0006\u00f7\u00bb\u00a8\u00f9\u00ddg\u001c\u00a8\u00c5\u00c9^|\u00e8+\\Iy\u000ev\u00a5MK";
                            var19_6 = "r\u00d2\u00ac\u00deT\u0089,\\\u001c^\u00e1\u000f\u00ff\u000b\u00f3{\u00f2>\u00eb5\u00c3\u00d6\u00b5\u00bf\u00ce\u00b3\u00c4\u00e7\u0091\u0097[ @\u001bQ-\u00dd\u00a3)\u00a5u\u009a<J\u007fq\u0095\"\u0019\u0005G\u0099h\u00f7\n`\u009e\u00dco\u00f36\u0012\u00ac%\u00907\u0005\u00f1\u00e6?\u00b0\u0098\u00c5\u0004\u00f9\u00ebIP\u0015\u0099 m\u0012\u00b5\u0088\u00f877a\u00ff\u0006\u00f7\u00bb\u00a8\u00f9\u00ddg\u001c\u00a8\u00c5\u00c9^|\u00e8+\\Iy\u000ev\u00a5MK".length();
                            var16_7 = 80;
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
                            var20_3[var18_4++] = CP_Cb.b(var21_9).intern();
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
                CP_Cb.f = var20_3;
                CP_Cb.g = new String[8];
                CP_Cb.k = new HashMap<K, V>(13);
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
                var6_12 = new long[3];
                var3_13 = 0;
                var4_14 = "\u008bzx7.\u00db.yM\u00fa\u0093\u00afdW9\u00ce`L\u00ae\u00cdAa7\u00ef";
                var5_15 = "\u008bzx7.\u00db.yM\u00fa\u0093\u00afdW9\u00ce`L\u00ae\u00cdAa7\u00ef".length();
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
        CP_Cb.i = var6_12;
        CP_Cb.j = new Integer[3];
    }

    private static Exception a(Exception exception) {
        return exception;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x9F5;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CP_Cb", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = f[n2].getBytes("ISO-8859-1");
            CP_Cb.g[n2] = CP_Cb.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Cb.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_Cb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x287C;
        if (j[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = i[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])k.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    k.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CP_Cb", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Cb.j[n2] = n3;
        }
        return j[n2];
    }

    private static int c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Cb.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_Cb" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Cb.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Cb.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
