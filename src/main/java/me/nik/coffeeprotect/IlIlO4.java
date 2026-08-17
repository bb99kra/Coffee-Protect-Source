/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlu9
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.ChatColor
 *  org.bukkit.entity.Player
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.inventory.ItemStack
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
import java.util.Iterator;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlCD;
import me.nik.coffeeprotect.IlIlLi;
import me.nik.coffeeprotect.IlIlO6;
import me.nik.coffeeprotect.IlIlOg;
import me.nik.coffeeprotect.IlIlQb;
import me.nik.coffeeprotect.IlIlTz;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIlvn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlu9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class IlIlO4
extends IlIlO6 {
    private final String IlIlh;
    private static final long c;
    private static final String[] h;
    private static final String[] i;
    private static final Map j;
    private static final long[] n;
    private static final Integer[] o;
    private static final Map p;
    private static transient /* synthetic */ String ikjWnGfMWg = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlO4(IlIlTz ilIlTz, CoffeeProtect coffeeProtect, String string) {
        super(ilIlTz, coffeeProtect);
        this.IlIlh = string;
    }

    @Override
    protected String IlIlO() {
        long l = c ^ 0x640C97CBE41DL;
        return IlIlrW.IlIlW((String)((Object)IlIlO4.b("z", (int)17452, (long)(0x78A41F8E77ACC6CFL ^ l))) + this.IlIlh + (String)((Object)IlIlO4.b("z", (int)12320, (long)(0x1FEF724FC5CCB2CCL ^ l))));
    }

    @Override
    protected int IlIlS() {
        long l = c ^ 0x37329F15D959L;
        return (int)IlIlO4.d("q", (int)26474, (long)(0x3BF8F0183BD6E078L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIla(InventoryClickEvent var1_1) {
        block15: {
            var2_2 = IlIlO4.c ^ 93585953340060L;
            var5_3 = (Player)var1_1.getWhoClicked();
            var4_4 = IlIlu9.IlIlX();
            var6_5 = var1_1.getCurrentItem();
            v0 = var6_5.getItemMeta().hasDisplayName();
            if (var4_4 == 0) {
                if (v0 == 0) {
                    return;
                }
                v0 = IlIlCD.IlIlY[var6_5.getType().ordinal()];
            }
            switch (v0 ? 1 : 0) {
                case 1: {
                    var5_3.closeInventory();
                    new IlIlOg(this.IlIlH, this.IlIlA).IlIlM();
                    if (var4_4 == 0) break;
                }
                case 2: {
                    var7_6 = ChatColor.stripColor((String)var6_5.getItemMeta().getDisplayName());
                    var8_7 = -1;
                    v1 = var7_6.hashCode();
                    if (var4_4 != 0) ** GOTO lbl34
                    switch (v1) {
                        case 473267736: {
                            v1 = (int)var7_6.equals(IlIlO4.b("z", (int)29478, (long)(5008913572660817738L ^ var2_2)));
                            if (var4_4 != 0) break;
                            if (v1 == 0) ** GOTO lbl32
                            var8_7 = 0;
                            if (var4_4 == 0) ** GOTO lbl32
                        }
                        case -1133036644: {
                            v1 = (int)var7_6.equals(IlIlO4.b("z", (int)10336, (long)(8683425022936085518L ^ var2_2)));
                            if (var4_4 != 0) break;
                            if (v1 != 0) {
                                var8_7 = 1;
                            }
                        }
lbl32:
                        // 6 sources

                        default: {
                            v1 = var8_7;
                        }
                    }
lbl34:
                    // 4 sources

                    if (var4_4 != 0) ** GOTO lbl40
                    switch (v1) {
                        case 0: {
                            v2 = this;
                            if (var4_4 != 0) ** GOTO lbl43
                            v1 = v2.IlIl_;
lbl40:
                            // 2 sources

                            if (v1 == 0) break block15;
                            --this.IlIl_;
                            v2 = this;
lbl43:
                            // 2 sources

                            super.IlIlM();
                            if (var4_4 == 0) break block15;
                        }
                        case 1: {
                            ++this.IlIl_;
                            super.IlIlM();
                        }
                    }
                }
            }
        }
    }

    @Override
    protected void IlIlX() {
        this.IlIls();
        this.IlIlf.setMaxStackSize(1);
        ArrayList arrayList = new ArrayList();
        IlIlQb.IlIlt(() -> {
            int n;
            int n2;
            int n3;
            block8: {
                long l = c ^ 0x12EA05576AF8L;
                Iterator<IlIlvn> iterator = this.IlIlA.IlIlZ().IlIlE().IlIlV(this.IlIlh).iterator();
                n3 = IlIlu9.IlIl_();
                block0: while (iterator.hasNext()) {
                    IlIlvn ilIlvn = iterator.next();
                    ArrayList<String> arrayList = new ArrayList<String>();
                    arrayList.add("");
                    arrayList.add((String)((Object)IlIlO4.b("z", (int)533, (long)(0x485ECE6997CB0E1BL ^ l))) + ilIlvn.IlIld());
                    arrayList.add("");
                    arrayList.add((String)((Object)IlIlO4.b("z", (int)31179, (long)(0x4AFF378BA677F5C0L ^ l))) + ilIlvn.IlIlj());
                    arrayList.add("");
                    arrayList.add((String)((Object)IlIlO4.b("z", (int)25674, (long)(0x4F1B7F2C910AE845L ^ l))) + ilIlvn.IlIlL());
                    arrayList.add("");
                    arrayList.add((String)((Object)IlIlO4.b("z", (int)24158, (long)(0x4C42A309E1A05253L ^ l))));
                    String string = IlIlLi.IlIlw(ilIlvn.IlIlJ(), (int)IlIlO4.d("q", (int)31416, (long)(0x18E5F6C0BFDA4E0AL ^ l)));
                    Object object = string.split(System.lineSeparator());
                    int n4 = ((String[])object).length;
                    n2 = 0;
                    if (n3 != 0) {
                        for (int i = v563350; i < n4; ++i) {
                            String string2 = object[i];
                            arrayList.add((String)((Object)IlIlO4.b("z", (int)14466, (long)(0x1C5C8FE5F2F8B48EL ^ l))) + string2);
                            if (n3 == 0) continue block0;
                            if (n3 != 0) continue;
                        }
                        object = ilIlvn.IlIli();
                        arrayList.add(this.IlIlG((String)object, IlIlrW.IlIlW((String)((Object)IlIlO4.b("z", (int)29498, (long)(0x20E508A1C99C7F3DL ^ l))) + (String)object), arrayList));
                        if (n3 != 0) continue;
                    }
                    break block8;
                }
                n2 = arrayList.isEmpty();
            }
            if (n3 != 0) {
                if (n2 != 0) {
                    return;
                }
                n2 = n = 0;
            }
            while (n < this.IlIlS) {
                this.IlIlt = this.IlIlS * this.IlIl_ + n;
                IlIlO4 ilIlO4 = this;
                if (n3 != 0) {
                    if (ilIlO4.IlIlt >= arrayList.size()) break;
                    ilIlO4 = arrayList.get(this.IlIlt);
                }
                if (ilIlO4 != null) {
                    this.IlIlf.addItem(new ItemStack[]{(ItemStack)arrayList.get(this.IlIlt)});
                }
                ++n;
                if (n3 != 0) continue;
            }
        });
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        IlIlO4.c = IlIls.a((long)7664915932372266702L, (long)1907288083263249856L, MethodHandles.lookup().lookupClass()).a(224689854321668L);
                        IlIlO4.j = new HashMap<K, V>(13);
                        var11 = IlIlO4.c ^ 1544024090525L;
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
                        var20_3 = new String[10];
                        var18_4 = 0;
                        var17_5 = "\u00f7\tW\u00e8\u00f6\u00be\u00e8\u0085\u00e1\u0019/\u00b5\\\u00f3&\u00be\u00a8\u00b2U\u00d1\u00cdW\u00b5\u00d8\u00dc\u009b\u00b4u\u00b1\u0019e=\u00c9]\u00c7K\u00e9\u00c9?\u00a5(\u00b8L\u00b80\u00ea\u00e2\u00b8\u00cb@\u00bf\u00a4\u0085\u00a5\u00abq\u00ae\u0083Y&k\u00bb\u00a55\u008c\"\u00fd\u00c4A!\u00aa\u007f\u00c5\u00e8\u001bw\u0098W\u000b\u00f0\u000f\u0010\u00aa_\u00c96E\u00baW\u00ba\u00e1\u0012\u0011\u001d\u0080\u0019\u00cf\u00a7(<\u00b7\u00c6;*\u0091A\f\u009e:\u00bb'\u00b4\u00f9\u00c2u\u0082L9C\u00b8:d\u0015P1\u000f\u00bfI.X\u0098X\u00e74\u00be`T\u00d2\r \u001e\u0002@Vf\u0000\u00a7\r\u00c3\u00f5&\u00f3\u00be\u0013\u00ff(\u0083\u0099\u00cd\u00cf\u00e5S\u00b8\u0002\u00ddS9\u008e\u000bu\u00d3\u00d6(\bQ\u0081\u0092%|\u0012\u00fc#_\u000e\u008b\u008f\u000f\u009a3\u00bdM;\u00cc\u00d6\u00ec\u00b2V\u00f6\u00e4\u00cc\u00d7\u00c9\u0084\u0099&\u00cf\u0090\u0019\u00e7\u0083/\u00166 ]\u00b2\u00d3_Y\u00f3\u00a2\u00d3\u00f4_\u0001\u00a4N?\u00d5\u00b9,\u0012\u00a0\u0081@\u00a1=\u009c\u0085\u0017\u0092\u008f\u0004\u00eb3\u00b5\u0010\u00f2\u0094\u00dc\u0000F\u00f1`r\u00b5\u0010/\u008b\u001c\u00a5\u00e5}";
                        var19_6 = "\u00f7\tW\u00e8\u00f6\u00be\u00e8\u0085\u00e1\u0019/\u00b5\\\u00f3&\u00be\u00a8\u00b2U\u00d1\u00cdW\u00b5\u00d8\u00dc\u009b\u00b4u\u00b1\u0019e=\u00c9]\u00c7K\u00e9\u00c9?\u00a5(\u00b8L\u00b80\u00ea\u00e2\u00b8\u00cb@\u00bf\u00a4\u0085\u00a5\u00abq\u00ae\u0083Y&k\u00bb\u00a55\u008c\"\u00fd\u00c4A!\u00aa\u007f\u00c5\u00e8\u001bw\u0098W\u000b\u00f0\u000f\u0010\u00aa_\u00c96E\u00baW\u00ba\u00e1\u0012\u0011\u001d\u0080\u0019\u00cf\u00a7(<\u00b7\u00c6;*\u0091A\f\u009e:\u00bb'\u00b4\u00f9\u00c2u\u0082L9C\u00b8:d\u0015P1\u000f\u00bfI.X\u0098X\u00e74\u00be`T\u00d2\r \u001e\u0002@Vf\u0000\u00a7\r\u00c3\u00f5&\u00f3\u00be\u0013\u00ff(\u0083\u0099\u00cd\u00cf\u00e5S\u00b8\u0002\u00ddS9\u008e\u000bu\u00d3\u00d6(\bQ\u0081\u0092%|\u0012\u00fc#_\u000e\u008b\u008f\u000f\u009a3\u00bdM;\u00cc\u00d6\u00ec\u00b2V\u00f6\u00e4\u00cc\u00d7\u00c9\u0084\u0099&\u00cf\u0090\u0019\u00e7\u0083/\u00166 ]\u00b2\u00d3_Y\u00f3\u00a2\u00d3\u00f4_\u0001\u00a4N?\u00d5\u00b9,\u0012\u00a0\u0081@\u00a1=\u009c\u0085\u0017\u0092\u008f\u0004\u00eb3\u00b5\u0010\u00f2\u0094\u00dc\u0000F\u00f1`r\u00b5\u0010/\u008b\u001c\u00a5\u00e5}".length();
                        var16_7 = 40;
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
                            var20_3[var18_4++] = IlIlO4.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "t\u00ee&W\u00d4\r@f\u008ai\n\u00b50\u00cb\u0015\u00cb\u0010e\u0086/\u0087o\u00ac\u00160\u0080\u00ad\u00c3\u00fb\u00d0\u00b9\u00bbJ";
                            var19_6 = "t\u00ee&W\u00d4\r@f\u008ai\n\u00b50\u00cb\u0015\u00cb\u0010e\u0086/\u0087o\u00ac\u00160\u0080\u00ad\u00c3\u00fb\u00d0\u00b9\u00bbJ".length();
                            var16_7 = 16;
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
                            var20_3[var18_4++] = IlIlO4.c(var21_9).intern();
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
                IlIlO4.h = var20_3;
                IlIlO4.i = new String[10];
                IlIlO4.p = new HashMap<K, V>(13);
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
                var4_14 = "3\u0015j#\u0003\u0019\u00b4e\b\u00ee\u00d75\u00fd\u001f5d";
                var5_15 = "3\u0015j#\u0003\u0019\u00b4e\b\u00ee\u00d75\u00fd\u001f5d".length();
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
        IlIlO4.n = var6_12;
        IlIlO4.o = new Integer[2];
    }

    private static String c(byte[] byArray) {
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7901;
        if (i[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])j.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlO4", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = h[n2].getBytes("ISO-8859-1");
            IlIlO4.i[n2] = IlIlO4.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlO4.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlO4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x41BD;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = IlIlO4.n[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])p.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    p.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlO4", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlO4.o[n2] = n3;
        }
        return o[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlO4.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlO4" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlO4.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlO4.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

