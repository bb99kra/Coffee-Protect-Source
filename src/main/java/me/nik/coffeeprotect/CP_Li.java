/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Charsets
 *  org.bukkit.Material
 *  org.bukkit.configuration.InvalidConfigurationException
 *  org.bukkit.configuration.file.YamlConfiguration
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 */
package me.nik.coffeeprotect;

import com.google.common.base.Charsets;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.Key;
import java.text.Normalizer;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.component.ComponentTypes;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.nbt.NBTCompound;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Material;
import org.bukkit.configuration.InvalidConfigurationException;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public final class CP_Li {
    public static final ItemStack CP_V;
    private static final String CP_I;
    private static PacketWrapper[] CP_W;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String lUWIsBntHh = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_Li() {
    }

    public static String CP_Q(String string) {
        long l = a ^ 0x16D7FA93978EL;
        return Normalizer.normalize(string, Normalizer.Form.NFD).replaceAll((String)((Object)CP_Li.a("e", (int)25446, (long)(0x6F8C7D1B9D28499EL ^ l))), "");
    }

    public static double CP_s(double d, int n) {
        return BigDecimal.valueOf(d).setScale(n, RoundingMode.HALF_EVEN).doubleValue();
    }

    public static boolean CP_e(String string, String string2) {
        boolean bl;
        block9: {
            int n;
            int n2;
            String string3;
            String string4;
            block12: {
                block13: {
                    block11: {
                        block10: {
                            long l = a ^ 0x41FDB2AECB5CL;
                            string4 = CP_rW.CP_x();
                            string3 = string;
                            if (string4 == null) break block10;
                            if (string3 == null) break block11;
                            string3 = string2;
                        }
                        if (string4 == null) break block12;
                        if (string3 != null) break block13;
                    }
                    return false;
                }
                string3 = string2;
            }
            int n3 = n2 = string3.length();
            if (string4 != null) {
                if (n3 == 0) {
                    return true;
                }
                n3 = n = string.length() - n2;
            }
            while (n >= 0) {
                block15: {
                    boolean bl2;
                    block14: {
                        bl = string.regionMatches(true, n, string2, 0, n2);
                        if (string4 == null) break block9;
                        if (string4 == null) break block14;
                        if (!bl) break block15;
                        bl2 = true;
                    }
                    return bl2;
                }
                --n;
                if (string4 != null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean CP_z(String string, String ... stringArray) {
        boolean bl;
        block4: {
            long l = a ^ 0x4D315B6BA765L;
            String[] stringArray2 = stringArray;
            int n = stringArray2.length;
            String string2 = CP_rW.CP_x();
            int n2 = 0;
            while (n2 < n) {
                String string3 = stringArray2[n2];
                if (string2 != null) {
                    bl = string.contains(string3);
                    if (string2 == null) break block4;
                    if (bl) {
                        return true;
                    }
                    ++n2;
                }
                if (string2 != null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static boolean CP_y(String string, List<String> list) {
        boolean bl;
        block3: {
            long l = a ^ 0x2B58130E4194L;
            Iterator<String> iterator = list.iterator();
            String string2 = CP_rW.CP_x();
            while (iterator.hasNext()) {
                block5: {
                    boolean bl2;
                    block4: {
                        String string3 = iterator.next();
                        bl = string.contains(string3);
                        if (string2 == null) break block3;
                        if (string2 == null) break block4;
                        if (!bl) break block5;
                        bl2 = true;
                    }
                    return bl2;
                }
                if (string2 != null) continue;
            }
            bl = false;
        }
        return bl;
    }

    public static <E> E CP_N(Collection<? extends E> collection) {
        E e;
        block6: {
            long l = a ^ 0x64ED543ED6F3L;
            String string = CP_rW.CP_x();
            int n = collection.size();
            if (string != null) {
                if (n == 0) {
                    return null;
                }
                n = new Random().nextInt(collection.size());
            }
            int n2 = n;
            Collection<E> collection2 = collection;
            if (string != null) {
                if (collection2 instanceof List) {
                    return ((List)collection).get(n2);
                }
                collection2 = collection;
            }
            Iterator<E> iterator = collection2.iterator();
            for (int i = 0; i < n2; ++i) {
                e = iterator.next();
                if (string != null) {
                    if (string != null) continue;
                }
                break block6;
            }
            e = iterator.next();
        }
        return e;
    }

    /*
     * Loose catch block
     */
    public static String CP_f(ItemStack itemStack) {
        StringBuilder stringBuilder;
        block20: {
            boolean bl;
            ItemMeta itemMeta;
            long l;
            block23: {
                String string;
                block24: {
                    block21: {
                        block22: {
                            ItemStack itemStack2;
                            block19: {
                                l = a ^ 0x5F73A52FBE88L;
                                stringBuilder = new StringBuilder();
                                string = CP_rW.CP_x();
                                itemStack2 = itemStack;
                                if (string == null) break block19;
                                try {
                                    block25: {
                                        if (!itemStack2.hasItemMeta()) break block20;
                                        break block25;
                                        catch (NoSuchMethodError noSuchMethodError) {
                                            throw CP_Li.a(noSuchMethodError);
                                        }
                                    }
                                    itemStack2 = itemStack;
                                }
                                catch (NoSuchMethodError noSuchMethodError) {
                                    throw CP_Li.a(noSuchMethodError);
                                }
                            }
                            itemMeta = itemStack2.getItemMeta();
                            bl = itemMeta.hasDisplayName();
                            if (string == null) break block21;
                            try {
                                block26: {
                                    if (!bl) break block22;
                                    break block26;
                                    catch (NoSuchMethodError noSuchMethodError) {
                                        throw CP_Li.a(noSuchMethodError);
                                    }
                                }
                                stringBuilder.append(itemMeta.getDisplayName().length());
                            }
                            catch (NoSuchMethodError noSuchMethodError) {
                                throw CP_Li.a(noSuchMethodError);
                            }
                        }
                        stringBuilder.append((String)((Object)CP_Li.a("e", (int)23585, (long)(0x4D66FF94ED865FDAL ^ l))));
                        stringBuilder.append(itemStack.getType().name()).append((String)((Object)CP_Li.a("e", (int)15196, (long)(0x10278E4F9828B8A5L ^ l))));
                        bl = itemMeta.hasLore();
                    }
                    if (string == null) break block23;
                    try {
                        block27: {
                            if (!bl) break block24;
                            break block27;
                            catch (NoSuchMethodError noSuchMethodError) {
                                throw CP_Li.a(noSuchMethodError);
                            }
                        }
                        stringBuilder.append(itemMeta.getLore().size());
                    }
                    catch (NoSuchMethodError noSuchMethodError) {
                        throw CP_Li.a(noSuchMethodError);
                    }
                }
                try {
                    stringBuilder.append((String)((Object)CP_Li.a("e", (int)15196, (long)(0x10278E4F9828B8A5L ^ l))));
                    if (string == null) break block20;
                    bl = itemMeta.hasEnchants();
                }
                catch (NoSuchMethodError noSuchMethodError) {
                    throw CP_Li.a(noSuchMethodError);
                }
            }
            try {
                if (bl) {
                    stringBuilder.append(itemMeta.getEnchants().size());
                }
            }
            catch (NoSuchMethodError noSuchMethodError) {
                throw CP_Li.a(noSuchMethodError);
            }
            stringBuilder.append((String)((Object)CP_Li.a("e", (int)15196, (long)(0x10278E4F9828B8A5L ^ l))));
            stringBuilder.append(itemStack.getDurability());
            try {
                stringBuilder.append((String)((Object)CP_Li.a("e", (int)15196, (long)(0x10278E4F9828B8A5L ^ l))));
                stringBuilder.append(itemMeta.getAsString().length());
            }
            catch (NoSuchMethodError noSuchMethodError) {
                // empty catch block
            }
        }
        return stringBuilder.toString();
    }

    public static String CP_I(String string) {
        long l = a ^ 0x4BB1BE5EFB85L;
        char c = Character.toTitleCase(string.substring(0, 1).charAt(0));
        String string2 = string.substring(1).toLowerCase();
        String string3 = CP_rW.CP_x();
        String string4 = c + string2;
        if (PacketWrapper.CP_z() == null) {
            CP_rW.CP_a("jKyg9");
        }
        return string4;
    }

    public static String CP_w(String string, int n) {
        String string2;
        block9: {
            long l = a ^ 0xD819768F383L;
            String string3 = CP_rW.CP_x();
            if (string == null) {
                return null;
            }
            int n2 = n;
            if (string3 != null) {
                if (n2 < 1) {
                    n = 1;
                }
                n2 = string.length();
            }
            int n3 = n2;
            int n4 = 0;
            StringBuilder stringBuilder = new StringBuilder(n3 + CP_Li.b("p", (int)7024, (long)(0x51255611294186EFL ^ l)));
            while (n3 - n4 > n) {
                block12: {
                    int n5;
                    block13: {
                        int n6;
                        block10: {
                            block11: {
                                string2 = string;
                                if (string3 == null) break block9;
                                int n7 = string2.charAt(n4);
                                if (string3 != null) {
                                    if (n7 == CP_Li.b("p", (int)25589, (long)(0x7C87F8820617E6BL ^ l))) {
                                        ++n4;
                                        if (string3 != null) continue;
                                    }
                                    n7 = string.lastIndexOf((int)CP_Li.b("p", (int)25589, (long)(0x7C87F8820617E6BL ^ l)), n + n4);
                                }
                                n5 = n6 = n7;
                                if (string3 == null) break block10;
                                if (n5 < n4) break block11;
                                stringBuilder.append(string, n4, n6);
                                stringBuilder.append(CP_I);
                                n4 = n6 + 1;
                                if (string3 != null) break block12;
                            }
                            n5 = n6 = string.indexOf((int)CP_Li.b("p", (int)25589, (long)(0x7C87F8820617E6BL ^ l)), n + n4);
                        }
                        if (string3 == null) break block12;
                        if (n5 < 0) break block13;
                        stringBuilder.append(string, n4, n6);
                        stringBuilder.append(CP_I);
                        n4 = n6 + 1;
                        if (string3 != null) break block12;
                    }
                    stringBuilder.append(string.substring(n4));
                    n5 = n4 = n3;
                }
                if (string3 != null) continue;
            }
            stringBuilder.append(string.substring(n4));
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public static YamlConfiguration CP_y(File file) {
        YamlConfiguration yamlConfiguration = new YamlConfiguration();
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            yamlConfiguration.load((Reader)new InputStreamReader((InputStream)fileInputStream, Charsets.UTF_8));
        }
        catch (IOException | InvalidConfigurationException throwable) {
            throwable.printStackTrace();
        }
        return yamlConfiguration;
    }

    public static CP_Cg CP_s(CP_Cg ilIlCg) {
        block21: {
            NBTCompound nBTCompound;
            block26: {
                CallSite callSite;
                NBTCompound nBTCompound2;
                NBTCompound nBTCompound3;
                block28: {
                    boolean bl;
                    long l;
                    block27: {
                        NBTCompound nBTCompound4;
                        String string;
                        block25: {
                            block23: {
                                boolean bl2;
                                Set<String> set;
                                block24: {
                                    Set<String> set2;
                                    block22: {
                                        NBTCompound nBTCompound5;
                                        block20: {
                                            CP_Cg ilIlCg2;
                                            block19: {
                                                boolean bl3;
                                                block18: {
                                                    l = a ^ 0x2B4CB01C7B3EL;
                                                    string = CP_rW.CP_x();
                                                    CP_Cg ilIlCg3 = ilIlCg;
                                                    if (string != null) {
                                                        if (ilIlCg3 == null) {
                                                            return ilIlCg;
                                                        }
                                                        ilIlCg3 = ilIlCg;
                                                    }
                                                    bl3 = ilIlCg3.CP_N(ComponentTypes.CP_u8);
                                                    if (string == null) break block18;
                                                    if (bl3) {
                                                        ilIlCg.CP_e(ComponentTypes.CP_u8);
                                                    }
                                                    ilIlCg2 = ilIlCg;
                                                    if (string == null) break block19;
                                                    bl3 = ilIlCg2.CP_N(ComponentTypes.InvalidInteractCheck);
                                                }
                                                if (bl3) {
                                                    ilIlCg.CP_e(ComponentTypes.InvalidInteractCheck);
                                                }
                                                ilIlCg2 = ilIlCg;
                                            }
                                            nBTCompound5 = nBTCompound = ilIlCg2.CP_L();
                                            if (string == null) break block20;
                                            if (nBTCompound5 == null) break block21;
                                            nBTCompound5 = nBTCompound;
                                        }
                                        set2 = set = nBTCompound5.getTagNames();
                                        if (string == null) break block22;
                                        if (set2 == null) break block23;
                                        set2 = set;
                                    }
                                    bl2 = set2.isEmpty();
                                    if (string == null) break block24;
                                    if (bl2) break block23;
                                    bl2 = set.contains(CP_Li.a("e", (int)27529, (long)(0x32F503ADE4B3ADC7L ^ l)));
                                }
                                if (string != null) {
                                    if (bl2) {
                                        nBTCompound.removeTag((String)((Object)CP_Li.a("e", (int)12521, (long)(0x237D74C262CA76A3L ^ l))));
                                    }
                                    bl2 = set.contains(CP_Li.a("e", (int)11720, (long)(0x4135D02D3B1DEB84L ^ l)));
                                }
                                if (bl2) {
                                    nBTCompound.removeTag((String)((Object)CP_Li.a("e", (int)8520, (long)(0x24DD4C9C73AE6701L ^ l))));
                                }
                            }
                            nBTCompound4 = nBTCompound3 = nBTCompound.getCompoundTagOrNull((String)((Object)CP_Li.a("e", (int)2194, (long)(0x60854DC93A8DCED0L ^ l))));
                            if (string == null) break block25;
                            if (nBTCompound4 == null) break block26;
                            nBTCompound4 = nBTCompound3;
                        }
                        bl = nBTCompound4.contains((String)((Object)CP_Li.a("e", (int)12521, (long)(0x237D74C262CA76A3L ^ l))));
                        if (string == null) break block27;
                        if (bl) {
                            nBTCompound3.removeTag((String)((Object)CP_Li.a("e", (int)12521, (long)(0x237D74C262CA76A3L ^ l))));
                        }
                        nBTCompound2 = nBTCompound3;
                        callSite = CP_Li.a("e", (int)8520, (long)(0x24DD4C9C73AE6701L ^ l));
                        if (string == null) break block28;
                        bl = nBTCompound2.contains((String)((Object)callSite));
                    }
                    if (bl) {
                        nBTCompound3.removeTag((String)((Object)CP_Li.a("e", (int)8520, (long)(0x24DD4C9C73AE6701L ^ l))));
                    }
                    nBTCompound2 = nBTCompound;
                    callSite = CP_Li.a("e", (int)5913, (long)(0x31C9303F3CBED15AL ^ l));
                }
                nBTCompound2.setTag((String)((Object)callSite), nBTCompound3);
            }
            ilIlCg.CP_A(nBTCompound);
        }
        return ilIlCg;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        CP_Li.a = CP_s.a(-627726363991705752L, -3369973409126944295L, MethodHandles.lookup().lookupClass()).a(24133933152962L);
                        var20 = CP_Li.a ^ 62110695523571L;
                        CP_Li.d = new HashMap<K, V>(13);
                        CP_Li.CP_W(null);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[10];
                        var16_4 = 0;
                        var15_5 = "\u00ea\u00c9\u0003C\u00bc\u00ce\u00e3]\u00d5\u00ca\u0091\u00c1\u00f5m\u0092\u00906-\u00cdG\\G\u00c7x \u00f7\u0015R2\u0087\u0000\u0010\u00bb\u00e9\u0012yY\u00c3\u00b2\u00a5\u00b9\u00de\u0083\u008c\u00bd\u00c9\b\u001e#\u008a\u0082\u00a9\u00a4\u00den\u009b\u00d7\u0010z\u00ee{\u00e90k?Sc\u00a9\u00f5\u001e\u00e6^\u00d3< \u00eb\u00ddI\u0084\u00db\u00d7A\u00e1$\u00ba\u0015y\u00c9T\u009eR3\u008d\u00acvl\u001d>\u001d\u009a\u001c\u00cd\u00cc\u00ee\u0003\u00c3F\u0010\u00ef\u00d4\u00dft\u00b9v}\u00e6\u008b\u000b+\u0006\u001c\u00e7\u008di \u001f\u007f\u0090\u00dd\u00b4\u0080\u0003\u000e0V\u000f\u00e9\\\u00f1\u00f9\u00a5\u001a\"^'\u0082Fcj\u00ec\u0087\u009d\u00eaxv\u00ad\u009a\u0010\u0084\u00c6\u0005\u00c2,\u001e\u00eb\u00a6\u00ea!\u00c8j5U\u00d8?\u0010;u=\u00c3\u00c6\u0019\u00ff\u008e\u00a3\u00dd3\u00a6\u00e1\u00d5D\u00bf";
                        var17_6 = "\u00ea\u00c9\u0003C\u00bc\u00ce\u00e3]\u00d5\u00ca\u0091\u00c1\u00f5m\u0092\u00906-\u00cdG\\G\u00c7x \u00f7\u0015R2\u0087\u0000\u0010\u00bb\u00e9\u0012yY\u00c3\u00b2\u00a5\u00b9\u00de\u0083\u008c\u00bd\u00c9\b\u001e#\u008a\u0082\u00a9\u00a4\u00den\u009b\u00d7\u0010z\u00ee{\u00e90k?Sc\u00a9\u00f5\u001e\u00e6^\u00d3< \u00eb\u00ddI\u0084\u00db\u00d7A\u00e1$\u00ba\u0015y\u00c9T\u009eR3\u008d\u00acvl\u001d>\u001d\u009a\u001c\u00cd\u00cc\u00ee\u0003\u00c3F\u0010\u00ef\u00d4\u00dft\u00b9v}\u00e6\u008b\u000b+\u0006\u001c\u00e7\u008di \u001f\u007f\u0090\u00dd\u00b4\u0080\u0003\u000e0V\u000f\u00e9\\\u00f1\u00f9\u00a5\u001a\"^'\u0082Fcj\u00ec\u0087\u009d\u00eaxv\u00ad\u009a\u0010\u0084\u00c6\u0005\u00c2,\u001e\u00eb\u00a6\u00ea!\u00c8j5U\u00d8?\u0010;u=\u00c3\u00c6\u0019\u00ff\u008e\u00a3\u00dd3\u00a6\u00e1\u00d5D\u00bf".length();
                        var14_7 = 24;
                        var13_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block13;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = CP_Li.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u00cc\u0012N7&\u00f0\u00e1\u00be\tx5m\u00fb#\u0088z\u00105ajK\u00c9f\u00b7\u001b=\u00d0R\u0007T\u001b}Z";
                            var17_6 = "\u00cc\u0012N7&\u00f0\u00e1\u00be\tx5m\u00fb#\u0088z\u00105ajK\u00c9f\u00b7\u001b=\u00d0R\u0007T\u001b}Z".length();
                            var14_7 = 16;
                            var13_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block13;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = CP_Li.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block14;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                CP_Li.b = var18_3;
                CP_Li.c = new String[10];
                CP_Li.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[2];
                var3_13 = 0;
                var4_14 = "\u008e\t\u0095\u00e8\b\u00ad,\u009e~\u00be\u00cd\u00fc\r\u00a3j\u00a5";
                var5_15 = "\u008e\t\u0095\u00e8\b\u00ad,\u009e~\u00be\u00cd\u00fc\r\u00a3j\u00a5".length();
                var2_16 = 0;
                while (true) {
                    break block15;
                    break;
                }
lbl74:
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
        CP_Li.e = var6_12;
        CP_Li.f = new Integer[2];
        CP_Li.CP_V = new ItemStack(Material.AIR);
        CP_Li.CP_I = System.getProperty((String)CP_Li.a("e", (int)17667, (long)(7347382509142834309L ^ var20)));
    }

    public static void CP_W(PacketWrapper[] packetWrapperArray) {
        CP_W = packetWrapperArray;
    }

    public static PacketWrapper[] CP_x() {
        return CP_W;
    }

    private static NoSuchMethodError a(NoSuchMethodError noSuchMethodError) {
        return noSuchMethodError;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xC7D;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Li", exception);
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
            CP_Li.c[n2] = CP_Li.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Li.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_Li" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x5F15;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_Li", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Li.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Li.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_Li" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Li.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Li.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
