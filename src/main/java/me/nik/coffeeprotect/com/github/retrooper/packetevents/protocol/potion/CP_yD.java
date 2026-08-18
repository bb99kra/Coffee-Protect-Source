/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.CP_qL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.potion.StaticPotion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import me.nik.coffeeprotect.libs.jetbrains.annotations.Nullable;

public final class CP_yD {
    private static final VersionedRegistry<CP_qL> CP_n;
    public static final CP_qL CP_t;
    public static final CP_qL CP_h;
    public static final CP_qL CP_A;
    public static final CP_qL CP_e;
    public static final CP_qL CP_w;
    public static final CP_qL CP_k;
    public static final CP_qL CP_K;
    public static final CP_qL CP_M;
    public static final CP_qL CP_U;
    public static final CP_qL CP_X;
    public static final CP_qL CP_Y;
    public static final CP_qL CP_R;
    public static final CP_qL CP_b;
    public static final CP_qL CP_E;
    public static final CP_qL CP_C;
    public static final CP_qL CP_o;
    public static final CP_qL CP_Q;
    public static final CP_qL CP_UnderScore;
    public static final CP_qL CP_N;
    public static final CP_qL CP_s;
    public static final CP_qL CP_I;
    public static final CP_qL CP_j;
    public static final CP_qL CP_S;
    public static final CP_qL CP_q;
    public static final CP_qL CP_J;
    public static final CP_qL CP_f;
    public static final CP_qL CP_v;
    public static final CP_qL CP_W;
    public static final CP_qL CP_Z;
    public static final CP_qL CP_F;
    public static final CP_qL CP_m;
    public static final CP_qL CP_c;
    public static final CP_qL CP_L;
    public static final CP_qL CP_g;
    public static final CP_qL CP_z;
    public static final CP_qL CP_H;
    public static final CP_qL CP_T;
    public static final CP_qL CP_p;
    public static final CP_qL CP_D;
    public static final CP_qL CP_a;
    public static final CP_qL CP_r;
    public static final CP_qL CP_d;
    public static final CP_qL CP_B;
    public static final CP_qL CP_G;
    public static final CP_qL CP_P;
    public static final CP_qL CP_y;
    private static transient /* synthetic */ String JhwRgGfnFO = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_yD() {
    }

    public static VersionedRegistry<CP_qL> CP_Q() {
        return CP_n;
    }

    @ApiStatus.Internal
    public static CP_qL CP_S(String string) {
        return CP_n.define(string, StaticPotion::new);
    }

    @Nullable
    public static CP_qL CP_A(String string) {
        return CP_n.getByName(string);
    }

    @Nullable
    public static CP_qL CP_c(ClientVersion clientVersion, int n) {
        return CP_n.getById(clientVersion, n);
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(-879394342231340564L, -6550562572147671735L, MethodHandles.lookup().lookupClass()).a(157930599189909L) ^ 8959806229971L;
                var1_1 = Cipher.getInstance("DES/CBC/PKCS5Padding");
                v0 = SecretKeyFactory.getInstance("DES");
                v1 = new byte[8];
                v2 = v1;
                v1[0] = (byte)(var9 >>> 56);
                for (var2_2 = 1; var2_2 < 8; ++var2_2) {
                    v2 = v2;
                    v2[var2_2] = (byte)(var9 << var2_2 * 8 >>> 56);
                }
                var1_1.init(2, (Key)v0.generateSecret(new DESKeySpec(v2)), new IvParameterSpec(new byte[8]));
                var0_3 = new String[47];
                var6_4 = 0;
                var5_5 = "\u0092\u001bp\u00f0\u0094\u00cfV\u008e\u0010K\u00c49\u0018\u0096\u00a7\u008al\u00dc\u009f\u00efY\u0085\u00a1\u00a3\u001a\u0010wQqg\u00d3\r\u0011J\u00d1j\u00f2\u00a1\u00e6\u00fe\u00d7\u00b5\u0018G\u0003v\u0018Z\u00d34\u00e4[\u00c0b\u0001Vl\u0084\u0015s}\u00ee\u00fdjn\u00a1D\b\u00b3\u00e2\u009a>&\u008dB\u00d1\u0010\u00a8OG\u00ef\u00b0y\u00acv\u00f9z\u00c5\u00ae\u008b\u0003\u00a3G\u0010\u00de`\u00a7\u00b0\u00aa\u00ce\u00a5=\u009c\u0001%\u0002\u007fP\u00e1{\bZ\u00bc\u0096\u00e5w\u00f0\u00aa;\bF\u00e47\u0012q id\u0010\u00cd\u00cc\u00e0R\u009bx\u0016\u0082\u00c94\u00b81r\u0003o8\u0018@\u00ca9:\u00b5ZD\u00cd\u00ef\u00e3\u00c4\\\u00de\u00d1Iu\\,\u00b1\u0086%[\u00cc9\u0010@\u00af\u0014\u001c<OK\u00f9I\u00ae\u00cc\u00b4e\u00d6\u00a4\u00d9\u0018\u0097]\u00abg\u00006\u00d3\u00b8Z\u00c4hs\u0094\u00e7\u00e1X\u0091\u00ce\fU\u00b8\u00c1I\u00c8\u0018\u00afg\u00cd\u0005\u00cf\u0090\u00e8s\u00e4\u00af\u00af\u0090\u0090\u00a9\u00d4K\u0092#\u008a\u00e3\u0004\u009c\u00a0\u001c\b\u0094Q\u0011\u0096\u00e91\f\u00b9\b\u00fc'\u00b6T\u00c8\u00e3W\u008b\u0010l4\u00b21no\u0016[\t\u00868\u00c8\u00e2^.\u00fb\u0010N\u0097;bU\fq\u00e2t\u00b1<\u00e1\u00cc~\u00de\u0090\b\u00d0\u0096K\u009e\u00c3vG\u00c4\u0010`p0\u0017\u00ce\"\u00dbZx\u0091?s\u0087\u00ec)\u0002\u0018\u009a\u0018\u00a5c\u00fd\u0082\u00abw!\u001eiw\u0094\u0017\u00a7'\u009d\u0015\u00c5\u00c3K\u00af-.\u0010({(<\u00ee\u0093\u000f\b'\u00f5{\u0080'\u00e5\u00db:\b\u00a2Oy>\u0010spT\u0010*\u00da\u0097\u00f6\u00b1<\u00d4z\u00b1\u009bdQ\u0083\u00b0\u00c7l\b\u00ac\u00bcY\u00ef\u007fE\u009b\u00ac\u00104\u00d6\u00da\u00b8\u0099\u0002\u00f8\u007fO\u00db\u00df\u0087-Epr\u0010\u00b1h\u0014\u00ec\u00d4\u00b3\u0088Cf\u00afL\u00a7\u0095P\u009e/\u0010{\u0018\u00dfa\u0082\u00c5\u0000\u0013\u0013\u00c34gaM\u00bb\u0012\u00103\u00d2f`J\u00c0\u00bfiY\u00d3ONG\u00ed\u00e9\u00fb\u0010+\u00fd\u00d05;\u00ba\u007f\u00de\u00fc2\u0086MK\u00a4\u00a2\u007f\u0010\u00cbl\u00ad\u00f5<^\u0098\u0015\u000e\u0089\u00c3\fbp=\u00d7\u0018x\u00a2c-\u00e9\u00f4\u00d5\u00b3\u00d0hXS\u00a7\u00ac#(W\u00a1\u0086\u0011(\u0082\u007f\u0015\b/f\u008a\u00a5V\u0013~\u0098\u0010\u0096G\u00a5_\u0017=\u00fe\\\u00e8w\u0082\u00ee\u00f3\u0010P\u00b1\u0010(\u000f\u00a2\u00a6\u0097h\u00eb4\u00b9\u00c0\u00e4^,\u00d2\u00c3\u00fb\u0018Ks\u00b61\u00e1\u00fd\u00f0H\u00ea\u00b2\u0086\u00cd\"Q\u000b\t\u00a3\u0018\u0086\u00d1E\u0097\u00a3\u0010\u0010(\u000f\u00a2\u00a6\u0097h\u00eb4\u00cc;\u00e0\u00f4\u0083y\u00a2i\u0010{\u0018\u00dfa\u0082\u00c5\u0000\u0013\u00a9*\u00f3I\u00d3\u00e3\u00ec\u0019\u0010\u00dfg4;\u009bK\u00d3v\u00de?l\u008a\u0084K\u00ec\u0019\b\u0019\u0010\u0005\u00ca\u00edH\u00c8\u0014\u0010G\u0003v\u0018Z\u00d34\u00e4\u00e1\u0084\u008b\u0081\u00a0\u00e7\u0003\u00ce\u0018\u0006l\u00d4\u00d1)\u009aw\u00deHQ\u00e3\u00d7L\u0095\u00ba\rFa\u00a4D'h\u00df\u0013\u0010>(wR\u00b7\u00c2\u0006\u00b1\u000f\u0010,\u00ffS9\u009b]\u0018{\u0018\u00dfa\u0082\u00c5\u0000\u0013<\u00c0\u00b0\u00855\u00a4\u0093\u0010\u0000\u00cd\u00d1\u00fbUl\u00f0\u00f6\u0018\r;$\u008dV\u00d5\u00c8\u00fb#Ai|\u00beV\u0094\u00e6{)4\u0000<\u00dd\u00cb#";
                var7_6 = "\u0092\u001bp\u00f0\u0094\u00cfV\u008e\u0010K\u00c49\u0018\u0096\u00a7\u008al\u00dc\u009f\u00efY\u0085\u00a1\u00a3\u001a\u0010wQqg\u00d3\r\u0011J\u00d1j\u00f2\u00a1\u00e6\u00fe\u00d7\u00b5\u0018G\u0003v\u0018Z\u00d34\u00e4[\u00c0b\u0001Vl\u0084\u0015s}\u00ee\u00fdjn\u00a1D\b\u00b3\u00e2\u009a>&\u008dB\u00d1\u0010\u00a8OG\u00ef\u00b0y\u00acv\u00f9z\u00c5\u00ae\u008b\u0003\u00a3G\u0010\u00de`\u00a7\u00b0\u00aa\u00ce\u00a5=\u009c\u0001%\u0002\u007fP\u00e1{\bZ\u00bc\u0096\u00e5w\u00f0\u00aa;\bF\u00e47\u0012q id\u0010\u00cd\u00cc\u00e0R\u009bx\u0016\u0082\u00c94\u00b81r\u0003o8\u0018@\u00ca9:\u00b5ZD\u00cd\u00ef\u00e3\u00c4\\\u00de\u00d1Iu\\,\u00b1\u0086%[\u00cc9\u0010@\u00af\u0014\u001c<OK\u00f9I\u00ae\u00cc\u00b4e\u00d6\u00a4\u00d9\u0018\u0097]\u00abg\u00006\u00d3\u00b8Z\u00c4hs\u0094\u00e7\u00e1X\u0091\u00ce\fU\u00b8\u00c1I\u00c8\u0018\u00afg\u00cd\u0005\u00cf\u0090\u00e8s\u00e4\u00af\u00af\u0090\u0090\u00a9\u00d4K\u0092#\u008a\u00e3\u0004\u009c\u00a0\u001c\b\u0094Q\u0011\u0096\u00e91\f\u00b9\b\u00fc'\u00b6T\u00c8\u00e3W\u008b\u0010l4\u00b21no\u0016[\t\u00868\u00c8\u00e2^.\u00fb\u0010N\u0097;bU\fq\u00e2t\u00b1<\u00e1\u00cc~\u00de\u0090\b\u00d0\u0096K\u009e\u00c3vG\u00c4\u0010`p0\u0017\u00ce\"\u00dbZx\u0091?s\u0087\u00ec)\u0002\u0018\u009a\u0018\u00a5c\u00fd\u0082\u00abw!\u001eiw\u0094\u0017\u00a7'\u009d\u0015\u00c5\u00c3K\u00af-.\u0010({(<\u00ee\u0093\u000f\b'\u00f5{\u0080'\u00e5\u00db:\b\u00a2Oy>\u0010spT\u0010*\u00da\u0097\u00f6\u00b1<\u00d4z\u00b1\u009bdQ\u0083\u00b0\u00c7l\b\u00ac\u00bcY\u00ef\u007fE\u009b\u00ac\u00104\u00d6\u00da\u00b8\u0099\u0002\u00f8\u007fO\u00db\u00df\u0087-Epr\u0010\u00b1h\u0014\u00ec\u00d4\u00b3\u0088Cf\u00afL\u00a7\u0095P\u009e/\u0010{\u0018\u00dfa\u0082\u00c5\u0000\u0013\u0013\u00c34gaM\u00bb\u0012\u00103\u00d2f`J\u00c0\u00bfiY\u00d3ONG\u00ed\u00e9\u00fb\u0010+\u00fd\u00d05;\u00ba\u007f\u00de\u00fc2\u0086MK\u00a4\u00a2\u007f\u0010\u00cbl\u00ad\u00f5<^\u0098\u0015\u000e\u0089\u00c3\fbp=\u00d7\u0018x\u00a2c-\u00e9\u00f4\u00d5\u00b3\u00d0hXS\u00a7\u00ac#(W\u00a1\u0086\u0011(\u0082\u007f\u0015\b/f\u008a\u00a5V\u0013~\u0098\u0010\u0096G\u00a5_\u0017=\u00fe\\\u00e8w\u0082\u00ee\u00f3\u0010P\u00b1\u0010(\u000f\u00a2\u00a6\u0097h\u00eb4\u00b9\u00c0\u00e4^,\u00d2\u00c3\u00fb\u0018Ks\u00b61\u00e1\u00fd\u00f0H\u00ea\u00b2\u0086\u00cd\"Q\u000b\t\u00a3\u0018\u0086\u00d1E\u0097\u00a3\u0010\u0010(\u000f\u00a2\u00a6\u0097h\u00eb4\u00cc;\u00e0\u00f4\u0083y\u00a2i\u0010{\u0018\u00dfa\u0082\u00c5\u0000\u0013\u00a9*\u00f3I\u00d3\u00e3\u00ec\u0019\u0010\u00dfg4;\u009bK\u00d3v\u00de?l\u008a\u0084K\u00ec\u0019\b\u0019\u0010\u0005\u00ca\u00edH\u00c8\u0014\u0010G\u0003v\u0018Z\u00d34\u00e4\u00e1\u0084\u008b\u0081\u00a0\u00e7\u0003\u00ce\u0018\u0006l\u00d4\u00d1)\u009aw\u00deHQ\u00e3\u00d7L\u0095\u00ba\rFa\u00a4D'h\u00df\u0013\u0010>(wR\u00b7\u00c2\u0006\u00b1\u000f\u0010,\u00ffS9\u009b]\u0018{\u0018\u00dfa\u0082\u00c5\u0000\u0013<\u00c0\u00b0\u00855\u00a4\u0093\u0010\u0000\u00cd\u00d1\u00fbUl\u00f0\u00f6\u0018\r;$\u008dV\u00d5\u00c8\u00fb#Ai|\u00beV\u0094\u00e6{)4\u0000<\u00dd\u00cb#".length();
                var4_7 = 8;
                var3_8 = -1;
lbl18:
                // 2 sources

                while (true) {
                    v3 = ++var3_8;
                    v4 = var5_5.substring(v3, v3 + var4_7);
                    v5 = -1;
                    break block10;
                    break;
                }
lbl23:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_yD.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\b\u00a3B-\u00b9<o\u00b0\u00f5\u00ee\u00b7\\;bD\u009e\bZ\u00e54\u0091\u0097qQ\u0005";
                    var7_6 = "\b\u00a3B-\u00b9<o\u00b0\u00f5\u00ee\u00b7\\;bD\u009e\bZ\u00e54\u0091\u0097qQ\u0005".length();
                    var4_7 = 16;
                    var3_8 = -1;
lbl32:
                    // 2 sources

                    while (true) {
                        v6 = ++var3_8;
                        v4 = var5_5.substring(v6, v6 + var4_7);
                        v5 = 0;
                        break block10;
                        break;
                    }
                    break;
                }
lbl37:
                // 1 sources

                while (true) {
                    var0_3[var6_4++] = CP_yD.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    break block11;
                    break;
                }
            }
            var8_9 = var1_1.doFinal(v4.getBytes("ISO-8859-1"));
            switch (v5) {
                default: {
                    ** continue;
                }
                ** case 0:
lbl49:
                // 1 sources

                ** continue;
            }
        }
        CP_yD.CP_n = new VersionedRegistry<T>(var0_3[24]);
        CP_yD.CP_t = CP_yD.CP_S(var0_3[14]);
        CP_yD.CP_h = CP_yD.CP_S(var0_3[8]);
        CP_yD.CP_A = CP_yD.CP_S(var0_3[15]);
        CP_yD.CP_e = CP_yD.CP_S(var0_3[4]);
        CP_yD.CP_w = CP_yD.CP_S(var0_3[19]);
        CP_yD.CP_k = CP_yD.CP_S(var0_3[12]);
        CP_yD.CP_K = CP_yD.CP_S(var0_3[33]);
        CP_yD.CP_M = CP_yD.CP_S(var0_3[20]);
        CP_yD.CP_U = CP_yD.CP_S(var0_3[39]);
        CP_yD.CP_X = CP_yD.CP_S(var0_3[23]);
        CP_yD.CP_Y = CP_yD.CP_S(var0_3[30]);
        CP_yD.CP_R = CP_yD.CP_S(var0_3[38]);
        CP_yD.CP_b = CP_yD.CP_S(var0_3[35]);
        CP_yD.CP_E = CP_yD.CP_S(var0_3[26]);
        CP_yD.CP_C = CP_yD.CP_S(var0_3[16]);
        CP_yD.CP_o = CP_yD.CP_S(var0_3[43]);
        CP_yD.CP_Q = CP_yD.CP_S(var0_3[25]);
        CP_yD.CP_UnderScore = CP_yD.CP_S(var0_3[40]);
        CP_yD.CP_N = CP_yD.CP_S(var0_3[27]);
        CP_yD.CP_s = CP_yD.CP_S(var0_3[5]);
        CP_yD.CP_I = CP_yD.CP_S(var0_3[31]);
        CP_yD.CP_j = CP_yD.CP_S(var0_3[10]);
        CP_yD.CP_S = CP_yD.CP_S(var0_3[29]);
        CP_yD.CP_q = CP_yD.CP_S(var0_3[41]);
        CP_yD.CP_J = CP_yD.CP_S(var0_3[18]);
        CP_yD.CP_f = CP_yD.CP_S(var0_3[36]);
        CP_yD.CP_v = CP_yD.CP_S(var0_3[0]);
        CP_yD.CP_W = CP_yD.CP_S(var0_3[34]);
        CP_yD.CP_Z = CP_yD.CP_S(var0_3[7]);
        CP_yD.CP_F = CP_yD.CP_S(var0_3[2]);
        CP_yD.CP_m = CP_yD.CP_S(var0_3[11]);
        CP_yD.CP_c = CP_yD.CP_S(var0_3[6]);
        CP_yD.CP_L = CP_yD.CP_S(var0_3[13]);
        CP_yD.CP_g = CP_yD.CP_S(var0_3[44]);
        CP_yD.CP_z = CP_yD.CP_S(var0_3[17]);
        CP_yD.CP_H = CP_yD.CP_S(var0_3[21]);
        CP_yD.CP_T = CP_yD.CP_S(var0_3[37]);
        CP_yD.CP_p = CP_yD.CP_S(var0_3[28]);
        CP_yD.CP_D = CP_yD.CP_S(var0_3[1]);
        CP_yD.CP_a = CP_yD.CP_S(var0_3[32]);
        CP_yD.CP_r = CP_yD.CP_S(var0_3[45]);
        CP_yD.CP_d = CP_yD.CP_S(var0_3[3]);
        CP_yD.CP_B = CP_yD.CP_S(var0_3[42]);
        CP_yD.CP_G = CP_yD.CP_S(var0_3[22]);
        CP_yD.CP_P = CP_yD.CP_S(var0_3[46]);
        CP_yD.CP_y = CP_yD.CP_S(var0_3[9]);
        CP_yD.CP_n.unloadMappings();
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
}

