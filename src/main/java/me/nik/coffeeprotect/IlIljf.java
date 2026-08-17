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
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlg;
import me.nik.coffeeprotect.IlIlju;
import me.nik.coffeeprotect.IlIlx5;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class IlIljf
extends IlIlju {
    private final CoffeeProtect IlIlN;
    private static boolean IlIlg;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String vZsJiSKJUz = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIljf(CoffeeProtect coffeeProtect) {
        this.IlIlN = coffeeProtect;
    }

    @Override
    protected String IlIlC() {
        long l = a ^ 0x26DFD75011E5L;
        return IlIljf.a("a", (int)9947, (long)(0x20FF15D24C60FA3AL ^ l));
    }

    @Override
    protected String IlIlV() {
        long l = a ^ 0x33DE95BE4B7CL;
        return IlIljf.a("a", (int)15676, (long)(0x12FC8CFEBE773B4FL ^ l));
    }

    @Override
    protected String IlIld() {
        long l = a ^ 0x1989A2BECCACL;
        return IlIljf.a("a", (int)29107, (long)(0x13AE9C47231CF01EL ^ l));
    }

    @Override
    protected String IlIla() {
        return IlIlx5.PROFILER.IlIla();
    }

    @Override
    protected int IlIlX() {
        return 2;
    }

    @Override
    protected boolean IlIlr() {
        return false;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void IlIlM(CommandSender var1_1, String[] var2_2) {
        block22: {
            block21: {
                block20: {
                    var3_3 = IlIljf.a ^ 123620225967899L;
                    var5_4 = IlIljf.IlIlJ();
                    if (var5_4) break block20;
                    if (!this.IlIlN.IlIli()) break block21;
                    var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljf.a("a", (int)25326, (long)(8844855728843016444L ^ var3_3)));
                }
                return;
            }
            var6_5 = ((Player)var1_1).getUniqueId();
            var7_6 = var2_2[1];
            var8_7 = -1;
            v0 = var7_6.hashCode();
            if (var5_4) break block22;
            switch (v0) {
                case 109757538: {
                    v0 = (int)var7_6.equals(IlIljf.a("a", (int)15651, (long)(6943358266142136120L ^ var3_3)));
                    if (var5_4) break;
                    if (v0 == 0) ** GOTO lbl26
                    var8_7 = 0;
                    if (!var5_4) ** GOTO lbl26
                }
                case 3540994: {
                    v0 = (int)var7_6.equals(IlIljf.a("a", (int)18272, (long)(8294298137743846769L ^ var3_3)));
                    if (var5_4) break;
                    if (v0 != 0) {
                        var8_7 = 1;
                    }
                }
lbl26:
                // 6 sources

                default: {
                    v0 = var8_7;
                }
            }
        }
        if (var5_4) ** GOTO lbl33
        switch (v0) {
            case 0: {
                v0 = me.nik.coffeeprotect.IlIlg.IlIlM[this.IlIlN.IlIlJ().IlIlL(var6_5).ordinal()];
lbl33:
                // 2 sources

                switch (v0) {
                    case 1: {
                        var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljf.a("a", (int)29945, (long)(1762697179661917930L ^ var3_3)));
                        if (!var5_4) break;
                    }
                    case 2: {
                        var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljf.a("a", (int)24985, (long)(5726013589481212800L ^ var3_3)));
                    }
                }
                if (!var5_4) break;
            }
            case 1: {
                switch (me.nik.coffeeprotect.IlIlg.IlIlM[this.IlIlN.IlIlJ().IlIlu().ordinal()]) {
                    case 3: {
                        var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljf.a("a", (int)10872, (long)(4858864836613603438L ^ var3_3)));
                        if (!var5_4) break;
                    }
                    case 4: {
                        var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljf.a("a", (int)24213, (long)(1828750238631031941L ^ var3_3)));
                    }
                }
                if (!var5_4) break;
            }
            default: {
                var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljf.a("a", (int)2191, (long)(3540085363490235031L ^ var3_3)));
            }
        }
    }

    @Override
    protected List<String> IlIlb(CommandSender commandSender, String[] stringArray) {
        block3: {
            int n;
            long l;
            block2: {
                l = a ^ 0x16676FDA5CA3L;
                boolean bl = IlIljf.IlIlP();
                n = stringArray.length;
                if (!bl) break block2;
                if (n != 2) break block3;
                n = 2;
            }
            String[] stringArray2 = new String[n];
            stringArray2[0] = IlIljf.a("a", (int)9883, (long)(0x7565E0FFE176B734L ^ l));
            stringArray2[1] = IlIljf.a("a", (int)979, (long)(0x2AD191347CDF927EL ^ l));
            return Arrays.asList(stringArray2);
        }
        return null;
    }

    public static void IlIlp(boolean bl) {
        IlIlg = bl;
    }

    public static boolean IlIlJ() {
        return IlIlg;
    }

    public static boolean IlIlP() {
        boolean bl = IlIljf.IlIlJ();
        return !bl;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIljf.a = IlIls.a((long)-2724497112834061652L, (long)1984890272006026741L, MethodHandles.lookup().lookupClass()).a(196246707190322L);
                IlIljf.d = new HashMap<K, V>(13);
                var0 = IlIljf.a ^ 12253960436017L;
                IlIljf.IlIlp(false);
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
                var9_3 = new String[13];
                var7_4 = 0;
                var6_5 = "\u000f\u00be\u008c\u001a\u00e1\u0083\u0082\u00b4*ff%0\u00e9\u00f0\u0003_\u00b6ve\u0007\u001dnv\u009e]-!\u001e\u00b16S|\u00f2Th\u0096o\u00b8\u0011\u00d3iE\u0098d\u0005\u0098\u00cd@\u00e2\\\u00e1\u00a0S\"\u009a\u00d4\u008c\u0000\u00047\u00f8Z\u0005OE\u0006\u00cdd \u00de&\u007fs\u007f\u00b5=\u0000-D1\u0012\u00bb \u00d2>\u008fX\u00918\u000e\u00de1\u00c9K~Y\u0019\u00ea\u00dd\u00cen\u0003\u00d1\u00f8\u001fa\u0014\u00c4\u00c0\u001b\u0099\u00d5\u0010\u00d3x\u00a1\u00d9_0\u00c8\u00eb\u009bV\u001c)A[\n\u00f60 \u00e1{\u001d\u00e9K\u0012\u00ba\u00ed\u00a8\u0006\u00a0\u00b4\u00cf+\u0011F1!`\u00e9\fi\u00b6&\u00a2\u0099\u001d\u00e32\u001c\u00ef\u007f(1S\u0012]U8\u00f3\u0089\u0080\u0086~\u00e0\u001e0\u0010\u00d7\u00b4o\u00f5\"\u00bbi\u0011\u00eb\u00ec8\u00f1\u0090\u0010\u00c7\u00dc8h\u00fd\u00c4EL\u0017\u0095\u00b06Q\u00bd\u00e4pc\f\u00dd6\u0093xZh\n\u00a4\u00bd\u00f9\u001b1\u00856\u00ae$NUP-\u001b\u00a7o;\u00a8&p\u00f1\u0080\u00f9>$\u00dc\u0087#\u00b8$z\u00e4\u008c\u00fb\u0010dK-\u00fe\u00a4&I\u0017\r<\u008aM\u0091M\u0080\u00de8\";K\u008b\u009e\u00a4Dn\u0085\u00cb\u00eaA\u0017\u00f9\u00a5\u00b0\u00d0\u00b4\u0095\u00c8\u0099b&\u00f1\u00bd\u00de\u008f\u00dc\u0010\u00df\u00ff6\u00ad\u00fa]:_\u00ff\u0018\u00ac\u00b6V\u0097\u00f7\u00156-\u00b4\u0085\u00e6,\u00f8\u00ad\u009d\u0084\u001c\u0010%\u0083\u00c2\u0017\u00bfA\u00ec\u00d0\f\u00f3\u00e2\u00be^C\u00b0\u007f@\r\t%\u0090}vvY\u00b0\u00cct!?\u00f8\u0002}Y\u00c5\u00a8\u009aW\u00d9;\u00107\u00e7\u00f6t\u0082\u0006\u00c3\u00d8g\u0012\u001f\u00d3\u00fb\u00df\u00ce\u00d9?\u00c9oU\u00e9q\u00d6F\u0012\u00b6\u00c0\u001d.\u00a3Ch\u00fay`9\u0006\u0014\u0010\"8\u00a1\u00f0\u0013\u00ecG0\u00b3\u008a\u00c0\u00b2Y\u0010\u0002\u00ab\u00eb\u00fd\u00a8C\u00eb\u00ea\u00e3}\u0089l\u00c6]\u00f6G]u\u0096=[1\u00e9f\u009aVY\u00fb\u00bb7\"l<\u00d9\u001b\u0098\u00c7\u00ca'~\u00baVE\\";
                var8_6 = "\u000f\u00be\u008c\u001a\u00e1\u0083\u0082\u00b4*ff%0\u00e9\u00f0\u0003_\u00b6ve\u0007\u001dnv\u009e]-!\u001e\u00b16S|\u00f2Th\u0096o\u00b8\u0011\u00d3iE\u0098d\u0005\u0098\u00cd@\u00e2\\\u00e1\u00a0S\"\u009a\u00d4\u008c\u0000\u00047\u00f8Z\u0005OE\u0006\u00cdd \u00de&\u007fs\u007f\u00b5=\u0000-D1\u0012\u00bb \u00d2>\u008fX\u00918\u000e\u00de1\u00c9K~Y\u0019\u00ea\u00dd\u00cen\u0003\u00d1\u00f8\u001fa\u0014\u00c4\u00c0\u001b\u0099\u00d5\u0010\u00d3x\u00a1\u00d9_0\u00c8\u00eb\u009bV\u001c)A[\n\u00f60 \u00e1{\u001d\u00e9K\u0012\u00ba\u00ed\u00a8\u0006\u00a0\u00b4\u00cf+\u0011F1!`\u00e9\fi\u00b6&\u00a2\u0099\u001d\u00e32\u001c\u00ef\u007f(1S\u0012]U8\u00f3\u0089\u0080\u0086~\u00e0\u001e0\u0010\u00d7\u00b4o\u00f5\"\u00bbi\u0011\u00eb\u00ec8\u00f1\u0090\u0010\u00c7\u00dc8h\u00fd\u00c4EL\u0017\u0095\u00b06Q\u00bd\u00e4pc\f\u00dd6\u0093xZh\n\u00a4\u00bd\u00f9\u001b1\u00856\u00ae$NUP-\u001b\u00a7o;\u00a8&p\u00f1\u0080\u00f9>$\u00dc\u0087#\u00b8$z\u00e4\u008c\u00fb\u0010dK-\u00fe\u00a4&I\u0017\r<\u008aM\u0091M\u0080\u00de8\";K\u008b\u009e\u00a4Dn\u0085\u00cb\u00eaA\u0017\u00f9\u00a5\u00b0\u00d0\u00b4\u0095\u00c8\u0099b&\u00f1\u00bd\u00de\u008f\u00dc\u0010\u00df\u00ff6\u00ad\u00fa]:_\u00ff\u0018\u00ac\u00b6V\u0097\u00f7\u00156-\u00b4\u0085\u00e6,\u00f8\u00ad\u009d\u0084\u001c\u0010%\u0083\u00c2\u0017\u00bfA\u00ec\u00d0\f\u00f3\u00e2\u00be^C\u00b0\u007f@\r\t%\u0090}vvY\u00b0\u00cct!?\u00f8\u0002}Y\u00c5\u00a8\u009aW\u00d9;\u00107\u00e7\u00f6t\u0082\u0006\u00c3\u00d8g\u0012\u001f\u00d3\u00fb\u00df\u00ce\u00d9?\u00c9oU\u00e9q\u00d6F\u0012\u00b6\u00c0\u001d.\u00a3Ch\u00fay`9\u0006\u0014\u0010\"8\u00a1\u00f0\u0013\u00ecG0\u00b3\u008a\u00c0\u00b2Y\u0010\u0002\u00ab\u00eb\u00fd\u00a8C\u00eb\u00ea\u00e3}\u0089l\u00c6]\u00f6G]u\u0096=[1\u00e9f\u009aVY\u00fb\u00bb7\"l<\u00d9\u001b\u0098\u00c7\u00ca'~\u00baVE\\".length();
                var5_7 = 48;
                var4_8 = -1;
lbl21:
                // 2 sources

                while (true) {
                    v3 = ++var4_8;
                    v4 = var6_5.substring(v3, v3 + var5_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl26:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIljf.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00fa\u00ff\u0011q\u008f\u00f3\u00d5\u00fc\u0019\u0087F\u00f2-\u009c\u00a50\u009c\u00a7n1\u009do\u00ac\u0007\u00c1\u00e4m2\u0002\u00c8\u00c2\u00e2\u00e2\u008fkB\u00fe\u00cco\"\u00c5\u00fa\u0013q\u0007\u00d1\u00faL \u00f6)\u00a9U8\u00e5\u00b0\u00b7b-q]\u0005J\u009e\u009a\u00c3\u00db\u00f6\u00b1\u00d3\u000e\u00f3.\u0087\u00c5\u0001\u00ff\u009c\u0088s\u00d2";
                    var8_6 = "\u00fa\u00ff\u0011q\u008f\u00f3\u00d5\u00fc\u0019\u0087F\u00f2-\u009c\u00a50\u009c\u00a7n1\u009do\u00ac\u0007\u00c1\u00e4m2\u0002\u00c8\u00c2\u00e2\u00e2\u008fkB\u00fe\u00cco\"\u00c5\u00fa\u0013q\u0007\u00d1\u00faL \u00f6)\u00a9U8\u00e5\u00b0\u00b7b-q]\u0005J\u009e\u009a\u00c3\u00db\u00f6\u00b1\u00d3\u000e\u00f3.\u0087\u00c5\u0001\u00ff\u009c\u0088s\u00d2".length();
                    var5_7 = 48;
                    var4_8 = -1;
lbl35:
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
lbl40:
                // 1 sources

                while (true) {
                    var9_3[var7_4++] = IlIljf.a(var10_9).intern();
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
lbl52:
                // 1 sources

                ** continue;
            }
        }
        IlIljf.b = var9_3;
        IlIljf.c = new String[13];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x419B;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIljf", exception);
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
            IlIljf.c[n2] = IlIljf.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIljf.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIljf" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIljf.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

