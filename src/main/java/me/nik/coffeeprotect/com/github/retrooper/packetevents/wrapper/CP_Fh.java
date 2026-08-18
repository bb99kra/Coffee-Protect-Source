/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper;

import java.lang.invoke.CallSite;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;
import java.lang.invoke.MutableCallSite;
import java.security.Key;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketSendEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.manager.server.ServerVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_AG;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_i1;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_vM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_fn;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_iM;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_nR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_r6;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_rQ;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.PacketWrapper;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.Component;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_xu;
import me.nik.coffeeprotect.io.github.retrooper.packetevents.adventure.CP_yh;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public class CP_Fh
extends PacketWrapper<CP_Fh> {
    private String CP_O;
    private CP_nR CP_d;
    private Collection<String> CP_I;
    private Optional<CP_rQ> CP_s;
    private static PacketWrapper[] CP_o;
    private static final long b;
    private static final long[] c;
    private static final Integer[] g;
    private static final Map h;
    private static transient /* synthetic */ String BnIJPNzmyy = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_Fh(PacketSendEvent packetSendEvent) {
        super(packetSendEvent);
    }

    public CP_Fh(String string, CP_nR ilIlnR, @Nullable CP_rQ ilIlrQ, String ... stringArray) {
        this(string, ilIlnR, ilIlrQ, Arrays.asList(stringArray));
    }

    public CP_Fh(String string, CP_nR ilIlnR, @Nullable CP_rQ ilIlrQ, Collection<String> collection) {
        super(CP_AG.TEAMS);
        this.CP_O = string;
        this.CP_d = ilIlnR;
        this.CP_I = collection;
        this.CP_s = Optional.ofNullable(ilIlrQ);
    }

    @Deprecated
    public CP_Fh(String string, CP_nR ilIlnR, Optional<CP_rQ> optional, String ... stringArray) {
        this(string, ilIlnR, optional, Arrays.asList(stringArray));
    }

    @Deprecated
    public CP_Fh(String string, CP_nR ilIlnR, Optional<CP_rQ> optional, Collection<String> collection) {
        super(CP_AG.TEAMS);
        this.CP_O = string;
        this.CP_d = ilIlnR;
        this.CP_I = collection;
        this.CP_s = optional;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void CP_e() {
        block30: {
            block33: {
                block31: {
                    block32: {
                        block28: {
                            block29: {
                                block18: {
                                    block23: {
                                        block19: {
                                            block20: {
                                                block26: {
                                                    block27: {
                                                        block25: {
                                                            block24: {
                                                                block21: {
                                                                    block22: {
                                                                        block17: {
                                                                            block16: {
                                                                                var1_1 = CP_Fh.b ^ 37809191993783L;
                                                                                var3_2 = CP_Fh.CP_a();
                                                                                v0 /* !! */  = this.CP_g.CP_z(ServerVersion.V_1_18);
                                                                                if (var3_2 != null) {
                                                                                    v0 /* !! */  = (int)(v0 /* !! */  != 0 ? CP_Fh.b("c", (int)5546, (long)(5774869967096962088L ^ var1_1)) : CP_Fh.b("c", (int)16688, (long)(8009287436402821302L ^ var1_1)));
                                                                                }
                                                                                var4_3 = v0 /* !! */ ;
                                                                                this.CP_O = this.CP_p(var4_3);
                                                                                this.CP_d = CP_nR.values()[this.CP_E()];
                                                                                var5_4 = null;
                                                                                v1 = this.CP_d;
                                                                                v2 = CP_nR.CREATE;
                                                                                if (var3_2 == null) break block16;
                                                                                if (v1 == v2) break block17;
                                                                                v1 = this.CP_d;
                                                                                v2 = CP_nR.UPDATE;
                                                                            }
                                                                            if (v1 != v2) break block18;
                                                                        }
                                                                        var11_5 = null;
                                                                        v3 = this;
                                                                        if (var3_2 == null) break block19;
                                                                        if (!v3.CP_g.CP_S(ServerVersion.V_1_12_2)) break block20;
                                                                        var13_6 = this.CP_q().CP_g();
                                                                        var6_7 = var13_6.CP_L(this.CP_p((int)CP_Fh.b("c", (int)3567, (long)(1250070929817748591L ^ var1_1))));
                                                                        var7_9 /* !! */  = var13_6.CP_L(this.CP_p((int)CP_Fh.b("c", (int)16688, (long)(8009287436402821302L ^ var1_1))));
                                                                        var8_11 = var13_6.CP_L(this.CP_p((int)CP_Fh.b("c", (int)16688, (long)(8009287436402821302L ^ var1_1))));
                                                                        var9_12 = CP_fn.values()[this.CP_E()];
                                                                        v4 = this;
                                                                        if (var3_2 == null) break block21;
                                                                        if (!v4.CP_g.CP_S(ServerVersion.V_1_7_10)) break block22;
                                                                        var10_13 = CP_r6.ALWAYS;
                                                                        var12_14 = CP_xu.CP_u;
                                                                        if (var3_2 != null) break block23;
                                                                    }
                                                                    v4 = this;
                                                                }
                                                                var10_13 = CP_r6.CP_E(v4.CP_p((int)CP_Fh.b("c", (int)3567, (long)(1250070929817748591L ^ var1_1))));
                                                                v5 = this;
                                                                if (var3_2 == null) break block24;
                                                                if (!v5.CP_g.CP_z(ServerVersion.V_1_9)) break block25;
                                                                v5 = this;
                                                            }
                                                            var11_5 = CP_iM.CP_j(v5.CP_p((int)CP_Fh.b("c", (int)3567, (long)(1250070929817748591L ^ var1_1))));
                                                        }
                                                        v6 = this.CP_g.CP_z(ServerVersion.V_1_17);
                                                        if (var3_2 == null) break block26;
                                                        if (v6 == 0) break block27;
                                                        v7 = var14_15 = this.CP_f();
                                                        if (var3_2 != null) {
                                                            if (v7 == CP_Fh.b("c", (int)5570, (long)(5571620542415985733L ^ var1_1))) {
                                                                var14_15 = -1;
                                                            }
                                                            v7 = var14_15;
                                                        }
                                                        var12_14 = CP_i1.CP_t(v7);
                                                        if (var3_2 != null) break block23;
                                                    }
                                                    v6 = this.CP_E();
                                                }
                                                var12_14 = CP_i1.CP_t(v6);
                                                break block23;
                                            }
                                            v3 = this;
                                        }
                                        var6_7 = v3.CP_J();
                                        var9_12 = CP_fn.CP_Y(this.CP_E());
                                        v8 = this;
                                        if (var3_2 == null) ** GOTO lbl73
                                        if (v8.CP_g.CP_z(ServerVersion.V_1_21_5)) {
                                            var10_13 = this.CP_y(CP_r6.class);
                                            var11_5 = this.CP_y(CP_iM.class);
                                        } else {
                                            v8 = this;
lbl73:
                                            // 2 sources

                                            var10_13 = CP_r6.CP_E(v8.CP_p((int)CP_Fh.b("c", (int)11835, (long)(2260197621014489023L ^ var1_1))));
                                            var11_5 = CP_iM.CP_j(this.CP_p((int)CP_Fh.b("c", (int)11835, (long)(2260197621014489023L ^ var1_1))));
                                        }
                                        var12_14 = CP_i1.CP_t(this.CP_E());
                                        var7_9 /* !! */  = this.CP_J();
                                        var8_11 = this.CP_J();
                                    }
                                    var5_4 = new CP_rQ(var6_7, var7_9 /* !! */ , var8_11, var10_13, var11_5 == null ? CP_iM.ALWAYS : var11_5, var12_14, var9_12);
                                }
                                this.CP_s = Optional.ofNullable(var5_4);
                                this.CP_I = new ArrayList<String>();
                                v9 = this;
                                if (var3_2 == null) break block28;
                                if (v9.CP_d == CP_nR.CREATE) break block29;
                                v9 = this;
                                if (var3_2 == null) break block28;
                                if (v9.CP_d == CP_nR.ADD_ENTITIES) break block29;
                                v9 = this;
                                if (var3_2 == null) break block28;
                                if (v9.CP_d != CP_nR.REMOVE_ENTITIES) break block30;
                            }
                            v9 = this;
                        }
                        v10 = v9.CP_g.CP_S(ServerVersion.V_1_7_10);
                        if (var3_2 == null) break block31;
                        if (v10 == 0) break block32;
                        var6_8 = this.CP_G();
                        if (var3_2 != null) break block33;
                    }
                    v10 = this.CP_f();
                }
                var6_8 = v10;
            }
            for (var7_10 = 0; var7_10 < var6_8; ++var7_10) {
                this.CP_I.add(this.CP_p((int)CP_Fh.b("c", (int)11835, (long)(2260197621014489023L ^ var1_1))));
                if (var3_2 != null) continue;
            }
        }
    }

    @Override
    public void CP_J() {
        block35: {
            PacketWrapper[] packetWrapperArray;
            long l;
            block38: {
                CP_Fh ilIlFh;
                block36: {
                    block37: {
                        block33: {
                            block34: {
                                CP_nR ilIlnR;
                                CP_nR ilIlnR2;
                                block19: {
                                    block20: {
                                        CP_rQ ilIlrQ;
                                        block32: {
                                            CP_Fh ilIlFh2;
                                            block30: {
                                                block31: {
                                                    block29: {
                                                        CP_Fh ilIlFh3;
                                                        block27: {
                                                            block28: {
                                                                boolean bl;
                                                                block21: {
                                                                    block22: {
                                                                        block25: {
                                                                            CP_Fh ilIlFh4;
                                                                            block26: {
                                                                                boolean bl2;
                                                                                block23: {
                                                                                    block24: {
                                                                                        Object object;
                                                                                        block17: {
                                                                                            block18: {
                                                                                                l = b ^ 0x3B1E5E9C7F1FL;
                                                                                                packetWrapperArray = CP_Fh.CP_a();
                                                                                                Object object2 = this.CP_g.CP_z(ServerVersion.V_1_18);
                                                                                                if (packetWrapperArray != null) {
                                                                                                    object2 = object2 != 0 ? CP_Fh.b("c", (int)321, (long)(0x2407527430427661L ^ l)) : CP_Fh.b("c", (int)16581, (long)(0x28E542AF8007B7ECL ^ l));
                                                                                                }
                                                                                                int n = object2;
                                                                                                this.CP_m(this.CP_O, n);
                                                                                                this.CP_u(this.CP_d.ordinal());
                                                                                                object = this.CP_d;
                                                                                                if (packetWrapperArray == null) break block17;
                                                                                                if (object == CP_nR.CREATE) break block18;
                                                                                                ilIlnR2 = this.CP_d;
                                                                                                ilIlnR = CP_nR.UPDATE;
                                                                                                if (packetWrapperArray == null) break block19;
                                                                                                if (ilIlnR2 != ilIlnR) break block20;
                                                                                            }
                                                                                            object = this.CP_s.orElse(new CP_rQ(Component.empty(), Component.empty(), Component.empty(), CP_r6.ALWAYS, CP_iM.ALWAYS, CP_xu.CP_u, CP_fn.NONE));
                                                                                        }
                                                                                        ilIlrQ = (CP_rQ)object;
                                                                                        bl = this.CP_g.CP_S(ServerVersion.V_1_12_2);
                                                                                        if (packetWrapperArray == null) break block21;
                                                                                        if (!bl) break block22;
                                                                                        CP_yh object3 = this.CP_q().CP_g();
                                                                                        this.CP_M(CP_vM.CP_Q(object3.CP_UnderScore(CP_rQ.CP_Z(ilIlrQ)), (int)CP_Fh.b("c", (int)31388, (long)(0x7B4F712EF1758DBEL ^ l))));
                                                                                        this.CP_M(CP_vM.CP_Q(object3.CP_UnderScore(CP_rQ.CP_g(ilIlrQ)), (int)CP_Fh.b("c", (int)16688, (long)(0x6F26AD007B23361EL ^ l))));
                                                                                        this.CP_M(CP_vM.CP_Q(object3.CP_UnderScore(CP_rQ.CP_d(ilIlrQ)), (int)CP_Fh.b("c", (int)16688, (long)(0x6F26AD007B23361EL ^ l))));
                                                                                        this.CP_u(CP_rQ.CP_G(ilIlrQ).ordinal());
                                                                                        bl2 = this.CP_g.CP_S(ServerVersion.V_1_7_10);
                                                                                        if (packetWrapperArray == null) break block23;
                                                                                        if (!bl2) break block24;
                                                                                        this.CP_m(CP_r6.ALWAYS.CP_A(), (int)CP_Fh.b("c", (int)3567, (long)(0x11593D9E4E3D7AC7L ^ l)));
                                                                                        this.CP_u((int)CP_Fh.b("c", (int)18277, (long)(0x49C7B7462F6A304EL ^ l)));
                                                                                        if (packetWrapperArray != null) break block25;
                                                                                    }
                                                                                    this.CP_m(CP_r6.CP_G(CP_rQ.CP_T(ilIlrQ)), (int)CP_Fh.b("c", (int)3567, (long)(0x11593D9E4E3D7AC7L ^ l)));
                                                                                    ilIlFh4 = this;
                                                                                    if (packetWrapperArray == null) break block26;
                                                                                    bl2 = ilIlFh4.CP_g.CP_z(ServerVersion.V_1_9);
                                                                                }
                                                                                if (bl2) {
                                                                                    this.CP_m(CP_rQ.CP_O(ilIlrQ).CP_V(), (int)CP_Fh.b("c", (int)3567, (long)(0x11593D9E4E3D7AC7L ^ l)));
                                                                                }
                                                                                ilIlFh4 = this;
                                                                            }
                                                                            ilIlFh4.CP_u(CP_i1.CP_a(CP_rQ.CP_t(ilIlrQ)));
                                                                        }
                                                                        if (packetWrapperArray != null) break block20;
                                                                    }
                                                                    this.CP_z(CP_rQ.CP_Z(ilIlrQ));
                                                                    this.CP_u(CP_rQ.CP_G(ilIlrQ).CP_H());
                                                                    ilIlFh3 = this;
                                                                    if (packetWrapperArray == null) break block27;
                                                                    bl = ilIlFh3.CP_g.CP_z(ServerVersion.V_1_21_5);
                                                                }
                                                                if (!bl) break block28;
                                                                this.CP_w(CP_rQ.CP_T(ilIlrQ));
                                                                this.CP_w(CP_rQ.CP_O(ilIlrQ));
                                                                if (packetWrapperArray != null) break block29;
                                                            }
                                                            this.CP_M(CP_r6.CP_G(CP_rQ.CP_T(ilIlrQ)));
                                                            ilIlFh3 = this;
                                                        }
                                                        ilIlFh3.CP_M(CP_rQ.CP_O(ilIlrQ).CP_V());
                                                    }
                                                    ilIlFh2 = this;
                                                    if (packetWrapperArray == null) break block30;
                                                    if (!ilIlFh2.CP_g.CP_z(ServerVersion.V_1_17)) break block31;
                                                    int object = CP_i1.CP_a(CP_rQ.CP_t(ilIlrQ));
                                                    if (packetWrapperArray != null) {
                                                        CallSite callSite;
                                                        if (object < 0) {
                                                            callSite = CP_Fh.b("c", (int)28513, (long)(0x72EF75F8D5DB9842L ^ l));
                                                        }
                                                        this.CP_J((int)callSite);
                                                    }
                                                    if (packetWrapperArray != null) break block32;
                                                }
                                                ilIlFh2 = this;
                                            }
                                            ilIlFh2.CP_u(CP_i1.CP_a(CP_rQ.CP_t(ilIlrQ)));
                                        }
                                        this.CP_z(CP_rQ.CP_g(ilIlrQ));
                                        this.CP_z(CP_rQ.CP_d(ilIlrQ));
                                    }
                                    ilIlFh = this;
                                    if (packetWrapperArray == null) break block33;
                                    ilIlnR2 = ilIlFh.CP_d;
                                    ilIlnR = CP_nR.CREATE;
                                }
                                if (ilIlnR2 == ilIlnR) break block34;
                                ilIlFh = this;
                                if (packetWrapperArray == null) break block33;
                                if (ilIlFh.CP_d == CP_nR.ADD_ENTITIES) break block34;
                                ilIlFh = this;
                                if (packetWrapperArray == null) break block33;
                                if (ilIlFh.CP_d != CP_nR.REMOVE_ENTITIES) break block35;
                            }
                            ilIlFh = this;
                        }
                        if (packetWrapperArray == null) break block36;
                        if (!ilIlFh.CP_g.CP_S(ServerVersion.V_1_7_10)) break block37;
                        this.CP_G(this.CP_I.size());
                        if (packetWrapperArray != null) break block38;
                    }
                    ilIlFh = this;
                }
                ilIlFh.CP_J(this.CP_I.size());
            }
            for (String string : this.CP_I) {
                this.CP_m(string, (int)CP_Fh.b("c", (int)13617, (long)(0x6A97FDEA6C55C21CL ^ l)));
                if (packetWrapperArray != null) continue;
            }
        }
    }

    public void CP_u(CP_Fh ilIlFh) {
        this.CP_O = ilIlFh.CP_O;
        this.CP_d = ilIlFh.CP_d;
        this.CP_I = ilIlFh.CP_I;
        this.CP_s = ilIlFh.CP_s;
    }

    public String CP_T() {
        return this.CP_O;
    }

    public void CP_UnderScore(String string) {
        this.CP_O = string;
    }

    public CP_nR CP_i() {
        return this.CP_d;
    }

    public void CP_y(CP_nR ilIlnR) {
        this.CP_d = ilIlnR;
    }

    public Collection<String> CP_y() {
        return this.CP_I;
    }

    public void CP_b(Collection<String> collection) {
        this.CP_I = collection;
    }

    public Optional<CP_rQ> CP_A() {
        return this.CP_s;
    }

    public void CP_j(@Nullable CP_rQ ilIlrQ) {
        this.CP_s = Optional.ofNullable(ilIlrQ);
    }

    public static void CP_p(PacketWrapper[] packetWrapperArray) {
        CP_o = packetWrapperArray;
    }

    public static PacketWrapper[] CP_a() {
        return CP_o;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block9: {
            block8: {
                CP_Fh.b = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(4941401830582818165L, 7646855958711990797L, MethodHandles.lookup().lookupClass()).a(217269000151288L);
                CP_Fh.h = new HashMap<K, V>(13);
                CP_Fh.CP_p(new PacketWrapper[1]);
                var0 = CP_Fh.b ^ 91693549970163L;
                var2_1 = Cipher.getInstance("DES/CBC/NoPadding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var0 >>> 56);
                for (var3_2 = 1; var3_2 < 8; ++var3_2) {
                    v2 = v2;
                    v2[var3_2] = (byte)(var0 << var3_2 * 8 >>> 56);
                }
                var2_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var8_3 = new long[11];
                var5_4 = 0;
                var6_5 = "\u0087\u00bc4o\u00fb\u00fco\u001e\u00e5\u0005\u007f\u00a0\u0085K\u001fSr\u00c9\u008a\u00148\u007fOOm\u00cfCs\u00f5\u00bf\u00d31\u00d2(\u001cW*\u00e1\u00da\u00c3c%\u00f7\u0010\u001d\u00c1\u00a58n\u00f6\u00e0\u00fc\u008eY\u00b5\u0002\u00cd\u00f3=\u001b\u0099v\u00a1Dr\u0011N>\u00c3d]\u001e";
                var7_6 = "\u0087\u00bc4o\u00fb\u00fco\u001e\u00e5\u0005\u007f\u00a0\u0085K\u001fSr\u00c9\u008a\u00148\u007fOOm\u00cfCs\u00f5\u00bf\u00d31\u00d2(\u001cW*\u00e1\u00da\u00c3c%\u00f7\u0010\u001d\u00c1\u00a58n\u00f6\u00e0\u00fc\u008eY\u00b5\u0002\u00cd\u00f3=\u001b\u0099v\u00a1Dr\u0011N>\u00c3d]\u001e".length();
                var4_7 = 0;
                while (true) {
                    var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                    v3 = var8_3;
                    v4 = var5_4++;
                    v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                    v6 = -1;
                    break block8;
                    break;
                }
lbl27:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    var6_5 = "\u00c07{WZ\u00cd\u00d1\u00e2\u00f9\u00db\u009c`1F]\t";
                    var7_6 = "\u00c07{WZ\u00cd\u00d1\u00e2\u00f9\u00db\u009c`1F]\t".length();
                    var4_7 = 0;
                    while (true) {
                        var9_8 = var6_5.substring(var4_7, var4_7 += 8).getBytes("ISO-8859-1");
                        v3 = var8_3;
                        v4 = var5_4++;
                        v5 = ((long)var9_8[0] & 255L) << 56 | ((long)var9_8[1] & 255L) << 48 | ((long)var9_8[2] & 255L) << 40 | ((long)var9_8[3] & 255L) << 32 | ((long)var9_8[4] & 255L) << 24 | ((long)var9_8[5] & 255L) << 16 | ((long)var9_8[6] & 255L) << 8 | (long)var9_8[7] & 255L;
                        v6 = 0;
                        break block8;
                        break;
                    }
                    break;
                }
lbl40:
                // 1 sources

                while (true) {
                    v3[v4] = v7;
                    if (var4_7 < var7_6) ** continue;
                    break block9;
                    break;
                }
            }
            var10_9 = v5;
            var12_10 = var2_1.doFinal(new byte[]{(byte)(var10_9 >>> 56), (byte)(var10_9 >>> 48), (byte)(var10_9 >>> 40), (byte)(var10_9 >>> 32), (byte)(var10_9 >>> 24), (byte)(var10_9 >>> 16), (byte)(var10_9 >>> 8), (byte)var10_9});
            v7 = ((long)var12_10[0] & 255L) << 56 | ((long)var12_10[1] & 255L) << 48 | ((long)var12_10[2] & 255L) << 40 | ((long)var12_10[3] & 255L) << 32 | ((long)var12_10[4] & 255L) << 24 | ((long)var12_10[5] & 255L) << 16 | ((long)var12_10[6] & 255L) << 8 | (long)var12_10[7] & 255L;
            switch (v6) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl53:
                // 1 sources

                ** continue;
            }
        }
        CP_Fh.c = var8_3;
        CP_Fh.g = new Integer[11];
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x44F2;
        if (g[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = c[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])h.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    h.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fh", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_Fh.g[n2] = n3;
        }
        return g[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_Fh.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_0().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/com/github/retrooper/packetevents/wrapper/CP_Fh" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_Fh.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}

