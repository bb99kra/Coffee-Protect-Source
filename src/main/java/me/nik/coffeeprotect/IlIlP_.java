/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN
 *  me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls
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
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.CoffeeProtect;
import me.nik.coffeeprotect.IlIlOq;
import me.nik.coffeeprotect.IlIlTE;
import me.nik.coffeeprotect.IlIlrW;
import me.nik.coffeeprotect.IlIlvF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIlPw;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.IlIldF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.IlIlnN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.IlIls;
import org.bukkit.entity.Player;

public class IlIlP_
extends IlIlPw {
    private final CoffeeProtect IlIlL;
    private long IlIlq;
    private static final long a;
    private static final String[] b;
    private static final String[] c;
    private static final Map d;
    private static final long e;
    private static final long f;
    private static transient /* synthetic */ String dwWJlAoBBO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public IlIlP_(CoffeeProtect coffeeProtect) {
        super(IlIldF.LOWEST);
        this.IlIlL = coffeeProtect;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void IlIlP(PacketReceiveEvent var1_1) {
        block81: {
            block79: {
                block80: {
                    block78: {
                        block76: {
                            block77: {
                                block67: {
                                    block73: {
                                        block72: {
                                            block71: {
                                                block70: {
                                                    block69: {
                                                        block68: {
                                                            block86: {
                                                                block66: {
                                                                    block64: {
                                                                        block65: {
                                                                            block63: {
                                                                                block62: {
                                                                                    block82: {
                                                                                        var2_2 = IlIlP_.a ^ 123699654080291L;
                                                                                        var4_3 = IlIlvF.IlIlo();
                                                                                        v0 /* !! */  = var1_1.getUser();
                                                                                        if (var4_3 == null) break block62;
                                                                                        if (v0 /* !! */  == null) ** GOTO lbl34
                                                                                        break block82;
                                                                                        catch (Throwable v1) {
                                                                                            throw IlIlP_.a(v1);
                                                                                        }
                                                                                    }
                                                                                    try {
                                                                                        block83: {
                                                                                            v2 /* !! */  = var1_1;
                                                                                            if (var4_3 == null) break block63;
                                                                                            break block83;
                                                                                            catch (Throwable v3) {
                                                                                                throw IlIlP_.a(v3);
                                                                                            }
                                                                                        }
                                                                                        v0 /* !! */  = v2 /* !! */ .getPlayer();
                                                                                    }
                                                                                    catch (Throwable v4) {
                                                                                        throw IlIlP_.a(v4);
                                                                                    }
                                                                                }
                                                                                if (v0 /* !! */  == null) ** GOTO lbl34
                                                                                v2 /* !! */  = var1_1;
                                                                            }
                                                                            if (var4_3 == null) break block64;
                                                                            try {
                                                                                block84: {
                                                                                    if (!v2 /* !! */ .isCancelled()) break block65;
                                                                                    break block84;
                                                                                    catch (Throwable v5) {
                                                                                        throw IlIlP_.a(v5);
                                                                                    }
                                                                                }
                                                                                return;
                                                                            }
                                                                            catch (Throwable v6) {
                                                                                throw IlIlP_.a(v6);
                                                                            }
                                                                        }
                                                                        v2 /* !! */  = var1_1.getPlayer();
                                                                    }
                                                                    var5_4 = (Player)v2 /* !! */ ;
                                                                    var6_5 = var1_1.getPacketType();
                                                                    v7 = IlIlOq.DISABLE_OFFLINE_PACKETS.IlIlt();
                                                                    if (var4_3 == null) break block66;
                                                                    try {
                                                                        block85: {
                                                                            if (!v7) break block67;
                                                                            break block85;
                                                                            catch (Throwable v8) {
                                                                                throw IlIlP_.a(v8);
                                                                            }
                                                                        }
                                                                        v7 = var5_4.isOnline();
                                                                    }
                                                                    catch (Throwable v9) {
                                                                        throw IlIlP_.a(v9);
                                                                    }
                                                                }
                                                                if (var4_3 == null) break block68;
                                                                if (v7) break block67;
                                                                break block86;
                                                                catch (Throwable v10) {
                                                                    throw IlIlP_.a(v10);
                                                                }
                                                            }
                                                            try {
                                                                block87: {
                                                                    v11 = var6_5;
                                                                    if (var4_3 == null) break block69;
                                                                    break block87;
                                                                    catch (Throwable v12) {
                                                                        throw IlIlP_.a(v12);
                                                                    }
                                                                }
                                                                v7 = v11 instanceof IlIlnN;
                                                            }
                                                            catch (Throwable v13) {
                                                                throw IlIlP_.a(v13);
                                                            }
                                                        }
                                                        if (!v7) break block67;
                                                        v11 = var6_5;
                                                    }
                                                    v14 = IlIlnN.CLIENT_TICK_END;
                                                    if (var4_3 == null) break block70;
                                                    try {
                                                        block88: {
                                                            if (v11 == v14) break block67;
                                                            break block88;
                                                            catch (Throwable v15) {
                                                                throw IlIlP_.a(v15);
                                                            }
                                                        }
                                                        v11 = var6_5;
                                                        v14 = IlIlnN.PLAYER_LOADED;
                                                    }
                                                    catch (Throwable v16) {
                                                        throw IlIlP_.a(v16);
                                                    }
                                                }
                                                if (var4_3 == null) break block71;
                                                try {
                                                    block89: {
                                                        if (v11 == v14) break block67;
                                                        break block89;
                                                        catch (Throwable v17) {
                                                            throw IlIlP_.a(v17);
                                                        }
                                                    }
                                                    v11 = var6_5;
                                                    v14 = IlIlnN.PONG;
                                                }
                                                catch (Throwable v18) {
                                                    throw IlIlP_.a(v18);
                                                }
                                            }
                                            if (var4_3 == null) break block72;
                                            try {
                                                block90: {
                                                    if (v11 == v14) break block67;
                                                    break block90;
                                                    catch (Throwable v19) {
                                                        throw IlIlP_.a(v19);
                                                    }
                                                }
                                                v11 = var6_5;
                                                v14 = IlIlnN.WINDOW_CONFIRMATION;
                                            }
                                            catch (Throwable v20) {
                                                throw IlIlP_.a(v20);
                                            }
                                        }
                                        if (var4_3 == null) break block73;
                                        try {
                                            block91: {
                                                if (v11 == v14) break block67;
                                                break block91;
                                                catch (Throwable v21) {
                                                    throw IlIlP_.a(v21);
                                                }
                                            }
                                            v11 = var6_5;
                                            v14 = IlIlnN.PLUGIN_MESSAGE;
                                        }
                                        catch (Throwable v22) {
                                            throw IlIlP_.a(v22);
                                        }
                                    }
                                    try {
                                        if (v11 != v14) {
                                            var1_1.setCancelled(true);
                                            IlIlrW.IlIlU(new String[]{(String)IlIlP_.a("c", (int)9342, (long)(7453868665410283248L ^ var2_2)) + var6_5.IlIlf() + (String)IlIlP_.a("c", (int)28864, (long)(9006227347726283331L ^ var2_2)) + var5_4.getName()});
                                            return;
                                        }
                                    }
                                    catch (Throwable v23) {
                                        throw IlIlP_.a(v23);
                                    }
                                }
                                var7_6 = this.IlIlL.IlIlF().IlIlR(var5_4);
                                try {
                                    if (var7_6 == null) {
                                        return;
                                    }
                                }
                                catch (Throwable v24) {
                                    throw IlIlP_.a(v24);
                                }
                                var8_7 = null;
                                try {
                                    var8_7 = var7_6.IlIle(var1_1);
                                }
                                catch (Throwable var9_8) {
                                    block75: {
                                        block74: {
                                            try {
                                                try {
                                                    v25 = IlIlOq.PREVENT_INVALID_PACKETS.IlIlt();
                                                    if (var4_3 == null) break block74;
                                                    if (v25 == 0) break block75;
                                                }
                                                catch (Throwable v26) {
                                                    throw IlIlP_.a(v26);
                                                }
                                                var1_1.setCancelled(true);
                                                CoffeeProtect.IlIlK().disconnect(var5_4);
                                                v25 = 1;
                                            }
                                            catch (Throwable v27) {
                                                throw IlIlP_.a(v27);
                                            }
                                        }
                                        v28 = new String[v25];
                                        v28[0] = (String)IlIlP_.a("c", (int)16924, (long)(5697534633590685854L ^ var2_2)) + var5_4.getName() + (String)IlIlP_.a("c", (int)15768, (long)(2730463953650712350L ^ var2_2));
                                        IlIlrW.IlIlU(v28);
                                        return;
                                    }
                                    var9_8.printStackTrace();
                                }
                                try {
                                    v29 = var8_7;
                                    if (var4_3 == null) break block76;
                                    if (v29 != null) break block77;
                                }
                                catch (Throwable v30) {
                                    throw IlIlP_.a(v30);
                                }
                                return;
                            }
                            var1_1.setCancelled(true);
                            v29 = var8_7;
                        }
                        try {
                            try {
                                if (var4_3 == null) break block78;
                                if (v29 instanceof IlIlTE) {
                                }
                                ** GOTO lbl225
                            }
                            catch (Throwable v31) {
                                throw IlIlP_.a(v31);
                            }
                            v29 = var8_7;
                        }
                        catch (Throwable v32) {
                            throw IlIlP_.a(v32);
                        }
                    }
                    var9_9 = v29.IlIlz();
                    try {
                        try {
                            if (var9_9 == null) break block79;
                            v33 = this.IlIlH(var1_1.IlIlO());
                            if (var4_3 == null) break block80;
                        }
                        catch (Throwable v34) {
                            throw IlIlP_.a(v34);
                        }
                        if (v33 == 0) break block79;
                    }
                    catch (Throwable v35) {
                        throw IlIlP_.a(v35);
                    }
                    v33 = 1;
                }
                v36 = new String[v33];
                v36[0] = "[" + var8_7.IlIlA() + (String)IlIlP_.a("c", (int)15299, (long)(4722932104665102662L ^ var2_2)) + var5_4.getName() + (String)IlIlP_.a("c", (int)4648, (long)(2283150640539488423L ^ var2_2)) + var9_9;
                IlIlrW.IlIlU(v36);
            }
            try {
                if (var4_3 != null) break block81;
lbl225:
                // 2 sources

                CoffeeProtect.IlIlK().flag(var5_4, var8_7.IlIlA(), var8_7.IlIle(), var8_7.IlIlz());
            }
            catch (Throwable v37) {
                throw IlIlP_.a(v37);
            }
        }
    }

    private boolean IlIlH(long l) {
        long l2 = a ^ 0x2CA0DDA79B51L;
        String[] stringArray = IlIlvF.IlIlo();
        long l3 = l - this.IlIlq - f;
        long l4 = l3 == 0L ? 0 : (l3 < 0L ? -1 : 1);
        if (stringArray != null) {
            if (l4 > 0) {
                this.IlIlq = l;
                return true;
            }
            l4 = 0;
        }
        return (boolean)l4;
    }

    /*
     * Exception decompiling
     */
    public void IlIlb(PacketSendEvent var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [9[TRYBLOCK]], but top level block is 49[SWITCH]
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.processEndingBlocks(Op04StructuredStatement.java:435)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op04StructuredStatement.buildNestedBlocks(Op04StructuredStatement.java:484)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.createInitialStructuredBlock(Op03SimpleStatement.java:736)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:850)
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

    /*
     * Unable to fully structure code
     */
    static {
        block17: {
            block16: {
                block15: {
                    block14: {
                        IlIlP_.a = IlIls.a((long)3083170895345910377L, (long)-4776263975489416880L, MethodHandles.lookup().lookupClass()).a(128277672854574L);
                        IlIlP_.d = new HashMap<K, V>(13);
                        var10 = IlIlP_.a ^ 52386147074515L;
                        var12_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                        v0 = SecretKeyFactory.getInstance("DES");
                        v1 = new byte[8];
                        v2 = v1;
                        v1[0] = (byte)(var10 >>> 56);
                        for (var13_2 = 1; var13_2 < 8; ++var13_2) {
                            v2 = v2;
                            v2[var13_2] = (byte)(var10 << var13_2 * 8 >>> 56);
                        }
                        var12_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                        var19_3 = new String[14];
                        var17_4 = 0;
                        var16_5 = "*M\u001a\u00b6\u00ba\u00027\u00c3F\u00c2\u0080\u0091\u00aaT\u00f3l\u00b2\u00a9\u00ac \u009d\u0082\u00b7C\u00acI\u00ca3\u00f4_D\u001cab\u00e5\u00d5\u0088\u0088\u009c\u00108B:N%T}\u009av'\u00a6\u008elM\u0005i\u0091\u0001V\u0092\u0082L\u001e\u00f5Au\u00cd\u0003\u00e3\u0084\u009bX\u00e0C\u00ea\u008d\u00b4\u00d0\u00aaR\u00e5\u00a9fbJ5b\u009aQ\u0088zzhkbAB\u0010]\u00d7\bcL\u00a0\u00d8L|q\u00a5*=}\u00fa(\u0010/\u00df\u00c8B\u00e5\u0014\u001dYKqTQv\u00e0\u0085\u0013@\u00ba\u00c4\u0093B\u00a9\u00a5E\u0003\u00bd\u009f\u0088\u00c3\u00ee\u008e}\u00f9{}\u00fb\u0006=\u00d2s,c]V\u00b8\u00dc\u00aa\u00f9e\u00e4\u00d4\u0017\u00a5\u00be\u0094\u00ba\u00f7\u00da \u00ca\u00ba\u0080\u00ea\u00f1\u00e8\u00be\u0098a\u00caO\u00be\u0083\u0005\u00fe$\u00f9\u00b1\u00eb\u00c2/z\u0010\u008c\u008b\u00cd\u00e4\u00ca\u00b2\u00ef\u009b\u00fc\u00d1\u00b6\u00f6\u00e7\u00ac\u00cc&\u0010\u001eT<Q\u00bb\u00e0DC\u0013m\u00c1\u00e3\u0005\u0019\u0086y\u0018lR\u0007\u00a5,\u0000\u00a7\u00dd\u00d4#\u00c3\u00d6\u00a4\u001bNE1_\u00df\u000b*\u00c7\u00bf\t\u00105B\u008d\r\u0093\u00bd\u001e\u00c2XD\u00d7\u00c8?\u00bcp28\u00a1h\u0080\u009b\u00df\u00c7\u00b5\u0016P\r\u00a9\u0004r\u0091Bx\u0010r\u00ee\u00a2\u00f7\u00f68\u00ad\u0097^X\u00fd\u009a\u0094\u00a7-j*\u0089A\u00fd\"{\u00ca\u00c2V\u00cd\u000eYl\b\u00aebE]\u001a\u00ce\u0087\u0003] \u00f9\u009b\u00b5F\u00ec\u009f\u00e4 \u00e7Vr\u0085=\u007f\u00dc\u0089\u00fa\u00b8Y\u00a9\u00bc\u00cb\u00d5\u0012\u00ee\u00e4\u0097e\u00ac\u009e\u00f6h@m\u009a;\u0012\u00ab\u0096E\u00c3P\b$w~\u0001D\u0093T\u009e\u0012t\\\u008cd\u00cf\u0082b\u009a\u00f4\u00e4\u00f0\u00ad\u009a\u009d\u0017ux\u0096N\u007fx\u0094R\u00b7\u00b8\u00b5\u00fc\u0005\u00f0\u009dQrhVG\u00afc\u00f9\u00c4\u00eex\u000f\u00a8\u001c\u00a6";
                        var18_6 = "*M\u001a\u00b6\u00ba\u00027\u00c3F\u00c2\u0080\u0091\u00aaT\u00f3l\u00b2\u00a9\u00ac \u009d\u0082\u00b7C\u00acI\u00ca3\u00f4_D\u001cab\u00e5\u00d5\u0088\u0088\u009c\u00108B:N%T}\u009av'\u00a6\u008elM\u0005i\u0091\u0001V\u0092\u0082L\u001e\u00f5Au\u00cd\u0003\u00e3\u0084\u009bX\u00e0C\u00ea\u008d\u00b4\u00d0\u00aaR\u00e5\u00a9fbJ5b\u009aQ\u0088zzhkbAB\u0010]\u00d7\bcL\u00a0\u00d8L|q\u00a5*=}\u00fa(\u0010/\u00df\u00c8B\u00e5\u0014\u001dYKqTQv\u00e0\u0085\u0013@\u00ba\u00c4\u0093B\u00a9\u00a5E\u0003\u00bd\u009f\u0088\u00c3\u00ee\u008e}\u00f9{}\u00fb\u0006=\u00d2s,c]V\u00b8\u00dc\u00aa\u00f9e\u00e4\u00d4\u0017\u00a5\u00be\u0094\u00ba\u00f7\u00da \u00ca\u00ba\u0080\u00ea\u00f1\u00e8\u00be\u0098a\u00caO\u00be\u0083\u0005\u00fe$\u00f9\u00b1\u00eb\u00c2/z\u0010\u008c\u008b\u00cd\u00e4\u00ca\u00b2\u00ef\u009b\u00fc\u00d1\u00b6\u00f6\u00e7\u00ac\u00cc&\u0010\u001eT<Q\u00bb\u00e0DC\u0013m\u00c1\u00e3\u0005\u0019\u0086y\u0018lR\u0007\u00a5,\u0000\u00a7\u00dd\u00d4#\u00c3\u00d6\u00a4\u001bNE1_\u00df\u000b*\u00c7\u00bf\t\u00105B\u008d\r\u0093\u00bd\u001e\u00c2XD\u00d7\u00c8?\u00bcp28\u00a1h\u0080\u009b\u00df\u00c7\u00b5\u0016P\r\u00a9\u0004r\u0091Bx\u0010r\u00ee\u00a2\u00f7\u00f68\u00ad\u0097^X\u00fd\u009a\u0094\u00a7-j*\u0089A\u00fd\"{\u00ca\u00c2V\u00cd\u000eYl\b\u00aebE]\u001a\u00ce\u0087\u0003] \u00f9\u009b\u00b5F\u00ec\u009f\u00e4 \u00e7Vr\u0085=\u007f\u00dc\u0089\u00fa\u00b8Y\u00a9\u00bc\u00cb\u00d5\u0012\u00ee\u00e4\u0097e\u00ac\u009e\u00f6h@m\u009a;\u0012\u00ab\u0096E\u00c3P\b$w~\u0001D\u0093T\u009e\u0012t\\\u008cd\u00cf\u0082b\u009a\u00f4\u00e4\u00f0\u00ad\u009a\u009d\u0017ux\u0096N\u007fx\u0094R\u00b7\u00b8\u00b5\u00fc\u0005\u00f0\u009dQrhVG\u00afc\u00f9\u00c4\u00eex\u000f\u00a8\u001c\u00a6".length();
                        var15_7 = 40;
                        var14_8 = -1;
lbl20:
                        // 2 sources

                        while (true) {
                            v3 = ++var14_8;
                            v4 = var16_5.substring(v3, v3 + var15_7);
                            v5 = -1;
                            break block14;
                            break;
                        }
lbl25:
                        // 1 sources

                        while (true) {
                            var19_3[var17_4++] = IlIlP_.a(var20_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            var16_5 = "1E;p\u00f4\"=L\u0016[9@R\u00f8\u00e9\u00bc\u0018f\u00ab\u00be}\u00d7-\u00b3\"\u00e6p\u0086\u00ec\u0013w\u0089o\u0095[\u0015\u0082|/\u00ba1";
                            var18_6 = "1E;p\u00f4\"=L\u0016[9@R\u00f8\u00e9\u00bc\u0018f\u00ab\u00be}\u00d7-\u00b3\"\u00e6p\u0086\u00ec\u0013w\u0089o\u0095[\u0015\u0082|/\u00ba1".length();
                            var15_7 = 16;
                            var14_8 = -1;
lbl34:
                            // 2 sources

                            while (true) {
                                v6 = ++var14_8;
                                v4 = var16_5.substring(v6, v6 + var15_7);
                                v5 = 0;
                                break block14;
                                break;
                            }
                            break;
                        }
lbl39:
                        // 1 sources

                        while (true) {
                            var19_3[var17_4++] = IlIlP_.a(var20_9).intern();
                            if ((var14_8 += var15_7) < var18_6) {
                                var15_7 = var16_5.charAt(var14_8);
                                ** continue;
                            }
                            break block15;
                            break;
                        }
                    }
                    var20_9 = var12_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                IlIlP_.b = var19_3;
                IlIlP_.c = new String[14];
                var5_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v7 = SecretKeyFactory.getInstance("DES");
                v8 = new byte[8];
                v9 = v8;
                v8[0] = (byte)(var10 >>> 56);
                for (var6_11 = 1; var6_11 < 8; ++var6_11) {
                    v9 = v9;
                    v9[var6_11] = (byte)(var10 << var6_11 * 8 >>> 56);
                }
                break block16;
lbl65:
                // 1 sources

                while (true) {
                    continue;
                    break;
                }
            }
            var5_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
            var7_12 = -5270980160957449347L;
            var9_13 = var5_10.doFinal(new byte[]{(byte)(var7_12 >>> 56), (byte)(var7_12 >>> 48), (byte)(var7_12 >>> 40), (byte)(var7_12 >>> 32), (byte)(var7_12 >>> 24), (byte)(var7_12 >>> 16), (byte)(var7_12 >>> 8), (byte)var7_12});
            ** while (true)
            IlIlP_.e = ((long)var9_13[0] & 255L) << 56 | ((long)var9_13[1] & 255L) << 48 | ((long)var9_13[2] & 255L) << 40 | ((long)var9_13[3] & 255L) << 32 | ((long)var9_13[4] & 255L) << 24 | ((long)var9_13[5] & 255L) << 16 | ((long)var9_13[6] & 255L) << 8 | (long)var9_13[7] & 255L;
            var0_14 = Cipher.getInstance("DES/CBC/NoPadding");
            v10 = SecretKeyFactory.getInstance("DES");
            v11 = new byte[8];
            v12 = v11;
            v11[0] = (byte)(var10 >>> 56);
            for (var1_15 = 1; var1_15 < 8; ++var1_15) {
                v12 = v12;
                v12[var1_15] = (byte)(var10 << var1_15 * 8 >>> 56);
            }
            break block17;
lbl86:
            // 1 sources

            while (true) {
                continue;
                break;
            }
        }
        var0_14.init(2, (Key)v10.generateSecret(new DESKeySpec(v12)), new IvParameterSpec(new byte[8]));
        var2_16 = 309411285486426460L;
        var4_17 = var0_14.doFinal(new byte[]{(byte)(var2_16 >>> 56), (byte)(var2_16 >>> 48), (byte)(var2_16 >>> 40), (byte)(var2_16 >>> 32), (byte)(var2_16 >>> 24), (byte)(var2_16 >>> 16), (byte)(var2_16 >>> 8), (byte)var2_16});
        ** while (true)
        IlIlP_.f = ((long)var4_17[0] & 255L) << 56 | ((long)var4_17[1] & 255L) << 48 | ((long)var4_17[2] & 255L) << 40 | ((long)var4_17[3] & 255L) << 32 | ((long)var4_17[4] & 255L) << 24 | ((long)var4_17[5] & 255L) << 16 | ((long)var4_17[6] & 255L) << 8 | (long)var4_17[7] & 255L;
    }

    private static Throwable a(Throwable throwable) {
        return throwable;
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1463;
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
                throw new RuntimeException("me/nik/coffeeprotect/IlIlP_", exception);
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
            IlIlP_.c[n2] = IlIlP_.a(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return c[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = IlIlP_.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/IlIlP_" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(IlIlP_.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

