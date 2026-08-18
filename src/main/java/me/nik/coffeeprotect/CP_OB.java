/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
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
import me.nik.coffeeprotect.CP_Li;
import me.nik.coffeeprotect.CP_O6;
import me.nik.coffeeprotect.CP_Og;
import me.nik.coffeeprotect.CP_Qb;
import me.nik.coffeeprotect.CP_Tz;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_vn;
import me.nik.coffeeprotect.CP_vy;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_u9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class CP_OB
extends CP_O6 {
    private static final long c;
    private static final String[] h;
    private static final String[] i;
    private static final Map j;
    private static final long[] n;
    private static final Integer[] o;
    private static final Map p;
    private static transient /* synthetic */ String KtlpfnqfBX = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_OB(CP_Tz ilIlTz, CoffeeProtect coffeeProtect) {
        super(ilIlTz, coffeeProtect);
    }

    @Override
    protected String CP_O() {
        long l = c ^ 0x3E41AF830AD9L;
        return CP_rW.CP_W((String)((Object)CP_OB.b("j", (int)15400, (long)(0x637EE12CBBA002F6L ^ l))));
    }

    @Override
    protected int CP_S() {
        long l = c ^ 0x6D7FA75D379DL;
        return (int)CP_OB.d("w", (int)24598, (long)(0x528368B2F26FBA2EL ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_a(InventoryClickEvent var1_1) {
        block15: {
            var2_2 = CP_OB.c ^ 16838784832600L;
            var5_3 = (Player)var1_1.getWhoClicked();
            var4_4 = CP_u9.CP_X();
            var6_5 = var1_1.getCurrentItem();
            v0 = var6_5.getItemMeta().hasDisplayName();
            if (var4_4 == 0) {
                if (v0 == 0) {
                    return;
                }
                v0 = CP_vy.CP_u[var6_5.getType().ordinal()];
            }
            switch (v0 ? 1 : 0) {
                case 1: {
                    var5_3.closeInventory();
                    new CP_Og(this.CP_H, this.CP_A).CP_M();
                    if (var4_4 == 0) break;
                }
                case 2: {
                    var7_6 = ChatColor.stripColor((String)var6_5.getItemMeta().getDisplayName());
                    var8_7 = -1;
                    v1 = var7_6.hashCode();
                    if (var4_4 != 0) ** GOTO lbl34
                    switch (v1) {
                        case 473267736: {
                            v1 = (int)var7_6.equals(CP_OB.b("j", (int)2929, (long)(5925090384039602984L ^ var2_2)));
                            if (var4_4 != 0) break;
                            if (v1 == 0) ** GOTO lbl32
                            var8_7 = 0;
                            if (var4_4 == 0) ** GOTO lbl32
                        }
                        case -1133036644: {
                            v1 = (int)var7_6.equals(CP_OB.b("j", (int)25517, (long)(1282433131982685173L ^ var2_2)));
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
                            v1 = v2.CP_UnderScore;
lbl40:
                            // 2 sources

                            if (v1 == 0) break block15;
                            --this.CP_UnderScore;
                            v2 = this;
lbl43:
                            // 2 sources

                            super.CP_M();
                            if (var4_4 == 0) break block15;
                        }
                        case 1: {
                            ++this.CP_UnderScore;
                            super.CP_M();
                        }
                    }
                }
            }
        }
    }

    @Override
    protected void CP_X() {
        this.CP_s();
        this.CP_f.setMaxStackSize(1);
        ArrayList arrayList = new ArrayList();
        CP_Qb.CP_t(() -> {
            int n;
            int n2;
            int n3;
            block8: {
                long l = c ^ 0x2B59E73AFBC1L;
                Iterator<CP_vn> iterator = this.CP_A.CP_Z().CP_E().CP_z().iterator();
                n3 = CP_u9.CP_UnderScore();
                block0: while (iterator.hasNext()) {
                    CP_vn ilIlvn = iterator.next();
                    ArrayList<String> arrayList = new ArrayList<String>();
                    arrayList.add("");
                    arrayList.add((String)((Object)CP_OB.b("j", (int)30929, (long)(0x26ED338194D8B712L ^ l))) + ilIlvn.CP_d());
                    arrayList.add("");
                    arrayList.add((String)((Object)CP_OB.b("j", (int)13634, (long)(0x5F44C1DE27277A87L ^ l))) + ilIlvn.CP_j());
                    arrayList.add("");
                    arrayList.add((String)((Object)CP_OB.b("j", (int)6877, (long)(0x14E99264203ED51FL ^ l))) + ilIlvn.CP_L());
                    arrayList.add("");
                    arrayList.add((String)((Object)CP_OB.b("j", (int)18597, (long)(0x23BC8C2617ED8762L ^ l))));
                    String string = CP_Li.CP_w(ilIlvn.CP_J(), (int)CP_OB.d("w", (int)26018, (long)(0x1FBC9BC1234EF3C7L ^ l)));
                    Object object = string.split(System.lineSeparator());
                    int n4 = ((String[])object).length;
                    n2 = 0;
                    if (n3 != 0) {
                        for (int i = v143; i < n4; ++i) {
                            String string2 = object[i];
                            arrayList.add((String)((Object)CP_OB.b("j", (int)32591, (long)(0x54CDF8212A25B080L ^ l))) + string2);
                            if (n3 == 0) continue block0;
                            if (n3 != 0) continue;
                        }
                        object = ilIlvn.CP_i();
                        arrayList.add(this.CP_G((String)object, CP_rW.CP_W((String)((Object)CP_OB.b("j", (int)17382, (long)(0x3BD80E97C6D18C22L ^ l))) + (String)object), arrayList));
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
            while (n < this.CP_S) {
                this.CP_t = this.CP_S * this.CP_UnderScore + n;
                CP_OB ilIlOB = this;
                if (n3 != 0) {
                    if (ilIlOB.CP_t >= arrayList.size()) break;
                    ilIlOB = arrayList.get(this.CP_t);
                }
                if (ilIlOB != null) {
                    this.CP_f.addItem(new ItemStack[]{(ItemStack)arrayList.get(this.CP_t)});
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
                        CP_OB.c = CP_s.a(-3302391859386364708L, 3357223510295165665L, MethodHandles.lookup().lookupClass()).a(169945690744208L);
                        CP_OB.j = new HashMap<K, V>(13);
                        var11 = CP_OB.c ^ 124416686464969L;
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
                        var17_5 = "\u0081\u0084\u00c8\u008a\u0087c\\\u0099`)l\u00ee|\u00ad\u00da\u0096-V\u00b4\u00e2\t\u00d24\u00b7\u0091\u00beL7\u00ac\u00cd\u00c6#@d\u00e7\u00e5N\u0015g\u00a6 \u00ee4\u00f5\u0089\u00f9C\u00f8\u00c9\u00c8\f\u00de\u00f0\u0084\u009f\u0085\u00c2\u0094\u0016=4\u00e1\u0001\u00ac\u0003X!?\u00d9D\u00b0(\u00e2(*\u00be\u00a0\u0018\u00c8k\u00db\u000e0\u00bc\u000b\u0089Qv#\u0005\u00e0\u0083r\u0096-\u00bd\u009a7\u00f6\u00f7\u00a6\u008b\u00dd\u0085T\u00ce\u0004\u0087\u00c51o)\u00b0\u00b0\u0010\u00f7\"\u00bb\u00df@;\u00bd\u00f2\u009e\u00ceR\u00fc\u00e4\u00e0\u00ef\u0019(\u00df\u001f@V\u00c3\u0014`9S/\u009c\u00ec\u0089\u00f7r\u00f7\u00d7'\u0017\u0080\u00d4\u0010`\u00fe\u008c\u0013 ]E\u00f3\u00de\u00c2\u0082:\u00ef.\u00814Fe(\u00ff\u00e0\u00d1\u00a4\u00fdo\u00af\u009c_0\u0091T;\u0099\u00cf\u00a3\u00f9\u00fek\u00ce{\u00acw\u00ac\bY5\u00e5\u00d3\u0000\u0006eMn\u00d3\u00b6\u0014|\u001fy VT\u00a7\u00cc\\\u00c2\u00c9\u00c6\u001d!\u00a5\u0004\u001a\u009dp\u00a3\u00cc(\u00b6X;h\u0090\u0016\u00dfj\u00f8\u00aeL?\u00a5U";
                        var19_6 = "\u0081\u0084\u00c8\u008a\u0087c\\\u0099`)l\u00ee|\u00ad\u00da\u0096-V\u00b4\u00e2\t\u00d24\u00b7\u0091\u00beL7\u00ac\u00cd\u00c6#@d\u00e7\u00e5N\u0015g\u00a6 \u00ee4\u00f5\u0089\u00f9C\u00f8\u00c9\u00c8\f\u00de\u00f0\u0084\u009f\u0085\u00c2\u0094\u0016=4\u00e1\u0001\u00ac\u0003X!?\u00d9D\u00b0(\u00e2(*\u00be\u00a0\u0018\u00c8k\u00db\u000e0\u00bc\u000b\u0089Qv#\u0005\u00e0\u0083r\u0096-\u00bd\u009a7\u00f6\u00f7\u00a6\u008b\u00dd\u0085T\u00ce\u0004\u0087\u00c51o)\u00b0\u00b0\u0010\u00f7\"\u00bb\u00df@;\u00bd\u00f2\u009e\u00ceR\u00fc\u00e4\u00e0\u00ef\u0019(\u00df\u001f@V\u00c3\u0014`9S/\u009c\u00ec\u0089\u00f7r\u00f7\u00d7'\u0017\u0080\u00d4\u0010`\u00fe\u008c\u0013 ]E\u00f3\u00de\u00c2\u0082:\u00ef.\u00814Fe(\u00ff\u00e0\u00d1\u00a4\u00fdo\u00af\u009c_0\u0091T;\u0099\u00cf\u00a3\u00f9\u00fek\u00ce{\u00acw\u00ac\bY5\u00e5\u00d3\u0000\u0006eMn\u00d3\u00b6\u0014|\u001fy VT\u00a7\u00cc\\\u00c2\u00c9\u00c6\u001d!\u00a5\u0004\u001a\u009dp\u00a3\u00cc(\u00b6X;h\u0090\u0016\u00dfj\u00f8\u00aeL?\u00a5U".length();
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
                            var20_3[var18_4++] = CP_OB.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "6\u00ce\u00db*\u0090U\u0017'\u00fd\u0095\u00cf\t\u0086\u0000z\u00c8\u0005\u00f1\u00bc\u00fd\u00ce\u00bd\u00ce\u008d\u001a/7Uy\u00b8\u00daD\u0010\u00bb\u00fc\u00e9\u00f9\u0000n\u009f\u0086\u0080+\u00e2\u00a3+\u0018k\b";
                            var19_6 = "6\u00ce\u00db*\u0090U\u0017'\u00fd\u0095\u00cf\t\u0086\u0000z\u00c8\u0005\u00f1\u00bc\u00fd\u00ce\u00bd\u00ce\u008d\u001a/7Uy\u00b8\u00daD\u0010\u00bb\u00fc\u00e9\u00f9\u0000n\u009f\u0086\u0080+\u00e2\u00a3+\u0018k\b".length();
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
                            var20_3[var18_4++] = CP_OB.c(var21_9).intern();
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
                CP_OB.h = var20_3;
                CP_OB.i = new String[9];
                CP_OB.p = new HashMap<K, V>(13);
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
                var4_14 = "\u0013\u00dd\u0005H'|;2\u00f9\u0012\u008eA\u0093#\u001f,";
                var5_15 = "\u0013\u00dd\u0005H'|;2\u00f9\u0012\u008eA\u0093#\u001f,".length();
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
        CP_OB.n = var6_12;
        CP_OB.o = new Integer[2];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4535;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_OB", exception);
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
            CP_OB.i[n2] = CP_OB.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_OB.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_OB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1C97;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = CP_OB.n[n2];
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_OB", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_OB.o[n2] = n3;
        }
        return o[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_OB.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_OB" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_OB.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_OB.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
