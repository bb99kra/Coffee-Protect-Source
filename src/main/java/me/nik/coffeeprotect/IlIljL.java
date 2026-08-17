/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.command.CommandSender
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
import me.nik.coffeeprotect.IlIlde;
import me.nik.coffeeprotect.IlIljf;
import me.nik.coffeeprotect.IlIlju;
import me.nik.coffeeprotect.IlIlx5;
import me.nik.coffeeprotect.IlIlxi;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.command.CommandSender;

public class IlIljL
extends IlIlju {
    private final CoffeeProtect IlIlh;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String fYwwtwsysd = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIljL(CoffeeProtect coffeeProtect) {
        this.IlIlh = coffeeProtect;
    }

    @Override
    protected String IlIlC() {
        long l = a ^ 0x16024C925AE9L;
        return IlIljL.a("y", (int)307, (long)(0x1068932267618F98L ^ l));
    }

    @Override
    protected String IlIlV() {
        long l = a ^ 0x3030E7C0070L;
        return IlIljL.a("y", (int)27104, (long)(0x1E1B8CD290C13DD3L ^ l));
    }

    @Override
    protected String IlIld() {
        long l = a ^ 0x2954397C87A0L;
        return IlIljL.a("y", (int)30167, (long)(0x318FE83A24EA2630L ^ l));
    }

    @Override
    protected String IlIla() {
        return IlIlx5.PACKETLOGGER.IlIla();
    }

    @Override
    protected int IlIlX() {
        return 2;
    }

    @Override
    protected boolean IlIlr() {
        return true;
    }

    /*
     * Unable to fully structure code
     */
    @Override
    protected void IlIlM(CommandSender var1_1, String[] var2_2) {
        block17: {
            var3_3 = IlIljL.a ^ 71137684204567L;
            var6_4 = var2_2[1];
            var5_5 = IlIljf.IlIlJ();
            var7_6 = -1;
            v0 = var6_4.hashCode();
            if (var5_5) break block17;
            switch (v0) {
                case 109757538: {
                    v0 = (int)var6_4.equals(IlIljL.a("y", (int)6289, (long)(5899792797506658503L ^ var3_3)));
                    if (var5_5) break;
                    if (v0 == 0) ** GOTO lbl20
                    var7_6 = 0;
                    if (!var5_5) ** GOTO lbl20
                    PacketWrapper.IlIle((int[])new int[4]);
                }
                case 3540994: {
                    v0 = (int)var6_4.equals(IlIljL.a("y", (int)7919, (long)(2884035308339521207L ^ var3_3)));
                    if (var5_5) break;
                    if (v0 != 0) {
                        var7_6 = 1;
                    }
                }
lbl20:
                // 6 sources

                default: {
                    v0 = var7_6;
                }
            }
        }
        if (var5_5) ** GOTO lbl27
        switch (v0) {
            case 0: {
                v0 = IlIlde.IlIlN[this.IlIlh.IlIlz().IlIlS().ordinal()];
lbl27:
                // 2 sources

                switch (v0) {
                    case 1: {
                        var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljL.a("y", (int)1159, (long)(5118383674300103888L ^ var3_3)));
                        if (!var5_5) break;
                    }
                    case 2: {
                        var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljL.a("y", (int)24834, (long)(2714432161529370968L ^ var3_3)));
                    }
                }
                if (!var5_5) break;
            }
            case 1: {
                switch (IlIlde.IlIlN[this.IlIlh.IlIlz().IlIlq().ordinal()]) {
                    case 3: {
                        var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljL.a("y", (int)24401, (long)(4231006823427876610L ^ var3_3)));
                        if (!var5_5) break;
                    }
                    case 4: {
                        var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljL.a("y", (int)17386, (long)(6734719999172656051L ^ var3_3)));
                    }
                }
                if (!var5_5) break;
            }
            default: {
                var1_1.sendMessage(IlIlxi.PREFIX.IlIlF() + (String)IlIljL.a("y", (int)31662, (long)(8929227711083447292L ^ var3_3)));
            }
        }
    }

    @Override
    protected List<String> IlIlb(CommandSender commandSender, String[] stringArray) {
        block3: {
            int n;
            long l;
            block2: {
                l = a ^ 0x26BAF41817AFL;
                boolean bl = IlIljf.IlIlJ();
                n = stringArray.length;
                if (bl) break block2;
                if (n != 2) break block3;
                n = 2;
            }
            String[] stringArray2 = new String[n];
            stringArray2[0] = IlIljL.a("y", (int)12208, (long)(0x67589AB05B536C59L ^ l));
            stringArray2[1] = IlIljL.a("y", (int)19316, (long)(0x213FE108D9DD0897L ^ l));
            return Arrays.asList(stringArray2);
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                IlIljL.a = IlIls.a((long)-8779526847524509543L, (long)-931206451748357683L, MethodHandles.lookup().lookupClass()).a(200479068780547L);
                IlIljL.d = new HashMap<K, V>(13);
                var0 = IlIljL.a ^ 23234553172286L;
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
                var9_3 = new String[12];
                var7_4 = 0;
                var6_5 = "]\u0010\u00f4\u0087J\u009f\u00be\u007f \u00c9PF\u0098\u00f4l\u0098K\u008c\u00f1\u00f3\u001a\u00bb\u00e5\rL\u00c0\u001f\u00ce\u0095\u0096^Q\u0090\u00e5\u001a\u00c2\u0098#K\u00ad7\u00d0\u00e8c0l\u008d\u008d\u00f0\u008fd> F\u001f\u00f6\u000b\u00c9Biv\u00de\b\u00e58S\u0001\u00ab\u00d4>\u00a5:\u00ca_\u00e7\u0097\u00ff\u0093\u00b3|38|p\u0005\u00b6\u009c@j<\u0012f\u00a5#\u00da\u00afp\u0087\u000b\u0012W\u00e9\u00aep\u00b4\u00ca7\u00c6K\u00b1Ce\u00a4\u00e3c\u00ea^Q\f\u0002\u00f1\u0010P\u00fdz\u0099\u0005[\u009b'\u00da=\u001eA?\u00fa\u009b\u0013H-%\u0002\u00dfqZ\u00c9\u00f9\u0090\u00da1!\u00f19\u00dd~j&3\u00af6\u00d2\u00b3b\u00af\u00b1aA\u00b3| \u00a8\u00b5\u00ees\u0083cm\u00d3\u0018\u00ea\u0082\u00b8\u0083\u00a8\u00c0D\u00edC\u00d5d\u00bd\u00b9`;\u0085\u008eE\u00e6e-7\u00f7;\u00a8q\u00c2\u00eb(\u00e2\u000f\u00c9@\u00c1\u00a3=5\fD\u00c2\u00ee\u009fk\u00b4+\u001d\u00db6\u0099\u00eb#\u009aofE\n\u00a1>\u00fb\u0003\u0096\u000bk\u0090\u00f1\u00edD\u0085J@o{\u00a8\u00f6\u00c7\u008fp:\u00a4z\u00a2PoYc\u0083\u0017\u00e8#\u00d2\u00c0Qn\u00c9\u0012e{\u0010\u00f3,\u000b>\u00f9\u0002\u00af!-<3\u00f2\u0098\u00acv$\u0018\u00eb\r'[~\u0015\u00a5\u0088y\u00afl\u00ecq*\u00e9\u00ff\u00a6\u00fd\u00a1Yi-\u001b\u00a78\u00c9\u0089\u00dd\u00d4\u00cc\u008f\u009d\u00ba$\u00f2\u00ea\nE< 7E\u008e\u0006Z5\u00d1]\u00a0\u00e6[*\u00c5\u00a2\u00fe\u0083\u0017TLQ@\u00a4\u00a5\u00ef\u001e\u0085[\u00a1\u001a\u00c6\u00da[vTsM,\u0088\u00cd>R\u0010n\u0093\u00df$\u0012\u00a2\u00eeI\u0003\u00f2\u001eC\u00f7\u00e3\u009608\u0014\u00eb\u00f6\u00b1\u0081\u00e7\u0015\u00d8B\u009e\u0089\u00d7;\u001d\u00d8v$\u0001t\u00cb\u00c6l\u00c7\u00f6\u0090\u001f\u009f\u00c5k\u009e\u0099>=\u00e2\u00a7>q\u0014@\u0001q\n\u00f1\u00bc\u00f4\u00d1\u00f7y\u00f6u&\u000b\r{\u00da\u00b8";
                var8_6 = "]\u0010\u00f4\u0087J\u009f\u00be\u007f \u00c9PF\u0098\u00f4l\u0098K\u008c\u00f1\u00f3\u001a\u00bb\u00e5\rL\u00c0\u001f\u00ce\u0095\u0096^Q\u0090\u00e5\u001a\u00c2\u0098#K\u00ad7\u00d0\u00e8c0l\u008d\u008d\u00f0\u008fd> F\u001f\u00f6\u000b\u00c9Biv\u00de\b\u00e58S\u0001\u00ab\u00d4>\u00a5:\u00ca_\u00e7\u0097\u00ff\u0093\u00b3|38|p\u0005\u00b6\u009c@j<\u0012f\u00a5#\u00da\u00afp\u0087\u000b\u0012W\u00e9\u00aep\u00b4\u00ca7\u00c6K\u00b1Ce\u00a4\u00e3c\u00ea^Q\f\u0002\u00f1\u0010P\u00fdz\u0099\u0005[\u009b'\u00da=\u001eA?\u00fa\u009b\u0013H-%\u0002\u00dfqZ\u00c9\u00f9\u0090\u00da1!\u00f19\u00dd~j&3\u00af6\u00d2\u00b3b\u00af\u00b1aA\u00b3| \u00a8\u00b5\u00ees\u0083cm\u00d3\u0018\u00ea\u0082\u00b8\u0083\u00a8\u00c0D\u00edC\u00d5d\u00bd\u00b9`;\u0085\u008eE\u00e6e-7\u00f7;\u00a8q\u00c2\u00eb(\u00e2\u000f\u00c9@\u00c1\u00a3=5\fD\u00c2\u00ee\u009fk\u00b4+\u001d\u00db6\u0099\u00eb#\u009aofE\n\u00a1>\u00fb\u0003\u0096\u000bk\u0090\u00f1\u00edD\u0085J@o{\u00a8\u00f6\u00c7\u008fp:\u00a4z\u00a2PoYc\u0083\u0017\u00e8#\u00d2\u00c0Qn\u00c9\u0012e{\u0010\u00f3,\u000b>\u00f9\u0002\u00af!-<3\u00f2\u0098\u00acv$\u0018\u00eb\r'[~\u0015\u00a5\u0088y\u00afl\u00ecq*\u00e9\u00ff\u00a6\u00fd\u00a1Yi-\u001b\u00a78\u00c9\u0089\u00dd\u00d4\u00cc\u008f\u009d\u00ba$\u00f2\u00ea\nE< 7E\u008e\u0006Z5\u00d1]\u00a0\u00e6[*\u00c5\u00a2\u00fe\u0083\u0017TLQ@\u00a4\u00a5\u00ef\u001e\u0085[\u00a1\u001a\u00c6\u00da[vTsM,\u0088\u00cd>R\u0010n\u0093\u00df$\u0012\u00a2\u00eeI\u0003\u00f2\u001eC\u00f7\u00e3\u009608\u0014\u00eb\u00f6\u00b1\u0081\u00e7\u0015\u00d8B\u009e\u0089\u00d7;\u001d\u00d8v$\u0001t\u00cb\u00c6l\u00c7\u00f6\u0090\u001f\u009f\u00c5k\u009e\u0099>=\u00e2\u00a7>q\u0014@\u0001q\n\u00f1\u00bc\u00f4\u00d1\u00f7y\u00f6u&\u000b\r{\u00da\u00b8".length();
                var5_7 = 64;
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
                    var9_3[var7_4++] = IlIljL.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00cai.\u00c1\u00f8r3aD\u00aek\f\u00da\"\u0015X\u00a5\u0001\u0097\u0002\u00f6M5\tA\"\u00ad\u00cayBa\u0002xE\u0097!o\u00fc\u00c4\u00a0\u009c\u00c4J\\\u00c9\u000f\u00d2]\u00f7T\u00a4\u00e3\u0010\u00f7\u00c1\u008a.\u0093\u00ab\u00dc\u00cf\u0080\u000f6^\u00b7}N\u008b]ou\u0010\u001fk\u00be\u00f2`z\u001a\u00e8c? \u00a9\u00e9\u00c1\u00bd/";
                    var8_6 = "\u00cai.\u00c1\u00f8r3aD\u00aek\f\u00da\"\u0015X\u00a5\u0001\u0097\u0002\u00f6M5\tA\"\u00ad\u00cayBa\u0002xE\u0097!o\u00fc\u00c4\u00a0\u009c\u00c4J\\\u00c9\u000f\u00d2]\u00f7T\u00a4\u00e3\u0010\u00f7\u00c1\u008a.\u0093\u00ab\u00dc\u00cf\u0080\u000f6^\u00b7}N\u008b]ou\u0010\u001fk\u00be\u00f2`z\u001a\u00e8c? \u00a9\u00e9\u00c1\u00bd/".length();
                    var5_7 = 72;
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
                    var9_3[var7_4++] = IlIljL.a(var10_9).intern();
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
        IlIljL.b = var9_3;
        IlIljL.c = new String[12];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x13DB;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIljL", exception);
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
            IlIljL.c[n2] = IlIljL.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIljL.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIljL" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIljL.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

