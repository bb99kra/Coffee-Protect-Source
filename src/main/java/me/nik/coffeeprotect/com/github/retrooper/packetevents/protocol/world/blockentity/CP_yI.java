/*
 * Decompiled with CFR 0.152.
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity;

import java.lang.invoke.MethodHandles;
import java.security.Key;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.player.ClientVersion;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity.CP_CL;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.blockentity.StaticBlockEntityType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;

public final class CP_yI {
    private static final VersionedRegistry<CP_CL> CP_f;
    public static final CP_CL CP_h;
    public static final CP_CL CP_m;
    public static final CP_CL CP_e;
    public static final CP_CL CP_q;
    public static final CP_CL CP_M;
    public static final CP_CL CP_c;
    public static final CP_CL CP_Z;
    public static final CP_CL CP_J;
    public static final CP_CL CP_D;
    public static final CP_CL CP_A;
    public static final CP_CL CP_UnderScore;
    public static final CP_CL CP_S;
    public static final CP_CL CP_w;
    public static final CP_CL CP_V;
    public static final CP_CL CP_o;
    public static final CP_CL CP_L;
    public static final CP_CL CP_s;
    public static final CP_CL CP_I;
    public static final CP_CL CP_t;
    public static final CP_CL CP_X;
    public static final CP_CL CP_T;
    public static final CP_CL CP_G;
    public static final CP_CL CP_g;
    public static final CP_CL CP_E;
    public static final CP_CL CP_x;
    public static final CP_CL CP_R;
    public static final CP_CL CP_B;
    public static final CP_CL CP_O;
    public static final CP_CL CP_F;
    public static final CP_CL CP_C;
    public static final CP_CL CP_Q;
    public static final CP_CL CP_P;
    public static final CP_CL CP_H;
    public static final CP_CL CP_W;
    public static final CP_CL CP_b;
    public static final CP_CL CP_l;
    public static final CP_CL CP_u;
    public static final CP_CL CP_i;
    public static final CP_CL CP_U;
    @ApiStatus.Obsolete
    public static final CP_CL CP_y;
    public static final CP_CL CP_k;
    public static final CP_CL CP_z;
    public static final CP_CL CP_d;
    public static final CP_CL CP_K;
    public static final CP_CL CP_v;
    public static final CP_CL CP_Y;
    public static final CP_CL CP_p;
    public static final CP_CL CP_N;
    public static final CP_CL CP_a;
    public static final CP_CL CP_r;
    private static transient /* synthetic */ String XzJizhziPI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_yI() {
    }

    private static CP_CL CP_z(String string) {
        return CP_f.define(string, StaticBlockEntityType::new);
    }

    public static VersionedRegistry<CP_CL> CP_T() {
        return CP_f;
    }

    public static CP_CL CP_h(String string) {
        return CP_f.getByName(string);
    }

    public static CP_CL CP_v(ClientVersion clientVersion, int n) {
        return CP_f.getById(clientVersion, n);
    }

    public static Collection<CP_CL> CP_x() {
        return CP_f.getEntries();
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s.a(-9209632659852278844L, -8282848762302481791L, MethodHandles.lookup().lookupClass()).a(132346407677785L) ^ 46843101403965L;
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
                var0_3 = new String[51];
                var6_4 = 0;
                var5_5 = "(\u00af\u00e3\u00d3%2\u00179\b\u0017\u00b5\u008d\u00c4=\u00a4\r\u00f6\u0010\u000e\u00e7\u00bd \u00c4gD\u00f7>\u00c6\u0087\u00b7=\u00e31^\b\u00bc\u00d5\\(EP\u0005\u0000\bl\u000f\u00ef\u00c4R\u00cc\u00f0\u00a6\b\u00ea-\u009d\u0005\bV\u00dcr\u0018w\u00ff\u00c7\u00fb\u00a1?q\u00b5\u00c8\u0080\f\u00a1W\u001b\u001a\u00ff5\u00d3\u000f\u00a7\u00fa<\u00f8#\u0010z\u00ef\u00912\u0095\u00e8\u00cb\u00cf\u008e\u00df\u008d\u0007\u00daZ\u008c\u00f6\u0010=u\"\u001c\u00de\u0096`F[\tg\u0005>\u00a7\u00c1\u00a9\u0010C\u00a6&\u0016\u00ecl)\u00da\u00b9k\u007f\u0002(|}s\u0010\u0010\u0086\u00a0\u0004\u0002\u00f0\u00d5+C\u008a-\u00ea>\u00e6$L\u00188!\u00a7e\u0080$\u00b3\u0014r\u00bcw\n+\u009f\u009fg\u00c6\u00c9\u00bd\u00acoD\u00e28\b7\u00ff\u00a5\u00b4d\u00a2\u00e5\u00c7\u0010\u0006\t\u00b4?6\u00f9\u00ed\u0014\u00da\u00ee\u009d\u00c2hkRL\u0018\u00b6\u00fe\u0003V\u00e2\u00075c\u001d,\u00b2\u0093A\u0006\u00aa~}\u00c5\u001f\u00c2\u0000\b\u00eaM\u0018\u00d60\u0007\u000er?\u00c8\u00b1\u00c0\u00b5l\u00f8 \u009aZo\u00d2\u00c6\u00d5\u00e5Y\u0003A\u00d8\u0010\u008e\u0082rs\u00ae\u009a\u00a0F\u0096jF\u00b5\u0018\u00b7\u0082\u00ef\u00100\u009e\u00cb@\u0011\u0013@\u00a5\u00bc\u00aa\u00ffL\u0016/\u00e0\u00f2\b\u0084c\u0007<Es\u0098!\u0018j\u00c9\bw\u00a3\u00c3\u00b8\t\u001d\u00c5#G0t;:sb2T\u0080\u009f\u0091C\u0010\u00d2gJLR\u00d3\u00c9\u00c3\u00f5\u0002O0\u001e\u0080\u0015\u00a9\b8\u008a\u00f2OJ\u00c3\"r\b\u00cbV$J\u00d2\u00989\u00e1\u0010J7\u00ca\u0010\b\u00cfm;\u009fwc\u00d1\u008fF\u0088\u00cc\u0010]\u00d4\u00dc\u00f4pH\u00ab\u001c\u00c7\u00a9%\u00ef\u00f8I\u008f\u0000\u0010e51r\u0088ar\u00ec\u0013\u001aeiTg\u00f3j\u0010\u00f7\u00c8\u00c0d\u00f7\u00ef\u0093\u00cc\u0003\u00eb\u00b4|\u008a\u00c7\u00f3&\b*3F\u00a9AN\u00ca<\bTHZ}\u0005\u00e0\u0005\u00e9\u0018\u00c1,\u00d7\u00d2Ad\u001f\u00b3p\u00fc\u00cb\u000eTxc\u00af\u009b\u00da+^\u00a8\u00a3\u00ff\u0003\u0010]`\u00e3\u0087\u00d0\u008a~\u00ad\u00ec\u00eaT\u00f4\u001dw\u00b0\u001b\u0010S\u0005\u0099tX\u00b9C\u00a9\u0096\u00f8\u00ebe\u0007\u00d98\u00bc\b\u008c\u00be\u00ca\u00bbj\u0097\u00d9'\b\u00e0\u00damV\u00fcb\u00c9,\b\u00d8lm\u00bfH\u00118\u0019\u0010\nd\u00921\u0090\u00e2\u00d0h\u00c8<\u0089\u0083\u00c1Dac\u0010\u00fb\u00dd\u00a6!\u0019\u00baY\u0089\u00ac\u0018\u0014H(R<\u00bb\b\u00bf\u00a7I\u00d4\u00feI\u00e5\u00d8\u0010\u0005\u00ed\u000bUy|\u0013/)G\u00a1g\u00f2XC\u0089\b$\u0097@\u00c7\u00e9@\u00cd\u00ca\u0010\u00cfg\u0004\u0003\u00e8\u00ff\u00c7\u00ba\u0087?$+\u00a3c\u0080]\b>\u00ee\u00a0\u00b2 0\u00c2\u00e6\u0010\u00af|B\u0087\u00b9bs\n\u00f8\"\u00f0\u00cdJ\u009e\u0005\u0010\b  \u001c\u00f8\u00c6\u00c3\u00d8\u00df\b\u00aa\u00cfh\u000fM\u0099?\u0001\u0010\u00e6E'_\u00e3\u00ceNE\u007f.m\u00ee\u000ef\"\u000e\b\u0019\u00e1\u0085\u00b8\u00cb\u00d9\u001b2\u0010f\u00b0\u0010\u00d5@\u00c6\u00eb\u0018\u00c0\u0091\u00fc|\u00ac\u00c5\u0094\u0082\u0010^\u00a7\u008a\u00d3\u00b4\u00916\u00c7\t\u0006\u00ff~`O;o";
                var7_6 = "(\u00af\u00e3\u00d3%2\u00179\b\u0017\u00b5\u008d\u00c4=\u00a4\r\u00f6\u0010\u000e\u00e7\u00bd \u00c4gD\u00f7>\u00c6\u0087\u00b7=\u00e31^\b\u00bc\u00d5\\(EP\u0005\u0000\bl\u000f\u00ef\u00c4R\u00cc\u00f0\u00a6\b\u00ea-\u009d\u0005\bV\u00dcr\u0018w\u00ff\u00c7\u00fb\u00a1?q\u00b5\u00c8\u0080\f\u00a1W\u001b\u001a\u00ff5\u00d3\u000f\u00a7\u00fa<\u00f8#\u0010z\u00ef\u00912\u0095\u00e8\u00cb\u00cf\u008e\u00df\u008d\u0007\u00daZ\u008c\u00f6\u0010=u\"\u001c\u00de\u0096`F[\tg\u0005>\u00a7\u00c1\u00a9\u0010C\u00a6&\u0016\u00ecl)\u00da\u00b9k\u007f\u0002(|}s\u0010\u0010\u0086\u00a0\u0004\u0002\u00f0\u00d5+C\u008a-\u00ea>\u00e6$L\u00188!\u00a7e\u0080$\u00b3\u0014r\u00bcw\n+\u009f\u009fg\u00c6\u00c9\u00bd\u00acoD\u00e28\b7\u00ff\u00a5\u00b4d\u00a2\u00e5\u00c7\u0010\u0006\t\u00b4?6\u00f9\u00ed\u0014\u00da\u00ee\u009d\u00c2hkRL\u0018\u00b6\u00fe\u0003V\u00e2\u00075c\u001d,\u00b2\u0093A\u0006\u00aa~}\u00c5\u001f\u00c2\u0000\b\u00eaM\u0018\u00d60\u0007\u000er?\u00c8\u00b1\u00c0\u00b5l\u00f8 \u009aZo\u00d2\u00c6\u00d5\u00e5Y\u0003A\u00d8\u0010\u008e\u0082rs\u00ae\u009a\u00a0F\u0096jF\u00b5\u0018\u00b7\u0082\u00ef\u00100\u009e\u00cb@\u0011\u0013@\u00a5\u00bc\u00aa\u00ffL\u0016/\u00e0\u00f2\b\u0084c\u0007<Es\u0098!\u0018j\u00c9\bw\u00a3\u00c3\u00b8\t\u001d\u00c5#G0t;:sb2T\u0080\u009f\u0091C\u0010\u00d2gJLR\u00d3\u00c9\u00c3\u00f5\u0002O0\u001e\u0080\u0015\u00a9\b8\u008a\u00f2OJ\u00c3\"r\b\u00cbV$J\u00d2\u00989\u00e1\u0010J7\u00ca\u0010\b\u00cfm;\u009fwc\u00d1\u008fF\u0088\u00cc\u0010]\u00d4\u00dc\u00f4pH\u00ab\u001c\u00c7\u00a9%\u00ef\u00f8I\u008f\u0000\u0010e51r\u0088ar\u00ec\u0013\u001aeiTg\u00f3j\u0010\u00f7\u00c8\u00c0d\u00f7\u00ef\u0093\u00cc\u0003\u00eb\u00b4|\u008a\u00c7\u00f3&\b*3F\u00a9AN\u00ca<\bTHZ}\u0005\u00e0\u0005\u00e9\u0018\u00c1,\u00d7\u00d2Ad\u001f\u00b3p\u00fc\u00cb\u000eTxc\u00af\u009b\u00da+^\u00a8\u00a3\u00ff\u0003\u0010]`\u00e3\u0087\u00d0\u008a~\u00ad\u00ec\u00eaT\u00f4\u001dw\u00b0\u001b\u0010S\u0005\u0099tX\u00b9C\u00a9\u0096\u00f8\u00ebe\u0007\u00d98\u00bc\b\u008c\u00be\u00ca\u00bbj\u0097\u00d9'\b\u00e0\u00damV\u00fcb\u00c9,\b\u00d8lm\u00bfH\u00118\u0019\u0010\nd\u00921\u0090\u00e2\u00d0h\u00c8<\u0089\u0083\u00c1Dac\u0010\u00fb\u00dd\u00a6!\u0019\u00baY\u0089\u00ac\u0018\u0014H(R<\u00bb\b\u00bf\u00a7I\u00d4\u00feI\u00e5\u00d8\u0010\u0005\u00ed\u000bUy|\u0013/)G\u00a1g\u00f2XC\u0089\b$\u0097@\u00c7\u00e9@\u00cd\u00ca\u0010\u00cfg\u0004\u0003\u00e8\u00ff\u00c7\u00ba\u0087?$+\u00a3c\u0080]\b>\u00ee\u00a0\u00b2 0\u00c2\u00e6\u0010\u00af|B\u0087\u00b9bs\n\u00f8\"\u00f0\u00cdJ\u009e\u0005\u0010\b  \u001c\u00f8\u00c6\u00c3\u00d8\u00df\b\u00aa\u00cfh\u000fM\u0099?\u0001\u0010\u00e6E'_\u00e3\u00ceNE\u007f.m\u00ee\u000ef\"\u000e\b\u0019\u00e1\u0085\u00b8\u00cb\u00d9\u001b2\u0010f\u00b0\u0010\u00d5@\u00c6\u00eb\u0018\u00c0\u0091\u00fc|\u00ac\u00c5\u0094\u0082\u0010^\u00a7\u008a\u00d3\u00b4\u00916\u00c7\t\u0006\u00ff~`O;o".length();
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
                    var0_3[var6_4++] = CP_yI.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "\u008e\u00c6\u000bu\n}\u00b2\u00a0\u0018V\u009c\u00a8\u0096\u009eBJ\u00b1\u000e\u00e0>_\\\u00e3{\u00b2\u0013(\u00b4N\u00f40\u00bbW";
                    var7_6 = "\u008e\u00c6\u000bu\n}\u00b2\u00a0\u0018V\u009c\u00a8\u0096\u009eBJ\u00b1\u000e\u00e0>_\\\u00e3{\u00b2\u0013(\u00b4N\u00f40\u00bbW".length();
                    var4_7 = 8;
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
                    var0_3[var6_4++] = CP_yI.a(var8_9).intern();
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
        CP_yI.CP_f = new VersionedRegistry<T>(var0_3[15]);
        CP_yI.CP_h = CP_yI.CP_z(var0_3[41]);
        CP_yI.CP_m = CP_yI.CP_z(var0_3[34]);
        CP_yI.CP_e = CP_yI.CP_z(var0_3[24]);
        CP_yI.CP_q = CP_yI.CP_z(var0_3[9]);
        CP_yI.CP_M = CP_yI.CP_z(var0_3[37]);
        CP_yI.CP_c = CP_yI.CP_z(var0_3[40]);
        CP_yI.CP_Z = CP_yI.CP_z(var0_3[22]);
        CP_yI.CP_J = CP_yI.CP_z(var0_3[39]);
        CP_yI.CP_D = CP_yI.CP_z(var0_3[7]);
        CP_yI.CP_A = CP_yI.CP_z(var0_3[48]);
        CP_yI.CP_UnderScore = CP_yI.CP_z(var0_3[33]);
        CP_yI.CP_S = CP_yI.CP_z(var0_3[47]);
        CP_yI.CP_w = CP_yI.CP_z(var0_3[29]);
        CP_yI.CP_V = CP_yI.CP_z(var0_3[38]);
        CP_yI.CP_o = CP_yI.CP_z(var0_3[5]);
        CP_yI.CP_L = CP_yI.CP_z(var0_3[49]);
        CP_yI.CP_s = CP_yI.CP_z(var0_3[11]);
        CP_yI.CP_I = CP_yI.CP_z(var0_3[4]);
        CP_yI.CP_t = CP_yI.CP_z(var0_3[13]);
        CP_yI.CP_X = CP_yI.CP_z(var0_3[43]);
        CP_yI.CP_T = CP_yI.CP_z(var0_3[23]);
        CP_yI.CP_G = CP_yI.CP_z(var0_3[42]);
        CP_yI.CP_g = CP_yI.CP_z(var0_3[31]);
        CP_yI.CP_E = CP_yI.CP_z(var0_3[20]);
        CP_yI.CP_x = CP_yI.CP_z(var0_3[44]);
        CP_yI.CP_R = CP_yI.CP_z(var0_3[21]);
        CP_yI.CP_B = CP_yI.CP_z(var0_3[32]);
        CP_yI.CP_O = CP_yI.CP_z(var0_3[28]);
        CP_yI.CP_F = CP_yI.CP_z(var0_3[30]);
        CP_yI.CP_C = CP_yI.CP_z(var0_3[18]);
        CP_yI.CP_Q = CP_yI.CP_z(var0_3[46]);
        CP_yI.CP_P = CP_yI.CP_z(var0_3[0]);
        CP_yI.CP_H = CP_yI.CP_z(var0_3[25]);
        CP_yI.CP_W = CP_yI.CP_z(var0_3[12]);
        CP_yI.CP_b = CP_yI.CP_z(var0_3[10]);
        CP_yI.CP_l = CP_yI.CP_z(var0_3[6]);
        CP_yI.CP_u = CP_yI.CP_z(var0_3[2]);
        CP_yI.CP_i = CP_yI.CP_z(var0_3[35]);
        CP_yI.CP_U = CP_yI.CP_z(var0_3[14]);
        CP_yI.CP_y = CP_yI.CP_z(var0_3[26]);
        CP_yI.CP_k = CP_yI.CP_z(var0_3[8]);
        CP_yI.CP_z = CP_yI.CP_z(var0_3[17]);
        CP_yI.CP_d = CP_yI.CP_z(var0_3[3]);
        CP_yI.CP_K = CP_yI.CP_z(var0_3[16]);
        CP_yI.CP_v = CP_yI.CP_z(var0_3[1]);
        CP_yI.CP_Y = CP_yI.CP_z(var0_3[45]);
        CP_yI.CP_p = CP_yI.CP_z(var0_3[36]);
        CP_yI.CP_N = CP_yI.CP_z(var0_3[50]);
        CP_yI.CP_a = CP_yI.CP_z(var0_3[27]);
        CP_yI.CP_r = CP_yI.CP_z(var0_3[19]);
        CP_yI.CP_f.unloadMappings();
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

