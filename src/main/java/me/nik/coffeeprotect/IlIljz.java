/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.IlIlO4;
import me.nik.coffeeprotect.IlIlTz;
import me.nik.coffeeprotect.IlIljf;
import me.nik.coffeeprotect.IlIlju;
import me.nik.coffeeprotect.IlIlx5;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IlIljz
extends IlIlju {
    private final CoffeeProtect IlIlo;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String AuCOhDdoxB = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIljz(CoffeeProtect coffeeProtect) {
        this.IlIlo = coffeeProtect;
    }

    @Override
    protected String IlIlC() {
        long l = a ^ 0x22154F925726L;
        return IlIljz.a("q", (int)15001, (long)(0x188D98D68B2365C5L ^ l));
    }

    @Override
    protected String IlIlV() {
        long l = a ^ 0x37140D7C0DBFL;
        return IlIljz.a("q", (int)21659, (long)(0x6826D27A4F26515CL ^ l));
    }

    @Override
    protected String IlIld() {
        long l = a ^ 0x1D433A7C8A6FL;
        return IlIljz.a("q", (int)14381, (long)(0x3093579E9BA73A3BL ^ l));
    }

    @Override
    protected String IlIla() {
        return IlIlx5.LOGS.IlIla();
    }

    @Override
    protected int IlIlX() {
        return 2;
    }

    @Override
    protected boolean IlIlr() {
        return false;
    }

    @Override
    protected void IlIlM(CommandSender commandSender, String[] stringArray) {
        long l = a ^ 0x74A40B65A1D8L;
        boolean bl = IlIljf.IlIlJ();
        if (!bl) {
            if (this.IlIlo.IlIlZ().IlIlD()) {
                commandSender.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)((Object)IlIljz.a("q", (int)32710, (long)(0x5D88CB4AFDA65665L ^ l))));
                return;
            }
            new IlIlO4(new IlIlTz((Player)commandSender), this.IlIlo, stringArray[1]).IlIlM();
        }
    }

    @Override
    protected List<String> IlIlb(CommandSender commandSender, String[] stringArray) {
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIljz.a = IlIls.a((long)4832616510227711640L, (long)2582692041644910276L, MethodHandles.lookup().lookupClass()).a(235306630450957L);
                IlIljz.d = new HashMap<K, V>(13);
                var0 = IlIljz.a ^ 106067169592824L;
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
                var9_3 = new String[4];
                var7_4 = 0;
                var6_5 = "\u00ee\u000e\u0089#\u0088av-\u001a\u00c1\u00b3\u0081\u00f0\u00a4\u00b1$P\u001a\u00fd\u00ec\u001b\u00cao\u00d4U\u00e1\u00f3\u00f6;\u00a2\u0019\u00c8G\u00c5\u007f\u00bfj\u00fd(a\u008e_#Zg\u008f8-\u00dfMY\u0092a\u00bb\u008b+e\u007f\u00c6a\u00b4W\u00f8\u00f1~\u00b1\u00b3\u00e7\u001b\u009f\u0001\u00ef\u0004\u00ec\u00b1\u00fa\u00fc\u009e8\u00e5\u00e7>`\u0000h\u0011]\u00d6E\u0000,\u00ccF\u00d6\u00c1\u00ed\u00f5";
                var8_6 = "\u00ee\u000e\u0089#\u0088av-\u001a\u00c1\u00b3\u0081\u00f0\u00a4\u00b1$P\u001a\u00fd\u00ec\u001b\u00cao\u00d4U\u00e1\u00f3\u00f6;\u00a2\u0019\u00c8G\u00c5\u007f\u00bfj\u00fd(a\u008e_#Zg\u008f8-\u00dfMY\u0092a\u00bb\u008b+e\u007f\u00c6a\u00b4W\u00f8\u00f1~\u00b1\u00b3\u00e7\u001b\u009f\u0001\u00ef\u0004\u00ec\u00b1\u00fa\u00fc\u009e8\u00e5\u00e7>`\u0000h\u0011]\u00d6E\u0000,\u00ccF\u00d6\u00c1\u00ed\u00f5".length();
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
                    var9_3[var7_4++] = IlIljz.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "h5\u00cd\u0088\u0090\u0090\u00ee;\u000b\u00e5L\u001c\u00bat'\u0095=\u0006\u00cb\u009a\u0019\u0018D\u00a9\u00dd\u00b3\u008d\u00aa{j\u00bc\u00f99\u00cd\u00e9\u0013`\u00ad\u0099I8\u009e\u00e9b\u00b8oz\u0093K\u0081\u00c2\u00feI\u00b1\u008f\u0096\u00d3\u009aZ'\u008b(v\u00e1\u0086\u001a\u0089\u00b4\u00cc?\u0007\u00a0a\u0018;\u0003\u0094\u00ae\u00c5D;\u001a\u00de\u00a1\u00cf\u00ee]\u0002\u00ba\u00e3\nZ\u00a1\u00d5\u00af\u0014\u00c3";
                    var8_6 = "h5\u00cd\u0088\u0090\u0090\u00ee;\u000b\u00e5L\u001c\u00bat'\u0095=\u0006\u00cb\u009a\u0019\u0018D\u00a9\u00dd\u00b3\u008d\u00aa{j\u00bc\u00f99\u00cd\u00e9\u0013`\u00ad\u0099I8\u009e\u00e9b\u00b8oz\u0093K\u0081\u00c2\u00feI\u00b1\u008f\u0096\u00d3\u009aZ'\u008b(v\u00e1\u0086\u001a\u0089\u00b4\u00cc?\u0007\u00a0a\u0018;\u0003\u0094\u00ae\u00c5D;\u001a\u00de\u00a1\u00cf\u00ee]\u0002\u00ba\u00e3\nZ\u00a1\u00d5\u00af\u0014\u00c3".length();
                    var5_7 = 40;
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
                    var9_3[var7_4++] = IlIljz.a(var10_9).intern();
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
        IlIljz.b = var9_3;
        IlIljz.c = new String[4];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x422A;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIljz", exception);
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
            IlIljz.c[n2] = IlIljz.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIljz.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIljz" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIljz.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

