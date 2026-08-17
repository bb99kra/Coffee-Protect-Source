/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlu9
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Material
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
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlO7;
import me.nik.coffeeprotect.IlIlOB;
import me.nik.coffeeprotect.IlIlOX;
import me.nik.coffeeprotect.IlIlOx;
import me.nik.coffeeprotect.IlIlTz;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlu9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class IlIlOg
extends IlIlOX {
    private static final long b;
    private static final String[] c;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static transient /* synthetic */ String yVVicLipXq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlOg(IlIlTz ilIlTz, CoffeeProtect coffeeProtect) {
        super(ilIlTz, coffeeProtect);
    }

    @Override
    protected String IlIlO() {
        long l = b ^ 0x7E0C2CF66BBCL;
        return IlIlrW.IlIlW((String)((Object)IlIlOg.a("b", (int)7302, (long)(0x54020E60E9447E51L ^ l))));
    }

    @Override
    protected int IlIlS() {
        long l = b ^ 0x2D32242856F8L;
        return (int)IlIlOg.b("z", (int)19189, (long)(0x287589363C686C42L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void IlIla(InventoryClickEvent var1_1) {
        var2_2 = IlIlOg.b ^ 86986354111805L;
        var5_3 = (Player)var1_1.getWhoClicked();
        var4_4 = IlIlu9.IlIlX();
        if (var4_4 != 0) ** GOTO lbl8
        switch (var1_1.getSlot()) {
            case 31: {
                var5_3.closeInventory();
lbl8:
                // 2 sources

                if (var4_4 == 0) break;
            }
            case 11: {
                var5_3.closeInventory();
                new IlIlO7(this.IlIlH, this.IlIlA).IlIlM();
                if (var4_4 == 0) break;
            }
            case 13: {
                var5_3.closeInventory();
                new IlIlOx(this.IlIlH, this.IlIlA).IlIlM();
                if (var4_4 == 0) break;
            }
            case 15: {
                var5_3.closeInventory();
                if (var4_4 != 0) ** GOTO lbl22
                if (!this.IlIlA.IlIlZ().IlIlD()) ** GOTO lbl23
                var5_3.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIlOg.a("b", (int)9175, (long)(3426571942443032454L ^ var2_2)));
lbl22:
                // 2 sources

                return;
lbl23:
                // 1 sources

                new IlIlOB(this.IlIlH, this.IlIlA).IlIlM();
            }
        }
    }

    @Override
    protected void IlIlX() {
        long l = b ^ 0x6D1832DA80C6L;
        ItemStack itemStack = this.IlIlq(Material.BARRIER, (String)((Object)IlIlOg.a("b", (int)27533, (long)(0x20F6D3611028E226L ^ l))), null);
        this.IlIlf.setItem((int)IlIlOg.b("z", (int)14419, (long)(0x5DC4F45B8C6448DFL ^ l)), itemStack);
        ItemStack itemStack2 = this.IlIlq(Material.BOOK, (String)((Object)IlIlOg.a("b", (int)5532, (long)(0x4F9A4582E5659C33L ^ l))), null);
        int n = IlIlu9.IlIlX();
        this.IlIlf.setItem((int)IlIlOg.b("z", (int)23366, (long)(0x42484B54D6A6ABC8L ^ l)), itemStack2);
        ItemStack itemStack3 = this.IlIlq(Material.BOOK, (String)((Object)IlIlOg.a("b", (int)26562, (long)(0x7D12BC8EA6B2EE6CL ^ l))), null);
        this.IlIlf.setItem((int)IlIlOg.b("z", (int)15623, (long)(0x5273C1322B5A4D8AL ^ l)), itemStack3);
        int n2 = n;
        ItemStack itemStack4 = this.IlIlq(Material.BOOK, (String)((Object)IlIlOg.a("b", (int)10637, (long)(0x7AE1B638634A2021L ^ l))), null);
        this.IlIlf.setItem((int)IlIlOg.b("z", (int)32148, (long)(0x1F93902B1BD48D1BL ^ l)), itemStack4);
        if (n2 != 0) {
            PacketWrapper.IlIle((int[])new int[2]);
        }
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        IlIlOg.b = IlIls.a((long)2711815659502703071L, (long)1319327171705422221L, MethodHandles.lookup().lookupClass()).a(131632736193633L);
                        IlIlOg.f = new HashMap<K, V>(13);
                        var11 = IlIlOg.b ^ 118140955127826L;
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
                        var20_3 = new String[6];
                        var18_4 = 0;
                        var17_5 = "\u00e5\u0086\u00d7`\u00db\u00b2\u00d1J=\u00b6y[\u00b8\b\u00df\u0089J\u00b1u\u0082\u00fcBC\u0086W\u00a9\u00dc\u00f1\u0083\u00df\u00e0\u00d7 \u00ef;\u008d|\u00e2\u0082\u00ae\u009c\u00fb\\\u00ea\u009b\rl\u00a4%\u00a9H\u000e\u00ad\u00a1=\u00fe\u00e7\u00a6%\u00eb\u00cbi\u0095\u00b1\u00cf\u0018\u001a\u0019NzAH\u00af?E\u00b4\u00c1\u0088G\u0019&\u0091\u009eV:R\u0093\u00ddf}(\u00e8\u00a6\u00d4\u00d8\u00e6\u00b8U\u00af\u0086'\u00d7\u0016\u00c9\u00dd\u00c5s\u00b1\u00e7\u00ab{\u00f4BfE\u00c8_{\u00fc\u00ce5\u0084\u00f7\u0002\u00f2&\u0015\u00a7\u00e6(4";
                        var19_6 = "\u00e5\u0086\u00d7`\u00db\u00b2\u00d1J=\u00b6y[\u00b8\b\u00df\u0089J\u00b1u\u0082\u00fcBC\u0086W\u00a9\u00dc\u00f1\u0083\u00df\u00e0\u00d7 \u00ef;\u008d|\u00e2\u0082\u00ae\u009c\u00fb\\\u00ea\u009b\rl\u00a4%\u00a9H\u000e\u00ad\u00a1=\u00fe\u00e7\u00a6%\u00eb\u00cbi\u0095\u00b1\u00cf\u0018\u001a\u0019NzAH\u00af?E\u00b4\u00c1\u0088G\u0019&\u0091\u009eV:R\u0093\u00ddf}(\u00e8\u00a6\u00d4\u00d8\u00e6\u00b8U\u00af\u0086'\u00d7\u0016\u00c9\u00dd\u00c5s\u00b1\u00e7\u00ab{\u00f4BfE\u00c8_{\u00fc\u00ce5\u0084\u00f7\u0002\u00f2&\u0015\u00a7\u00e6(4".length();
                        var16_7 = 32;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIlOg.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u001e\u009a`\u0091\n\u00df\u00f0h~h1M:x\u008c\u00f6\u00f4gO\u00f35<\u00c7$\u00d41`\u0083*\u00ad\u0011\u00fe\u00e9\"\u00a0\u001dcb\u00dc`\u00fd\u00d3\u00e1\u00e3\u00ca\u0001]D\u00ccv\u00b3\u00efR8'A\u00b6g_Y\u00f4WV\u00c8\u00c1\u00e8\u001bi\u00e0\u007f\u00a8:R\u0018\u00ecbn\u00fc\u00d6\u00e1\u0010\u00b4\u0018\u000b\u009b\u00db\u00b9\u00f4\u00e0*+\u00e7\u0004\u001a!\u0012\u00ff";
                            var19_6 = "\u001e\u009a`\u0091\n\u00df\u00f0h~h1M:x\u008c\u00f6\u00f4gO\u00f35<\u00c7$\u00d41`\u0083*\u00ad\u0011\u00fe\u00e9\"\u00a0\u001dcb\u00dc`\u00fd\u00d3\u00e1\u00e3\u00ca\u0001]D\u00ccv\u00b3\u00efR8'A\u00b6g_Y\u00f4WV\u00c8\u00c1\u00e8\u001bi\u00e0\u007f\u00a8:R\u0018\u00ecbn\u00fc\u00d6\u00e1\u0010\u00b4\u0018\u000b\u009b\u00db\u00b9\u00f4\u00e0*+\u00e7\u0004\u001a!\u0012\u00ff".length();
                            var16_7 = 80;
                            var15_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var15_8;
                                v4 = var17_5.substring(v6, v6 + var16_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIlOg.b(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            break block19;
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
                IlIlOg.c = var20_3;
                IlIlOg.e = new String[6];
                IlIlOg.i = new HashMap<K, V>(13);
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
                var6_12 = new long[5];
                var3_13 = 0;
                var4_14 = "\u0087%\u00ad\u00b3\u00f9\u00ef\u001c\b\u00d3\u00b5\u00d9\u00a3}\u00bc\u00d9S\u00ee\u00e3:\u00be\u0019w\u0089\u00df";
                var5_15 = "\u0087%\u00ad\u00b3\u00f9\u00ef\u001c\b\u00d3\u00b5\u00d9\u00a3}\u00bc\u00d9S\u00ee\u00e3:\u00be\u0019w\u0089\u00df".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block20;
                    break;
                }
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u001c99\u00bbi_\u0096\u00e7\u00c3\u00fe\u0000\u0017[\u00bcb\u0006";
                    var5_15 = "\u001c99\u00bbi_\u0096\u00e7\u00c3\u00fe\u0000\u0017[\u00bcb\u0006".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block20;
                        break;
                    }
                    break;
                }
lbl91:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block21;
                    break;
                }
            }
            var8_18 = v12;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v14 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v13) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl104:
                // 1 sources

                ** continue;
            }
        }
        IlIlOg.g = var6_12;
        IlIlOg.h = new Integer[5];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x193E;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlOg", exception);
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
            IlIlOg.e[n2] = IlIlOg.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlOg.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlOg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x601D;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlOg", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlOg.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlOg.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlOg" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlOg.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlOg.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

