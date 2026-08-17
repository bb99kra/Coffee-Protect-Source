/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlCU;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIliW;
import me.nik.coffeeprotect.IlIljl;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.entity.Player;

@IlIljl(IlIlJ="Invalid Position", IlIlM="Checks for invalid position packets")
public class IlIlu7
extends IlIluV {
    private IlIlCU IlIlO;
    private IlIliW IlIlo;
    private long IlIlD;
    private int IlIlN = 0;
    private int IlIli;
    private int IlIlc;
    private float IlIlY = 5.0f;
    private static String IlIlS;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long g;
    private static final long[] h;
    private static final Long[] i;
    private static final Map j;
    private static transient /* synthetic */ String XOPPYbMDPS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlu7(IlIlTM ilIlTM) {
        super(ilIlTM, IlIlOq.CHECKS_INVALID_POSITION_ENABLED.IlIlt());
    }

    /*
     * Exception decompiling
     */
    @Override
    public IlIlTV IlIlh(PacketReceiveEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [72[CASE]], but top level block is 2[TRYBLOCK]
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

    private /* synthetic */ void lambda$handle$0(Player player) {
        block5: {
            Player player2;
            String string;
            block4: {
                long l = b ^ 0x14339C3D3477L;
                string = IlIlu7.IlIlq();
                player2 = player;
                if (string != null) break block4;
                if (player2 == null) break block5;
                player2 = player;
            }
            boolean bl = player2.isOnline();
            if (string == null && bl) {
                bl = player.teleport(this.IlIlO.IlIlP());
            }
        }
    }

    public static void IlIlp(String string) {
        IlIlS = string;
    }

    public static String IlIlq() {
        return IlIlS;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block23: {
            block22: {
                block24: {
                    block21: {
                        block20: {
                            IlIlu7.b = IlIls.a((long)6907381331358088784L, (long)391193102449454204L, MethodHandles.lookup().lookupClass()).a(208580200663946L);
                            IlIlu7.f = new HashMap<K, V>(13);
                            IlIlu7.IlIlp(null);
                            var16 = IlIlu7.b ^ 3592274033359L;
                            var18_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                            v0 = SecretKeyFactory.getInstance("DES");
                            v1 = new byte[8];
                            v2 = v1;
                            v1[0] = (byte)(var16 >>> 56);
                            for (var19_2 = 1; var19_2 < 8; ++var19_2) {
                                v2 = v2;
                                v2[var19_2] = (byte)(var16 << var19_2 * 8 >>> 56);
                            }
                            var18_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                            var25_3 = new String[7];
                            var23_4 = 0;
                            var22_5 = "o\u009d\u0015\u0004\u00c2z\u00d0\u009c\u00d7M9\u00f3\u00b2\u00bdL\u00de@B\u000f\u001cT\u001c\u00ba\u008cHx\u00be\u0001\u0019\u00e5\u00f8_\u00e2/\u0000\u001c\u00d2\u00eb\t\u00b2\u0001Ir\u00c2\u00ce\u0089\u00f12\u001dS\u0096\u009f\r]f\u0013\u00b8\u00aa\u00c1$\b?1d\u007f\u00da\u00b1\u001a\u00f1\u00a8X\t\u00044\u00e2Ueu\t\u00dd0\u0010\u00d1\u00ad\u00b3 \f\u00fel\u00df\u00cfe$\u000f\u00db\u0092\u00a2t \u0085\\]7 \u00c0(\u00d2\u0015b\u0011\u0016\u00c2\u000f\u0017\u00e7\u00ee\u00ab\u00eb\u00c7\u00f5\u00d6\u00c3:\u00ee~\u00c8F\u00e3\u0086mU \u00c4\u0011\b\u00e4\u0081$o\u00e2\u00c4\u00b0j\u0017\u00f44*X\u0001\u00d5{\u00b96DrpP\u00bc\u00d6\u00ac\u0010\u00e8\u00b1\u0096";
                            var24_6 = "o\u009d\u0015\u0004\u00c2z\u00d0\u009c\u00d7M9\u00f3\u00b2\u00bdL\u00de@B\u000f\u001cT\u001c\u00ba\u008cHx\u00be\u0001\u0019\u00e5\u00f8_\u00e2/\u0000\u001c\u00d2\u00eb\t\u00b2\u0001Ir\u00c2\u00ce\u0089\u00f12\u001dS\u0096\u009f\r]f\u0013\u00b8\u00aa\u00c1$\b?1d\u007f\u00da\u00b1\u001a\u00f1\u00a8X\t\u00044\u00e2Ueu\t\u00dd0\u0010\u00d1\u00ad\u00b3 \f\u00fel\u00df\u00cfe$\u000f\u00db\u0092\u00a2t \u0085\\]7 \u00c0(\u00d2\u0015b\u0011\u0016\u00c2\u000f\u0017\u00e7\u00ee\u00ab\u00eb\u00c7\u00f5\u00d6\u00c3:\u00ee~\u00c8F\u00e3\u0086mU \u00c4\u0011\b\u00e4\u0081$o\u00e2\u00c4\u00b0j\u0017\u00f44*X\u0001\u00d5{\u00b96DrpP\u00bc\u00d6\u00ac\u0010\u00e8\u00b1\u0096".length();
                            var21_7 = 16;
                            var20_8 = -1;
lbl21:
                            // 2 sources

                            while (true) {
                                v3 = ++var20_8;
                                v4 = var22_5.substring(v3, v3 + var21_7);
                                v5 = -1;
                                break block20;
                                break;
                            }
lbl26:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = IlIlu7.b(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                var22_5 = "\\p\u0002\u00c4+\\q\u00b2\u00b1\u0010D\u00e2\u00ec\u00813\u00f0\u0010#\u00f8\u00a2\u00c2\u0012\u00e4}\u0080\u00ea\u0006\u00fd-\u00b6\u00cbW\u0003";
                                var24_6 = "\\p\u0002\u00c4+\\q\u00b2\u00b1\u0010D\u00e2\u00ec\u00813\u00f0\u0010#\u00f8\u00a2\u00c2\u0012\u00e4}\u0080\u00ea\u0006\u00fd-\u00b6\u00cbW\u0003".length();
                                var21_7 = 16;
                                var20_8 = -1;
lbl35:
                                // 2 sources

                                while (true) {
                                    v6 = ++var20_8;
                                    v4 = var22_5.substring(v6, v6 + var21_7);
                                    v5 = 0;
                                    break block20;
                                    break;
                                }
                                break;
                            }
lbl40:
                            // 1 sources

                            while (true) {
                                var25_3[var23_4++] = IlIlu7.b(var26_9).intern();
                                if ((var20_8 += var21_7) < var24_6) {
                                    var21_7 = var22_5.charAt(var20_8);
                                    ** continue;
                                }
                                break block21;
                                break;
                            }
                        }
                        var26_9 = var18_1.doFinal(v4.getBytes("ISO-8859-1"));
                        switch (v5) {
                            default: {
                                ** continue;
                            }
                            ** case 0:
lbl52:
                            // 1 sources

                            ** continue;
                        }
                    }
                    IlIlu7.d = var25_3;
                    IlIlu7.e = new String[7];
                    var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                    v7 = SecretKeyFactory.getInstance("DES");
                    v8 = new byte[8];
                    v9 = v8;
                    v8[0] = (byte)(var16 >>> 56);
                    for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                        v9 = v9;
                        v9[var12_11] = (byte)(var16 << var12_11 * 8 >>> 56);
                    }
                    break block24;
lbl66:
                    // 1 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var13_12 = 93019662101739985L;
                var15_13 = var11_10.doFinal(new byte[]{(byte)(var13_12 >>> 56), (byte)(var13_12 >>> 48), (byte)(var13_12 >>> 40), (byte)(var13_12 >>> 32), (byte)(var13_12 >>> 24), (byte)(var13_12 >>> 16), (byte)(var13_12 >>> 8), (byte)var13_12});
                ** while (true)
                IlIlu7.g = ((long)var15_13[0] & 255L) << 56 | ((long)var15_13[1] & 255L) << 48 | ((long)var15_13[2] & 255L) << 40 | ((long)var15_13[3] & 255L) << 32 | ((long)var15_13[4] & 255L) << 24 | ((long)var15_13[5] & 255L) << 16 | ((long)var15_13[6] & 255L) << 8 | (long)var15_13[7] & 255L;
                IlIlu7.j = new HashMap<K, V>(13);
                var0_14 = Cipher.getInstance("DES/CBC/NoPadding");
                v10 = SecretKeyFactory.getInstance("DES");
                v11 = new byte[8];
                v12 = v11;
                v11[0] = (byte)(var16 >>> 56);
                for (var1_15 = 1; var1_15 < 8; ++var1_15) {
                    v12 = v12;
                    v12[var1_15] = (byte)(var16 << var1_15 * 8 >>> 56);
                }
                var0_14.init(2, (Key)v10.generateSecret(new DESKeySpec(v12)), new IvParameterSpec(new byte[8]));
                var6_16 = new long[4];
                var3_17 = 0;
                var4_18 = "\u00bb\u00f9#2PYL\u00fa\u009eB\bm$\u00d4}\u009f";
                var5_19 = "\u00bb\u00f9#2PYL\u00fa\u009eB\bm$\u00d4}\u009f".length();
                var2_20 = 0;
                while (true) {
                    var7_21 = var4_18.substring(var2_20, var2_20 += 8).getBytes("ISO-8859-1");
                    v13 = var6_16;
                    v14 = var3_17++;
                    v15 = ((long)var7_21[0] & 255L) << 56 | ((long)var7_21[1] & 255L) << 48 | ((long)var7_21[2] & 255L) << 40 | ((long)var7_21[3] & 255L) << 32 | ((long)var7_21[4] & 255L) << 24 | ((long)var7_21[5] & 255L) << 16 | ((long)var7_21[6] & 255L) << 8 | (long)var7_21[7] & 255L;
                    v16 = -1;
                    break block22;
                    break;
                }
lbl100:
                // 1 sources

                while (true) {
                    v13[v14] = v17;
                    if (var2_20 < var5_19) ** continue;
                    var4_18 = "-\u0017\u0006\u0098\u00c5\u00e0\u00dewb\u00d5\u00d5eV\u008d\u00fdj";
                    var5_19 = "-\u0017\u0006\u0098\u00c5\u00e0\u00dewb\u00d5\u00d5eV\u008d\u00fdj".length();
                    var2_20 = 0;
                    while (true) {
                        var7_21 = var4_18.substring(var2_20, var2_20 += 8).getBytes("ISO-8859-1");
                        v13 = var6_16;
                        v14 = var3_17++;
                        v15 = ((long)var7_21[0] & 255L) << 56 | ((long)var7_21[1] & 255L) << 48 | ((long)var7_21[2] & 255L) << 40 | ((long)var7_21[3] & 255L) << 32 | ((long)var7_21[4] & 255L) << 24 | ((long)var7_21[5] & 255L) << 16 | ((long)var7_21[6] & 255L) << 8 | (long)var7_21[7] & 255L;
                        v16 = 0;
                        break block22;
                        break;
                    }
                    break;
                }
lbl113:
                // 1 sources

                while (true) {
                    v13[v14] = v17;
                    if (var2_20 < var5_19) ** continue;
                    break block23;
                    break;
                }
            }
            var8_22 = v15;
            var10_23 = var0_14.doFinal(new byte[]{(byte)(var8_22 >>> 56), (byte)(var8_22 >>> 48), (byte)(var8_22 >>> 40), (byte)(var8_22 >>> 32), (byte)(var8_22 >>> 24), (byte)(var8_22 >>> 16), (byte)(var8_22 >>> 8), (byte)var8_22});
            v17 = ((long)var10_23[0] & 255L) << 56 | ((long)var10_23[1] & 255L) << 48 | ((long)var10_23[2] & 255L) << 40 | ((long)var10_23[3] & 255L) << 32 | ((long)var10_23[4] & 255L) << 24 | ((long)var10_23[5] & 255L) << 16 | ((long)var10_23[6] & 255L) << 8 | (long)var10_23[7] & 255L;
            switch (v16) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl126:
                // 1 sources

                ** continue;
            }
        }
        IlIlu7.h = var6_16;
        IlIlu7.i = new Long[4];
    }

    private static NoSuchMethodError a(NoSuchMethodError noSuchMethodError) {
        return noSuchMethodError;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x4359;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlu7", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            IlIlu7.e[n2] = IlIlu7.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlu7.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlu7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7427;
        if (i[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = h[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])j.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    j.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlu7", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            IlIlu7.i[n2] = l4;
        }
        return i[n2];
    }

    private static long b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = IlIlu7.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return l2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlu7" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlu7.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIlu7.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

