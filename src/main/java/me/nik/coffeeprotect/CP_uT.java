/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.bukkit.entity.Player
 *  org.bukkit.event.inventory.InventoryType
 *  org.bukkit.inventory.InventoryView
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
import me.nik.coffeeprotect.CP_Op;
import me.nik.coffeeprotect.CP_Oq;
import me.nik.coffeeprotect.CP_TE;
import me.nik.coffeeprotect.CP_TM;
import me.nik.coffeeprotect.CP_TV;
import me.nik.coffeeprotect.CP_jl;
import me.nik.coffeeprotect.CP_u7;
import me.nik.coffeeprotect.CP_uV;
import me.nik.coffeeprotect.CP_yR;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.event.PacketReceiveEvent;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.CP_nN;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Ct;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_J2;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_JA;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_Jv;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import org.bukkit.entity.Player;
import org.bukkit.event.inventory.InventoryType;
import org.bukkit.inventory.InventoryView;

@CP_jl(CP_J="Invalid Window Click", CP_M="Checks for invalid window click packets")
public class CP_uT
extends CP_uV {
    private long CP_A;
    private long CP_T;
    private int CP_v;
    private CP_Ct CP_r;
    private InventoryView CP_K;
    private static final long b;
    private static final String[] d;
    private static final String[] e;
    private static final Map f;
    private static final long[] g;
    private static final Integer[] h;
    private static final Map i;
    private static final long[] j;
    private static final Long[] k;
    private static final Map l;
    private static transient /* synthetic */ String dhvcEKixsT = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    public CP_uT(CP_TM ilIlTM) {
        super(ilIlTM, CP_Oq.CHECKS_INVALID_WINDOW_CLICK_ENABLED.CP_t());
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public CP_TV CP_h(PacketReceiveEvent var1_1) {
        var2_2 = CP_uT.b ^ 39057855569527L;
        var4_3 = CP_u7.CP_q();
        v0 = var1_1.getPacketType() instanceof CP_nN;
        if (var4_3 == null) {
            if (v0 == 0) {
                return null;
            }
            v0 = CP_Op.CP_g[((CP_nN)var1_1.getPacketType()).ordinal()];
        }
        switch (v0 ? 1 : 0) {
            case 1: {
                var5_4 = new CP_J2(var1_1);
                var6_5 = (Player)var1_1.getPlayer();
                var7_6 = var6_5.getOpenInventory();
                var8_7 = var5_4.CP_C();
                var9_8 = var5_4.CP_N();
                var10_9 = var5_4.CP_C();
                var11_10 = var5_4.CP_F();
                var12_11 = this.CP_v;
                this.CP_v = var9_8;
                var13_12 = this.CP_r;
                this.CP_r = var8_7;
                var14_13 = this.CP_K;
                this.CP_K = var7_6;
                v1 = CP_Oq.CHECKS_INVALID_WINDOW_CLICK_PREVENT_SLOT_SPAM_IN_GUI.CP_t();
                if (var4_3 != null) ** GOTO lbl47
                if (v1 == 0 || var7_6.getType() == InventoryType.CREATIVE) ** GOTO lbl46
                v1 = var9_8;
                if (var4_3 != null) ** GOTO lbl47
                if (v1 != var12_11 || var8_7 != var13_12 || var7_6 != var14_13) ** GOTO lbl46
                var15_14 = var1_1.CP_O();
                var17_16 = var15_14 - this.CP_A;
                cfr_temp_0 = var17_16 - CP_uT.c("s", (int)13089, (long)(1136099952360849211L ^ var2_2));
                v2 = cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1);
                if (var4_3 != null) ** GOTO lbl36
                if (v2 < 0) {
                    v2 = (cfr_temp_1 = this.CP_T++ - CP_uT.c("s", (int)11770, (long)(8259089055191491042L ^ var2_2))) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1);
lbl36:
                    // 2 sources

                    if (var4_3 == null) {
                        if (v2 > 0) {
                            return new CP_TE(this, (String)CP_uT.a("a", (int)23776, (long)(6789722631331156772L ^ var2_2)));
                        }
                        cfr_temp_2 = var17_16 - 0L;
                        v2 = cfr_temp_2 == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1);
                    }
                    if (v2 == false) {
                        return new CP_TE(this);
                    }
                } else {
                    this.CP_T = Math.max(0L, this.CP_T / CP_uT.c("s", (int)11918, (long)(876050492126257813L ^ var2_2)));
                }
                this.CP_A = var15_14;
lbl46:
                // 3 sources

                v1 = (int)CP_yR.CP_q(new int[]{var9_8, var10_9, var11_10});
lbl47:
                // 3 sources

                if (v1 != 0) {
                    return new CP_TV(this, (String)CP_uT.a("a", (int)7444, (long)(4588932610785235665L ^ var2_2)));
                }
                if (var8_7 != CP_Ct.SWAP) ** GOTO lbl57
                v3 = var9_8;
                if (var4_3 != null) ** GOTO lbl54
                if (v3 < 0) ** GOTO lbl56
                v3 = var10_9;
lbl54:
                // 2 sources

                if (var4_3 != null) ** GOTO lbl58
                if (v3 >= 0) ** GOTO lbl57
lbl56:
                // 2 sources

                return new CP_TE(this, (String)CP_uT.a("a", (int)5311, (long)(2527359475348626294L ^ var2_2)) + var9_8 + (String)CP_uT.a("a", (int)10006, (long)(4524218550054316249L ^ var2_2)) + var10_9);
lbl57:
                // 2 sources

                v3 = CP_Op.CP_f[var8_7.ordinal()];
lbl58:
                // 2 sources

                if (var4_3 != null) ** GOTO lbl62
                switch (v3) {
                    case 1: {
                        v3 = var10_9;
lbl62:
                        // 2 sources

                        v4 = CP_uT.b("n", (int)20855, (long)(232250825328876139L ^ var2_2));
                        if (var4_3 == null) {
                            if (v3 <= v4) {
                                v3 = var10_9;
                                if (var4_3 == null) {
                                    if (v3 >= 0) break;
                                }
                            } else {
                                v3 = var10_9;
                            }
                            v4 = CP_uT.b("n", (int)6212, (long)(3082694641636709213L ^ var2_2));
                        }
                        if (v3 == v4) break;
                        return new CP_TE(this, var8_7.name() + (String)CP_uT.a("a", (int)23210, (long)(6018870529202296164L ^ var2_2)) + var10_9);
                    }
                    case 2: {
                        v5 = var9_8;
                        if (var4_3 != null) ** GOTO lbl78
                        if (v5 == -1) ** GOTO lbl82
                        v5 = var10_9;
lbl78:
                        // 2 sources

                        if (var4_3 == null) {
                            if (v5 == 0) break;
                            v5 = var10_9;
                        }
                        if (v5 == 1) break;
lbl82:
                        // 2 sources

                        return new CP_TE(this, var8_7.name() + (String)CP_uT.a("a", (int)7143, (long)(6666087126636680237L ^ var2_2)) + var9_8 + (String)CP_uT.a("a", (int)25591, (long)(3261280814880500791L ^ var2_2)) + var10_9);
                    }
                    case 3: 
                    case 4: 
                    case 5: {
                        v6 = var10_9;
                        if (var4_3 != null) ** GOTO lbl88
                        if (v6 > 2) ** GOTO lbl89
                        v6 = var10_9;
lbl88:
                        // 2 sources

                        if (v6 >= 0) ** GOTO lbl90
lbl89:
                        // 2 sources

                        return new CP_TE(this, var8_7.name() + (String)CP_uT.a("a", (int)17495, (long)(4943970990159661958L ^ var2_2)) + var10_9);
lbl90:
                        // 1 sources

                        if (var8_7 != CP_Ct.QUICK_MOVE) break;
                        v7 = var9_8;
                        if (var4_3 == null) {
                            if (v7 == CP_uT.b("n", (int)24616, (long)(4844559873671981872L ^ var2_2))) {
                                return new CP_TE(this, var8_7.name() + (String)CP_uT.a("a", (int)8670, (long)(488860293831388691L ^ var2_2)) + var9_8);
                            }
                            v7 = var11_10;
                        }
                        if (var4_3 == null) {
                            if (v7 < 0) break;
                            v7 = var10_9;
                        }
                        if (v7 >= 0) break;
                        return new CP_TE(this, var8_7.name() + (String)CP_uT.a("a", (int)8670, (long)(488860293831388691L ^ var2_2)) + var9_8 + (String)CP_uT.a("a", (int)21212, (long)(6646069215065251098L ^ var2_2)) + var11_10);
                    }
                    case 6: {
                        v8 = var10_9;
                        v9 /* !! */  = 3;
                        if (var4_3 != null) ** GOTO lbl108
                        if (v8 == v9 /* !! */ ) ** GOTO lbl116
                        v8 = var10_9;
                        v9 /* !! */  = (int)CP_uT.b("n", (int)10502, (long)(5718335902053573148L ^ var2_2));
lbl108:
                        // 2 sources

                        if (var4_3 != null) ** GOTO lbl113
                        if (v8 == v9 /* !! */ ) ** GOTO lbl116
                        v8 = var10_9;
                        if (var4_3 != null) ** GOTO lbl115
                        v9 /* !! */  = (int)CP_uT.b("n", (int)29132, (long)(71834326352952023L ^ var2_2));
lbl113:
                        // 2 sources

                        if (v8 > v9 /* !! */ ) ** GOTO lbl116
                        v8 = var10_9;
lbl115:
                        // 2 sources

                        if (v8 >= 0) break;
lbl116:
                        // 4 sources

                        return new CP_TE(this, var8_7.name() + (String)CP_uT.a("a", (int)17495, (long)(4943970990159661958L ^ var2_2)) + var10_9);
                    }
                    case 7: {
                        if (var10_9 == 0) break;
                        return new CP_TE(this, var8_7.name() + (String)CP_uT.a("a", (int)17495, (long)(4943970990159661958L ^ var2_2)) + var10_9);
                    }
                    case 8: {
                        return new CP_TE(this, (String)CP_uT.a("a", (int)17078, (long)(2332260837028400497L ^ var2_2)));
                    }
                }
                if (var7_6 == null) {
                    return new CP_TE(this, (String)CP_uT.a("a", (int)31511, (long)(6683206169244218567L ^ var2_2)));
                }
                v10 = var9_8;
                if (var4_3 != null) ** GOTO lbl139
                if (v10 >= 0) ** GOTO lbl138
                v10 = var9_8;
                v11 /* !! */  = (int)CP_uT.b("n", (int)868, (long)(4476357228298340474L ^ var2_2));
                if (var4_3 != null) ** GOTO lbl141
                if (v10 != v11 /* !! */ ) {
                    v10 = var9_8;
                    v11 /* !! */  = -1;
                    if (var4_3 == null) {
                        if (v10 != v11 /* !! */ ) {
                            return new CP_TV(this, (String)CP_uT.a("a", (int)9099, (long)(2266814881314925640L ^ var2_2)) + var9_8);
                        } else {
                            ** GOTO lbl138
                        }
                    } else {
                        ** GOTO lbl137
                    }
                }
                ** GOTO lbl138
lbl137:
                // 2 sources

                ** GOTO lbl141
lbl138:
                // 4 sources

                v10 = var7_6.countSlots() + 3;
lbl139:
                // 2 sources

                if (var4_3 != null) ** GOTO lbl144
                v11 /* !! */  = var9_8;
lbl141:
                // 3 sources

                if (v10 < v11 /* !! */ ) {
                    return new CP_TE(this, (String)CP_uT.a("a", (int)24034, (long)(6536844323664302638L ^ var2_2)) + var7_6.countSlots());
                }
                v10 = (int)CP_Oq.CHECKS_INVALID_WINDOW_CLICK_PREVENT_LECTERN_INVENTORY.CP_t();
lbl144:
                // 2 sources

                if (var4_3 == null) {
                    if (v10 == 0) break;
                    v10 = (int)var7_6.getTopInventory().getType().name().equalsIgnoreCase((String)CP_uT.a("a", (int)1900, (long)(2504488736785123492L ^ var2_2)));
                }
                if (v10 == 0) break;
                return new CP_TE(this);
            }
            case 2: {
                var15_15 = new CP_JA(var1_1);
                v12 = var15_15.CP_s();
                if (var4_3 != null) ** GOTO lbl155
                if (v12 < 0) ** GOTO lbl156
                v12 = var15_15.CP_g();
lbl155:
                // 2 sources

                if (v12 >= 0) break;
lbl156:
                // 2 sources

                return new CP_TV(this, (String)CP_uT.a("a", (int)5517, (long)(8824830662190127695L ^ var2_2)) + var15_15.CP_s() + (String)CP_uT.a("a", (int)26761, (long)(1532232519581083458L ^ var2_2)) + var15_15.CP_g());
            }
            case 3: {
                var16_18 = new CP_Jv(var1_1);
                v13 = var17_17 = var16_18.CP_g();
                if (var4_3 != null) ** GOTO lbl163
                if (v13 < 0) ** GOTO lbl169
                v13 = var17_17;
lbl163:
                // 2 sources

                v14 = CP_uT.b("n", (int)19061, (long)(4117336834405941610L ^ var2_2));
                if (var4_3 == null) {
                    if (v13 <= v14) break;
                    v13 = var17_17;
                    v14 = CP_uT.b("n", (int)30193, (long)(6525136363820220140L ^ var2_2));
                }
                if (v13 == v14) break;
lbl169:
                // 2 sources

                return new CP_TV(this, (String)CP_uT.a("a", (int)3505, (long)(2795013596266480240L ^ var2_2)) + var17_17);
            }
        }
        return null;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block26: {
            block25: {
                block24: {
                    block23: {
                        block22: {
                            block21: {
                                CP_uT.b = CP_s.a(-7994644512299029602L, 6067488787573586001L, MethodHandles.lookup().lookupClass()).a(8512756142942L);
                                CP_uT.f = new HashMap<K, V>(13);
                                var22 = CP_uT.b ^ 57365890296974L;
                                var24_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                                v0 = SecretKeyFactory.getInstance("DES");
                                v1 = new byte[8];
                                v2 = v1;
                                v1[0] = (byte)(var22 >>> 56);
                                for (var25_2 = 1; var25_2 < 8; ++var25_2) {
                                    v2 = v2;
                                    v2[var25_2] = (byte)(var22 << var25_2 * 8 >>> 56);
                                }
                                var24_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                                var31_3 = new String[18];
                                var29_4 = 0;
                                var28_5 = "\u00d9\u00a9%\u0000V\u009fJB4go\u00f5::fk\u0007s\u001b\t\u0002\u00bck)A\u001a\u00cdc\u00b7B\u0006\u008d\u0087\f\n\u00e1\u00d5\u00ab\u0002\u0091[\u00c6\u008b\u0097\u0083\u00a72\u00b7E\u0017\t&\u00edZ\u00d70 ri\u00dcPq\u00e4\u009f\u001bz\u00c8\u0088\u009a\u00c4\u009a\u0087\u0010\u00b75\u00cb\u009du\u000b1\u00e6AgpCu\u00c0\u00db\u00f7\u0010r\\\u00b4\u00d6\u00cb~ \u00df\u0093\u00c4H\u00da\u001d\u00f9[? m\u00a3\u00fa\u007f\u00c3\u00e2\u00ee f\u001b\u00cc/Z\u00e2\u00d9\u00c8R\u0006\\\u00d1nv\u00835\u00bb\u00da\u00b1=\u00c8\u008a\u00fb\u0015 \u00a3%\u0005\u00e9\u00e1;\u00eb\u00f6\u007f\u0098]\u009c6W\u00c93{\u0014q\u00adN`+7F\u00d2\u00dcA\u009a\u00a5\u00cah \r\u00b8h:e#q\u00c5\"\u00e7\u00a5\u00e5\u00e7f\u00d5:\u0088\u00b4\u009a\u00ec\u00d1a!\u00a76\u0007\u0095\u00abf\u00c0&4(\u00ff\u0018\u00af`\u00d0\u00a6\\\u00e6\u00a0\u001c\u00bcec\u0089\u00db\u00ff*\u008ee\u00eb\u0089&\u0015-\u00f4\u000f,\u00ee !\u0083.\n\u00d3\u0091\u0001\u00bd\u00f3U\u008c\u0010\u001f\u00c8uX\u0001\u00a2\u0090o\u000f\u00d2{y\u00920\u00f6\u0080\u0010\u00b4\u00a8\u00d86x\u0094\u00cc\u0005Z\u00b2m\u00862\u0093\u00f6:\u0010\u00f32\u00c2}\u00b9\u00eb\u0089/\u0016-\u00baa\u00fd\u0003\u00bb\u00db\u0018\u0018\u0011U@h\u0000E\u00d0\u00c5u\u0016\u00a8\u0085\u0017\u00c5\u00fe2\u00c6\u0017\u000b\u00f5HP~\u0018\n\u001d\r\u0084a\u00d0\"\u00be[\u00a1\u00bd\u000b\u00a4;\u00ae\u00ae\u0019\u00d1\u00ac\u0099SG\u0084A \u00e8\u00e6\u001aA\u0013C\u0003h\u00aa\u008a&\u0012\u00faL\u00e4\u00f5w\u00abw\u00c1\fVd\u0080\u0015v\u00b3\u0019II\u0084\u00d7\u0010\u00be5\u00dc\u00a5\u00ef\u007f\u00f7\u009c\u000es\u0080\u0001\u00dbJ\u0017\u00e2\u00187\u00ec\u00cd\u00df/\u001f!\u008e\u00a13\u00a1\u00a8\u00e2\u00cex\u00fa\u0005az\u008eQ\u0018gn\u0018\u00b8\u000f\u00c1\u00e2\u00c8\u00e13E&=\u00c1\u001d\u00cf! \u0086\u00cbQ\u0084\u008c\u00a9A]\u00c1";
                                var30_6 = "\u00d9\u00a9%\u0000V\u009fJB4go\u00f5::fk\u0007s\u001b\t\u0002\u00bck)A\u001a\u00cdc\u00b7B\u0006\u008d\u0087\f\n\u00e1\u00d5\u00ab\u0002\u0091[\u00c6\u008b\u0097\u0083\u00a72\u00b7E\u0017\t&\u00edZ\u00d70 ri\u00dcPq\u00e4\u009f\u001bz\u00c8\u0088\u009a\u00c4\u009a\u0087\u0010\u00b75\u00cb\u009du\u000b1\u00e6AgpCu\u00c0\u00db\u00f7\u0010r\\\u00b4\u00d6\u00cb~ \u00df\u0093\u00c4H\u00da\u001d\u00f9[? m\u00a3\u00fa\u007f\u00c3\u00e2\u00ee f\u001b\u00cc/Z\u00e2\u00d9\u00c8R\u0006\\\u00d1nv\u00835\u00bb\u00da\u00b1=\u00c8\u008a\u00fb\u0015 \u00a3%\u0005\u00e9\u00e1;\u00eb\u00f6\u007f\u0098]\u009c6W\u00c93{\u0014q\u00adN`+7F\u00d2\u00dcA\u009a\u00a5\u00cah \r\u00b8h:e#q\u00c5\"\u00e7\u00a5\u00e5\u00e7f\u00d5:\u0088\u00b4\u009a\u00ec\u00d1a!\u00a76\u0007\u0095\u00abf\u00c0&4(\u00ff\u0018\u00af`\u00d0\u00a6\\\u00e6\u00a0\u001c\u00bcec\u0089\u00db\u00ff*\u008ee\u00eb\u0089&\u0015-\u00f4\u000f,\u00ee !\u0083.\n\u00d3\u0091\u0001\u00bd\u00f3U\u008c\u0010\u001f\u00c8uX\u0001\u00a2\u0090o\u000f\u00d2{y\u00920\u00f6\u0080\u0010\u00b4\u00a8\u00d86x\u0094\u00cc\u0005Z\u00b2m\u00862\u0093\u00f6:\u0010\u00f32\u00c2}\u00b9\u00eb\u0089/\u0016-\u00baa\u00fd\u0003\u00bb\u00db\u0018\u0018\u0011U@h\u0000E\u00d0\u00c5u\u0016\u00a8\u0085\u0017\u00c5\u00fe2\u00c6\u0017\u000b\u00f5HP~\u0018\n\u001d\r\u0084a\u00d0\"\u00be[\u00a1\u00bd\u000b\u00a4;\u00ae\u00ae\u0019\u00d1\u00ac\u0099SG\u0084A \u00e8\u00e6\u001aA\u0013C\u0003h\u00aa\u008a&\u0012\u00faL\u00e4\u00f5w\u00abw\u00c1\fVd\u0080\u0015v\u00b3\u0019II\u0084\u00d7\u0010\u00be5\u00dc\u00a5\u00ef\u007f\u00f7\u009c\u000es\u0080\u0001\u00dbJ\u0017\u00e2\u00187\u00ec\u00cd\u00df/\u001f!\u008e\u00a13\u00a1\u00a8\u00e2\u00cex\u00fa\u0005az\u008eQ\u0018gn\u0018\u00b8\u000f\u00c1\u00e2\u00c8\u00e13E&=\u00c1\u001d\u00cf! \u0086\u00cbQ\u0084\u008c\u00a9A]\u00c1".length();
                                var27_7 = 56;
                                var26_8 = -1;
lbl20:
                                // 2 sources

                                while (true) {
                                    v3 = ++var26_8;
                                    v4 = var28_5.substring(v3, v3 + var27_7);
                                    v5 = -1;
                                    break block21;
                                    break;
                                }
lbl25:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = CP_uT.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    var28_5 = "\u0090\u0099N\u00f6\u00a0\u0097\u00cd\u0099)\u00fdk\u00e5\u0088n\u008c\u00b5XP\u0002\u00d0\u0084mY\u00af\u00ff'\u0082\u0016\u00ea\u0017$\u008e \u00cd\u00f2\u000f\u00f3\t6\f\u00c4v\u000fek\u0012\u00d5\u00c0\u00dbP\u00d5g\u001c!\u00dacy\u00f3\u00f0\u00d4\u001c\u008e\u0002u;";
                                    var30_6 = "\u0090\u0099N\u00f6\u00a0\u0097\u00cd\u0099)\u00fdk\u00e5\u0088n\u008c\u00b5XP\u0002\u00d0\u0084mY\u00af\u00ff'\u0082\u0016\u00ea\u0017$\u008e \u00cd\u00f2\u000f\u00f3\t6\f\u00c4v\u000fek\u0012\u00d5\u00c0\u00dbP\u00d5g\u001c!\u00dacy\u00f3\u00f0\u00d4\u001c\u008e\u0002u;".length();
                                    var27_7 = 32;
                                    var26_8 = -1;
lbl34:
                                    // 2 sources

                                    while (true) {
                                        v6 = ++var26_8;
                                        v4 = var28_5.substring(v6, v6 + var27_7);
                                        v5 = 0;
                                        break block21;
                                        break;
                                    }
                                    break;
                                }
lbl39:
                                // 1 sources

                                while (true) {
                                    var31_3[var29_4++] = CP_uT.b(var32_9).intern();
                                    if ((var26_8 += var27_7) < var30_6) {
                                        var27_7 = var28_5.charAt(var26_8);
                                        ** continue;
                                    }
                                    break block22;
                                    break;
                                }
                            }
                            var32_9 = var24_1.doFinal(v4.getBytes("ISO-8859-1"));
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
                        CP_uT.d = var31_3;
                        CP_uT.e = new String[18];
                        CP_uT.i = new HashMap<K, V>(13);
                        var11_10 = Cipher.getInstance("DES/CBC/NoPadding");
                        v7 = SecretKeyFactory.getInstance("DES");
                        v8 = new byte[8];
                        v9 = v8;
                        v8[0] = (byte)(var22 >>> 56);
                        for (var12_11 = 1; var12_11 < 8; ++var12_11) {
                            v9 = v9;
                            v9[var12_11] = (byte)(var22 << var12_11 * 8 >>> 56);
                        }
                        var11_10.init(2, (Key)v7.generateSecret(new DESKeySpec(v9)), new IvParameterSpec(new byte[8]));
                        var17_12 = new long[8];
                        var14_13 = 0;
                        var15_14 = "\u00dd\u008d$\u009f\u00e9\f?\u009d\u00bdl\u0093\u00c09\u00feb\u008b\u00c9B\u0004\bO',\u0094\u00cb\u00be>M\u00cb`\u00dc\u00be{X\u0011j\u0017>\u00bdTE{_\u00ce\u00f1\u001f\u00ee4";
                        var16_15 = "\u00dd\u008d$\u009f\u00e9\f?\u009d\u00bdl\u0093\u00c09\u00feb\u008b\u00c9B\u0004\bO',\u0094\u00cb\u00be>M\u00cb`\u00dc\u00be{X\u0011j\u0017>\u00bdTE{_\u00ce\u00f1\u001f\u00ee4".length();
                        var13_16 = 0;
                        while (true) {
                            var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                            v10 = var17_12;
                            v11 = var14_13++;
                            v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                            v13 = -1;
                            break block23;
                            break;
                        }
lbl78:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            var15_14 = "\u00cb\u00cd\u00f8\u00efG\u00b6)\u00ba\u0081\u00cd\u00b8r-v7j";
                            var16_15 = "\u00cb\u00cd\u00f8\u00efG\u00b6)\u00ba\u0081\u00cd\u00b8r-v7j".length();
                            var13_16 = 0;
                            while (true) {
                                var18_17 = var15_14.substring(var13_16, var13_16 += 8).getBytes("ISO-8859-1");
                                v10 = var17_12;
                                v11 = var14_13++;
                                v12 = ((long)var18_17[0] & 255L) << 56 | ((long)var18_17[1] & 255L) << 48 | ((long)var18_17[2] & 255L) << 40 | ((long)var18_17[3] & 255L) << 32 | ((long)var18_17[4] & 255L) << 24 | ((long)var18_17[5] & 255L) << 16 | ((long)var18_17[6] & 255L) << 8 | (long)var18_17[7] & 255L;
                                v13 = 0;
                                break block23;
                                break;
                            }
                            break;
                        }
lbl91:
                        // 1 sources

                        while (true) {
                            v10[v11] = v14;
                            if (var13_16 < var16_15) ** continue;
                            break block24;
                            break;
                        }
                    }
                    var19_18 = v12;
                    var21_19 = var11_10.doFinal(new byte[]{(byte)(var19_18 >>> 56), (byte)(var19_18 >>> 48), (byte)(var19_18 >>> 40), (byte)(var19_18 >>> 32), (byte)(var19_18 >>> 24), (byte)(var19_18 >>> 16), (byte)(var19_18 >>> 8), (byte)var19_18});
                    v14 = ((long)var21_19[0] & 255L) << 56 | ((long)var21_19[1] & 255L) << 48 | ((long)var21_19[2] & 255L) << 40 | ((long)var21_19[3] & 255L) << 32 | ((long)var21_19[4] & 255L) << 24 | ((long)var21_19[5] & 255L) << 16 | ((long)var21_19[6] & 255L) << 8 | (long)var21_19[7] & 255L;
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
                CP_uT.g = var17_12;
                CP_uT.h = new Integer[8];
                CP_uT.l = new HashMap<K, V>(13);
                var0_20 = Cipher.getInstance("DES/CBC/NoPadding");
                v15 = SecretKeyFactory.getInstance("DES");
                v16 = new byte[8];
                v17 = v16;
                v16[0] = (byte)(var22 >>> 56);
                for (var1_21 = 1; var1_21 < 8; ++var1_21) {
                    v17 = v17;
                    v17[var1_21] = (byte)(var22 << var1_21 * 8 >>> 56);
                }
                var0_20.init(2, (Key)v15.generateSecret(new DESKeySpec(v17)), new IvParameterSpec(new byte[8]));
                var6_22 = new long[3];
                var3_23 = 0;
                var4_24 = "\u00eb\b\u00dcOJ\u0006 \u00c1O\u0093\u00d1\u00b1n\u0091\u00f88i\u00d7s5\u008d:\u00f6\\";
                var5_25 = "\u00eb\b\u00dcOJ\u0006 \u00c1O\u0093\u00d1\u00b1n\u0091\u00f88i\u00d7s5\u008d:\u00f6\\".length();
                var2_26 = 0;
                while (true) {
                    break block25;
                    break;
                }
lbl126:
                // 1 sources

                while (true) {
                    var6_22[v18] = ((long)var10_29[0] & 255L) << 56 | ((long)var10_29[1] & 255L) << 48 | ((long)var10_29[2] & 255L) << 40 | ((long)var10_29[3] & 255L) << 32 | ((long)var10_29[4] & 255L) << 24 | ((long)var10_29[5] & 255L) << 16 | ((long)var10_29[6] & 255L) << 8 | (long)var10_29[7] & 255L;
                    if (var2_26 < var5_25) ** continue;
                    break block26;
                    break;
                }
            }
            var7_27 = var4_24.substring(var2_26, var2_26 += 8).getBytes("ISO-8859-1");
            v18 = var3_23++;
            var8_28 = ((long)var7_27[0] & 255L) << 56 | ((long)var7_27[1] & 255L) << 48 | ((long)var7_27[2] & 255L) << 40 | ((long)var7_27[3] & 255L) << 32 | ((long)var7_27[4] & 255L) << 24 | ((long)var7_27[5] & 255L) << 16 | ((long)var7_27[6] & 255L) << 8 | (long)var7_27[7] & 255L;
            var10_29 = var0_20.doFinal(new byte[]{(byte)(var8_28 >>> 56), (byte)(var8_28 >>> 48), (byte)(var8_28 >>> 40), (byte)(var8_28 >>> 32), (byte)(var8_28 >>> 24), (byte)(var8_28 >>> 16), (byte)(var8_28 >>> 8), (byte)var8_28});
            ** while (true)
        }
        CP_uT.j = var6_22;
        CP_uT.k = new Long[3];
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

    private static String a(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x79EE;
        if (e[n2] == null) {
            Object[] objectArray;
            try {
                Long l2 = Thread.currentThread().getId();
                objectArray = (Object[])f.get(l2);
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/PKCS5Padding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    f.put(l2, objectArray);
                }
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CP_uT", exception);
            }
            byte[] byArray = new byte[8];
            byArray[0] = (byte)(l >>> 56);
            for (int i = 1; i < 8; ++i) {
                byArray[i] = (byte)(l << i * 8 >>> 56);
            }
            DESKeySpec dESKeySpec = new DESKeySpec(byArray);
            SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
            ((Cipher)objectArray[0]).init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
            byte[] byArray2 = d[n2].getBytes("ISO-8859-1");
            CP_uT.e[n2] = CP_uT.b(((Cipher)objectArray[0]).doFinal(byArray2));
        }
        return e[n2];
    }

    private static Object a(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        String string2 = CP_uT.a(n, l);
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
            throw new RuntimeException("me/nik/coffeeprotect/CP_uT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static int b(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x3D36;
        if (h[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = g[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])i.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    i.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CP_uT", exception);
            }
            int n3 = (byArray[4] & 0xFF) << 24 | (byArray[5] & 0xFF) << 16 | (byArray[6] & 0xFF) << 8 | byArray[7] & 0xFF;
            CP_uT.h[n2] = n3;
        }
        return h[n2];
    }

    private static int b(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        int n2 = CP_uT.b(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Integer.TYPE, n2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return n2;
    }

    private static CallSite b(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_1().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_uT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    private static long c(int n, long l) {
        int n2 = n ^ (int)(l & 0x7FFFL) ^ 0x7A35;
        if (k[n2] == null) {
            byte[] byArray;
            byte[] byArray2 = new byte[]{(byte)(l >>> 56), (byte)(l >>> 48), (byte)(l >>> 40), (byte)(l >>> 32), (byte)(l >>> 24), (byte)(l >>> 16), (byte)(l >>> 8), (byte)l};
            long l2 = j[n2];
            byte[] byArray3 = new byte[]{(byte)(l2 >>> 56), (byte)(l2 >>> 48), (byte)(l2 >>> 40), (byte)(l2 >>> 32), (byte)(l2 >>> 24), (byte)(l2 >>> 16), (byte)(l2 >>> 8), (byte)l2};
            Long l3 = Thread.currentThread().getId();
            Object[] objectArray = (Object[])CP_uT.l.get(l3);
            try {
                if (objectArray == null) {
                    objectArray = new Object[]{Cipher.getInstance("DES/CBC/NoPadding"), SecretKeyFactory.getInstance("DES"), new IvParameterSpec(new byte[8])};
                    CP_uT.l.put(l3, objectArray);
                }
                DESKeySpec dESKeySpec = new DESKeySpec(byArray2);
                SecretKey secretKey = ((SecretKeyFactory)objectArray[1]).generateSecret(dESKeySpec);
                Cipher cipher = (Cipher)objectArray[0];
                cipher.init(2, (Key)secretKey, (IvParameterSpec)objectArray[2]);
                byArray = cipher.doFinal(byArray3);
            }
            catch (Exception exception) {
                throw new RuntimeException("me/nik/coffeeprotect/CP_uT", exception);
            }
            long l4 = ((long)byArray[0] & 0xFFL) << 56 | ((long)byArray[1] & 0xFFL) << 48 | ((long)byArray[2] & 0xFFL) << 40 | ((long)byArray[3] & 0xFFL) << 32 | ((long)byArray[4] & 0xFFL) << 24 | ((long)byArray[5] & 0xFFL) << 16 | ((long)byArray[6] & 0xFFL) << 8 | (long)byArray[7] & 0xFFL;
            CP_uT.k[n2] = l4;
        }
        return k[n2];
    }

    private static long c(MethodHandles.Lookup lookup, MutableCallSite mutableCallSite, String string, Object[] objectArray) {
        int n = (Integer)objectArray[0];
        long l = (Long)objectArray[1];
        long l2 = CP_uT.c(n, l);
        MethodHandle methodHandle = MethodHandles.constant(Long.TYPE, l2);
        mutableCallSite.setTarget(MethodHandles.dropArguments(methodHandle, 0, new Class[]{Integer.TYPE, Long.TYPE}));
        return l2;
    }

    private static CallSite c(MethodHandles.Lookup lookup, String string, MethodType methodType) {
        MutableCallSite mutableCallSite = new MutableCallSite(methodType);
        try {
            mutableCallSite.setTarget(MethodHandles.explicitCastArguments(MethodHandles.insertArguments(cfr_ldc_2().asCollector(Object[].class, methodType.parameterCount()), 0, lookup, mutableCallSite, string), methodType));
        }
        catch (Exception exception) {
            throw new RuntimeException("me/nik/coffeeprotect/CP_uT" + " : " + string + " : " + methodType.toString(), exception);
        }
        return mutableCallSite;
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_0() {
        try {
            return MethodHandles.lookup().findStatic(CP_uT.class, "a", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/Object;", null));
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
            return MethodHandles.lookup().findStatic(CP_uT.class, "b", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)I", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }

    /*
     * Works around MethodHandle LDC.
     */
    static MethodHandle cfr_ldc_2() {
        try {
            return MethodHandles.lookup().findStatic(CP_uT.class, "c", MethodType.fromMethodDescriptorString("(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/invoke/MutableCallSite;Ljava/lang/String;[Ljava/lang/Object;)J", null));
        }
        catch (NoSuchMethodException | IllegalAccessException except) {
            throw new IllegalArgumentException(except);
        }
    }
}
