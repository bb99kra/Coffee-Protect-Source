/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.IlIlWx;
import me.nik.coffeeprotect.IlIlju;
import me.nik.coffeeprotect.IlIlx5;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IlIljX
extends IlIlju {
    private final CoffeeProtect IlIlJ;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String hALcrJlAXH = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIljX(CoffeeProtect coffeeProtect) {
        this.IlIlJ = coffeeProtect;
    }

    @Override
    protected String IlIlC() {
        long l = a ^ 0x44C67B32F7E6L;
        return IlIljX.a("w", (int)1188, (long)(0x5660C7FD3FB8D79DL ^ l));
    }

    @Override
    protected String IlIlV() {
        long l = a ^ 0x51C739DCAD7FL;
        return IlIljX.a("w", (int)21316, (long)(0x7E1B9747487BDAE6L ^ l));
    }

    @Override
    protected String IlIld() {
        long l = a ^ 0x7B900EDC2AAFL;
        return IlIljX.a("w", (int)7615, (long)(0x13C54B2C4CE993C9L ^ l));
    }

    @Override
    protected String IlIla() {
        return IlIlx5.TROLL.IlIla();
    }

    @Override
    protected int IlIlX() {
        return 3;
    }

    @Override
    protected boolean IlIlr() {
        return true;
    }

    @Override
    protected void IlIlM(CommandSender commandSender, String[] stringArray) {
        long l = a ^ 0x12773FC50118L;
        Player player = Bukkit.getPlayer((String)stringArray[1]);
        try {
            if (player == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIljX.a(illegalArgumentException);
        }
        IlIlWx ilIlWx = null;
        try {
            ilIlWx = IlIlWx.valueOf(stringArray[2].toUpperCase());
        }
        catch (IllegalArgumentException illegalArgumentException) {
            // empty catch block
        }
        try {
            if (ilIlWx == null) {
                return;
            }
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIljX.a(illegalArgumentException);
        }
        this.IlIlJ.IlIlb().IlIlq(player, ilIlWx);
        commandSender.sendMessage(IlIlxi.TROLL.IlIlF().replace((CharSequence)((Object)IlIljX.a("w", (int)4698, (long)(0x6D38D116B553379EL ^ l))), player.getName()).replace((CharSequence)((Object)IlIljX.a("w", (int)18184, (long)(0x50BB08EF147962CEL ^ l))), ilIlWx.name()));
    }

    /*
     * Exception decompiling
     */
    @Override
    protected List<String> IlIlb(CommandSender var1_1, String[] var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIljX.a = IlIls.a((long)-8043285418742872024L, (long)-3655635002302920355L, MethodHandles.lookup().lookupClass()).a(230865017287413L);
                IlIljX.d = new HashMap<K, V>(13);
                var0 = IlIljX.a ^ 32839960205061L;
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
                var9_3 = new String[5];
                var7_4 = 0;
                var6_5 = "C.yl\u0097\u00dc\u0084\u00f9\u00cc^v\u00d7\u009avr=ZeK\u0085C\u0093\u0003Ty\u00ea\u00f7\u00df\u00afM\u00cb\u00c1\u0018\u008f\u0012\u00fe\u00ba\u0016\u009c\f\u00a7\u00dbY\b9\"_#uA\u0091\u00ad;\u0084\u0087\u00b8\u009d\u0010\u009a(\u0084P\u00c3.} \u008d\u00f8\u00a0\u0090\u0005\u00a2\u008c\n";
                var8_6 = "C.yl\u0097\u00dc\u0084\u00f9\u00cc^v\u00d7\u009avr=ZeK\u0085C\u0093\u0003Ty\u00ea\u00f7\u00df\u00afM\u00cb\u00c1\u0018\u008f\u0012\u00fe\u00ba\u0016\u009c\f\u00a7\u00dbY\b9\"_#uA\u0091\u00ad;\u0084\u0087\u00b8\u009d\u0010\u009a(\u0084P\u00c3.} \u008d\u00f8\u00a0\u0090\u0005\u00a2\u008c\n".length();
                var5_7 = 32;
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
                    var9_3[var7_4++] = IlIljX.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "2\b\u00c6\u00b6\u00df=\u00ae\u001e\u008b<&\u0006\u00c7\u00afD\u00b8\u00af\u00e5y\u009bc\u00ef^\u00e6\u00d5\u0080\u0003)y\u00a1\u008b\u0013@\u000f\u00ef\u00b9\u00ff\u00a3\u00ce3\u00e9\u00a9\u0081aQ\u00a7S\u00feV\u00bd\u00a2\u0089\u0002f:\u00c0\u0010\u008b\u00f0z\u0088\u0000y\u00e9\u00e6G\u000eXN_E\u00db\u0087\u00bb\u00ef\u0087\u001b7\u00e8\u00ba\u001f\u00cc\u00e4\u008c\u0012\u00f8\u001a\u001f\u00c8S\u00c2\"y\u000fU\u00eb\u00fa";
                    var8_6 = "2\b\u00c6\u00b6\u00df=\u00ae\u001e\u008b<&\u0006\u00c7\u00afD\u00b8\u00af\u00e5y\u009bc\u00ef^\u00e6\u00d5\u0080\u0003)y\u00a1\u008b\u0013@\u000f\u00ef\u00b9\u00ff\u00a3\u00ce3\u00e9\u00a9\u0081aQ\u00a7S\u00feV\u00bd\u00a2\u0089\u0002f:\u00c0\u0010\u008b\u00f0z\u0088\u0000y\u00e9\u00e6G\u000eXN_E\u00db\u0087\u00bb\u00ef\u0087\u001b7\u00e8\u00ba\u001f\u00cc\u00e4\u008c\u0012\u00f8\u001a\u001f\u00c8S\u00c2\"y\u000fU\u00eb\u00fa".length();
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
                    var9_3[var7_4++] = IlIljX.a(var10_9).intern();
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
        IlIljX.b = var9_3;
        IlIljX.c = new String[5];
    }

    private static IllegalArgumentException a(IllegalArgumentException illegalArgumentException) {
        return illegalArgumentException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4E4D;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIljX", exception);
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
            IlIljX.c[n2] = IlIljX.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIljX.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIljX" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIljX.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

