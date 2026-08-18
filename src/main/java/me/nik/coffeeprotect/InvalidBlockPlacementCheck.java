/*
 * Decompiled with CFR 0.152.
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
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.UserData;
import me.nik.coffeeprotect.CheckResult;
import me.nik.coffeeprotect.CheckInfo;
import me.nik.coffeeprotect.Check;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;

@CheckInfo(CP_J="Invalid Block Placement", CP_M="Checks for invalid block placements")
public class InvalidBlockPlacementCheck
extends Check {
    private long CP_Y;
    private long CP_M;
    private long CP_T;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static final long[] j;
    private static final Long[] k;
    private static final Map l;
    private static transient /* synthetic */ String WbSnSDJiFS = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public InvalidBlockPlacementCheck(UserData ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_BLOCK_PLACEMENT_ENABLED.CP_t());
    }

    /*
     * Exception decompiling
     */
    @Override
    public CheckResult CP_h(PacketReceiveEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [22[TRYBLOCK]], but top level block is 58[SWITCH]
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
         *     at org.benf.cfr.reader.Driver.doClass(Driver.java:84)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:78)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        block17: {
                            block16: {
                                InvalidBlockPlacementCheck.b = CP_s.a(3548400658391628368L, 2178758214804283373L, MethodHandles.lookup().lookupClass()).a(205999691178231L);
                                InvalidBlockPlacementCheck.f = new HashMap<K, V>(13);
                                var22 = InvalidBlockPlacementCheck.b ^ 3716381410889L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[13];
                                var29_4 = 0;
                                var28_5 = "\u00ab\u00e3d\u0099k\u0086\u0095gw\u0081\u0099m\u0082\u0015BX\"\u00ed\u0092\u007f-\u00a3n\u0096\u0095\u008a\u00b7\n\u00d4}\u00e7\u00f8}\u00ab*\u0010\u00ed\u001f\u00df\u00ea\u0010\u00ee\u009e\u00a0\u00a0\u0082~X\u001blD\u009eE:KG\u00a8(\u00c4\u0086\b(\u00de\u009e\u0014\u00a4m-\u00a9D\u001d\u00da&\u00e5\u001b\u00b4\u0088\u001d_(\u000e\u00b0[\u00fc\u00d3pO\u00b3\u00c5\u0097m\u00dc^\u0082eu\u00a3\u00f6\u0010\u00e7\u009f\u0018\u00f9\u00fa\u00c9@\u00c0\u00f4u\u009b\u00d47L\u0083\u008d ;|\u00c3\u0085\u0001LX\u00d5\u00b3\u001a\u00951M\u001c&%\u0085)4\u008b\u00c3\u001cKJ\u00d3\u00da\u000b\u00af\u00a4\u00e1\u007f\u00b2\u0010\u00c2\u009a\u00d9\u009b\u0017Y\u0090\u00da\u008fT\u00fb\u00e4\u000f\u0010N+ \u00b5\u00ee\u00f8h\u0092\u0093\u00f7y\u00c7vF\u00d0\u00eb\u00cc\u00cf3/)\u00b6\u00d9\u00c9\u00de\n;QLa\u00edFn\u0083R(J\u00c5~\u00ef\u00ba\u00c1^\u009d\u00e0\u009b\r\u00cd\u0091e\u001a\u00fdk\u0083\u00da$\u00a0oC\u00b4\u0089=\u00bd\u00c6\u00e5}\u00d2\u00e7s\u0003\u00ac\u00aff\u00ce\u00cc\u00b90\u00eb\u00e2\u0018\u00af\u00a1\u0089\u00c2D\u00afo\u00d35</ \u00a8O\u00e4'\u00ff/\u00bf\u00aam\u00fe\u0098\u00bd\u00dd\u00e9\u0082Q\u0012\u00abv\u00b1\u00b4&\u00a4\u00ab\u001e:Q\u00a4\u0004\u00f4\u00a3n| \u001d\u0006\u00c7Bz\u0013\u00f7\u00eb\u00a35\u00e1\u00c3\u00d3\u0015P},S3\u00fb\u00d4\u0003\u00ef\r\u00ef!\u00f3\t$\u00fbw\u00d9(!\u00cdR{)\u00cf\u009a\u00ec\u0093\u00f4\u00fb\u00d9\u009f\u0013N\u00a7\u0081\u009a$\u0082D\u00d8~*9F\u0005y\u00c9\bE\u0002(m\t\u00cd\u00b4\u00c4\u0006\u00f6";
                                var30_6 = "\u00ab\u00e3d\u0099k\u0086\u0095gw\u0081\u0099m\u0082\u0015BX\"\u00ed\u0092\u007f-\u00a3n\u0096\u0095\u008a\u00b7\n\u00d4}\u00e7\u00f8}\u00ab*\u0010\u00ed\u001f\u00df\u00ea\u0010\u00ee\u009e\u00a0\u00a0\u0082~X\u001blD\u009eE:KG\u00a8(\u00c4\u0086\b(\u00de\u009e\u0014\u00a4m-\u00a9D\u001d\u00da&\u00e5\u001b\u00b4\u0088\u001d_(\u000e\u00b0[\u00fc\u00d3pO\u00b3\u00c5\u0097m\u00dc^\u0082eu\u00a3\u00f6\u0010\u00e7\u009f\u0018\u00f9\u00fa\u00c9@\u00c0\u00f4u\u009b\u00d47L\u0083\u008d ;|\u00c3\u0085\u0001LX\u00d5\u00b3\u001a\u00951M\u001c&%\u0085)4\u008b\u00c3\u001cKJ\u00d3\u00da\u000b\u00af\u00a4\u00e1\u007f\u00b2\u0010\u00c2\u009a\u00d9\u009b\u0017Y\u0090\u00da\u008fT\u00fb\u00e4\u000f\u0010N+ \u00b5\u00ee\u00f8h\u0092\u0093\u00f7y\u00c7vF\u00d0\u00eb\u00cc\u00cf3/)\u00b6\u00d9\u00c9\u00de\n;QLa\u00edFn\u0083R(J\u00c5~\u00ef\u00ba\u00c1^\u009d\u00e0\u009b\r\u00cd\u0091e\u001a\u00fdk\u0083\u00da$\u00a0oC\u00b4\u0089=\u00bd\u00c6\u00e5}\u00d2\u00e7s\u0003\u00ac\u00aff\u00ce\u00cc\u00b90\u00eb\u00e2\u0018\u00af\u00a1\u0089\u00c2D\u00afo\u00d35</ \u00a8O\u00e4'\u00ff/\u00bf\u00aam\u00fe\u0098\u00bd\u00dd\u00e9\u0082Q\u0012\u00abv\u00b1\u00b4&\u00a4\u00ab\u001e:Q\u00a4\u0004\u00f4\u00a3n| \u001d\u0006\u00c7Bz\u0013\u00f7\u00eb\u00a35\u00e1\u00c3\u00d3\u0015P},S3\u00fb\u00d4\u0003\u00ef\r\u00ef!\u00f3\t$\u00fbw\u00d9(!\u00cdR{)\u00cf\u009a\u00ec\u0093\u00f4\u00fb\u00d9\u009f\u0013N\u00a7\u0081\u009a$\u0082D\u00d8~*9F\u0005y\u00c9\bE\u0002(m\t\u00cd\u00b4\u00c4\u0006\u00f6".length();
                                var27_7 = 40;
                                var26_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block16;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = InvalidBlockPlacementCheck.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "ET\u0015\u0095C\u008a\u00bf!Eki\u009f\u00a3T\u00a0\u00b9\u0097\u0014\u0098\u0013M\u00ac\u00ffp\u00187z&\u00f0<\u00d1V\u00ef\u00eaz%7Yn\u00c9\u009f\u00cd\u009e\u00e8\u00e8\u009d\u00a6\u0019+";
                                    var30_6 = "ET\u0015\u0095C\u008a\u00bf!Eki\u009f\u00a3T\u00a0\u00b9\u0097\u0014\u0098\u0013M\u00ac\u00ffp\u00187z&\u00f0<\u00d1V\u00ef\u00eaz%7Yn\u00c9\u009f\u00cd\u009e\u00e8\u00e8\u009d\u00a6\u0019+".length();
                                    var27_7 = 24;
                                    var26_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block16;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = InvalidBlockPlacementCheck.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block17;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        InvalidBlockPlacementCheck.d = var31_3;
                        InvalidBlockPlacementCheck.e = new String[13];
                        InvalidBlockPlacementCheck.i = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[3];
                        var14_13 = 0;
                        var15_14 = "\nF\u00f1\u00e0\u00c2\u0017\u00ae[\u0088V\u0015\u00d7\u00a5\u00ee_w\u009cU;\u0081\u00f6\u00a8\u0080\u0002";
                        var16_15 = "\nF\u00f1\u00e0\u00c2\u0017\u00ae[\u0088V\u0015\u00d7\u00a5\u00ee_w\u009cU;\u0081\u00f6\u00a8\u0080\u0002".length();
                        var13_16 = 0;
                        while (true) {
                            break block18;
                            break;
                        }
lbl73:
                        // 1 sources

                        while (true) {
                            var17_12[v10] = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
                            if (var13_16 < var16_15) ** continue;
                            break block19;
                            break;
                        }
                    }
                    var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                    v10 = var14_13++;
                    var19_18 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    ** while (true)
                }
                InvalidBlockPlacementCheck.g = var17_12;
                InvalidBlockPlacementCheck.h = new Integer[3];
                InvalidBlockPlacementCheck.l = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v11 = SecretKeyFactory.getInstance("DES");
                v12 = new byte[8];
                v13 = v12;
                v12[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v13 = v13;
                    v13[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v11.generateSecret(new DESKeySpec(v13)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[2];
                var3_23 = 0;
                var4_24 = "4\u001f\u0088\u0015\u00d8R\u0007\u00a2\u0018_`\u00d3)S\u008b\u0016";
                var5_25 = "4\u001f\u0088\u0015\u00d8R\u0007\u00a2\u0018_`\u00d3)S\u008b\u0016".length();
                var2_26 = 0;
                while (true) {
                    break block20;
                    break;
                }
lbl107:
                // 1 sources

                while (true) {
                    var6_22[v14] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block21;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v14 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        InvalidBlockPlacementCheck.j = var6_22;
        InvalidBlockPlacementCheck.k = new Long[2];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1272;
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
                throw new RuntimeException("me/nik/coffeeprotect/InvalidBlockPlacementCheck", exception);
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
            InvalidBlockPlacementCheck.e[n2] = InvalidBlockPlacementCheck.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = InvalidBlockPlacementCheck.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/InvalidBlockPlacementCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7D99;
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
                throw new RuntimeException("me/nik/coffeeprotect/InvalidBlockPlacementCheck", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            InvalidBlockPlacementCheck.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = InvalidBlockPlacementCheck.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/InvalidBlockPlacementCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6855;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])InvalidBlockPlacementCheck.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    InvalidBlockPlacementCheck.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/InvalidBlockPlacementCheck", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            InvalidBlockPlacementCheck.k[n2] = l4;
        }
        return k[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = InvalidBlockPlacementCheck.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/InvalidBlockPlacementCheck" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(InvalidBlockPlacementCheck.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(InvalidBlockPlacementCheck.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(InvalidBlockPlacementCheck.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
