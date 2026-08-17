/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlTM;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIlfQ;
import me.nik.coffeeprotect.IlIloI;
import me.nik.coffeeprotect.IlIlu4;
import me.nik.coffeeprotect.IlIlu6;
import me.nik.coffeeprotect.IlIlu7;
import me.nik.coffeeprotect.IlIluB;
import me.nik.coffeeprotect.IlIluE;
import me.nik.coffeeprotect.IlIluK;
import me.nik.coffeeprotect.IlIluL;
import me.nik.coffeeprotect.IlIluM;
import me.nik.coffeeprotect.IlIluQ;
import me.nik.coffeeprotect.IlIluS;
import me.nik.coffeeprotect.IlIluT;
import me.nik.coffeeprotect.IlIluV;
import me.nik.coffeeprotect.IlIluX;
import me.nik.coffeeprotect.IlIlua;
import me.nik.coffeeprotect.IlIlub;
import me.nik.coffeeprotect.IlIluf;
import me.nik.coffeeprotect.IlIlug;
import me.nik.coffeeprotect.IlIluk;
import me.nik.coffeeprotect.IlIlul;
import me.nik.coffeeprotect.IlIlur;
import me.nik.coffeeprotect.IlIlus;
import me.nik.coffeeprotect.IlIluu;
import me.nik.coffeeprotect.IlIluw;
import me.nik.coffeeprotect.IlIlux;
import me.nik.coffeeprotect.IlIluy;
import me.nik.coffeeprotect.IlIluz;
import me.nik.coffeeprotect.IlIlyP;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public class IlIlLs {
    private final IlIlTM IlIlF;
    private IlIluV[] IlIlv;
    private int IlIlp;
    private boolean IlIlI;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;
    private static transient /* synthetic */ String FKnIHhbbSs = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlLs(IlIlTM ilIlTM) {
        this.IlIlF = ilIlTM;
        this.IlIl_();
    }

    public IlIlTV IlIlh(PacketReceiveEvent packetReceiveEvent) {
        IlIlTV ilIlTV;
        block2: {
            long l = a ^ 0x4030BC5ADA63L;
            IlIlTV ilIlTV2 = null;
            String string = IlIloI.IlIln();
            IlIlyP ilIlyP = new IlIlyP();
            for (int i = 0; i < this.IlIlp; ++i) {
                ilIlTV = this.IlIlv[i].IlIlh(packetReceiveEvent);
                if (string == null) {
                    if (ilIlTV != null) break;
                    if (string == null) continue;
                }
                break block2;
            }
            CoffeeProtect.IlIlJ().IlIlJ().IlIlF(ilIlyP.IlIlB());
            ilIlTV = ilIlTV2;
        }
        return ilIlTV;
    }

    public void IlIl_() {
        long l = a ^ 0x48B20D4666F8L;
        IlIluV[] ilIluVArray = new IlIluV[IlIlLs.a("f", (int)263, (long)(0x56146EB35226DE5AL ^ l))];
        ilIluVArray[0] = new IlIlub(this.IlIlF);
        ilIluVArray[1] = new IlIluu(this.IlIlF);
        ilIluVArray[2] = new IlIlug(this.IlIlF);
        ilIluVArray[3] = new IlIluT(this.IlIlF);
        ilIluVArray[4] = new IlIlu7(this.IlIlF);
        ilIluVArray[5] = new IlIlul(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)7869, (long)(0x27DFE2D13D93C1F2L ^ l))] = new IlIluf(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)18666, (long)(0x6CE2F6A8777817B9L ^ l))] = new IlIluw(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)25466, (long)(0xFEBCCE9922A3C23L ^ l))] = new IlIluE(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)22350, (long)(0x49DCA63CA0FE081BL ^ l))] = new IlIluk(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)20423, (long)(0x41CCF49D92049098L ^ l))] = new IlIluz(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)11118, (long)(0x39DAB138200A743FL ^ l))] = new IlIluy(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)32152, (long)(0x62E70EF01EFB22D5L ^ l))] = new IlIluB(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)19294, (long)(0x3FB8A0960EB91402L ^ l))] = new IlIlux(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)25167, (long)(0x42A8EB0D5D61BD18L ^ l))] = new IlIlu4(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)28072, (long)(0x37E350B58ACC32FAL ^ l))] = new IlIlua(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)10544, (long)(0x3BDC899AECB07668L ^ l))] = new IlIlu6(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)15785, (long)(0x28FFA9B2683662F2L ^ l))] = new IlIluX(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)25484, (long)(0xD9340FE0A3E3CC2L ^ l))] = new IlIluQ(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)16964, (long)(0x567D917152991D14L ^ l))] = new IlIluM(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)29694, (long)(0x5FB2A7754AB7ACA8L ^ l))] = new IlIlur(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)17919, (long)(0x5AE4BB6846699AB3L ^ l))] = new IlIluK(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)7359, (long)(0x2F27FC78DDDE43E5L ^ l))] = new IlIluS(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)19462, (long)(0x1732E8067CFF9352L ^ l))] = new IlIlus(this.IlIlF);
        ilIluVArray[IlIlLs.a("f", (int)11822, (long)(0x5A6D38B677627170L ^ l))] = new IlIluL(this.IlIlF);
        this.IlIlK(ilIluVArray);
        if (this.IlIlI) {
            this.IlIlv = (IlIluV[])Arrays.stream(this.IlIlv).filter(ilIluV -> ilIluV.getClass().isAnnotationPresent(IlIlfQ.class)).toArray(IlIluV[]::new);
            this.IlIlp = 1;
        }
    }

    private void IlIlK(IlIluV ... ilIluVArray) {
        long l = a ^ 0x462F9BE03F5BL;
        this.IlIlv = new IlIluV[0];
        this.IlIlp = 0;
        for (IlIluV ilIluV : ilIluVArray) {
            if (this.IlIlF != null && (!ilIluV.IlIlb() || this.IlIlF(ilIluV))) continue;
            this.IlIlv = Arrays.copyOf(this.IlIlv, this.IlIlp + 1);
            this.IlIlv[this.IlIlp] = ilIluV;
            ++this.IlIlp;
        }
    }

    private boolean IlIlF(IlIluV ilIluV) {
        long l = a ^ 0x6D9FFD07E53L;
        if (this.IlIlI) {
            return true;
        }
        if (ilIluV.getClass().isAnnotationPresent(IlIlfQ.class)) {
            this.IlIlI = true;
        }
        return false;
    }

    public IlIluV[] IlIlU() {
        return this.IlIlv;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                IlIlLs.a = IlIls.a((long)301594609728327497L, (long)-5895568087108402876L, MethodHandles.lookup().lookupClass()).a(24030744447602L);
                IlIlLs.d = new HashMap<K, V>(13);
                var0 = IlIlLs.a ^ 93566373688848L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[20];
                var5_4 = 0;
                var6_5 = "A\u00d2LI?\u00d9\u00c3B_\u00c3\u00f3\bz\u00fc\u0080\u0011\u00adX\b\u0017\u0010\f\u00f1\u00a7\u00c1\u0011\u0014\u00cac\u0089\u00b0\u008f\u0016\u009a*\u00b2\u00abtN\u0015A\"\u0014v\u00ea\u00a8}Yz\u00be\u00be\u00e5\u00ce\u00ca#\u0091\u00f32\u0007\u0001*\u008f\u00d3\u00b9\u00b4\n\u00c1\u00b6\u0017\u0080\u00fb\u00ed\u00b8*\u00e6\u00f3\u00d4\u00d7\u00c9\u0093L-\u00a4Bmo}\u0017\u00f7\u00e8\u00f8\u00f5n\u00a30\u008a\u00cb\u009fuHZ\u009a\u00a3\u00ed\u00e7\u009d\u00b0\u00eb\u00e1\u009f\u00acL\u0004\u00f400\u0018\u00de6\u009f%ia\u001d=\u0096\u00b3\u00eb*X\u008b\u00ae\u00f7\u00c9_j\u00f5\u0088\u00fcc\u00cd\u00935\u00e1";
                var7_6 = "A\u00d2LI?\u00d9\u00c3B_\u00c3\u00f3\bz\u00fc\u0080\u0011\u00adX\b\u0017\u0010\f\u00f1\u00a7\u00c1\u0011\u0014\u00cac\u0089\u00b0\u008f\u0016\u009a*\u00b2\u00abtN\u0015A\"\u0014v\u00ea\u00a8}Yz\u00be\u00be\u00e5\u00ce\u00ca#\u0091\u00f32\u0007\u0001*\u008f\u00d3\u00b9\u00b4\n\u00c1\u00b6\u0017\u0080\u00fb\u00ed\u00b8*\u00e6\u00f3\u00d4\u00d7\u00c9\u0093L-\u00a4Bmo}\u0017\u00f7\u00e8\u00f8\u00f5n\u00a30\u008a\u00cb\u009fuHZ\u009a\u00a3\u00ed\u00e7\u009d\u00b0\u00eb\u00e1\u009f\u00acL\u0004\u00f400\u0018\u00de6\u009f%ia\u001d=\u0096\u00b3\u00eb*X\u008b\u00ae\u00f7\u00c9_j\u00f5\u0088\u00fcc\u00cd\u00935\u00e1".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u0090wB7v\u001d\u0086p\u0097\u00b7\u0080\u00b6\u0006\\\bZ";
                    var7_6 = "\u0090wB7v\u001d\u0086p\u0097\u00b7\u0080\u00b6\u0006\\\bZ".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl39:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl52:
                // 1 sources

                ** continue;
            }
        }
        IlIlLs.b = var8_3;
        IlIlLs.c = new Integer[20];
    }

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6D71;
        if (c[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = b[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])d.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    d.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/IlIlLs", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlLs.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlLs.a(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite a(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIlLs" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlLs.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

