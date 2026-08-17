/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper
 *  org.bukkit.Location
 */
package me.nik.coffeeprotect;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.IlIlqb;
import me.nik.coffeeprotect.IlIlqi;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import org.bukkit.Location;

class IlIluh {
    private static final int IlIlF;
    private final int IlIlk;
    private final int IlIlP;
    private final int IlIlc;
    private final Object IlIlW;
    private int IlIlf;
    private float IlIlr;
    private String IlIly;
    private Object IlIlA;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long[] e;
    private static final Integer[] f;
    private static final Map g;
    private static transient /* synthetic */ String ngLiSdvwEU = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIluh(String string, Location location, float f) {
        this.IlIly = string;
        this.IlIlk = location.getBlockX();
        this.IlIlP = location.getBlockY();
        this.IlIlc = location.getBlockZ();
        this.IlIlr = f / 100.0f * 200.0f;
        this.IlIlW = IlIlqi.IlIlN(location.getWorld());
    }

    public void IlIlU(float f) {
        this.IlIlr = f / 100.0f * 200.0f;
    }

    public void IlIld(String string) {
        this.IlIly = string;
    }

    public Object IlIlw() throws SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Object obj;
        long l = a ^ 0x477B84CF3A3L;
        Class<?> clazz = IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)14681, (long)(0x1FEB2DF1BB353E97L ^ l))));
        this.IlIlA = IlIlqb.IlIlN(clazz, IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)19819, (long)(0x502CE3527D20CAAAL ^ l))))).newInstance(this.IlIlW);
        IlIlqb.IlIlr(clazz, (String)((Object)IlIluh.a("k", (int)5008, (long)(0x62A55EA67AAE9449L ^ l))), Double.TYPE, Double.TYPE, Double.TYPE).invoke(this.IlIlA, this.IlIlk, this.IlIlP, this.IlIlc);
        int[] nArray = IlIlqi.IlIlW();
        IlIlqb.IlIlr(clazz, (String)((Object)IlIluh.a("k", (int)26402, (long)(0x3824096AF425E0EAL ^ l))), Boolean.TYPE).invoke(this.IlIlA, false);
        IlIlqb.IlIlr(clazz, (String)((Object)IlIluh.a("k", (int)17052, (long)(0x7E130D9531664556L ^ l))), String.class).invoke(this.IlIlA, this.IlIly);
        IlIlqb.IlIlr(clazz, (String)((Object)IlIluh.a("k", (int)10621, (long)(0x1CC6DF100F47AEA6L ^ l))), Float.TYPE).invoke(this.IlIlA, Float.valueOf(this.IlIlr));
        int[] nArray2 = nArray;
        Class<?> clazz2 = IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)23732, (long)(0x577CC62090BADB77L ^ l))));
        try {
            IlIlqb.IlIlk(clazz2, (String)((Object)IlIluh.a("k", (int)17392, (long)(0x24FA1071B5044437L ^ l)))).set(this.IlIlA, 0);
            IlIlqb.IlIlk(clazz2, (String)((Object)IlIluh.a("k", (int)14495, (long)(0x169737E3B213F5FL ^ l)))).set(this.IlIlA, 0);
            IlIlqb.IlIlk(clazz2, (String)((Object)IlIluh.a("k", (int)9135, (long)(0x732B22659FF5A475L ^ l)))).set(this.IlIlA, 0);
            this.IlIlf = (Integer)IlIlqb.IlIlr(clazz, (String)((Object)IlIluh.a("k", (int)24095, (long)(0x538117D5BEC4D9DAL ^ l))), new Class[0]).invoke(this.IlIlA, new Object[0]);
            obj = IlIlqb.IlIlN(IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)5023, (long)(0x61CB1D1B36B4945BL ^ l)))), IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)25507, (long)(0x4A41C5AA993FE46EL ^ l))))).newInstance(this.IlIlA);
            if (nArray2 != null) {
                PacketWrapper.IlIle((int[])new int[1]);
            }
        }
        catch (SecurityException securityException) {
            throw IlIluh.a(securityException);
        }
        return obj;
    }

    public Object IlIlf() throws SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException {
        long l = a ^ 0x5F66FAC01B7DL;
        return IlIlqb.IlIlN(IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)6561, (long)(0x3BDE26B6EEA9F6B6L ^ l)))), int[].class).newInstance(new Object[]{new int[]{this.IlIlf}});
    }

    public Object IlIlx(Object object) throws SecurityException, InstantiationException, IllegalAccessException, InvocationTargetException {
        long l = a ^ 0x14CF193A368CL;
        return IlIlqb.IlIlN(IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)5290, (long)(0x77459125D912564EL ^ l)))), Integer.TYPE, IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)1814, (long)(0x51B66E3AE181C5F6L ^ l)))), Boolean.TYPE).newInstance(this.IlIlf, object, true);
    }

    public Object IlIlp(Location location) throws SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException {
        long l = a ^ 0x2EF418A840DAL;
        Class[] classArray = new Class[IlIluh.b("o", (int)6713, (long)(0x7DCABF2F0B48C027L ^ l))];
        classArray[0] = Integer.TYPE;
        classArray[1] = Integer.TYPE;
        classArray[2] = Integer.TYPE;
        classArray[3] = Integer.TYPE;
        classArray[4] = Byte.TYPE;
        classArray[5] = Byte.TYPE;
        classArray[IlIluh.b("o", (int)23928, (long)(0x5A0025F3BEC68767L ^ l))] = Boolean.TYPE;
        Object[] objectArray = new Object[IlIluh.b("o", (int)27141, (long)(0x51C858EDB7B7301EL ^ l))];
        objectArray[0] = this.IlIlf;
        objectArray[1] = location.getBlockX() * IlIluh.b("o", (int)30030, (long)(0x3692E71067442F58L ^ l));
        objectArray[2] = location.getBlockY() * IlIluh.b("o", (int)30030, (long)(0x3692E71067442F58L ^ l));
        objectArray[3] = location.getBlockZ() * IlIluh.b("o", (int)30030, (long)(0x3692E71067442F58L ^ l));
        objectArray[4] = (byte)((int)location.getYaw() * IlIluh.b("o", (int)30838, (long)(0x2336A4D5BB1C2265L ^ l)) / IlIluh.b("o", (int)16154, (long)(0x721D07EDAB78E50FL ^ l)));
        objectArray[5] = (byte)((int)location.getPitch() * IlIluh.b("o", (int)31450, (long)(0x62F346AE966C20CBL ^ l)) / IlIluh.b("o", (int)21836, (long)(0x2FB435CF9220F51L ^ l)));
        objectArray[IlIluh.b("o", (int)23928, (long)(0x5A0025F3BEC68767L ^ l))] = true;
        return IlIlqb.IlIlN(IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)21083, (long)(0xA2B07CD8CE466E0L ^ l)))), classArray).newInstance(objectArray);
    }

    public Object IlIlx() throws SecurityException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Object obj;
        long l = a ^ 0x11D34C71651DL;
        Class<?> clazz = IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)23825, (long)(0x4B524E78D54CCC63L ^ l))));
        int[] nArray = IlIlqi.IlIlW();
        Object obj2 = IlIlqb.IlIlN(clazz, IlIlqb.IlIlp((String)((Object)IlIluh.a("k", (int)25528, (long)(0x368367199E572C0L ^ l))))).newInstance(this.IlIlA);
        Method method = IlIlqb.IlIlr(clazz, "a", Integer.TYPE, Object.class);
        method.invoke(obj2, 0, (byte)IlIluh.b("o", (int)22648, (long)(0x6540A42ABC8727ABL ^ l)));
        int[] nArray2 = nArray;
        try {
            method.invoke(obj2, (int)IlIluh.b("o", (int)20222, (long)(0x618E56D7C0743129L ^ l)), Float.valueOf(this.IlIlr));
            method.invoke(obj2, (int)IlIluh.b("o", (int)2613, (long)(0x7159D606218DF5E5L ^ l)), IlIlrW.IlIlW(this.IlIly));
            method.invoke(obj2, (int)IlIluh.b("o", (int)27627, (long)(0x14597C061D1E143EL ^ l)), (byte)1);
            obj = obj2;
            if (PacketWrapper.IlIlz() == null) {
                IlIlqi.IlIlb(new int[4]);
            }
        }
        catch (SecurityException securityException) {
            throw IlIluh.a(securityException);
        }
        return obj;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        IlIluh.a = IlIls.a((long)-7828379929012904888L, (long)8874042745555084917L, MethodHandles.lookup().lookupClass()).a(218176661545213L);
                        IlIluh.d = new HashMap<K, V>(13);
                        var11 = IlIluh.a ^ 6511359443480L;
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
                        var20_3 = new String[19];
                        var18_4 = 0;
                        var17_5 = "\u0087iM\u00daI\u00eew\u00e2L\u0015\u00cf\u00ff)\u0085\u00ed~\u000e\u00d1\u0085\u00a3\u0082=\u00af\u008aI\u000b\u0006\u0012Tp\u0086\u00fft\u00a5s\"\u00875Q&\u00eb\u00d6\u00f3\u0001>\u00be\u00b0\u00dd\u008f\u0084\u00d7\u00cb|\u00eft\u00db \u00a8\u00a4\u00d4\b\u00c3\u00e0\u00d6HfN\u00d1\t&T\u00d3ve}N\u00efiM\u0001h\u007f\u00bdCN\u001d\u00be\u00c4\u00b28\u00ef\u001fn\u00d6\u00acI$-\u00f5\u00c3\u009d\u00e0(N\u0090\u00c0\u0013\u00e6\u00d958\u000e}\u00a7\u008a\u00b0\u0088'ds\u001eE\u00aa\u0083\u00a4y\u00e2\u008eYh\u00db\u009a9\u00ec\u0092>l{1q\u00b0]\u00a9\u00ba\u00db\u00a7 +_\u00d7g\u00b5\u00f8\u00d10<\u00baFO\u00cd\u001f\u0006\u007fy\u0087\u00e6\u00d7\u0015\u0007\u001d$\u0014\u00c2J\u0084\u0081\u00af\u008f\u00cc :\u0088\u00d9\u0089\u009c\u00ee_\u00b5\u00a2&\u008f\u00e9\u00bb&-\u001c\u0093\u008e\u00c6d/xV\u00a5\u00d3\u009dy{\u001fna\u00de(\u008f\u009d>\u00c2\u00fd\u009d\u00f9.d\u00e2j\u0018b9e\u00bb\u00f06t\u00db6T\u00ef\u00a7O\u0099u\n\u00ee=s\u00ed\u00d5\u0090k\u00de\u00ab\u001c\u00f8! \u00c9\u00b5\u0097\u00d6\u0094\u00b1\u0081\u00d4T\u0006+\u00e7\u0000;P\u00ab\u0006\u00f1W,\u00bf\u0017~\u009b|\u00d2\u00b2]\u00c4\u00f2):\u0018\u00d5\u0013v\u0084s\u00a6\u00ee\u00e0u\u009e\u00b7u6\u00d6\u009b\u00d6\u00f1z\u00b0\u00db\u0013\u00cd\u00d6K\u0010Z#\u00c5w15\u00ca\u00eb\u00e9\u0097\u00dfQ\u00dd%\u00f6\t0\u0010\u0092e'\u00b7\u00c3\b\u001dw*q\u0016\u0018\u00b3\u0011\u0080,\u00d8\u0082\u0007V\u0002w\u009d\u00b9\u0007\u009dm/\u00bf\u0012Dl\t\u00cd\u00cf\u00bda:\u0006\u0000Ld\u00fb0lk\u008f\u0010Z+\u00e6\u000f'\u00f5D\u00b2\u00e1\"\u00ca\u0083~\u008e\u0000C\u0010e\u00ad+\u00a3\u00d7\u00c4\u00f5\u00c0oha;\u00fe\u00d5\u00bf\u0016\u0010\u00f9\u00c1G\u00ea.\u00a5\u00a5u\u0006I\u00dc\u0097\u009d\u008fH*\u0010\u00bc\u0082\u00ec\u00c0\u00a9i\u0001\u00f6q\u001a8\u00d1\u00dd\u008755\u0010o\n\u00fd\u00b5\u00f4\u0007\u0090\u0095\u00b53\b\u00e7\u0005an\u00e48\u0095?*\u000e|}C\"\u0087j\u00d4\u00b9\u00ffL\u00b1\u0012K\u00e2\u0007m@\u008a\u00d5\u00b8\u0087\u00e3d\u0090E\u00d4Jv\u00e6\u00073\u00ee\n\u00c7:\u0094\u0006\u00bb\u00c8@\b\u00bc<\u00ed\u00f9\u00d4Fi\u00ee\u0089\u001c\u00ff \u00b5\u00cc\u00be\u001d\u00de\u009c\u000f\u00c1[Q\u00fc!\u009d:M\u00b4\u00e7!\u00ff~p\u008d\u00df\tD\u00b7x\u0081]l\u00c6N";
                        var19_6 = "\u0087iM\u00daI\u00eew\u00e2L\u0015\u00cf\u00ff)\u0085\u00ed~\u000e\u00d1\u0085\u00a3\u0082=\u00af\u008aI\u000b\u0006\u0012Tp\u0086\u00fft\u00a5s\"\u00875Q&\u00eb\u00d6\u00f3\u0001>\u00be\u00b0\u00dd\u008f\u0084\u00d7\u00cb|\u00eft\u00db \u00a8\u00a4\u00d4\b\u00c3\u00e0\u00d6HfN\u00d1\t&T\u00d3ve}N\u00efiM\u0001h\u007f\u00bdCN\u001d\u00be\u00c4\u00b28\u00ef\u001fn\u00d6\u00acI$-\u00f5\u00c3\u009d\u00e0(N\u0090\u00c0\u0013\u00e6\u00d958\u000e}\u00a7\u008a\u00b0\u0088'ds\u001eE\u00aa\u0083\u00a4y\u00e2\u008eYh\u00db\u009a9\u00ec\u0092>l{1q\u00b0]\u00a9\u00ba\u00db\u00a7 +_\u00d7g\u00b5\u00f8\u00d10<\u00baFO\u00cd\u001f\u0006\u007fy\u0087\u00e6\u00d7\u0015\u0007\u001d$\u0014\u00c2J\u0084\u0081\u00af\u008f\u00cc :\u0088\u00d9\u0089\u009c\u00ee_\u00b5\u00a2&\u008f\u00e9\u00bb&-\u001c\u0093\u008e\u00c6d/xV\u00a5\u00d3\u009dy{\u001fna\u00de(\u008f\u009d>\u00c2\u00fd\u009d\u00f9.d\u00e2j\u0018b9e\u00bb\u00f06t\u00db6T\u00ef\u00a7O\u0099u\n\u00ee=s\u00ed\u00d5\u0090k\u00de\u00ab\u001c\u00f8! \u00c9\u00b5\u0097\u00d6\u0094\u00b1\u0081\u00d4T\u0006+\u00e7\u0000;P\u00ab\u0006\u00f1W,\u00bf\u0017~\u009b|\u00d2\u00b2]\u00c4\u00f2):\u0018\u00d5\u0013v\u0084s\u00a6\u00ee\u00e0u\u009e\u00b7u6\u00d6\u009b\u00d6\u00f1z\u00b0\u00db\u0013\u00cd\u00d6K\u0010Z#\u00c5w15\u00ca\u00eb\u00e9\u0097\u00dfQ\u00dd%\u00f6\t0\u0010\u0092e'\u00b7\u00c3\b\u001dw*q\u0016\u0018\u00b3\u0011\u0080,\u00d8\u0082\u0007V\u0002w\u009d\u00b9\u0007\u009dm/\u00bf\u0012Dl\t\u00cd\u00cf\u00bda:\u0006\u0000Ld\u00fb0lk\u008f\u0010Z+\u00e6\u000f'\u00f5D\u00b2\u00e1\"\u00ca\u0083~\u008e\u0000C\u0010e\u00ad+\u00a3\u00d7\u00c4\u00f5\u00c0oha;\u00fe\u00d5\u00bf\u0016\u0010\u00f9\u00c1G\u00ea.\u00a5\u00a5u\u0006I\u00dc\u0097\u009d\u008fH*\u0010\u00bc\u0082\u00ec\u00c0\u00a9i\u0001\u00f6q\u001a8\u00d1\u00dd\u008755\u0010o\n\u00fd\u00b5\u00f4\u0007\u0090\u0095\u00b53\b\u00e7\u0005an\u00e48\u0095?*\u000e|}C\"\u0087j\u00d4\u00b9\u00ffL\u00b1\u0012K\u00e2\u0007m@\u008a\u00d5\u00b8\u0087\u00e3d\u0090E\u00d4Jv\u00e6\u00073\u00ee\n\u00c7:\u0094\u0006\u00bb\u00c8@\b\u00bc<\u00ed\u00f9\u00d4Fi\u00ee\u0089\u001c\u00ff \u00b5\u00cc\u00be\u001d\u00de\u009c\u000f\u00c1[Q\u00fc!\u009d:M\u00b4\u00e7!\u00ff~p\u008d\u00df\tD\u00b7x\u0081]l\u00c6N".length();
                        var16_7 = 56;
                        var15_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var15_8;
                            v4 = var17_5.substring(v3, v3 + var16_7);
                            v5 = -1;
                            break block18;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIluh.a(var21_9).intern();
                            if ((var15_8 += var16_7) < var19_6) {
                                var16_7 = var17_5.charAt(var15_8);
                                ** continue;
                            }
                            var17_5 = "\u00e6\u00da\u0095\u00b1\u00e5\u00ad\u00d60\u00bc\u00052\u00ac\u00c6B\b4\u0018\u0087\u0007\u0013\u00aa!}\u00adWR\u008bO\u0016\n\u00fe{p*\u00c9'j/\u000b\u00b6\u00f3";
                            var19_6 = "\u00e6\u00da\u0095\u00b1\u00e5\u00ad\u00d60\u00bc\u00052\u00ac\u00c6B\b4\u0018\u0087\u0007\u0013\u00aa!}\u00adWR\u008bO\u0016\n\u00fe{p*\u00c9'j/\u000b\u00b6\u00f3".length();
                            var16_7 = 16;
                            var15_8 = -1;
lbl34:
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
lbl39:
                        // 1 sources

                        while (true) {
                            var20_3[var18_4++] = IlIluh.a(var21_9).intern();
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
lbl51:
                        // 1 sources

                        ** continue;
                    }
                }
                IlIluh.b = var20_3;
                IlIluh.c = new String[19];
                IlIluh.g = new HashMap<K, V>(13);
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
                var6_12 = new long[13];
                var3_13 = 0;
                var4_14 = "\u00d4i\u0082\u007fn\u0006M\u0080\u0096\u008b\u008fYF\u00fa\u00b0\u0013F\u00b0\u00c2\u00f7\u00edJ\u00b3\u00da\u008c\u00e0\u0090\u00b9\u00ce\u001c\u00ff\u00c6\u00e7p\u00dd\u00bfo\u00a0\u0003\u00a3\u00c6Lq\u00f9[\u009e,\u0097\u00baO\u008d\u00837\u0082\u000b\u00d4\u00c1Q[\u00cb\u00023\u00dc\u0015\u00a8_\u00fbn.A\u00113\u00d6\u0092\u009d6\u0015\u00f2\u001c\u0003\u009b8\u0096\tT\ne\u00b1";
                var5_15 = "\u00d4i\u0082\u007fn\u0006M\u0080\u0096\u008b\u008fYF\u00fa\u00b0\u0013F\u00b0\u00c2\u00f7\u00edJ\u00b3\u00da\u008c\u00e0\u0090\u00b9\u00ce\u001c\u00ff\u00c6\u00e7p\u00dd\u00bfo\u00a0\u0003\u00a3\u00c6Lq\u00f9[\u009e,\u0097\u00baO\u008d\u00837\u0082\u000b\u00d4\u00c1Q[\u00cb\u00023\u00dc\u0015\u00a8_\u00fbn.A\u00113\u00d6\u0092\u009d6\u0015\u00f2\u001c\u0003\u009b8\u0096\tT\ne\u00b1".length();
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
                    var4_14 = "\u00d4\u00ea\u00ea\u0092\rz7\u0099\u00eeiBBP\u00efk\u00ab";
                    var5_15 = "\u00d4\u00ea\u00ea\u0092\rz7\u0099\u00eeiBBP\u00efk\u00ab".length();
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
        IlIluh.e = var6_12;
        IlIluh.f = new Integer[13];
        IlIluh.IlIlF = (int)IlIluh.b("o", (int)26602, (long)(var11 ^ 3062307793202462516L));
    }

    private static SecurityException a(SecurityException securityException) {
        return securityException;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1286;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIluh", exception);
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
            IlIluh.c[n2] = IlIluh.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIluh.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIluh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7C23;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIluh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            IlIluh.f[n2] = n3;
        }
        return f[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = IlIluh.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIluh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIluh.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(IlIluh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

