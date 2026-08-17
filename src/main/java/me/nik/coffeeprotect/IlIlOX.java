/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Bukkit
 *  org.bukkit.Material
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.inventory.Inventory
 *  org.bukkit.inventory.InventoryHolder
 *  org.bukkit.inventory.ItemStack
 *  org.bukkit.inventory.meta.ItemMeta
 *  org.bukkit.inventory.meta.SkullMeta
 */
package me.nik.coffeeprotect;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.ArrayList;
import java.util.List;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlLs;
import me.nik.coffeeprotect.IlIlTz;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.InventoryHolder;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.inventory.meta.SkullMeta;

public abstract class IlIlOX
implements InventoryHolder {
    protected static final IlIlLs IlIln;
    protected final CoffeeProtect IlIlA;
    protected Inventory IlIlf;
    protected IlIlTz IlIlH;
    private static int IlIlz;
    private static final long a;
    private static final String d;

    public IlIlOX(IlIlTz ilIlTz, CoffeeProtect coffeeProtect) {
        this.IlIlH = ilIlTz;
        this.IlIlA = coffeeProtect;
    }

    protected abstract String IlIlO();

    protected abstract int IlIlS();

    public abstract void IlIla(InventoryClickEvent var1);

    protected abstract void IlIlX();

    public void IlIlM() {
        this.IlIlf = Bukkit.createInventory((InventoryHolder)this, (int)this.IlIlS(), (String)this.IlIlO());
        this.IlIlX();
        this.IlIlH.IlIlu().openInventory(this.IlIlf);
    }

    protected ItemStack IlIlq(Material material, String string, List<String> list) {
        ItemStack itemStack;
        ItemStack itemStack2;
        block9: {
            ItemMeta itemMeta;
            block10: {
                long l = a ^ 0x7AF2E33B1754L;
                itemStack2 = new ItemStack(material);
                itemMeta = itemStack2.getItemMeta();
                PacketWrapper[] packetWrapperArray = IlIlTz.IlIlt();
                try {
                    itemMeta.setDisplayName(IlIlrW.IlIlW(string));
                    if (packetWrapperArray != null) break block9;
                    if (list == null) break block10;
                }
                catch (NullPointerException nullPointerException) {
                    throw IlIlOX.a(nullPointerException);
                }
                ArrayList<String> arrayList = new ArrayList<String>();
                for (String string2 : list) {
                    try {
                        arrayList.add(IlIlrW.IlIlW(string2));
                        if (packetWrapperArray == null) {
                            if (packetWrapperArray == null) continue;
                            break;
                        }
                        break block9;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw IlIlOX.a(nullPointerException);
                    }
                }
                itemMeta.setLore(arrayList);
            }
            itemStack2.setItemMeta(itemMeta);
        }
        try {
            itemStack = itemStack2;
            if (PacketWrapper.IlIlz() == null) {
                IlIlTz.IlIlH(new PacketWrapper[5]);
            }
        }
        catch (NullPointerException nullPointerException) {
            throw IlIlOX.a(nullPointerException);
        }
        return itemStack;
    }

    protected ItemStack IlIlG(String string, String string2, List<String> list) {
        ItemStack itemStack;
        block12: {
            SkullMeta skullMeta;
            block13: {
                PacketWrapper[] packetWrapperArray;
                block15: {
                    Material material;
                    block14: {
                        long l = a ^ 0x79E64355F779L;
                        material = Material.getMaterial((String)d);
                        packetWrapperArray = IlIlTz.IlIlt();
                        if (material != null) break block14;
                        itemStack = new ItemStack(Material.PLAYER_HEAD);
                        if (packetWrapperArray == null) break block15;
                    }
                    itemStack = new ItemStack(material, 1, 3);
                }
                skullMeta = (SkullMeta)itemStack.getItemMeta();
                try {
                    skullMeta.setOwner(string);
                }
                catch (NullPointerException nullPointerException) {
                    // empty catch block
                }
                try {
                    skullMeta.setDisplayName(IlIlrW.IlIlW(string2));
                    if (packetWrapperArray != null) break block12;
                    if (list == null) break block13;
                }
                catch (NullPointerException nullPointerException) {
                    throw IlIlOX.a(nullPointerException);
                }
                ArrayList<String> arrayList = new ArrayList<String>();
                for (String string3 : list) {
                    try {
                        arrayList.add(IlIlrW.IlIlW(string3));
                        if (packetWrapperArray == null) {
                            if (packetWrapperArray == null) continue;
                            break;
                        }
                        break block12;
                    }
                    catch (NullPointerException nullPointerException) {
                        throw IlIlOX.a(nullPointerException);
                    }
                }
                skullMeta.setLore(arrayList);
            }
            itemStack.setItemMeta((ItemMeta)skullMeta);
        }
        return itemStack;
    }

    public Inventory getInventory() {
        return this.IlIlf;
    }

    /*
     * Enabled aggressive block sorting
     */
    static {
        a = IlIls.a((long)-8433236860470654588L, (long)2053664380489903864L, MethodHandles.lookup().lookupClass()).a(232949420808665L);
        long l = a ^ 0xB909DC06203L;
        IlIlOX.IlIlv(0);
        Cipher cipher = Cipher.getInstance("DES/CBC/PKCS5Padding");
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance("DES");
        byte[] byArray = new byte[8];
        byte[] byArray2 = byArray;
        byArray[0] = (byte)(l >>> 56);
        int n = 1;
        while (true) {
            if (n >= 8) {
                cipher.init(2, (Key)secretKeyFactory.generateSecret(new DESKeySpec(byArray2)), new IvParameterSpec(new byte[8]));
                byte[] byArray3 = cipher.doFinal("c7\u000f\u0018\u0087\u00c3\u00af\u0090\u00fa*\u00cc:\u0091e\r\u00ce".getBytes("ISO-8859-1"));
                d = IlIlOX.a(byArray3).intern();
                IlIln = new IlIlLs(null);
                IlIln.IlIl_();
                return;
            }
            byArray2 = byArray2;
            byArray2[n] = (byte)(l << n * 8 >>> 56);
            ++n;
        }
    }

    public static void IlIlv(int n) {
        IlIlz = n;
    }

    public static int IlIlq() {
        return IlIlz;
    }

    public static int IlIlY() {
        int n = IlIlOX.IlIlq();
        try {
            if (n == 0) {
                return 20;
            }
        }
        catch (NullPointerException nullPointerException) {
            throw IlIlOX.a(nullPointerException);
        }
        return 0;
    }

    private static NullPointerException a(NullPointerException nullPointerException) {
        return nullPointerException;
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
}

