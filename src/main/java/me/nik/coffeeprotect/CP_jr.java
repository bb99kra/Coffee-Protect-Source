/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Color
 *  org.bukkit.command.CommandSender
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
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_PA;
import me.nik.coffeeprotect.CP_jf;
import me.nik.coffeeprotect.CP_jp;
import me.nik.coffeeprotect.CP_ju;
import me.nik.coffeeprotect.CP_x5;
import me.nik.coffeeprotect.CP_xi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Color;
import org.bukkit.command.CommandSender;

public class CP_jr
extends CP_ju {
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String ZxLwMSadfo = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    @Override
    protected String CP_C() {
        long l = a ^ 0x7577A168949BL;
        return CP_jr.a("e", (int)17994, (long)(0x32F816C3F582DE1EL ^ l));
    }

    @Override
    protected String CP_V() {
        long l = a ^ 0x6076E386CE02L;
        return CP_jr.a("e", (int)12568, (long)(0x28F45BE8C2E5F3D0L ^ l));
    }

    @Override
    protected String CP_d() {
        long l = a ^ 0x4A21D48649D2L;
        return CP_jr.a("e", (int)19381, (long)(0x6BDA866DEE528EABL ^ l));
    }

    @Override
    protected String CP_a() {
        return CP_x5.DISCORD.CP_a();
    }

    @Override
    protected int CP_X() {
        return 1;
    }

    @Override
    protected boolean CP_r() {
        return true;
    }

    @Override
    protected void CP_M(CommandSender commandSender, String[] stringArray) {
        long l;
        block6: {
            block5: {
                l = a ^ 0x23C6E59F6265L;
                boolean bl = CP_jf.CP_J();
                CP_Oq ilIlOq = CP_Oq.DISCORD_ENABLED;
                if (!bl) {
                    if (!ilIlOq.CP_t()) {
                        commandSender.sendMessage(CP_xi.PREFIX.CP_F() + (String)((Object)CP_jr.a("e", (int)32380, (long)(0x4E11B7E9F22010D4L ^ l))));
                        return;
                    }
                    ilIlOq = CP_Oq.DISCORD_WEBHOOK_URL;
                }
                String string = ilIlOq.CP_d();
                if (bl) break block5;
                if (string != null && !string.isEmpty()) break block6;
                commandSender.sendMessage(CP_xi.PREFIX.CP_F() + (String)((Object)CP_jr.a("e", (int)23756, (long)(0x33833975738DB260L ^ l))));
            }
            return;
        }
        new CP_PA(CP_Oq.DISCORD_WEBHOOK_URL.CP_d(), new CP_jp().CP_UnderScore((String)((Object)CP_jr.a("e", (int)6237, (long)(0x2400D94FE57076F3L ^ l)))).CP_i((String)((Object)CP_jr.a("e", (int)3302, (long)(0x491EF0278505E24BL ^ l)))).CP_k(Color.YELLOW).CP_W((String)((Object)CP_jr.a("e", (int)22747, (long)(0x74759DD3C633670L ^ l))), CP_Oq.SERVER_NAME.CP_d())).CP_p();
        commandSender.sendMessage(CP_xi.PREFIX.CP_F() + (String)((Object)CP_jr.a("e", (int)18717, (long)(0x2F037094D76827BFL ^ l))));
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
                CP_jr.a = CP_s.a(-6700695246633520627L, 3604114385589826165L, MethodHandles.lookup().lookupClass()).a(220679045146703L);
                CP_jr.d = new HashMap<K, V>(13);
                var0 = CP_jr.a ^ 113187117086928L;
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
                var6_5 = "\u009d\u00b9\u00ea\u0085\u00b4\u00c3.\u00df\r\u00f8\u0015\u00c3\u0081\u00d3\u00bbG\u0010\u0015\u008cB/og\u0016t\u00c2\u00ab\u0006Y\u001b\u00cc0M0\u008f\u00c7\u0080u\u000b\u008a\u00e2\u00dcr_\u00aeT:\u00dc\u00d9/\u00f5\u00f0\u0018\u00c8\u0087:\u0090\u0083\u009b\u00e3Ov\u00cc\u00e1.?\u00cb\u00e3P9f\u00e51\u008e\u0015\u001d\n)Q\u00ccR\u00d7(^\u00da\u00ef\u000b\u00c5\u00c9R\u00c4\u00edhj\u00e7\u00d3\u00bdd\u0012\u00ebo\u0019\u00de\u0001\u00d9\u00e6[\u00a2\u007f\u00bd_lFN\u00e8\u0014\u0090X\u00da\u00c5\u00eax\u00ab\u0018\u0012\u00dc8,\u00c4,D\u00a9\u00b2W\u00echg\u0096y\u0080\u008f\\\u0014\u0089\u00ad\u00d4\u00b1\u00e4P\u00c4@\u0097\u00bf\u00cb\u0019\u00da\u00d5\u00a9\u0084\u00d6c\u00f8\u00f55\u00e4\u0002\u009f4\u0095%9\u00d9\u0098\u00f1\u009e\u00e6\u001b\u0006Q\u00f5\u00c1\b\u00ec?b\u00b2\u00ef\u00b1\u00eaM\u00d9\u00f9\u0080]V\u00d0qgyu\u0011\u0016^\u0018\u001a\u00c9I\n\u00d9\u008dA\u009f-^\u00cd\u001f#\u00bfb\u0085\u009c\u00bb\"w\u001e\u0003\u0005\u00c9\u00bd0H\u0012\u00b8\u00b0\u00a5(N\u00db\u0087\u0017^5\u0015\u0019$>\u0097m\u00fa\u009b\u00f8\u00ba\u0013\u00c2;\u0098^\u0015\u00ea9\u00e9\u00ab\u00faK-\u00dd\u00eeCd\\\u00ad\u00f6<\u00e6!\u008e6\u000f";
                var8_6 = "\u009d\u00b9\u00ea\u0085\u00b4\u00c3.\u00df\r\u00f8\u0015\u00c3\u0081\u00d3\u00bbG\u0010\u0015\u008cB/og\u0016t\u00c2\u00ab\u0006Y\u001b\u00cc0M0\u008f\u00c7\u0080u\u000b\u008a\u00e2\u00dcr_\u00aeT:\u00dc\u00d9/\u00f5\u00f0\u0018\u00c8\u0087:\u0090\u0083\u009b\u00e3Ov\u00cc\u00e1.?\u00cb\u00e3P9f\u00e51\u008e\u0015\u001d\n)Q\u00ccR\u00d7(^\u00da\u00ef\u000b\u00c5\u00c9R\u00c4\u00edhj\u00e7\u00d3\u00bdd\u0012\u00ebo\u0019\u00de\u0001\u00d9\u00e6[\u00a2\u007f\u00bd_lFN\u00e8\u0014\u0090X\u00da\u00c5\u00eax\u00ab\u0018\u0012\u00dc8,\u00c4,D\u00a9\u00b2W\u00echg\u0096y\u0080\u008f\\\u0014\u0089\u00ad\u00d4\u00b1\u00e4P\u00c4@\u0097\u00bf\u00cb\u0019\u00da\u00d5\u00a9\u0084\u00d6c\u00f8\u00f55\u00e4\u0002\u009f4\u0095%9\u00d9\u0098\u00f1\u009e\u00e6\u001b\u0006Q\u00f5\u00c1\b\u00ec?b\u00b2\u00ef\u00b1\u00eaM\u00d9\u00f9\u0080]V\u00d0qgyu\u0011\u0016^\u0018\u001a\u00c9I\n\u00d9\u008dA\u009f-^\u00cd\u001f#\u00bfb\u0085\u009c\u00bb\"w\u001e\u0003\u0005\u00c9\u00bd0H\u0012\u00b8\u00b0\u00a5(N\u00db\u0087\u0017^5\u0015\u0019$>\u0097m\u00fa\u009b\u00f8\u00ba\u0013\u00c2;\u0098^\u0015\u00ea9\u00e9\u00ab\u00faK-\u00dd\u00eeCd\\\u00ad\u00f6<\u00e6!\u008e6\u000f".length();
                var5_7 = 16;
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
                    var9_3[var7_4++] = CP_jr.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00df-\u00cc\u00ca\r\u001e;\u0007\u00d7\u00b8\u00b2\u00ad\u00a6\u0096\u009eAYv\u00ee\u0012t\u00afk|]\u0094/\t,7R3P\u009b\u00d5=\u00af\u0097\u00e7M\u00de/\u00cb)?\u00f5\u0098\u00f6\u00916\u00c5~l\u00f3\u00945\u00da\u008a\u00e0\u00ac\u001c\u00a6p\f\u00a5=^\u00f2\u001b\u00e5\u0001\u00a4\u00db\u0097<\u00b56fFe\u0099\u00bb2\u000b\u00bb\u00abj\u00e5\u009c\u00c7H\u00da\u00fc\u0098\u0089L4\u00e0\u001d\u00ed4\u00b7]UMa\u009a\u00ecn@\u00e6H\u00a2";
                    var8_6 = "\u00df-\u00cc\u00ca\r\u001e;\u0007\u00d7\u00b8\u00b2\u00ad\u00a6\u0096\u009eAYv\u00ee\u0012t\u00afk|]\u0094/\t,7R3P\u009b\u00d5=\u00af\u0097\u00e7M\u00de/\u00cb)?\u00f5\u0098\u00f6\u00916\u00c5~l\u00f3\u00945\u00da\u008a\u00e0\u00ac\u001c\u00a6p\f\u00a5=^\u00f2\u001b\u00e5\u0001\u00a4\u00db\u0097<\u00b56fFe\u0099\u00bb2\u000b\u00bb\u00abj\u00e5\u009c\u00c7H\u00da\u00fc\u0098\u0089L4\u00e0\u001d\u00ed4\u00b7]UMa\u009a\u00ecn@\u00e6H\u00a2".length();
                    var5_7 = 32;
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
                    var9_3[var7_4++] = CP_jr.a(var10_9).intern();
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
        CP_jr.b = var9_3;
        CP_jr.c = new String[9];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x522;
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
                throw new RuntimeException("me/nik/coffeeprotect/CP_jr", exception);
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
            CP_jr.c[n2] = CP_jr.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_jr.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_jr" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_jr.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
