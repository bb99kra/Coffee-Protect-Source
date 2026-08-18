/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.Bukkit
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
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.CP_Ls;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CheckResult;
import me.nik.coffeeprotect.CP_Zl;
import me.nik.coffeeprotect.CP_oI;
import me.nik.coffeeprotect.CP_rW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.CP_r7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class UserData {
    private final UUID CP_u;
    private final CP_Ls CP_w;
    private final CP_oI CP_I;
    private final CP_Zl CP_J;
    private String CP_K;
    private ClientVersion CP_D;
    private final boolean CP_a;
    private int CP_t;
    private long CP_y;
    private long CP_N;
    private long CP_W;
    private long CP_E;
    private long CP_G;
    private long CP_T;
    private long CP_B;
    private long CP_UnderScore;
    private long CP_z;
    private static String CP_j;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String iXfnhOiQSR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Exception decompiling
     */
    public UserData(Player var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:722)
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

    public CheckResult CP_e(PacketReceiveEvent packetReceiveEvent) {
        block6: {
            CP_oI ilIloI;
            String string;
            long l;
            block7: {
                long l2;
                block5: {
                    l = a ^ 0xACE8EB57AF5L;
                    string = UserData.CP_Y();
                    long l3 = this.CP_UnderScore() - e;
                    l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    if (string == null) break block5;
                    if (l2 < 0 && packetReceiveEvent.getPacketType() == CP_nN.PLUGIN_MESSAGE && string != null) break block6;
                    ilIloI = this.CP_I;
                    if (string == null) break block7;
                    ilIloI.CP_Y(packetReceiveEvent);
                    l2 = (long)CP_Oq.PACKET_LIMITER_ENABLED.CP_t();
                }
                if (l2 == false) break block6;
                ilIloI = this.CP_I;
            }
            float f = ilIloI.CP_w();
            float f2 = CP_Oq.PACKET_LIMITER_MAX_PACKET_RATE.CP_Y();
            int n = this.CP_a;
            if (string != null) {
                n = n != 0 ? 2 : 1;
            }
            if (f > f2 * (float)n) {
                packetReceiveEvent.setCancelled(true);
                Player player = (Player)packetReceiveEvent.getPlayer();
                CP_rW.CP_U((String)((Object)UserData.a("f", (int)10519, (long)(0x22E4BAC6379E7519L ^ l))) + player.getName() + (String)((Object)UserData.a("f", (int)4042, (long)(0x276C19FEF09CD3C7L ^ l))) + f + (String)((Object)UserData.a("f", (int)25568, (long)(0x1498CEF9E6FB3FECL ^ l))) + packetReceiveEvent.getPacketType().CP_f() + "]");
                CoffeeProtect.CP_K().disconnect(player);
                return null;
            }
        }
        return this.CP_w.CP_h(packetReceiveEvent);
    }

    public ClientVersion CP_E() {
        Player player;
        long l = a ^ 0x44D0A047A3FL;
        if (this.CP_D == ClientVersion.UNKNOWN && (player = Bukkit.getPlayer((UUID)this.CP_u)) != null) {
            this.CP_D = CP_r7.CP_b().CP_q().CP_Y(player);
        }
        return this.CP_D;
    }

    public CP_oI CP_D() {
        return this.CP_I;
    }

    public CP_Zl CP_p() {
        return this.CP_J;
    }

    public String CP_c() {
        return this.CP_K;
    }

    public void CP_R(String string) {
        this.CP_K = string;
    }

    public boolean CP_R() {
        return this.CP_a;
    }

    public long CP_G() {
        return System.currentTimeMillis() - this.CP_B;
    }

    public long CP_S() {
        return System.currentTimeMillis() - this.CP_T;
    }

    public void CP_o(long l) {
        this.CP_T = l;
    }

    public void CP_s(long l) {
        this.CP_B = l;
    }

    public void CP_L() {
        this.CP_E = System.currentTimeMillis();
    }

    public long CP_j() {
        return System.currentTimeMillis() - this.CP_E;
    }

    public long CP_s() {
        return System.currentTimeMillis() - this.CP_G;
    }

    public void CP_P() {
        this.CP_G = System.currentTimeMillis();
    }

    public long CP_UnderScore() {
        return System.currentTimeMillis() - this.CP_UnderScore;
    }

    public void CP_T() {
        this.CP_UnderScore = System.currentTimeMillis();
    }

    public void CP_W() {
        this.CP_t = 0;
    }

    public int CP_O() {
        return this.CP_t;
    }

    public int CP_E() {
        return this.CP_t++;
    }

    public void CP_l() {
        this.CP_y = System.currentTimeMillis();
    }

    public long CP_f() {
        return System.currentTimeMillis() - this.CP_y;
    }

    public void CP_E() {
        this.CP_W = System.currentTimeMillis();
    }

    public long CP_h() {
        return System.currentTimeMillis() - this.CP_W;
    }

    public void CP_K() {
        this.CP_z = System.currentTimeMillis();
    }

    public long CP_W() {
        return System.currentTimeMillis() - this.CP_z;
    }

    public void CP_d() {
        this.CP_N = System.currentTimeMillis();
    }

    public long CP_C() {
        return System.currentTimeMillis() - this.CP_N;
    }

    public CP_Ls CP_G() {
        return this.CP_w;
    }

    public UUID CP_W() {
        return this.CP_u;
    }

    public static void CP_k(String string) {
        CP_j = string;
    }

    public static String CP_Y() {
        return CP_j;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    UserData.a = CP_s.a(2817480816040098864L, -6323277062824538867L, MethodHandles.lookup().lookupClass()).a(162872413571850L);
                    UserData.d = new HashMap<K, V>(13);
                    UserData.CP_k("z8VCIb");
                    var5 = UserData.a ^ 140204550062647L;
                    var7_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                    v0 = SecretKeyFactory.getInstance("DES");
                    v1 = new byte[8];
                    v2 = v1;
                    v1[0] = (byte)(var5 >>> 56);
                    for (var8_2 = 1; var8_2 < 8; ++var8_2) {
                        v2 = v2;
                        v2[var8_2] = (byte)(var5 << var8_2 * 8 >>> 56);
                    }
                    var7_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                    var14_3 = new String[4];
                    var12_4 = 0;
                    var11_5 = "\u00da\u00df2q&d0Y]V\u001cm\u00f2v\u00f0\u000e\u0010.\u00d7\u00f1\u00bf\u008fPFs\u00e5\r\u00c4\u0017\u007fx=&";
                    var13_6 = "\u00da\u00df2q&d0Y]V\u001cm\u00f2v\u00f0\u000e\u0010.\u00d7\u00f1\u00bf\u008fPFs\u00e5\r\u00c4\u0017\u007fx=&".length();
                    var10_7 = 16;
                    var9_8 = -1;
lbl21:
                    // 2 sources

                    while (true) {
                        v3 = ++var9_8;
                        v4 = var11_5.substring(v3, v3 + var10_7);
                        v5 = -1;
                        break block12;
                        break;
                    }
lbl26:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = UserData.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        var11_5 = "zc&e\u00d1n|\u00cd\u00d2\u0081\u00e1\u00a5+\u00e7Ff\u0018@\u008aJ\u00fd\u00ed\u001a\u001f\n\u00af\u00fc u\u00be\u001d3\u00a6\u00a6(c\u0083\u00a8\u00ef\u00dd\u0003";
                        var13_6 = "zc&e\u00d1n|\u00cd\u00d2\u0081\u00e1\u00a5+\u00e7Ff\u0018@\u008aJ\u00fd\u00ed\u001a\u001f\n\u00af\u00fc u\u00be\u001d3\u00a6\u00a6(c\u0083\u00a8\u00ef\u00dd\u0003".length();
                        var10_7 = 16;
                        var9_8 = -1;
lbl35:
                        // 2 sources

                        while (true) {
                            v6 = ++var9_8;
                            v4 = var11_5.substring(v6, v6 + var10_7);
                            v5 = 0;
                            break block12;
                            break;
                        }
                        break;
                    }
lbl40:
                    // 1 sources

                    while (true) {
                        var14_3[var12_4++] = UserData.a(var15_9).intern();
                        if ((var9_8 += var10_7) < var13_6) {
                            var10_7 = var11_5.charAt(var9_8);
                            ** continue;
                        }
                        break block13;
                        break;
                    }
                }
                var15_9 = var7_1.doFinal(v4.getBytes("ISO-8859-1"));
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
            UserData.b = var14_3;
            UserData.c = new String[4];
            var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
            v7 = SecretKeyFactory.getInstance("DES");
            v8 = new byte[8];
            v9 = v8;
            v8[0] = (byte)(var5 >>> 56);
            for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                v9 = v9;
                v9[var1_11] = (byte)(var5 << var1_11 * 8 >>> 56);
            }
            break block14;
lbl66:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
        var2_12 = -4252692214475276953L;
        var4_13 = var0_10.doFinal(new byte[]{(byte)(var2_12 >>> 56), (byte)(var2_12 >>> 48), (byte)(var2_12 >>> 40), (byte)(var2_12 >>> 32), (byte)(var2_12 >>> 24), (byte)(var2_12 >>> 16), (byte)(var2_12 >>> 8), (byte)var2_12});
        ** while (true)
        UserData.e = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x64B;
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
                throw new RuntimeException("me/nik/coffeeprotect/UserData", exception);
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
            UserData.c[n2] = UserData.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = UserData.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/UserData" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(UserData.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
