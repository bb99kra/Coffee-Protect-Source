/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
 *  org.bukkit.command.CommandSender
 *  org.bukkit.entity.Player
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_jf;
import me.nik.coffeeprotect.CP_ju;
import me.nik.coffeeprotect.CP_x5;
import me.nik.coffeeprotect.CP_xi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class CP_jK
extends CP_ju {
    private final CoffeeProtect CP_u;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String aevPbSffiv = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_jK(CoffeeProtect coffeeProtect) {
        this.CP_u = coffeeProtect;
    }

    @Override
    protected String CP_C() {
        long l = a ^ 0x7DD3BF008484L;
        return CP_jK.a("c", (int)4160, (long)(0x106D849AD02FA86FL ^ l));
    }

    @Override
    protected String CP_V() {
        long l = a ^ 0x68D2FDEEDE1DL;
        return CP_jK.a("c", (int)17187, (long)(0x39961CE2AAD72196L ^ l));
    }

    @Override
    protected String CP_d() {
        long l = a ^ 0x4285CAEE59CDL;
        return CP_jK.a("c", (int)23887, (long)(0x25A6D1B1903D382FL ^ l));
    }

    @Override
    protected String CP_a() {
        return CP_x5.INFO.CP_a();
    }

    @Override
    protected int CP_X() {
        return 2;
    }

    @Override
    protected boolean CP_r() {
        return true;
    }

    @Override
    protected void CP_M(CommandSender commandSender, String[] stringArray) {
        long l = a ^ 0x2B62FBF7727AL;
        Player player = Bukkit.getPlayer((String)stringArray[1]);
        boolean bl = CP_jf.CP_P();
        if (player == null) {
            return;
        }
        CP_TM ilIlTM = this.CP_u.CP_F().CP_R(player);
        if (bl) {
            if (ilIlTM == null) {
                return;
            }
            commandSender.sendMessage(CP_xi.INFO_COMMAND.CP_F().replace((CharSequence)((Object)CP_jK.a("c", (int)10974, (long)(0x26527611AE346408L ^ l))), CP_xi.PREFIX.CP_F()).replace((CharSequence)((Object)CP_jK.a("c", (int)32172, (long)(0x16C323F488CB3379L ^ l))), String.valueOf(ilIlTM.CP_p().CP_w())).replace((CharSequence)((Object)CP_jK.a("c", (int)21690, (long)(0x2A06BD67A67B1A62L ^ l))), String.valueOf(ilIlTM.CP_D().CP_w())).replace((CharSequence)((Object)CP_jK.a("c", (int)22523, (long)(0x1F94459F0A52192FL ^ l))), ilIlTM.CP_c()).replace((CharSequence)((Object)CP_jK.a("c", (int)17210, (long)(0x1A31E3A732DD0DE9L ^ l))), ilIlTM.CP_E().CP_r()).replace((CharSequence)((Object)CP_jK.a("c", (int)21319, (long)(0xF81D1BB23AD9D97L ^ l))), String.valueOf(ilIlTM.CP_O())));
        }
    }

    @Override
    protected List<String> CP_b(CommandSender commandSender, String[] stringArray) {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_jK.a = CP_s.a(6162244266829855877L, -8882539702687307592L, MethodHandles.lookup().lookupClass()).a(245656632585412L);
                CP_jK.d = new HashMap<K, V>(13);
                var0 = CP_jK.a ^ 62952211939296L;
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
                var9_3 = new String[9];
                var7_4 = 0;
                var6_5 = "\u00dei0\u00d7\n\u00ee6\u0000/n\u0011\u0099\u00b9\u00a8L\u00d1\u00ad>|\u00cf\u00b3Z\u001f\u0093\u0010\u00d4\u00b8\u00f2\u00d0c(\u00fa\u0013\u001bb\u00e5\u00c3+\u00dd/\u00a90?\b\u00f3fM\u0081\u00d1ci\u0092WX\u008beY\u00d5\u0095I\u00ee\u00c9\u0093~^\u00e6\u00f2\b\u00b2k\u0000\u00d2V\u00d8\u00eb7\u0085\u001e\u00d3T\u00f8dt\u00ad\u0013\u00fer\u0090\u00edd\u0018x\u00e7p\u0010\u00db\u00b1n\u00d2\u0019\u00a0\u0019\u00e3)\u00af\u001b\u0095\u00dc\u00e8n\u00d2\u00c5\u00ab\u00f6L r4\u00e9\u00c4?\u0010o4\u00f4S\u0006V\u001b\u009e\u008e\u00f4\u009d\u00b1\u00ae\u00f7(<\u001bm\u00e3l\u00e8:\f\u00cdk\u00ce\u0010U\u0001\u00ca!\u00db\u00d0\f\u000f\bgI\u00c9\u00ce8\u0000\u0005 \f\u0002\u00fb-\u001e\u009c\u00bb\u00cb\u00b3\u00c6$\u0096A\u009a\u00d2\u00dfi\u00ea\u00b0\u00b1\u00da\u00f1\u00ec\u00db\u00b0P\u00c6\u00b1\u00baf\u00d4\u00a4";
                var8_6 = "\u00dei0\u00d7\n\u00ee6\u0000/n\u0011\u0099\u00b9\u00a8L\u00d1\u00ad>|\u00cf\u00b3Z\u001f\u0093\u0010\u00d4\u00b8\u00f2\u00d0c(\u00fa\u0013\u001bb\u00e5\u00c3+\u00dd/\u00a90?\b\u00f3fM\u0081\u00d1ci\u0092WX\u008beY\u00d5\u0095I\u00ee\u00c9\u0093~^\u00e6\u00f2\b\u00b2k\u0000\u00d2V\u00d8\u00eb7\u0085\u001e\u00d3T\u00f8dt\u00ad\u0013\u00fer\u0090\u00edd\u0018x\u00e7p\u0010\u00db\u00b1n\u00d2\u0019\u00a0\u0019\u00e3)\u00af\u001b\u0095\u00dc\u00e8n\u00d2\u00c5\u00ab\u00f6L r4\u00e9\u00c4?\u0010o4\u00f4S\u0006V\u001b\u009e\u008e\u00f4\u009d\u00b1\u00ae\u00f7(<\u001bm\u00e3l\u00e8:\f\u00cdk\u00ce\u0010U\u0001\u00ca!\u00db\u00d0\f\u000f\bgI\u00c9\u00ce8\u0000\u0005 \f\u0002\u00fb-\u001e\u009c\u00bb\u00cb\u00b3\u00c6$\u0096A\u009a\u00d2\u00dfi\u00ea\u00b0\u00b1\u00da\u00f1\u00ec\u00db\u00b0P\u00c6\u00b1\u00baf\u00d4\u00a4".length();
                var5_7 = 24;
                var4_8 = -1;
lbl20:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl25:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_jK.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "B\u00a9\u00ba\u00b6\u0010\u00a7\u00f2\u00e3\u00d8i\u00c1\u0010\u00f1\u009b\u001f\u00a5\n\u00d6f|U\u00150iZ\u009e\u00efV\u00b0ae\u00bd4\u00b2\u00a6\u00fa\u00bb\u00a2\u00d2\u0092\u009d>\u00a8\u00cc\u008f\u0087I\u0088)\u00f0\u00d6\u00f7o\u001f\u00f1\u00f7 sN-s\u00a7\u00d4\u00e2\u001e\u00c9_\u00e5\u00b36r\u0095\u00f1\u00f1?\u0082i\u00abj\u00b2\u00ab\u00dfv\u00ee2\u00a1\u00ac\u0086L";
                    var8_6 = "B\u00a9\u00ba\u00b6\u0010\u00a7\u00f2\u00e3\u00d8i\u00c1\u0010\u00f1\u009b\u001f\u00a5\n\u00d6f|U\u00150iZ\u009e\u00efV\u00b0ae\u00bd4\u00b2\u00a6\u00fa\u00bb\u00a2\u00d2\u0092\u009d>\u00a8\u00cc\u008f\u0087I\u0088)\u00f0\u00d6\u00f7o\u001f\u00f1\u00f7 sN-s\u00a7\u00d4\u00e2\u001e\u00c9_\u00e5\u00b36r\u0095\u00f1\u00f1?\u0082i\u00abj\u00b2\u00ab\u00dfv\u00ee2\u00a1\u00ac\u0086L".length();
                    var5_7 = 56;
                    var4_8 = -1;
lbl34:
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
lbl39:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = CP_jK.a(var10_9).intern();
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
lbl51:
                // 1 sources

                ** continue;
            }
        }
        CP_jK.b = var9_3;
        CP_jK.c = new String[9];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x2558;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_jK", exception);
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
            CP_jK.c[n2] = CP_jK.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_jK.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_jK" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_jK.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
