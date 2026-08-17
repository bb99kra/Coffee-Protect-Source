/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;

public final class IlIlxi
extends Enum<IlIlxi> {
    public static final /* enum */ IlIlxi PREFIX;
    public static final /* enum */ IlIlxi UPDATE_FOUND;
    public static final /* enum */ IlIlxi UPDATE_NOT_FOUND;
    public static final /* enum */ IlIlxi NO_PERMISSION;
    public static final /* enum */ IlIlxi RELOADED;
    public static final /* enum */ IlIlxi CONSOLE_COMMANDS;
    public static final /* enum */ IlIlxi CLIENT_ALERT;
    public static final /* enum */ IlIlxi CLIENT_KICK;
    public static final /* enum */ IlIlxi TROLL;
    public static final /* enum */ IlIlxi ALERTS_ENABLED;
    public static final /* enum */ IlIlxi ALERTS_DISABLED;
    public static final /* enum */ IlIlxi ALERT_MESSAGE;
    public static final /* enum */ IlIlxi ALERT_HOVER;
    public static final /* enum */ IlIlxi INFO_COMMAND;
    private final String IlIld;
    private static final /* synthetic */ IlIlxi[] IlIlk;
    private static int IlIlL;
    private static final long a;
    private static final long[] b;
    private static final Integer[] c;
    private static final Map d;

    public static IlIlxi[] values() {
        return (IlIlxi[])IlIlk.clone();
    }

    public static IlIlxi valueOf(String string) {
        return Enum.valueOf(IlIlxi.class, string);
    }

    private IlIlxi(String string2) {
        this.IlIld = string2;
    }

    public String IlIlF() {
        return this.IlIld;
    }

    private static String IlIla(List<String> list) {
        long l = a ^ 0x64D0F22B77DFL;
        StringBuilder stringBuilder = new StringBuilder();
        int n = list.size();
        for (int i = 0; i < n; ++i) {
            String string = list.get(i);
            stringBuilder.append(string.isEmpty() ? " " : string);
            if (n - 1 == i) continue;
            stringBuilder.append("\n");
        }
        return IlIlrW.IlIlW(stringBuilder.toString());
    }

    private static /* synthetic */ IlIlxi[] IlIlg() {
        long l = a ^ 0x7AA79AEBD2FDL;
        IlIlxi[] ilIlxiArray = new IlIlxi[IlIlxi.a("k", (int)10175, (long)(0x3751BDC0E476CEB5L ^ l))];
        ilIlxiArray[0] = PREFIX;
        ilIlxiArray[1] = UPDATE_FOUND;
        ilIlxiArray[2] = UPDATE_NOT_FOUND;
        ilIlxiArray[3] = NO_PERMISSION;
        ilIlxiArray[4] = RELOADED;
        ilIlxiArray[5] = CONSOLE_COMMANDS;
        ilIlxiArray[IlIlxi.a("k", (int)15478, (long)(0x29434F4911C5D579L ^ l))] = CLIENT_ALERT;
        ilIlxiArray[IlIlxi.a("k", (int)21485, (long)(0x6341E60F50193AEAL ^ l))] = CLIENT_KICK;
        ilIlxiArray[IlIlxi.a("k", (int)6076, (long)(0x1BE7EBC940877EBCL ^ l))] = TROLL;
        ilIlxiArray[IlIlxi.a("k", (int)15321, (long)(0x28BD020BF7C552D7L ^ l))] = ALERTS_ENABLED;
        ilIlxiArray[IlIlxi.a("k", (int)27341, (long)(0x554376614F0583CCL ^ l))] = ALERTS_DISABLED;
        ilIlxiArray[IlIlxi.a("k", (int)12677, (long)(0x22A7CF8B55D65886L ^ l))] = ALERT_MESSAGE;
        ilIlxiArray[IlIlxi.a("k", (int)14016, (long)(0x1C7704A806AE5FC4L ^ l))] = ALERT_HOVER;
        ilIlxiArray[IlIlxi.a("k", (int)20533, (long)(0x6B8FA6D29423393EL ^ l))] = INFO_COMMAND;
        return ilIlxiArray;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block22: {
            block21: {
                block20: {
                    block19: {
                        IlIlxi.a = IlIls.a((long)-4507855413200946127L, (long)-4639216609797802423L, MethodHandles.lookup().lookupClass()).a(97074754621847L);
                        var20 = IlIlxi.a ^ 41996464404134L;
                        if (IlIlxi.IlIlt() == 0) {
                            IlIlxi.IlIlO(102);
                        }
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var20 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var20 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var11_3 = new String[28];
                        var17_4 = 0;
                        var16_5 = "\u00bc\u00bb\u00b8\u0087\u00b1\u0091~ZEY\u00a3\u00f0pV\u00a0j\u0010\u00b9\u00a1\u00c1bB\u0004\u00a3m\u00d8\u0005\u00faY\u00b4{Z\\\u0010\u00b4\u00ba\u0013\u00e7\u009a\u009d\u00c8Yt\u00e6\u00f1V\u00f7\u0003\u00ffz\u0010C\u00f6\u00f72\u00ad\u00c0\u0094\u0013\u00d9\u0004Z \\\u0090\u00c0\u00d4\u0010\u0003g\u0016f\u00a8\u00bf`\u0019\u00fc\u001a\u00a3#_\u00f1\u00d9\"\b\u00e9\u00ddT0a\u00e4\u00b0U\u0010\u00a0\u00d4\u000fn\u00a4\u0088\u0005\u0006rO^du:\u0082\u00a6\u0010\u00c2:\u00fc\u00da\u00c1\u00993\u008b\u00aa\u00c6\u00cc\u00de\u00fb\u00a7\u00d4\u00e2\u0018\u00e0u;\u0081\u008d\u001b\u00e8rl\u00ad\u008e\u00c5^\u0010\u007f\u00cd\u00e8\u00f9\u00aa\u00fd\u008e\u00fe\u00b6\u00d3\b%\u00f6\u00a5\u0098\u00a1y\u001a4\u0010\u0082I\u00dc\u0001e\u0098\u008e\u00e2\u00b4\u0007g\u008f\u00b0\u00cc\u0080S\b\u00e6A\u00c0\u00efV\u00c3P\u00f9\u0010\u008bGX\u00b3\u00ed\u001bJ\u00ed\u0004\u001b_\u0096]\u0005h\u0003\bu\u00b9\u008b\u0002\u001e\u00f1\u0018\u00ce\u0010X\u0098\u00f6\u0010\u00da&\u00063\u00b6ET\t\u00c4\u00c7\u00a87\b\t)B\"R\u0005x\u00d3\u0018\u00b3\u008dS?\u008bz>\u00b7Ov\u00bd\u00d3\u00f5\u00ec_\u0094\u00fcN\u0018\u00f2\u00c3w\u0082j\u0010[\u00882\u00d0\u00f6\bcS\u00d6\u00eb\u0016\u00c7\u0011\u008d\u00e4\u00a4\u0010\u00af\u0096T\u00c1\u0012;T\u00ae\u00d8\u00a4+|\u00d4_\u00e7\u0015\u0010{\u00e6\u00b2\u00a4\u00a3L@\u00d3\u0005\u0091pOX\u00cd\u00dcz\u0010\u00fd1c\u00a9\u00d3R\n`\u00d4\u001f\u00b6!mPG\u00c7\u0010\u0088Q\u0089?g\u000f\u0000\u00ba/\u00b3Q\u009c\u00fb`JI\u0010\u008f?Q0:\u00fd\u00b9+\u00de\u0018u1\u001e>\u001a\u0085\u0010\u007f\u00ae\u00a47\u00e6\u00d6@\u0005\u0006x\u00a2\u00ff!lA%\u0018\u0007)\u0080\u008efm\u009fu;\u00f9M\t(\u00d38]a\u008cU\u00df\u0011l\u0014\u0091\u0010\u00ede\u00ac\u00ad\u0013bkS>3\u009c\u00c4\u00a3w\u00f7\u00d9";
                        var18_6 = "\u00bc\u00bb\u00b8\u0087\u00b1\u0091~ZEY\u00a3\u00f0pV\u00a0j\u0010\u00b9\u00a1\u00c1bB\u0004\u00a3m\u00d8\u0005\u00faY\u00b4{Z\\\u0010\u00b4\u00ba\u0013\u00e7\u009a\u009d\u00c8Yt\u00e6\u00f1V\u00f7\u0003\u00ffz\u0010C\u00f6\u00f72\u00ad\u00c0\u0094\u0013\u00d9\u0004Z \\\u0090\u00c0\u00d4\u0010\u0003g\u0016f\u00a8\u00bf`\u0019\u00fc\u001a\u00a3#_\u00f1\u00d9\"\b\u00e9\u00ddT0a\u00e4\u00b0U\u0010\u00a0\u00d4\u000fn\u00a4\u0088\u0005\u0006rO^du:\u0082\u00a6\u0010\u00c2:\u00fc\u00da\u00c1\u00993\u008b\u00aa\u00c6\u00cc\u00de\u00fb\u00a7\u00d4\u00e2\u0018\u00e0u;\u0081\u008d\u001b\u00e8rl\u00ad\u008e\u00c5^\u0010\u007f\u00cd\u00e8\u00f9\u00aa\u00fd\u008e\u00fe\u00b6\u00d3\b%\u00f6\u00a5\u0098\u00a1y\u001a4\u0010\u0082I\u00dc\u0001e\u0098\u008e\u00e2\u00b4\u0007g\u008f\u00b0\u00cc\u0080S\b\u00e6A\u00c0\u00efV\u00c3P\u00f9\u0010\u008bGX\u00b3\u00ed\u001bJ\u00ed\u0004\u001b_\u0096]\u0005h\u0003\bu\u00b9\u008b\u0002\u001e\u00f1\u0018\u00ce\u0010X\u0098\u00f6\u0010\u00da&\u00063\u00b6ET\t\u00c4\u00c7\u00a87\b\t)B\"R\u0005x\u00d3\u0018\u00b3\u008dS?\u008bz>\u00b7Ov\u00bd\u00d3\u00f5\u00ec_\u0094\u00fcN\u0018\u00f2\u00c3w\u0082j\u0010[\u00882\u00d0\u00f6\bcS\u00d6\u00eb\u0016\u00c7\u0011\u008d\u00e4\u00a4\u0010\u00af\u0096T\u00c1\u0012;T\u00ae\u00d8\u00a4+|\u00d4_\u00e7\u0015\u0010{\u00e6\u00b2\u00a4\u00a3L@\u00d3\u0005\u0091pOX\u00cd\u00dcz\u0010\u00fd1c\u00a9\u00d3R\n`\u00d4\u001f\u00b6!mPG\u00c7\u0010\u0088Q\u0089?g\u000f\u0000\u00ba/\u00b3Q\u009c\u00fb`JI\u0010\u008f?Q0:\u00fd\u00b9+\u00de\u0018u1\u001e>\u001a\u0085\u0010\u007f\u00ae\u00a47\u00e6\u00d6@\u0005\u0006x\u00a2\u00ff!lA%\u0018\u0007)\u0080\u008efm\u009fu;\u00f9M\t(\u00d38]a\u008cU\u00df\u0011l\u0014\u0091\u0010\u00ede\u00ac\u00ad\u0013bkS>3\u009c\u00c4\u00a3w\u00f7\u00d9".length();
                        var15_7 = 16;
                        var14_8 = -1;
lbl21:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block19;
                            break;
                        }
lbl26:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = IlIlxi.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = ";\u00f8\u009b\u00058%}\u00ae\u008f\u00c0\u00f6\u00a5c\u00c4\u0015\u00b4\u0018Rh\u0003\u0012\u00ca\u008c\u000f\u00a6\u0091+\u0091\u00d6e\u00a8\u00e9\u00db#T\u009bq\u00aaJ\u00bdj";
                            var18_6 = ";\u00f8\u009b\u00058%}\u00ae\u008f\u00c0\u00f6\u00a5c\u00c4\u0015\u00b4\u0018Rh\u0003\u0012\u00ca\u008c\u000f\u00a6\u0091+\u0091\u00d6e\u00a8\u00e9\u00db#T\u009bq\u00aaJ\u00bdj".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl35:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block19;
                                break;
                            }
                            break;
                        }
lbl40:
                        // 1 sources

                        while (true) {
                            var11_3[var17_4++] = IlIlxi.a(var19_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block20;
                            break;
                        }
                    }
                    var19_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                IlIlxi.d = new HashMap<K, V>(13);
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
                var6_12 = new long[17];
                var3_13 = 0;
                var4_14 = ",\u001a\u00ec8>U\u0092&\u00cbc]\u00eb\u00f3\u00b9~\u00e7K\u0099F\u00cei8@\u00e4#\u00c9*n]/U!\u0085\u0016\u0085\u00a3\u00fb|\u00cbA\u0083\u0098\\\u00cdx\u0091\u0098V\u008a\u00b39\u00c4a\u0084\u0096\u008b.\u00ca\u0004\u00ba\u00e7n\u00b0c\u00c3k\u001d\u008f\u00868F\u00b0\u00ddS9\u00f7$\u00fe^\u0092\u009b\u00cbE\u0013\u00e5\u00acF\f\th\u0005\u00c0\u00ad\u00a0\u0087\u0012\u00cb\u001a0dZ\u00ad\u00e0=\u00e5\b\u008e\u00c7\u00b8\u00dc\u00fbm\u00bf\u00c7\u00c2,\u009cW\u00a7U";
                var5_15 = ",\u001a\u00ec8>U\u0092&\u00cbc]\u00eb\u00f3\u00b9~\u00e7K\u0099F\u00cei8@\u00e4#\u00c9*n]/U!\u0085\u0016\u0085\u00a3\u00fb|\u00cbA\u0083\u0098\\\u00cdx\u0091\u0098V\u008a\u00b39\u00c4a\u0084\u0096\u008b.\u00ca\u0004\u00ba\u00e7n\u00b0c\u00c3k\u001d\u008f\u00868F\u00b0\u00ddS9\u00f7$\u00fe^\u0092\u009b\u00cbE\u0013\u00e5\u00acF\f\th\u0005\u00c0\u00ad\u00a0\u0087\u0012\u00cb\u001a0dZ\u00ad\u00e0=\u00e5\b\u008e\u00c7\u00b8\u00dc\u00fbm\u00bf\u00c7\u00c2,\u009cW\u00a7U".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v10 = var6_12;
                    v11 = var3_13++;
                    v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v13 = -1;
                    break block21;
                    break;
                }
lbl77:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00f5_\u008e\u00d7\u00d0\b|\"\u0080V\u009f\u00fb/\u00d1t&";
                    var5_15 = "\u00f5_\u008e\u00d7\u00d0\b|\"\u0080V\u009f\u00fb/\u00d1t&".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v10 = var6_12;
                        v11 = var3_13++;
                        v12 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v13 = 0;
                        break block21;
                        break;
                    }
                    break;
                }
lbl90:
                // 1 sources

                while (true) {
                    v10[v11] = v14;
                    if (var2_16 < var5_15) ** continue;
                    break block22;
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
lbl103:
                // 1 sources

                ** continue;
            }
        }
        IlIlxi.b = var6_12;
        IlIlxi.c = new Integer[17];
        IlIlxi.PREFIX = new IlIlxi(IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[5])));
        IlIlxi.UPDATE_FOUND = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[17])));
        IlIlxi.UPDATE_NOT_FOUND = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[24])));
        IlIlxi.NO_PERMISSION = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[11])));
        IlIlxi.RELOADED = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[2])));
        IlIlxi.CONSOLE_COMMANDS = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[27])));
        IlIlxi.CLIENT_ALERT = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[18])));
        IlIlxi.CLIENT_KICK = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[10])));
        IlIlxi.TROLL = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[15])));
        IlIlxi.ALERTS_ENABLED = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[12])));
        IlIlxi.ALERTS_DISABLED = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[22])));
        IlIlxi.ALERT_MESSAGE = new IlIlxi(IlIlxi.PREFIX.IlIlF() + IlIlrW.IlIlW(CoffeeProtect.IlIlJ().IlIlv().IlIln().getString(var11_3[1])));
        IlIlxi.ALERT_HOVER = new IlIlxi(IlIlxi.IlIla(CoffeeProtect.IlIlJ().IlIlv().IlIln().getStringList(var11_3[4])));
        IlIlxi.INFO_COMMAND = new IlIlxi(IlIlxi.IlIla(CoffeeProtect.IlIlJ().IlIlv().IlIln().getStringList(var11_3[19])));
        IlIlxi.IlIlk = IlIlxi.IlIlg();
    }

    public static void IlIlO(int n) {
        IlIlL = n;
    }

    public static int IlIlt() {
        return IlIlL;
    }

    public static int IlIlA() {
        int n = IlIlxi.IlIlt();
        if (n == 0) {
            return 45;
        }
        return 0;
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

    private static int a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6A9;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlxi", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIlxi.c[n2] = n3;
        }
        return c[n2];
    }

    private static int a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIlxi.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlxi" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlxi.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

