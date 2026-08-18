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
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.item.CP_Cg;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JH;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ow;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Q9;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Jv
extends PacketWrapper<CP_Jv> {
    @Deprecated
    public static final int CP_r;
    private static final int CP_E;
    private static final int CP_a;
    private static final int CP_l;
    private static final int CP_J;
    private static final int CP_p;
    private static final int CP_Z;
    private int CP_e;
    @Nullable
    private List<String> CP_UnderScore;
    @Nullable
    private String CP_h;
    @Nullable
    private CP_Cg CP_u;
    @Nullable
    private Boolean CP_z;
    private static final long b;
    private static final String[] c;
    private static final String[] g;
    private static final Map h;
    private static final long[] l;
    private static final Integer[] m;
    private static final Map n;
    private static transient /* synthetic */ String TmDvnfQHxO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Jv(PacketReceiveEvent packetReceiveEvent) {
        super(packetReceiveEvent);
    }

    public CP_Jv(int n, List<String> list, @Nullable String string) {
        super(CP_nN.EDIT_BOOK);
        this.CP_e = n;
        this.CP_UnderScore = list;
        this.CP_h = string;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void CP_e() {
        block25: {
            block17: {
                block24: {
                    block22: {
                        block23: {
                            block20: {
                                block21: {
                                    block18: {
                                        block19: {
                                            var1_1 = CP_Jv.b ^ 65563443880364L;
                                            var3_2 = CP_JH.CP_w();
                                            try {
                                                v0 = this;
                                                if (var3_2 != null) break block17;
                                                if (v0.CP_g.CP_z(ServerVersion.V_1_17_1)) {
                                                }
                                                ** GOTO lbl70
                                            }
                                            catch (IllegalStateException v1) {
                                                throw CP_Jv.a(v1);
                                            }
                                            var4_3 = this.CP_g.CP_z(ServerVersion.V_1_21_2);
                                            try {
                                                v2 /* !! */  = var4_3;
                                                if (var3_2 != null) break block18;
                                                if (v2 /* !! */  == 0) break block19;
                                            }
                                            catch (IllegalStateException v3) {
                                                throw CP_Jv.a(v3);
                                            }
                                            v2 /* !! */  = CP_Jv.d("e", (int)20581, (long)(6384859515093596321L ^ var1_1));
                                            break block18;
                                        }
                                        v2 /* !! */  = CP_Jv.d("e", (int)23165, (long)(7311888119524438708L ^ var1_1));
                                    }
                                    var5_4 = v2 /* !! */ ;
                                    try {
                                        v4 /* !! */  = var4_3;
                                        if (var3_2 != null) break block20;
                                        if (v4 /* !! */  == 0) break block21;
                                    }
                                    catch (IllegalStateException v5) {
                                        throw CP_Jv.a(v5);
                                    }
                                    v4 /* !! */  = CP_Jv.d("e", (int)26884, (long)(4106832612759110082L ^ var1_1));
                                    break block20;
                                }
                                v4 /* !! */  = CP_Jv.d("e", (int)3928, (long)(3215167184477972373L ^ var1_1));
                            }
                            var6_5 = v4 /* !! */ ;
                            this.CP_e = this.CP_f();
                            var7_6 = this.CP_f();
                            try {
                                try {
                                    v6 = var7_6;
                                    if (var3_2 != null) break block22;
                                    if (v6 <= var5_4) break block23;
                                }
                                catch (IllegalStateException v7) {
                                    throw CP_Jv.a(v7);
                                }
                                throw new IllegalStateException((String)CP_Jv.b("n", (int)27746, (long)(1441980802382301226L ^ var1_1)) + var7_6 + (String)CP_Jv.b("n", (int)4275, (long)(5020122295118066938L ^ var1_1)) + var5_4);
                            }
                            catch (IllegalStateException v8) {
                                throw CP_Jv.a(v8);
                            }
                        }
                        this.CP_UnderScore = new ArrayList<String>(var7_6);
                        v6 = var8_7 = 0;
                    }
                    while (var8_7 < var7_6) {
                        try {
                            this.CP_UnderScore.add(this.CP_p(var6_5));
                            ++var8_7;
                            if (var3_2 == null) {
                                if (var3_2 == null) continue;
                                break;
                            }
                            break block24;
                        }
                        catch (IllegalStateException v9) {
                            throw CP_Jv.a(v9);
                        }
                    }
                    this.CP_h = (String)this.CP_N((CP_Q9)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;)Ljava/lang/Object;, lambda$read$0(boolean me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;)Ljava/lang/String;)((boolean)var4_3));
                }
                try {
                    if (var3_2 == null) break block25;
lbl70:
                    // 2 sources

                    this.CP_u = this.CP_k();
                    this.CP_z = this.CP_K();
                    v0 = this;
                }
                catch (IllegalStateException v10) {
                    throw CP_Jv.a(v10);
                }
            }
            v0.CP_e = this.CP_f();
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void CP_J() {
        block15: {
            block11: {
                block14: {
                    block12: {
                        block13: {
                            var1_1 = CP_Jv.b ^ 38329632513796L;
                            var3_2 = CP_JH.CP_w();
                            try {
                                v0 = this;
                                if (var3_2 != null) break block11;
                                if (v0.CP_g.CP_z(ServerVersion.V_1_17_1)) {
                                }
                                ** GOTO lbl40
                            }
                            catch (IllegalStateException v1) {
                                throw CP_Jv.a(v1);
                            }
                            var4_3 = this.CP_g.CP_z(ServerVersion.V_1_21_2);
                            try {
                                v2 /* !! */  = var4_3;
                                if (var3_2 != null) break block12;
                                if (v2 /* !! */  == 0) break block13;
                            }
                            catch (IllegalStateException v3) {
                                throw CP_Jv.a(v3);
                            }
                            v2 /* !! */  = CP_Jv.d("e", (int)8649, (long)(3155053905463146403L ^ var1_1));
                            break block12;
                        }
                        v2 /* !! */  = CP_Jv.d("e", (int)3081, (long)(4975201945875208801L ^ var1_1));
                    }
                    var5_4 = v2 /* !! */ ;
                    this.CP_J(this.CP_e);
                    this.CP_J(this.CP_UnderScore.size());
                    for (String var7_6 : this.CP_UnderScore) {
                        try {
                            this.CP_m(var7_6, var5_4);
                            if (var3_2 == null) {
                                if (var3_2 == null) continue;
                                break;
                            }
                            break block14;
                        }
                        catch (IllegalStateException v4) {
                            throw CP_Jv.a(v4);
                        }
                    }
                    this.CP_I(this.CP_h, (CP_Ow)LambdaMetafactory.metafactory(null, null, null, (Ljava/lang/Object;Ljava/lang/Object;)V, lambda$write$1(boolean me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper java.lang.String ), (Lme/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/PacketWrapper;Ljava/lang/String;)V)((boolean)var4_3));
                }
                try {
                    if (var3_2 == null) break block15;
lbl40:
                    // 2 sources

                    this.CP_j(this.CP_u);
                    this.CP_a(this.CP_z);
                    v0 = this;
                }
                catch (IllegalStateException v5) {
                    throw CP_Jv.a(v5);
                }
            }
            v0.CP_J(this.CP_e);
        }
    }

    public void CP_t(CP_Jv ilIlJv) {
        this.CP_e = ilIlJv.CP_e;
        this.CP_UnderScore = ilIlJv.CP_UnderScore;
        this.CP_h = ilIlJv.CP_h;
        this.CP_u = ilIlJv.CP_u;
        this.CP_z = ilIlJv.CP_z;
    }

    public int CP_g() {
        return this.CP_e;
    }

    public void CP_F(int n) {
        this.CP_e = n;
    }

    @Nullable
    public List<String> CP_k() {
        return this.CP_UnderScore;
    }

    public void CP_o(List<String> list) {
        this.CP_UnderScore = list;
    }

    @Nullable
    public String CP_C() {
        return this.CP_h;
    }

    public void CP_UnderScore(@Nullable String string) {
        this.CP_h = string;
    }

    @Nullable
    public CP_Cg CP_H() {
        return this.CP_u;
    }

    public void CP_C(@Nullable CP_Cg ilIlCg) {
        this.CP_u = ilIlCg;
    }

    @Nullable
    public Boolean CP_z() {
        return this.CP_z;
    }

    public void CP_K(@Nullable Boolean bl) {
        this.CP_z = bl;
    }

    private static /* synthetic */ void lambda$write$1(boolean bl, PacketWrapper packetWrapper, String string) {
        Object object;
        block2: {
            long l;
            block3: {
                l = b ^ 0x7EAB0BEF1B8BL;
                String string2 = CP_JH.CP_w();
                try {
                    object = bl;
                    if (string2 != null) break block2;
                    if (object == 0) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CP_Jv.a(illegalStateException);
                }
                object = CP_Jv.d("e", (int)21474, (long)(0x2FAC43C8B084410BL ^ l));
                break block2;
            }
            object = CP_Jv.d("e", (int)14897, (long)(0x548E147F5D8FA8C2L ^ l));
        }
        int n = object;
        packetWrapper.CP_m(string, n);
    }

    private static /* synthetic */ String lambda$read$0(boolean bl, PacketWrapper packetWrapper) {
        Object object;
        block2: {
            long l;
            block3: {
                l = b ^ 0xEF9656A0714L;
                String string = CP_JH.CP_w();
                try {
                    object = bl;
                    if (string != null) break block2;
                    if (object == 0) break block3;
                }
                catch (IllegalStateException illegalStateException) {
                    throw CP_Jv.a(illegalStateException);
                }
                object = CP_Jv.d("e", (int)6758, (long)(0x1C7198A760EF941FL ^ l));
                break block2;
            }
            object = CP_Jv.d("e", (int)19257, (long)(0x69709BC3ED15C549L ^ l));
        }
        int n = object;
        return packetWrapper.CP_p(n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block14: {
            block13: {
                block12: {
                    CP_Jv.b = CP_s.a(-1716625933689697064L, 5026938679629703780L, MethodHandles.lookup().lookupClass()).a(6662508795432L);
                    CP_Jv.h = new HashMap<K, V>(13);
                    var11 = CP_Jv.b ^ 50397158341694L;
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
                    var20_3 = new String[2];
                    var18_4 = 0;
                    var17_5 = "\u00a9\u00f0\u00b9\u0080\b5h\u009c4\u00d4\r\u00b6V\u00a7\u00f4\u00cdJ\u0001c\u007f8\u008e\u00f3_\u00e9+\u009c`\u0002\n\u00d990Q\u00a4kvtZ\u008c\u00dc\u0004\u00a7Lk8\u0019\u00cc\u00a8\u001fo6\u00f2t\u00917z\u00e7}\u0017\u00e7\u00ca\u00a8\u0095j\u00df\u00b7\u0015(K|\u00c7\u00c5Oo\u0011\u0086~>\u0001j";
                    var19_6 = "\u00a9\u00f0\u00b9\u0080\b5h\u009c4\u00d4\r\u00b6V\u00a7\u00f4\u00cdJ\u0001c\u007f8\u008e\u00f3_\u00e9+\u009c`\u0002\n\u00d990Q\u00a4kvtZ\u008c\u00dc\u0004\u00a7Lk8\u0019\u00cc\u00a8\u001fo6\u00f2t\u00917z\u00e7}\u0017\u00e7\u00ca\u00a8\u0095j\u00df\u00b7\u0015(K|\u00c7\u00c5Oo\u0011\u0086~>\u0001j".length();
                    var16_7 = 32;
                    var15_8 = -1;
lbl20:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
lbl22:
                    // 1 sources

                    while (true) {
                        var20_3[var18_4++] = CP_Jv.b(var21_9).intern();
                        if ((var15_8 += var16_7) < var19_6) {
                            var16_7 = var17_5.charAt(var15_8);
                            ** continue;
                        }
                        break block12;
                        break;
                    }
                    v3 = ++var15_8;
                    var21_9 = var13_1.doFinal(var17_5.substring(v3, v3 + var16_7).getBytes("ISO-8859-1"));
                    ** while (true)
                }
                CP_Jv.c = var20_3;
                CP_Jv.g = new String[2];
                CP_Jv.n = new HashMap<K, V>(13);
                var0_10 = Cipher.getInstance("DES/CBC/NoPadding");
                v4 = SecretKeyFactory.getInstance("DES");
                v5 = new byte[8];
                v6 = v5;
                v5[0] = (byte)(var11 >>> 56);
                for (var1_11 = 1; var1_11 < 8; ++var1_11) {
                    v6 = v6;
                    v6[var1_11] = (byte)(var11 << var1_11 * 8 >>> 56);
                }
                var0_10.init(2, (Key)v4.generateSecret(new DESKeySpec(v6)), new IvParameterSpec(new byte[8]));
                var6_12 = new long[17];
                var3_13 = 0;
                var4_14 = "\u00b5\u00fb\u007f\u00bb\u00e4\u00e1\u00b7\u00ea7H\u00e4\u008b'\u009d\u00ca\u0093\u0087\u0082B\u00ff\u009a/\u0099\u0083\u00d6`%\f\u0090\u008a\u0080?\u0099\u00a6\u00b5RM\u00d9)A{\b\u008a\u00cdi\u00ec\u00f41\u0000\u00ceV\u00f9G\u00e7Rd\u00d7\u008a\u00f5\u00e6^,\u000b\u00ec\u00ceY\u00ae6\u00cc\u00d4\u00ad\u0082\u00e7\u00b2\u00c6U\u00ec\u001cwQn;\u008b\u00c1\u0015'<=\u0096\u00eeP\u00f4\u00ee\u00f1A\u00fb\u00d6\u00b0*\u00dd\u0014\fZ\u00c5A\u0090sp\u0093^F\u00f5\u00d6r\u00bc\u0010\u00b1\u00ce\u00da\u00a3";
                var5_15 = "\u00b5\u00fb\u007f\u00bb\u00e4\u00e1\u00b7\u00ea7H\u00e4\u008b'\u009d\u00ca\u0093\u0087\u0082B\u00ff\u009a/\u0099\u0083\u00d6`%\f\u0090\u008a\u0080?\u0099\u00a6\u00b5RM\u00d9)A{\b\u008a\u00cdi\u00ec\u00f41\u0000\u00ceV\u00f9G\u00e7Rd\u00d7\u008a\u00f5\u00e6^,\u000b\u00ec\u00ceY\u00ae6\u00cc\u00d4\u00ad\u0082\u00e7\u00b2\u00c6U\u00ec\u001cwQn;\u008b\u00c1\u0015'<=\u0096\u00eeP\u00f4\u00ee\u00f1A\u00fb\u00d6\u00b0*\u00dd\u0014\fZ\u00c5A\u0090sp\u0093^F\u00f5\u00d6r\u00bc\u0010\u00b1\u00ce\u00da\u00a3".length();
                var2_16 = 0;
                while (true) {
                    var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                    v7 = var6_12;
                    v8 = var3_13++;
                    v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                    v10 = -1;
                    break block13;
                    break;
                }
lbl58:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    var4_14 = "\u00ff\u00da\r[\u00ff(]\u0080\u00f4y\u00b4\t\u00af\u00bb\u0094\u000b";
                    var5_15 = "\u00ff\u00da\r[\u00ff(]\u0080\u00f4y\u00b4\t\u00af\u00bb\u0094\u000b".length();
                    var2_16 = 0;
                    while (true) {
                        var7_17 = var4_14.substring(var2_16, var2_16 += 8).getBytes("ISO-8859-1");
                        v7 = var6_12;
                        v8 = var3_13++;
                        v9 = ((long)var7_17[0] & 255L) << 56 | ((long)var7_17[1] & 255L) << 48 | ((long)var7_17[2] & 255L) << 40 | ((long)var7_17[3] & 255L) << 32 | ((long)var7_17[4] & 255L) << 24 | ((long)var7_17[5] & 255L) << 16 | ((long)var7_17[6] & 255L) << 8 | (long)var7_17[7] & 255L;
                        v10 = 0;
                        break block13;
                        break;
                    }
                    break;
                }
lbl71:
                // 1 sources

                while (true) {
                    v7[v8] = v11;
                    if (var2_16 < var5_15) ** continue;
                    break block14;
                    break;
                }
            }
            var8_18 = v9;
            var10_19 = var0_10.doFinal(new byte[]{(byte)(var8_18 >>> 56), (byte)(var8_18 >>> 48), (byte)(var8_18 >>> 40), (byte)(var8_18 >>> 32), (byte)(var8_18 >>> 24), (byte)(var8_18 >>> 16), (byte)(var8_18 >>> 8), (byte)var8_18});
            v11 = ((long)var10_19[0] & 255L) << 56 | ((long)var10_19[1] & 255L) << 48 | ((long)var10_19[2] & 255L) << 40 | ((long)var10_19[3] & 255L) << 32 | ((long)var10_19[4] & 255L) << 24 | ((long)var10_19[5] & 255L) << 16 | ((long)var10_19[6] & 255L) << 8 | (long)var10_19[7] & 255L;
            switch (v10) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl84:
                // 1 sources

                ** continue;
            }
        }
        CP_Jv.l = var6_12;
        CP_Jv.m = new Integer[17];
        CP_Jv.CP_a = (int)CP_Jv.d("e", (int)16313, (long)(var11 ^ 8274162456889412328L));
        CP_Jv.CP_p = (int)CP_Jv.d("e", (int)18540, (long)(var11 ^ 3180278089488579897L));
        CP_Jv.CP_J = (int)CP_Jv.d("e", (int)13408, (long)(var11 ^ 1411265234548769086L));
        CP_Jv.CP_E = (int)CP_Jv.d("e", (int)20024, (long)(var11 ^ 4875836278124821349L));
        CP_Jv.CP_r = (int)CP_Jv.d("e", (int)12566, (long)(var11 ^ 317493690359235662L));
        CP_Jv.CP_l = (int)CP_Jv.d("e", (int)21977, (long)(var11 ^ 5408743885321543808L));
        CP_Jv.CP_Z = (int)CP_Jv.d("e", (int)8628, (long)(var11 ^ 4409730036583453923L));
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
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x6938;
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
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jv", exception);
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
            CP_Jv.g[n2] = CP_Jv.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return g[n2];
    }

    private static Object b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_Jv.b(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int d(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x65B4;
        if (m[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = CP_Jv.l[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])CP_Jv.n.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    CP_Jv.n.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jv", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Jv.m[n2] = n3;
        }
        return m[n2];
    }

    private static int d(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Jv.d(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Jv" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Jv.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_Jv.class, "d", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

