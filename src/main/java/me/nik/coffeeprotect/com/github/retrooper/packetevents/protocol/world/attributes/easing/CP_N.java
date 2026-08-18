/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NullMarked
 */
package me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing;

import java.lang.invoke.LambdaMetafactory;
import java.lang.invoke.MethodHandles;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.IvParameterSpec;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_Al;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.StaticEasingType;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.CP_hB;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.TypesBuilderData;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.util.mappings.VersionedRegistry;
import me.nik.coffeeprotect.com.github.retrooper.packetevents.wrapper.CP_s;
import me.nik.coffeeprotect.libs.jetbrains.annotations.ApiStatus;
import org.jspecify.annotations.NullMarked;

@NullMarked
public final class CP_N {
    private static final VersionedRegistry<CP_Al> CP_R;
    public static final CP_Al CP_q;
    public static final CP_Al CP_w;
    public static final CP_Al CP_UnderScore;
    public static final CP_Al CP_D;
    public static final CP_Al CP_K;
    public static final CP_Al CP_Z;
    public static final CP_Al CP_A;
    public static final CP_Al CP_I;
    public static final CP_Al CP_U;
    public static final CP_Al CP_f;
    public static final CP_Al CP_N;
    public static final CP_Al CP_y;
    public static final CP_Al CP_b;
    public static final CP_Al CP_a;
    public static final CP_Al CP_C;
    public static final CP_Al CP_r;
    public static final CP_Al CP_B;
    public static final CP_Al CP_Y;
    public static final CP_Al CP_o;
    public static final CP_Al CP_u;
    public static final CP_Al CP_c;
    public static final CP_Al CP_W;
    public static final CP_Al CP_S;
    public static final CP_Al CP_M;
    public static final CP_Al CP_P;
    public static final CP_Al CP_t;
    public static final CP_Al CP_T;
    public static final CP_Al CP_k;
    public static final CP_Al CP_d;
    public static final CP_Al CP_V;
    public static final CP_Al CP_Q;
    public static final CP_Al CP_E;
    private static transient /* synthetic */ String NGOvQKupPI = "4ke1LtZcTsZhhrNjbc5YgpMFiBc3gyeJo7/AqXBycJU=";

    private CP_N() {
    }

    @ApiStatus.Internal
    public static CP_Al CP_W(String string, CP_hB ilIlhB) {
        return CP_R.define(string, typesBuilderData -> new StaticEasingType((TypesBuilderData)typesBuilderData, ilIlhB));
    }

    public static VersionedRegistry<CP_Al> CP_j() {
        return CP_R;
    }

    /*
     * Unable to fully structure code
     */
    static {
        block11: {
            block10: {
                var9 = CP_s.a(-2380229530161787523L, -7793185023871328816L, MethodHandles.lookup().lookupClass()).a(214614303979500L) ^ 112034002848861L;
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
                var0_3 = new String[33];
                var6_4 = 0;
                var5_5 = "\r\u0081du\u0094\u00eb#o\u00ec\u00fb\u00e1\u00d6\u00ba<.\u00c3\u0010R\u0096y\u00e9)\u00d4?z\u0080j);p_\u00eb\u00b6\u0010\u0094\"\t\u00c7\u00cb\u00ab}O\u009c\u009c\u00ee\u00cbJ}\u00ad\u00c7\u0010\u0099\u009a'\u00d0\u00e5(\u000e7Dz\u00e2\u000e\u0084\u00ddw\u00a4\b\u00daE\u0083\u00a6\u00f0/\u00c8\u0007\u0010[<J\u009d\u00fc\u001dzkB\u00f7\u001b\n\u00f1s\u00a5|\u0010\u00a0\u00e8\u008e^\u009f\u00de\u00c9\u00e8\u00b0W`e\u00c3\u00fd\u00f4~\u0010\u001e\u00e8\u008dU\u00a1\u00ba\u001e\u0014g\u00dd\u00bfK\u00d2\u0095\u00bd\u0010\u00103\u00d5h\u0017\u0004\u00ab:\u0002\u001c\u00de\u00b4\u00e72\u00a9Z7\u0010{n\u0016\u00b7U!P\u00b4\u00bd\u0001\u0000\u0016k^\u0094\u0015\u0010\u00be\u00e5)\u00ad\u00062vF\u00f97{\u0004V\u0087l\u00be\b\u009c\u00efV\u00b4b?\u001eF\b\u00a1\u00f4\u0087\u00d2\u00ff\u0097\u00e7\u00d2\u0010!\u0011z`\u0091\u00bb\u0092\u00c0\u00c43,'\u0097\u008c\u00ec\u0087\b\u00b1\u0096\u0082\u009f\u00af\u009c\u00b7\u00bc\u0010[<J\u009d\u00fc\u001dzk\u00a4\t$l\u00cb\u00acw\u0095\u0010oh\u00fe\u00bflB.\u00e5\u009e\u00b0lB\u00b1\u00b3o\u00b1\b\u00f0)GfaJ0\u0010\u0010@\u009a4V\u0094\u00b5\u0099\u0004\u00e64d\u009f\u00af-\u0087\u0011\u0010[<J\u009d\u00fc\u001dzk\u00ba\u00f4\u000e\u008b\u00e2\u00f2<}\u0010I\u009eD\u008d\u00e5\u00d7.\u00b8++|\u00ca\u009d\u0019\u00b5N\u0010\u00d6\u00ab '\u00f5=\u00cdhk\u00bej'\u00d5\u00e1\u001fz\u0010,@x'O\u00c5.;\u00a4\u00d0p\u00f8\u00e7\u00b1\u00c2E\u0010pb<m=\u009a\u00ed(\u0001i\u0000\u00e0\u001e\u00b2A\u00f1\u00103\u00d5h\u0017\u0004\u00ab:\u0002\u007fB@G:\u008ck/\u0010@\u009a4V\u0094\u00b5\u0099\u0004\u00a6\u0097\u0096\u00a5WT\u00e3\u0094\b?\u00d6\u0006\r \u00d1\u001ar\u0010\u008aW\t\u0091\u0001\u00b4\u00f7\u0094\u00d7\u00c9\u001c\u0095\u0086\u0085\u00c19\u0010Y\u00aa\u009b#\u00fc\\\u00f4\u00c9\u009e\u00b0Z\u0099O\u00e9F\u00b5\u0010\u00bbU\u00fc\u0015a\u00c7\u001fub\u00b7D\u00f5\u00c4\u0006\u0013\u001a\u0010Ia\u00a4\u001fr\u0017gR\u00fc\u0080A\u0013\u009fa\u00d7\u00f3";
                var7_6 = "\r\u0081du\u0094\u00eb#o\u00ec\u00fb\u00e1\u00d6\u00ba<.\u00c3\u0010R\u0096y\u00e9)\u00d4?z\u0080j);p_\u00eb\u00b6\u0010\u0094\"\t\u00c7\u00cb\u00ab}O\u009c\u009c\u00ee\u00cbJ}\u00ad\u00c7\u0010\u0099\u009a'\u00d0\u00e5(\u000e7Dz\u00e2\u000e\u0084\u00ddw\u00a4\b\u00daE\u0083\u00a6\u00f0/\u00c8\u0007\u0010[<J\u009d\u00fc\u001dzkB\u00f7\u001b\n\u00f1s\u00a5|\u0010\u00a0\u00e8\u008e^\u009f\u00de\u00c9\u00e8\u00b0W`e\u00c3\u00fd\u00f4~\u0010\u001e\u00e8\u008dU\u00a1\u00ba\u001e\u0014g\u00dd\u00bfK\u00d2\u0095\u00bd\u0010\u00103\u00d5h\u0017\u0004\u00ab:\u0002\u001c\u00de\u00b4\u00e72\u00a9Z7\u0010{n\u0016\u00b7U!P\u00b4\u00bd\u0001\u0000\u0016k^\u0094\u0015\u0010\u00be\u00e5)\u00ad\u00062vF\u00f97{\u0004V\u0087l\u00be\b\u009c\u00efV\u00b4b?\u001eF\b\u00a1\u00f4\u0087\u00d2\u00ff\u0097\u00e7\u00d2\u0010!\u0011z`\u0091\u00bb\u0092\u00c0\u00c43,'\u0097\u008c\u00ec\u0087\b\u00b1\u0096\u0082\u009f\u00af\u009c\u00b7\u00bc\u0010[<J\u009d\u00fc\u001dzk\u00a4\t$l\u00cb\u00acw\u0095\u0010oh\u00fe\u00bflB.\u00e5\u009e\u00b0lB\u00b1\u00b3o\u00b1\b\u00f0)GfaJ0\u0010\u0010@\u009a4V\u0094\u00b5\u0099\u0004\u00e64d\u009f\u00af-\u0087\u0011\u0010[<J\u009d\u00fc\u001dzk\u00ba\u00f4\u000e\u008b\u00e2\u00f2<}\u0010I\u009eD\u008d\u00e5\u00d7.\u00b8++|\u00ca\u009d\u0019\u00b5N\u0010\u00d6\u00ab '\u00f5=\u00cdhk\u00bej'\u00d5\u00e1\u001fz\u0010,@x'O\u00c5.;\u00a4\u00d0p\u00f8\u00e7\u00b1\u00c2E\u0010pb<m=\u009a\u00ed(\u0001i\u0000\u00e0\u001e\u00b2A\u00f1\u00103\u00d5h\u0017\u0004\u00ab:\u0002\u007fB@G:\u008ck/\u0010@\u009a4V\u0094\u00b5\u0099\u0004\u00a6\u0097\u0096\u00a5WT\u00e3\u0094\b?\u00d6\u0006\r \u00d1\u001ar\u0010\u008aW\t\u0091\u0001\u00b4\u00f7\u0094\u00d7\u00c9\u001c\u0095\u0086\u0085\u00c19\u0010Y\u00aa\u009b#\u00fc\\\u00f4\u00c9\u009e\u00b0Z\u0099O\u00e9F\u00b5\u0010\u00bbU\u00fc\u0015a\u00c7\u001fub\u00b7D\u00f5\u00c4\u0006\u0013\u001a\u0010Ia\u00a4\u001fr\u0017gR\u00fc\u0080A\u0013\u009fa\u00d7\u00f3".length();
                var4_7 = 16;
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
                    var0_3[var6_4++] = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.a(var8_9).intern();
                    if ((var3_8 += var4_7) < var7_6) {
                        var4_7 = var5_5.charAt(var3_8);
                        ** continue;
                    }
                    var5_5 = "pb<m=\u009a\u00ed(\u00e4-+\u0010\u00ad5\u00b7q\u0010\u00ac\u001c'\u00f3@\u00edB\u00ee\u0080mYhIFx\u00b8";
                    var7_6 = "pb<m=\u009a\u00ed(\u00e4-+\u0010\u00ad5\u00b7q\u0010\u00ac\u001c'\u00f3@\u00edB\u00ee\u0080mYhIFx\u00b8".length();
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
                    var0_3[var6_4++] = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.a(var8_9).intern();
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
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_R = new VersionedRegistry<T>(var0_3[2]);
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_q = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[21], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_j(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_w = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[17], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_UnderScore(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_UnderScore = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[12], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_w(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_D = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[1], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_U(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_K = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[4], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_f(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_Z = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[10], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_t(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_A = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[22], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_g(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_I = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[14], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_S(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_U = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[26], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_l(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_f = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[30], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_b(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_N = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[27], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_J(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_y = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[11], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_E(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_b = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[23], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_P(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_a = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[31], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_s(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_C = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[8], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_H(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_r = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[24], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_h(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_B = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[18], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_B(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_Y = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[25], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_a(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_o = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[5], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_k(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_u = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[19], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_u(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_c = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[15], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_Q(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[9], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_I(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_S = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[0], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_X(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_M = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[16], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_K(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_P = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[28], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_T(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_t = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[32], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_Y(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_T = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[29], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_x(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_k = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[13], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_M(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_d = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[3], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_o(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_V = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[6], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_z(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_Q = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[7], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_c(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_E = me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_W(var0_3[20], (CP_hB)LambdaMetafactory.metafactory(null, null, null, (F)F, CP_i(float ), (F)F)());
        me.nik.coffeeprotect.com.github.retrooper.packetevents.protocol.world.attributes.easing.CP_N.CP_R.unloadMappings();
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

