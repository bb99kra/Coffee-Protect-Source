/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import me.nik.coffeeprotect.IlIlLs;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTV;
import me.nik.coffeeprotect.IlIlZl;
import me.nik.coffeeprotect.IlIloI;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.IlIlr7;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

/*
 * Duplicate member names - consider using --renamedupmembers true
 */
public class IlIlTM {
    private final UUID IlIlu;
    private final IlIlLs IlIlw;
    private final IlIloI IlIlI;
    private final IlIlZl IlIlJ;
    private String IlIlK;
    private ClientVersion IlIlD;
    private final boolean IlIla;
    private int IlIlt;
    private long IlIly;
    private long IlIlN;
    private long IlIlW;
    private long IlIlE;
    private long IlIlG;
    private long IlIlT;
    private long IlIlB;
    private long IlIl_;
    private long IlIlz;
    private static String IlIlj;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static transient /* synthetic */ String iXfnhOiQSR = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    /*
     * Exception decompiling
     */
    public IlIlTM(Player var1_1) {
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
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    public IlIlTV IlIle(PacketReceiveEvent packetReceiveEvent) {
        block6: {
            IlIloI ilIloI;
            String string;
            long l;
            block7: {
                long l2;
                block5: {
                    l = a ^ 0xACE8EB57AF5L;
                    string = IlIlTM.IlIlY();
                    long l3 = this.IlIl_() - e;
                    l2 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
                    if (string == null) break block5;
                    if (l2 < 0 && packetReceiveEvent.getPacketType() == IlIlnN.PLUGIN_MESSAGE && string != null) break block6;
                    ilIloI = this.IlIlI;
                    if (string == null) break block7;
                    ilIloI.IlIlY(packetReceiveEvent);
                    l2 = (long)IlIlOq.PACKET_LIMITER_ENABLED.IlIlt();
                }
                if (l2 == false) break block6;
                ilIloI = this.IlIlI;
            }
            float f = ilIloI.IlIlw();
            float f2 = IlIlOq.PACKET_LIMITER_MAX_PACKET_RATE.IlIlY();
            int n = this.IlIla;
            if (string != null) {
                n = n != 0 ? 2 : 1;
            }
            if (f > f2 * (float)n) {
                packetReceiveEvent.setCancelled(true);
                Player player = (Player)packetReceiveEvent.getPlayer();
                IlIlrW.IlIlU((String)((Object)IlIlTM.a("f", (int)10519, (long)(0x22E4BAC6379E7519L ^ l))) + player.getName() + (String)((Object)IlIlTM.a("f", (int)4042, (long)(0x276C19FEF09CD3C7L ^ l))) + f + (String)((Object)IlIlTM.a("f", (int)25568, (long)(0x1498CEF9E6FB3FECL ^ l))) + packetReceiveEvent.getPacketType().IlIlf() + "]");
                CoffeeProtect.IlIlK().disconnect(player);
                return null;
            }
        }
        return this.IlIlw.IlIlh(packetReceiveEvent);
    }

    public ClientVersion IlIlE() {
        Player player;
        long l = a ^ 0x44D0A047A3FL;
        if (this.IlIlD == ClientVersion.UNKNOWN && (player = Bukkit.getPlayer((UUID)this.IlIlu)) != null) {
            this.IlIlD = IlIlr7.IlIlb().IlIlq().IlIlY((Object)player);
        }
        return this.IlIlD;
    }

    public IlIloI IlIlD() {
        return this.IlIlI;
    }

    public IlIlZl IlIlp() {
        return this.IlIlJ;
    }

    public String IlIlc() {
        return this.IlIlK;
    }

    public void IlIlR(String string) {
        this.IlIlK = string;
    }

    public boolean IlIlR() {
        return this.IlIla;
    }

    public long IlIlG() {
        return System.currentTimeMillis() - this.IlIlB;
    }

    public long IlIlS() {
        return System.currentTimeMillis() - this.IlIlT;
    }

    public void IlIlo(long l) {
        this.IlIlT = l;
    }

    public void IlIls(long l) {
        this.IlIlB = l;
    }

    public void IlIlL() {
        this.IlIlE = System.currentTimeMillis();
    }

    public long IlIlj() {
        return System.currentTimeMillis() - this.IlIlE;
    }

    public long IlIls() {
        return System.currentTimeMillis() - this.IlIlG;
    }

    public void IlIlP() {
        this.IlIlG = System.currentTimeMillis();
    }

    public long IlIl_() {
        return System.currentTimeMillis() - this.IlIl_;
    }

    public void IlIlT() {
        this.IlIl_ = System.currentTimeMillis();
    }

    public void IlIlW() {
        this.IlIlt = 0;
    }

    public int IlIlO() {
        return this.IlIlt;
    }

    public int IlIlE() {
        return this.IlIlt++;
    }

    public void IlIll() {
        this.IlIly = System.currentTimeMillis();
    }

    public long IlIlf() {
        return System.currentTimeMillis() - this.IlIly;
    }

    public void IlIlE() {
        this.IlIlW = System.currentTimeMillis();
    }

    public long IlIlh() {
        return System.currentTimeMillis() - this.IlIlW;
    }

    public void IlIlK() {
        this.IlIlz = System.currentTimeMillis();
    }

    public long IlIlW() {
        return System.currentTimeMillis() - this.IlIlz;
    }

    public void IlIld() {
        this.IlIlN = System.currentTimeMillis();
    }

    public long IlIlC() {
        return System.currentTimeMillis() - this.IlIlN;
    }

    public IlIlLs IlIlG() {
        return this.IlIlw;
    }

    public UUID IlIlW() {
        return this.IlIlu;
    }

    public static void IlIlk(String string) {
        IlIlj = string;
    }

    public static String IlIlY() {
        return IlIlj;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    IlIlTM.a = IlIls.a((long)2817480816040098864L, (long)-6323277062824538867L, MethodHandles.lookup().lookupClass()).a(162872413571850L);
                    IlIlTM.d = new HashMap<K, V>(13);
                    IlIlTM.IlIlk("z8VCIb");
                    var5 = IlIlTM.a ^ 140204550062647L;
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
                        var14_3[var12_4++] = IlIlTM.a(var15_9).intern();
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
                        var14_3[var12_4++] = IlIlTM.a(var15_9).intern();
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
            IlIlTM.b = var14_3;
            IlIlTM.c = new String[4];
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
        IlIlTM.e = ((long)var4_13[0] & 255L) << 56 | ((long)var4_13[1] & 255L) << 48 | ((long)var4_13[2] & 255L) << 40 | ((long)var4_13[3] & 255L) << 32 | ((long)var4_13[4] & 255L) << 24 | ((long)var4_13[5] & 255L) << 16 | ((long)var4_13[6] & 255L) << 8 | (long)var4_13[7] & 255L;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlTM", exception);
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
            IlIlTM.c[n2] = IlIlTM.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlTM.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlTM" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlTM.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

