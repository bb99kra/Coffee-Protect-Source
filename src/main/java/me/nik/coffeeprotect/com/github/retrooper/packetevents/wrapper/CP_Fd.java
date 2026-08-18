/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_Ol;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.attribute.CP_yo;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.resources.ResourceLocation;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Fh;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_WK;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_f;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_iF;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;

public class CP_Fd
extends PacketWrapper<CP_Fd> {
    private static final List<Map.Entry<String, CP_yo>> CP_s;
    private static final Map<String, CP_yo> CP_UnderScore;
    private static final Map<CP_yo, String> CP_Q;
    private int CP_V;
    private List<CP_WK> CP_X;
    private static final long b;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static transient /* synthetic */ String qJIpZwZYSn = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fd(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fd(int n, List<CP_WK> list) {
        super(CP_AG.UPDATE_ATTRIBUTES);
        this.CP_V = n;
        this.CP_X = list;
    }

    @Override
    public void CP_e() {
        block8: {
            block6: {
                long l = b ^ 0x40D050579BD2L;
                PacketWrapper[] packetWrapperArray = CP_Fh.CP_a();
                try {
                    CP_Fd ilIlFd;
                    block7: {
                        try {
                            try {
                                ilIlFd = this;
                                if (packetWrapperArray == null) break block6;
                                if (!ilIlFd.CP_g.CP_S(ServerVersion.V_1_7_10)) break block7;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw CP_Fd.a(illegalStateException);
                            }
                            this.CP_V = this.CP_W();
                            if (packetWrapperArray != null) break block8;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw CP_Fd.a(illegalStateException);
                        }
                    }
                    ilIlFd = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CP_Fd.a(illegalStateException);
                }
            }
            ilIlFd.CP_V = this.CP_f();
        }
        this.CP_W();
    }

    /*
     * Unable to fully structure code
     */
    protected void CP_W() {
        block34: {
            block33: {
                var1_1 = CP_Fd.b ^ 47706012073174L;
                var3_2 = CP_Fh.CP_a();
                try {
                    v0 = this.CP_g.CP_z(ServerVersion.V_1_17);
                    if (var3_2 == null) break block33;
                    if (v0 != 0) {
                    }
                    ** GOTO lbl14
                }
                catch (IllegalStateException v1) {
                    throw CP_Fd.a(v1);
                }
                var4_3 = this.CP_f();
                try {
                    if (var3_2 != null) break block34;
lbl14:
                    // 2 sources

                    v0 = this.CP_W();
                }
                catch (IllegalStateException v2) {
                    throw CP_Fd.a(v2);
                }
            }
            var4_3 = v0;
        }
        this.CP_X = new ArrayList<CP_WK>(var4_3);
        block26: for (var5_4 = 0; var5_4 < var4_3; ++var5_4) {
            block41: {
                block40: {
                    block36: {
                        block38: {
                            block39: {
                                block37: {
                                    block35: {
                                        try {
                                            v3 = this.CP_g.CP_z(ServerVersion.V_1_20_5);
                                            if (var3_2 == null) break block35;
                                            if (v3) {
                                            }
                                            ** GOTO lbl35
                                        }
                                        catch (IllegalStateException v4) {
                                            throw CP_Fd.a(v4);
                                        }
                                        var6_5 = this.CP_A((BiFunction<ClientVersion, Integer, CP_yo>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, CP_r(me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion int ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/player/ClientVersion;Ljava/lang/Integer;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_yo;)());
                                        try {
                                            try {
                                                if (var3_2 != null) break block36;
lbl35:
                                                // 2 sources

                                                v5 = this;
                                                if (var3_2 == null) break block37;
                                            }
                                            catch (IllegalStateException v6) {
                                                throw CP_Fd.a(v6);
                                            }
                                            v3 = v5.CP_g.CP_z(ServerVersion.V_1_16);
                                        }
                                        catch (IllegalStateException v7) {
                                            throw CP_Fd.a(v7);
                                        }
                                    }
                                    if (!v3) ** GOTO lbl49
                                    var6_5 = CP_Ol.CP_T(this.readIdentifier().toString());
                                    try {
                                        if (var3_2 != null) break block36;
lbl49:
                                        // 2 sources

                                        v5 = this;
                                    }
                                    catch (IllegalStateException v8) {
                                        throw CP_Fd.a(v8);
                                    }
                                }
                                var7_7 = v5.CP_p((int)CP_Fd.d("h", (int)31980, (long)(8601199765337987079L ^ var1_1)));
                                var6_5 = CP_Fd.CP_UnderScore.get(var7_7);
                                try {
                                    v9 = var6_5;
                                    if (var3_2 == null) break block38;
                                    if (v9 != null) break block39;
                                }
                                catch (IllegalStateException v10) {
                                    throw CP_Fd.a(v10);
                                }
                                var6_5 = CP_Ol.CP_T(var7_7);
                            }
                            v9 = var6_5;
                        }
                        try {
                            if (v9 == null) {
                                throw new IllegalStateException((String)CP_Fd.b("q", (int)16664, (long)(5339074855449915434L ^ var1_1)) + var7_7 + (String)CP_Fd.b("q", (int)18181, (long)(9185033439908754998L ^ var1_1)) + this.CP_g.name() + ")");
                            }
                        }
                        catch (IllegalStateException v11) {
                            throw CP_Fd.a(v11);
                        }
                    }
                    var7_6 = this.CP_b();
                    try {
                        v12 = this.CP_g.CP_S(ServerVersion.V_1_7_10);
                        if (var3_2 == null) break block40;
                        if (v12 != 0) {
                        }
                        ** GOTO lbl86
                    }
                    catch (IllegalStateException v13) {
                        throw CP_Fd.a(v13);
                    }
                    var9_8 = this.CP_G();
                    try {
                        if (var3_2 != null) break block41;
lbl86:
                        // 2 sources

                        v12 = this.CP_f();
                    }
                    catch (IllegalStateException v14) {
                        throw CP_Fd.a(v14);
                    }
                }
                var9_8 = v12;
            }
            var10_9 = new ArrayList<CP_iF>(var9_8);
            for (var11_10 = 0; var11_10 < var9_8; ++var11_10) {
                block43: {
                    block42: {
                        try {
                            try {
                                v15 = this;
                                if (var3_2 == null) break block42;
                                v16 = v15.CP_g.CP_z(ServerVersion.V_1_21);
                                if (var3_2 == null) continue block26;
                            }
                            catch (IllegalStateException v17) {
                                throw CP_Fd.a(v17);
                            }
                            if (v16) {
                            }
                            ** GOTO lbl113
                        }
                        catch (IllegalStateException v18) {
                            throw CP_Fd.a(v18);
                        }
                        var12_11 = this.readIdentifier();
                        var13_12 = CP_iF.CP_Z(var12_11);
                        try {
                            if (var3_2 != null) break block43;
lbl113:
                            // 2 sources

                            v15 = this;
                        }
                        catch (IllegalStateException v19) {
                            throw CP_Fd.a(v19);
                        }
                    }
                    var13_12 = v15.CP_v();
                    var12_11 = new ResourceLocation(var13_12.toString());
                }
                var14_13 = this.CP_b();
                var16_14 = this.CP_E();
                var17_15 = CP_f.VALUES[var16_14];
                var10_9.add(new CP_iF(var12_11, var13_12, var14_13, var17_15));
                if (var3_2 != null) continue;
            }
            v16 = this.CP_X.add(new CP_WK(var6_5, var7_6, var10_9));
            if (var3_2 != null) continue;
        }
    }

    @Override
    public void CP_J() {
        PacketWrapper[] packetWrapperArray;
        block46: {
            CP_Fd ilIlFd;
            block44: {
                block43: {
                    CP_Fd ilIlFd2;
                    block41: {
                        long l = b ^ 0x59AD2DBEA57AL;
                        packetWrapperArray = CP_Fh.CP_a();
                        try {
                            block42: {
                                try {
                                    try {
                                        ilIlFd2 = this;
                                        if (packetWrapperArray == null) break block41;
                                        if (!ilIlFd2.CP_g.CP_S(ServerVersion.V_1_7_10)) break block42;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw CP_Fd.a(illegalStateException);
                                    }
                                    this.CP_a(this.CP_V);
                                    if (packetWrapperArray != null) break block43;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw CP_Fd.a(illegalStateException);
                                }
                            }
                            ilIlFd2 = this;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw CP_Fd.a(illegalStateException);
                        }
                    }
                    ilIlFd2.CP_J(this.CP_V);
                }
                try {
                    block45: {
                        try {
                            try {
                                ilIlFd = this;
                                if (packetWrapperArray == null) break block44;
                                if (!ilIlFd.CP_g.CP_z(ServerVersion.V_1_17)) break block45;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw CP_Fd.a(illegalStateException);
                            }
                            this.CP_J(this.CP_X.size());
                            if (packetWrapperArray != null) break block46;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw CP_Fd.a(illegalStateException);
                        }
                    }
                    ilIlFd = this;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CP_Fd.a(illegalStateException);
                }
            }
            ilIlFd.CP_a(this.CP_X.size());
        }
        Iterator<CP_WK> iterator = this.CP_X.iterator();
        block38: while (true) {
            boolean bl = iterator.hasNext();
            block39: while (bl) {
                CP_WK ilIlWK;
                block56: {
                    CP_Fd ilIlFd;
                    block54: {
                        block49: {
                            String string;
                            CP_Fd ilIlFd3;
                            block52: {
                                block53: {
                                    Object object;
                                    block50: {
                                        boolean bl2;
                                        block47: {
                                            ilIlWK = iterator.next();
                                            try {
                                                try {
                                                    block48: {
                                                        try {
                                                            try {
                                                                bl2 = this.CP_g.CP_z(ServerVersion.V_1_20_5);
                                                                if (packetWrapperArray == null) break block47;
                                                                if (!bl2) break block48;
                                                            }
                                                            catch (IllegalStateException illegalStateException) {
                                                                throw CP_Fd.a(illegalStateException);
                                                            }
                                                            this.CP_J(ilIlWK.CP_q().CP_H(this.CP_g.CP_E()));
                                                            if (packetWrapperArray != null) break block49;
                                                        }
                                                        catch (IllegalStateException illegalStateException) {
                                                            throw CP_Fd.a(illegalStateException);
                                                        }
                                                    }
                                                    object = this.CP_g;
                                                    if (packetWrapperArray == null) break block50;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw CP_Fd.a(illegalStateException);
                                                }
                                                bl2 = ((ServerVersion)((Object)object)).CP_z(ServerVersion.V_1_16);
                                            }
                                            catch (IllegalStateException illegalStateException) {
                                                throw CP_Fd.a(illegalStateException);
                                            }
                                        }
                                        try {
                                            block51: {
                                                try {
                                                    if (!bl2) break block51;
                                                    this.writeIdentifier(ilIlWK.CP_q().getName(this.CP_g.CP_E()));
                                                    if (packetWrapperArray != null) break block49;
                                                }
                                                catch (IllegalStateException illegalStateException) {
                                                    throw CP_Fd.a(illegalStateException);
                                                }
                                            }
                                            object = CP_Q.get(ilIlWK.CP_q());
                                        }
                                        catch (IllegalStateException illegalStateException) {
                                            throw CP_Fd.a(illegalStateException);
                                        }
                                    }
                                    String string2 = (String)object;
                                    try {
                                        ilIlFd3 = this;
                                        string = string2;
                                        if (packetWrapperArray == null) break block52;
                                        if (string == null) break block53;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw CP_Fd.a(illegalStateException);
                                    }
                                    string = string2;
                                    break block52;
                                }
                                string = ilIlWK.CP_q().getName().toString();
                            }
                            ilIlFd3.CP_M(string);
                        }
                        try {
                            block55: {
                                try {
                                    try {
                                        this.CP_Y(CP_WK.CP_O(ilIlWK));
                                        ilIlFd = this;
                                        if (packetWrapperArray == null) break block54;
                                        if (!ilIlFd.CP_g.CP_S(ServerVersion.V_1_7_10)) break block55;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw CP_Fd.a(illegalStateException);
                                    }
                                    this.CP_G(CP_WK.CP_r(ilIlWK).size());
                                    if (packetWrapperArray != null) break block56;
                                }
                                catch (IllegalStateException illegalStateException) {
                                    throw CP_Fd.a(illegalStateException);
                                }
                            }
                            ilIlFd = this;
                        }
                        catch (IllegalStateException illegalStateException) {
                            throw CP_Fd.a(illegalStateException);
                        }
                    }
                    ilIlFd.CP_J(CP_WK.CP_r(ilIlWK).size());
                }
                for (CP_iF ilIliF : CP_WK.CP_r(ilIlWK)) {
                    block59: {
                        CP_Fd ilIlFd;
                        block57: {
                            try {
                                ilIlFd = this;
                                if (packetWrapperArray == null) break block57;
                                bl = ilIlFd.CP_g.CP_z(ServerVersion.V_1_21);
                                if (packetWrapperArray == null) continue block39;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw CP_Fd.a(illegalStateException);
                            }
                            try {
                                block58: {
                                    try {
                                        if (!bl) break block58;
                                        this.writeIdentifier(CP_iF.CP_p(ilIliF));
                                        if (packetWrapperArray != null) break block59;
                                    }
                                    catch (IllegalStateException illegalStateException) {
                                        throw CP_Fd.a(illegalStateException);
                                    }
                                }
                                ilIlFd = this;
                            }
                            catch (IllegalStateException illegalStateException) {
                                throw CP_Fd.a(illegalStateException);
                            }
                        }
                        ilIlFd.CP_c(CP_iF.CP_E(ilIliF));
                    }
                    this.CP_Y(CP_iF.CP_u(ilIliF));
                    this.CP_u(CP_iF.CP_UnderScore(ilIliF).ordinal());
                    if (packetWrapperArray != null) continue;
                }
                if (packetWrapperArray != null) continue block38;
            }
            break;
        }
    }

    public void CP_Z(CP_Fd ilIlFd) {
        this.CP_V = ilIlFd.CP_V;
        this.CP_X = ilIlFd.CP_X;
    }

    public int CP_I() {
        return this.CP_V;
    }

    public void CP_Q(int n) {
        this.CP_V = n;
    }

    public List<CP_WK> CP_R() {
        return this.CP_X;
    }

    public void CP_d(List<CP_WK> list) {
        this.CP_X = list;
    }

    private static /* synthetic */ String lambda$static$0(String string, String string2) {
        return string;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block21: {
            block20: {
                block19: {
                    block18: {
                        CP_Fd.b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(-1026886241603183194L, 8358842471282943941L, MethodHandles.lookup().lookupClass()).a(194339902972956L);
                        var20 = CP_Fd.b ^ 73136190695811L;
                        CP_Fd.h = new HashMap<K, V>(13);
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
                        var18_3 = new String[22];
                        var16_4 = 0;
                        var15_5 = "\u0001.H#\u001c\u00b4\u001fyI\u00d8J;w\u00cd\u00dc\u00feKy<\u00c5\u001f\u00de\u008cG\u00e7S\u00ceR,/\t\u00f08CSYWj\u00c2x\u0098\u00b87\u0000FE\u00dc\u000fk\u000f\u00cf\t\u001e\u0000r\"\u0086\u00bb\u00f8\u00ba-\u00b9\u00c1J\u007fq\u00e4s\u00e5\u0000\u001eMV\u0097\u00a0V\u00b8\u00c8\u0082>\u0094\u009b\u00df~\u00dc\u0017\u00e2j\u008d(\u00bf\u008emt\u00d2\u008f\u0083\u0086pO\u00b1\u00f02\u00fb\u00cf\u000b\u0005\u00e2\u00b0y\u00e31-?\u00e4\u00e6.7b\u0098\u001b\u00d2He\u00db\u0002\u00b2\u0015\u00e0\u00bd('\u00f7\u00e03!2d24\u00b3\r;\u00a5\u0012\u0006\u001f\u000b\u00f0R\u00b3\u0012%(\u00ff\u000f6\u00e4\ti\u009e\u0088\u00d5\u00da)AU\u001b\u00ed\u00aa\u00f5(h\u00d5\u00a1l\u00f9\u00e2^\u00bb\u00aaq/\u00af\u0082p8E\u00c6\u00e5\u0010\u0001\u009e,\u001eq\u00b3X|g\u001e\u0096\u00c9z\u00dfoi=\u00f3\r#\u008a(\u00a7\u0002\u008e48f\u001f\u00b5\u00dd5\u008e\"\u0006\u00e0\u00f1\u001f\u00ac\u001a16\u00ba\u00ff#\u00ab\u0015v\u00ec\u00dfOh\u008fA\u00b9\u00b1MZ\u00aa\u000f0\u00da(`f&R\u00c3\u001b\u00c9O\u001d\u00fbI\u00fbc[\u0006D\u009e\u0007H\u0085j\u00e8\u00d3\u008c*^\u00c5\u009eN\u0081\u00db\u00be<k\u0014\"\u00b5<<\u00e6 N\u0087\u00a6\u00de\u00b6 \u00c3\u00a7\u00b6\u00b9J\u00fc\u008b\u00d3\u00f2\b\u0005\u00f2\u0016j\u001f\u00f1\u00b0>\u0090g\u00c1\u008d\\\u0011\u00d3P\u0018\u00afjH\u00ec\u007f)\u00ae\u000eGn\u0096R\u00edh\u00b9\u00f4T\u0094\u0005\u00e7Zc\u00cfl 7\u00bc\u00fe\u00fe\u00da%r\u001d\"\u0093\u0097.\u009cL\u00c1B\u0003\u0089Uv2\u00cd\u00b4\"^\u0080i\u001f7\u00aa\u00ba*\u0018\u001b\u00c4\u00e0\u00e0l\u00d8\u00f3\u0094\u00c6\u00a0`\"\u009c\u00b7\u00f2\u00e7Q\u0012y\fL\u00f4\u00ff\u0018(\u00ccZ/\u00ac^(\"\u00efO2\u0005\u00d0`\u00d7\u0012WZ\u00ac\u00e3eb\n\u00c3\u00aaC\u00f7\\~\u00b6+a\u0019\b\u0002Ez\u008b\u00ab\r\u00ab0\u009d'+j)\u00a0\u00bf\u00e9i\u00ecLH\u00eb0\u00fe\u00c8\u00e4\u008b{\u00e2\u00fe9\u00f1\u00ce\u00bb\u00e7\u00ad>\u009b\u00b5\u001a\u00ca\u00f0K\u00e6\u00a0 \u009b\u00bc\u00a2\u00f6\u00b6|\u00ea\u00cc.\u00b88 V#\u00c2\u0013\u0013\u009fe\\\u00bbsxe\u0080_\u00e1\r\u0010\u00b6\u0018\u00a5\u008c\u009a\u00bes\u00da:Z\u00f1du{\u009f\u0018nil\u00b6\u00e4\u008d)X\u00eb\u00c7#\u008cAP\u00b9\u00d3o\u0005{\u007f\u00ca6\u00a3=(\u0097$q[VY\u0001\u0001\f\u008f\u00f1\"\u0000\u000b\u00bc}\u00df.\u00bb\u00d5U s\u0098:S!\u00ec7\u00b66\u00fd\u00e4\u0011\u00c5\u0012cW#\u00ac8X\u0006\b\u0097MHax\u00b6L\"!H[\u0082G\u00aa\u00d0\u00a0^\u00c9\u00d1\u0083\u008f\u00ff\u00fa$\u00b0\u0089\u00a5\u001b\u00b7\u0005\u00a1\u00b08O\u00e27\u00e1M\u00e0\u0012f\u0006\u000f\u00c7j4\u00da\u0096m,\u00c8k1 \u00a4\u00c9\u00fd\u00bd>\b}\u0084\u00d6\u0000\u008de\u00a5\u0018Y\u0096@ME\u00car\u0092\u008f\u0015\u00dfiFO\t\bQV8\u00c6\u0085\u00b2\u00da;\u00bb'!\u00d7e\u00c4\u0093d\u008e8F\u0002\u001e\u0086\u00ad\u00f4\u00ec\u00b1\u000b\u00bf\u008b\u00a0\u00aau9Lj\u00c8oYu\u0000\u008d\u0004\u00bc-X\u00fb\u0010@\u00b5\u00da\u001dV\u00c0\u00c4\u00977\u00d2'n0I\u00b4\u0010\b@\u00c8\u00ff9\tFr\u00c5\u009a*\u00da\u00a5S\u007f\u00fcL\u00ed\u00f6\u00e5\u00d4+\u00056\u00f3dW\u00b0:c4\u00ba sS&\u001aB\u0087\u00bcB\u00d5Xbr";
                        var17_6 = "\u0001.H#\u001c\u00b4\u001fyI\u00d8J;w\u00cd\u00dc\u00feKy<\u00c5\u001f\u00de\u008cG\u00e7S\u00ceR,/\t\u00f08CSYWj\u00c2x\u0098\u00b87\u0000FE\u00dc\u000fk\u000f\u00cf\t\u001e\u0000r\"\u0086\u00bb\u00f8\u00ba-\u00b9\u00c1J\u007fq\u00e4s\u00e5\u0000\u001eMV\u0097\u00a0V\u00b8\u00c8\u0082>\u0094\u009b\u00df~\u00dc\u0017\u00e2j\u008d(\u00bf\u008emt\u00d2\u008f\u0083\u0086pO\u00b1\u00f02\u00fb\u00cf\u000b\u0005\u00e2\u00b0y\u00e31-?\u00e4\u00e6.7b\u0098\u001b\u00d2He\u00db\u0002\u00b2\u0015\u00e0\u00bd('\u00f7\u00e03!2d24\u00b3\r;\u00a5\u0012\u0006\u001f\u000b\u00f0R\u00b3\u0012%(\u00ff\u000f6\u00e4\ti\u009e\u0088\u00d5\u00da)AU\u001b\u00ed\u00aa\u00f5(h\u00d5\u00a1l\u00f9\u00e2^\u00bb\u00aaq/\u00af\u0082p8E\u00c6\u00e5\u0010\u0001\u009e,\u001eq\u00b3X|g\u001e\u0096\u00c9z\u00dfoi=\u00f3\r#\u008a(\u00a7\u0002\u008e48f\u001f\u00b5\u00dd5\u008e\"\u0006\u00e0\u00f1\u001f\u00ac\u001a16\u00ba\u00ff#\u00ab\u0015v\u00ec\u00dfOh\u008fA\u00b9\u00b1MZ\u00aa\u000f0\u00da(`f&R\u00c3\u001b\u00c9O\u001d\u00fbI\u00fbc[\u0006D\u009e\u0007H\u0085j\u00e8\u00d3\u008c*^\u00c5\u009eN\u0081\u00db\u00be<k\u0014\"\u00b5<<\u00e6 N\u0087\u00a6\u00de\u00b6 \u00c3\u00a7\u00b6\u00b9J\u00fc\u008b\u00d3\u00f2\b\u0005\u00f2\u0016j\u001f\u00f1\u00b0>\u0090g\u00c1\u008d\\\u0011\u00d3P\u0018\u00afjH\u00ec\u007f)\u00ae\u000eGn\u0096R\u00edh\u00b9\u00f4T\u0094\u0005\u00e7Zc\u00cfl 7\u00bc\u00fe\u00fe\u00da%r\u001d\"\u0093\u0097.\u009cL\u00c1B\u0003\u0089Uv2\u00cd\u00b4\"^\u0080i\u001f7\u00aa\u00ba*\u0018\u001b\u00c4\u00e0\u00e0l\u00d8\u00f3\u0094\u00c6\u00a0`\"\u009c\u00b7\u00f2\u00e7Q\u0012y\fL\u00f4\u00ff\u0018(\u00ccZ/\u00ac^(\"\u00efO2\u0005\u00d0`\u00d7\u0012WZ\u00ac\u00e3eb\n\u00c3\u00aaC\u00f7\\~\u00b6+a\u0019\b\u0002Ez\u008b\u00ab\r\u00ab0\u009d'+j)\u00a0\u00bf\u00e9i\u00ecLH\u00eb0\u00fe\u00c8\u00e4\u008b{\u00e2\u00fe9\u00f1\u00ce\u00bb\u00e7\u00ad>\u009b\u00b5\u001a\u00ca\u00f0K\u00e6\u00a0 \u009b\u00bc\u00a2\u00f6\u00b6|\u00ea\u00cc.\u00b88 V#\u00c2\u0013\u0013\u009fe\\\u00bbsxe\u0080_\u00e1\r\u0010\u00b6\u0018\u00a5\u008c\u009a\u00bes\u00da:Z\u00f1du{\u009f\u0018nil\u00b6\u00e4\u008d)X\u00eb\u00c7#\u008cAP\u00b9\u00d3o\u0005{\u007f\u00ca6\u00a3=(\u0097$q[VY\u0001\u0001\f\u008f\u00f1\"\u0000\u000b\u00bc}\u00df.\u00bb\u00d5U s\u0098:S!\u00ec7\u00b66\u00fd\u00e4\u0011\u00c5\u0012cW#\u00ac8X\u0006\b\u0097MHax\u00b6L\"!H[\u0082G\u00aa\u00d0\u00a0^\u00c9\u00d1\u0083\u008f\u00ff\u00fa$\u00b0\u0089\u00a5\u001b\u00b7\u0005\u00a1\u00b08O\u00e27\u00e1M\u00e0\u0012f\u0006\u000f\u00c7j4\u00da\u0096m,\u00c8k1 \u00a4\u00c9\u00fd\u00bd>\b}\u0084\u00d6\u0000\u008de\u00a5\u0018Y\u0096@ME\u00car\u0092\u008f\u0015\u00dfiFO\t\bQV8\u00c6\u0085\u00b2\u00da;\u00bb'!\u00d7e\u00c4\u0093d\u008e8F\u0002\u001e\u0086\u00ad\u00f4\u00ec\u00b1\u000b\u00bf\u008b\u00a0\u00aau9Lj\u00c8oYu\u0000\u008d\u0004\u00bc-X\u00fb\u0010@\u00b5\u00da\u001dV\u00c0\u00c4\u00977\u00d2'n0I\u00b4\u0010\b@\u00c8\u00ff9\tFr\u00c5\u009a*\u00da\u00a5S\u007f\u00fcL\u00ed\u00f6\u00e5\u00d4+\u00056\u00f3dW\u00b0:c4\u00ba sS&\u001aB\u0087\u00bcB\u00d5Xbr".length();
                        var14_7 = 32;
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
                            var18_3[var16_4++] = CP_Fd.b(var19_9).intern();
                            if ((var13_8 += var14_7) < var17_6) {
                                var14_7 = var15_5.charAt(var13_8);
                                ** continue;
                            }
                            var15_5 = "\f\u00be\u00ea\b\u0019\u00cf\u00bc\u007f\u009d\u0098\u00c3.u3\u00b1\u00f4<oE\b\u00cc\u00c2\u00b6\u00ba\u00b1@0\u00ab\u000f\u0091$\u00b5-\u00e4\u0090\u00871\u0002\u00fc\u0013\u00e2\u0005\u00cc\u00d8\u0006\u00f5\u0001:(\u00b8\u008b\u00cfR.>\u00eb\u00e9*M\u00ccg\u00e8\u00dc\u00c1\u0080n\u00a0a\u00c0\u001d\u0000\u0004\u00a8\u00d5M\u00ca\u008b\u00ce\u00f1\u00cd\u00c7\u009f\u00b8\u00b6\u008f\u00aaZ\u001b\u00a7";
                            var17_6 = "\f\u00be\u00ea\b\u0019\u00cf\u00bc\u007f\u009d\u0098\u00c3.u3\u00b1\u00f4<oE\b\u00cc\u00c2\u00b6\u00ba\u00b1@0\u00ab\u000f\u0091$\u00b5-\u00e4\u0090\u00871\u0002\u00fc\u0013\u00e2\u0005\u00cc\u00d8\u0006\u00f5\u0001:(\u00b8\u008b\u00cfR.>\u00eb\u00e9*M\u00ccg\u00e8\u00dc\u00c1\u0080n\u00a0a\u00c0\u001d\u0000\u0004\u00a8\u00d5M\u00ca\u008b\u00ce\u00f1\u00cd\u00c7\u009f\u00b8\u00b6\u008f\u00aaZ\u001b\u00a7".length();
                            var14_7 = 48;
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
                            var18_3[var16_4++] = CP_Fd.b(var19_9).intern();
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
                CP_Fd.c = var18_3;
                CP_Fd.g = new String[22];
                CP_Fd.n = new HashMap<K, V>(13);
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
                var6_12 = new long[16];
                var3_13 = 0;
                var4_14 = "\u0085\u00e5\u00e7\u00c00a\u00f1\u0097c\u009a\u00a6\u00f5\u00c4\u00ab\"\u00fe]\u00b1\u001f\u00e1\u00ceg\u00e6\u0005\u00f2\u00fa\\\u00aahrM\u00b7\u00ac\u00ba\u00b2o\u00c3\u00c3\u00ea}\u00ffdV\u0000>\n+\u00c7E\u00e9\u00ce\u0093Q\u0010W\u00148\u0081\u0018\u009fb\u001f\u00b6\u00fc0\u00ab\u00a4\u00b6{)\u00bd\u00cbU\u008f\u00ab\u009cj\u0082\u008d\u00bf\t\u00aez\u000e\u00cb\u00bc\u00d7\u00cd\u009e6\u00ea\u00b9\u00e9\u0010\u001el\u0095C\u00bc\u001e\u00a7c\u00e8jvH\"\u00dc<K8\u009b";
                var5_15 = "\u0085\u00e5\u00e7\u00c00a\u00f1\u0097c\u009a\u00a6\u00f5\u00c4\u00ab\"\u00fe]\u00b1\u001f\u00e1\u00ceg\u00e6\u0005\u00f2\u00fa\\\u00aahrM\u00b7\u00ac\u00ba\u00b2o\u00c3\u00c3\u00ea}\u00ffdV\u0000>\n+\u00c7E\u00e9\u00ce\u0093Q\u0010W\u00148\u0081\u0018\u009fb\u001f\u00b6\u00fc0\u00ab\u00a4\u00b6{)\u00bd\u00cbU\u008f\u00ab\u009cj\u0082\u008d\u00bf\t\u00aez\u000e\u00cb\u00bc\u00d7\u00cd\u009e6\u00ea\u00b9\u00e9\u0010\u001el\u0095C\u00bc\u001e\u00a7c\u00e8jvH\"\u00dc<K8\u009b".length();
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
                    var4_14 = "\u00ab\u00a34\"\u0095\u00f1\u00a9}\u00d1\u00cd\\pX\u00edWV";
                    var5_15 = "\u00ab\u00a34\"\u0095\u00f1\u00a9}\u00d1\u00cd\\pX\u00edWV".length();
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
        CP_Fd.l = var6_12;
        CP_Fd.m = new Integer[16];
        v15 = new AbstractMap.SimpleEntry[CP_Fd.d("h", (int)19942, (long)(5672185301544893526L ^ var20))];
        v15[0] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)21271, (long)(8015315070681282415L ^ var20)), CP_Ol.CP_DT);
        v15[1] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)12710, (long)(5900043193264936408L ^ var20)), CP_Ol.CP_DT);
        v15[2] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)11209, (long)(4173173648521891756L ^ var20)), CP_Ol.CP_Dw);
        v15[3] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)6645, (long)(5281141478501727619L ^ var20)), CP_Ol.CP_Dw);
        v15[4] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)17276, (long)(4300713150634026760L ^ var20)), CP_Ol.CP_v);
        v15[5] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)15188, (long)(3018362568329666350L ^ var20)), CP_Ol.CP_v);
        v15[CP_Fd.d("h", (int)1739, (long)(467947472831166320L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)30628, (long)(5293833316481323968L ^ var20)), CP_Ol.CP_Dp);
        v15[CP_Fd.d("h", (int)26998, (long)(8833799717139536073L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)17941, (long)(1785448341080105573L ^ var20)), CP_Ol.CP_Dp);
        v15[CP_Fd.d("h", (int)31797, (long)(6494223252468452739L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)22626, (long)(1998132487887485977L ^ var20)), CP_Ol.CP_M);
        v15[CP_Fd.d("h", (int)16323, (long)(6241543418425151090L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)29060, (long)(744743727208682993L ^ var20)), CP_Ol.CP_M);
        v15[CP_Fd.d("h", (int)11309, (long)(6802992684753067423L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)9317, (long)(7096340254747066391L ^ var20)), CP_Ol.CP_G);
        v15[CP_Fd.d("h", (int)18881, (long)(646474807598610548L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)13761, (long)(7773649176565125566L ^ var20)), CP_Ol.CP_G);
        v15[CP_Fd.d("h", (int)16742, (long)(3408308448169750750L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)7432, (long)(4001754954220059003L ^ var20)), CP_Ol.CP_U);
        v15[CP_Fd.d("h", (int)32222, (long)(5364606383197244519L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)24194, (long)(8350401144729631487L ^ var20)), CP_Ol.CP_U);
        v15[CP_Fd.d("h", (int)13204, (long)(6788188317332800041L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)22541, (long)(296968605836377201L ^ var20)), CP_Ol.CP_W);
        v15[CP_Fd.d("h", (int)4967, (long)(6646039831382303453L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)18884, (long)(2243081373315689895L ^ var20)), CP_Ol.CP_De);
        v15[CP_Fd.d("h", (int)7385, (long)(3138595121077890410L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)11326, (long)(1945870320136620111L ^ var20)), CP_Ol.CP_l);
        v15[CP_Fd.d("h", (int)20258, (long)(6560906088422440598L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)20923, (long)(867941026831889881L ^ var20)), CP_Ol.CP_o);
        v15[CP_Fd.d("h", (int)8577, (long)(6032087780747448374L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)1480, (long)(1883245057202659761L ^ var20)), CP_Ol.CP_I);
        v15[CP_Fd.d("h", (int)1722, (long)(2880786698271340294L ^ var20))] = new AbstractMap.SimpleEntry<CallSite, CP_yo>(CP_Fd.b("q", (int)6993, (long)(1891331538794757926L ^ var20)), CP_Ol.CP_z);
        CP_Fd.CP_s = Collections.unmodifiableList(Arrays.asList(v15));
        CP_Fd.CP_UnderScore = CP_Fd.CP_s.stream().collect(Collectors.toMap((Function<Map.Entry, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getKey(), (Ljava/util/Map$Entry;)Ljava/lang/String;)(), (Function<Map.Entry, CP_yo>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getValue(), (Ljava/util/Map$Entry;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_yo;)()));
        CP_Fd.CP_Q = CP_Fd.CP_s.stream().collect(Collectors.toMap((Function<Map.Entry, CP_yo>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getValue(), (Ljava/util/Map$Entry;)Lme/nik/coffeeprotect/com/github/retrooper/packetevents/protocol/attribute/CP_yo;)(), (Function<Map.Entry, String>)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, getKey(), (Ljava/util/Map$Entry;)Ljava/lang/String;)(), (BinaryOperator)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;, lambda$static$0(java.lang.String java.lang.String ), (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;)()));
    }

    private static IllegalStateException a(IllegalStateException illegalStateException) {
        return illegalStateException;
    }

    private static String b(byte[] byArray) {
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

    private static String b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x1B56;
        if (g[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])h.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fd", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = c[n2].getBytes("ISO-8859-1");
            CP_Fd.g[n2] = CP_Fd.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Fd.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(String.class, string2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return string2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0xE91;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = CP_Fd.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])CP_Fd.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    CP_Fd.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fd", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Fd.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Fd.d(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite d(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fd" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Fd.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Fd.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

