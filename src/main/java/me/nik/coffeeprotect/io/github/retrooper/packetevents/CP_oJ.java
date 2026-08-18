/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  io.netty.channel.Channel
 *  org.bukkit.Bukkit
 *  org.bukkit.entity.Player
 */
package me.nik.coffeeprotect.io.github.retrooper.packetevents;

import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import io.netty.channel.Channel;
import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.security.Key;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.CP_G2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_L5;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_Qt;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.CP_xG;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

public class CP_oJ
implements CP_xG {
    private Class<?> CP_z;
    private Class<?> CP_R;
    private Class<?> CP_q;
    private Field CP_U;
    private Method CP_r;
    private Method CP_Y;
    private Class<?> CP_I;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static transient /* synthetic */ String ajwIwskpuq = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Unable to fully structure code
     */
    private void CP_k() {
        block11: {
            block9: {
                block10: {
                    var1_1 = CP_oJ.a ^ 13499918569483L;
                    var3_2 = CP_Qt.CP_UnderScore();
                    try {
                        v0 = this.CP_z;
                        if (var3_2 != null) break block9;
                        if (v0 != null) break block10;
                    }
                    catch (ClassNotFoundException v1) {
                        throw CP_oJ.a(v1);
                    }
                    try {
                        var4_3 = CP_r7.CP_b().CP_j().getClass().getClassLoader();
                        this.CP_z = var4_3.loadClass((String)CP_oJ.a("k", (int)13599, (long)(372601512130603309L ^ var1_1)));
                        this.CP_U = this.CP_z.getDeclaredField((String)CP_oJ.a("k", (int)25076, (long)(1703847906181987777L ^ var1_1)));
                        this.CP_R = var4_3.loadClass((String)CP_oJ.a("k", (int)2894, (long)(3715690864063666042L ^ var1_1)));
                        this.CP_q = var4_3.loadClass((String)CP_oJ.a("k", (int)15234, (long)(5994007440290080701L ^ var1_1)));
                        var5_6 = var4_3.loadClass((String)CP_oJ.a("k", (int)20232, (long)(1536281605697246015L ^ var1_1)));
                        this.CP_r = this.CP_z.getMethod((String)CP_oJ.a("k", (int)22534, (long)(6550932948625523768L ^ var1_1)), new Class[0]);
                        this.CP_Y = var5_6.getMethod((String)CP_oJ.a("k", (int)7433, (long)(5175202933741175097L ^ var1_1)), new Class[]{Object.class});
                    }
                    catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException var4_4) {
                        var4_4.printStackTrace();
                    }
                }
                v0 = this.CP_I;
            }
            try {
                if (var3_2 == null) {
                    if (v0 != null) break block11;
                }
                ** GOTO lbl34
            }
            catch (ClassNotFoundException v2) {
                throw CP_oJ.a(v2);
            }
            try {
                v0 = CP_r7.CP_b().CP_j().getClass();
lbl34:
                // 2 sources

                var4_3 = v0.getClassLoader();
                this.CP_I = var4_3.loadClass((String)CP_oJ.a("k", (int)6921, (long)(8116132298552854335L ^ var1_1)));
            }
            catch (ClassNotFoundException var4_5) {
                var4_5.printStackTrace();
            }
        }
    }

    @Override
    public int CP_UnderScore(Player player) {
        this.CP_k();
        try {
            Object object = this.CP_r.invoke(null, new Object[0]);
            return (Integer)this.CP_Y.invoke(object, player);
        }
        catch (IllegalAccessException | InvocationTargetException reflectiveOperationException) {
            reflectiveOperationException.printStackTrace();
            return -1;
        }
    }

    @Override
    public int CP_i(CP_G2 ilIlG2) {
        long l = a ^ 0x3FB6FB3ACC66L;
        try {
            int n;
            int n2;
            Player player;
            if (ilIlG2.CP_M() != null && (player = Bukkit.getPlayer((UUID)ilIlG2.CP_M())) != null && (n2 = this.CP_UnderScore(player)) != -1) {
                return n2;
            }
            player = ((Channel)ilIlG2.CP_z()).pipeline().get((String)((Object)CP_oJ.a("k", (int)27807, (long)(0x729944FE6E382CC3L ^ l))));
            Object object = CP_L5.CP_B(player.getClass(), (String)((Object)CP_oJ.a("k", (int)23750, (long)(0x361C7949D6B49C90L ^ l)))).get(player);
            Object object2 = CP_L5.CP_B(object.getClass(), (String)((Object)CP_oJ.a("k", (int)28566, (long)(0x751E7167D9B22FC7L ^ l)))).get(object);
            Object object3 = CP_L5.CP_B(object2.getClass(), (String)((Object)CP_oJ.a("k", (int)3675, (long)(0x3AE95029F1FCE05L ^ l)))).get(object2);
            try {
                n = object3 instanceof Integer ? ((Integer)object3).intValue() : ((ProtocolVersion)object3).getVersion();
            }
            catch (Exception exception) {
                throw CP_oJ.a(exception);
            }
            return n;
        }
        catch (Exception exception) {
            CP_r7.CP_b().CP_m().CP_c((String)((Object)CP_oJ.a("k", (int)16971, (long)(0x4AD5CD39E5C8021BL ^ l))));
            return -1;
        }
    }

    @Override
    public Class<?> CP_o() {
        this.CP_k();
        return this.CP_I;
    }

    @Override
    public Class<?> CP_U() {
        this.CP_k();
        return this.CP_R;
    }

    @Override
    public Class<?> CP_X() {
        this.CP_k();
        return this.CP_q;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                CP_oJ.a = CP_s.a(-7530375635231721040L, 8907122558553728920L, MethodHandles.lookup().lookupClass()).a(33894525496632L);
                CP_oJ.d = new HashMap<K, V>(13);
                var0 = CP_oJ.a ^ 47092753938639L;
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
                var6_5 = "\u0001\u00b3\u00c1\u00c3\u00ae`*\u00c8^9\u00f9ZP\u0095\u00ef\u0000\u0014I2I\u0016]\u0092\u00b5\u00a5\u00be\u001f\u0000X\u0006$NO\u0091\u001e\u0010 z\u00d0t\u00a3R\u0016(\u00b7!e\u00c5P\u0085k1\b\u0015\b\u00ef\u00fc \u0006S\u0019\u00c8:L\u0086l\rW/\u00e9D8\u0018\u00b4\u00a4\u0005\u0010@ps\u0088\u00f1\u00c3\u001e\rv\u0010^4\u00c5\u00ca\u00bd^\u00c9\n\u0011\u001a\u00e9\u0087\u0002W\u00968-G\u0093y\u0081]\u0013R\u0086\u00bd\u00a1\f\u00a12C\u00c2\u0080\u0088\u00ba6M \u00f8m=\u00d7\u0010/t\u00d8\u00ed\u00d2\u00bd(\r\u00dbG\u00d1=\u00ca\u00f8+\u00c6`Fr\u0014\u00a7\u0085\u00ae'\u00b3\u00ac(\u00b8\u00c3\u0088\u0004\u00d2\u00c4\u0000~\u00f2NG\u0004\u008d\u00d0x\"w\u00daBX\u0097\u00be+\u0091{>\u00d4(i`\u00e7Y\u00844d[u\u0092\u0091\u00be\u00f9\u001cI\u00e4T\bF\u00a2\u00f8\u0098G\u0093-\u0092.eg\u00f9\u00d7\u008arwCy\u009b\u00a0\u00af,\b\u009b#\u00e5\f\u0085\u00c7?n\u00f0h\u00e0e}k\u009a\u0084p \u00ff}<H\u0098\u00f7\u00c8)\u00c9\u00ae+m,\u00e4\u00f8W\u0005\u0094\u0019\u008f\u00d2w\u0095\u00cc\n\u00e7\u00ff\u00937\u00afW\u00018\u00811\u00dcA\u00ba0~\u00f1\u0003\u00b9vT\u00e6\u0016\u0093a\u00f8Q\u0090\u00c1\u00b4\u0006\u0083\u008a\u00eas!\u008b\u00bf\u0090/\u00a5\u00aa\u00dc\u00c0&J9?.s\u00f0AsE\u00f6\u0089\r<\u009e\u0092l\u00b9\u00b0\u00d6\u009c\u0018\u00e1\u00c8\u00f0ZK\u0098\u0081\u00b9\u000e\u0002\u00c3\u00a2g\u00ba\r\u00cd:\u00e2*~\u00c7\u001c\u00e4\u00ad i\u000eE\u00f6\u00f5U@\u00ce\u00a1\u009f6\u00ee\u00fa\u00e9p]!\u0015\u0014\u00ba\u00ec\u00c1\u00c1\u001b\u009e\u00cbH\u00b7K\u00e6>\u00ef`.\u00bb\u0090\u00f3\u0094f\u00a9\u00c6\u008a\u000b\u00af\u00eeS\u009e\u00c78\u00c8\u0002:l\u0099\u00be\u0089\u0087\u00d2{TO\u00ae\u00eb\u00d0\u00fb\u00f0\u0006\u009b\u00b3\u000e\u00d0\u00c0\\\u0003\u00dd\u0017\u0018(6]\u00c4\u00d0C/\u008a\u001dA\u00fb\u00ea\u00e9E\u0086\u0095<#\u0087\u001a\u00b9tK\u00cc\u00bc\u0093\u00c87\u008a\u00de0\u001fi\u00fb\u00cf\u00c9\u00f5\u00a0\u001c\"\u00b4\u00e5\u00bd\u008236\u00fd\u00ed\u00be\u00e4\u0003\u00c8\u0010\u001a\u00ee\u00d0\u001a\u0014\u00dd\u000fw\u0082y\u0098\u000f:\u0015\u00139X\u0099,\u00d8W\u00d1\u00dc\u00e5[\u0095\u0099\u00dc5\u00f3\u0097\u0007\u00d4\u00e4\u0093\blV{)ZP\u00a1\u009a\u00d2\u00c5\u00ccE\u008e\u00d3]\u001e3\u00b7\u008a\u00cc4W2\u0089V\u00a3x\u0004\u0002Z\u0011!]\u00cb\u00f8\u00f5\u00ccF\u00a5t\u00ac\u0011/\u008bK\u00c3\u00ab\u0017g|PZh6\u00a3v\u008e!8\u00f0\u00e8\u0097\u00e2\u0092\u00ec]\u0089\u00d4\u00c4";
                var8_6 = "\u0001\u00b3\u00c1\u00c3\u00ae`*\u00c8^9\u00f9ZP\u0095\u00ef\u0000\u0014I2I\u0016]\u0092\u00b5\u00a5\u00be\u001f\u0000X\u0006$NO\u0091\u001e\u0010 z\u00d0t\u00a3R\u0016(\u00b7!e\u00c5P\u0085k1\b\u0015\b\u00ef\u00fc \u0006S\u0019\u00c8:L\u0086l\rW/\u00e9D8\u0018\u00b4\u00a4\u0005\u0010@ps\u0088\u00f1\u00c3\u001e\rv\u0010^4\u00c5\u00ca\u00bd^\u00c9\n\u0011\u001a\u00e9\u0087\u0002W\u00968-G\u0093y\u0081]\u0013R\u0086\u00bd\u00a1\f\u00a12C\u00c2\u0080\u0088\u00ba6M \u00f8m=\u00d7\u0010/t\u00d8\u00ed\u00d2\u00bd(\r\u00dbG\u00d1=\u00ca\u00f8+\u00c6`Fr\u0014\u00a7\u0085\u00ae'\u00b3\u00ac(\u00b8\u00c3\u0088\u0004\u00d2\u00c4\u0000~\u00f2NG\u0004\u008d\u00d0x\"w\u00daBX\u0097\u00be+\u0091{>\u00d4(i`\u00e7Y\u00844d[u\u0092\u0091\u00be\u00f9\u001cI\u00e4T\bF\u00a2\u00f8\u0098G\u0093-\u0092.eg\u00f9\u00d7\u008arwCy\u009b\u00a0\u00af,\b\u009b#\u00e5\f\u0085\u00c7?n\u00f0h\u00e0e}k\u009a\u0084p \u00ff}<H\u0098\u00f7\u00c8)\u00c9\u00ae+m,\u00e4\u00f8W\u0005\u0094\u0019\u008f\u00d2w\u0095\u00cc\n\u00e7\u00ff\u00937\u00afW\u00018\u00811\u00dcA\u00ba0~\u00f1\u0003\u00b9vT\u00e6\u0016\u0093a\u00f8Q\u0090\u00c1\u00b4\u0006\u0083\u008a\u00eas!\u008b\u00bf\u0090/\u00a5\u00aa\u00dc\u00c0&J9?.s\u00f0AsE\u00f6\u0089\r<\u009e\u0092l\u00b9\u00b0\u00d6\u009c\u0018\u00e1\u00c8\u00f0ZK\u0098\u0081\u00b9\u000e\u0002\u00c3\u00a2g\u00ba\r\u00cd:\u00e2*~\u00c7\u001c\u00e4\u00ad i\u000eE\u00f6\u00f5U@\u00ce\u00a1\u009f6\u00ee\u00fa\u00e9p]!\u0015\u0014\u00ba\u00ec\u00c1\u00c1\u001b\u009e\u00cbH\u00b7K\u00e6>\u00ef`.\u00bb\u0090\u00f3\u0094f\u00a9\u00c6\u008a\u000b\u00af\u00eeS\u009e\u00c78\u00c8\u0002:l\u0099\u00be\u0089\u0087\u00d2{TO\u00ae\u00eb\u00d0\u00fb\u00f0\u0006\u009b\u00b3\u000e\u00d0\u00c0\\\u0003\u00dd\u0017\u0018(6]\u00c4\u00d0C/\u008a\u001dA\u00fb\u00ea\u00e9E\u0086\u0095<#\u0087\u001a\u00b9tK\u00cc\u00bc\u0093\u00c87\u008a\u00de0\u001fi\u00fb\u00cf\u00c9\u00f5\u00a0\u001c\"\u00b4\u00e5\u00bd\u008236\u00fd\u00ed\u00be\u00e4\u0003\u00c8\u0010\u001a\u00ee\u00d0\u001a\u0014\u00dd\u000fw\u0082y\u0098\u000f:\u0015\u00139X\u0099,\u00d8W\u00d1\u00dc\u00e5[\u0095\u0099\u00dc5\u00f3\u0097\u0007\u00d4\u00e4\u0093\blV{)ZP\u00a1\u009a\u00d2\u00c5\u00ccE\u008e\u00d3]\u001e3\u00b7\u008a\u00cc4W2\u0089V\u00a3x\u0004\u0002Z\u0011!]\u00cb\u00f8\u00f5\u00ccF\u00a5t\u00ac\u0011/\u008bK\u00c3\u00ab\u0017g|PZh6\u00a3v\u008e!8\u00f0\u00e8\u0097\u00e2\u0092\u00ec]\u0089\u00d4\u00c4".length();
                var5_7 = 48;
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
                    var9_3[var7_4++] = CP_oJ.a(var10_9).intern();
                    if ((var4_8 += var5_7) < var8_6) {
                        var5_7 = var6_5.charAt(var4_8);
                        ** continue;
                    }
                    var6_5 = "\u00f0\u00d2\u00c8\u0003#\u00b5\u0000%\u008a\u0093\u001a\u00b0 e)\u0010R\u009a\u00d8#\u008eR\u0084\u0096#%\u00f0\u0007\u00fd\u00edgL\u0018\u00f8\u00e86\u0086\u00ed?\u00e7sq\u0014\u00b9\u0085{ki\u00a5\\\u009dx\u0085\u00d8GH\u00c7";
                    var8_6 = "\u00f0\u00d2\u00c8\u0003#\u00b5\u0000%\u008a\u0093\u001a\u00b0 e)\u0010R\u009a\u00d8#\u008eR\u0084\u0096#%\u00f0\u0007\u00fd\u00edgL\u0018\u00f8\u00e86\u0086\u00ed?\u00e7sq\u0014\u00b9\u0085{ki\u00a5\\\u009dx\u0085\u00d8GH\u00c7".length();
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
                    var9_3[var7_4++] = CP_oJ.a(var10_9).intern();
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
        CP_oJ.b = var9_3;
        CP_oJ.c = new String[13];
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3F9D;
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
                throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_oJ", exception);
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
            CP_oJ.c[n2] = CP_oJ.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_oJ.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/io/github/retrooper/packetevents/CP_oJ" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_oJ.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

