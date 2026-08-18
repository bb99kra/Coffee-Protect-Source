/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.ChatColor
 *  org.bukkit.Material
 *  org.bukkit.entity.Player
 *  org.bukkit.event.inventory.InventoryClickEvent
 *  org.bukkit.inventory.ItemStack
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Li;
import me.nik.coffeeprotect.CP_Ls;
import me.nik.coffeeprotect.CP_O6;
import me.nik.coffeeprotect.CP_Og;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_Tz;
import me.nik.coffeeprotect.CP_fb;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.CP_uV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_u9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class CP_O7
extends CP_O6 {
    private static final CP_uV[] CP_e;
    private static final long c;
    private static final String[] h;
    private static final String[] i;
    private static final Map j;
    private static final long[] n;
    private static final Integer[] o;
    private static final Map p;
    private static transient /* synthetic */ String tlToScqaQN = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_O7(CP_Tz ilIlTz, CoffeeProtect coffeeProtect) {
        super(ilIlTz, coffeeProtect);
    }

    @Override
    protected String CP_O() {
        long l = c ^ 0xC9CBDC20670L;
        return CP_rW.CP_W((String)((Object)CP_O7.b("x", (int)27182, (long)(0x18005EF400573317L ^ l))));
    }

    @Override
    protected int CP_S() {
        long l = c ^ 0x5FA2B51C3B34L;
        return (int)CP_O7.d("s", (int)15665, (long)(0x79288CAFF538B8D3L ^ l));
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public void CP_a(InventoryClickEvent var1_1) {
        block17: {
            var2_2 = CP_O7.c ^ 67678073575665L;
            var5_3 = (Player)var1_1.getWhoClicked();
            var4_4 = CP_u9.CP_UnderScore();
            var6_5 = var1_1.getCurrentItem();
            v0 = var6_5.getItemMeta().hasDisplayName();
            if (var4_4 != 0) {
                if (v0 == 0) {
                    return;
                }
                v0 = CP_fb.CP_W[var6_5.getType().ordinal()];
            }
            switch (v0 ? 1 : 0) {
                case 1: {
                    var7_6 = ChatColor.stripColor((String)var6_5.getItemMeta().getDisplayName());
                    var8_7 = this.CP_A.CP_R().CP_S();
                    var9_8 = (String)CP_O7.b("x", (int)7065, (long)(6493627109869919273L ^ var2_2)) + var7_6.replace(" ", "_").toLowerCase() + (String)CP_O7.b("x", (int)8871, (long)(2946295344183092508L ^ var2_2));
                    v1 = var10_9 = var8_7.getBoolean(var9_8);
                    if (var4_4 != 0) {
                        v1 = v1 == false;
                    }
                    var8_7.set(var9_8, v1);
                    var8_7.CP_R();
                    var8_7.CP_H();
                    this.CP_A.CP_R().CP_m();
                    this.CP_A.CP_F().CP_O().values().forEach((Consumer<CP_TM>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)V, lambda$handleMenu$0(me.nik.coffeeprotect.CP_TM ), (Lme/nik/coffeeprotect/CP_TM;)V)());
                    this.getInventory().clear();
                    this.CP_X();
                    if (var4_4 != 0) break;
                }
                case 2: {
                    var5_3.closeInventory();
                    new CP_Og(this.CP_H, this.CP_A).CP_M();
                    if (var4_4 != 0) break;
                }
                case 3: {
                    var11_10 = ChatColor.stripColor((String)var6_5.getItemMeta().getDisplayName());
                    var12_11 = -1;
                    v2 = var11_10.hashCode();
                    if (var4_4 == 0) ** GOTO lbl49
                    switch (v2) {
                        case 473267736: {
                            v2 = (int)var11_10.equals(CP_O7.b("x", (int)11424, (long)(6739331754350160659L ^ var2_2)));
                            if (var4_4 == 0) break;
                            if (v2 == 0) ** GOTO lbl47
                            var12_11 = 0;
                            if (var4_4 != 0) ** GOTO lbl47
                        }
                        case -1133036644: {
                            v2 = (int)var11_10.equals(CP_O7.b("x", (int)13227, (long)(4581330799494706196L ^ var2_2)));
                            if (var4_4 == 0) break;
                            if (v2 != 0) {
                                var12_11 = 1;
                            }
                        }
lbl47:
                        // 6 sources

                        default: {
                            v2 = var12_11;
                        }
                    }
lbl49:
                    // 4 sources

                    if (var4_4 == 0) ** GOTO lbl55
                    switch (v2) {
                        case 0: {
                            v3 = this;
                            if (var4_4 == 0) ** GOTO lbl58
                            v2 = v3.CP_UnderScore;
lbl55:
                            // 2 sources

                            if (v2 == 0) break block17;
                            --this.CP_UnderScore;
                            v3 = this;
lbl58:
                            // 2 sources

                            super.CP_M();
                            if (var4_4 != 0) break block17;
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
        int n;
        ArrayList<String> arrayList;
        int n2;
        ArrayList<String> arrayList2;
        block10: {
            long l = c ^ 0x1F88A3EEED0AL;
            this.CP_s();
            arrayList2 = new ArrayList<String>();
            CP_uV[] ilIluVArray = CP_e;
            int n3 = ilIluVArray.length;
            int n4 = 0;
            n2 = CP_u9.CP_X();
            while (n4 < n3) {
                block11: {
                    CP_uV ilIluV = ilIluVArray[n4];
                    ArrayList<String> arrayList3 = new ArrayList<String>();
                    arrayList3.add("");
                    arrayList = arrayList3;
                    if (n2 != 0) break block10;
                    StringBuilder stringBuilder = new StringBuilder();
                    CallSite callSite = CP_O7.b("x", (int)9292, (long)(0x5F46C7AC593B160DL ^ l));
                    if (n2 == 0) {
                        stringBuilder = stringBuilder.append((String)((Object)callSite));
                        callSite = this.CP_A.CP_R().CP_S().getBoolean((String)((Object)CP_O7.b("x", (int)20934, (long)(0x114006C77EAE6383L ^ l))) + ilIluV.CP_Q().replace(" ", "_").toLowerCase() + (String)((Object)CP_O7.b("x", (int)23304, (long)(0x114B204088186945L ^ l)))) ? CP_O7.b("x", (int)28556, (long)(0x65F102CB3DE85DC3L ^ l)) : CP_O7.b("x", (int)2055, (long)(0x3FBC0F0776273A49L ^ l));
                    }
                    arrayList.add(stringBuilder.append((String)((Object)callSite)).toString());
                    arrayList3.add("");
                    arrayList3.add((String)((Object)CP_O7.b("x", (int)23900, (long)(0x158B8605E7EEEF16L ^ l))));
                    String string = CP_Li.CP_w(ilIluV.CP_B(), (int)CP_O7.d("s", (int)5098, (long)(0xCFB61F7D674C037L ^ l)));
                    for (String string2 : string.split(System.lineSeparator())) {
                        arrayList3.add((String)((Object)CP_O7.b("x", (int)30232, (long)(0x2D355ECCE52F4454L ^ l))) + string2);
                        if (n2 == 0) {
                            if (n2 == 0) continue;
                        }
                        break block11;
                    }
                    arrayList3.add("");
                    arrayList3.add((String)((Object)CP_O7.b("x", (int)27243, (long)(0x553D093939D4D822L ^ l))));
                    arrayList2.add((String)this.CP_q(Material.PAPER, (String)((Object)CP_O7.b("x", (int)16279, (long)(0x34F6EA9D35050DD5L ^ l))) + ilIluV.CP_Q(), arrayList3));
                    ++n4;
                }
                if (n2 == 0) continue;
            }
            arrayList = arrayList2;
        }
        int n5 = arrayList.isEmpty();
        if (n2 == 0) {
            if (n5 != 0) {
                return;
            }
            n5 = n = 0;
        }
        while (n < this.CP_S) {
            this.CP_t = this.CP_S * this.CP_UnderScore + n;
            CP_O7 ilIlO7 = this;
            if (n2 == 0) {
                if (ilIlO7.CP_t >= arrayList2.size()) break;
                ilIlO7 = arrayList2.get(this.CP_t);
            }
            if (ilIlO7 != null) {
                this.CP_f.addItem(new ItemStack[]{(ItemStack)arrayList2.get(this.CP_t)});
            }
            ++n;
            if (n2 == 0) continue;
        }
        if (PacketWrapper.CP_z() == null) {
            CP_u9.CP_q(++n2);
        }
    }

    private static /* synthetic */ void lambda$handleMenu$0(CP_TM ilIlTM) {
        ilIlTM.CP_G().CP_UnderScore();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block16: {
            block15: {
                block14: {
                    block13: {
                        CP_O7.c = CP_s.a(4493328048681377882L, 1610290395136635013L, MethodHandles.lookup().lookupClass()).a(86992126030616L);
                        CP_O7.j = new HashMap<K, V>(13);
                        var11 = CP_O7.c ^ 37496752894255L;
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
                        var20_3 = new String[14];
                        var18_4 = 0;
                        var17_5 = "\u00bd,YWO\u0087\u008e\u0004\u00f7\u00fe\u00e5\u00caa\u0003 \u0095\u0000\u0091\u00afL\u00d7,e\u00db)\"\u00a6\u0015\u00dc\u00ae\u00904\u001f\u00c9\u00a8\u00ed\u0013^w\u007f\u0086\u00f1\u00e8\u00eb&\u00c8F;\u0098\u0085o\b#\u00c2\u00a9\u00f5 \u000e\u00a9\u009f\u00e2\u0001B\u001a\u00ab\u0091\u00fe&\u00b2\u00c0c\u0089\u00c8#\u00d0\u00ceya\u0003\u00acR\u00f52\u00c1\u008fIJ\u00fa\u0016\u0010v\u009aG\u00b0\u001f\u00bb\u0093\u0006\u0015\u0095+Z\u0015y\u0083#({\u0097F\u00a4\u00a0u\u00b3\u00c8\u00d0\u0087\u00a5\u00a3\u001f\u009d\u001e\u00c0\u0000\u00ba\u0018\u00ac7\u00ddPA\u0011|\u00ff\u00bdP\u00b0\u0095hCg?'r\u00f2V\u00fa\u0018\u0086\u00cb\u0011k\u00a5\u00a4\u00c0\u001f\u00d5#\u00cc\u008b\u00aa<\u001e\u00c6A\u00cd\u00bf\u00c6\\SJ?\u0010#\u00ec\u00e0\u00cf\u00c6\u00c0N\u00efm-\u0094\u00a3P/\u0085\u0018\u0010\u009bHyk1\u0016y\u0092\u00df\u0099\u00eb\u0000'/m\u00ad\u0010\u00a4/\u00cbwp]\u0083\u008bn\u001f\u00fb\u009e\u00cc|Ah(\u008d\u00adb\u00ed\u00c4\u00f5y<\u00af\u00d5\u008a\u0090\u00a6jn\u00865\u00ec\u00e0|*LqQ\u0095\u00ec\u009f\\\"\u0017Lm\u00b84\u00bc\u0006\u00d0\r\u00ca. \u00c2\u00c0\u00d1pd\f\u008a\u00a4\u00be+0\u0017\u00d2.\u00f4\u0096\u00a9\u00eb\u0001\f\u00c9\u0012\u00c4\u00c1\u00ad\u00f6&.\u00b9\u0001U\u00c7\u0018\u0001a\u00cav\u00b2R!gp:\u0096\u00a7\u000e\u00b0\u00eb\u0018\u00803\u00b1,\u00f2--\u00e6\u0010\u00fa\u00b68(\\\u00c2{\u0015\u00e3\u00f9a4\u009b,\u00cb\u008e";
                        var19_6 = "\u00bd,YWO\u0087\u008e\u0004\u00f7\u00fe\u00e5\u00caa\u0003 \u0095\u0000\u0091\u00afL\u00d7,e\u00db)\"\u00a6\u0015\u00dc\u00ae\u00904\u001f\u00c9\u00a8\u00ed\u0013^w\u007f\u0086\u00f1\u00e8\u00eb&\u00c8F;\u0098\u0085o\b#\u00c2\u00a9\u00f5 \u000e\u00a9\u009f\u00e2\u0001B\u001a\u00ab\u0091\u00fe&\u00b2\u00c0c\u0089\u00c8#\u00d0\u00ceya\u0003\u00acR\u00f52\u00c1\u008fIJ\u00fa\u0016\u0010v\u009aG\u00b0\u001f\u00bb\u0093\u0006\u0015\u0095+Z\u0015y\u0083#({\u0097F\u00a4\u00a0u\u00b3\u00c8\u00d0\u0087\u00a5\u00a3\u001f\u009d\u001e\u00c0\u0000\u00ba\u0018\u00ac7\u00ddPA\u0011|\u00ff\u00bdP\u00b0\u0095hCg?'r\u00f2V\u00fa\u0018\u0086\u00cb\u0011k\u00a5\u00a4\u00c0\u001f\u00d5#\u00cc\u008b\u00aa<\u001e\u00c6A\u00cd\u00bf\u00c6\\SJ?\u0010#\u00ec\u00e0\u00cf\u00c6\u00c0N\u00efm-\u0094\u00a3P/\u0085\u0018\u0010\u009bHyk1\u0016y\u0092\u00df\u0099\u00eb\u0000'/m\u00ad\u0010\u00a4/\u00cbwp]\u0083\u008bn\u001f\u00fb\u009e\u00cc|Ah(\u008d\u00adb\u00ed\u00c4\u00f5y<\u00af\u00d5\u008a\u0090\u00a6jn\u00865\u00ec\u00e0|*LqQ\u0095\u00ec\u009f\\\"\u0017Lm\u00b84\u00bc\u0006\u00d0\r\u00ca. \u00c2\u00c0\u00d1pd\f\u008a\u00a4\u00be+0\u0017\u00d2.\u00f4\u0096\u00a9\u00eb\u0001\f\u00c9\u0012\u00c4\u00c1\u00ad\u00f6&.\u00b9\u0001U\u00c7\u0018\u0001a\u00cav\u00b2R!gp:\u0096\u00a7\u000e\u00b0\u00eb\u0018\u00803\u00b1,\u00f2--\u00e6\u0010\u00fa\u00b68(\\\u00c2{\u0015\u00e3\u00f9a4\u009b,\u00cb\u008e".length();
                        var16_7 = 56;
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
                            var20_3[var18_4++] = CP_O7.c(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00c6[G\bJ:\u00f2\u00acQ\u00a7\u00bcJ{\u00c5\u00cb\n X\u0083T1\u00d2\u007f\u0014\u00a4\u000e\u00df\u00fc\u00c0\u0006\b( \u00a6\u00c5\u00a8r\u009f$c|^\u00cf\u00e3\u00a9\u00d1\u00bd\u0098\u00a7";
                            var19_6 = "\u00c6[G\bJ:\u00f2\u00acQ\u00a7\u00bcJ{\u00c5\u00cb\n X\u0083T1\u00d2\u007f\u0014\u00a4\u000e\u00df\u00fc\u00c0\u0006\b( \u00a6\u00c5\u00a8r\u009f$c|^\u00cf\u00e3\u00a9\u00d1\u00bd\u0098\u00a7".length();
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
                            var20_3[var18_4++] = CP_O7.c(var21_9).intern();
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
                CP_O7.h = var20_3;
                CP_O7.i = new String[14];
                CP_O7.p = new HashMap<K, V>(13);
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
                var4_14 = "kCAl;\u00d0\u00ec\u00f2\\Y\u00f9\u0011\u00d4\n\u0098\u0094";
                var5_15 = "kCAl;\u00d0\u00ec\u00f2\\Y\u00f9\u0011\u00d4\n\u0098\u0094".length();
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
        CP_O7.n = var6_12;
        CP_O7.o = new Integer[2];
        CP_O7.CP_e = new CP_Ls(null).CP_U();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x22D9;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_O7", exception);
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
            CP_O7.i[n2] = CP_O7.c(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return i[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_O7.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_O7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x434D;
        if (o[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = CP_O7.n[n2];
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_O7", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_O7.o[n2] = n3;
        }
        return o[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_O7.d(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_O7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_O7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_O7.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
