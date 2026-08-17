/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull
 *  me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable
 *  org.bukkit.Color
 *  org.bukkit.Location
 *  org.bukkit.OfflinePlayer
 *  org.bukkit.configuration.Configuration
 *  org.bukkit.configuration.ConfigurationSection
 *  org.bukkit.configuration.serialization.ConfigurationSerializable
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.util.Vector
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.libs.jetbrains.annotations.NotNull;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;
import org.bukkit.Color;
import org.bukkit.Location;
import org.bukkit.OfflinePlayer;
import org.bukkit.configuration.Configuration;
import org.bukkit.configuration.ConfigurationSection;
import org.bukkit.configuration.serialization.ConfigurationSerializable;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class IlIlCf
implements ConfigurationSection {
    protected ConfigurationSection IlIlt;
    private static int[] IlIla;
    private static final long a;
    private static final String[] c;
    private static final String[] d;
    private static final Map e;
    private static transient /* synthetic */ String idPbpiFEIQ = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlCf(ConfigurationSection configurationSection) {
        this.IlIlt = configurationSection;
    }

    public Boolean IlIly(String string) {
        block7: {
            String string2;
            long l;
            block8: {
                String string3;
                String string4;
                IlIlCf ilIlCf;
                int[] nArray;
                block6: {
                    boolean bl;
                    block5: {
                        l = a ^ 0x5BB555C0F43BL;
                        nArray = IlIlCf.IlIlG();
                        bl = this.isBoolean(string);
                        if (nArray != null) break block5;
                        if (bl) {
                            return this.getBoolean(string);
                        }
                        ilIlCf = this;
                        string4 = string;
                        if (nArray != null) break block6;
                        bl = ilIlCf.isString(string4);
                    }
                    if (!bl) break block7;
                    ilIlCf = this;
                    string4 = string;
                }
                string2 = string3 = ilIlCf.getString(string4);
                if (nArray != null) break block8;
                if (string2 == null) break block7;
                string2 = string3;
            }
            if (string2.equalsIgnoreCase((String)((Object)IlIlCf.a("o", (int)2217, (long)(0x1544223F82F9EAE9L ^ l))))) {
                return null;
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    public Boolean IlIlg(String var1_1, Boolean var2_2) {
        block10: {
            block9: {
                var3_3 = IlIlCf.a ^ 97457281664919L;
                var6_4 = this.get(var1_1);
                var5_5 = IlIlCf.IlIlG();
                v0 = var6_4 instanceof Boolean;
                if (var5_5 != null) break block9;
                if (v0) {
                    return (Boolean)var6_4;
                }
                v1 = var6_4;
                if (var5_5 != null) break block10;
                v0 = v1 instanceof String;
            }
            if (v0) {
                var7_6 = (String)var6_4;
                v1 = var7_6;
                if (var5_5 == null) {
                    if (v1.equalsIgnoreCase((String)IlIlCf.a("o", (int)26195, (long)(1017736862662686654L ^ var3_3)))) {
                        return null;
                    } else {
                        ** GOTO lbl-1000
                    }
                }
            } else lbl-1000:
            // 3 sources

            {
                v1 = var6_4;
            }
        }
        if (v1 == null) {
            return var2_2;
        }
        return null;
    }

    public Set<String> getKeys(boolean bl) {
        return this.IlIlt.getKeys(bl);
    }

    public Map<String, Object> getValues(boolean bl) {
        return this.IlIlt.getValues(bl);
    }

    public boolean contains(String string) {
        return this.IlIlt.contains(string);
    }

    public boolean contains(String string, boolean bl) {
        return this.IlIlt.contains(string, bl);
    }

    public boolean isSet(String string) {
        return this.IlIlt.isSet(string);
    }

    public String getCurrentPath() {
        return this.IlIlt.getCurrentPath();
    }

    public String getName() {
        return this.IlIlt.getName();
    }

    public Configuration getRoot() {
        return this.IlIlt.getRoot();
    }

    public ConfigurationSection getParent() {
        return this.IlIlt.getParent();
    }

    public Object get(String string) {
        return this.IlIlt.get(string);
    }

    public Object get(String string, Object object) {
        return this.IlIlt.get(string, object);
    }

    public void set(String string, Object object) {
        this.IlIlt.set(string, object);
    }

    public IlIlCf IlIlw(String string) {
        return new IlIlCf(this.IlIlt.createSection(string));
    }

    public IlIlCf IlIlr(String string, Map<?, ?> map) {
        return new IlIlCf(this.IlIlt.createSection(string, map));
    }

    public String getString(String string) {
        return this.IlIlt.getString(string);
    }

    public String getString(String string, String string2) {
        return this.IlIlt.getString(string, string2);
    }

    public boolean isString(String string) {
        return this.IlIlt.isString(string);
    }

    public int getInt(String string) {
        return this.IlIlt.getInt(string);
    }

    public int getInt(String string, int n) {
        return this.IlIlt.getInt(string, n);
    }

    public boolean isInt(String string) {
        return this.IlIlt.isInt(string);
    }

    public boolean getBoolean(String string) {
        return this.IlIlt.getBoolean(string);
    }

    public boolean getBoolean(String string, boolean bl) {
        return this.IlIlt.getBoolean(string, bl);
    }

    public boolean isBoolean(String string) {
        return this.IlIlt.isBoolean(string);
    }

    public double getDouble(String string) {
        return this.IlIlt.getDouble(string);
    }

    public double getDouble(String string, double d) {
        return this.IlIlt.getDouble(string, d);
    }

    public boolean isDouble(String string) {
        return this.IlIlt.isDouble(string);
    }

    public long getLong(String string) {
        return this.IlIlt.getLong(string);
    }

    public long getLong(String string, long l) {
        return this.IlIlt.getLong(string, l);
    }

    public boolean isLong(String string) {
        return this.IlIlt.isLong(string);
    }

    public List<?> getList(String string) {
        return this.IlIlt.getList(string);
    }

    public List<?> getList(String string, List<?> list) {
        return this.IlIlt.getList(string, list);
    }

    public boolean isList(String string) {
        return this.IlIlt.isList(string);
    }

    public List<String> getStringList(String string) {
        return this.IlIlt.getStringList(string);
    }

    public List<Integer> getIntegerList(String string) {
        return this.IlIlt.getIntegerList(string);
    }

    public List<Boolean> getBooleanList(String string) {
        return this.IlIlt.getBooleanList(string);
    }

    public List<Double> getDoubleList(String string) {
        return this.IlIlt.getDoubleList(string);
    }

    public List<Float> getFloatList(String string) {
        return this.IlIlt.getFloatList(string);
    }

    public List<Long> getLongList(String string) {
        return this.IlIlt.getLongList(string);
    }

    public List<Byte> getByteList(String string) {
        return this.IlIlt.getByteList(string);
    }

    public List<Character> getCharacterList(String string) {
        return this.IlIlt.getCharacterList(string);
    }

    public List<Short> getShortList(String string) {
        return this.IlIlt.getShortList(string);
    }

    public List<Map<?, ?>> getMapList(String string) {
        return this.IlIlt.getMapList(string);
    }

    public <T> T getObject(String string, Class<T> clazz) {
        return (T)this.IlIlt.getObject(string, clazz);
    }

    public <T> T getObject(String string, Class<T> clazz, T t) {
        return (T)this.IlIlt.getObject(string, clazz, t);
    }

    public <T extends ConfigurationSerializable> T getSerializable(String string, Class<T> clazz) {
        return (T)this.IlIlt.getSerializable(string, clazz);
    }

    public <T extends ConfigurationSerializable> T getSerializable(String string, Class<T> clazz, T t) {
        return (T)this.IlIlt.getSerializable(string, clazz, t);
    }

    public Vector getVector(String string) {
        return this.IlIlt.getVector(string);
    }

    public Vector getVector(String string, Vector vector) {
        return this.IlIlt.getVector(string, vector);
    }

    public boolean isVector(String string) {
        return this.IlIlt.isVector(string);
    }

    public OfflinePlayer getOfflinePlayer(String string) {
        return this.IlIlt.getOfflinePlayer(string);
    }

    public OfflinePlayer getOfflinePlayer(String string, OfflinePlayer offlinePlayer) {
        return this.IlIlt.getOfflinePlayer(string, offlinePlayer);
    }

    public boolean isOfflinePlayer(String string) {
        return this.IlIlt.isOfflinePlayer(string);
    }

    public ItemStack getItemStack(String string) {
        return this.IlIlt.getItemStack(string);
    }

    public ItemStack getItemStack(String string, ItemStack itemStack) {
        return this.IlIlt.getItemStack(string, itemStack);
    }

    public boolean isItemStack(String string) {
        return this.IlIlt.isItemStack(string);
    }

    public Color getColor(String string) {
        return this.IlIlt.getColor(string);
    }

    public Color getColor(String string, Color color) {
        return this.IlIlt.getColor(string, color);
    }

    public boolean isColor(String string) {
        return this.IlIlt.isColor(string);
    }

    public Location getLocation(String string) {
        return this.getSerializable(string, Location.class);
    }

    public Location getLocation(String string, Location location) {
        return this.getSerializable(string, Location.class, location);
    }

    public boolean isLocation(String string) {
        long l = a ^ 0x1FA60554D631L;
        return this.getSerializable(string, Location.class) != null;
    }

    public IlIlCf IlIlb(String string) {
        long l = a ^ 0x1B7E74AB18BAL;
        ConfigurationSection configurationSection = this.IlIlt.getConfigurationSection(string);
        if (configurationSection == null) {
            return this.IlIlw(string);
        }
        return new IlIlCf(configurationSection);
    }

    public boolean isConfigurationSection(String string) {
        return this.IlIlt.isConfigurationSection(string);
    }

    public IlIlCf IlIlk() {
        return new IlIlCf(this.IlIlt.getDefaultSection());
    }

    public void addDefault(String string, Object object) {
        this.IlIlt.addDefault(string, object);
    }

    @NotNull
    public List<String> getComments(@NotNull String string) {
        return null;
    }

    @NotNull
    public List<String> getInlineComments(@NotNull String string) {
        return null;
    }

    public void setComments(@NotNull String string, @Nullable List<String> list) {
    }

    public void setInlineComments(@NotNull String string, @Nullable List<String> list) {
    }

    public static void IlIlS(int[] nArray) {
        IlIla = nArray;
    }

    public static int[] IlIlG() {
        return IlIla;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a((long)-6956910647920286396L, (long)-5123754624784867972L, MethodHandles.lookup().lookupClass()).a(76779013599400L);
        e = new HashMap(13);
        IlIlCf.IlIlS(null);
        long l = a ^ 0x76348FE4A402L;
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
        String[] stringArray = new String[2];
        int n = 0;
        String string = "\u001cIy7\u000b\u00d5\u00c1&\u00d1\u0087.\u00c8q\u00bb\u00cf_\u0010\u00ac\u00ed\u0081\u0013\u00bd\u008b\u009d\u00d4y\u001e\u008e\u00a5d$-*";
        int n2 = "\u001cIy7\u000b\u00d5\u00c1&\u00d1\u0087.\u00c8q\u00bb\u00cf_\u0010\u00ac\u00ed\u0081\u0013\u00bd\u008b\u009d\u00d4y\u001e\u008e\u00a5d$-*".length();
        int n3 = 16;
        int n4 = -1;
        while (true) {
            int n5 = ++n4;
            byte[] byArray3 = cipher.doFinal(string.substring(n5, n5 + n3).getBytes("ISO-8859-1"));
            stringArray[n++] = IlIlCf.a(byArray3).intern();
            if ((n4 += n3) >= n2) {
                c = stringArray;
                d = new String[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x55ED;
        if (d[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])e.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    e.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlCf", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            IlIlCf.d[n2] = IlIlCf.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return d[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlCf.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlCf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlCf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

