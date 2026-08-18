/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
@Deprecated
public class CP_fC
extends FilterInputStream {
    private static String CP_v;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String wfRWKMCGEV = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_fC(InputStream inputStream) {
        super(inputStream);
    }

    public boolean CP_f() {
        boolean bl;
        block4: {
            block5: {
                long l = a ^ 0x11B1EDA71700L;
                String string = CP_fC.CP_r();
                try {
                    try {
                        bl = this.CP_UnderScore();
                        if (string != null) break block4;
                        if (!bl) break block5;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw CP_fC.a(illegalStateException);
                    }
                    bl = true;
                    break block4;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CP_fC.a(illegalStateException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public byte CP_UnderScore() {
        return (byte)this.CP_H();
    }

    public int CP_H() {
        int n;
        block6: {
            int n2;
            block7: {
                n2 = 0;
                String string = CP_fC.CP_r();
                try {
                    n2 = this.read();
                }
                catch (IOException iOException) {
                    iOException.printStackTrace();
                }
                try {
                    try {
                        n = n2;
                        if (string != null) break block6;
                        if (n >= 0) break block7;
                    }
                    catch (IOException iOException) {
                        throw CP_fC.a(iOException);
                    }
                    throw new IllegalStateException();
                }
                catch (IOException iOException) {
                    throw CP_fC.a(iOException);
                }
            }
            n = n2;
        }
        return n;
    }

    public short CP_V() {
        return (short)this.CP_B();
    }

    public int CP_B() {
        long l = a ^ 0x7DDA80FA6C91L;
        int n = this.CP_H();
        int n2 = this.CP_H();
        return (n << CP_fC.b("o", (int)17485, (long)(0x2E1A8A8C7C7B77C9L ^ l))) + n2;
    }

    public char CP_m() {
        return (char)this.CP_B();
    }

    public int CP_m() {
        long l = a ^ 0x5E5FA1E947CL;
        int n = this.CP_H();
        int n2 = this.CP_H();
        int n3 = this.CP_H();
        int n4 = this.CP_H();
        return (n << CP_fC.b("o", (int)28988, (long)(0x6B78C2272E6FBA52L ^ l))) + (n2 << CP_fC.b("o", (int)9384, (long)(0x2A03CE4617DEFD6L ^ l))) + (n3 << CP_fC.b("o", (int)17485, (long)(0x2E1AF2B3069F8F24L ^ l))) + n4;
    }

    public int CP_O() {
        byte by;
        long l = a ^ 0x4272406CE706L;
        int n = 0;
        int n2 = 0;
        String string = CP_fC.CP_r();
        while (((by = this.CP_UnderScore()) & CP_fC.b("o", (int)30561, (long)(0x732562B9D7DCCF78L ^ l))) == CP_fC.b("o", (int)26855, (long)(0x42304426427650F8L ^ l))) {
            n |= (by & CP_fC.b("o", (int)31030, (long)(0x7AED68772195412DL ^ l))) << n2++ * CP_fC.b("o", (int)3819, (long)(0xA2BFB1FFC9936ECL ^ l));
            while (n2 > 5) {
                if (string != null) continue;
                throw new IllegalStateException((String)((Object)CP_fC.a("g", (int)1226, (long)(0x7DD5927D1D2D4949L ^ l))));
            }
        }
        return n | (by & CP_fC.b("o", (int)22565, (long)(0x50DEC2FDD9DF6037L ^ l))) << n2 * CP_fC.b("o", (int)23973, (long)(0x6768E79B2365E5A3L ^ l));
    }

    public long CP_p() {
        long l;
        long l2 = a ^ 0x3B0EBCE146BAL;
        byte[] byArray = this.CP_P((int)CP_fC.b("o", (int)32694, (long)(0x2C350BE5F0986616L ^ l2)));
        String string = CP_fC.CP_r();
        try {
            l = ((long)byArray[0] << CP_fC.b("o", (int)27285, (long)(0x4AFC35B22372F337L ^ l2))) + ((long)(byArray[1] & CP_fC.b("o", (int)28711, (long)(0x2591F19C8DA0698DL ^ l2))) << CP_fC.b("o", (int)10220, (long)(0x5B9D6F17E2333E4DL ^ l2))) + ((long)(byArray[2] & CP_fC.b("o", (int)15465, (long)(0x2CE62228DC68A5C2L ^ l2))) << CP_fC.b("o", (int)27249, (long)(0x1B5D05A4E1EDF3D5L ^ l2))) + ((long)(byArray[3] & CP_fC.b("o", (int)15465, (long)(0x2CE62228DC68A5C2L ^ l2))) << CP_fC.b("o", (int)13773, (long)(0x73AE8FE9664D2C74L ^ l2))) + ((long)(byArray[4] & CP_fC.b("o", (int)15465, (long)(0x2CE62228DC68A5C2L ^ l2))) << CP_fC.b("o", (int)10401, (long)(0xD168DBB7574310CL ^ l2))) + (long)((byArray[5] & CP_fC.b("o", (int)15465, (long)(0x2CE62228DC68A5C2L ^ l2))) << CP_fC.b("o", (int)19906, (long)(0x55E2BDAEEE495464L ^ l2))) + (long)((byArray[CP_fC.b("o", (int)25961, (long)(0x7A0C4A1FA621FCC0L ^ l2))] & CP_fC.b("o", (int)15465, (long)(0x2CE62228DC68A5C2L ^ l2))) << CP_fC.b("o", (int)17485, (long)(0x2E1ACC5840605DE2L ^ l2))) + (long)((byArray[CP_fC.b("o", (int)23973, (long)(0x67689EE7DFE8441FL ^ l2))] & CP_fC.b("o", (int)15465, (long)(0x2CE62228DC68A5C2L ^ l2))) << 0);
            if (string != null) {
                PacketWrapper.CP_e(new int[5]);
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CP_fC.a(illegalStateException);
        }
        return l;
    }

    public long CP_r() {
        byte by;
        long l = a ^ 0x2BE11A5B2F99L;
        long l2 = 0L;
        int n = 0;
        String string = CP_fC.CP_r();
        while (((by = this.CP_UnderScore()) & CP_fC.b("o", (int)26855, (long)(0x42302DB518419867L ^ l))) == CP_fC.b("o", (int)26855, (long)(0x42302DB518419867L ^ l))) {
            l2 |= (long)(by & CP_fC.b("o", (int)22565, (long)(0x50DEAB6E83E8A8A8L ^ l))) << n++ * CP_fC.b("o", (int)23973, (long)(0x67688E0879522D3CL ^ l));
            while (n > CP_fC.b("o", (int)17600, (long)(0x29173BC159A6B44FL ^ l))) {
                if (string != null) continue;
                throw new IllegalStateException((String)((Object)CP_fC.a("g", (int)32013, (long)(0x1DB6DBDFDE6FF810L ^ l))));
            }
        }
        return l2 | (long)(by & CP_fC.b("o", (int)22565, (long)(0x50DEAB6E83E8A8A8L ^ l))) << n * CP_fC.b("o", (int)23973, (long)(0x67688E0879522D3CL ^ l));
    }

    public float CP_B() {
        return Float.intBitsToFloat(this.CP_m());
    }

    public double CP_s() {
        return Double.longBitsToDouble(this.CP_p());
    }

    /*
     * Loose catch block
     */
    public byte[] CP_P(int n) {
        int n2;
        String string;
        block11: {
            block12: {
                long l = a ^ 0x26E382B16283L;
                string = CP_fC.CP_r();
                n2 = n;
                if (string != null) break block11;
                try {
                    block15: {
                        if (n2 >= 0) break block12;
                        break block15;
                        catch (IOException iOException) {
                            throw CP_fC.a(iOException);
                        }
                    }
                    throw new IllegalArgumentException((String)((Object)CP_fC.a("g", (int)9815, (long)(0x42979578513A6E52L ^ l))));
                }
                catch (IOException iOException) {
                    throw CP_fC.a(iOException);
                }
            }
            n2 = n;
        }
        byte[] byArray = new byte[n2];
        int n3 = 0;
        while (n3 < n) {
            block13: {
                int n4;
                int n5;
                block14: {
                    n5 = 0;
                    try {
                        n5 = this.read(byArray, n3, n - n3);
                    }
                    catch (IOException iOException) {
                        iOException.printStackTrace();
                    }
                    try {
                        try {
                            n4 = n5;
                            if (string != null) break block13;
                            if (n4 >= 0) break block14;
                        }
                        catch (IOException iOException) {
                            throw CP_fC.a(iOException);
                        }
                        throw new IllegalStateException();
                    }
                    catch (IOException iOException) {
                        throw CP_fC.a(iOException);
                    }
                }
                n4 = n3 = n3 + n5;
            }
            if (string == null) continue;
        }
        return byArray;
    }

    public int CP_N(byte[] byArray) {
        try {
            return this.read(byArray);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return -1;
        }
    }

    public int CP_n(byte[] byArray, int n, int n2) {
        try {
            return this.read(byArray, n, n2);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return -1;
        }
    }

    public short[] CP_d(int n) {
        int n2;
        block7: {
            block8: {
                long l = a ^ 0x8239555823EL;
                String string = CP_fC.CP_r();
                try {
                    try {
                        n2 = n;
                        if (string != null) break block7;
                        if (n2 >= 0) break block8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw CP_fC.a(illegalStateException);
                    }
                    throw new IllegalArgumentException((String)((Object)CP_fC.a("g", (int)9815, (long)(0x4297BBB846DE8EEFL ^ l))));
                }
                catch (IllegalStateException illegalStateException) {
                    throw CP_fC.a(illegalStateException);
                }
            }
            n2 = n;
        }
        short[] sArray = new short[n2];
        int n3 = this.CP_c(sArray);
        try {
            if (n3 < n) {
                throw new IllegalStateException();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CP_fC.a(illegalStateException);
        }
        return sArray;
    }

    public int CP_c(short[] sArray) {
        return this.CP_w(sArray, 0, sArray.length);
    }

    public int CP_w(short[] sArray, int n, int n2) {
        long l = a ^ 0x7C5C6BFA3036L;
        String string = CP_fC.CP_r();
        for (int i = n; i < n + n2; ++i) {
            try {
                sArray[i] = this.CP_V();
                continue;
            }
            catch (Exception exception) {
                return i - n;
            }
        }
        return n2;
    }

    public int[] CP_A(int n) {
        int n2;
        block7: {
            block8: {
                long l = a ^ 0x2781A48A7D9FL;
                String string = CP_fC.CP_r();
                try {
                    try {
                        n2 = n;
                        if (string != null) break block7;
                        if (n2 >= 0) break block8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw CP_fC.a(illegalStateException);
                    }
                    throw new IllegalArgumentException((String)((Object)CP_fC.a("g", (int)9627, (long)(0x47CE1ABF61207283L ^ l))));
                }
                catch (IllegalStateException illegalStateException) {
                    throw CP_fC.a(illegalStateException);
                }
            }
            n2 = n;
        }
        int[] nArray = new int[n2];
        int n3 = this.CP_j(nArray);
        try {
            if (n3 < n) {
                throw new IllegalStateException();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CP_fC.a(illegalStateException);
        }
        return nArray;
    }

    public int CP_j(int[] nArray) {
        return this.CP_H(nArray, 0, nArray.length);
    }

    public int CP_H(int[] nArray, int n, int n2) {
        long l = a ^ 0xFA6B706B6FEL;
        String string = CP_fC.CP_r();
        for (int i = n; i < n + n2; ++i) {
            try {
                nArray[i] = this.CP_m();
                continue;
            }
            catch (Exception exception) {
                return i - n;
            }
        }
        return n2;
    }

    public long[] CP_g(int n) {
        int n2;
        block7: {
            block8: {
                long l = a ^ 0x7C9D210F0E4EL;
                String string = CP_fC.CP_r();
                try {
                    try {
                        n2 = n;
                        if (string != null) break block7;
                        if (n2 >= 0) break block8;
                    }
                    catch (IllegalStateException illegalStateException) {
                        throw CP_fC.a(illegalStateException);
                    }
                    throw new IllegalArgumentException((String)((Object)CP_fC.a("g", (int)9815, (long)(0x4297CF06F284029FL ^ l))));
                }
                catch (IllegalStateException illegalStateException) {
                    throw CP_fC.a(illegalStateException);
                }
            }
            n2 = n;
        }
        long[] lArray = new long[n2];
        int n3 = this.CP_O(lArray);
        try {
            if (n3 < n) {
                throw new IllegalStateException();
            }
        }
        catch (IllegalStateException illegalStateException) {
            throw CP_fC.a(illegalStateException);
        }
        return lArray;
    }

    public int CP_O(long[] lArray) {
        return this.CP_g(lArray, 0, lArray.length);
    }

    public int CP_g(long[] lArray, int n, int n2) {
        long l = a ^ 0x79F683BF0BDDL;
        String string = CP_fC.CP_r();
        for (int i = n; i < n + n2; ++i) {
            try {
                lArray[i] = this.CP_p();
                continue;
            }
            catch (Exception exception) {
                return i - n;
            }
        }
        return n2;
    }

    public String CP_Y() {
        int n = this.CP_O();
        byte[] byArray = this.CP_P(n);
        return new String(byArray, StandardCharsets.UTF_8);
    }

    public UUID CP_I() {
        return new UUID(this.CP_p(), this.CP_p());
    }

    public static void CP_H(String string) {
        CP_v = string;
    }

    public static String CP_r() {
        return CP_v;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_fC.a = CP_s.a(606331997889547348L, 5807527386792190457L, MethodHandles.lookup().lookupClass()).a(280770765536712L);
                        CP_fC.d = new HashMap<K, V>(13);
                        var11 = CP_fC.a ^ 133655461376019L;
                        CP_fC.CP_H(null);
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
                        var20_3 = new String[4];
                        var18_4 = 0;
                        var17_5 = "\u0080\u00c0\u00d9\u00fbL4\u0092\u0081\u00ael\u00c9R\u00dd\u0005\u0000\u00a7\u00ae\u00c4U\u00ce\u009ab\u00b3lk\u0080\u00a2ca\u0018\u009c\"_\u009d\u00a5\u0011N\u00e7\u00e0\"\u00ea\u0004\u00dc\u00d1x_2\u00ae\u00f5\u00ae\u00a6\u00a5\u0002\u00a6@\u00b3@g\u00a5\u00d9\u00e81\u00a7\u00b6\u00a6\u00b9\u0010\u001c\u0091\u00d32\u00ee~\u0000\u008d\u00f2E\u00e9\u00e2P\u00f2(\u00ffVL\u00c6\u0092#/\u00d8\u00e7\u0099\u00b1+\u0005\u00b2\u00d9\u00f9GO|\u0007\u009a\u0007a,\u00f0+\u00ab\u00ce\u00ae\u00be\u00c6\u00a73N\u00dd;\u00cc@\u00fb";
                        var19_6 = "\u0080\u00c0\u00d9\u00fbL4\u0092\u0081\u00ael\u00c9R\u00dd\u0005\u0000\u00a7\u00ae\u00c4U\u00ce\u009ab\u00b3lk\u0080\u00a2ca\u0018\u009c\"_\u009d\u00a5\u0011N\u00e7\u00e0\"\u00ea\u0004\u00dc\u00d1x_2\u00ae\u00f5\u00ae\u00a6\u00a5\u0002\u00a6@\u00b3@g\u00a5\u00d9\u00e81\u00a7\u00b6\u00a6\u00b9\u0010\u001c\u0091\u00d32\u00ee~\u0000\u008d\u00f2E\u00e9\u00e2P\u00f2(\u00ffVL\u00c6\u0092#/\u00d8\u00e7\u0099\u00b1+\u0005\u00b2\u00d9\u00f9GO|\u0007\u009a\u0007a,\u00f0+\u00ab\u00ce\u00ae\u00be\u00c6\u00a73N\u00dd;\u00cc@\u00fb".length();
                        var16_7 = 56;
                        var15_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_fC.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u001c\u0006fvvW\u00cf_\u00b5\u0082\u00c1D\u00eb\u0098]&\f7\u00c5\u00c3\u0015\u00d8\u00dc\u00a8\u00c3\u00ac\u00d7u\u00a4\u00adEkd;dQ\u00e6\u00aa\u00acD$\u008cA6U\u0001\u00e3g\u009aT\u001c\u00d8;\u0001\u00c5\u00a5\u00a4_\u0006\u00fb9\u0080\u00f3\u00a5@\u00a3\u00bdX{J\u0005b\u0001r\u0004\u00f5%\u0091\u00a3\\\u00195X\t\u00f2j\u0085U\u0006\u00ba\u00f7\u00db\u00f4\u00f3\u001bz\u00e9\u00b43\u00dcKA\u00ea\u001e\u00ff\r\u0089\u00a4\u0090\u001fDY\u00ee\u00f8\u00fe\u00f2F\u00bb\u00f5<\u0013\u00b9YS\u008c\u00d7\u0018\u00de*";
                            var19_6 = "\u001c\u0006fvvW\u00cf_\u00b5\u0082\u00c1D\u00eb\u0098]&\f7\u00c5\u00c3\u0015\u00d8\u00dc\u00a8\u00c3\u00ac\u00d7u\u00a4\u00adEkd;dQ\u00e6\u00aa\u00acD$\u008cA6U\u0001\u00e3g\u009aT\u001c\u00d8;\u0001\u00c5\u00a5\u00a4_\u0006\u00fb9\u0080\u00f3\u00a5@\u00a3\u00bdX{J\u0005b\u0001r\u0004\u00f5%\u0091\u00a3\\\u00195X\t\u00f2j\u0085U\u0006\u00ba\u00f7\u00db\u00f4\u00f3\u001bz\u00e9\u00b43\u00dcKA\u00ea\u001e\u00ff\r\u0089\u00a4\u0090\u001fDY\u00ee\u00f8\u00fe\u00f2F\u00bb\u00f5<\u0013\u00b9YS\u008c\u00d7\u0018\u00de*".length();
                            var16_7 = 64;
                            var15_8 = -1;
lbl35:
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
lbl40:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = CP_fC.a(var21_9).intern();
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
lbl52:
                        // 1 sources

                        ** continue;
                    }
                }
                CP_fC.b = var20_3;
                CP_fC.c = new String[4];
                CP_fC.g = new HashMap<K, V>(13);
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
                var6_12 = new long[20];
                var3_13 = 0;
                var4_14 = "\u00baX\u00147\u00cc\u00f3#w\u00a2\u00c1\u000ff\u009am\u00acgS\f\u00b8\u00d8\u00dbc\u00fd\u008cA\u00a9\u0010;N\u0013\u00bdT\u000bW\u00f4\u0012\u0004\u00e7\u00a8G\u0092\u0085\u0013\u00f2;\u00abG\u00cd\u00a1$\u00d5j\u00ab\u0000\u00de$\u00daQ\u00a9G4\u00cbN9\u00e5i\u00f0\u00f4\u00c7+\u00e5\u0005\u00f9\u0010U\u00f8M\u009d\u008e'\u00ae\u00c1A%\u008c\u00c5\u00a9\u00fa\u00f2\u00a4\u0099\u00fb{\u00c7H\u0004\u00e8\u0099\u00ed/)\u008e\u00e3\u0006\u00cd\u00d7\u008aG\u0083\u00c3\u0016\u00ffS\u00f2Vm\u0092\u00ebl\u0005S\u00ee\u00f3\u0089\u00e8!\u00bf\u00f9\u00b0\u0004\u00d9v\u001a\u00e5\u00f5`\u0017LQEW\u00bfmv";
                var5_15 = "\u00baX\u00147\u00cc\u00f3#w\u00a2\u00c1\u000ff\u009am\u00acgS\f\u00b8\u00d8\u00dbc\u00fd\u008cA\u00a9\u0010;N\u0013\u00bdT\u000bW\u00f4\u0012\u0004\u00e7\u00a8G\u0092\u0085\u0013\u00f2;\u00abG\u00cd\u00a1$\u00d5j\u00ab\u0000\u00de$\u00daQ\u00a9G4\u00cbN9\u00e5i\u00f0\u00f4\u00c7+\u00e5\u0005\u00f9\u0010U\u00f8M\u009d\u008e'\u00ae\u00c1A%\u008c\u00c5\u00a9\u00fa\u00f2\u00a4\u0099\u00fb{\u00c7H\u0004\u00e8\u0099\u00ed/)\u008e\u00e3\u0006\u00cd\u00d7\u008aG\u0083\u00c3\u0016\u00ffS\u00f2Vm\u0092\u00ebl\u0005S\u00ee\u00f3\u0089\u00e8!\u00bf\u00f9\u00b0\u0004\u00d9v\u001a\u00e5\u00f5`\u0017LQEW\u00bfmv".length();
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
lbl79:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00dasE\u00d1\u00bf<l<d{\u00cdW\u00e0`\u00f7X";
                    var5_15 = "\u00dasE\u00d1\u00bf<l<d{\u00cdW\u00e0`\u00f7X".length();
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
lbl92:
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
lbl105:
                // 1 sources

                ** continue;
            }
        }
        CP_fC.e = var6_12;
        CP_fC.f = new Integer[20];
    }

    private static Exception a(Exception exception) {
        return exception;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x241;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_fC", exception);
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
            CP_fC.c[n2] = CP_fC.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_fC.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_fC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x77D5;
        if (f[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = e[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])g.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    g.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_fC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_fC.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_fC.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/CP_fC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_fC.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_fC.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

