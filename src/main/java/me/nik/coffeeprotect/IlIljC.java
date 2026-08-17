/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  org.bukkit.Bukkit
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
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;

public final class IlIljC
extends Enum<IlIljC> {
    public static final /* enum */ IlIljC LATEST;
    public static final /* enum */ IlIljC v26_1_2;
    public static final /* enum */ IlIljC v26_1_1;
    public static final /* enum */ IlIljC v26_1;
    public static final /* enum */ IlIljC v1_21_11;
    public static final /* enum */ IlIljC v1_21_10;
    public static final /* enum */ IlIljC v1_21_9;
    public static final /* enum */ IlIljC v1_21_8;
    public static final /* enum */ IlIljC v1_21_7;
    public static final /* enum */ IlIljC v1_21_6;
    public static final /* enum */ IlIljC v1_21_5;
    public static final /* enum */ IlIljC v1_21_4;
    public static final /* enum */ IlIljC v1_21;
    public static final /* enum */ IlIljC v1_20_6;
    public static final /* enum */ IlIljC v1_20_5;
    public static final /* enum */ IlIljC v1_20_R3;
    public static final /* enum */ IlIljC v1_20_R2;
    public static final /* enum */ IlIljC v1_20_R1;
    public static final /* enum */ IlIljC v1_19_R3;
    public static final /* enum */ IlIljC v1_19_R2;
    public static final /* enum */ IlIljC v1_19_R1;
    public static final /* enum */ IlIljC v1_18_R2;
    public static final /* enum */ IlIljC v1_18_R1;
    public static final /* enum */ IlIljC v1_17_R1;
    public static final /* enum */ IlIljC v1_16_R3;
    public static final /* enum */ IlIljC v1_16_R2;
    public static final /* enum */ IlIljC v1_16_R1;
    public static final /* enum */ IlIljC v1_15_R1;
    public static final /* enum */ IlIljC v1_14_R1;
    public static final /* enum */ IlIljC v1_13_R2;
    public static final /* enum */ IlIljC v1_13_R1;
    public static final /* enum */ IlIljC v1_12_R1;
    public static final /* enum */ IlIljC v1_11_R1;
    public static final /* enum */ IlIljC v1_10_R1;
    public static final /* enum */ IlIljC v1_9_R2;
    public static final /* enum */ IlIljC v1_9_R1;
    public static final /* enum */ IlIljC v1_8_R3;
    public static final /* enum */ IlIljC v1_8_R2;
    public static final /* enum */ IlIljC v1_8_R1;
    private static IlIljC IlIlk;
    public final int value;
    private static final /* synthetic */ IlIljC[] IlIlb;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;

    public static IlIljC[] values() {
        return (IlIljC[])IlIlb.clone();
    }

    public static IlIljC valueOf(String string) {
        return Enum.valueOf(IlIljC.class, string);
    }

    private IlIljC(int n2) {
        this.value = n2;
    }

    public static IlIljC IlIlZ() {
        long l = a ^ 0x3E392AF0AC15L;
        if (IlIlk == null) {
            IlIljC ilIljC;
            String string = Bukkit.getServer().getClass().getPackage().getName();
            try {
                ilIljC = string.equals(IlIljC.a("s", (int)2291, (long)(0xDEB86A8E2D6251L ^ l))) ? IlIljC.valueOf("v" + Bukkit.getServer().getBukkitVersion().split("-")[0].replace(".", "_")) : IlIljC.valueOf(string.substring(string.lastIndexOf(".") + 1).trim());
            }
            catch (IllegalArgumentException illegalArgumentException) {
                ilIljC = LATEST;
            }
            IlIlk = ilIljC;
        }
        return IlIlk;
    }

    public boolean IlIlR(IlIljC ilIljC) {
        boolean bl;
        long l = a ^ 0x1910B4625B53L;
        try {
            bl = IlIljC.IlIlk.value > ilIljC.value;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIljC.a(illegalArgumentException);
        }
        return bl;
    }

    public boolean IlIlW(IlIljC ilIljC) {
        boolean bl;
        long l = a ^ 0xB76785D48B7L;
        try {
            bl = IlIljC.IlIlk.value >= ilIljC.value;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIljC.a(illegalArgumentException);
        }
        return bl;
    }

    public boolean IlIlu(IlIljC ilIljC) {
        boolean bl;
        long l = a ^ 0x3F94BC332A40L;
        try {
            bl = IlIljC.IlIlk.value < ilIljC.value;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw IlIljC.a(illegalArgumentException);
        }
        return bl;
    }

    public boolean IlIlo(IlIljC ilIljC) {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x7CDB80A5C7A8L;
                String string = IlIlrW.IlIlx();
                try {
                    try {
                        n = IlIljC.IlIlk.value;
                        if (string == null) break block4;
                        if (n > ilIljC.value) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIljC.a(illegalArgumentException);
                    }
                    n = 1;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIljC.a(illegalArgumentException);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    public boolean IlIlZ(IlIljC ilIljC) {
        int n;
        block4: {
            block5: {
                long l = a ^ 0x61E4297E2210L;
                String string = IlIlrW.IlIlx();
                try {
                    try {
                        n = IlIljC.IlIlk.value;
                        if (string == null) break block4;
                        if (n != ilIljC.value) break block5;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIljC.a(illegalArgumentException);
                    }
                    n = 1;
                    break block4;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIljC.a(illegalArgumentException);
                }
            }
            n = 0;
        }
        return n != 0;
    }

    public boolean IlIlr(IlIljC ilIljC, IlIljC ilIljC2) {
        boolean bl;
        block5: {
            block4: {
                long l = a ^ 0x47B702D8EE85L;
                try {
                    try {
                        if (IlIljC.IlIlk.value < ilIljC.value || IlIljC.IlIlk.value > ilIljC2.value) break block4;
                    }
                    catch (IllegalArgumentException illegalArgumentException) {
                        throw IlIljC.a(illegalArgumentException);
                    }
                    bl = true;
                    break block5;
                }
                catch (IllegalArgumentException illegalArgumentException) {
                    throw IlIljC.a(illegalArgumentException);
                }
            }
            bl = false;
        }
        return bl;
    }

    public String toString() {
        return this.name().substring(1).replace("_", ".");
    }

    private static /* synthetic */ IlIljC[] IlIle() {
        long l = a ^ 0x32D44324BB65L;
        IlIljC[] ilIljCArray = new IlIljC[IlIljC.b("u", (int)5876, (long)(0x3E5FCEDC2A22DC78L ^ l))];
        ilIljCArray[0] = LATEST;
        ilIljCArray[1] = v26_1_2;
        ilIljCArray[2] = v26_1_1;
        ilIljCArray[3] = v26_1;
        ilIljCArray[4] = v1_21_11;
        ilIljCArray[5] = v1_21_10;
        ilIljCArray[IlIljC.b("u", (int)21988, (long)(0x32B057ACB9719F57L ^ l))] = v1_21_9;
        ilIljCArray[IlIljC.b("u", (int)32511, (long)(0x791F33B3C2A3B475L ^ l))] = v1_21_8;
        ilIljCArray[IlIljC.b("u", (int)26756, (long)(0x29BB7851CE7AA21FL ^ l))] = v1_21_7;
        ilIljCArray[IlIljC.b("u", (int)3932, (long)(0x5FD67084949145C2L ^ l))] = v1_21_6;
        ilIljCArray[IlIljC.b("u", (int)10123, (long)(0x50151468BED1ED00L ^ l))] = v1_21_5;
        ilIljCArray[IlIljC.b("u", (int)10858, (long)(0x5FD161FC383560D6L ^ l))] = v1_21_4;
        ilIljCArray[IlIljC.b("u", (int)1134, (long)(0x636BE5105298CED9L ^ l))] = v1_21;
        ilIljCArray[IlIljC.b("u", (int)16466, (long)(0x1C3F643371DD8AD0L ^ l))] = v1_20_6;
        ilIljCArray[IlIljC.b("u", (int)4180, (long)(0x3AFA335B5842DADAL ^ l))] = v1_20_5;
        ilIljCArray[IlIljC.b("u", (int)31526, (long)(0x75B818123981B1B6L ^ l))] = v1_20_R3;
        ilIljCArray[IlIljC.b("u", (int)12620, (long)(0x1E6A822204F37BD9L ^ l))] = v1_20_R2;
        ilIljCArray[IlIljC.b("u", (int)12652, (long)(0xFDD3C959D467BCEL ^ l))] = v1_20_R1;
        ilIljCArray[IlIljC.b("u", (int)556, (long)(0x1757C8DD6CD7C880L ^ l))] = v1_19_R3;
        ilIljCArray[IlIljC.b("u", (int)19946, (long)(0x2F118FAD2E10742L ^ l))] = v1_19_R2;
        ilIljCArray[IlIljC.b("u", (int)13999, (long)(0x6765F0D61519FC36L ^ l))] = v1_19_R1;
        ilIljCArray[IlIljC.b("u", (int)9219, (long)(0x33AAD2D57F54EEB7L ^ l))] = v1_18_R2;
        ilIljCArray[IlIljC.b("u", (int)15422, (long)(0x3564A6F76E7176A1L ^ l))] = v1_18_R1;
        ilIljCArray[IlIljC.b("u", (int)7329, (long)(0x26BA62066931D620L ^ l))] = v1_17_R1;
        ilIljCArray[IlIljC.b("u", (int)15548, (long)(0x1D3B579086AF606L ^ l))] = v1_16_R3;
        ilIljCArray[IlIljC.b("u", (int)6265, (long)(0x315106FEF58052EEL ^ l))] = v1_16_R2;
        ilIljCArray[IlIljC.b("u", (int)288, (long)(0x490678651B90CBA9L ^ l))] = v1_16_R1;
        ilIljCArray[IlIljC.b("u", (int)13831, (long)(0x27CDA8CCD7F5FC91L ^ l))] = v1_15_R1;
        ilIljCArray[IlIljC.b("u", (int)26356, (long)(0x7473095D49992C5BL ^ l))] = v1_14_R1;
        ilIljCArray[IlIljC.b("u", (int)6821, (long)(0x611DCB835C53500BL ^ l))] = v1_13_R2;
        ilIljCArray[IlIljC.b("u", (int)30757, (long)(0x1818D8BCEFDAB2A5L ^ l))] = v1_13_R1;
        ilIljCArray[IlIljC.b("u", (int)10603, (long)(0x5747D010D2DC63A9L ^ l))] = v1_12_R1;
        ilIljCArray[IlIljC.b("u", (int)22014, (long)(0x1F23D80B8859F63L ^ l))] = v1_11_R1;
        ilIljCArray[IlIljC.b("u", (int)25604, (long)(0x2110950C5A2F2E95L ^ l))] = v1_10_R1;
        ilIljCArray[IlIljC.b("u", (int)25959, (long)(0x1DA7BB5B49522FF3L ^ l))] = v1_9_R2;
        ilIljCArray[IlIljC.b("u", (int)4789, (long)(0x205D4A5518F35813L ^ l))] = v1_9_R1;
        ilIljCArray[IlIljC.b("u", (int)21027, (long)(0x198728AB8D1E18BBL ^ l))] = v1_8_R3;
        ilIljCArray[IlIljC.b("u", (int)19078, (long)(0x60414A5B9168001AL ^ l))] = v1_8_R2;
        ilIljCArray[IlIljC.b("u", (int)13120, (long)(0x1F8DF395CAC7F9C3L ^ l))] = v1_8_R1;
        return ilIljCArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        IlIljC.a = IlIls.a((long)6175997616566893089L, (long)1283292441109788708L, MethodHandles.lookup().lookupClass()).a(213741461273215L);
                        var20 = IlIljC.a ^ 113105286440260L;
                        IlIljC.d = new HashMap<K, V>(13);
                        var11_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var12_2 = 1; var12_2 < 8; ++var12_2) {
                            v2 = v2;
                            v2[var12_2] = (byte)(var20 << var12_2 * 8 >>> 56);
                        }
                        var11_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var18_3 = new String[40];
                        var16_4 = 0;
                        var15_5 = "\u00b2\u00fc\u00d3\u008cC\u00b27kj\u0097Mn\u00a6<r$\u0010\u00a7\u008e\u00b5\u008c\u00b8\u0097\u00e5\u00cb\r5\u00cb\u00e5\u00ee\u00a2\u009f! \"\u00a6\u00ca\u0093\u00c6\u008aU\u00fbf\u009f\u00065)kfEf\u0093d\u00a5E[\u00abJ\u00f0\u008b\u008e\u00b7\u00baJ\u00eb\n\u0010\u00c1E2\u0013\u0095\u0097\u0018QV\u00ae\u0091\u00c6\u00b8\u0004\u008fR\u0010x\u00c9\u0000\u00f9\u001dtJbpM\u00e4\u00c8.e\u00d5\u00ed\u0018y\u00f7\u00d8C\u0001\u00c36ag\u00fc\u0001\u0005\f08\u00c5\u00cfj\u00d9\u00c3\u0097Y\u00ab\u00cc\u0010\u00f2P\u009f\u0095\u0011r\u00dft\u00bd\u0003\u00e0\u00de\u00a1bG\u00a5 :\u00bd\u00ccM\u001d\u0010\\\u001a\u00cd\u00f1\u00e5t\u0018\u00da\u0003\u00f1\u00df\u00d0\u0098\u00df\u008aU\u00ce\u00e1e\u009d^\u0001\u0019<P\u0084\u0010|\u00bf\u007f{\u008b\u00e6(\f \u00be\u0012\n\u00fc\u0085x\u00a2\u00100V\u00e5\u0007fW\u00fb\u00dc\u00d1L\u009eq*\u00b2K* \u001a\u0092\u0000\u001a\u00c0\u008c\tm\u0098\u00b2\u00f0\"\u00a3\u00031g\u00d7\u00c7\u001a=\u00f0q\u00d8=]G\u00c9\u00c2M\u0080\u00fc-\u0010\u009a\u00a0\u00dfS\u0089\u007f?\u001bk5\u000f\u00d8\u0088T\r  5k\u0099\r\u00f4\u0093\u00f7IJo\u00fdj\u00d9{#^\u00da\u00f08\u00b7\u00d56vr\u009d\u00d3\u008c\u008f\u00e9g\u00cd= 8\u00ad\u00db\u007f\u0095\u00e2\u00d6\"\u00f9hSt>W\u0018\u00e9\u00c8RwZv\u00fe\u0010u<C\u0088'^\u0002\u00f4E \blE?\u0094\u00d4f\u0018\u00d1\u0002\u001e\u0003\u001cV\u00d4:\u0095\u00e9\u00d8\u00c7\u00f6p\u00de2\u00915\u00f9\u00a6)t}\u00e7\u0018\u0001h~\u0012\u0097\u00a7\u0087\u00c9\u00b8m\u00a0\u00af\u0089/\u00fam\u00b5\u00f3\u0006\u0002\u00db\u00ea\u00bf\u00b1 pF\u00a7\u00f4\u00913x\u001c\u00eb\u00c4\u00c8\u00c48}V\u009a\u009e\u008b\u0098\u001aU]kz\u0089\b\u008a\u001b\u00c2\u00b5\u00f6[\u0010\t\u00a3\u00bdl\u00e9\u0095{\u00c3C\u0089\u0004u\u00f3\u0085\u0015\u00bf\u0010T\u00c3\u00d9\u009dD3JP9\u00cf\u00dep\u00cc\u0001\u0094\u007f W\u00be\u0006 k8\u0090\u00ed\u00b4{\u00aa\u00fdU\u000e)[i9\u009c*\u0015k\b\u00c0\u00caFt\u00d7+\u008f\b\u00fd\u0018\u001f\u0087\u0092\t\u008e\u009f\u0090\u008a\u0018k\u00be$\u00f7J\u00eb\u00f1\u009b\u0093\u0016\u00f1L\u0088R\u00c7\u0010\u0095Hx\u00e1>\u0002\u00fb\u0004\u00af[h\u00cd\u00a4\u00d8|U\u0018\u0084\u00a9SQ\u00b3\u00b3v\u00b6*\u00a0\u00c3O\u00d2V\u000edv\u00c4v\u001f\u0013\u001d\u00bf\u00eb\u0018\u0013\u00b6\u00f9\u00a8\u00acZ\u00fc\u0080w@Yl\u0083\u00d0m\u00d2\u00f04\u00c4\u0095\u008a\u00f7\u0097^(8}!4?\u00caL\u00d0\u0092\u0018\u00c4F]'\u00d4px\u00b2/\u00f2\u00b1\u00d8\u000b\u00b80\u0017\u0095:\u00d4t\r\u0015\u0018H\u00a7\u0089l\u00d5\u00af\u00a2\u0010\n8\u00ccRc\u008f\u00d3\u00f2\u0007\u00e3\u00c4\u0013b$\u00d2\u0086\u0018@6k\u00a08Mc\u00d1\u00e46@\u00f3d\u00f8.FF*\u00e8\u009d<I'H p\u00d8\u0084y\u00c2\u00ce\u0013\u00ac-i\u00d9\u0003\u00d9T\u00b0\u001c=\u0085$\u00b1@\u0086\u0093P\u00dc\u001d\f\u0001\u001a\u0005J1\u0010 \u00ef\u00a9}\u0093\u00fe\u00cb\u0097\u00e5`\u0013\u00b2Uf\u00f4\u00cc\u0010\u00ff\u00b9\u00e9\u00b4\u00d0A\u00ac\u001a\u0000$H\u00c0\u001f\u0088\u00dc\u001d\u0010\u00ce\t\u0094 C\u00d0\u00f6v\u0080\u00bc\u00ca\r^\u0004\u00e0\n\u0010\"\u00163\u0096\u00ef_\u00df\u00ad\u0094\u00a8\u008c\u00ae\u008c>\u00d8m\u0010<\u00fa\u008a@\u009b\u0088\u001b$y\u0015\u00b0\u00a3.\u0001\u00b8\u0001\u0018q\u00d1\u0004\u00c4\u0096\u00ff\u0010\u00bb\u00c9\u00b6\u0089i\u00ceG\t6\u00131\u009d\u00989\u00c2\u00905\u0018q\u00c9#\u00a0\u0093\u00bf2\u00d0MG\u00c9\u00af\b\"\u008as\u0094c%\u00f4\f\u00a2;\u0018\u0018\u00f9\u009d_d\u00faS]\u00d9)#\u00ef\u0097{\f=\u0090\u00b3\u001bFi\u00e0\u00bc\u0014\u00d5 \u00e4\u00a2v:Q\u001e$m\u008d\u00e5\u0085\u00a2\u00ca\u0098C]\u0015\u00cf\u00047{U\u00a3lH82o\u00bb\u00c9\u00ce} \u008aS\u00a8\u00ec\u00eeN\u00c6.\u0096\u00a2\f\u00ce3\u00d8rB\u008f=\u00a9\u008cz\u00bb\u0018\u0097\u00b9\u00b7;\u00a0z\u007f\u0001{";
                        var17_6 = "\u00b2\u00fc\u00d3\u008cC\u00b27kj\u0097Mn\u00a6<r$\u0010\u00a7\u008e\u00b5\u008c\u00b8\u0097\u00e5\u00cb\r5\u00cb\u00e5\u00ee\u00a2\u009f! \"\u00a6\u00ca\u0093\u00c6\u008aU\u00fbf\u009f\u00065)kfEf\u0093d\u00a5E[\u00abJ\u00f0\u008b\u008e\u00b7\u00baJ\u00eb\n\u0010\u00c1E2\u0013\u0095\u0097\u0018QV\u00ae\u0091\u00c6\u00b8\u0004\u008fR\u0010x\u00c9\u0000\u00f9\u001dtJbpM\u00e4\u00c8.e\u00d5\u00ed\u0018y\u00f7\u00d8C\u0001\u00c36ag\u00fc\u0001\u0005\f08\u00c5\u00cfj\u00d9\u00c3\u0097Y\u00ab\u00cc\u0010\u00f2P\u009f\u0095\u0011r\u00dft\u00bd\u0003\u00e0\u00de\u00a1bG\u00a5 :\u00bd\u00ccM\u001d\u0010\\\u001a\u00cd\u00f1\u00e5t\u0018\u00da\u0003\u00f1\u00df\u00d0\u0098\u00df\u008aU\u00ce\u00e1e\u009d^\u0001\u0019<P\u0084\u0010|\u00bf\u007f{\u008b\u00e6(\f \u00be\u0012\n\u00fc\u0085x\u00a2\u00100V\u00e5\u0007fW\u00fb\u00dc\u00d1L\u009eq*\u00b2K* \u001a\u0092\u0000\u001a\u00c0\u008c\tm\u0098\u00b2\u00f0\"\u00a3\u00031g\u00d7\u00c7\u001a=\u00f0q\u00d8=]G\u00c9\u00c2M\u0080\u00fc-\u0010\u009a\u00a0\u00dfS\u0089\u007f?\u001bk5\u000f\u00d8\u0088T\r  5k\u0099\r\u00f4\u0093\u00f7IJo\u00fdj\u00d9{#^\u00da\u00f08\u00b7\u00d56vr\u009d\u00d3\u008c\u008f\u00e9g\u00cd= 8\u00ad\u00db\u007f\u0095\u00e2\u00d6\"\u00f9hSt>W\u0018\u00e9\u00c8RwZv\u00fe\u0010u<C\u0088'^\u0002\u00f4E \blE?\u0094\u00d4f\u0018\u00d1\u0002\u001e\u0003\u001cV\u00d4:\u0095\u00e9\u00d8\u00c7\u00f6p\u00de2\u00915\u00f9\u00a6)t}\u00e7\u0018\u0001h~\u0012\u0097\u00a7\u0087\u00c9\u00b8m\u00a0\u00af\u0089/\u00fam\u00b5\u00f3\u0006\u0002\u00db\u00ea\u00bf\u00b1 pF\u00a7\u00f4\u00913x\u001c\u00eb\u00c4\u00c8\u00c48}V\u009a\u009e\u008b\u0098\u001aU]kz\u0089\b\u008a\u001b\u00c2\u00b5\u00f6[\u0010\t\u00a3\u00bdl\u00e9\u0095{\u00c3C\u0089\u0004u\u00f3\u0085\u0015\u00bf\u0010T\u00c3\u00d9\u009dD3JP9\u00cf\u00dep\u00cc\u0001\u0094\u007f W\u00be\u0006 k8\u0090\u00ed\u00b4{\u00aa\u00fdU\u000e)[i9\u009c*\u0015k\b\u00c0\u00caFt\u00d7+\u008f\b\u00fd\u0018\u001f\u0087\u0092\t\u008e\u009f\u0090\u008a\u0018k\u00be$\u00f7J\u00eb\u00f1\u009b\u0093\u0016\u00f1L\u0088R\u00c7\u0010\u0095Hx\u00e1>\u0002\u00fb\u0004\u00af[h\u00cd\u00a4\u00d8|U\u0018\u0084\u00a9SQ\u00b3\u00b3v\u00b6*\u00a0\u00c3O\u00d2V\u000edv\u00c4v\u001f\u0013\u001d\u00bf\u00eb\u0018\u0013\u00b6\u00f9\u00a8\u00acZ\u00fc\u0080w@Yl\u0083\u00d0m\u00d2\u00f04\u00c4\u0095\u008a\u00f7\u0097^(8}!4?\u00caL\u00d0\u0092\u0018\u00c4F]'\u00d4px\u00b2/\u00f2\u00b1\u00d8\u000b\u00b80\u0017\u0095:\u00d4t\r\u0015\u0018H\u00a7\u0089l\u00d5\u00af\u00a2\u0010\n8\u00ccRc\u008f\u00d3\u00f2\u0007\u00e3\u00c4\u0013b$\u00d2\u0086\u0018@6k\u00a08Mc\u00d1\u00e46@\u00f3d\u00f8.FF*\u00e8\u009d<I'H p\u00d8\u0084y\u00c2\u00ce\u0013\u00ac-i\u00d9\u0003\u00d9T\u00b0\u001c=\u0085$\u00b1@\u0086\u0093P\u00dc\u001d\f\u0001\u001a\u0005J1\u0010 \u00ef\u00a9}\u0093\u00fe\u00cb\u0097\u00e5`\u0013\u00b2Uf\u00f4\u00cc\u0010\u00ff\u00b9\u00e9\u00b4\u00d0A\u00ac\u001a\u0000$H\u00c0\u001f\u0088\u00dc\u001d\u0010\u00ce\t\u0094 C\u00d0\u00f6v\u0080\u00bc\u00ca\r^\u0004\u00e0\n\u0010\"\u00163\u0096\u00ef_\u00df\u00ad\u0094\u00a8\u008c\u00ae\u008c>\u00d8m\u0010<\u00fa\u008a@\u009b\u0088\u001b$y\u0015\u00b0\u00a3.\u0001\u00b8\u0001\u0018q\u00d1\u0004\u00c4\u0096\u00ff\u0010\u00bb\u00c9\u00b6\u0089i\u00ceG\t6\u00131\u009d\u00989\u00c2\u00905\u0018q\u00c9#\u00a0\u0093\u00bf2\u00d0MG\u00c9\u00af\b\"\u008as\u0094c%\u00f4\f\u00a2;\u0018\u0018\u00f9\u009d_d\u00faS]\u00d9)#\u00ef\u0097{\f=\u0090\u00b3\u001bFi\u00e0\u00bc\u0014\u00d5 \u00e4\u00a2v:Q\u001e$m\u008d\u00e5\u0085\u00a2\u00ca\u0098C]\u0015\u00cf\u00047{U\u00a3lH82o\u00bb\u00c9\u00ce} \u008aS\u00a8\u00ec\u00eeN\u00c6.\u0096\u00a2\f\u00ce3\u00d8rB\u008f=\u00a9\u008cz\u00bb\u0018\u0097\u00b9\u00b7;\u00a0z\u007f\u0001{".length();
                        var14_7 = 16;
                        var13_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var13_8;
                            v4 = var15_5.substring(v3, v3 + var14_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = IlIljC.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\u0082\u00fd&f\u00c7P\u00e6e\u0081+\u00afK$I\u00a4\u00d6r;`\u00de>\u001d\u00d3y\"\u000e\u00b4\bw\u00a1\u00c8\u0002\u0010J\u001b\u007f\u00b2\u001f\u00a9in\u009f\u00c7\u0087\u00b3\u0013\u00d2\u00f9\u00d0";
                            var17_6 = "\u0082\u00fd&f\u00c7P\u00e6e\u0081+\u00afK$I\u00a4\u00d6r;`\u00de>\u001d\u00d3y\"\u000e\u00b4\bw\u00a1\u00c8\u0002\u0010J\u001b\u007f\u00b2\u001f\u00a9in\u009f\u00c7\u0087\u00b3\u0013\u00d2\u00f9\u00d0".length();
                            var14_7 = 32;
                            var13_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var13_8;
                                v4 = var15_5.substring(v6, v6 + var14_7);
                                v5 = 0;
                                break block18;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var18_3[var16_4++] = IlIljC.a(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            break block19;
                            break;
                        }
                    }
                    var19_9 = var11_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                IlIljC.b = var18_3;
                IlIljC.c = new String[40];
                IlIljC.g = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var20 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v9 = v9;
                    v9[var1_11] = (byte)(var20 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[68];
                var3_13 = 0;
                var4_14 = "\u00c3\u00c2\u00a8\u00b05>ln.B\u00d1\u0081m\u0093\u00ed\b\u001439\u00a0\u009c\u0007\u0096\u000bor>\u00c2\u0096\u00f39E\u00b3\u00d2\u00da\u00a9\u00e6\u001a\u00eb\u00d5\n\u00bbN\u0084rn\u00b7M\u00f7?7\u00d7\u00f6\u0006\u00a2\u000e\u0002\u0092j\u0086\u0015Tm\u00b6W\u001bd'\u00fa\u00c6S\u00ca\tu\u00b9\b\u0084\\\u00c5wC\u0097\u00eb]2Nr\u00b8\u008a\u00ed\u001az\u00d5r\u00da\u00b0\u00e6\u00a3\u00eb\u00de\u00b7*\u00cc\u00a8{\u00a48\u00ba\u00c7o\u0013s\u0017\u0081\u009c\u008d\u0016\u00f3\u0092@\u00ab\u00fd\u0092\u009e7P\u00ad\u00ee\u00a3\u00dc\u0099\b\u009bv\bt\u0014\u00e8\\\f,\u001b\u00daz\u00b0\u008f\u00fb\u00f6\u0080f~'>\u00e2\u0010\u0096\u001b{3\u00e3\u00ab\u00c6\u0006)@\u0099\u00c2\u00d7\u00ddyR\n\u0080\u00a3\u00fd\u00c2\u00a6D\u00a8\u00e3\u00ecrk\u00b3O\u0012\u00c5P\u00f1\u000f\u00b6\u001fW9\u00ef\u0085\u001d\u00ca\u00dd\u008b\u001c\u001a\u000b\u0090\u00ab6\u00fa\u00e7P>wa\u009b\u00ddd)\u00ba\u0085W\u00cfH\u00bc\u0086\u0016\u00ac\u00ff3;\u00aa\u00f9@\u0006\u00cd\u00bc\u0097\u00a9\u0019<\u0092\u00e0\u00d5\u009b8\u0095\u00a4\tO|\u00b6\u00a6\u008f\u0005\u00f0t\u0080\u0015\u00ba\u00ef\u0089\u00e25y?;\r}%\u00e3\u00f0\u00b6\u00e3T\u00c3\u00ff\u00d7\u001b\u00c0\u009e1\u0016\u0018m9\u00f1\b\u00d6\u008d\u0006\u00ee\u00c6_6\u00cd\u0006\u00b2\u00a5\u0091\u001b$6\f4\u001e\u00fe\u009e\u0018\u00bb\u00d6GY\u0080b\u001fD\u00bf\u0087X\u00b8AN\u008d\u000b\u008c3\t\u0082\u00b0/s\u0011\u00e7\u00fa\u0082\u00b5\u00be'\u0080=\u00a2\u001a\u0086\u00cf\u00f7>\u00e3?\u00ae\u0084a\u00d7\u00d16\u00cf\u0019\u00d0l\u0014%\u008d\u0086\u00bf\u0013\u0004\u0085\u001bV\u00a7\u00b7\u00e2\t\u00ce\u00d4],\u00b1#\u0094\u00f4B\u00f0\u00afU%\u008aX\u00e5i\u00ab\u0098\u00fc\u0096\u00f1\u00a4\u0016,}\u00a8\u00af\u00a6@\\v\u00c8!\u00e7\u00ae\u00d8\u0087\u00da^*\u001bft\u00f8~\u00cd\u001cy\u00b4\u00ca\u0091G\u00cb\u0016\u0092\u00a0:\u00c0\u0097\u0010?3A\u00bf:\u00fc\u00e26k\u008fV\u00ae\u00d4^:6B\u00e4;\u008d\u00e7\u0005\u001b6v\u00fc(\u00021\u00cb\u0014?\\\u00b4\u008a\u00da\u00a5=d\u0087\u00f5H\u0012\u00e0\u00feH\u00e9nZN\u00ac`\u00ca\u00b8\u00a7<\u00b2\u00fev7\u00beAU\u00f8\u0088\u00c6\u00ef@\u00d8Zp\u00ef2\u00c0\u009f\u00b2\u00b2\u00cf\u0014\u009b>\f\u00ce\u00a1\u00ca\u00c2+\u0088\u00c4~\u00de\u009b\u0014:\u000f\u00f7\t";
                var5_15 = "\u00c3\u00c2\u00a8\u00b05>ln.B\u00d1\u0081m\u0093\u00ed\b\u001439\u00a0\u009c\u0007\u0096\u000bor>\u00c2\u0096\u00f39E\u00b3\u00d2\u00da\u00a9\u00e6\u001a\u00eb\u00d5\n\u00bbN\u0084rn\u00b7M\u00f7?7\u00d7\u00f6\u0006\u00a2\u000e\u0002\u0092j\u0086\u0015Tm\u00b6W\u001bd'\u00fa\u00c6S\u00ca\tu\u00b9\b\u0084\\\u00c5wC\u0097\u00eb]2Nr\u00b8\u008a\u00ed\u001az\u00d5r\u00da\u00b0\u00e6\u00a3\u00eb\u00de\u00b7*\u00cc\u00a8{\u00a48\u00ba\u00c7o\u0013s\u0017\u0081\u009c\u008d\u0016\u00f3\u0092@\u00ab\u00fd\u0092\u009e7P\u00ad\u00ee\u00a3\u00dc\u0099\b\u009bv\bt\u0014\u00e8\\\f,\u001b\u00daz\u00b0\u008f\u00fb\u00f6\u0080f~'>\u00e2\u0010\u0096\u001b{3\u00e3\u00ab\u00c6\u0006)@\u0099\u00c2\u00d7\u00ddyR\n\u0080\u00a3\u00fd\u00c2\u00a6D\u00a8\u00e3\u00ecrk\u00b3O\u0012\u00c5P\u00f1\u000f\u00b6\u001fW9\u00ef\u0085\u001d\u00ca\u00dd\u008b\u001c\u001a\u000b\u0090\u00ab6\u00fa\u00e7P>wa\u009b\u00ddd)\u00ba\u0085W\u00cfH\u00bc\u0086\u0016\u00ac\u00ff3;\u00aa\u00f9@\u0006\u00cd\u00bc\u0097\u00a9\u0019<\u0092\u00e0\u00d5\u009b8\u0095\u00a4\tO|\u00b6\u00a6\u008f\u0005\u00f0t\u0080\u0015\u00ba\u00ef\u0089\u00e25y?;\r}%\u00e3\u00f0\u00b6\u00e3T\u00c3\u00ff\u00d7\u001b\u00c0\u009e1\u0016\u0018m9\u00f1\b\u00d6\u008d\u0006\u00ee\u00c6_6\u00cd\u0006\u00b2\u00a5\u0091\u001b$6\f4\u001e\u00fe\u009e\u0018\u00bb\u00d6GY\u0080b\u001fD\u00bf\u0087X\u00b8AN\u008d\u000b\u008c3\t\u0082\u00b0/s\u0011\u00e7\u00fa\u0082\u00b5\u00be'\u0080=\u00a2\u001a\u0086\u00cf\u00f7>\u00e3?\u00ae\u0084a\u00d7\u00d16\u00cf\u0019\u00d0l\u0014%\u008d\u0086\u00bf\u0013\u0004\u0085\u001bV\u00a7\u00b7\u00e2\t\u00ce\u00d4],\u00b1#\u0094\u00f4B\u00f0\u00afU%\u008aX\u00e5i\u00ab\u0098\u00fc\u0096\u00f1\u00a4\u0016,}\u00a8\u00af\u00a6@\\v\u00c8!\u00e7\u00ae\u00d8\u0087\u00da^*\u001bft\u00f8~\u00cd\u001cy\u00b4\u00ca\u0091G\u00cb\u0016\u0092\u00a0:\u00c0\u0097\u0010?3A\u00bf:\u00fc\u00e26k\u008fV\u00ae\u00d4^:6B\u00e4;\u008d\u00e7\u0005\u001b6v\u00fc(\u00021\u00cb\u0014?\\\u00b4\u008a\u00da\u00a5=d\u0087\u00f5H\u0012\u00e0\u00feH\u00e9nZN\u00ac`\u00ca\u00b8\u00a7<\u00b2\u00fev7\u00beAU\u00f8\u0088\u00c6\u00ef@\u00d8Zp\u00ef2\u00c0\u009f\u00b2\u00b2\u00cf\u0014\u009b>\f\u00ce\u00a1\u00ca\u00c2+\u0088\u00c4~\u00de\u009b\u0014:\u000f\u00f7\t".length();
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
lbl78:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = ",@\u00a8\u00d5\u00b4\u00da\n%\u00e8o93\u0015\\>|";
                    var5_15 = ",@\u00a8\u00d5\u00b4\u00da\n%\u00e8o93\u0015\\>|".length();
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
lbl91:
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
lbl104:
                // 1 sources

                ** continue;
            }
        }
        IlIljC.e = var6_12;
        IlIljC.f = new Integer[68];
        IlIljC.LATEST = new IlIljC((int)IlIljC.b("u", (int)8771, (long)(2041194440811738836L ^ var20)));
        IlIljC.v26_1_2 = new IlIljC((int)IlIljC.b("u", (int)20679, (long)(994553248570049603L ^ var20)));
        IlIljC.v26_1_1 = new IlIljC((int)IlIljC.b("u", (int)24424, (long)(3482276059730480008L ^ var20)));
        IlIljC.v26_1 = new IlIljC((int)IlIljC.b("u", (int)18804, (long)(7164002718487354834L ^ var20)));
        IlIljC.v1_21_11 = new IlIljC((int)IlIljC.b("u", (int)7149, (long)(7661371550618832757L ^ var20)));
        IlIljC.v1_21_10 = new IlIljC((int)IlIljC.b("u", (int)27930, (long)(2197791934784158108L ^ var20)));
        IlIljC.v1_21_9 = new IlIljC((int)IlIljC.b("u", (int)30324, (long)(5716807089578877692L ^ var20)));
        IlIljC.v1_21_8 = new IlIljC((int)IlIljC.b("u", (int)24616, (long)(4942699053564048586L ^ var20)));
        IlIljC.v1_21_7 = new IlIljC((int)IlIljC.b("u", (int)11802, (long)(2740465447829240457L ^ var20)));
        IlIljC.v1_21_6 = new IlIljC((int)IlIljC.b("u", (int)32333, (long)(8721510737320454855L ^ var20)));
        IlIljC.v1_21_5 = new IlIljC((int)IlIljC.b("u", (int)21879, (long)(2181707934206787990L ^ var20)));
        IlIljC.v1_21_4 = new IlIljC((int)IlIljC.b("u", (int)9651, (long)(6271737420034699546L ^ var20)));
        IlIljC.v1_21 = new IlIljC((int)IlIljC.b("u", (int)19198, (long)(3806437400047918661L ^ var20)));
        IlIljC.v1_20_6 = new IlIljC((int)IlIljC.b("u", (int)32058, (long)(6962211053027731872L ^ var20)));
        IlIljC.v1_20_5 = new IlIljC((int)IlIljC.b("u", (int)20558, (long)(8033508700999288002L ^ var20)));
        IlIljC.v1_20_R3 = new IlIljC((int)IlIljC.b("u", (int)20896, (long)(6602694127218459941L ^ var20)));
        IlIljC.v1_20_R2 = new IlIljC((int)IlIljC.b("u", (int)24629, (long)(5659057067229557932L ^ var20)));
        IlIljC.v1_20_R1 = new IlIljC((int)IlIljC.b("u", (int)3334, (long)(479083485177567651L ^ var20)));
        IlIljC.v1_19_R3 = new IlIljC((int)IlIljC.b("u", (int)18350, (long)(5947515942098735909L ^ var20)));
        IlIljC.v1_19_R2 = new IlIljC((int)IlIljC.b("u", (int)13066, (long)(898087217422788488L ^ var20)));
        IlIljC.v1_19_R1 = new IlIljC((int)IlIljC.b("u", (int)23703, (long)(9114832990689921031L ^ var20)));
        IlIljC.v1_18_R2 = new IlIljC((int)IlIljC.b("u", (int)30711, (long)(7317697205847335787L ^ var20)));
        IlIljC.v1_18_R1 = new IlIljC((int)IlIljC.b("u", (int)16313, (long)(2768043363185814293L ^ var20)));
        IlIljC.v1_17_R1 = new IlIljC((int)IlIljC.b("u", (int)4816, (long)(5321381074458789455L ^ var20)));
        IlIljC.v1_16_R3 = new IlIljC((int)IlIljC.b("u", (int)27685, (long)(6565308805092358294L ^ var20)));
        IlIljC.v1_16_R2 = new IlIljC((int)IlIljC.b("u", (int)31735, (long)(555712395116261200L ^ var20)));
        IlIljC.v1_16_R1 = new IlIljC((int)IlIljC.b("u", (int)14642, (long)(773318502119501212L ^ var20)));
        IlIljC.v1_15_R1 = new IlIljC((int)IlIljC.b("u", (int)31637, (long)(2880261210458828545L ^ var20)));
        IlIljC.v1_14_R1 = new IlIljC((int)IlIljC.b("u", (int)7008, (long)(1384045535344709586L ^ var20)));
        IlIljC.v1_13_R2 = new IlIljC((int)IlIljC.b("u", (int)5, (long)(5637574952210945172L ^ var20)));
        IlIljC.v1_13_R1 = new IlIljC((int)IlIljC.b("u", (int)19225, (long)(7702985820051120024L ^ var20)));
        IlIljC.v1_12_R1 = new IlIljC((int)IlIljC.b("u", (int)17761, (long)(5799224920429629951L ^ var20)));
        IlIljC.v1_11_R1 = new IlIljC((int)IlIljC.b("u", (int)25832, (long)(7511709196297777256L ^ var20)));
        IlIljC.v1_10_R1 = new IlIljC((int)IlIljC.b("u", (int)1245, (long)(5579366287390756985L ^ var20)));
        IlIljC.v1_9_R2 = new IlIljC(5);
        IlIljC.v1_9_R1 = new IlIljC(4);
        IlIljC.v1_8_R3 = new IlIljC(3);
        IlIljC.v1_8_R2 = new IlIljC(2);
        IlIljC.v1_8_R1 = new IlIljC(1);
        IlIljC.IlIlb = IlIljC.IlIle();
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1723;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIljC", exception);
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
            IlIljC.c[n2] = IlIljC.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIljC.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIljC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x206A;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIljC", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIljC.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIljC.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, Integer.TYPE, Long.TYPE));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/IlIljC" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIljC.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIljC.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

